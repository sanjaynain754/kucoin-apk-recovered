package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.EnumSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: StreamingRecordReaderAdapter.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lshark/StreamingRecordReaderAdapter;", "", "Lshark/StreamingHprofReader;", "streamingHprofReader", "<init>", "(Lshark/StreamingHprofReader;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/StreamingHprofReader;", "b", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class StreamingRecordReaderAdapter {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final StreamingHprofReader streamingHprofReader;

    /* JADX INFO: compiled from: StreamingRecordReaderAdapter.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lshark/StreamingRecordReaderAdapter$Companion;", "", "<init>", "()V", "Lshark/StreamingHprofReader;", "Lshark/StreamingRecordReaderAdapter;", "asStreamingRecordReader", "(Lshark/StreamingHprofReader;)Lshark/StreamingRecordReaderAdapter;", "", "Lkotlin/reflect/KClass;", "Lshark/l;", "Ljava/util/EnumSet;", "Lshark/HprofRecordTag;", "asHprofTags", "(Ljava/util/Set;)Ljava/util/EnumSet;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumSet<HprofRecordTag> asHprofTags(@NotNull Set<? extends KClass<? extends AbstractC44490l>> set) {
            if (set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.class))) {
                EnumSet<HprofRecordTag> enumSetAllOf = EnumSet.allOf(HprofRecordTag.class);
                Intrinsics.checkExpressionValueIsNotNull(enumSetAllOf, "EnumSet.allOf(HprofRecordTag::class.java)");
                return enumSetAllOf;
            }
            EnumSet<HprofRecordTag> enumSetNoneOf = EnumSet.noneOf(HprofRecordTag.class);
            if (set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.f.class))) {
                enumSetNoneOf.add(HprofRecordTag.STRING_IN_UTF8);
            }
            if (set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.c.class))) {
                enumSetNoneOf.add(HprofRecordTag.LOAD_CLASS);
            }
            if (set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.a.class))) {
                enumSetNoneOf.add(HprofRecordTag.HEAP_DUMP_END);
            }
            if (set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.d.class))) {
                enumSetNoneOf.add(HprofRecordTag.STACK_FRAME);
            }
            if (set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.e.class))) {
                enumSetNoneOf.add(HprofRecordTag.STACK_TRACE);
            }
            if (set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.b.C47019b.class))) {
                enumSetNoneOf.add(HprofRecordTag.HEAP_DUMP_INFO);
            }
            boolean zContains = set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.b.class));
            if (zContains || set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.b.a.class))) {
                enumSetNoneOf.addAll(HprofRecordTag.INSTANCE.getRootTags());
            }
            boolean z11 = zContains || set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.b.c.class));
            if (z11 || set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.b.c.a.class))) {
                enumSetNoneOf.add(HprofRecordTag.CLASS_DUMP);
            }
            if (z11 || set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.b.c.C47022b.class))) {
                enumSetNoneOf.add(HprofRecordTag.INSTANCE_DUMP);
            }
            if (z11 || set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.b.c.C47023c.class))) {
                enumSetNoneOf.add(HprofRecordTag.OBJECT_ARRAY_DUMP);
            }
            if (z11 || set.contains(Reflection.getOrCreateKotlinClass(AbstractC44490l.b.c.d.class))) {
                enumSetNoneOf.add(HprofRecordTag.PRIMITIVE_ARRAY_DUMP);
            }
            Intrinsics.checkExpressionValueIsNotNull(enumSetNoneOf, "EnumSet.noneOf(HprofReco…MP)\n          }\n        }");
            return enumSetNoneOf;
        }

        @NotNull
        public final StreamingRecordReaderAdapter asStreamingRecordReader(@NotNull StreamingHprofReader streamingHprofReader) {
            return new StreamingRecordReaderAdapter(streamingHprofReader);
        }
    }

    public StreamingRecordReaderAdapter(@NotNull StreamingHprofReader streamingHprofReader) {
        this.streamingHprofReader = streamingHprofReader;
    }
}
