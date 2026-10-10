package com.kubi.payment.fasttrade.buy;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37692u0;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
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

/* JADX INFO: compiled from: FastBuyCryptoCurrencyDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrencyDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentDialogFastBuyCryptoCurrencyBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentDialogFastBuyCryptoCurrencyBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mContext", "Landroid/content/Context;", "cryptoCurrency", "", "fastBuyVM", "Lcom/kubi/payment/fasttrade/buy/FastBuyVM;", "buyCryptoCurrencyAdapter", "Lcom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrencyAdapter;", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "observeData", "isBottomSheet", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastBuyCryptoCurrencyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrencyDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,133:1\n143#2,20:134\n58#3,23:154\n93#3,3:177\n*S KotlinDebug\n*F\n+ 1 FastBuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrencyDialog\n*L\n32#1:134,20\n101#1:154,23\n101#1:177,3\n*E\n"})
public final class FastBuyCryptoCurrencyDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f38732q0 = C45681e.m100799e(this, new Function1<FastBuyCryptoCurrencyDialog, C37692u0>() { // from class: com.kubi.payment.fasttrade.buy.FastBuyCryptoCurrencyDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37692u0 invoke(@NotNull FastBuyCryptoCurrencyDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37692u0.m84975a(fragment.requireView());
        }
    }, new Function1<C37692u0, Unit>() { // from class: com.kubi.payment.fasttrade.buy.FastBuyCryptoCurrencyDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37692u0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37692u0 c37692u0) {
            invoke(c37692u0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    public Context f38733r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public String f38734s0;

    /* JADX INFO: renamed from: t0 */
    public FastBuyVM f38735t0;

    /* JADX INFO: renamed from: u0 */
    public FastBuyCryptoCurrencyAdapter f38736u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f38731w0 = {Reflection.property1(new PropertyReference1Impl(FastBuyCryptoCurrencyDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentDialogFastBuyCryptoCurrencyBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f38730v0 = new Companion(null);

    /* JADX INFO: compiled from: FastBuyCryptoCurrencyDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrencyDialog$Companion;", "", "<init>", "()V", "CRYPTO_CURRENCY", "", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "cryptoCurrency", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFastBuyCryptoCurrencyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrencyDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull String cryptoCurrency) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
            FastBuyCryptoCurrencyDialog fastBuyCryptoCurrencyDialog = new FastBuyCryptoCurrencyDialog();
            Bundle bundle = new Bundle();
            bundle.putString("CRYPTO_CURRENCY", cryptoCurrency);
            fastBuyCryptoCurrencyDialog.setArguments(bundle);
            fastBuyCryptoCurrencyDialog.show(fragmentManager, "payment_fast_buy_select_crypto_currency");
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.buy.FastBuyCryptoCurrencyDialog$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 FastBuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrencyDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n102#2,5:98\n71#3:103\n77#4:104\n*E\n"})
    public static final class C20553a implements TextWatcher {
        public C20553a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter = FastBuyCryptoCurrencyDialog.this.f38736u0;
            FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter2 = null;
            if (fastBuyCryptoCurrencyAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buyCryptoCurrencyAdapter");
                fastBuyCryptoCurrencyAdapter = null;
            }
            if (!fastBuyCryptoCurrencyAdapter.getIsEmptyViewEnable()) {
                FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter3 = FastBuyCryptoCurrencyDialog.this.f38736u0;
                if (fastBuyCryptoCurrencyAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buyCryptoCurrencyAdapter");
                    fastBuyCryptoCurrencyAdapter3 = null;
                }
                fastBuyCryptoCurrencyAdapter3.setEmptyViewEnable(true);
            }
            FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter4 = FastBuyCryptoCurrencyDialog.this.f38736u0;
            if (fastBuyCryptoCurrencyAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buyCryptoCurrencyAdapter");
            } else {
                fastBuyCryptoCurrencyAdapter2 = fastBuyCryptoCurrencyAdapter4;
            }
            fastBuyCryptoCurrencyAdapter2.getFilter().filter(String.valueOf(s11));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.buy.FastBuyCryptoCurrencyDialog$b */
    /* JADX INFO: compiled from: FastBuyCryptoCurrencyDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20554b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38738b;

        public C20554b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38738b = function;
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
            return this.f38738b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38738b.invoke(obj);
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

    /* JADX INFO: renamed from: o4 */
    public static final void m46735o4(FastBuyCryptoCurrencyDialog fastBuyCryptoCurrencyDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter = fastBuyCryptoCurrencyDialog.f38736u0;
        if (fastBuyCryptoCurrencyAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buyCryptoCurrencyAdapter");
            fastBuyCryptoCurrencyAdapter = null;
        }
        FastBuyCryptoCurrency item = fastBuyCryptoCurrencyAdapter.getItem(i11);
        FastBuyVM fastBuyVM = fastBuyCryptoCurrencyDialog.f38735t0;
        if (fastBuyVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastBuyVM");
            fastBuyVM = null;
        }
        fastBuyVM.m46813I(C27041f.m66668h(item != null ? item.getTitle() : null));
        C43852m.m96590b("B7FastTrade", "cryptoSelector", "1", TuplesKt.m90091to("crypto", C27041f.m66668h(item != null ? item.getTitle() : null)), TuplesKt.m90091to("type", "buy"));
        fastBuyCryptoCurrencyDialog.dismiss();
    }

    /* JADX INFO: renamed from: p4 */
    private final void m46736p4() {
        FastBuyVM fastBuyVM = this.f38735t0;
        if (fastBuyVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fastBuyVM");
            fastBuyVM = null;
        }
        fastBuyVM.m46805A().observe(getViewLifecycleOwner(), new C20554b(new Function1() { // from class: com.kubi.payment.fasttrade.buy.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastBuyCryptoCurrencyDialog.m46737q4(this.f38761b, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m46737q4(FastBuyCryptoCurrencyDialog fastBuyCryptoCurrencyDialog, List list) {
        FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter = fastBuyCryptoCurrencyDialog.f38736u0;
        if (fastBuyCryptoCurrencyAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buyCryptoCurrencyAdapter");
            fastBuyCryptoCurrencyAdapter = null;
        }
        fastBuyCryptoCurrencyAdapter.m46730p(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public final C37692u0 m46738m4() {
        return (C37692u0) this.f38732q0.getValue(this, f38731w0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f38733r0 = context;
        C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        this.f38735t0 = (FastBuyVM) new ViewModelProvider(fragmentRequireParentFragment, c45071b).get(FastBuyVM.class);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.payment_dialog_fast_buy_crypto_currency, container, false);
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
        m46734n4();
        m46736p4();
    }

    /* JADX INFO: renamed from: n4 */
    private final void m46734n4() {
        C37692u0 c37692u0M46738m4 = m46738m4();
        if (c37692u0M46738m4 == null) {
            return;
        }
        FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter = new FastBuyCryptoCurrencyAdapter();
        this.f38736u0 = fastBuyCryptoCurrencyAdapter;
        Context context = this.f38733r0;
        FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        fastBuyCryptoCurrencyAdapter.setEmptyViewLayout(context, R$layout.view_empty);
        FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter3 = this.f38736u0;
        if (fastBuyCryptoCurrencyAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buyCryptoCurrencyAdapter");
            fastBuyCryptoCurrencyAdapter3 = null;
        }
        fastBuyCryptoCurrencyAdapter3.setEmptyViewEnable(false);
        FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter4 = this.f38736u0;
        if (fastBuyCryptoCurrencyAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buyCryptoCurrencyAdapter");
            fastBuyCryptoCurrencyAdapter4 = null;
        }
        fastBuyCryptoCurrencyAdapter4.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.payment.fasttrade.buy.a
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                FastBuyCryptoCurrencyDialog.m46735o4(this.f38760a, baseQuickAdapter, view, i11);
            }
        });
        ClearEditText searchView = c37692u0M46738m4.f84695e;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        searchView.addTextChangedListener(new C20553a());
        RecyclerView recyclerView = c37692u0M46738m4.f84694d;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        FastBuyCryptoCurrencyAdapter fastBuyCryptoCurrencyAdapter5 = this.f38736u0;
        if (fastBuyCryptoCurrencyAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buyCryptoCurrencyAdapter");
        } else {
            fastBuyCryptoCurrencyAdapter2 = fastBuyCryptoCurrencyAdapter5;
        }
        recyclerView.setAdapter(fastBuyCryptoCurrencyAdapter2);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f38734s0 = RouteExKt.m56284y(arguments, "CRYPTO_CURRENCY");
        }
    }
}
