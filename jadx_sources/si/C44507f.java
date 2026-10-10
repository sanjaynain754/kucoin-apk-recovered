package si;

import com.kubi.futures.trade.position.adapter.x;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p640ti.C45030e;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: si.f */
/* JADX INFO: compiled from: PositionSortComparator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/comparator/RoiSortComparator;", "Ljava/util/Comparator;", "Lcom/kubi/futures/trade/position/data/BasePositionWrapper;", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", "p1", "p2", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44507f implements Comparator<C45030e> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C45030e p11, @NotNull C45030e p12) {
        Intrinsics.checkNotNullParameter(p11, "p1");
        Intrinsics.checkNotNullParameter(p12, "p2");
        Pair pairM90091to = Intrinsics.areEqual(x.a(), "ASC") ? TuplesKt.m90091to(p11, p12) : TuplesKt.m90091to(p12, p11);
        return ComparisonsKt.compareValues(C41014a.m89922G(((C45030e) pairM90091to.component1()).getF101404a().getUnrealisedRoePcnt(), null, 1, null), C41014a.m89922G(((C45030e) pairM90091to.component2()).getF101404a().getUnrealisedRoePcnt(), null, 1, null));
    }
}
