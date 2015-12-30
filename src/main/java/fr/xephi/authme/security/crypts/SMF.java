package fr.xephi.authme.security.crypts;

import fr.xephi.authme.security.HashUtils;

public class SMF extends UsernameSaltMethod {

    public EncryptedPassword computeHash(String password, String name) {
        return new EncryptedPassword(HashUtils.sha1(name.toLowerCase() + password));
    }

}
