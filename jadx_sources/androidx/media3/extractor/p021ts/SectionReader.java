package androidx.media3.extractor.p021ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SectionReader implements TsPayloadReader {
    private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
    private static final int MAX_SECTION_LENGTH = 4098;
    private static final int SECTION_HEADER_LENGTH = 3;
    private int bytesRead;
    private final SectionPayloadReader reader;
    private final ParsableByteArray sectionData = new ParsableByteArray(32);
    private boolean sectionSyntaxIndicator;
    private int totalSectionLength;
    private boolean waitingForPayloadStart;

    @Override // androidx.media3.extractor.p021ts.TsPayloadReader
    public void consume(ParsableByteArray parsableByteArray, int i11) {
        int position;
        boolean z11 = (i11 & 1) != 0;
        if (z11) {
            position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
        } else {
            position = -1;
        }
        if (this.waitingForPayloadStart) {
            if (!z11) {
                return;
            }
            this.waitingForPayloadStart = false;
            parsableByteArray.setPosition(position);
            this.bytesRead = 0;
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i12 = this.bytesRead;
            if (i12 < 3) {
                if (i12 == 0) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.setPosition(parsableByteArray.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.waitingForPayloadStart = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.bytesLeft(), 3 - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.getData(), this.bytesRead, iMin);
                int i13 = this.bytesRead + iMin;
                this.bytesRead = i13;
                if (i13 == 3) {
                    this.sectionData.setPosition(0);
                    this.sectionData.setLimit(3);
                    this.sectionData.skipBytes(1);
                    int unsignedByte2 = this.sectionData.readUnsignedByte();
                    int unsignedByte3 = this.sectionData.readUnsignedByte();
                    this.sectionSyntaxIndicator = (unsignedByte2 & 128) != 0;
                    this.totalSectionLength = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = this.sectionData.capacity();
                    int i14 = this.totalSectionLength;
                    if (iCapacity < i14) {
                        this.sectionData.ensureCapacity(Math.min(4098, Math.max(i14, this.sectionData.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.bytesLeft(), this.totalSectionLength - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.getData(), this.bytesRead, iMin2);
                int i15 = this.bytesRead + iMin2;
                this.bytesRead = i15;
                int i16 = this.totalSectionLength;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.sectionSyntaxIndicator) {
                        this.sectionData.setLimit(i16);
                    } else {
                        if (Util.crc32(this.sectionData.getData(), 0, this.totalSectionLength, -1) != 0) {
                            this.waitingForPayloadStart = true;
                            return;
                        }
                        this.sectionData.setLimit(this.totalSectionLength - 4);
                    }
                    this.sectionData.setPosition(0);
                    this.reader.consume(this.sectionData);
                    this.bytesRead = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.p021ts.TsPayloadReader
    public void seek() {
        this.waitingForPayloadStart = true;
    }

    @Override // androidx.media3.extractor.p021ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.reader.init(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.waitingForPayloadStart = true;
    }

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.reader = sectionPayloadReader;
    }
}
