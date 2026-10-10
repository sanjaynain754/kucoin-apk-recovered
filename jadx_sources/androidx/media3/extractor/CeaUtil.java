package androidx.media3.extractor;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class CeaUtil {
    private static final int COUNTRY_CODE = 181;
    private static final int PAYLOAD_TYPE_CC = 4;
    private static final int PROVIDER_CODE_ATSC = 49;
    private static final int PROVIDER_CODE_DIRECTV = 47;
    private static final String TAG = "CeaUtil";
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;

    private static int readNon255TerminatedValue(ParsableByteArray parsableByteArray) {
        int i11 = 0;
        while (parsableByteArray.bytesLeft() != 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            i11 += unsignedByte;
            if (unsignedByte != 255) {
                return i11;
            }
        }
        return -1;
    }

    private CeaUtil() {
    }

    public static void consume(long j11, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i11;
        boolean z11;
        while (true) {
            boolean z12 = true;
            if (parsableByteArray.bytesLeft() > 1) {
                int non255TerminatedValue = readNon255TerminatedValue(parsableByteArray);
                int non255TerminatedValue2 = readNon255TerminatedValue(parsableByteArray);
                int position = parsableByteArray.getPosition() + non255TerminatedValue2;
                if (non255TerminatedValue2 != -1 && non255TerminatedValue2 <= parsableByteArray.bytesLeft()) {
                    if (non255TerminatedValue == 4 && non255TerminatedValue2 >= 8) {
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        int unsignedShort = parsableByteArray.readUnsignedShort();
                        if (unsignedShort == 49) {
                            i11 = parsableByteArray.readInt();
                        } else {
                            i11 = 0;
                        }
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        if (unsignedShort == 47) {
                            parsableByteArray.skipBytes(1);
                        }
                        if (unsignedByte == 181 && ((unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (unsignedShort == 49) {
                            if (i11 != 1195456820) {
                                z12 = false;
                            }
                            z11 &= z12;
                        }
                        if (z11) {
                            consumeCcData(j11, parsableByteArray, trackOutputArr);
                        }
                    }
                } else {
                    Log.m2961w(TAG, "Skipping remainder of malformed SEI NAL unit.");
                    position = parsableByteArray.limit();
                }
                parsableByteArray.setPosition(position);
            } else {
                return;
            }
        }
    }

    public static void consumeCcData(long j11, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        boolean z11;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(1);
            int i11 = (unsignedByte & 31) * 3;
            int position = parsableByteArray.getPosition();
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.setPosition(position);
                trackOutput.sampleData(parsableByteArray, i11);
                if (j11 != C2711C.TIME_UNSET) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Assertions.checkState(z11);
                trackOutput.sampleMetadata(j11, 1, i11, 0, null);
            }
        }
    }
}
