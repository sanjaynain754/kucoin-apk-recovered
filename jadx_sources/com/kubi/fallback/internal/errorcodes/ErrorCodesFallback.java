package com.kubi.fallback.internal.errorcodes;

import com.kubi.fallback.FallbackManager;
import com.kubi.fallback.internal.config.FallbackData;
import com.kubi.fallback.internal.errorcodes.ErrorCodesFallback;
import com.kubi.router.core.Router;
import com.kubi.utils.C27058k0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import o00.C42917g;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wf.C45824a;
import wf.C45825b;

/* JADX INFO: compiled from: ErrorCodesFallback.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\t"}, m90084d2 = {"Lcom/kubi/fallback/internal/errorcodes/ErrorCodesFallback;", "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;", "<init>", "()V", "invoke", "", "errorInfo", "Lcom/kubi/kucoin/callback/BizErrorInfo;", "Companion", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nErrorCodesFallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorCodesFallback.kt\ncom/kubi/fallback/internal/errorcodes/ErrorCodesFallback\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,70:1\n19#2,2:71\n*S KotlinDebug\n*F\n+ 1 ErrorCodesFallback.kt\ncom/kubi/fallback/internal/errorcodes/ErrorCodesFallback\n*L\n40#1:71,2\n*E\n"})
public final class ErrorCodesFallback implements InterfaceC46255c {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f21952b = new Companion(null);

    /* JADX INFO: compiled from: ErrorCodesFallback.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/fallback/internal/errorcodes/ErrorCodesFallback$Companion;", "", "<init>", "()V", "CODE", "", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m23769d(String str, String str2, FallbackData fallbackData) {
        C43840a.m96550d("ErrorCodesFallback errorCode:" + str + ",path:" + str2 + ",fallbackData:" + fallbackData, "Fallback");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final void m23770e(String str, String str2, FallbackData fallbackData) {
        if (!C27058k0.f54342a.m66755e()) {
            C45824a.m101237b("Error code disaster recovery failure,because the app is in the background,errorCode:" + str + ",path:" + str2, "ErrorCodesFallback");
            return;
        }
        boolean zM4048k = Router.f46192a.m56184f(C27041f.m66668h(fallbackData.getFallbackValue())).m4048k();
        C45825b c45825b = C45825b.f103310a;
        String strM66668h = C27041f.m66668h(fallbackData.getFallbackType());
        Intrinsics.checkNotNull(str);
        c45825b.m101240c(zM4048k, "errorCodes", strM66668h, str);
        if (zM4048k) {
            return;
        }
        C45824a.m101237b("Error code disaster recovery failure,errorCode:" + str + ",path:" + str2, "ErrorCodesFallback");
    }

    /* JADX INFO: renamed from: c */
    public void m23771c(@NotNull BizErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        Request request = errorInfo.getRequest();
        final String strOptString = errorInfo.getBody().optString("code");
        final String strEncodedPath = request.url().encodedPath();
        FallbackManager fallbackManager = FallbackManager.f21936a;
        Intrinsics.checkNotNull(strOptString);
        final FallbackData fallbackDataMo23750c = fallbackManager.mo23750c(strOptString, strEncodedPath);
        if (fallbackDataMo23750c == null) {
            return;
        }
        C27100x0.m66924e(new Function0() { // from class: vf.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ErrorCodesFallback.m23769d(strOptString, strEncodedPath, fallbackDataMo23750c);
            }
        });
        C42917g.m94139e().execute(new Runnable() { // from class: vf.b
            @Override // java.lang.Runnable
            public final void run() {
                ErrorCodesFallback.m23770e(strOptString, strEncodedPath, fallbackDataMo23750c);
            }
        });
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m23771c((BizErrorInfo) obj);
        return Unit.INSTANCE;
    }
}
