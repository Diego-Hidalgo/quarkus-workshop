package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.jboss.logging.Logger;


@ApplicationScoped
public class VillainApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(VillainApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("The application VILLAIN is starting with profile " + ProfileManager.getActiveProfile());
        LOGGER.info("##     ## #### ##       ##          ###    #### ##    ##      ###    ########  #### \n");
        LOGGER.info("##     ##  ##  ##       ##         ## ##    ##  ###   ##     ## ##   ##     ##  ##  \n");
        LOGGER.info("##     ##  ##  ##       ##        ##   ##   ##  ####  ##    ##   ##  ##     ##  ##  \n");
        LOGGER.info("##     ##  ##  ##       ##       ##     ##  ##  ## ## ##   ##     ## ########   ##  \n");
        LOGGER.info(" ##   ##   ##  ##       ##       #########  ##  ##  ####   ######### ##         ##  \n");
        LOGGER.info("  ## ##    ##  ##       ##       ##     ##  ##  ##   ###   ##     ## ##         ##  \n");
        LOGGER.info("   ###    #### ######## ######## ##     ## #### ##    ##   ##     ## ##        #### ");
        LOGGER.info("DIEGO");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}
