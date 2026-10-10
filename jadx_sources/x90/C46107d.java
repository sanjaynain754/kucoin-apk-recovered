package x90;

import androidx.annotation.NonNull;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: x90.d */
/* JADX INFO: compiled from: PassThroughAudioResampler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46107d implements InterfaceC46104a {
    @Override // x90.InterfaceC46104a
    /* JADX INFO: renamed from: a */
    public void mo101606a(@NonNull ShortBuffer shortBuffer, int i11, @NonNull ShortBuffer shortBuffer2, int i12, int i13) {
        if (i11 != i12) {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
        shortBuffer2.put(shortBuffer);
    }
}
