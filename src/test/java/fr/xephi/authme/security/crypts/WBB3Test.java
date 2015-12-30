package fr.xephi.authme.security.crypts;

/**
 * Test for {@link WBB3}.
 */
public class WBB3Test extends AbstractEncryptionMethodTest {

    public WBB3Test() {
        super(new WBB3(),
            new EncryptedPassword("8df818ef7d56075ab2744f74b98ad68a375ccac4", "b7415b355492ea60314f259a35733a3092c03e3f"),  // password
            new EncryptedPassword("106da5cf5df92cb845e12cf62cbdb5235b6dc693", "6110f19b2b52910dccf592a19c59126873f42e69"),  // PassWord1
            new EncryptedPassword("940a9fb7acec0178c6691e8b3c14bd7d789078b1", "f9dd501ff3d1bf74904f9e89649e378429af56e7"),  // &^%te$t?Pw@_
            new EncryptedPassword("0fa12e8d96c9e95f73aa91f3b76f8cdc815ec8a5", "736be8669f6159ddb2d5b47a3e6428cdb8b324de")); // âË_3(íù*
    }

}
