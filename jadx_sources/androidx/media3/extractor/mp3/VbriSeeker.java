package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: loaded from: classes34.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Nullable
    public static VbriSeeker create(long j11, long j12, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        char c11;
        int unsignedByte;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        parsableByteArray2.skipBytes(6);
        long jMax = j12 + ((long) header.frameSize) + ((long) parsableByteArray2.readInt());
        int i11 = parsableByteArray2.readInt();
        VbriSeeker vbriSeeker = null;
        if (i11 <= 0) {
            return null;
        }
        int i12 = header.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i11, ((long) (i12 >= 32000 ? 1152 : 576)) * 1000000, i12);
        int unsignedShort = parsableByteArray2.readUnsignedShort();
        int unsignedShort2 = parsableByteArray2.readUnsignedShort();
        int unsignedShort3 = parsableByteArray2.readUnsignedShort();
        parsableByteArray2.skipBytes(2);
        long j13 = j12 + ((long) header.frameSize);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i13 = 0;
        while (i13 < unsignedShort) {
            VbriSeeker vbriSeeker2 = vbriSeeker;
            int i14 = unsignedShort2;
            long j14 = j13;
            jArr[i13] = (((long) i13) * jScaleLargeTimestamp) / ((long) unsignedShort);
            jArr2[i13] = j14;
            if (unsignedShort3 != 1) {
                c11 = 2;
                if (unsignedShort3 == 2) {
                    unsignedByte = parsableByteArray2.readUnsignedShort();
                } else if (unsignedShort3 == 3) {
                    unsignedByte = parsableByteArray2.readUnsignedInt24();
                } else {
                    if (unsignedShort3 != 4) {
                        return vbriSeeker2;
                    }
                    unsignedByte = parsableByteArray2.readUnsignedIntToInt();
                }
            } else {
                c11 = 2;
                unsignedByte = parsableByteArray2.readUnsignedByte();
            }
            long j15 = unsignedByte;
            unsignedShort2 = i14;
            i13++;
            unsignedShort = unsignedShort;
            j13 = j14 + (j15 * ((long) unsignedShort2));
            parsableByteArray2 = parsableByteArray;
            vbriSeeker = vbriSeeker2;
        }
        long j16 = j13;
        if (j11 != -1 && j11 != jMax) {
            Log.m2961w(TAG, "VBRI data size mismatch: " + j11 + ", " + jMax);
        }
        if (jMax != j16) {
            Log.m2961w(TAG, "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j16 + "\nSeeking will be inaccurate.");
            jMax = Math.max(jMax, j16);
        }
        return new VbriSeeker(jArr, jArr2, jScaleLargeTimestamp, jMax, header.bitrate);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j11, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs >= j11 || iBinarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i11 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i11], this.positions[i11]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j11) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j11, true, true)];
    }

    private VbriSeeker(long[] jArr, long[] jArr2, long j11, long j12, int i11) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j11;
        this.dataEndPosition = j12;
        this.bitrate = i11;
    }
}
