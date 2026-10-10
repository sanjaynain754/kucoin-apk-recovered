package com.kubi.payment.fast.paymentmethod.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$layout;
import com.kubi.payment.fast.buy.bankcard.manage.ManageBankCardDialog;
import com.kubi.payment.fast.buy.bankcard.manage.ManageCard;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsBankCardView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37675q3;
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

/* JADX INFO: compiled from: PaymentMethodsBankCardView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBankCardView;", "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsBankCardBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsBankCardBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "maxBankCardCount", "", "bankcardCount", "paymentMethods", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "onBankCardDeleted", "", "cardId", "", "buildManageCardList", "Ljava/util/ArrayList;", "Lcom/kubi/payment/fast/buy/bankcard/manage/ManageCard;", "Lkotlin/collections/ArrayList;", "bindData", "paymentMethodList", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "refreshView", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsBankCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsBankCardView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBankCardView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n41#2:129\n65#2:130\n80#2,7:131\n65#2:138\n80#2,7:139\n774#3:146\n865#3,2:147\n774#3:149\n865#3,2:150\n1869#3,2:152\n774#3:154\n865#3,2:155\n1869#3,2:157\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsBankCardView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBankCardView\n*L\n29#1:129\n29#1:130\n29#1:131,7\n29#1:138\n29#1:139,7\n56#1:146\n56#1:147,2\n64#1:149\n64#1:150,2\n66#1:152,2\n99#1:154\n99#1:155,2\n121#1:157,2\n*E\n"})
public final class PaymentMethodsBankCardView extends PaymentMethodsView {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ KProperty<Object>[] f38653s = {Reflection.property1(new PropertyReference1Impl(PaymentMethodsBankCardView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsBankCardBinding;", 0))};

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC24293a f38654o;

    /* JADX INFO: renamed from: p */
    public int f38655p;

    /* JADX INFO: renamed from: q */
    public int f38656q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final List<PaymentMethodList.PaymentMethod> f38657r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsBankCardView(@NotNull Context context) {
        BaseTextView baseTextView;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38654o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37675q3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsBankCardView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37675q3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37675q3.m84938a(C45682f.m100801b(viewGroup));
            }
        });
        this.f38655p = 5;
        this.f38657r = new ArrayList();
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_bank_card, this);
        C37675q3 binding = getBinding();
        if (binding == null || (baseTextView = binding.f84468g) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: ut.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodsBankCardView.m46603d(this.f101873b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m46601b(PaymentMethodsBankCardView paymentMethodsBankCardView, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paymentMethodsBankCardView.m46606g(it);
        return Unit.INSTANCE;
    }

    private final C37675q3 getBinding() {
        return (C37675q3) this.f38654o.getValue(this, f38653s[0]);
    }

    /* JADX INFO: renamed from: h */
    private final void m46604h() {
        LinearLayoutCompat linearLayoutCompat;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        View view;
        LinearLayoutCompat linearLayoutCompat2;
        BaseTextView baseTextView3;
        View view2;
        BaseTextView baseTextView4;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        List<PaymentMethodList.PaymentMethod> list = this.f38657r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((PaymentMethodList.PaymentMethod) obj).getPaymentMethodCode(), "_ADD_NEW_CARD")) {
                arrayList.add(obj);
            }
        }
        this.f38656q = C27024b.m66560c(arrayList).size();
        C37675q3 binding = getBinding();
        if (binding != null && (linearLayoutCompat4 = binding.f84465d) != null) {
            linearLayoutCompat4.removeAllViews();
        }
        if (this.f38657r.isEmpty()) {
            C37675q3 binding2 = getBinding();
            if (binding2 != null && (linearLayoutCompat3 = binding2.f84465d) != null) {
                C27046k.m66700o(linearLayoutCompat3);
            }
        } else {
            C37675q3 binding3 = getBinding();
            if (binding3 != null && (linearLayoutCompat = binding3.f84465d) != null) {
                C27046k.m66685H(linearLayoutCompat);
            }
        }
        if (this.f38656q <= 0) {
            C37675q3 binding4 = getBinding();
            if (binding4 != null && (baseTextView4 = binding4.f84468g) != null) {
                C27046k.m66700o(baseTextView4);
            }
        } else {
            C37675q3 binding5 = getBinding();
            if (binding5 != null && (baseTextView = binding5.f84468g) != null) {
                C27046k.m66685H(baseTextView);
            }
        }
        if (this.f38655p > this.f38656q) {
            C37675q3 binding6 = getBinding();
            if (binding6 != null && (view2 = binding6.f84463b) != null) {
                C27046k.m66700o(view2);
            }
            C37675q3 binding7 = getBinding();
            if (binding7 != null && (baseTextView3 = binding7.f84469h) != null) {
                C27046k.m66700o(baseTextView3);
            }
        } else {
            C37675q3 binding8 = getBinding();
            if (binding8 != null && (view = binding8.f84463b) != null) {
                C27046k.m66685H(view);
            }
            C37675q3 binding9 = getBinding();
            if (binding9 != null && (baseTextView2 = binding9.f84469h) != null) {
                C27046k.m66685H(baseTextView2);
            }
        }
        for (PaymentMethodList.PaymentMethod paymentMethod : this.f38657r) {
            PaymentMethodView.Companion companion = PaymentMethodView.f38647p;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            PaymentMethodView paymentMethodViewBuildPaymentMethodView = companion.buildPaymentMethodView(context, paymentMethod, getF38667n());
            C37675q3 binding10 = getBinding();
            if (binding10 != null && (linearLayoutCompat2 = binding10.f84465d) != null) {
                linearLayoutCompat2.addView(paymentMethodViewBuildPaymentMethodView);
            }
        }
    }

    @Override // com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsView
    /* JADX INFO: renamed from: a */
    public void mo46600a(@NotNull PaymentMethodList.Response paymentMethodList) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Intrinsics.checkNotNullParameter(paymentMethodList, "paymentMethodList");
        String strM66668h = C27041f.m66668h(paymentMethodList.getTips());
        C37675q3 binding = getBinding();
        if (binding != null && (baseTextView3 = binding.f84467f) != null) {
            baseTextView3.setText(strM66668h);
        }
        if (strM66668h.length() == 0) {
            C37675q3 binding2 = getBinding();
            if (binding2 != null && (baseTextView2 = binding2.f84467f) != null) {
                C27046k.m66700o(baseTextView2);
            }
        } else {
            C37675q3 binding3 = getBinding();
            if (binding3 != null && (baseTextView = binding3.f84467f) != null) {
                C27046k.m66685H(baseTextView);
            }
        }
        this.f38657r.clear();
        this.f38657r.addAll(C27024b.m66560c(paymentMethodList.getPaymentMethods()));
        this.f38655p = C27039d.m66651k(paymentMethodList.getMaxBankCardCount(), 5);
        m46604h();
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList<ManageCard> m46605f() {
        ArrayList arrayList = new ArrayList();
        List<PaymentMethodList.PaymentMethod> list = this.f38657r;
        ArrayList<PaymentMethodList.PaymentMethod> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((PaymentMethodList.PaymentMethod) obj).getPaymentMethodCode(), "_ADD_NEW_CARD")) {
                arrayList2.add(obj);
            }
        }
        for (PaymentMethodList.PaymentMethod paymentMethod : arrayList2) {
            PaymentMethodList.BankCardInfo bankCardInfo = paymentMethod.getBankCardInfo();
            arrayList.add(new ManageCard(C27041f.m66668h(bankCardInfo != null ? bankCardInfo.getCardId() : null), paymentMethod.getIconUrl(), paymentMethod.getName(), C27041f.m66668h(paymentMethod.getDescription())));
        }
        ArrayList<ManageCard> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList);
        return arrayList3;
    }

    /* JADX INFO: renamed from: g */
    public final void m46606g(String str) {
        List<PaymentMethodList.PaymentMethod> list = this.f38657r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PaymentMethodList.BankCardInfo bankCardInfo = ((PaymentMethodList.PaymentMethod) obj).getBankCardInfo();
            if (!Intrinsics.areEqual(C27041f.m66668h(bankCardInfo != null ? bankCardInfo.getCardId() : null), str)) {
                arrayList.add(obj);
            }
        }
        this.f38657r.clear();
        this.f38657r.addAll(arrayList);
        m46604h();
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m46603d(final PaymentMethodsBankCardView paymentMethodsBankCardView) {
        if (paymentMethodsBankCardView.getContext() instanceof AppCompatActivity) {
            ManageBankCardDialog.Companion companion = ManageBankCardDialog.x0;
            Context context = paymentMethodsBankCardView.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            companion.show(supportFragmentManager, paymentMethodsBankCardView.m46605f(), paymentMethodsBankCardView.f38655p, new Function1() { // from class: ut.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PaymentMethodsBankCardView.m46601b(this.f101874b, (String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsBankCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        BaseTextView baseTextView;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38654o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37675q3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsBankCardView$special$$inlined$viewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37675q3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37675q3.m84938a(C45682f.m100801b(viewGroup));
            }
        });
        this.f38655p = 5;
        this.f38657r = new ArrayList();
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_bank_card, this);
        C37675q3 binding = getBinding();
        if (binding == null || (baseTextView = binding.f84468g) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: ut.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodsBankCardView.m46603d(this.f101873b);
            }
        }, 1, null);
    }
}
