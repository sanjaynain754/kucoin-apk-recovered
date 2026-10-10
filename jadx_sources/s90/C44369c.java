package s90;

import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: s90.c */
/* JADX INFO: compiled from: UpMixAudioRemixer.java */
/* JADX INFO: loaded from: classes59.dex */
public class C44369c implements AudioRemixer {
    @Override // com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer
    /* JADX INFO: renamed from: a */
    public int mo67944a(int i11) {
        return i11 * 2;
    }

    @Override // com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer
    /* JADX INFO: renamed from: b */
    public void mo67945b(@NonNull ShortBuffer shortBuffer, @NonNull ShortBuffer shortBuffer2) {
        int iMin = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < iMin; i11++) {
            short s11 = shortBuffer.get();
            shortBuffer2.put(s11);
            shortBuffer2.put(s11);
        }
    }
}
