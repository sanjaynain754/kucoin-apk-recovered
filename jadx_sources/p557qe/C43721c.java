package p557qe;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qe.c */
/* JADX INFO: compiled from: ITask.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001aI\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¨\u0006\f"}, m90084d2 = {"createTaskJustRunner", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_EAST, "taskName", "", "runnable", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43721c {

    /* JADX INFO: Add missing generic type declarations: [T, E] */
    /* JADX INFO: renamed from: qe.c$a */
    /* JADX INFO: compiled from: ITask.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ)\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, m90084d2 = {"com/kubi/core/spot/business/holder/intercept/taskchain/ITaskKt$createTaskJustRunner$1", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "name", "", "getName", "()Ljava/lang/String;", "onIntercept", "", "exception", "(Ljava/lang/Object;)V", "onPassed", "data", "run", "dispatcher", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;", "(Ljava/lang/Object;Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;)V", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a<E, T> implements InterfaceC43720b<T, E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f96645a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<T, Unit> f96646b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, Function1<? super T, Unit> function1) {
            this.f96645a = str;
            this.f96646b = function1;
        }

        @Override // p557qe.InterfaceC43720b
        /* JADX INFO: renamed from: c */
        public void mo23276c(T t11, InterfaceC43722d<T, E> dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.f96646b.invoke(t11);
        }

        @Override // p557qe.InterfaceC43720b
        /* JADX INFO: renamed from: a */
        public void mo23274a(E e11) {
        }

        @Override // p557qe.InterfaceC43720b
        /* JADX INFO: renamed from: b */
        public void mo23275b(T t11) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T, E> InterfaceC43720b<T, E> m96276a(@NotNull String taskName, @NotNull Function1<? super T, Unit> runnable) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return new a(taskName, runnable);
    }
}
