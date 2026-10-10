package p809yu;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.R$id;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.b0 */
/* JADX INFO: compiled from: FavListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/NormalFavListItemView;", "Lcom/kubi/quotefacade/adapter/ITradeListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/data/entity/TradeItemBean;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C46568b0 implements InterfaceC46593z {
    @Override // p809yu.InterfaceC46593z
    /* JADX INFO: renamed from: a */
    public void mo102718a(@NotNull BaseViewHolder helper, @NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setGone(R$id.tv_price, true);
        helper.setGone(R$id.tv_money_price, true);
        helper.setGone(R$id.tv_opening_call_auction, false);
    }
}
