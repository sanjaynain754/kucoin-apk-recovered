package s90;

import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer;
import java.nio.ShortBuffer;
import p852kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: renamed from: s90.a */
/* JADX INFO: compiled from: DownMixAudioRemixer.java */
/* JADX INFO: loaded from: classes59.dex */
public class C44367a implements AudioRemixer {
    @Override // com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer
    /* JADX INFO: renamed from: a */
    public int mo67944a(int i11) {
        return i11 / 2;
    }

    @Override // com.otaliastudios.transcoder.internal.audio.remix.AudioRemixer
    /* JADX INFO: renamed from: b */
    public void mo67945b(@NonNull ShortBuffer shortBuffer, @NonNull ShortBuffer shortBuffer2) {
        int i11;
        int iMin = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < iMin; i12++) {
            int i13 = shortBuffer.get() + ShortCompanionObject.MIN_VALUE;
            int i14 = shortBuffer.get() + ShortCompanionObject.MIN_VALUE;
            int i15 = 65535;
            if (i13 >= 32768 && i14 >= 32768) {
                i11 = (((i13 + i14) * 2) - ((i13 * i14) / 32768)) - 65535;
            } else {
                i11 = (i13 * i14) / 32768;
            }
            if (i11 != 65536) {
                i15 = i11;
            }
            shortBuffer2.put((short) (i15 - 32768));
        }
    }
}
