package com.forter.mobile.fortersdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.autofill.HintConstants;
import com.tencent.bugly.proguard.C33872q4;
import java.io.Serializable;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.i2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6553i2 {
    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: G */
    public static void m12325G(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("mcc", true)) {
            m12323F(jSONObject, "mcc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.h1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12354d0(subscriptionInfo);
                }
            });
        }
    }

    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: P */
    public static void m12336P(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("mnc", true)) {
            m12323F(jSONObject, "mnc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.f1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12346Z(subscriptionInfo);
                }
            });
        }
    }

    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: W */
    public static void m12343W(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("icc", true)) {
            Objects.requireNonNull(subscriptionInfo);
            m12323F(jSONObject, "icc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.w1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return subscriptionInfo.getCountryIso();
                }
            });
        }
    }

    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: b0 */
    public static void m12350b0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("carrierName", true)) {
            Objects.requireNonNull(subscriptionInfo);
            m12323F(jSONObject, "carrierName", new C6635z.a() { // from class: com.forter.mobile.fortersdk.e1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return subscriptionInfo.getCarrierName();
                }
            });
        }
    }

    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: f0 */
    public static void m12358f0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("dataRoaming", true)) {
            Objects.requireNonNull(subscriptionInfo);
            m12323F(jSONObject, "dataRoaming", new C6635z.a() { // from class: com.forter.mobile.fortersdk.a2
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return Integer.valueOf(subscriptionInfo.getDataRoaming());
                }
            });
        }
    }

    @NonNull
    @RequiresPermission(C33872q4.f71536c)
    /* JADX INFO: renamed from: A */
    public static String m12313A(@NonNull Context context) {
        try {
            TelephonyManager telephonyManagerM12330J = m12330J(context);
            return telephonyManagerM12330J == null ? "FAILURE" : m12397z(telephonyManagerM12330J.getNetworkType());
        } catch (Throwable unused) {
            return "FAILURE";
        }
    }

    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: A0 */
    public static void m12314A0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("iccId")) {
            m12323F(jSONObject, "iccId", new C6635z.a() { // from class: com.forter.mobile.fortersdk.r1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12315B(subscriptionInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static void m12316B0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || !jSONObject2.optBoolean("simSpecificCarrier") || Build.VERSION.SDK_INT < 29) {
            return;
        }
        m12323F(jSONObject, "simSpecificCarrier", new C6635z.a() { // from class: com.forter.mobile.fortersdk.v1
            @Override // com.forter.mobile.fortersdk.C6635z.a
            /* JADX INFO: renamed from: a */
            public final Object mo12072a() {
                return AbstractC6553i2.m12348a0(telephonyManager);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m12317C(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : m12335O(telephonyManager.getSimOperator());
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ String m12318C0(TelephonyManager telephonyManager) throws Throwable {
        if (telephonyManager == null) {
            return "FAILURE";
        }
        return m12397z(Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType());
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m12319D(TelephonyManager telephonyManager, int i11) throws Throwable {
        int simState;
        if (telephonyManager == null) {
            return "FAILURE";
        }
        if (Build.VERSION.SDK_INT >= 26) {
            simState = telephonyManager.getSimState(i11);
        } else {
            try {
                Object objInvoke = TelephonyManager.class.getDeclaredMethod("getSimState", Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i11));
                if (objInvoke instanceof Integer) {
                    return m12331K(((Integer) objInvoke).intValue());
                }
            } catch (Throwable unused) {
            }
            simState = 0;
        }
        return m12331K(simState);
    }

    @NonNull
    /* JADX INFO: renamed from: E */
    public static String m12321E(@Nullable String str) {
        return (str == null || str.length() < 3) ? "FAILURE" : str.substring(0, 3);
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ String m12322E0(TelephonyManager telephonyManager) throws Throwable {
        if (telephonyManager == null) {
            return "FAILURE";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return telephonyManager.getManufacturerCode();
        }
        String meid = telephonyManager.getMeid();
        return (meid == null || meid.length() < 8) ? "FAILURE" : meid.substring(0, 8);
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ String m12326G0(TelephonyManager telephonyManager) throws Throwable {
        if (telephonyManager == null) {
            return "FAILURE";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return telephonyManager.getTypeAllocationCode();
        }
        String imei = telephonyManager.getImei();
        return (imei == null || imei.length() < 8) ? "FAILURE" : imei.substring(0, 8);
    }

    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: I */
    public static void m12329I(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NonNull final TelephonyManager telephonyManager, final int i11) {
        if (jSONObject2 == null || !jSONObject2.optBoolean("imei")) {
            return;
        }
        m12323F(jSONObject, "imei", new C6635z.a() { // from class: com.forter.mobile.fortersdk.s1
            @Override // com.forter.mobile.fortersdk.C6635z.a
            /* JADX INFO: renamed from: a */
            public final Object mo12072a() {
                return AbstractC6553i2.m12342V(telephonyManager, i11);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public static TelephonyManager m12330J(@NonNull Context context) {
        try {
            return (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ String m12333M(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : m12321E(telephonyManager.getSimOperator());
    }

    @NonNull
    /* JADX INFO: renamed from: O */
    public static String m12335O(@Nullable String str) {
        return (str == null || str.length() <= 3) ? "FAILURE" : str.substring(3);
    }

    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: Q */
    public static void m12337Q(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("manufacturerCode", true)) {
            m12323F(jSONObject, "manufacturerCode", new C6635z.a() { // from class: com.forter.mobile.fortersdk.q1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12322E0(telephonyManager);
                }
            });
        }
    }

    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: R */
    public static void m12338R(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @NonNull final TelephonyManager telephonyManager, final int i11) {
        if (jSONObject2 == null || !jSONObject2.optBoolean("meid")) {
            return;
        }
        m12323F(jSONObject, "meid", new C6635z.a() { // from class: com.forter.mobile.fortersdk.c2
            @Override // com.forter.mobile.fortersdk.C6635z.a
            /* JADX INFO: renamed from: a */
            public final Object mo12072a() {
                return AbstractC6553i2.m12334N(telephonyManager, i11);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ String m12341U(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : telephonyManager.getSimCountryIso();
    }

    @RequiresPermission(C33872q4.f71536c)
    /* JADX INFO: renamed from: X */
    public static void m12344X(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("networkType", true)) {
            m12323F(jSONObject, "networkType", new C6635z.a() { // from class: com.forter.mobile.fortersdk.l1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12318C0(telephonyManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m12345Y(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager, final int i11) {
        if (jSONObject2 == null || jSONObject2.optBoolean("simState", true)) {
            m12323F(jSONObject, "state", new C6635z.a() { // from class: com.forter.mobile.fortersdk.o1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12319D(telephonyManager, i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ Serializable m12346Z(SubscriptionInfo subscriptionInfo) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return subscriptionInfo.getMncString();
        }
        int mnc = subscriptionInfo.getMnc();
        if (mnc != 0) {
            return Integer.valueOf(mnc);
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ CharSequence m12348a0(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : telephonyManager.getSimSpecificCarrierIdName();
    }

    /* JADX INFO: renamed from: c0 */
    public static void m12352c0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("phoneType", true)) {
            m12323F(jSONObject, "phoneType", new C6635z.a() { // from class: com.forter.mobile.fortersdk.g2
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12398z0(telephonyManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ Serializable m12354d0(SubscriptionInfo subscriptionInfo) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return subscriptionInfo.getMccString();
        }
        int mcc = subscriptionInfo.getMcc();
        if (mcc != 0) {
            return Integer.valueOf(mcc);
        }
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ String m12356e0(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : telephonyManager.getSimOperatorName();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m12360g0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("isRoaming", true)) {
            m12323F(jSONObject, "isRoaming", new C6635z.a() { // from class: com.forter.mobile.fortersdk.g1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12392w0(telephonyManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ String m12362h0(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : m12335O(telephonyManager.getNetworkOperator());
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_NETWORK_STATE", C33872q4.f71536c})
    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: j0 */
    public static void m12366j0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("isDataRoaming", true)) {
            m12323F(jSONObject, "isDataRoaming", new C6635z.a() { // from class: com.forter.mobile.fortersdk.j1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12386t0(telephonyManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ String m12368k0(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : m12321E(telephonyManager.getNetworkOperator());
    }

    /* JADX INFO: renamed from: m0 */
    public static void m12372m0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("netOperator", true)) {
            m12323F(jSONObject, "netOperator", new C6635z.a() { // from class: com.forter.mobile.fortersdk.h2
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12380q0(telephonyManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ String m12374n0(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : telephonyManager.getNetworkCountryIso();
    }

    /* JADX INFO: renamed from: p0 */
    public static void m12378p0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("netIcc", true)) {
            m12323F(jSONObject, "netIcc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.n1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12374n0(telephonyManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ String m12380q0(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : telephonyManager.getNetworkOperatorName();
    }

    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: r0 */
    public static void m12382r0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("cardId")) {
            m12323F(jSONObject, "cardId", new C6635z.a() { // from class: com.forter.mobile.fortersdk.p1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12332L(subscriptionInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static void m12384s0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("netMcc", true)) {
            m12323F(jSONObject, "netMcc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.t1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12368k0(telephonyManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ Serializable m12386t0(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : Boolean.valueOf(telephonyManager.isDataRoamingEnabled());
    }

    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: u0 */
    public static void m12388u0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("carrierId")) {
            Objects.requireNonNull(subscriptionInfo);
            m12323F(jSONObject, "carrierId", new C6635z.a() { // from class: com.forter.mobile.fortersdk.d2
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return Integer.valueOf(subscriptionInfo.getCarrierId());
                }
            });
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static void m12390v0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 == null || jSONObject2.optBoolean("netMnc", true)) {
            m12323F(jSONObject, "netMnc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.f2
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12362h0(telephonyManager);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ Serializable m12392w0(TelephonyManager telephonyManager) throws Throwable {
        return telephonyManager == null ? "FAILURE" : Boolean.valueOf(telephonyManager.isNetworkRoaming());
    }

    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: x0 */
    public static void m12394x0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("isOppor")) {
            Objects.requireNonNull(subscriptionInfo);
            m12323F(jSONObject, "isOppor", new C6635z.a() { // from class: com.forter.mobile.fortersdk.z1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return Boolean.valueOf(subscriptionInfo.isOpportunistic());
                }
            });
        }
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    /* JADX INFO: renamed from: y */
    public static String m12395y() {
        try {
            return Build.VERSION.SDK_INT >= 26 ? Build.getSerial() : Build.SERIAL;
        } catch (Exception unused) {
            return "FAILURE";
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ String m12398z0(TelephonyManager telephonyManager) throws Throwable {
        if (telephonyManager == null) {
            return "FAILURE";
        }
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType == 0) {
            return "NONE";
        }
        if (phoneType == 1) {
            return "GSM";
        }
        if (phoneType != 2) {
            return phoneType != 3 ? "UNKNOWN" : "SIP";
        }
        return "CDMA";
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m12315B(SubscriptionInfo subscriptionInfo) throws Throwable {
        String iccId = subscriptionInfo.getIccId();
        if (TextUtils.isEmpty(iccId)) {
            return iccId;
        }
        return AbstractC6539f3.m12289w(iccId);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m12320D0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 != null && !jSONObject2.optBoolean("simIcc", true)) {
            return;
        }
        m12323F(jSONObject, "simIcc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.m1
            @Override // com.forter.mobile.fortersdk.C6635z.a
            /* JADX INFO: renamed from: a */
            public final Object mo12072a() {
                return AbstractC6553i2.m12341U(telephonyManager);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static <T> void m12323F(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull C6635z.a<T> aVar) {
        String strValueOf;
        try {
            T tMo12072a = aVar.mo12072a();
            if (tMo12072a != null) {
                strValueOf = String.valueOf(tMo12072a);
            } else {
                strValueOf = "";
            }
        } catch (Throwable th2) {
            if (th2 instanceof SecurityException) {
                strValueOf = "NO_PERMISSION";
            } else {
                strValueOf = "FAILURE";
            }
        }
        C6571m0.m12428b(jSONObject, str, strValueOf);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m12324F0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 != null && !jSONObject2.optBoolean("simMcc", true)) {
            return;
        }
        m12323F(jSONObject, "simMcc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.b2
            @Override // com.forter.mobile.fortersdk.C6635z.a
            /* JADX INFO: renamed from: a */
            public final Object mo12072a() {
                return AbstractC6553i2.m12333M(telephonyManager);
            }
        });
    }

    @RequiresApi(api = 26)
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: H */
    public static void m12327H(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 != null && !jSONObject2.optBoolean("typeAllocationCode", true)) {
            return;
        }
        m12323F(jSONObject, "typeAllocationCode", new C6635z.a() { // from class: com.forter.mobile.fortersdk.i1
            @Override // com.forter.mobile.fortersdk.C6635z.a
            /* JADX INFO: renamed from: a */
            public final Object mo12072a() {
                return AbstractC6553i2.m12326G0(telephonyManager);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public static void m12328H0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 != null && !jSONObject2.optBoolean("simMnc", true)) {
            return;
        }
        m12323F(jSONObject, "simMnc", new C6635z.a() { // from class: com.forter.mobile.fortersdk.u1
            @Override // com.forter.mobile.fortersdk.C6635z.a
            /* JADX INFO: renamed from: a */
            public final Object mo12072a() {
                return AbstractC6553i2.m12317C(telephonyManager);
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: K */
    public static String m12331K(int i11) {
        switch (i11) {
            case 1:
                return "ABSENT";
            case 2:
                return "PIN_REQUIRED";
            case 3:
                return "PUK_REQUIRED";
            case 4:
                return "NETWORK_LOCKED";
            case 5:
                return "READY";
            case 6:
                return "NOT_READY";
            case 7:
                return "PERM_DISABLED";
            case 8:
                return "CARD_IO_ERROR";
            case 9:
                return "CARD_RESTRICTED";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ String m12332L(SubscriptionInfo subscriptionInfo) throws Throwable {
        int cardId = subscriptionInfo.getCardId();
        if (-1 == cardId) {
            return "UNSUPPORTED";
        }
        if (-2 == cardId) {
            return "UNINITIALIZED";
        }
        return AbstractC6539f3.m12289w(String.valueOf(cardId));
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ String m12334N(TelephonyManager telephonyManager, int i11) throws Throwable {
        String meid = telephonyManager.getMeid(i11);
        if (TextUtils.isEmpty(meid)) {
            return meid;
        }
        return AbstractC6539f3.m12289w(meid);
    }

    @Nullable
    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: S */
    public static SubscriptionManager m12339S(@NonNull Context context) {
        try {
            return (SubscriptionManager) context.getSystemService("telephony_subscription_service");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ String m12340T(SubscriptionInfo subscriptionInfo) throws Throwable {
        int subscriptionType = subscriptionInfo.getSubscriptionType();
        if (subscriptionType != 0) {
            if (subscriptionType != 1) {
                return "UNKNOWN";
            }
            return "REMOTE";
        }
        return "LOCAL";
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ String m12342V(TelephonyManager telephonyManager, int i11) throws Throwable {
        String imei = telephonyManager.getImei(i11);
        if (TextUtils.isEmpty(imei)) {
            return imei;
        }
        return AbstractC6539f3.m12289w(imei);
    }

    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: i0 */
    public static void m12364i0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("subId")) {
            Objects.requireNonNull(subscriptionInfo);
            m12323F(jSONObject, "subId", new C6635z.a() { // from class: com.forter.mobile.fortersdk.y1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return Integer.valueOf(subscriptionInfo.getSubscriptionId());
                }
            });
        }
    }

    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: l0 */
    public static void m12370l0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("subName")) {
            Objects.requireNonNull(subscriptionInfo);
            m12323F(jSONObject, "subName", new C6635z.a() { // from class: com.forter.mobile.fortersdk.k1
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return subscriptionInfo.getDisplayName();
                }
            });
        }
    }

    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: o0 */
    public static void m12376o0(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull final SubscriptionInfo subscriptionInfo) {
        if (jSONObject2.optBoolean("subType")) {
            m12323F(jSONObject, "subType", new C6635z.a() { // from class: com.forter.mobile.fortersdk.e2
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6553i2.m12340T(subscriptionInfo);
                }
            });
        }
    }

    @Nullable
    @RequiresApi(api = 22)
    /* JADX INFO: renamed from: x */
    public static SubscriptionInfo m12393x(@NonNull SubscriptionManager subscriptionManager, int i11) {
        try {
            return subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(i11);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m12396y0(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable final TelephonyManager telephonyManager) {
        if (jSONObject2 != null && !jSONObject2.optBoolean("simCarrier", true)) {
            return;
        }
        m12323F(jSONObject, "simCarrier", new C6635z.a() { // from class: com.forter.mobile.fortersdk.x1
            @Override // com.forter.mobile.fortersdk.C6635z.a
            /* JADX INFO: renamed from: a */
            public final Object mo12072a() {
                return AbstractC6553i2.m12356e0(telephonyManager);
            }
        });
    }

    @NonNull
    /* JADX INFO: renamed from: z */
    public static String m12397z(int i11) {
        switch (i11) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "CDMA - EvDo rev. 0";
            case 6:
                return "CDMA - EvDo rev. A";
            case 7:
                return "CDMA - 1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "iDEN";
            case 12:
                return "CDMA - EvDo rev. B";
            case 13:
                return "LTE";
            case 14:
                return "CDMA - eHRPD";
            case 15:
                return "HSPA+";
            case 16:
                return "GSM";
            case 17:
                return "TD_SCDMA";
            case 18:
                return "IWLAN";
            case 19:
                return "LTE_CA";
            case 20:
                return "NR";
            default:
                return "UNKNOWN";
        }
    }
}
