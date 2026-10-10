package si;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import p640ti.C45030e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: si.c */
/* JADX INFO: compiled from: PositionSortComparator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/comparator/PositionDefaultSortComparator;", "Ljava/util/Comparator;", "Lcom/kubi/futures/trade/position/data/BasePositionWrapper;", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", "p1", "p2", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44504c implements Comparator<C45030e> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C45030e p11, @NotNull C45030e p12) {
        Intrinsics.checkNotNullParameter(p11, "p1");
        Intrinsics.checkNotNullParameter(p12, "p2");
        if (!Intrinsics.areEqual(p11.getF101404a().getSymbol(), p11.getF101406c()) && !Intrinsics.areEqual(p12.getF101404a().getSymbol(), p12.getF101406c())) {
            Long openingTimestamp = p11.getF101404a().getOpeningTimestamp();
            long jLongValue = openingTimestamp != null ? openingTimestamp.longValue() : 0L;
            Long openingTimestamp2 = p12.getF101404a().getOpeningTimestamp();
            return Intrinsics.compare(openingTimestamp2 != null ? openingTimestamp2.longValue() : 0L, jLongValue);
        }
        if (Intrinsics.areEqual(p11.getF101404a().getSymbol(), p11.getF101406c()) && Intrinsics.areEqual(p12.getF101404a().getSymbol(), p12.getF101406c())) {
            return Intrinsics.compare(p11.getF101404a().isTrialFunds() ? 1 : 0, p12.getF101404a().isTrialFunds() ? 1 : 0);
        }
        if (Intrinsics.areEqual(p11.getF101404a().getSymbol(), p11.getF101406c())) {
            return -1;
        }
        return Intrinsics.areEqual(p12.getF101404a().getSymbol(), p12.getF101406c()) ? 1 : 0;
    }
}
