package com.kubi.widget.web.cookie;

import com.kubi.widget.web.service.IKWebService;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: SessionCookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.SessionCookieHelper$newRefreshDeferred$2$1$1", m90122f = "SessionCookieHelper.kt", m90123i = {0, 0}, m90124l = {276}, m90125m = "invokeSuspend", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, m90127s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nSessionCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionCookieHelper.kt\ncom/kubi/widget/web/cookie/SessionCookieHelper$newRefreshDeferred$2$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,270:1\n116#2,11:271\n*S KotlinDebug\n*F\n+ 1 SessionCookieHelper.kt\ncom/kubi/widget/web/cookie/SessionCookieHelper$newRefreshDeferred$2$1$1\n*L\n72#1:271,11\n*E\n"})
public final class SessionCookieHelper$newRefreshDeferred$2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41729r0<IKWebService.C27196a> $deferred;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCookieHelper$newRefreshDeferred$2$1$1(InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r0, Continuation<? super SessionCookieHelper$newRefreshDeferred$2$1$1> continuation) {
        super(2, continuation);
        this.$deferred = interfaceC41729r0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SessionCookieHelper$newRefreshDeferred$2$1$1(this.$deferred, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SessionCookieHelper$newRefreshDeferred$2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC44082a interfaceC44082a;
        InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
                interfaceC44082a = (InterfaceC44082a) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC44082a = SessionCookieHelper.f55068c;
            InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r1 = this.$deferred;
            this.L$0 = interfaceC44082a;
            this.L$1 = interfaceC41729r1;
            this.I$0 = 0;
            this.label = 1;
            if (interfaceC44082a.mo91344d(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41729r0 = interfaceC41729r1;
        }
        try {
            if (Intrinsics.areEqual(SessionCookieHelper.f55069d, interfaceC41729r0)) {
                SessionCookieHelper.f55069d = null;
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            interfaceC44082a.mo91345e(null);
        }
    }
}
