package com.appsflyer.internal;

import android.content.Context;
import android.media.AudioTrack;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char areAllFieldsValid = 28972;
    private static char component4 = 39723;
    private static int copy = 0;
    private static char copydefault = 50688;
    private static char equals = 3892;
    private static int toString = 1;
    private boolean AFAdRevenueData = false;
    private volatile boolean component1 = false;
    private volatile String component2;

    @Nullable
    private volatile String component3;
    private long getCurrencyIso4217Code;

    @NonNull
    private final AFf1gSDK getMediationNetwork;

    @NonNull
    private final AFc1fSDK getMonetizationNetwork;
    Map<String, Object> getRevenue;

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (i11 * 881) + (i12 * 881) + (((~(i15 | i13)) | (~(i14 | i15)) | (~(i14 | i13))) * (-880));
        int i17 = i12 | (~(i14 | (~i13)));
        int i18 = ~(i11 | i13);
        int i19 = i16 + ((i17 | i18) * (-880)) + (i18 * 880);
        if (i19 == 1) {
            return AFAdRevenueData(objArr);
        }
        if (i19 == 2) {
            return getMonetizationNetwork(objArr);
        }
        AFf1fSDK aFf1fSDK = (AFf1fSDK) objArr[0];
        toString = (copy + 95) % 128;
        String str = aFf1fSDK.component3;
        toString = (copy + 69) % 128;
        return str;
    }

    public static void getRevenue(AFh1mSDK aFh1mSDK, byte[] bArr) throws Throwable {
        try {
            new AFb1sSDK(aFh1mSDK, bArr).afInfoLog();
            int i11 = toString + 105;
            copy = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 90 / 0;
            }
        } catch (Exception e11) {
            AFLogger.INSTANCE.m5975e(AFh1ySDK.SECURITY, "native: reflection init failed", e11, false, false, true);
        }
    }

    public final void getCurrencyIso4217Code(String str) {
        toString = (copy + 85) % 128;
        this.component2 = str;
        int i11 = toString + 37;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public final boolean getMediationNetwork() {
        int i11 = toString + 31;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            return this.component1;
        }
        int i12 = 9 / 0;
        return this.component1;
    }

    @Nullable
    public final String getMonetizationNetwork() {
        int i11 = copy + 19;
        toString = i11 % 128;
        if (i11 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: a */
    private static void m5965a(String str, int i11, Object[] objArr) {
        char[] charArray;
        if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 23) % 128;
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
            int i13 = $11 + 105;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr3[1] = cArr[i12];
                cArr3[0] = cArr[i12];
            } else {
                cArr3[0] = cArr[i12];
                cArr3[1] = cArr[i12 + 1];
            }
            int i14 = 58224;
            for (int i15 = 0; i15 < 16; i15++) {
                char c11 = cArr3[1];
                char c12 = cArr3[0];
                char c13 = (char) (c11 - (((c12 + i14) ^ ((c12 << 4) + ((char) (((long) equals) ^ (-1199070254561146252L))))) ^ ((c12 >>> 5) + ((char) (((long) copydefault) ^ (-1199070254561146252L))))));
                cArr3[1] = c13;
                cArr3[0] = (char) (c12 - (((c13 >>> 5) + ((char) (((long) areAllFieldsValid) ^ (-1199070254561146252L)))) ^ ((c13 + i14) ^ ((c13 << 4) + ((char) (((long) component4) ^ (-1199070254561146252L)))))));
                i14 -= 40503;
            }
            int i16 = aFk1iSDK.getMonetizationNetwork;
            cArr2[i16] = cArr3[0];
            cArr2[i16 + 1] = cArr3[1];
            aFk1iSDK.getMonetizationNetwork = i16 + 2;
        }
    }

    private boolean component1() {
        Map<String, Object> map = this.getRevenue;
        if (map == null) {
            return false;
        }
        toString = (copy + 91) % 128;
        if (map.isEmpty()) {
            return false;
        }
        int i11 = (toString + 11) % 128;
        copy = i11;
        toString = (i11 + 85) % 128;
        return true;
    }

    @VisibleForTesting
    private long component2() {
        long j11;
        int i11 = toString;
        int i12 = i11 + 99;
        copy = i12 % 128;
        if (i12 % 2 != 0) {
            j11 = this.getCurrencyIso4217Code;
            int i13 = 66 / 0;
        } else {
            j11 = this.getCurrencyIso4217Code;
        }
        copy = (i11 + 5) % 128;
        return j11;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        AFc1hSDK aFc1hSDK = new AFc1hSDK(map, this.getMonetizationNetwork.getMonetizationNetwork);
        int i11 = toString + 63;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 89 / 0;
        }
        return aFc1hSDK;
    }

    public final void getMonetizationNetwork(boolean z11) {
        copy = (toString + 75) % 128;
        this.component1 = z11;
        int i11 = toString + 1;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public AFf1fSDK(@NonNull AFc1fSDK aFc1fSDK, @NonNull AFf1gSDK aFf1gSDK) {
        this.getMonetizationNetwork = aFc1fSDK;
        this.getMediationNetwork = aFf1gSDK;
    }

    public final void areAllFieldsValid() {
        AFAdRevenueData(new Object[]{this}, -1855678744, 1855678746, System.identityHashCode(this));
    }

    public final void AFAdRevenueData(@NonNull String str) {
        toString = (copy + 11) % 128;
        this.component3 = str;
        int i11 = copy + 13;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 18 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    @Nullable
    public final String getCurrencyIso4217Code(AFc1pSDK aFc1pSDK) {
        String str;
        toString = (copy + 27) % 128;
        boolean z11 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String mediationNetwork = aFc1pSDK.getMediationNetwork("imeiCached", null);
        if (z11 && AFk1wSDK.AFAdRevenueData(this.component3)) {
            int i11 = copy + 97;
            toString = i11 % 128;
            if (i11 % 2 != 0) {
                Context context = this.getMonetizationNetwork.getMonetizationNetwork;
                if (context == null || !getMediationNetwork(context)) {
                    str = null;
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                        str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                        if (str == null) {
                            if (mediationNetwork != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(mediationNetwork));
                            } else {
                                mediationNetwork = null;
                            }
                            str = mediationNetwork;
                        }
                    } catch (InvocationTargetException e11) {
                        if (mediationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(mediationNetwork));
                        } else {
                            mediationNetwork = null;
                        }
                        StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                        sb2.append(e11.getMessage());
                        AFLogger.afErrorLog(sb2.toString(), e11);
                    } catch (Exception e12) {
                        if (mediationNetwork != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(mediationNetwork));
                        } else {
                            mediationNetwork = null;
                        }
                        StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                        sb3.append(e12.getMessage());
                        AFLogger.afErrorLog(sb3.toString(), e12);
                    }
                }
            } else {
                Context context2 = this.getMonetizationNetwork.getMonetizationNetwork;
                throw null;
            }
        } else if (this.component3 != null) {
            str = this.component3;
        } else {
            str = null;
        }
        if (!AFk1wSDK.AFAdRevenueData(str)) {
            copy = (toString + 105) % 128;
            aFc1pSDK.getMonetizationNetwork("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        int i12 = copy + 75;
        toString = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void getRevenue(AFc1kSDK aFc1kSDK) {
        this.getCurrencyIso4217Code = System.currentTimeMillis();
        this.AFAdRevenueData = this.getMediationNetwork.getMonetizationNetwork(AFAdRevenueData(aFc1kSDK), this.getMonetizationNetwork.getMonetizationNetwork, new AFf1gSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFf1fSDK.3
            @Override // com.appsflyer.internal.AFf1gSDK.AFa1tSDK
            public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
                AFf1fSDK.this.getRevenue = new ConcurrentHashMap();
                AFf1fSDK.this.getRevenue.put("signedData", str);
                AFf1fSDK.this.getRevenue.put(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, str2);
                AFf1fSDK aFf1fSDK = AFf1fSDK.this;
                AFf1fSDK.AFAdRevenueData(new Object[]{aFf1fSDK}, -1855678744, 1855678746, System.identityHashCode(aFf1fSDK));
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1gSDK.AFa1tSDK
            public final void AFAdRevenueData(String str, Exception exc) {
                AFf1fSDK.this.getRevenue = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1fSDK aFf1fSDK = AFf1fSDK.this;
                AFf1fSDK.AFAdRevenueData(new Object[]{aFf1fSDK}, -1855678744, 1855678746, System.identityHashCode(aFf1fSDK));
                AFf1fSDK.this.getRevenue.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        copy = (toString + 79) % 128;
    }

    private static boolean getMediationNetwork(Context context) {
        return ((Boolean) AFAdRevenueData(new Object[]{context}, 9534514, -9534513, (int) System.currentTimeMillis())).booleanValue();
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getMonetizationNetwork.getMonetizationNetwork};
                Map map2 = AFa1hSDK.f6283e;
                Object declaredConstructor = map2.get(460410069);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1hSDK.getMediationNetwork((ViewConfiguration.getScrollBarSize() >> 8) + 124, (char) (9852 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 37 - TextUtils.getOffsetBefore("", 0))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(460410069, declaredConstructor);
                }
                Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                toString = (copy + 65) % 128;
                return map3;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.m5975e(AFh1ySDK.ANTI_FRAUD, "AFCksmV3: reflection init failed", th3, false, false, true);
            return new HashMap();
        }
    }

    public final boolean AFAdRevenueData() {
        toString = (copy + 47) % 128;
        if (!this.AFAdRevenueData || component1()) {
            return false;
        }
        toString = (copy + 89) % 128;
        return true;
    }

    @VisibleForTesting
    private long AFAdRevenueData(AFc1kSDK aFc1kSDK) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFb1mSDK.getRevenue(aFc1kSDK.getRevenue));
        sb2.append(component2());
        long currencyIso4217Code = AFj1dSDK.getCurrencyIso4217Code(AFj1dSDK.getRevenue(sb2.toString()));
        toString = (copy + 101) % 128;
        return currencyIso4217Code;
    }

    public static boolean getRevenue(AFh1mSDK aFh1mSDK, AFc1kSDK aFc1kSDK) {
        String str;
        int i11 = toString + 21;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            if (!AFk1wSDK.AFAdRevenueData(aFc1kSDK.getMonetizationNetwork)) {
                int i12 = toString + 55;
                copy = i12 % 128;
                if (i12 % 2 != 0) {
                    str = aFc1kSDK.getMonetizationNetwork;
                    int i13 = 66 / 0;
                } else {
                    str = aFc1kSDK.getMonetizationNetwork;
                }
            } else {
                String currencyIso4217Code = aFc1kSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
                if (AFk1wSDK.AFAdRevenueData(currencyIso4217Code)) {
                    str = null;
                } else {
                    String strSubstring = currencyIso4217Code.substring(0, 8);
                    aFc1kSDK.getMonetizationNetwork = strSubstring;
                    str = strSubstring;
                }
            }
            if (str != null && !str.isEmpty()) {
                try {
                    Map<String, Object> map = aFh1mSDK.getMonetizationNetwork;
                    Object[] objArr = new Object[1];
                    m5965a("颸╊Џ誢䚯ྸ\uf0ec⣑缞腁羥燓", '<' - AndroidCharacter.getMirror('0'), objArr);
                    long j11 = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
                    char[] charArray = str.toCharArray();
                    int i14 = ((int) (j11 % 94)) + 33;
                    int i15 = 0;
                    while (i15 < charArray.length) {
                        int i16 = toString + 61;
                        copy = i16 % 128;
                        if (i16 % 2 != 0) {
                            charArray[i15] = (char) (charArray[i15] ^ i14);
                            i15 += 63;
                        } else {
                            charArray[i15] = (char) (charArray[i15] ^ i14);
                            i15++;
                        }
                    }
                    aFh1mSDK.getCurrencyIso4217Code.put("af-sdk-sbid", Base64.encodeToString(new String(charArray).getBytes(Charset.defaultCharset()), 2));
                    return true;
                } catch (Exception e11) {
                    AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "Exception occurred while generating sbid ", e11);
                    return false;
                }
            }
            int i17 = toString + 11;
            copy = i17 % 128;
            if (i17 % 2 == 0) {
                return false;
            }
            throw null;
        }
        AFk1wSDK.AFAdRevenueData(aFc1kSDK.getMonetizationNetwork);
        throw null;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        long jCurrentTimeMillis;
        AFf1fSDK aFf1fSDK = (AFf1fSDK) objArr[0];
        int i11 = toString + 81;
        copy = i11 % 128;
        if (i11 % 2 != 0) {
            jCurrentTimeMillis = System.currentTimeMillis() * aFf1fSDK.getCurrencyIso4217Code;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - aFf1fSDK.getCurrencyIso4217Code;
        }
        aFf1fSDK.getRevenue.put("ttr", Long.valueOf(jCurrentTimeMillis));
        aFf1fSDK.getRevenue.put("lvl_timestamp", Long.valueOf(aFf1fSDK.component2()));
        int i12 = toString + 73;
        copy = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        boolean z11 = false;
        Context context = (Context) objArr[0];
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            z11 = true;
        } else {
            toString = (copy + 45) % 128;
        }
        if (!z11) {
            AFa1ySDK.getMonetizationNetwork();
            if (AFa1ySDK.getRevenue(context)) {
                return Boolean.FALSE;
            }
        }
        int i11 = toString + 45;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    @NonNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap map = new HashMap();
        if (!(!component1())) {
            toString = (copy + 103) % 128;
            map.put("lvl", this.getRevenue);
            copy = (toString + 69) % 128;
            return map;
        }
        if (this.AFAdRevenueData) {
            this.getRevenue = new HashMap();
            AFAdRevenueData(new Object[]{this}, -1855678744, 1855678746, System.identityHashCode(this));
            this.getRevenue.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "pending LVL response");
            map.put("lvl", this.getRevenue);
        }
        return map;
    }

    @Nullable
    public final String getRevenue() {
        return (String) AFAdRevenueData(new Object[]{this}, -40073417, 40073417, System.identityHashCode(this));
    }
}
