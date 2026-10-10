package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.credentials.provider.CredentialEntry;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.TPReportParams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1rSDK implements AFg1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: d */
    private static int f6295d = 0;

    /* JADX INFO: renamed from: e */
    private static int f6296e = 1;

    @NotNull
    private final AFj1nSDK AFAdRevenueData;

    @NotNull
    private final Lazy AFKeystoreWrapper;

    @NotNull
    private final AFc1kSDK areAllFieldsValid;

    @NotNull
    private final AFc1pSDK component1;

    @NotNull
    private final AFi1rSDK component2;

    @NotNull
    private final AFh1tSDK component3;

    @NotNull
    private final AFg1uSDK component4;

    @NotNull
    private final AFg1xSDK copy;

    @NotNull
    private final AFc1fSDK copydefault;

    @NotNull
    private final Lazy equals;

    @NotNull
    private final AFg1wSDK getCurrencyIso4217Code;

    @NotNull
    private final AFi1mSDK getMediationNetwork;

    @NotNull
    private final Context getMonetizationNetwork;

    @NotNull
    private final String getRevenue;

    @NotNull
    private final AFc1iSDK hashCode;

    @NotNull
    private final AFf1fSDK toString;
    private static char[] AFLogger = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int AFInAppEventParameterName = 1912311267;
    private static boolean registerClient = true;
    private static boolean AFInAppEventType = true;

    private final SimpleDateFormat AFAdRevenueData() {
        int i11 = f6296e + 13;
        f6295d = i11 % 128;
        if (i11 % 2 == 0) {
            return (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        }
        int i12 = 76 / 0;
        return (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        f6296e = (f6295d + 57) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = f6296e + 89;
        f6295d = i11 % 128;
        if (i11 % 2 == 0) {
            return Long.valueOf(jCurrentTimeMillis);
        }
        int i12 = 40 / 0;
        return Long.valueOf(jCurrentTimeMillis);
    }

    private static long component1() {
        f6296e = (f6295d + 55) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i11 = f6295d + 115;
        f6296e = i11 % 128;
        if (i11 % 2 != 0) {
            return jCurrentTimeMillis;
        }
        throw null;
    }

    private boolean component2() {
        f6295d = (f6296e + 119) % 128;
        boolean z11 = Boolean.parseBoolean(this.component1.getMediationNetwork("sentSuccessfully", null));
        f6295d = (f6296e + 59) % 128;
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041 A[PHI: r0 r1
      0x0041: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v14 java.lang.String) binds: [B:8:0x003f, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:8:0x003f, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    private void component3(@NotNull Map<String, Object> map) {
        String string;
        String string2;
        int i11 = f6295d + 123;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            string = getCurrencyIso4217Code().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = getCurrencyIso4217Code().getString(AppsFlyerProperties.ONELINK_VERSION);
            int i12 = 76 / 0;
            if (string != null) {
                map.put("onelink_id", string);
                f6295d = (f6296e + 107) % 128;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            string = getCurrencyIso4217Code().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = getCurrencyIso4217Code().getString(AppsFlyerProperties.ONELINK_VERSION);
            if (string != null) {
                map.put("onelink_id", string);
                f6295d = (f6296e + 107) % 128;
            }
        }
        if (string2 != null) {
            f6295d = (f6296e + 125) % 128;
            map.put("onelink_ver", string2);
        }
    }

    private final void component4(Map<String, Object> map) {
        int i11 = f6295d + 123;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            map.put("btl", String.valueOf(this.getCurrencyIso4217Code.getMediationNetwork(this.getMonetizationNetwork).getMediationNetwork));
            throw null;
        }
        AFg1wSDK.AFa1uSDK mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork(this.getMonetizationNetwork);
        float f11 = mediationNetwork.getMediationNetwork;
        String str = mediationNetwork.getRevenue;
        map.put("btl", String.valueOf(f11));
        if (str != null) {
            map.put("btch", str);
        }
        int i12 = f6295d + 17;
        f6296e = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r0
      0x0029: PHI (r0v5 long) = (r0v4 long), (r0v8 long) binds: [B:8:0x0027, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    private void copy(@NotNull Map<String, Object> map) {
        long j11;
        int i11 = f6295d + 11;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            j11 = this.component3.toString;
            if (j11 != 1) {
                f6296e = (f6295d + 85) % 128;
                map.put("prev_session_dur", Long.valueOf(j11));
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            j11 = this.component3.toString;
            if (j11 != 0) {
                f6296e = (f6295d + 85) % 128;
                map.put("prev_session_dur", Long.valueOf(j11));
            }
        }
        f6295d = (f6296e + 85) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:9:0x003f A[PHI: r0 r5
      0x003f: PHI (r0v5 long) = (r0v4 long), (r0v11 long) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r5v1 long) = (r5v0 long), (r5v3 long) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    private void copydefault(@NotNull Map<String, Object> map) {
        long jAFAdRevenueData;
        long jCurrentTimeMillis;
        long seconds;
        int i11 = f6295d + 89;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            jAFAdRevenueData = this.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", 0L);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.component1.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
            if (jAFAdRevenueData > 0) {
                f6295d = (f6296e + 83) % 128;
                seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - jAFAdRevenueData);
            } else {
                seconds = -1;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            jAFAdRevenueData = this.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", 0L);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.component1.getCurrencyIso4217Code("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
            if (jAFAdRevenueData > 0) {
                f6295d = (f6296e + 83) % 128;
                seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - jAFAdRevenueData);
            } else {
                seconds = -1;
            }
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private final void equals(Map<String, Object> map) {
        f6296e = (f6295d + 111) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.getMonetizationNetwork.getSystemService(UiModeManager.class);
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        map.put("tv", Boolean.TRUE);
        f6295d = (f6296e + 105) % 128;
    }

    private final AppsFlyerProperties getCurrencyIso4217Code() {
        AppsFlyerProperties appsFlyerProperties;
        int i11 = f6296e + 7;
        f6295d = i11 % 128;
        if (i11 % 2 != 0) {
            appsFlyerProperties = (AppsFlyerProperties) this.equals.getValue();
            int i12 = 44 / 0;
        } else {
            appsFlyerProperties = (AppsFlyerProperties) this.equals.getValue();
        }
        int i13 = f6295d + 57;
        f6296e = i13 % 128;
        if (i13 % 2 != 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        try {
            long jLongValue = getRevenue().longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            f6296e = (f6295d + 57) % 128;
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e11);
        }
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * 860) + (i12 * (-858)) + ((i11 | i13) * (-859));
        int i15 = ~i13;
        int i16 = ~(i15 | i11);
        int i17 = ~i11;
        int i18 = ~i12;
        int i19 = i14 + (((~(i13 | i17 | i18)) | i16) * 859) + (((~(i11 | i18)) | (~(i18 | i15))) * 859);
        boolean z11 = true;
        boolean z12 = false;
        switch (i19) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                Map map = (Map) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                Intrinsics.checkNotNullParameter(map, "");
                map.put("counter", String.valueOf(iIntValue));
                map.put("iaecounter", String.valueOf(iIntValue2));
                if (aFg1rSDK.component2()) {
                    z11 = false;
                } else {
                    int i21 = (f6296e + 55) % 128;
                    f6295d = i21;
                    f6296e = (i21 + 121) % 128;
                }
                map.put("isFirstCall", String.valueOf(z11));
                return null;
            case 3:
                return getMediationNetwork(objArr);
            case 4:
                return getCurrencyIso4217Code(objArr);
            case 5:
                return getRevenue(objArr);
            case 6:
                return getMonetizationNetwork(objArr);
            case 7:
                AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
                Map map2 = (Map) objArr[1];
                Intrinsics.checkNotNullParameter(map2, "");
                AFi1qSDK aFi1qSDK = aFg1rSDK2.component2.AFAdRevenueData;
                AFi1sSDK mediationNetwork = aFi1qSDK != null ? aFi1qSDK.getMediationNetwork() : null;
                if (mediationNetwork != null) {
                    map2.put("network", mediationNetwork.AFAdRevenueData);
                    map2.put("ivc", Boolean.valueOf(mediationNetwork.getMonetizationNetwork()));
                    if (!aFg1rSDK2.getCurrencyIso4217Code().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                        f6296e = (f6295d + 47) % 128;
                        z12 = true;
                    }
                    if (!(!z12)) {
                        String str = mediationNetwork.getCurrencyIso4217Code;
                        if (str != null) {
                            map2.put(C33675gh.f69997c, str);
                        }
                        String str2 = mediationNetwork.getMonetizationNetwork;
                        if (str2 != null) {
                            f6295d = (f6296e + 117) % 128;
                            map2.put("carrier", str2);
                            f6295d = (f6296e + 35) % 128;
                        }
                    }
                }
                return null;
            case 8:
                return component4(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                AFg1rSDK aFg1rSDK3 = (AFg1rSDK) objArr[0];
                Map map3 = (Map) objArr[1];
                if (!aFg1rSDK3.getCurrencyIso4217Code().isOtherSdkStringDisabled()) {
                    f6295d = (f6296e + 85) % 128;
                    map3.put("batteryLevel", String.valueOf(aFg1rSDK3.getCurrencyIso4217Code.getMediationNetwork(aFg1rSDK3.getMonetizationNetwork).getMediationNetwork));
                    f6296e = (f6295d + 67) % 128;
                }
                return null;
            case 11:
                return component1(objArr);
            case 12:
                return component2(objArr);
            default:
                AFg1rSDK aFg1rSDK4 = (AFg1rSDK) objArr[0];
                f6296e = (f6295d + 65) % 128;
                if (!aFg1rSDK4.getCurrencyIso4217Code().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                    int i22 = f6295d + 57;
                    f6296e = i22 % 128;
                    if (i22 % 2 != 0 ? !aFg1rSDK4.getCurrencyIso4217Code().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !aFg1rSDK4.getCurrencyIso4217Code().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                        f6295d = (f6296e + 1) % 128;
                        AFa1ySDK.getMonetizationNetwork();
                        if (AFa1ySDK.getRevenue(aFg1rSDK4.getMonetizationNetwork)) {
                            return Boolean.FALSE;
                        }
                    }
                }
                return Boolean.TRUE;
        }
    }

    private final void getRevenue(Map<String, Object> map, int i11) {
        try {
            if (this.areAllFieldsValid.m5954n_().versionCode > this.component1.AFAdRevenueData("versionCode", 0)) {
                int i12 = f6295d + 123;
                f6296e = i12 % 128;
                if (i12 % 2 == 0) {
                    this.component1.getRevenue("versionCode", this.areAllFieldsValid.m5954n_().versionCode);
                    int i13 = 68 / 0;
                } else {
                    this.component1.getRevenue("versionCode", this.areAllFieldsValid.m5954n_().versionCode);
                }
            }
            map.put(TPDownloadProxyEnum.USER_APP_VERSION_CODE, String.valueOf(this.areAllFieldsValid.m5954n_().versionCode));
            map.put(TPDownloadProxyEnum.USER_APP_VERSION, this.areAllFieldsValid.m5954n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.areAllFieldsValid.getMediationNetwork.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            map.put("date1", AFAdRevenueData().format(new Date(getRevenue().longValue())));
            map.put("date2", AFAdRevenueData().format(new Date(this.areAllFieldsValid.m5954n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            m5979a(null, "\u008d\u0085\u0087\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormatAFAdRevenueData = AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(simpleDateFormatAFAdRevenueData, "");
            map.put(strIntern, getMediationNetwork(simpleDateFormatAFAdRevenueData, i11));
            int i14 = f6295d + 117;
            f6296e = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th2, true);
        }
    }

    public AFg1rSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1mSDK aFi1mSDK, @NotNull AFg1wSDK aFg1wSDK, @NotNull AFj1nSDK aFj1nSDK, @NotNull AFg1uSDK aFg1uSDK, @NotNull AFh1tSDK aFh1tSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFi1rSDK aFi1rSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFc1fSDK aFc1fSDK, @NotNull AFg1xSDK aFg1xSDK, @NotNull AFc1iSDK aFc1iSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1mSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFj1nSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.getRevenue = str;
        this.getMonetizationNetwork = context;
        this.getMediationNetwork = aFi1mSDK;
        this.getCurrencyIso4217Code = aFg1wSDK;
        this.AFAdRevenueData = aFj1nSDK;
        this.component4 = aFg1uSDK;
        this.component3 = aFh1tSDK;
        this.component1 = aFc1pSDK;
        this.areAllFieldsValid = aFc1kSDK;
        this.component2 = aFi1rSDK;
        this.toString = aFf1fSDK;
        this.copydefault = aFc1fSDK;
        this.copy = aFg1xSDK;
        this.hashCode = aFc1iSDK;
        this.equals = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1rSDK.5
            @Override // p852kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1rSDK.4
            @Override // p852kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map) {
        f6296e = (f6295d + 37) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.copy.getMediationNetwork());
        int i11 = f6295d + 57;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 74 / 0;
        }
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        f6296e = (f6295d + 29) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.areAllFieldsValid.getRevenue(this.getMonetizationNetwork)));
        int i11 = f6296e + 71;
        f6295d = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static void AFLogger(@NotNull Map<String, Object> map) {
        f6295d = (f6296e + 99) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object currencyIso4217Code = AFa1uSDK.getCurrencyIso4217Code();
        String monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
        if (currencyIso4217Code == null || monetizationNetwork == null || Integer.parseInt(monetizationNetwork) <= 0) {
            return;
        }
        map.put("reinstallCounter", monetizationNetwork);
        map.put("originalAppsflyerId", currencyIso4217Code);
        f6296e = (f6295d + 19) % 128;
    }

    /* JADX INFO: renamed from: a */
    private static void m5979a(String str, String str2, int[] iArr, int i11, Object[] objArr) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 43) % 128;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        char[] cArr2 = AFLogger;
        if (cArr2 != null) {
            $11 = ($10 + 43) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr3[i12] = (char) (((long) cArr2[i12]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i13 = (int) (1825820251896122634L ^ ((long) AFInAppEventParameterName));
        if (AFInAppEventType) {
            int length2 = bArr.length;
            aFk1jSDK.getRevenue = length2;
            char[] cArr4 = new char[length2];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i14 = aFk1jSDK.getMonetizationNetwork;
                int i15 = aFk1jSDK.getRevenue;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    $10 = ($11 + 27) % 128;
                    cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i11] - i13);
                    aFk1jSDK.getMonetizationNetwork = i14 + 1;
                }
            }
        } else if (registerClient) {
            int length3 = cArr.length;
            aFk1jSDK.getRevenue = length3;
            char[] cArr5 = new char[length3];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i16 = aFk1jSDK.getMonetizationNetwork;
                int i17 = aFk1jSDK.getRevenue;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i11] - i13);
                    aFk1jSDK.getMonetizationNetwork = i16 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1jSDK.getRevenue = length4;
            char[] cArr6 = new char[length4];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i18 = aFk1jSDK.getMonetizationNetwork;
                int i19 = aFk1jSDK.getRevenue;
                if (i18 >= i19) {
                    String str3 = new String(cArr6);
                    $10 = ($11 + 57) % 128;
                    objArr[0] = str3;
                    return;
                } else {
                    $10 = ($11 + 103) % 128;
                    cArr6[i18] = (char) (cArr2[iArr[(i19 - 1) - i18] - i11] - i13);
                    aFk1jSDK.getMonetizationNetwork = i18 + 1;
                }
            }
        }
    }

    @NotNull
    private static String areAllFieldsValid() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        f6296e = (f6295d + 19) % 128;
        return str;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", (String) getMonetizationNetwork(new Object[]{"ro.product.cpu.abi"}, -1917713393, 1917713405, (int) System.currentTimeMillis()));
        map2.put("cpu_abi2", (String) getMonetizationNetwork(new Object[]{"ro.product.cpu.abi2"}, -1917713393, 1917713405, (int) System.currentTimeMillis()));
        map2.put("arch", (String) getMonetizationNetwork(new Object[]{"os.arch"}, -1917713393, 1917713405, (int) System.currentTimeMillis()));
        map2.put("build_display_id", (String) getMonetizationNetwork(new Object[]{"ro.build.display.id"}, -1917713393, 1917713405, (int) System.currentTimeMillis()));
        if (zBooleanValue) {
            aFg1rSDK.component4(map2);
            if (aFg1rSDK.areAllFieldsValid.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 2) {
                int i11 = f6295d + 77;
                f6296e = i11 % 128;
                if (i11 % 2 == 0) {
                    map2.putAll(aFg1rSDK.AFAdRevenueData.getRevenue());
                    int i12 = 21 / 0;
                } else {
                    map2.putAll(aFg1rSDK.AFAdRevenueData.getRevenue());
                }
            }
        }
        map2.put("dim", aFg1rSDK.component4.AFAdRevenueData(aFg1rSDK.getMonetizationNetwork));
        map.put("deviceData", map2);
        int i13 = f6295d + 89;
        f6296e = i13 % 128;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        String str = (String) objArr[0];
        f6296e = (f6295d + 47) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(objInvoke, "");
            String str2 = (String) objInvoke;
            f6296e = (f6295d + 125) % 128;
            return str2;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m5980d(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            f6296e = (f6295d + 93) % 128;
            map.put("istu", String.valueOf(this.component1.getMonetizationNetwork("is_stop_tracking_used", false)));
            f6295d = (f6296e + 39) % 128;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m5981e(@NotNull Map<String, Object> map) {
        String strAFAdRevenueData;
        Intrinsics.checkNotNullParameter(map, "");
        if (getCurrencyIso4217Code().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            try {
                this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                strAFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData(this.getMonetizationNetwork);
            } catch (Throwable unused) {
                strAFAdRevenueData = null;
            }
            if (strAFAdRevenueData != null) {
                f6296e = (f6295d + 59) % 128;
                map.put("fb", strAFAdRevenueData);
            }
        }
        int i11 = f6295d + 91;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 8 / 0;
        }
    }

    private void hashCode(@NotNull Map<String, Object> map) {
        int i11 = f6296e + 75;
        f6295d = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            int i12 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        }
        int i13 = f6296e + 83;
        f6295d = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m5982i(@NotNull Map<String, Object> map) {
        f6295d = (f6296e + 93) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        AFb1jSDK aFb1jSDKM5939l_ = AFb1iSDK.m5939l_(this.getMonetizationNetwork.getContentResolver());
        if (aFb1jSDKM5939l_ != null) {
            f6295d = (f6296e + 93) % 128;
            map.put("amazon_aid", aFb1jSDKM5939l_.getMonetizationNetwork);
            map.put("amazon_aid_limit", String.valueOf(aFb1jSDKM5939l_.getMediationNetwork));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    private final void toString(Map<String, Object> map) {
        int i11;
        int i12 = f6295d + 19;
        f6296e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 7 / 0;
            if (AFg1mSDK.getMonetizationNetwork(this.getMonetizationNetwork)) {
                i11 = f6296e + 125;
                f6295d = i11 % 128;
                if (i11 % 2 == 0) {
                    map.put("inst_app", Boolean.TRUE);
                    throw null;
                }
                map.put("inst_app", Boolean.TRUE);
            }
        } else if (AFg1mSDK.getMonetizationNetwork(this.getMonetizationNetwork)) {
            i11 = f6296e + 125;
            f6295d = i11 % 128;
            if (i11 % 2 == 0) {
                map.put("inst_app", Boolean.TRUE);
                throw null;
            }
            map.put("inst_app", Boolean.TRUE);
        }
        f6295d = (f6296e + 59) % 128;
    }

    private void unregisterClient(@NotNull Map<String, Object> map) {
        boolean z11;
        int i11 = f6295d + 95;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.toString.getMonetizationNetwork();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String monetizationNetwork = this.toString.getMonetizationNetwork();
        if (monetizationNetwork == null || monetizationNetwork.length() == 0) {
            f6295d = (f6296e + 53) % 128;
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(!z11)) {
            return;
        }
        int i12 = f6295d + 75;
        f6296e = i12 % 128;
        if (i12 % 2 != 0) {
            map.put("appsflyerKey", monetizationNetwork);
        } else {
            map.put("appsflyerKey", monetizationNetwork);
            throw null;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m5983w(@NotNull Map<String, Object> map) {
        int i11 = f6296e + 117;
        f6295d = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFLogger.afDebugLog("didConfigureTokenRefreshService=" + AFg1vSDK.getMediationNetwork(this.getMonetizationNetwork));
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        boolean mediationNetwork = AFg1vSDK.getMediationNetwork(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + mediationNetwork);
        if (!mediationNetwork) {
            int i12 = f6295d + 29;
            f6296e = i12 % 128;
            if (i12 % 2 == 0) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                throw null;
            }
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1vSDK.getMediationNetwork(this.component1)));
        int i13 = f6295d + 61;
        f6296e = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(map, "");
        String string = getCurrencyIso4217Code().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = getCurrencyIso4217Code().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                String string3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
            }
            map.put(FirebaseAnalytics.Param.CURRENCY, string2);
        }
        String string4 = getCurrencyIso4217Code().getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            map.put("isUpdate", string4);
        }
        String string5 = getCurrencyIso4217Code().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            f6296e = (f6295d + 51) % 128;
            map.put("customData", string5);
            f6295d = (f6296e + 33) % 128;
        } else {
            f6296e = (f6295d + 105) % 128;
        }
        String string6 = getCurrencyIso4217Code().getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            map.put("appUserId", string6);
        }
        String string7 = getCurrencyIso4217Code().getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            map.put("user_emails", string7);
        }
        AFb1vSDK aFb1vSDK = this.hashCode.getMonetizationNetwork;
        if (aFb1vSDK == null || (strArr = aFb1vSDK.getRevenue) == null) {
            return;
        }
        int i11 = f6296e + 59;
        f6295d = i11 % 128;
        if (i11 % 2 == 0) {
            map.put("sharing_filter", strArr);
        } else {
            map.put("sharing_filter", strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void getCurrencyIso4217Code(@NotNull AFh1mSDK aFh1mSDK) {
        f6296e = (f6295d + 125) % 128;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getMediationNetwork(map);
        Map<String, Object> map2 = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        getRevenue(map2, aFh1mSDK.component2);
        Map<String, Object> map3 = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        getMediationNetwork(map3, aFh1mSDK.component2);
        Map<String, Object> map4 = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        AFKeystoreWrapper(map4);
        Map<String, Object> map5 = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        m5981e(map5);
        Map<String, Object> map6 = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map6, "");
        AFe1oSDK aFe1oSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFe1oSDKAFAdRevenueData, "");
        getCurrencyIso4217Code(map6, aFe1oSDKAFAdRevenueData);
        f6296e = (f6295d + 21) % 128;
    }

    private static void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{map}, -869727414, 869727420, (int) System.currentTimeMillis());
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, -1555249506, 1555249514, System.identityHashCode(this));
    }

    private final String equals() {
        f6296e = (f6295d + 61) % 128;
        File monetizationNetwork = getMonetizationNetwork((String) getMonetizationNetwork(new Object[]{"ro.appsflyer.preinstall.path"}, -1917713393, 1917713405, (int) System.currentTimeMillis()));
        if (getRevenue(monetizationNetwork)) {
            monetizationNetwork = getMonetizationNetwork(getRevenue("AF_PRE_INSTALL_PATH"));
            f6295d = (f6296e + 15) % 128;
        }
        if (!(!getRevenue(monetizationNetwork))) {
            monetizationNetwork = getMonetizationNetwork("/data/local/tmp/pre_install.appsflyer");
        }
        if (getRevenue(monetizationNetwork)) {
            int i11 = f6296e + 47;
            f6295d = i11 % 128;
            if (i11 % 2 == 0) {
                monetizationNetwork = getMonetizationNetwork("/etc/pre_install.appsflyer");
            } else {
                getMonetizationNetwork("/etc/pre_install.appsflyer");
                throw null;
            }
        }
        if (getRevenue(monetizationNetwork)) {
            f6295d = (f6296e + 51) % 128;
            return null;
        }
        String packageName = this.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return getRevenue(monetizationNetwork, packageName);
    }

    private static void areAllFieldsValid(@NotNull Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{map}, -1669178520, 1669178523, (int) System.currentTimeMillis());
    }

    private void component2(@NotNull Map<String, ? extends Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, -1359348315, 1359348316, System.identityHashCode(this));
    }

    @Nullable
    private String getMediationNetwork() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        int i11 = f6295d + 3;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            AFj1jSDK.m5998N_(this.getMonetizationNetwork.getApplicationContext().getPackageManager(), this.getMonetizationNetwork.getApplicationContext().getPackageName());
            throw null;
        }
        String strM5998N_ = AFj1jSDK.m5998N_(this.getMonetizationNetwork.getApplicationContext().getPackageManager(), this.getMonetizationNetwork.getApplicationContext().getPackageName());
        int i12 = f6296e + 57;
        f6295d = i12 % 128;
        if (i12 % 2 == 0) {
            return strM5998N_;
        }
        throw null;
    }

    @Nullable
    private String component3() {
        return (String) getMonetizationNetwork(new Object[]{this}, -1768159503, 1768159508, System.identityHashCode(this));
    }

    private final boolean copy() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -872535619, 872535619, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    private String getMediationNetwork(@NotNull SimpleDateFormat simpleDateFormat, int i11) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String mediationNetwork = this.component1.getMediationNetwork("appsFlyerFirstInstall", null);
        if (mediationNetwork == null) {
            f6295d = (f6296e + 49) % 128;
            if (i11 <= 1) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                String str = simpleDateFormat.format(new Date());
                f6296e = (f6295d + 113) % 128;
                mediationNetwork = str;
            } else {
                mediationNetwork = "";
            }
            this.component1.getMonetizationNetwork("appsFlyerFirstInstall", mediationNetwork);
        }
        AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.GENERAL, "AppsFlyer: first launch date: " + mediationNetwork, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        f6295d = (f6296e + 79) % 128;
        return mediationNetwork;
    }

    @SuppressLint({"HardwareIds"})
    private final String component4() {
        String mediationNetwork = this.component1.getMediationNetwork("androidIdCached", null);
        try {
            String string = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                f6295d = (f6296e + 43) % 128;
                return string;
            }
        } catch (Exception e11) {
            AFLogger.afErrorLog(e11.getMessage(), e11);
        }
        if (mediationNetwork == null) {
            return null;
        }
        f6295d = (f6296e + 113) % 128;
        AFLogger.afDebugLog("use cached AndroidId: " + mediationNetwork);
        return mediationNetwork;
    }

    private static List<AFe1oSDK> copydefault() {
        f6296e = (f6295d + 79) % 128;
        List<AFe1oSDK> listListOf = CollectionsKt.listOf((Object[]) new AFe1oSDK[]{AFe1oSDK.CONVERSION, AFe1oSDK.LAUNCH, AFe1oSDK.INAPP, AFe1oSDK.MANUAL_PURCHASE_VALIDATION, AFe1oSDK.ARS_VALIDATE, AFe1oSDK.PURCHASE_VALIDATE, AFe1oSDK.ADREVENUE});
        int i11 = f6296e + 49;
        f6295d = i11 % 128;
        if (i11 % 2 == 0) {
            return listListOf;
        }
        throw null;
    }

    private final void component1(Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, 474322536, -474322526, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:6:0x002b A[PHI: r1
      0x002b: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x0038, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object component4(Object[] objArr) {
        String string;
        String str;
        int i11;
        boolean z11 = false;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i12 = f6295d + 37;
        f6296e = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            string = aFg1rSDK.getCurrencyIso4217Code().getString(AppsFlyerProperties.EXTENSION);
            int i13 = 39 / 0;
            if (string != null) {
                str = string;
                i11 = f6296e + 15;
                f6295d = i11 % 128;
                if (i11 % 2 == 0) {
                    if (string.length() == 0) {
                        string = str;
                    }
                } else {
                    string.length();
                    throw null;
                }
            }
            if (!z11) {
                map.put(AppsFlyerProperties.EXTENSION, str);
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        string = aFg1rSDK.getCurrencyIso4217Code().getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            str = string;
            i11 = f6296e + 15;
            f6295d = i11 % 128;
            if (i11 % 2 == 0) {
                if (string.length() == 0) {
                    string = str;
                }
            } else {
                string.length();
                throw null;
            }
        }
        if (!z11) {
            map.put(AppsFlyerProperties.EXTENSION, str);
        }
        return null;
        str = string;
        z11 = true;
        if (!z11) {
            map.put(AppsFlyerProperties.EXTENSION, str);
        }
        return null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) throws UnsupportedEncodingException {
        Map map = (Map) objArr[0];
        f6296e = (f6295d + 105) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr2 = new Object[1];
        m5979a(null, "\u008f\u0089\u0087\u0083\u008e", null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr2);
        map.put(((String) objArr2[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i11 = f6295d + 121;
        f6296e = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, boolean z11) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.getRevenue);
        if (z11) {
            int i11 = f6296e + 43;
            f6295d = i11 % 128;
            if (i11 % 2 != 0) {
                map.put("platform_extension_v2", this.getMediationNetwork.getMonetizationNetwork());
                int i12 = 65 / 0;
            } else {
                map.put("platform_extension_v2", this.getMediationNetwork.getMonetizationNetwork());
            }
        }
        f6296e = (f6295d + 43) % 128;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        f6296e = (f6295d + 43) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String mediationNetwork = aFg1rSDK.component1.getMediationNetwork("prev_event_name", null);
            if (mediationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", aFg1rSDK.component1.AFAdRevenueData("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", mediationNetwork);
                map.put("prev_event", jSONObject);
            }
            aFg1rSDK.component1.getMonetizationNetwork("prev_event_name", str);
            aFg1rSDK.component1.getCurrencyIso4217Code("prev_event_timestamp", System.currentTimeMillis());
            int i11 = f6296e + 105;
            f6295d = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 5 / 0;
            }
            return null;
        } catch (Exception e11) {
            AFLogger.afErrorLog("Error while processing previous event.", e11);
            return null;
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        AFh1tSDK aFh1tSDK = aFg1rSDK.component3;
        HashMap map2 = new HashMap(aFh1tSDK.getRevenue);
        aFh1tSDK.getRevenue.clear();
        aFh1tSDK.getMediationNetwork.getRevenue("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (!map2.isEmpty()) {
            int i11 = f6295d;
            f6296e = (i11 + 113) % 128;
            int i12 = i11 + 85;
            f6296e = i12 % 128;
            if (i12 % 2 != 0) {
                Map<String, Object> monetizationNetwork = AFa1ySDK.getMonetizationNetwork((Map<String, Object>) map);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                monetizationNetwork.put("gcd", map2);
            } else {
                Map<String, Object> monetizationNetwork2 = AFa1ySDK.getMonetizationNetwork((Map<String, Object>) map);
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
                monetizationNetwork2.put("gcd", map2);
                throw null;
            }
        }
        return null;
    }

    private static void getMediationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        int i11 = f6296e + 31;
        f6295d = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            int i12 = 84 / 0;
            if (str == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (str == null) {
                return;
            }
        }
        int i13 = f6295d + 37;
        f6296e = i13 % 128;
        if (i13 % 2 == 0) {
            map.put(HintConstants.AUTOFILL_HINT_PHONE, str);
            int i14 = 60 / 0;
        } else {
            map.put(HintConstants.AUTOFILL_HINT_PHONE, str);
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void getRevenue(@NotNull AFh1mSDK aFh1mSDK) {
        f6295d = (f6296e + 109) % 128;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getMonetizationNetwork(new Object[]{this, map, Boolean.valueOf(aFh1mSDK.getRevenue())}, -1984959168, 1984959179, System.identityHashCode(this));
        getMonetizationNetwork(new Object[]{map}, -1669178520, 1669178523, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{map}, -869727414, 869727420, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{this, map}, -777571906, 777571913, System.identityHashCode(this));
        getCurrencyIso4217Code(map, this.hashCode.getMediationNetwork);
        m5982i(map);
        map.put("cell", MapsKt.mapOf(TuplesKt.m90091to("mcc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mcc)), TuplesKt.m90091to("mnc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mnc))));
        map.put("sig", getMediationNetwork());
        map.put("last_boot_time", Long.valueOf(component1()));
        map.put("disk", areAllFieldsValid());
        int i11 = f6295d + 99;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void getMonetizationNetwork(@NotNull AFh1mSDK aFh1mSDK) {
        AFd1eSDK aFd1eSDK;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        boolean zAreEqual = false;
        if (!this.areAllFieldsValid.component3()) {
            f6296e = (f6295d + 19) % 128;
            Map<String, Object> monetizationNetwork = AFa1ySDK.getMonetizationNetwork(aFh1mSDK.getMonetizationNetwork);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            monetizationNetwork.put("ad_ids_disabled", Boolean.TRUE);
        } else {
            AdvertisingIdData advertisingIdData = this.areAllFieldsValid.AFAdRevenueData.component3;
            if (advertisingIdData == null) {
                int i11 = f6295d + 49;
                f6296e = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 8 / 0;
                    return;
                }
                return;
            }
            String str = advertisingIdData.gaidError;
            if (str != null && str.length() != 0) {
                aFh1mSDK.AFAdRevenueData("gaidError", advertisingIdData.gaidError);
                f6295d = (f6296e + 43) % 128;
            }
            String str2 = advertisingIdData.advertisingId;
            if (str2 != null) {
                f6296e = (f6295d + 115) % 128;
                if (advertisingIdData.isEnabled != null) {
                    aFh1mSDK.AFAdRevenueData("advertiserId", str2);
                    aFh1mSDK.AFAdRevenueData("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                    aFh1mSDK.AFAdRevenueData("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
                }
            }
        }
        AdvertisingIdData advertisingIdData2 = this.areAllFieldsValid.AFAdRevenueData.component3;
        if (advertisingIdData2 != null) {
            zAreEqual = Intrinsics.areEqual(advertisingIdData2.retry, Boolean.TRUE);
            f6296e = (f6295d + 103) % 128;
        }
        aFh1mSDK.AFAdRevenueData("GAID_retry", String.valueOf(zAreEqual));
        if (!CollectionsKt.listOf((Object[]) new AFe1oSDK[]{AFe1oSDK.CONVERSION, AFe1oSDK.LAUNCH}).contains(aFh1mSDK.AFAdRevenueData()) || (aFd1eSDK = this.hashCode.component2) == null) {
            return;
        }
        f6295d = (f6296e + 87) % 128;
        Map<String, Object> monetizationNetwork2 = AFa1ySDK.getMonetizationNetwork(aFh1mSDK.getMonetizationNetwork);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
        monetizationNetwork2.put("fetchAdIdLatency", Long.valueOf(aFd1eSDK.getRevenue));
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, int i11) {
        Intrinsics.checkNotNullParameter(map, "");
        String strComponent4 = this.areAllFieldsValid.component4();
        String currencyIso4217Code = getCurrencyIso4217Code(this.component1, strComponent4);
        boolean z11 = false;
        boolean z12 = (currencyIso4217Code == null || Intrinsics.areEqual(currencyIso4217Code, strComponent4)) ? false : true;
        if (currencyIso4217Code != null || strComponent4 == null) {
            f6295d = (f6296e + 65) % 128;
        } else {
            f6295d = (f6296e + 27) % 128;
            z11 = true;
        }
        if (z12 || z11) {
            map.put("af_latestchannel", strComponent4);
        }
        String currencyIso4217Code2 = getCurrencyIso4217Code(i11);
        if (currencyIso4217Code2 != null) {
            int i12 = f6296e + 111;
            f6295d = i12 % 128;
            if (i12 % 2 == 0) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                Object lowerCase = currencyIso4217Code2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                map.put("af_installstore", lowerCase);
            } else {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                Object lowerCase2 = currencyIso4217Code2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                map.put("af_installstore", lowerCase2);
                throw null;
            }
        }
        String monetizationNetwork = getMonetizationNetwork(i11);
        if (monetizationNetwork != null) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            Object lowerCase3 = monetizationNetwork.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_preinstall_name", lowerCase3);
        }
        String str = (String) getMonetizationNetwork(new Object[]{this}, -1768159503, 1768159508, System.identityHashCode(this));
        if (str != null) {
            Locale locale4 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            Object lowerCase4 = str.toLowerCase(locale4);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
            map.put("af_currentstore", lowerCase4);
        }
    }

    @Nullable
    private String getCurrencyIso4217Code(int i11) {
        int i12 = f6295d + 101;
        f6296e = i12 % 128;
        String str = null;
        if (i12 % 2 == 0) {
            this.component1.getMonetizationNetwork("INSTALL_STORE");
            throw null;
        }
        if (this.component1.getMonetizationNetwork("INSTALL_STORE")) {
            return this.component1.getMediationNetwork("INSTALL_STORE", null);
        }
        if (i11 <= 1) {
            int i13 = f6296e + 21;
            f6295d = i13 % 128;
            if (i13 % 2 != 0) {
                str = (String) getMonetizationNetwork(new Object[]{this}, -1768159503, 1768159508, System.identityHashCode(this));
                int i14 = 53 / 0;
            } else {
                str = (String) getMonetizationNetwork(new Object[]{this}, -1768159503, 1768159508, System.identityHashCode(this));
            }
        } else {
            f6295d = (f6296e + 61) % 128;
        }
        this.component1.getMonetizationNetwork("INSTALL_STORE", str);
        return str;
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void AFAdRevenueData(@NotNull AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.getMonetizationNetwork;
        if (aFh1mSDK.getRevenue()) {
            int i11 = f6295d + 77;
            f6296e = i11 % 128;
            if (i11 % 2 != 0) {
                String str = aFh1mSDK.component1;
                AFc1iSDK aFc1iSDK = this.hashCode;
                getRevenue(aFh1mSDK, str, aFc1iSDK.AFAdRevenueData, aFc1iSDK.getCurrencyIso4217Code);
            } else {
                String str2 = aFh1mSDK.component1;
                AFc1iSDK aFc1iSDK2 = this.hashCode;
                getRevenue(aFh1mSDK, str2, aFc1iSDK2.AFAdRevenueData, aFc1iSDK2.getCurrencyIso4217Code);
                throw null;
            }
        } else if (!(aFh1mSDK instanceof AFh1eSDK)) {
            int i12 = f6295d + 93;
            f6296e = i12 % 128;
            if (i12 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str3 = aFh1mSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                getMonetizationNetwork(new Object[]{this, map, str3}, 363039209, -363039205, System.identityHashCode(this));
                int i13 = 76 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map, "");
                String str4 = aFh1mSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                getMonetizationNetwork(new Object[]{this, map, str4}, 363039209, -363039205, System.identityHashCode(this));
            }
        }
        if (CollectionsKt.listOf((Object[]) new AFe1oSDK[]{AFe1oSDK.CONVERSION, AFe1oSDK.LAUNCH, AFe1oSDK.INAPP}).contains(aFh1mSDK.AFAdRevenueData())) {
            Intrinsics.checkNotNullExpressionValue(map, "");
            hashCode(map);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        unregisterClient(map);
        AFLogger(map);
        AFInAppEventType(map);
        getMonetizationNetwork(new Object[]{this, map}, -1555249506, 1555249514, System.identityHashCode(this));
        getCurrencyIso4217Code(map);
        getCurrencyIso4217Code(map, aFh1mSDK.getRevenue());
        m5983w(map);
        m5980d(map);
        getCurrencyIso4217Code(map, aFh1mSDK);
        map.put("af_events_api", "1");
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        if (!getCurrencyIso4217Code().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String currencyIso4217Code = this.toString.getCurrencyIso4217Code(this.component1);
            if (currencyIso4217Code != null) {
                f6296e = (f6295d + 59) % 128;
                if (currencyIso4217Code.length() != 0) {
                    f6295d = (f6296e + 85) % 128;
                    map.put("imei", currencyIso4217Code);
                }
            }
            String currencyIso4217Code2 = getCurrencyIso4217Code(str);
            if (currencyIso4217Code2 != null) {
                this.component1.getMonetizationNetwork("androidIdCached", currencyIso4217Code2);
                map.put("android_id", currencyIso4217Code2);
            } else {
                AFLogger.afInfoLog("Android ID was not collected.");
            }
            AFb1jSDK aFb1jSDKAFAdRevenueData = AFb1iSDK.AFAdRevenueData(this.getMonetizationNetwork);
            if (aFb1jSDKAFAdRevenueData != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Boolean bool = aFb1jSDKAFAdRevenueData.getCurrencyIso4217Code;
                Intrinsics.checkNotNullExpressionValue(bool, "");
                linkedHashMap.put("isManual", bool);
                String str2 = aFb1jSDKAFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                linkedHashMap.put(TPReportParams.JSON_KEY_VAL, str2);
                Boolean bool2 = aFb1jSDKAFAdRevenueData.getMediationNetwork;
                if (bool2 != null) {
                    f6295d = (f6296e + 5) % 128;
                    linkedHashMap.put("isLat", bool2);
                }
                map.put("oaid", linkedHashMap);
                return;
            }
            return;
        }
        map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, CredentialEntry.TRUE_STRING);
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    @NotNull
    public final Long getRevenue() {
        f6296e = (f6295d + 27) % 128;
        Long lValueOf = Long.valueOf(this.areAllFieldsValid.m5954n_().firstInstallTime);
        f6296e = (f6295d + 69) % 128;
        return lValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // com.appsflyer.internal.AFg1pSDK
    public final void getMediationNetwork(@NotNull AFh1mSDK aFh1mSDK) {
        boolean z11;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1mSDK.getMediationNetwork);
        String str = aFh1mSDK.copydefault;
        if (str != null) {
            f6295d = (f6296e + 59) % 128;
            if (StringsKt.isBlank(str)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        int i11 = f6296e + 45;
        f6295d = i11 % 128;
        if (i11 % 2 != 0) {
            map.put("af_web_referrer", aFh1mSDK.copydefault);
            int i12 = 65 / 0;
        } else {
            map.put("af_web_referrer", aFh1mSDK.copydefault);
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void getRevenue(@NotNull Map<String, Object> map) {
        Object objM103844constructorimpl;
        AFLogger aFLogger;
        AFh1ySDK aFh1ySDK;
        int i11;
        Object obj;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        f6296e = (f6295d + 47) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.hashCode.getRevenue;
        if (str2 != null) {
            if (map.get("af_deeplink") != null) {
                f6295d = (f6296e + 69) % 128;
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("isPush", CredentialEntry.TRUE_STRING);
                    map.put("af_deeplink", jSONObject.toString());
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    int i12 = f6296e + 31;
                    f6295d = i12 % 128;
                    if (i12 % 2 != 0) {
                        aFLogger = AFLogger.INSTANCE;
                        aFh1ySDK = AFh1ySDK.GENERAL;
                        i11 = 106;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z11 = false;
                        z12 = false;
                        z13 = true;
                        z14 = true;
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFh1ySDK = AFh1ySDK.GENERAL;
                        i11 = 120;
                        obj = null;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z11 = false;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    }
                    AFg1bSDK.e$default(aFLogger, aFh1ySDK, str, thM103847exceptionOrNullimpl, z11, z12, z13, z14, i11, obj);
                }
                Result.m103843boximpl(objM103844constructorimpl);
            }
        }
        this.hashCode.getRevenue = null;
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, boolean z11) {
        getMonetizationNetwork(new Object[]{this, map, Boolean.valueOf(z11)}, -1984959168, 1984959179, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r4.length() == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r4.length() == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getCurrencyIso4217Code(String str) {
        if (getCurrencyIso4217Code().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            int i11 = (f6296e + 5) % 128;
            f6295d = i11;
            if (str != null) {
                int i12 = i11 + 65;
                f6296e = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 44 / 0;
                }
            }
            f6296e = (f6295d + 27) % 128;
            if (!copy()) {
                return null;
            }
            f6296e = (f6295d + 39) % 128;
            return component4();
        }
        if (str != null) {
            return str;
        }
        return null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        String string = aFg1rSDK.getCurrencyIso4217Code().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string == null) {
            int i11 = f6295d + 21;
            f6296e = i11 % 128;
            if (i11 % 2 == 0) {
                string = aFg1rSDK.getRevenue("AF_STORE");
                int i12 = 25 / 0;
            } else {
                string = aFg1rSDK.getRevenue("AF_STORE");
            }
        }
        f6296e = (f6295d + 101) % 128;
        return string;
    }

    private final String getRevenue(String str) {
        int i11 = f6295d + 117;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            this.areAllFieldsValid.getCurrencyIso4217Code(str);
            throw null;
        }
        String currencyIso4217Code = this.areAllFieldsValid.getCurrencyIso4217Code(str);
        int i12 = f6296e + 7;
        f6295d = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 90 / 0;
        }
        return currencyIso4217Code;
    }

    private static boolean getRevenue(File file) {
        int i11 = f6295d + 79;
        int i12 = i11 % 128;
        f6296e = i12;
        if (i11 % 2 == 0) {
            int i13 = 47 / 0;
            if (file == null) {
                return true;
            }
        } else if (file == null) {
            return true;
        }
        int i14 = i12 + 59;
        f6295d = i14 % 128;
        int i15 = i14 % 2;
        boolean zExists = file.exists();
        if (i15 != 0) {
            int i16 = 8 / 0;
            if (!zExists) {
                return true;
            }
        } else if (!zExists) {
            return true;
        }
        return false;
    }

    @Nullable
    private String getMonetizationNetwork(int i11) {
        String mediationNetwork;
        String string = getCurrencyIso4217Code().getString("preInstallName");
        boolean z11 = false;
        if (string != null) {
            int i12 = f6295d + 61;
            f6296e = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 63 / 0;
            }
            return string;
        }
        if (!(!this.component1.getMonetizationNetwork("preInstallName"))) {
            mediationNetwork = this.component1.getMediationNetwork("preInstallName", null);
        } else {
            if (i11 <= 1) {
                int i14 = (f6295d + 75) % 128;
                f6296e = i14;
                f6295d = (i14 + 11) % 128;
                z11 = true;
            }
            if (!(!z11)) {
                String strEquals = equals();
                if (strEquals == null) {
                    strEquals = getRevenue("AF_PRE_INSTALL_NAME");
                }
                string = strEquals;
            }
            if (string != null) {
                f6295d = (f6296e + 43) % 128;
                this.component1.getMonetizationNetwork("preInstallName", string);
            }
            mediationNetwork = string;
        }
        if (mediationNetwork != null) {
            getCurrencyIso4217Code().set("preInstallName", mediationNetwork);
        }
        return mediationNetwork;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004a -> B:40:0x007a). Please report as a decompilation issue!!! */
    private static String getRevenue(File file, String str) {
        InputStreamReader inputStreamReader;
        try {
            try {
                if (file == null) {
                    f6295d = (f6296e + 111) % 128;
                    return null;
                }
                try {
                    Properties properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                            return property;
                        } catch (Throwable th2) {
                            AFLogger.afErrorLog(th2.getMessage(), th2);
                            return property;
                        }
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            f6296e = (f6295d + 3) % 128;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                }
            } catch (Throwable th5) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th6) {
                        AFLogger.afErrorLog(th6.getMessage(), th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            AFLogger.afErrorLog(th7.getMessage(), th7);
        }
    }

    @SuppressLint({"PrivateApi"})
    @VisibleForTesting
    @Nullable
    private static String AFAdRevenueData(@Nullable String str) {
        return (String) getMonetizationNetwork(new Object[]{str}, -1917713393, 1917713405, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r5.put("custom_install_id", java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        r5 = com.appsflyer.internal.AFg1rSDK.f6296e + 5;
        com.appsflyer.internal.AFg1rSDK.f6295d = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if ((r5 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r5.put("uid", r0);
        r0 = r4.areAllFieldsValid.getRevenue.getMonetizationNetwork("CUSTOM_INSTALL_ID_APPLIED", false);
        p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.Boolean.valueOf(r0), "");
     */
    @Override // com.appsflyer.internal.AFg1pSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        String revenue;
        int i11 = f6295d + 53;
        f6296e = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            revenue = AFb1mSDK.getRevenue(this.areAllFieldsValid.getRevenue);
            int i12 = 45 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            revenue = AFb1mSDK.getRevenue(this.areAllFieldsValid.getRevenue);
        }
    }

    private void getMonetizationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        int i11 = f6296e + 55;
        f6295d = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (!(str == null || str.length() == 0)) {
                f6296e = (f6295d + 123) % 128;
                map.put("referrer", str);
                f6296e = (f6295d + 63) % 128;
            }
            String mediationNetwork = this.component1.getMediationNetwork("extraReferrers", null);
            if (mediationNetwork != null) {
                int i12 = f6295d + 83;
                f6296e = i12 % 128;
                if (i12 % 2 == 0) {
                    map.put("extraReferrers", mediationNetwork);
                    int i13 = 31 / 0;
                } else {
                    map.put("extraReferrers", mediationNetwork);
                }
            }
            String referrer = getCurrencyIso4217Code().getReferrer(this.component1);
            if (referrer == null || referrer.length() == 0) {
                f6296e = (f6295d + 113) % 128;
                return;
            } else {
                if (map.get("referrer") == null) {
                    f6295d = (f6296e + 97) % 128;
                    map.put("referrer", referrer);
                    return;
                }
                return;
            }
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    private void getRevenue(@NotNull AFh1mSDK aFh1mSDK, @Nullable String str, @Nullable String str2, @Nullable AFb1qSDK aFb1qSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.getMonetizationNetwork;
        if (aFh1mSDK.AFAdRevenueData() == AFe1oSDK.CONVERSION) {
            f6295d = (f6296e + 13) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            getMonetizationNetwork(new Object[]{this, map}, 474322536, -474322526, System.identityHashCode(this));
            equals(map);
            toString(map);
            AFa1uSDK.getCurrencyIso4217Code(this.copydefault, this.areAllFieldsValid);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        copydefault(map);
        component3(map);
        getMonetizationNetwork(new Object[]{this, map}, -1359348315, 1359348316, System.identityHashCode(this));
        getMediationNetwork(map, str2);
        getMonetizationNetwork(map, str);
        copy(map);
        if (aFb1qSDK != null) {
            aFb1qSDK.getMediationNetwork(map);
        } else {
            f6295d = (f6296e + 109) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r12.hashCode.copy != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r12.hashCode.copy != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        com.appsflyer.internal.AFg1bSDK.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFh1ySDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        com.appsflyer.internal.AFg1bSDK.i$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFh1ySDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        return;
     */
    @Override // com.appsflyer.internal.AFg1pSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull AFe1oSDK aFe1oSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1oSDK, "");
        if (!copydefault().contains(aFe1oSDK)) {
            return;
        }
        if (this.hashCode.AFAdRevenueData()) {
            int i11 = f6295d + 109;
            f6296e = i11 % 128;
            if (i11 % 2 == 0) {
                map.put("app_set_id", MapsKt.mapOf(TuplesKt.m90091to("app_set_id_disabled", Boolean.TRUE)));
                int i12 = 45 / 0;
            } else {
                map.put("app_set_id", MapsKt.mapOf(TuplesKt.m90091to("app_set_id_disabled", Boolean.TRUE)));
            }
        } else {
            AFb1cSDK aFb1cSDK = this.hashCode.copy;
            if (aFb1cSDK != null) {
                f6295d = (f6296e + 37) % 128;
                map.put("app_set_id", MapsKt.mapOf(TuplesKt.m90091to("scope", Integer.valueOf(aFb1cSDK.getMonetizationNetwork)), TuplesKt.m90091to("id", aFb1cSDK.getMediationNetwork)));
            } else {
                int i13 = f6295d + 85;
                f6296e = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            }
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        f6296e = (f6295d + 111) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e11);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            f6295d = (f6296e + 35) % 128;
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e12);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            f6296e = (f6295d + 59) % 128;
            return null;
        } catch (Exception e13) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e13);
            return null;
        }
    }

    private void getRevenue(@NotNull Map<String, Object> map, @NotNull String str) {
        getMonetizationNetwork(new Object[]{this, map, str}, 363039209, -363039205, System.identityHashCode(this));
    }

    private static File getMonetizationNetwork(String str) {
        int i11 = f6296e + 85;
        f6295d = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                if (str != null && StringsKt.trim((CharSequence) str).toString().length() > 0) {
                    return new File(StringsKt.trim((CharSequence) str).toString());
                }
                f6295d = (f6296e + 91) % 128;
                return null;
            }
            throw null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    private static String getCurrencyIso4217Code(AFc1pSDK aFc1pSDK, String str) {
        String mediationNetwork = aFc1pSDK.getMediationNetwork("CACHED_CHANNEL", null);
        if (mediationNetwork != null) {
            int i11 = f6295d + 3;
            int i12 = i11 % 128;
            f6296e = i12;
            if (i11 % 2 == 0) {
                throw null;
            }
            f6295d = (i12 + 45) % 128;
            return mediationNetwork;
        }
        aFc1pSDK.getMonetizationNetwork("CACHED_CHANNEL", str);
        int i13 = f6296e + 99;
        f6295d = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 98 / 0;
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, -777571906, 777571913, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final long getMonetizationNetwork() {
        return ((Long) getMonetizationNetwork(new Object[]{this}, 807724532, -807724523, System.identityHashCode(this))).longValue();
    }

    private static void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        String str = aFh1mSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1mSDK.AFAdRevenueData;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    @Override // com.appsflyer.internal.AFg1pSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i11, int i12) {
        getMonetizationNetwork(new Object[]{this, map, Integer.valueOf(i11), Integer.valueOf(i12)}, 13427807, -13427805, i11);
    }
}
