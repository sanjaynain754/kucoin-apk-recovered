package com.kubi.assets.search.depositandwithdraw;

import android.text.TextUtils;
import android.widget.ImageView;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SubscriptionInfoEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchHotCoinListAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/CoinInfoEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "buildCoinListItem", "itemType", "", "getItemEnabled", "", "getItemEnableSubscribe", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchHotCoinListAdapter extends BaseQuickAdapter<CoinInfoEntity, BaseViewHolder> {
    /* JADX INFO: renamed from: i */
    public final boolean m19061i(CoinInfoEntity coinInfoEntity) {
        SubscriptionInfoEntity subscriptionInfo;
        SubscriptionInfoEntity subscriptionInfo2;
        String subscribeRecordId = null;
        if (!C27025c.m66566d((coinInfoEntity == null || (subscriptionInfo2 = coinInfoEntity.getSubscriptionInfo()) == null) ? null : subscriptionInfo2.getEnableSubscribe())) {
            return false;
        }
        if (coinInfoEntity != null && (subscriptionInfo = coinInfoEntity.getSubscriptionInfo()) != null) {
            subscribeRecordId = subscriptionInfo.getSubscribeRecordId();
        }
        return !TextUtils.isEmpty(C27041f.m66668h(subscribeRecordId));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19062j(CoinInfoEntity coinInfoEntity, int i11) {
        return i11 == 5 ? coinInfoEntity.isDepositEnabled() : coinInfoEntity.isWithdrawEnabled();
    }

    public SearchHotCoinListAdapter() {
        super(R$layout.kucoin_new_item_coin_list);
    }

    /* JADX INFO: renamed from: g */
    public final void m19059g(@NotNull BaseViewHolder baseViewHolder, int i11, @NotNull CoinInfoEntity item) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        double dM66646f = C27039d.m66646f(Double.valueOf(item.getAvailableBalance()));
        int i12 = R$id.tv_coin_name;
        baseViewHolder.setText(i12, AssetExKt.m15123k(item));
        baseViewHolder.setText(R$id.tv_coin_name_full, item.getName());
        if (m19062j(item, i11)) {
            baseViewHolder.setTextColor(i12, C27017c.f54310a.m66512a(R$color.emphasis));
            baseViewHolder.setGone(R$id.tv_pause, false);
            baseViewHolder.setGone(R$id.tv_subscript, false);
        } else {
            if (m19061i(item)) {
                baseViewHolder.setGone(R$id.tv_subscript, true);
                baseViewHolder.setGone(R$id.tv_pause, false);
            } else {
                baseViewHolder.setGone(R$id.tv_subscript, false);
                baseViewHolder.setGone(R$id.tv_pause, true);
            }
            baseViewHolder.setTextColor(i12, C27017c.f54310a.m66512a(R$color.emphasis60));
        }
        if (i11 == 3) {
            int i13 = R$id.tv_balance;
            baseViewHolder.setGone(i13, !(dM66646f == 0.0d));
            baseViewHolder.setText(i13, C37885i.m85563b(new BigDecimal(String.valueOf(dM66646f)), item.getCode(), 0, 2, null));
            int i14 = R$id.tv_legal_symbol_price;
            baseViewHolder.setGone(i14, !(dM66646f == 0.0d));
            baseViewHolder.setText(i14, C41014a.m89950x(C41014a.m89939m(dM66646f, item.getCode()), null, null, 0, false, false, false, false, 127, null));
        } else if (i11 == 5 || i11 == 10) {
            baseViewHolder.setGone(R$id.tv_balance, false);
        }
        C24277v.m58540e(baseViewHolder.itemView.getContext(), item.getIconUrl(), (ImageView) baseViewHolder.getView(R$id.iv_icon));
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @Nullable CoinInfoEntity coinInfoEntity) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (coinInfoEntity != null) {
            m19059g(helper, 5, coinInfoEntity);
        }
    }
}
