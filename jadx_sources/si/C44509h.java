package si;

import com.kubi.futures.trade.position.adapter.x;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import fm.C37569d;
import java.math.BigDecimal;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p640ti.C45030e;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: si.h */
/* JADX INFO: compiled from: PositionSortComparator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/comparator/ValueDescendingSortComparator;", "Ljava/util/Comparator;", "Lcom/kubi/futures/trade/position/data/BasePositionWrapper;", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", "p1", "p2", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44509h implements Comparator<C45030e> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C45030e p11, @NotNull C45030e p12) {
        Intrinsics.checkNotNullParameter(p11, "p1");
        Intrinsics.checkNotNullParameter(p12, "p2");
        Pair pairM90091to = Intrinsics.areEqual(x.a(), "ASC") ? TuplesKt.m90091to(p11, p12) : TuplesKt.m90091to(p12, p11);
        C45030e c45030e = (C45030e) pairM90091to.component1();
        C45030e c45030e2 = (C45030e) pairM90091to.component2();
        ContractEntity contractEntityM84661b = C37569d.m84661b(c45030e.getF101404a());
        boolean zM66566d = C27025c.m66566d(contractEntityM84661b != null ? Boolean.valueOf(contractEntityM84661b.isInverse()) : null);
        ContractEntity contractEntityM84661b2 = C37569d.m84661b(c45030e.getF101404a());
        BigDecimal bigDecimalC = com.kubi.kumex.logic.calculator.a.c(zM66566d, C27039d.m66656p(contractEntityM84661b2 != null ? contractEntityM84661b2.getMultiplier() : null), C27039d.m66656p(c45030e.getF101404a().getMarkPrice()), C41014a.m89922G(c45030e.getF101404a().getCurrentQty(), null, 1, null));
        ContractEntity contractEntityM84661b3 = C37569d.m84661b(c45030e2.getF101404a());
        boolean zM66566d2 = C27025c.m66566d(contractEntityM84661b3 != null ? Boolean.valueOf(contractEntityM84661b3.isInverse()) : null);
        ContractEntity contractEntityM84661b4 = C37569d.m84661b(c45030e2.getF101404a());
        return ComparisonsKt.compareValues(bigDecimalC, com.kubi.kumex.logic.calculator.a.c(zM66566d2, C27039d.m66656p(contractEntityM84661b4 != null ? contractEntityM84661b4.getMultiplier() : null), C27039d.m66656p(c45030e2.getF101404a().getMarkPrice()), C41014a.m89922G(c45030e2.getF101404a().getCurrentQty(), null, 1, null)));
    }
}
