package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import shark.PrimitiveType;

/* JADX INFO: renamed from: shark.internal.h */
/* JADX INFO: compiled from: IndexedObject.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\b\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m90084d2 = {"Lshark/internal/h;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()J", ViewProps.POSITION, "b", "recordSize", "c", "d", "Lshark/internal/h$a;", "Lshark/internal/h$b;", "Lshark/internal/h$c;", "Lshark/internal/h$d;", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public abstract class AbstractC44475h {

    /* JADX INFO: renamed from: shark.internal.h$a */
    /* JADX INFO: compiled from: IndexedObject.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lshark/internal/h$a;", "Lshark/internal/h;", "", ViewProps.POSITION, "superclassId", "", "instanceSize", "recordSize", "fieldsIndex", "<init>", "(JJIJI)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "()J", "b", "e", "c", "I", "d", "()I", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class a extends AbstractC44475h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long position;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long superclassId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int instanceSize;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final long recordSize;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final int fieldsIndex;

        public a(long j11, long j12, int i11, long j13, int i12) {
            super(null);
            this.position = j11;
            this.superclassId = j12;
            this.instanceSize = i11;
            this.recordSize = j13;
            this.fieldsIndex = i12;
        }

        @Override // shark.internal.AbstractC44475h
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getPosition() {
            return this.position;
        }

        @Override // shark.internal.AbstractC44475h
        /* JADX INFO: renamed from: b, reason: from getter */
        public long getRecordSize() {
            return this.recordSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getFieldsIndex() {
            return this.fieldsIndex;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getInstanceSize() {
            return this.instanceSize;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getSuperclassId() {
            return this.superclassId;
        }
    }

    /* JADX INFO: renamed from: shark.internal.h$b */
    /* JADX INFO: compiled from: IndexedObject.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\n¨\u0006\r"}, m90084d2 = {"Lshark/internal/h$b;", "Lshark/internal/h;", "", ViewProps.POSITION, "classId", "recordSize", "<init>", "(JJJ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "()J", "b", "c", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class b extends AbstractC44475h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long position;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long classId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long recordSize;

        public b(long j11, long j12, long j13) {
            super(null);
            this.position = j11;
            this.classId = j12;
            this.recordSize = j13;
        }

        @Override // shark.internal.AbstractC44475h
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getPosition() {
            return this.position;
        }

        @Override // shark.internal.AbstractC44475h
        /* JADX INFO: renamed from: b, reason: from getter */
        public long getRecordSize() {
            return this.recordSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getClassId() {
            return this.classId;
        }
    }

    /* JADX INFO: renamed from: shark.internal.h$c */
    /* JADX INFO: compiled from: IndexedObject.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\n¨\u0006\r"}, m90084d2 = {"Lshark/internal/h$c;", "Lshark/internal/h;", "", ViewProps.POSITION, "arrayClassId", "recordSize", "<init>", "(JJJ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "()J", "b", "c", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class c extends AbstractC44475h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long position;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long arrayClassId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long recordSize;

        public c(long j11, long j12, long j13) {
            super(null);
            this.position = j11;
            this.arrayClassId = j12;
            this.recordSize = j13;
        }

        @Override // shark.internal.AbstractC44475h
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getPosition() {
            return this.position;
        }

        @Override // shark.internal.AbstractC44475h
        /* JADX INFO: renamed from: b, reason: from getter */
        public long getRecordSize() {
            return this.recordSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getArrayClassId() {
            return this.arrayClassId;
        }
    }

    /* JADX INFO: renamed from: shark.internal.h$d */
    /* JADX INFO: compiled from: IndexedObject.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lshark/internal/h$d;", "Lshark/internal/h;", "", ViewProps.POSITION, "Lshark/PrimitiveType;", "primitiveType", "recordSize", "<init>", "(JLshark/PrimitiveType;J)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "B", "primitiveTypeOrdinal", "b", "J", "()J", "c", "()Lshark/PrimitiveType;", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class d extends AbstractC44475h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final byte primitiveTypeOrdinal;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long position;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long recordSize;

        public d(long j11, @NotNull PrimitiveType primitiveType, long j12) {
            super(null);
            this.position = j11;
            this.recordSize = j12;
            this.primitiveTypeOrdinal = (byte) primitiveType.ordinal();
        }

        @Override // shark.internal.AbstractC44475h
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getPosition() {
            return this.position;
        }

        @Override // shark.internal.AbstractC44475h
        /* JADX INFO: renamed from: b, reason: from getter */
        public long getRecordSize() {
            return this.recordSize;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final PrimitiveType m98347c() {
            return PrimitiveType.values()[this.primitiveTypeOrdinal];
        }
    }

    public AbstractC44475h() {
    }

    /* JADX INFO: renamed from: a */
    public abstract long getPosition();

    /* JADX INFO: renamed from: b */
    public abstract long getRecordSize();

    public /* synthetic */ AbstractC44475h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
