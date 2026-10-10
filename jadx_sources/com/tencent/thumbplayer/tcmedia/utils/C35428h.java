package com.tencent.thumbplayer.tcmedia.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.autofill.HintConstants;
import com.tencent.bugly.proguard.C33872q4;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.h */
/* JADX INFO: loaded from: classes64.dex */
public class C35428h {

    /* JADX INFO: renamed from: a */
    private static int f76586a = -1;

    /* JADX INFO: renamed from: b */
    private static boolean f76587b = false;

    /* JADX INFO: renamed from: c */
    private static int f76588c = -1;

    /* JADX INFO: renamed from: d */
    private static final SparseIntArray f76589d;

    /* JADX INFO: renamed from: a */
    public static int m78870a(Context context) {
        int i11 = f76586a;
        if (i11 > 0 && !f76587b) {
            return i11;
        }
        if (context == null) {
            return -1;
        }
        int iM78880g = m78880g(context);
        f76586a = iM78880g;
        return iM78880g;
    }

    /* JADX INFO: renamed from: b */
    private static int m78874b(Context context, int i11) {
        if (m78877d(context) != 20) {
            return f76589d.get(i11);
        }
        TPLogUtil.m78800i("TPNetWorkUtils", "get5GNetworkTypeIfNeed netWorkType==4");
        return 4;
    }

    /* JADX INFO: renamed from: g */
    private static int m78880g(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    return m78871a(context, activeNetworkInfo.getSubtype());
                }
                if (type == 1) {
                    return 0;
                }
            }
            return -1;
        } catch (Throwable th2) {
            TPLogUtil.m78797e("TPNetWorkUtils", th2.getMessage());
            return -1;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f76589d = sparseIntArray;
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(11, 1);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(5, 2);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(8, 2);
        sparseIntArray.put(9, 2);
        sparseIntArray.put(10, 2);
        sparseIntArray.put(12, 2);
        sparseIntArray.put(14, 2);
        sparseIntArray.put(15, 2);
        sparseIntArray.put(13, 3);
    }

    /* JADX INFO: renamed from: a */
    private static int m78871a(Context context, int i11) {
        return Build.VERSION.SDK_INT >= 29 ? m78881h(context) : m78874b(context, i11);
    }

    /* JADX INFO: renamed from: b */
    public static void m78875b(Context context) {
        f76587b = true;
        m78876c(context);
        m78870a(context);
        f76587b = false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m78876c(Context context) {
        int i11 = f76588c;
        if (i11 != -1 && !f76587b) {
            return i11 == 1;
        }
        if (context != null) {
            try {
                NetworkInfo networkInfoM78879f = m78879f(context);
                f76588c = 0;
                if (networkInfoM78879f != null && networkInfoM78879f.getState() == NetworkInfo.State.CONNECTED) {
                    f76588c = 1;
                }
            } catch (Exception e11) {
                TPLogUtil.m78797e("TPNetWorkUtils", e11.getMessage());
            }
        }
        return f76588c == 1;
    }

    /* JADX INFO: renamed from: d */
    private static int m78877d(Context context) {
        int i11 = 0;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                TPLogUtil.m78797e("TPNetWorkUtils", "get5GNetworkTypeIfNeed TelephonyManager is null");
                return 0;
            }
            if (context.checkSelfPermission(C33872q4.f71536c) != 0) {
                TPLogUtil.m78797e("TPNetWorkUtils", "get5GNetworkTypeIfNeed no permission");
                return 0;
            }
            if (Build.VERSION.SDK_INT < 29) {
                TPLogUtil.m78797e("TPNetWorkUtils", "get5GNetworkTypeIfNeed less api 29");
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            try {
                if (networkType != 13) {
                    TPLogUtil.m78800i("TPNetWorkUtils", "get5GNetworkTypeIfNeed not NETWORK_TYPE_LTE");
                    return networkType;
                }
                ServiceState serviceState = telephonyManager.getServiceState();
                if (serviceState == null) {
                    TPLogUtil.m78797e("TPNetWorkUtils", "get5GNetworkTypeIfNeed serviceState is null");
                    return networkType;
                }
                int iIntValue = ((Integer) C35431k.m78898a(serviceState, "android.telephony.ServiceState", "getNrState", new Class[0], new Object[0])).intValue();
                if (iIntValue != 2 && iIntValue != 3) {
                    return networkType;
                }
                TPLogUtil.m78800i("TPNetWorkUtils", "get5GNetworkTypeIfNeed networkType is 20, 5G");
                return 20;
            } catch (Throwable th2) {
                i11 = networkType;
                th = th2;
                TPLogUtil.m78797e("TPNetWorkUtils", th.getMessage());
                return i11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: e */
    private static ConnectivityManager m78878e(Context context) {
        if (context == null) {
            return null;
        }
        return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    /* JADX INFO: renamed from: h */
    private static int m78881h(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (m78873a(context, C33872q4.f71536c)) {
                return m78874b(context, telephonyManager.getDataNetworkType());
            }
            TPLogUtil.m78797e("TPNetWorkUtils", "getNetWorkClassAPI29 fail: no phone permission");
            return -1;
        } catch (Throwable th2) {
            TPLogUtil.m78797e("TPNetWorkUtils", th2.getMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m78872a() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    private static NetworkInfo m78879f(Context context) {
        ConnectivityManager connectivityManagerM78878e = m78878e(context);
        if (connectivityManagerM78878e == null) {
            return null;
        }
        return connectivityManagerM78878e.getActiveNetworkInfo();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m78873a(Context context, String str) {
        if (!m78872a()) {
            return true;
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            if ("android.permission.WRITE_SETTINGS".equals(str)) {
                return Settings.System.canWrite(context);
            }
            try {
                if (context.checkSelfPermission(str) == 0) {
                    return true;
                }
            } catch (Exception e11) {
                TPLogUtil.m78797e("TPNetWorkUtils", e11.getMessage());
            }
        }
        return false;
    }
}
