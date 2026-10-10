package k90;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: k90.b */
/* JADX INFO: compiled from: ILogger.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0007J+\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lk90/b;", "", "", "tag", "msg", "", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "debug", "b", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public interface InterfaceC40964b {
    /* JADX INFO: renamed from: a */
    void mo89710a(@NotNull String tag, @Nullable String msg, @Nullable Throwable error);

    /* JADX INFO: renamed from: b */
    void mo89711b(@NotNull String tag, @NotNull String msg);

    /* JADX INFO: renamed from: c */
    void mo89712c(@NotNull String tag, @NotNull String msg);

    void debug(@NotNull String tag, @NotNull String msg);
}
