package com.kubi.assets.options;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.CoinDetailDispatcher;
import com.kubi.assets.entity.AssetResponse;
import com.kubi.assets.options.assets.OptionsAssetListFragment;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: OptionsAssetInfoAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/options/OptionsAssetInfoAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/AssetResponse;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/assets/options/assets/OptionsAssetListFragment;", "<init>", "(Lcom/kubi/assets/options/assets/OptionsAssetListFragment;)V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OptionsAssetInfoAdapter extends BaseQuickAdapter<AssetResponse, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final OptionsAssetListFragment f18129i;

    /* JADX INFO: renamed from: j */
    public boolean f18130j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsAssetInfoAdapter(@NotNull OptionsAssetListFragment fragment) {
        super(R$layout.item_asset_cross_account);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f18129i = fragment;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m18107i(OptionsAssetInfoAdapter optionsAssetInfoAdapter, AssetResponse assetResponse) {
        CoinDetailDispatcher.f16880U.start(optionsAssetInfoAdapter.f18129i, 6, assetResponse.getCurrency(), assetResponse);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final AssetResponse entity) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        boolean z11 = C27039d.m66647g(entity.getTotalAmount()) + C27039d.m66647g(entity.getHoldAmount()) == 0.0d;
        int i11 = R$id.tv_all_price;
        helper.setGone(i11, !z11);
        int i12 = R$id.tv_useful_price;
        helper.setGone(i12, !z11);
        int i13 = R$id.tv_debt_price;
        helper.setGone(i13, !z11);
        int i14 = R$id.tv_all_amount;
        View view = helper.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i15 = R$id.tv_useful_amount;
        View view2 = helper.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C44172b.m97383c((TextView) view2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i16 = R$id.tv_debt_amount;
        View view3 = helper.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C44172b.m97383c((TextView) view3, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        if (z11) {
            OptionsAssetListFragment optionsAssetListFragment = this.f18129i;
            int i17 = R$color.c_text40;
            helper.setTextColor(i14, optionsAssetListFragment.getColorRes(i17));
            helper.setTextColor(i15, this.f18129i.getColorRes(i17));
            helper.setTextColor(i16, this.f18129i.getColorRes(i17));
        } else {
            OptionsAssetListFragment optionsAssetListFragment2 = this.f18129i;
            int i18 = R$color.c_text;
            helper.setTextColor(i14, optionsAssetListFragment2.getColorRes(i18));
            helper.setTextColor(i15, this.f18129i.getColorRes(i18));
            helper.setTextColor(i16, this.f18129i.getColorRes(i18));
        }
        helper.setText(R$id.tv_coin_name, C27041f.m66668h(entity.getCurrencyName())).setText(R$id.tv_all_label, R$string.total).setText(i14, entity.getTotalBalanceStr()).setText(i11, entity.getTotalBalancePriceStr()).setText(R$id.tv_useful_label, R$string.useful).setText(i15, entity.getAvailableBalanceStr()).setText(i12, entity.getAvailableBalancePriceStr()).setText(R$id.tv_debt_label, R$string.lock).setText(i16, entity.getLiabilityStr()).setText(i13, entity.getLiabilityPriceStr());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.options.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsAssetInfoAdapter.m18107i(this.f18157b, entity);
            }
        }, 1, null);
        C24277v.m58542g((ImageView) helper.getView(R$id.iv_icon), C27041f.m66668h(entity.getIconUrl()));
        ShowHideTextView.m54778d(helper.itemView, this.f18130j);
    }

    /* JADX INFO: renamed from: j */
    public final void m18109j(boolean z11) {
        this.f18130j = z11;
    }
}
