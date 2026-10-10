package sy;

import android.content.Context;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.handler.IMethodHandler;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import p741wy.InterfaceC45946f;
import p741wy.InterfaceC45957q;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: sy.n */
/* JADX INFO: compiled from: MockUrlHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/flutter/handler/MockUrlHandler;", "Lcom/kubi/sdk/flutter/handler/IMethodHandler;", "<init>", "()V", "handleMethod", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "iTransmit", "Lcom/kubi/sdk/flutter/transmit/IGetMockUrlTransmit;", "getITransmit", "()Lcom/kubi/sdk/flutter/transmit/IGetMockUrlTransmit;", "iTransmit$delegate", "Lkotlin/Lazy;", "getMockUrl", "", "path", "queries", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMockUrlHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MockUrlHandler.kt\ncom/kubi/sdk/flutter/handler/MockUrlHandler\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n*L\n1#1,30:1\n65#2:31\n*S KotlinDebug\n*F\n+ 1 MockUrlHandler.kt\ncom/kubi/sdk/flutter/handler/MockUrlHandler\n*L\n26#1:31\n*E\n"})
public final class C44589n implements IMethodHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44589n f98873a = new C44589n();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f98874b = LazyKt.lazy(new Function0() { // from class: sy.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44589n.m98689d();
        }
    });

    /* JADX INFO: renamed from: d */
    public static final InterfaceC45946f m98689d() {
        return (InterfaceC45946f) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45946f.class)));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC45946f m98690b() {
        return (InterfaceC45946f) f98874b.getValue();
    }

    @Override // com.kubi.sdk.flutter.handler.IMethodHandler
    public void handleMethod(@NotNull Context context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        result.success(m98691c((String) call.argument("path"), (String) call.argument("queries")));
    }

    /* JADX INFO: renamed from: c */
    public final String m98691c(String str, String str2) {
        InterfaceC45946f interfaceC45946fM98690b = m98690b();
        if (interfaceC45946fM98690b != null) {
            return interfaceC45946fM98690b.m101382n(str, str2);
        }
        return null;
    }
}
