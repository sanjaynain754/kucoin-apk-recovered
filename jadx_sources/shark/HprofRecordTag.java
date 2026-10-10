package shark;

import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HprofRecordTag.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b)\b\u0086\u0001\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006,"}, m90084d2 = {"Lshark/HprofRecordTag;", "", "tag", "", "(Ljava/lang/String;II)V", "getTag", "()I", "STRING_IN_UTF8", "LOAD_CLASS", "UNLOAD_CLASS", "STACK_FRAME", "STACK_TRACE", "ALLOC_SITES", "HEAP_SUMMARY", "START_THREAD", "END_THREAD", "HEAP_DUMP", "HEAP_DUMP_SEGMENT", "HEAP_DUMP_END", "CPU_SAMPLES", "CONTROL_SETTINGS", "ROOT_UNKNOWN", "ROOT_JNI_GLOBAL", "ROOT_JNI_LOCAL", "ROOT_JAVA_FRAME", "ROOT_NATIVE_STACK", "ROOT_STICKY_CLASS", "ROOT_THREAD_BLOCK", "ROOT_MONITOR_USED", "ROOT_THREAD_OBJECT", "HEAP_DUMP_INFO", "ROOT_INTERNED_STRING", "ROOT_FINALIZING", "ROOT_DEBUGGER", "ROOT_REFERENCE_CLEANUP", "ROOT_VM_INTERNAL", "ROOT_JNI_MONITOR", "ROOT_UNREACHABLE", "PRIMITIVE_ARRAY_NODATA", "CLASS_DUMP", "INSTANCE_DUMP", "OBJECT_ARRAY_DUMP", "PRIMITIVE_ARRAY_DUMP", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public enum HprofRecordTag {
    STRING_IN_UTF8(1),
    LOAD_CLASS(2),
    UNLOAD_CLASS(3),
    STACK_FRAME(4),
    STACK_TRACE(5),
    ALLOC_SITES(6),
    HEAP_SUMMARY(7),
    START_THREAD(10),
    END_THREAD(11),
    HEAP_DUMP(12),
    HEAP_DUMP_SEGMENT(28),
    HEAP_DUMP_END(44),
    CPU_SAMPLES(13),
    CONTROL_SETTINGS(14),
    ROOT_UNKNOWN(255),
    ROOT_JNI_GLOBAL(1),
    ROOT_JNI_LOCAL(2),
    ROOT_JAVA_FRAME(3),
    ROOT_NATIVE_STACK(4),
    ROOT_STICKY_CLASS(5),
    ROOT_THREAD_BLOCK(6),
    ROOT_MONITOR_USED(7),
    ROOT_THREAD_OBJECT(8),
    HEAP_DUMP_INFO(254),
    ROOT_INTERNED_STRING(137),
    ROOT_FINALIZING(138),
    ROOT_DEBUGGER(139),
    ROOT_REFERENCE_CLEANUP(140),
    ROOT_VM_INTERNAL(141),
    ROOT_JNI_MONITOR(142),
    ROOT_UNREACHABLE(144),
    PRIMITIVE_ARRAY_NODATA(TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS),
    CLASS_DUMP(32),
    INSTANCE_DUMP(33),
    OBJECT_ARRAY_DUMP(34),
    PRIMITIVE_ARRAY_DUMP(35);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final EnumSet<HprofRecordTag> f98199c;
    private final int tag;

    /* JADX INFO: compiled from: HprofRecordTag.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lshark/HprofRecordTag$Companion;", "", "()V", "rootTags", "Ljava/util/EnumSet;", "Lshark/HprofRecordTag;", "getRootTags", "()Ljava/util/EnumSet;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumSet<HprofRecordTag> getRootTags() {
            return HprofRecordTag.f98199c;
        }
    }

    static {
        HprofRecordTag hprofRecordTag = ROOT_UNKNOWN;
        HprofRecordTag hprofRecordTag2 = ROOT_JNI_GLOBAL;
        HprofRecordTag hprofRecordTag3 = ROOT_JNI_LOCAL;
        HprofRecordTag hprofRecordTag4 = ROOT_JAVA_FRAME;
        HprofRecordTag hprofRecordTag5 = ROOT_NATIVE_STACK;
        HprofRecordTag hprofRecordTag6 = ROOT_STICKY_CLASS;
        HprofRecordTag hprofRecordTag7 = ROOT_THREAD_BLOCK;
        HprofRecordTag hprofRecordTag8 = ROOT_MONITOR_USED;
        HprofRecordTag hprofRecordTag9 = ROOT_THREAD_OBJECT;
        HprofRecordTag hprofRecordTag10 = ROOT_INTERNED_STRING;
        HprofRecordTag hprofRecordTag11 = ROOT_FINALIZING;
        HprofRecordTag hprofRecordTag12 = ROOT_DEBUGGER;
        HprofRecordTag hprofRecordTag13 = ROOT_REFERENCE_CLEANUP;
        HprofRecordTag hprofRecordTag14 = ROOT_VM_INTERNAL;
        HprofRecordTag hprofRecordTag15 = ROOT_JNI_MONITOR;
        HprofRecordTag hprofRecordTag16 = ROOT_UNREACHABLE;
        INSTANCE = new Companion(null);
        EnumSet<HprofRecordTag> enumSetOf = EnumSet.of(hprofRecordTag, hprofRecordTag2, hprofRecordTag3, hprofRecordTag4, hprofRecordTag5, hprofRecordTag6, hprofRecordTag7, hprofRecordTag8, hprofRecordTag9, hprofRecordTag10, hprofRecordTag11, hprofRecordTag12, hprofRecordTag13, hprofRecordTag14, hprofRecordTag15, hprofRecordTag16);
        Intrinsics.checkExpressionValueIsNotNull(enumSetOf, "EnumSet.of(\n      ROOT_U…   ROOT_UNREACHABLE\n    )");
        f98199c = enumSetOf;
    }

    public final int getTag() {
        return this.tag;
    }

    HprofRecordTag(int i11) {
        this.tag = i11;
    }
}
