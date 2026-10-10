package androidx.media3.extractor.p021ts;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class PsBinarySearchSeeker extends BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 1000;
    private static final long SEEK_TOLERANCE_US = 100000;
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;

    public static final class PsScrSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final ParsableByteArray packetBuffer;
        private final TimestampAdjuster scrTimestampAdjuster;

        private BinarySearchSeeker.TimestampSearchResult searchForScrValueInBuffer(ParsableByteArray parsableByteArray, long j11, long j12) {
            int position = -1;
            int position2 = -1;
            long j13 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 4) {
                if (PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition()) != 442) {
                    parsableByteArray.skipBytes(1);
                } else {
                    parsableByteArray.skipBytes(4);
                    long scrValueFromPack = PsDurationReader.readScrValueFromPack(parsableByteArray);
                    if (scrValueFromPack != C2711C.TIME_UNSET) {
                        long jAdjustTsTimestamp = this.scrTimestampAdjuster.adjustTsTimestamp(scrValueFromPack);
                        if (jAdjustTsTimestamp > j11) {
                            return j13 == C2711C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, j12) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j12 + ((long) position2));
                        }
                        if (100000 + jAdjustTsTimestamp > j11) {
                            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j12 + ((long) parsableByteArray.getPosition()));
                        }
                        position2 = parsableByteArray.getPosition();
                        j13 = jAdjustTsTimestamp;
                    }
                    skipToEndOfCurrentPack(parsableByteArray);
                    position = parsableByteArray.getPosition();
                }
            }
            return j13 != C2711C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j13, j12 + ((long) position)) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        private PsScrSeeker(TimestampAdjuster timestampAdjuster) {
            this.scrTimestampAdjuster = timestampAdjuster;
            this.packetBuffer = new ParsableByteArray();
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        }

        private static void skipToEndOfCurrentPack(ParsableByteArray parsableByteArray) {
            int iPeekIntAtPosition;
            int iLimit = parsableByteArray.limit();
            if (parsableByteArray.bytesLeft() < 10) {
                parsableByteArray.setPosition(iLimit);
                return;
            }
            parsableByteArray.skipBytes(9);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 7;
            if (parsableByteArray.bytesLeft() < unsignedByte) {
                parsableByteArray.setPosition(iLimit);
                return;
            }
            parsableByteArray.skipBytes(unsignedByte);
            if (parsableByteArray.bytesLeft() < 4) {
                parsableByteArray.setPosition(iLimit);
                return;
            }
            if (PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition()) == 443) {
                parsableByteArray.skipBytes(4);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                if (parsableByteArray.bytesLeft() < unsignedShort) {
                    parsableByteArray.setPosition(iLimit);
                    return;
                }
                parsableByteArray.skipBytes(unsignedShort);
            }
            while (parsableByteArray.bytesLeft() >= 4 && (iPeekIntAtPosition = PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition())) != 442 && iPeekIntAtPosition != 441 && (iPeekIntAtPosition >>> 8) == 1) {
                parsableByteArray.skipBytes(4);
                if (parsableByteArray.bytesLeft() < 2) {
                    parsableByteArray.setPosition(iLimit);
                    return;
                }
                parsableByteArray.setPosition(Math.min(parsableByteArray.limit(), parsableByteArray.getPosition() + parsableByteArray.readUnsignedShort()));
            }
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j11) throws IOException {
            long position = extractorInput.getPosition();
            int iMin = (int) Math.min(20000L, extractorInput.getLength() - position);
            this.packetBuffer.reset(iMin);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
            return searchForScrValueInBuffer(this.packetBuffer, j11, position);
        }
    }

    public PsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j11, long j12) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new PsScrSeeker(timestampAdjuster), j11, 0L, j11 + 1, 0L, j12, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int peekIntAtPosition(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }
}
