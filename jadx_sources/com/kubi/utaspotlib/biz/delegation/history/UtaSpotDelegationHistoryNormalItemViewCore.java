package com.kubi.utaspotlib.biz.delegation.history;

import android.content.Context;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.utaspotlib.R$string;
import com.kubi.utaspotlib.biz.delegation.detail.UtaSpotAbsOrderDetailFragment;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660ud.AbstractC45159c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.biz.delegation.history.u, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UtaSpotDelegationHistoryNormalItemViewCore.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/delegation/history/UtaSpotDelegationHistoryNormalItemViewCore;", "Lcom/kubi/core/biz/order/record/history/BaseDelegationHistoryBaseItemViewCore;", "tradeType", "", "<init>", "(Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "jumpToDetailPage", "", "context", "Landroid/content/Context;", "item", "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "jumpToTradePage", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UtaSpotDelegationHistoryNormalItemViewCore extends AbstractC45159c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f54155a;

    @Override // p660ud.AbstractC45159c
    /* JADX INFO: renamed from: f */
    public void mo66121f(@Nullable Context context, @NotNull HistoryOrdersUiData$ItemEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (context == null) {
            return;
        }
        String string = context.getString(R$string.deal_detail);
        String name = UtaSpotAbsOrderDetailFragment.class.getName();
        C27051h c27051h = new C27051h();
        c27051h.m66721e("data", item);
        String str = this.f54155a;
        if (str == null) {
            str = "TRADE";
        }
        c27051h.m66724h("tradeType", str);
        Unit unit = Unit.INSTANCE;
        BaseFragmentActivity.m56574n0(context, string, name, c27051h.m66717a());
    }

    @Override // p660ud.AbstractC45159c
    /* JADX INFO: renamed from: g */
    public void mo66122g(@Nullable Context context, @NotNull HistoryOrdersUiData$ItemEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.areEqual(this.f54155a, "MARGIN_TRADE")) {
            IMarginService.m37900d0(IMarginService.f32724a.get(), C27041f.m66668h(item.getSymbol()), false, false, null, 12, null);
        } else {
            ISpotCommonService.m59954x(ISpotCommonService.f49644a.get(), item.getSymbol(), false, 2, null);
        }
    }

    public UtaSpotDelegationHistoryNormalItemViewCore(@Nullable String str) {
        this.f54155a = str;
    }
}
