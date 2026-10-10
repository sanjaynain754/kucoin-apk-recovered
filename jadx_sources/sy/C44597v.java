package sy;

import android.content.Context;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.handler.IMethodHandler;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import p741wy.InterfaceC45955o;
import p741wy.InterfaceC45957q;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: sy.v */
/* JADX INFO: compiled from: ShareUrlHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/flutter/handler/ShareUrlHandler;", "Lcom/kubi/sdk/flutter/handler/IMethodHandler;", "<init>", "()V", "handleMethod", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "iTransmit", "Lcom/kubi/sdk/flutter/transmit/IShareUrlTransmit;", "getITransmit", "()Lcom/kubi/sdk/flutter/transmit/IShareUrlTransmit;", "iTransmit$delegate", "Lkotlin/Lazy;", "getShreUrl", "", "utmSource", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShareUrlHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareUrlHandler.kt\ncom/kubi/sdk/flutter/handler/ShareUrlHandler\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n*L\n1#1,31:1\n65#2:32\n*S KotlinDebug\n*F\n+ 1 ShareUrlHandler.kt\ncom/kubi/sdk/flutter/handler/ShareUrlHandler\n*L\n26#1:32\n*E\n"})
public final class C44597v implements IMethodHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44597v f98881a = new C44597v();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f98882b = LazyKt.lazy(new Function0() { // from class: sy.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44597v.m98699d();
        }
    });

    /* JADX INFO: renamed from: d */
    public static final InterfaceC45955o m98699d() {
        return (InterfaceC45955o) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45955o.class)));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC45955o m98700b() {
        return (InterfaceC45955o) f98882b.getValue();
    }

    @Override // com.kubi.sdk.flutter.handler.IMethodHandler
    public void handleMethod(@NotNull Context context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        result.success(m98701c(C27041f.m66668h((String) call.argument("utmSource"))));
    }

    /* JADX INFO: renamed from: c */
    public final String m98701c(String str) {
        String strMo59666g;
        InterfaceC45955o interfaceC45955oM98700b = m98700b();
        if (interfaceC45955oM98700b != null) {
            strMo59666g = interfaceC45955oM98700b.mo59666g(str);
        } else {
            strMo59666g = null;
        }
        return C27041f.m66668h(strMo59666g);
    }
}
