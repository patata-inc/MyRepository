import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration//1 表示开启自动化配置
@Component//2 此注解用于包扫描
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
