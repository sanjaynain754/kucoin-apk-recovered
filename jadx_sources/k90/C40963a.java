package k90;

import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: k90.a */
/* JADX INFO: compiled from: DefaultLogCat.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lk90/a;", "Lk90/b;", "<init>", "()V", "", "tag", "msg", "", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "debug", "b", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C40963a implements InterfaceC40964b {
    @Override // k90.InterfaceC40964b
    /* JADX INFO: renamed from: a */
    public void mo89710a(@NotNull String tag, @Nullable String msg, @Nullable Throwable error) {
        Log.e(tag, msg, error);
    }

    @Override // k90.InterfaceC40964b
    /* JADX INFO: renamed from: b */
    public void mo89711b(@NotNull String tag, @NotNull String msg) {
        Log.w(tag, msg);
    }

    @Override // k90.InterfaceC40964b
    /* JADX INFO: renamed from: c */
    public void mo89712c(@NotNull String tag, @NotNull String msg) {
        Log.i(tag, msg);
    }

    @Override // k90.InterfaceC40964b
    public void debug(@NotNull String tag, @NotNull String msg) {
        Log.d(tag, msg);
    }
}
