package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.facebook.C5501a;
import com.google.firebase.messaging.Constants;
import com.kubi.user.protocol.entity.SignTermItem;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AFa1cSDK implements AFa1aSDK {

    @NotNull
    private final AFc1fSDK AFAdRevenueData;

    @Nullable
    Map<String, Object> getCurrencyIso4217Code;
    private boolean getRevenue;

    public static final class AFa1zSDK implements AFa1bSDK.AFa1ySDK {
        private /* synthetic */ long AFAdRevenueData;

        public AFa1zSDK(long j11) {
            this.AFAdRevenueData = j11;
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1ySDK
        public final void AFAdRevenueData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: " + str);
                Map<String, Object> map2 = AFa1cSDK.this.getCurrencyIso4217Code;
                if (map2 != null) {
                    map2.put(SignTermItem.LINK, str);
                }
                if (str2 != null && (map = AFa1cSDK.this.getCurrencyIso4217Code) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFa1cSDK.getCurrencyIso4217Code;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFa1cSDK.this.getCurrencyIso4217Code;
                if (map4 != null) {
                    map4.put(SignTermItem.LINK, "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.AFAdRevenueData);
            Map<String, Object> map5 = AFa1cSDK.this.getCurrencyIso4217Code;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1ySDK
        public final void getRevenue(@Nullable String str) {
            Map<String, Object> map = AFa1cSDK.this.getCurrencyIso4217Code;
            if (map != null) {
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
            }
        }
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void getCurrencyIso4217Code(boolean z11) {
        this.getRevenue = z11;
    }

    public AFa1cSDK(@NotNull AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.AFAdRevenueData = aFc1fSDK;
    }

    private boolean getCurrencyIso4217Code() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    @Nullable
    public final Map<String, Object> AFAdRevenueData() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final void getMonetizationNetwork() {
        Context context;
        if (getCurrencyIso4217Code() && (context = this.AFAdRevenueData.getMonetizationNetwork) != null) {
            this.getCurrencyIso4217Code = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                C5501a c5501a = C5501a.f7617a;
                C5501a.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1bSDK.3
                    private /* synthetic */ AFa1ySDK getCurrencyIso4217Code;
                    private /* synthetic */ Class getRevenue;

                    public C51353() {
                        cls = cls;
                        aFa1ySDK = aFa1zSDK;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            Object obj2 = objArr[0];
                            if (obj2 != null) {
                                Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                                if (bundle2 != null) {
                                    string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                    string3 = bundle2.getString("target_url");
                                    Bundle bundle3 = bundle2.getBundle("extras");
                                    if (bundle3 != null && (bundle = bundle3.getBundle("deeplink_context")) != null) {
                                        string = bundle.getString("promo_code");
                                    } else {
                                        string = null;
                                    }
                                } else {
                                    string = null;
                                    string2 = null;
                                    string3 = null;
                                }
                                AFa1ySDK aFa1ySDK = aFa1ySDK;
                                if (aFa1ySDK != null) {
                                    aFa1ySDK.AFAdRevenueData(string2, string3, string);
                                }
                            } else {
                                AFa1ySDK aFa1ySDK2 = aFa1ySDK;
                                if (aFa1ySDK2 != null) {
                                    aFa1ySDK2.AFAdRevenueData(null, null, null);
                                }
                            }
                            return null;
                        }
                        AFa1ySDK aFa1ySDK3 = aFa1ySDK;
                        if (aFa1ySDK3 != null) {
                            aFa1ySDK3.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", TypedValues.Custom.S_STRING, context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK.getRevenue("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e11) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e11);
                aFa1zSDK.getRevenue(e11.toString());
            } catch (IllegalAccessException e12) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e12);
                aFa1zSDK.getRevenue(e12.toString());
            } catch (NoSuchMethodException e13) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e13);
                aFa1zSDK.getRevenue(e13.toString());
            } catch (InvocationTargetException e14) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e14);
                aFa1zSDK.getRevenue(e14.toString());
            }
        }
    }

    @Override // com.appsflyer.internal.AFa1aSDK
    public final boolean getMediationNetwork() {
        if (getCurrencyIso4217Code()) {
            Map<String, Object> map = this.getCurrencyIso4217Code;
            if (map == null || map.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
