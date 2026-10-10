package x90;

import androidx.annotation.NonNull;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: x90.e */
/* JADX INFO: compiled from: UpsampleAudioResampler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46108e implements InterfaceC46104a {
    /* JADX INFO: renamed from: c */
    private static float m101609c(int i11, int i12) {
        return i11 / i12;
    }

    @Override // x90.InterfaceC46104a
    /* JADX INFO: renamed from: a */
    public void mo101606a(@NonNull ShortBuffer shortBuffer, int i11, @NonNull ShortBuffer shortBuffer2, int i12, int i13) {
        if (i11 > i12) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler. Channels:" + i13);
        }
        int iRemaining = shortBuffer.remaining() / i13;
        int iCeil = ((int) Math.ceil(((double) iRemaining) * (((double) i12) / ((double) i11)))) - iRemaining;
        float fM101609c = m101609c(iRemaining, iRemaining);
        float fM101609c2 = m101609c(iCeil, iCeil);
        int i14 = iCeil;
        int i15 = iRemaining;
        while (i15 > 0 && i14 > 0) {
            if (fM101609c >= fM101609c2) {
                shortBuffer2.put(shortBuffer.get());
                if (i13 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                i15--;
                fM101609c = m101609c(i15, iRemaining);
            } else {
                shortBuffer2.put(m101608b(shortBuffer2, shortBuffer, 1, i13));
                if (i13 == 2) {
                    shortBuffer2.put(m101608b(shortBuffer2, shortBuffer, 2, i13));
                }
                i14--;
                fM101609c2 = m101609c(i14, iCeil);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static short m101608b(@NonNull ShortBuffer shortBuffer, @NonNull ShortBuffer shortBuffer2, int i11, int i12) {
        return shortBuffer.get(shortBuffer.position() - i12);
    }
}
