package p781y0;

import androidx.media3.exoplayer.upstream.CmcdData;
import coil.network.NetworkObserver;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: compiled from: NetworkObserver.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Ly0/a;", "Lcoil/network/NetworkObserver;", "<init>", "()V", "", "shutdown", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "isOnline", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C46358a implements NetworkObserver {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C46358a f103946b = new C46358a();

    @Override // coil.network.NetworkObserver
    /* JADX INFO: renamed from: a */
    public boolean mo5500a() {
        return true;
    }

    @Override // coil.network.NetworkObserver
    public void shutdown() {
    }
}
