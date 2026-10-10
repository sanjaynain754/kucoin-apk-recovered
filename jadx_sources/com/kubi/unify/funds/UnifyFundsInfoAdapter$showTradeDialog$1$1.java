package com.kubi.unify.funds;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.unify.R$color;
import com.kubi.unify.R$id;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37886j;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import l10.C42025b;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyFundsInfoAdapter.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/unify/funds/UnifyFundsInfoAdapter$showTradeDialog$1$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/data/entity/TradeItemBean;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifyFundsInfoAdapter$showTradeDialog$1$1 extends BaseQuickAdapter<TradeItemBean, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ View f53185i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ DialogFragmentHelper f53186j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyFundsInfoAdapter$showTradeDialog$1$1(List<? extends TradeItemBean> list, View view, DialogFragmentHelper dialogFragmentHelper, int i11) {
        super(i11, list);
        this.f53185i = view;
        this.f53186j = dialogFragmentHelper;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m65168i(TradeItemBean tradeItemBean, DialogFragmentHelper dialogFragmentHelper) {
        InterfaceC37754f.a.m85140l(C37304a.f82764a, tradeItemBean.getSymbol(), null, null, null, null, null, 62, null);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final TradeItemBean item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final DialogFragmentHelper dialogFragmentHelper = this.f53186j;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.unify.funds.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyFundsInfoAdapter$showTradeDialog$1$1.m65168i(item, dialogFragmentHelper);
            }
        }, 1, null);
        helper.setText(R$id.tvSymbol, item.getShowSymbol());
        int i11 = R$id.price;
        helper.setText(i11, C37886j.m85579c(new BigDecimal(String.valueOf(item.getLastDealPrice())), item.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        Context context = this.f53185i.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Double changeRate = item.getChangeRate();
        BigDecimal bigDecimalM89922G = C41014a.m89922G(changeRate != null ? new BigDecimal(String.valueOf(changeRate.doubleValue())) : null, null, 1, null);
        int i12 = R$color.c_text30;
        helper.setTextColor(i11, C22890g.m54280e(context, bigDecimalM89922G, i12));
        int i13 = R$id.priceLegal;
        Resources resources = helper.itemView.getResources();
        if (item.getLastDealPrice() != 0.0d) {
            i12 = R$color.c_text40;
        }
        helper.setTextColor(i13, resources.getColor(i12));
        helper.setText(i13, C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(item.getLastDealPrice(), item.getSymbolInfoEntity().getQuoteCurrency()))), null, null, 0, false, false, true, 31, null));
        int i14 = R$id.tv_change_rate;
        View view = helper.getView(i14);
        View view2 = this.f53185i;
        ShapeTextView shapeTextView = (ShapeTextView) view;
        C42025b shapeDrawableBuilder = shapeTextView.getShapeDrawableBuilder();
        Context context2 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Double changeRate2 = item.getChangeRate();
        shapeDrawableBuilder.m92151m(C22890g.m54280e(context2, C41014a.m89922G(changeRate2 != null ? new BigDecimal(String.valueOf(changeRate2.doubleValue())) : null, null, 1, null), R$color.emphasis30));
        shapeTextView.getShapeDrawableBuilder().m92143e();
        helper.setText(i14, item.getFormatChangeRateV2());
    }
}
