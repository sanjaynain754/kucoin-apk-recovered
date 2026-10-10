package p569qq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.FlutterError;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p642tq.InterfaceC45059b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qq.c */
/* JADX INFO: compiled from: FlutterTrackBridge.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lqq/c;", "", "<init>", "()V", "", "name", "Lorg/json/JSONObject;", "param", "", "b", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "Lcom/kubi/monitor/FlutterError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/monitor/FlutterError;)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43842c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43842c f96910a = new C43842c();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m96558a(@NotNull FlutterError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Iterator<InterfaceC45059b> it = C43848i.f96913a.m96586e().mo32842d().iterator();
        while (it.hasNext()) {
            it.next().mo86564b(error);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m96559b(@NotNull String name, @NotNull JSONObject param) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(param, "param");
        C43852m.m96605q(name, param);
    }
}
