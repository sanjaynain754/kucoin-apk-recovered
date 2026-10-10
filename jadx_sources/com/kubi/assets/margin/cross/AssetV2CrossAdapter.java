package com.kubi.assets.margin.cross;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.margin.api.entity.FundsInfo;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: AssetV2CrossAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/margin/api/entity/FundsInfo;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;", "<init>", "(Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;)V", "getFragment", "()Lcom/kubi/assets/margin/cross/AssetV2CrossFragment;", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetV2CrossAdapter extends BaseQuickAdapter<FundsInfo, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AssetV2CrossFragment f17985i;

    /* JADX INFO: renamed from: j */
    public boolean f17986j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2CrossAdapter(@NotNull AssetV2CrossFragment fragment) {
        super(R$layout.item_asset_cross_account);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f17985i = fragment;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m17803i(FundsInfo fundsInfo) {
        InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(fundsInfo.getCurrency()), 3L, null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final FundsInfo entity) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        boolean z11 = C27039d.m66647g(entity.getTotalBalance()) + C27039d.m66647g(entity.getLiability()) == 0.0d;
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
            AssetV2CrossFragment assetV2CrossFragment = this.f17985i;
            int i17 = R$color.c_text40;
            helper.setTextColor(i14, assetV2CrossFragment.getColorRes(i17));
            helper.setTextColor(i15, this.f17985i.getColorRes(i17));
            helper.setTextColor(i16, this.f17985i.getColorRes(i17));
        } else {
            AssetV2CrossFragment assetV2CrossFragment2 = this.f17985i;
            int i18 = R$color.c_text;
            helper.setTextColor(i14, assetV2CrossFragment2.getColorRes(i18));
            helper.setTextColor(i15, this.f17985i.getColorRes(i18));
            helper.setTextColor(i16, this.f17985i.getColorRes(i18));
        }
        helper.setText(R$id.tv_coin_name, C27041f.m66668h(entity.getCurrencyName())).setText(R$id.tv_all_label, R$string.total_assets).setText(i14, entity.getTotalBalanceStr()).setText(i11, entity.getTotalBalancePriceStr()).setText(R$id.tv_useful_label, R$string.useful).setText(i15, entity.getAvailableBalanceStr()).setText(i12, entity.getAvailableBalancePriceStr()).setText(R$id.tv_debt_label, R$string.debt).setText(i16, entity.getLiabilityStr()).setText(i13, entity.getLiabilityPriceStr());
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2CrossAdapter.m17803i(entity);
            }
        }, 1, null);
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(entity.getCurrency()));
        C24277v.m58542g((ImageView) helper.getView(R$id.iv_icon), C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null));
        ShowHideTextView.m54778d(helper.itemView, this.f17986j);
    }

    /* JADX INFO: renamed from: j */
    public final void m17805j(boolean z11) {
        this.f17986j = z11;
    }
}
