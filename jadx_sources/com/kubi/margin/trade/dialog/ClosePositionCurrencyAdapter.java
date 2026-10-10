package com.kubi.margin.trade.dialog;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.RadioButton;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import nf.C42828b;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClosePositionCurrencyAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/ClosePositionCurrencyAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", C33954u6.f72238i, "item", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ClosePositionCurrencyAdapter extends BaseQuickAdapter<ClosePositionCurrency, BaseViewHolder> {
    public ClosePositionCurrencyAdapter() {
        super(R$layout.bmargin_dialog_margin_close_currency_item_layout);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable final ClosePositionCurrency closePositionCurrency) {
        final RadioButton radioButton;
        if (closePositionCurrency == null || baseViewHolder == null || (radioButton = (RadioButton) baseViewHolder.getView(R$id.tvCurrency)) == null) {
            return;
        }
        Context context = radioButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        radioButton.setText(C42828b.m93915p(closePositionCurrency.displayName(context)));
        radioButton.setChecked(closePositionCurrency.isChecked());
        radioButton.setTypeface(radioButton.isChecked() ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        C27046k.m66711z(radioButton, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClosePositionCurrencyAdapter.m40054i(radioButton, closePositionCurrency);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m40054i(RadioButton radioButton, ClosePositionCurrency closePositionCurrency) {
        ClosePositionCurrency closePositionCurrency2;
        if (radioButton.isChecked()) {
            closePositionCurrency2 = closePositionCurrency;
        } else {
            closePositionCurrency2 = null;
        }
        closePositionCurrency.getSelectedCallback().invoke(closePositionCurrency2);
        return Unit.INSTANCE;
    }
}
