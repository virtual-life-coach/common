package vlc.common.util.transformer;

public class SoapUserTransformer implements SoapEntityTransformer<vlc.common.to.UserTO, vlc.ldb.soap.UserTO> {
    
    @Override
    public vlc.ldb.soap.UserTO toSoap(vlc.common.to.UserTO userTO) {
        vlc.ldb.soap.UserTO userSoap = new vlc.ldb.soap.UserTO();
        userSoap.setId(userTO.getId());
        userSoap.setName(userTO.getName());
        userSoap.setSurname(userTO.getSurname());
        userSoap.setBirthday(userTO.getBirthday());
        userSoap.setTelegramId(userTO.getTelegramId());
        return userSoap;
    }

    @Override
    public vlc.common.to.UserTO toTO(vlc.ldb.soap.UserTO userSoap) {
        return new vlc.common.to.UserTO(userSoap.getId(), userSoap.getName(), userSoap.getSurname(),
                userSoap.getBirthday(), userSoap.getTelegramId());
    }
}
