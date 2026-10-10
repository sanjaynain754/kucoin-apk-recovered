package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p357j3.C40259h;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.facebook.appevents.iap.d */
/* JADX INFO: compiled from: InAppPurchaseLoggerManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0003JY\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/appevents/iap/d;", "", "<init>", "()V", "", "g", "c", "", "e", "()Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "", "", "Lorg/json/JSONObject;", "purchaseDetailsMap", "", "skuDetailsMap", "isSubscription", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "isFirstAppLaunch", "d", "(Ljava/util/Map;Ljava/util/Map;ZLjava/lang/String;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Map;Z)Ljava/util/Map;", "b", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "f", "(Ljava/util/Map;ZLcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5536d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5536d f7942a = new C5536d();

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m8207c() {
        if (C42757a.m93689d(C5536d.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = C5501a.m7799m().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            C5501a.m7799m().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5536d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m8208d(@NotNull Map<String, JSONObject> purchaseDetailsMap, @NotNull Map<String, ? extends JSONObject> skuDetailsMap, boolean isSubscription, @NotNull String packageName, @NotNull InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        if (C42757a.m93689d(C5536d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
            C5536d c5536d = f7942a;
            c5536d.m8215f(c5536d.m8214b(c5536d.m8213a(purchaseDetailsMap, isSubscription), skuDetailsMap, packageName), isSubscription, billingClientVersion, isFirstAppLaunch);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5536d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m8209e() {
        if (C42757a.m93689d(C5536d.class)) {
            return false;
        }
        try {
            return !C5501a.m7799m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5536d.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m8210g() {
        if (C42757a.m93689d(C5536d.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = C5501a.m7799m().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Set<String> stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet<>();
                }
                copyOnWriteArraySet.addAll(stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j11 = Long.parseLong((String) StringsKt.split$default((CharSequence) it.next(), new String[]{";"}, false, 2, 2, (Object) null).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j11).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j11);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            m8207c();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5536d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m8211h() {
        if (C42757a.m93689d(C5536d.class)) {
            return;
        }
        try {
            try {
                C5501a.m7799m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5536d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m8212i() {
        if (C42757a.m93689d(C5536d.class)) {
            return;
        }
        try {
            m8211h();
            try {
                SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5536d.class);
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, JSONObject> m8213a(@NotNull Map<String, JSONObject> purchaseDetailsMap, boolean isSubscription) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j11 = isSubscription ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : MapsKt.toMap(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j12 = jSONObject.getLong("purchaseTime");
                        if (j12 <= j11) {
                            purchaseDetailsMap.remove(str);
                        }
                        jMax = Math.max(jMax, j12);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j11) {
                if (isSubscription) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(purchaseDetailsMap);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, String> m8214b(@NotNull Map<String, ? extends JSONObject> purchaseDetailsMap, @NotNull Map<String, ? extends JSONObject> skuDetailsMap, @NotNull String packageName) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(key);
                try {
                    value.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, packageName);
                    if (jSONObject != null) {
                        String string = value.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "purchaseDetail.toString()");
                        String string2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8215f(Map<String, String> purchaseDetailsMap, boolean isSubscription, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        if (!C42757a.m93689d(this)) {
            try {
                for (Map.Entry<String, String> entry : purchaseDetailsMap.entrySet()) {
                    C40259h.m88618j(entry.getKey(), entry.getValue(), isSubscription, billingClientVersion, isFirstAppLaunch);
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
