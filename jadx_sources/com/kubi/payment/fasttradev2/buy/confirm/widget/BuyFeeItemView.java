package com.kubi.payment.fasttradev2.buy.confirm.widget;

import android.content.Context;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37600b3;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: BuyFeeItemView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFeeItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmFeeItemViewBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmFeeItemViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "feeInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$BuyFeeInfo;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyFeeItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyFeeItemView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFeeItemView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,83:1\n41#2:84\n65#2:85\n80#2,7:86\n*S KotlinDebug\n*F\n+ 1 BuyFeeItemView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFeeItemView\n*L\n25#1:84\n25#1:85\n25#1:86,7\n*E\n"})
public final class BuyFeeItemView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f39219c = {Reflection.property1(new PropertyReference1Impl(BuyFeeItemView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmFeeItemViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f39220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyFeeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39220b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37600b3>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFeeItemView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37600b3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37600b3.m84784a(C45682f.m100801b(viewGroup));
            }
        });
        setOrientation(1);
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_buy_confirm_fee_item_view, this);
    }

    private final C37600b3 getBinding() {
        return (C37600b3) this.f39220b.getValue(this, f39219c[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m47742a(@Nullable BuyPreviewOrder.Response.BuyFeeInfo buyFeeInfo) {
        String feeAmount;
        String feeCurrency;
        String originalFeeAmount;
        String tips;
        String feeCurrency2;
        C37600b3 binding = getBinding();
        if (binding != null) {
            Context context = getContext();
            int i11 = R$string.payment_price;
            String feeCurrency3 = null;
            if (buyFeeInfo != null) {
                feeAmount = buyFeeInfo.getFeeAmount();
            } else {
                feeAmount = null;
            }
            String strM66669i = C27041f.m66669i(feeAmount, "--");
            if (buyFeeInfo != null) {
                feeCurrency = buyFeeInfo.getFeeCurrency();
            } else {
                feeCurrency = null;
            }
            String string = context.getString(i11, strM66669i, C27041f.m66669i(feeCurrency, "--"));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (buyFeeInfo != null) {
                originalFeeAmount = buyFeeInfo.getOriginalFeeAmount();
            } else {
                originalFeeAmount = null;
            }
            String strM66668h = C27041f.m66668h(originalFeeAmount);
            if (buyFeeInfo != null) {
                tips = buyFeeInfo.getTips();
            } else {
                tips = null;
            }
            String strM66668h2 = C27041f.m66668h(tips);
            if (strM66668h.length() > 0) {
                Context context2 = getContext();
                int i12 = R$string.payment_fee_message;
                if (buyFeeInfo != null) {
                    feeCurrency2 = buyFeeInfo.getFeeCurrency();
                } else {
                    feeCurrency2 = null;
                }
                String string2 = context2.getString(i12, strM66668h, C27041f.m66669i(feeCurrency2, "--"));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                if (strM66668h2.length() > 0) {
                    BaseTextView baseTextView = binding.f83655c;
                    Context context3 = getContext();
                    int i13 = R$string.payment_revoult_fee_message;
                    if (buyFeeInfo != null) {
                        feeCurrency3 = buyFeeInfo.getFeeCurrency();
                    }
                    baseTextView.setText(context3.getString(i13, strM66668h2, strM66668h, C27041f.m66669i(feeCurrency3, "--")));
                } else {
                    binding.f83655c.setText(string2);
                }
                HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
                BaseTextView tvOriginalFeeValue = binding.f83655c;
                Intrinsics.checkNotNullExpressionValue(tvOriginalFeeValue, "tvOriginalFeeValue");
                highlightTextHelper.m54120f(tvOriginalFeeValue, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new StrikethroughSpan()));
                BaseTextView tvOriginalFeeValue2 = binding.f83655c;
                Intrinsics.checkNotNullExpressionValue(tvOriginalFeeValue2, "tvOriginalFeeValue");
                C27046k.m66685H(tvOriginalFeeValue2);
                binding.f83654b.setText(string);
                return;
            }
            BaseTextView tvOriginalFeeValue3 = binding.f83655c;
            Intrinsics.checkNotNullExpressionValue(tvOriginalFeeValue3, "tvOriginalFeeValue");
            C27046k.m66700o(tvOriginalFeeValue3);
            if (strM66668h2.length() > 0) {
                binding.f83654b.setText(getContext().getString(i11, strM66668h2, string));
                binding.f83654b.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text40));
                binding.f83654b.setTextSize(13.0f);
                return;
            }
            binding.f83654b.setText(string);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyFeeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyFeeItemView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
