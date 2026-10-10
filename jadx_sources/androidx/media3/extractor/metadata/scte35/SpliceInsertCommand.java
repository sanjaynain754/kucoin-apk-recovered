package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i11) {
            return new SpliceInsertCommand[i11];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        private ComponentSplice(int i11, long j11, long j12) {
            this.componentTag = i11;
            this.componentSplicePts = j11;
            this.componentSplicePlaybackPositionUs = j12;
        }

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }
    }

    private SpliceInsertCommand(long j11, boolean z11, boolean z12, boolean z13, boolean z14, long j12, long j13, List<ComponentSplice> list, boolean z15, long j14, int i11, int i12, int i13) {
        this.spliceEventId = j11;
        this.spliceEventCancelIndicator = z11;
        this.outOfNetworkIndicator = z12;
        this.programSpliceFlag = z13;
        this.spliceImmediateFlag = z14;
        this.programSplicePts = j12;
        this.programSplicePlaybackPositionUs = j13;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z15;
        this.breakDurationUs = j14;
        this.uniqueProgramId = i11;
        this.availNum = i12;
        this.availsExpected = i13;
    }

    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j11, TimestampAdjuster timestampAdjuster) {
        List list;
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int unsignedByte;
        int unsignedByte2;
        boolean z15;
        long unsignedInt = parsableByteArray.readUnsignedInt();
        boolean z16 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long unsignedInt2 = C2711C.TIME_UNSET;
        if (z16) {
            list = list2;
            j12 = -9223372036854775807L;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            i11 = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            boolean z17 = (unsignedByte3 & 128) != 0;
            boolean z18 = (unsignedByte3 & 64) != 0;
            boolean z19 = (unsignedByte3 & 32) != 0;
            boolean z21 = (unsignedByte3 & 16) != 0;
            long spliceTime = (!z18 || z21) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(parsableByteArray, j11);
            if (!z18) {
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                int i12 = 0;
                while (i12 < unsignedByte4) {
                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                    long spliceTime2 = !z21 ? TimeSignalCommand.parseSpliceTime(parsableByteArray, j11) : -9223372036854775807L;
                    arrayList.add(new ComponentSplice(unsignedByte5, spliceTime2, timestampAdjuster.adjustTsTimestamp(spliceTime2)));
                    i12++;
                    unsignedByte4 = unsignedByte4;
                }
                list2 = arrayList;
            }
            if (z19) {
                long unsignedByte6 = parsableByteArray.readUnsignedByte();
                boolean z22 = (128 & unsignedByte6) != 0;
                unsignedInt2 = ((((unsignedByte6 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z15 = z22;
            } else {
                z15 = false;
            }
            int unsignedShort = parsableByteArray.readUnsignedShort();
            long j13 = spliceTime;
            j12 = unsignedInt2;
            unsignedInt2 = j13;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            i11 = unsignedShort;
            z14 = z15;
            z11 = z17;
            z12 = z18;
            list = list2;
            z13 = z21;
        }
        return new SpliceInsertCommand(unsignedInt, z16, z11, z12, z13, unsignedInt2, timestampAdjuster.adjustTsTimestamp(unsignedInt2), list, z14, j12, i11, unsignedByte, unsignedByte2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.programSplicePts + ", programSplicePlaybackPositionUs= " + this.programSplicePlaybackPositionUs + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            this.componentSpliceList.get(i12).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
