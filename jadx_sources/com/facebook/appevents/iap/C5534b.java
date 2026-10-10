package com.facebook.appevents.iap;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.iap.C5534b;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.internal.FeatureManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.facebook.appevents.iap.b */
/* JADX INFO: compiled from: InAppPurchaseAutoLogger.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/appevents/iap/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "", "e", "(Landroid/content/Context;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)V", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "d", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Ljava/lang/String;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFailedToCreateWrapper", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "failedToCreateWrapper", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C5534b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5534b f7940a = new C5534b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean failedToCreateWrapper = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4] */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final synchronized void m8202e(@NotNull final Context context, @NotNull final InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        if (C42757a.m93689d(C5534b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
            AtomicBoolean atomicBoolean = failedToCreateWrapper;
            if (atomicBoolean.get()) {
                return;
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            InAppPurchaseUtils.BillingClientVersion billingClientVersion2 = InAppPurchaseUtils.BillingClientVersion.V2_V4;
            if (billingClientVersion == billingClientVersion2) {
                objectRef.element = InAppPurchaseBillingClientWrapperV2V4.INSTANCE.getOrCreateInstance(context);
            } else if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V5_V7) {
                objectRef.element = InAppPurchaseBillingClientWrapperV5V7.INSTANCE.getOrCreateInstance(context);
            }
            if (objectRef.element == 0) {
                atomicBoolean.set(true);
                return;
            }
            if (!FeatureManager.m9939g(FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging) || (ProtectedModeManager.m8225d() && billingClientVersion != billingClientVersion2)) {
                ((InterfaceC5535c) objectRef.element).mo8136a(InAppPurchaseUtils.IAPProductType.INAPP, new Runnable() { // from class: h3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5534b.m8205h(billingClientVersion, context);
                    }
                });
            } else {
                ((InterfaceC5535c) objectRef.element).mo8136a(InAppPurchaseUtils.IAPProductType.INAPP, new Runnable() { // from class: h3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5534b.m8203f(objectRef, billingClientVersion, context);
                    }
                });
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5534b.class);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8203f(Ref.ObjectRef billingClientWrapper, final InAppPurchaseUtils.BillingClientVersion billingClientVersion, final Context context) {
        if (C42757a.m93689d(C5534b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientWrapper, "$billingClientWrapper");
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            ((InterfaceC5535c) billingClientWrapper.element).mo8136a(InAppPurchaseUtils.IAPProductType.SUBS, new Runnable() { // from class: h3.f
                @Override // java.lang.Runnable
                public final void run() {
                    C5534b.m8204g(billingClientVersion, context);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5534b.class);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8204g(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (C42757a.m93689d(C5534b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            C5534b c5534b = f7940a;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            c5534b.m8206d(billingClientVersion, packageName);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5534b.class);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8205h(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (C42757a.m93689d(C5534b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            C5534b c5534b = f7940a;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            c5534b.m8206d(billingClientVersion, packageName);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5534b.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8206d(InAppPurchaseUtils.BillingClientVersion billingClientVersion, String packageName) {
        if (!C42757a.m93689d(this)) {
            try {
                boolean zM8209e = C5536d.m8209e();
                if (zM8209e) {
                    C5536d.m8210g();
                }
                if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                    InAppPurchaseBillingClientWrapperV2V4.Companion companion = InAppPurchaseBillingClientWrapperV2V4.INSTANCE;
                    C5536d.m8208d(companion.getIapPurchaseDetailsMap(), companion.getSkuDetailsMap(), false, packageName, billingClientVersion, zM8209e);
                    C5536d.m8208d(companion.getSubsPurchaseDetailsMap(), companion.getSkuDetailsMap(), true, packageName, billingClientVersion, zM8209e);
                    companion.getIapPurchaseDetailsMap().clear();
                    companion.getSubsPurchaseDetailsMap().clear();
                } else {
                    InAppPurchaseBillingClientWrapperV5V7.Companion companion2 = InAppPurchaseBillingClientWrapperV5V7.INSTANCE;
                    C5536d.m8208d(companion2.getIapPurchaseDetailsMap(), companion2.getProductDetailsMap(), false, packageName, billingClientVersion, zM8209e);
                    C5536d.m8208d(companion2.getSubsPurchaseDetailsMap(), companion2.getProductDetailsMap(), true, packageName, billingClientVersion, zM8209e);
                    companion2.getIapPurchaseDetailsMap().clear();
                    companion2.getSubsPurchaseDetailsMap().clear();
                }
                if (zM8209e) {
                    C5536d.m8211h();
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
