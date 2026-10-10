package shark;

import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PrimitiveType.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m90084d2 = {"Lshark/PrimitiveType;", "", "hprofType", "", "byteSize", "(Ljava/lang/String;III)V", "getByteSize", "()I", "getHprofType", "BOOLEAN", "CHAR", "FLOAT", "DOUBLE", "BYTE", SharedPositionInfo.SIDE_SHORT, "INT", SharedPositionInfo.SIDE_LONG, "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public enum PrimitiveType {
    BOOLEAN(4, 1),
    CHAR(5, 2),
    FLOAT(6, 4),
    DOUBLE(7, 8),
    BYTE(8, 1),
    SHORT(9, 2),
    INT(10, 4),
    LONG(11, 8);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int REFERENCE_HPROF_TYPE = 2;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<Integer, Integer> f98234c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<Integer, PrimitiveType> f98235d;
    private final int byteSize;
    private final int hprofType;

    /* JADX INFO: compiled from: PrimitiveType.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, m90084d2 = {"Lshark/PrimitiveType$Companion;", "", "()V", "REFERENCE_HPROF_TYPE", "", "byteSizeByHprofType", "", "getByteSizeByHprofType", "()Ljava/util/Map;", "primitiveTypeByHprofType", "Lshark/PrimitiveType;", "getPrimitiveTypeByHprofType", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Map<Integer, Integer> getByteSizeByHprofType() {
            return PrimitiveType.f98234c;
        }

        @NotNull
        public final Map<Integer, PrimitiveType> getPrimitiveTypeByHprofType() {
            return PrimitiveType.f98235d;
        }
    }

    static {
        PrimitiveType[] primitiveTypeArrValues = values();
        ArrayList arrayList = new ArrayList(primitiveTypeArrValues.length);
        for (PrimitiveType primitiveType : primitiveTypeArrValues) {
            arrayList.add(TuplesKt.m90091to(Integer.valueOf(primitiveType.hprofType), Integer.valueOf(primitiveType.byteSize)));
        }
        f98234c = MapsKt.toMap(arrayList);
        PrimitiveType[] primitiveTypeArrValues2 = values();
        ArrayList arrayList2 = new ArrayList(primitiveTypeArrValues2.length);
        for (PrimitiveType primitiveType2 : primitiveTypeArrValues2) {
            arrayList2.add(TuplesKt.m90091to(Integer.valueOf(primitiveType2.hprofType), primitiveType2));
        }
        f98235d = MapsKt.toMap(arrayList2);
    }

    public final int getByteSize() {
        return this.byteSize;
    }

    public final int getHprofType() {
        return this.hprofType;
    }

    PrimitiveType(int i11, int i12) {
        this.hprofType = i11;
        this.byteSize = i12;
    }
}
