package shark;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OnHprofRecordListener.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m90084d2 = {"Lshark/OnHprofRecordListener;", "", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public interface OnHprofRecordListener {

    /* JADX INFO: compiled from: OnHprofRecordListener.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u001a\b\u0004\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\u0086\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lshark/OnHprofRecordListener$Companion;", "", "<init>", "()V", "Lkotlin/Function2;", "", "Lshark/l;", "", "block", "Lshark/OnHprofRecordListener;", "invoke", "(Lkotlin/jvm/functions/Function2;)Lshark/OnHprofRecordListener;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f98228a = new Companion();

        /* JADX INFO: renamed from: shark.OnHprofRecordListener$Companion$a */
        /* JADX INFO: compiled from: OnHprofRecordListener.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"shark/OnHprofRecordListener$Companion$a", "Lshark/OnHprofRecordListener;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C44437a implements OnHprofRecordListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Function2 f98229a;

            public C44437a(Function2 function2) {
                this.f98229a = function2;
            }
        }

        @NotNull
        public final OnHprofRecordListener invoke(@NotNull Function2<? super Long, ? super AbstractC44490l, Unit> block) {
            return new C44437a(block);
        }
    }
}
