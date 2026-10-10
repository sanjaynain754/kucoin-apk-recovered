package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i11) {
            return new SpliceScheduleCommand[i11];
        }
    };
    public final List<Event> events;

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int i11, long j11) {
            this.componentTag = i11;
            this.utcSpliceTime = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }
    }

    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j11, boolean z11, boolean z12, boolean z13, List<ComponentSplice> list, long j12, boolean z14, long j13, int i11, int i12, int i13) {
            this.spliceEventId = j11;
            this.spliceEventCancelIndicator = z11;
            this.outOfNetworkIndicator = z12;
            this.programSpliceFlag = z13;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j12;
            this.autoReturn = z14;
            this.breakDurationUs = j13;
            this.uniqueProgramId = i11;
            this.availNum = i12;
            this.availsExpected = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                this.componentSpliceList.get(i11).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j11;
            boolean z13;
            long j12;
            int i11;
            int i12;
            int unsignedByte;
            boolean z14;
            boolean z15;
            boolean z16;
            long unsignedInt;
            boolean z17;
            long unsignedInt2;
            boolean z18;
            long unsignedInt3 = parsableByteArray.readUnsignedInt();
            boolean z19 = true;
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                z19 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z19) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                if ((unsignedByte2 & 128) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((unsignedByte2 & 64) != 0) {
                    z15 = z19;
                } else {
                    z15 = false;
                }
                if ((unsignedByte2 & 32) != 0) {
                    z16 = z19;
                } else {
                    z16 = false;
                }
                if (z15) {
                    unsignedInt = parsableByteArray.readUnsignedInt();
                } else {
                    unsignedInt = C2711C.TIME_UNSET;
                }
                if (!z15) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte3);
                    int i13 = 0;
                    while (i13 < unsignedByte3) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                        i13++;
                        unsignedByte3 = unsignedByte3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long unsignedByte4 = parsableByteArray.readUnsignedByte();
                    if ((128 & unsignedByte4) != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    unsignedInt2 = ((((unsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z17 = z18;
                } else {
                    z17 = false;
                    unsignedInt2 = C2711C.TIME_UNSET;
                }
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                boolean z21 = z14;
                z13 = z17;
                z11 = z21;
                unsignedByte = parsableByteArray.readUnsignedByte();
                long j13 = unsignedInt;
                i11 = unsignedShort;
                i12 = unsignedByte5;
                long j14 = unsignedInt2;
                arrayList = arrayList2;
                z12 = z15;
                j11 = j13;
                j12 = j14;
            } else {
                arrayList = arrayList2;
                z11 = false;
                z12 = false;
                j11 = C2711C.TIME_UNSET;
                z13 = false;
                j12 = C2711C.TIME_UNSET;
                i11 = 0;
                i12 = 0;
                unsignedByte = 0;
            }
            return new Event(unsignedInt3, z19, z11, z12, arrayList, j11, z13, j12, i11, i12, unsignedByte);
        }

        private Event(Parcel parcel) {
            this.spliceEventId = parcel.readLong();
            this.spliceEventCancelIndicator = parcel.readByte() == 1;
            this.outOfNetworkIndicator = parcel.readByte() == 1;
            this.programSpliceFlag = parcel.readByte() == 1;
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = Collections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            this.events.get(i12).writeToParcel(parcel);
        }
    }

    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i11 = 0; i11 < unsignedByte; i11++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Event.createFromParcel(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }
}
