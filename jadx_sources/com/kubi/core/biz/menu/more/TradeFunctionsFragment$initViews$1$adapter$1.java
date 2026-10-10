package com.kubi.core.biz.menu.more;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.resources.MenuItem;
import com.kubi.sdk.util.C24256n1;
import com.kubi.tradecorebiz.R$id;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeFunctionsFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/core/biz/menu/more/TradeFunctionsFragment$initViews$1$adapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/resources/MenuItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeFunctionsFragment$initViews$1$adapter$1 extends BaseQuickAdapter<MenuItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TradeFunctionsFragment f20515i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeFunctionsFragment$initViews$1$adapter$1(TradeFunctionsFragment tradeFunctionsFragment, int i11, List<MenuItem> list) {
        super(i11, list);
        this.f20515i = tradeFunctionsFragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final MenuItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final TradeFunctionsFragment tradeFunctionsFragment = this.f20515i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.core.biz.menu.more.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFunctionsFragment$initViews$1$adapter$1.m21987i(item, helper, this, tradeFunctionsFragment);
            }
        }, 1, null);
        int i11 = R$id.tvLabel;
        View view = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C24256n1.m58513c((TextView) view);
        BaseViewHolder text = helper.setText(i11, item.getText());
        int i12 = R$id.ivIcon;
        text.setImageResource(i12, item.getIcon()).setVisible(R$id.dot, item.getDot());
        Integer tint = item.getTint();
        if (tint != null) {
            int iIntValue = tint.intValue();
            ImageView imageView = (ImageView) helper.getView(i12);
            Intrinsics.checkNotNull(imageView);
            C27046k.m66701p(imageView, iIntValue);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m21987i(MenuItem menuItem, BaseViewHolder baseViewHolder, TradeFunctionsFragment$initViews$1$adapter$1 tradeFunctionsFragment$initViews$1$adapter$1, TradeFunctionsFragment tradeFunctionsFragment) throws Exception {
        BiConsumer<Integer, BaseQuickAdapter<MenuItem, BaseViewHolder>> biConsumerM54357a = menuItem.m54357a();
        if (biConsumerM54357a != null) {
            biConsumerM54357a.accept(Integer.valueOf(baseViewHolder.getAdapterPosition()), tradeFunctionsFragment$initViews$1$adapter$1);
        }
        Function0<Unit> function0M21984k3 = tradeFunctionsFragment.m21984k3();
        if (function0M21984k3 != null) {
            function0M21984k3.invoke();
        }
        return Unit.INSTANCE;
    }
}
