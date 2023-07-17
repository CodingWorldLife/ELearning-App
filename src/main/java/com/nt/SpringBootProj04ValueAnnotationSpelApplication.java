package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Country;
import com.nt.sbeans.StateInfo;


@SpringBootApplication
public class SpringBootProj04ValueAnnotationSpelApplication {

	public static void main(String[] args) {
	ApplicationContext ctx= SpringApplication.run(SpringBootProj04ValueAnnotationSpelApplication.class, args);
	StateInfo stateinfo1=ctx.getBean("stateinfo",StateInfo.class);
	Country stateinfo=ctx.getBean("country",Country.class);
		System.out.println(stateinfo);
		System.out.println(stateinfo1);
		((ConfigurableApplicationContext) ctx).close();
	}

}
