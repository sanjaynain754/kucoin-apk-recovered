package com.kubi.core.biz.margininfo.dialog;

import android.view.View;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.tradecorebiz.R$id;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyLoanCurrencySelectDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$adapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/core/biz/margininfo/dialog/UnifyLoanCurrencySelectDialog$LoanCurrencyItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifyLoanCurrencySelectDialog$adapter$1 extends BaseQuickAdapter<UnifyLoanCurrencySelectDialog.LoanCurrencyItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ UnifyLoanCurrencySelectDialog f20462i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyLoanCurrencySelectDialog$adapter$1(UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog, int i11) {
        super(i11);
        this.f20462i = unifyLoanCurrencySelectDialog;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m21891i(UnifyLoanCurrencySelectDialog.LoanCurrencyItem loanCurrencyItem, UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog) {
        Pair pair = new Pair(loanCurrencyItem.getOriginalCurrency(), DowngradeExKt.m66534d(C6447a.m11724a(loanCurrencyItem.getLeverage()).toPlainString(), new BigDecimal(10)));
        Function1 function1 = unifyLoanCurrencySelectDialog.f20452r0;
        if (function1 != null) {
            function1.invoke(pair);
        }
        unifyLoanCurrencySelectDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final UnifyLoanCurrencySelectDialog.LoanCurrencyItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tvCurrency, C27041f.m66677q(item.getName())).setText(R$id.tvLeverage, C6447a.m11724a(item.getLeverage()).toPlainString() + 'x');
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialog = this.f20462i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyLoanCurrencySelectDialog$adapter$1.m21891i(item, unifyLoanCurrencySelectDialog);
            }
        }, 1, null);
    }
}
