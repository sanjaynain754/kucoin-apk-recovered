package com.sumsub.sns.internal.features.data.network.prooface;

import android.util.Base64;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29886a {

    /* JADX INFO: renamed from: a */
    public final KeyPair f59987a;

    /* JADX INFO: renamed from: b */
    public SecretKey f59988b;

    /* JADX INFO: renamed from: a */
    public final void m69940a(String str) throws NoSuchAlgorithmException {
        PrivateKey privateKey = this.f59987a.getPrivate();
        byte[] bArrDecode = Base64.decode(str, 2);
        byte[] bArr = new byte[32];
        System.arraycopy(bArrDecode, 1, bArr, 0, 32);
        BigInteger bigInteger = new BigInteger(1, bArr);
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArrDecode, 33, bArr2, 0, 32);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        ECPoint eCPoint = new ECPoint(bigInteger, bigInteger2);
        BigInteger bigInteger3 = AbstractC29901p.f60016a;
        this.f59988b = m69939a(privateKey, keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, new ECParameterSpec(new EllipticCurve(new ECFieldFp(AbstractC29901p.f60016a), AbstractC29901p.f60018c, AbstractC29901p.f60019d), new ECPoint(AbstractC29901p.f60020e, AbstractC29901p.f60021f), AbstractC29901p.f60017b, 1))));
    }

    public C29886a() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        BigInteger bigInteger = AbstractC29901p.f60016a;
        keyPairGenerator.initialize(new ECParameterSpec(new EllipticCurve(new ECFieldFp(AbstractC29901p.f60016a), AbstractC29901p.f60018c, AbstractC29901p.f60019d), new ECPoint(AbstractC29901p.f60020e, AbstractC29901p.f60021f), AbstractC29901p.f60017b, 1));
        this.f59987a = keyPairGenerator.generateKeyPair();
    }

    /* JADX INFO: renamed from: a */
    public final SecretKey m69939a(PrivateKey privateKey, PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeyException {
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(privateKey);
        keyAgreement.doPhase(publicKey, true);
        SecretKey secretKeyGenerateSecret = keyAgreement.generateSecret("AES");
        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Crypto: secret=" + Base64.encodeToString(secretKeyGenerateSecret.getEncoded(), 2), null, 4, null);
        return secretKeyGenerateSecret;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m69941a(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (this.f59988b != null) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f59988b, new IvParameterSpec(bArr2));
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] encoded = this.f59987a.getPublic().getEncoded();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(encoded.length + 3 + bArr2.length + 4 + bArrDoFinal.length);
            byteBufferAllocate.put((byte) 2);
            byteBufferAllocate.putShort((short) encoded.length);
            byteBufferAllocate.put(encoded);
            byteBufferAllocate.put(bArr2);
            byteBufferAllocate.putInt(bArrDoFinal.length);
            byteBufferAllocate.put(bArrDoFinal);
            return byteBufferAllocate.array();
        }
        throw new InvalidParameterException("Session key is not set");
    }
}
