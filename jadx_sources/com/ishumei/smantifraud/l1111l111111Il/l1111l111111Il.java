package com.ishumei.smantifraud.l1111l111111Il;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.ishumei.smantifraud.SmAntiFraud;
import com.ishumei.smantifraud.dfp.SMSDK;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l1111l111111Il {
    private static int l1111l111111Il = 1;
    private static final String l111l11111I1l = "Smlog";
    private static final String l111l11111Il = "network";
    private static int l111l11111lIl = 2;
    private static final String l111l1111l1Il = "ssid";
    private static final String l111l1111lI1l = "wifiip";
    private static final String l111l1111lIl = "adid";
    private static final String l111l1111llIl = "bssid";
    private static long l111l11IlIlIl = 0;
    private static final String l11l1111I11l = "ainfo";
    private static final String l11l1111I1l = "props_sn";
    private static final String l11l1111I1ll = "simCountryISO";
    private static final String l11l1111Il = "networkCountryIso";
    private static final String l11l1111Il1l = "sensorsData";
    private static final String l11l1111Ill = "oaid";
    private static final String l11l1111lIIl = "sensor";
    private static final String l11l111l11Il = "locationCls";
    private static StringBuilder l11l111l1I1l = null;
    private static l1111l111111Il l11l111l1lll = null;
    private static final String l11l11IlIIll = "launcherInfo";
    private String l11l111l1Il;
    private boolean l11l111ll11l;
    private long l11l111ll1Il;

    public static l1111l111111Il l1111l111111Il() {
        if (l11l111l1lll == null) {
            synchronized (l1111l111111Il.class) {
                try {
                    if (l11l111l1lll == null) {
                        l11l111l1lll = new l1111l111111Il();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return l11l111l1lll;
    }

    private static String l111l11111lIl(int i11) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - l111l11IlIlIl;
        if (jCurrentTimeMillis > 20) {
            str = i11 + C33844oi.f71346o + jCurrentTimeMillis + ";";
        } else {
            str = "";
        }
        l111l11IlIlIl = System.currentTimeMillis();
        return str;
    }

    public final synchronized String l111l11111I1l() {
        return this.l11l111l1Il;
    }

    private static void l111l11111Il() {
        if (l111l11111I1l.class.getDeclaredFields().length < 94) {
            Log.e(l111l11111I1l, "missing core fields, check proguard file");
        }
    }

    public final synchronized String l1111l111111Il(int i11) {
        String string;
        JSONObject jSONObjectL1111l111111Il;
        Map<String, Object> mapL11l11IlIIll;
        if (com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l1111l1Il) {
            return null;
        }
        if (this.l11l111l1Il != null && System.currentTimeMillis() - this.l11l111ll1Il < 1000) {
            try {
                return new String(com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l111l11111Il(this.l11l111l1Il));
            } catch (Exception unused) {
            }
        }
        l111l11IlIlIl = System.currentTimeMillis();
        l11l111l1I1l = new StringBuilder();
        l111l11111I1l l111l11111i1l = new l111l11111I1l();
        long jCurrentTimeMillis = System.currentTimeMillis();
        l111l11111i1l.l11l1111I1l(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111lIl);
        l111l11111Il l111l11111ilL111l11111lIl = l111l1111l1Il.l1111l111111Il().l111l11111lIl();
        SmAntiFraud.SmOption smOption = SmAntiFraud.option;
        Set<String> setL11l1111Il1l = smOption.l11l1111Il1l();
        if (setL11l1111Il1l == null) {
            setL11l1111Il1l = Collections.EMPTY_SET;
        }
        l11l111l1I1l.append(l111l11111lIl(1));
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il);
            l11l111l1I1l.append(l111l11111lIl(2));
            if (l111l11111I1l.class.getDeclaredFields().length < 94) {
                Log.e(l111l11111I1l, "missing core fields, check proguard file");
            }
            l11l111l1I1l.append(l111l11111lIl(3));
            l111l11111i1l.l1111l111111Il(setL11l1111Il1l);
            l11l111l1I1l.append(l111l11111lIl(4));
            l111l11111i1l.l11l1111lIIl(smOption.l1111l111111Il());
            l11l111l1I1l.append(l111l11111lIl(5));
            List<String> listL11l1111Il1l = com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111Il1l();
            if (!listL11l1111Il1l.isEmpty()) {
                l111l11111i1l.l111l11111I1l(listL11l1111Il1l);
            }
            l11l111l1I1l.append(l111l11111lIl(6));
            Set<String> setL111l11111lIl = l111l11111ilL111l11111lIl == null ? null : l111l11111ilL111l11111lIl.l111l11111lIl();
            l111l11111i1l.l11l1111I1ll(TtmlNode.COMBINE_ALL);
            l111l11111i1l.l111l11111Il(smOption.l11l1111I11l());
            l11l111l1I1l.append(l111l11111lIl(7));
            com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il l111l11111ilL1111l111111Il = com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il();
            l111l11111i1l.l111l1111l1Il(l111l11111ilL1111l111111Il.l111l11111Il());
            l111l11111i1l.l111l1111llIl("");
            l111l11111i1l.l11l11l11lIl(l111l11111ilL1111l111111Il.l111l1111llIl());
            l111l11111i1l.l11l11l11I1l("");
            l11l111l1I1l.append(l111l11111lIl(8));
            l111l11111i1l.l11IIIlIll(l111l11111ilL1111l111111Il.l111l1111lIl());
            l111l11111i1l.l11l11l111Il("");
            l11l111l1I1l.append(l111l11111lIl(9));
            l111l11111i1l.l11l1111Il(l111l11111ilL1111l111111Il.l111l11111I1l());
            l11l111l1I1l.append(l111l11111lIl(10));
            l111l11111i1l.l1111l111111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111I1l());
            l11l111l1I1l.append(l111l11111lIl(11));
            l111l11111i1l.l11l1111Il1l(com.ishumei.smantifraud.l111l11111lIl.l111l11111I1l.l1111l111111Il().l111l11111lIl());
            l11l111l1I1l.append(l111l11111lIl(12));
            l111l11111i1l.l11l1111Ill(smOption.l11l1111I1l());
            l11l111l1I1l.append(l111l11111lIl(13));
            l111l11111i1l.l11l11IlIIll("android");
            l11l111l1I1l.append(l111l11111lIl(14));
            l111l11111i1l.l11l111l11Il("3.7.3");
            l11l111l1I1l.append(l111l11111lIl(15));
            l111l11111i1l.l11l11l1lI1l("hy_timeh");
            l11l111l1I1l.append(l111l11111lIl(16));
            l111l11111i1l.l1111l111111Il(Long.valueOf(System.currentTimeMillis()));
            l11l111l1I1l.append(l111l11111lIl(17));
            Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            l111l11111i1l.l1111l111111Il(Integer.valueOf(context == null ? 0 : context.getApplicationInfo().targetSdkVersion));
            l11l111l1I1l.append(l111l11111lIl(18));
            l111l11111i1l.l11l111l1lll(Build.VERSION.RELEASE);
            l111l11111i1l.l111l11IlIlIl(smOption.l11l1111Ill());
            com.ishumei.smantifraud.l111l11111I1l.l11l1111lIIl l11l1111liil = new com.ishumei.smantifraud.l111l11111I1l.l11l1111lIIl();
            if (l11l1111liil.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il, false)) {
                l111l11111i1l.l11l1111I1l(l11l1111liil.l1111l111111Il());
                l111l11111i1l.l111l1111llIl(l11l1111liil.l111l11111lIl());
            }
            if (setL111l11111lIl != null && setL111l11111lIl.contains(l11l1111I11l)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111lIl());
                l111l11111i1l.l11l111l1I1l(sb2.toString());
            }
            l11l111l1I1l.append(l111l11111lIl(19));
            com.ishumei.smantifraud.l111l11111I1l.l11l1111Il l11l1111il = new com.ishumei.smantifraud.l111l11111I1l.l11l1111Il();
            l11l111l1I1l.append(l111l11111lIl(20));
            l11l111l1I1l.append(l111l11111lIl(21));
            com.ishumei.smantifraud.l111l11111I1l.l111l1111lIl l111l1111lil = new com.ishumei.smantifraud.l111l11111I1l.l111l1111lIl();
            if (setL111l11111lIl != null && setL111l11111lIl.contains("bssid") && !setL11l1111Il1l.contains("bssid")) {
                l111l11111i1l.l11l111l1Il((i11 & 1) == 1 ? com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l111l11111I1l(l111l1111lil.l111l11111Il()) : l111l1111lil.l111l11111Il());
            }
            l11l111l1I1l.append(l111l11111lIl(22));
            if (setL111l11111lIl != null && setL111l11111lIl.contains("ssid") && !setL11l1111Il1l.contains("ssid")) {
                l111l11111i1l.l11l111lll(l111l1111lil.l111l11111I1l());
            }
            l11l111l1I1l.append(l111l11111lIl(23));
            if (!setL11l1111Il1l.contains(l111l1111lI1l)) {
                l111l11111i1l.l11l111lllIl(l111l1111lil.l111l1111l1Il());
            }
            l11l111l1I1l.append(l111l11111lIl(24));
            if (!setL11l1111Il1l.contains(l111l11111Il)) {
                l111l11111i1l.l111l111lIlll(l111l1111lil.l111l1111llIl());
            }
            l11l111l1I1l.append(l111l11111lIl(25));
            setL11l1111Il1l.contains(l11l1111I1l);
            l111l11111i1l.l1111l111111Il(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lIl.l111l11111I1l());
            l11l111l1I1l.append(l111l11111lIl(26));
            if (!setL11l1111Il1l.contains(l111l1111lIl)) {
                l111l11111i1l.l11l111ll11l((i11 & 1) == 1 ? com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l111l11111I1l(com.ishumei.smantifraud.l111l11111I1l.l11l1111I1l.l1111l111111Il()) : com.ishumei.smantifraud.l111l11111I1l.l11l1111I1l.l1111l111111Il());
            }
            l11l111l1I1l.append(l111l11111lIl(27));
            l111l11111i1l.l11l111ll1Il(Build.getRadioVersion());
            l11l111l1I1l.append(l111l11111lIl(28));
            l111l11111i1l.l111l1111lIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l());
            l11l111l1I1l.append(l111l11111lIl(29));
            com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l1111l111111Il l1111l111111Il2 = com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l1111l111111Il();
            l111l11111i1l.l11l111llI1l(l1111l111111Il2.l1111l111111Il);
            l111l11111i1l.l111l111llIl(l1111l111111Il2.l111l11111lIl);
            l11l111l1I1l.append(l111l11111lIl(30));
            l111l11111i1l.l111l11111I1l(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111lIl()));
            l11l111l1I1l.append(l111l11111lIl(31));
            l111l11111i1l.l111l11111Il(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111I1l()));
            l11l111l1I1l.append(l111l11111lIl(32));
            l111l11111i1l.l111l11111I1l(Long.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.l111l11111Il()));
            l11l111l1I1l.append(l111l11111lIl(33));
            l111l11111i1l.l11l111lI1l(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l1111l111111Il());
            l11l111l1I1l.append(l111l11111lIl(34));
            l111l11111i1l.l111l11111lIl(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l11111I1l()));
            l11l111l1I1l.append(l111l11111lIl(35));
            l111l11111i1l.l111l1111lI1l(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l11111lIl());
            l11l111l1I1l.append(l111l11111lIl(36));
            l111l11111i1l.l111l1111l1Il(Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l11l1111I1l.l111l11111I1l()));
            l11l111l1I1l.append(l111l11111lIl(37));
            l111l11111i1l.l11l11l1lIl(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111lIl());
            l11l111l1I1l.append(l111l11111lIl(38));
            l111l11111i1l.l11l111lIll(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111I1l());
            l11l111l1I1l.append(l111l11111lIl(39));
            l111l11111i1l.l111l11111lIl(Long.valueOf(com.ishumei.smantifraud.l111l11111I1l.l11l1111I1l.l111l11111lIl()));
            l11l111l1I1l.append(l111l11111lIl(40));
            l111l11111i1l.l111l11111I1l(com.ishumei.smantifraud.l111l11111I1l.l11l1111I1l.l111l1111l1Il());
            l11l111l1I1l.append(l111l11111lIl(41));
            l111l11111i1l.l111l11111lIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111lIl());
            l11l111l1I1l.append(l111l11111lIl(42));
            l11l111l1I1l.append(l111l11111lIl(43));
            Object objL111l11111Il = com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111Il();
            if (objL111l11111Il != null) {
                l111l11111i1l.l11l111I111l(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l1111l111111Il(objL111l11111Il));
                l111l11111i1l.l111l1111llIl(Integer.valueOf(objL111l11111Il.hashCode()));
            }
            l11l111l1I1l.append(l111l11111lIl(44));
            com.ishumei.smantifraud.l111l11111I1l.l11l1111Il1l.l1111l111111Il(l111l11111i1l);
            Context context2 = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            if (context2 != null) {
                l111l11111i1l.l111l111I1l(context2.getFilesDir().toString());
            }
            l11l111l1I1l.append(l111l11111lIl(45));
            l11l111l1I1l.append(l111l11111lIl(46));
            l111l11111i1l.l111l11111I1l(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111l1Il());
            l11l111l1I1l.append(l111l11111lIl(47));
            l111l11111i1l.l111l11111lIl(com.ishumei.smantifraud.l111l11111lIl.l111l11111Il.l1111l111111Il().l111l11111I1l());
            l11l111l1I1l.append(l111l11111lIl(48));
            StatFs statFsL111l11111Il = com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l11111Il();
            if (statFsL111l11111Il != null) {
                l111l11111i1l.l111l11111Il(Long.valueOf(statFsL111l11111Il.getAvailableBytes()));
                l111l11111i1l.l111l1111l1Il(Long.valueOf(statFsL111l11111Il.getFreeBytes()));
                l111l11111i1l.l111l1111llIl(Long.valueOf(statFsL111l11111Il.getTotalBytes()));
            }
            l11l111l1I1l.append(l111l11111lIl(49));
            l111l11111i1l.l111l11111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.C92701.l1111l111111Il());
            l11l111l1I1l.append(l111l11111lIl(50));
            Context context3 = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            l111l11111i1l.l111l1111lI1l(Integer.valueOf((context3 == null || Settings.Secure.getInt(context3.getContentResolver(), "mock_location", 0) == 0) ? 0 : 1));
            l11l111l1I1l.append(l111l11111lIl(51));
            l111l11111i1l.l111l1111lIl(Integer.valueOf(Debug.isDebuggerConnected() ? 1 : 0));
            l11l111l1I1l.append(l111l11111lIl(52));
            l111l11111i1l.l11l1111lIIl(Integer.valueOf((com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getApplicationInfo().flags & 2) > 0 ? 1 : 0));
            l11l111l1I1l.append(l111l11111lIl(53));
            l111l11111i1l.l11l111Il(com.ishumei.smantifraud.l111l11111I1l.l111l1111lIl.l1111l111111Il());
            l11l111l1I1l.append(l111l11111lIl(54));
            l111l11111i1l.l111l1111l1Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111Il());
            l11l111l1I1l.append(l111l11111lIl(55));
            l111l11111i1l.l111l11111lIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111I1l());
            l11l111l1I1l.append(l111l11111lIl(56));
            l111l11111i1l.l11l1111I11l(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111llIl());
            l11l111l1I1l.append(l111l11111lIl(57));
            l111l11111i1l.l1111l111111Il(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lIl());
            l11l111l1I1l.append(l111l11111lIl(58));
            l111l11111i1l.l111l11111lIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111lIIl());
            l11l111l1I1l.append(l111l11111lIl(59));
            l111l11111i1l.l111l11111I1l(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111I11l());
            l11l111l1I1l.append(l111l11111lIl(60));
            if (!setL11l1111Il1l.contains(l11l1111Ill)) {
                l111l11111i1l.l111l111III1l(new com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111llIl(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il).l1111l111111Il());
            }
            l11l111l1I1l.append(l111l11111lIl(61));
            l111l11111i1l.l111l1111llIl(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111I1ll());
            l11l111l1I1l.append(l111l11111lIl(62));
            if (com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111Il() == 1) {
                l111l11111i1l.l1111l111111Il(1);
            }
            l11l111l1I1l.append(l111l11111lIl(63));
            if (l111l11111ilL111l11111lIl != null && l111l11111ilL111l11111lIl.l111l1111llIl()) {
                l111l11111i1l.l111l1111lI1l(com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l1111l111111Il());
            }
            l11l111l1I1l.append(l111l11111lIl(64));
            l111l11111i1l.l111l11111Il(com.ishumei.smantifraud.l111l11111I1l.l111l1111llIl.l111l1111l1Il());
            l11l111l1I1l.append(l111l11111lIl(65));
            l111l11111i1l.l111l1111l1Il(com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il));
            if (!setL11l1111Il1l.contains(l11l1111I1ll)) {
                l111l11111i1l.l11l11l1l1Il(l11l1111il.l111l11111lIl());
            }
            l11l111l1I1l.append(l111l11111lIl(66));
            if (!setL11l1111Il1l.contains(l11l1111Il)) {
                l111l11111i1l.l11l11l1llIl(l11l1111il.l111l11111I1l());
            }
            l11l111l1I1l.append(l111l11111lIl(67));
            List<String> listL11l1111Ill = com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111Ill();
            if (listL11l1111Ill != null && !listL11l1111Ill.isEmpty()) {
                l111l11111i1l.l111l11111Il(listL11l1111Ill);
            }
            l11l111l1I1l.append(l111l11111lIl(68));
            if (!setL11l1111Il1l.contains(l11l111l11Il) && (mapL11l11IlIIll = com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l11IlIIll()) != null) {
                l111l11111i1l.l111l1111lIl(mapL11l11IlIIll);
            }
            l11l111l1I1l.append(l111l11111lIl(69));
            if (com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l111l11Il()) {
                l111l11111i1l.l1111l111111Il(true);
            }
            l11l111l1I1l.append(l111l11111lIl(70));
            HashMap map = new HashMap(5);
            map.put("mr", Long.valueOf(TrafficStats.getMobileRxBytes()));
            map.put("mt", Long.valueOf(TrafficStats.getMobileTxBytes()));
            map.put("tr", Long.valueOf(TrafficStats.getTotalRxBytes()));
            map.put(TtmlNode.TAG_TT, Long.valueOf(TrafficStats.getTotalTxBytes()));
            l111l11111i1l.l11l1111lIIl(map);
            l11l111l1I1l.append(l111l11111lIl(71));
            l111l11111i1l.l111l11111lIl(Settings.Secure.getInt(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getContentResolver(), "adb_enabled", 0));
            l11l111l1I1l.append(l111l11111lIl(72));
            Map<String, Integer> mapL1111l111111Il = com.ishumei.smantifraud.l111l11111I1l.l11l1111Il.l1111l111111Il();
            l11l111l1I1l.append(l111l11111lIl(73));
            if (mapL1111l111111Il != null) {
                l111l11111i1l.l11l1111I11l(mapL1111l111111Il);
            }
            l11l111l1I1l.append(l111l11111lIl(74));
            l11l111l1I1l.append(l111l11111lIl(75));
            l111l11111i1l.l11l11l11Il(smOption.l11l11IlIIll());
            l11l111l1I1l.append(l111l11111lIl(76));
            Map<String, Long> mapL111l1111llIl = com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l1111llIl();
            if (mapL111l1111llIl != null && !mapL111l1111llIl.isEmpty()) {
                l111l11111i1l.l11l1111I1l(mapL111l1111llIl);
            }
            l11l111l1I1l.append(l111l11111lIl(77));
            List<String> listL11l111l1lll = com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l111l1lll();
            if (listL11l111l1lll != null && !listL11l111l1lll.isEmpty()) {
                l111l11111i1l.l111l1111l1Il(listL11l111l1lll);
            }
            l11l111l1I1l.append(l111l11111lIl(78));
            this.l11l111ll11l = true;
            String deviceId = SmAntiFraud.getDeviceId();
            if (deviceId != null && !deviceId.startsWith("D")) {
                l111l11111i1l.l111l11l11Ill(deviceId);
            }
            this.l11l111ll11l = false;
            l11l111l1I1l.append(l111l11111lIl(79));
            if (com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l111l11111Il()) {
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (jCurrentTimeMillis3 < 300) {
                    Thread.sleep(jCurrentTimeMillis3);
                }
                if (com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l1111l111111Il()) {
                    l111l11111i1l.l111l1111lI1l(1);
                }
                if (com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l111l11111lIl() || com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l111l11111I1l()) {
                    HashMap map2 = new HashMap();
                    map2.put("f", Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l111l11111lIl() ? 1 : 0));
                    map2.put("bi", Integer.valueOf(com.ishumei.smantifraud.l111l11111I1l.l111l1111lI1l.l111l11111I1l() ? 1 : 0));
                    l111l11111i1l.l11l1111I1ll(map2);
                }
            }
            l11l111l1I1l.append(l111l11111lIl(80));
            File parentFile = new File(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getApplicationInfo().dataDir).getParentFile();
            if (parentFile != null && parentFile.canRead()) {
                l111l11111i1l.l111l1111lIl(1);
            }
            l11l111l1I1l.append(l111l11111lIl(81));
            int iL111l11IlIlIl = com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11IlIlIl();
            if (iL111l11IlIlIl != 0) {
                l111l11111i1l.l11l1111lIIl(iL111l11IlIlIl);
            }
            l11l111l1I1l.append(l111l11111lIl(82));
            l111l11111i1l.l11l1111I11l(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lIl.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il));
            l11l111l1I1l.append(l111l11111lIl(83));
            Map<String, String> mapL111l1111lI1l = com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l1111lI1l();
            if (mapL111l1111lI1l != null) {
                l111l11111i1l.l11l1111Il(mapL111l1111lI1l);
            }
            l11l111l1I1l.append(l111l11111lIl(84));
            if (!setL11l1111Il1l.contains(l11l11IlIIll)) {
                l111l11111i1l.l11l1111Il1l(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il));
            }
            l111l11111i1l.l111l1111llIl((int) (System.currentTimeMillis() - jCurrentTimeMillis));
            StringBuilder sb3 = l11l111l1I1l;
            if (sb3 != null) {
                string = sb3.toString();
                l111l11111i1l.l11l11l1I11l(string);
            }
        } catch (Throwable th2) {
            try {
                l111l11111i1l.l111l111Il1l(Log.getStackTraceString(th2));
                StringBuilder sb4 = l11l111l1I1l;
                if (sb4 != null) {
                    string = sb4.toString();
                }
            } catch (Throwable th3) {
                StringBuilder sb5 = l11l111l1I1l;
                if (sb5 != null) {
                    l111l11111i1l.l11l11l1I11l(sb5.toString());
                }
                throw th3;
            }
        }
        String strL11l1111lIIl = null;
        JSONObject jSONObjectL1111l111111Il2 = com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(l111l11111i1l, (Set<String>) null);
        if (smOption.l111l1111lIl() && TextUtils.isEmpty(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111Il)) {
            jSONObjectL1111l111111Il = com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(l111l11111i1l, l111l11111lIl.l1111l111111Il);
            l111l11111lIl.l1111l111111Il(jSONObjectL1111l111111Il);
        } else {
            jSONObjectL1111l111111Il = null;
        }
        Context context4 = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        String string2 = jSONObjectL1111l111111Il2.toString();
        String string3 = jSONObjectL1111l111111Il == null ? null : jSONObjectL1111l111111Il.toString();
        if (l111l11111ilL111l11111lIl != null && l111l11111ilL111l11111lIl.l111l11111Il()) {
            strL11l1111lIIl = l111l11111ilL111l11111lIl.l11l1111lIIl();
        }
        String strM14294v1 = SMSDK.m14294v1(context4, string2, string3, strL11l1111lIIl, smOption.l111l11111Il(), smOption.l11l1111I11l(), smOption.l11l1111Ill(), smOption.l11l1111I1l(), com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l11111I1l);
        if (TextUtils.isEmpty(strM14294v1) || !strM14294v1.startsWith("{")) {
            throw new Exception("error ret: " + strM14294v1);
        }
        int iIndexOf = strM14294v1.indexOf("}{") + 1;
        if (iIndexOf > 0) {
            String strSubstring = strM14294v1.substring(0, iIndexOf);
            this.l11l111l1Il = com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(strM14294v1.substring(iIndexOf).getBytes());
            strM14294v1 = strSubstring;
        } else {
            this.l11l111l1Il = com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(strM14294v1.getBytes());
        }
        this.l11l111ll1Il = System.currentTimeMillis();
        return strM14294v1;
    }

    public final boolean l111l11111lIl() {
        return this.l11l111ll11l;
    }
}
