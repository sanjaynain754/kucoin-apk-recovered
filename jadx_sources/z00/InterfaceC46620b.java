package z00;

import androidx.annotation.UiThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.kubi.sdk.web.core.WebLoadError;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: z00.b */
/* JADX INFO: compiled from: IViewLoadingListener.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J/\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lz00/b;", "", "", "d", "()V", "", "progress", "b", "(I)V", "c", "Lcom/kubi/sdk/web/core/WebLoadError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "e", "(Lcom/kubi/sdk/web/core/WebLoadError;)V", "f", "", "pageType", "", "dclTime", "currentProjectName", "currentProjectVersion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@UiThread
public interface InterfaceC46620b {
    /* JADX INFO: renamed from: a */
    void mo65497a(@NotNull String pageType, double dclTime, @NotNull String currentProjectName, @NotNull String currentProjectVersion);

    /* JADX INFO: renamed from: b */
    void mo65498b(int progress);

    /* JADX INFO: renamed from: c */
    void mo65499c();

    /* JADX INFO: renamed from: d */
    void mo65500d();

    /* JADX INFO: renamed from: e */
    void mo65501e(@NotNull WebLoadError error);

    /* JADX INFO: renamed from: f */
    void mo65502f();

    /* JADX INFO: renamed from: z00.b$a */
    /* JADX INFO: compiled from: IViewLoadingListener.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m102788a(@NotNull InterfaceC46620b interfaceC46620b) {
        }
    }
}
