package p557qe;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: qe.a */
/* JADX INFO: compiled from: TaskChainEngine.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/taskchain/DefaultTaskDispatcher;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_EAST, "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;", "ruleList", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "<init>", "(Ljava/util/LinkedList;)V", "handleInterception", "", "rule", "exception", "(Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;Ljava/lang/Object;)V", "resumeNextExecution", "preRule", "data", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43719a<T, E> implements InterfaceC43722d<T, E> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LinkedList<InterfaceC43720b<T, E>> f96644a;

    public C43719a(@NotNull LinkedList<InterfaceC43720b<T, E>> ruleList) {
        Intrinsics.checkNotNullParameter(ruleList, "ruleList");
        this.f96644a = ruleList;
    }

    @Override // p557qe.InterfaceC43722d
    /* JADX INFO: renamed from: a */
    public void mo96274a(@NotNull InterfaceC43720b<T, E> preRule, T t11) {
        Intrinsics.checkNotNullParameter(preRule, "preRule");
        C44128b.m97258b("规则：" + preRule.getClass().getSimpleName() + " 校验通过，继续执行下一个规则。");
        preRule.mo23275b(t11);
        InterfaceC43720b interfaceC43720b = (InterfaceC43720b) CollectionsKt.removeFirstOrNull(this.f96644a);
        if (interfaceC43720b == null) {
            return;
        }
        interfaceC43720b.mo23276c(t11, this);
    }

    @Override // p557qe.InterfaceC43722d
    /* JADX INFO: renamed from: b */
    public void mo96275b(@NotNull InterfaceC43720b<T, E> rule, E e11) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        C44128b.m97258b("规则：" + rule.getClass().getSimpleName() + " 被中断");
        rule.mo23274a(e11);
    }
}
