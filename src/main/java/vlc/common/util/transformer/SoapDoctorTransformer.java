package vlc.common.util.transformer;

public class SoapDoctorTransformer implements SoapEntityTransformer<vlc.common.to.DoctorTO, vlc.ldb.soap.DoctorTO> {

    @Override
    public vlc.ldb.soap.DoctorTO toSoap(vlc.common.to.DoctorTO doctorTO) {
        vlc.ldb.soap.DoctorTO doctorSoap = new vlc.ldb.soap.DoctorTO();
        doctorSoap.setId(doctorTO.getId());
        doctorSoap.setName(doctorTO.getName());
        doctorSoap.setSurname(doctorTO.getSurname());
        doctorSoap.setBirthday(doctorTO.getBirthday());
        doctorSoap.setTelegramId(doctorTO.getTelegramId());
        return doctorSoap;
    }

    @Override
    public vlc.common.to.DoctorTO toTO(vlc.ldb.soap.DoctorTO doctorSoap) {
        return new vlc.common.to.DoctorTO(doctorSoap.getId(), doctorSoap.getName(), doctorSoap.getSurname(),
                doctorSoap.getBirthday(), doctorSoap.getTelegramId());
    }
}
