package fr.epsi.b32324c2.dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {

    private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

    public  void execute(String param) {
        LOG.debug("Traitement 1 : param = {}", param);
    }
}
