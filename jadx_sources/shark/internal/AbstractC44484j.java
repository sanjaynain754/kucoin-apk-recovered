package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import shark.AbstractC44451d;
import shark.C44494p;
import shark.LeakTraceReference;

/* JADX INFO: renamed from: shark.internal.j */
/* JADX INFO: compiled from: ReferencePathNode.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\b\u0005\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m90084d2 = {"Lshark/internal/j;", "", "<init>", "()V", "", "b", "()J", "objectId", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "c", "Lshark/internal/j$c;", "Lshark/internal/j$a;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public abstract class AbstractC44484j {

    /* JADX INFO: renamed from: shark.internal.j$a */
    /* JADX INFO: compiled from: ReferencePathNode.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0006\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, m90084d2 = {"Lshark/internal/j$a;", "Lshark/internal/j;", "<init>", "()V", "d", "()Lshark/internal/j;", "parent", "Lshark/LeakTraceReference$ReferenceType;", "f", "()Lshark/LeakTraceReference$ReferenceType;", "refFromParentType", "", "e", "()Ljava/lang/String;", "refFromParentName", "", "c", "()J", "owningClassId", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lshark/internal/j$a$a;", "Lshark/internal/j$a$b;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static abstract class a extends AbstractC44484j {

        /* JADX INFO: renamed from: shark.internal.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ReferencePathNode.kt */
        @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0010\u0010\u001fR\u001a\u0010\r\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006 "}, m90084d2 = {"Lshark/internal/j$a$a;", "Lshark/internal/j$a;", "Lshark/internal/j$b;", "", "objectId", "Lshark/internal/j;", "parent", "Lshark/LeakTraceReference$ReferenceType;", "refFromParentType", "", "refFromParentName", "Lshark/p;", "matcher", "owningClassId", "<init>", "(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;Lshark/p;J)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "b", "()J", "Lshark/internal/j;", "d", "()Lshark/internal/j;", "c", "Lshark/LeakTraceReference$ReferenceType;", "f", "()Lshark/LeakTraceReference$ReferenceType;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lshark/p;", "()Lshark/p;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C47018a extends a implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long objectId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final AbstractC44484j parent;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public final LeakTraceReference.ReferenceType refFromParentType;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final String refFromParentName;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @NotNull
            public final C44494p matcher;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            public final long owningClassId;

            public /* synthetic */ C47018a(long j11, AbstractC44484j abstractC44484j, LeakTraceReference.ReferenceType referenceType, String str, C44494p c44494p, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, abstractC44484j, referenceType, str, c44494p, (i11 & 32) != 0 ? 0L : j12);
            }

            public C47018a(long j11, @NotNull AbstractC44484j abstractC44484j, @NotNull LeakTraceReference.ReferenceType referenceType, @NotNull String str, @NotNull C44494p c44494p, long j12) {
                super(null);
                this.objectId = j11;
                this.parent = abstractC44484j;
                this.refFromParentType = referenceType;
                this.refFromParentName = str;
                this.matcher = c44494p;
                this.owningClassId = j12;
            }

            @Override // shark.internal.AbstractC44484j.b
            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public C44494p getMatcher() {
                return this.matcher;
            }

            @Override // shark.internal.AbstractC44484j
            /* JADX INFO: renamed from: b, reason: from getter */
            public long getObjectId() {
                return this.objectId;
            }

            @Override // shark.internal.AbstractC44484j.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public long getOwningClassId() {
                return this.owningClassId;
            }

            @Override // shark.internal.AbstractC44484j.a
            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public AbstractC44484j getParent() {
                return this.parent;
            }

            @Override // shark.internal.AbstractC44484j.a
            @NotNull
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getRefFromParentName() {
                return this.refFromParentName;
            }

            @Override // shark.internal.AbstractC44484j.a
            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public LeakTraceReference.ReferenceType getRefFromParentType() {
                return this.refFromParentType;
            }
        }

        /* JADX INFO: renamed from: shark.internal.j$a$b */
        /* JADX INFO: compiled from: ReferencePathNode.kt */
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lshark/internal/j$a$b;", "Lshark/internal/j$a;", "", "objectId", "Lshark/internal/j;", "parent", "Lshark/LeakTraceReference$ReferenceType;", "refFromParentType", "", "refFromParentName", "owningClassId", "<init>", "(JLshark/internal/j;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;J)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "b", "()J", "Lshark/internal/j;", "d", "()Lshark/internal/j;", "c", "Lshark/LeakTraceReference$ReferenceType;", "f", "()Lshark/LeakTraceReference$ReferenceType;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long objectId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final AbstractC44484j parent;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public final LeakTraceReference.ReferenceType refFromParentType;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final String refFromParentName;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            public final long owningClassId;

            public /* synthetic */ b(long j11, AbstractC44484j abstractC44484j, LeakTraceReference.ReferenceType referenceType, String str, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, abstractC44484j, referenceType, str, (i11 & 16) != 0 ? 0L : j12);
            }

            public b(long j11, @NotNull AbstractC44484j abstractC44484j, @NotNull LeakTraceReference.ReferenceType referenceType, @NotNull String str, long j12) {
                super(null);
                this.objectId = j11;
                this.parent = abstractC44484j;
                this.refFromParentType = referenceType;
                this.refFromParentName = str;
                this.owningClassId = j12;
            }

            @Override // shark.internal.AbstractC44484j
            /* JADX INFO: renamed from: b, reason: from getter */
            public long getObjectId() {
                return this.objectId;
            }

            @Override // shark.internal.AbstractC44484j.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public long getOwningClassId() {
                return this.owningClassId;
            }

            @Override // shark.internal.AbstractC44484j.a
            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public AbstractC44484j getParent() {
                return this.parent;
            }

            @Override // shark.internal.AbstractC44484j.a
            @NotNull
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getRefFromParentName() {
                return this.refFromParentName;
            }

            @Override // shark.internal.AbstractC44484j.a
            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public LeakTraceReference.ReferenceType getRefFromParentType() {
                return this.refFromParentType;
            }
        }

        public a() {
            super(null);
        }

        /* JADX INFO: renamed from: c */
        public abstract long getOwningClassId();

        @NotNull
        /* JADX INFO: renamed from: d */
        public abstract AbstractC44484j getParent();

        @NotNull
        /* JADX INFO: renamed from: e */
        public abstract String getRefFromParentName();

        @NotNull
        /* JADX INFO: renamed from: f */
        public abstract LeakTraceReference.ReferenceType getRefFromParentType();

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: shark.internal.j$b */
    /* JADX INFO: compiled from: ReferencePathNode.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"Lshark/internal/j$b;", "", "Lshark/p;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lshark/p;", "matcher", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public interface b {
        @NotNull
        /* JADX INFO: renamed from: a */
        C44494p getMatcher();
    }

    /* JADX INFO: renamed from: shark.internal.j$c */
    /* JADX INFO: compiled from: ReferencePathNode.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m90084d2 = {"Lshark/internal/j$c;", "Lshark/internal/j;", "<init>", "()V", "Lshark/d;", "c", "()Lshark/d;", "gcRoot", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lshark/internal/j$c$a;", "Lshark/internal/j$c$b;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static abstract class c extends AbstractC44484j {

        /* JADX INFO: renamed from: shark.internal.j$c$a */
        /* JADX INFO: compiled from: ReferencePathNode.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lshark/internal/j$c$a;", "Lshark/internal/j$c;", "Lshark/internal/j$b;", "", "objectId", "Lshark/d;", "gcRoot", "Lshark/p;", "matcher", "<init>", "(JLshark/d;Lshark/p;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "b", "()J", "Lshark/d;", "c", "()Lshark/d;", "Lshark/p;", "()Lshark/p;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class a extends c implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long objectId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final AbstractC44451d gcRoot;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public final C44494p matcher;

            public a(long j11, @NotNull AbstractC44451d abstractC44451d, @NotNull C44494p c44494p) {
                super(null);
                this.objectId = j11;
                this.gcRoot = abstractC44451d;
                this.matcher = c44494p;
            }

            @Override // shark.internal.AbstractC44484j.b
            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public C44494p getMatcher() {
                return this.matcher;
            }

            @Override // shark.internal.AbstractC44484j
            /* JADX INFO: renamed from: b, reason: from getter */
            public long getObjectId() {
                return this.objectId;
            }

            @Override // shark.internal.AbstractC44484j.c
            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public AbstractC44451d getGcRoot() {
                return this.gcRoot;
            }
        }

        /* JADX INFO: renamed from: shark.internal.j$c$b */
        /* JADX INFO: compiled from: ReferencePathNode.kt */
        @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lshark/internal/j$c$b;", "Lshark/internal/j$c;", "", "objectId", "Lshark/d;", "gcRoot", "<init>", "(JLshark/d;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "b", "()J", "Lshark/d;", "c", "()Lshark/d;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long objectId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final AbstractC44451d gcRoot;

            public b(long j11, @NotNull AbstractC44451d abstractC44451d) {
                super(null);
                this.objectId = j11;
                this.gcRoot = abstractC44451d;
            }

            @Override // shark.internal.AbstractC44484j
            /* JADX INFO: renamed from: b, reason: from getter */
            public long getObjectId() {
                return this.objectId;
            }

            @Override // shark.internal.AbstractC44484j.c
            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public AbstractC44451d getGcRoot() {
                return this.gcRoot;
            }
        }

        public c() {
            super(null);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public abstract AbstractC44451d getGcRoot();

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractC44484j() {
    }

    /* JADX INFO: renamed from: b */
    public abstract long getObjectId();

    public /* synthetic */ AbstractC44484j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
