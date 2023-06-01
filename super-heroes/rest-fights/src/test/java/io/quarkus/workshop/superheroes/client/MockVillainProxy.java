package io.quarkus.workshop.superheroes.client;

import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Mock
@ApplicationScoped
@RestClient
public class MockVillainProxy implements VillainProxy {

    @Override
    public Villain findRandomVillain() {
        return DefaultTestVillain.INSTANCE;
    }
}
