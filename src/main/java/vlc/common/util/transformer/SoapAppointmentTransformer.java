package vlc.common.util.transformer;

public class SoapAppointmentTransformer implements SoapEntityTransformer<vlc.common.to.AppointmentTO, vlc.ldb.soap.AppointmentTO> {

    @Override
    public vlc.ldb.soap.AppointmentTO toSoap(vlc.common.to.AppointmentTO appointmentTO) {
        vlc.ldb.soap.AppointmentTO appointmentSoap = new vlc.ldb.soap.AppointmentTO();
        appointmentSoap.setId(appointmentTO.getId());
        appointmentSoap.setUserId(appointmentTO.getUserId());
        appointmentSoap.setDoctorId(appointmentTO.getDoctorId());
        appointmentSoap.setDate(appointmentTO.getDate());
        appointmentSoap.setLocation(appointmentTO.getLocation());
        return appointmentSoap;
    }

    @Override
    public vlc.common.to.AppointmentTO toTO(vlc.ldb.soap.AppointmentTO entity) {
        return new vlc.common.to.AppointmentTO(entity.getId(), entity.getUserId(), entity.getDoctorId(),
                entity.getDate(), entity.getLocation());
    }
}
