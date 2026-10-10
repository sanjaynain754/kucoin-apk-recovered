package com.facebook.appevents.iap;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u0000 *2\u00020\u0001:\u0005\u001d=,./B¥\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00182\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b(\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00105R\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010<¨\u0006>"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4;", "Lcom/facebook/appevents/iap/c;", "", "billingClient", "Ljava/lang/Class;", "billingClientClazz", "purchaseResultClazz", "purchaseClazz", "skuDetailsClazz", "purchaseHistoryRecordClazz", "skuDetailsResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "Ljava/lang/reflect/Method;", "queryPurchasesMethod", "getPurchaseListMethod", "getOriginalJsonMethod", "getOriginalJsonSkuMethod", "getOriginalJsonPurchaseHistoryMethod", "querySkuDetailsAsyncMethod", "queryPurchaseHistoryAsyncMethod", "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "inAppPurchaseSkuDetailsWrapper", "<init>", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "productType", "Ljava/lang/Runnable;", "completionHandler", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "skuType", "", "", "skuIDs", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;Ljava/lang/Runnable;)V", "runnable", "p", "(Ljava/lang/Runnable;)V", "u", "Ljava/lang/Object;", "q", "()Ljava/lang/Object;", "b", "Ljava/lang/Class;", "c", "d", "e", "f", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "Ljava/lang/reflect/Method;", "j", "k", CmcdData.Factory.STREAM_TYPE_LIVE, "m", "n", "o", "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InAppPurchaseBillingClientWrapperV2V4 implements InterfaceC5535c {

    /* JADX INFO: renamed from: s */
    @Nullable
    public static InAppPurchaseBillingClientWrapperV2V4 f7843s;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object billingClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<?> billingClientClazz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseResultClazz;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseClazz;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Class<?> skuDetailsClazz;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseHistoryRecordClazz;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Class<?> skuDetailsResponseListenerClazz;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseHistoryResponseListenerClazz;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesMethod;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Method getPurchaseListMethod;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Method getOriginalJsonMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Method getOriginalJsonSkuMethod;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Method getOriginalJsonPurchaseHistoryMethod;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Method querySkuDetailsAsyncMethod;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryAsyncMethod;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r */
    public static final String f7842r = InAppPurchaseBillingClientWrapperV2V4.class.getCanonicalName();

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final AtomicBoolean f7844t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Map<String, JSONObject> f7845u = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Map<String, JSONObject> f7846v = new ConcurrentHashMap();

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Map<String, JSONObject> f7847w = new ConcurrentHashMap();

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4;", "getOrCreateInstance", "(Landroid/content/Context;)Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4;", "b", "Ljava/lang/Class;", "billingClientClazz", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isServiceConnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "", "Lorg/json/JSONObject;", "iapPurchaseDetailsMap", "Ljava/util/Map;", "getIapPurchaseDetailsMap", "()Ljava/util/Map;", "subsPurchaseDetailsMap", "getSubsPurchaseDetailsMap", "skuDetailsMap", "getSkuDetailsMap", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "instance", "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final synchronized InAppPurchaseBillingClientWrapperV2V4 getOrCreateInstance(@NotNull Context context) {
            InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4M8125g;
            Intrinsics.checkNotNullParameter(context, "context");
            inAppPurchaseBillingClientWrapperV2V4M8125g = InAppPurchaseBillingClientWrapperV2V4.m8125g();
            if (inAppPurchaseBillingClientWrapperV2V4M8125g == null) {
                inAppPurchaseBillingClientWrapperV2V4M8125g = m8142b(context);
            }
            return inAppPurchaseBillingClientWrapperV2V4M8125g;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m8141a(Context context, Class<?> billingClientClazz) {
            Object objM8184e;
            Object objM8184e2;
            Object objM8184e3;
            Class<?> clsM8180a = InAppPurchaseUtils.m8180a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsM8180a2 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsM8180a != null && clsM8180a2 != null) {
                Method methodM8183d = InAppPurchaseUtils.m8183d(billingClientClazz, "newBuilder", Context.class);
                Method methodM8183d2 = InAppPurchaseUtils.m8183d(clsM8180a, "enablePendingPurchases", new Class[0]);
                Method methodM8183d3 = InAppPurchaseUtils.m8183d(clsM8180a, "setListener", clsM8180a2);
                Method methodM8183d4 = InAppPurchaseUtils.m8183d(clsM8180a, "build", new Class[0]);
                if (methodM8183d == null || methodM8183d2 == null || methodM8183d3 == null || methodM8183d4 == null || (objM8184e = InAppPurchaseUtils.m8184e(billingClientClazz, methodM8183d, null, context)) == null || (objM8184e2 = InAppPurchaseUtils.m8184e(clsM8180a, methodM8183d3, objM8184e, Proxy.newProxyInstance(clsM8180a2.getClassLoader(), new Class[]{clsM8180a2}, new C5530c()))) == null || (objM8184e3 = InAppPurchaseUtils.m8184e(clsM8180a, methodM8183d2, objM8184e2, new Object[0])) == null) {
                    return null;
                }
                return InAppPurchaseUtils.m8184e(clsM8180a, methodM8183d4, objM8184e3, new Object[0]);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final InAppPurchaseBillingClientWrapperV2V4 m8142b(Context context) {
            InAppPurchaseSkuDetailsWrapper orCreateInstance = InAppPurchaseSkuDetailsWrapper.INSTANCE.getOrCreateInstance();
            if (orCreateInstance == null) {
                return null;
            }
            Class<?> clsM8180a = InAppPurchaseUtils.m8180a("com.android.billingclient.api.BillingClient");
            Class<?> clsM8180a2 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.Purchase");
            Class<?> clsM8180a3 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> clsM8180a4 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.SkuDetails");
            Class<?> clsM8180a5 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> clsM8180a6 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> clsM8180a7 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM8180a == null || clsM8180a3 == null || clsM8180a2 == null || clsM8180a4 == null || clsM8180a6 == null || clsM8180a5 == null || clsM8180a7 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV2V4.m8130l(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method methodM8183d = InAppPurchaseUtils.m8183d(clsM8180a, "queryPurchases", String.class);
            Method methodM8183d2 = InAppPurchaseUtils.m8183d(clsM8180a3, "getPurchasesList", new Class[0]);
            Method methodM8183d3 = InAppPurchaseUtils.m8183d(clsM8180a2, "getOriginalJson", new Class[0]);
            Method methodM8183d4 = InAppPurchaseUtils.m8183d(clsM8180a4, "getOriginalJson", new Class[0]);
            Method methodM8183d5 = InAppPurchaseUtils.m8183d(clsM8180a5, "getOriginalJson", new Class[0]);
            Method methodM8183d6 = InAppPurchaseUtils.m8183d(clsM8180a, "querySkuDetailsAsync", orCreateInstance.m8178d(), clsM8180a6);
            Method methodM8183d7 = InAppPurchaseUtils.m8183d(clsM8180a, "queryPurchaseHistoryAsync", String.class, clsM8180a7);
            if (methodM8183d == null || methodM8183d2 == null || methodM8183d3 == null || methodM8183d4 == null || methodM8183d5 == null || methodM8183d6 == null || methodM8183d7 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV2V4.m8130l(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object objM8141a = m8141a(context, clsM8180a);
            if (objM8141a == null) {
                Log.w(InAppPurchaseBillingClientWrapperV2V4.m8130l(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            InAppPurchaseBillingClientWrapperV2V4.m8133o(new InAppPurchaseBillingClientWrapperV2V4(objM8141a, clsM8180a, clsM8180a3, clsM8180a2, clsM8180a4, clsM8180a5, clsM8180a6, clsM8180a7, methodM8183d, methodM8183d2, methodM8183d3, methodM8183d4, methodM8183d5, methodM8183d6, methodM8183d7, orCreateInstance, null));
            return InAppPurchaseBillingClientWrapperV2V4.m8125g();
        }

        @NotNull
        public final Map<String, JSONObject> getIapPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV2V4.m8124f();
        }

        @NotNull
        public final Map<String, JSONObject> getSkuDetailsMap() {
            return InAppPurchaseBillingClientWrapperV2V4.m8128j();
        }

        @NotNull
        public final Map<String, JSONObject> getSubsPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV2V4.m8129k();
        }

        @NotNull
        public final AtomicBoolean isServiceConnected() {
            return InAppPurchaseBillingClientWrapperV2V4.m8131m();
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4$d */
    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4$d;", "Ljava/lang/reflect/InvocationHandler;", "Ljava/lang/Runnable;", "completionHandler", "<init>", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4;Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "Ljava/lang/Runnable;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C5531d implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Runnable completionHandler;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InAppPurchaseBillingClientWrapperV2V4 f7869b;

        public C5531d(@NotNull InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, Runnable completionHandler) {
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            this.f7869b = inAppPurchaseBillingClientWrapperV2V4;
            this.completionHandler = completionHandler;
        }

        /* JADX INFO: renamed from: a */
        public void m8144a(@NotNull Object proxy, @NotNull Method m11, @Nullable Object[] args) {
            Object orNull;
            String str;
            if (!C42757a.m93689d(this)) {
                try {
                    Intrinsics.checkNotNullParameter(proxy, "proxy");
                    Intrinsics.checkNotNullParameter(m11, "m");
                    if (Intrinsics.areEqual(m11.getName(), "onSkuDetailsResponse")) {
                        if (args != null) {
                            orNull = ArraysKt.getOrNull(args, 1);
                        } else {
                            orNull = null;
                        }
                        if (orNull != null && (orNull instanceof List)) {
                            Iterator it = ((List) orNull).iterator();
                            while (it.hasNext()) {
                                try {
                                    Object objM8184e = InAppPurchaseUtils.m8184e(InAppPurchaseBillingClientWrapperV2V4.m8127i(this.f7869b), InAppPurchaseBillingClientWrapperV2V4.m8123e(this.f7869b), it.next(), new Object[0]);
                                    if (objM8184e instanceof String) {
                                        str = (String) objM8184e;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String skuID = jSONObject.getString("productId");
                                            Map<String, JSONObject> skuDetailsMap = InAppPurchaseBillingClientWrapperV2V4.INSTANCE.getSkuDetailsMap();
                                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                            skuDetailsMap.put(skuID, jSONObject);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            this.completionHandler.run();
                        }
                    }
                } catch (Throwable th2) {
                    C42757a.m93687b(th2, this);
                }
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                m8144a(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
                return null;
            }
        }
    }

    public /* synthetic */ InAppPurchaseBillingClientWrapperV2V4(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, inAppPurchaseSkuDetailsWrapper);
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4$a */
    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4$a;", "Ljava/lang/reflect/InvocationHandler;", "Ljava/lang/Runnable;", "runnable", "<init>", "(Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Runnable;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5528a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final Runnable runnable;

        public C5528a(@Nullable Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m11, @Nullable Object[] args) {
            Object orNull;
            Method methodM8183d;
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m11, "m");
                if (Intrinsics.areEqual(m11.getName(), "onBillingSetupFinished")) {
                    if (args != null) {
                        orNull = ArraysKt.getOrNull(args, 0);
                    } else {
                        orNull = null;
                    }
                    Class<?> clsM8180a = InAppPurchaseUtils.m8180a("com.android.billingclient.api.BillingResult");
                    if (clsM8180a != null && (methodM8183d = InAppPurchaseUtils.m8183d(clsM8180a, "getResponseCode", new Class[0])) != null && Intrinsics.areEqual(InAppPurchaseUtils.m8184e(clsM8180a, methodM8183d, orNull, new Object[0]), (Object) 0)) {
                        InAppPurchaseBillingClientWrapperV2V4.INSTANCE.isServiceConnected().set(true);
                        Runnable runnable = this.runnable;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = m11.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    if (StringsKt.endsWith$default(name, "onBillingServiceDisconnected", false, 2, (Object) null)) {
                        InAppPurchaseBillingClientWrapperV2V4.INSTANCE.isServiceConnected().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4$b */
    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4$b;", "Ljava/lang/reflect/InvocationHandler;", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "skuType", "Ljava/lang/Runnable;", "completionHandler", "<init>", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4;Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "", "proxy", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "args", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "b", "Ljava/lang/Runnable;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C5529b implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public InAppPurchaseUtils.IAPProductType skuType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Runnable completionHandler;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InAppPurchaseBillingClientWrapperV2V4 f7867c;

        public C5529b(@NotNull InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, @NotNull InAppPurchaseUtils.IAPProductType skuType, Runnable completionHandler) {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            this.f7867c = inAppPurchaseBillingClientWrapperV2V4;
            this.skuType = skuType;
            this.completionHandler = completionHandler;
        }

        /* JADX INFO: renamed from: a */
        public void m8143a(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] args) {
            Object orNull;
            String str;
            if (!C42757a.m93689d(this)) {
                try {
                    Intrinsics.checkNotNullParameter(proxy, "proxy");
                    Intrinsics.checkNotNullParameter(method, "method");
                    if (Intrinsics.areEqual(method.getName(), "onPurchaseHistoryResponse")) {
                        if (args != null) {
                            orNull = ArraysKt.getOrNull(args, 1);
                        } else {
                            orNull = null;
                        }
                        if (orNull != null && (orNull instanceof List)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((List) orNull).iterator();
                            while (it.hasNext()) {
                                try {
                                    Object objM8184e = InAppPurchaseUtils.m8184e(InAppPurchaseBillingClientWrapperV2V4.m8126h(this.f7867c), InAppPurchaseBillingClientWrapperV2V4.m8122d(this.f7867c), it.next(), new Object[0]);
                                    if (objM8184e instanceof String) {
                                        str = (String) objM8184e;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String skuID = jSONObject.getString("productId");
                                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                            arrayList.add(skuID);
                                            if (this.skuType == InAppPurchaseUtils.IAPProductType.INAPP) {
                                                InAppPurchaseBillingClientWrapperV2V4.INSTANCE.getIapPurchaseDetailsMap().put(skuID, jSONObject);
                                            } else {
                                                InAppPurchaseBillingClientWrapperV2V4.INSTANCE.getSubsPurchaseDetailsMap().put(skuID, jSONObject);
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                InAppPurchaseBillingClientWrapperV2V4.m8132n(this.f7867c, this.skuType, arrayList, this.completionHandler);
                            } else {
                                this.completionHandler.run();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    C42757a.m93687b(th2, this);
                }
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                m8143a(obj, method, objArr);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4$c */
    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV2V4.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV2V4$c;", "Ljava/lang/reflect/InvocationHandler;", "<init>", "()V", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5530c implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m11, @Nullable Object[] args) {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m11, "m");
                return null;
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
                return null;
            }
        }
    }

    public InAppPurchaseBillingClientWrapperV2V4(Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.purchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = inAppPurchaseSkuDetailsWrapper;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Method m8122d(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapperV2V4.getOriginalJsonPurchaseHistoryMethod;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ Method m8123e(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapperV2V4.getOriginalJsonSkuMethod;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ Map m8124f() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return f7845u;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InAppPurchaseBillingClientWrapperV2V4 m8125g() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return f7843s;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ Class m8126h(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapperV2V4.purchaseHistoryRecordClazz;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ Class m8127i(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return inAppPurchaseBillingClientWrapperV2V4.skuDetailsClazz;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ Map m8128j() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return f7847w;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ Map m8129k() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return f7846v;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ String m8130l() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return f7842r;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicBoolean m8131m() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return null;
        }
        try {
            return f7844t;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ void m8132n(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4, InAppPurchaseUtils.IAPProductType iAPProductType, List list, Runnable runnable) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV2V4.m8139s(iAPProductType, list, runnable);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ void m8133o(InAppPurchaseBillingClientWrapperV2V4 inAppPurchaseBillingClientWrapperV2V4) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            f7843s = inAppPurchaseBillingClientWrapperV2V4;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m8134r(InAppPurchaseBillingClientWrapperV2V4 this$0, InAppPurchaseUtils.IAPProductType productType, Runnable completionHandler) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            InAppPurchaseUtils.m8184e(this$0.billingClientClazz, this$0.queryPurchaseHistoryAsyncMethod, this$0.m8138q(), productType.getType(), Proxy.newProxyInstance(this$0.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{this$0.purchaseHistoryResponseListenerClazz}, new C5529b(this$0, productType, completionHandler)));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m8135t(InAppPurchaseBillingClientWrapperV2V4 this$0, Runnable completionHandler, InAppPurchaseUtils.IAPProductType skuType, List skuIDs) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV2V4.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            Intrinsics.checkNotNullParameter(skuType, "$skuType");
            Intrinsics.checkNotNullParameter(skuIDs, "$skuIDs");
            Object objNewProxyInstance = Proxy.newProxyInstance(this$0.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{this$0.skuDetailsResponseListenerClazz}, new C5531d(this$0, completionHandler));
            InAppPurchaseUtils.m8184e(this$0.billingClientClazz, this$0.querySkuDetailsAsyncMethod, this$0.m8138q(), this$0.inAppPurchaseSkuDetailsWrapper.m8177c(skuType, skuIDs), objNewProxyInstance);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV2V4.class);
        }
    }

    @Override // com.facebook.appevents.iap.InterfaceC5535c
    /* JADX INFO: renamed from: a */
    public void mo8136a(@NotNull final InAppPurchaseUtils.IAPProductType productType, @NotNull final Runnable completionHandler) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
            m8137p(new Runnable() { // from class: h3.g
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseBillingClientWrapperV2V4.m8134r(this.f85747b, productType, completionHandler);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8137p(Runnable runnable) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            if (f7844t.get()) {
                runnable.run();
            } else {
                m8140u(runnable);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public Object m8138q() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            return this.billingClient;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m8139s(final InAppPurchaseUtils.IAPProductType skuType, final List<String> skuIDs, final Runnable completionHandler) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            m8137p(new Runnable() { // from class: h3.h
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseBillingClientWrapperV2V4.m8135t(this.f85750b, completionHandler, skuType, skuIDs);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8140u(Runnable runnable) {
        Method methodM8183d;
        if (!C42757a.m93689d(this)) {
            try {
                Class<?> clsM8180a = InAppPurchaseUtils.m8180a("com.android.billingclient.api.BillingClientStateListener");
                if (clsM8180a == null || (methodM8183d = InAppPurchaseUtils.m8183d(this.billingClientClazz, "startConnection", clsM8180a)) == null) {
                    return;
                }
                InAppPurchaseUtils.m8184e(this.billingClientClazz, methodM8183d, m8138q(), Proxy.newProxyInstance(clsM8180a.getClassLoader(), new Class[]{clsM8180a}, new C5528a(runnable)));
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
