package vlc.common.util.transformer;

public class SoapActivityTransformer implements SoapEntityTransformer<vlc.common.to.ActivityTO, vlc.ldb.soap.ActivityTO> {

    @Override
    public vlc.ldb.soap.ActivityTO toSoap(vlc.common.to.ActivityTO activityTO) {
        vlc.ldb.soap.ActivityTO activitySoap = new vlc.ldb.soap.ActivityTO();
        activitySoap.setId(activityTO.getId());
        activitySoap.setDescription(activityTO.getDescription());
        return activitySoap;
    }

    @Override
    public vlc.common.to.ActivityTO toTO(vlc.ldb.soap.ActivityTO entitySoap) {
        return new vlc.common.to.ActivityTO(entitySoap.getId(), entitySoap.getDescription());
    }
}
