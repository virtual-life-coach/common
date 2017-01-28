package vlc.common.util.transformer;

public class SoapMeasurementTransformer implements SoapEntityTransformer<vlc.common.to.MeasurementTO, vlc.ldb.soap.MeasurementTO> {
    
    @Override
    public vlc.ldb.soap.MeasurementTO toSoap(vlc.common.to.MeasurementTO measurementTO) {
        vlc.ldb.soap.MeasurementTO measurementSoap = new vlc.ldb.soap.MeasurementTO();
        measurementSoap.setId(measurementTO.getId());
        measurementSoap.setUserId(measurementTO.getUserId());
        measurementSoap.setType(measurementTO.getType());
        measurementSoap.setDate(measurementTO.getDate());
        measurementSoap.setValue(measurementTO.getValue());
        return measurementSoap;
    }

    @Override
    public vlc.common.to.MeasurementTO toTO(vlc.ldb.soap.MeasurementTO measurementSoap) {
        return new vlc.common.to.MeasurementTO(measurementSoap.getId(), measurementSoap.getUserId(),
                measurementSoap.getType(), measurementSoap.getDate(), measurementSoap.getValue());
    }
}
