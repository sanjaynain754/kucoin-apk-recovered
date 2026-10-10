package com.kubi.payment.fasttradev2.coupon;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.kubi.otc.R$color;
import com.kubi.otc.R$font;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.FiatCouponListInfo;
import com.kubi.payment.util.C21457l;
import com.kubi.payment.util.Utils;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.sdk.adapter.KcBaseDifferMultiAdapter;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.math.BigDecimal;
import java.util.List;
import p270ft.C37637j0;
import p270ft.C37682s0;
import p275fy.C37728a;
import p275fy.C37732e;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: MarketingCouponListAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/MarketingCouponListAdapter;", "Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;", "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;", "<init>", "()V", "bindData", "", "Lcom/kubi/otc/databinding/MarketingCouponCardBinding;", "item", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "available", "", "switchUnsupportedReasonFold", "paymentFoldText", "Lcom/kubi/resources/widget/BaseTextView;", "paymentFoldIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "text", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketingCouponListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketingCouponListAdapter.kt\ncom/kubi/payment/fasttradev2/coupon/MarketingCouponListAdapter\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,223:1\n470#2:224\n470#2:225\n470#2:226\n*S KotlinDebug\n*F\n+ 1 MarketingCouponListAdapter.kt\ncom/kubi/payment/fasttradev2/coupon/MarketingCouponListAdapter\n*L\n88#1:224\n93#1:225\n107#1:226\n*E\n"})
public final class MarketingCouponListAdapter extends KcBaseDifferMultiAdapter<ItemFiatCouponInfo> {

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.coupon.MarketingCouponListAdapter$2 */
    /* JADX INFO: compiled from: MarketingCouponListAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C208642 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37682s0> {
        public static final C208642 INSTANCE = new C208642();

        public final C37682s0 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37682s0.m84954c(p11, viewGroup, z11);
        }

        public C208642() {
            super(3, C37682s0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/PaymentCommonItemHeaderBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37682s0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.coupon.MarketingCouponListAdapter$4 */
    /* JADX INFO: compiled from: MarketingCouponListAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C208654 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37637j0> {
        public static final C208654 INSTANCE = new C208654();

        public final C37637j0 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37637j0.m84857c(p11, viewGroup, z11);
        }

        public C208654() {
            super(3, C37637j0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/MarketingCouponCardBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37637j0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.coupon.MarketingCouponListAdapter$7 */
    /* JADX INFO: compiled from: MarketingCouponListAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C208667 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C37637j0> {
        public static final C208667 INSTANCE = new C208667();

        public final C37637j0 invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return C37637j0.m84857c(p11, viewGroup, z11);
        }

        public C208667() {
            super(3, C37637j0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/kubi/otc/databinding/MarketingCouponCardBinding;", 0);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ C37637j0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public MarketingCouponListAdapter() {
        super(new MarketingCouponItemCallback());
        C37732e.m85036d(this, new Function1() { // from class: com.kubi.payment.fasttradev2.coupon.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(MarketingCouponListAdapter.m47901x((ItemFiatCouponInfo) obj));
            }
        });
        C37732e.m85034b(this, 0, C208642.INSTANCE, new Function3() { // from class: com.kubi.payment.fasttradev2.coupon.e
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MarketingCouponListAdapter.m47902y((C37728a) obj, ((Integer) obj2).intValue(), (ItemFiatCouponInfo) obj3);
            }
        });
        C37732e.m85035c(this, 1, C208654.INSTANCE, new Function3() { // from class: com.kubi.payment.fasttradev2.coupon.f
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MarketingCouponListAdapter.m47883A(this.f39342b, (C37728a) obj, ((Integer) obj2).intValue(), (ItemFiatCouponInfo) obj3);
            }
        }, new Function4() { // from class: com.kubi.payment.fasttradev2.coupon.g
            @Override // p852kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MarketingCouponListAdapter.m47884B((C37728a) obj, ((Integer) obj2).intValue(), (ItemFiatCouponInfo) obj3, (List) obj4);
            }
        });
        C37732e.m85034b(this, 2, C208667.INSTANCE, new Function3() { // from class: com.kubi.payment.fasttradev2.coupon.h
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MarketingCouponListAdapter.m47885C(this.f39343b, (C37728a) obj, ((Integer) obj2).intValue(), (ItemFiatCouponInfo) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m47883A(MarketingCouponListAdapter marketingCouponListAdapter, C37728a holder, int i11, ItemFiatCouponInfo item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        FiatCouponListInfo.CouponInfo couponInfo = item.getCouponInfo();
        if (couponInfo != null) {
            ViewBinding viewBindingM85032b = holder.m85032b();
            Intrinsics.checkNotNullExpressionValue(viewBindingM85032b, "<get-viewBinding>(...)");
            marketingCouponListAdapter.m47903D((C37637j0) viewBindingM85032b, couponInfo, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m47884B(C37728a holder, int i11, ItemFiatCouponInfo itemFiatCouponInfo, List payload) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(itemFiatCouponInfo, "<unused var>");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Object orNull = CollectionsKt.getOrNull(payload, 0);
        Boolean bool = orNull instanceof Boolean ? (Boolean) orNull : null;
        if (bool != null) {
            ((C37637j0) holder.m85032b()).f84066b.setChecked(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m47885C(MarketingCouponListAdapter marketingCouponListAdapter, C37728a holder, int i11, ItemFiatCouponInfo item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        FiatCouponListInfo.CouponInfo couponInfo = item.getCouponInfo();
        if (couponInfo != null) {
            ViewBinding viewBindingM85032b = holder.m85032b();
            Intrinsics.checkNotNullExpressionValue(viewBindingM85032b, "<get-viewBinding>(...)");
            marketingCouponListAdapter.m47903D((C37637j0) viewBindingM85032b, couponInfo, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m47887F(C37637j0 c37637j0, FiatCouponListInfo.CouponInfo couponInfo) {
        c37637j0.f84078n.setText(couponInfo.getReason());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m47889H(final C37637j0 c37637j0, final FiatCouponListInfo.CouponInfo couponInfo, final MarketingCouponListAdapter marketingCouponListAdapter) {
        c37637j0.f84076l.setText(couponInfo.getReasonDetail());
        BaseTextView paymentShowText = c37637j0.f84074j;
        Intrinsics.checkNotNullExpressionValue(paymentShowText, "paymentShowText");
        AppCompatImageView paymentShowIcon = c37637j0.f84073i;
        Intrinsics.checkNotNullExpressionValue(paymentShowIcon, "paymentShowIcon");
        BaseTextView unsupportedReasonDetail = c37637j0.f84076l;
        Intrinsics.checkNotNullExpressionValue(unsupportedReasonDetail, "unsupportedReasonDetail");
        marketingCouponListAdapter.m47904J(couponInfo, paymentShowText, paymentShowIcon, unsupportedReasonDetail);
        AppCompatImageView paymentShowIcon2 = c37637j0.f84073i;
        Intrinsics.checkNotNullExpressionValue(paymentShowIcon2, "paymentShowIcon");
        BaseTextView paymentShowText2 = c37637j0.f84074j;
        Intrinsics.checkNotNullExpressionValue(paymentShowText2, "paymentShowText");
        C27046k.m66681D(new View[]{paymentShowIcon2, paymentShowText2}, new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketingCouponListAdapter.m47890I(couponInfo, marketingCouponListAdapter, c37637j0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final int m47901x(ItemFiatCouponInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ItemFiatCouponInfo.ItemHeader) {
            return 0;
        }
        if (it instanceof ItemFiatCouponInfo.ItemAvailable) {
            return 1;
        }
        if (it instanceof ItemFiatCouponInfo.ItemUnAvailable) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m47902y(C37728a holder, int i11, ItemFiatCouponInfo item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ((C37682s0) holder.m85032b()).f84613b.setText(item.getTitle());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final void m47903D(final C37637j0 c37637j0, final FiatCouponListInfo.CouponInfo couponInfo, boolean z11) {
        BigDecimal bigDecimalOrNull;
        Context context = c37637j0.getRoot().getContext();
        if (z11) {
            c37637j0.f84071g.setImageResource(R$mipmap.marketing_coupon_card_left_bg);
            KuCheckBox checkBox = c37637j0.f84066b;
            Intrinsics.checkNotNullExpressionValue(checkBox, "checkBox");
            ViewExtKt.m66594y(checkBox);
            c37637j0.f84066b.setClickable(false);
            c37637j0.f84066b.setChecked(couponInfo.isChecked());
            c37637j0.f84069e.setTextColor(Color.parseColor("#7780DF"));
        } else {
            c37637j0.f84071g.setImageResource(R$mipmap.marketing_coupon_card_expire_bg);
            KuCheckBox checkBox2 = c37637j0.f84066b;
            Intrinsics.checkNotNullExpressionValue(checkBox2, "checkBox");
            ViewExtKt.m66577h(checkBox2);
            c37637j0.f84069e.setTextColor(Color.parseColor("#1D1D1D"));
        }
        c37637j0.f84072h.setBackground(ContextCompat.getDrawable(context, R$mipmap.marketing_coupon_card_right_bg));
        BaseTextView baseTextView = c37637j0.f84069e;
        int i11 = R$string.payment_coupon_discount;
        String discountRate = couponInfo.getDiscountRate();
        baseTextView.setText(context.getString(i11, C27039d.m66642b((discountRate == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(discountRate)) == null) ? null : bigDecimalOrNull.movePointLeft(2))));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView);
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Utils utils = Utils.f40393a;
        highlightTextHelper.m54120f(baseTextView, TuplesKt.m90091to(textTagEnum, utils.m49849a(R$font.bold, Color.parseColor("#7780DF"), C27040e.m66659c(28.0f))));
        c37637j0.f84070f.setText(C27041f.m66668h(couponInfo.getPrizeName()));
        BaseTextView baseTextView2 = c37637j0.f84067c;
        baseTextView2.setText(context.getString(R$string.payment_coupon_max_deduction, C27041f.m66668h(couponInfo.getAmount()), C27041f.m66668h(couponInfo.getCurrency())));
        Intrinsics.checkNotNull(baseTextView2);
        int i12 = R$font.regular;
        int i13 = R$color.c_text;
        highlightTextHelper.m54120f(baseTextView2, TuplesKt.m90091to(textTagEnum, utils.m49849a(i12, ContextCompat.getColor(context, i13), C27040e.m66659c(12.0f))));
        BaseTextView baseTextView3 = c37637j0.f84068d;
        baseTextView3.setText(context.getString(R$string.payment_coupon_work_with, C27041f.m66668h(couponInfo.getPaymentMethodName())));
        Intrinsics.checkNotNull(baseTextView3);
        highlightTextHelper.m54120f(baseTextView3, TuplesKt.m90091to(textTagEnum, utils.m49849a(i12, ContextCompat.getColor(context, i13), C27040e.m66659c(12.0f))));
        long jM66652l = C27039d.m66652l(couponInfo.getExpireTime());
        if (jM66652l > 0) {
            c37637j0.f84075k.setText(context.getString(R$string.payment_coupon_expire, C42179a.m92633f(jM66652l, null, false, true, null, 11, null)));
        }
        C21457l.m49858f(new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(MarketingCouponListAdapter.m47886E(couponInfo));
            }
        }, new View[]{c37637j0.f84077m, c37637j0.f84078n}, new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketingCouponListAdapter.m47887F(c37637j0, couponInfo);
            }
        });
        C21457l.m49858f(new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(MarketingCouponListAdapter.m47888G(couponInfo));
            }
        }, new View[]{c37637j0.f84073i, c37637j0.f84074j}, new Function0() { // from class: com.kubi.payment.fasttradev2.coupon.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketingCouponListAdapter.m47889H(c37637j0, couponInfo, this);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m47886E(FiatCouponListInfo.CouponInfo couponInfo) {
        boolean z11;
        String reason = couponInfo.getReason();
        if (reason != null && reason.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m47888G(FiatCouponListInfo.CouponInfo couponInfo) {
        boolean z11;
        String reasonDetail = couponInfo.getReasonDetail();
        if (reasonDetail != null && reasonDetail.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m47890I(FiatCouponListInfo.CouponInfo couponInfo, MarketingCouponListAdapter marketingCouponListAdapter, C37637j0 c37637j0) {
        couponInfo.setUnsupportedReasonUnfold(!couponInfo.isUnsupportedReasonUnfold());
        BaseTextView paymentShowText = c37637j0.f84074j;
        Intrinsics.checkNotNullExpressionValue(paymentShowText, "paymentShowText");
        AppCompatImageView paymentShowIcon = c37637j0.f84073i;
        Intrinsics.checkNotNullExpressionValue(paymentShowIcon, "paymentShowIcon");
        BaseTextView unsupportedReasonDetail = c37637j0.f84076l;
        Intrinsics.checkNotNullExpressionValue(unsupportedReasonDetail, "unsupportedReasonDetail");
        marketingCouponListAdapter.m47904J(couponInfo, paymentShowText, paymentShowIcon, unsupportedReasonDetail);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public final void m47904J(FiatCouponListInfo.CouponInfo couponInfo, BaseTextView baseTextView, AppCompatImageView appCompatImageView, BaseTextView baseTextView2) {
        if (couponInfo.isUnsupportedReasonUnfold()) {
            appCompatImageView.setRotation(180.0f);
            baseTextView.setText(getContext().getString(R$string.payment_hide));
            ViewExtKt.m66594y(baseTextView2);
        } else {
            appCompatImageView.setRotation(0.0f);
            baseTextView.setText(getContext().getString(R$string.payment_show));
            ViewExtKt.m66577h(baseTextView2);
        }
    }
}
