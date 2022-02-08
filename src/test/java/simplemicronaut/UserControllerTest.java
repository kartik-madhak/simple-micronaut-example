package simplemicronaut;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

@MicronautTest
public class UserControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void test() {
        //noinspection rawtypes
        List<Map> users = client.toBlocking().retrieve(HttpRequest.GET("/user"), Argument.listOf(Map.class));
        Assertions.assertThat(users).isNotNull();
    }
}

