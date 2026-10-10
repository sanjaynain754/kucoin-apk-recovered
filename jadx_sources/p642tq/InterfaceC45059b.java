package p642tq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.FlutterError;
import com.kubi.monitor.MonitorLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: tq.b */
/* JADX INFO: compiled from: IIssue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Ltq/b;", "", "", "msg", "category", "Lcom/kubi/monitor/MonitorLevel;", FirebaseAnalytics.Param.LEVEL, "", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;)V", "", "e", "(Ljava/lang/Throwable;Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;)V", "Lcom/kubi/monitor/FlutterError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "b", "(Lcom/kubi/monitor/FlutterError;)V", "key", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface InterfaceC45059b {
    /* JADX INFO: renamed from: a */
    void mo86563a(@NotNull String key, @NotNull String value);

    /* JADX INFO: renamed from: b */
    void mo86564b(@NotNull FlutterError error);

    /* JADX INFO: renamed from: d */
    void mo86566d(@NotNull String msg, @Nullable String category, @NotNull MonitorLevel level);

    /* JADX INFO: renamed from: e */
    void mo86567e(@NotNull Throwable e11, @Nullable String category, @NotNull MonitorLevel level);
}
