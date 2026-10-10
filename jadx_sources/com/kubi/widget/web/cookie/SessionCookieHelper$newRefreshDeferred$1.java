package com.kubi.widget.web.cookie;

import com.kubi.widget.web.service.IKWebService;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SessionCookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/widget/web/service/IKWebService$Result;", "Lcom/kubi/widget/web/cookie/Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.SessionCookieHelper$newRefreshDeferred$1", m90122f = "SessionCookieHelper.kt", m90123i = {}, m90124l = {69}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SessionCookieHelper$newRefreshDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super IKWebService.C27196a>, Object> {
    int label;

    public SessionCookieHelper$newRefreshDeferred$1(Continuation<? super SessionCookieHelper$newRefreshDeferred$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SessionCookieHelper$newRefreshDeferred$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super IKWebService.C27196a> continuation) {
        return ((SessionCookieHelper$newRefreshDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SessionCookieHelper sessionCookieHelper = SessionCookieHelper.f55066a;
        this.label = 1;
        Object objM67132w = sessionCookieHelper.m67132w(this);
        if (objM67132w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM67132w;
    }
}
