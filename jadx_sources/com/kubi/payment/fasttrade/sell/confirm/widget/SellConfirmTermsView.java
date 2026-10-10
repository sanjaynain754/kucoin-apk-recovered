package com.kubi.payment.fasttrade.sell.confirm.widget;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmTermsView;
import com.kubi.payment.service.IPaymentSiteService;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37700v3;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: SellConfirmTermsView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewTermsBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewTermsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isTermsChecked", "", "onFinishInflate", "", "initView", "onTermsClick", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellConfirmTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellConfirmTermsView.kt\ncom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,112:1\n41#2:113\n65#2:114\n80#2,7:115\n17#3,2:122\n*S KotlinDebug\n*F\n+ 1 SellConfirmTermsView.kt\ncom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView\n*L\n34#1:113\n34#1:114\n34#1:115,7\n61#1:122,2\n*E\n"})
public final class SellConfirmTermsView extends LinearLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f38915d = {Reflection.property1(new PropertyReference1Impl(SellConfirmTermsView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewTermsBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f38916b;

    /* JADX INFO: renamed from: c */
    public boolean f38917c;

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmTermsView$a */
    /* JADX INFO: compiled from: SellConfirmTermsView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView$initView$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSellConfirmTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellConfirmTermsView.kt\ncom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView$initView$1$1\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,112:1\n17#2,2:113\n*S KotlinDebug\n*F\n+ 1 SellConfirmTermsView.kt\ncom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView$initView$1$1\n*L\n69#1:113,2\n*E\n"})
    public static final class C20651a extends ClickableSpan {
        public C20651a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            String strMo45624d;
            Intrinsics.checkNotNullParameter(widget, "widget");
            Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h == null || (strMo45624d = ((IPaymentSiteService) objM56186h).mo45624d()) == null) {
                strMo45624d = "https://www.eurlita.com/terms-of-use/";
            }
            InterfaceC37766r.a.m85190a(C37304a.f82764a, strMo45624d, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(SellConfirmTermsView.this.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmTermsView$b */
    /* JADX INFO: compiled from: SellConfirmTermsView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView$initView$1$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSellConfirmTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellConfirmTermsView.kt\ncom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView$initView$1$2\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,112:1\n17#2,2:113\n*S KotlinDebug\n*F\n+ 1 SellConfirmTermsView.kt\ncom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmTermsView$initView$1$2\n*L\n83#1:113,2\n*E\n"})
    public static final class C20652b extends ClickableSpan {
        public C20652b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            String strMo45623c;
            Intrinsics.checkNotNullParameter(widget, "widget");
            Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h == null || (strMo45623c = ((IPaymentSiteService) objM56186h).mo45623c()) == null) {
                strMo45623c = "https://www.eurlita.com/privacy-policy/";
            }
            InterfaceC37766r.a.m85190a(C37304a.f82764a, strMo45623c, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(SellConfirmTermsView.this.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellConfirmTermsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38916b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37700v3>() { // from class: com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmTermsView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37700v3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37700v3.m84989a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_terms, this);
    }

    private final C37700v3 getBinding() {
        return (C37700v3) this.f38916b.getValue(this, f38915d[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m47099d() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        boolean z11 = this.f38917c;
        this.f38917c = !z11;
        if (z11) {
            C37700v3 binding = getBinding();
            if (binding == null || (appCompatImageView = binding.f84771b) == null) {
                return;
            }
            appCompatImageView.setImageResource(R$drawable.ic_radio_unselect_20);
            return;
        }
        C37700v3 binding2 = getBinding();
        if (binding2 == null || (appCompatImageView2 = binding2.f84771b) == null) {
            return;
        }
        appCompatImageView2.setImageResource(R$drawable.ic_checkbox_select_20);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m47097c(SellConfirmTermsView sellConfirmTermsView) {
        sellConfirmTermsView.m47099d();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m47098b() {
        BaseTextView baseTextView;
        String strMo45621a;
        C37700v3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f84772c) != null) {
            Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h == null || (strMo45621a = ((IPaymentSiteService) objM56186h).mo45621a()) == null) {
                strMo45621a = "Eurlita";
            }
            baseTextView.setText(getContext().getString(R$string.payment_fast_sell_terms, strMo45621a, strMo45621a));
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C20651a()), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new C20652b()));
        }
        C27046k.m66711z(this, 0L, new Function0() { // from class: vt.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellConfirmTermsView.m47097c(this.f102953b);
            }
        }, 1, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47098b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SellConfirmTermsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SellConfirmTermsView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
