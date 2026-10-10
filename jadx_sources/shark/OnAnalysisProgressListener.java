package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: OnAnalysisProgressListener.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m90084d2 = {"Lshark/OnAnalysisProgressListener;", "", "Lshark/OnAnalysisProgressListener$Step;", "step", "", "onAnalysisProgress", "(Lshark/OnAnalysisProgressListener$Step;)V", "Companion", "Step", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public interface OnAnalysisProgressListener {

    /* JADX INFO: compiled from: OnAnalysisProgressListener.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\b2\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\n¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lshark/OnAnalysisProgressListener$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lshark/OnAnalysisProgressListener$Step;", "", "block", "Lshark/OnAnalysisProgressListener;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lshark/OnAnalysisProgressListener;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/OnAnalysisProgressListener;", "getNO_OP", "()Lshark/OnAnalysisProgressListener;", "NO_OP", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Companion f98224b = new Companion();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final OnAnalysisProgressListener NO_OP = C44435a.f98225a;

        /* JADX INFO: renamed from: shark.OnAnalysisProgressListener$Companion$b */
        /* JADX INFO: compiled from: OnAnalysisProgressListener.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"shark/OnAnalysisProgressListener$Companion$b", "Lshark/OnAnalysisProgressListener;", "Lshark/OnAnalysisProgressListener$Step;", "step", "", "onAnalysisProgress", "(Lshark/OnAnalysisProgressListener$Step;)V", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C44436b implements OnAnalysisProgressListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Function1 f98226a;

            public C44436b(Function1 function1) {
                this.f98226a = function1;
            }

            @Override // shark.OnAnalysisProgressListener
            public void onAnalysisProgress(@NotNull Step step) {
                this.f98226a.invoke(step);
            }
        }

        @NotNull
        public final OnAnalysisProgressListener getNO_OP() {
            return NO_OP;
        }

        @NotNull
        public final OnAnalysisProgressListener invoke(@NotNull Function1<? super Step, Unit> block) {
            return new C44436b(block);
        }

        /* JADX INFO: renamed from: shark.OnAnalysisProgressListener$Companion$a */
        /* JADX INFO: compiled from: OnAnalysisProgressListener.kt */
        @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lshark/OnAnalysisProgressListener$Step;", "onAnalysisProgress"}, m90085k = 3, m90086mv = {1, 4, 1})
        public static final class C44435a implements OnAnalysisProgressListener {

            /* JADX INFO: renamed from: a */
            public static final C44435a f98225a = new C44435a();

            @Override // shark.OnAnalysisProgressListener
            public final void onAnalysisProgress(@NotNull Step step) {
            }
        }
    }

    /* JADX INFO: compiled from: OnAnalysisProgressListener.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lshark/OnAnalysisProgressListener$Step;", "", "(Ljava/lang/String;I)V", "PARSING_HEAP_DUMP", "EXTRACTING_METADATA", "FINDING_RETAINED_OBJECTS", "FINDING_PATHS_TO_RETAINED_OBJECTS", "FINDING_DOMINATORS", "INSPECTING_OBJECTS", "COMPUTING_NATIVE_RETAINED_SIZE", "COMPUTING_RETAINED_SIZE", "BUILDING_LEAK_TRACES", "REPORTING_HEAP_ANALYSIS", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public enum Step {
        PARSING_HEAP_DUMP,
        EXTRACTING_METADATA,
        FINDING_RETAINED_OBJECTS,
        FINDING_PATHS_TO_RETAINED_OBJECTS,
        FINDING_DOMINATORS,
        INSPECTING_OBJECTS,
        COMPUTING_NATIVE_RETAINED_SIZE,
        COMPUTING_RETAINED_SIZE,
        BUILDING_LEAK_TRACES,
        REPORTING_HEAP_ANALYSIS
    }

    void onAnalysisProgress(@NotNull Step step);
}
