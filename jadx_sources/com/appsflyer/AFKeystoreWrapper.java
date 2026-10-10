package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes34.dex */
public class AFKeystoreWrapper {
    private Context getCurrencyIso4217Code;
    public KeyStore getRevenue;
    public final Object getMonetizationNetwork = new Object();
    public String getMediationNetwork = "";
    public int AFAdRevenueData = 0;

    private static boolean getRevenue(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final boolean getCurrencyIso4217Code() {
        boolean z11;
        synchronized (this.getMonetizationNetwork) {
            try {
                KeyStore keyStore = this.getRevenue;
                z11 = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> enumerationAliases = keyStore.aliases();
                        while (enumerationAliases.hasMoreElements()) {
                            String strNextElement = enumerationAliases.nextElement();
                            if (strNextElement != null && getRevenue(strNextElement)) {
                                String[] strArrSplit = strNextElement.split(",");
                                if (strArrSplit.length != 3) {
                                    break;
                                }
                                AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(strNextElement));
                                z11 = true;
                                String[] strArrSplit2 = strArrSplit[1].trim().split("=");
                                String[] strArrSplit3 = strArrSplit[2].trim().split("=");
                                if (strArrSplit2.length != 2 || strArrSplit3.length != 2) {
                                    break;
                                    break;
                                }
                                this.getMediationNetwork = strArrSplit2[1].trim();
                                this.AFAdRevenueData = Integer.parseInt(strArrSplit3[1].trim());
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb2 = new StringBuilder("Couldn't list KeyStore Aliases: ");
                        sb2.append(th2.getClass().getName());
                        AFLogger.afErrorLog(sb2.toString(), th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z11;
    }

    public final int getMediationNetwork() {
        int i11;
        synchronized (this.getMonetizationNetwork) {
            i11 = this.AFAdRevenueData;
        }
        return i11;
    }

    public final String getMonetizationNetwork() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appsflyer,");
        synchronized (this.getMonetizationNetwork) {
            sb2.append("KSAppsFlyerId=");
            sb2.append(this.getMediationNetwork);
            sb2.append(",");
            sb2.append("KSAppsFlyerRICounter=");
            sb2.append(this.AFAdRevenueData);
        }
        return sb2.toString();
    }

    public final String getRevenue() {
        String str;
        synchronized (this.getMonetizationNetwork) {
            str = this.getMediationNetwork;
        }
        return str;
    }

    public AFKeystoreWrapper(Context context) {
        this.getCurrencyIso4217Code = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.getRevenue = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e11) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e11);
        }
    }

    public final void getCurrencyIso4217Code(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.getMonetizationNetwork) {
                try {
                    if (!this.getRevenue.containsAlias(str)) {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(keyGenParameterSpecBuild);
                        keyPairGenerator.generateKeyPair();
                    } else {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th3.getMessage());
            sb2.append(" occurred");
            AFLogger.afErrorLog(sb2.toString(), th3);
        }
    }
}
