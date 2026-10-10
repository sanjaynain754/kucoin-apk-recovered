package p672ur;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ur.g */
/* JADX INFO: compiled from: IRequestTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\t¨\u0006\f"}, m90084d2 = {"Lur/g;", "", "", "b", "()V", "c", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "f", "d", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC45297g {

    /* JADX INFO: renamed from: ur.g$a */
    /* JADX INFO: compiled from: IRequestTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lur/g$a;", "", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lur/g;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkRequest;)Lur/g;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        InterfaceC45297g mo100131a(@NotNull NetworkRequest request);
    }

    /* JADX INFO: renamed from: a */
    void mo100136a(@NotNull Throwable e11);

    /* JADX INFO: renamed from: b */
    void mo100137b();

    /* JADX INFO: renamed from: c */
    void mo100138c();

    /* JADX INFO: renamed from: d */
    void mo100139d();

    /* JADX INFO: renamed from: e */
    void mo100140e(@NotNull Throwable e11);

    /* JADX INFO: renamed from: f */
    void mo100141f();
}
