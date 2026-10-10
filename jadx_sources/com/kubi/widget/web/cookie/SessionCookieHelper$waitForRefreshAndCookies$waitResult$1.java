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
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SessionCookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;", "Lcom/kubi/widget/web/cookie/SessionReadyResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.SessionCookieHelper$waitForRefreshAndCookies$waitResult$1", m90122f = "SessionCookieHelper.kt", m90123i = {2}, m90124l = {120, 120, 129}, m90125m = "invokeSuspend", m90126n = {"refreshResult"}, m90127s = {"L$0"})
public final class SessionCookieHelper$waitForRefreshAndCookies$waitResult$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super IKWebService.SessionReadyResult>, Object> {
    final /* synthetic */ InterfaceC41729r0<IKWebService.C27196a> $pendingRefresh;
    final /* synthetic */ String $url;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCookieHelper$waitForRefreshAndCookies$waitResult$1(InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r0, String str, Continuation<? super SessionCookieHelper$waitForRefreshAndCookies$waitResult$1> continuation) {
        super(2, continuation);
        this.$pendingRefresh = interfaceC41729r0;
        this.$url = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SessionCookieHelper$waitForRefreshAndCookies$waitResult$1(this.$pendingRefresh, this.$url, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super IKWebService.SessionReadyResult> continuation) {
        return ((SessionCookieHelper$waitForRefreshAndCookies$waitResult$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r13 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r13 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r13 == r0) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IKWebService.C27196a c27196a;
        CookieHelper cookieHelper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c27196a = (IKWebService.C27196a) obj;
                    if (!c27196a.getF55233a()) {
                        return new IKWebService.SessionReadyResult(false, IKWebService.SessionReadyResult.Status.FAILED, c27196a.getF55234b());
                    }
                    cookieHelper = CookieHelper.f55058a;
                    if (!cookieHelper.m67094j(this.$url)) {
                        String str = this.$url;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(c27196a);
                        this.label = 3;
                        obj = CookieHelper.m67085s(cookieHelper, str, 200L, 0L, this, 4, null);
                    }
                    return new IKWebService.SessionReadyResult(true, IKWebService.SessionReadyResult.Status.READY, null, 4, null);
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return new IKWebService.SessionReadyResult(false, IKWebService.SessionReadyResult.Status.FAILED, "session/csrf cookie missing");
            }
            return new IKWebService.SessionReadyResult(true, IKWebService.SessionReadyResult.Status.READY, null, 4, null);
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r0 = this.$pendingRefresh;
        if (interfaceC41729r0 != null) {
            this.label = 1;
            obj = interfaceC41729r0.mo91198h(this);
        } else {
            SessionCookieHelper sessionCookieHelper = SessionCookieHelper.f55066a;
            this.label = 2;
            obj = sessionCookieHelper.m67131v(this);
        }
        return coroutine_suspended;
        c27196a = (IKWebService.C27196a) obj;
        if (c27196a == null) {
            SessionCookieHelper sessionCookieHelper2 = SessionCookieHelper.f55066a;
            this.label = 2;
            obj = sessionCookieHelper2.m67131v(this);
        } else {
            if (!c27196a.getF55233a()) {
                return new IKWebService.SessionReadyResult(false, IKWebService.SessionReadyResult.Status.FAILED, c27196a.getF55234b());
            }
            cookieHelper = CookieHelper.f55058a;
            if (!cookieHelper.m67094j(this.$url)) {
                String str2 = this.$url;
                this.L$0 = SpillingKt.nullOutSpilledVariable(c27196a);
                this.label = 3;
                obj = CookieHelper.m67085s(cookieHelper, str2, 200L, 0L, this, 4, null);
            }
            return new IKWebService.SessionReadyResult(true, IKWebService.SessionReadyResult.Status.READY, null, 4, null);
        }
        return coroutine_suspended;
    }
}
