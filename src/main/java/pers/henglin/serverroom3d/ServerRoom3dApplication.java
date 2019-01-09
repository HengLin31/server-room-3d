package pers.henglin.serverroom3d;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.henglin.serverroom3d.mapper")
public class ServerRoom3dApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerRoom3dApplication.class, args);
	}
}
