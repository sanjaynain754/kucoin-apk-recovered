package com.kubi.payment.fasttrade.sell.paymentmethod;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.event.api.C12572a;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.buy.bankcard.manage.ManageBankCardDialog;
import com.kubi.payment.fasttrade.sell.FastSellVM;
import com.kubi.payment.fasttrade.sell.paymentmethod.SellPaymentMethodDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37593a1;
import p569qq.C43846g;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
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

/* JADX INFO: compiled from: SellPaymentMethodDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020%H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastSellPaymentMethodBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastSellPaymentMethodBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "fastSellVM", "Lcom/kubi/payment/fasttrade/sell/FastSellVM;", "paymentMethodAdapter", "Lcom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodAdapter;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "handleItemClick", ViewProps.POSITION, "", "observeData", "enableEmptyView", "isBottomSheet", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellPaymentMethodDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellPaymentMethodDialog.kt\ncom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,172:1\n143#2,20:173\n44#3,2:193\n*S KotlinDebug\n*F\n+ 1 SellPaymentMethodDialog.kt\ncom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodDialog\n*L\n39#1:173,20\n60#1:193,2\n*E\n"})
public final class SellPaymentMethodDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f38937q0 = C45681e.m100799e(this, new Function1<SellPaymentMethodDialog, C37593a1>() { // from class: com.kubi.payment.fasttrade.sell.paymentmethod.SellPaymentMethodDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37593a1 invoke(@NotNull SellPaymentMethodDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37593a1.m84770a(fragment.requireView());
        }
    }, new Function1<C37593a1, Unit>() { // from class: com.kubi.payment.fasttrade.sell.paymentmethod.SellPaymentMethodDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37593a1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37593a1 c37593a1) {
            invoke(c37593a1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    public Context f38938r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public FastSellVM f38939s0;

    /* JADX INFO: renamed from: t0 */
    public SellPaymentMethodAdapter f38940t0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f38936v0 = {Reflection.property1(new PropertyReference1Impl(SellPaymentMethodDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastSellPaymentMethodBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f38935u0 = new Companion(null);

    /* JADX INFO: compiled from: SellPaymentMethodDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/paymentmethod/SellPaymentMethodDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            new SellPaymentMethodDialog().show(fragmentManager, "payment_fast_sell_select_payment_method");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.paymentmethod.SellPaymentMethodDialog$a */
    /* JADX INFO: compiled from: SellPaymentMethodDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20670a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38941b;

        public C20670a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38941b = function;
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
            return this.f38941b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38941b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m47123p4(SellPaymentMethodDialog sellPaymentMethodDialog) {
        SellPaymentMethodAdapter sellPaymentMethodAdapter = sellPaymentMethodDialog.f38940t0;
        SellPaymentMethodAdapter sellPaymentMethodAdapter2 = null;
        if (sellPaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            sellPaymentMethodAdapter = null;
        }
        if (sellPaymentMethodAdapter.getIsEmptyViewEnable()) {
            return;
        }
        SellPaymentMethodAdapter sellPaymentMethodAdapter3 = sellPaymentMethodDialog.f38940t0;
        if (sellPaymentMethodAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
        } else {
            sellPaymentMethodAdapter2 = sellPaymentMethodAdapter3;
        }
        sellPaymentMethodAdapter2.setEmptyViewEnable(true);
    }

    /* JADX INFO: renamed from: r4 */
    private final void m47124r4(int i11, View view) {
        SellPaymentMethodAdapter sellPaymentMethodAdapter = this.f38940t0;
        if (sellPaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            sellPaymentMethodAdapter = null;
        }
        if (i11 >= sellPaymentMethodAdapter.getItems().size() || i11 < 0 || C27014a1.m66501a(view)) {
            return;
        }
        SellPaymentMethodAdapter sellPaymentMethodAdapter2 = this.f38940t0;
        if (sellPaymentMethodAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            sellPaymentMethodAdapter2 = null;
        }
        ItemSellPaymentMethod item = sellPaymentMethodAdapter2.getItem(i11);
        if (item == null) {
            return;
        }
        if (!(item instanceof ItemSellPaymentMethod.ItemCategory)) {
            if (!(item instanceof ItemSellPaymentMethod.ItemNormalPaymentMethod)) {
                if (!Intrinsics.areEqual(item, ItemSellPaymentMethod.ItemGuideP2P.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            ItemSellPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod = (ItemSellPaymentMethod.ItemNormalPaymentMethod) item;
            if (C27025c.m66566d(itemNormalPaymentMethod.getPaymentMethod().isEnabled())) {
                FastSellVM fastSellVM = this.f38939s0;
                if (fastSellVM != null) {
                    fastSellVM.m46933j0(itemNormalPaymentMethod);
                }
                dismiss();
                return;
            }
            return;
        }
        ItemSellPaymentMethod.ItemCategory itemCategory = (ItemSellPaymentMethod.ItemCategory) item;
        if (itemCategory.getCanEdit()) {
            ManageBankCardDialog.Companion companion = ManageBankCardDialog.x0;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            ArrayList arrayList = new ArrayList();
            FastSellVM fastSellVM2 = this.f38939s0;
            arrayList.addAll(C27024b.m66560c(fastSellVM2 != null ? fastSellVM2.m46905H() : null));
            Unit unit = Unit.INSTANCE;
            companion.show(parentFragmentManager, arrayList, C27039d.m66651k(itemCategory.getMaxCardCount(), 5), new Function1() { // from class: wt.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SellPaymentMethodDialog.m47125s4((String) obj);
                }
            });
            dismiss();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m47125s4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C12572a.m23695d("com.kubi.payment.event.PaymentEvent:fastSellRefreshPaymentMethod", Boolean.TRUE, 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m47128v4(SellPaymentMethodDialog sellPaymentMethodDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        sellPaymentMethodDialog.m47124r4(i11, view);
    }

    /* JADX INFO: renamed from: w4 */
    private final void m47129w4() {
        LiveData<List<ItemSellPaymentMethod>> liveDataM46917T;
        FastSellVM fastSellVM = this.f38939s0;
        if (fastSellVM == null || (liveDataM46917T = fastSellVM.m46917T()) == null) {
            return;
        }
        liveDataM46917T.observe(getViewLifecycleOwner(), new C20670a(new Function1() { // from class: wt.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellPaymentMethodDialog.m47130x4(this.f103383b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m47130x4(SellPaymentMethodDialog sellPaymentMethodDialog, List list) {
        SellPaymentMethodAdapter sellPaymentMethodAdapter = sellPaymentMethodDialog.f38940t0;
        if (sellPaymentMethodAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            sellPaymentMethodAdapter = null;
        }
        sellPaymentMethodAdapter.submitList(list);
        sellPaymentMethodDialog.m47131o4();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f38938r0 = context;
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        try {
            Fragment fragmentRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            this.f38939s0 = (FastSellVM) new ViewModelProvider(fragmentRequireParentFragment, c45071b).get(FastSellVM.class);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "SellPaymentMethodDialog init FastSellVM", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_fast_sell_payment_method, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int iM6182d = (C5267e0.m6182d() * 4) / 5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iM6182d;
        }
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
            }
        }
        m47126t4();
        m47129w4();
    }

    /* JADX INFO: renamed from: q4 */
    public final C37593a1 m47132q4() {
        return (C37593a1) this.f38937q0.getValue(this, f38936v0[0]);
    }

    /* JADX INFO: renamed from: t4 */
    private final void m47126t4() {
        C37593a1 c37593a1M47132q4 = m47132q4();
        if (c37593a1M47132q4 == null) {
            return;
        }
        AppCompatImageView ivClose = c37593a1M47132q4.f83600b;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: wt.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SellPaymentMethodDialog.m47127u4(this.f103384b);
            }
        }, 1, null);
        SellPaymentMethodAdapter sellPaymentMethodAdapter = new SellPaymentMethodAdapter();
        this.f38940t0 = sellPaymentMethodAdapter;
        Context context = this.f38938r0;
        SellPaymentMethodAdapter sellPaymentMethodAdapter2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        sellPaymentMethodAdapter.setEmptyViewLayout(context, R$layout.view_empty);
        SellPaymentMethodAdapter sellPaymentMethodAdapter3 = this.f38940t0;
        if (sellPaymentMethodAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            sellPaymentMethodAdapter3 = null;
        }
        sellPaymentMethodAdapter3.setEmptyViewEnable(false);
        SellPaymentMethodAdapter sellPaymentMethodAdapter4 = this.f38940t0;
        if (sellPaymentMethodAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
            sellPaymentMethodAdapter4 = null;
        }
        sellPaymentMethodAdapter4.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: wt.g
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SellPaymentMethodDialog.m47128v4(this.f103385a, baseQuickAdapter, view, i11);
            }
        });
        RecyclerView recyclerView = c37593a1M47132q4.f83601c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        SellPaymentMethodAdapter sellPaymentMethodAdapter5 = this.f38940t0;
        if (sellPaymentMethodAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentMethodAdapter");
        } else {
            sellPaymentMethodAdapter2 = sellPaymentMethodAdapter5;
        }
        recyclerView.setAdapter(sellPaymentMethodAdapter2);
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m47127u4(SellPaymentMethodDialog sellPaymentMethodDialog) {
        sellPaymentMethodDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m47131o4() {
        RecyclerView recyclerView;
        C37593a1 c37593a1M47132q4 = m47132q4();
        if (c37593a1M47132q4 != null && (recyclerView = c37593a1M47132q4.f83601c) != null) {
            recyclerView.post(new Runnable() { // from class: wt.i
                @Override // java.lang.Runnable
                public final void run() {
                    SellPaymentMethodDialog.m47123p4(this.f103386b);
                }
            });
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
