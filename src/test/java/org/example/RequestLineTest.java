import org.example.RequestLine;
import org.junit.jupiter.api.Test;

public class RequestLineTest {
    @Test
    void create() {
        RequestLine requestLine = new RequestLine("GET /calculate?operand1=11&operator=*&operand2=%3D55 HTTP/1.1");

        assertThat(requestLine).isNotNull();
    }
}
