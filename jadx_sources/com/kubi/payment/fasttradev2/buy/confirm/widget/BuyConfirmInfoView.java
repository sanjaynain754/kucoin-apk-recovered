package com.kubi.payment.fasttradev2.buy.confirm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$font;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.payment.widget.ConfirmCountDownView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37610d3;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: BuyConfirmInfoView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0016\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u001c\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u001fR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmInfoBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onFeeClickListener", "Lkotlin/Function0;", "", "setOnFeeClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onFinishInflate", "refreshUI", "previewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "refreshCouponInfo", "rewardInfo", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response$RewardInfo;", "isFirst", "", "isCouponInfoShow", TIMPushProvider.f75062n, "onCouponItemClick", "updateCountDownTime", "countDownTime", "", "setRefreshing", "isRefreshing", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyConfirmInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyConfirmInfoView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,167:1\n41#2:168\n65#2:169\n80#2,7:170\n172#3,2:177\n172#3,2:179\n*S KotlinDebug\n*F\n+ 1 BuyConfirmInfoView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView\n*L\n39#1:168\n39#1:169\n39#1:170,7\n117#1:177,2\n133#1:179,2\n*E\n"})
public final class BuyConfirmInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f39210p = {Reflection.property1(new PropertyReference1Impl(BuyConfirmInfoView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmInfoBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f39211n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Function0<Unit> f39212o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyConfirmInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39211n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37610d3>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37610d3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37610d3.m84802a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_buy_confirm_info, this);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m47731c(BuyConfirmInfoView buyConfirmInfoView) {
        Function0<Unit> function0 = buyConfirmInfoView.f39212o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final C37610d3 getBinding() {
        return (C37610d3) this.f39211n.getValue(this, f39210p[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m47732b(boolean z11, @NotNull Function0<Unit> onCouponItemClick) {
        Layer layer;
        C37610d3 binding;
        Layer layer2;
        Layer layer3;
        Intrinsics.checkNotNullParameter(onCouponItemClick, "onCouponItemClick");
        if (!z11) {
            C37610d3 binding2 = getBinding();
            if (binding2 == null || (layer = binding2.f83809c) == null) {
                return;
            }
            ViewExtKt.m66577h(layer);
            return;
        }
        C37610d3 binding3 = getBinding();
        if (binding3 != null && (layer3 = binding3.f83809c) != null) {
            ViewExtKt.m66594y(layer3);
        }
        Context context = getContext();
        if ((context instanceof FragmentActivity ? (FragmentActivity) context : null) == null || (binding = getBinding()) == null || (layer2 = binding.f83809c) == null) {
            return;
        }
        C27046k.m66711z(layer2, 0L, onCouponItemClick, 1, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m47734e(@NotNull BuyPreviewOrder.Response previewOrder) {
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        C37610d3 binding = getBinding();
        if (binding == null) {
            return;
        }
        List<BuyPreviewOrder.Response.BuyFeeInfo> listM66560c = C27024b.m66560c(previewOrder.getFeeInfoList());
        if (listM66560c.size() > 1) {
            AppCompatImageView ivFeeQuestion = binding.f83816j;
            Intrinsics.checkNotNullExpressionValue(ivFeeQuestion, "ivFeeQuestion");
            C27046k.m66700o(ivFeeQuestion);
        } else {
            AppCompatImageView ivFeeQuestion2 = binding.f83816j;
            Intrinsics.checkNotNullExpressionValue(ivFeeQuestion2, "ivFeeQuestion");
            C27046k.m66685H(ivFeeQuestion2);
        }
        binding.f83814h.m47743a(listM66560c);
        binding.f83821o.setText(previewOrder.getPaymentMethodName());
        binding.f83808b.setCurrency(previewOrder.getCryptoCurrency());
        binding.f83808b.m49861a(previewOrder.getPrice(), previewOrder.getFiatCurrency());
        binding.f83824r.setText(getContext().getString(R$string.payment_price, C42180b.m92640e(DowngradeExKt.m66535e(previewOrder.getCryptoAmount(), null, 1, null), null, PrecisionHelper.f39545a.m48247a(C27041f.m66668h(previewOrder.getCryptoCurrency())), false, false, false, 0, null, 125, null), C27041f.m66668h(previewOrder.getCryptoCurrency())));
    }

    /* JADX INFO: renamed from: f */
    public final void m47735f(@NotNull String countDownTime) {
        ConfirmCountDownView confirmCountDownView;
        Intrinsics.checkNotNullParameter(countDownTime, "countDownTime");
        C37610d3 binding = getBinding();
        if (binding == null || (confirmCountDownView = binding.f83808b) == null) {
            return;
        }
        confirmCountDownView.m49862b(countDownTime);
    }

    public final void setOnFeeClickListener(@Nullable Function0<Unit> listener) {
        this.f39212o = listener;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX INFO: renamed from: d */
    public final void m47733d(@Nullable BuyPreviewOrder.Response.RewardInfo rewardInfo, boolean z11) {
        BaseTextView baseTextView;
        String fiatAmount;
        String fiatCurrency;
        String fiatAmount2;
        String fiatCurrency2;
        String promotionAmount;
        String promotionCurrency;
        String promotionAmount2;
        C37610d3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f83811e) != null) {
            String promotionCurrency2 = null;
            if (z11) {
                if (rewardInfo != null) {
                    promotionAmount = rewardInfo.getPromotionAmount();
                } else {
                    promotionAmount = null;
                }
                if (promotionAmount != null && promotionAmount.length() != 0) {
                    if (rewardInfo != null) {
                        promotionCurrency = rewardInfo.getPromotionCurrency();
                    } else {
                        promotionCurrency = null;
                    }
                    if (promotionCurrency != null && promotionCurrency.length() != 0) {
                        Context context = baseTextView.getContext();
                        int i11 = R$string.payment_promotion_select_to_save;
                        if (rewardInfo != null) {
                            promotionAmount2 = rewardInfo.getPromotionAmount();
                        } else {
                            promotionAmount2 = null;
                        }
                        String strM66668h = C27041f.m66668h(promotionAmount2);
                        if (rewardInfo != null) {
                            promotionCurrency2 = rewardInfo.getPromotionCurrency();
                        }
                        baseTextView.setText(context.getString(i11, strM66668h, C27041f.m66668h(promotionCurrency2)));
                        baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text_black));
                        baseTextView.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.semi));
                        baseTextView.setBackground(ContextCompat.getDrawable(baseTextView.getContext(), R$drawable.discount_info_bg));
                        baseTextView.setPaddingRelative(C27040e.m66658b(6), C27040e.m66658b(2), C27040e.m66658b(6), C27040e.m66658b(2));
                        return;
                    }
                }
                baseTextView.setText(baseTextView.getContext().getString(R$string.payment_fast_coupon_no_coupons));
                baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text40));
                baseTextView.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.regular));
                baseTextView.setBackground(null);
                baseTextView.setPadding(0, 0, 0, 0);
                return;
            }
            if (rewardInfo != null) {
                fiatAmount = rewardInfo.getFiatAmount();
            } else {
                fiatAmount = null;
            }
            if (fiatAmount != null && fiatAmount.length() != 0) {
                if (rewardInfo != null) {
                    fiatCurrency = rewardInfo.getFiatCurrency();
                } else {
                    fiatCurrency = null;
                }
                if (fiatCurrency != null && fiatCurrency.length() != 0) {
                    Context context2 = baseTextView.getContext();
                    int i12 = R$string.payment_promotion_you_already_save;
                    if (rewardInfo != null) {
                        fiatAmount2 = rewardInfo.getFiatAmount();
                    } else {
                        fiatAmount2 = null;
                    }
                    String strM66668h2 = C27041f.m66668h(fiatAmount2);
                    if (rewardInfo != null) {
                        fiatCurrency2 = rewardInfo.getFiatCurrency();
                    } else {
                        fiatCurrency2 = null;
                    }
                    baseTextView.setText(context2.getString(i12, strM66668h2, C27041f.m66668h(fiatCurrency2)));
                    baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.brandGreen));
                } else {
                    baseTextView.setText(baseTextView.getContext().getString(R$string.payment_fast_coupon_no_coupons));
                    baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text40));
                }
            } else {
                baseTextView.setText(baseTextView.getContext().getString(R$string.payment_fast_coupon_no_coupons));
                baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text40));
            }
            baseTextView.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.regular));
            baseTextView.setBackground(null);
            baseTextView.setPadding(0, 0, 0, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C37610d3 binding = getBinding();
        if (binding == null) {
            return;
        }
        BaseTextView tvFee = binding.f83817k;
        Intrinsics.checkNotNullExpressionValue(tvFee, "tvFee");
        AppCompatImageView ivFeeQuestion = binding.f83816j;
        Intrinsics.checkNotNullExpressionValue(ivFeeQuestion, "ivFeeQuestion");
        C27046k.m66681D(new View[]{tvFee, ivFeeQuestion}, new Function0() { // from class: yt.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyConfirmInfoView.m47731c(this.f104319b);
            }
        });
    }

    public final void setRefreshing(boolean isRefreshing) {
        ConfirmCountDownView confirmCountDownView;
        C37610d3 binding = getBinding();
        if (binding != null && (confirmCountDownView = binding.f83808b) != null) {
            confirmCountDownView.setRefreshing(isRefreshing);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyConfirmInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyConfirmInfoView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
