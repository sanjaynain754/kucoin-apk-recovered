package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.timepicker.TimeModel;
import com.kubi.otc.entity.OtcAd;
import com.tencent.bugly.proguard.C33844oi;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l111l1111lIl {
    private static final int l1111l111111Il = -1;
    private static final int l111l11111lIl = -101;
    private Context l111l11111I1l;
    private Object l111l11111Il = null;

    public static String l1111l111111Il() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = OtcAd.KYC_NOT_PASS;
            }
            if (TextUtils.isEmpty(property)) {
                return "";
            }
            return property + C33844oi.f71346o + property2;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String l1111l111111Il(int i11) {
        if (i11 == l111l11111lIl) {
            return "wifi";
        }
        switch (i11) {
            case -1:
                return "nil";
            case 0:
                return "unknown";
            case 1:
                return "2g.gprs";
            case 2:
                return "2g.edge";
            case 3:
                return "3g.umts";
            case 4:
                return "2g.cdma";
            case 5:
                return "3g.evdo_0";
            case 6:
                return "3g.evdo_a";
            case 7:
                return "2g.1xrtt";
            case 8:
                return "3g.hsdpa";
            case 9:
                return "3g.hsupa";
            case 10:
                return "3g.hspa";
            case 11:
                return "2g.iden";
            case 12:
                return "3g.evdo_b";
            case 13:
                return "4g.lte";
            case 14:
                return "3g.ehrpd";
            case 15:
                return "3g.hspap";
            default:
                return String.format(Locale.US, TimeModel.NUMBER_FORMAT, Integer.valueOf(i11));
        }
    }

    public static Map<String, Long> l111l11111lIl() {
        HashMap map = new HashMap(5);
        map.put("mr", Long.valueOf(TrafficStats.getMobileRxBytes()));
        map.put("mt", Long.valueOf(TrafficStats.getMobileTxBytes()));
        map.put("tr", Long.valueOf(TrafficStats.getTotalRxBytes()));
        map.put(TtmlNode.TAG_TT, Long.valueOf(TrafficStats.getTotalTxBytes()));
        return map;
    }

    private void l111l1111lI1l() {
        Object objL1111l111111Il;
        try {
            Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            if (context == null || (objL1111l111111Il = com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(context, "getSystemService", new Class[]{String.class}, new Object[]{"wifi"})) == null || this.l111l11111Il != null) {
                return;
            }
            this.l111l11111Il = com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(objL1111l111111Il, "getConnectionInfo");
        } catch (Exception unused) {
        }
    }

    private String l111l1111lIl() {
        int networkType = 0;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.l111l11111I1l.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    networkType = l111l11111lIl;
                } else if (type == 0) {
                    networkType = ((TelephonyManager) this.l111l11111I1l.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkType();
                }
            } else {
                networkType = -1;
            }
        } catch (Exception unused) {
        }
        if (networkType == l111l11111lIl) {
            return "wifi";
        }
        switch (networkType) {
            case -1:
                return "nil";
            case 0:
                return "unknown";
            case 1:
                return "2g.gprs";
            case 2:
                return "2g.edge";
            case 3:
                return "3g.umts";
            case 4:
                return "2g.cdma";
            case 5:
                return "3g.evdo_0";
            case 6:
                return "3g.evdo_a";
            case 7:
                return "2g.1xrtt";
            case 8:
                return "3g.hsdpa";
            case 9:
                return "3g.hsupa";
            case 10:
                return "3g.hspa";
            case 11:
                return "2g.iden";
            case 12:
                return "3g.evdo_b";
            case 13:
                return "4g.lte";
            case 14:
                return "3g.ehrpd";
            case 15:
                return "3g.hspap";
            default:
                return String.format(Locale.US, TimeModel.NUMBER_FORMAT, Integer.valueOf(networkType));
        }
    }

    public final String l111l11111I1l() {
        String str;
        try {
            if (com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il("android.permission.ACCESS_WIFI_STATE")) {
                l111l1111lI1l();
                Object obj = this.l111l11111Il;
                return (obj == null || (str = (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getSSID")) == null) ? "" : str;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public final String l111l11111Il() {
        String str;
        try {
            if (com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il("android.permission.ACCESS_WIFI_STATE")) {
                l111l1111lI1l();
                Object obj = this.l111l11111Il;
                return (obj == null || (str = (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getBSSID")) == null) ? "" : str;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public final String l111l1111l1Il() {
        String ipAddress;
        try {
            l111l1111lI1l();
            Object obj = this.l111l11111Il;
            return (obj == null || (ipAddress = Formatter.formatIpAddress(((Integer) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "getIpAddress")).intValue())) == null) ? "" : ipAddress;
        } catch (Exception unused) {
        }
        return "";
    }

    public final String l111l1111llIl() {
        String strL111l1111lIl;
        try {
            return (this.l111l11111I1l == null || (strL111l1111lIl = l111l1111lIl()) == null) ? "" : strL111l1111lIl;
        } catch (Exception unused) {
        }
        return "";
    }

    public l111l1111lIl() {
        this.l111l11111I1l = null;
        try {
            this.l111l11111I1l = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        } catch (Exception unused) {
        }
    }
}
