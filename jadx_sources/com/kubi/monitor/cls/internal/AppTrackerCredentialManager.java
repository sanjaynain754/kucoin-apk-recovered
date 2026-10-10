package com.kubi.monitor.cls.internal;

import android.content.Context;
import android.util.Log;
import jc0.C40383a;
import jc0.C40384b;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import mr.C42597a;
import oc0.C43017d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppTrackerCredentialManager.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m90084d2 = {"Lcom/kubi/monitor/cls/internal/AppTrackerCredentialManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;", "stsToken", "", "f", "(Landroid/content/Context;Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;)Z", "", "e", "(Landroid/content/Context;)V", "c", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "(Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;)Z", "", "b", "(Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;)Ljava/lang/String;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/m0;", "scope", "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/x1;", "periodicRefreshJob", "Lcom/kubi/monitor/cls/internal/AppTrackerClsApi;", "d", "Lkotlin/Lazy;", "()Lcom/kubi/monitor/cls/internal/AppTrackerClsApi;", "api", "Monitor-cls_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AppTrackerCredentialManager {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC41775x1 periodicRefreshJob;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppTrackerCredentialManager f35508a = new AppTrackerCredentialManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC41709m0 scope = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C41782z0.m91392b()).plus(new CoroutineName("AppTrackerCredentials")));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy api = LazyKt.lazy(new Function0<AppTrackerClsApi>() { // from class: com.kubi.monitor.cls.internal.AppTrackerCredentialManager$api$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        public final AppTrackerClsApi invoke() {
            return (AppTrackerClsApi) C42597a.m93386b().create(AppTrackerClsApi.class);
        }
    });

    /* JADX INFO: renamed from: e */
    public final synchronized void m42405e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC41775x1 interfaceC41775x1 = periodicRefreshJob;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        periodicRefreshJob = C41696j.m91104d(scope, null, null, new AppTrackerCredentialManager$start$1(context.getApplicationContext(), null), 3, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m42401f(Context context, AppTrackerClsToken stsToken) {
        Object objM103844constructorimpl;
        C19217a c19217a = C19217a.f35512a;
        if (c19217a.m42409c() != null) {
            return f35508a.m42406g(stsToken);
        }
        AppTrackerCredentialManager appTrackerCredentialManager = f35508a;
        try {
            Result.Companion companion = Result.INSTANCE;
            C40384b c40384b = new C40384b(context.getApplicationContext(), appTrackerCredentialManager.m42402b(stsToken), stsToken.getSecretId(), stsToken.getSecretKey(), stsToken.getToken(), C43017d.m94487a());
            c19217a.m42411e(context.getApplicationContext());
            c19217a.m42415i(c40384b);
            c19217a.m42414h(new C40383a(c40384b));
            c19217a.m42413g(stsToken);
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            Log.e("AppTrackerCredentials", "Tencent CLS initialization failed", thM103847exceptionOrNullimpl);
            objM103844constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final String m42402b(AppTrackerClsToken appTrackerClsToken) {
        return "https://" + appTrackerClsToken.getRegion() + ".cls.tencentcs.com";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m42403c(Context context, Continuation<? super Unit> continuation) {
        AppTrackerCredentialManager$fetchAndUpdateToken$1 appTrackerCredentialManager$fetchAndUpdateToken$1;
        Object objM103844constructorimpl;
        if (continuation instanceof AppTrackerCredentialManager$fetchAndUpdateToken$1) {
            appTrackerCredentialManager$fetchAndUpdateToken$1 = (AppTrackerCredentialManager$fetchAndUpdateToken$1) continuation;
            int i11 = appTrackerCredentialManager$fetchAndUpdateToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appTrackerCredentialManager$fetchAndUpdateToken$1.label = i11 - Integer.MIN_VALUE;
            } else {
                appTrackerCredentialManager$fetchAndUpdateToken$1 = new AppTrackerCredentialManager$fetchAndUpdateToken$1(this, continuation);
            }
        } else {
            appTrackerCredentialManager$fetchAndUpdateToken$1 = new AppTrackerCredentialManager$fetchAndUpdateToken$1(this, continuation);
        }
        Object objFetchToken = appTrackerCredentialManager$fetchAndUpdateToken$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = appTrackerCredentialManager$fetchAndUpdateToken$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objFetchToken);
                Result.Companion companion = Result.INSTANCE;
                AppTrackerClsApi appTrackerClsApiM42404d = m42404d();
                appTrackerCredentialManager$fetchAndUpdateToken$1.L$0 = context;
                appTrackerCredentialManager$fetchAndUpdateToken$1.label = 1;
                objFetchToken = appTrackerClsApiM42404d.fetchToken(appTrackerCredentialManager$fetchAndUpdateToken$1);
                if (objFetchToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) appTrackerCredentialManager$fetchAndUpdateToken$1.L$0;
                ResultKt.throwOnFailure(objFetchToken);
            }
            AppTrackerClsTokenResponse appTrackerClsTokenResponse = (AppTrackerClsTokenResponse) objFetchToken;
            if (!appTrackerClsTokenResponse.getSuccess()) {
                throw new IllegalStateException(("Fetch CLS STS token failed, code=" + ((Object) appTrackerClsTokenResponse.getCode()) + ", msg=" + ((Object) appTrackerClsTokenResponse.getMessage())).toString());
            }
            AppTrackerClsToken data = appTrackerClsTokenResponse.getData();
            if (data == null) {
                throw new IllegalStateException("CLS STS token response is missing credentials");
            }
            if (!data.isValid()) {
                throw new IllegalStateException("CLS STS token response is missing credentials");
            }
            if (!m42401f(context, data)) {
                throw new IllegalStateException("Update CLS credentials failed");
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                Log.e("AppTrackerCredentials", "Fetch or update CLS STS token failed", thM103847exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: d */
    public final AppTrackerClsApi m42404d() {
        Object value = api.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-api>(...)");
        return (AppTrackerClsApi) value;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m42406g(AppTrackerClsToken stsToken) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C19217a c19217a = C19217a.f35512a;
            C40384b c40384bM42410d = c19217a.m42410d();
            if (c40384bM42410d == null) {
                return false;
            }
            c40384bM42410d.m88999q(stsToken.getSecretId(), stsToken.getSecretKey(), stsToken.getToken());
            c40384bM42410d.m89000r(m42402b(stsToken), stsToken.getTopicId());
            c19217a.m42413g(stsToken);
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            Log.e("AppTrackerCredentials", "Tencent CLS config update failed", thM103847exceptionOrNullimpl);
            objM103844constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM103844constructorimpl).booleanValue();
    }
}
