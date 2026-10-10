package com.kubi.transfer.search.coin;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.sdk.util.C24277v;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.lib.R$color;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.lib.R$layout;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.StringEx;
import e60.C37084b;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SearchCoinAdapter.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u001e\u0010\f\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/transfer/search/coin/SearchCoinAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/transfer/entity/AccountCoin;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "filterText", "", "replaceData", "data", "", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchCoinAdapter extends BaseQuickAdapter<AccountCoin, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f52865i;

    public SearchCoinAdapter() {
        super(R$layout.btransfer_item_search_coin);
        setHasStableIds(true);
        this.f52865i = "";
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable AccountCoin accountCoin) {
        if (accountCoin == null) {
            return;
        }
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(accountCoin.getAvailableBalance(), null, 1, null);
        if (baseViewHolder != null) {
            String currencyName = accountCoin.getCurrencyName();
            String strM66668h = (currencyName == null || currencyName.length() == 0) ? C27041f.m66668h(accountCoin.getCurrency()) : accountCoin.getCurrencyName();
            String currencyFullName = accountCoin.getCurrencyFullName();
            String strM66668h2 = (currencyFullName == null || currencyFullName.length() == 0) ? C27041f.m66668h(accountCoin.getCurrency()) : accountCoin.getCurrencyFullName();
            int i11 = R$id.tv_coin_name;
            baseViewHolder.setText(i11, StringEx.INSTANCE.xbt2btc4Java(strM66668h));
            int i12 = R$id.tv_coin_name_full;
            baseViewHolder.setText(i12, strM66668h2);
            if (!StringsKt.isBlank(this.f52865i)) {
                View view = baseViewHolder.getView(i11);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                C37084b.m83008c((TextView) view, this.f52865i);
                View view2 = baseViewHolder.getView(i12);
                Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                C37084b.m83008c((TextView) view2, this.f52865i);
            }
            int i13 = R$id.tv_balance;
            baseViewHolder.setText(i13, C37885i.m85563b(bigDecimalM66535e, C27041f.m66668h(accountCoin.getCurrency()), 0, 2, null));
            int i14 = R$id.tv_legal_symbol_price;
            baseViewHolder.setText(i14, C41014a.m89950x(DowngradeExKt.m66538h(accountCoin.getAvailableBaseLegalCurrency(), 0.0d, 1, null), null, null, 0, false, false, false, false, 127, null));
            Context context = this.mContext;
            BigDecimal bigDecimal = BigDecimal.ZERO;
            baseViewHolder.setTextColor(i13, ContextCompat.getColor(context, bigDecimalM66535e.compareTo(bigDecimal) > 0 ? R$color.c_text : R$color.c_text40));
            baseViewHolder.setGone(i14, bigDecimalM66535e.compareTo(bigDecimal) > 0);
            C24277v.m58542g((ImageView) baseViewHolder.getView(R$id.iv_icon), accountCoin.getIconUrl());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m64638h(@NotNull Collection<AccountCoin> data, @NotNull String filterText) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(filterText, "filterText");
        this.f52865i = filterText;
        super.replaceData(data);
    }
}
