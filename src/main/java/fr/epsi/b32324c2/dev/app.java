package fr.epsi.b32324c2.dev;

import fr.epsi.b32324c2.dev.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class app {

    private static final Logger LOG = LoggerFactory.getLogger(app.class);

    public static void main(String[] args) {

        LOG.info("Bonjour Slf4J !");
        LOG.info("Implémentation Logback");

        new AppService().execute("le param");
    }
}
