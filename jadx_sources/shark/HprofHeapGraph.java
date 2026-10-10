package shark;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ReplaceWith;
import p852kotlin.TypeCastException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.reflect.KClass;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;
import shark.internal.AbstractC44475h;
import shark.internal.FieldValuesReader;
import shark.internal.HprofInMemoryIndex;
import shark.internal.LruCache;
import shark.internal.hppc.IntObjectPair;
import shark.internal.hppc.LongObjectPair;

/* JADX INFO: compiled from: HprofHeapGraph.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 d2\u00020\u0001:\u0001uB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJB\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\b\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0+2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b0\u0010.J\u0017\u00101\u001a\u00020#2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020/H\u0000¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020,H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\fH\u0000¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020A2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020@H\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020@H\u0000¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020G2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020FH\u0000¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020FH\u0000¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\u00020L2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020)H\u0000¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u0002092\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020OH\u0000¢\u0006\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010S\u001a\u0004\bT\u0010UR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010eR\u0014\u0010i\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010eR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020j0+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00180n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020r0n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010p¨\u0006v"}, m90084d2 = {"Lshark/HprofHeapGraph;", "Lshark/a;", "Lshark/HprofHeader;", "header", "Lshark/RandomAccessHprofReader;", "reader", "Lshark/internal/HprofInMemoryIndex;", "index", "<init>", "(Lshark/HprofHeader;Lshark/RandomAccessHprofReader;Lshark/internal/HprofInMemoryIndex;)V", "Lshark/l$b$c;", ExifInterface.GPS_DIRECTION_TRUE, "", "objectId", "Lshark/internal/h;", "indexedObject", "Lkotlin/Function1;", "Lshark/HprofRecordReader;", "Lkotlin/ExtensionFunctionType;", "readBlock", "O", "(JLshark/internal/h;Lkotlin/jvm/functions/Function1;)Lshark/l$b$c;", "", "objectIndex", "Lshark/HeapObject;", ExifInterface.LATITUDE_SOUTH, "(ILshark/internal/h;J)Lshark/HeapObject;", CmcdData.Factory.STREAM_TYPE_LIVE, "(J)Lshark/HeapObject;", "j", "", "className", "Lshark/HeapObject$HeapClass;", "b", "(Ljava/lang/String;)Lshark/HeapObject$HeapClass;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)Z", "", "close", "()V", "Lshark/internal/h$a;", "indexedClass", "", "Lshark/l$b$c$a$b;", "v", "(Lshark/internal/h$a;)Ljava/util/List;", "Lshark/l$b$c$a$a;", "q", "u", "(Lshark/internal/h$a;)Z", "classId", "fieldRecord", "z", "(JLshark/l$b$c$a$a;)Ljava/lang/String;", "R", "(JLshark/l$b$c$a$b;)Ljava/lang/String;", "Lshark/l$b$c$b;", "record", "Lshark/internal/FieldValuesReader;", "x", "(Lshark/l$b$c$b;)Lshark/internal/FieldValuesReader;", "w", "(J)Ljava/lang/String;", "Lshark/internal/h$c;", "Lshark/l$b$c$c;", "M", "(JLshark/internal/h$c;)Lshark/l$b$c$c;", "L", "(JLshark/internal/h$c;)I", "Lshark/internal/h$d;", "Lshark/l$b$c$d;", "Q", "(JLshark/internal/h$d;)Lshark/l$b$c$d;", "P", "(JLshark/internal/h$d;)I", "Lshark/l$b$c$a;", ExifInterface.LONGITUDE_EAST, "(JLshark/internal/h$a;)Lshark/l$b$c$a;", "Lshark/internal/h$b;", "J", "(JLshark/internal/h$b;)Lshark/l$b$c$b;", "Lshark/e;", "Lshark/e;", "getContext", "()Lshark/e;", "context", "Lshark/internal/LruCache;", "c", "Lshark/internal/LruCache;", "objectCache", "d", "Lshark/HeapObject$HeapClass;", "javaLangObjectClass", "e", "Lshark/HprofHeader;", "f", "Lshark/RandomAccessHprofReader;", "g", "Lshark/internal/HprofInMemoryIndex;", "i", "()I", "identifierByteSize", "C", "classCount", "instanceCount", "Lshark/d;", "m", "()Ljava/util/List;", "gcRoots", "Lkotlin/sequences/Sequence;", "k", "()Lkotlin/sequences/Sequence;", "objects", "Lshark/HeapObject$HeapInstance;", CmcdData.Factory.STREAMING_FORMAT_HLS, "instances", "Companion", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class HprofHeapGraph implements InterfaceC44448a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C44452e context = new C44452e();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final LruCache<Long, AbstractC44490l.b.c> objectCache = new LruCache<>(f98167h);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final HeapObject.HeapClass javaLangObjectClass = mo98072b("java.lang.Object");

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final HprofHeader header;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final RandomAccessHprofReader reader;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final HprofInMemoryIndex index;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static int f98167h = 3000;

    /* JADX INFO: compiled from: HprofHeapGraph.kt */
    @Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000b\u001a\u00020\n*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m90084d2 = {"Lshark/HprofHeapGraph$Companion;", "", "<init>", "()V", "Ljava/io/File;", "Lshark/r;", "proguardMapping", "", "Lshark/HprofRecordTag;", "indexedGcRootTypes", "Lshark/a;", "openHeapGraph", "(Ljava/io/File;Lshark/r;Ljava/util/Set;)Lshark/a;", "Lshark/b;", "(Lshark/b;Lshark/r;Ljava/util/Set;)Lshark/a;", "Lshark/Hprof;", "hprof", "Lkotlin/reflect/KClass;", "Lshark/d;", "Lshark/i;", "indexHprof", "(Lshark/Hprof;Lshark/r;Ljava/util/Set;)Lshark/i;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/Set;", "", "INTERNAL_LRU_CACHE_SIZE", "I", "getINTERNAL_LRU_CACHE_SIZE", "()I", "setINTERNAL_LRU_CACHE_SIZE", "(I)V", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC44448a openHeapGraph$default(Companion companion, File file, C44496r c44496r, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c44496r = null;
            }
            if ((i11 & 2) != 0) {
                set = HprofIndex.INSTANCE.defaultIndexedGcRootTags();
                Intrinsics.checkExpressionValueIsNotNull(set, "HprofIndex.defaultIndexedGcRootTags()");
            }
            return companion.openHeapGraph(file, c44496r, (Set<? extends HprofRecordTag>) set);
        }

        @NotNull
        public final InterfaceC44448a openHeapGraph(@NotNull File file, @Nullable C44496r c44496r, @NotNull Set<? extends HprofRecordTag> set) {
            return openHeapGraph(new C44450c(file), c44496r, set);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC44456i indexHprof$default(Companion companion, Hprof hprof, C44496r c44496r, Set set, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                c44496r = null;
            }
            if ((i11 & 4) != 0) {
                set = companion.m98086a();
            }
            return companion.indexHprof(hprof, c44496r, set);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC44448a openHeapGraph$default(Companion companion, InterfaceC44449b interfaceC44449b, C44496r c44496r, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c44496r = null;
            }
            if ((i11 & 2) != 0) {
                set = HprofIndex.INSTANCE.defaultIndexedGcRootTags();
                Intrinsics.checkExpressionValueIsNotNull(set, "HprofIndex.defaultIndexedGcRootTags()");
            }
            return companion.openHeapGraph(interfaceC44449b, c44496r, (Set<? extends HprofRecordTag>) set);
        }

        /* JADX INFO: renamed from: a */
        public final Set<KClass<? extends AbstractC44451d>> m98086a() {
            return SetsKt.setOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(AbstractC44451d.e.class), Reflection.getOrCreateKotlinClass(AbstractC44451d.d.class), Reflection.getOrCreateKotlinClass(AbstractC44451d.f.class), Reflection.getOrCreateKotlinClass(AbstractC44451d.h.class), Reflection.getOrCreateKotlinClass(AbstractC44451d.i.class), Reflection.getOrCreateKotlinClass(AbstractC44451d.k.class), Reflection.getOrCreateKotlinClass(AbstractC44451d.l.class), Reflection.getOrCreateKotlinClass(AbstractC44451d.m.class), Reflection.getOrCreateKotlinClass(AbstractC44451d.g.class)});
        }

        @Deprecated(message = "Replaced by HprofIndex.indexRecordsOf().openHeapGraph() or File.openHeapGraph()", replaceWith = @ReplaceWith(expression = "HprofIndex.indexRecordsOf(hprof, proguardMapping, indexedGcRootTypes).openHeapGraph()", imports = {}))
        @NotNull
        public final InterfaceC44456i indexHprof(@NotNull Hprof hprof, @Nullable C44496r proguardMapping, @NotNull Set<? extends KClass<? extends AbstractC44451d>> indexedGcRootTypes) {
            HprofRecordTag hprofRecordTag;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indexedGcRootTypes, 10));
            Iterator<T> it = indexedGcRootTypes.iterator();
            while (it.hasNext()) {
                KClass kClass = (KClass) it.next();
                if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.n.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_UNKNOWN;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.e.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_JNI_GLOBAL;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.f.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_JNI_LOCAL;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.d.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_JAVA_FRAME;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.i.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_NATIVE_STACK;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.k.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_STICKY_CLASS;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.l.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_THREAD_BLOCK;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.h.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_MONITOR_USED;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.m.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_THREAD_OBJECT;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.c.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_INTERNED_STRING;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.b.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_FINALIZING;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.a.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_DEBUGGER;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.j.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_REFERENCE_CLEANUP;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.p.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_VM_INTERNAL;
                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.g.class))) {
                    hprofRecordTag = HprofRecordTag.ROOT_JNI_MONITOR;
                } else {
                    if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(AbstractC44451d.o.class))) {
                        throw new IllegalStateException(("Unknown root " + kClass).toString());
                    }
                    hprofRecordTag = HprofRecordTag.ROOT_UNREACHABLE;
                }
                arrayList.add(hprofRecordTag);
            }
            InterfaceC44448a interfaceC44448aM98087a = HprofIndex.INSTANCE.indexRecordsOf(new C44450c(hprof.getFile()), hprof.getHeader(), proguardMapping, CollectionsKt.toSet(arrayList)).m98087a();
            hprof.m98050a(interfaceC44448aM98087a);
            return interfaceC44448aM98087a;
        }

        @NotNull
        public final InterfaceC44448a openHeapGraph(@NotNull InterfaceC44449b interfaceC44449b, @Nullable C44496r c44496r, @NotNull Set<? extends HprofRecordTag> set) {
            BufferedSource bufferedSourceMo98161b = interfaceC44449b.mo98161b();
            try {
                HprofHeader headerOf = HprofHeader.INSTANCE.parseHeaderOf(bufferedSourceMo98161b);
                CloseableKt.closeFinally(bufferedSourceMo98161b, null);
                return HprofIndex.INSTANCE.indexRecordsOf(interfaceC44449b, headerOf, c44496r, set).m98087a();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedSourceMo98161b, th2);
                    throw th3;
                }
            }
        }

        public final int getINTERNAL_LRU_CACHE_SIZE() {
            return HprofHeapGraph.f98167h;
        }

        public final void setINTERNAL_LRU_CACHE_SIZE(int i11) {
            HprofHeapGraph.f98167h = i11;
        }
    }

    /* JADX INFO: renamed from: C */
    public int m98061C() {
        return this.index.m98227j();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final AbstractC44490l.b.c.a m98062E(long objectId, @NotNull AbstractC44475h.a indexedObject) {
        return (AbstractC44490l.b.c.a) m98066O(objectId, indexedObject, new Function1<HprofRecordReader, AbstractC44490l.b.c.a>() { // from class: shark.HprofHeapGraph$readClassDumpRecord$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final AbstractC44490l.b.c.a invoke(@NotNull HprofRecordReader hprofRecordReader) {
                return hprofRecordReader.m98126h();
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final AbstractC44490l.b.c.C47022b m98063J(long objectId, @NotNull AbstractC44475h.b indexedObject) {
        return (AbstractC44490l.b.c.C47022b) m98066O(objectId, indexedObject, new Function1<HprofRecordReader, AbstractC44490l.b.c.C47022b>() { // from class: shark.HprofHeapGraph$readInstanceDumpRecord$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final AbstractC44490l.b.c.C47022b invoke(@NotNull HprofRecordReader hprofRecordReader) {
                return hprofRecordReader.m98135q();
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final int m98064L(long objectId, @NotNull AbstractC44475h.c indexedObject) {
        int iIntValue;
        int iMo98075i;
        AbstractC44490l.b.c.C47023c c47023c = (AbstractC44490l.b.c.C47023c) this.objectCache.m98251b(Long.valueOf(objectId));
        if (c47023c != null) {
            iIntValue = c47023c.getElementIds().length;
            iMo98075i = mo98075i();
        } else {
            long position = indexedObject.getCom.facebook.react.uimanager.ViewProps.POSITION java.lang.String() + ((long) mo98075i());
            PrimitiveType primitiveType = PrimitiveType.INT;
            iIntValue = ((Number) this.reader.m98154a(position + ((long) primitiveType.getByteSize()), primitiveType.getByteSize(), new Function1<HprofRecordReader, Integer>() { // from class: shark.HprofHeapGraph$readObjectArrayByteSize$thinRecordSize$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(HprofRecordReader hprofRecordReader) {
                    return Integer.valueOf(invoke2(hprofRecordReader));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(@NotNull HprofRecordReader hprofRecordReader) {
                    return hprofRecordReader.m98136r();
                }
            })).intValue();
            iMo98075i = mo98075i();
        }
        return iIntValue * iMo98075i;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final AbstractC44490l.b.c.C47023c m98065M(long objectId, @NotNull AbstractC44475h.c indexedObject) {
        return (AbstractC44490l.b.c.C47023c) m98066O(objectId, indexedObject, new Function1<HprofRecordReader, AbstractC44490l.b.c.C47023c>() { // from class: shark.HprofHeapGraph$readObjectArrayDumpRecord$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final AbstractC44490l.b.c.C47023c invoke(@NotNull HprofRecordReader hprofRecordReader) {
                return hprofRecordReader.m98090C();
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: O */
    public final <T extends AbstractC44490l.b.c> T m98066O(long objectId, AbstractC44475h indexedObject, final Function1<? super HprofRecordReader, ? extends T> readBlock) {
        T t11 = (T) this.objectCache.m98251b(Long.valueOf(objectId));
        if (t11 != null) {
            return t11;
        }
        T t12 = (T) this.reader.m98154a(indexedObject.getCom.facebook.react.uimanager.ViewProps.POSITION java.lang.String(), indexedObject.getRecordSize(), new Function1<HprofRecordReader, T>() { // from class: shark.HprofHeapGraph$readObjectRecord$1
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Lshark/HprofRecordReader;)TT; */
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final AbstractC44490l.b.c invoke(@NotNull HprofRecordReader hprofRecordReader) {
                return (AbstractC44490l.b.c) readBlock.invoke(hprofRecordReader);
            }
        });
        this.objectCache.m98254e(Long.valueOf(objectId), t12);
        return t12;
    }

    /* JADX INFO: renamed from: P */
    public final int m98067P(long objectId, @NotNull AbstractC44475h.d indexedObject) {
        int iIntValue;
        int byteSize;
        AbstractC44490l.b.c.d dVar = (AbstractC44490l.b.c.d) this.objectCache.m98251b(Long.valueOf(objectId));
        if (dVar == null) {
            long position = indexedObject.getCom.facebook.react.uimanager.ViewProps.POSITION java.lang.String() + ((long) mo98075i());
            PrimitiveType primitiveType = PrimitiveType.INT;
            iIntValue = ((Number) this.reader.m98154a(position + ((long) primitiveType.getByteSize()), primitiveType.getByteSize(), new Function1<HprofRecordReader, Integer>() { // from class: shark.HprofHeapGraph$readPrimitiveArrayByteSize$size$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(HprofRecordReader hprofRecordReader) {
                    return Integer.valueOf(invoke2(hprofRecordReader));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(@NotNull HprofRecordReader hprofRecordReader) {
                    return hprofRecordReader.m98136r();
                }
            })).intValue();
            byteSize = indexedObject.m98347c().getByteSize();
        } else if (dVar instanceof AbstractC44490l.b.c.d.a) {
            iIntValue = ((AbstractC44490l.b.c.d.a) dVar).getArray().length;
            byteSize = PrimitiveType.BOOLEAN.getByteSize();
        } else if (dVar instanceof AbstractC44490l.b.c.d.C47025c) {
            iIntValue = ((AbstractC44490l.b.c.d.C47025c) dVar).getArray().length;
            byteSize = PrimitiveType.CHAR.getByteSize();
        } else if (dVar instanceof AbstractC44490l.b.c.d.e) {
            iIntValue = ((AbstractC44490l.b.c.d.e) dVar).getArray().length;
            byteSize = PrimitiveType.FLOAT.getByteSize();
        } else if (dVar instanceof AbstractC44490l.b.c.d.C47026d) {
            iIntValue = ((AbstractC44490l.b.c.d.C47026d) dVar).getArray().length;
            byteSize = PrimitiveType.DOUBLE.getByteSize();
        } else if (dVar instanceof AbstractC44490l.b.c.d.C47024b) {
            iIntValue = ((AbstractC44490l.b.c.d.C47024b) dVar).getArray().length;
            byteSize = PrimitiveType.BYTE.getByteSize();
        } else if (dVar instanceof AbstractC44490l.b.c.d.h) {
            iIntValue = ((AbstractC44490l.b.c.d.h) dVar).getArray().length;
            byteSize = PrimitiveType.SHORT.getByteSize();
        } else if (dVar instanceof AbstractC44490l.b.c.d.f) {
            iIntValue = ((AbstractC44490l.b.c.d.f) dVar).getArray().length;
            byteSize = PrimitiveType.INT.getByteSize();
        } else {
            if (!(dVar instanceof AbstractC44490l.b.c.d.g)) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((AbstractC44490l.b.c.d.g) dVar).getArray().length;
            byteSize = PrimitiveType.LONG.getByteSize();
        }
        return iIntValue * byteSize;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final AbstractC44490l.b.c.d m98068Q(long objectId, @NotNull AbstractC44475h.d indexedObject) {
        return (AbstractC44490l.b.c.d) m98066O(objectId, indexedObject, new Function1<HprofRecordReader, AbstractC44490l.b.c.d>() { // from class: shark.HprofHeapGraph$readPrimitiveArrayDumpRecord$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final AbstractC44490l.b.c.d invoke(@NotNull HprofRecordReader hprofRecordReader) {
                return hprofRecordReader.m98091D();
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final String m98069R(long classId, @NotNull AbstractC44490l.b.c.a.StaticFieldRecord fieldRecord) {
        return this.index.m98225h(classId, fieldRecord.getNameStringId());
    }

    /* JADX INFO: renamed from: S */
    public final HeapObject m98070S(int objectIndex, AbstractC44475h indexedObject, long objectId) {
        if (indexedObject instanceof AbstractC44475h.a) {
            return new HeapObject.HeapClass(this, (AbstractC44475h.a) indexedObject, objectId, objectIndex);
        }
        if (indexedObject instanceof AbstractC44475h.b) {
            return new HeapObject.HeapInstance(this, (AbstractC44475h.b) indexedObject, objectId, objectIndex);
        }
        if (indexedObject instanceof AbstractC44475h.c) {
            return new HeapObject.C44426a(this, (AbstractC44475h.c) indexedObject, objectId, objectIndex);
        }
        if (indexedObject instanceof AbstractC44475h.d) {
            return new HeapObject.C44427b(this, (AbstractC44475h.d) indexedObject, objectId, objectIndex);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // shark.InterfaceC44456i
    /* JADX INFO: renamed from: a */
    public boolean mo98071a(long objectId) {
        return this.index.m98237t(objectId);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00ab, please report this as an issue */
    @Override // shark.InterfaceC44456i
    @Nullable
    /* JADX INFO: renamed from: b */
    public HeapObject.HeapClass mo98072b(@NotNull String className) {
        String str;
        String string;
        Long lM98223f;
        HeapObject heapObjectMo98078l;
        Object obj;
        if (this.header.getVersion() != HprofVersion.ANDROID) {
            str = className;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '[', 0, false, 6, (Object) null);
            if (iIndexOf$default != -1) {
                int length = (str.length() - iIndexOf$default) / 2;
                String strSubstring = str.substring(0, iIndexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(StringsKt.repeat("[", length));
                switch (strSubstring) {
                    case "double":
                        obj = 'D';
                        break;
                    case "int":
                        obj = 'I';
                        break;
                    case "byte":
                        obj = 'B';
                        break;
                    case "char":
                        obj = 'C';
                        break;
                    case "long":
                        obj = 'J';
                        break;
                    case "float":
                        obj = 'F';
                        break;
                    case "short":
                        obj = 'S';
                        break;
                    default:
                        obj = 'L' + strSubstring + ';';
                        break;
                }
                sb2.append(obj);
                string = sb2.toString();
            }
            lM98223f = this.index.m98223f(string);
            if (lM98223f == null) {
                return null;
            }
            heapObjectMo98078l = mo98078l(lM98223f.longValue());
            if (heapObjectMo98078l != null) {
                return (HeapObject.HeapClass) heapObjectMo98078l;
            }
            throw new TypeCastException("null cannot be cast to non-null type shark.HeapObject.HeapClass");
        }
        str = className;
        string = str;
        lM98223f = this.index.m98223f(string);
        if (lM98223f == null) {
            return null;
        }
        heapObjectMo98078l = mo98078l(lM98223f.longValue());
        if (heapObjectMo98078l != null) {
            return (HeapObject.HeapClass) heapObjectMo98078l;
        }
        throw new TypeCastException("null cannot be cast to non-null type shark.HeapObject.HeapClass");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.reader.close();
    }

    @Override // shark.InterfaceC44456i
    /* JADX INFO: renamed from: g */
    public int mo98073g() {
        return this.index.m98229l();
    }

    @Override // shark.InterfaceC44456i
    @NotNull
    public C44452e getContext() {
        return this.context;
    }

    @Override // shark.InterfaceC44456i
    @NotNull
    /* JADX INFO: renamed from: h */
    public Sequence<HeapObject.HeapInstance> mo98074h() {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = m98061C();
        return SequencesKt.map(this.index.m98232o(), new Function1<LongObjectPair<? extends AbstractC44475h.b>, HeapObject.HeapInstance>() { // from class: shark.HprofHeapGraph$instances$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ HeapObject.HeapInstance invoke(LongObjectPair<? extends AbstractC44475h.b> longObjectPair) {
                return invoke2((LongObjectPair<AbstractC44475h.b>) longObjectPair);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final HeapObject.HeapInstance invoke2(@NotNull LongObjectPair<AbstractC44475h.b> longObjectPair) {
                long first = longObjectPair.getFirst();
                AbstractC44475h.b bVarM98388b = longObjectPair.m98388b();
                HprofHeapGraph hprofHeapGraph = this.this$0;
                Ref.IntRef intRef2 = intRef;
                int i11 = intRef2.element;
                intRef2.element = i11 + 1;
                return new HeapObject.HeapInstance(hprofHeapGraph, bVarM98388b, first, i11);
            }
        });
    }

    @Override // shark.InterfaceC44456i
    /* JADX INFO: renamed from: i */
    public int mo98075i() {
        return this.header.getIdentifierByteSize();
    }

    @Override // shark.InterfaceC44456i
    @Nullable
    /* JADX INFO: renamed from: j */
    public HeapObject mo98076j(long objectId) {
        HeapObject.HeapClass heapClass = this.javaLangObjectClass;
        if (heapClass != null && objectId == heapClass.getObjectId()) {
            return this.javaLangObjectClass;
        }
        IntObjectPair<AbstractC44475h> intObjectPairM98234q = this.index.m98234q(objectId);
        if (intObjectPairM98234q != null) {
            return m98070S(intObjectPairM98234q.getFirst(), intObjectPairM98234q.m98384b(), objectId);
        }
        return null;
    }

    @Override // shark.InterfaceC44456i
    @NotNull
    /* JADX INFO: renamed from: k */
    public Sequence<HeapObject> mo98077k() {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        return SequencesKt.map(this.index.m98235r(), new Function1<LongObjectPair<? extends AbstractC44475h>, HeapObject>() { // from class: shark.HprofHeapGraph$objects$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final HeapObject invoke(@NotNull LongObjectPair<? extends AbstractC44475h> longObjectPair) {
                HprofHeapGraph hprofHeapGraph = this.this$0;
                Ref.IntRef intRef2 = intRef;
                int i11 = intRef2.element;
                intRef2.element = i11 + 1;
                return hprofHeapGraph.m98070S(i11, longObjectPair.m98388b(), longObjectPair.getFirst());
            }
        });
    }

    @Override // shark.InterfaceC44456i
    @NotNull
    /* JADX INFO: renamed from: m */
    public List<AbstractC44451d> mo98079m() {
        return this.index.m98226i();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final List<AbstractC44490l.b.c.a.FieldRecord> m98080q(@NotNull AbstractC44475h.a indexedClass) {
        return this.index.getClassFieldsReader().m98188k(indexedClass);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m98081u(@NotNull AbstractC44475h.a indexedClass) {
        return this.index.getClassFieldsReader().m98189l(indexedClass);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final List<AbstractC44490l.b.c.a.StaticFieldRecord> m98082v(@NotNull AbstractC44475h.a indexedClass) {
        return this.index.getClassFieldsReader().m98190m(indexedClass);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final String m98083w(long classId) {
        String strM98224g = this.index.m98224g(classId);
        if (this.header.getVersion() == HprofVersion.ANDROID || !StringsKt.startsWith$default((CharSequence) strM98224g, '[', false, 2, (Object) null)) {
            return strM98224g;
        }
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) strM98224g, '[', 0, false, 6, (Object) null);
        int i11 = iLastIndexOf$default + 1;
        String strRepeat = StringsKt.repeat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, i11);
        char cCharAt = strM98224g.charAt(i11);
        if (cCharAt == 'F') {
            return TypedValues.Custom.S_FLOAT + strRepeat;
        }
        if (cCharAt == 'L') {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = strM98224g.substring(iLastIndexOf$default + 2, strM98224g.length() - 1);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(strRepeat);
            return sb2.toString();
        }
        if (cCharAt == 'S') {
            return "short" + strRepeat;
        }
        if (cCharAt == 'Z') {
            return TypedValues.Custom.S_BOOLEAN + strRepeat;
        }
        if (cCharAt == 'I') {
            return "int" + strRepeat;
        }
        if (cCharAt == 'J') {
            return "long" + strRepeat;
        }
        switch (cCharAt) {
            case 'B':
                return "byte" + strRepeat;
            case 'C':
                return "char" + strRepeat;
            case 'D':
                return "double" + strRepeat;
            default:
                throw new IllegalStateException(("Unexpected type char " + cCharAt).toString());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final FieldValuesReader m98084x(@NotNull AbstractC44490l.b.c.C47022b record) {
        return new FieldValuesReader(record, mo98075i());
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final String m98085z(long classId, @NotNull AbstractC44490l.b.c.a.FieldRecord fieldRecord) {
        return this.index.m98225h(classId, fieldRecord.getNameStringId());
    }

    public HprofHeapGraph(@NotNull HprofHeader hprofHeader, @NotNull RandomAccessHprofReader randomAccessHprofReader, @NotNull HprofInMemoryIndex hprofInMemoryIndex) {
        this.header = hprofHeader;
        this.reader = randomAccessHprofReader;
        this.index = hprofInMemoryIndex;
    }

    @Override // shark.InterfaceC44456i
    @NotNull
    /* JADX INFO: renamed from: l */
    public HeapObject mo98078l(long objectId) {
        HeapObject heapObjectMo98076j = mo98076j(objectId);
        if (heapObjectMo98076j != null) {
            return heapObjectMo98076j;
        }
        throw new IllegalArgumentException("Object id " + objectId + " not found in heap dump.");
    }
}
