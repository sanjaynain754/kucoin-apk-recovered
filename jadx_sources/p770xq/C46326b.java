package p770xq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.FlutterError;
import io.flutter.plugin.common.MethodCall;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44127a;

/* JADX INFO: renamed from: xq.b */
/* JADX INFO: compiled from: LoggerHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lxq/b;", "", "<init>", "()V", "Lio/flutter/plugin/common/MethodCall;", "call", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lio/flutter/plugin/common/MethodCall;)V", "component_monitor_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C46326b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46326b f103903a = new C46326b();

    /* JADX INFO: renamed from: a */
    public final void m102144a(@NotNull MethodCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        String str = (String) call.argument("tag");
        if (str == null) {
            throw new IllegalArgumentException("tag");
        }
        String str2 = (String) call.argument("message");
        if (str2 == null) {
            throw new IllegalArgumentException("message");
        }
        String str3 = (String) call.argument(FirebaseAnalytics.Param.LEVEL);
        if (str3 == null) {
            str3 = "info";
        }
        FlutterError flutterErrorM102141a = C46325a.m102141a(call);
        int iHashCode = str3.hashCode();
        if (iHashCode != 95458899) {
            if (iHashCode != 96784904) {
                if (iHashCode == 1124446108 && str3.equals("warning")) {
                    C44127a.m97256p(str, str2);
                    return;
                }
            } else if (str3.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                if (flutterErrorM102141a != null) {
                    C44127a.m97246f(str, str2, flutterErrorM102141a.getThrowable());
                    return;
                } else {
                    C44127a.m97245e(str, str2);
                    return;
                }
            }
        } else if (str3.equals("debug")) {
            C44127a.m97243c(str, str2);
            return;
        }
        C44127a.m97250j(str, str2);
    }
}
