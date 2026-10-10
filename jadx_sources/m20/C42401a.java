package m20;

import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.C27096v0;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: m20.a */
/* JADX INFO: compiled from: DelegationListBaseItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegationList/DelegationListBaseItemView;", "Lcom/kubi/spot/business/delegation/delegationList/IDelegationListTradeTypeItemView;", "<init>", "()V", "isBuy", "", "()Z", "setBuy", "(Z)V", "isMarket", "setMarket", "isQuote", "setQuote", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "delegationListFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C42401a implements InterfaceC42418r {

    /* JADX INFO: renamed from: a */
    public boolean f94017a;

    /* JADX INFO: renamed from: b */
    public boolean f94018b;

    /* JADX INFO: renamed from: c */
    public boolean f94019c;

    @Override // m20.InterfaceC42418r
    /* JADX INFO: renamed from: a */
    public void mo93102a(@NotNull BaseViewHolder helper, @NotNull DelegationEntity item, @NotNull BaseFragment delegationListFragment) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(delegationListFragment, "delegationListFragment");
        this.f94017a = StringsKt.equals(item.getSide(), "buy", true);
        boolean zIsMarket = item.isMarket(1);
        this.f94018b = zIsMarket;
        this.f94019c = zIsMarket && this.f94017a;
        helper.setText(R$id.tvDealAndTotalAmount, new C27096v0().append("0.00").append(" / ").m66905e(item.getAmountFormatterStr(item.getSize(), this.f94019c), delegationListFragment.getColorRes(R$color.c_text40)));
        helper.setGone(R$id.tvDealPercent, false);
        helper.setGone(R$id.tv_trigger_price_label, true);
        helper.setGone(R$id.tv_trigger_price, true);
        helper.setText(R$id.tv_limit_price, item.getPriceFormatterStr(item.getPrice()));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF94018b() {
        return this.f94018b;
    }
}
