package ca0;

import androidx.annotation.NonNull;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: ca0.b */
/* JADX INFO: compiled from: CutAudioStretcher.java */
/* JADX INFO: loaded from: classes59.dex */
public class C4921b implements InterfaceC4920a {
    @Override // ca0.InterfaceC4920a
    /* JADX INFO: renamed from: a */
    public void mo5145a(@NonNull ShortBuffer shortBuffer, @NonNull ShortBuffer shortBuffer2, int i11) {
        if (shortBuffer.remaining() >= shortBuffer2.remaining()) {
            int iRemaining = shortBuffer.remaining() - shortBuffer2.remaining();
            shortBuffer.limit(shortBuffer.limit() - iRemaining);
            shortBuffer2.put(shortBuffer);
            shortBuffer.limit(shortBuffer.limit() + iRemaining);
            shortBuffer.position(shortBuffer.limit());
            return;
        }
        throw new IllegalArgumentException("Illegal use of CutAudioStretcher");
    }
}
