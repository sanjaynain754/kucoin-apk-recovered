package a30;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.spot.R$id;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a30.b */
/* JADX INFO: compiled from: NormalSymbolListItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/quote/market/symbolListItemView/NormalSymbolListItemView;", "Lcom/kubi/spot/quote/market/symbolListItemView/ISymbolListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/data/entity/TradeItemBean;", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0058b implements InterfaceC0057a {
    @Override // a30.InterfaceC0057a
    /* JADX INFO: renamed from: a */
    public void mo82a(@NotNull BaseViewHolder helper, @NotNull TradeItemBean item, @NotNull OldBaseFragment fragment) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        helper.setGone(R$id.tv_opening_call_auction, false);
        helper.setGone(R$id.tv_new_coin_reserve, false).setGone(R$id.ll_price_and_percent, true);
    }
}
