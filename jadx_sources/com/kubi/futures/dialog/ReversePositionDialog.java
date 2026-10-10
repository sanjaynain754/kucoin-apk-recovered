package com.kubi.futures.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.dialog.vm.ReversePositionViewModel;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36854v0;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p836zl.C46894j;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: ReversePositionDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010,\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020*H\u0002J\b\u00101\u001a\u00020*H\u0002J\b\u00102\u001a\u00020*H\u0016J\b\u00103\u001a\u00020*H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, m90084d2 = {"Lcom/kubi/futures/dialog/ReversePositionDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "streamViewModel", "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "getStreamViewModel", "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "streamViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kubi/futures/dialog/vm/ReversePositionViewModel;", "getViewModel", "()Lcom/kubi/futures/dialog/vm/ReversePositionViewModel;", "viewModel$delegate", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogPositionReverseBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogPositionReverseBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "position$delegate", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initData", "setLeverage", "leverage", "Ljava/math/BigDecimal;", "initView", "initObserver", "onResume", "onPause", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReversePositionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReversePositionDialog.kt\ncom/kubi/futures/dialog/ReversePositionDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,290:1\n106#2,15:291\n143#3,20:306\n126#4,2:326\n*S KotlinDebug\n*F\n+ 1 ReversePositionDialog.kt\ncom/kubi/futures/dialog/ReversePositionDialog\n*L\n75#1:291,15\n77#1:306,20\n230#1:326,2\n*E\n"})
public final class ReversePositionDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f22809q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.n1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReversePositionDialog.m25241Q4(this.f22867b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f22810r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final InterfaceC24293a f22811s0;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f22812t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f22813u0;

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f22808w0 = {Reflection.property1(new PropertyReference1Impl(ReversePositionDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionReverseBinding;", 0))};

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f22807v0 = new Companion(null);

    /* JADX INFO: compiled from: ReversePositionDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/dialog/ReversePositionDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(position, "position");
            ReversePositionDialog reversePositionDialog = new ReversePositionDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", position);
            reversePositionDialog.setArguments(bundle);
            reversePositionDialog.show(manager, "ReversePositionDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.ReversePositionDialog$a */
    /* JADX INFO: compiled from: ReversePositionDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13055a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f22814b;

        public C13055a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22814b = function;
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
            return this.f22814b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22814b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m25231F4(ReversePositionDialog reversePositionDialog, PositionEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        reversePositionDialog.m25260C4(it);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m25235J4(ReversePositionDialog reversePositionDialog) {
        BaseDialogFragment baseDialogFragmentM33667J = C15943u.m33667J(R$string.kumex_reverse_dialog_title, R$string.kumex_reverse_dialog_desc, null, 4, null);
        FragmentManager childFragmentManager = reversePositionDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33667J.show(childFragmentManager, "kumex_reverse_dialog_desc");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m25236K4(ReversePositionDialog reversePositionDialog) {
        BaseDialogFragment baseDialogFragmentM33667J = C15943u.m33667J(R$string.kumex_reverse_dialog_open_qty, R$string.kumex_reverse_dialog_open_qty_desc, null, 4, null);
        FragmentManager childFragmentManager = reversePositionDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM33667J.show(childFragmentManager, "kumex_reverse_dialog_open_qty_desc");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m25237L4(CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C43852m.m96591c(C17060n0.m36552b(), "BackhandTradingCheck", z11 ? "1" : "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m25238M4(C36854v0 c36854v0, Ref.BooleanRef booleanRef, ReversePositionDialog reversePositionDialog) {
        c36854v0.f81190n.m28819j();
        if (booleanRef.element) {
            c36854v0.f81175I.setMaxLines(100);
            c36854v0.f81190n.setText(reversePositionDialog.getString(R$string.home_rank_toggle));
            booleanRef.element = false;
        } else {
            c36854v0.f81175I.setMaxLines(2);
            c36854v0.f81190n.setText(reversePositionDialog.getString(R$string.home_rank_expand));
            booleanRef.element = true;
        }
        return Unit.INSTANCE;
    }

    private final void initView() {
        final C36854v0 c36854v0M25258A4 = m25258A4();
        if (c36854v0M25258A4 == null) {
            return;
        }
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView tips = c36854v0M25258A4.f81175I;
        Intrinsics.checkNotNullExpressionValue(tips, "tips");
        highlightTextHelper.m54120f(tips, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text))));
        AppCompatImageView close = c36854v0M25258A4.f81181e;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.dialog.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReversePositionDialog.m25234I4(this.f22863b);
            }
        }, 1, null);
        BaseTextView title = c36854v0M25258A4.f81176J;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        C27046k.m66711z(title, 0L, new Function0() { // from class: com.kubi.futures.dialog.q1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReversePositionDialog.m25235J4(this.f22888b);
            }
        }, 1, null);
        DashTextView openQtyLabel = c36854v0M25258A4.f81167A;
        Intrinsics.checkNotNullExpressionValue(openQtyLabel, "openQtyLabel");
        C27046k.m66711z(openQtyLabel, 0L, new Function0() { // from class: com.kubi.futures.dialog.r1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReversePositionDialog.m25236K4(this.f22891b);
            }
        }, 1, null);
        AlignTopCheckBox cbAgain = c36854v0M25258A4.f81178b;
        Intrinsics.checkNotNullExpressionValue(cbAgain, "cbAgain");
        C27046k.m66708w(cbAgain, new Function2() { // from class: com.kubi.futures.dialog.s1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReversePositionDialog.m25237L4((CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        AnimateDrawableEndView collapse = c36854v0M25258A4.f81190n;
        Intrinsics.checkNotNullExpressionValue(collapse, "collapse");
        C27046k.m66711z(collapse, 0L, new Function0() { // from class: com.kubi.futures.dialog.t1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReversePositionDialog.m25238M4(c36854v0M25258A4, booleanRef, this);
            }
        }, 1, null);
        KcPrimaryButton confirm = c36854v0M25258A4.f81191o;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.dialog.u1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReversePositionDialog.m25239N4(this.f22944b, c36854v0M25258A4);
            }
        }, 1, null);
        c36854v0M25258A4.f81171E.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = c36854v0M25258A4.f81171E.getMeasuredHeight();
        FrameLayout frame = c36854v0M25258A4.f81193q;
        Intrinsics.checkNotNullExpressionValue(frame, "frame");
        ViewExtKt.m66578i(frame, measuredHeight);
    }

    /* JADX INFO: renamed from: w4 */
    public static final ContractEntity m25255w4(ReversePositionDialog reversePositionDialog) {
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        PositionEntity positionEntityM25257y4 = reversePositionDialog.m25257y4();
        return InterfaceC44980d.m99529O(interfaceC44980dM20288g, C27041f.m66668h(positionEntityM25257y4 != null ? positionEntityM25257y4.getSymbol() : null), false, 2, null);
    }

    /* JADX INFO: renamed from: x4 */
    private final ContractEntity m25256x4() {
        return (ContractEntity) this.f22813u0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    private final PositionEntity m25257y4() {
        return (PositionEntity) this.f22812t0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final C36854v0 m25258A4() {
        return (C36854v0) this.f22811s0.getValue(this, f22808w0[0]);
    }

    /* JADX INFO: renamed from: B4 */
    public final ReversePositionViewModel m25259B4() {
        return (ReversePositionViewModel) this.f22810r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_dialog_position_reverse, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        PositionEntity positionEntityM25257y4 = m25257y4();
        if (positionEntityM25257y4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        C43852m.m96595g(C17060n0.m36552b(), "BackhandTradingPopup", null, null, 12, null);
        m25229D4();
        m25260C4(positionEntityM25257y4);
        initView();
        if (C37569d.m84649A(positionEntityM25257y4)) {
            return;
        }
        m25259B4().m25466F(C27041f.m66668h(positionEntityM25257y4.getSymbol()), positionEntityM25257y4.isTrialFunds());
    }

    /* JADX INFO: renamed from: z4 */
    public final com.kubi.futures.trade.vm.u m25262z4() {
        return (com.kubi.futures.trade.vm.u) this.f22809q0.getValue();
    }

    public ReversePositionDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.dialog.ReversePositionDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.dialog.ReversePositionDialog$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f22810r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ReversePositionViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.dialog.ReversePositionDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.dialog.ReversePositionDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.dialog.ReversePositionDialog$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f22811s0 = C45681e.m100799e(this, new Function1<ReversePositionDialog, C36854v0>() { // from class: com.kubi.futures.dialog.ReversePositionDialog$special$$inlined$viewBindingFragment$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36854v0 invoke(@NotNull ReversePositionDialog fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36854v0.m82573a(fragment.requireView());
            }
        }, new Function1<C36854v0, Unit>() { // from class: com.kubi.futures.dialog.ReversePositionDialog$special$$inlined$viewBindingFragment$default$1
            public final void invoke(@NotNull C36854v0 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36854v0 c36854v0) {
                invoke(c36854v0);
                return Unit.INSTANCE;
            }
        });
        this.f22812t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.o1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReversePositionDialog.m25240O4(this.f22870b);
            }
        });
        this.f22813u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.p1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReversePositionDialog.m25255w4(this.f22872b);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    private final void m25229D4() {
        m25259B4().m25470J().observe(getViewLifecycleOwner(), new C13055a(new Function1() { // from class: com.kubi.futures.dialog.v1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReversePositionDialog.m25233H4(this.f22950b, (TickerEntity) obj);
            }
        }));
        m25259B4().m25469I().observe(getViewLifecycleOwner(), new C13055a(new Function1() { // from class: com.kubi.futures.dialog.w1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReversePositionDialog.m25230E4(this.f22989b, (Pair) obj);
            }
        }));
        m25262z4().a(new Observer() { // from class: com.kubi.futures.dialog.x1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ReversePositionDialog.m25231F4(this.f22992b, (PositionEntity) obj);
            }
        });
        m25259B4().m25467G().observe(getViewLifecycleOwner(), new C13055a(new Function1() { // from class: com.kubi.futures.dialog.y1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReversePositionDialog.m25232G4(this.f22996b, (BigDecimal) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m25230E4(ReversePositionDialog reversePositionDialog, Pair pair) {
        C36854v0 c36854v0M25258A4 = reversePositionDialog.m25258A4();
        if (c36854v0M25258A4 == null) {
            return Unit.INSTANCE;
        }
        c36854v0M25258A4.f81191o.mo28851l();
        reversePositionDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m25232G4(ReversePositionDialog reversePositionDialog, BigDecimal bigDecimal) {
        Boolean boolValueOf;
        PositionEntity positionEntityM25257y4 = reversePositionDialog.m25257y4();
        if (positionEntityM25257y4 != null) {
            boolValueOf = Boolean.valueOf(C37569d.m84649A(positionEntityM25257y4));
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf) && !IUnifyAccountService.f53155a.get().mo64979C()) {
            Intrinsics.checkNotNull(bigDecimal);
            reversePositionDialog.m25261P4(bigDecimal);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m25233H4(ReversePositionDialog reversePositionDialog, TickerEntity tickerEntity) {
        String strM84684y;
        String strM84684y2;
        BigDecimal bigDecimalM11724a;
        C36854v0 c36854v0M25258A4 = reversePositionDialog.m25258A4();
        if (c36854v0M25258A4 == null) {
            return Unit.INSTANCE;
        }
        ContractEntity contractEntityM25256x4 = reversePositionDialog.m25256x4();
        if (contractEntityM25256x4 == null) {
            BaseTextView baseTextView = c36854v0M25258A4.f81198v;
            BigDecimal price = tickerEntity.getPrice();
            if (price == null || (bigDecimalM11724a = C6447a.m11724a(price)) == null || (strM84684y2 = bigDecimalM11724a.toPlainString()) == null) {
                strM84684y2 = C37569d.m84684y();
            }
            baseTextView.setText(strM84684y2);
        } else {
            BaseTextView baseTextView2 = c36854v0M25258A4.f81198v;
            BigDecimal price2 = tickerEntity.getPrice();
            if (price2 == null || (strM84684y = C42180b.m92640e(price2, null, C37567b.m84618h(contractEntityM25256x4), true, false, true, 0, null, 105, null)) == null) {
                strM84684y = C37569d.m84684y();
            }
            baseTextView2.setText(strM84684y);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m25234I4(ReversePositionDialog reversePositionDialog) {
        C43852m.m96591c(C17060n0.m36552b(), "BackhandTradingClose", null, null, 12, null);
        reversePositionDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m25239N4(ReversePositionDialog reversePositionDialog, C36854v0 c36854v0) {
        PositionEntity positionEntityM25257y4 = reversePositionDialog.m25257y4();
        if (positionEntityM25257y4 == null) {
            return Unit.INSTANCE;
        }
        if (c36854v0.f81191o.getF44406k()) {
            return Unit.INSTANCE;
        }
        C46392a.m102328k(C46894j.f104736a.m103250O(), !c36854v0.f81178b.isChecked());
        c36854v0.f81191o.m55043o();
        C43852m.m96591c(C17060n0.m36552b(), "BackhandTradingConfirm", null, null, 12, null);
        ReversePositionViewModel.m25440M(reversePositionDialog.m25259B4(), reversePositionDialog, positionEntityM25257y4, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final PositionEntity m25240O4(ReversePositionDialog reversePositionDialog) {
        Bundle arguments = reversePositionDialog.getArguments();
        if (arguments != null) {
            return (PositionEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final com.kubi.futures.trade.vm.u m25241Q4(ReversePositionDialog reversePositionDialog) {
        String symbol;
        Boolean boolValueOf;
        PositionEntity positionEntityM25257y4 = reversePositionDialog.m25257y4();
        String positionSide = null;
        if (positionEntityM25257y4 != null) {
            symbol = positionEntityM25257y4.getSymbol();
        } else {
            symbol = null;
        }
        String strM66668h = C27041f.m66668h(symbol);
        PositionEntity positionEntityM25257y5 = reversePositionDialog.m25257y4();
        if (positionEntityM25257y5 != null) {
            boolValueOf = Boolean.valueOf(positionEntityM25257y5.isTrialFunds());
        } else {
            boolValueOf = null;
        }
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        PositionEntity positionEntityM25257y6 = reversePositionDialog.m25257y4();
        if (positionEntityM25257y6 != null) {
            positionSide = positionEntityM25257y6.getPositionSide();
        }
        return com.kubi.futures.trade.vm.v.b(reversePositionDialog, strM66668h, zM66566d, positionSide, (MultiBizType) null, 8, (Object) null);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m25260C4(PositionEntity positionEntity) {
        C36854v0 c36854v0M25258A4 = m25258A4();
        if (c36854v0M25258A4 != null) {
            Context context = c36854v0M25258A4.f81191o.getContext();
            c36854v0M25258A4.f81174H.setText(C37569d.m84680u(positionEntity));
            c36854v0M25258A4.f81195s.setText(C37569d.m84668i(positionEntity));
            if (C37569d.m84685z(positionEntity)) {
                c36854v0M25258A4.f81172F.setText(getString(R$string.kumex_reverse_dialog_tag_sell));
                KcTradeRateView kcTradeRateView = c36854v0M25258A4.f81172F;
                Intrinsics.checkNotNull(context);
                kcTradeRateView.setTextColor(C22890g.m54281f(context, false));
            } else {
                c36854v0M25258A4.f81172F.setText(getString(R$string.kumex_reverse_dialog_tag_buy));
                KcTradeRateView kcTradeRateView2 = c36854v0M25258A4.f81172F;
                Intrinsics.checkNotNull(context);
                kcTradeRateView2.setTextColor(C22890g.m54281f(context, true));
            }
            if (C37569d.m84685z(positionEntity)) {
                c36854v0M25258A4.f81188l.setTextColor(C22890g.m54281f(context, true));
                c36854v0M25258A4.f81169C.setTextColor(C22890g.m54281f(context, false));
                c36854v0M25258A4.f81188l.setText(getString(R$string.multi));
                c36854v0M25258A4.f81169C.setText(getString(R$string.empty));
                c36854v0M25258A4.f81189m.setText(getString(R$string.kumex_reverse_dialog_market_close_long));
                c36854v0M25258A4.f81170D.setText(getString(R$string.kumex_reverse_dialog_market_open_short));
            } else {
                c36854v0M25258A4.f81188l.setTextColor(C22890g.m54281f(context, false));
                c36854v0M25258A4.f81169C.setTextColor(C22890g.m54281f(context, true));
                c36854v0M25258A4.f81188l.setText(getString(R$string.empty));
                c36854v0M25258A4.f81169C.setText(getString(R$string.multi));
                c36854v0M25258A4.f81189m.setText(getString(R$string.kumex_reverse_dialog_market_close_short));
                c36854v0M25258A4.f81170D.setText(getString(R$string.kumex_reverse_dialog_market_open_long));
            }
            c36854v0M25258A4.f81168B.setText(C37569d.m84675p(positionEntity, m25256x4(), null, false, null, 10, null));
            c36854v0M25258A4.f81187k.setText(C37569d.m84675p(positionEntity, m25256x4(), null, false, null, 10, null));
            if (C37569d.m84685z(positionEntity)) {
                c36854v0M25258A4.f81196t.setText(getString(R$string.kumex_reverse_dialog_mark_open_short));
                BaseTextView mark = c36854v0M25258A4.f81196t;
                Intrinsics.checkNotNullExpressionValue(mark, "mark");
                ViewExKt.m36490p(mark, Integer.valueOf(R$drawable.ic2_price_fall_16), Integer.valueOf(C22890g.m54281f(context, false)));
            } else {
                c36854v0M25258A4.f81196t.setText(getString(R$string.kumex_reverse_dialog_mark_open_long));
                BaseTextView mark2 = c36854v0M25258A4.f81196t;
                Intrinsics.checkNotNullExpressionValue(mark2, "mark");
                ViewExKt.m36490p(mark2, Integer.valueOf(R$drawable.ic2_price_fall_16), Integer.valueOf(C22890g.m54281f(context, true)));
            }
            if (!C37569d.m84649A(positionEntity) && !IUnifyAccountService.f53155a.get().mo64979C()) {
                return;
            }
            m25261P4(C41014a.m89921F(positionEntity.getRealLeverage(), "3"));
        }
    }

    /* JADX INFO: renamed from: P4 */
    public final void m25261P4(BigDecimal bigDecimal) {
        C36854v0 c36854v0M25258A4;
        PositionEntity positionEntityM25257y4 = m25257y4();
        if (positionEntityM25257y4 == null || (c36854v0M25258A4 = m25258A4()) == null) {
            return;
        }
        if (Intrinsics.areEqual(positionEntityM25257y4.getMarginMode(), "CROSS")) {
            BaseTextView closeLeverage = c36854v0M25258A4.f81183g;
            Intrinsics.checkNotNullExpressionValue(closeLeverage, "closeLeverage");
            C27046k.m66685H(closeLeverage);
            c36854v0M25258A4.f81183g.setText(C17054k0.m36530d(bigDecimal, false, 1, null));
        } else {
            BaseTextView closeLeverage2 = c36854v0M25258A4.f81183g;
            Intrinsics.checkNotNullExpressionValue(closeLeverage2, "closeLeverage");
            ViewExtKt.m66577h(closeLeverage2);
        }
        c36854v0M25258A4.f81200x.setText(C17054k0.m36530d(bigDecimal, false, 1, null));
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m25259B4().m25476m();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        String symbol;
        super.onResume();
        PositionEntity positionEntityM25257y4 = m25257y4();
        if (positionEntityM25257y4 != null && (symbol = positionEntityM25257y4.getSymbol()) != null) {
            m25259B4().m25473S(symbol);
        }
    }
}
