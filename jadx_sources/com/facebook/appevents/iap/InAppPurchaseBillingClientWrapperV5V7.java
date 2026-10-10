package com.facebook.appevents.iap;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7;
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
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b/\b\u0007\u0018\u0000 m2\u00020\u0001:\u0002nIB\u0085\u0003\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u0016\u0012\u0006\u0010\"\u001a\u00020\u0016\u0012\u0006\u0010#\u001a\u00020\u0016\u0012\u0006\u0010$\u001a\u00020\u0016\u0012\u0006\u0010%\u001a\u00020\u0016\u0012\u0006\u0010&\u001a\u00020\u0016\u0012\u0006\u0010'\u001a\u00020\u0016\u0012\u0006\u0010(\u001a\u00020\u0016\u0012\u0006\u0010)\u001a\u00020\u0016\u0012\u0006\u0010*\u001a\u00020\u0016\u0012\u0006\u0010+\u001a\u00020\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u0004\u0018\u00010\u00022\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J)\u00105\u001a\u0004\u0018\u00010\u00022\u0006\u0010/\u001a\u00020.2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010302H\u0002¢\u0006\u0004\b5\u00106J-\u0010:\u001a\u0002092\u0006\u0010/\u001a\u00020.2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u0002092\u0006\u0010<\u001a\u000207H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0002092\u0006\u0010<\u001a\u000207H\u0002¢\u0006\u0004\b?\u0010>J/\u0010C\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bC\u0010DJ/\u0010E\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bE\u0010DJ/\u0010F\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bF\u0010DJ/\u0010G\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bG\u0010DJ/\u0010H\u001a\u0002092\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@H\u0002¢\u0006\u0004\bH\u0010DJ\u001f\u0010I\u001a\u0002092\u0006\u0010/\u001a\u00020.2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u0004\u0018\u0001032\u0006\u0010K\u001a\u000203¢\u0006\u0004\bL\u0010MR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010N\u001a\u0004\bO\u0010PR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010RR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010RR\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010RR\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010RR\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010RR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010RR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010RR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010RR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010RR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010RR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010RR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010RR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010RR\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010RR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010RR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010`R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010`R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010`R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010`R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010`R\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010`R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010`R\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010`R\u0014\u0010\u001f\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010`R\u0014\u0010 \u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010`R\u0014\u0010!\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010`R\u0014\u0010\"\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010`R\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010`R\u0014\u0010$\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010`R\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010`R\u0014\u0010&\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010`R\u0014\u0010'\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010`R\u0014\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010`R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010`R\u0014\u0010*\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010`R\u0014\u0010+\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010`¨\u0006o"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;", "Lcom/facebook/appevents/iap/c;", "", "billingClient", "Ljava/lang/Class;", "billingClientClazz", "purchaseClazz", "productDetailsClazz", "purchaseHistoryRecordClazz", "queryProductDetailsParamsProductClazz", "billingResultClazz", "queryProductDetailsParamsClazz", "queryPurchaseHistoryParamsClazz", "queryPurchasesParamsClazz", "queryProductDetailsParamsBuilderClazz", "queryPurchaseHistoryParamsBuilderClazz", "queryPurchasesParamsBuilderClazz", "queryProductDetailsParamsProductBuilderClazz", "billingClientStateListenerClazz", "productDetailsResponseListenerClazz", "purchasesResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "Ljava/lang/reflect/Method;", "queryPurchasesAsyncMethod", "queryPurchasesParamsNewBuilderMethod", "queryPurchasesParamsBuilderBuildMethod", "queryPurchasesParamsBuilderSetProductTypeMethod", "purchaseGetOriginalJsonMethod", "queryPurchaseHistoryAsyncMethod", "queryPurchaseHistoryParamsNewBuilderMethod", "queryPurchaseHistoryParamsBuilderBuildMethod", "queryPurchaseHistoryParamsBuilderSetProductTypeMethod", "purchaseHistoryRecordGetOriginalJsonMethod", "queryProductDetailsAsyncMethod", "queryProductDetailsParamsNewBuilderMethod", "queryProductDetailsParamsBuilderBuildMethod", "queryProductDetailsParamsBuilderSetProductListMethod", "queryProductDetailsParamsProductNewBuilderMethod", "queryProductDetailsParamsProductBuilderBuildMethod", "queryProductDetailsParamsProductBuilderSetProductIdMethod", "queryProductDetailsParamsProductBuilderSetProductTypeMethod", "productDetailsToStringMethod", "billingClientStartConnectionMethod", "billingResultGetResponseCodeMethod", "<init>", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "productType", "t", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;)Ljava/lang/Object;", "", "", "productIds", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "completionHandler", "", "z", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/util/List;Ljava/lang/Runnable;)V", "runnable", "p", "(Ljava/lang/Runnable;)V", "C", "", "wrapperArgs", "listenerArgs", "y", "([Ljava/lang/Object;[Ljava/lang/Object;)V", "x", "w", "v", "u", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "productDetailsString", "r", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/Object;", "q", "()Ljava/lang/Object;", "b", "Ljava/lang/Class;", "c", "d", "e", "f", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "j", "k", CmcdData.Factory.STREAM_TYPE_LIVE, "m", "n", "o", "Ljava/lang/reflect/Method;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InAppPurchaseBillingClientWrapperV5V7 implements InterfaceC5535c {

    /* JADX INFO: renamed from: Q */
    @Nullable
    public static InAppPurchaseBillingClientWrapperV5V7 f7873Q;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryParamsBuilderSetProductTypeMethod;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Method purchaseHistoryRecordGetOriginalJsonMethod;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsAsyncMethod;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsNewBuilderMethod;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsBuilderBuildMethod;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsBuilderSetProductListMethod;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsProductNewBuilderMethod;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsProductBuilderBuildMethod;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsProductBuilderSetProductIdMethod;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public final Method queryProductDetailsParamsProductBuilderSetProductTypeMethod;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final Method productDetailsToStringMethod;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final Method billingClientStartConnectionMethod;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final Method billingResultGetResponseCodeMethod;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object billingClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Class<?> billingClientClazz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseClazz;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Class<?> productDetailsClazz;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseHistoryRecordClazz;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryProductDetailsParamsProductClazz;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Class<?> billingResultClazz;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryProductDetailsParamsClazz;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryPurchaseHistoryParamsClazz;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryPurchasesParamsClazz;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryProductDetailsParamsBuilderClazz;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryPurchaseHistoryParamsBuilderClazz;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryPurchasesParamsBuilderClazz;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Class<?> queryProductDetailsParamsProductBuilderClazz;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Class<?> billingClientStateListenerClazz;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Class<?> productDetailsResponseListenerClazz;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchasesResponseListenerClazz;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Class<?> purchaseHistoryResponseListenerClazz;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesAsyncMethod;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesParamsNewBuilderMethod;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesParamsBuilderBuildMethod;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchasesParamsBuilderSetProductTypeMethod;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Method purchaseGetOriginalJsonMethod;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryAsyncMethod;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryParamsNewBuilderMethod;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Method queryPurchaseHistoryParamsBuilderBuildMethod;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O */
    public static final String f7871O = InAppPurchaseBillingClientWrapperV5V7.class.getCanonicalName();

    /* JADX INFO: renamed from: P */
    @NotNull
    public static final AtomicBoolean f7872P = new AtomicBoolean(false);

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final Map<String, JSONObject> f7874R = new ConcurrentHashMap();

    /* JADX INFO: renamed from: S */
    @NotNull
    public static final Map<String, JSONObject> f7875S = new ConcurrentHashMap();

    /* JADX INFO: renamed from: T */
    @NotNull
    public static final Map<String, JSONObject> f7876T = new ConcurrentHashMap();

    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
    @Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ=\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010(\u001a\n '*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$Companion;", "Ljava/lang/reflect/InvocationHandler;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;", "getOrCreateInstance", "(Landroid/content/Context;)Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;", "", "proxy", "Ljava/lang/reflect/Method;", "m", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "b", "Ljava/lang/Class;", "billingClientClazz", "billingClientBuilderClazz", "purchasesUpdatedListenerClazz", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isServiceConnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "", "", "Lorg/json/JSONObject;", "iapPurchaseDetailsMap", "Ljava/util/Map;", "getIapPurchaseDetailsMap", "()Ljava/util/Map;", "subsPurchaseDetailsMap", "getSubsPurchaseDetailsMap", "productDetailsMap", "getProductDetailsMap", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "instance", "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion implements InvocationHandler {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final synchronized InAppPurchaseBillingClientWrapperV5V7 getOrCreateInstance(@NotNull Context context) {
            InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7M8151e;
            Intrinsics.checkNotNullParameter(context, "context");
            inAppPurchaseBillingClientWrapperV5V7M8151e = InAppPurchaseBillingClientWrapperV5V7.m8151e();
            if (inAppPurchaseBillingClientWrapperV5V7M8151e == null) {
                inAppPurchaseBillingClientWrapperV5V7M8151e = m8174b(context);
            }
            return inAppPurchaseBillingClientWrapperV5V7M8151e;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Object m8173a(Context context, Class<?> billingClientClazz, Class<?> billingClientBuilderClazz, Class<?> purchasesUpdatedListenerClazz) {
            Object objM8184e;
            Method methodM8183d = InAppPurchaseUtils.m8183d(billingClientClazz, "newBuilder", Context.class);
            Method methodM8183d2 = InAppPurchaseUtils.m8183d(billingClientBuilderClazz, "setListener", purchasesUpdatedListenerClazz);
            Method methodM8183d3 = InAppPurchaseUtils.m8183d(billingClientBuilderClazz, "enablePendingPurchases", new Class[0]);
            Method methodM8183d4 = InAppPurchaseUtils.m8183d(billingClientBuilderClazz, "build", new Class[0]);
            if (methodM8183d4 == null || methodM8183d2 == null || methodM8183d == null || methodM8183d3 == null || (objM8184e = InAppPurchaseUtils.m8184e(billingClientBuilderClazz, methodM8183d2, InAppPurchaseUtils.m8184e(billingClientClazz, methodM8183d, null, context), Proxy.newProxyInstance(purchasesUpdatedListenerClazz.getClassLoader(), new Class[]{purchasesUpdatedListenerClazz}, this))) == null) {
                return null;
            }
            return InAppPurchaseUtils.m8184e(billingClientBuilderClazz, methodM8183d4, InAppPurchaseUtils.m8184e(billingClientBuilderClazz, methodM8183d3, objM8184e, new Object[0]), new Object[0]);
        }

        /* JADX INFO: renamed from: b */
        public final InAppPurchaseBillingClientWrapperV5V7 m8174b(Context context) {
            Class<?> clsM8180a = InAppPurchaseUtils.m8180a("com.android.billingclient.api.BillingClient");
            Class<?> clsM8180a2 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.Purchase");
            Class<?> clsM8180a3 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.ProductDetails");
            Class<?> clsM8180a4 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> clsM8180a5 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.QueryProductDetailsParams$Product");
            Class<?> clsM8180a6 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.BillingResult");
            Class<?> clsM8180a7 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.QueryProductDetailsParams");
            Class<?> clsM8180a8 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.QueryPurchaseHistoryParams");
            Class<?> clsM8180a9 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.QueryPurchasesParams");
            Class<?> clsM8180a10 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.QueryProductDetailsParams$Builder");
            Class<?> clsM8180a11 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
            Class<?> clsM8180a12 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.QueryPurchasesParams$Builder");
            Class<?> clsM8180a13 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
            Class<?> clsM8180a14 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsM8180a15 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.PurchasesUpdatedListener");
            Class<?> clsM8180a16 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.BillingClientStateListener");
            Class<?> clsM8180a17 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.ProductDetailsResponseListener");
            Class<?> clsM8180a18 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.PurchasesResponseListener");
            Class<?> clsM8180a19 = InAppPurchaseUtils.m8180a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM8180a == null || clsM8180a2 == null || clsM8180a3 == null || clsM8180a4 == null || clsM8180a5 == null || clsM8180a6 == null || clsM8180a7 == null || clsM8180a8 == null || clsM8180a9 == null || clsM8180a10 == null || clsM8180a11 == null || clsM8180a12 == null || clsM8180a13 == null || clsM8180a14 == null || clsM8180a15 == null || clsM8180a16 == null || clsM8180a17 == null || clsM8180a18 == null || clsM8180a19 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.m8154h(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Method methodM8183d = InAppPurchaseUtils.m8183d(clsM8180a, "queryPurchasesAsync", clsM8180a9, clsM8180a18);
            Method methodM8183d2 = InAppPurchaseUtils.m8183d(clsM8180a9, "newBuilder", new Class[0]);
            Method methodM8183d3 = InAppPurchaseUtils.m8183d(clsM8180a12, "build", new Class[0]);
            Method methodM8183d4 = InAppPurchaseUtils.m8183d(clsM8180a12, "setProductType", String.class);
            Method methodM8183d5 = InAppPurchaseUtils.m8183d(clsM8180a2, "getOriginalJson", new Class[0]);
            Method methodM8183d6 = InAppPurchaseUtils.m8183d(clsM8180a, "queryPurchaseHistoryAsync", clsM8180a8, clsM8180a19);
            Method methodM8183d7 = InAppPurchaseUtils.m8183d(clsM8180a8, "newBuilder", new Class[0]);
            Method methodM8183d8 = InAppPurchaseUtils.m8183d(clsM8180a11, "build", new Class[0]);
            Method methodM8183d9 = InAppPurchaseUtils.m8183d(clsM8180a11, "setProductType", String.class);
            Method methodM8183d10 = InAppPurchaseUtils.m8183d(clsM8180a4, "getOriginalJson", new Class[0]);
            Method methodM8183d11 = InAppPurchaseUtils.m8183d(clsM8180a, "queryProductDetailsAsync", clsM8180a7, clsM8180a17);
            Method methodM8183d12 = InAppPurchaseUtils.m8183d(clsM8180a7, "newBuilder", new Class[0]);
            Method methodM8183d13 = InAppPurchaseUtils.m8183d(clsM8180a10, "build", new Class[0]);
            Method methodM8183d14 = InAppPurchaseUtils.m8183d(clsM8180a10, "setProductList", List.class);
            Method methodM8183d15 = InAppPurchaseUtils.m8183d(clsM8180a5, "newBuilder", new Class[0]);
            Method methodM8183d16 = InAppPurchaseUtils.m8183d(clsM8180a13, "build", new Class[0]);
            Method methodM8183d17 = InAppPurchaseUtils.m8183d(clsM8180a13, "setProductId", String.class);
            Method methodM8183d18 = InAppPurchaseUtils.m8183d(clsM8180a13, "setProductType", String.class);
            Method methodM8183d19 = InAppPurchaseUtils.m8183d(clsM8180a3, "toString", new Class[0]);
            Method methodM8183d20 = InAppPurchaseUtils.m8183d(clsM8180a, "startConnection", clsM8180a16);
            Method methodM8183d21 = InAppPurchaseUtils.m8183d(clsM8180a6, "getResponseCode", new Class[0]);
            if (methodM8183d == null || methodM8183d2 == null || methodM8183d3 == null || methodM8183d4 == null || methodM8183d5 == null || methodM8183d6 == null || methodM8183d7 == null || methodM8183d8 == null || methodM8183d9 == null || methodM8183d10 == null || methodM8183d11 == null || methodM8183d12 == null || methodM8183d13 == null || methodM8183d14 == null || methodM8183d15 == null || methodM8183d16 == null || methodM8183d17 == null || methodM8183d18 == null || methodM8183d19 == null || methodM8183d20 == null || methodM8183d21 == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.m8154h(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            Object objM8173a = m8173a(context, clsM8180a, clsM8180a14, clsM8180a15);
            if (objM8173a == null) {
                Log.w(InAppPurchaseBillingClientWrapperV5V7.m8154h(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            InAppPurchaseBillingClientWrapperV5V7.m8161o(new InAppPurchaseBillingClientWrapperV5V7(objM8173a, clsM8180a, clsM8180a2, clsM8180a3, clsM8180a4, clsM8180a5, clsM8180a6, clsM8180a7, clsM8180a8, clsM8180a9, clsM8180a10, clsM8180a11, clsM8180a12, clsM8180a13, clsM8180a16, clsM8180a17, clsM8180a18, clsM8180a19, methodM8183d, methodM8183d2, methodM8183d3, methodM8183d4, methodM8183d5, methodM8183d6, methodM8183d7, methodM8183d8, methodM8183d9, methodM8183d10, methodM8183d11, methodM8183d12, methodM8183d13, methodM8183d14, methodM8183d15, methodM8183d16, methodM8183d17, methodM8183d18, methodM8183d19, methodM8183d20, methodM8183d21, null));
            return InAppPurchaseBillingClientWrapperV5V7.m8151e();
        }

        @NotNull
        public final Map<String, JSONObject> getIapPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.m8150d();
        }

        @NotNull
        public final Map<String, JSONObject> getProductDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.m8152f();
        }

        @NotNull
        public final Map<String, JSONObject> getSubsPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapperV5V7.m8153g();
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m11, @Nullable Object[] args) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m11, "m");
            return null;
        }

        @NotNull
        public final AtomicBoolean isServiceConnected() {
            return InAppPurchaseBillingClientWrapperV5V7.m8155i();
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7$a */
    /* JADX INFO: compiled from: InAppPurchaseBillingClientWrapperV5V7.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7$a;", "Ljava/lang/reflect/InvocationHandler;", "", "", "wrapperArgs", "<init>", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapperV5V7;[Ljava/lang/Object;)V", "proxy", "Ljava/lang/reflect/Method;", "m", "listenerArgs", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[Ljava/lang/Object;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class C5532a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Object[] wrapperArgs;

        public C5532a(Object[] objArr) {
            this.wrapperArgs = objArr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method m11, @Nullable Object[] listenerArgs) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m11, "m");
            String name = m11.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1642587947:
                        if (name.equals("onPurchaseHistoryResponse")) {
                            InAppPurchaseBillingClientWrapperV5V7.m8159m(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, listenerArgs);
                            break;
                        }
                        break;
                    case -1599362358:
                        if (name.equals("onQueryPurchasesResponse")) {
                            InAppPurchaseBillingClientWrapperV5V7.m8160n(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, listenerArgs);
                            break;
                        }
                        break;
                    case -79406125:
                        if (name.equals("onBillingSetupFinished")) {
                            InAppPurchaseBillingClientWrapperV5V7.m8157k(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, listenerArgs);
                            break;
                        }
                        break;
                    case 1227540564:
                        if (name.equals("onBillingServiceDisconnected")) {
                            InAppPurchaseBillingClientWrapperV5V7.m8156j(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, listenerArgs);
                            break;
                        }
                        break;
                    case 1940131955:
                        if (name.equals("onProductDetailsResponse")) {
                            InAppPurchaseBillingClientWrapperV5V7.m8158l(InAppPurchaseBillingClientWrapperV5V7.this, this.wrapperArgs, listenerArgs);
                            break;
                        }
                        break;
                }
                return null;
            }
            return null;
        }
    }

    public /* synthetic */ InAppPurchaseBillingClientWrapperV5V7(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }

    public InAppPurchaseBillingClientWrapperV5V7(Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Class<?> cls8, Class<?> cls9, Class<?> cls10, Class<?> cls11, Class<?> cls12, Class<?> cls13, Class<?> cls14, Class<?> cls15, Class<?> cls16, Class<?> cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseClazz = cls2;
        this.productDetailsClazz = cls3;
        this.purchaseHistoryRecordClazz = cls4;
        this.queryProductDetailsParamsProductClazz = cls5;
        this.billingResultClazz = cls6;
        this.queryProductDetailsParamsClazz = cls7;
        this.queryPurchaseHistoryParamsClazz = cls8;
        this.queryPurchasesParamsClazz = cls9;
        this.queryProductDetailsParamsBuilderClazz = cls10;
        this.queryPurchaseHistoryParamsBuilderClazz = cls11;
        this.queryPurchasesParamsBuilderClazz = cls12;
        this.queryProductDetailsParamsProductBuilderClazz = cls13;
        this.billingClientStateListenerClazz = cls14;
        this.productDetailsResponseListenerClazz = cls15;
        this.purchasesResponseListenerClazz = cls16;
        this.purchaseHistoryResponseListenerClazz = cls17;
        this.queryPurchasesAsyncMethod = method;
        this.queryPurchasesParamsNewBuilderMethod = method2;
        this.queryPurchasesParamsBuilderBuildMethod = method3;
        this.queryPurchasesParamsBuilderSetProductTypeMethod = method4;
        this.purchaseGetOriginalJsonMethod = method5;
        this.queryPurchaseHistoryAsyncMethod = method6;
        this.queryPurchaseHistoryParamsNewBuilderMethod = method7;
        this.queryPurchaseHistoryParamsBuilderBuildMethod = method8;
        this.queryPurchaseHistoryParamsBuilderSetProductTypeMethod = method9;
        this.purchaseHistoryRecordGetOriginalJsonMethod = method10;
        this.queryProductDetailsAsyncMethod = method11;
        this.queryProductDetailsParamsNewBuilderMethod = method12;
        this.queryProductDetailsParamsBuilderBuildMethod = method13;
        this.queryProductDetailsParamsBuilderSetProductListMethod = method14;
        this.queryProductDetailsParamsProductNewBuilderMethod = method15;
        this.queryProductDetailsParamsProductBuilderBuildMethod = method16;
        this.queryProductDetailsParamsProductBuilderSetProductIdMethod = method17;
        this.queryProductDetailsParamsProductBuilderSetProductTypeMethod = method18;
        this.productDetailsToStringMethod = method19;
        this.billingClientStartConnectionMethod = method20;
        this.billingResultGetResponseCodeMethod = method21;
    }

    /* JADX INFO: renamed from: A */
    public static final void m8145A(InAppPurchaseBillingClientWrapperV5V7 this$0, Runnable completionHandler, InAppPurchaseUtils.IAPProductType productType, List productIds) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(productIds, "$productIds");
            Object objNewProxyInstance = Proxy.newProxyInstance(this$0.productDetailsResponseListenerClazz.getClassLoader(), new Class[]{this$0.productDetailsResponseListenerClazz}, this$0.new C5532a(new Object[]{completionHandler}));
            Object objM8165s = this$0.m8165s(productType, productIds);
            if (objM8165s != null) {
                InAppPurchaseUtils.m8184e(this$0.billingClientClazz, this$0.queryProductDetailsAsyncMethod, this$0.m8163q(), objM8165s, objNewProxyInstance);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: renamed from: B */
    public static final void m8146B(InAppPurchaseBillingClientWrapperV5V7 this$0, InAppPurchaseUtils.IAPProductType productType, Runnable completionHandler) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(productType, "$productType");
            Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
            InAppPurchaseUtils.m8184e(this$0.billingClientClazz, this$0.queryPurchaseHistoryAsyncMethod, this$0.m8163q(), this$0.m8166t(productType), Proxy.newProxyInstance(this$0.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{this$0.purchaseHistoryResponseListenerClazz}, this$0.new C5532a(new Object[]{productType, completionHandler})));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Map m8150d() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return f7874R;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InAppPurchaseBillingClientWrapperV5V7 m8151e() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return f7873Q;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ Map m8152f() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return f7876T;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ Map m8153g() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return f7875S;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ String m8154h() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return f7871O;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicBoolean m8155i() {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return null;
        }
        try {
            return f7872P;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ void m8156j(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.m8167u(objArr, objArr2);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m8157k(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.m8168v(objArr, objArr2);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ void m8158l(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.m8169w(objArr, objArr2);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ void m8159m(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.m8170x(objArr, objArr2);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ void m8160n(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7, Object[] objArr, Object[] objArr2) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            inAppPurchaseBillingClientWrapperV5V7.m8171y(objArr, objArr2);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ void m8161o(InAppPurchaseBillingClientWrapperV5V7 inAppPurchaseBillingClientWrapperV5V7) {
        if (C42757a.m93689d(InAppPurchaseBillingClientWrapperV5V7.class)) {
            return;
        }
        try {
            f7873Q = inAppPurchaseBillingClientWrapperV5V7;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, InAppPurchaseBillingClientWrapperV5V7.class);
        }
    }

    /* JADX INFO: renamed from: C */
    private final void m8147C(Runnable runnable) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            InAppPurchaseUtils.m8184e(this.billingClientClazz, this.billingClientStartConnectionMethod, m8163q(), Proxy.newProxyInstance(this.billingClientStateListenerClazz.getClassLoader(), new Class[]{this.billingClientStateListenerClazz}, new C5532a(new Object[]{runnable})));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m8162p(Runnable runnable) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            if (f7872P.get()) {
                runnable.run();
            } else {
                m8147C(runnable);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
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
            m8162p(new Runnable() { // from class: h3.i
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseBillingClientWrapperV5V7.m8146B(this.f85754b, productType, completionHandler);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public Object m8163q() {
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

    @Nullable
    /* JADX INFO: renamed from: r */
    public final String m8164r(@NotNull String productDetailsString) {
        List<String> groupValues;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(productDetailsString, "productDetailsString");
            MatchResult matchResultFind$default = Regex.find$default(new Regex("jsonString='(.*?)'"), productDetailsString, 0, 2, null);
            if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(groupValues, 1);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final Object m8165s(InAppPurchaseUtils.IAPProductType productType, List<String> productIds) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            if (productIds.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : productIds) {
                Object objM8184e = InAppPurchaseUtils.m8184e(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderBuildMethod, InAppPurchaseUtils.m8184e(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderSetProductTypeMethod, InAppPurchaseUtils.m8184e(this.queryProductDetailsParamsProductBuilderClazz, this.queryProductDetailsParamsProductBuilderSetProductIdMethod, InAppPurchaseUtils.m8184e(this.queryProductDetailsParamsProductClazz, this.queryProductDetailsParamsProductNewBuilderMethod, null, new Object[0]), str), productType.getType()), new Object[0]);
                if (objM8184e != null) {
                    arrayList.add(objM8184e);
                }
            }
            return InAppPurchaseUtils.m8184e(this.queryProductDetailsParamsBuilderClazz, this.queryProductDetailsParamsBuilderBuildMethod, InAppPurchaseUtils.m8184e(this.queryProductDetailsParamsBuilderClazz, this.queryProductDetailsParamsBuilderSetProductListMethod, InAppPurchaseUtils.m8184e(this.queryProductDetailsParamsClazz, this.queryProductDetailsParamsNewBuilderMethod, null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final Object m8166t(InAppPurchaseUtils.IAPProductType productType) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            return InAppPurchaseUtils.m8184e(this.queryPurchaseHistoryParamsBuilderClazz, this.queryPurchaseHistoryParamsBuilderBuildMethod, InAppPurchaseUtils.m8184e(this.queryPurchaseHistoryParamsBuilderClazz, this.queryPurchaseHistoryParamsBuilderSetProductTypeMethod, InAppPurchaseUtils.m8184e(this.queryPurchaseHistoryParamsClazz, this.queryPurchaseHistoryParamsNewBuilderMethod, null, new Object[0]), productType.getType()), new Object[0]);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8167u(Object[] wrapperArgs, Object[] listenerArgs) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            f7872P.set(false);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8168v(Object[] wrapperArgs, Object[] listenerArgs) {
        Runnable runnable;
        if (!C42757a.m93689d(this) && listenerArgs != null) {
            try {
                if (listenerArgs.length != 0) {
                    if (Intrinsics.areEqual(InAppPurchaseUtils.m8184e(this.billingResultClazz, this.billingResultGetResponseCodeMethod, listenerArgs[0], new Object[0]), (Object) 0)) {
                        f7872P.set(true);
                        if (wrapperArgs != null && wrapperArgs.length != 0) {
                            Object obj = wrapperArgs[0];
                            if ((obj instanceof Runnable) && (runnable = (Runnable) obj) != null) {
                                runnable.run();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m8169w(Object[] wrapperArgs, Object[] listenerArgs) {
        Object orNull;
        Object orNull2;
        String str;
        String strM8164r;
        if (!C42757a.m93689d(this)) {
            if (wrapperArgs != null) {
                try {
                    orNull = ArraysKt.getOrNull(wrapperArgs, 0);
                } catch (Throwable th2) {
                    C42757a.m93687b(th2, this);
                    return;
                }
            } else {
                orNull = null;
            }
            if (listenerArgs != null) {
                orNull2 = ArraysKt.getOrNull(listenerArgs, 1);
            } else {
                orNull2 = null;
            }
            if (orNull2 != null && (orNull2 instanceof List)) {
                Iterator it = ((List) orNull2).iterator();
                while (it.hasNext()) {
                    try {
                        Object objM8184e = InAppPurchaseUtils.m8184e(this.productDetailsClazz, this.productDetailsToStringMethod, it.next(), new Object[0]);
                        if (objM8184e instanceof String) {
                            str = (String) objM8184e;
                        } else {
                            str = null;
                        }
                        if (str != null && (strM8164r = m8164r(str)) != null) {
                            JSONObject jSONObject = new JSONObject(strM8164r);
                            if (jSONObject.has("productId")) {
                                String productId = jSONObject.getString("productId");
                                Map<String, JSONObject> map = f7876T;
                                Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                map.put(productId, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (orNull != null && (orNull instanceof Runnable)) {
                    ((Runnable) orNull).run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8170x(Object[] wrapperArgs, Object[] listenerArgs) {
        Object orNull;
        Object orNull2;
        String str;
        if (!C42757a.m93689d(this)) {
            if (wrapperArgs != null) {
                try {
                    orNull = ArraysKt.getOrNull(wrapperArgs, 0);
                } catch (Throwable th2) {
                    C42757a.m93687b(th2, this);
                    return;
                }
            } else {
                orNull = null;
            }
            if (orNull != null && (orNull instanceof InAppPurchaseUtils.IAPProductType)) {
                Object orNull3 = ArraysKt.getOrNull(wrapperArgs, 1);
                if (orNull3 instanceof Runnable) {
                    if (listenerArgs != null) {
                        orNull2 = ArraysKt.getOrNull(listenerArgs, 1);
                    } else {
                        orNull2 = null;
                    }
                    if (orNull2 != null && (orNull2 instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) orNull2).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objM8184e = InAppPurchaseUtils.m8184e(this.purchaseHistoryRecordClazz, this.purchaseHistoryRecordGetOriginalJsonMethod, it.next(), new Object[0]);
                                if (objM8184e instanceof String) {
                                    str = (String) objM8184e;
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String productId = jSONObject.getString("productId");
                                        if (!f7876T.containsKey(productId)) {
                                            Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                            arrayList.add(productId);
                                        }
                                        if (orNull == InAppPurchaseUtils.IAPProductType.INAPP) {
                                            Map<String, JSONObject> map = f7874R;
                                            Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                            map.put(productId, jSONObject);
                                        } else {
                                            Map<String, JSONObject> map2 = f7875S;
                                            Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                            map2.put(productId, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            m8172z((InAppPurchaseUtils.IAPProductType) orNull, arrayList, (Runnable) orNull3);
                        } else {
                            ((Runnable) orNull3).run();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m8171y(Object[] wrapperArgs, Object[] listenerArgs) {
        Object orNull;
        Object orNull2;
        String str;
        if (!C42757a.m93689d(this)) {
            if (wrapperArgs != null) {
                try {
                    orNull = ArraysKt.getOrNull(wrapperArgs, 0);
                } catch (Throwable th2) {
                    C42757a.m93687b(th2, this);
                    return;
                }
            } else {
                orNull = null;
            }
            if (orNull != null && (orNull instanceof InAppPurchaseUtils.IAPProductType)) {
                Object orNull3 = ArraysKt.getOrNull(wrapperArgs, 1);
                if (orNull3 instanceof Runnable) {
                    if (listenerArgs != null) {
                        orNull2 = ArraysKt.getOrNull(listenerArgs, 1);
                    } else {
                        orNull2 = null;
                    }
                    if (orNull2 != null && (orNull2 instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) orNull2).iterator();
                        while (it.hasNext()) {
                            Object objM8184e = InAppPurchaseUtils.m8184e(this.purchaseClazz, this.purchaseGetOriginalJsonMethod, it.next(), new Object[0]);
                            if (objM8184e instanceof String) {
                                str = (String) objM8184e;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String productId = jSONObject.getString("productId");
                                    if (!f7876T.containsKey(productId)) {
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        arrayList.add(productId);
                                    }
                                    if (orNull == InAppPurchaseUtils.IAPProductType.INAPP) {
                                        Map<String, JSONObject> map = f7874R;
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        map.put(productId, jSONObject);
                                    } else {
                                        Map<String, JSONObject> map2 = f7875S;
                                        Intrinsics.checkNotNullExpressionValue(productId, "productId");
                                        map2.put(productId, jSONObject);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            m8172z((InAppPurchaseUtils.IAPProductType) orNull, arrayList, (Runnable) orNull3);
                        } else {
                            ((Runnable) orNull3).run();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m8172z(final InAppPurchaseUtils.IAPProductType productType, final List<String> productIds, final Runnable completionHandler) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            m8162p(new Runnable() { // from class: h3.j
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseBillingClientWrapperV5V7.m8145A(this.f85757b, completionHandler, productType, productIds);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
