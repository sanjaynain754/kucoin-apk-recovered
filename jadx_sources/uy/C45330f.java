package uy;

import android.os.Handler;
import android.os.Looper;
import com.kubi.lflutter.R$string;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.flutter.delegate.FlutterImpellerConfig;
import com.kubi.sdk.flutter.delegate.FlutterShellArgsHelper;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.flutter.transmit.KycFlutterRedirectResult;
import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.loader.FlutterLoader;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.InterfaceC43845f;
import p609ry.C44199a;
import p741wy.InterfaceC45950j;
import p741wy.InterfaceC45957q;
import p741wy.InterfaceC45958r;
import p840zq.C46908e;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: uy.f */
/* JADX INFO: compiled from: RouteFlutterInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J+\u0010\u0016\u001a\u00020\t2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u0018H\u0002R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/flutter/interceptor/RouteFlutterInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "handleLoginRedirect", "", "postcard", "Lcom/kubi/router/model/Postcard;", "toFlutterPage", "handleKycFlutterRedirect", "iUserServiceTransmit", "Lcom/kubi/sdk/flutter/transmit/IUserServiceTransmit;", "uiHandler", "Landroid/os/Handler;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler$delegate", "Lkotlin/Lazy;", "flutterFrameworkCheck", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isOK", "FlutterMockTrackPage", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteFlutterInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteFlutterInterceptor.kt\ncom/kubi/sdk/flutter/interceptor/RouteFlutterInterceptor\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n+ 4 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,151:1\n19#2,2:152\n65#3:154\n65#3:155\n44#4,15:156\n*S KotlinDebug\n*F\n+ 1 RouteFlutterInterceptor.kt\ncom/kubi/sdk/flutter/interceptor/RouteFlutterInterceptor\n*L\n80#1:152,2\n93#1:154\n101#1:155\n140#1:156,15\n*E\n"})
public final class C45330f implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @Nullable
    public InterfaceC45958r f101928a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f101929b = LazyKt.lazy(new Function0() { // from class: uy.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C45330f.m100213r();
        }
    });

    /* JADX INFO: renamed from: uy.f$a */
    /* JADX INFO: compiled from: RouteFlutterInterceptor.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/flutter/interceptor/RouteFlutterInterceptor$FlutterMockTrackPage;", "Lcom/kubi/monitor/ITrackPage;", "<init>", "()V", "value", "", "pageId", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC43845f {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final a f101930b = new a();

        @Override // p569qq.InterfaceC43845f
        @Nullable
        /* JADX INFO: renamed from: getPageId */
        public String getF23018V() {
            return "page_flutter";
        }
    }

    /* JADX INFO: renamed from: uy.f$b */
    /* JADX INFO: compiled from: RouteFlutterInterceptor.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/sdk/flutter/interceptor/RouteFlutterInterceptor$intercept$1", "Lcom/kubi/router/model/IRedirect;", "redirect", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements IRedirect {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4400a f101932c;

        public b(C4400a c4400a) {
            this.f101932c = c4400a;
        }

        @Override // com.kubi.router.model.IRedirect
        /* JADX INFO: renamed from: a */
        public void mo45709a() {
            C45330f.this.m100217m(this.f101932c);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m100214h(final Function1<? super Boolean, Unit> function1) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
            Intrinsics.checkNotNullExpressionValue(flutterLoader, "flutterLoader(...)");
            if (flutterLoader.initialized()) {
                function1.invoke(Boolean.TRUE);
            } else if (FlutterImpellerConfig.f46678a.m56819f()) {
                flutterLoader.ensureInitializationCompleteAsync(C27017c.f54310a.m66513b(), FlutterShellArgsHelper.f46683a.m56821b(), m100215k(), new Runnable() { // from class: uy.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45330f.m100209i(function1);
                    }
                });
            } else {
                flutterLoader.ensureInitializationCompleteAsync(C27017c.f54310a.m66513b(), null, m100215k(), new Runnable() { // from class: uy.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45330f.m100210j(function1);
                    }
                });
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97263g("FlutterHelper", thM103847exceptionOrNullimpl);
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(thM103847exceptionOrNullimpl, "FlutterHelper");
            } else {
                C43846g.m96568c(new FlutterIssueException(thM103847exceptionOrNullimpl, "FlutterHelper", true, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m100217m(C4400a c4400a) {
        if (!Intrinsics.areEqual(C23767n.m56882f(c4400a, false), "task/center") || UserInfo.c().getType() == 1) {
            m100219o(c4400a);
        } else {
            ToastCompat.m66437C(R$string.task_invalid_user);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m100209i(Function1 function1) {
        C44128b.m97266j("FlutterHelper", "flutterInitializationCheck.Initialization is ok");
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: j */
    public static final void m100210j(Function1 function1) {
        C44128b.m97266j("FlutterHelper", "flutterInitializationCheck.Initialization is ok");
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p */
    public static final void m100211p(C45330f c45330f, final C4400a c4400a, final String str, final long j11) {
        c45330f.m100214h(new Function1() { // from class: uy.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45330f.m100212q(c4400a, str, j11, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m100212q(C4400a c4400a, String str, long j11, boolean z11) {
        if (!z11) {
            return Unit.INSTANCE;
        }
        C46908e.f104773a.mo42474b(a.f101930b, c4400a.getUri().getPath());
        FlutterEntryActivity.f46744r.startFlutterPage(C27017c.f54310a.m66513b(), str, c4400a.m4042e(), j11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Handler m100213r() {
        return new Handler(Looper.getMainLooper());
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        if (m100216l(postcard)) {
            return true;
        }
        if (RouteExKt.m56252i(postcard.getBundle(), "needLogin", false) || C27025c.m66566d(Boolean.valueOf(postcard.getUri().getBooleanQueryParameter("needLogin", false)))) {
            InterfaceC45958r interfaceC45958rM100218n = m100218n();
            if (interfaceC45958rM100218n != null) {
                interfaceC45958rM100218n.mo65475i(new b(postcard));
            }
        } else {
            m100219o(postcard);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Handler m100215k() {
        return (Handler) this.f101929b.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m100216l(C4400a c4400a) {
        InterfaceC45950j interfaceC45950j = (InterfaceC45950j) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45950j.class)));
        return (interfaceC45950j != null ? interfaceC45950j.mo36788p(c4400a) : null) == KycFlutterRedirectResult.REDIRECTED;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC45958r m100218n() {
        if (this.f101928a == null) {
            this.f101928a = (InterfaceC45958r) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45958r.class)));
        }
        return this.f101928a;
    }

    /* JADX INFO: renamed from: o */
    public final void m100219o(final C4400a c4400a) {
        String strM56285z = RouteExKt.m56285z(c4400a.getBundle(), "kcFlutterCallbackId", "0");
        Intrinsics.checkNotNullExpressionValue(strM56285z, "compatString(...)");
        final long jM66652l = C27039d.m66652l(StringsKt.toLongOrNull(strM56285z));
        final String strM56884h = C23767n.m56884h(c4400a, false, 1, null);
        C43840a.m96550d("route=" + strM56884h + ", callbackId=" + jM66652l, "flutterRouter");
        C42917g.m94139e().execute(new Runnable() { // from class: uy.b
            @Override // java.lang.Runnable
            public final void run() {
                C45330f.m100211p(this.f101919b, c4400a, strM56884h, jM66652l);
            }
        });
    }
}
