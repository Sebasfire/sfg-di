package nl.sebastiaan.sfgdi;

import nl.sebastiaan.sfgdi.config.SfgConfiguration;
import nl.sebastiaan.sfgdi.config.SfgConstructorConfig;
import nl.sebastiaan.sfgdi.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import nl.sebastiaan.sfgdi.controllers.ConstructorInjectedController;
import nl.sebastiaan.sfgdi.controllers.I18nController;
import nl.sebastiaan.sfgdi.controllers.MyController;
import nl.sebastiaan.sfgdi.controllers.PropertyInjectedController;
import nl.sebastiaan.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		System.out.println("0) Primary:");
		System.out.println(myController.sayHello());
		
		System.out.println("1) Property: ");
		PropertyInjectedController propCon = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propCon.getGreeting());		
		
		System.out.println("2) Setter: ");
		
		SetterInjectedController setCon = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setCon.getGreeting());
		
		System.out.println("3) Constructor: ");
		ConstructorInjectedController conCon = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(conCon.getGreeting());

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());

		SfgConstructorConfig sfgConfiguration = ctx.getBean(SfgConstructorConfig.class);
		System.out.println("Groetjes van " + sfgConfiguration.getVoornaam() + " " + sfgConfiguration.getTussenvoegsel() + " " + sfgConfiguration.getAchternaam());
	}

}
