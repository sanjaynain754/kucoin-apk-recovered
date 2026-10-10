package com.kubi.payment.fasttradev2.buy.confirm.widget;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.service.IPaymentSiteService;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37615e3;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: BuyConfirmTermsView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmTermsBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmTermsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onFinishInflate", "", "isTermsChecked", "", "initView", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyConfirmTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyConfirmTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,98:1\n41#2:99\n65#2:100\n80#2,7:101\n17#3,2:108\n*S KotlinDebug\n*F\n+ 1 BuyConfirmTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView\n*L\n34#1:99\n34#1:100\n34#1:101,7\n57#1:108,2\n*E\n"})
public final class BuyConfirmTermsView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f39215c = {Reflection.property1(new PropertyReference1Impl(BuyConfirmTermsView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmTermsBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f39216b;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmTermsView$a */
    /* JADX INFO: compiled from: BuyConfirmTermsView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView$initView$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBuyConfirmTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyConfirmTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView$initView$1$1\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,98:1\n17#2,2:99\n*S KotlinDebug\n*F\n+ 1 BuyConfirmTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView$initView$1$1\n*L\n65#1:99,2\n*E\n"})
    public static final class C20792a extends ClickableSpan {
        public C20792a() {
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
            ds2.setColor(ContextCompat.getColor(BuyConfirmTermsView.this.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmTermsView$b */
    /* JADX INFO: compiled from: BuyConfirmTermsView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView$initView$1$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBuyConfirmTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyConfirmTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView$initView$1$2\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,98:1\n17#2,2:99\n*S KotlinDebug\n*F\n+ 1 BuyConfirmTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmTermsView$initView$1$2\n*L\n81#1:99,2\n*E\n"})
    public static final class C20793b extends ClickableSpan {
        public C20793b() {
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
            ds2.setColor(ContextCompat.getColor(BuyConfirmTermsView.this.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyConfirmTermsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39216b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37615e3>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmTermsView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37615e3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37615e3.m84812a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_buy_confirm_terms, this);
    }

    private final C37615e3 getBinding() {
        return (C37615e3) this.f39216b.getValue(this, f39215c[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m47741a() {
        BaseTextView baseTextView;
        String strMo45621a;
        C37615e3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f83845c) != null) {
            Object objM56186h = Router.f46192a.m56186h(IPaymentSiteService.class, SiteInfoManager.f47913a.m58109c());
            if (objM56186h == null || (strMo45621a = ((IPaymentSiteService) objM56186h).mo45621a()) == null) {
                strMo45621a = "Eurlita";
            }
            baseTextView.setText(getContext().getString(R$string.payment_fast_terms, strMo45621a, strMo45621a));
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C20792a()), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new C20793b()));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47741a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyConfirmTermsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyConfirmTermsView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
