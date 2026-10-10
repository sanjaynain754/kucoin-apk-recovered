package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.iap.C5533a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p299h3.C38102l;
import p357j3.C40259h;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.facebook.appevents.iap.a */
/* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m90084d2 = {"Lcom/facebook/appevents/iap/a;", "", "<init>", "()V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "", "g", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)V", "e", CmcdData.Factory.STREAMING_FORMAT_HLS, "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "purchases", "", "isSubscription", "f", "(Landroid/content/Context;Ljava/util/ArrayList;Z)V", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "d", "Ljava/lang/Boolean;", "hasBillingService", "hasBillingActivity", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callbacks", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "i", "Ljava/lang/Object;", "inAppBillingObj", "j", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInAppPurchaseActivityLifecycleTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppPurchaseActivityLifecycleTracker.kt\ncom/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class C5533a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5533a f7930a = new C5533a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5533a.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isTracking = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static Boolean hasBillingService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static Boolean hasBillingActivity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static Application.ActivityLifecycleCallbacks callbacks;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static Intent intent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static Object inAppBillingObj;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public static InAppPurchaseUtils.BillingClientVersion billingClientVersion;

    /* JADX INFO: renamed from: com.facebook.appevents.iap.a$a */
    /* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"com/facebook/appevents/iap/a$a", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            C5533a c5533a = C5533a.f7930a;
            C5533a.inAppBillingObj = C38102l.m86012a(C5501a.m7799m(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.a$b */
    /* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"com/facebook/appevents/iap/a$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                C5501a.m7806t().execute(new Runnable() { // from class: h3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5533a.b.m8197c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (Intrinsics.areEqual(C5533a.hasBillingActivity, Boolean.TRUE) && Intrinsics.areEqual(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    C5501a.m7806t().execute(new Runnable() { // from class: h3.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5533a.b.m8198d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: c */
        public static final void m8197c() {
            Context contextM7799m = C5501a.m7799m();
            ArrayList<String> arrayListM86015i = C38102l.m86015i(contextM7799m, C5533a.inAppBillingObj);
            C5533a c5533a = C5533a.f7930a;
            c5533a.m8193f(contextM7799m, arrayListM86015i, false);
            c5533a.m8193f(contextM7799m, C38102l.m86016j(contextM7799m, C5533a.inAppBillingObj), true);
        }

        /* JADX INFO: renamed from: d */
        public static final void m8198d() {
            Context contextM7799m = C5501a.m7799m();
            ArrayList<String> arrayListM86015i = C38102l.m86015i(contextM7799m, C5533a.inAppBillingObj);
            if (arrayListM86015i.isEmpty()) {
                arrayListM86015i = C38102l.m86014g(contextM7799m, C5533a.inAppBillingObj);
            }
            C5533a.f7930a.m8193f(contextM7799m, arrayListM86015i, false);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m8191g(@NotNull InAppPurchaseUtils.BillingClientVersion billingClientVersion2) {
        Intrinsics.checkNotNullParameter(billingClientVersion2, "billingClientVersion");
        C5533a c5533a = f7930a;
        c5533a.m8192e();
        if (!Intrinsics.areEqual(hasBillingService, Boolean.FALSE) && C40259h.m88615g()) {
            billingClientVersion = billingClientVersion2;
            c5533a.m8194h();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8192e() {
        if (hasBillingService != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(InAppPurchaseUtils.m8180a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        hasBillingService = boolValueOf;
        if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return;
        }
        hasBillingActivity = Boolean.valueOf(InAppPurchaseUtils.m8180a("com.android.billingclient.api.ProxyBillingActivity") != null);
        C38102l.m86013b();
        Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        Intrinsics.checkNotNullExpressionValue(intent2, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
        intent = intent2;
        serviceConnection = new a();
        callbacks = new b();
    }

    /* JADX INFO: renamed from: h */
    public final void m8194h() {
        if (isTracking.compareAndSet(false, true)) {
            Context contextM7799m = C5501a.m7799m();
            if (contextM7799m instanceof Application) {
                Application application = (Application) contextM7799m;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                ServiceConnection serviceConnection2 = null;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent2 = intent;
                if (intent2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("intent");
                    intent2 = null;
                }
                ServiceConnection serviceConnection3 = serviceConnection;
                if (serviceConnection3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                } else {
                    serviceConnection2 = serviceConnection3;
                }
                contextM7799m.bindService(intent2, serviceConnection2, 1);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8193f(Context context, ArrayList<String> purchases, boolean isSubscription) {
        if (!purchases.isEmpty()) {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (String purchase : purchases) {
                try {
                    String sku = new JSONObject(purchase).getString("productId");
                    Intrinsics.checkNotNullExpressionValue(sku, "sku");
                    Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                    map.put(sku, purchase);
                    arrayList.add(sku);
                } catch (JSONException e11) {
                    Log.e(TAG, "Error parsing in-app purchase data.", e11);
                }
            }
            for (Map.Entry<String, String> entry : C38102l.m86017k(context, arrayList, inAppBillingObj, isSubscription).entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String str = (String) map.get(key);
                if (str != null) {
                    C40259h.m88619k(str, value, isSubscription, billingClientVersion, false, 16, null);
                }
            }
        }
    }
}
