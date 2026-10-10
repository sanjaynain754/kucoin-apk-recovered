package com.kubi.assets.bill;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import e60.C37084b;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AccountBillSearchCoinDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/assets/bill/AccountBillSearchCoinDialog$adapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/bill/AccountBillSearchCoinDialog$SearchCoinItemInfo;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AccountBillSearchCoinDialog$adapter$1 extends BaseQuickAdapter<AccountBillSearchCoinDialog.SearchCoinItemInfo, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AccountBillSearchCoinDialog f16678i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBillSearchCoinDialog$adapter$1(AccountBillSearchCoinDialog accountBillSearchCoinDialog, int i11) {
        super(i11);
        this.f16678i = accountBillSearchCoinDialog;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AccountBillSearchCoinDialog.SearchCoinItemInfo item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.name;
        BaseViewHolder text = helper.setText(i11, C27041f.m66677q(item.getCurrency()));
        int i12 = R$id.fullName;
        text.setText(i12, item.getName());
        C37890n c37890n = C37890n.f85269a;
        String strM66677q = C27041f.m66677q(item.getCurrency());
        if (strM66677q == null) {
            strM66677q = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(strM66677q);
        C24277v.m58542g((ImageView) helper.getView(R$id.ivCoinIcon), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
        View view = helper.getView(R$id.ivSelectIcon);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        AssetExKt.m15138z(view, item.getIsChecked());
        View view2 = helper.itemView;
        final AccountBillSearchCoinDialog accountBillSearchCoinDialog = this.f16678i;
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.bill.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                AccountBillSearchCoinDialog$adapter$1.m15686i(accountBillSearchCoinDialog, item, view3);
            }
        });
        if (StringsKt.isBlank(this.f16678i.f16667y0)) {
            return;
        }
        View view3 = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C37084b.m83008c((TextView) view3, this.f16678i.f16667y0);
        View view4 = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C37084b.m83008c((TextView) view4, this.f16678i.f16667y0);
    }

    /* JADX INFO: renamed from: i */
    public static final void m15686i(AccountBillSearchCoinDialog accountBillSearchCoinDialog, AccountBillSearchCoinDialog.SearchCoinItemInfo searchCoinItemInfo, View view) {
        Function1 function1 = accountBillSearchCoinDialog.f16660r0;
        if (function1 != null) {
            function1.invoke(searchCoinItemInfo.getCurrency());
        }
        accountBillSearchCoinDialog.dismiss();
    }
}
