package com.kubi.user.password;

import androidx.annotation.VisibleForTesting;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.PreLoader;
import com.kubi.user.config.UserInfo;
import e70.InterfaceC37095j;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UpdatePasswordHintService.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0012\u001a\u00020\rJ\r\u0010\u0013\u001a\u00020\rH\u0001¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u001aJ\u0019\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/user/password/UpdatePasswordHintService;", "", "<init>", "()V", "TAG", "", "queryChangePasswordLoader", "Lcom/kubi/sdk/util/PreLoader;", "Lcom/kubi/user/password/UpdatePasswordHintEntity;", "getQueryChangePasswordLoader$UserCenterLib_googleRelease$annotations", "getQueryChangePasswordLoader$UserCenterLib_googleRelease", "()Lcom/kubi/sdk/util/PreLoader;", "queryUpdatePasswordHintData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expandPasswordDuration", "showUpdatePasswordHintDialog", "", "registerUpdatePasswordListener", "reset", "reset$UserCenterLib_googleRelease", "canShowUpdatePasswordDialog", "canShowUpdatePasswordDialog$UserCenterLib_googleRelease", "canUpdatePassword", "canUpdatePassword$UserCenterLib_googleRelease", "needUpdatePassword", "needUpdatePassword$UserCenterLib_googleRelease", "withReport", "message", "withReport$UserCenterLib_googleRelease", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUpdatePasswordHintService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatePasswordHintService.kt\ncom/kubi/user/password/UpdatePasswordHintService\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,157:1\n57#2,8:158\n57#2,8:166\n67#2,2:176\n17#3,2:174\n47#4,4:178\n*S KotlinDebug\n*F\n+ 1 UpdatePasswordHintService.kt\ncom/kubi/user/password/UpdatePasswordHintService\n*L\n61#1:158,8\n85#1:166,8\n151#1:176,2\n142#1:174,2\n101#1:178,4\n*E\n"})
public final class UpdatePasswordHintService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UpdatePasswordHintService f53720a = new UpdatePasswordHintService();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final PreLoader<UpdatePasswordHintEntity> f53721b = PreLoader.f48118e.create(new UpdatePasswordHintService$queryChangePasswordLoader$1(null));

    /* JADX INFO: renamed from: com.kubi.user.password.UpdatePasswordHintService$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes53.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 UpdatePasswordHintService.kt\ncom/kubi/user/password/UpdatePasswordHintService\n*L\n1#1,49:1\n102#2,2:50\n*E\n"})
    public static final class C26745a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("UpdatePasswordHintService", exception);
        }

        public C26745a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final boolean m65564d() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37095j.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC37095j) objM56186h).m83024a();
        }
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public final void m65567i() throws InterruptedException {
        f53721b.m58346f();
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m65561g(Boolean bool) {
        if (bool.booleanValue()) {
            C41696j.m91104d(C41713n0.m91125a(new CoroutineName("UpdatePasswordHintService").plus(C42911a.m94120b()).plus(new C26745a(CoroutineExceptionHandler.INSTANCE))), null, null, new C26746xce7d6ee9(null), 3, null);
            UpdatePasswordHintConfig.f53722a.m65568a(0L);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m65562h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final boolean m65563c() {
        if (m65564d() && UserInfo.a.d() == UserInfo.LoginState.Login) {
            return true;
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m65565e(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (!m65563c()) {
            return Unit.INSTANCE;
        }
        m65567i();
        Object objM58345e = f53721b.m58345e(continuation);
        if (objM58345e == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM58345e;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m65566f() {
        if (!m65564d()) {
            return;
        }
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.user.password.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpdatePasswordHintService.m65561g((Boolean) obj);
            }
        };
        observableE.subscribe(new Consumer() { // from class: com.kubi.user.password.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                UpdatePasswordHintService.m65562h(function1, obj);
            }
        });
    }
}
