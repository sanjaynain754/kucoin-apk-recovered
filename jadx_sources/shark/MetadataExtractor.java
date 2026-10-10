package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: MetadataExtractor.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lshark/MetadataExtractor;", "", "Lshark/i;", "graph", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/i;)Ljava/util/Map;", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public interface MetadataExtractor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f98214b;

    /* JADX INFO: compiled from: MetadataExtractor.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u00020\t2 \b\u0004\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0086\n¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lshark/MetadataExtractor$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lshark/i;", "", "", "block", "Lshark/MetadataExtractor;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lshark/MetadataExtractor;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/MetadataExtractor;", "getNO_OP", "()Lshark/MetadataExtractor;", "NO_OP", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Companion f98214b = new Companion();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final MetadataExtractor NO_OP = C44431a.f98215b;

        /* JADX INFO: renamed from: shark.MetadataExtractor$Companion$b */
        /* JADX INFO: compiled from: MetadataExtractor.kt */
        @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"shark/MetadataExtractor$Companion$b", "Lshark/MetadataExtractor;", "Lshark/i;", "graph", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/i;)Ljava/util/Map;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C44432b implements MetadataExtractor {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Function1 f98216b;

            public C44432b(Function1 function1) {
                this.f98216b = function1;
            }

            @Override // shark.MetadataExtractor
            @NotNull
            /* JADX INFO: renamed from: a */
            public Map<String, String> mo98152a(@NotNull InterfaceC44456i graph) {
                return (Map) this.f98216b.invoke(graph);
            }
        }

        /* JADX INFO: renamed from: shark.MetadataExtractor$Companion$a */
        /* JADX INFO: compiled from: MetadataExtractor.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"Lshark/i;", "it", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/i;)Ljava/util/Map;"}, m90085k = 3, m90086mv = {1, 4, 1})
        public static final class C44431a implements MetadataExtractor {

            /* JADX INFO: renamed from: b */
            public static final C44431a f98215b = new C44431a();

            @Override // shark.MetadataExtractor
            @NotNull
            /* JADX INFO: renamed from: a */
            public final Map<String, String> mo98152a(@NotNull InterfaceC44456i interfaceC44456i) {
                return MapsKt.emptyMap();
            }
        }

        @NotNull
        public final MetadataExtractor getNO_OP() {
            return NO_OP;
        }

        @NotNull
        public final MetadataExtractor invoke(@NotNull Function1<? super InterfaceC44456i, ? extends Map<String, String>> block) {
            return new C44432b(block);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Map<String, String> mo98152a(@NotNull InterfaceC44456i graph);
}
