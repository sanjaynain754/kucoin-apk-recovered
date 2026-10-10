package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) throws IOException {
        int i11 = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i12 = this.scratch.getData()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while ((i12 & i13) == 0) {
            i13 >>= 1;
            i14++;
        }
        int i15 = i12 & (~i13);
        extractorInput.peekFully(this.scratch.getData(), 1, i14);
        while (i11 < i14) {
            i11++;
            i15 = (this.scratch.getData()[i11] & 255) + (i15 << 8);
        }
        this.peekLength += i14 + 1;
        return i15;
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        long length = extractorInput.getLength();
        long j11 = 1024;
        if (length != -1 && length <= 1024) {
            j11 = length;
        }
        int i11 = (int) j11;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i12 = this.peekLength + 1;
            this.peekLength = i12;
            if (i12 == i11) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.scratch.getData()[0] & 255));
        }
        long uint = readUint(extractorInput);
        long j12 = this.peekLength;
        if (uint != Long.MIN_VALUE && (length == -1 || j12 + uint < length)) {
            while (true) {
                int i13 = this.peekLength;
                long j13 = j12 + uint;
                if (i13 < j13) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long uint2 = readUint(extractorInput);
                    if (uint2 < 0 || uint2 > 2147483647L) {
                        return false;
                    }
                    if (uint2 != 0) {
                        int i14 = (int) uint2;
                        extractorInput.advancePeekPosition(i14);
                        this.peekLength += i14;
                    }
                } else if (i13 == j13) {
                    return true;
                }
            }
        }
        return false;
    }
}
