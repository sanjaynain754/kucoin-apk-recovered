package ca0;

import androidx.annotation.NonNull;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: ca0.c */
/* JADX INFO: compiled from: DefaultAudioStretcher.java */
/* JADX INFO: loaded from: classes59.dex */
public class C4922c implements InterfaceC4920a {
    @Override // ca0.InterfaceC4920a
    /* JADX INFO: renamed from: a */
    public void mo5145a(@NonNull ShortBuffer shortBuffer, @NonNull ShortBuffer shortBuffer2, int i11) {
        if (shortBuffer.remaining() < shortBuffer2.remaining()) {
            InterfaceC4920a.f5459c.mo5145a(shortBuffer, shortBuffer2, i11);
        } else if (shortBuffer.remaining() > shortBuffer2.remaining()) {
            InterfaceC4920a.f5458b.mo5145a(shortBuffer, shortBuffer2, i11);
        } else {
            InterfaceC4920a.f5457a.mo5145a(shortBuffer, shortBuffer2, i11);
        }
    }
}
