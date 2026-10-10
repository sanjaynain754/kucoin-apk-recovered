package com.geetest.gtc4;

import android.content.pm.PackageManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.tencent.bugly.proguard.C33627eb;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import p686v7.C45459i;

/* JADX INFO: renamed from: com.geetest.gtc4.w0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6906w0 {

    /* JADX INFO: renamed from: a */
    public final boolean f11540a;

    /* JADX INFO: renamed from: a */
    public final String m12735a() {
        boolean z11 = this.f11540a;
        try {
            C6932z0 c6932z0M12733a = m12733a("com.geetest.gtc4.attestation." + z11, z11);
            C6867r6 c6867r6Mo12671b = c6932z0M12733a.f11563a.mo12671b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c6867r6Mo12671b.f11481b ? "1" : "0");
            sb2.append("|");
            sb2.append(c6867r6Mo12671b.f11482c);
            sb2.append("|");
            sb2.append(c6932z0M12733a.f11564b);
            sb2.append("|");
            sb2.append(c6932z0M12733a.f11565c);
            return sb2.toString();
        } catch (C6915x0 e11) {
            return String.valueOf(e11.getCode());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12734b(String str, boolean z11) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i11 = Build.VERSION.SDK_INT;
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        Date date = new Date();
        Date date2 = new Date(date.getTime() + 1000000);
        Date date3 = new Date(date.getTime() + SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 4);
        builder.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeyValidityStart(date).setKeyValidityForOriginationEnd(date2).setKeyValidityForConsumptionEnd(date3).setAttestationChallenge(date.toString().getBytes(StandardCharsets.UTF_8));
        if (i11 >= 28 && z11) {
            builder.setIsStrongBoxBacked(true);
        }
        builder.setDigests("NONE", "SHA-256");
        keyPairGenerator.initialize(builder.build());
        keyPairGenerator.generateKeyPair();
    }

    public C6906w0(PackageManager packageManager) {
        boolean z11;
        if (Build.VERSION.SDK_INT >= 28 && packageManager.hasSystemFeature("android.hardware.strongbox_keystore")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11540a = z11;
    }

    /* JADX INFO: renamed from: a */
    public static C6932z0 m12733a(String str, boolean z11) {
        int iM12731a;
        String strReplace;
        try {
            m12734b(str, z11);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            AbstractC6879t0 abstractC6879t0M12711a = null;
            keyStore.load(null);
            Certificate[] certificateChain = keyStore.getCertificateChain(str);
            if (certificateChain != null) {
                ArrayList<Certificate> arrayList = new ArrayList(certificateChain.length);
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                for (Certificate certificate : certificateChain) {
                    arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(certificate.getEncoded())));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Certificate certificate2 : arrayList) {
                    if (certificate2 instanceof X509Certificate) {
                        arrayList2.add((X509Certificate) certificate2);
                    }
                }
                try {
                    iM12731a = AbstractC6904v7.m12731a(arrayList2);
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((X509Certificate) it.next()).getSerialNumber().toString(16).toLowerCase());
                        }
                        strReplace = arrayList3.toString().replace(C33627eb.f69716f, "").replace("[", "").replace("]", "");
                    } catch (GeneralSecurityException unused) {
                        strReplace = null;
                    }
                } catch (GeneralSecurityException unused2) {
                    iM12731a = -1;
                }
                int size = arrayList2.size() - 1;
                C6915x0 c6915x0 = null;
                while (size >= 0) {
                    try {
                        abstractC6879t0M12711a = AbstractC6879t0.m12711a((X509Certificate) arrayList2.get(size));
                        break;
                    } catch (CertificateParsingException e11) {
                        size--;
                        c6915x0 = new C6915x0(-4, e11);
                    }
                }
                if (abstractC6879t0M12711a == null && c6915x0 != null) {
                    throw c6915x0;
                }
                return new C6932z0(abstractC6879t0M12711a, iM12731a, strReplace);
            }
            throw new CertificateException("Unable to get certificate chain");
        } catch (ProviderException e12) {
            if (Build.VERSION.SDK_INT >= 28 && C45459i.m100407a(e12)) {
                throw new C6915x0(-5, e12);
            }
            if (e12.getCause() != null && e12.getCause().getMessage() != null && e12.getCause().getMessage().contains("device ids")) {
                throw new C6915x0(-6, e12);
            }
            throw new C6915x0(-2, e12);
        } catch (Exception e13) {
            throw new C6915x0(-2, e13);
        }
    }
}
