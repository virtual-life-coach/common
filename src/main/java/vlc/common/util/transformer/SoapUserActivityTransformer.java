package vlc.common.util.transformer;

public class SoapUserActivityTransformer implements SoapEntityTransformer<vlc.common.to.UserActivityTO, vlc.ldb.soap.UserActivityTO> {
    
    @Override
    public vlc.ldb.soap.UserActivityTO toSoap(vlc.common.to.UserActivityTO userActivityTO) {
        vlc.ldb.soap.UserActivityTO userActivitySoap = new vlc.ldb.soap.UserActivityTO();
        userActivitySoap.setId(userActivityTO.getId());
        userActivitySoap.setActivityId(userActivityTO.getActivityId());
        userActivitySoap.setUserId(userActivityTO.getUserId());
        userActivitySoap.setDetails(userActivityTO.getDetails());
        userActivitySoap.setTargetValue(userActivityTO.getTargetValue());
        userActivitySoap.setCurrentValue(userActivityTO.getCurrentValue());
        userActivitySoap.setDeadlineDate(userActivityTO.getDeadlineDate());
        userActivitySoap.setCompleted(userActivityTO.getCompleted());
        return userActivitySoap;
    }

    @Override
    public vlc.common.to.UserActivityTO toTO(vlc.ldb.soap.UserActivityTO userActivitySoap) {
        return new vlc.common.to.UserActivityTO(userActivitySoap.getId(), userActivitySoap.getActivityId(),
                userActivitySoap.getUserId(), userActivitySoap.getDetails(), userActivitySoap.getTargetValue(),
                userActivitySoap.getCurrentValue(), userActivitySoap.getDeadlineDate(),
                userActivitySoap.isCompleted());
    }
}
