package setting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class ResponseAPI<T> {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
    private T body;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseAPI() {
    }

    public ResponseAPI(Integer code, String message, T body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public ResponseAPI(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode(){ return code; }

    public T getBody() {
        return this.body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
