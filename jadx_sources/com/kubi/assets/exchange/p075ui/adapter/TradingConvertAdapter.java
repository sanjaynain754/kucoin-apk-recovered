package com.kubi.assets.exchange.p075ui.adapter;

import android.widget.ImageView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.RedeemableEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradingConvertAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u001e\u0010\r\u001a\u00020\n2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\bR\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/adapter/TradingConvertAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/RedeemableEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", TUIConstants.TUIContact.SELECTED_LIST, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "convert", "", "helper", "item", "setSelectedList", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingConvertAdapter extends BaseQuickAdapter<RedeemableEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public ArrayList<RedeemableEntity> f17282i;

    public TradingConvertAdapter() {
        super(R$layout.asset_item_trading_convert);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull RedeemableEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(item.getCurrency()));
        BaseViewHolder text = helper.setText(R$id.tvCoinName, C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, C27041f.m66668h(item.getCurrency())));
        int i11 = R$id.tvAvailableAmount;
        BigDecimal availableAmount = item.getAvailableAmount();
        text.setText(i11, availableAmount != null ? C37886j.m85578b(availableAmount, item.getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null);
        ImageView imageView = (ImageView) helper.getView(R$id.ivCheck);
        ArrayList<RedeemableEntity> arrayList = this.f17282i;
        boolean z11 = false;
        if (arrayList != null && arrayList.contains(item)) {
            z11 = true;
        }
        imageView.setSelected(z11);
    }

    /* JADX INFO: renamed from: h */
    public final void m16504h(@NotNull ArrayList<RedeemableEntity> selectedList) {
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        this.f17282i = selectedList;
    }
}
