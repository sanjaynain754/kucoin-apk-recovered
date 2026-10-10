package x90;

import androidx.annotation.NonNull;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: x90.b */
/* JADX INFO: compiled from: DefaultAudioResampler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46105b implements InterfaceC46104a {
    @Override // x90.InterfaceC46104a
    /* JADX INFO: renamed from: a */
    public void mo101606a(@NonNull ShortBuffer shortBuffer, int i11, @NonNull ShortBuffer shortBuffer2, int i12, int i13) {
        if (i11 < i12) {
            InterfaceC46104a.f103559b.mo101606a(shortBuffer, i11, shortBuffer2, i12, i13);
        } else if (i11 > i12) {
            InterfaceC46104a.f103558a.mo101606a(shortBuffer, i11, shortBuffer2, i12, i13);
        } else {
            InterfaceC46104a.f103560c.mo101606a(shortBuffer, i11, shortBuffer2, i12, i13);
        }
    }
}
