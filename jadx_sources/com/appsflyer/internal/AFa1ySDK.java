package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1nSDK.RunnableC51572;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33536a4;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33627eb;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public final class AFa1ySDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static char[] AFInAppEventParameterName = null;
    private static boolean AFInAppEventType = false;
    private static boolean AFKeystoreWrapper = false;
    private static int AFLogger = 0;

    @VisibleForTesting
    private static AFa1ySDK component4 = null;

    /* JADX INFO: renamed from: e */
    private static int f6287e = 1;
    public static final String getMonetizationNetwork;
    static AppsFlyerInAppPurchaseValidatorListener getRevenue;
    private static int registerClient;
    Application areAllFieldsValid;
    private Map<Long, String> copydefault;
    private volatile SharedPreferences equals;
    private AFf1oSDK hashCode;
    private boolean toString;
    public volatile AppsFlyerConversionListener getMediationNetwork = null;
    private long component3 = -1;
    long getCurrencyIso4217Code = -1;
    private long component2 = TimeUnit.SECONDS.toMillis(5);
    boolean component1 = false;

    @NonNull
    private final AFc1dSDK copy = new AFc1dSDK();

    public class AFa1vSDK implements AFe1rSDK {
        @Override // com.appsflyer.internal.AFe1rSDK
        public final void AFAdRevenueData(AFe1mSDK<?> aFe1mSDK, AFe1qSDK aFe1qSDK) {
            JSONObject currencyIso4217Code;
            AFf1aSDK aFf1aSDKAFAdRevenueData;
            if (!(aFe1mSDK instanceof AFf1tSDK)) {
                if (!(aFe1mSDK instanceof AFg1kSDK) || aFe1qSDK == AFe1qSDK.SUCCESS) {
                    return;
                }
                AFg1qSDK aFg1qSDK = new AFg1qSDK(AFa1ySDK.this.getMediationNetwork());
                AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                AFe1nSDK aFe1nSDKEquals = ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).equals();
                aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(aFg1qSDK));
                return;
            }
            AFf1tSDK aFf1tSDK = (AFf1tSDK) aFe1mSDK;
            boolean z11 = aFe1mSDK instanceof AFf1sSDK;
            if (z11 && getMonetizationNetwork()) {
                AFf1sSDK aFf1sSDK = (AFf1sSDK) aFe1mSDK;
                if (aFf1sSDK.AFAdRevenueData == AFe1qSDK.SUCCESS || aFf1sSDK.getCurrencyIso4217Code == 1) {
                    AFg1kSDK aFg1kSDK = new AFg1kSDK(aFf1sSDK, AFa1ySDK.this.getMediationNetwork().component4());
                    AFa1ySDK aFa1ySDK2 = AFa1ySDK.this;
                    AFe1nSDK aFe1nSDKEquals2 = ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK2}, 254507867, -254507852, System.identityHashCode(aFa1ySDK2))).equals();
                    aFe1nSDKEquals2.getMonetizationNetwork.execute(aFe1nSDKEquals2.new RunnableC51572(aFg1kSDK));
                }
            }
            AFa1ySDK aFa1ySDK3 = AFa1ySDK.this;
            AFh1qSDK aFh1qSDKAfRDLog = ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK3}, 254507867, -254507852, System.identityHashCode(aFa1ySDK3))).afRDLog();
            if (aFh1qSDKAfRDLog != null && z11) {
                aFh1qSDKAfRDLog.getMonetizationNetwork((AFf1sSDK) aFe1mSDK, new Function0() { // from class: com.appsflyer.internal.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f6330b.AFAdRevenueData();
                    }
                });
            }
            if (aFe1qSDK == AFe1qSDK.SUCCESS) {
                AFa1ySDK aFa1ySDK4 = AFa1ySDK.this;
                ((AFc1pSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK4, aFa1ySDK4.areAllFieldsValid}, 659825386, -659825380, System.identityHashCode(aFa1ySDK4))).getMonetizationNetwork("sentSuccessfully", CredentialEntry.TRUE_STRING);
                if (!(aFe1mSDK instanceof AFf1mSDK) && (aFf1aSDKAFAdRevenueData = new AFg1vSDK(AFa1ySDK.this.areAllFieldsValid).AFAdRevenueData()) != null && aFf1aSDKAFAdRevenueData.getCurrencyIso4217Code) {
                    String str = aFf1aSDKAFAdRevenueData.getMediationNetwork;
                    AFLogger.INSTANCE.m5971d(AFh1ySDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFa1ySDK monetizationNetwork = AFa1ySDK.getMonetizationNetwork();
                    AFd1zSDK aFd1zSDK = (AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{monetizationNetwork}, 254507867, -254507852, System.identityHashCode(monetizationNetwork));
                    AFf1mSDK aFf1mSDK = new AFf1mSDK(str, aFd1zSDK);
                    AFe1nSDK aFe1nSDKEquals3 = aFd1zSDK.equals();
                    aFe1nSDKEquals3.getMonetizationNetwork.execute(aFe1nSDKEquals3.new RunnableC51572(aFf1mSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1cSDK) aFf1tSDK).component2;
                if (responseNetwork != null && (currencyIso4217Code = AFa1pSDK.getCurrencyIso4217Code((String) responseNetwork.getBody())) != null) {
                    AFa1ySDK.this.component1 = currencyIso4217Code.optBoolean("send_background", false);
                }
                if (z11) {
                    AFa1ySDK.this.getCurrencyIso4217Code = System.currentTimeMillis();
                }
            }
        }

        @Override // com.appsflyer.internal.AFe1rSDK
        public final void getMonetizationNetwork(AFe1mSDK<?> aFe1mSDK) {
        }

        public AFa1vSDK() {
        }

        private boolean getMonetizationNetwork() {
            return AFa1ySDK.this.getMediationNetwork != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit AFAdRevenueData() throws UnsupportedEncodingException {
            AFa1ySDK aFa1ySDK = AFa1ySDK.this;
            AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK, new AFh1nSDK()}, -1950683731, 1950683733, System.identityHashCode(aFa1ySDK));
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object AFInAppEventParameterName(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        AFLogger = (f6287e + 87) % 128;
        aFa1ySDK.component2 = TimeUnit.SECONDS.toMillis(iIntValue);
        int i11 = f6287e + 41;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        String str = (String) objArr[0];
        f6287e = (AFLogger + 23) % 128;
        boolean z11 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i11 = f6287e + 25;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return Boolean.valueOf(z11);
        }
        throw null;
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) throws UnsupportedEncodingException {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        String str = (String) objArr[1];
        AFLogger = (f6287e + 23) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).copy().getMonetizationNetwork("setAppId", str);
        getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.APP_ID, str}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        int i11 = AFLogger + 15;
        f6287e = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i11 = AFLogger + 111;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i12 = 77 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
        int i13 = f6287e + 79;
        AFLogger = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        Context context = (Context) objArr[0];
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.m5978w(AFh1ySDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger = (f6287e + 21) % 128;
                AFLogger.INSTANCE.m5978w(AFh1ySDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                AFLogger = (f6287e + 115) % 128;
                if (!listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                    int i11 = f6287e + 3;
                    AFLogger = i11 % 128;
                    if (i11 % 2 != 0) {
                        AFLogger.INSTANCE.m5978w(AFh1ySDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                        int i12 = 5 / 0;
                    } else {
                        AFLogger.INSTANCE.m5978w(AFh1ySDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    }
                    AFLogger = (f6287e + 109) % 128;
                }
            }
            return null;
        } catch (Exception e11) {
            AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "Exception while validation permissions. ", e11);
            return null;
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        f6287e = (AFLogger + 115) % 128;
        String currencyIso4217Code = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).registerClient().getCurrencyIso4217Code();
        int i11 = f6287e + 107;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 0 / 0;
        }
        return currencyIso4217Code;
    }

    @WorkerThread
    private void component3() {
        try {
            final AFi1fSDK aFi1fSDKAfErrorLog = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).afErrorLog();
            if (aFi1fSDKAfErrorLog == null) {
                return;
            }
            if (aFi1fSDKAfErrorLog.getMonetizationNetwork()) {
                f6287e = (AFLogger + 9) % 128;
                aFi1fSDKAfErrorLog.AFAdRevenueData(new AFi1dSDK() { // from class: com.appsflyer.internal.f
                    @Override // com.appsflyer.internal.AFi1dSDK
                    public final void onRequestFinished() {
                        this.f6320a.getMonetizationNetwork(aFi1fSDKAfErrorLog);
                    }
                });
            } else {
                if (aFi1fSDKAfErrorLog.getCurrencyIso4217Code()) {
                    return;
                }
                f6287e = (AFLogger + 27) % 128;
                getCurrencyIso4217Code(aFi1fSDKAfErrorLog);
                AFLogger = (f6287e + 79) % 128;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th2);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th2)));
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int i11 = AFLogger + 93;
        f6287e = i11 % 128;
        if (i11 % 2 != 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).afInfoLog().getCurrencyIso4217Code();
            return null;
        }
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).afInfoLog().getCurrencyIso4217Code();
        throw null;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int i11 = f6287e + 53;
        int i12 = i11 % 128;
        AFLogger = i12;
        int i13 = i11 % 2;
        AFc1dSDK aFc1dSDK = aFa1ySDK.copy;
        if (i13 != 0) {
            int i14 = 51 / 0;
        }
        f6287e = (i12 + 123) % 128;
        return aFc1dSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copydefault() throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, new AFh1nSDK()}, -1950683731, 1950683733, System.identityHashCode(this));
        f6287e = (AFLogger + 61) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        AFi1qSDK aFi1pSDK;
        if (((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).afLogForce().AFAdRevenueData()) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).afLogForce().getCurrencyIso4217Code();
        }
        AFi1rSDK aFi1rSDKMo5946d = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5946d();
        if (Build.VERSION.SDK_INT >= 31) {
            aFi1pSDK = new AFi1oSDK(aFi1rSDKMo5946d.getCurrencyIso4217Code);
            AFLogger = (f6287e + 55) % 128;
        } else {
            aFi1pSDK = new AFi1pSDK(aFi1rSDKMo5946d.getCurrencyIso4217Code);
        }
        aFi1rSDKMo5946d.AFAdRevenueData = aFi1pSDK;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getRevenue(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).getCurrencyIso4217Code());
        AFh1tSDK aFh1tSDKComponent3 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component3();
        aFh1tSDKComponent3.areAllFieldsValid = System.currentTimeMillis();
        int iAFAdRevenueData = aFh1tSDKComponent3.getMonetizationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0);
        if (iAFAdRevenueData == 1) {
            int i11 = AFLogger + 115;
            f6287e = i11 % 128;
            if (i11 % 2 == 0) {
                aFh1tSDKComponent3.getMediationNetwork.getMonetizationNetwork("first_launch");
                throw null;
            }
            if (aFh1tSDKComponent3.getMediationNetwork.getMonetizationNetwork("first_launch")) {
                aFh1tSDKComponent3.getCurrencyIso4217Code.putAll(aFh1tSDKComponent3.getMediationNetwork("first_launch"));
            }
        }
        if (iAFAdRevenueData > 0) {
            int i12 = f6287e + 91;
            AFLogger = i12 % 128;
            if (i12 % 2 != 0) {
                aFh1tSDKComponent3.getMediationNetwork.getMonetizationNetwork("gcd");
                throw null;
            }
            if (aFh1tSDKComponent3.getMediationNetwork.getMonetizationNetwork("gcd")) {
                aFh1tSDKComponent3.getRevenue.putAll(aFh1tSDKComponent3.getMediationNetwork("gcd"));
            }
        }
        aFh1tSDKComponent3.toString = aFh1tSDKComponent3.getMediationNetwork.AFAdRevenueData("prev_session_dur", 0L);
        component3();
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFInAppEventType().AFAdRevenueData();
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i11, int i12, int i13) throws UnsupportedEncodingException {
        int i14 = (i11 * (-494)) + (i12 * (-494)) + ((~(i11 | i12)) * (-495));
        int i15 = (~i13) | i11;
        int i16 = i14 + (i15 * 495) + (((~((~i11) | (~i12))) | (~i15)) * 495);
        long j11 = 0;
        int i17 = 0;
        switch (i16) {
            case 1:
                return getCurrencyIso4217Code(objArr);
            case 2:
                AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
                Context context = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).AFInAppEventParameterName().getMonetizationNetwork;
                if (context == null) {
                    AFLogger = (f6287e + 63) % 128;
                    AFLogger.INSTANCE.mo5914d(AFh1ySDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                    return null;
                }
                String monetizationNetwork = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).AFKeystoreWrapper().getMonetizationNetwork();
                AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getRevenue;
                if (monetizationNetwork == null || monetizationNetwork.length() == 0) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1ySDK aFh1ySDK = AFh1ySDK.GENERAL;
                    aFLogger.mo5916i(aFh1ySDK, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
                    aFLogger.mo5916i(aFh1ySDK, "AppsFlyer will not track this event.", true);
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(41, "No dev key");
                    }
                    return null;
                }
                AFc1pSDK aFc1pSDK = (AFc1pSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK, context}, 659825386, -659825380, System.identityHashCode(aFa1ySDK));
                AppsFlyerProperties.getInstance().saveProperties(aFc1pSDK);
                if (!((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).AFKeystoreWrapper().getMediationNetwork()) {
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFh1ySDK aFh1ySDK2 = AFh1ySDK.GENERAL;
                    StringBuilder sb2 = new StringBuilder("sendWithEvent from activity: ");
                    sb2.append(context.getClass().getName());
                    aFLogger2.mo5916i(aFh1ySDK2, sb2.toString(), true);
                }
                boolean revenue = aFh1mSDK.getRevenue();
                Map<String, Object> revenue2 = aFa1ySDK.getRevenue(aFh1mSDK);
                if (((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).AFKeystoreWrapper().getMediationNetwork()) {
                    AFLogger.INSTANCE.m5976i(AFh1ySDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                }
                int currencyIso4217Code = getCurrencyIso4217Code(aFc1pSDK, false);
                aFa1ySDK.getCurrencyIso4217Code(revenue2);
                AFa1zSDK aFa1zSDK = new AFa1zSDK(aFa1ySDK.getMediationNetwork(), aFh1mSDK.getMonetizationNetwork((Map<String, ?>) revenue2).getCurrencyIso4217Code(currencyIso4217Code), aFa1ySDK.getMediationNetwork().mo5950w().AFAdRevenueData());
                if (revenue) {
                    f6287e = (AFLogger + 109) % 128;
                    AFj1tSDK[] aFj1tSDKArrAreAllFieldsValid = aFa1ySDK.areAllFieldsValid();
                    int length = aFj1tSDKArrAreAllFieldsValid.length;
                    int i18 = 0;
                    while (i17 < length) {
                        f6287e = (AFLogger + 59) % 128;
                        AFj1tSDK aFj1tSDK = aFj1tSDKArrAreAllFieldsValid[i17];
                        if (aFj1tSDK.areAllFieldsValid == AFj1tSDK.AFa1ySDK.STARTED) {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFh1ySDK aFh1ySDK3 = AFh1ySDK.REFERRER;
                            StringBuilder sb3 = new StringBuilder("Failed to get ");
                            sb3.append(aFj1tSDK.AFAdRevenueData);
                            sb3.append(" referrer, wait ...");
                            aFLogger3.m5971d(aFh1ySDK3, sb3.toString());
                            i18 = 1;
                        }
                        i17++;
                    }
                    if (((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).mo5950w().getMediationNetwork()) {
                        AFLogger.INSTANCE.m5971d(AFh1ySDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                        i17 = 1;
                    } else {
                        i17 = i18;
                    }
                    if (((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).AFKeystoreWrapper().AFAdRevenueData()) {
                        AFLogger = (f6287e + 79) % 128;
                        i17 = 1;
                    }
                }
                ScheduledExecutorService revenue3 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).getRevenue();
                if (i17 != 0) {
                    j11 = 500;
                } else {
                    f6287e = (AFLogger + 101) % 128;
                }
                AFk1xSDK.getMonetizationNetwork(revenue3, aFa1zSDK, j11, TimeUnit.MILLISECONDS);
                return null;
            case 3:
                return getRevenue(objArr);
            case 4:
                AFa1ySDK aFa1ySDK2 = (AFa1ySDK) objArr[0];
                if (aFa1ySDK2.component3 > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - aFa1ySDK2.component3;
                    Locale locale = Locale.US;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
                    String mediationNetwork = getMediationNetwork(simpleDateFormat, aFa1ySDK2.component3);
                    String mediationNetwork2 = getMediationNetwork(simpleDateFormat, aFa1ySDK2.getCurrencyIso4217Code);
                    if (jCurrentTimeMillis < aFa1ySDK2.component2 && !aFa1ySDK2.isStopped()) {
                        AFLogger = (f6287e + 61) % 128;
                        AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", mediationNetwork, mediationNetwork2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(aFa1ySDK2.component2)));
                        return Boolean.TRUE;
                    }
                    if (!aFa1ySDK2.isStopped()) {
                        AFLogger = (f6287e + 73) % 128;
                        AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", mediationNetwork, mediationNetwork2, Long.valueOf(jCurrentTimeMillis)));
                        AFLogger = (f6287e + 51) % 128;
                    }
                } else if (!aFa1ySDK2.isStopped()) {
                    AFLogger.afInfoLog("Sending first launch for this session!");
                }
                return Boolean.FALSE;
            case 5:
                return AFAdRevenueData(objArr);
            case 6:
                return getMonetizationNetwork(objArr);
            case 7:
                AFa1ySDK aFa1ySDK3 = (AFa1ySDK) objArr[0];
                AFh1mSDK aFh1mSDK2 = (AFh1mSDK) objArr[1];
                if (aFh1mSDK2.areAllFieldsValid == null) {
                    int i19 = AFLogger + 49;
                    f6287e = i19 % 128;
                    if (i19 % 2 != 0) {
                        i17 = 1;
                    }
                }
                if (aFa1ySDK3.getCurrencyIso4217Code()) {
                    AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                    return null;
                }
                if (i17 != 0) {
                    AFLogger = (f6287e + 113) % 128;
                    if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                        AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                    } else if (aFa1ySDK3.component4()) {
                        AppsFlyerRequestListener appsFlyerRequestListener2 = aFh1mSDK2.getRevenue;
                        if (appsFlyerRequestListener2 != null) {
                            appsFlyerRequestListener2.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        }
                        return null;
                    }
                    aFa1ySDK3.component3 = System.currentTimeMillis();
                }
                getCurrencyIso4217Code(new Object[]{aFa1ySDK3, aFh1mSDK2}, -1950683731, 1950683733, System.identityHashCode(aFa1ySDK3));
                return null;
            case 8:
                return getMediationNetwork(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                return component2(objArr);
            case 11:
                AFc1pSDK aFc1pSDK2 = (AFc1pSDK) objArr[0];
                String str = (String) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                AFLogger = (f6287e + 121) % 128;
                int iAFAdRevenueData = aFc1pSDK2.AFAdRevenueData(str, 0);
                if (zBooleanValue) {
                    int i21 = AFLogger + 77;
                    f6287e = i21 % 128;
                    iAFAdRevenueData = i21 % 2 == 0 ? iAFAdRevenueData + 42 : iAFAdRevenueData + 1;
                    aFc1pSDK2.getRevenue(str, iAFAdRevenueData);
                }
                return Integer.valueOf(iAFAdRevenueData);
            case 12:
                return component3(objArr);
            case 13:
                return component4(objArr);
            case 14:
                return component1(objArr);
            case 15:
                return copy(objArr);
            case 16:
                return copydefault(objArr);
            case 17:
                return toString(objArr);
            case 18:
                AFh1mSDK aFh1mSDK3 = (AFh1mSDK) objArr[0];
                AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
                if (aFh1pSDK != null) {
                    AFLogger = (f6287e + 95) % 128;
                    aFh1mSDK3.getMediationNetwork = aFh1pSDK.getMediationNetwork;
                    aFh1mSDK3.copydefault = aFh1pSDK.getCurrencyIso4217Code;
                }
                f6287e = (AFLogger + 57) % 128;
                return null;
            case 19:
                return hashCode(objArr);
            case 20:
                return equals(objArr);
            case 21:
                return AFKeystoreWrapper(objArr);
            case 22:
                return AFInAppEventParameterName(objArr);
            case 23:
                AFa1ySDK aFa1ySDK4 = (AFa1ySDK) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i22 = f6287e + 81;
                AFLogger = i22 % 128;
                if (i22 % 2 != 0) {
                    AFd1kSDK aFd1kSDKCopy = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK4}, 254507867, -254507852, System.identityHashCode(aFa1ySDK4))).copy();
                    String[] strArr = new String[0];
                    strArr[1] = String.valueOf(zBooleanValue2);
                    aFd1kSDKCopy.getMonetizationNetwork("setCollectOaid", strArr);
                    getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.COLLECT_OAID, Boolean.toString(zBooleanValue2)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
                } else {
                    ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK4}, 254507867, -254507852, System.identityHashCode(aFa1ySDK4))).copy().getMonetizationNetwork("setCollectOaid", String.valueOf(zBooleanValue2));
                    getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.COLLECT_OAID, Boolean.toString(zBooleanValue2)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
                }
                return null;
            case 24:
                return AFLogger(objArr);
            default:
                AFa1ySDK aFa1ySDK5 = (AFa1ySDK) objArr[0];
                Map map = (Map) objArr[1];
                AFLogger = (f6287e + 39) % 128;
                if (map != null) {
                    ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK5}, 254507867, -254507852, System.identityHashCode(aFa1ySDK5))).copy().getMonetizationNetwork("setAdditionalData", map.toString());
                    AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
                    f6287e = (AFLogger + 125) % 128;
                }
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFf1qSDK aFf1qSDK) {
        AFd1zSDK aFd1zSDK = (AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this));
        if (aFf1qSDK == AFf1qSDK.SUCCESS) {
            int i11 = f6287e + 77;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                aFd1zSDK.afErrorLogForExcManagerOnly().getCurrencyIso4217Code();
                int i12 = 39 / 0;
            } else {
                aFd1zSDK.afErrorLogForExcManagerOnly().getCurrencyIso4217Code();
            }
        }
        if (aFd1zSDK.copy().getCurrencyIso4217Code()) {
            aFd1zSDK.force().getMediationNetwork();
            return;
        }
        int i13 = f6287e + 79;
        AFLogger = i13 % 128;
        if (i13 % 2 == 0) {
            aFd1zSDK.force().getCurrencyIso4217Code();
        } else {
            aFd1zSDK.force().getCurrencyIso4217Code();
            int i14 = 30 / 0;
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        PluginInfo pluginInfo = (PluginInfo) objArr[1];
        int i11 = AFLogger + 27;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            Objects.requireNonNull(pluginInfo);
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).unregisterClient().getMonetizationNetwork(pluginInfo);
            throw null;
        }
        Objects.requireNonNull(pluginInfo);
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).unregisterClient().getMonetizationNetwork(pluginInfo);
        int i12 = AFLogger + 121;
        f6287e = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        AFLogger = (f6287e + 95) % 128;
        aFa1ySDK.getMonetizationNetwork(context);
        String strAFAdRevenueData = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).getCurrencyIso4217Code().AFAdRevenueData(context);
        int i11 = f6287e + 119;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 53 / 0;
        }
        return strAFAdRevenueData;
    }

    public final void AFAdRevenueData(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String mediationNetwork = ((AFc1pSDK) getCurrencyIso4217Code(new Object[]{this, context}, 659825386, -659825380, System.identityHashCode(this))).getMediationNetwork("extraReferrers", null);
            if (mediationNetwork == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
                f6287e = (AFLogger + 33) % 128;
            } else {
                JSONObject jSONObject2 = new JSONObject(mediationNetwork);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                jSONArray.put(jCurrentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                f6287e = (AFLogger + 113) % 128;
                getMediationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            ((AFc1pSDK) getCurrencyIso4217Code(new Object[]{this, context}, 659825386, -659825380, System.identityHashCode(this))).getMonetizationNetwork("extraReferrers", jSONObject.toString());
        } catch (JSONException e11) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e11);
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    public final void getMonetizationNetwork(@NonNull Context context) {
        int i11 = (AFLogger + 53) % 128;
        f6287e = i11;
        AFc1dSDK aFc1dSDK = this.copy;
        if (context != null) {
            AFc1fSDK aFc1fSDK = aFc1dSDK.getMonetizationNetwork;
            if (context != null) {
                int i12 = i11 + 23;
                AFLogger = i12 % 128;
                if (i12 % 2 == 0) {
                    aFc1fSDK.getMonetizationNetwork = context.getApplicationContext();
                } else {
                    aFc1fSDK.getMonetizationNetwork = context.getApplicationContext();
                    throw null;
                }
            }
        }
    }

    public final synchronized AFf1oSDK getRevenue() {
        AFf1oSDK aFf1oSDK;
        try {
            if (this.hashCode == null) {
                AFLogger = (f6287e + 117) % 128;
                this.hashCode = new AFf1oSDK() { // from class: com.appsflyer.internal.g
                    @Override // com.appsflyer.internal.AFf1oSDK
                    public final void onRemoteConfigUpdateFinished(AFf1qSDK aFf1qSDK) {
                        this.f6323a.getMediationNetwork(aFf1qSDK);
                    }
                };
                AFLogger = (f6287e + 33) % 128;
            }
            aFf1oSDK = this.hashCode;
            int i11 = AFLogger + 77;
            f6287e = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aFf1oSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        f6287e = (AFLogger + 31) % 128;
        logEvent(context, str, map, null);
        AFLogger = (f6287e + 65) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i11 = f6287e + 51;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            throw null;
        }
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i12 = AFLogger + 9;
        f6287e = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        int i11 = AFLogger + 121;
        f6287e = i11 % 128;
        if (i11 % 2 != 0) {
            start(context, null);
        } else {
            start(context, null);
            int i12 = 51 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i11 = f6287e + 75;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            throw null;
        }
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i12 = f6287e + 33;
        AFLogger = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 58 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (r14 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r14 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        new java.lang.Thread(new com.appsflyer.internal.AFa1vSDK(r11.getApplicationContext(), getMediationNetwork().AFKeystoreWrapper().getMonetizationNetwork(), r12, r13, r14, r15, r16, r17)).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK aFh1ySDK = AFh1ySDK.PURCHASE_VALIDATION;
            StringBuilder sb2 = new StringBuilder("Validate in app called with parameters: ");
            sb2.append(str3);
            sb2.append(C33627eb.f69716f);
            sb2.append(str4);
            sb2.append(C33627eb.f69716f);
            sb2.append(str5);
            aFLogger.m5976i(aFh1ySDK, sb2.toString());
        }
        if (str != null) {
            int i11 = (AFLogger + 57) % 128;
            f6287e = i11;
            if (str4 != null) {
                AFLogger = (i11 + 71) % 128;
                if (str2 != null) {
                    AFLogger = (i11 + 19) % 128;
                    if (str5 != null) {
                        int i12 = i11 + 73;
                        AFLogger = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 93 / 0;
                        }
                    }
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getRevenue;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i14 = AFLogger + 11;
            f6287e = i14 % 128;
            if (i14 % 2 != 0) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            } else {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                int i15 = 21 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1ySDK$4 */
    public static /* synthetic */ class C51404 {
        static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getMediationNetwork = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMediationNetwork[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5925a(String str, String str2, int[] iArr, int i11, Object[] objArr) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 61) % 128;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        char[] cArr2 = AFInAppEventParameterName;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr3[i12] = (char) (((long) cArr2[i12]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i13 = (int) (1825820251896122634L ^ ((long) registerClient));
        if (AFKeystoreWrapper) {
            int i14 = $11 + 31;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            int length2 = bArr.length;
            aFk1jSDK.getRevenue = length2;
            char[] cArr4 = new char[length2];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i16 = aFk1jSDK.getMonetizationNetwork;
                int i17 = aFk1jSDK.getRevenue;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    $10 = ($11 + 103) % 128;
                    cArr4[i16] = (char) (cArr2[bArr[(i17 - 1) - i16] + i11] - i13);
                    aFk1jSDK.getMonetizationNetwork = i16 + 1;
                }
            }
        } else if (AFInAppEventType) {
            int length3 = cArr.length;
            aFk1jSDK.getRevenue = length3;
            char[] cArr5 = new char[length3];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i18 = aFk1jSDK.getMonetizationNetwork;
                int i19 = aFk1jSDK.getRevenue;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i18] = (char) (cArr2[cArr[(i19 - 1) - i18] - i11] - i13);
                    aFk1jSDK.getMonetizationNetwork = i18 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1jSDK.getRevenue = length4;
            char[] cArr6 = new char[length4];
            aFk1jSDK.getMonetizationNetwork = 0;
            while (true) {
                int i21 = aFk1jSDK.getMonetizationNetwork;
                int i22 = aFk1jSDK.getRevenue;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i21] = (char) (cArr2[iArr[(i22 - 1) - i21] - i11] - i13);
                    aFk1jSDK.getMonetizationNetwork = i21 + 1;
                }
            }
        }
    }

    @SuppressLint({"DiscouragedApi"})
    /* JADX INFO: renamed from: c_ */
    private static void m5928c_(Context context, PackageInfo packageInfo) {
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 32768) == 0) {
                return;
            }
            int i11 = AFLogger + 83;
            f6287e = i11 % 128;
            if (i11 % 2 != 0 && Build.VERSION.SDK_INT < 31) {
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.mo5916i(AFh1ySDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return;
                } else {
                    AFLogger.INSTANCE.mo5918w(AFh1ySDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    return;
                }
            }
            if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                AFLogger.INSTANCE.mo5918w(AFh1ySDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
            } else {
                AFLogger = (f6287e + 11) % 128;
                AFLogger.INSTANCE.mo5916i(AFh1ySDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "Exception while checking BackupRules: ", th2);
        }
    }

    public static void component2() {
        AFInAppEventParameterName = new char[]{35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};
        registerClient = 1912311211;
        AFInAppEventType = true;
        AFKeystoreWrapper = true;
    }

    private static void copy() {
        int i11 = AFLogger + 95;
        f6287e = i11 % 128;
        if (i11 % 2 != 0) {
            AFLogger.INSTANCE.m5978w(AFh1ySDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        } else {
            AFLogger.INSTANCE.m5978w(AFh1ySDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int i11 = AFLogger + 95;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).AFKeystoreWrapper().getMediationNetwork();
            throw null;
        }
        boolean mediationNetwork = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).AFKeystoreWrapper().getMediationNetwork();
        f6287e = (AFLogger + 123) % 128;
        return Boolean.valueOf(mediationNetwork);
    }

    /* JADX INFO: renamed from: d_ */
    public static SharedPreferences m5930d_(Context context) {
        int i11 = f6287e + 93;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            SharedPreferences sharedPreferences = getMonetizationNetwork().equals;
            throw null;
        }
        if (getMonetizationNetwork().equals == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                getMonetizationNetwork().equals = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        }
        SharedPreferences sharedPreferences2 = getMonetizationNetwork().equals;
        AFLogger = (f6287e + 67) % 128;
        return sharedPreferences2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0051  */
    /* JADX INFO: renamed from: e_ */
    public /* synthetic */ void m5932e_(Context context, Intent intent) {
        Uri data;
        boolean z11;
        f6287e = (AFLogger + 31) % 128;
        getMonetizationNetwork(context);
        AFa1qSDK aFa1qSDKMo5947e = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e();
        AFc1pSDK aFc1pSDKComponent4 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component4();
        if (intent != null) {
            AFLogger = (f6287e + 49) % 128;
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                data = intent.getData();
            } else {
                data = null;
            }
        } else {
            data = null;
        }
        if (data == null || data.toString().isEmpty()) {
            z11 = false;
        } else {
            AFLogger = (f6287e + 17) % 128;
            z11 = true;
        }
        if (aFc1pSDKComponent4.getMonetizationNetwork("ddl_sent", false)) {
            int i11 = AFLogger + 65;
            f6287e = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (!z11) {
                aFa1qSDKMo5947e.getRevenue("No direct deep link", null);
                return;
            }
        }
        aFa1qSDKMo5947e.m5921f_(AFa1gSDK.AFAdRevenueData(aFa1qSDKMo5947e.component4.afWarnLog()), intent, context);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i11 = AFLogger + 91;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().AFAdRevenueData.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().AFAdRevenueData;
        if (list.contains(listAsList)) {
            return;
        }
        list.add(listAsList);
        f6287e = (AFLogger + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z11) {
        int i11 = f6287e + 1;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            AFd1kSDK aFd1kSDKCopy = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z11);
            aFd1kSDKCopy.getMonetizationNetwork("anonymizeUser", strArr);
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("anonymizeUser", String.valueOf(z11));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z11);
        int i12 = AFLogger + 25;
        f6287e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 63 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        f6287e = (AFLogger + 35) % 128;
        AFa1qSDK aFa1qSDKMo5947e = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e();
        aFa1qSDKMo5947e.getMonetizationNetwork = str;
        aFa1qSDKMo5947e.getRevenue = map;
        AFLogger = (f6287e + 3) % 128;
    }

    /* JADX INFO: renamed from: b_ */
    public final void m5936b_(Context context, Intent intent) throws UnsupportedEncodingException {
        AFj1hSDK aFj1hSDK = new AFj1hSDK(intent);
        if (aFj1hSDK.getCurrencyIso4217Code("appsflyer_preinstall") != null) {
            int i11 = AFLogger + 107;
            f6287e = i11 % 128;
            if (i11 % 2 == 0) {
                getRevenue(aFj1hSDK.getCurrencyIso4217Code("appsflyer_preinstall"));
                int i12 = 14 / 0;
            } else {
                getRevenue(aFj1hSDK.getCurrencyIso4217Code("appsflyer_preinstall"));
            }
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String currencyIso4217Code = aFj1hSDK.getCurrencyIso4217Code("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(currencyIso4217Code)));
        if (currencyIso4217Code != null) {
            AFLogger = (f6287e + 69) % 128;
            ((AFc1pSDK) getCurrencyIso4217Code(new Object[]{this, context}, 659825386, -659825380, System.identityHashCode(this))).getMonetizationNetwork("referrer", currencyIso4217Code);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", currencyIso4217Code);
            appsFlyerProperties.getMediationNetwork = currencyIso4217Code;
            if (AppsFlyerProperties.getInstance().getMonetizationNetwork()) {
                AFLogger = (f6287e + 73) % 128;
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFAdRevenueData(context, AFh1vSDK.onReceive);
                getMediationNetwork(currencyIso4217Code);
            }
        }
        f6287e = (AFLogger + 69) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        f6287e = (AFLogger + 27) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v().component1 = true;
        int i11 = AFLogger + 93;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 4 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z11) throws UnsupportedEncodingException {
        int i11 = AFLogger + 7;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z11)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
            throw null;
        }
        getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z11)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        AFLogger = (f6287e + 59) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Nullable
    public final String getAppsFlyerUID(@NonNull Context context) {
        int i11 = f6287e + 49;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("getAppsFlyerUID", new String[1]);
            if (context == null) {
                return null;
            }
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("getAppsFlyerUID", new String[0]);
            if (context == null) {
                return null;
            }
        }
        getMonetizationNetwork(context);
        String revenue = AFb1mSDK.getRevenue(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).getCurrencyIso4217Code().getRevenue);
        f6287e = (AFLogger + 119) % 128;
        return revenue;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i11 = AFLogger + 47;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            throw null;
        }
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
        if (currencyIso4217Code != null) {
            return currencyIso4217Code;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        AFLogger = (f6287e + 7) % 128;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i11 = AFLogger + 89;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("getSdkVersion", new String[1]);
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("getSdkVersion", new String[0]);
        }
        return AFc1kSDK.component2();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        if (this.toString) {
            return this;
        }
        this.toString = true;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getCurrencyIso4217Code(str);
        if (context != null) {
            int i11 = AFLogger + 109;
            f6287e = i11 % 128;
            if (i11 % 2 == 0) {
                getMonetizationNetwork(context);
                AFj1jSDK.m5999O_(context);
                throw null;
            }
            getMonetizationNetwork(context);
            Application applicationM5999O_ = AFj1jSDK.m5999O_(context);
            if (applicationM5999O_ == null) {
                return this;
            }
            this.areAllFieldsValid = applicationM5999O_;
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6307b.equals();
                }
            });
            AFe1nSDK aFe1nSDKEquals = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).equals();
            aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(new AFe1bSDK(getMediationNetwork())));
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).afErrorLogForExcManagerOnly().getMediationNetwork(new AFd1uSDK.AFa1uSDK() { // from class: com.appsflyer.internal.b
                @Override // com.appsflyer.internal.AFd1uSDK.AFa1uSDK
                public final void onConfigurationChanged(boolean z11) {
                    this.f6308a.getMediationNetwork(z11);
                }
            });
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).areAllFieldsValid().getMonetizationNetwork(getRevenue());
            AFj1sSDK aFj1sSDKAFLogger = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.c
                @Override // java.lang.Runnable
                public final void run() throws UnsupportedEncodingException {
                    this.f6309b.copydefault();
                }
            };
            AFi1cSDK mediationNetwork = aFj1sSDKAFLogger.getMediationNetwork(runnable);
            Runnable monetizationNetwork = aFj1sSDKAFLogger.getMonetizationNetwork(mediationNetwork, runnable);
            aFj1sSDKAFLogger.getCurrencyIso4217Code.add(mediationNetwork);
            aFj1sSDKAFLogger.getCurrencyIso4217Code.add(new AFj1lSDK(aFj1sSDKAFLogger.getRevenue.getCurrencyIso4217Code(), monetizationNetwork));
            aFj1sSDKAFLogger.getCurrencyIso4217Code.add(new AFj1wSDK(monetizationNetwork, aFj1sSDKAFLogger.getRevenue, new AFj1ySDK()));
            aFj1sSDKAFLogger.getCurrencyIso4217Code.add(new AFj1oSDK(monetizationNetwork, aFj1sSDKAFLogger.getRevenue));
            aFj1sSDKAFLogger.getCurrencyIso4217Code.add(new AFj1uSDK(aFj1sSDKAFLogger.getRevenue.getMonetizationNetwork(), aFj1sSDKAFLogger.getRevenue.getCurrencyIso4217Code(), monetizationNetwork));
            aFj1sSDKAFLogger.getMonetizationNetwork(monetizationNetwork);
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) aFj1sSDKAFLogger.getCurrencyIso4217Code.toArray(new AFj1tSDK[0])) {
                aFj1tSDK.AFAdRevenueData(aFj1sSDKAFLogger.getRevenue.AFInAppEventParameterName().getMonetizationNetwork);
            }
            if (!aFj1sSDKAFLogger.getMonetizationNetwork()) {
                f6287e = (AFLogger + 61) % 128;
                aFj1sSDKAFLogger.getMediationNetwork(aFj1sSDKAFLogger.getRevenue.AFInAppEventParameterName().getMonetizationNetwork, monetizationNetwork, aFj1sSDKAFLogger.getRevenue);
            }
        } else {
            AFLogger.INSTANCE.m5978w(AFh1ySDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1kSDK aFd1kSDKCopy = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy();
        if (appsFlyerConversionListener == null) {
            f6287e = (AFLogger + 99) % 128;
            str2 = "null";
        } else {
            f6287e = (AFLogger + 75) % 128;
            str2 = "conversionDataListener";
        }
        aFd1kSDKCopy.getMonetizationNetwork("init", str, str2);
        AFLogger.INSTANCE.force(AFh1ySDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.4", getMonetizationNetwork));
        this.getMediationNetwork = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        f6287e = (AFLogger + 37) % 128;
        getMonetizationNetwork(context);
        boolean revenue = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).getCurrencyIso4217Code().getRevenue(context);
        int i11 = f6287e + 11;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) throws UnsupportedEncodingException {
        if (!this.toString) {
            int i11 = f6287e + 47;
            AFLogger = i11 % 128;
            if (i11 % 2 == 0) {
                getMonetizationNetwork("logAdRevenue");
                return;
            } else {
                getMonetizationNetwork("logAdRevenue");
                throw null;
            }
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i12 = AFLogger + 59;
            f6287e = i12 % 128;
            if (i12 % 2 != 0) {
                AFLogger.INSTANCE.m5978w(AFh1ySDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                return;
            } else {
                AFLogger.INSTANCE.m5978w(AFh1ySDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                throw null;
            }
        }
        if (((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork()) {
            AFLogger = (f6287e + 87) % 128;
            AFLogger.INSTANCE.m5978w(AFh1ySDK.AD_REVENUE, "SDK is stopped");
        } else if (!AFk1wSDK.AFAdRevenueData(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork())) {
            getCurrencyIso4217Code(new Object[]{this, new AFh1jSDK(aFAdRevenueData, map)}, -266463911, 266463918, System.identityHashCode(this));
        } else {
            AFLogger = (f6287e + 1) % 128;
            copy();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) throws UnsupportedEncodingException {
        AFLogger = (f6287e + 27) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("logSession", new String[0]);
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getRevenue();
        AFAdRevenueData(context, AFh1vSDK.logSession);
        getRevenue(context, (String) null, (Map<String, Object>) null);
        int i11 = AFLogger + 35;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 30 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        int i11;
        int i12 = AFLogger + 33;
        f6287e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 72 / 0;
            if (uri != null) {
                if (!uri.toString().isEmpty()) {
                    if (context == null) {
                        AFa1qSDK aFa1qSDKMo5947e = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e();
                        StringBuilder sb2 = new StringBuilder("Context is \"");
                        sb2.append(context);
                        sb2.append("\"");
                        aFa1qSDKMo5947e.getRevenue(sb2.toString(), DeepLinkResult.Error.NETWORK);
                        return;
                    }
                    getMonetizationNetwork(context);
                    ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().m5922g_(AFa1gSDK.AFAdRevenueData(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).afWarnLog()), Uri.parse(uri.toString()));
                    i11 = f6287e + 105;
                    AFLogger = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            }
        } else if (uri != null) {
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    AFa1qSDK aFa1qSDKMo5947e2 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e();
                    StringBuilder sb3 = new StringBuilder("Context is \"");
                    sb3.append(context);
                    sb3.append("\"");
                    aFa1qSDKMo5947e2.getRevenue(sb3.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                getMonetizationNetwork(context);
                ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().m5922g_(AFa1gSDK.AFAdRevenueData(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).afWarnLog()), Uri.parse(uri.toString()));
                i11 = f6287e + 105;
                AFLogger = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        AFa1qSDK aFa1qSDKMo5947e3 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e();
        StringBuilder sb4 = new StringBuilder("Link is \"");
        sb4.append(uri);
        sb4.append("\"");
        aFa1qSDKMo5947e3.getRevenue(sb4.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i11 = f6287e + 3;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("registerConversionListener", new String[0]);
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("registerConversionListener", new String[0]);
        }
        getCurrencyIso4217Code(appsFlyerConversionListener);
        AFLogger = (f6287e + 59) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        f6287e = (AFLogger + 87) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            return;
        }
        getRevenue = appsFlyerInAppPurchaseValidatorListener;
        int i11 = AFLogger + 75;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFLogger = (f6287e + 83) % 128;
        getMonetizationNetwork(context);
        PurchaseHandler purchaseHandlerComponent1 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component1();
        if (purchaseHandlerComponent1.getMediationNetwork(map, purchaseValidationCallback, "purchases")) {
            AFe1fSDK aFe1fSDK = new AFe1fSDK(map, purchaseValidationCallback, purchaseHandlerComponent1.getMonetizationNetwork);
            AFe1nSDK aFe1nSDK = purchaseHandlerComponent1.getRevenue;
            aFe1nSDK.getMonetizationNetwork.execute(aFe1nSDK.new RunnableC51572(aFe1fSDK));
            AFLogger = (f6287e + 125) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        f6287e = (AFLogger + 93) % 128;
        getMonetizationNetwork(context);
        PurchaseHandler purchaseHandlerComponent1 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component1();
        if (purchaseHandlerComponent1.getMediationNetwork(map, purchaseValidationCallback, "subscriptions")) {
            AFe1iSDK aFe1iSDK = new AFe1iSDK(map, purchaseValidationCallback, purchaseHandlerComponent1.getMonetizationNetwork);
            AFe1nSDK aFe1nSDK = purchaseHandlerComponent1.getRevenue;
            aFe1nSDK.getMonetizationNetwork.execute(aFe1nSDK.new RunnableC51572(aFe1iSDK));
        }
        int i11 = AFLogger + 89;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01b0  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(@Nullable Activity activity) {
        long j11;
        long jLongValue;
        AFLogger = (f6287e + 55) % 128;
        if (activity != null && activity.getIntent() != null) {
            AFd1kSDK aFd1kSDKCopy = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb2 = new StringBuilder("activity_intent_");
            sb2.append(activity.getIntent().toString());
            aFd1kSDKCopy.getMonetizationNetwork("sendPushNotificationData", localClassName, sb2.toString());
        } else if (activity != null) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("sendPushNotificationData", "activity_null");
            f6287e = (AFLogger + 115) % 128;
        }
        AFc1iSDK aFc1iSDKMo5949v = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v();
        String currencyIso4217Code = getCurrencyIso4217Code(activity);
        aFc1iSDKMo5949v.getRevenue = currencyIso4217Code;
        if (currencyIso4217Code != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
                j11 = jLongValue;
            } else {
                try {
                    long j12 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", C33536a4.f68797g);
                    jLongValue = jCurrentTimeMillis;
                    for (Long l11 : this.copydefault.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(aFc1iSDKMo5949v.getRevenue);
                            JSONObject jSONObject2 = new JSONObject(this.copydefault.get(l11));
                            j11 = jCurrentTimeMillis;
                            try {
                                if (jSONObject.opt(C33556b3.f69038e2).equals(jSONObject2.opt(C33556b3.f69038e2)) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb3 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb3.append(jSONObject2);
                                    sb3.append(", new: ");
                                    sb3.append(jSONObject);
                                    sb3.append(")");
                                    AFLogger.afInfoLog(sb3.toString());
                                    aFc1iSDKMo5949v.getRevenue = null;
                                    return;
                                }
                                if (j11 - l11.longValue() > j12) {
                                    f6287e = (AFLogger + 87) % 128;
                                    this.copydefault.remove(l11);
                                }
                                if (l11.longValue() <= jLongValue) {
                                    jLongValue = l11.longValue();
                                }
                                f6287e = (AFLogger + 51) % 128;
                                jCurrentTimeMillis = j11;
                            } catch (Throwable th2) {
                                th = th2;
                                StringBuilder sb4 = new StringBuilder("Error while handling push notification measurement: ");
                                sb4.append(th.getClass().getSimpleName());
                                AFLogger.afErrorLog(sb4.toString(), th);
                                if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                    StringBuilder sb5 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                                    sb5.append(jLongValue);
                                    sb5.append(")");
                                    AFLogger.afInfoLog(sb5.toString());
                                    this.copydefault.remove(Long.valueOf(jLongValue));
                                }
                                this.copydefault.put(Long.valueOf(j11), aFc1iSDKMo5949v.getRevenue);
                                start(activity);
                                AFLogger = (f6287e + 33) % 128;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j11 = jCurrentTimeMillis;
                        }
                    }
                    j11 = jCurrentTimeMillis;
                } catch (Throwable th4) {
                    th = th4;
                    j11 = jCurrentTimeMillis;
                    jLongValue = j11;
                }
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb6 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb6.append(jLongValue);
                sb6.append(")");
                AFLogger.afInfoLog(sb6.toString());
                this.copydefault.remove(Long.valueOf(jLongValue));
            }
            this.copydefault.put(Long.valueOf(j11), aFc1iSDKMo5949v.getRevenue);
            start(activity);
        }
        AFLogger = (f6287e + 33) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) throws UnsupportedEncodingException {
        Object currencyIso4217Code;
        int i11 = AFLogger + 41;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            AFd1kSDK aFd1kSDKCopy = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFd1kSDKCopy.getMonetizationNetwork("setAndroidIdData", strArr);
            currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this));
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setAndroidIdData", str);
            currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this));
        }
        ((AFd1zSDK) currencyIso4217Code).mo5949v().getMediationNetwork = str;
        int i12 = AFLogger + 31;
        f6287e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 26 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) throws UnsupportedEncodingException {
        AFLogger = (f6287e + 9) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID)))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.ONELINK_ID, str}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        int i11 = AFLogger + 125;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z11) throws UnsupportedEncodingException {
        AFLogger = (f6287e + 75) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setCollectAndroidID", String.valueOf(z11));
        getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z11)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z11)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        int i11 = f6287e + 47;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 73 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z11) throws UnsupportedEncodingException {
        int i11 = f6287e + 95;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            AFd1kSDK aFd1kSDKCopy = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z11);
            aFd1kSDKCopy.getMonetizationNetwork("setCollectIMEI", strArr);
            getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z11)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
            getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z11)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setCollectIMEI", String.valueOf(z11));
            getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z11)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
            getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z11)}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        }
        int i12 = AFLogger + 5;
        f6287e = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        int i11 = f6287e + 31;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            Objects.requireNonNull(appsFlyerConsent);
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v().component4 = appsFlyerConsent;
            int i12 = 68 / 0;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v().component4 = appsFlyerConsent;
        }
        int i13 = f6287e + 111;
        AFLogger = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        f6287e = (AFLogger + 85) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i11 = f6287e + 59;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        setCustomerUserId(r5);
        r0 = new java.lang.StringBuilder("CustomerUserId set: ");
        r0.append(r5);
        r0.append(" - Initializing AppsFlyer Tacking");
        com.appsflyer.AFLogger.afInfoLog(r0.toString(), true);
        r5 = com.appsflyer.AppsFlyerProperties.getInstance().getReferrer(((com.appsflyer.internal.AFd1zSDK) getCurrencyIso4217Code(new java.lang.Object[]{r4}, 254507867, -254507852, java.lang.System.identityHashCode(r4))).component4());
        AFAdRevenueData(r6, com.appsflyer.internal.AFh1vSDK.setCustomerIdAndLogSession);
        ((com.appsflyer.internal.AFd1zSDK) getCurrencyIso4217Code(new java.lang.Object[]{r4}, 254507867, -254507852, java.lang.System.identityHashCode(r4))).AFKeystoreWrapper().getMonetizationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        if (r5 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        com.appsflyer.internal.AFa1ySDK.f6287e = (com.appsflyer.internal.AFa1ySDK.AFLogger + 77) % 128;
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        if ((r6 instanceof android.app.Activity) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        ((android.app.Activity) r6).getIntent();
        com.appsflyer.internal.AFa1ySDK.f6287e = (com.appsflyer.internal.AFa1ySDK.AFLogger + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        getMediationNetwork(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        setCustomerUserId(r5);
        com.appsflyer.AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(java.lang.String.valueOf(r5)), true);
        com.appsflyer.internal.AFa1ySDK.AFLogger = (com.appsflyer.internal.AFa1ySDK.f6287e + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (getCurrencyIso4217Code() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (getCurrencyIso4217Code() != false) goto L10;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) throws UnsupportedEncodingException {
        if (context == null) {
            return;
        }
        int i11 = AFLogger + 111;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 75 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) throws UnsupportedEncodingException {
        f6287e = (AFLogger + 59) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getCurrencyIso4217Code(new Object[]{AppsFlyerProperties.APP_USER_ID, str}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        f6287e = (AFLogger + 119) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z11) {
        int i11 = f6287e + 119;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        setLogLevel(z11 ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
        f6287e = (AFLogger + 97) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z11) {
        AFLogger = (f6287e + 99) % 128;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z11)));
        getRevenue(AppsFlyerProperties.DISABLE_NETWORK_DATA, z11);
        AFLogger = (f6287e + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        f6287e = (AFLogger + 109) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        f6287e = (AFLogger + 7) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        AFLogger = (f6287e + 123) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setImeiData", str);
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().AFAdRevenueData(str);
        int i11 = AFLogger + 119;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 61 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z11) {
        AFLogger = (f6287e + 41) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setIsUpdate", String.valueOf(z11));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z11);
        int i11 = f6287e + 55;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        AFLogger = (f6287e + 33) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setOaidData", str);
        AFb1iSDK.getCurrencyIso4217Code = str;
        int i11 = AFLogger + 73;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        f6287e = (AFLogger + 47) % 128;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().areAllFieldsValid = strArr;
        int i11 = AFLogger + 27;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 52 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i11 = f6287e + 99;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i12 = AFLogger + 65;
        f6287e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 26 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        int i11 = AFLogger + 77;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            AFb1qSDK aFb1qSDK = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v().getCurrencyIso4217Code;
            throw null;
        }
        AFc1iSDK aFc1iSDKMo5949v = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v();
        if (aFc1iSDKMo5949v.getCurrencyIso4217Code == null) {
            aFc1iSDKMo5949v.getCurrencyIso4217Code = new AFb1qSDK();
        }
        AFb1qSDK aFb1qSDK2 = aFc1iSDKMo5949v.getCurrencyIso4217Code;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        if (map == null || map.isEmpty()) {
            AFLogger.afWarnLog(aFb1qSDK2.getMediationNetwork.remove(str) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(str));
            int i12 = f6287e + 65;
            AFLogger = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 76 / 0;
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Setting partner data for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(map);
        AFLogger.afDebugLog(sb2.toString());
        int length = new JSONObject(map).toString().length();
        if (length <= 1000) {
            aFb1qSDK2.getMediationNetwork.put(str, map);
            aFb1qSDK2.getMonetizationNetwork.remove(str);
            return;
        }
        AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        HashMap map2 = new HashMap();
        map2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "limit exceeded: ".concat(String.valueOf(length)));
        aFb1qSDK2.getMonetizationNetwork.put(str, map2);
        int i14 = f6287e + 53;
        AFLogger = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i11 = AFLogger + 59;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v().AFAdRevenueData = AFj1dSDK.AFAdRevenueData(str);
            throw null;
        }
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v().AFAdRevenueData = AFj1dSDK.AFAdRevenueData(str);
        f6287e = (AFLogger + 21) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger = (f6287e + 25) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1qSDK aFa1qSDKMo5947e = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e();
        aFa1qSDKMo5947e.component1.clear();
        aFa1qSDKMo5947e.component1.addAll(Arrays.asList(strArr));
        AFLogger = (f6287e + 59) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i11 = f6287e + 59;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            setSharingFilterForPartners(TtmlNode.COMBINE_ALL);
            return;
        }
        String[] strArr = new String[0];
        strArr[1] = TtmlNode.COMBINE_ALL;
        setSharingFilterForPartners(strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z11, Context context) {
        AFLogger = (f6287e + 55) % 128;
        getMonetizationNetwork(context);
        final AFd1zSDK aFd1zSDK = (AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this));
        aFd1zSDK.AFKeystoreWrapper().getMonetizationNetwork(z11);
        aFd1zSDK.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                AFa1ySDK.getMonetizationNetwork(aFd1zSDK);
            }
        });
        if (z11) {
            f6287e = (AFLogger + 45) % 128;
            aFd1zSDK.component4().getRevenue("is_stop_tracking_used", true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        f6287e = (AFLogger + 97) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("unregisterConversionListener", new String[0]);
        this.getMediationNetwork = null;
        int i11 = AFLogger + 25;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z11) {
        String strConcat;
        boolean z12;
        int i11 = f6287e + 39;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            strConcat = "initAfterCustomerUserID: ".concat(String.valueOf(z11));
            z12 = false;
        } else {
            strConcat = "initAfterCustomerUserID: ".concat(String.valueOf(z11));
            z12 = true;
        }
        AFLogger.afInfoLog(strConcat, z12);
        getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z11);
        f6287e = (AFLogger + 83) % 128;
    }

    static {
        component2();
        getMonetizationNetwork = "360";
        AFAdRevenueData = "6.17";
        getRevenue = null;
        component4 = new AFa1ySDK();
        AFLogger = (f6287e + 45) % 128;
    }

    @VisibleForTesting
    public AFa1ySDK() {
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).force().getMediationNetwork();
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).force().getMonetizationNetwork();
        AFe1nSDK aFe1nSDKEquals = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).equals();
        aFe1nSDKEquals.getMediationNetwork.add(new AFa1vSDK());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z11) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z11)}, 221912299, -221912294, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        return (String) getCurrencyIso4217Code(new Object[]{this, context}, 315435756, -315435739, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -2044697909, 2044697919, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 379146099, -379146087, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this}, -242940584, 242940600, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d11, double d12) throws UnsupportedEncodingException {
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("logLocation", String.valueOf(d11), String.valueOf(d12));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d12));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d11));
        getRevenue(context, AFInAppEventType.LOCATION_COORDINATES, map);
        int i11 = f6287e + 47;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, context}, -1961278521, 1961278534, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull final Intent intent, @NonNull Context context) {
        if (intent == null) {
            AFLogger = (f6287e + 37) % 128;
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().getRevenue("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            if (context == null) {
                ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().getRevenue("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            }
            final Context applicationContext = context.getApplicationContext();
            getMonetizationNetwork(applicationContext);
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6316b.m5932e_(applicationContext, intent);
                }
            });
            int i11 = AFLogger + 69;
            f6287e = i11 % 128;
            if (i11 % 2 != 0) {
            } else {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, map}, -769285879, 769285879, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, str}, 1321839210, -1321839186, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z11) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z11)}, 540667818, -540667795, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z11) {
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z11)));
        boolean z12 = false;
        if (!z11) {
            int i11 = f6287e + 107;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                z12 = true;
            }
            z12 = !z12;
        } else {
            f6287e = (AFLogger + 93) % 128;
        }
        AFb1iSDK.AFAdRevenueData = Boolean.valueOf(z12);
        AFd1zSDK aFd1zSDK = (AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this));
        aFd1zSDK.mo5949v().areAllFieldsValid = z11;
        if (!z11) {
            AFe1nSDK aFe1nSDKEquals = aFd1zSDK.equals();
            aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(new AFe1bSDK(getMediationNetwork())));
        } else {
            f6287e = (AFLogger + 117) % 128;
            aFd1zSDK.mo5949v().component3 = null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@Nullable String str, @NonNull String str2) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, str, str2}, 512234888, -512234880, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(@NonNull String str) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, str}, 804454989, -804454969, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z11;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            f6287e = (AFLogger + 59) % 128;
            z11 = true;
        } else {
            z11 = false;
        }
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("log", String.valueOf(z11));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (!z11) {
            f6287e = (AFLogger + 37) % 128;
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).force().getMonetizationNetwork();
            return;
        }
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).force().component2();
        int i11 = AFLogger + 111;
        f6287e = i11 % 128;
        if (i11 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i11) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, Integer.valueOf(i11)}, 1740352061, -1740352039, i11);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, pluginInfo}, -1706371488, 1706371507, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, str, str2, str3}, 666789380, -666789379, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, strArr}, 2370661, -2370658, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v().getMonetizationNetwork = new AFb1vSDK(strArr);
        int i11 = AFLogger + 7;
        f6287e = i11 % 128;
        if (i11 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        boolean z11;
        getMonetizationNetwork(context);
        AFg1vSDK aFg1vSDK = new AFg1vSDK(context);
        if (str != null && !str.trim().isEmpty()) {
            AFLogger.INSTANCE.m5976i(AFh1ySDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
            AFf1aSDK aFf1aSDKAFAdRevenueData = aFg1vSDK.AFAdRevenueData();
            if (aFf1aSDKAFAdRevenueData == null || !str.equals(aFf1aSDKAFAdRevenueData.getMediationNetwork)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (aFf1aSDKAFAdRevenueData != null && jCurrentTimeMillis - aFf1aSDKAFAdRevenueData.AFAdRevenueData <= TimeUnit.SECONDS.toMillis(2L)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                AFf1aSDK aFf1aSDK = new AFf1aSDK(str, jCurrentTimeMillis, !z11);
                aFg1vSDK.getMonetizationNetwork.getMonetizationNetwork("afUninstallToken", aFf1aSDK.getMediationNetwork);
                aFg1vSDK.getMonetizationNetwork.getCurrencyIso4217Code("afUninstallToken_received_time", aFf1aSDK.AFAdRevenueData);
                aFg1vSDK.getMonetizationNetwork.getRevenue("afUninstallToken_queued", aFf1aSDK.getCurrencyIso4217Code);
                if (z11) {
                    AFa1ySDK monetizationNetwork = getMonetizationNetwork();
                    AFd1zSDK aFd1zSDK = (AFd1zSDK) getCurrencyIso4217Code(new Object[]{monetizationNetwork}, 254507867, -254507852, System.identityHashCode(monetizationNetwork));
                    AFf1mSDK aFf1mSDK = new AFf1mSDK(str, aFd1zSDK);
                    AFe1nSDK aFe1nSDKEquals = aFd1zSDK.equals();
                    aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(aFf1mSDK));
                    return;
                }
                return;
            }
            return;
        }
        AFLogger.INSTANCE.m5978w(AFh1ySDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
    }

    private boolean component4() {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this}, -296017841, 296017845, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) throws UnsupportedEncodingException {
        HashMap map2 = map == null ? null : new HashMap(map);
        getMonetizationNetwork(context);
        AFh1gSDK aFh1gSDK = new AFh1gSDK();
        aFh1gSDK.areAllFieldsValid = str;
        aFh1gSDK.getRevenue = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.mo5918w(AFh1ySDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1gSDK.getMonetizationNetwork(mapSingletonMap);
        }
        aFh1gSDK.AFAdRevenueData = map2;
        AFd1kSDK aFd1kSDKCopy = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy();
        Map map5 = aFh1gSDK.AFAdRevenueData;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1kSDKCopy.getMonetizationNetwork("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            AFAdRevenueData(context, AFh1vSDK.logEvent);
        }
        getMonetizationNetwork(aFh1gSDK, AFAdRevenueData(context));
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        AFLogger = (f6287e + 111) % 128;
        aFa1ySDK.setSharingFilterForPartners(strArr);
        int i11 = f6287e + 9;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        int i11 = AFLogger + 79;
        f6287e = i11 % 128;
        if (i11 % 2 != 0) {
            start(context, str, null);
        } else {
            start(context, str, null);
            throw null;
        }
    }

    @NonNull
    private AFj1tSDK[] areAllFieldsValid() {
        Object[] array;
        int i11 = f6287e + 19;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            array = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFLogger().getCurrencyIso4217Code.toArray(new AFj1tSDK[0]);
        } else {
            array = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFLogger().getCurrencyIso4217Code.toArray(new AFj1tSDK[0]);
        }
        return (AFj1tSDK[]) array;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j11) {
        AFLogger = (f6287e + 55) % 128;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().getCurrencyIso4217Code = deepLinkListener;
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5947e().component2 = j11;
        AFLogger = (f6287e + 19) % 128;
    }

    public static AFa1ySDK getMonetizationNetwork() {
        int i11 = (AFLogger + 89) % 128;
        f6287e = i11;
        AFa1ySDK aFa1ySDK = component4;
        int i12 = i11 + 117;
        AFLogger = i12 % 128;
        if (i12 % 2 == 0) {
            return aFa1ySDK;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getMonetizationNetwork(AFd1zSDK aFd1zSDK) {
        f6287e = (AFLogger + 57) % 128;
        aFd1zSDK.AFInAppEventType().getMonetizationNetwork();
        int i11 = AFLogger + 91;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static void getRevenue(String str, boolean z11) {
        int i11 = f6287e + 31;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, z11);
            int i12 = f6287e + 21;
            AFLogger = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        AppsFlyerProperties.getInstance().set(str, z11);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        f6287e = (AFLogger + 59) % 128;
        String str = null;
        for (String str2 : strArr) {
            f6287e = (AFLogger + 45) % 128;
            if (C51404.getMediationNetwork[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1dSDK.AFAdRevenueData(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).afInfoLog().getMediationNetwork()) {
            return;
        }
        if (!this.toString) {
            getMonetizationNetwork("start");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        getMonetizationNetwork(context);
        final AFh1tSDK aFh1tSDKComponent3 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component3();
        aFh1tSDKComponent3.getMediationNetwork(AFh1uSDK.getMonetizationNetwork(context));
        if (this.areAllFieldsValid == null) {
            Application applicationM5999O_ = AFj1jSDK.m5999O_(context);
            if (applicationM5999O_ != null) {
                this.areAllFieldsValid = applicationM5999O_;
            } else {
                f6287e = (AFLogger + 49) % 128;
                return;
            }
        }
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).copy().getMonetizationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.GENERAL;
        String str2 = getMonetizationNetwork;
        aFLogger.m5976i(aFh1ySDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.17.4", str2));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        aFLogger.m5976i(aFh1ySDK, sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component4());
        if (!(!TextUtils.isEmpty(str))) {
            if (TextUtils.isEmpty(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork())) {
                AFLogger = (f6287e + 63) % 128;
                copy();
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        } else {
            AFLogger = (f6287e + 75) % 128;
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getCurrencyIso4217Code(str);
        }
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).areAllFieldsValid().getMonetizationNetwork(getRevenue());
        component1();
        m5928c_(this.areAllFieldsValid.getBaseContext(), this.copy.getCurrencyIso4217Code().m5954n_());
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5950w().getMonetizationNetwork();
        this.copy.afInfoLog().getCurrencyIso4217Code(context, new AFb1bSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFa1ySDK.2
            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getMonetizationNetwork(@NonNull AFh1pSDK aFh1pSDK) throws UnsupportedEncodingException {
                Intent intent;
                aFh1tSDKComponent3.getRevenue();
                AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                AFd1zSDK aFd1zSDK = (AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK));
                aFd1zSDK.areAllFieldsValid().getMonetizationNetwork(AFa1ySDK.this.getRevenue());
                AFa1ySDK.this.component1();
                int iAFAdRevenueData = aFd1zSDK.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (iAFAdRevenueData < 2) {
                    AFa1ySDK aFa1ySDK2 = AFa1ySDK.this;
                    ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK2}, 254507867, -254507852, System.identityHashCode(aFa1ySDK2))).copydefault().getMonetizationNetwork();
                }
                AFh1iSDK aFh1iSDK = new AFh1iSDK();
                if (aFh1pSDK != null) {
                    AFa1ySDK aFa1ySDK3 = AFa1ySDK.this;
                    ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK3}, 254507867, -254507852, System.identityHashCode(aFa1ySDK3))).mo5947e().m5921f_(AFa1gSDK.getMonetizationNetwork(aFh1iSDK), aFh1pSDK.getRevenue, aFd1zSDK.AFInAppEventParameterName().getMonetizationNetwork);
                    AFh1qSDK aFh1qSDKAfRDLog = aFd1zSDK.afRDLog();
                    if (aFh1qSDKAfRDLog != null && (intent = aFh1pSDK.getRevenue) != null) {
                        AFa1ySDK aFa1ySDK4 = AFa1ySDK.this;
                        aFh1qSDKAfRDLog.mo5984u_(intent, ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK4}, 254507867, -254507852, System.identityHashCode(aFa1ySDK4))).mo5947e());
                    }
                }
                AFa1ySDK aFa1ySDK5 = AFa1ySDK.this;
                aFh1iSDK.getRevenue = appsFlyerRequestListener;
                aFa1ySDK5.getMonetizationNetwork(aFh1iSDK, aFh1pSDK);
                AFa1ySDK aFa1ySDK6 = AFa1ySDK.this;
                ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK6}, 254507867, -254507852, System.identityHashCode(aFa1ySDK6))).getMediationNetwork().AFAdRevenueData();
                AFa1ySDK aFa1ySDK7 = AFa1ySDK.this;
                ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK7}, 254507867, -254507852, System.identityHashCode(aFa1ySDK7))).getMediationNetwork().getCurrencyIso4217Code.getRevenue("didSendRevenueTriggerOnLastBackground", false);
            }

            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getRevenue() {
                AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                Context context2 = ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).AFInAppEventParameterName().getMonetizationNetwork;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1tSDK aFh1tSDK = aFh1tSDKComponent3;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j11 = aFh1tSDK.component1;
                if (j11 != 0) {
                    long j12 = jCurrentTimeMillis - j11;
                    if (j12 > 0 && j12 < 1000) {
                        j12 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j12);
                    aFh1tSDK.toString = seconds;
                    aFh1tSDK.getMediationNetwork.getCurrencyIso4217Code("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1ySDK aFa1ySDK2 = AFa1ySDK.this;
                ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK2}, 254507867, -254507852, System.identityHashCode(aFa1ySDK2))).afErrorLogForExcManagerOnly().getMonetizationNetwork();
                AFa1ySDK aFa1ySDK3 = AFa1ySDK.this;
                AFd1kSDK aFd1kSDKCopy = ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK3}, 254507867, -254507852, System.identityHashCode(aFa1ySDK3))).copy();
                if (aFd1kSDKCopy.component4()) {
                    aFd1kSDKCopy.AFAdRevenueData();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFd1kSDKCopy.mo5956q_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFd1kSDKCopy.getMonetizationNetwork();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1ySDK aFa1ySDK4 = AFa1ySDK.this;
                ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK4}, 254507867, -254507852, System.identityHashCode(aFa1ySDK4))).copydefault().AFAdRevenueData();
                AFa1ySDK aFa1ySDK5 = AFa1ySDK.this;
                ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK5}, 254507867, -254507852, System.identityHashCode(aFa1ySDK5))).afWarnLog().getCurrencyIso4217Code();
                AFa1ySDK aFa1ySDK6 = AFa1ySDK.this;
                ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK6}, 254507867, -254507852, System.identityHashCode(aFa1ySDK6))).getMediationNetwork().AFAdRevenueData();
                AFa1ySDK aFa1ySDK7 = AFa1ySDK.this;
                AFh1qSDK aFh1qSDKAfRDLog = ((AFd1zSDK) AFa1ySDK.getCurrencyIso4217Code(new Object[]{aFa1ySDK7}, 254507867, -254507852, System.identityHashCode(aFa1ySDK7))).afRDLog();
                if (aFh1qSDKAfRDLog != null) {
                    aFh1qSDKAfRDLog.getMonetizationNetwork();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(AFi1fSDK aFi1fSDK) {
        int i11 = f6287e + 41;
        AFLogger = i11 % 128;
        int i12 = i11 % 2;
        getCurrencyIso4217Code(aFi1fSDK);
        if (i12 != 0) {
            int i13 = 40 / 0;
        }
        int i14 = f6287e + 39;
        AFLogger = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 2 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[LOOP:4: B:26:0x0086->B:45:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x005f A[EDGE_INSN: B:70:0x005f->B:68:0x005f BREAK  A[LOOP:3: B:19:0x0060->B:74:0x0060], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x005f A[EDGE_INSN: B:71:0x005f->B:68:0x005f BREAK  A[LOOP:3: B:19:0x0060->B:74:0x0060], SYNTHETIC] */
    private static void getMediationNetwork(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            int i11 = 0;
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                while (i11 < jSONArray.length()) {
                    int i12 = f6287e + 13;
                    AFLogger = i12 % 128;
                    if (i12 % 2 != 0) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i11)));
                        i11 += 23;
                    } else {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i11)));
                        i11++;
                    }
                }
            } catch (JSONException e11) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e11);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (true) {
                if (!itKeys2.hasNext()) {
                    break loop2;
                }
                int i13 = f6287e + 43;
                AFLogger = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i14 = 0;
                    while (i14 < jSONArray2.length()) {
                        int i15 = f6287e + 93;
                        AFLogger = i15 % 128;
                        if (i15 % 2 == 0) {
                            if (jSONArray2.getLong(i14) == ((Long) arrayList.get(0)).longValue()) {
                                break;
                            }
                            if (jSONArray2.getLong(i14) != ((Long) arrayList.get(1)).longValue()) {
                                break;
                                break;
                            }
                            f6287e = (AFLogger + 15) % 128;
                            if (jSONArray2.getLong(i14) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                                break;
                            } else {
                                i14++;
                                str = next;
                            }
                        } else {
                            if (jSONArray2.getLong(i14) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            if (jSONArray2.getLong(i14) != ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            f6287e = (AFLogger + 15) % 128;
                            if (jSONArray2.getLong(i14) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i14++;
                            str = next;
                        }
                    }
                } catch (JSONException e12) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e12);
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    @VisibleForTesting
    public final void getMonetizationNetwork(@NonNull AFh1mSDK aFh1mSDK, @Nullable AFh1pSDK aFh1pSDK) throws UnsupportedEncodingException {
        int i11 = f6287e + 97;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            getCurrencyIso4217Code(new Object[]{aFh1mSDK, aFh1pSDK}, -969329783, 969329801, (int) System.currentTimeMillis());
            if (((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork() == null) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getRevenue;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
            String referrer = AppsFlyerProperties.getInstance().getReferrer(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component4());
            if (referrer == null) {
                int i12 = f6287e + 91;
                AFLogger = i12 % 128;
                if (i12 % 2 == 0) {
                    referrer = "";
                } else {
                    throw null;
                }
            }
            aFh1mSDK.component1 = referrer;
            getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, -266463911, 266463918, System.identityHashCode(this));
            return;
        }
        getCurrencyIso4217Code(new Object[]{aFh1mSDK, aFh1pSDK}, -969329783, 969329801, (int) System.currentTimeMillis());
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getMonetizationNetwork();
        throw null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        String strAFAdRevenueData;
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int i11 = AFLogger + 65;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            strAFAdRevenueData = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).registerClient().AFAdRevenueData();
            int i12 = 72 / 0;
        } else {
            strAFAdRevenueData = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).registerClient().AFAdRevenueData();
        }
        AFLogger = (f6287e + 13) % 128;
        return strAFAdRevenueData;
    }

    private void getRevenue(Context context, String str, Map<String, Object> map) throws UnsupportedEncodingException {
        AFh1gSDK aFh1gSDK = new AFh1gSDK();
        aFh1gSDK.areAllFieldsValid = str;
        aFh1gSDK.AFAdRevenueData = map;
        getMonetizationNetwork(aFh1gSDK, AFAdRevenueData(context));
        int i11 = f6287e + 9;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1nSDK aFe1nSDKEquals = this.copy.equals();
        aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(new AFf1wSDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i11 = f6287e + 3;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public final void component1() {
        int i11 = AFLogger + 123;
        f6287e = i11 % 128;
        if (i11 % 2 != 0) {
            if (AFe1eSDK.component3()) {
                int i12 = AFLogger + 9;
                f6287e = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                return;
            }
            AFd1zSDK aFd1zSDK = (AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this));
            AFe1nSDK aFe1nSDKEquals = aFd1zSDK.equals();
            aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(new AFe1eSDK(aFd1zSDK)));
            return;
        }
        AFe1eSDK.component3();
        throw null;
    }

    @NonNull
    @WorkerThread
    public final Map<String, Object> getRevenue(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        String str;
        Context context = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFInAppEventParameterName().getMonetizationNetwork;
        AFc1pSDK aFc1pSDK = (AFc1pSDK) getCurrencyIso4217Code(new Object[]{this, context}, 659825386, -659825380, System.identityHashCode(this));
        AFg1pSDK aFg1pSDKComponent2 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component2();
        boolean mediationNetwork = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper().getMediationNetwork();
        boolean revenue = aFh1mSDK.getRevenue();
        Map<String, Object> map = aFh1mSDK.getMonetizationNetwork;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        m5925a(null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (!(!mediationNetwork)) {
                AFLogger.INSTANCE.mo5916i(AFh1ySDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1ySDK aFh1ySDK = AFh1ySDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                if (revenue) {
                    str = "Launch";
                    f6287e = (AFLogger + 83) % 128;
                } else {
                    str = aFh1mSDK.areAllFieldsValid;
                }
                sb2.append(str);
                aFLogger.mo5916i(aFh1ySDK, sb2.toString(), true);
            }
            getCurrencyIso4217Code(new Object[]{context}, -1294913833, 1294913847, (int) System.currentTimeMillis());
            int currencyIso4217Code = getCurrencyIso4217Code(aFc1pSDK, revenue);
            int mediationNetwork2 = getMediationNetwork(aFc1pSDK, aFh1mSDK.areAllFieldsValid != null);
            if (revenue && currencyIso4217Code == 1) {
                AppsFlyerProperties.getInstance().AFAdRevenueData = true;
            }
            aFg1pSDKComponent2.getCurrencyIso4217Code(map, currencyIso4217Code, mediationNetwork2);
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m5975e(AFh1ySDK.GENERAL, "Error while preparing to send event", th2, true, true, true);
        }
        AFLogger = (f6287e + 25) % 128;
        return map;
    }

    private static String AFAdRevenueData(String str) {
        f6287e = (AFLogger + 37) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i11 = AFLogger + 21;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 62 / 0;
        }
        return string;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i11 = f6287e + 61;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).mo5950w().getCurrencyIso4217Code(zBooleanValue);
            f6287e = (AFLogger + 99) % 128;
            return null;
        }
        ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).mo5950w().getCurrencyIso4217Code(zBooleanValue);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        if (((com.appsflyer.internal.AFd1zSDK) getCurrencyIso4217Code(new java.lang.Object[]{r1}, 254507867, -254507852, java.lang.System.identityHashCode(r1))).getCurrencyIso4217Code().getRevenue("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        r9 = com.appsflyer.internal.AFa1ySDK.f6287e + 3;
        com.appsflyer.internal.AFa1ySDK.AFLogger = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if ((r9 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.m5971d(com.appsflyer.internal.AFh1ySDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
        r9 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.m5971d(com.appsflyer.internal.AFh1ySDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
    
        r9 = com.appsflyer.internal.AFa1ySDK.AFLogger + 117;
        com.appsflyer.internal.AFa1ySDK.f6287e = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if ((r9 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        if (r9 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.m5971d(com.appsflyer.internal.AFh1ySDK.GENERAL, "AppsFlyer installId can't be null");
        com.appsflyer.internal.AFa1ySDK.AFLogger = (com.appsflyer.internal.AFa1ySDK.f6287e + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        com.appsflyer.internal.AFb1mSDK.getMonetizationNetwork(r9, ((com.appsflyer.internal.AFd1zSDK) getCurrencyIso4217Code(new java.lang.Object[]{r1}, 254507867, -254507852, java.lang.System.identityHashCode(r1))).component4());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        if (r1.toString == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (r1.toString == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.m5971d(com.appsflyer.internal.AFh1ySDK.GENERAL, "AppsFlyerLib.init() method should be called first");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        String str = (String) objArr[1];
        int i11 = AFLogger + 95;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).copy().getMonetizationNetwork("setInstallId", new String[1]);
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).copy().getMonetizationNetwork("setInstallId", new String[0]);
        }
    }

    @Deprecated
    public static Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        AFLogger = (f6287e + 85) % 128;
        if (map.containsKey("meta")) {
            int i11 = AFLogger + 43;
            f6287e = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return (Map) map.get("meta");
        }
        HashMap map2 = new HashMap();
        map.put("meta", map2);
        return map2;
    }

    private static void component1(Context context) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{context}, -1294913833, 1294913847, (int) System.currentTimeMillis());
    }

    public static String AFAdRevenueData() {
        f6287e = (AFLogger + 121) % 128;
        String strAFAdRevenueData = AFAdRevenueData(AppsFlyerProperties.APP_USER_ID);
        int i11 = f6287e + 119;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            return strAFAdRevenueData;
        }
        throw null;
    }

    private void AFAdRevenueData(Context context, AFh1vSDK aFh1vSDK) {
        getMonetizationNetwork(context);
        AFh1tSDK aFh1tSDKComponent3 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).component3();
        AFh1uSDK monetizationNetwork = AFh1uSDK.getMonetizationNetwork(context);
        if (aFh1tSDKComponent3.getCurrencyIso4217Code()) {
            AFLogger = (f6287e + 25) % 128;
            aFh1tSDKComponent3.getCurrencyIso4217Code.put("api_name", aFh1vSDK.toString());
            aFh1tSDKComponent3.getMediationNetwork(monetizationNetwork);
            f6287e = (AFLogger + 27) % 128;
        }
        aFh1tSDKComponent3.getRevenue();
        int i11 = AFLogger + 43;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 83 / 0;
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        Context context = (Context) objArr[1];
        int i11 = AFLogger + 91;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            aFa1ySDK.getMonetizationNetwork(context);
            AFc1pSDK aFc1pSDKComponent4 = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).component4();
            int i12 = 32 / 0;
            return aFc1pSDKComponent4;
        }
        aFa1ySDK.getMonetizationNetwork(context);
        return ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{aFa1ySDK}, 254507867, -254507852, System.identityHashCode(aFa1ySDK))).component4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(boolean z11) {
        int i11 = (AFLogger + 1) % 128;
        f6287e = i11;
        if (!z11) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).force().AFAdRevenueData();
            return;
        }
        int i12 = i11 + 55;
        AFLogger = i12 % 128;
        if (i12 % 2 == 0) {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).force().getRevenue();
        } else {
            ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).force().getRevenue();
            throw null;
        }
    }

    private static void getMonetizationNetwork(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.SDK_LIFECYCLE;
        StringBuilder sb2 = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb2.append(str);
        sb2.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.m5978w(aFh1ySDK, sb2.toString());
        int i11 = AFLogger + 77;
        f6287e = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private void getMonetizationNetwork(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, -266463911, 266463918, System.identityHashCode(this));
    }

    @Nullable
    private AFh1pSDK AFAdRevenueData(Context context) {
        int i11 = f6287e + 5;
        int i12 = i11 % 128;
        AFLogger = i12;
        if (i11 % 2 != 0) {
            boolean z11 = context instanceof Activity;
            throw null;
        }
        if (context instanceof Activity) {
            return new AFh1pSDK((Activity) context, getMediationNetwork().mo5948i());
        }
        f6287e = (i12 + 5) % 128;
        return null;
    }

    public static String getMediationNetwork(SimpleDateFormat simpleDateFormat, long j11) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j11));
        f6287e = (AFLogger + 91) % 128;
        return str;
    }

    @VisibleForTesting
    private void getMediationNetwork(Context context, String str) throws UnsupportedEncodingException {
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        getMonetizationNetwork(context);
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.AFAdRevenueData = null;
        aFh1iSDK.component1 = str;
        aFh1iSDK.getMediationNetwork = null;
        getCurrencyIso4217Code(new Object[]{this, aFh1iSDK}, -266463911, 266463918, System.identityHashCode(this));
        int i11 = f6287e + 125;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static boolean getRevenue(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i11 = f6287e + 57;
                AFLogger = i11 % 128;
                return i11 % 2 == 0;
            }
            f6287e = (AFLogger + 117) % 128;
            try {
                context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                return true;
            } catch (PackageManager.NameNotFoundException e11) {
                AFLogger.INSTANCE.m5972e(AFh1ySDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e11);
                return false;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
    }

    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, -1950683731, 1950683733, System.identityHashCode(this));
    }

    private static void AFAdRevenueData(@NonNull AFh1mSDK aFh1mSDK, @Nullable AFh1pSDK aFh1pSDK) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{aFh1mSDK, aFh1pSDK}, -969329783, 969329801, (int) System.currentTimeMillis());
    }

    private static void AFAdRevenueData(String str, String str2) throws UnsupportedEncodingException {
        getCurrencyIso4217Code(new Object[]{str, str2}, -1672395526, 1672395535, (int) System.currentTimeMillis());
    }

    private void getMediationNetwork(String str) {
        final AFh1mSDK currencyIso4217Code = new AFh1kSDK().getCurrencyIso4217Code(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0));
        currencyIso4217Code.component1 = str;
        if (str == null || str.length() <= 5 || !((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFLogger().getCurrencyIso4217Code(currencyIso4217Code)) {
            return;
        }
        f6287e = (AFLogger + 27) % 128;
        AFk1xSDK.getMonetizationNetwork(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).getRevenue(), new Runnable() { // from class: com.appsflyer.internal.h
            @Override // java.lang.Runnable
            public final void run() throws UnsupportedEncodingException {
                this.f6326b.getMediationNetwork(currencyIso4217Code);
            }
        }, 5L, TimeUnit.MILLISECONDS);
        AFLogger = (f6287e + 35) % 128;
    }

    private static void getRevenue(String str) throws UnsupportedEncodingException {
        try {
            if (new JSONObject(str).has(C33556b3.f69038e2)) {
                getCurrencyIso4217Code(new Object[]{"preInstallName", str}, -1672395526, 1672395535, (int) System.currentTimeMillis());
                AFLogger = (f6287e + 43) % 128;
                return;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i11 = f6287e + 5;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (JSONException e11) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e11);
        }
    }

    private static int getRevenue(AFc1pSDK aFc1pSDK, String str, boolean z11) {
        return ((Integer) getCurrencyIso4217Code(new Object[]{aFc1pSDK, str, Boolean.valueOf(z11)}, -2017973393, 2017973404, (int) System.currentTimeMillis())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFh1mSDK aFh1mSDK) throws UnsupportedEncodingException {
        int i11 = f6287e + 69;
        AFLogger = i11 % 128;
        Object[] objArr = {this, aFh1mSDK};
        if (i11 % 2 != 0) {
            getCurrencyIso4217Code(objArr, -1950683731, 1950683733, System.identityHashCode(this));
            int i12 = 79 / 0;
        } else {
            getCurrencyIso4217Code(objArr, -1950683731, 1950683733, System.identityHashCode(this));
        }
        AFLogger = (f6287e + 9) % 128;
    }

    public static String getMediationNetwork(AFc1pSDK aFc1pSDK, String str) {
        String mediationNetwork = aFc1pSDK.getMediationNetwork("CACHED_CHANNEL", null);
        if (mediationNetwork != null) {
            int i11 = (AFLogger + 103) % 128;
            f6287e = i11;
            AFLogger = (i11 + 59) % 128;
            return mediationNetwork;
        }
        aFc1pSDK.getMonetizationNetwork("CACHED_CHANNEL", str);
        return str;
    }

    private static int getMediationNetwork(AFc1pSDK aFc1pSDK, boolean z11) {
        int i11 = AFLogger + 119;
        f6287e = i11 % 128;
        int i12 = i11 % 2;
        Object[] objArr = {aFc1pSDK, "appsFlyerInAppEventCount", Boolean.valueOf(z11)};
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        if (i12 == 0) {
            ((Integer) getCurrencyIso4217Code(objArr, -2017973393, 2017973404, iCurrentTimeMillis)).intValue();
            throw null;
        }
        int iIntValue = ((Integer) getCurrencyIso4217Code(objArr, -2017973393, 2017973404, iCurrentTimeMillis)).intValue();
        int i13 = f6287e + 125;
        AFLogger = i13 % 128;
        if (i13 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        com.appsflyer.internal.AFa1ySDK.f6287e = (r0 + 5) % 128;
        r0 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        com.appsflyer.internal.AFe1vSDK.AFAdRevenueData(new com.appsflyer.internal.AFe1wSDK(r0, r5.trim()));
        com.appsflyer.internal.AFa1ySDK.f6287e = (com.appsflyer.internal.AFa1ySDK.AFLogger + 77) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getMonetizationNetwork(r5) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getMonetizationNetwork(r5) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r0 = com.appsflyer.internal.AFa1ySDK.AFLogger;
        com.appsflyer.internal.AFa1ySDK.f6287e = (r0 + 69) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i11 = f6287e + 51;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 28 / 0;
        }
    }

    public final AFd1zSDK getMediationNetwork() {
        return (AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this));
    }

    public final boolean getCurrencyIso4217Code() {
        if (getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            int i11 = f6287e + 99;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                AFAdRevenueData();
                throw null;
            }
            if (AFAdRevenueData() == null) {
                AFLogger = (f6287e + 117) % 128;
                return true;
            }
        }
        int i12 = f6287e + 29;
        AFLogger = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private void getCurrencyIso4217Code(AFi1fSDK aFi1fSDK) {
        AFf1ySDK aFf1ySDK = new AFf1ySDK(aFi1fSDK, getMediationNetwork().getCurrencyIso4217Code(), getMediationNetwork(), getMediationNetwork().component2(), getMediationNetwork().AFInAppEventParameterName());
        AFe1nSDK aFe1nSDKEquals = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).equals();
        aFe1nSDKEquals.getMonetizationNetwork.execute(aFe1nSDKEquals.new RunnableC51572(aFf1ySDK));
        AFLogger = (f6287e + 61) % 128;
    }

    private void getCurrencyIso4217Code(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i11 = f6287e + 53;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.getMediationNetwork = appsFlyerConversionListener;
        AFLogger = (f6287e + 41) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void getCurrencyIso4217Code(Map<String, Object> map) {
        boolean z11;
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            AFLogger = (f6287e + 125) % 128;
            z11 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false);
        }
        if (z11 || map.get("advertiserId") == null) {
            return;
        }
        try {
            if (AFk1wSDK.AFAdRevenueData(((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).mo5949v().getMediationNetwork)) {
                int i11 = f6287e + 35;
                AFLogger = i11 % 128;
                if (i11 % 2 == 0) {
                    if (map.remove("android_id") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                    }
                } else {
                    map.remove("android_id");
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            AFf1fSDK aFf1fSDKAFKeystoreWrapper = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).AFKeystoreWrapper();
            if (!AFk1wSDK.AFAdRevenueData((String) AFf1fSDK.AFAdRevenueData(new Object[]{aFf1fSDKAFKeystoreWrapper}, -40073417, 40073417, System.identityHashCode(aFf1fSDKAFKeystoreWrapper))) || map.remove("imei") == null) {
                return;
            }
            int i12 = AFLogger + 37;
            f6287e = i12 % 128;
            if (i12 % 2 != 0) {
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                return;
            }
            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
            try {
                throw null;
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (Exception e11) {
            AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e11);
        }
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        Bundle extras;
        String string = null;
        if (activity != null) {
            int i11 = f6287e + 119;
            AFLogger = i11 % 128;
            if (i11 % 2 == 0) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    int i12 = f6287e + 17;
                    AFLogger = i12 % 128;
                    try {
                        if (i12 % 2 != 0) {
                            extras = intent.getExtras();
                            int i13 = 67 / 0;
                            if (extras != null) {
                            }
                        } else {
                            extras = intent.getExtras();
                            if (extras != null) {
                            }
                            return string;
                        }
                        string = extras.getString("af");
                        if (string != null) {
                            int i14 = AFLogger + 47;
                            f6287e = i14 % 128;
                            if (i14 % 2 == 0) {
                                AFLogger.INSTANCE.m5978w(AFh1ySDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                                int i15 = 48 / 0;
                            } else {
                                AFLogger.INSTANCE.m5978w(AFh1ySDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                            }
                        }
                        return string;
                    } catch (Throwable th2) {
                        AFLogger.INSTANCE.m5972e(AFh1ySDK.ENGAGEMENT, th2.getMessage(), th2);
                        return null;
                    }
                }
            } else {
                activity.getIntent();
                throw null;
            }
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    private String getCurrencyIso4217Code(Context context, String str) {
        int i11 = f6287e + 109;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (context == null) {
            return null;
        }
        getMonetizationNetwork(context);
        String currencyIso4217Code = ((AFd1zSDK) getCurrencyIso4217Code(new Object[]{this}, 254507867, -254507852, System.identityHashCode(this))).getCurrencyIso4217Code().getCurrencyIso4217Code(str);
        int i12 = AFLogger + 35;
        f6287e = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 50 / 0;
        }
        return currencyIso4217Code;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) throws UnsupportedEncodingException {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i11 = f6287e + 91;
                AFLogger = i11 % 128;
                if (i11 % 2 != 0) {
                    jSONObject.put(C33556b3.f69038e2, str);
                    int i12 = 51 / 0;
                } else {
                    jSONObject.put(C33556b3.f69038e2, str);
                }
            }
            if (str2 != null) {
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e11) {
            AFLogger.afErrorLog(e11.getMessage(), e11);
        }
        if (!jSONObject.has(C33556b3.f69038e2)) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            f6287e = (AFLogger + 83) % 128;
            return null;
        }
        getCurrencyIso4217Code(new Object[]{"preInstallName", jSONObject.toString()}, -1672395526, 1672395535, (int) System.currentTimeMillis());
        return null;
    }

    public static int getCurrencyIso4217Code(AFc1pSDK aFc1pSDK, boolean z11) {
        AFLogger = (f6287e + 81) % 128;
        int iIntValue = ((Integer) getCurrencyIso4217Code(new Object[]{aFc1pSDK, "appsFlyerCount", Boolean.valueOf(z11)}, -2017973393, 2017973404, (int) System.currentTimeMillis())).intValue();
        int i11 = f6287e + 85;
        AFLogger = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 78 / 0;
        }
        return iIntValue;
    }

    public final AFc1pSDK getCurrencyIso4217Code(Context context) {
        return (AFc1pSDK) getCurrencyIso4217Code(new Object[]{this, context}, 659825386, -659825380, System.identityHashCode(this));
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{str}, 550242804, -550242783, (int) System.currentTimeMillis())).booleanValue();
    }
}
