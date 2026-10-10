package shark;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ObjectInspector.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lshark/ObjectInspector;", "", "Lshark/q;", "reporter", "", "inspect", "(Lshark/q;)V", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public interface ObjectInspector {

    /* JADX INFO: compiled from: ObjectInspector.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\b2\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lshark/ObjectInspector$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lshark/q;", "", "block", "Lshark/ObjectInspector;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lshark/ObjectInspector;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f98217a = new Companion();

        /* JADX INFO: renamed from: shark.ObjectInspector$Companion$a */
        /* JADX INFO: compiled from: ObjectInspector.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"shark/ObjectInspector$Companion$a", "Lshark/ObjectInspector;", "Lshark/q;", "reporter", "", "inspect", "(Lshark/q;)V", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C44433a implements ObjectInspector {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Function1 f98218b;

            public C44433a(Function1 function1) {
                this.f98218b = function1;
            }

            @Override // shark.ObjectInspector
            public void inspect(@NotNull C44495q reporter) {
                this.f98218b.invoke(reporter);
            }
        }

        @NotNull
        public final ObjectInspector invoke(@NotNull Function1<? super C44495q, Unit> block) {
            return new C44433a(block);
        }
    }

    void inspect(@NotNull C44495q reporter);
}
