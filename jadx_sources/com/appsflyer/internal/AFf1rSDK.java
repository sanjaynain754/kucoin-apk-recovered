package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes34.dex */
public final class AFf1rSDK extends AFe1cSDK<Map<String, String>> {
    private final UUID AFInAppEventParameterName;

    @Nullable
    public AFa1ySDK component1;
    private String copy;
    private String copydefault;
    private final AFd1mSDK equals;
    private String hashCode;
    private final boolean toString;

    public interface AFa1ySDK {
        void AFAdRevenueData(Map<String, String> map);

        void getMediationNetwork(String str);
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    /* JADX INFO: renamed from: a_ */
    public final boolean mo5964a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    @Nullable
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final boolean equals() {
        return false;
    }

    public AFf1rSDK(@NonNull AFd1zSDK aFd1zSDK, @NonNull UUID uuid, @NonNull Uri uri) throws Throwable {
        super(AFe1oSDK.ONELINK, new AFe1oSDK[]{AFe1oSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        this.equals = aFd1zSDK.AFAdRevenueData();
        this.AFInAppEventParameterName = uuid;
        boolean zBooleanValue = false;
        try {
            if (!AFk1wSDK.AFAdRevenueData(uri.getHost()) && !AFk1wSDK.AFAdRevenueData(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1zSDK.mo5947e()};
                    Map map = AFa1hSDK.f6283e;
                    Object declaredConstructor = map.get(171890876);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1hSDK.getMediationNetwork(ViewConfiguration.getPressedStateDuration() >> 16, (char) (61388 - View.MeasureSpec.makeMeasureSpec(0, 0)), View.MeasureSpec.getMode(0) + 36)).getDeclaredConstructor(Uri.class, AFa1qSDK.class);
                        map.put(171890876, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(287567774);
                        if (method == null) {
                            method = ((Class) AFa1hSDK.getMediationNetwork(Color.argb(0, 0, 0, 0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 61388), 36 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("getMonetizationNetwork", null);
                            map.put(287567774, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = map.get(1357378971);
                            if (method2 == null) {
                                method2 = ((Class) AFa1hSDK.getMediationNetwork((ViewConfiguration.getScrollDefaultDelay() >> 16) + 36, (char) (Process.myTid() >> 22), 51 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("getMediationNetwork", null);
                                map.put(1357378971, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = map.get(1809606523);
                                if (method3 == null) {
                                    method3 = ((Class) AFa1hSDK.getMediationNetwork(TextUtils.getOffsetBefore("", 0) + 36, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 52 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getMethod("getRevenue", null);
                                    map.put(1809606523, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                String[] strArrSplit = uri.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.copydefault = strArrSplit[1];
                                    this.copy = strArrSplit[2];
                                    this.hashCode = uri.toString();
                                }
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 == null) {
                                throw th3;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 == null) {
                            throw th4;
                        }
                        throw cause3;
                    }
                } catch (Throwable th5) {
                    Throwable cause4 = th5.getCause();
                    if (cause4 == null) {
                        throw th5;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e11);
        }
        this.toString = zBooleanValue;
    }

    @Override // com.appsflyer.internal.AFe1cSDK
    public final AFd1iSDK<Map<String, String>> AFAdRevenueData(@NonNull String str) {
        return this.equals.getMediationNetwork(this.copydefault, this.copy, this.AFInAppEventParameterName, str);
    }

    public final boolean copy() {
        return this.toString;
    }

    public final boolean copydefault() {
        return (TextUtils.isEmpty(this.copydefault) || TextUtils.isEmpty(this.copy) || this.copydefault.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final long getCurrencyIso4217Code() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFe1cSDK, com.appsflyer.internal.AFe1mSDK
    public final void getMonetizationNetwork() {
        ResponseNetwork responseNetwork;
        super.getMonetizationNetwork();
        AFa1ySDK aFa1ySDK = this.component1;
        if (aFa1ySDK != null) {
            if (this.AFAdRevenueData == AFe1qSDK.SUCCESS && (responseNetwork = ((AFe1cSDK) this).component2) != null) {
                aFa1ySDK.AFAdRevenueData((Map) responseNetwork.getBody());
                return;
            }
            Throwable thComponent4 = component4();
            String str = "Can't get OneLink data";
            if (thComponent4 instanceof ParsingException) {
                if (((ParsingException) thComponent4).getRawResponse().isSuccessful()) {
                    aFa1ySDK.getMediationNetwork("Can't parse one link data");
                    return;
                }
                String str2 = this.hashCode;
                if (str2 != null) {
                    str = str2;
                }
                aFa1ySDK.getMediationNetwork(str);
                return;
            }
            String str3 = this.hashCode;
            if (str3 != null) {
                str = str3;
            }
            aFa1ySDK.getMediationNetwork(str);
        }
    }
}
