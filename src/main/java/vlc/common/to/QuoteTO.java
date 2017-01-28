package vlc.common.to;

import java.io.Serializable;

public class QuoteTO implements Serializable {

    private String quote;

    public QuoteTO() {
    }

    public QuoteTO(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "QuoteTO{" +
                "quote='" + quote + '\'' +
                '}';
    }
}
