package dio.digital;

import java.time.LocalDateTime;

public class Mentoria extends ConteudoEducacional {

    private LocalDateTime data;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
