package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.WavUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* JADX INFO: renamed from: id */
        public final int f3545id;
        public final long size;

        private ChunkHeader(int i11, long j11) {
            this.f3545id = i11;
            this.size = j11;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    public static boolean checkFileType(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i11 = ChunkHeader.peek(extractorInput, parsableByteArray).f3545id;
        if (i11 != 1380533830 && i11 != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int i12 = parsableByteArray.readInt();
        if (i12 == 1463899717) {
            return true;
        }
        Log.m2957e(TAG, "Unsupported form type: " + i12);
        return false;
    }

    public static WavFormat readFormat(ExtractorInput extractorInput) throws IOException {
        byte[] bArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        ChunkHeader chunkHeaderSkipToChunk = skipToChunk(WavUtil.FMT_FOURCC, extractorInput, parsableByteArray);
        Assertions.checkState(chunkHeaderSkipToChunk.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i11 = ((int) chunkHeaderSkipToChunk.size) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            extractorInput.peekFully(bArr, 0, i11);
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = bArr;
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new WavFormat(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2);
    }

    public static long readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        if (chunkHeaderPeek.f3545id != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long littleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) chunkHeaderPeek.size) + 8);
        return littleEndianLong;
    }

    private WavHeaderReader() {
    }

    private static ChunkHeader skipToChunk(int i11, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.f3545id != i11) {
            Log.m2961w(TAG, "Ignoring unknown WAV chunk: " + chunkHeaderPeek.f3545id);
            long j11 = chunkHeaderPeek.size;
            long j12 = 8 + j11;
            if (j11 % 2 != 0) {
                j12 = 9 + j11;
            }
            if (j12 <= 2147483647L) {
                extractorInput.skipFully((int) j12);
                chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + chunkHeaderPeek.f3545id);
            }
        }
        return chunkHeaderPeek;
    }

    public static Pair<Long, Long> skipToSampleData(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        ChunkHeader chunkHeaderSkipToChunk = skipToChunk(1684108385, extractorInput, new ParsableByteArray(8));
        extractorInput.skipFully(8);
        return Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(chunkHeaderSkipToChunk.size));
    }
}
