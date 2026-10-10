package s90;

import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: s90.b */
/* JADX INFO: compiled from: PassThroughAudioRemixer.java */
/* JADX INFO: loaded from: classes59.dex */
public class C44368b implements AudioRemixer {
    @Override // com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer
    /* JADX INFO: renamed from: b */
    public void mo67945b(@NonNull ShortBuffer shortBuffer, @NonNull ShortBuffer shortBuffer2) {
        shortBuffer2.put(shortBuffer);
    }

    @Override // com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer
    /* JADX INFO: renamed from: a */
    public int mo67944a(int i11) {
        return i11;
    }
}
