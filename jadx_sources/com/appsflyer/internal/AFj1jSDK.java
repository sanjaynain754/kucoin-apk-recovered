package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.tencent.bugly.proguard.C33556b3;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p780y.C46357a;
import p852kotlin.Pair;

/* JADX INFO: loaded from: classes34.dex */
public final class AFj1jSDK {
    public static boolean AFAdRevenueData(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            AppSet.getClient(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getCurrencyIso4217Code(@Nullable Context context) {
        if (context != null) {
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean getMediationNetwork() {
        return Build.BRAND.equals("OPPO");
    }

    @SuppressLint({"NewApi"})
    public static boolean getMonetizationNetwork(@Nullable Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return ((C46357a) context.getApplicationContext().getSystemService(C46357a.class)) != null;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.m5974e(AFh1ySDK.PRIVACY_SANDBOX, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
            }
        }
        return false;
    }

    public static boolean getRevenue(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Pair<Long, String> AFAdRevenueData(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return new Pair<>(Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return new Pair<>(0L, "");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX INFO: renamed from: M_ */
    public static Map<String, String> m5997M_(PackageInfo packageInfo, Map<String, String> map, Uri uri) {
        byte b11;
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (map.containsKey(next)) {
                    str = next;
                } else {
                    int iHashCode = next.hashCode();
                    if (iHashCode != -1420799080) {
                        if (iHashCode != 99) {
                            if (iHashCode == 110987 && next.equals(C33556b3.f69038e2)) {
                                b11 = 1;
                            } else {
                                b11 = -1;
                            }
                        } else if (next.equals("c")) {
                            b11 = 0;
                        } else {
                            b11 = -1;
                        }
                    } else if (next.equals("af_prt")) {
                        b11 = 2;
                    } else {
                        b11 = -1;
                    }
                    if (b11 == 0) {
                        str = "campaign";
                    } else if (b11 != 1) {
                        if (b11 != 2) {
                            str = next;
                        } else {
                            str = "agency";
                        }
                    }
                }
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e11) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e11);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j11 = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j11)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: N_ */
    public static String m5998N_(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    @Nullable
    /* JADX INFO: renamed from: O_ */
    public static Application m5999O_(@NonNull Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }

    public static String getMediationNetwork(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            AFLogger.afErrorLog(e11.getMessage(), e11);
            return "";
        }
    }

    public static boolean getRevenue(Context context, String str) {
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb2 = new StringBuilder("is Permission Available: ");
        sb2.append(str);
        sb2.append("; res: ");
        sb2.append(iCheckPermission);
        AFLogger.afRDLog(sb2.toString());
        return iCheckPermission == 0;
    }

    /* JADX INFO: renamed from: L_ */
    public static boolean m5996L_(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentServices(intent, 0).size() <= 0) {
            return false;
        }
        return true;
    }

    public static long getCurrencyIso4217Code(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            AFLogger.afErrorLog(e11.getMessage(), e11);
            return 0L;
        }
    }
}
