package com.sumsub.sentry.android;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.AbstractC27972n;
import com.sumsub.sentry.C27888P;
import com.sumsub.sentry.C27896T0;
import com.sumsub.sentry.C27904X0;
import com.sumsub.sentry.C27928c;
import com.sumsub.sentry.C27950h1;
import com.sumsub.sentry.C27968m;
import com.sumsub.sentry.C27973n0;
import com.sumsub.sentry.C28012x;
import com.sumsub.sentry.Device$DeviceOrientation;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C34052z4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sentry.android.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27917e {

    /* JADX INFO: renamed from: a */
    public final Context f57023a;

    /* JADX INFO: renamed from: b */
    public final C27913a f57024b;

    /* JADX INFO: renamed from: c */
    public final C27919g f57025c;

    /* JADX INFO: renamed from: d */
    public final String f57026d;

    /* JADX INFO: renamed from: e */
    public final Future f57027e;

    /* JADX INFO: renamed from: f */
    public final String f57028f;

    /* JADX INFO: renamed from: g */
    public final String f57029g;

    /* JADX INFO: renamed from: a */
    public final void m68997a(C27973n0 c27973n0) {
        String str;
        Object obj = c27973n0.f57000a.get(C33556b3.f69078o2);
        C27888P c27888p = (C27888P) (C27888P.class.isInstance(obj) ? C27888P.class.cast(obj) : null);
        C27888P c27888p2 = new C27888P();
        c27888p2.f56960a = KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID;
        c27888p2.f56961b = Build.VERSION.RELEASE;
        c27888p2.f56963d = Build.DISPLAY;
        try {
            Object obj2 = ((Map) this.f57027e.get()).get("kernelVersion");
            if (obj2 != null) {
                c27888p2.f56964e = obj2 instanceof String ? (String) obj2 : null;
            }
            Object obj3 = ((Map) this.f57027e.get()).get("rooted");
            if (obj3 != null) {
                c27888p2.f56965f = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            }
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting OperatingSystem.", th2);
        }
        c27973n0.f57000a.put(C33556b3.f69078o2, c27888p2);
        if (c27888p != null) {
            String str2 = c27888p.f56960a;
            if (str2 == null || str2.length() == 0) {
                str = "os_1";
            } else {
                str = "os_" + StringsKt.trim((CharSequence) str2).toString().toLowerCase(Locale.ROOT);
            }
            c27973n0.f57000a.put(str, c27888p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0206  */
    /* JADX WARN: Code duplicated, block: B:119:0x0226  */
    /* JADX WARN: Code duplicated, block: B:127:0x0246  */
    /* JADX WARN: Code duplicated, block: B:135:0x0266 A[Catch: all -> 0x0270, TRY_LEAVE, TryCatch #13 {all -> 0x0270, blocks: (B:133:0x025d, B:135:0x0266), top: B:340:0x025d }] */
    /* JADX WARN: Code duplicated, block: B:139:0x027e  */
    /* JADX WARN: Code duplicated, block: B:143:0x028f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0292  */
    /* JADX WARN: Code duplicated, block: B:146:0x0295  */
    /* JADX WARN: Code duplicated, block: B:149:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:152:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02db  */
    /* JADX WARN: Code duplicated, block: B:158:0x02de  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x0300  */
    /* JADX WARN: Code duplicated, block: B:164:0x0302  */
    /* JADX WARN: Code duplicated, block: B:165:0x0305  */
    /* JADX WARN: Code duplicated, block: B:169:0x0315 A[Catch: all -> 0x0318, TryCatch #16 {all -> 0x0318, blocks: (B:167:0x0309, B:169:0x0315, B:173:0x031b, B:175:0x0322, B:176:0x0326), top: B:346:0x0309 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x031a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0322 A[Catch: all -> 0x0318, TryCatch #16 {all -> 0x0318, blocks: (B:167:0x0309, B:169:0x0315, B:173:0x031b, B:175:0x0322, B:176:0x0326), top: B:346:0x0309 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0326 A[Catch: all -> 0x0318, TRY_LEAVE, TryCatch #16 {all -> 0x0318, blocks: (B:167:0x0309, B:169:0x0315, B:173:0x031b, B:175:0x0322, B:176:0x0326), top: B:346:0x0309 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0348  */
    /* JADX WARN: Code duplicated, block: B:184:0x036e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0433  */
    /* JADX WARN: Code duplicated, block: B:225:0x043e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0496  */
    /* JADX WARN: Code duplicated, block: B:241:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:242:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:244:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:247:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:249:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:251:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:252:0x04de  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:255:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:258:0x0505  */
    /* JADX WARN: Code duplicated, block: B:259:0x0508 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x050a  */
    /* JADX WARN: Code duplicated, block: B:261:0x050e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x0510  */
    /* JADX WARN: Code duplicated, block: B:263:0x0513  */
    /* JADX WARN: Code duplicated, block: B:267:0x0534 A[Catch: all -> 0x0539, TRY_LEAVE, TryCatch #17 {all -> 0x0539, blocks: (B:265:0x0524, B:267:0x0534), top: B:347:0x0524 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x0563  */
    /* JADX WARN: Code duplicated, block: B:283:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:293:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:296:0x0600  */
    /* JADX WARN: Code duplicated, block: B:316:0x0452 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x05e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX INFO: renamed from: b */
    public final C27973n0 m68998b(C27973n0 c27973n0) {
        String string;
        PackageInfo packageInfo;
        C28012x c28012x;
        String str;
        Device$DeviceOrientation device$DeviceOrientation;
        Intent intentRegisterReceiver;
        C27914b c27914b;
        Context context;
        Object systemService;
        ConnectivityManager connectivityManager;
        ConnectivityChecker$Status connectivityChecker$Status;
        NetworkInfo activeNetworkInfo;
        int i11;
        Boolean bool;
        ActivityManager.MemoryInfo memoryInfo;
        File externalFilesDir;
        String externalStorageState;
        StatFs statFs;
        Long lValueOf;
        Long lValueOf2;
        DisplayMetrics displayMetrics;
        Date time;
        LocaleList locales;
        TimeZone timeZone;
        String strM68999a;
        Locale locale;
        Object obj;
        C27914b c27914b2;
        Context context2;
        Object systemService2;
        ConnectivityManager connectivityManager2;
        String str2;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        boolean zHasTransport;
        boolean zHasTransport2;
        boolean zHasTransport3;
        File file;
        Long lValueOf3;
        Long lValueOf4;
        Object systemService3;
        ActivityManager activityManager;
        Float fValueOf;
        Boolean boolValueOf;
        Float fValueOf2;
        int intExtra;
        int intExtra2;
        boolean z11;
        int intExtra3;
        Device$DeviceOrientation device$DeviceOrientation2;
        boolean z12;
        Map map;
        Object obj2 = c27973n0.f57000a.get("app");
        C27928c c27928c = (C27928c) (C27928c.class.isInstance(obj2) ? C27928c.class.cast(obj2) : null);
        if (c27928c == null) {
            c27928c = new C27928c();
        }
        C27928c c27928c2 = c27928c;
        try {
            ApplicationInfo applicationInfo = this.f57023a.getApplicationInfo();
            int i12 = applicationInfo.labelRes;
            if (i12 == 0) {
                CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                string = charSequence != null ? charSequence.toString() : this.f57023a.getPackageManager().getApplicationLabel(applicationInfo).toString();
            } else {
                string = this.f57023a.getString(i12);
            }
        } catch (Throwable unused) {
            string = null;
        }
        c27928c2.f57053d = string;
        C27915c c27915c = C27915c.f57021a;
        Context context3 = this.f57023a;
        try {
            packageInfo = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 4096);
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(c27915c), "Error getting package info.", th2);
            packageInfo = null;
        }
        if (packageInfo != null) {
            String strM68995a = C27915c.m68995a(packageInfo);
            if (c27973n0.f57008i == null) {
                c27973n0.f57008i = strM68995a;
            }
            c27928c2.f57050a = packageInfo.packageName;
            c27928c2.f57054e = packageInfo.versionName;
            c27928c2.f57055f = C27915c.m68995a(packageInfo);
            HashMap map2 = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length != 0 && iArr != null && iArr.length > 0) {
                int length = strArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    String str3 = strArr[i13];
                    map2.put(str3.substring(StringsKt.lastIndexOf$default((CharSequence) str3, '.', 0, false, 6, (Object) null) + 1), (iArr[i13] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            c27928c2.f57056g = map2;
            String str4 = packageInfo.packageName;
            if (str4 != null && (map = c27973n0.f57002c) != null) {
                map.put("app.package", str4);
            }
        }
        c27973n0.f57000a.put("app", c27928c2);
        C27904X0 c27904x0 = c27973n0.f57100s;
        if (c27904x0 != null) {
            for (C27896T0 c27896t0 : c27904x0.f56992a) {
                if (c27896t0.f56981f == null) {
                    Long l11 = c27896t0.f56976a;
                    if (l11 == null) {
                        z12 = false;
                    } else if (Looper.getMainLooper().getThread().getId() == l11.longValue()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c27896t0.f56981f = Boolean.valueOf(z12);
                }
            }
        }
        C27950h1 c27950h1 = c27973n0.f57006g;
        if (c27950h1 == null) {
            String strM68999a2 = this.f57026d;
            if (strM68999a2 == null) {
                try {
                    strM68999a2 = C27918f.f57030a.m68999a(this.f57023a);
                } catch (Throwable unused2) {
                    strM68999a2 = null;
                }
            }
            c27973n0.f57006g = new C27950h1(strM68999a2, 14);
        } else if (c27950h1.f57076b == null) {
            String strM68999a3 = this.f57026d;
            if (strM68999a3 == null) {
                try {
                    strM68999a3 = C27918f.f57030a.m68999a(this.f57023a);
                } catch (Throwable unused3) {
                    strM68999a3 = null;
                }
            }
            c27950h1.f57076b = strM68999a3;
        }
        Object obj3 = c27973n0.f57000a.get("device");
        if (((C28012x) (C28012x.class.isInstance(obj3) ? C28012x.class.cast(obj3) : null)) == null) {
            C27968m c27968m = c27973n0.f57000a;
            String string2 = Settings.Global.getString(this.f57023a.getContentResolver(), "device_name");
            if (string2 == null) {
                string2 = "Unknown";
            }
            String str5 = string2;
            String str6 = Build.MANUFACTURER;
            String str7 = Build.BRAND;
            try {
                str = ((String[]) new Regex(C33627eb.f69716f).split(Build.MODEL, 0).toArray(new String[0]))[0];
            } catch (Throwable th3) {
                C33272c c33272c2 = C33272c.f67812a;
                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting device family.", th3);
                str = null;
            }
            String str8 = Build.MODEL;
            String str9 = Build.ID;
            try {
                int i14 = this.f57023a.getResources().getConfiguration().orientation;
                try {
                    try {
                        try {
                            try {
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        device$DeviceOrientation = null;
                                    } else {
                                        device$DeviceOrientation2 = Device$DeviceOrientation.LANDSCAPE;
                                    }
                                    if (device$DeviceOrientation == null) {
                                        try {
                                            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", null, 4, null);
                                            device$DeviceOrientation = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            C33272c c33272c3 = C33272c.f67812a;
                                            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting device orientation.", th);
                                        }
                                    }
                                    c28012x = new C28012x(str5, str6, str, device$DeviceOrientation);
                                    c28012x.f57150g = new String[]{this.f57028f, this.f57029g};
                                    intentRegisterReceiver = this.f57023a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                    if (intentRegisterReceiver != null) {
                                        try {
                                            intExtra3 = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                                            int intExtra4 = intentRegisterReceiver.getIntExtra("scale", -1);
                                            if (intExtra3 != -1 || intExtra4 == -1) {
                                                fValueOf = null;
                                            } else {
                                                fValueOf = Float.valueOf((intExtra3 / intExtra4) * 100.0f);
                                            }
                                        } catch (Throwable th5) {
                                            C33272c c33272c4 = C33272c.f67812a;
                                            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting device battery level.", th5);
                                        }
                                        c28012x.f57151h = fValueOf;
                                        try {
                                            intExtra2 = intentRegisterReceiver.getIntExtra("plugged", -1);
                                            if (intExtra2 != 1 || intExtra2 == 2) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z11);
                                        } catch (Throwable th6) {
                                            C33272c c33272c5 = C33272c.f67812a;
                                            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting device charging state.", th6);
                                            boolValueOf = null;
                                        }
                                        c28012x.f57152i = boolValueOf;
                                        try {
                                            intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                            if (intExtra != -1) {
                                                fValueOf2 = Float.valueOf(intExtra / 10);
                                            } else {
                                                fValueOf2 = null;
                                            }
                                        } catch (Throwable th7) {
                                            C33272c c33272c6 = C33272c.f67812a;
                                            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting battery temperature.", th7);
                                        }
                                        c28012x.f57143E = fValueOf2;
                                    }
                                    c27914b = C27914b.f57020a;
                                    context = this.f57023a;
                                    systemService = context.getSystemService("connectivity");
                                    if (systemService instanceof ConnectivityManager) {
                                        connectivityManager = (ConnectivityManager) systemService;
                                    } else {
                                        connectivityManager = null;
                                    }
                                    if (connectivityManager == null) {
                                        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b), "ConnectivityManager is null and cannot check network status", null, 4, null);
                                    }
                                    if (connectivityManager == null) {
                                        connectivityChecker$Status = ConnectivityChecker$Status.UNKNOWN;
                                    } else if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                                        activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                        if (activeNetworkInfo == null) {
                                            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b), "NetworkInfo is null, there's no active network.", null, 4, null);
                                            connectivityChecker$Status = ConnectivityChecker$Status.NOT_CONNECTED;
                                        } else if (activeNetworkInfo.isConnected()) {
                                            connectivityChecker$Status = ConnectivityChecker$Status.CONNECTED;
                                        } else {
                                            connectivityChecker$Status = ConnectivityChecker$Status.NOT_CONNECTED;
                                        }
                                    } else {
                                        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b), "No permission (ACCESS_NETWORK_STATE) to check network status.", null, 4, null);
                                        connectivityChecker$Status = ConnectivityChecker$Status.NO_PERMISSION;
                                    }
                                    i11 = AbstractC27916d.f57022a[connectivityChecker$Status.ordinal()];
                                    if (i11 != 1) {
                                        bool = Boolean.FALSE;
                                    } else if (i11 != 2) {
                                        bool = null;
                                    } else {
                                        bool = Boolean.TRUE;
                                    }
                                    c28012x.f57153j = bool;
                                    systemService3 = this.f57023a.getSystemService("activity");
                                    if (systemService3 instanceof ActivityManager) {
                                        activityManager = (ActivityManager) systemService3;
                                    } else {
                                        activityManager = null;
                                    }
                                    memoryInfo = new ActivityManager.MemoryInfo();
                                    if (activityManager != null) {
                                        activityManager.getMemoryInfo(memoryInfo);
                                    } else {
                                        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Error getting MemoryInfo.", null, 4, null);
                                        memoryInfo = null;
                                    }
                                    if (memoryInfo != null) {
                                        c28012x.f57156m = Long.valueOf(Runtime.getRuntime().totalMemory());
                                        c28012x.f57157n = Long.valueOf(memoryInfo.availMem);
                                        c28012x.f57159p = Boolean.valueOf(memoryInfo.lowMemory);
                                    }
                                    externalFilesDir = this.f57023a.getExternalFilesDir(null);
                                    if (externalFilesDir != null) {
                                        StatFs statFs2 = new StatFs(externalFilesDir.getPath());
                                        try {
                                            lValueOf3 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                        } catch (Throwable th8) {
                                            C33272c c33272c7 = C33272c.f67812a;
                                            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting total internal storage amount.", th8);
                                            lValueOf3 = null;
                                        }
                                        c28012x.f57160q = lValueOf3;
                                        try {
                                            lValueOf4 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                        } catch (Throwable th9) {
                                            C33272c c33272c8 = C33272c.f67812a;
                                            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting unused internal storage amount.", th9);
                                            lValueOf4 = null;
                                        }
                                        c28012x.f57161r = lValueOf4;
                                    }
                                    externalStorageState = Environment.getExternalStorageState();
                                    if ((!Intrinsics.areEqual("mounted", externalStorageState) || Intrinsics.areEqual("mounted_ro", externalStorageState)) && !Environment.isExternalStorageEmulated()) {
                                        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "External storage is not mounted or emulated.", null, 4, null);
                                    } else {
                                        File[] externalFilesDirs = this.f57023a.getExternalFilesDirs(null);
                                        if (externalFilesDirs != null) {
                                            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                                            Iterator it = ArrayIteratorKt.iterator(externalFilesDirs);
                                            while (true) {
                                                if (it.hasNext()) {
                                                    file = (File) it.next();
                                                    if (file != null && (absolutePath == null || absolutePath.length() == 0 || !StringsKt.contains$default((CharSequence) file.getAbsolutePath(), (CharSequence) absolutePath, false, 2, (Object) null))) {
                                                        break;
                                                    }
                                                }
                                            }
                                            if (file != null) {
                                                statFs = new StatFs(file.getPath());
                                            } else {
                                                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Not possible to read external files directory", null, 4, null);
                                            }
                                            if (statFs != null) {
                                                try {
                                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                                } catch (Throwable th10) {
                                                    C33272c c33272c9 = C33272c.f67812a;
                                                    C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting total external storage amount.", th10);
                                                    lValueOf = null;
                                                }
                                                c28012x.f57162s = lValueOf;
                                                try {
                                                    lValueOf2 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                                } catch (Throwable th11) {
                                                    C33272c c33272c10 = C33272c.f67812a;
                                                    C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting unused external storage amount.", th11);
                                                    lValueOf2 = null;
                                                }
                                                c28012x.f57163t = lValueOf2;
                                            }
                                            if (c28012x.f57142D == null) {
                                                c27914b2 = C27914b.f57020a;
                                                context2 = this.f57023a;
                                                systemService2 = context2.getSystemService("connectivity");
                                                if (systemService2 instanceof ConnectivityManager) {
                                                    connectivityManager2 = (ConnectivityManager) systemService2;
                                                } else {
                                                    connectivityManager2 = null;
                                                }
                                                if (connectivityManager2 == null) {
                                                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "ConnectivityManager is null and cannot check network status", null, 4, null);
                                                }
                                                if (connectivityManager2 != null) {
                                                    if (context2.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                                                        activeNetwork = connectivityManager2.getActiveNetwork();
                                                        if (activeNetwork == null) {
                                                            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "Network is null and cannot check network status", null, 4, null);
                                                        } else {
                                                            networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
                                                            if (networkCapabilities == null) {
                                                                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "NetworkCapabilities is null and cannot check network type", null, 4, null);
                                                            } else {
                                                                zHasTransport = networkCapabilities.hasTransport(3);
                                                                zHasTransport2 = networkCapabilities.hasTransport(1);
                                                                zHasTransport3 = networkCapabilities.hasTransport(0);
                                                                if (zHasTransport) {
                                                                    str2 = "ethernet";
                                                                } else if (zHasTransport2) {
                                                                    str2 = "wifi";
                                                                } else if (zHasTransport3) {
                                                                    str2 = "cellular";
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "No permission (ACCESS_NETWORK_STATE) to check network status.", null, 4, null);
                                                    }
                                                    str2 = null;
                                                } else {
                                                    str2 = null;
                                                }
                                                c28012x.f57142D = str2;
                                            }
                                            obj = ((Map) this.f57027e.get()).get(C34052z4.f72600l);
                                            if (obj != null) {
                                                c28012x.f57155l = (Boolean) obj;
                                            }
                                            displayMetrics = this.f57023a.getResources().getDisplayMetrics();
                                            if (displayMetrics != null) {
                                                c28012x.f57164u = Integer.valueOf(displayMetrics.widthPixels);
                                                c28012x.f57165v = Integer.valueOf(displayMetrics.heightPixels);
                                                c28012x.f57166w = Float.valueOf(displayMetrics.density);
                                                c28012x.f57167x = Integer.valueOf(displayMetrics.densityDpi);
                                            }
                                            SimpleDateFormat simpleDateFormat = AbstractC27972n.f57093a;
                                            System.currentTimeMillis();
                                            SystemClock.elapsedRealtime();
                                            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                                            calendar.getTimeInMillis();
                                            time = calendar.getTime();
                                            c28012x.f57168y = time;
                                            locales = this.f57023a.getResources().getConfiguration().getLocales();
                                            if (locales.isEmpty()) {
                                                timeZone = Calendar.getInstance().getTimeZone();
                                            } else {
                                                timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                                            }
                                            c28012x.f57169z = timeZone.getID();
                                            if (c28012x.f57139A == null) {
                                                try {
                                                    strM68999a = C27918f.f57030a.m68999a(this.f57023a);
                                                } catch (Throwable unused4) {
                                                    strM68999a = null;
                                                }
                                                c28012x.f57139A = strM68999a;
                                            }
                                            locale = Locale.getDefault();
                                            if (c28012x.f57140B == null) {
                                                c28012x.f57140B = locale.getLanguage();
                                            }
                                            if (c28012x.f57141C == null) {
                                                c28012x.f57141C = locale.toString();
                                            }
                                            c27968m.put("device", c28012x);
                                        } else {
                                            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Not possible to read getExternalFilesDirs", null, 4, null);
                                        }
                                        file = null;
                                        if (file != null) {
                                            statFs = new StatFs(file.getPath());
                                        } else {
                                            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Not possible to read external files directory", null, 4, null);
                                        }
                                        if (statFs != null) {
                                            lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                            c28012x.f57162s = lValueOf;
                                            lValueOf2 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                            c28012x.f57163t = lValueOf2;
                                        }
                                        if (c28012x.f57142D == null) {
                                            c27914b2 = C27914b.f57020a;
                                            context2 = this.f57023a;
                                            systemService2 = context2.getSystemService("connectivity");
                                            if (systemService2 instanceof ConnectivityManager) {
                                                connectivityManager2 = (ConnectivityManager) systemService2;
                                            } else {
                                                connectivityManager2 = null;
                                            }
                                            if (connectivityManager2 == null) {
                                                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "ConnectivityManager is null and cannot check network status", null, 4, null);
                                            }
                                            if (connectivityManager2 != null) {
                                                if (context2.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                                                    activeNetwork = connectivityManager2.getActiveNetwork();
                                                    if (activeNetwork == null) {
                                                        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "Network is null and cannot check network status", null, 4, null);
                                                    } else {
                                                        networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
                                                        if (networkCapabilities == null) {
                                                            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "NetworkCapabilities is null and cannot check network type", null, 4, null);
                                                        } else {
                                                            zHasTransport = networkCapabilities.hasTransport(3);
                                                            zHasTransport2 = networkCapabilities.hasTransport(1);
                                                            zHasTransport3 = networkCapabilities.hasTransport(0);
                                                            if (zHasTransport) {
                                                                str2 = "ethernet";
                                                            } else if (zHasTransport2) {
                                                                str2 = "wifi";
                                                            } else if (zHasTransport3) {
                                                                str2 = "cellular";
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "No permission (ACCESS_NETWORK_STATE) to check network status.", null, 4, null);
                                                }
                                                str2 = null;
                                            } else {
                                                str2 = null;
                                            }
                                            c28012x.f57142D = str2;
                                        }
                                        obj = ((Map) this.f57027e.get()).get(C34052z4.f72600l);
                                        if (obj != null) {
                                            c28012x.f57155l = (Boolean) obj;
                                        }
                                        displayMetrics = this.f57023a.getResources().getDisplayMetrics();
                                        if (displayMetrics != null) {
                                            c28012x.f57164u = Integer.valueOf(displayMetrics.widthPixels);
                                            c28012x.f57165v = Integer.valueOf(displayMetrics.heightPixels);
                                            c28012x.f57166w = Float.valueOf(displayMetrics.density);
                                            c28012x.f57167x = Integer.valueOf(displayMetrics.densityDpi);
                                        }
                                        SimpleDateFormat simpleDateFormat2 = AbstractC27972n.f57093a;
                                        System.currentTimeMillis();
                                        SystemClock.elapsedRealtime();
                                        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                                        calendar2.getTimeInMillis();
                                        time = calendar2.getTime();
                                        c28012x.f57168y = time;
                                        locales = this.f57023a.getResources().getConfiguration().getLocales();
                                        if (locales.isEmpty()) {
                                            timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                                        } else {
                                            timeZone = Calendar.getInstance().getTimeZone();
                                        }
                                        c28012x.f57169z = timeZone.getID();
                                        if (c28012x.f57139A == null) {
                                            strM68999a = C27918f.f57030a.m68999a(this.f57023a);
                                            c28012x.f57139A = strM68999a;
                                        }
                                        locale = Locale.getDefault();
                                        if (c28012x.f57140B == null) {
                                            c28012x.f57140B = locale.getLanguage();
                                        }
                                        if (c28012x.f57141C == null) {
                                            c28012x.f57141C = locale.toString();
                                        }
                                        c27968m.put("device", c28012x);
                                    }
                                    statFs = null;
                                    if (statFs != null) {
                                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                        c28012x.f57162s = lValueOf;
                                        lValueOf2 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                        c28012x.f57163t = lValueOf2;
                                    }
                                    if (c28012x.f57142D == null) {
                                        c27914b2 = C27914b.f57020a;
                                        context2 = this.f57023a;
                                        systemService2 = context2.getSystemService("connectivity");
                                        if (systemService2 instanceof ConnectivityManager) {
                                            connectivityManager2 = (ConnectivityManager) systemService2;
                                        } else {
                                            connectivityManager2 = null;
                                        }
                                        if (connectivityManager2 == null) {
                                            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "ConnectivityManager is null and cannot check network status", null, 4, null);
                                        }
                                        if (connectivityManager2 != null) {
                                            if (context2.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                                                activeNetwork = connectivityManager2.getActiveNetwork();
                                                if (activeNetwork == null) {
                                                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "Network is null and cannot check network status", null, 4, null);
                                                } else {
                                                    networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
                                                    if (networkCapabilities == null) {
                                                        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "NetworkCapabilities is null and cannot check network type", null, 4, null);
                                                    } else {
                                                        zHasTransport = networkCapabilities.hasTransport(3);
                                                        zHasTransport2 = networkCapabilities.hasTransport(1);
                                                        zHasTransport3 = networkCapabilities.hasTransport(0);
                                                        if (zHasTransport) {
                                                            str2 = "ethernet";
                                                        } else if (zHasTransport2) {
                                                            str2 = "wifi";
                                                        } else if (zHasTransport3) {
                                                            str2 = "cellular";
                                                        }
                                                    }
                                                }
                                            } else {
                                                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "No permission (ACCESS_NETWORK_STATE) to check network status.", null, 4, null);
                                            }
                                            str2 = null;
                                        } else {
                                            str2 = null;
                                        }
                                        c28012x.f57142D = str2;
                                    }
                                    obj = ((Map) this.f57027e.get()).get(C34052z4.f72600l);
                                    if (obj != null) {
                                        c28012x.f57155l = (Boolean) obj;
                                    }
                                    displayMetrics = this.f57023a.getResources().getDisplayMetrics();
                                    if (displayMetrics != null) {
                                        c28012x.f57164u = Integer.valueOf(displayMetrics.widthPixels);
                                        c28012x.f57165v = Integer.valueOf(displayMetrics.heightPixels);
                                        c28012x.f57166w = Float.valueOf(displayMetrics.density);
                                        c28012x.f57167x = Integer.valueOf(displayMetrics.densityDpi);
                                    }
                                    SimpleDateFormat simpleDateFormat3 = AbstractC27972n.f57093a;
                                    System.currentTimeMillis();
                                    SystemClock.elapsedRealtime();
                                    Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                                    calendar3.getTimeInMillis();
                                    time = calendar3.getTime();
                                    c28012x.f57168y = time;
                                    locales = this.f57023a.getResources().getConfiguration().getLocales();
                                    if (locales.isEmpty()) {
                                        timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                                    } else {
                                        timeZone = Calendar.getInstance().getTimeZone();
                                    }
                                    c28012x.f57169z = timeZone.getID();
                                    if (c28012x.f57139A == null) {
                                        strM68999a = C27918f.f57030a.m68999a(this.f57023a);
                                        c28012x.f57139A = strM68999a;
                                    }
                                    locale = Locale.getDefault();
                                    if (c28012x.f57140B == null) {
                                        c28012x.f57140B = locale.getLanguage();
                                    }
                                    if (c28012x.f57141C == null) {
                                        c28012x.f57141C = locale.toString();
                                    }
                                    c27968m.put("device", c28012x);
                                } else {
                                    device$DeviceOrientation2 = Device$DeviceOrientation.PORTRAIT;
                                }
                                obj = ((Map) this.f57027e.get()).get(C34052z4.f72600l);
                                if (obj != null) {
                                    c28012x.f57155l = (Boolean) obj;
                                }
                            } catch (Throwable th12) {
                                C33272c c33272c11 = C33272c.f67812a;
                                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting emulator.", th12);
                            }
                            systemService3 = this.f57023a.getSystemService("activity");
                            if (systemService3 instanceof ActivityManager) {
                                activityManager = (ActivityManager) systemService3;
                            } else {
                                activityManager = null;
                            }
                            memoryInfo = new ActivityManager.MemoryInfo();
                            if (activityManager != null) {
                                activityManager.getMemoryInfo(memoryInfo);
                            } else {
                                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Error getting MemoryInfo.", null, 4, null);
                                memoryInfo = null;
                            }
                        } catch (Throwable th13) {
                            C33272c c33272c12 = C33272c.f67812a;
                            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting MemoryInfo.", th13);
                        }
                        displayMetrics = this.f57023a.getResources().getDisplayMetrics();
                    } catch (Throwable th14) {
                        C33272c c33272c13 = C33272c.f67812a;
                        C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting DisplayMetrics.", th14);
                        displayMetrics = null;
                    }
                    SimpleDateFormat simpleDateFormat4 = AbstractC27972n.f57093a;
                    System.currentTimeMillis();
                    SystemClock.elapsedRealtime();
                    Calendar calendar4 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                    calendar4.getTimeInMillis();
                    time = calendar4.getTime();
                } catch (IllegalArgumentException e11) {
                    C33272c c33272c14 = C33272c.f67812a;
                    C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting the device's boot time.", e11);
                    time = null;
                }
                device$DeviceOrientation = device$DeviceOrientation2;
                if (device$DeviceOrientation == null) {
                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", null, 4, null);
                    device$DeviceOrientation = null;
                }
            } catch (Throwable th15) {
                th = th15;
                device$DeviceOrientation = null;
            }
            c28012x = new C28012x(str5, str6, str, device$DeviceOrientation);
            c28012x.f57150g = new String[]{this.f57028f, this.f57029g};
            intentRegisterReceiver = this.f57023a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                intExtra3 = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                int intExtra5 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra3 != -1) {
                    fValueOf = null;
                } else {
                    fValueOf = null;
                }
                c28012x.f57151h = fValueOf;
                intExtra2 = intentRegisterReceiver.getIntExtra("plugged", -1);
                if (intExtra2 != 1) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                boolValueOf = Boolean.valueOf(z11);
                c28012x.f57152i = boolValueOf;
                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf2 = Float.valueOf(intExtra / 10);
                } else {
                    fValueOf2 = null;
                }
                c28012x.f57143E = fValueOf2;
            }
            c27914b = C27914b.f57020a;
            context = this.f57023a;
            systemService = context.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                connectivityManager = (ConnectivityManager) systemService;
            } else {
                connectivityManager = null;
            }
            if (connectivityManager == null) {
                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b), "ConnectivityManager is null and cannot check network status", null, 4, null);
            }
            if (connectivityManager == null) {
                connectivityChecker$Status = ConnectivityChecker$Status.UNKNOWN;
            } else if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b), "NetworkInfo is null, there's no active network.", null, 4, null);
                    connectivityChecker$Status = ConnectivityChecker$Status.NOT_CONNECTED;
                } else if (activeNetworkInfo.isConnected()) {
                    connectivityChecker$Status = ConnectivityChecker$Status.CONNECTED;
                } else {
                    connectivityChecker$Status = ConnectivityChecker$Status.NOT_CONNECTED;
                }
            } else {
                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b), "No permission (ACCESS_NETWORK_STATE) to check network status.", null, 4, null);
                connectivityChecker$Status = ConnectivityChecker$Status.NO_PERMISSION;
            }
            i11 = AbstractC27916d.f57022a[connectivityChecker$Status.ordinal()];
            if (i11 != 1) {
                bool = Boolean.FALSE;
            } else if (i11 != 2) {
                bool = null;
            } else {
                bool = Boolean.TRUE;
            }
            c28012x.f57153j = bool;
            if (memoryInfo != null) {
                c28012x.f57156m = Long.valueOf(Runtime.getRuntime().totalMemory());
                c28012x.f57157n = Long.valueOf(memoryInfo.availMem);
                c28012x.f57159p = Boolean.valueOf(memoryInfo.lowMemory);
            }
            externalFilesDir = this.f57023a.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                StatFs statFs3 = new StatFs(externalFilesDir.getPath());
                lValueOf3 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
                c28012x.f57160q = lValueOf3;
                lValueOf4 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
                c28012x.f57161r = lValueOf4;
            }
            externalStorageState = Environment.getExternalStorageState();
            if (Intrinsics.areEqual("mounted", externalStorageState)) {
                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "External storage is not mounted or emulated.", null, 4, null);
            } else {
                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "External storage is not mounted or emulated.", null, 4, null);
            }
            statFs = null;
            if (statFs != null) {
                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                c28012x.f57162s = lValueOf;
                lValueOf2 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                c28012x.f57163t = lValueOf2;
            }
            if (c28012x.f57142D == null) {
                c27914b2 = C27914b.f57020a;
                context2 = this.f57023a;
                systemService2 = context2.getSystemService("connectivity");
                if (systemService2 instanceof ConnectivityManager) {
                    connectivityManager2 = (ConnectivityManager) systemService2;
                } else {
                    connectivityManager2 = null;
                }
                if (connectivityManager2 == null) {
                    Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "ConnectivityManager is null and cannot check network status", null, 4, null);
                }
                if (connectivityManager2 != null) {
                    if (context2.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                        activeNetwork = connectivityManager2.getActiveNetwork();
                        if (activeNetwork == null) {
                            Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "Network is null and cannot check network status", null, 4, null);
                        } else {
                            networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities == null) {
                                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "NetworkCapabilities is null and cannot check network type", null, 4, null);
                            } else {
                                zHasTransport = networkCapabilities.hasTransport(3);
                                zHasTransport2 = networkCapabilities.hasTransport(1);
                                zHasTransport3 = networkCapabilities.hasTransport(0);
                                if (zHasTransport) {
                                    str2 = "ethernet";
                                } else if (zHasTransport2) {
                                    str2 = "wifi";
                                } else if (zHasTransport3) {
                                    str2 = "cellular";
                                }
                            }
                        }
                    } else {
                        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(c27914b2), "No permission (ACCESS_NETWORK_STATE) to check network status.", null, 4, null);
                    }
                    str2 = null;
                } else {
                    str2 = null;
                }
                c28012x.f57142D = str2;
            }
            if (displayMetrics != null) {
                c28012x.f57164u = Integer.valueOf(displayMetrics.widthPixels);
                c28012x.f57165v = Integer.valueOf(displayMetrics.heightPixels);
                c28012x.f57166w = Float.valueOf(displayMetrics.density);
                c28012x.f57167x = Integer.valueOf(displayMetrics.densityDpi);
            }
            c28012x.f57168y = time;
            locales = this.f57023a.getResources().getConfiguration().getLocales();
            if (locales.isEmpty()) {
                timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
            } else {
                timeZone = Calendar.getInstance().getTimeZone();
            }
            c28012x.f57169z = timeZone.getID();
            if (c28012x.f57139A == null) {
                strM68999a = C27918f.f57030a.m68999a(this.f57023a);
                c28012x.f57139A = strM68999a;
            }
            locale = Locale.getDefault();
            if (c28012x.f57140B == null) {
                c28012x.f57140B = locale.getLanguage();
            }
            if (c28012x.f57141C == null) {
                c28012x.f57141C = locale.toString();
            }
            c27968m.put("device", c28012x);
        }
        m68997a(c27973n0);
        try {
            Object obj4 = ((Map) this.f57027e.get()).get("sideLoaded");
            Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
            if (map3 != null) {
                for (Map.Entry entry : map3.entrySet()) {
                    String str10 = (String) entry.getKey();
                    String str11 = (String) entry.getValue();
                    Map map4 = c27973n0.f57002c;
                    if (map4 != null) {
                        map4.put(str10, str11);
                    }
                }
            }
        } catch (Throwable th16) {
            C33272c c33272c15 = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Error getting side loaded info.", th16);
        }
        return c27973n0;
    }

    public C27917e(Context context, C27913a c27913a, C27919g c27919g, String str) {
        this.f57023a = context;
        this.f57024b = c27913a;
        this.f57025c = c27919g;
        this.f57026d = str;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f57027e = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: com.sumsub.sentry.android.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C27917e.m68996a(this.f57044b);
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
        this.f57028f = Build.CPU_ABI;
        this.f57029g = Build.CPU_ABI2;
    }

    /* JADX INFO: renamed from: a */
    public static final Map m68996a(C27917e c27917e) {
        PackageInfo packageInfo;
        c27917e.getClass();
        HashMap map = new HashMap();
        C27921i c27921i = (C27921i) c27917e.f57025c.f57039f.getValue();
        map.put("rooted", Boolean.valueOf(c27921i.f57040a || c27921i.f57041b || c27921i.f57042c || c27921i.f57043d));
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        HashMap map2 = null;
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    CloseableKt.closeFinally(bufferedReader, null);
                    property = line;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (IOException e11) {
                C33272c c33272c = C33272c.f67812a;
                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(c27917e), "Exception while attempting to read kernel information", e11);
            }
        }
        if (property != null) {
            map.put("kernelVersion", property);
        }
        map.put(C34052z4.f72600l, Boolean.valueOf(c27917e.f57024b.m68994a()));
        try {
            C27915c c27915c = C27915c.f57021a;
            Context context = c27917e.f57023a;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable th4) {
                C33272c c33272c2 = C33272c.f67812a;
                C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(c27915c), "Error getting package info.", th4);
                packageInfo = null;
            }
            PackageManager packageManager = c27917e.f57023a.getPackageManager();
            if (packageInfo != null && packageManager != null) {
                String installerPackageName = packageManager.getInstallerPackageName(packageInfo.packageName);
                HashMap map3 = new HashMap();
                if (installerPackageName != null) {
                    map3.put("isSideLoaded", CredentialEntry.FALSE_STRING);
                    map3.put("installerStore", installerPackageName);
                } else {
                    map3.put("isSideLoaded", CredentialEntry.TRUE_STRING);
                }
                map2 = map3;
            }
        } catch (IllegalArgumentException unused) {
        }
        if (map2 != null) {
            map.put("sideLoaded", map2);
        }
        return map;
    }
}
