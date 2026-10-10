package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.EnumSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import shark.internal.HprofInMemoryIndex;

/* JADX INFO: compiled from: HprofIndex.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m90084d2 = {"Lshark/HprofIndex;", "", "Lshark/t;", "sourceProvider", "Lshark/HprofHeader;", "header", "Lshark/internal/HprofInMemoryIndex;", "index", "<init>", "(Lshark/t;Lshark/HprofHeader;Lshark/internal/HprofInMemoryIndex;)V", "Lshark/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lshark/a;", "Lshark/t;", "b", "Lshark/HprofHeader;", "c", "Lshark/internal/HprofInMemoryIndex;", "d", "Companion", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class HprofIndex {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final InterfaceC44498t sourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final HprofHeader header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final HprofInMemoryIndex index;

    /* JADX INFO: compiled from: HprofIndex.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0012\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00100\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lshark/HprofIndex$Companion;", "", "<init>", "()V", "Lshark/b;", "hprofSourceProvider", "Lshark/HprofHeader;", "hprofHeader", "Lshark/r;", "proguardMapping", "", "Lshark/HprofRecordTag;", "indexedGcRootTags", "Lshark/HprofIndex;", "indexRecordsOf", "(Lshark/b;Lshark/HprofHeader;Lshark/r;Ljava/util/Set;)Lshark/HprofIndex;", "Ljava/util/EnumSet;", "kotlin.jvm.PlatformType", "defaultIndexedGcRootTags", "()Ljava/util/EnumSet;", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HprofIndex indexRecordsOf$default(Companion companion, InterfaceC44449b interfaceC44449b, HprofHeader hprofHeader, C44496r c44496r, Set set, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                c44496r = null;
            }
            if ((i11 & 8) != 0) {
                set = companion.defaultIndexedGcRootTags();
                Intrinsics.checkExpressionValueIsNotNull(set, "defaultIndexedGcRootTags()");
            }
            return companion.indexRecordsOf(interfaceC44449b, hprofHeader, c44496r, set);
        }

        public final EnumSet<HprofRecordTag> defaultIndexedGcRootTags() {
            return EnumSet.of(HprofRecordTag.ROOT_JNI_GLOBAL, HprofRecordTag.ROOT_JAVA_FRAME, HprofRecordTag.ROOT_JNI_LOCAL, HprofRecordTag.ROOT_MONITOR_USED, HprofRecordTag.ROOT_NATIVE_STACK, HprofRecordTag.ROOT_STICKY_CLASS, HprofRecordTag.ROOT_THREAD_BLOCK, HprofRecordTag.ROOT_THREAD_OBJECT, HprofRecordTag.ROOT_JNI_MONITOR);
        }

        @NotNull
        public final HprofIndex indexRecordsOf(@NotNull InterfaceC44449b hprofSourceProvider, @NotNull HprofHeader hprofHeader, @Nullable C44496r proguardMapping, @NotNull Set<? extends HprofRecordTag> indexedGcRootTags) {
            return new HprofIndex(hprofSourceProvider, hprofHeader, HprofInMemoryIndex.INSTANCE.indexHprof(StreamingHprofReader.INSTANCE.readerFor(hprofSourceProvider, hprofHeader), hprofHeader, proguardMapping, indexedGcRootTags), null);
        }
    }

    public HprofIndex(InterfaceC44498t interfaceC44498t, HprofHeader hprofHeader, HprofInMemoryIndex hprofInMemoryIndex) {
        this.sourceProvider = interfaceC44498t;
        this.header = hprofHeader;
        this.index = hprofInMemoryIndex;
    }

    public /* synthetic */ HprofIndex(InterfaceC44498t interfaceC44498t, HprofHeader hprofHeader, HprofInMemoryIndex hprofInMemoryIndex, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC44498t, hprofHeader, hprofInMemoryIndex);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC44448a m98087a() {
        return new HprofHeapGraph(this.header, RandomAccessHprofReader.INSTANCE.openReaderFor(this.sourceProvider, this.header), this.index);
    }
}
