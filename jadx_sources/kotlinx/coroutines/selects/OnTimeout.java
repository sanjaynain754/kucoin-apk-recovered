package kotlinx.coroutines.selects;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m90084d2 = {"Lkotlinx/coroutines/selects/OnTimeout;", "", "", "timeMillis", "<init>", "(J)V", "Lkotlinx/coroutines/selects/i;", "select", "ignoredParam", "", "d", "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "Lkotlinx/coroutines/selects/d;", "c", "()Lkotlinx/coroutines/selects/d;", "getSelectClause$annotations", "()V", "selectClause", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class OnTimeout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long timeMillis;

    /* JADX INFO: renamed from: e */
    public static final void m91264e(InterfaceC41754i interfaceC41754i, OnTimeout onTimeout) {
        interfaceC41754i.mo91278f(onTimeout, Unit.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41749d m91265c() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        Intrinsics.checkNotNull(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new C41750e(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onTimeout$selectClause$1, 3), null, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m91266d(final InterfaceC41754i<?> select, Object ignoredParam) {
        if (this.timeMillis <= 0) {
            select.mo91276c(Unit.INSTANCE);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.a
            @Override // java.lang.Runnable
            public final void run() {
                OnTimeout.m91264e(select, this);
            }
        };
        Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) select;
        CoroutineContext context = selectImplementation.getContext();
        selectImplementation.mo91277d(DelayKt.m90352d(context).invokeOnTimeout(this.timeMillis, runnable, context));
    }

    public OnTimeout(long j11) {
        this.timeMillis = j11;
    }
}
