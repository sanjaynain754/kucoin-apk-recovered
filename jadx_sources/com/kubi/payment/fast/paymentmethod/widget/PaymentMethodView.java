package com.kubi.payment.fast.paymentmethod.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.payment.fast.paymentmethod.widget.PaymentMethodView;
import com.kubi.payment.p2p.widget.PaymentMethodTextView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37665o3;
import p673ut.InterfaceC45309a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: PaymentMethodView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010 \u001a\u00020\u0012R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewPaymentMethodBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodListener;", "setPaymentMethodListener", "", "bindData", "paymentMethod", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "showLimitNotSatisfied", "isBalanceSufficient", "", "enablePaymentMethod", "setAlphaUI", "enabled", "disablePaymentMethod", "showUnavailableDialog", "refreshSelectStatus", "isSelected", "unselect", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,266:1\n41#2:267\n65#2:268\n80#2,7:269\n65#2:276\n80#2,7:277\n172#3,2:284\n172#3,2:286\n*S KotlinDebug\n*F\n+ 1 PaymentMethodView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView\n*L\n36#1:267\n36#1:268\n36#1:269,7\n36#1:276\n36#1:277,7\n68#1:284,2\n70#1:286,2\n*E\n"})
public final class PaymentMethodView extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f38649n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public InterfaceC45309a f38650o;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ KProperty<Object>[] f38648q = {Reflection.property1(new PropertyReference1Impl(PaymentMethodView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodBinding;", 0))};

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Companion f38647p = new Companion(null);

    /* JADX INFO: compiled from: PaymentMethodView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView$Companion;", "", "<init>", "()V", "buildPaymentMethodView", "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodView;", "context", "Landroid/content/Context;", "paymentMethod", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodListener;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PaymentMethodView buildPaymentMethodView(@NotNull Context context, @NotNull PaymentMethodList.PaymentMethod paymentMethod, @Nullable InterfaceC45309a interfaceC45309a) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            PaymentMethodView paymentMethodView = new PaymentMethodView(context);
            paymentMethodView.setPaymentMethodListener(interfaceC45309a);
            paymentMethodView.m46592b(paymentMethod);
            return paymentMethodView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38649n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37665o3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37665o3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37665o3.m84915a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_method, this);
    }

    /* JADX INFO: renamed from: d */
    public final void m46593d(boolean z11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        m46596h(false, z11);
        C37665o3 binding = getBinding();
        if (binding != null && (baseTextView5 = binding.f84376j) != null) {
            baseTextView5.setBackgroundResource(R$drawable.shape_cover4_4r);
        }
        C37665o3 binding2 = getBinding();
        if (binding2 != null && (baseTextView4 = binding2.f84376j) != null) {
            baseTextView4.setText(getContext().getString(R$string.payment_unavailable));
        }
        C37665o3 binding3 = getBinding();
        if (binding3 != null && (baseTextView3 = binding3.f84376j) != null) {
            baseTextView3.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text40));
        }
        C37665o3 binding4 = getBinding();
        if (binding4 != null && (baseTextView2 = binding4.f84376j) != null) {
            C27046k.m66685H(baseTextView2);
        }
        C37665o3 binding5 = getBinding();
        if (binding5 == null || (baseTextView = binding5.f84375i) == null) {
            return;
        }
        C27046k.m66700o(baseTextView);
    }

    /* JADX INFO: renamed from: f */
    public final void m46594f() {
        BaseTextView baseTextView;
        m46591i(this, true, false, 2, null);
        C37665o3 binding = getBinding();
        if (binding == null || (baseTextView = binding.f84375i) == null) {
            return;
        }
        C27046k.m66685H(baseTextView);
    }

    /* JADX INFO: renamed from: j */
    public final void m46597j(PaymentMethodList.PaymentMethod paymentMethod, boolean z11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        m46596h(false, z11);
        C37665o3 binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f84372f) != null) {
            baseTextView2.setText(getContext().getString(R$string.payment_limit_tip, C27041f.m66668h(paymentMethod.getFiatMinAmount()), C27041f.m66668h(paymentMethod.getFiatMaxAmount()), paymentMethod.getFiatCurrency()));
        }
        C37665o3 binding2 = getBinding();
        if (binding2 == null || (baseTextView = binding2.f84372f) == null) {
            return;
        }
        C27046k.m66685H(baseTextView);
    }

    private final C37665o3 getBinding() {
        return (C37665o3) this.f38649n.getValue(this, f38648q[0]);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m46591i(PaymentMethodView paymentMethodView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        paymentMethodView.m46596h(z11, z12);
    }

    /* JADX INFO: renamed from: b */
    public final void m46592b(@NotNull final PaymentMethodList.PaymentMethod paymentMethod) {
        ImageView imageView;
        BaseTextView baseTextView;
        ImageView imageView2;
        PaymentMethodTextView paymentMethodTextView;
        BaseTextView baseTextView2;
        ImageView imageView3;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        PaymentMethodTextView paymentMethodTextView2;
        PaymentMethodTextView paymentMethodTextView3;
        PaymentMethodTextView paymentMethodTextView4;
        BaseTextView baseTextView14;
        ImageView imageView4;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        if (getContext() == null) {
            return;
        }
        if (Intrinsics.areEqual(paymentMethod.getPaymentType(), "P2P_EXPRESS")) {
            C37665o3 binding = getBinding();
            if (binding != null && (imageView4 = binding.f84368b) != null) {
                ViewExtKt.m66577h(imageView4);
            }
            C37665o3 binding2 = getBinding();
            if (binding2 != null && (baseTextView14 = binding2.f84373g) != null) {
                ViewExtKt.m66577h(baseTextView14);
            }
            C37665o3 binding3 = getBinding();
            if (binding3 != null && (paymentMethodTextView4 = binding3.f84374h) != null) {
                ViewExtKt.m66594y(paymentMethodTextView4);
            }
            C37665o3 binding4 = getBinding();
            if (binding4 != null && (paymentMethodTextView3 = binding4.f84374h) != null) {
                paymentMethodTextView3.setText(paymentMethod.getName());
            }
            C37665o3 binding5 = getBinding();
            if (binding5 != null && (paymentMethodTextView2 = binding5.f84374h) != null) {
                paymentMethodTextView2.setDrawableColor(paymentMethod.getColor());
            }
        } else {
            C37665o3 binding6 = getBinding();
            if (binding6 != null && (imageView3 = binding6.f84368b) != null) {
                ViewExtKt.m66594y(imageView3);
            }
            C37665o3 binding7 = getBinding();
            if (binding7 != null && (baseTextView2 = binding7.f84373g) != null) {
                ViewExtKt.m66594y(baseTextView2);
            }
            C37665o3 binding8 = getBinding();
            if (binding8 != null && (paymentMethodTextView = binding8.f84374h) != null) {
                ViewExtKt.m66577h(paymentMethodTextView);
            }
            if (Intrinsics.areEqual(paymentMethod.getPaymentType(), FastQuoteModel.PAY_BALANCE)) {
                C37665o3 binding9 = getBinding();
                if (binding9 != null && (imageView2 = binding9.f84368b) != null) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    int iM66599b = C27029c.m66599b(context, 4);
                    imageView2.setPadding(iM66599b, iM66599b, iM66599b, iM66599b);
                }
            } else {
                C37665o3 binding10 = getBinding();
                if (binding10 != null && (imageView = binding10.f84368b) != null) {
                    imageView.setPadding(0, 0, 0, 0);
                }
            }
            Context context2 = getContext();
            String iconUrl = paymentMethod.getIconUrl();
            C37665o3 binding11 = getBinding();
            C24277v.m58540e(context2, iconUrl, binding11 != null ? binding11.f84368b : null);
            C37665o3 binding12 = getBinding();
            if (binding12 != null && (baseTextView = binding12.f84373g) != null) {
                baseTextView.setText(paymentMethod.getName());
            }
        }
        C37665o3 binding13 = getBinding();
        if (binding13 != null && (baseTextView13 = binding13.f84375i) != null) {
            baseTextView13.setText(getContext().getString(R$string.payment_price, paymentMethod.getPrice(), paymentMethod.getFiatCurrency()));
        }
        String description = paymentMethod.getDescription();
        boolean zM66567e = C27025c.m66567e(paymentMethod.isBalanceSufficient(), true);
        if (description == null || description.length() == 0) {
            C37665o3 binding14 = getBinding();
            if (binding14 != null && (baseTextView3 = binding14.f84371e) != null) {
                C27046k.m66700o(baseTextView3);
            }
        } else {
            C37665o3 binding15 = getBinding();
            if (binding15 != null && (baseTextView12 = binding15.f84371e) != null) {
                baseTextView12.setText(description);
            }
            C37665o3 binding16 = getBinding();
            if (binding16 != null && (baseTextView11 = binding16.f84371e) != null) {
                baseTextView11.setTextColor(ContextCompat.getColor(getContext(), zM66567e ? R$color.c_text40 : R$color.complementary));
            }
            C37665o3 binding17 = getBinding();
            if (binding17 != null && (baseTextView10 = binding17.f84371e) != null) {
                C27046k.m66685H(baseTextView10);
            }
        }
        m46595g(C27025c.m66566d(paymentMethod.isSelected()), paymentMethod);
        String tagText = paymentMethod.getTagText();
        if (tagText == null || tagText.length() == 0) {
            C37665o3 binding18 = getBinding();
            if (binding18 != null && (baseTextView4 = binding18.f84376j) != null) {
                C27046k.m66700o(baseTextView4);
            }
        } else {
            C37665o3 binding19 = getBinding();
            if (binding19 != null && (baseTextView9 = binding19.f84376j) != null) {
                baseTextView9.setText(paymentMethod.getTagText());
            }
            C37665o3 binding20 = getBinding();
            if (binding20 != null && (baseTextView8 = binding20.f84376j) != null) {
                baseTextView8.setBackgroundResource(R$drawable.shape_primary8_2r);
            }
            C37665o3 binding21 = getBinding();
            if (binding21 != null && (baseTextView7 = binding21.f84376j) != null) {
                baseTextView7.setTextColor(ContextCompat.getColor(getContext(), R$color.brandGreen));
            }
            C37665o3 binding22 = getBinding();
            if (binding22 != null && (baseTextView6 = binding22.f84376j) != null) {
                C27046k.m66685H(baseTextView6);
            }
        }
        if (C27025c.m66566d(paymentMethod.getEnabled())) {
            m46594f();
        } else {
            m46593d(zM66567e);
        }
        final boolean zLimitContented = paymentMethod.limitContented();
        if (zLimitContented) {
            C37665o3 binding23 = getBinding();
            if (binding23 != null && (baseTextView5 = binding23.f84372f) != null) {
                C27046k.m66700o(baseTextView5);
            }
        } else {
            m46597j(paymentMethod, zM66567e);
        }
        C27046k.m66711z(this, 0L, new Function0() { // from class: ut.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodView.m46590c(paymentMethod, this, zLimitContented);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m46595g(boolean z11, PaymentMethodList.PaymentMethod paymentMethod) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        if (!z11) {
            paymentMethod.setSelected(Boolean.FALSE);
            m46599l();
            return;
        }
        paymentMethod.setSelected(Boolean.TRUE);
        C37665o3 binding = getBinding();
        if (binding != null && (appCompatImageView2 = binding.f84369c) != null) {
            appCompatImageView2.setImageResource(R$drawable.ic2_success_filled_20);
        }
        C37665o3 binding2 = getBinding();
        if (binding2 != null && (appCompatImageView = binding2.f84369c) != null) {
            appCompatImageView.setColorFilter(ContextCompat.getColor(getContext(), R$color.c_text), PorterDuff.Mode.SRC_IN);
        }
        InterfaceC45309a interfaceC45309a = this.f38650o;
        if (interfaceC45309a != null) {
            interfaceC45309a.mo46555m(this, paymentMethod);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m46596h(boolean z11, boolean z12) {
        BaseTextView baseTextView;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        PaymentMethodTextView paymentMethodTextView;
        BaseTextView baseTextView5;
        ImageView imageView;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        PaymentMethodTextView paymentMethodTextView2;
        BaseTextView baseTextView9;
        ImageView imageView2;
        if (z11) {
            C37665o3 binding = getBinding();
            if (binding != null && (imageView2 = binding.f84368b) != null) {
                imageView2.setAlpha(1.0f);
            }
            C37665o3 binding2 = getBinding();
            if (binding2 != null && (baseTextView9 = binding2.f84373g) != null) {
                baseTextView9.setAlpha(1.0f);
            }
            C37665o3 binding3 = getBinding();
            if (binding3 != null && (paymentMethodTextView2 = binding3.f84374h) != null) {
                paymentMethodTextView2.setAlpha(1.0f);
            }
            C37665o3 binding4 = getBinding();
            if (binding4 != null && (baseTextView8 = binding4.f84371e) != null) {
                baseTextView8.setAlpha(1.0f);
            }
            C37665o3 binding5 = getBinding();
            if (binding5 != null && (baseTextView7 = binding5.f84375i) != null) {
                baseTextView7.setAlpha(1.0f);
            }
            C37665o3 binding6 = getBinding();
            if (binding6 != null && (baseTextView6 = binding6.f84376j) != null) {
                baseTextView6.setAlpha(1.0f);
            }
            C37665o3 binding7 = getBinding();
            if (binding7 == null || (appCompatImageView2 = binding7.f84369c) == null) {
                return;
            }
            appCompatImageView2.setAlpha(1.0f);
            return;
        }
        C37665o3 binding8 = getBinding();
        if (binding8 != null && (imageView = binding8.f84368b) != null) {
            imageView.setAlpha(0.4f);
        }
        C37665o3 binding9 = getBinding();
        if (binding9 != null && (baseTextView5 = binding9.f84373g) != null) {
            baseTextView5.setAlpha(0.4f);
        }
        C37665o3 binding10 = getBinding();
        if (binding10 != null && (paymentMethodTextView = binding10.f84374h) != null) {
            paymentMethodTextView.setAlpha(0.4f);
        }
        if (z12) {
            C37665o3 binding11 = getBinding();
            if (binding11 != null && (baseTextView4 = binding11.f84371e) != null) {
                baseTextView4.setAlpha(0.4f);
            }
        } else {
            C37665o3 binding12 = getBinding();
            if (binding12 != null && (baseTextView = binding12.f84371e) != null) {
                baseTextView.setAlpha(1.0f);
            }
        }
        C37665o3 binding13 = getBinding();
        if (binding13 != null && (baseTextView3 = binding13.f84375i) != null) {
            baseTextView3.setAlpha(0.4f);
        }
        C37665o3 binding14 = getBinding();
        if (binding14 != null && (baseTextView2 = binding14.f84376j) != null) {
            baseTextView2.setAlpha(0.4f);
        }
        C37665o3 binding15 = getBinding();
        if (binding15 == null || (appCompatImageView = binding15.f84369c) == null) {
            return;
        }
        appCompatImageView.setAlpha(0.4f);
    }

    public final void setPaymentMethodListener(@Nullable InterfaceC45309a interfaceC45309a) {
        this.f38650o = interfaceC45309a;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m46590c(PaymentMethodList.PaymentMethod paymentMethod, PaymentMethodView paymentMethodView, boolean z11) {
        if (!C27025c.m66566d(paymentMethod.getEnabled())) {
            paymentMethodView.m46598k();
            return Unit.INSTANCE;
        }
        if (!z11) {
            return Unit.INSTANCE;
        }
        if (C27025c.m66566d(paymentMethod.isSelected())) {
            return Unit.INSTANCE;
        }
        paymentMethodView.m46595g(true, paymentMethod);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final void m46598k() {
        if (getContext() instanceof AppCompatActivity) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_unavailable_title).m54153J4(R$string.payment_fast_trade_method_unavailable).m54163T4(getContext().getString(R$string.i_know), null);
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            alertDialogFragmentHelperM54163T4.show(supportFragmentManager, "payment_fast_payment_method_unavailable");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m46599l() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C37665o3 binding = getBinding();
        if (binding != null && (appCompatImageView2 = binding.f84369c) != null) {
            appCompatImageView2.setImageResource(R$drawable.ic_radio_unselect_20);
        }
        C37665o3 binding2 = getBinding();
        if (binding2 != null && (appCompatImageView = binding2.f84369c) != null) {
            appCompatImageView.setColorFilter(ContextCompat.getColor(getContext(), R$color.c_text40), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38649n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37665o3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodView$special$$inlined$viewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37665o3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37665o3.m84915a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_method, this);
    }
}
