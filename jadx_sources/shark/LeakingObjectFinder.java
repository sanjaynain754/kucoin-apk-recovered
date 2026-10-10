package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: LeakingObjectFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lshark/LeakingObjectFinder;", "", "Lshark/i;", "graph", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/i;)Ljava/util/Set;", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public interface LeakingObjectFinder {

    /* JADX INFO: compiled from: LeakingObjectFinder.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u001a\b\u0004\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0086\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lshark/LeakingObjectFinder$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lshark/i;", "", "", "block", "Lshark/LeakingObjectFinder;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lshark/LeakingObjectFinder;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f98210a = new Companion();

        /* JADX INFO: renamed from: shark.LeakingObjectFinder$Companion$a */
        /* JADX INFO: compiled from: LeakingObjectFinder.kt */
        @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"shark/LeakingObjectFinder$Companion$a", "Lshark/LeakingObjectFinder;", "Lshark/i;", "graph", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/i;)Ljava/util/Set;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C44430a implements LeakingObjectFinder {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Function1 f98211a;

            public C44430a(Function1 function1) {
                this.f98211a = function1;
            }

            @Override // shark.LeakingObjectFinder
            @NotNull
            /* JADX INFO: renamed from: a */
            public Set<Long> mo97966a(@NotNull InterfaceC44456i graph) {
                return (Set) this.f98211a.invoke(graph);
            }
        }

        @NotNull
        public final LeakingObjectFinder invoke(@NotNull Function1<? super InterfaceC44456i, ? extends Set<Long>> block) {
            return new C44430a(block);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Set<Long> mo97966a(@NotNull InterfaceC44456i graph);
}
