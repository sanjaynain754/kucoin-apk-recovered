package com.kubi.widget.web.cookie;

import android.net.Uri;
import android.webkit.CookieManager;
import androidx.webkit.ProxyConfig;
import com.kubi.host.HostManager;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.kubi.widget.web.service.IKWebService;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import kotlinx.coroutines.TimeoutKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;

/* JADX INFO: compiled from: SessionCookieHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0086@¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000eH\u0002J\u001a\u0010\u0014\u001a\u000e\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010\u0012J$\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u001aJ8\u0010\u001b\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\b2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00060\u000fj\u0002`\u0010H\u0082@¢\u0006\u0002\u0010\u0012J\b\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010!\u001a\u00020 2\n\u0010\"\u001a\u00060#j\u0002`$H\u0002J\u000e\u0010%\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050)H\u0002J\u000e\u0010*\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\u0012J\u0010\u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0012\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010/\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/SessionCookieHelper;", "", "<init>", "()V", "TAG", "", "api", "DEFAULT_WAIT_SESSION_TIMEOUT_MS", "", "refreshScope", "Lkotlinx/coroutines/CoroutineScope;", "refreshMutex", "Lkotlinx/coroutines/sync/Mutex;", "refreshDeferred", "Lkotlinx/coroutines/Deferred;", "Lcom/kubi/widget/web/service/IKWebService$Result;", "Lcom/kubi/widget/web/cookie/Result;", "refreshSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newRefreshDeferred", "activeRefresh", "waitForSessionReady", "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;", "Lcom/kubi/widget/web/cookie/SessionReadyResult;", "url", "timeoutMs", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForRefreshAndCookies", "pendingRefresh", "(Ljava/lang/String;JLkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshSessionInternal", "reportLoginByTokenSuccess", "", "reportLoginByTokenCancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "notifyLogin", "isSupportedWebUrl", "", "getSupportedHosts", "", "notifyUpdateSession", "getWebSessionValue", "sessionRegex", "Lkotlin/text/Regex;", "findSessionValue", "cookie", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSessionCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionCookieHelper.kt\ncom/kubi/widget/web/cookie/SessionCookieHelper\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,270:1\n116#2,8:271\n125#2,2:280\n116#2,11:288\n1#3:279\n46#4,6:282\n46#4,6:299\n46#4,6:305\n46#4,6:311\n46#4,6:317\n46#4,6:326\n46#4,6:335\n46#4,6:341\n1761#5,3:323\n774#5:332\n865#5,2:333\n*S KotlinDebug\n*F\n+ 1 SessionCookieHelper.kt\ncom/kubi/widget/web/cookie/SessionCookieHelper\n*L\n50#1:271,8\n50#1:280,2\n83#1:288,11\n63#1:282,6\n139#1:299,6\n184#1:305,6\n192#1:311,6\n204#1:317,6\n218#1:326,6\n252#1:335,6\n264#1:341,6\n214#1:323,3\n230#1:332\n230#1:333,2\n*E\n"})
public final class SessionCookieHelper {

    /* JADX INFO: renamed from: d */
    @Nullable
    public static InterfaceC41729r0<IKWebService.C27196a> f55069d;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SessionCookieHelper f55066a = new SessionCookieHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC41709m0 f55067b = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()));

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC44082a f55068c = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Regex f55070e = new Regex("SESSION=([^;]+)");

    /* JADX INFO: renamed from: n */
    public final String m67124n(String str) {
        try {
            MatchResult matchResultFind$default = Regex.find$default(f55070e, str, 0, 2, null);
            if (matchResultFind$default == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(matchResultFind$default.getGroupValues(), 1);
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, "SessionCookieHelper", false, null, 8, null), null, 2, null);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m67127q(String str) {
        String lowerCase;
        String host;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if ((!Intrinsics.areEqual(lowerCase, "http") && !Intrinsics.areEqual(lowerCase, ProxyConfig.MATCH_HTTPS)) || (host = uri.getHost()) == null) {
                return false;
            }
            Set<String> setM67125o = m67125o();
            if (setM67125o != null && setM67125o.isEmpty()) {
                return false;
            }
            for (String str2 : setM67125o) {
                if (Intrinsics.areEqual(host, str2)) {
                    return true;
                }
                if (StringsKt.endsWith$default(host, '.' + str2, false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, "SessionCookieHelper", false, null, 8, null), null, 2, null);
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Object m67108A(SessionCookieHelper sessionCookieHelper, String str, long j11, InterfaceC41729r0 interfaceC41729r0, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC41729r0 = null;
        }
        return sessionCookieHelper.m67135z(str, j11, interfaceC41729r0, continuation);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m67121s(InterfaceC41729r0 interfaceC41729r0, Throwable th2) {
        C41696j.m91104d(f55067b, null, null, new SessionCookieHelper$newRefreshDeferred$2$1$1(interfaceC41729r0, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m67123m(Continuation<? super InterfaceC41729r0<IKWebService.C27196a>> continuation) {
        SessionCookieHelper$activeRefresh$1 sessionCookieHelper$activeRefresh$1;
        InterfaceC44082a interfaceC44082a;
        if (continuation instanceof SessionCookieHelper$activeRefresh$1) {
            sessionCookieHelper$activeRefresh$1 = (SessionCookieHelper$activeRefresh$1) continuation;
            int i11 = sessionCookieHelper$activeRefresh$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionCookieHelper$activeRefresh$1.label = i11 - Integer.MIN_VALUE;
            } else {
                sessionCookieHelper$activeRefresh$1 = new SessionCookieHelper$activeRefresh$1(this, continuation);
            }
        } else {
            sessionCookieHelper$activeRefresh$1 = new SessionCookieHelper$activeRefresh$1(this, continuation);
        }
        Object obj = sessionCookieHelper$activeRefresh$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = sessionCookieHelper$activeRefresh$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC44082a interfaceC44082a2 = f55068c;
            sessionCookieHelper$activeRefresh$1.L$0 = interfaceC44082a2;
            sessionCookieHelper$activeRefresh$1.I$0 = 0;
            sessionCookieHelper$activeRefresh$1.label = 1;
            if (interfaceC44082a2.mo91344d(null, sessionCookieHelper$activeRefresh$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC44082a = interfaceC44082a2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC44082a = (InterfaceC44082a) sessionCookieHelper$activeRefresh$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r0 = f55069d;
            if (interfaceC41729r0 == null || !interfaceC41729r0.isActive()) {
                interfaceC41729r0 = null;
            }
            return interfaceC41729r0;
        } finally {
            interfaceC44082a.mo91345e(null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC41729r0<IKWebService.C27196a> m67128r() {
        final InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r0M91102b = C41696j.m91102b(f55067b, null, null, new SessionCookieHelper$newRefreshDeferred$1(null), 3, null);
        interfaceC41729r0M91102b.mo90426j(new Function1() { // from class: com.kubi.widget.web.cookie.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SessionCookieHelper.m67121s(interfaceC41729r0M91102b, (Throwable) obj);
            }
        });
        return interfaceC41729r0M91102b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m67129t(Continuation<? super Unit> continuation) {
        SessionCookieHelper$notifyLogin$1 sessionCookieHelper$notifyLogin$1;
        if (continuation instanceof SessionCookieHelper$notifyLogin$1) {
            sessionCookieHelper$notifyLogin$1 = (SessionCookieHelper$notifyLogin$1) continuation;
            int i11 = sessionCookieHelper$notifyLogin$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionCookieHelper$notifyLogin$1.label = i11 - Integer.MIN_VALUE;
            } else {
                sessionCookieHelper$notifyLogin$1 = new SessionCookieHelper$notifyLogin$1(this, continuation);
            }
        } else {
            sessionCookieHelper$notifyLogin$1 = new SessionCookieHelper$notifyLogin$1(this, continuation);
        }
        Object obj = sessionCookieHelper$notifyLogin$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = sessionCookieHelper$notifyLogin$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                SessionCookieHelper$notifyLogin$2 sessionCookieHelper$notifyLogin$2 = new SessionCookieHelper$notifyLogin$2(null);
                sessionCookieHelper$notifyLogin$1.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, sessionCookieHelper$notifyLogin$2, sessionCookieHelper$notifyLogin$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            if (C42899b.m94075e(e12)) {
                C44128b.m97264h(e12);
            } else {
                C43846g.m96568c(new KWebWidgetException(e12, "SessionCookieHelper", false, null, 8, null), null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        if (r15 == r1) goto L39;
     */
    @Nullable
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m67131v(@NotNull Continuation<? super IKWebService.C27196a> continuation) {
        SessionCookieHelper$refreshSession$1 sessionCookieHelper$refreshSession$1;
        InterfaceC44082a interfaceC44082a;
        if (continuation instanceof SessionCookieHelper$refreshSession$1) {
            sessionCookieHelper$refreshSession$1 = (SessionCookieHelper$refreshSession$1) continuation;
            int i11 = sessionCookieHelper$refreshSession$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionCookieHelper$refreshSession$1.label = i11 - Integer.MIN_VALUE;
            } else {
                sessionCookieHelper$refreshSession$1 = new SessionCookieHelper$refreshSession$1(this, continuation);
            }
        } else {
            sessionCookieHelper$refreshSession$1 = new SessionCookieHelper$refreshSession$1(this, continuation);
        }
        Object objMo91198h = sessionCookieHelper$refreshSession$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = sessionCookieHelper$refreshSession$1.label;
        try {
            try {
                if (i12 == 0) {
                    ResultKt.throwOnFailure(objMo91198h);
                    interfaceC44082a = f55068c;
                    sessionCookieHelper$refreshSession$1.L$0 = interfaceC44082a;
                    sessionCookieHelper$refreshSession$1.I$0 = 0;
                    sessionCookieHelper$refreshSession$1.label = 1;
                    if (interfaceC44082a.mo91344d(null, sessionCookieHelper$refreshSession$1) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i12 == 1) {
                    interfaceC44082a = (InterfaceC44082a) sessionCookieHelper$refreshSession$1.L$0;
                    ResultKt.throwOnFailure(objMo91198h);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objMo91198h);
                }
                return (IKWebService.C27196a) objMo91198h;
                InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r0M67128r = f55069d;
                if (interfaceC41729r0M67128r == null || !interfaceC41729r0M67128r.isActive()) {
                    interfaceC41729r0M67128r = null;
                }
                if (interfaceC41729r0M67128r == null) {
                    interfaceC41729r0M67128r = f55066a.m67128r();
                    f55069d = interfaceC41729r0M67128r;
                }
                interfaceC44082a.mo91345e(null);
                sessionCookieHelper$refreshSession$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M67128r);
                sessionCookieHelper$refreshSession$1.label = 2;
                objMo91198h = interfaceC41729r0M67128r.mo91198h(sessionCookieHelper$refreshSession$1);
            } catch (Throwable th2) {
                interfaceC44082a.mo91345e(null);
                throw th2;
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            if (C42899b.m94075e(e12)) {
                C44128b.m97264h(e12);
            } else {
                C43846g.m96568c(new KWebWidgetException(e12, "refreshSession", false, null, 8, null), null, 2, null);
            }
            return new IKWebService.C27196a(false, "refresh error");
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m67133x(CancellationException cancellationException) {
        try {
            C24329b.f48558a.m58863b("loginByToken", "cancel", cancellationException);
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, "SessionCookieHelper", false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m67134y() {
        try {
            C24329b.f48558a.m58864d("loginByToken", "success");
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, "SessionCookieHelper", false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: z */
    public final Object m67135z(String str, long j11, InterfaceC41729r0<IKWebService.C27196a> interfaceC41729r0, Continuation<? super IKWebService.SessionReadyResult> continuation) {
        SessionCookieHelper$waitForRefreshAndCookies$1 sessionCookieHelper$waitForRefreshAndCookies$1;
        if (continuation instanceof SessionCookieHelper$waitForRefreshAndCookies$1) {
            sessionCookieHelper$waitForRefreshAndCookies$1 = (SessionCookieHelper$waitForRefreshAndCookies$1) continuation;
            int i11 = sessionCookieHelper$waitForRefreshAndCookies$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionCookieHelper$waitForRefreshAndCookies$1.label = i11 - Integer.MIN_VALUE;
            } else {
                sessionCookieHelper$waitForRefreshAndCookies$1 = new SessionCookieHelper$waitForRefreshAndCookies$1(this, continuation);
            }
        } else {
            sessionCookieHelper$waitForRefreshAndCookies$1 = new SessionCookieHelper$waitForRefreshAndCookies$1(this, continuation);
        }
        Object objM90469d = sessionCookieHelper$waitForRefreshAndCookies$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = sessionCookieHelper$waitForRefreshAndCookies$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90469d);
                SessionCookieHelper$waitForRefreshAndCookies$waitResult$1 sessionCookieHelper$waitForRefreshAndCookies$waitResult$1 = new SessionCookieHelper$waitForRefreshAndCookies$waitResult$1(interfaceC41729r0, str, null);
                sessionCookieHelper$waitForRefreshAndCookies$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                sessionCookieHelper$waitForRefreshAndCookies$1.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                sessionCookieHelper$waitForRefreshAndCookies$1.J$0 = j11;
                sessionCookieHelper$waitForRefreshAndCookies$1.label = 1;
                objM90469d = TimeoutKt.m90469d(j11, sessionCookieHelper$waitForRefreshAndCookies$waitResult$1, sessionCookieHelper$waitForRefreshAndCookies$1);
                if (objM90469d == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90469d);
            }
            IKWebService.SessionReadyResult sessionReadyResult = (IKWebService.SessionReadyResult) objM90469d;
            return sessionReadyResult == null ? new IKWebService.SessionReadyResult(false, IKWebService.SessionReadyResult.Status.TIMEOUT, "wait session/csrf timeout") : sessionReadyResult;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            if (C42899b.m94075e(e12)) {
                C44128b.m97264h(e12);
            } else {
                C43846g.m96568c(new KWebWidgetException(e12, "waitForSessionReady", false, null, 8, null), null, 2, null);
            }
            return new IKWebService.SessionReadyResult(false, IKWebService.SessionReadyResult.Status.FAILED, "wait session/csrf error");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m67122B(@NotNull String str, long j11, @NotNull Continuation<? super IKWebService.SessionReadyResult> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new SessionCookieHelper$waitForSessionReady$2(str, j11, null), continuation);
    }

    /* JADX INFO: renamed from: o */
    public final Set<String> m67125o() {
        Object objM103844constructorimpl;
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        HostManager hostManager = HostManager.a;
        setCreateSetBuilder.addAll(hostManager.h());
        setCreateSetBuilder.addAll(hostManager.s());
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Uri.parse(hostManager.m()).getHost());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str = (String) objM103844constructorimpl;
        if (str != null) {
            setCreateSetBuilder.add(str);
        }
        Set setBuild = SetsKt.build(setCreateSetBuilder);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setBuild) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final String m67126p(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String cookie = CookieManager.getInstance().getCookie(url);
            if (cookie == null) {
                return null;
            }
            return m67124n(cookie);
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43846g.m96568c(new KWebWidgetException(e11, "SessionCookieHelper", false, null, 8, null), null, 2, null);
            } else {
                C44128b.m97264h(e11);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final Object m67130u(Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new SessionCookieHelper$notifyUpdateSession$2(null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public final Object m67132w(Continuation<? super IKWebService.C27196a> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new SessionCookieHelper$refreshSessionInternal$2(null), continuation);
    }
}
