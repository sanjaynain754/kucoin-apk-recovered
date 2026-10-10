package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: classes34.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;

    @Nullable
    public final long[] tableOfContents;

    public long computeDurationUs() {
        long j11 = this.frameCount;
        if (j11 == -1 || j11 == 0) {
            return C2711C.TIME_UNSET;
        }
        MpegAudioUtil.Header header = this.header;
        return Util.sampleCountToDurationUs((j11 * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
    }

    private XingFrame(MpegAudioUtil.Header header, long j11, long j12, @Nullable long[] jArr, int i11, int i12) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j11;
        this.dataSize = j12;
        this.tableOfContents = jArr;
        this.encoderDelay = i11;
        this.encoderPadding = i12;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedIntToInt;
        long unsignedInt;
        long[] jArr;
        int i11;
        int i12;
        int i13 = parsableByteArray.readInt();
        if ((i13 & 1) != 0) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = -1;
        }
        if ((i13 & 2) != 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = -1;
        }
        long j11 = unsignedInt;
        if ((i13 & 4) == 4) {
            jArr = new long[100];
            for (int i14 = 0; i14 < 100; i14++) {
                jArr[i14] = parsableByteArray.readUnsignedByte();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((i13 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i12 = unsignedInt24 & 4095;
            i11 = (16773120 & unsignedInt24) >> 12;
        } else {
            i11 = -1;
            i12 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, j11, jArr2, i11, i12);
    }
}
