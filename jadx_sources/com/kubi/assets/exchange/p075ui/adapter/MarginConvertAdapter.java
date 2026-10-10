package com.kubi.assets.exchange.p075ui.adapter;

import android.widget.ImageView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.exchange.model.MarginConvertItem;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33954u6;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p754xa.GroupHeaderItem;
import p754xa.LineItem;
import p754xa.SectionHeaderItem;
import p754xa.TitleHeaderItem;
import p754xa.TokenItem;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarginConvertAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/adapter/MarginConvertAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/assets/exchange/model/MarginConvertItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "<init>", "(Ljava/util/List;)V", "convert", "", C33954u6.f72238i, "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginConvertAdapter extends BaseMultiItemQuickAdapter<MarginConvertItem, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder holder, @NotNull MarginConvertItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof SectionHeaderItem) {
            holder.setText(R$id.tvSectionTitle, ((SectionHeaderItem) item).getTitle());
            return;
        }
        if (item instanceof GroupHeaderItem) {
            GroupHeaderItem groupHeaderItem = (GroupHeaderItem) item;
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(groupHeaderItem.getTag());
            holder.setText(R$id.tvGroupTitle, C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, StringsKt.replace$default(groupHeaderItem.getTag(), C33820nf.f71144W, "/", false, 4, (Object) null)));
            return;
        }
        if (item instanceof TitleHeaderItem) {
            holder.setText(R$id.tvAssetFilterTip, this.mContext.getString(R$string.kc_convert_less_balance, ((TitleHeaderItem) item).getBalance()));
            return;
        }
        if (item instanceof LineItem) {
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (!(item instanceof TokenItem)) {
            throw new NoWhenBranchMatchedException();
        }
        TokenItem tokenItem = (TokenItem) item;
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(tokenItem.getCurrency()));
        holder.setText(R$id.tvCoinName, C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, C27041f.m66668h(tokenItem.getCurrency())));
        int i11 = R$id.tvAvailableAmount;
        BigDecimal availableAmount = tokenItem.getAvailableAmount();
        holder.setText(i11, C27041f.m66668h(availableAmount != null ? C37886j.m85578b(availableAmount, tokenItem.getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null));
        ((ImageView) holder.getView(R$id.ivCheck)).setSelected(tokenItem.getIsSelected());
        Unit unit2 = Unit.INSTANCE;
    }

    public MarginConvertAdapter(@Nullable List<? extends MarginConvertItem> list) {
        super(list);
        addItemType(1, R$layout.asset_item_section_header);
        addItemType(2, R$layout.asset_item_group_header);
        addItemType(3, R$layout.asset_header_filter_available);
        addItemType(4, R$layout.asset_item_trading_convert);
        addItemType(5, R$layout.asset_item_line);
    }
}
