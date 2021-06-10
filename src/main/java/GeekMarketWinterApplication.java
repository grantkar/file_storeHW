

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import repositories.impl.FileMetaProvider;

@SpringBootApplication
public class GeekMarketWinterApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(GeekMarketWinterApplication.class, args);
	}

	private FileMetaProvider fileMetaProvider;

	public GeekMarketWinterApplication(FileMetaProvider fileMetaProvider) {
		this.fileMetaProvider = fileMetaProvider;
	}

	@Override
	public void run(String... args) throws Exception {
	}
}