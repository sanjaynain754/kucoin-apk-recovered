package ca0;

import androidx.annotation.NonNull;
import java.nio.ShortBuffer;
import java.util.Random;

/* JADX INFO: renamed from: ca0.d */
/* JADX INFO: compiled from: InsertAudioStretcher.java */
/* JADX INFO: loaded from: classes59.dex */
public class C4923d implements InterfaceC4920a {

    /* JADX INFO: renamed from: d */
    public static final Random f5460d = new Random();

    /* JADX INFO: renamed from: c */
    public static float m5147c(int i11, int i12) {
        return i11 / i12;
    }

    /* JADX INFO: renamed from: b */
    public static short m5146b() {
        return (short) f5460d.nextInt(300);
    }

    @Override // ca0.InterfaceC4920a
    /* JADX INFO: renamed from: a */
    public void mo5145a(@NonNull ShortBuffer shortBuffer, @NonNull ShortBuffer shortBuffer2, int i11) {
        if (shortBuffer.remaining() < shortBuffer2.remaining()) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT. Channels:" + i11);
            }
            int iRemaining = shortBuffer.remaining() / i11;
            int iFloor = (int) Math.floor(((double) (shortBuffer2.remaining() - shortBuffer.remaining())) / ((double) i11));
            float fM5147c = m5147c(iRemaining, iRemaining);
            float fM5147c2 = m5147c(iFloor, iFloor);
            int i12 = iRemaining;
            while (i12 > 0 && iFloor > 0) {
                if (fM5147c >= fM5147c2) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    i12--;
                    fM5147c = m5147c(i12, iRemaining);
                } else {
                    shortBuffer2.put(m5146b());
                    if (i11 == 2) {
                        shortBuffer2.put(m5146b());
                    }
                    iFloor--;
                    fM5147c2 = m5147c(iFloor, iRemaining);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT");
    }
}
