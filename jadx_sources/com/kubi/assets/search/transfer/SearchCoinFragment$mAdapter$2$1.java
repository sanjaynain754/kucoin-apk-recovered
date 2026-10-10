package com.kubi.assets.search.transfer;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.StringEx;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchCoinFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/assets/search/transfer/SearchCoinFragment$mAdapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/CoinInfoEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchCoinFragment$mAdapter$2$1 extends BaseQuickAdapter<CoinInfoEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SearchCoinFragment f18655i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCoinFragment$mAdapter$2$1(SearchCoinFragment searchCoinFragment, int i11) {
        super(i11);
        this.f18655i = searchCoinFragment;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m19121i(CoinInfoEntity coinInfoEntity, SearchCoinFragment searchCoinFragment) {
        C43852m.m96591c("B1deposit", "searchResult", "1", null, 8, null);
        Intent intent = new Intent();
        intent.putExtra("type", 1);
        intent.putExtra(CoinInfoEntity.class.getName(), coinInfoEntity);
        intent.putExtra("spm", C43852m.m96601m("B1deposit", "searchResult", "1"));
        FragmentActivity activity = searchCoinFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        searchCoinFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final CoinInfoEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final SearchCoinFragment searchCoinFragment = this.f18655i;
        int i11 = R$id.tv_coin_name;
        StringEx.Companion companion = StringEx.INSTANCE;
        String currency = item.getCurrency();
        Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
        helper.setText(i11, companion.xbt2btc4Java(currency));
        helper.setText(R$id.tv_coin_name_full, item.getName());
        int i12 = R$id.iv_icon;
        C24277v.m58542g((ImageView) helper.getView(i12), item.getIconUrl());
        View view = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        String iconUrl = item.getIconUrl();
        AssetExKt.m15138z(view, !(iconUrl == null || iconUrl.length() == 0));
        View view2 = helper.getView(R$id.ll_root);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.assets.search.transfer.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchCoinFragment$mAdapter$2$1.m19121i(item, searchCoinFragment);
            }
        }, 1, null);
    }
}
