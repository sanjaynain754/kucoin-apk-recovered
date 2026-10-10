package androidx.media3.extractor.p021ts;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class TsBinarySearchSeeker extends BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 940;
    private static final long SEEK_TOLERANCE_US = 100000;

    public static final class TsPcrSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final ParsableByteArray packetBuffer = new ParsableByteArray();
        private final int pcrPid;
        private final TimestampAdjuster pcrTimestampAdjuster;
        private final int timestampSearchBytes;

        private BinarySearchSeeker.TimestampSearchResult searchForPcrValueInBuffer(ParsableByteArray parsableByteArray, long j11, long j12) {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            int iLimit = parsableByteArray.limit();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = TsUtil.findSyncBytePosition(parsableByteArray.getData(), parsableByteArray.getPosition(), iLimit)) + TsExtractor.TS_PACKET_SIZE) <= iLimit) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, iFindSyncBytePosition, this.pcrPid);
                if (pcrFromPacket != C2711C.TIME_UNSET) {
                    long jAdjustTsTimestamp = this.pcrTimestampAdjuster.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > j11) {
                        return j15 == C2711C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, j12) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j12 + j14);
                    }
                    if (100000 + jAdjustTsTimestamp > j11) {
                        return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j12 + ((long) iFindSyncBytePosition));
                    }
                    j14 = iFindSyncBytePosition;
                    j15 = jAdjustTsTimestamp;
                }
                parsableByteArray.setPosition(iFindSyncBytePosition2);
                j13 = iFindSyncBytePosition2;
            }
            return j15 != C2711C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j15, j12 + j13) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        }

        public TsPcrSeeker(int i11, TimestampAdjuster timestampAdjuster, int i12) {
            this.pcrPid = i11;
            this.pcrTimestampAdjuster = timestampAdjuster;
            this.timestampSearchBytes = i12;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j11) throws IOException {
            long position = extractorInput.getPosition();
            int iMin = (int) Math.min(this.timestampSearchBytes, extractorInput.getLength() - position);
            this.packetBuffer.reset(iMin);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
            return searchForPcrValueInBuffer(this.packetBuffer, j11, position);
        }
    }

    public TsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j11, long j12, int i11, int i12) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new TsPcrSeeker(i11, timestampAdjuster, i12), j11, 0L, j11 + 1, 0L, j12, 188L, MINIMUM_SEARCH_RANGE_BYTES);
    }
}
