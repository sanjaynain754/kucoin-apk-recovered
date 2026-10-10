package com.kubi.payment.fasttradev2.buy.paymentmethod;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fasttradev2.buy.BuyVM;
import com.kubi.payment.fasttradev2.buy.FastBuyHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37697v0;
import p477nt.C42875h;
import p477nt.C42876i;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import tt.C45070a;
import tt.C45071b;
import w00.C45681e;

/* JADX INFO: compiled from: BuyPaymentMethodDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010(\u001a\u00020\u001bH\u0002J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\r2\u0006\u0010'\u001a\u00020!H\u0002J\u0016\u0010+\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\b\u0010/\u001a\u00020\u001bH\u0002J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\u001bH\u0002J\b\u00107\u001a\u00020\u001bH\u0002J\b\u00108\u001a\u00020\u001bH\u0002J\u0012\u00109\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\u0010\u0010:\u001a\u00020\u001b2\u0006\u00104\u001a\u000205H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastBuyPaymentMethodBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastBuyPaymentMethodBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "maxBankCardCount", "", "buyVM", "Lcom/kubi/payment/fasttradev2/buy/BuyVM;", "buyPaymentMethodVM", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodVM;", "bankCardAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "realBankCardAdapter", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyBankCardAdapter;", "buyBankCardLimitAdapter", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyBankCardLimitAdapter;", "paymentMethodAdapter", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodAdapter;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "handleItemClick", ViewProps.POSITION, "findMaxLimitBankCardCount", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod;", "observeData", "showOrHideLoadingView", "bool", "", "onDeleteBankCardSuccessful", "cardId", "", "enableEmptyView", "switchToBankCardEdit", "switchToSelectPaymentMethod", "onDeleteBankCardConfirm", "showHasRecurringPlanDialog", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyPaymentMethodDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyPaymentMethodDialog.kt\ncom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n143#2,20:330\n44#3,2:350\n1#4:352\n*S KotlinDebug\n*F\n+ 1 BuyPaymentMethodDialog.kt\ncom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodDialog\n*L\n49#1:330,20\n84#1:350,2\n*E\n"})
public final class BuyPaymentMethodDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    public static final /* synthetic */ KProperty<Object>[] f39274A0 = {Reflection.property1(new PropertyReference1Impl(BuyPaymentMethodDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastBuyPaymentMethodBinding;", 0))};

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public static final Companion f39275z0 = new Companion(null);

    /* JADX INFO: renamed from: r0 */
    public Context f39277r0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public BuyVM f39279t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public BuyPaymentMethodVM f39280u0;

    /* JADX INFO: renamed from: v0 */
    public ConcatAdapter f39281v0;

    /* JADX INFO: renamed from: w0 */
    public BuyBankCardAdapter f39282w0;

    /* JADX INFO: renamed from: x0 */
    public BuyBankCardLimitAdapter f39283x0;

    /* JADX INFO: renamed from: y0 */
    public BuyPaymentMethodAdapter f39284y0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f39276q0 = C45681e.m100799e(this, new Function1<BuyPaymentMethodDialog, C37697v0>() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37697v0 invoke(@NotNull BuyPaymentMethodDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37697v0.m84984a(fragment.requireView());
        }
    }, new Function1<C37697v0, Unit>() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37697v0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37697v0 c37697v0) {
            invoke(c37697v0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    public int f39278s0 = 5;

    /* JADX INFO: compiled from: BuyPaymentMethodDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            BuyPaymentMethodDialog buyPaymentMethodDialog = new BuyPaymentMethodDialog();
            buyPaymentMethodDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("type", 8)));
            buyPaymentMethodDialog.show(fragmentManager, "payment_fast_buy_select_payment_method");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodDialog$a */
    /* JADX INFO: compiled from: BuyPaymentMethodDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/fasttradev2/buy/paymentmethod/BuyPaymentMethodDialog$initViews$5", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyBankCardListener;", "onDelete", "", "cardId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20822a implements BuyBankCardListener {
        public C20822a() {
        }

        @Override // com.kubi.payment.fasttradev2.buy.paymentmethod.BuyBankCardListener
        /* JADX INFO: renamed from: a */
        public void mo47859a(String str) {
            BuyPaymentMethodDialog.this.m47852K4(str);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodDialog$b */
    /* JADX INFO: compiled from: BuyPaymentMethodDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20823b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39286b;

        public C20823b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39286b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f39286b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39286b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: A4 */
    private final void m47824A4() {
        C37697v0 c37697v0M47858y4 = m47858y4();
        if (c37697v0M47858y4 == null) {
            return;
        }
        AppCompatImageView ivBack = c37697v0M47858y4.f84748b;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        C27046k.m66711z(ivBack, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyPaymentMethodDialog.m47825B4(this.f39304b);
            }
        }, 1, null);
        AppCompatImageView ivClose = c37697v0M47858y4.f84749c;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyPaymentMethodDialog.m47826C4(this.f39305b);
            }
        }, 1, null);
        C24277v.m58539d(getContext(), R$drawable.kc_loading, c37697v0M47858y4.f84750d);
        BuyPaymentMethodAdapter buyPaymentMethodAdapter = new BuyPaymentMethodAdapter();
        this.f39284y0 = buyPaymentMethodAdapter;
        buyPaymentMethodAdapter.m47821B(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyPaymentMethodDialog.m47827D4(this.f39306b, (String) obj);
            }
        });
        BuyPaymentMethodAdapter buyPaymentMethodAdapter2 = this.f39284y0;
        BuyPaymentMethodAdapter buyPaymentMethodAdapter3 = null;
        if (buyPaymentMethodAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            buyPaymentMethodAdapter2 = null;
        }
        Context context = this.f39277r0;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        int i11 = R$layout.view_empty;
        buyPaymentMethodAdapter2.setEmptyViewLayout(context, i11);
        BuyPaymentMethodAdapter buyPaymentMethodAdapter4 = this.f39284y0;
        if (buyPaymentMethodAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            buyPaymentMethodAdapter4 = null;
        }
        buyPaymentMethodAdapter4.setEmptyViewEnable(false);
        BuyPaymentMethodAdapter buyPaymentMethodAdapter5 = this.f39284y0;
        if (buyPaymentMethodAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            buyPaymentMethodAdapter5 = null;
        }
        buyPaymentMethodAdapter5.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.r
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                BuyPaymentMethodDialog.m47828E4(this.f39307a, baseQuickAdapter, view, i12);
            }
        });
        BuyBankCardAdapter buyBankCardAdapter = new BuyBankCardAdapter();
        this.f39282w0 = buyBankCardAdapter;
        Context context2 = this.f39277r0;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        buyBankCardAdapter.setEmptyViewLayout(context2, i11);
        BuyBankCardAdapter buyBankCardAdapter2 = this.f39282w0;
        if (buyBankCardAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realBankCardAdapter");
            buyBankCardAdapter2 = null;
        }
        buyBankCardAdapter2.setEmptyViewEnable(true);
        BuyBankCardAdapter buyBankCardAdapter3 = this.f39282w0;
        if (buyBankCardAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realBankCardAdapter");
            buyBankCardAdapter3 = null;
        }
        buyBankCardAdapter3.m47809r(new C20822a());
        this.f39283x0 = new BuyBankCardLimitAdapter();
        BuyBankCardAdapter buyBankCardAdapter4 = this.f39282w0;
        if (buyBankCardAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realBankCardAdapter");
            buyBankCardAdapter4 = null;
        }
        BuyBankCardLimitAdapter buyBankCardLimitAdapter = this.f39283x0;
        if (buyBankCardLimitAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buyBankCardLimitAdapter");
            buyBankCardLimitAdapter = null;
        }
        this.f39281v0 = new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{buyBankCardAdapter4, buyBankCardLimitAdapter});
        RecyclerView recyclerView = c37697v0M47858y4.f84751e;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        BuyPaymentMethodAdapter buyPaymentMethodAdapter6 = this.f39284y0;
        if (buyPaymentMethodAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
        } else {
            buyPaymentMethodAdapter3 = buyPaymentMethodAdapter6;
        }
        recyclerView.setAdapter(buyPaymentMethodAdapter3);
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m47827D4(BuyPaymentMethodDialog buyPaymentMethodDialog, String str) {
        FastBuyHelper.f39263a.m47787J(str);
        buyPaymentMethodDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m47828E4(BuyPaymentMethodDialog buyPaymentMethodDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        buyPaymentMethodDialog.m47851z4(i11, view);
    }

    /* JADX INFO: renamed from: F4 */
    private final void m47829F4() {
        LiveData<C42875h<BuyPaymentMethodVM.DeleteBankCard>> liveDataM47865y;
        LiveData<Boolean> liveDataM45660s;
        LiveData<List<BuyItemPaymentMethod>> liveDataM47441R;
        LiveData<Boolean> liveDataM47449Z;
        BuyVM buyVM = this.f39279t0;
        if (buyVM != null && (liveDataM47449Z = buyVM.m47449Z()) != null) {
            liveDataM47449Z.observe(getViewLifecycleOwner(), new C20823b(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BuyPaymentMethodDialog.m47832I4(this.f39298b, (Boolean) obj);
                }
            }));
        }
        BuyVM buyVM2 = this.f39279t0;
        if (buyVM2 != null && (liveDataM47441R = buyVM2.m47441R()) != null) {
            liveDataM47441R.observe(getViewLifecycleOwner(), new C20823b(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BuyPaymentMethodDialog.m47833J4(this.f39301b, (List) obj);
                }
            }));
        }
        BuyPaymentMethodVM buyPaymentMethodVM = this.f39280u0;
        if (buyPaymentMethodVM != null && (liveDataM45660s = buyPaymentMethodVM.m45660s()) != null) {
            liveDataM45660s.observe(getViewLifecycleOwner(), new C20823b(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BuyPaymentMethodDialog.m47830G4(this.f39302b, (Boolean) obj);
                }
            }));
        }
        BuyPaymentMethodVM buyPaymentMethodVM2 = this.f39280u0;
        if (buyPaymentMethodVM2 == null || (liveDataM47865y = buyPaymentMethodVM2.m47865y()) == null) {
            return;
        }
        liveDataM47865y.observe(getViewLifecycleOwner(), new C42876i(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyPaymentMethodDialog.m47831H4(this.f39303b, (BuyPaymentMethodVM.DeleteBankCard) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m47831H4(BuyPaymentMethodDialog buyPaymentMethodDialog, BuyPaymentMethodVM.DeleteBankCard it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getHasRecurringPlan()) {
            buyPaymentMethodDialog.m47835N4(it.getCardId());
        } else {
            buyPaymentMethodDialog.m47853M4(it.getCardId());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m47833J4(BuyPaymentMethodDialog buyPaymentMethodDialog, List list) {
        BuyPaymentMethodAdapter buyPaymentMethodAdapter = buyPaymentMethodDialog.f39284y0;
        if (buyPaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            buyPaymentMethodAdapter = null;
        }
        buyPaymentMethodAdapter.submitList(list);
        buyPaymentMethodDialog.m47849v4();
        Intrinsics.checkNotNull(list);
        buyPaymentMethodDialog.m47857x4(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m47834L4(BuyPaymentMethodDialog buyPaymentMethodDialog, String str, DialogInterface dialogInterface, int i11) {
        BuyPaymentMethodVM buyPaymentMethodVM = buyPaymentMethodDialog.f39280u0;
        if (buyPaymentMethodVM != null) {
            buyPaymentMethodVM.m47864x(str);
        }
        C43852m.m96591c("B7FastBuy", "editBankCard", "2", null, 8, null);
    }

    /* JADX INFO: renamed from: N4 */
    private final void m47835N4(final String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_bank_nodeleted).m54153J4(R$string.payment_bank_nodeleted_detail).m54162S4(R$string.payment_investment_view_plan, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BuyPaymentMethodDialog.m47836O4(this.f39308b, str, dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m47836O4(BuyPaymentMethodDialog buyPaymentMethodDialog, String str, DialogInterface dialogInterface, int i11) {
        BuyPaymentMethodVM buyPaymentMethodVM = buyPaymentMethodDialog.f39280u0;
        if (buyPaymentMethodVM != null) {
            buyPaymentMethodVM.m47866z(str);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m47850w4(BuyPaymentMethodDialog buyPaymentMethodDialog) {
        BuyPaymentMethodAdapter buyPaymentMethodAdapter = buyPaymentMethodDialog.f39284y0;
        BuyBankCardAdapter buyBankCardAdapter = null;
        if (buyPaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            buyPaymentMethodAdapter = null;
        }
        if (!buyPaymentMethodAdapter.getIsEmptyViewEnable()) {
            BuyPaymentMethodAdapter buyPaymentMethodAdapter2 = buyPaymentMethodDialog.f39284y0;
            if (buyPaymentMethodAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
                buyPaymentMethodAdapter2 = null;
            }
            buyPaymentMethodAdapter2.setEmptyViewEnable(true);
        }
        BuyBankCardAdapter buyBankCardAdapter2 = buyPaymentMethodDialog.f39282w0;
        if (buyBankCardAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realBankCardAdapter");
            buyBankCardAdapter2 = null;
        }
        if (buyBankCardAdapter2.getIsEmptyViewEnable()) {
            return;
        }
        BuyBankCardAdapter buyBankCardAdapter3 = buyPaymentMethodDialog.f39282w0;
        if (buyBankCardAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realBankCardAdapter");
        } else {
            buyBankCardAdapter = buyBankCardAdapter3;
        }
        buyBankCardAdapter.setEmptyViewEnable(true);
    }

    /* JADX INFO: renamed from: z4 */
    private final void m47851z4(int i11, View view) {
        BuyPaymentMethodAdapter buyPaymentMethodAdapter = this.f39284y0;
        BuyPaymentMethodAdapter buyPaymentMethodAdapter2 = null;
        if (buyPaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            buyPaymentMethodAdapter = null;
        }
        if (i11 >= buyPaymentMethodAdapter.getItems().size() || i11 < 0 || C27014a1.m66501a(view)) {
            return;
        }
        BuyPaymentMethodAdapter buyPaymentMethodAdapter3 = this.f39284y0;
        if (buyPaymentMethodAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
        } else {
            buyPaymentMethodAdapter2 = buyPaymentMethodAdapter3;
        }
        BuyItemPaymentMethod item = buyPaymentMethodAdapter2.getItem(i11);
        if (item == null) {
            return;
        }
        if (item instanceof BuyItemPaymentMethod.ItemCategory) {
            if (((BuyItemPaymentMethod.ItemCategory) item).getCanEdit()) {
                m47855Q4();
            }
        } else {
            if (!(item instanceof BuyItemPaymentMethod.ItemNormalPaymentMethod)) {
                if (!Intrinsics.areEqual(item, BuyItemPaymentMethod.ItemGuideP2P.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) item;
            if (C27025c.m66566d(itemNormalPaymentMethod.getPaymentMethod().isEnabled())) {
                BuyVM buyVM = this.f39279t0;
                if (buyVM != null) {
                    buyVM.m47458j0(itemNormalPaymentMethod);
                }
                C43852m.m96590b(C27041f.m66668h(getF34288V()), "selectMethod", "1", TuplesKt.m90091to("paymentMethodCode", C27041f.m66668h(itemNormalPaymentMethod.getPaymentMethod().getPaymentMethodCode())), TuplesKt.m90091to("channelId", C27041f.m66668h(itemNormalPaymentMethod.getPaymentMethod().getChannelId())));
                dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m47852K4(final String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.fait_account_delete_card_alert).m54161R4(0).m54162S4(R$string.paymnet_bankcard_remove, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BuyPaymentMethodDialog.m47834L4(this.f39299b, str, dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: M4 */
    public final void m47853M4(String str) {
        BuyBankCardAdapter buyBankCardAdapter = this.f39282w0;
        BuyBankCardLimitAdapter buyBankCardLimitAdapter = null;
        if (buyBankCardAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realBankCardAdapter");
            buyBankCardAdapter = null;
        }
        buyBankCardAdapter.m47808q(str);
        ConcatAdapter concatAdapter = this.f39281v0;
        if (concatAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankCardAdapter");
            concatAdapter = null;
        }
        if (concatAdapter.getAdapters().size() > 1) {
            ConcatAdapter concatAdapter2 = this.f39281v0;
            if (concatAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankCardAdapter");
                concatAdapter2 = null;
            }
            BuyBankCardLimitAdapter buyBankCardLimitAdapter2 = this.f39283x0;
            if (buyBankCardLimitAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buyBankCardLimitAdapter");
            } else {
                buyBankCardLimitAdapter = buyBankCardLimitAdapter2;
            }
            concatAdapter2.removeAdapter(buyBankCardLimitAdapter);
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m47854P4(boolean z11) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        if (z11) {
            C37697v0 c37697v0M47858y4 = m47858y4();
            if (c37697v0M47858y4 == null || (appCompatImageView2 = c37697v0M47858y4.f84750d) == null) {
                return;
            }
            C27046k.m66685H(appCompatImageView2);
            return;
        }
        C37697v0 c37697v0M47858y5 = m47858y4();
        if (c37697v0M47858y5 == null || (appCompatImageView = c37697v0M47858y5.f84750d) == null) {
            return;
        }
        C27046k.m66700o(appCompatImageView);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f39277r0 = context;
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            Fragment fragmentRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            this.f39279t0 = (BuyVM) new ViewModelProvider(fragmentRequireParentFragment, c45071b).get(BuyVM.class);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "BuyPaymentMethodDialog init BuyVM", false, null, 8, null), null, 2, null);
        }
        this.f39280u0 = (BuyPaymentMethodVM) new ViewModelProvider(this, c45071b).get(BuyPaymentMethodVM.class);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_fast_buy_payment_method, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int iM6182d = (C5267e0.m6182d() * 7) / 10;
        view.getLayoutParams().height = iM6182d;
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, iM6182d);
            }
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
                bottomSheetBehaviorFrom.setState(3);
            }
        }
        m47824A4();
        m47829F4();
    }

    /* JADX INFO: renamed from: y4 */
    public final C37697v0 m47858y4() {
        return (C37697v0) this.f39276q0.getValue(this, f39274A0[0]);
    }

    public BuyPaymentMethodDialog() {
        setPageId("B7FastBuyPaymentMethodList");
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m47825B4(BuyPaymentMethodDialog buyPaymentMethodDialog) {
        buyPaymentMethodDialog.m47856R4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m47826C4(BuyPaymentMethodDialog buyPaymentMethodDialog) {
        buyPaymentMethodDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m47830G4(BuyPaymentMethodDialog buyPaymentMethodDialog, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        buyPaymentMethodDialog.m47854P4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m47832I4(BuyPaymentMethodDialog buyPaymentMethodDialog, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        buyPaymentMethodDialog.m47854P4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    private final void m47849v4() {
        RecyclerView recyclerView;
        C37697v0 c37697v0M47858y4 = m47858y4();
        if (c37697v0M47858y4 != null && (recyclerView = c37697v0M47858y4.f84751e) != null) {
            recyclerView.post(new Runnable() { // from class: com.kubi.payment.fasttradev2.buy.paymentmethod.t
                @Override // java.lang.Runnable
                public final void run() {
                    BuyPaymentMethodDialog.m47850w4(this.f39310b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m47855Q4() {
        List<BuyBankCard> listM47863w;
        List<BuyItemPaymentMethod> value;
        LiveData<List<BuyItemPaymentMethod>> liveDataM47441R;
        C37697v0 c37697v0M47858y4 = m47858y4();
        if (c37697v0M47858y4 == null) {
            return;
        }
        AppCompatImageView ivBack = c37697v0M47858y4.f84748b;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        C27046k.m66685H(ivBack);
        BaseTextView baseTextView = c37697v0M47858y4.f84752f;
        Context context = this.f39277r0;
        ConcatAdapter concatAdapter = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        baseTextView.setText(context.getString(R$string.payment_fast_mycard_title));
        BuyPaymentMethodVM buyPaymentMethodVM = this.f39280u0;
        if (buyPaymentMethodVM != null) {
            BuyVM buyVM = this.f39279t0;
            if (buyVM != null && (liveDataM47441R = buyVM.m47441R()) != null) {
                value = liveDataM47441R.getValue();
            } else {
                value = null;
            }
            listM47863w = buyPaymentMethodVM.m47863w(value);
        } else {
            listM47863w = null;
        }
        BuyBankCardAdapter buyBankCardAdapter = this.f39282w0;
        if (buyBankCardAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realBankCardAdapter");
            buyBankCardAdapter = null;
        }
        buyBankCardAdapter.submitList(listM47863w);
        if (C27024b.m66560c(listM47863w).size() >= this.f39278s0) {
            ConcatAdapter concatAdapter2 = this.f39281v0;
            if (concatAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankCardAdapter");
                concatAdapter2 = null;
            }
            if (concatAdapter2.getAdapters().size() > 1) {
                ConcatAdapter concatAdapter3 = this.f39281v0;
                if (concatAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bankCardAdapter");
                    concatAdapter3 = null;
                }
                BuyBankCardLimitAdapter buyBankCardLimitAdapter = this.f39283x0;
                if (buyBankCardLimitAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buyBankCardLimitAdapter");
                    buyBankCardLimitAdapter = null;
                }
                concatAdapter3.addAdapter(buyBankCardLimitAdapter);
            }
        } else {
            ConcatAdapter concatAdapter4 = this.f39281v0;
            if (concatAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankCardAdapter");
                concatAdapter4 = null;
            }
            if (concatAdapter4.getAdapters().size() > 1) {
                ConcatAdapter concatAdapter5 = this.f39281v0;
                if (concatAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bankCardAdapter");
                    concatAdapter5 = null;
                }
                BuyBankCardLimitAdapter buyBankCardLimitAdapter2 = this.f39283x0;
                if (buyBankCardLimitAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buyBankCardLimitAdapter");
                    buyBankCardLimitAdapter2 = null;
                }
                concatAdapter5.removeAdapter(buyBankCardLimitAdapter2);
            }
        }
        RecyclerView recyclerView = c37697v0M47858y4.f84751e;
        ConcatAdapter concatAdapter6 = this.f39281v0;
        if (concatAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankCardAdapter");
        } else {
            concatAdapter = concatAdapter6;
        }
        recyclerView.setAdapter(concatAdapter);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m47856R4() {
        RecyclerView recyclerView;
        C37697v0 c37697v0M47858y4 = m47858y4();
        if (c37697v0M47858y4 == null) {
            return;
        }
        AppCompatImageView ivBack = c37697v0M47858y4.f84748b;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        C27046k.m66700o(ivBack);
        BaseTextView baseTextView = c37697v0M47858y4.f84752f;
        Context context = this.f39277r0;
        BuyPaymentMethodAdapter buyPaymentMethodAdapter = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        baseTextView.setText(context.getString(R$string.payment_fast_sell_method_list_title));
        C37697v0 c37697v0M47858y5 = m47858y4();
        if (c37697v0M47858y5 != null && (recyclerView = c37697v0M47858y5.f84751e) != null) {
            BuyPaymentMethodAdapter buyPaymentMethodAdapter2 = this.f39284y0;
            if (buyPaymentMethodAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            } else {
                buyPaymentMethodAdapter = buyPaymentMethodAdapter2;
            }
            recyclerView.setAdapter(buyPaymentMethodAdapter);
        }
        C12572a.m23695d("com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForBankCard", Boolean.TRUE, 0L, 4, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /* JADX INFO: renamed from: x4 */
    public final void m47857x4(List<? extends BuyItemPaymentMethod> list) {
        Integer maxCardCount;
        Object next;
        BuyItemPaymentMethod.ItemCategory itemCategory;
        Iterator<T> it = list.iterator();
        while (true) {
            maxCardCount = null;
            if (it.hasNext()) {
                next = it.next();
                BuyItemPaymentMethod buyItemPaymentMethod = (BuyItemPaymentMethod) next;
                if ((buyItemPaymentMethod instanceof BuyItemPaymentMethod.ItemCategory) && C27039d.m66650j(((BuyItemPaymentMethod.ItemCategory) buyItemPaymentMethod).getMaxCardCount()) > 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof BuyItemPaymentMethod.ItemCategory) {
            itemCategory = (BuyItemPaymentMethod.ItemCategory) next;
        } else {
            itemCategory = null;
        }
        if (itemCategory != null) {
            maxCardCount = itemCategory.getMaxCardCount();
        }
        this.f39278s0 = C27039d.m66651k(maxCardCount, 5);
    }
}
