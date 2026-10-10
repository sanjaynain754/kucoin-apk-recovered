package me;

import androidx.fragment.app.FragmentManager;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.data.entity.TradeItemBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ve.C45518a;

/* JADX INFO: renamed from: me.f */
/* JADX INFO: compiled from: MaintenanceIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/MaintenanceIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/IOrderIntercept;", "<init>", "()V", "checkPreInterceptFailed", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "isMaintenance", "fm", "Landroidx/fragment/app/FragmentManager;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42520f implements InterfaceC42516c {
    @Override // me.InterfaceC42516c
    /* JADX INFO: renamed from: a */
    public boolean mo93235a(@NotNull TradeItemBean tradeItemBean, boolean z11, @Nullable FragmentManager fragmentManager) throws JSONException {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        if (!z11) {
            return false;
        }
        C45518a.m100507a("当前交易对处于停机状态:" + tradeItemBean.getSymbol(), "BaseOrderHolder");
        SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_DOWNTIME, SpotBusinessTracker.SpotFailReason.DOWNTIME);
        return true;
    }
}
