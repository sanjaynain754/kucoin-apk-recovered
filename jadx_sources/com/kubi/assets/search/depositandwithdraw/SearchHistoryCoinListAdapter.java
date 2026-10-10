package com.kubi.assets.search.depositandwithdraw;

import android.widget.ImageView;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.util.C24277v;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchHistoryCoinListAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/CoinInfoEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchHistoryCoinListAdapter extends BaseQuickAdapter<CoinInfoEntity, BaseViewHolder> {
    public SearchHistoryCoinListAdapter() {
        super(R$layout.kucoin_new_search_header_item);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @Nullable CoinInfoEntity coinInfoEntity) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (coinInfoEntity != null) {
            helper.setText(R$id.tv_item, AssetExKt.m15123k(coinInfoEntity));
            C24277v.m58540e(helper.itemView.getContext(), coinInfoEntity.getIconUrl(), (ImageView) helper.getView(R$id.iv_icon));
        }
    }
}
