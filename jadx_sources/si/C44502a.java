package si;

import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.position.adapter.x;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.utils.C27096v0;
import fm.C37569d;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import p640ti.C45030e;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: si.a */
/* JADX INFO: compiled from: PositionSortComparator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/comparator/AlphabetAscendingSortComparator;", "Ljava/util/Comparator;", "Lcom/kubi/futures/trade/position/data/BasePositionWrapper;", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", "p1", "p2", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44502a implements Comparator<C45030e> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C45030e p11, @NotNull C45030e p12) {
        String symbol;
        String symbol2;
        C27096v0 c27096v0M24440e;
        C27096v0 c27096v0M24440e2;
        Intrinsics.checkNotNullParameter(p11, "p1");
        Intrinsics.checkNotNullParameter(p12, "p2");
        Pair pairM90091to = Intrinsics.areEqual(x.a(), "ASC") ? TuplesKt.m90091to(p12, p11) : TuplesKt.m90091to(p11, p12);
        C45030e c45030e = (C45030e) pairM90091to.component1();
        C45030e c45030e2 = (C45030e) pairM90091to.component2();
        ContractEntity contractEntityM84661b = C37569d.m84661b(c45030e.getF101404a());
        if (contractEntityM84661b == null || (c27096v0M24440e2 = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM84661b)) == null || (symbol = c27096v0M24440e2.toString()) == null) {
            symbol = c45030e.getF101404a().getSymbol();
        }
        ContractEntity contractEntityM84661b2 = C37569d.m84661b(c45030e2.getF101404a());
        if (contractEntityM84661b2 == null || (c27096v0M24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM84661b2)) == null || (symbol2 = c27096v0M24440e.toString()) == null) {
            symbol2 = c45030e2.getF101404a().getSymbol();
        }
        return ComparisonsKt.compareValues(symbol, symbol2);
    }
}
