package com.kubi.spot.business.delegation;

import android.view.View;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.spot.R$id;
import com.kubi.spot.business.delegation.assets.AccountItemEntity;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeFundsListFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/spot/business/delegation/TradeFundsListFragment$onAddFundsBtnClick$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/spot/business/delegation/AddFundsItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeFundsListFragment$onAddFundsBtnClick$1$1 extends BaseQuickAdapter<AddFundsItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AccountItemEntity f49928i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogFragmentHelper f49929j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeFundsListFragment$onAddFundsBtnClick$1$1(AccountItemEntity accountItemEntity, DialogFragmentHelper dialogFragmentHelper, int i11, List<AddFundsItem> list) {
        super(i11, list);
        this.f49928i = accountItemEntity;
        this.f49929j = dialogFragmentHelper;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AddFundsItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tv_add_funds_name, item.getName());
        helper.setText(R$id.tv_add_funds_desc, item.getDesc());
        helper.setImageResource(R$id.iv_add_funds_icon, item.getIcon());
        View view = helper.itemView;
        final AccountItemEntity accountItemEntity = this.f49928i;
        final DialogFragmentHelper dialogFragmentHelper = this.f49929j;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.spot.business.delegation.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TradeFundsListFragment$onAddFundsBtnClick$1$1.m60704i(item, accountItemEntity, dialogFragmentHelper, view2);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final void m60704i(AddFundsItem addFundsItem, AccountItemEntity accountItemEntity, DialogFragmentHelper dialogFragmentHelper, View view) {
        Function1<String, Unit> onItemClick = addFundsItem.getOnItemClick();
        String currency = accountItemEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        onItemClick.invoke(currency);
        dialogFragmentHelper.dismiss();
    }
}
