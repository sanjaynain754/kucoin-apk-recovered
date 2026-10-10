package com.facebook.appevents.iap;

import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.Method;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InAppPurchaseSkuDetailsWrapper.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "", "Ljava/lang/Class;", "skuDetailsParamsClazz", "builderClazz", "Ljava/lang/reflect/Method;", "newBuilderMethod", "setTypeMethod", "setSkusListMethod", "buildMethod", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "productType", "", "", "skuIDs", "c", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "b", "Ljava/lang/reflect/Method;", "e", "f", "g", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InAppPurchaseSkuDetailsWrapper {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    @Nullable
    public static InAppPurchaseSkuDetailsWrapper f7919h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Class<?> skuDetailsParamsClazz;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<?> builderClazz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Method newBuilderMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Method setTypeMethod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Method setSkusListMethod;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Method buildMethod;

    /* JADX INFO: compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper$Companion;", "", "<init>", "()V", "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "getOrCreateInstance", "()Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "CLASSNAME_SKU_DETAILS_PARAMS", "Ljava/lang/String;", "CLASSNAME_SKU_DETAILS_PARAMS_BUILDER", "METHOD_BUILD", "METHOD_NEW_BUILDER", "METHOD_SET_SKU_LIST", "METHOD_SET_TYPE", "instance", "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final synchronized InAppPurchaseSkuDetailsWrapper getOrCreateInstance() {
            InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapperM8175a;
            inAppPurchaseSkuDetailsWrapperM8175a = InAppPurchaseSkuDetailsWrapper.m8175a();
            if (inAppPurchaseSkuDetailsWrapperM8175a == null) {
                inAppPurchaseSkuDetailsWrapperM8175a = m8179a();
            }
            return inAppPurchaseSkuDetailsWrapperM8175a;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InAppPurchaseSkuDetailsWrapper m8179a() {
            Class<?> clsM8180a = InAppPurchaseUtils.m8180a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> clsM8180a2 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsM8180a == null || clsM8180a2 == null) {
                return null;
            }
            Method methodM8183d = InAppPurchaseUtils.m8183d(clsM8180a, "newBuilder", new Class[0]);
            Method methodM8183d2 = InAppPurchaseUtils.m8183d(clsM8180a2, "setType", String.class);
            Method methodM8183d3 = InAppPurchaseUtils.m8183d(clsM8180a2, "setSkusList", List.class);
            Method methodM8183d4 = InAppPurchaseUtils.m8183d(clsM8180a2, "build", new Class[0]);
            if (methodM8183d == null || methodM8183d2 == null || methodM8183d3 == null || methodM8183d4 == null) {
                return null;
            }
            InAppPurchaseSkuDetailsWrapper.m8176b(new InAppPurchaseSkuDetailsWrapper(clsM8180a, clsM8180a2, methodM8183d, methodM8183d2, methodM8183d3, methodM8183d4));
            return InAppPurchaseSkuDetailsWrapper.m8175a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InAppPurchaseSkuDetailsWrapper m8175a() {
        if (C42757a.m93689d(InAppPurchaseSkuDetailsWrapper.class)) {
            return null;
        }
        try {
            return f7919h;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseSkuDetailsWrapper.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m8176b(InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        if (C42757a.m93689d(InAppPurchaseSkuDetailsWrapper.class)) {
            return;
        }
        try {
            f7919h = inAppPurchaseSkuDetailsWrapper;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseSkuDetailsWrapper.class);
        }
    }

    public InAppPurchaseSkuDetailsWrapper(@NotNull Class<?> skuDetailsParamsClazz, @NotNull Class<?> builderClazz, @NotNull Method newBuilderMethod, @NotNull Method setTypeMethod, @NotNull Method setSkusListMethod, @NotNull Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.skuDetailsParamsClazz = skuDetailsParamsClazz;
        this.builderClazz = builderClazz;
        this.newBuilderMethod = newBuilderMethod;
        this.setTypeMethod = setTypeMethod;
        this.setSkusListMethod = setSkusListMethod;
        this.buildMethod = buildMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m8177c(@NotNull InAppPurchaseUtils.IAPProductType productType, @Nullable List<String> skuIDs) {
        Object objM8184e;
        Object objM8184e2;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(productType, "productType");
            Object objM8184e3 = InAppPurchaseUtils.m8184e(this.skuDetailsParamsClazz, this.newBuilderMethod, null, new Object[0]);
            if (objM8184e3 == null || (objM8184e = InAppPurchaseUtils.m8184e(this.builderClazz, this.setTypeMethod, objM8184e3, productType.getType())) == null || (objM8184e2 = InAppPurchaseUtils.m8184e(this.builderClazz, this.setSkusListMethod, objM8184e, skuIDs)) == null) {
                return null;
            }
            return InAppPurchaseUtils.m8184e(this.builderClazz, this.buildMethod, objM8184e2, new Object[0]);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Class<?> m8178d() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            return this.skuDetailsParamsClazz;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
