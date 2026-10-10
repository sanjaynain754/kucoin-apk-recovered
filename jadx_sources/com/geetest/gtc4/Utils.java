package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
public class Utils {
    public static String getCert() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias("no506b3822wb")) {
                keyStore.deleteEntry("no506b3822wb");
            }
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("no506b3822wb", 12);
            byte[] bArr = new byte[8];
            new Random().nextBytes(bArr);
            builder.setAttestationChallenge(bArr);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            keyPairGenerator.initialize(builder.build());
            keyPairGenerator.generateKeyPair();
            return Base64.encodeToString(((X509Certificate) keyStore.getCertificateChain("no506b3822wb")[0]).getExtensionValue("1.3.6.1.4.1.11129.2.1.17"), 2);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m12593c(Context context) {
        return new C6906w0(context.getPackageManager()).m12735a();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    /* JADX INFO: renamed from: d */
    public static String m12594d(Context context) {
        String str;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            str = "";
        } else {
            try {
                AtomicReference atomicReference = new AtomicReference();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C6724b7 c6724b7 = new C6724b7(atomicReference, countDownLatch);
                Intent intent = new Intent();
                intent.setAction("com.tencent.soter.soterserver.ISoterService");
                intent.setPackage("com.tencent.soter.soterserver");
                AbstractC6733c7.m12621a(context, intent, c6724b7);
                if (!countDownLatch.await(1L, TimeUnit.SECONDS)) {
                    str = "";
                } else {
                    str = (String) atomicReference.get();
                }
            } catch (Throwable unused) {
            }
        }
        if (str == null || str.isEmpty()) {
            return "";
        }
        int iIndexOf = str.indexOf(10);
        if (iIndexOf == -1) {
            return str;
        }
        return str.substring(0, iIndexOf);
    }

    private static String getSignature(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                StringBuilder sb2 = new StringBuilder();
                for (byte b11 : bArrDigest) {
                    sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                }
                return sb2.toString();
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
