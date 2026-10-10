package p795yf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.tencent.bugly.proguard.C33872q4;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: yf.h */
/* JADX INFO: compiled from: NetworkUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C46482h {

    /* JADX INFO: renamed from: a */
    public static String f104241a;

    /* JADX INFO: renamed from: b */
    public static final Set<String> f104242b = new HashSet();

    @SuppressLint({"NewApi", "WrongConstant"})
    /* JADX INFO: renamed from: d */
    public static boolean m102546d(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(7) || networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(16);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m102543a(Context context, String str) {
        Class<?> cls;
        try {
            if (f104242b.contains(str)) {
                return true;
            }
            try {
                cls = Class.forName("android.support.v4.content.ContextCompat");
            } catch (Exception unused) {
                cls = null;
            }
            if (cls == null) {
                try {
                    int i11 = ContextCompat.RECEIVER_VISIBLE_TO_INSTANT_APPS;
                    cls = ContextCompat.class;
                } catch (Exception unused2) {
                }
            }
            if (cls == null) {
                f104242b.add(str);
                return true;
            }
            if (((Integer) cls.getMethod("checkSelfPermission", Context.class, String.class).invoke(null, context, str)).intValue() == 0) {
                f104242b.add(str);
                return true;
            }
            C46481g.m102538a("SA.NetworkUtils", "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"" + str + "\" />");
            return false;
        } catch (Exception e11) {
            C46481g.m102538a("SA.NetworkUtils", e11.toString());
            return true;
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static boolean m102544b(Context context) {
        if (!m102543a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return false;
        }
        try {
            return m102545c((ConnectivityManager) context.getSystemService("connectivity"));
        } catch (Exception e11) {
            C46481g.m102541d(e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m102545c(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return m102546d(networkCapabilities);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public static String m102548f(Context context, TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
        int subtype;
        NetworkInfo activeNetworkInfo;
        if (telephonyManager == null) {
            subtype = 0;
        } else if (Build.VERSION.SDK_INT < 30 || !(m102543a(context, C33872q4.f71536c) || telephonyManager.hasCarrierPrivileges())) {
            try {
                subtype = telephonyManager.getNetworkType();
            } catch (Exception e11) {
                C46481g.m102541d(e11);
                subtype = 0;
            }
        } else {
            subtype = telephonyManager.getDataNetworkType();
        }
        if (subtype == 0) {
            if (Build.VERSION.SDK_INT >= 30) {
                return "NULL";
            }
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                subtype = activeNetworkInfo.getSubtype();
            }
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 16:
            case 17:
            default:
                return "NULL";
            case 20:
                return "5G";
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m102549g(Context context) {
        try {
            if (!TextUtils.isEmpty(f104241a)) {
                return f104241a;
            }
            if (!m102543a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                f104241a = "NULL";
                return "NULL";
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                if (!m102545c(connectivityManager)) {
                    f104241a = "NULL";
                    return "NULL";
                }
                if (m102547e(connectivityManager)) {
                    f104241a = "WIFI";
                    return "WIFI";
                }
            }
            String strM102548f = m102548f(context, (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE), connectivityManager);
            f104241a = strM102548f;
            return strM102548f;
        } catch (Exception e11) {
            C46481g.m102541d(e11);
            f104241a = "NULL";
            return "NULL";
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m102547e(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            return networkCapabilities.hasTransport(1);
        }
        return false;
    }
}
