package com.appsflyer.internal;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes34.dex */
public class AFf1tSDK extends AFe1cSDK<String> {
    private static final AFe1oSDK[] AFInAppEventParameterName = {AFe1oSDK.DLSDK, AFe1oSDK.ONELINK, AFe1oSDK.REGISTER};
    private final AFc1fSDK AFInAppEventType;
    private final AFf1dSDK AFKeystoreWrapper;
    protected final AFc1pSDK component1;
    protected final AFg1pSDK copy;
    private final AFe1vSDK copydefault;

    @NonNull
    private final AFc1kSDK equals;
    private final AFf1iSDK hashCode;
    private final AFh1mSDK toString;

    public AFf1tSDK(@NonNull AFh1mSDK aFh1mSDK, @NonNull AFd1zSDK aFd1zSDK) {
        this(aFh1mSDK, aFd1zSDK, null);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    @Override // com.appsflyer.internal.AFe1cSDK
    public final AFd1iSDK<String> AFAdRevenueData(@NonNull String str) {
        double d11;
        JSONObject jSONObject;
        String string;
        String strReplaceAll;
        Exception exc;
        String str2;
        getMonetizationNetwork(this.toString);
        if (this.toString.getMonetizationNetwork.containsKey("meta")) {
            try {
                d11 = this.hashCode.getMonetizationNetwork.getMediationNetwork.getRevenue.AFAdRevenueData.getMediationNetwork;
            } catch (NullPointerException unused) {
                d11 = 1.0d;
            }
            if (AFh1mSDK.getMonetizationNetwork(d11)) {
                this.toString.getMonetizationNetwork.remove("meta");
            }
        }
        AFd1mSDK aFd1mSDK = ((AFe1cSDK) this).component4;
        AFd1iSDK<String> aFd1iSDK = (AFd1iSDK) AFd1mSDK.getMonetizationNetwork(new Object[]{aFd1mSDK, this.toString, str, this.AFInAppEventType}, 364095913, -364095911, System.identityHashCode(aFd1mSDK));
        Map<String, Object> map = this.toString.getMonetizationNetwork;
        try {
            jSONObject = new JSONObject(map);
            try {
                string = jSONObject.toString();
                try {
                    if (string == null) {
                        throw new NullPointerException("JSON toString of eventParams map returns null");
                    }
                    strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
                    str2 = string != null ? string : "";
                    if (strReplaceAll.equals(str2)) {
                        strReplaceAll = str2;
                    } else {
                        AFLogger.INSTANCE.m5978w(AFh1ySDK.GENERAL, "Payload contains non-printing characters");
                        try {
                            jSONObject = new JSONObject(strReplaceAll);
                        } catch (JSONException e11) {
                            AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "Couldn't parse the payload to a json object", e11);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": preparing data: ");
                    AFh1zSDK.getCurrencyIso4217Code(sb2.toString(), jSONObject);
                    this.areAllFieldsValid.AFAdRevenueData(aFd1iSDK != null ? aFd1iSDK.getRevenue.getCurrencyIso4217Code : null, strReplaceAll);
                    return aFd1iSDK;
                } catch (NullPointerException e12) {
                    e = e12;
                    AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Map map2 = AFa1hSDK.f6283e;
                        Object method = map2.get(1143898888);
                        if (method == null) {
                            method = ((Class) AFa1hSDK.getMediationNetwork((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 198, (char) (7898 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 37)).getMethod("getCurrencyIso4217Code", Map.class);
                            map2.put(1143898888, method);
                        }
                        String str3 = (String) ((Method) method).invoke(null, objArr);
                        try {
                            if (str3 == null) {
                                throw new NullPointerException("JSON toString of eventParams map returns null");
                            }
                            strReplaceAll = str3.replaceAll("\\p{C}", "*Non-printing character*");
                            string = str3;
                        } catch (NullPointerException e13) {
                            e = e13;
                            string = str3;
                            AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "AFJsonObject return null String object.", e);
                            strReplaceAll = "";
                        } catch (Exception e14) {
                            exc = e14;
                            string = str3;
                            AFLogger.INSTANCE.m5975e(AFh1ySDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            strReplaceAll = "";
                        } catch (Throwable th2) {
                            th = th2;
                            string = str3;
                            AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "Unexpected error", th);
                            strReplaceAll = "";
                        }
                    } catch (Throwable th3) {
                        try {
                            Throwable cause = th3.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th3;
                        } catch (NullPointerException e15) {
                            e = e15;
                            AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "AFJsonObject return null String object.", e);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.m5978w(AFh1ySDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this);
                            sb3.append(": preparing data: ");
                            AFh1zSDK.getCurrencyIso4217Code(sb3.toString(), jSONObject);
                            this.areAllFieldsValid.AFAdRevenueData(aFd1iSDK != null ? aFd1iSDK.getRevenue.getCurrencyIso4217Code : null, strReplaceAll);
                            return aFd1iSDK;
                        } catch (Exception e16) {
                            exc = e16;
                            AFLogger.INSTANCE.m5975e(AFh1ySDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.m5978w(AFh1ySDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this);
                            sb4.append(": preparing data: ");
                            AFh1zSDK.getCurrencyIso4217Code(sb4.toString(), jSONObject);
                            this.areAllFieldsValid.AFAdRevenueData(aFd1iSDK != null ? aFd1iSDK.getRevenue.getCurrencyIso4217Code : null, strReplaceAll);
                            return aFd1iSDK;
                        } catch (Throwable th4) {
                            th = th4;
                            AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "Unexpected error", th);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.m5978w(AFh1ySDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(this);
                            sb5.append(": preparing data: ");
                            AFh1zSDK.getCurrencyIso4217Code(sb5.toString(), jSONObject);
                            this.areAllFieldsValid.AFAdRevenueData(aFd1iSDK != null ? aFd1iSDK.getRevenue.getCurrencyIso4217Code : null, strReplaceAll);
                            return aFd1iSDK;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "Unexpected error", th);
                    strReplaceAll = "";
                }
            } catch (NullPointerException e17) {
                e = e17;
                string = null;
            } catch (Throwable th6) {
                th = th6;
                string = null;
            }
        } catch (NullPointerException e18) {
            e = e18;
            jSONObject = null;
            string = null;
        } catch (Throwable th7) {
            th = th7;
            jSONObject = null;
            string = null;
        }
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public boolean equals() {
        return true;
    }

    public AFf1tSDK(@NonNull AFh1mSDK aFh1mSDK, @NonNull AFd1zSDK aFd1zSDK, String str) {
        super(aFh1mSDK.AFAdRevenueData(), new AFe1oSDK[]{AFe1oSDK.RC_CDN, AFe1oSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.toString = aFh1mSDK;
        this.copydefault = aFd1zSDK.registerClient();
        this.component1 = aFd1zSDK.component4();
        this.hashCode = aFd1zSDK.areAllFieldsValid();
        this.AFInAppEventType = aFd1zSDK.AFInAppEventParameterName();
        this.equals = aFd1zSDK.getCurrencyIso4217Code();
        this.copy = aFd1zSDK.component2();
        this.AFKeystoreWrapper = aFd1zSDK.afDebugLog();
        for (AFe1oSDK aFe1oSDK : AFInAppEventParameterName) {
            if (this.getMediationNetwork == aFe1oSDK) {
                return;
            }
        }
        int i11 = this.toString.component2;
        AFe1oSDK aFe1oSDK2 = this.getMediationNetwork;
        if (i11 > 0) {
            this.getRevenue.add(AFe1oSDK.CONVERSION);
        } else {
            AFe1oSDK aFe1oSDK3 = AFe1oSDK.CONVERSION;
            if (aFe1oSDK2 != aFe1oSDK3) {
                this.getMonetizationNetwork.add(aFe1oSDK3);
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.toString.getRevenue;
    }

    public void component2(AFh1mSDK aFh1mSDK) {
        this.copy.getMonetizationNetwork(aFh1mSDK);
    }

    public void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        this.copy.getCurrencyIso4217Code(aFh1mSDK);
    }

    public void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        this.copy.getRevenue(aFh1mSDK);
    }

    public void getRevenue(AFh1mSDK aFh1mSDK) {
        this.copy.AFAdRevenueData(aFh1mSDK);
    }

    @CallSuper
    public void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        boolean z11;
        AFe1tSDK aFe1tSDK;
        try {
            try {
                getCurrencyIso4217Code(aFh1mSDK);
                AFAdRevenueData(aFh1mSDK);
                getRevenue(aFh1mSDK);
                getMediationNetwork(aFh1mSDK);
                component2(aFh1mSDK);
            } catch (Throwable th2) {
                AFLogger.INSTANCE.m5975e(AFh1ySDK.QUEUE, "Error while collecting payload params", th2, true, true, false);
            }
            if (aFh1mSDK.getMediationNetwork()) {
                aFh1mSDK.getMonetizationNetwork((Map<String, ?>) ((AFe1cSDK) this).component3.getMediationNetwork(aFh1mSDK.getMonetizationNetwork));
                aFh1mSDK.getMonetizationNetwork((Map<String, ?>) ((AFe1cSDK) this).component3.getMonetizationNetwork(aFh1mSDK.getMonetizationNetwork));
            }
            if (aFh1mSDK.component3()) {
                aFh1mSDK.getMonetizationNetwork((Map<String, ?>) ((AFe1cSDK) this).component3.getCurrencyIso4217Code());
            }
            Set<AFe1oSDK> set = this.getMonetizationNetwork;
            if (!set.contains(AFe1oSDK.LAUNCH) && !set.contains(AFe1oSDK.CONVERSION)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (component2() && z11) {
                aFh1mSDK.getCurrencyIso4217Code(this.component1.AFAdRevenueData("appsFlyerCount", 0));
            }
            if (aFh1mSDK.component4()) {
                Map<String, Object> revenue = AFk1xSDK.getRevenue(aFh1mSDK.getMonetizationNetwork);
                AFe1vSDK aFe1vSDK = this.copydefault;
                String currencyIso4217Code = aFe1vSDK.getCurrencyIso4217Code();
                String strAFAdRevenueData = aFe1vSDK.AFAdRevenueData();
                if (AFe1vSDK.getRevenue()) {
                    aFe1tSDK = AFe1tSDK.DEFAULT;
                } else {
                    aFe1tSDK = AFe1tSDK.API;
                }
                HostMeta hostMeta = new HostMeta(currencyIso4217Code, strAFAdRevenueData, aFe1tSDK);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", hostMeta.name);
                AFe1tSDK aFe1tSDK2 = hostMeta.method;
                if (aFe1tSDK2 != AFe1tSDK.DEFAULT) {
                    jSONObject.put(FirebaseAnalytics.Param.METHOD, aFe1tSDK2.getMonetizationNetwork);
                }
                String str = hostMeta.prefix;
                if (str != null && !StringsKt.isBlank(str)) {
                    jSONObject.put("prefix", hostMeta.prefix);
                }
                revenue.put("host", jSONObject);
            }
            if (this.equals.getRevenue("AF_PREINSTALL_DISABLED")) {
                AFk1xSDK.getRevenue(aFh1mSDK.getMonetizationNetwork).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFKeystoreWrapper.getRevenue(aFh1mSDK.getMonetizationNetwork, aFh1mSDK.AFAdRevenueData());
        } catch (Throwable th3) {
            AFLogger.INSTANCE.m5975e(AFh1ySDK.QUEUE, "Error while preparing to send event", th3, true, true, false);
        }
    }

    public void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        this.copy.AFAdRevenueData(aFh1mSDK.getMonetizationNetwork);
    }
}
