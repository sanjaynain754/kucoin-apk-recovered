package com.kubi.fallback.internal.config;

import com.google.firebase.perf.util.Constants;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.utils.extensions.C27041f;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wf.C45824a;
import wf.C45825b;

/* JADX INFO: compiled from: FallbackConfigHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0002J\u001f\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001fJ\u0017\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020\nH\u0000¢\u0006\u0002\b$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/fallback/internal/config/FallbackConfigHelper;", "", "<init>", "()V", "FALLBACK_CONFIG_NAME", "", "DEFAULT_GLOBAL_FALLBACK_TYPE", "defaultFallbackData", "Lcom/kubi/fallback/internal/config/FallbackData;", "fallbackEnabled", "", "dynamicRoutesFallbackList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "errorCodesFallbackList", "globalFallbackData", "fallbackTypeList", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "currentJob", "Lkotlinx/coroutines/Job;", "initConfig", "", "updateFallbackConfig", "realUpdateConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValid", "itemFallback", "errorCodesFallback", "errorCode", "path", "errorCodesFallback$LFallback_googleRelease", "dynamicRoutesFallback", "route", "dynamicRoutesFallback$LFallback_googleRelease", Constants.ENABLE_DISABLE, "isEnabled$LFallback_googleRelease", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFallbackConfigHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallbackConfigHelper.kt\ncom/kubi/fallback/internal/config/FallbackConfigHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,205:1\n295#2,2:206\n295#2,2:208\n47#3,4:210\n*S KotlinDebug\n*F\n+ 1 FallbackConfigHelper.kt\ncom/kubi/fallback/internal/config/FallbackConfigHelper\n*L\n149#1:206,2\n176#1:208,2\n66#1:210,4\n*E\n"})
public final class FallbackConfigHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FallbackConfigHelper f21941a = new FallbackConfigHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final FallbackData f21942b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f21943c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final CopyOnWriteArrayList<FallbackData> f21944d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final CopyOnWriteArrayList<FallbackData> f21945e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static FallbackData f21946f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final List<String> f21947g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final InterfaceC41709m0 f21948h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static InterfaceC41775x1 f21949i;

    /* JADX INFO: renamed from: com.kubi.fallback.internal.config.FallbackConfigHelper$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FallbackConfigHelper.kt\ncom/kubi/fallback/internal/config/FallbackConfigHelper\n*L\n1#1,49:1\n68#2:50\n67#2,5:51\n*E\n"})
    public static final class C12594a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C45824a.m101236a(exception, "FallbackConfigHelper");
            C45825b.f103310a.m101238a(exception);
        }

        public C12594a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    static {
        FallbackData fallbackData = new FallbackData("native", "fallback/global", null, null, null, null, 60, null);
        f21942b = fallbackData;
        f21944d = new CopyOnWriteArrayList<>();
        f21945e = new CopyOnWriteArrayList<>();
        f21946f = fallbackData;
        f21947g = CollectionsKt.listOf((Object[]) new String[]{"h5", "native", ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER, KCTurboFileModuleImpl.SOURCE_RN, "default"});
        f21948h = C41713n0.m91125a(new CoroutineName("Fallback").plus(C42911a.m94120b()).plus(new C12594a(CoroutineExceptionHandler.INSTANCE)));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final FallbackData m23760i(@NotNull String route) {
        Object next;
        Intrinsics.checkNotNullParameter(route, "route");
        Iterator<T> it = f21944d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((FallbackData) next).getPath(), route));
        FallbackData fallbackData = (FallbackData) next;
        if (fallbackData == null) {
            return null;
        }
        if (m23764m(fallbackData)) {
            return fallbackData;
        }
        C45824a.m101236a(new Throwable("Dynamic route disaster recovery configuration is invalid; using global disaster recovery instead," + fallbackData), "FallbackConfigManager");
        return f21946f;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final FallbackData m23761j(@NotNull String errorCode, @NotNull String path) {
        Object next;
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(path, "path");
        Iterator<T> it = f21945e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            FallbackData fallbackData = (FallbackData) next;
            if (Intrinsics.areEqual(fallbackData.getErrorCode(), errorCode) && Intrinsics.areEqual(fallbackData.getPath(), path)) {
                break;
            }
        }
        FallbackData fallbackData2 = (FallbackData) next;
        if (fallbackData2 == null) {
            return null;
        }
        if (m23764m(fallbackData2)) {
            return fallbackData2;
        }
        C45824a.m101236a(new Throwable("Error code disaster recovery configuration is invalid; using global disaster recovery instead," + fallbackData2), "FallbackConfigManager");
        return f21946f;
    }

    /* JADX INFO: renamed from: k */
    public final void m23762k() {
        C45825b.f103310a.m101239b("Starting to initialize the disaster recovery configuration.");
        m23766o();
        C41696j.m91104d(f21948h, null, null, new FallbackConfigHelper$initConfig$1(null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m23763l() {
        return f21943c;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m23764m(FallbackData fallbackData) {
        if (f21947g.contains(C27041f.m66668h(fallbackData != null ? fallbackData.getFallbackType() : null))) {
            return C27041f.m66668h(fallbackData != null ? fallbackData.getFallbackValue() : null).length() > 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m23766o() {
        InterfaceC41775x1 interfaceC41775x1 = f21949i;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        f21949i = C41696j.m91104d(f21948h, null, null, new FallbackConfigHelper$updateFallbackConfig$1(null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final Object m23765n(Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new FallbackConfigHelper$realUpdateConfig$2(null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
