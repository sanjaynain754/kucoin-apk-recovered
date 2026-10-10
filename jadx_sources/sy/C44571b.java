package sy;

import android.content.Context;
import com.kubi.sdk.flutter.exception.FlutterIssueException;
import com.kubi.sdk.flutter.handler.IMethodHandler;
import com.sensorsdata.abtest.OnABTestReceivedData;
import com.sensorsdata.abtest.SensorsABTest;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p609ry.C44199a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: sy.b */
/* JADX INFO: compiled from: FastFetchAbTestHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/flutter/handler/FastFetchAbTestHandler;", "Lcom/kubi/sdk/flutter/handler/IMethodHandler;", "<init>", "()V", "handleMethod", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastFetchAbTestHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastFetchAbTestHandler.kt\ncom/kubi/sdk/flutter/handler/FastFetchAbTestHandler\n+ 2 FlutterIssue.kt\ncom/kubi/sdk/flutter/exception/FlutterIssueKt\n*L\n1#1,27:1\n44#2,15:28\n*S KotlinDebug\n*F\n+ 1 FastFetchAbTestHandler.kt\ncom/kubi/sdk/flutter/handler/FastFetchAbTestHandler\n*L\n24#1:28,15\n*E\n"})
public final class C44571b implements IMethodHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44571b f98855a = new C44571b();

    @Override // com.kubi.sdk.flutter.handler.IMethodHandler
    public void handleMethod(@NotNull Context context, @NotNull MethodCall call, @NotNull final MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            SensorsABTest.shareInstance().fastFetchABTest((String) call.argument("paramName"), (String) call.argument("defaultValue"), new OnABTestReceivedData() { // from class: sy.a
                @Override // com.sensorsdata.abtest.OnABTestReceivedData
                public final void onResult(Object obj) {
                    C44571b.m98655b(result, (String) obj);
                }
            });
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null || !(StringsKt.contains$default((CharSequence) message, (CharSequence) "SocketException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "HandshakeException:", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) message, (CharSequence) "Connection closed", false, 2, (Object) null))) {
                C44199a.m97421b(e11, "FastFetchAbTestHandler");
            } else {
                C43846g.m96568c(new FlutterIssueException(e11, "FastFetchAbTestHandler", true, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m98655b(MethodChannel.Result result, String str) {
        result.success(str);
    }
}
