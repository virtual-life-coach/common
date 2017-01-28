package vlc.common.util.transformer;

public interface SoapEntityTransformer<T, V> {

    V toSoap(T entityTO);
    T toTO(V entity);
}
