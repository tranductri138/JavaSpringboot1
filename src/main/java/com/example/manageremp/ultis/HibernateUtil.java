package com.example.manageremp.ultis;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.imageio.spi.ServiceRegistry;
import java.util.Properties;

public class HibernateUtil {
    private final static SessionFactory FACTORY;

    //block khởi động tĩnh chạy 1 lần duy nhất
    static {
        // cofig nos
        Configuration cfg = new Configuration();
        // tao properties va set no de use để cấu hình trực tiếp hibernate trong đây
        Properties pros = new Properties();
        pros.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        pros.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        pros.put(Environment.URL,"jdbc:mysql://locahost:3306/tris");
        pros.put(Environment.USER,"root");
        pros.put(Environment.PASS,"1234");

        cfg.setProperties(pros);

        ServiceRegistry registry = (ServiceRegistry) new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties()).build();

        FACTORY = cfg.buildSessionFactory((org.hibernate.service.ServiceRegistry) registry);
    }

    // lấy sesion factor ra
    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }
}
