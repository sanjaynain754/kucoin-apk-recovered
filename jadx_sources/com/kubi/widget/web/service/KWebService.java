package com.kubi.widget.web.service;

import com.kubi.sdk.web.jsapi.JsEventDispatcher;
import com.kubi.utils.extensions.C27041f;
import com.kubi.widget.web.cookie.CookieHelper;
import com.kubi.widget.web.cookie.GrayCookieHelper;
import com.kubi.widget.web.cookie.SessionCookieHelper;
import com.kubi.widget.web.cookie.XTraceCookieHelper;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.widget.web.service.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KWebService.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0096@¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/widget/web/service/KWebService;", "Lcom/kubi/widget/web/service/IKWebService;", "<init>", "()V", "refreshSession", "Lcom/kubi/widget/web/service/IKWebService$Result;", "Lcom/kubi/widget/web/cookie/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForSessionReady", "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;", "Lcom/kubi/widget/web/cookie/SessionReadyResult;", "url", "", "timeoutMs", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSession", "getTraceCookieString", "getXCSRFToken", "clearUserCookie", "", "postEvent", "eventName", ReportDataTable.COLUMN_PARAMS, "updatedGray", "force", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KWebService implements IKWebService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final KWebService f55235b = new KWebService();

    @Override // com.kubi.widget.web.service.IKWebService
    /* JADX INFO: renamed from: a */
    public void mo67354a(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        JsEventDispatcher.f48474a.m58755b(eventName, "");
    }

    @Override // com.kubi.widget.web.service.IKWebService
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo67355b(boolean z11, @NotNull Continuation<? super Unit> continuation) {
        Object objM67107f = GrayCookieHelper.f55062a.m67107f(z11, continuation);
        return objM67107f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM67107f : Unit.INSTANCE;
    }

    @Override // com.kubi.widget.web.service.IKWebService
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo67357d() {
        return C27041f.m66668h(XTraceCookieHelper.f55074a.m67143d());
    }

    @Override // com.kubi.widget.web.service.IKWebService
    @Nullable
    /* JADX INFO: renamed from: g */
    public Object mo67359g(@NotNull String str, long j11, @NotNull Continuation<? super IKWebService.SessionReadyResult> continuation) {
        return SessionCookieHelper.f55066a.m67122B(str, j11, continuation);
    }

    @Override // com.kubi.widget.web.service.IKWebService
    /* JADX INFO: renamed from: h */
    public void mo67360h() {
        CookieHelper.f55058a.m67087c();
    }

    @Override // com.kubi.widget.web.service.IKWebService
    /* JADX INFO: renamed from: i */
    public void mo67361i(@NotNull String eventName, @NotNull String params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        JsEventDispatcher.f48474a.m58755b(eventName, params);
    }

    @Override // com.kubi.widget.web.service.IKWebService
    @Nullable
    /* JADX INFO: renamed from: j */
    public Object mo67362j(@NotNull Continuation<? super IKWebService.C27196a> continuation) {
        return SessionCookieHelper.f55066a.m67131v(continuation);
    }

    @Override // com.kubi.widget.web.service.IKWebService
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo67356c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return SessionCookieHelper.f55066a.m67126p(url);
    }

    @Override // com.kubi.widget.web.service.IKWebService
    @Nullable
    /* JADX INFO: renamed from: e */
    public String mo67358e(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return CookieHelper.f55058a.m67088d(url, "X-CSRF-TOKEN");
    }
}
