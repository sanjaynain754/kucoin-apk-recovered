package com.appsflyer.internal;

import android.graphics.PointF;
import android.os.Build;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.tencent.bugly.proguard.C33556b3;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;
import p852kotlin.text.MatchGroup;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1ySDK implements AFd1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char copy = 7956;
    private static int copydefault = 0;
    private static char equals = 48673;
    private static char hashCode = 787;
    private static int registerClient = 1;
    private static char toString = 10357;

    @NotNull
    private final Lazy AFAdRevenueData;

    @NotNull
    private final Lazy areAllFieldsValid;

    @NotNull
    private final String component1;

    @Nullable
    private AFd1uSDK.AFa1uSDK component2;

    @NotNull
    private final Lazy component3;

    @NotNull
    private final Lazy component4;

    @NotNull
    private final Lazy getCurrencyIso4217Code;

    @NotNull
    private final Lazy getMediationNetwork;

    @NotNull
    private final Lazy getMonetizationNetwork;

    @NotNull
    private AFd1zSDK getRevenue;

    public static final /* synthetic */ AFd1zSDK AFAdRevenueData(AFd1ySDK aFd1ySDK) {
        int i11 = (registerClient + 17) % 128;
        copydefault = i11;
        AFd1zSDK aFd1zSDK = aFd1ySDK.getRevenue;
        registerClient = (i11 + 43) % 128;
        return aFd1zSDK;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025 A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0015, B:19:0x002f, B:21:0x003f, B:22:0x0050, B:18:0x0025, B:13:0x001e, B:16:0x0021, B:23:0x0054, B:25:0x0058, B:27:0x0064, B:30:0x0069, B:34:0x006f, B:9:0x0019, B:32:0x006d), top: B:43:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002f A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0015, B:19:0x002f, B:21:0x003f, B:22:0x0050, B:18:0x0025, B:13:0x001e, B:16:0x0021, B:23:0x0054, B:25:0x0058, B:27:0x0064, B:30:0x0069, B:34:0x006f, B:9:0x0019, B:32:0x006d), top: B:43:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0015, B:19:0x002f, B:21:0x003f, B:22:0x0050, B:18:0x0025, B:13:0x001e, B:16:0x0021, B:23:0x0054, B:25:0x0058, B:27:0x0064, B:30:0x0069, B:34:0x006f, B:9:0x0019, B:32:0x006d), top: B:43:0x0001, inners: #0, #1 }] */
    private final synchronized void copydefault() {
        try {
            AFh1aSDK aFh1aSDKComponent1 = component1();
            boolean currencyIso4217Code = false;
            if (aFh1aSDKComponent1 != null) {
                int i11 = copydefault + 37;
                registerClient = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 99 / 0;
                    if (aFh1aSDKComponent1.AFAdRevenueData == -1) {
                        component3().getRevenue("af_send_exc_to_server_window");
                    } else if (component3().AFAdRevenueData("af_send_exc_to_server_window", -1L) == -1) {
                        getMonetizationNetwork(new Object[]{this, aFh1aSDKComponent1}, 271507269, -271507267, System.identityHashCode(this));
                    }
                } else if (aFh1aSDKComponent1.AFAdRevenueData == -1) {
                    component3().getRevenue("af_send_exc_to_server_window");
                } else if (component3().AFAdRevenueData("af_send_exc_to_server_window", -1L) == -1) {
                    getMonetizationNetwork(new Object[]{this, aFh1aSDKComponent1}, 271507269, -271507267, System.identityHashCode(this));
                }
                currencyIso4217Code = getCurrencyIso4217Code(aFh1aSDKComponent1);
            }
            AFd1uSDK.AFa1uSDK aFa1uSDK = this.component2;
            if (aFa1uSDK != null) {
                int i13 = registerClient + 25;
                copydefault = i13 % 128;
                if (i13 % 2 == 0) {
                    aFa1uSDK.onConfigurationChanged(currencyIso4217Code);
                } else {
                    aFa1uSDK.onConfigurationChanged(currencyIso4217Code);
                    throw null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019a A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x001c, B:15:0x0027, B:17:0x0035, B:20:0x0053, B:22:0x005a, B:24:0x0061, B:26:0x0068, B:28:0x006c, B:30:0x007e, B:32:0x0088, B:34:0x0093, B:36:0x0099, B:38:0x009f, B:44:0x00b3, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:60:0x00f2, B:62:0x00f5, B:64:0x00fb, B:66:0x0101, B:68:0x010c, B:70:0x0110, B:72:0x0119, B:82:0x012a, B:84:0x0130, B:86:0x0134, B:93:0x0145, B:106:0x01d9, B:108:0x01dd, B:110:0x01e3, B:111:0x01e7, B:95:0x0156, B:97:0x0174, B:99:0x017e, B:100:0x019a, B:103:0x01b7, B:104:0x01b8, B:90:0x013d, B:73:0x011e, B:76:0x0123, B:77:0x0124, B:80:0x0128, B:39:0x00ac, B:42:0x00b1, B:105:0x01c9, B:13:0x0024, B:40:0x00af, B:74:0x0121, B:11:0x0022, B:101:0x01b5, B:78:0x0126), top: B:128:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01b8 A[Catch: all -> 0x001f, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x001c, B:15:0x0027, B:17:0x0035, B:20:0x0053, B:22:0x005a, B:24:0x0061, B:26:0x0068, B:28:0x006c, B:30:0x007e, B:32:0x0088, B:34:0x0093, B:36:0x0099, B:38:0x009f, B:44:0x00b3, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:60:0x00f2, B:62:0x00f5, B:64:0x00fb, B:66:0x0101, B:68:0x010c, B:70:0x0110, B:72:0x0119, B:82:0x012a, B:84:0x0130, B:86:0x0134, B:93:0x0145, B:106:0x01d9, B:108:0x01dd, B:110:0x01e3, B:111:0x01e7, B:95:0x0156, B:97:0x0174, B:99:0x017e, B:100:0x019a, B:103:0x01b7, B:104:0x01b8, B:90:0x013d, B:73:0x011e, B:76:0x0123, B:77:0x0124, B:80:0x0128, B:39:0x00ac, B:42:0x00b1, B:105:0x01c9, B:13:0x0024, B:40:0x00af, B:74:0x0121, B:11:0x0022, B:101:0x01b5, B:78:0x0126), top: B:128:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x013c  */
    /* JADX WARN: Code duplicated, block: B:90:0x013d A[Catch: all -> 0x001f, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x001c, B:15:0x0027, B:17:0x0035, B:20:0x0053, B:22:0x005a, B:24:0x0061, B:26:0x0068, B:28:0x006c, B:30:0x007e, B:32:0x0088, B:34:0x0093, B:36:0x0099, B:38:0x009f, B:44:0x00b3, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:60:0x00f2, B:62:0x00f5, B:64:0x00fb, B:66:0x0101, B:68:0x010c, B:70:0x0110, B:72:0x0119, B:82:0x012a, B:84:0x0130, B:86:0x0134, B:93:0x0145, B:106:0x01d9, B:108:0x01dd, B:110:0x01e3, B:111:0x01e7, B:95:0x0156, B:97:0x0174, B:99:0x017e, B:100:0x019a, B:103:0x01b7, B:104:0x01b8, B:90:0x013d, B:73:0x011e, B:76:0x0123, B:77:0x0124, B:80:0x0128, B:39:0x00ac, B:42:0x00b1, B:105:0x01c9, B:13:0x0024, B:40:0x00af, B:74:0x0121, B:11:0x0022, B:101:0x01b5, B:78:0x0126), top: B:128:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0145 A[Catch: all -> 0x001f, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x001c, B:15:0x0027, B:17:0x0035, B:20:0x0053, B:22:0x005a, B:24:0x0061, B:26:0x0068, B:28:0x006c, B:30:0x007e, B:32:0x0088, B:34:0x0093, B:36:0x0099, B:38:0x009f, B:44:0x00b3, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:60:0x00f2, B:62:0x00f5, B:64:0x00fb, B:66:0x0101, B:68:0x010c, B:70:0x0110, B:72:0x0119, B:82:0x012a, B:84:0x0130, B:86:0x0134, B:93:0x0145, B:106:0x01d9, B:108:0x01dd, B:110:0x01e3, B:111:0x01e7, B:95:0x0156, B:97:0x0174, B:99:0x017e, B:100:0x019a, B:103:0x01b7, B:104:0x01b8, B:90:0x013d, B:73:0x011e, B:76:0x0123, B:77:0x0124, B:80:0x0128, B:39:0x00ac, B:42:0x00b1, B:105:0x01c9, B:13:0x0024, B:40:0x00af, B:74:0x0121, B:11:0x0022, B:101:0x01b5, B:78:0x0126), top: B:128:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0156 A[Catch: all -> 0x001f, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x001c, B:15:0x0027, B:17:0x0035, B:20:0x0053, B:22:0x005a, B:24:0x0061, B:26:0x0068, B:28:0x006c, B:30:0x007e, B:32:0x0088, B:34:0x0093, B:36:0x0099, B:38:0x009f, B:44:0x00b3, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:60:0x00f2, B:62:0x00f5, B:64:0x00fb, B:66:0x0101, B:68:0x010c, B:70:0x0110, B:72:0x0119, B:82:0x012a, B:84:0x0130, B:86:0x0134, B:93:0x0145, B:106:0x01d9, B:108:0x01dd, B:110:0x01e3, B:111:0x01e7, B:95:0x0156, B:97:0x0174, B:99:0x017e, B:100:0x019a, B:103:0x01b7, B:104:0x01b8, B:90:0x013d, B:73:0x011e, B:76:0x0123, B:77:0x0124, B:80:0x0128, B:39:0x00ac, B:42:0x00b1, B:105:0x01c9, B:13:0x0024, B:40:0x00af, B:74:0x0121, B:11:0x0022, B:101:0x01b5, B:78:0x0126), top: B:128:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0174 A[Catch: all -> 0x001f, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x001c, B:15:0x0027, B:17:0x0035, B:20:0x0053, B:22:0x005a, B:24:0x0061, B:26:0x0068, B:28:0x006c, B:30:0x007e, B:32:0x0088, B:34:0x0093, B:36:0x0099, B:38:0x009f, B:44:0x00b3, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:60:0x00f2, B:62:0x00f5, B:64:0x00fb, B:66:0x0101, B:68:0x010c, B:70:0x0110, B:72:0x0119, B:82:0x012a, B:84:0x0130, B:86:0x0134, B:93:0x0145, B:106:0x01d9, B:108:0x01dd, B:110:0x01e3, B:111:0x01e7, B:95:0x0156, B:97:0x0174, B:99:0x017e, B:100:0x019a, B:103:0x01b7, B:104:0x01b8, B:90:0x013d, B:73:0x011e, B:76:0x0123, B:77:0x0124, B:80:0x0128, B:39:0x00ac, B:42:0x00b1, B:105:0x01c9, B:13:0x0024, B:40:0x00af, B:74:0x0121, B:11:0x0022, B:101:0x01b5, B:78:0x0126), top: B:128:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x017e A[Catch: all -> 0x001f, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x001c, B:15:0x0027, B:17:0x0035, B:20:0x0053, B:22:0x005a, B:24:0x0061, B:26:0x0068, B:28:0x006c, B:30:0x007e, B:32:0x0088, B:34:0x0093, B:36:0x0099, B:38:0x009f, B:44:0x00b3, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:52:0x00d3, B:54:0x00e0, B:56:0x00e6, B:58:0x00ec, B:60:0x00f2, B:62:0x00f5, B:64:0x00fb, B:66:0x0101, B:68:0x010c, B:70:0x0110, B:72:0x0119, B:82:0x012a, B:84:0x0130, B:86:0x0134, B:93:0x0145, B:106:0x01d9, B:108:0x01dd, B:110:0x01e3, B:111:0x01e7, B:95:0x0156, B:97:0x0174, B:99:0x017e, B:100:0x019a, B:103:0x01b7, B:104:0x01b8, B:90:0x013d, B:73:0x011e, B:76:0x0123, B:77:0x0124, B:80:0x0128, B:39:0x00ac, B:42:0x00b1, B:105:0x01c9, B:13:0x0024, B:40:0x00af, B:74:0x0121, B:11:0x0022, B:101:0x01b5, B:78:0x0126), top: B:128:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0141, code lost:
    
        if (r0.intValue() == (-1)) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void equals() {
        long j11;
        Integer numValueOf;
        Pair<Integer, Integer> currencyIso4217Code;
        AFh1aSDK aFh1aSDKComponent1;
        Pair<Integer, Integer> revenue;
        int i11;
        String str;
        String str2;
        int i12;
        int iIntValue;
        MatchGroup matchGroup;
        int iIntValue2;
        MatchGroup matchGroup2;
        int iIntValue3;
        String value;
        Integer intOrNull;
        String value2;
        Integer intOrNull2;
        Integer intOrNull3;
        registerClient = (copydefault + 3) % 128;
        AFh1aSDK aFh1aSDKComponent2 = component1();
        if (aFh1aSDKComponent2 != null) {
            int i13 = copydefault + 35;
            registerClient = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            j11 = aFh1aSDKComponent2.getMonetizationNetwork;
            throw th;
        }
        j11 = -1;
        if (j11 < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
            component3().getRevenue("af_send_exc_to_server_window");
            getRevenue().getMediationNetwork();
            return;
        }
        AFh1aSDK aFh1aSDKComponent3 = component1();
        if (aFh1aSDKComponent3 == null || !getRevenue(aFh1aSDKComponent3)) {
            component3().getRevenue("af_send_exc_to_server_window");
            getRevenue().getMediationNetwork();
        } else {
            AFh1aSDK aFh1aSDKComponent4 = component1();
            if (aFh1aSDKComponent4 == null || (str2 = aFh1aSDKComponent4.getMediationNetwork) == null) {
                numValueOf = null;
            } else {
                Intrinsics.checkNotNullParameter(str2, "");
                MatchResult matchResultMatchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str2);
                if (matchResultMatchEntire != null) {
                    MatchGroup matchGroup3 = matchResultMatchEntire.getGroups().get(1);
                    if (matchGroup3 != null) {
                        int i14 = registerClient + 11;
                        copydefault = i14 % 128;
                        if (i14 % 2 != 0) {
                            matchGroup3.getValue();
                            throw null;
                        }
                        String value3 = matchGroup3.getValue();
                        if (value3 != null && (intOrNull3 = StringsKt.toIntOrNull(value3)) != null) {
                            copydefault = (registerClient + 95) % 128;
                            iIntValue = intOrNull3.intValue();
                        }
                        int i15 = iIntValue * 1000000;
                        matchGroup = matchResultMatchEntire.getGroups().get(2);
                        if (matchGroup != null || (value2 = matchGroup.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value2)) == null) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = intOrNull2.intValue();
                        }
                        int i16 = i15 + (iIntValue2 * 1000);
                        matchGroup2 = matchResultMatchEntire.getGroups().get(3);
                        if (matchGroup2 != null || (value = matchGroup2.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = intOrNull.intValue();
                        }
                        i12 = i16 + iIntValue3;
                        throw th;
                    }
                    iIntValue = 0;
                    int i17 = iIntValue * 1000000;
                    matchGroup = matchResultMatchEntire.getGroups().get(2);
                    if (matchGroup != null) {
                        iIntValue2 = 0;
                    } else {
                        iIntValue2 = 0;
                    }
                    int i18 = i17 + (iIntValue2 * 1000);
                    matchGroup2 = matchResultMatchEntire.getGroups().get(3);
                    if (matchGroup2 != null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = 0;
                    }
                    i12 = i18 + iIntValue3;
                } else {
                    i12 = -1;
                }
                numValueOf = Integer.valueOf(i12);
            }
            AFh1aSDK aFh1aSDKComponent5 = component1();
            if (aFh1aSDKComponent5 != null) {
                int i19 = copydefault + 119;
                int i21 = i19 % 128;
                registerClient = i21;
                if (i19 % 2 == 0) {
                    String str3 = aFh1aSDKComponent5.getMediationNetwork;
                    throw null;
                }
                String str4 = aFh1aSDKComponent5.getMediationNetwork;
                if (str4 != null) {
                    int i22 = i21 + 51;
                    copydefault = i22 % 128;
                    if (i22 % 2 != 0) {
                        AFd1rSDK.getCurrencyIso4217Code(str4);
                        throw null;
                    }
                    currencyIso4217Code = AFd1rSDK.getCurrencyIso4217Code(str4);
                }
                aFh1aSDKComponent1 = component1();
                if (aFh1aSDKComponent1 != null || (str = aFh1aSDKComponent1.getMediationNetwork) == null) {
                    revenue = null;
                } else {
                    revenue = AFd1rSDK.getRevenue(str);
                }
                if (numValueOf != null) {
                }
                if (currencyIso4217Code == null) {
                    getRevenue().getRevenue(this.component1);
                } else if (currencyIso4217Code != null) {
                    getRevenue().getMonetizationNetwork(currencyIso4217Code.getFirst().intValue(), currencyIso4217Code.getSecond().intValue());
                } else if (revenue != null) {
                    i11 = registerClient + 1;
                    copydefault = i11 % 128;
                    if (i11 % 2 == 0) {
                        getRevenue().getMonetizationNetwork(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                        throw null;
                    }
                    getRevenue().getMonetizationNetwork(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                } else {
                    component3().getRevenue("af_send_exc_to_server_window");
                    getRevenue().getMediationNetwork();
                }
                throw th;
            }
            currencyIso4217Code = null;
            aFh1aSDKComponent1 = component1();
            if (aFh1aSDKComponent1 != null) {
                revenue = null;
            } else {
                revenue = null;
            }
            if (numValueOf != null) {
            }
            if (currencyIso4217Code == null) {
                getRevenue().getRevenue(this.component1);
            } else if (currencyIso4217Code != null) {
                getRevenue().getMonetizationNetwork(currencyIso4217Code.getFirst().intValue(), currencyIso4217Code.getSecond().intValue());
            } else if (revenue != null) {
                i11 = registerClient + 1;
                copydefault = i11 % 128;
                if (i11 % 2 == 0) {
                    getRevenue().getMonetizationNetwork(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                    throw null;
                }
                getRevenue().getMonetizationNetwork(revenue.getFirst().intValue(), revenue.getSecond().intValue());
            } else {
                component3().getRevenue("af_send_exc_to_server_window");
                getRevenue().getMediationNetwork();
            }
        }
        AFd1uSDK.AFa1uSDK aFa1uSDK = this.component2;
        if (aFa1uSDK != null) {
            AFh1aSDK aFh1aSDKComponent6 = component1();
            aFa1uSDK.onConfigurationChanged(aFh1aSDKComponent6 != null ? getCurrencyIso4217Code(aFh1aSDKComponent6) : false);
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        final AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        int i11 = registerClient + 41;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            aFd1ySDK.component2().execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getMonetizationNetwork(this.f6357b);
                }
            });
            throw null;
        }
        aFd1ySDK.component2().execute(new Runnable() { // from class: com.appsflyer.internal.s
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.getMonetizationNetwork(this.f6357b);
            }
        });
        registerClient = (copydefault + 25) % 128;
        return null;
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~i13;
        int i17 = (i11 * (-519)) + (i12 * 521) + (((~(i12 | i13)) | (~(i14 | i15 | i16))) * C33556b3.f69027c);
        int i18 = ~(i15 | i16);
        int i19 = ~(i13 | i11);
        int i21 = i17 + ((i18 | i19) * (-1040)) + (((~(i11 | i15)) | (~(i14 | i16)) | i19) * C33556b3.f69027c);
        if (i21 == 1) {
            return getRevenue(objArr);
        }
        if (i21 == 2) {
            return getMediationNetwork(objArr);
        }
        if (i21 == 3) {
            AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
            copydefault = (registerClient + 65) % 128;
            Intrinsics.checkNotNullParameter(aFd1ySDK, "");
            aFd1ySDK.copydefault();
            registerClient = (copydefault + 35) % 128;
            return null;
        }
        if (i21 != 4) {
            return getCurrencyIso4217Code(objArr);
        }
        AFd1ySDK aFd1ySDK2 = (AFd1ySDK) objArr[0];
        registerClient = (copydefault + 73) % 128;
        AFc1kSDK aFc1kSDK = (AFc1kSDK) aFd1ySDK2.getMonetizationNetwork.getValue();
        registerClient = (copydefault + 61) % 128;
        return aFc1kSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void getMediationNetwork(@Nullable AFd1uSDK.AFa1uSDK aFa1uSDK) {
        copydefault = (registerClient + 105) % 128;
        this.component2 = aFa1uSDK;
        component2().execute(new Runnable() { // from class: com.appsflyer.internal.t
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.getRevenue(this.f6358b);
            }
        });
        copydefault = (registerClient + 55) % 128;
    }

    @NotNull
    public final AFc1cSDK getRevenue() {
        copydefault = (registerClient + 61) % 128;
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component4.getValue();
        int i11 = copydefault + 19;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            return aFc1cSDK;
        }
        throw null;
    }

    public AFd1ySDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getRevenue = aFd1zSDK;
        this.AFAdRevenueData = LazyKt.lazy(new Function0<AFf1iSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.5
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFf1iSDK invoke() {
                AFf1iSDK aFf1iSDKAreAllFieldsValid = AFd1ySDK.AFAdRevenueData(AFd1ySDK.this).areAllFieldsValid();
                Intrinsics.checkNotNullExpressionValue(aFf1iSDKAreAllFieldsValid, "");
                return aFf1iSDKAreAllFieldsValid;
            }
        });
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<AFc1kSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.2
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1kSDK invoke() {
                AFc1kSDK currencyIso4217Code = AFd1ySDK.AFAdRevenueData(AFd1ySDK.this).getCurrencyIso4217Code();
                Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
                return currencyIso4217Code;
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<AFc1pSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.4
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFc1pSDK invoke() {
                AFc1pSDK aFc1pSDKComponent4 = AFd1ySDK.AFAdRevenueData(AFd1ySDK.this).component4();
                Intrinsics.checkNotNullExpressionValue(aFc1pSDKComponent4, "");
                return aFc1pSDKComponent4;
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFf1fSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.8
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFf1fSDK invoke() {
                AFf1fSDK aFf1fSDKAFKeystoreWrapper = AFd1ySDK.AFAdRevenueData(AFd1ySDK.this).AFKeystoreWrapper();
                Intrinsics.checkNotNullExpressionValue(aFf1fSDKAFKeystoreWrapper, "");
                return aFf1fSDKAFKeystoreWrapper;
            }
        });
        this.component3 = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1ySDK.3
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = AFd1ySDK.AFAdRevenueData(AFd1ySDK.this).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                return monetizationNetwork;
            }
        });
        this.component1 = "6.17.4";
        this.component4 = LazyKt.lazy(new Function0<AFd1xSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.1
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1xSDK invoke() {
                AFc1fSDK aFc1fSDKAFInAppEventParameterName = AFd1ySDK.AFAdRevenueData(AFd1ySDK.this).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(aFc1fSDKAFInAppEventParameterName, "");
                return new AFd1xSDK(aFc1fSDKAFInAppEventParameterName);
            }
        });
        this.areAllFieldsValid = LazyKt.lazy(new Function0<AFd1wSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.7
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1wSDK invoke() {
                return new AFd1wSDK(AFd1ySDK.this.getRevenue());
            }
        });
    }

    private final AFf1iSDK AFAdRevenueData() {
        copydefault = (registerClient + 9) % 128;
        AFf1iSDK aFf1iSDK = (AFf1iSDK) this.AFAdRevenueData.getValue();
        registerClient = (copydefault + 77) % 128;
        return aFf1iSDK;
    }

    /* JADX INFO: renamed from: a */
    private static void m5960a(String str, int i11, Object[] objArr) {
        char[] charArray;
        if (str != null) {
            $11 = ($10 + 23) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        AFk1iSDK aFk1iSDK = new AFk1iSDK();
        char[] cArr2 = new char[cArr.length];
        aFk1iSDK.getMonetizationNetwork = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i12 = aFk1iSDK.getMonetizationNetwork;
            if (i12 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            int i13 = ($10 + 59) % 128;
            $11 = i13;
            cArr3[0] = cArr[i12];
            cArr3[1] = cArr[i12 + 1];
            $10 = (i13 + 117) % 128;
            int i14 = 58224;
            for (int i15 = 0; i15 < 16; i15++) {
                char c11 = cArr3[1];
                char c12 = cArr3[0];
                char c13 = (char) (c11 - (((c12 + i14) ^ ((c12 << 4) + ((char) (((long) equals) ^ (-1199070254561146252L))))) ^ ((c12 >>> 5) + ((char) (((long) toString) ^ (-1199070254561146252L))))));
                cArr3[1] = c13;
                cArr3[0] = (char) (c12 - (((c13 >>> 5) + ((char) (((long) copy) ^ (-1199070254561146252L)))) ^ ((c13 + i14) ^ ((c13 << 4) + ((char) (((long) hashCode) ^ (-1199070254561146252L)))))));
                i14 -= 40503;
            }
            int i16 = aFk1iSDK.getMonetizationNetwork;
            cArr2[i16] = cArr3[0];
            cArr2[i16 + 1] = cArr3[1];
            aFk1iSDK.getMonetizationNetwork = i16 + 2;
        }
    }

    private final AFf1fSDK areAllFieldsValid() {
        registerClient = (copydefault + 21) % 128;
        AFf1fSDK aFf1fSDK = (AFf1fSDK) this.getCurrencyIso4217Code.getValue();
        int i11 = registerClient + 37;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 21 / 0;
        }
        return aFf1fSDK;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r0
      0x0026: PHI (r0v6 com.appsflyer.internal.AFi1ySDK) = (r0v5 com.appsflyer.internal.AFi1ySDK), (r0v11 com.appsflyer.internal.AFi1ySDK) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    private final AFh1aSDK component1() {
        AFi1ySDK aFi1ySDK;
        AFi1zSDK aFi1zSDK;
        int i11;
        int i12 = copydefault + 3;
        registerClient = i12 % 128;
        if (i12 % 2 == 0) {
            aFi1ySDK = AFAdRevenueData().getMonetizationNetwork.getMediationNetwork;
            int i13 = 58 / 0;
            if (aFi1ySDK != null) {
                aFi1zSDK = aFi1ySDK.getRevenue;
                if (aFi1zSDK != null) {
                    i11 = copydefault + 119;
                    registerClient = i11 % 128;
                    if (i11 % 2 != 0) {
                        return aFi1zSDK.getMediationNetwork;
                    }
                    throw null;
                }
            }
        } else {
            aFi1ySDK = AFAdRevenueData().getMonetizationNetwork.getMediationNetwork;
            if (aFi1ySDK != null) {
                aFi1zSDK = aFi1ySDK.getRevenue;
                if (aFi1zSDK != null) {
                    i11 = copydefault + 119;
                    registerClient = i11 % 128;
                    if (i11 % 2 != 0) {
                        return aFi1zSDK.getMediationNetwork;
                    }
                    throw null;
                }
            }
        }
        return null;
    }

    private final ExecutorService component2() {
        registerClient = (copydefault + 3) % 128;
        ExecutorService executorService = (ExecutorService) this.component3.getValue();
        registerClient = (copydefault + 9) % 128;
        return executorService;
    }

    private final AFc1pSDK component3() {
        int i11 = copydefault + 41;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            return (AFc1pSDK) this.getMediationNetwork.getValue();
        }
        throw null;
    }

    private final void copy() {
        copydefault = (registerClient + 33) % 128;
        AFh1aSDK aFh1aSDKComponent1 = component1();
        if (aFh1aSDKComponent1 != null) {
            if (!getMonetizationNetwork(aFh1aSDKComponent1)) {
                AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                copydefault = (registerClient + 11) % 128;
                return;
            }
            String monetizationNetwork = areAllFieldsValid().getMonetizationNetwork();
            if (monetizationNetwork != null) {
                String string = new JSONObject(getRevenue(AFAdRevenueData(aFh1aSDKComponent1), getRevenue().getRevenue())).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                getCurrencyIso4217Code(string, monetizationNetwork);
            }
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        registerClient = (copydefault + 75) % 128;
        AFd1vSDK aFd1vSDK = (AFd1vSDK) aFd1ySDK.areAllFieldsValid.getValue();
        int i11 = copydefault + 85;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 16 / 0;
        }
        return aFd1vSDK;
    }

    private final Map<String, String> AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        m5960a("炜桪ꪴ鐅⠖ᰫ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.m90091to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.m90091to("model", Build.MODEL), TuplesKt.m90091to("app_id", ((AFc1kSDK) getMonetizationNetwork(new Object[]{this}, -815937263, 815937267, System.identityHashCode(this))).getMediationNetwork.getMonetizationNetwork.getPackageName()), TuplesKt.m90091to("p_ex", new AFa1tSDK().getMediationNetwork()), TuplesKt.m90091to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.m90091to("sdk", this.component1), TuplesKt.m90091to("uid", AFb1mSDK.getRevenue(((AFc1kSDK) getMonetizationNetwork(new Object[]{this}, -815937263, 815937267, System.identityHashCode(this))).getRevenue)), TuplesKt.m90091to("exc_config", aFh1aSDK.getRevenue()));
        int i11 = copydefault + 51;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            return mapMapOf;
        }
        throw null;
    }

    @NotNull
    private AFd1vSDK component4() {
        return (AFd1vSDK) getMonetizationNetwork(new Object[]{this}, -1826466399, 1826466400, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1ySDK aFd1ySDK, Throwable th2, String str) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDKComponent1 = aFd1ySDK.component1();
        if (aFh1aSDKComponent1 != null) {
            copydefault = (registerClient + 81) % 128;
            if (aFd1ySDK.getCurrencyIso4217Code(aFh1aSDKComponent1)) {
                registerClient = (copydefault + 13) % 128;
                aFd1ySDK.getRevenue().getMonetizationNetwork(th2, str);
            }
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        AFh1aSDK aFh1aSDK = (AFh1aSDK) objArr[1];
        registerClient = (copydefault + 75) % 128;
        int i11 = aFh1aSDK.getCurrencyIso4217Code;
        long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1aSDK.AFAdRevenueData);
        AFc1pSDK aFc1pSDKComponent3 = aFd1ySDK.component3();
        aFc1pSDKComponent3.getCurrencyIso4217Code("af_send_exc_to_server_window", jCurrentTimeMillis);
        aFc1pSDKComponent3.getRevenue("af_send_exc_min", i11);
        int i12 = registerClient + 51;
        copydefault = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void getCurrencyIso4217Code() {
        int i11 = copydefault + 7;
        registerClient = i11 % 128;
        if (i11 % 2 != 0) {
            component2().execute(new Runnable() { // from class: com.appsflyer.internal.v
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getCurrencyIso4217Code(this.f6362b);
                }
            });
        } else {
            component2().execute(new Runnable() { // from class: com.appsflyer.internal.v
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getCurrencyIso4217Code(this.f6362b);
                }
            });
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void getRevenue(@NotNull final Throwable th2, @NotNull final String str) {
        int i11 = registerClient + 121;
        copydefault = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            component2().execute(new Runnable() { // from class: com.appsflyer.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getRevenue(this.f6359b, th2, str);
                }
            });
        } else {
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            component2().execute(new Runnable() { // from class: com.appsflyer.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getRevenue(this.f6359b, th2, str);
                }
            });
            throw null;
        }
    }

    @WorkerThread
    private final void getCurrencyIso4217Code(String str, String str2) {
        copydefault = (registerClient + 15) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        ((AFd1vSDK) getMonetizationNetwork(new Object[]{this}, -1826466399, 1826466400, System.identityHashCode(this))).getRevenue(bytes, MapsKt.mapOf(TuplesKt.m90091to("Authorization", AFj1dSDK.getRevenue(str, str2))), 2000);
        int i11 = copydefault + 103;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1ySDK aFd1ySDK) {
        copydefault = (registerClient + 23) % 128;
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        aFd1ySDK.copy();
        registerClient = (copydefault + 87) % 128;
    }

    private final void getMediationNetwork(AFh1aSDK aFh1aSDK) {
        getMonetizationNetwork(new Object[]{this, aFh1aSDK}, 271507269, -271507267, System.identityHashCode(this));
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAFAdRevenueData = component3().AFAdRevenueData("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            copydefault = (registerClient + 21) % 128;
            return false;
        }
        if (jAFAdRevenueData != -1) {
            int i11 = registerClient + 37;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (jAFAdRevenueData >= jCurrentTimeMillis) {
                int iAFAdRevenueData = component3().AFAdRevenueData("af_send_exc_min", -1);
                if (iAFAdRevenueData != -1) {
                    int i12 = registerClient + 99;
                    copydefault = i12 % 128;
                    if (i12 % 2 != 0) {
                        getRevenue().AFAdRevenueData();
                        throw null;
                    }
                    if (getRevenue().AFAdRevenueData() >= iAFAdRevenueData) {
                        return getRevenue(aFh1aSDK);
                    }
                }
                return false;
            }
        }
        registerClient = (copydefault + 119) % 128;
        return false;
    }

    private final AFc1kSDK getMediationNetwork() {
        return (AFc1kSDK) getMonetizationNetwork(new Object[]{this}, -815937263, 815937267, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1ySDK aFd1ySDK) {
        registerClient = (copydefault + 79) % 128;
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        aFd1ySDK.equals();
        registerClient = (copydefault + 109) % 128;
    }

    private final boolean getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAFAdRevenueData = component3().AFAdRevenueData("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            registerClient = (copydefault + 69) % 128;
            return false;
        }
        if (jAFAdRevenueData != -1) {
            int i11 = registerClient + 41;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (jAFAdRevenueData >= jCurrentTimeMillis) {
                return getRevenue(aFh1aSDK);
            }
        }
        return false;
    }

    private static Map<String, Object> getRevenue(Map<String, ? extends Object> map, List<ExceptionInfo> list) {
        int i11 = registerClient + 101;
        copydefault = i11 % 128;
        Map<String, Object> mapMapOf = i11 % 2 != 0 ? MapsKt.mapOf(TuplesKt.m90091to("excs", AFd1sSDK.getMonetizationNetwork(list)), TuplesKt.m90091to("deviceInfo", map)) : MapsKt.mapOf(TuplesKt.m90091to("deviceInfo", map), TuplesKt.m90091to("excs", AFd1sSDK.getMonetizationNetwork(list)));
        int i12 = registerClient + 89;
        copydefault = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 23 / 0;
        }
        return mapMapOf;
    }

    private final boolean getRevenue(AFh1aSDK aFh1aSDK) {
        new AFd1pSDK();
        String str = this.component1;
        String str2 = aFh1aSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean monetizationNetwork = AFd1pSDK.getMonetizationNetwork(str, str2);
        int i11 = copydefault + 97;
        registerClient = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 64 / 0;
        }
        return monetizationNetwork;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1ySDK aFd1ySDK) {
        getMonetizationNetwork(new Object[]{aFd1ySDK}, -677504203, 677504206, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void getMonetizationNetwork() {
        getMonetizationNetwork(new Object[]{this}, 1519981708, -1519981708, System.identityHashCode(this));
    }
}
