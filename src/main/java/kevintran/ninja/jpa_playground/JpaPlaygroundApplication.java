package kevintran.ninja.jpa_playground;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPlaygroundApplication {

	public static void main(String[] args) {
		// Create the Flyway instance and point it to the database
		Flyway flyway = Flyway.configure().dataSource("jdbc:h2:file:./target/foobar", "sa", null).load();

		// Start the migration
		flyway.migrate();

		SpringApplication.run(JpaPlaygroundApplication.class, args);
	}

}
