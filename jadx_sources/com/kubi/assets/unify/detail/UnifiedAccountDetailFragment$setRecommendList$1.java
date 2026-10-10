package com.kubi.assets.unify.detail;

import android.content.Context;
import android.view.View;
import com.kubi.assets.R$id;
import com.kubi.resources.C22890g;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import p365jb.InterfaceC40366c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/assets/unify/detail/UnifiedAccountDetailFragment$setRecommendList$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/unify/detail/data/UnifiedRecommendSymbol;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifiedAccountDetailFragment$setRecommendList$1 extends BaseQuickAdapter<InterfaceC40366c, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Consumer<InterfaceC40366c> f18965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedAccountDetailFragment$setRecommendList$1(Consumer<InterfaceC40366c> consumer, int i11) {
        super(i11);
        this.f18965i = consumer;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final InterfaceC40366c item) {
        String strM85563b;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        BaseViewHolder text = helper.setText(R$id.tv_coin_name, item.getShowSymbol());
        int i11 = R$id.tv_coin_lastDealPrice;
        if (item.getEmpty()) {
            strM85563b = "- -";
        } else {
            BigDecimal lastDealPrice = item.getLastDealPrice();
            strM85563b = lastDealPrice != null ? C37885i.m85563b(lastDealPrice, item.getSymbol(), 0, 2, null) : null;
        }
        BaseViewHolder text2 = text.setText(i11, strM85563b);
        int i12 = R$id.tv_coin_changeRate;
        BaseViewHolder text3 = text2.setText(i12, item.getFormatChangeRate());
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        text3.setTextColor(i12, C22890g.m54279d(mContext, C27039d.m66647g(item.getChangeRate()), 0, 2, null));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final Consumer<InterfaceC40366c> consumer = this.f18965i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.unify.detail.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifiedAccountDetailFragment$setRecommendList$1.m19805i(consumer, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m19805i(Consumer consumer, InterfaceC40366c interfaceC40366c) throws Exception {
        consumer.accept(interfaceC40366c);
        return Unit.INSTANCE;
    }
}
