package vlc.common.to;

import java.io.Serializable;

public class ReceiptTO implements Serializable{

    private Long id;
    private String text;

    public ReceiptTO() {
    }

    public ReceiptTO(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ReceiptTO{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
