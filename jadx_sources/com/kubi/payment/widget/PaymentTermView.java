package com.kubi.payment.widget;

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
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.payment.data.entities.TermInfo;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37766r;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37695u3;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: PaymentTermView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/payment/widget/PaymentTermView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewTermBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewTermBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setInitialData", "", "businessType", "", "paymentMethodCode", "channelId", "loadTerms", "request", "Lcom/kubi/payment/data/entities/TermInfo$Request;", "isTermsChecked", "", "refreshUI", "termInfo", "Lcom/kubi/payment/data/entities/TermInfo$Response;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentTermView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentTermView.kt\ncom/kubi/payment/widget/PaymentTermView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,134:1\n41#2:135\n65#2:136\n80#2,7:137\n296#3:144\n*S KotlinDebug\n*F\n+ 1 PaymentTermView.kt\ncom/kubi/payment/widget/PaymentTermView\n*L\n38#1:135\n38#1:136\n38#1:137,7\n83#1:144\n*E\n"})
public final class PaymentTermView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f40408c = {Reflection.property1(new PropertyReference1Impl(PaymentTermView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewTermBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f40409b;

    /* JADX INFO: renamed from: com.kubi.payment.widget.PaymentTermView$a */
    /* JADX INFO: compiled from: PaymentTermView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/widget/PaymentTermView$refreshUI$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21459a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TermInfo.Response f40410b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PaymentTermView f40411c;

        public C21459a(TermInfo.Response response, PaymentTermView paymentTermView) {
            this.f40410b = response;
            this.f40411c = paymentTermView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C27041f.m66668h(this.f40410b.getTermsUrl()), null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f40411c.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.widget.PaymentTermView$b */
    /* JADX INFO: compiled from: PaymentTermView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/widget/PaymentTermView$refreshUI$1$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21460b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TermInfo.Response f40412b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PaymentTermView f40413c;

        public C21460b(TermInfo.Response response, PaymentTermView paymentTermView) {
            this.f40412b = response;
            this.f40413c = paymentTermView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C27041f.m66668h(this.f40412b.getPrivacyUrl()), null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f40413c.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentTermView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40409b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37695u3>() { // from class: com.kubi.payment.widget.PaymentTermView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37695u3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37695u3.m84981a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_term, this);
    }

    private final C37695u3 getBinding() {
        return (C37695u3) this.f40409b.getValue(this, f40408c[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m49902d(TermInfo.Response response) {
        BaseTextView baseTextView;
        if (response == null || C27041f.m66668h(response.getTermsContent()).length() == 0) {
            C27046k.m66700o(this);
            return;
        }
        C27046k.m66685H(this);
        C37695u3 binding = getBinding();
        if (binding == null || (baseTextView = binding.f84743c) == null) {
            return;
        }
        baseTextView.setText(C27041f.m66668h(response.getTermsContent()));
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new C21459a(response, this)), new Pair(HighlightTextHelper.TextTagEnum.SPAN2, new C21460b(response, this)));
    }

    /* JADX INFO: renamed from: e */
    public final void m49903e(@NotNull String businessType, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        m49901c(new TermInfo.Request(str, str2, businessType));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m49900b() {
        Boolean boolValueOf;
        KuCheckBox kuCheckBox;
        if (getVisibility() != 8) {
            C37695u3 binding = getBinding();
            if (binding != null && (kuCheckBox = binding.f84742b) != null) {
                boolValueOf = Boolean.valueOf(kuCheckBox.isChecked());
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m49901c(TermInfo.Request request) {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new PaymentTermView$loadTerms$1$1(request, lifecycleOwner, this, null), 3, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentTermView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentTermView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
