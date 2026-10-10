package com.kubi.payment.fasttradev2.coupon;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$color;
import com.kubi.otc.R$font;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.FiatCouponInfo;
import com.kubi.payment.fasttradev2.FastTradeViewModel;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.payment.util.RoundedBackgroundSpan;
import com.kubi.payment.util.Utils;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37637j0;
import p270ft.C37642k0;
import p429lf.C42179a;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: MarketingCouponDisplayDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\f\u0010\u001b\u001a\u00020\u0019*\u00020\u000bH\u0002J\u0016\u0010\u001c\u001a\u00020\u0019*\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\"\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0019H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0019H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006+"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponDisplayDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewModel", "Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "getViewModel", "()Lcom/kubi/payment/fasttradev2/FastTradeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/otc/databinding/MarketingCouponLayoutBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/MarketingCouponLayoutBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initCardView", "Lcom/kubi/otc/databinding/MarketingCouponCardBinding;", "response", "Lcom/kubi/payment/fast/data/entities/FiatCouponInfo$Response;", "formateTime", "Lkotlin/Triple;", "", "expireTime", "", "dismiss", "onCancel", "dialog", "Landroid/content/DialogInterface;", "saveFrequency", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketingCouponDisplayDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketingCouponDisplayDialog.kt\ncom/kubi/payment/fasttradev2/coupon/MarketingCouponDisplayDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,195:1\n172#2,9:196\n143#3,20:205\n470#4:225\n470#4:226\n*S KotlinDebug\n*F\n+ 1 MarketingCouponDisplayDialog.kt\ncom/kubi/payment/fasttradev2/coupon/MarketingCouponDisplayDialog\n*L\n39#1:196,9\n41#1:205,20\n83#1:225\n121#1:226\n*E\n"})
public final class MarketingCouponDisplayDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f39327q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f39328r0 = C45681e.m100799e(this, new Function1<MarketingCouponDisplayDialog, C37642k0>() { // from class: com.kubi.payment.fasttradev2.coupon.MarketingCouponDisplayDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37642k0 invoke(@NotNull MarketingCouponDisplayDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37642k0.m84867a(fragment.requireView());
        }
    }, new Function1<C37642k0, Unit>() { // from class: com.kubi.payment.fasttradev2.coupon.MarketingCouponDisplayDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37642k0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37642k0 c37642k0) {
            invoke(c37642k0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f39326t0 = {Reflection.property1(new PropertyReference1Impl(MarketingCouponDisplayDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/MarketingCouponLayoutBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f39325s0 = new Companion(null);

    /* JADX INFO: compiled from: MarketingCouponDisplayDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponDisplayDialog$Companion;", "", "<init>", "()V", "ONE_DAY_TO_MILLISECOND", "", "ONE_HOUR_TO_MILLISECOND", "ONE_MINUTE_TO_MILLISECOND", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final C37642k0 m47878m4() {
        return (C37642k0) this.f39328r0.getValue(this, f39326t0[0]);
    }

    /* JADX INFO: renamed from: n4 */
    public final FastTradeViewModel m47879n4() {
        return (FastTradeViewModel) this.f39327q0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        m47882s4();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.marketing_coupon_layout, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37642k0 c37642k0M47878m4 = m47878m4();
        if (c37642k0M47878m4 != null) {
            m47881p4(c37642k0M47878m4);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m47881p4(C37642k0 c37642k0) {
        c37642k0.f84134h.setScaleX(getResources().getConfiguration().getLayoutDirection() == 1 ? -1.0f : 1.0f);
        AppCompatImageView ivClose = c37642k0.f84131e;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketingCouponDisplayDialog.m47875q4(this.f39340b);
            }
        }, 1, null);
        Context context = c37642k0.getRoot().getContext();
        FiatCouponInfo.Response value = m47879n4().m47314o0().getValue();
        BaseTextView baseTextView = c37642k0.f84135i;
        Triple<String, String, String> tripleM47877l4 = m47877l4(C27039d.m66652l(value != null ? value.getExpireTime() : null));
        baseTextView.setText(getString(R$string.payment_coupon_countdown, tripleM47877l4.getFirst(), tripleM47877l4.getSecond(), tripleM47877l4.getThird()));
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        int color = Color.parseColor("#D3F475");
        int color2 = ContextCompat.getColor(context, R$color.c_text_black);
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView);
        highlightTextHelper.m54120f(baseTextView, TuplesKt.m90091to(HighlightTextHelper.TextTagEnum.SPAN, new RoundedBackgroundSpan(color, color2, 0.0f, 0.0f, 0.0f, 28, null)), TuplesKt.m90091to(HighlightTextHelper.TextTagEnum.SPAN1, new RoundedBackgroundSpan(color, color2, 0.0f, 0.0f, 0.0f, 28, null)), TuplesKt.m90091to(HighlightTextHelper.TextTagEnum.SPAN2, new RoundedBackgroundSpan(color, color2, 0.0f, 0.0f, 0.0f, 28, null)));
        C37637j0 fastTradeMarketingCouponCard = c37642k0.f84130d;
        Intrinsics.checkNotNullExpressionValue(fastTradeMarketingCouponCard, "fastTradeMarketingCouponCard");
        m47880o4(fastTradeMarketingCouponCard, value);
        KcPrimaryButton confirmButton = c37642k0.f84129c;
        Intrinsics.checkNotNullExpressionValue(confirmButton, "confirmButton");
        C27046k.m66711z(confirmButton, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketingCouponDisplayDialog.m47876r4(this.f39341b);
            }
        }, 1, null);
    }

    public MarketingCouponDisplayDialog() {
        final Function0 function0 = null;
        this.f39327q0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FastTradeViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.payment.fasttradev2.coupon.MarketingCouponDisplayDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.payment.fasttradev2.coupon.MarketingCouponDisplayDialog$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.payment.fasttradev2.coupon.MarketingCouponDisplayDialog$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m47875q4(MarketingCouponDisplayDialog marketingCouponDisplayDialog) {
        marketingCouponDisplayDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m47876r4(MarketingCouponDisplayDialog marketingCouponDisplayDialog) {
        marketingCouponDisplayDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        m47882s4();
    }

    /* JADX INFO: renamed from: l4 */
    public final Triple<String, String, String> m47877l4(long j11) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        long jCurrentTimeMillis = j11 - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            long j12 = 86400000;
            strValueOf = String.valueOf(jCurrentTimeMillis / j12);
            long j13 = 3600000;
            strValueOf3 = String.valueOf((jCurrentTimeMillis % j12) / j13);
            strValueOf2 = String.valueOf((jCurrentTimeMillis % j13) / ((long) 60000));
        } else {
            strValueOf = "00";
            strValueOf2 = "00";
            strValueOf3 = strValueOf2;
        }
        return new Triple<>(strValueOf, strValueOf3, strValueOf2);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m47880o4(C37637j0 c37637j0, FiatCouponInfo.Response response) {
        BigDecimal bigDecimalMovePointLeft;
        String prizeName;
        String amount;
        String currency;
        String paymentMethodName;
        String discountRate;
        BigDecimal bigDecimalOrNull;
        Context context = c37637j0.getRoot().getContext();
        KuCheckBox checkBox = c37637j0.f84066b;
        Intrinsics.checkNotNullExpressionValue(checkBox, "checkBox");
        ViewExtKt.m66577h(checkBox);
        c37637j0.f84071g.setImageResource(R$mipmap.marketing_coupon_card_left_bg);
        c37637j0.f84072h.setBackground(ContextCompat.getDrawable(context, R$mipmap.marketing_coupon_card_right_bg));
        BaseTextView baseTextView = c37637j0.f84069e;
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        int i11 = R$string.payment_coupon_discount;
        Long expireTime = null;
        if (response != null && (discountRate = response.getDiscountRate()) != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(discountRate)) != null) {
            bigDecimalMovePointLeft = bigDecimalOrNull.movePointLeft(2);
        } else {
            bigDecimalMovePointLeft = null;
        }
        baseTextView.setText(getString(i11, C27039d.m66642b(bigDecimalMovePointLeft)));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView);
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Utils utils = Utils.f40393a;
        highlightTextHelper.m54120f(baseTextView, TuplesKt.m90091to(textTagEnum, utils.m49849a(R$font.bold, Color.parseColor("#7780DF"), C27040e.m66659c(28.0f))));
        BaseTextView baseTextView2 = c37637j0.f84070f;
        if (response != null) {
            prizeName = response.getPrizeName();
        } else {
            prizeName = null;
        }
        baseTextView2.setText(C27041f.m66668h(prizeName));
        BaseTextView baseTextView3 = c37637j0.f84067c;
        baseTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        int i12 = R$string.payment_coupon_max_deduction;
        if (response != null) {
            amount = response.getAmount();
        } else {
            amount = null;
        }
        String strM66668h = C27041f.m66668h(amount);
        if (response != null) {
            currency = response.getCurrency();
        } else {
            currency = null;
        }
        baseTextView3.setText(getString(i12, strM66668h, C27041f.m66668h(currency)));
        Intrinsics.checkNotNull(baseTextView3);
        int i13 = R$font.regular;
        int i14 = R$color.c_text;
        highlightTextHelper.m54120f(baseTextView3, TuplesKt.m90091to(textTagEnum, utils.m49849a(i13, ContextCompat.getColor(context, i14), C27040e.m66659c(12.0f))));
        BaseTextView baseTextView4 = c37637j0.f84068d;
        baseTextView4.setMovementMethod(LinkMovementMethod.getInstance());
        int i15 = R$string.payment_coupon_work_with;
        if (response != null) {
            paymentMethodName = response.getPaymentMethodName();
        } else {
            paymentMethodName = null;
        }
        baseTextView4.setText(getString(i15, C27041f.m66668h(paymentMethodName)));
        Intrinsics.checkNotNull(baseTextView4);
        highlightTextHelper.m54120f(baseTextView4, TuplesKt.m90091to(textTagEnum, utils.m49849a(i13, ContextCompat.getColor(context, i14), C27040e.m66659c(12.0f))));
        if (response != null) {
            expireTime = response.getExpireTime();
        }
        long jM66652l = C27039d.m66652l(expireTime);
        if (jM66652l > 0) {
            c37637j0.f84075k.setText(getString(R$string.payment_coupon_expire, C42179a.m92633f(jM66652l, null, false, true, null, 11, null)));
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m47882s4() {
        float fFloatValue;
        String frequency;
        Float floatOrNull;
        FiatCouponInfo.Response value = m47879n4().m47314o0().getValue();
        if (value != null && (frequency = value.getFrequency()) != null && (floatOrNull = StringsKt.toFloatOrNull(frequency)) != null) {
            fFloatValue = floatOrNull.floatValue();
        } else {
            fFloatValue = 24.0f;
        }
        C46392a.m102333p(PaymentStorageId.f40364a.m49825c(), C27099x.m66919i(TuplesKt.m90091to(Float.valueOf(fFloatValue), Long.valueOf(System.currentTimeMillis())), false, 2, null));
    }
}
