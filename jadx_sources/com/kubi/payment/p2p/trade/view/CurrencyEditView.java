package com.kubi.payment.p2p.trade.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.trade.view.CurrencyEditView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37716z2;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: CurrencyEditView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013J\u001e\u0010\u0018\u001a\u00020\u00002\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0011J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0012J\u0019\u0010\u001d\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0012J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0007H\u0002J\u0006\u0010&\u001a\u00020\u0012R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/CurrencyEditView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewCurrencyEditviewBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewCurrencyEditviewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "validAmountListener", "Lkotlin/Function1;", "", "", "refreshLimitTip", "", "noLimited", "hasFocus", "setValidAmountListener", "setLimitRange", "limitTip", "setCurrencySymbol", "symbol", "setFilters", "filters", "", "Landroid/text/InputFilter;", "([Landroid/text/InputFilter;)Lcom/kubi/payment/p2p/trade/view/CurrencyEditView;", "setCurrencyAmount", "amount", "setSelection", "index", "getCurrencyAmount", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCurrencyEditView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyEditView.kt\ncom/kubi/payment/p2p/trade/view/CurrencyEditView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,97:1\n41#2:98\n65#2:99\n80#2,7:100\n58#3,23:107\n93#3,3:130\n*S KotlinDebug\n*F\n+ 1 CurrencyEditView.kt\ncom/kubi/payment/p2p/trade/view/CurrencyEditView\n*L\n21#1:98\n21#1:99\n21#1:100,7\n36#1:107,23\n36#1:130,3\n*E\n"})
public final class CurrencyEditView extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f40128p = {Reflection.property1(new PropertyReference1Impl(CurrencyEditView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewCurrencyEditviewBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f40129n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Function1<? super String, Boolean> f40130o;

    /* JADX INFO: renamed from: com.kubi.payment.p2p.trade.view.CurrencyEditView$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 CurrencyEditView.kt\ncom/kubi/payment/p2p/trade/view/CurrencyEditView\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n37#2,8:98\n71#3:106\n77#4:107\n*E\n"})
    public static final class C21329a implements TextWatcher {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AppCompatEditText f40132c;

        public C21329a(AppCompatEditText appCompatEditText) {
            this.f40132c = appCompatEditText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            Boolean bool;
            String string = StringsKt.trim((CharSequence) String.valueOf(s11)).toString();
            boolean zM66567e = true;
            if (string.length() != 0) {
                Function1 function1 = CurrencyEditView.this.f40130o;
                if (function1 != null) {
                    bool = (Boolean) function1.invoke(string);
                } else {
                    bool = null;
                }
                zM66567e = C27025c.m66567e(bool, true);
            }
            CurrencyEditView.this.m49379c(zM66567e, this.f40132c.isFocused());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurrencyEditView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurrencyEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C37716z2 getBinding() {
        return (C37716z2) this.f40129n.getValue(this, f40128p[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m49379c(boolean z11, boolean z12) {
        BaseTextView baseTextView;
        LinearLayout linearLayout;
        BaseTextView baseTextView2;
        LinearLayout linearLayout2;
        BaseTextView baseTextView3;
        LinearLayout linearLayout3;
        if (z12 && z11) {
            C37716z2 binding = getBinding();
            if (binding != null && (linearLayout3 = binding.f84976c) != null) {
                linearLayout3.setBackgroundResource(R$drawable.payment_shape_payment_bg_express_highlight);
            }
            C37716z2 binding2 = getBinding();
            if (binding2 == null || (baseTextView3 = binding2.f84978e) == null) {
                return;
            }
            C27046k.m66700o(baseTextView3);
            return;
        }
        if (z11) {
            C37716z2 binding3 = getBinding();
            if (binding3 != null && (linearLayout = binding3.f84976c) != null) {
                linearLayout.setBackgroundResource(R$drawable.payment_shape_payment_bg_express_default);
            }
            C37716z2 binding4 = getBinding();
            if (binding4 == null || (baseTextView = binding4.f84978e) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
            return;
        }
        C37716z2 binding5 = getBinding();
        if (binding5 != null && (linearLayout2 = binding5.f84976c) != null) {
            linearLayout2.setBackgroundResource(R$drawable.payment_shape_payment_bg_express_error);
        }
        C37716z2 binding6 = getBinding();
        if (binding6 == null || (baseTextView2 = binding6.f84978e) == null) {
            return;
        }
        C27046k.m66685H(baseTextView2);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final CurrencyEditView m49380d(@NotNull String amount) {
        AppCompatEditText appCompatEditText;
        Intrinsics.checkNotNullParameter(amount, "amount");
        C37716z2 binding = getBinding();
        if (binding != null && (appCompatEditText = binding.f84975b) != null) {
            appCompatEditText.setText(amount);
        }
        m49384h(amount.length());
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final CurrencyEditView m49381e(@NotNull String symbol) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        C37716z2 binding = getBinding();
        if (binding != null && (baseTextView = binding.f84977d) != null) {
            baseTextView.setText(symbol);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final CurrencyEditView m49382f(@NotNull InputFilter[] filters) {
        AppCompatEditText appCompatEditText;
        Intrinsics.checkNotNullParameter(filters, "filters");
        C37716z2 binding = getBinding();
        if (binding != null && (appCompatEditText = binding.f84975b) != null) {
            appCompatEditText.setFilters(filters);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final CurrencyEditView m49383g(@NotNull String limitTip) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(limitTip, "limitTip");
        C37716z2 binding = getBinding();
        if (binding != null && (baseTextView = binding.f84978e) != null) {
            baseTextView.setText(limitTip);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final CurrencyEditView m49385i(@Nullable Function1<? super String, Boolean> function1) {
        this.f40130o = function1;
        return this;
    }

    public /* synthetic */ CurrencyEditView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: a */
    public static void m49377a(AppCompatEditText appCompatEditText, CurrencyEditView currencyEditView, View view, boolean z11) {
        Boolean boolInvoke;
        String string = StringsKt.trim((CharSequence) String.valueOf(appCompatEditText.getText())).toString();
        boolean zM66567e = true;
        if (string.length() != 0) {
            Function1<? super String, Boolean> function1 = currencyEditView.f40130o;
            if (function1 != null) {
                boolInvoke = function1.invoke(string);
            } else {
                boolInvoke = null;
            }
            zM66567e = C27025c.m66567e(boolInvoke, true);
        }
        currencyEditView.m49379c(zM66567e, z11);
    }

    @NotNull
    public final String getCurrencyAmount() {
        Editable text;
        AppCompatEditText appCompatEditText;
        C37716z2 binding = getBinding();
        if (binding != null && (appCompatEditText = binding.f84975b) != null) {
            text = appCompatEditText.getText();
        } else {
            text = null;
        }
        return String.valueOf(text);
    }

    /* JADX INFO: renamed from: h */
    public final CurrencyEditView m49384h(int i11) {
        AppCompatEditText appCompatEditText;
        C37716z2 binding = getBinding();
        if (binding != null && (appCompatEditText = binding.f84975b) != null) {
            appCompatEditText.setSelection(i11);
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurrencyEditView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        final AppCompatEditText appCompatEditText;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40129n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37716z2>() { // from class: com.kubi.payment.p2p.trade.view.CurrencyEditView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37716z2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37716z2.m85017a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_currency_editview, this);
        C37716z2 binding = getBinding();
        if (binding == null || (appCompatEditText = binding.f84975b) == null) {
            return;
        }
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: gu.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CurrencyEditView.m49377a(appCompatEditText, this, view, z11);
            }
        });
        appCompatEditText.addTextChangedListener(new C21329a(appCompatEditText));
    }
}
