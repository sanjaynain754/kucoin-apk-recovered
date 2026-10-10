package x90;

import androidx.annotation.NonNull;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: x90.c */
/* JADX INFO: compiled from: DownsampleAudioResampler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46106c implements InterfaceC46104a {
    /* JADX INFO: renamed from: b */
    public static float m101607b(int i11, int i12) {
        return i11 / i12;
    }

    @Override // x90.InterfaceC46104a
    /* JADX INFO: renamed from: a */
    public void mo101606a(@NonNull ShortBuffer shortBuffer, int i11, @NonNull ShortBuffer shortBuffer2, int i12, int i13) {
        if (i11 < i12) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler. Channels:" + i13);
        }
        int iRemaining = shortBuffer.remaining() / i13;
        int iCeil = (int) Math.ceil(((double) iRemaining) * (((double) i12) / ((double) i11)));
        int i14 = iRemaining - iCeil;
        float fM101607b = m101607b(iCeil, iCeil);
        float fM101607b2 = m101607b(i14, i14);
        int i15 = iCeil;
        int i16 = i14;
        while (i15 > 0 && i16 > 0) {
            if (fM101607b >= fM101607b2) {
                shortBuffer2.put(shortBuffer.get());
                if (i13 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                i15--;
                fM101607b = m101607b(i15, iCeil);
            } else {
                shortBuffer.position(shortBuffer.position() + i13);
                i16--;
                fM101607b2 = m101607b(i16, i14);
            }
        }
    }
}
