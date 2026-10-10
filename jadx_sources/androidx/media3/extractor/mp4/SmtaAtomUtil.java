package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SmtaAtomUtil {
    private static final int CAMCORDER_FRC_SUPERSLOW_MOTION = 9;
    private static final int CAMCORDER_FRC_SUPERSLOW_MOTION_HEVC = 22;
    private static final int CAMCORDER_NORMAL = 0;
    private static final int CAMCORDER_QFRC_SUPERSLOW_MOTION = 23;
    private static final int CAMCORDER_SINGLE_SUPERSLOW_MOTION = 7;
    private static final int CAMCORDER_SLOW_MOTION_V2 = 12;
    private static final int CAMCORDER_SLOW_MOTION_V2_120 = 13;
    private static final int CAMCORDER_SLOW_MOTION_V2_HEVC = 21;
    private static final int NO_VALUE = -1;

    @Nullable
    public static Metadata parseSmta(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i11) {
            int position = parsableByteArray.getPosition();
            int i12 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i12 < 16) {
                    return null;
                }
                parsableByteArray.skipBytes(4);
                int i13 = -1;
                int i14 = 0;
                for (int i15 = 0; i15 < 2; i15++) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte == 0) {
                        i13 = unsignedByte2;
                    } else if (unsignedByte == 1) {
                        i14 = unsignedByte2;
                    }
                }
                int captureFrameRate = getCaptureFrameRate(i13, parsableByteArray, i11);
                if (captureFrameRate == -2147483647) {
                    return null;
                }
                return new Metadata(new SmtaMetadataEntry(captureFrameRate, i14));
            }
            parsableByteArray.setPosition(position + i12);
        }
        return null;
    }

    private static int getCaptureFrameRate(int i11, ParsableByteArray parsableByteArray, int i12) {
        if (i11 == 12) {
            return 240;
        }
        if (i11 == 13) {
            return 120;
        }
        if (i11 == 21 && parsableByteArray.bytesLeft() >= 8 && parsableByteArray.getPosition() + 8 <= i12) {
            int i13 = parsableByteArray.readInt();
            int i14 = parsableByteArray.readInt();
            if (i13 >= 12 && i14 == 1936877170) {
                return parsableByteArray.readUnsignedFixedPoint1616();
            }
        }
        return C2711C.RATE_UNSET_INT;
    }

    private SmtaAtomUtil() {
    }
}
