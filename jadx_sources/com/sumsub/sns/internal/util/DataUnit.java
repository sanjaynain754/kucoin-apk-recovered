package com.sumsub.sns.internal.util;

import androidx.media3.exoplayer.MediaPeriodQueue;
import com.tencent.bugly.proguard.C34000wc;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/internal/util/DataUnit;", "", "<init>", "(Ljava/lang/String;I)V", "KILOBYTES", "MEGABYTES", "GIGABYTES", "TERABYTES", "KIBIBYTES", "MEBIBYTES", "GIBIBYTES", "TEBIBYTES", "toBytes", "", "v", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class DataUnit {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataUnit[] $VALUES;
    public static final DataUnit KILOBYTES = new DataUnit() { // from class: com.sumsub.sns.internal.util.d
        @Override // com.sumsub.sns.internal.util.DataUnit
        public final long toBytes(long j11) {
            return j11 * ((long) 1000);
        }
    };
    public static final DataUnit MEGABYTES = new DataUnit() { // from class: com.sumsub.sns.internal.util.f
        @Override // com.sumsub.sns.internal.util.DataUnit
        public final long toBytes(long j11) {
            return j11 * ((long) 1000000);
        }
    };
    public static final DataUnit GIGABYTES = new DataUnit() { // from class: com.sumsub.sns.internal.util.b
        @Override // com.sumsub.sns.internal.util.DataUnit
        public final long toBytes(long j11) {
            return j11 * ((long) 1000000000);
        }
    };
    public static final DataUnit TERABYTES = new DataUnit() { // from class: com.sumsub.sns.internal.util.h
        @Override // com.sumsub.sns.internal.util.DataUnit
        public final long toBytes(long j11) {
            return j11 * MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        }
    };
    public static final DataUnit KIBIBYTES = new DataUnit() { // from class: com.sumsub.sns.internal.util.c
        @Override // com.sumsub.sns.internal.util.DataUnit
        public final long toBytes(long j11) {
            return j11 * ((long) 1024);
        }
    };
    public static final DataUnit MEBIBYTES = new DataUnit() { // from class: com.sumsub.sns.internal.util.e
        @Override // com.sumsub.sns.internal.util.DataUnit
        public final long toBytes(long j11) {
            return j11 * ((long) 1048576);
        }
    };
    public static final DataUnit GIBIBYTES = new DataUnit() { // from class: com.sumsub.sns.internal.util.a
        @Override // com.sumsub.sns.internal.util.DataUnit
        public final long toBytes(long j11) {
            return j11 * ((long) 1073741824);
        }
    };
    public static final DataUnit TEBIBYTES = new DataUnit() { // from class: com.sumsub.sns.internal.util.g
        @Override // com.sumsub.sns.internal.util.DataUnit
        public final long toBytes(long j11) {
            return j11 * C34000wc.f72426u;
        }
    };

    public /* synthetic */ DataUnit(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11);
    }

    private static final /* synthetic */ DataUnit[] $values() {
        return new DataUnit[]{KILOBYTES, MEGABYTES, GIGABYTES, TERABYTES, KIBIBYTES, MEBIBYTES, GIBIBYTES, TEBIBYTES};
    }

    static {
        DataUnit[] dataUnitArr$values = $values();
        $VALUES = dataUnitArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dataUnitArr$values);
    }

    private DataUnit(String str, int i11) {
        super(str, i11);
    }

    @NotNull
    public static EnumEntries<DataUnit> getEntries() {
        return $ENTRIES;
    }

    public static DataUnit valueOf(String str) {
        return (DataUnit) Enum.valueOf(DataUnit.class, str);
    }

    public static DataUnit[] values() {
        return (DataUnit[]) $VALUES.clone();
    }

    public long toBytes(long v11) {
        throw new AbstractMethodError();
    }
}
