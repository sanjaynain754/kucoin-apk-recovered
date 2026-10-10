package androidx.media3.extractor.p021ts;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TsUtil {
    public static boolean isStartOfTsPacket(byte[] bArr, int i11, int i12, int i13) {
        int i14 = 0;
        for (int i15 = -4; i15 <= 4; i15++) {
            int i16 = (i15 * TsExtractor.TS_PACKET_SIZE) + i13;
            if (i16 < i11 || i16 >= i12 || bArr[i16] != 71) {
                i14 = 0;
            } else {
                i14++;
                if (i14 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static int findSyncBytePosition(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] != 71) {
            i11++;
        }
        return i11;
    }

    private TsUtil() {
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i11, int i12) {
        parsableByteArray.setPosition(i11);
        if (parsableByteArray.bytesLeft() < 5) {
            return C2711C.TIME_UNSET;
        }
        int i13 = parsableByteArray.readInt();
        if ((8388608 & i13) != 0 || ((2096896 & i13) >> 8) != i12 || (i13 & 32) == 0 || parsableByteArray.readUnsignedByte() < 7 || parsableByteArray.bytesLeft() < 7 || (parsableByteArray.readUnsignedByte() & 16) != 16) {
            return C2711C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        parsableByteArray.readBytes(bArr, 0, 6);
        return readPcrValueFromPcrBytes(bArr);
    }
}
