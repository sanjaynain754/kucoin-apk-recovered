package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class FlacFrameReader {

    public static final class SampleNumberHolder {
        public long sampleNumber;
    }

    private static boolean checkBitsPerSample(int i11, FlacStreamMetadata flacStreamMetadata) {
        return i11 == 0 || i11 == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    private static boolean checkChannelAssignment(int i11, FlacStreamMetadata flacStreamMetadata) {
        if (i11 <= 7) {
            return i11 == flacStreamMetadata.channels - 1;
        }
        return i11 <= 10 && flacStreamMetadata.channels == 2;
    }

    public static boolean checkAndReadFrameHeader(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i11, SampleNumberHolder sampleNumberHolder) {
        int position = parsableByteArray.getPosition();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long j11 = unsignedInt >>> 16;
        if (j11 != i11) {
            return false;
        }
        return checkChannelAssignment((int) ((unsignedInt >> 4) & 15), flacStreamMetadata) && checkBitsPerSample((int) ((unsignedInt >> 1) & 7), flacStreamMetadata) && !(((unsignedInt & 1) > 1L ? 1 : ((unsignedInt & 1) == 1L ? 0 : -1)) == 0) && checkAndReadFirstSampleNumber(parsableByteArray, flacStreamMetadata, ((j11 & 1) > 1L ? 1 : ((j11 & 1) == 1L ? 0 : -1)) == 0, sampleNumberHolder) && checkAndReadBlockSizeSamples(parsableByteArray, flacStreamMetadata, (int) ((unsignedInt >> 12) & 15)) && checkAndReadSampleRate(parsableByteArray, flacStreamMetadata, (int) ((unsignedInt >> 8) & 15)) && checkAndReadCrc(parsableByteArray, position);
    }

    private static boolean checkAndReadSampleRate(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i11) {
        int i12 = flacStreamMetadata.sampleRate;
        if (i11 == 0) {
            return true;
        }
        if (i11 <= 11) {
            return i11 == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i11 == 12) {
            return parsableByteArray.readUnsignedByte() * 1000 == i12;
        }
        if (i11 <= 14) {
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (i11 == 14) {
                unsignedShort *= 10;
            }
            if (unsignedShort == i12) {
                return true;
            }
        }
        return false;
    }

    private FlacFrameReader() {
    }

    private static boolean checkAndReadBlockSizeSamples(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i11) {
        int frameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(parsableByteArray, i11);
        if (frameBlockSizeSamplesFromKey != -1 && frameBlockSizeSamplesFromKey <= flacStreamMetadata.maxBlockSizeSamples) {
            return true;
        }
        return false;
    }

    private static boolean checkAndReadCrc(ParsableByteArray parsableByteArray, int i11) {
        if (parsableByteArray.readUnsignedByte() == Util.crc8(parsableByteArray.getData(), i11, parsableByteArray.getPosition() - 1, 0)) {
            return true;
        }
        return false;
    }

    private static boolean checkAndReadFirstSampleNumber(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, boolean z11, SampleNumberHolder sampleNumberHolder) {
        try {
            long utf8EncodedLong = parsableByteArray.readUtf8EncodedLong();
            if (!z11) {
                utf8EncodedLong *= (long) flacStreamMetadata.maxBlockSizeSamples;
            }
            sampleNumberHolder.sampleNumber = utf8EncodedLong;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean checkFrameHeaderFromPeek(ExtractorInput extractorInput, FlacStreamMetadata flacStreamMetadata, int i11, SampleNumberHolder sampleNumberHolder) throws IOException {
        long peekPosition = extractorInput.getPeekPosition();
        byte[] bArr = new byte[2];
        extractorInput.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i11) {
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition((int) (peekPosition - extractorInput.getPosition()));
            return false;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        System.arraycopy(bArr, 0, parsableByteArray.getData(), 0, 2);
        parsableByteArray.setLimit(ExtractorUtil.peekToLength(extractorInput, parsableByteArray.getData(), 2, 14));
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition((int) (peekPosition - extractorInput.getPosition()));
        return checkAndReadFrameHeader(parsableByteArray, flacStreamMetadata, i11, sampleNumberHolder);
    }

    public static long getFirstSampleNumber(ExtractorInput extractorInput, FlacStreamMetadata flacStreamMetadata) throws IOException {
        int i11;
        extractorInput.resetPeekPosition();
        boolean z11 = true;
        extractorInput.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        extractorInput.peekFully(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z11 = false;
        }
        extractorInput.advancePeekPosition(2);
        if (z11) {
            i11 = 7;
        } else {
            i11 = 6;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(i11);
        parsableByteArray.setLimit(ExtractorUtil.peekToLength(extractorInput, parsableByteArray.getData(), 0, i11));
        extractorInput.resetPeekPosition();
        SampleNumberHolder sampleNumberHolder = new SampleNumberHolder();
        if (checkAndReadFirstSampleNumber(parsableByteArray, flacStreamMetadata, z11, sampleNumberHolder)) {
            return sampleNumberHolder.sampleNumber;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static int readFrameBlockSizeSamplesFromKey(ParsableByteArray parsableByteArray, int i11) {
        switch (i11) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i11 - 2);
            case 6:
                return parsableByteArray.readUnsignedByte() + 1;
            case 7:
                return parsableByteArray.readUnsignedShort() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i11 - 8);
            default:
                return -1;
        }
    }
}
