package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
final class OggPacket {
    private boolean populated;
    private int segmentCount;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private final ParsableByteArray packetArray = new ParsableByteArray(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int currentSegmentIndex = -1;

    private int calculatePacketSize(int i11) {
        int i12;
        int i13 = 0;
        this.segmentCount = 0;
        do {
            int i14 = this.segmentCount;
            int i15 = i11 + i14;
            OggPageHeader oggPageHeader = this.pageHeader;
            if (i15 >= oggPageHeader.pageSegmentCount) {
                break;
            }
            int[] iArr = oggPageHeader.laces;
            this.segmentCount = i14 + 1;
            i12 = iArr[i14 + i11];
            i13 += i12;
        } while (i12 == 255);
        return i13;
    }

    public boolean populate(ExtractorInput extractorInput) throws IOException {
        int i11;
        Assertions.checkState(extractorInput != null);
        if (this.populated) {
            this.populated = false;
            this.packetArray.reset(0);
        }
        while (!this.populated) {
            if (this.currentSegmentIndex < 0) {
                if (!this.pageHeader.skipToNextPage(extractorInput) || !this.pageHeader.populate(extractorInput, true)) {
                    return false;
                }
                OggPageHeader oggPageHeader = this.pageHeader;
                int iCalculatePacketSize = oggPageHeader.headerSize;
                if ((oggPageHeader.type & 1) == 1 && this.packetArray.limit() == 0) {
                    iCalculatePacketSize += calculatePacketSize(0);
                    i11 = this.segmentCount;
                } else {
                    i11 = 0;
                }
                if (!ExtractorUtil.skipFullyQuietly(extractorInput, iCalculatePacketSize)) {
                    return false;
                }
                this.currentSegmentIndex = i11;
            }
            int iCalculatePacketSize2 = calculatePacketSize(this.currentSegmentIndex);
            int i12 = this.currentSegmentIndex + this.segmentCount;
            if (iCalculatePacketSize2 > 0) {
                ParsableByteArray parsableByteArray = this.packetArray;
                parsableByteArray.ensureCapacity(parsableByteArray.limit() + iCalculatePacketSize2);
                if (!ExtractorUtil.readFullyQuietly(extractorInput, this.packetArray.getData(), this.packetArray.limit(), iCalculatePacketSize2)) {
                    return false;
                }
                ParsableByteArray parsableByteArray2 = this.packetArray;
                parsableByteArray2.setLimit(parsableByteArray2.limit() + iCalculatePacketSize2);
                this.populated = this.pageHeader.laces[i12 + (-1)] != 255;
            }
            if (i12 == this.pageHeader.pageSegmentCount) {
                i12 = -1;
            }
            this.currentSegmentIndex = i12;
        }
        return true;
    }

    public OggPageHeader getPageHeader() {
        return this.pageHeader;
    }

    public ParsableByteArray getPayload() {
        return this.packetArray;
    }

    public void reset() {
        this.pageHeader.reset();
        this.packetArray.reset(0);
        this.currentSegmentIndex = -1;
        this.populated = false;
    }

    public void trimPayload() {
        if (this.packetArray.getData().length == 65025) {
            return;
        }
        ParsableByteArray parsableByteArray = this.packetArray;
        parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.packetArray.limit())), this.packetArray.limit());
    }
}
