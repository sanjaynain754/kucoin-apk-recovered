package com.kubi.widget.web.cookie;

import com.kubi.host.HostManager;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import com.kubi.widget.web.api.IKWebApi;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.kubi.widget.web.exception.KWebWidgetMessage;
import com.kubi.widget.web.service.IKWebService;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SessionCookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/widget/web/service/IKWebService$Result;", "Lcom/kubi/widget/web/cookie/Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.widget.web.cookie.SessionCookieHelper$refreshSessionInternal$2", m90122f = "SessionCookieHelper.kt", m90123i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, m90124l = {152, 154, 164, 165}, m90125m = "invokeSuspend", m90126n = {InterfaceC33826o0.f71244p, "apiUrl", InterfaceC33826o0.f71244p, "apiUrl", DbParams.KEY_CHANNEL_RESULT, InterfaceC33826o0.f71244p, "apiUrl", DbParams.KEY_CHANNEL_RESULT, "sessionCookiesReady", InterfaceC33826o0.f71244p, "apiUrl", DbParams.KEY_CHANNEL_RESULT, "sessionCookiesReady"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
@SourceDebugExtension({"SMAP\nSessionCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionCookieHelper.kt\ncom/kubi/widget/web/cookie/SessionCookieHelper$refreshSessionInternal$2\n+ 2 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n*L\n1#1,270:1\n54#2,2:271\n54#2,2:273\n46#2,6:275\n*S KotlinDebug\n*F\n+ 1 SessionCookieHelper.kt\ncom/kubi/widget/web/cookie/SessionCookieHelper$refreshSessionInternal$2\n*L\n159#1:271,2\n168#1:273,2\n175#1:275,6\n*E\n"})
public final class SessionCookieHelper$refreshSessionInternal$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super IKWebService.C27196a>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    public SessionCookieHelper$refreshSessionInternal$2(Continuation<? super SessionCookieHelper$refreshSessionInternal$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SessionCookieHelper$refreshSessionInternal$2(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super IKWebService.C27196a> continuation) {
        return ((SessionCookieHelper$refreshSessionInternal$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010b A[Catch: Exception -> 0x0029, CancellationException -> 0x002e, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x0029, blocks: (B:9:0x0024, B:50:0x016a, B:18:0x0047, B:47:0x014b, B:21:0x0058, B:40:0x0103, B:42:0x010b, B:44:0x0129, B:24:0x006a, B:34:0x00ca, B:36:0x00d4, B:52:0x0172, B:31:0x0087), top: B:61:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0129 A[Catch: Exception -> 0x0029, CancellationException -> 0x002e, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x0029, blocks: (B:9:0x0024, B:50:0x016a, B:18:0x0047, B:47:0x014b, B:21:0x0058, B:40:0x0103, B:42:0x010b, B:44:0x0129, B:24:0x006a, B:34:0x00ca, B:36:0x00d4, B:52:0x0172, B:31:0x0087), top: B:61:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x014a  */
    /* JADX WARN: Code duplicated, block: B:47:0x014b A[Catch: Exception -> 0x0029, CancellationException -> 0x002e, PHI: r0 r1 r2 r3
      0x014b: PHI (r0v24 boolean) = (r0v21 boolean), (r0v32 boolean) binds: [B:45:0x0148, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r1v13 com.kubi.sdk.base.entity.BaseEntity) = (r1v11 com.kubi.sdk.base.entity.BaseEntity), (r1v22 com.kubi.sdk.base.entity.BaseEntity) binds: [B:45:0x0148, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r2v17 java.lang.String) = (r2v16 java.lang.String), (r2v24 java.lang.String) binds: [B:45:0x0148, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v9 java.lang.String) binds: [B:45:0x0148, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x0029, blocks: (B:9:0x0024, B:50:0x016a, B:18:0x0047, B:47:0x014b, B:21:0x0058, B:40:0x0103, B:42:0x010b, B:44:0x0129, B:24:0x006a, B:34:0x00ca, B:36:0x00d4, B:52:0x0172, B:31:0x0087), top: B:61:0x000e }] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0167, code lost:
    
        if (r4.m67130u(r23) == r9) goto L49;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strM66668h;
        String str;
        Object objSessionByToken;
        Object objM67085s;
        String str2;
        String str3;
        BaseEntity baseEntity;
        boolean zBooleanValue;
        SessionCookieHelper sessionCookieHelper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!UserInfo.a.n()) {
                    return new IKWebService.C27196a(false, "app is not login");
                }
                strM66668h = C27041f.m66668h(UserInfo.c().token);
                str = HostManager.a.m() + "/_api/login-by-token";
                IKWebApi iKWebApi = (IKWebApi) C42597a.m93386b().create(IKWebApi.class);
                this.L$0 = SpillingKt.nullOutSpilledVariable(strM66668h);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                this.label = 1;
                objSessionByToken = iKWebApi.sessionByToken(str, strM66668h, this);
                if (objSessionByToken == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                str = (String) this.L$1;
                strM66668h = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                objSessionByToken = obj;
            } else {
                if (i11 == 2) {
                    BaseEntity baseEntity2 = (BaseEntity) this.L$2;
                    String str4 = (String) this.L$1;
                    String str5 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    str3 = str5;
                    str2 = str4;
                    baseEntity = baseEntity2;
                    objM67085s = obj;
                    zBooleanValue = ((Boolean) objM67085s).booleanValue();
                    if (!zBooleanValue) {
                        C43846g.m96568c(new KWebWidgetMessage("refreshSession session/csrf cookie missing", "CookieHelper", false, 4, null), null, 2, null);
                        return new IKWebService.C27196a(false, "session/csrf cookie missing");
                    }
                    sessionCookieHelper = SessionCookieHelper.f55066a;
                    sessionCookieHelper.m67134y();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                    this.Z$0 = zBooleanValue;
                    this.label = 3;
                    if (sessionCookieHelper.m67129t(this) == coroutine_suspended) {
                        SessionCookieHelper sessionCookieHelper2 = SessionCookieHelper.f55066a;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                        this.Z$0 = zBooleanValue;
                        this.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (i11 == 3) {
                    zBooleanValue = this.Z$0;
                    baseEntity = (BaseEntity) this.L$2;
                    str2 = (String) this.L$1;
                    str3 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    SessionCookieHelper sessionCookieHelper3 = SessionCookieHelper.f55066a;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                    this.Z$0 = zBooleanValue;
                    this.label = 4;
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            return new IKWebService.C27196a(true, "");
            String str6 = str;
            String str7 = strM66668h;
            BaseEntity baseEntity3 = (BaseEntity) objSessionByToken;
            if (!baseEntity3.getSuccess()) {
                C43846g.m96568c(new KWebWidgetMessage("refreshSession server failed", "CookieHelper", false, 4, null), null, 2, null);
                return new IKWebService.C27196a(false, "server error");
            }
            CookieHelper cookieHelper = CookieHelper.f55058a;
            String strM = HostManager.a.m();
            this.L$0 = SpillingKt.nullOutSpilledVariable(str7);
            this.L$1 = SpillingKt.nullOutSpilledVariable(str6);
            this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity3);
            this.label = 2;
            objM67085s = CookieHelper.m67085s(cookieHelper, strM, 3000L, 0L, this, 4, null);
            if (objM67085s != coroutine_suspended) {
                str2 = str6;
                str3 = str7;
                baseEntity = baseEntity3;
                zBooleanValue = ((Boolean) objM67085s).booleanValue();
                if (!zBooleanValue) {
                    C43846g.m96568c(new KWebWidgetMessage("refreshSession session/csrf cookie missing", "CookieHelper", false, 4, null), null, 2, null);
                    return new IKWebService.C27196a(false, "session/csrf cookie missing");
                }
                sessionCookieHelper = SessionCookieHelper.f55066a;
                sessionCookieHelper.m67134y();
                this.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                this.Z$0 = zBooleanValue;
                this.label = 3;
                if (sessionCookieHelper.m67129t(this) == coroutine_suspended) {
                    SessionCookieHelper sessionCookieHelper4 = SessionCookieHelper.f55066a;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                    this.Z$0 = zBooleanValue;
                    this.label = 4;
                }
            }
            return coroutine_suspended;
        } catch (CancellationException e11) {
            SessionCookieHelper.f55066a.m67133x(e11);
            return new IKWebService.C27196a(false, "cancel");
        } catch (Exception e12) {
            if (C42899b.m94075e(e12)) {
                C44128b.m97264h(e12);
            } else {
                C43846g.m96568c(new KWebWidgetException(e12, "refreshSession server error", false, null, 8, null), null, 2, null);
            }
            return new IKWebService.C27196a(false, "request error:" + C27041f.m66668h(e12.getMessage()));
        }
    }
}
