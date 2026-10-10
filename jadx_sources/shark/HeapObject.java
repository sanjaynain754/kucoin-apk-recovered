package shark;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.TypeCastException;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;
import shark.internal.AbstractC44475h;
import shark.internal.FieldValuesReader;

/* JADX INFO: compiled from: HeapObject.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00142\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0004\u0013\u0017 !¨\u0006\""}, m90084d2 = {"Lshark/HeapObject;", "", "<init>", "()V", "Lshark/l$b$c;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lshark/l$b$c;", "Lshark/i;", "e", "()Lshark/i;", "graph", "", "f", "()J", "objectId", "", "g", "()I", "recordSize", "Lshark/HeapObject$HeapClass;", "c", "()Lshark/HeapObject$HeapClass;", "asClass", "Lshark/HeapObject$HeapInstance;", "d", "()Lshark/HeapObject$HeapInstance;", "asInstance", "Companion", "HeapClass", "HeapInstance", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lshark/HeapObject$a;", "Lshark/HeapObject$b;", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public abstract class HeapObject {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Map<String, PrimitiveType> f98136a;

    /* JADX INFO: renamed from: b */
    public static final Set<String> f98137b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: HeapObject.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lshark/HeapObject$Companion;", "", "<init>", "()V", "", "className", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "", "Lshark/PrimitiveType;", "primitiveTypesByPrimitiveArrayClassName", "Ljava/util/Map;", "getPrimitiveTypesByPrimitiveArrayClassName$shark_graph", "()Ljava/util/Map;", "", "primitiveWrapperClassNames", "Ljava/util/Set;", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m98009a(String className) {
            int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) className, '.', 0, false, 6, (Object) null);
            if (iLastIndexOf$default == -1) {
                return className;
            }
            int i11 = iLastIndexOf$default + 1;
            if (className == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = className.substring(i11);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Map<String, PrimitiveType> getPrimitiveTypesByPrimitiveArrayClassName$shark_graph() {
            return HeapObject.f98136a;
        }
    }

    /* JADX INFO: compiled from: HeapObject.kt */
    @Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\rR\u0014\u00101\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u00100R\u0011\u00103\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0011\u00105\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\rR\u0014\u00106\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\rR\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b;\u00109R\u0013\u0010?\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8F¢\u0006\u0006\u001a\u0004\b@\u0010\u001eR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u001b8F¢\u0006\u0006\u001a\u0004\bC\u0010\u001eR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020B0\u001b8F¢\u0006\u0006\u001a\u0004\bE\u0010\u001e¨\u0006G"}, m90084d2 = {"Lshark/HeapObject$HeapClass;", "Lshark/HeapObject;", "Lshark/HprofHeapGraph;", "hprofGraph", "Lshark/internal/h$a;", "indexedObject", "", "objectId", "", "objectIndex", "<init>", "(Lshark/HprofHeapGraph;Lshark/internal/h$a;JI)V", "t", "()I", "Lshark/l$b$c$a;", "u", "()Lshark/l$b$c$a;", "", "Lshark/l$b$c$a$b;", "w", "()Ljava/util/List;", "Lshark/l$b$c$a$a;", "v", "fieldRecord", "", "r", "(Lshark/l$b$c$a$a;)Ljava/lang/String;", "Lkotlin/sequences/Sequence;", "Lshark/h;", "y", "()Lkotlin/sequences/Sequence;", "fieldName", "x", "(Ljava/lang/String;)Lshark/h;", "j", "toString", "()Ljava/lang/String;", "d", "Lshark/HprofHeapGraph;", "e", "Lshark/internal/h$a;", "f", "J", "()J", "g", "I", "getObjectIndex", "Lshark/i;", "()Lshark/i;", "graph", "p", "name", "n", "instanceByteSize", "recordSize", "", "m", "()Z", "hasReferenceInstanceFields", CmcdData.Factory.STREAMING_FORMAT_SS, "isArrayClass", "q", "()Lshark/HeapObject$HeapClass;", "superclass", "k", "classHierarchy", "Lshark/HeapObject$HeapInstance;", "o", "instances", CmcdData.Factory.STREAM_TYPE_LIVE, "directInstances", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class HeapClass extends HeapObject {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final HprofHeapGraph hprofGraph;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final AbstractC44475h.a indexedObject;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final long objectId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final int objectIndex;

        public HeapClass(@NotNull HprofHeapGraph hprofHeapGraph, @NotNull AbstractC44475h.a aVar, long j11, int i11) {
            super(null);
            this.hprofGraph = hprofHeapGraph;
            this.indexedObject = aVar;
            this.objectId = j11;
            this.objectIndex = i11;
        }

        @Override // shark.HeapObject
        @NotNull
        /* JADX INFO: renamed from: e */
        public InterfaceC44456i mo98005e() {
            return this.hprofGraph;
        }

        @Override // shark.HeapObject
        /* JADX INFO: renamed from: f, reason: from getter */
        public long getObjectId() {
            return this.objectId;
        }

        @Override // shark.HeapObject
        /* JADX INFO: renamed from: g */
        public int mo98007g() {
            return (int) this.indexedObject.getRecordSize();
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final Sequence<HeapClass> m98012k() {
            return SequencesKt.generateSequence(this, new Function1<HeapClass, HeapClass>() { // from class: shark.HeapObject$HeapClass$classHierarchy$1
                @Override // p852kotlin.jvm.functions.Function1
                @Nullable
                public final HeapObject.HeapClass invoke(@NotNull HeapObject.HeapClass heapClass) {
                    return heapClass.m98018q();
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final Sequence<HeapInstance> m98013l() {
            return SequencesKt.filter(this.hprofGraph.mo98074h(), new Function1<HeapInstance, Boolean>() { // from class: shark.HeapObject$HeapClass$directInstances$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(HeapObject.HeapInstance heapInstance) {
                    return Boolean.valueOf(invoke2(heapInstance));
                }

                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(@NotNull HeapObject.HeapInstance heapInstance) {
                    return heapInstance.getIndexedObject().getClassId() == this.this$0.getObjectId();
                }
            });
        }

        /* JADX INFO: renamed from: m */
        public final boolean m98014m() {
            return this.hprofGraph.m98081u(this.indexedObject);
        }

        /* JADX INFO: renamed from: n */
        public final int m98015n() {
            return this.indexedObject.getInstanceSize();
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final String m98017p() {
            return this.hprofGraph.m98083w(getObjectId());
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final HeapClass m98018q() {
            if (this.indexedObject.getSuperclassId() == 0) {
                return null;
            }
            HeapObject heapObjectMo98078l = this.hprofGraph.mo98078l(this.indexedObject.getSuperclassId());
            if (heapObjectMo98078l != null) {
                return (HeapClass) heapObjectMo98078l;
            }
            throw new TypeCastException("null cannot be cast to non-null type shark.HeapObject.HeapClass");
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final String m98019r(@NotNull AbstractC44490l.b.c.a.FieldRecord fieldRecord) {
            return this.hprofGraph.m98085z(getObjectId(), fieldRecord);
        }

        @NotNull
        public String toString() {
            return "class " + m98017p();
        }

        @Override // shark.HeapObject
        @NotNull
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public AbstractC44490l.b.c.a mo98008h() {
            return this.hprofGraph.m98062E(getObjectId(), this.indexedObject);
        }

        @NotNull
        /* JADX INFO: renamed from: v */
        public final List<AbstractC44490l.b.c.a.FieldRecord> m98023v() {
            return this.hprofGraph.m98080q(this.indexedObject);
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public final List<AbstractC44490l.b.c.a.StaticFieldRecord> m98024w() {
            return this.hprofGraph.m98082v(this.indexedObject);
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public final C44455h m98011j(@NotNull String fieldName) {
            return m98025x(fieldName);
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final Sequence<HeapInstance> m98016o() {
            if (!m98020s()) {
                return SequencesKt.filter(this.hprofGraph.mo98074h(), new Function1<HeapInstance, Boolean>() { // from class: shark.HeapObject$HeapClass$instances$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(HeapObject.HeapInstance heapInstance) {
                        return Boolean.valueOf(invoke2(heapInstance));
                    }

                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2(@NotNull HeapObject.HeapInstance heapInstance) {
                        return heapInstance.m98036r(this.this$0);
                    }
                });
            }
            return SequencesKt.emptySequence();
        }

        /* JADX INFO: renamed from: s */
        public final boolean m98020s() {
            return StringsKt.endsWith$default(m98017p(), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, (Object) null);
        }

        /* JADX INFO: renamed from: t */
        public final int m98021t() {
            int iIntValue;
            int i11 = 0;
            for (AbstractC44490l.b.c.a.FieldRecord c47020a : m98023v()) {
                if (c47020a.getType() == 2) {
                    iIntValue = this.hprofGraph.mo98075i();
                } else {
                    iIntValue = ((Number) MapsKt.getValue(PrimitiveType.INSTANCE.getByteSizeByHprofType(), Integer.valueOf(c47020a.getType()))).intValue();
                }
                i11 += iIntValue;
            }
            return i11;
        }

        @Nullable
        /* JADX INFO: renamed from: x */
        public final C44455h m98025x(@NotNull String fieldName) {
            for (AbstractC44490l.b.c.a.StaticFieldRecord c47021b : m98024w()) {
                if (Intrinsics.areEqual(this.hprofGraph.m98069R(getObjectId(), c47021b), fieldName)) {
                    return new C44455h(this, fieldName, new C44488j(this.hprofGraph, c47021b.getValue()));
                }
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: y */
        public final Sequence<C44455h> m98026y() {
            return SequencesKt.map(CollectionsKt.asSequence(m98024w()), new Function1<AbstractC44490l.b.c.a.StaticFieldRecord, C44455h>() { // from class: shark.HeapObject$HeapClass$readStaticFields$1
                {
                    super(1);
                }

                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final C44455h invoke(@NotNull AbstractC44490l.b.c.a.StaticFieldRecord staticFieldRecord) {
                    HeapObject.HeapClass heapClass = this.this$0;
                    return new C44455h(heapClass, heapClass.hprofGraph.m98069R(this.this$0.getObjectId(), staticFieldRecord), new C44488j(this.this$0.hprofGraph, staticFieldRecord.getValue()));
                }
            });
        }
    }

    /* JADX INFO: compiled from: HeapObject.kt */
    @Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0086\u0004¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\"\u0010\u001eJ\"\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b#\u0010!J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0$¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0011\u00109\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010;R\u0011\u0010>\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b=\u00106R\u0011\u0010@\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b?\u0010(R\u0011\u0010C\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bD\u00102R\u0014\u0010F\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00106¨\u0006G"}, m90084d2 = {"Lshark/HeapObject$HeapInstance;", "Lshark/HeapObject;", "Lshark/HprofHeapGraph;", "hprofGraph", "Lshark/internal/h$b;", "indexedObject", "", "objectId", "", "objectIndex", "<init>", "(Lshark/HprofHeapGraph;Lshark/internal/h$b;JI)V", "Lshark/l$b$c$b;", "x", "()Lshark/l$b$c$b;", "", "className", "", "q", "(Ljava/lang/String;)Z", "Lshark/HeapObject$HeapClass;", "expectedClass", "r", "(Lshark/HeapObject$HeapClass;)Z", "Lkotlin/reflect/KClass;", "", "declaringClass", "fieldName", "Lshark/h;", "v", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lshark/h;", "declaringClassName", "u", "(Ljava/lang/String;Ljava/lang/String;)Lshark/h;", "k", "j", "Lkotlin/sequences/Sequence;", "w", "()Lkotlin/sequences/Sequence;", "t", "()Ljava/lang/String;", "toString", "d", "Lshark/HprofHeapGraph;", "e", "Lshark/internal/h$b;", "m", "()Lshark/internal/h$b;", "f", "J", "()J", "g", "I", "getObjectIndex", "()I", CmcdData.Factory.STREAMING_FORMAT_SS, "()Z", "isPrimitiveWrapper", "Lshark/i;", "()Lshark/i;", "graph", CmcdData.Factory.STREAM_TYPE_LIVE, "byteSize", "p", "instanceClassName", "n", "()Lshark/HeapObject$HeapClass;", "instanceClass", "o", "instanceClassId", "recordSize", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class HeapInstance extends HeapObject {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final HprofHeapGraph hprofGraph;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final AbstractC44475h.b indexedObject;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final long objectId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final int objectIndex;

        public HeapInstance(@NotNull HprofHeapGraph hprofHeapGraph, @NotNull AbstractC44475h.b bVar, long j11, int i11) {
            super(null);
            this.hprofGraph = hprofHeapGraph;
            this.indexedObject = bVar;
            this.objectId = j11;
            this.objectIndex = i11;
        }

        @Override // shark.HeapObject
        @NotNull
        /* JADX INFO: renamed from: e */
        public InterfaceC44456i mo98005e() {
            return this.hprofGraph;
        }

        @Override // shark.HeapObject
        /* JADX INFO: renamed from: f, reason: from getter */
        public long getObjectId() {
            return this.objectId;
        }

        @Override // shark.HeapObject
        /* JADX INFO: renamed from: g */
        public int mo98007g() {
            return (int) this.indexedObject.getRecordSize();
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final AbstractC44475h.b getIndexedObject() {
            return this.indexedObject;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final HeapClass m98032n() {
            HeapObject heapObjectMo98078l = this.hprofGraph.mo98078l(this.indexedObject.getClassId());
            if (heapObjectMo98078l != null) {
                return (HeapClass) heapObjectMo98078l;
            }
            throw new TypeCastException("null cannot be cast to non-null type shark.HeapObject.HeapClass");
        }

        /* JADX INFO: renamed from: o */
        public final long m98033o() {
            return this.indexedObject.getClassId();
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final String m98034p() {
            return this.hprofGraph.m98083w(this.indexedObject.getClassId());
        }

        @NotNull
        public String toString() {
            return "instance @" + getObjectId() + " of " + m98034p();
        }

        @NotNull
        /* JADX INFO: renamed from: w */
        public final Sequence<C44455h> m98041w() {
            final Lazy lazy = LazyKt.lazy(new Function0<FieldValuesReader>() { // from class: shark.HeapObject$HeapInstance$readFields$fieldReader$2
                {
                    super(0);
                }

                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final FieldValuesReader invoke() {
                    return this.this$0.hprofGraph.m98084x(this.this$0.mo98008h());
                }
            });
            final KProperty kProperty = null;
            return SequencesKt.flatten(SequencesKt.map(m98032n().m98012k(), new Function1<HeapClass, Sequence<? extends C44455h>>() { // from class: shark.HeapObject$HeapInstance$readFields$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final Sequence<C44455h> invoke(@NotNull final HeapObject.HeapClass heapClass) {
                    return SequencesKt.map(CollectionsKt.asSequence(heapClass.m98023v()), new Function1<AbstractC44490l.b.c.a.FieldRecord, C44455h>() { // from class: shark.HeapObject$HeapInstance$readFields$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p852kotlin.jvm.functions.Function1
                        @NotNull
                        public final C44455h invoke(@NotNull AbstractC44490l.b.c.a.FieldRecord fieldRecord) {
                            String strM98085z = HeapObject$HeapInstance$readFields$1.this.this$0.hprofGraph.m98085z(heapClass.getObjectId(), fieldRecord);
                            HeapObject$HeapInstance$readFields$1 heapObject$HeapInstance$readFields$1 = HeapObject$HeapInstance$readFields$1.this;
                            Lazy lazy2 = lazy;
                            KProperty kProperty2 = kProperty;
                            return new C44455h(heapClass, strM98085z, new C44488j(HeapObject$HeapInstance$readFields$1.this.this$0.hprofGraph, ((FieldValuesReader) lazy2.getValue()).m98217j(fieldRecord)));
                        }
                    });
                }
            }));
        }

        @Override // shark.HeapObject
        @NotNull
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public AbstractC44490l.b.c.C47022b mo98008h() {
            return this.hprofGraph.m98063J(getObjectId(), this.indexedObject);
        }

        @Nullable
        /* JADX INFO: renamed from: j */
        public final C44455h m98028j(@NotNull String declaringClassName, @NotNull String fieldName) {
            return m98039u(declaringClassName, fieldName);
        }

        @Nullable
        /* JADX INFO: renamed from: k */
        public final C44455h m98029k(@NotNull KClass<? extends Object> declaringClass, @NotNull String fieldName) {
            return m98040v(declaringClass, fieldName);
        }

        /* JADX INFO: renamed from: l */
        public final int m98030l() {
            return m98032n().m98015n();
        }

        /* JADX INFO: renamed from: q */
        public final boolean m98035q(@NotNull String className) {
            Iterator<HeapClass> it = m98032n().m98012k().iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().m98017p(), className)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m98036r(@NotNull HeapClass expectedClass) {
            Iterator<HeapClass> it = m98032n().m98012k().iterator();
            while (it.hasNext()) {
                if (it.next().getObjectId() == expectedClass.getObjectId()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m98037s() {
            return HeapObject.f98137b.contains(m98034p());
        }

        @Nullable
        /* JADX INFO: renamed from: t */
        public final String m98038t() {
            Integer numM98433a;
            char[] cArrM98448a;
            int iIntValue;
            C44488j c44488jM98177c;
            C44488j c44488jM98177c2;
            Integer numM98433a2 = null;
            if (!Intrinsics.areEqual(m98034p(), "java.lang.String")) {
                return null;
            }
            C44455h c44455hM98028j = m98028j("java.lang.String", "count");
            if (c44455hM98028j != null && (c44488jM98177c2 = c44455hM98028j.getValue()) != null) {
                numM98433a = c44488jM98177c2.m98433a();
            } else {
                numM98433a = null;
            }
            if (numM98433a != null && numM98433a.intValue() == 0) {
                return "";
            }
            C44455h c44455hM98028j2 = m98028j("java.lang.String", "value");
            if (c44455hM98028j2 == null) {
                Intrinsics.throwNpe();
            }
            HeapObject heapObjectM98436d = c44455hM98028j2.getValue().m98436d();
            if (heapObjectM98436d == null) {
                Intrinsics.throwNpe();
            }
            AbstractC44490l.b.c cVarMo98008h = heapObjectM98436d.mo98008h();
            if (cVarMo98008h instanceof AbstractC44490l.b.c.d.C47025c) {
                C44455h c44455hM98028j3 = m98028j("java.lang.String", TypedValues.CycleType.S_WAVE_OFFSET);
                if (c44455hM98028j3 != null && (c44488jM98177c = c44455hM98028j3.getValue()) != null) {
                    numM98433a2 = c44488jM98177c.m98433a();
                }
                if (numM98433a != null && numM98433a2 != null) {
                    AbstractC44490l.b.c.d.C47025c c47025c = (AbstractC44490l.b.c.d.C47025c) cVarMo98008h;
                    if (numM98433a2.intValue() + numM98433a.intValue() > c47025c.getArray().length) {
                        iIntValue = c47025c.getArray().length;
                    } else {
                        iIntValue = numM98433a.intValue() + numM98433a2.intValue();
                    }
                    cArrM98448a = ArraysKt.copyOfRange(c47025c.getArray(), numM98433a2.intValue(), iIntValue);
                } else {
                    cArrM98448a = ((AbstractC44490l.b.c.d.C47025c) cVarMo98008h).getArray();
                }
                return new String(cArrM98448a);
            }
            if (cVarMo98008h instanceof AbstractC44490l.b.c.d.C47024b) {
                byte[] bArrM98447a = ((AbstractC44490l.b.c.d.C47024b) cVarMo98008h).getArray();
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(\"UTF-8\")");
                return new String(bArrM98447a, charsetForName);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("'value' field ");
            C44455h c44455hM98028j4 = m98028j("java.lang.String", "value");
            if (c44455hM98028j4 == null) {
                Intrinsics.throwNpe();
            }
            sb2.append(c44455hM98028j4.getValue());
            sb2.append(" was expected to be either");
            sb2.append(" a char or byte array in string instance with id ");
            sb2.append(getObjectId());
            throw new UnsupportedOperationException(sb2.toString());
        }

        @Nullable
        /* JADX INFO: renamed from: u */
        public final C44455h m98039u(@NotNull String declaringClassName, @NotNull String fieldName) {
            C44455h next;
            Iterator<C44455h> it = m98041w().iterator();
            while (it.hasNext()) {
                next = it.next();
                C44455h c44455h = next;
                if (Intrinsics.areEqual(c44455h.getDeclaringClass().m98017p(), declaringClassName) && Intrinsics.areEqual(c44455h.getName(), fieldName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        @Nullable
        /* JADX INFO: renamed from: v */
        public final C44455h m98040v(@NotNull KClass<? extends Object> declaringClass, @NotNull String fieldName) {
            String name = JvmClassMappingKt.getJavaClass((KClass) declaringClass).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "declaringClass.java.name");
            return m98039u(name, fieldName);
        }
    }

    /* JADX INFO: renamed from: shark.HeapObject$a */
    /* JADX INFO: compiled from: HeapObject.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010!R\u0011\u0010$\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\r¨\u0006&"}, m90084d2 = {"Lshark/HeapObject$a;", "Lshark/HeapObject;", "Lshark/HprofHeapGraph;", "hprofGraph", "Lshark/internal/h$c;", "indexedObject", "", "objectId", "", "objectIndex", "<init>", "(Lshark/HprofHeapGraph;Lshark/internal/h$c;JI)V", "j", "()I", "Lshark/l$b$c$c;", "k", "()Lshark/l$b$c$c;", "", "toString", "()Ljava/lang/String;", "d", "Lshark/HprofHeapGraph;", "e", "Lshark/internal/h$c;", "getIndexedObject$shark_graph", "()Lshark/internal/h$c;", "f", "J", "()J", "g", "I", "getObjectIndex", "Lshark/i;", "()Lshark/i;", "graph", "i", "arrayClassName", "recordSize", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44426a extends HeapObject {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final HprofHeapGraph hprofGraph;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final AbstractC44475h.c indexedObject;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final long objectId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final int objectIndex;

        public C44426a(@NotNull HprofHeapGraph hprofHeapGraph, @NotNull AbstractC44475h.c cVar, long j11, int i11) {
            super(null);
            this.hprofGraph = hprofHeapGraph;
            this.indexedObject = cVar;
            this.objectId = j11;
            this.objectIndex = i11;
        }

        @Override // shark.HeapObject
        @NotNull
        /* JADX INFO: renamed from: e */
        public InterfaceC44456i mo98005e() {
            return this.hprofGraph;
        }

        @Override // shark.HeapObject
        /* JADX INFO: renamed from: f, reason: from getter */
        public long getObjectId() {
            return this.objectId;
        }

        @Override // shark.HeapObject
        /* JADX INFO: renamed from: g */
        public int mo98007g() {
            return (int) this.indexedObject.getRecordSize();
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m98043i() {
            return this.hprofGraph.m98083w(this.indexedObject.getArrayClassId());
        }

        /* JADX INFO: renamed from: j */
        public final int m98044j() {
            return this.hprofGraph.m98064L(getObjectId(), this.indexedObject);
        }

        @Override // shark.HeapObject
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC44490l.b.c.C47023c mo98008h() {
            return this.hprofGraph.m98065M(getObjectId(), this.indexedObject);
        }

        @NotNull
        public String toString() {
            return "object array @" + getObjectId() + " of " + m98043i();
        }
    }

    /* JADX INFO: renamed from: shark.HeapObject$b */
    /* JADX INFO: compiled from: HeapObject.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0014\u0010'\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\r¨\u0006("}, m90084d2 = {"Lshark/HeapObject$b;", "Lshark/HeapObject;", "Lshark/HprofHeapGraph;", "hprofGraph", "Lshark/internal/h$d;", "indexedObject", "", "objectId", "", "objectIndex", "<init>", "(Lshark/HprofHeapGraph;Lshark/internal/h$d;JI)V", "k", "()I", "Lshark/l$b$c$d;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Lshark/l$b$c$d;", "", "toString", "()Ljava/lang/String;", "d", "Lshark/HprofHeapGraph;", "e", "Lshark/internal/h$d;", "f", "J", "()J", "g", "I", "getObjectIndex", "Lshark/i;", "()Lshark/i;", "graph", "Lshark/PrimitiveType;", "j", "()Lshark/PrimitiveType;", "primitiveType", "i", "arrayClassName", "recordSize", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44427b extends HeapObject {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final HprofHeapGraph hprofGraph;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final AbstractC44475h.d indexedObject;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final long objectId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final int objectIndex;

        public C44427b(@NotNull HprofHeapGraph hprofHeapGraph, @NotNull AbstractC44475h.d dVar, long j11, int i11) {
            super(null);
            this.hprofGraph = hprofHeapGraph;
            this.indexedObject = dVar;
            this.objectId = j11;
            this.objectIndex = i11;
        }

        @Override // shark.HeapObject
        @NotNull
        /* JADX INFO: renamed from: e */
        public InterfaceC44456i mo98005e() {
            return this.hprofGraph;
        }

        @Override // shark.HeapObject
        /* JADX INFO: renamed from: f, reason: from getter */
        public long getObjectId() {
            return this.objectId;
        }

        @Override // shark.HeapObject
        /* JADX INFO: renamed from: g */
        public int mo98007g() {
            return (int) this.indexedObject.getRecordSize();
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m98046i() {
            StringBuilder sb2 = new StringBuilder();
            String strName = m98047j().name();
            Locale locale = Locale.US;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
            if (strName == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strName.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return sb2.toString();
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final PrimitiveType m98047j() {
            return this.indexedObject.m98347c();
        }

        /* JADX INFO: renamed from: k */
        public final int m98048k() {
            return this.hprofGraph.m98067P(getObjectId(), this.indexedObject);
        }

        @Override // shark.HeapObject
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC44490l.b.c.d mo98008h() {
            return this.hprofGraph.m98068Q(getObjectId(), this.indexedObject);
        }

        @NotNull
        public String toString() {
            return "primitive array @" + getObjectId() + " of " + m98046i();
        }
    }

    public HeapObject() {
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract InterfaceC44456i mo98005e();

    /* JADX INFO: renamed from: f */
    public abstract long getObjectId();

    /* JADX INFO: renamed from: g */
    public abstract int mo98007g();

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract AbstractC44490l.b.c mo98008h();

    static {
        PrimitiveType[] primitiveTypeArrValues = PrimitiveType.values();
        ArrayList arrayList = new ArrayList(primitiveTypeArrValues.length);
        for (PrimitiveType primitiveType : primitiveTypeArrValues) {
            StringBuilder sb2 = new StringBuilder();
            String strName = primitiveType.name();
            Locale locale = Locale.US;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
            if (strName == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strName.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            arrayList.add(TuplesKt.m90091to(sb2.toString(), primitiveType));
        }
        f98136a = MapsKt.toMap(arrayList);
        String name = Boolean.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "Boolean::class.javaObjectType.name");
        String name2 = Character.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "Char::class.javaObjectType.name");
        String name3 = Float.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name3, "Float::class.javaObjectType.name");
        String name4 = Double.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name4, "Double::class.javaObjectType.name");
        String name5 = Byte.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name5, "Byte::class.javaObjectType.name");
        String name6 = Short.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name6, "Short::class.javaObjectType.name");
        String name7 = Integer.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name7, "Int::class.javaObjectType.name");
        String name8 = Long.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name8, "Long::class.javaObjectType.name");
        f98137b = SetsKt.setOf((Object[]) new String[]{name, name2, name3, name4, name5, name6, name7, name8});
    }

    public /* synthetic */ HeapObject(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final HeapClass m98003c() {
        if (this instanceof HeapClass) {
            return (HeapClass) this;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final HeapInstance m98004d() {
        if (this instanceof HeapInstance) {
            return (HeapInstance) this;
        }
        return null;
    }
}
