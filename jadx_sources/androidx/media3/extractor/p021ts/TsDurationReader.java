package androidx.media3.extractor.p021ts;

import androidx.media3.common.C2711C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.PositionHolder;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
final class TsDurationReader {
    private static final String TAG = "TsDurationReader";
    private boolean isDurationRead;
    private boolean isFirstPcrValueRead;
    private boolean isLastPcrValueRead;
    private final int timestampSearchBytes;
    private final TimestampAdjuster pcrTimestampAdjuster = new TimestampAdjuster(0);
    private long firstPcrValue = C2711C.TIME_UNSET;
    private long lastPcrValue = C2711C.TIME_UNSET;
    private long durationUs = C2711C.TIME_UNSET;
    private final ParsableByteArray packetBuffer = new ParsableByteArray();

    private int finishReadDuration(ExtractorInput extractorInput) {
        this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        this.isDurationRead = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    private int readFirstPcrValue(ExtractorInput extractorInput, PositionHolder positionHolder, int i11) throws IOException {
        int iMin = (int) Math.min(this.timestampSearchBytes, extractorInput.getLength());
        long j11 = 0;
        if (extractorInput.getPosition() != j11) {
            positionHolder.position = j11;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.firstPcrValue = readFirstPcrValueFromBuffer(this.packetBuffer, i11);
        this.isFirstPcrValueRead = true;
        return 0;
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public TimestampAdjuster getPcrTimestampAdjuster() {
        return this.pcrTimestampAdjuster;
    }

    public boolean isDurationReadFinished() {
        return this.isDurationRead;
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder, int i11) throws IOException {
        if (i11 <= 0) {
            return finishReadDuration(extractorInput);
        }
        if (!this.isLastPcrValueRead) {
            return readLastPcrValue(extractorInput, positionHolder, i11);
        }
        if (this.lastPcrValue == C2711C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        if (!this.isFirstPcrValueRead) {
            return readFirstPcrValue(extractorInput, positionHolder, i11);
        }
        long j11 = this.firstPcrValue;
        if (j11 == C2711C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        this.durationUs = this.pcrTimestampAdjuster.adjustTsTimestampGreaterThanPreviousTimestamp(this.lastPcrValue) - this.pcrTimestampAdjuster.adjustTsTimestamp(j11);
        return finishReadDuration(extractorInput);
    }

    public TsDurationReader(int i11) {
        this.timestampSearchBytes = i11;
    }

    private long readFirstPcrValueFromBuffer(ParsableByteArray parsableByteArray, int i11) {
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit; position++) {
            if (parsableByteArray.getData()[position] == 71) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, position, i11);
                if (pcrFromPacket != C2711C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return C2711C.TIME_UNSET;
    }

    private int readLastPcrValue(ExtractorInput extractorInput, PositionHolder positionHolder, int i11) throws IOException {
        long length = extractorInput.getLength();
        int iMin = (int) Math.min(this.timestampSearchBytes, length);
        long j11 = length - ((long) iMin);
        if (extractorInput.getPosition() != j11) {
            positionHolder.position = j11;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.lastPcrValue = readLastPcrValueFromBuffer(this.packetBuffer, i11);
        this.isLastPcrValueRead = true;
        return 0;
    }

    private long readLastPcrValueFromBuffer(ParsableByteArray parsableByteArray, int i11) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        for (int i12 = iLimit - 188; i12 >= position; i12--) {
            if (TsUtil.isStartOfTsPacket(parsableByteArray.getData(), position, iLimit, i12)) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, i12, i11);
                if (pcrFromPacket != C2711C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return C2711C.TIME_UNSET;
    }
}
