package l20;

import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l20.f */
/* JADX INFO: compiled from: DelegationDetailFragmentExt.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"getTradeTypeHeadView", "Lcom/kubi/spot/business/delegation/delegateDetail/IDelegateDetailTradeTypeHeaderView;", "delegationData", "Lcom/kubi/spot/entity/DelegationEntity;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42039f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC42045l m92242a(@NotNull DelegationEntity delegationData) {
        Intrinsics.checkNotNullParameter(delegationData, "delegationData");
        boolean zM66566d = C27025c.m66566d(Boolean.valueOf(delegationData.isOCO(2)));
        boolean zIsTradingStop = delegationData.isTradingStop(2);
        if (zM66566d) {
            return new C42043j();
        }
        return zIsTradingStop ? new C42044k() : new C42042i();
    }
}
