package m20;

import com.kubi.spot.entity.DelegationEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m20.n */
/* JADX INFO: compiled from: DelegationListFragmentExt.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"getTradeTypeItemView", "Lcom/kubi/spot/business/delegation/delegationList/IDelegationListTradeTypeItemView;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42414n {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC42418r m93104a(@NotNull DelegationEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean zIsOCO = item.isOCO(1);
        boolean zIsTradingStop = item.isTradingStop(1);
        if (zIsOCO) {
            return new C42416p();
        }
        return zIsTradingStop ? new C42417q() : new C42415o();
    }
}
