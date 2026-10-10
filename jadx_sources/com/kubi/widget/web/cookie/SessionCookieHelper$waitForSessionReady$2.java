package com.kubi.widget.web.cookie;

import com.kubi.user.config.UserInfo;
import com.kubi.widget.web.service.IKWebService;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SessionCookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;", "Lcom/kubi/widget/web/cookie/SessionReadyResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.SessionCookieHelper$waitForSessionReady$2", m90122f = "SessionCookieHelper.kt", m90123i = {1, 2}, m90124l = {92, 101, 107}, m90125m = "invokeSuspend", m90126n = {"pendingRefresh", "pendingRefresh"}, m90127s = {"L$0", "L$0"})
public final class SessionCookieHelper$waitForSessionReady$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super IKWebService.SessionReadyResult>, Object> {
    final /* synthetic */ long $timeoutMs;
    final /* synthetic */ String $url;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCookieHelper$waitForSessionReady$2(String str, long j11, Continuation<? super SessionCookieHelper$waitForSessionReady$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$timeoutMs = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SessionCookieHelper$waitForSessionReady$2(this.$url, this.$timeoutMs, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super IKWebService.SessionReadyResult> continuation) {
        return ((SessionCookieHelper$waitForSessionReady$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r1 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        if (r1 == r0) goto L35;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM67123m;
        Object objM67108A;
        Object objM67135z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                        objM67108A = obj;
                        return (IKWebService.SessionReadyResult) objM67108A;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM67135z = obj;
                return (IKWebService.SessionReadyResult) objM67135z;
            }
            ResultKt.throwOnFailure(obj);
            objM67123m = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            SessionCookieHelper sessionCookieHelper = SessionCookieHelper.f55066a;
            this.label = 1;
            objM67123m = sessionCookieHelper.m67123m(this);
            if (objM67123m != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        InterfaceC41729r0 interfaceC41729r0 = (InterfaceC41729r0) objM67123m;
        if (!UserInfo.a.n()) {
            return new IKWebService.SessionReadyResult(true, IKWebService.SessionReadyResult.Status.NOT_LOGIN, null, 4, null);
        }
        SessionCookieHelper sessionCookieHelper2 = SessionCookieHelper.f55066a;
        if (!sessionCookieHelper2.m67127q(this.$url)) {
            return new IKWebService.SessionReadyResult(true, IKWebService.SessionReadyResult.Status.UNSUPPORTED_URL, null, 4, null);
        }
        if (interfaceC41729r0 != null) {
            String str = this.$url;
            long j11 = this.$timeoutMs;
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.label = 2;
            objM67135z = sessionCookieHelper2.m67135z(str, j11, interfaceC41729r0, this);
        } else {
            if (CookieHelper.f55058a.m67094j(this.$url)) {
                return new IKWebService.SessionReadyResult(true, IKWebService.SessionReadyResult.Status.READY, null, 4, null);
            }
            String str2 = this.$url;
            long j12 = this.$timeoutMs;
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.label = 3;
            objM67108A = SessionCookieHelper.m67108A(sessionCookieHelper2, str2, j12, null, this, 4, null);
        }
        return coroutine_suspended;
    }
}
