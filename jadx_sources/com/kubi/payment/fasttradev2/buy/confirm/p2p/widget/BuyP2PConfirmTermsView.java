package com.kubi.payment.fasttradev2.buy.confirm.p2p.widget;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
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
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.user.api.site.protocol.b;
import com.kubi.utils.extensions.C27025c;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37615e3;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: BuyP2PConfirmTermsView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/p2p/widget/BuyP2PConfirmTermsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmTermsBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmTermsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onFinishInflate", "", "isTermsChecked", "", "initView", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyP2PConfirmTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyP2PConfirmTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/p2p/widget/BuyP2PConfirmTermsView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,97:1\n41#2:98\n65#2:99\n80#2,7:100\n*S KotlinDebug\n*F\n+ 1 BuyP2PConfirmTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/p2p/widget/BuyP2PConfirmTermsView\n*L\n32#1:98\n32#1:99\n32#1:100,7\n*E\n"})
public final class BuyP2PConfirmTermsView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f39192c = {Reflection.property1(new PropertyReference1Impl(BuyP2PConfirmTermsView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmTermsBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f39193b;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.p2p.widget.BuyP2PConfirmTermsView$a */
    /* JADX INFO: compiled from: BuyP2PConfirmTermsView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/confirm/p2p/widget/BuyP2PConfirmTermsView$initView$1$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20786a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseTextView f39194b;

        public C20786a(BaseTextView baseTextView) {
            this.f39194b = baseTextView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C37304a c37304a = C37304a.f82764a;
            String strDecode = Uri.decode(b.a.d());
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f39194b.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.p2p.widget.BuyP2PConfirmTermsView$b */
    /* JADX INFO: compiled from: BuyP2PConfirmTermsView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/confirm/p2p/widget/BuyP2PConfirmTermsView$initView$1$1$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20787b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseTextView f39195b;

        public C20787b(BaseTextView baseTextView) {
            this.f39195b = baseTextView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C37304a c37304a = C37304a.f82764a;
            String strDecode = Uri.decode(b.a.a());
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f39195b.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyP2PConfirmTermsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39193b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37615e3>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.p2p.widget.BuyP2PConfirmTermsView$special$$inlined$viewBinding$1
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
        return (C37615e3) this.f39193b.getValue(this, f39192c[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m47709a() {
        BaseTextView baseTextView;
        C37615e3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f83845c) != null) {
            String string = baseTextView.getContext().getString(R$string.contract_user_agreement);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = baseTextView.getContext().getString(R$string.privacy_policy);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            SpannableString spannableString = new SpannableString(baseTextView.getContext().getString(R$string.register_read_agree_protocol, string, string2));
            spannableString.setSpan(new C20786a(baseTextView), StringsKt.indexOf$default((CharSequence) spannableString, string, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, string, 0, false, 6, (Object) null) + string.length(), 18);
            spannableString.setSpan(new C20787b(baseTextView), StringsKt.indexOf$default((CharSequence) spannableString, string2, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, string2, 0, false, 6, (Object) null) + string2.length(), 18);
            baseTextView.setText(spannableString);
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47710b() {
        Boolean boolValueOf;
        KuCheckBox kuCheckBox;
        C37615e3 binding = getBinding();
        if (binding != null && (kuCheckBox = binding.f83844b) != null) {
            boolValueOf = Boolean.valueOf(kuCheckBox.isChecked());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47709a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyP2PConfirmTermsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyP2PConfirmTermsView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
