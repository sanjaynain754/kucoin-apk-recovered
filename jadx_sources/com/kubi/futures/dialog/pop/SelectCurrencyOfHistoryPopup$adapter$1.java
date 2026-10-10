package com.kubi.futures.dialog.pop;

import android.view.View;
import android.widget.ImageView;
import com.kubi.futures.dialog.pop.SelectCurrencyOfHistoryPopup$adapter$1;
import com.kubi.sdk.util.C24277v;
import com.kubi.tradebase.R$id;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import p203di.C36703k;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SelectCurrencyOfHistoryPopup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/futures/dialog/pop/SelectCurrencyOfHistoryPopup$adapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/futures/history/filter/CurrencyClickFilter$FilterChooseCoin;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SelectCurrencyOfHistoryPopup$adapter$1 extends BaseQuickAdapter<C36703k.FilterChooseCoin, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SelectCurrencyOfHistoryPopup f22880i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCurrencyOfHistoryPopup$adapter$1(SelectCurrencyOfHistoryPopup selectCurrencyOfHistoryPopup, int i11, ArrayList<C36703k.FilterChooseCoin> arrayList) {
        super(i11, arrayList);
        this.f22880i = selectCurrencyOfHistoryPopup;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final C36703k.FilterChooseCoin item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tvName, item.getName());
        helper.setText(R$id.tv_coin_name_full, item.getFullName());
        helper.itemView.setSelected(item.getIsChecked());
        C24277v.m58540e(this.mContext, item.getIconUrl(), (ImageView) helper.getView(R$id.iv_icon));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final SelectCurrencyOfHistoryPopup selectCurrencyOfHistoryPopup = this.f22880i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: xh.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectCurrencyOfHistoryPopup$adapter$1.m25311i(selectCurrencyOfHistoryPopup, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m25311i(SelectCurrencyOfHistoryPopup selectCurrencyOfHistoryPopup, C36703k.FilterChooseCoin filterChooseCoin) {
        selectCurrencyOfHistoryPopup.f22875F.invoke(filterChooseCoin.getCode());
        selectCurrencyOfHistoryPopup.m96331y();
        return Unit.INSTANCE;
    }
}
