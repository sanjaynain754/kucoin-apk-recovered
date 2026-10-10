package com.kubi.home.rank.impl;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.DiffUtil;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.home.api.RankNewCoin;
import com.kubi.home.rank.impl.cache.RankItem;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RankListAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankItemDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/kubi/home/rank/impl/cache/RankItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankItemDiffCallBack extends DiffUtil.ItemCallback<RankItem> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull RankItem oldItem, @NotNull RankItem newItem) {
        Drawable changeRateBg;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!oldItem.isNewCoin() || !newItem.isNewCoin()) {
            TradeItemBean tradeItemBean = oldItem.getTradeItemBean();
            String symbol = tradeItemBean != null ? tradeItemBean.getSymbol() : null;
            TradeItemBean tradeItemBean2 = newItem.getTradeItemBean();
            return Intrinsics.areEqual(symbol, tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null) && Intrinsics.areEqual(oldItem.getPriceString(), newItem.getPriceString()) && (changeRateBg = oldItem.getChangeRateBg()) != null && changeRateBg.equals(newItem.getChangeRateBg()) && Intrinsics.areEqual(oldItem.getMoneyPriceString(), newItem.getMoneyPriceString()) && oldItem.getValueTvShow() == newItem.getValueTvShow() && Intrinsics.areEqual(oldItem.getValueString(), newItem.getValueString()) && oldItem.getChangeRateColor() == newItem.getChangeRateColor() && Intrinsics.areEqual(oldItem.getChangeRateString(), newItem.getChangeRateString()) && Intrinsics.areEqual(oldItem.getIconUrl(), newItem.getIconUrl()) && Intrinsics.areEqual(oldItem.getCoinLabel(), newItem.getCoinLabel());
        }
        TradeItemBean tradeItemBean3 = oldItem.getTradeItemBean();
        String symbol2 = tradeItemBean3 != null ? tradeItemBean3.getSymbol() : null;
        TradeItemBean tradeItemBean4 = newItem.getTradeItemBean();
        if (Intrinsics.areEqual(symbol2, tradeItemBean4 != null ? tradeItemBean4.getSymbol() : null) && Intrinsics.areEqual(oldItem.getPriceString(), newItem.getPriceString()) && Intrinsics.areEqual(oldItem.getMoneyPriceString(), newItem.getMoneyPriceString())) {
            RankNewCoin rankNewCoin = oldItem.getRankNewCoin();
            String iconUrl = rankNewCoin != null ? rankNewCoin.getIconUrl() : null;
            RankNewCoin rankNewCoin2 = newItem.getRankNewCoin();
            if (Intrinsics.areEqual(iconUrl, rankNewCoin2 != null ? rankNewCoin2.getIconUrl() : null)) {
                RankNewCoin rankNewCoin3 = oldItem.getRankNewCoin();
                String fullName = rankNewCoin3 != null ? rankNewCoin3.getFullName() : null;
                RankNewCoin rankNewCoin4 = newItem.getRankNewCoin();
                if (Intrinsics.areEqual(fullName, rankNewCoin4 != null ? rankNewCoin4.getFullName() : null) && Intrinsics.areEqual(oldItem.getChangeRateString(), newItem.getChangeRateString()) && oldItem.getChangeRateColor() == newItem.getChangeRateColor() && Intrinsics.areEqual(oldItem.getRankNewCoinOpeningTime(), newItem.getRankNewCoinOpeningTime()) && Intrinsics.areEqual(oldItem.getRankNewCoinChangeRateString(), newItem.getRankNewCoinChangeRateString()) && oldItem.getRankNewCoinTextColor() == newItem.getRankNewCoinTextColor()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull RankItem oldItem, @NotNull RankItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!oldItem.isNewCoin() || !newItem.isNewCoin()) {
            TradeItemBean tradeItemBean = oldItem.getTradeItemBean();
            String symbol = tradeItemBean != null ? tradeItemBean.getSymbol() : null;
            TradeItemBean tradeItemBean2 = newItem.getTradeItemBean();
            return Intrinsics.areEqual(symbol, tradeItemBean2 != null ? tradeItemBean2.getSymbol() : null);
        }
        TradeItemBean tradeItemBean3 = oldItem.getTradeItemBean();
        String symbol2 = tradeItemBean3 != null ? tradeItemBean3.getSymbol() : null;
        TradeItemBean tradeItemBean4 = newItem.getTradeItemBean();
        if (!Intrinsics.areEqual(symbol2, tradeItemBean4 != null ? tradeItemBean4.getSymbol() : null)) {
            return false;
        }
        RankNewCoin rankNewCoin = oldItem.getRankNewCoin();
        String currency = rankNewCoin != null ? rankNewCoin.getCurrency() : null;
        RankNewCoin rankNewCoin2 = newItem.getRankNewCoin();
        if (!Intrinsics.areEqual(currency, rankNewCoin2 != null ? rankNewCoin2.getCurrency() : null)) {
            return false;
        }
        RankNewCoin rankNewCoin3 = oldItem.getRankNewCoin();
        String fullName = rankNewCoin3 != null ? rankNewCoin3.getFullName() : null;
        RankNewCoin rankNewCoin4 = newItem.getRankNewCoin();
        return Intrinsics.areEqual(fullName, rankNewCoin4 != null ? rankNewCoin4.getFullName() : null);
    }
}
