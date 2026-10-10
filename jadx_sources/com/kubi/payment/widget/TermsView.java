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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37700v3;
import p852kotlin.Deprecated;
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

/* JADX INFO: compiled from: TermsView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/widget/TermsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewTermsBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewTermsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isTermsChecked", "", "onFinishInflate", "", "setupView", "companyName", "", "termsOfUseUrl", "privacyPolicyUrl", "initView", "onTermsClick", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TermsView.kt\ncom/kubi/payment/widget/TermsView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,101:1\n41#2:102\n65#2:103\n80#2,7:104\n*S KotlinDebug\n*F\n+ 1 TermsView.kt\ncom/kubi/payment/widget/TermsView\n*L\n31#1:102\n31#1:103\n31#1:104,7\n*E\n"})
public final class TermsView extends LinearLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f40418d = {Reflection.property1(new PropertyReference1Impl(TermsView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewTermsBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f40419b;

    /* JADX INFO: renamed from: c */
    public boolean f40420c;

    /* JADX INFO: renamed from: com.kubi.payment.widget.TermsView$a */
    /* JADX INFO: compiled from: TermsView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/widget/TermsView$setupView$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21462a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f40421b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TermsView f40422c;

        public C21462a(String str, TermsView termsView) {
            this.f40421b = str;
            this.f40422c = termsView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            InterfaceC37766r.a.m85190a(C37304a.f82764a, this.f40421b, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f40422c.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.widget.TermsView$b */
    /* JADX INFO: compiled from: TermsView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/payment/widget/TermsView$setupView$1$2", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21463b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f40423b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TermsView f40424c;

        public C21463b(String str, TermsView termsView) {
            this.f40423b = str;
            this.f40424c = termsView;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            InterfaceC37766r.a.m85190a(C37304a.f82764a, this.f40423b, null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f40424c.getContext(), R$color.c_text));
            ds2.setUnderlineText(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TermsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40419b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37700v3>() { // from class: com.kubi.payment.widget.TermsView$special$$inlined$viewBinding$1
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
        return (C37700v3) this.f40419b.getValue(this, f40418d[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m49912b() {
        C27046k.m66711z(this, 0L, new Function0() { // from class: com.kubi.payment.widget.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TermsView.m49911c(this.f40444b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF40420c() {
        return this.f40420c;
    }

    /* JADX INFO: renamed from: e */
    public final void m49914e() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        boolean z11 = this.f40420c;
        this.f40420c = !z11;
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

    /* JADX INFO: renamed from: f */
    public final void m49915f(@NotNull String companyName, @NotNull String termsOfUseUrl, @NotNull String privacyPolicyUrl) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(termsOfUseUrl, "termsOfUseUrl");
        Intrinsics.checkNotNullParameter(privacyPolicyUrl, "privacyPolicyUrl");
        C37700v3 binding = getBinding();
        if (binding == null || (baseTextView = binding.f84772c) == null) {
            return;
        }
        baseTextView.setText(getContext().getString(R$string.payment_fast_terms, companyName, companyName));
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new C21462a(termsOfUseUrl, this)), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new C21463b(privacyPolicyUrl, this)));
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m49911c(TermsView termsView) {
        termsView.m49914e();
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49912b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TermsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TermsView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
