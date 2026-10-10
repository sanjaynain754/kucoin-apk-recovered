package com.kubi.futures.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
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
import com.kubi.broker.BrokerConfig;
import com.kubi.futures.trade.position.vm.BaseClosePositionViewModel;
import com.kubi.futures.trade.position.vm.MarketClosePositionViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.dialog.ResultData;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36769h;
import fm.C37569d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: MarketCloseAllPositionDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m90084d2 = {"Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogAllMarketCloseBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogAllMarketCloseBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/position/vm/MarketClosePositionViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/position/vm/MarketClosePositionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "position$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketCloseAllPositionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCloseAllPositionDialog.kt\ncom/kubi/futures/dialog/MarketCloseAllPositionDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,141:1\n143#2,20:142\n106#3,15:162\n126#4,2:177\n*S KotlinDebug\n*F\n+ 1 MarketCloseAllPositionDialog.kt\ncom/kubi/futures/dialog/MarketCloseAllPositionDialog\n*L\n52#1:142,20\n53#1:162,15\n90#1:177,2\n*E\n"})
public final class MarketCloseAllPositionDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f22782q0 = C45681e.m100799e(this, new Function1<MarketCloseAllPositionDialog, C36769h>() { // from class: com.kubi.futures.dialog.MarketCloseAllPositionDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36769h invoke(@NotNull MarketCloseAllPositionDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36769h.m82393a(fragment.requireView());
        }
    }, new Function1<C36769h, Unit>() { // from class: com.kubi.futures.dialog.MarketCloseAllPositionDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36769h it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36769h c36769h) {
            invoke(c36769h);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f22783r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22784s0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f22781u0 = {Reflection.property1(new PropertyReference1Impl(MarketCloseAllPositionDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogAllMarketCloseBinding;", 0))};

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f22780t0 = new Companion(null);

    /* JADX INFO: compiled from: MarketCloseAllPositionDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(position, "position");
            MarketCloseAllPositionDialog marketCloseAllPositionDialog = new MarketCloseAllPositionDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", position);
            marketCloseAllPositionDialog.setArguments(bundle);
            marketCloseAllPositionDialog.show(manager, "MarketCloseAllPositionDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.MarketCloseAllPositionDialog$a */
    /* JADX INFO: compiled from: MarketCloseAllPositionDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13035a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f22785b;

        public C13035a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22785b = function;
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
            return this.f22785b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22785b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 4;
    }

    /* JADX INFO: renamed from: o4 */
    private final PositionEntity m25132o4() {
        return (PositionEntity) this.f22784s0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m25133r4(CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        C43852m.m96591c(C17060n0.m36552b(), "MarketCloseAllPositionsConfirmSwitch", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m25135t4(C36769h c36769h, MarketCloseAllPositionDialog marketCloseAllPositionDialog, PositionEntity positionEntity) {
        if (c36769h.f80159d.getF44406k()) {
            return Unit.INSTANCE;
        }
        C43852m.m96591c(C17060n0.m36552b(), "MarketCloseAllPositionsConfirm", null, null, 12, null);
        c36769h.f80159d.m55043o();
        C46392a.m102328k(C46894j.f104736a.m103243H(), !c36769h.f80158c.isChecked());
        BaseClosePositionViewModel.m27974b0(marketCloseAllPositionDialog.m25139q4(), marketCloseAllPositionDialog, null, C27039d.m66656p(positionEntity.getCurrentQty()), positionEntity, BrokerConfig.f19211a.m20201d().mo4515x(), false, 32, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m25136u4(C36769h c36769h, MarketCloseAllPositionDialog marketCloseAllPositionDialog, ResultData resultData) {
        c36769h.f80159d.mo28851l();
        if (resultData.getSuccess()) {
            marketCloseAllPositionDialog.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_dialog_all_market_close, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36769h c36769hM25138p4 = m25138p4();
        if (c36769hM25138p4 == null) {
            return;
        }
        final PositionEntity positionEntityM25132o4 = m25132o4();
        if (positionEntityM25132o4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        C43852m.m96595g(C17060n0.m36552b(), "MarketCloseAllPositionsConfirm", null, null, 12, null);
        AlignTopCheckBox cbAgain = c36769hM25138p4.f80158c;
        Intrinsics.checkNotNullExpressionValue(cbAgain, "cbAgain");
        C27046k.m66708w(cbAgain, new Function2() { // from class: com.kubi.futures.dialog.f0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MarketCloseAllPositionDialog.m25133r4((CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
        KcPrimaryButton cancel = c36769hM25138p4.f80157b;
        Intrinsics.checkNotNullExpressionValue(cancel, "cancel");
        C27046k.m66711z(cancel, 0L, new Function0() { // from class: com.kubi.futures.dialog.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketCloseAllPositionDialog.m25134s4(this.f22841b);
            }
        }, 1, null);
        KcPrimaryButton confirm = c36769hM25138p4.f80159d;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.dialog.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketCloseAllPositionDialog.m25135t4(c36769hM25138p4, this, positionEntityM25132o4);
            }
        }, 1, null);
        m25139q4().m27996W().observe(getViewLifecycleOwner(), new C13035a(new Function1() { // from class: com.kubi.futures.dialog.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketCloseAllPositionDialog.m25136u4(c36769hM25138p4, this, (ResultData) obj);
            }
        }));
        String string = getString(R$string.kumex_position_list_all_market_close_submit_desc, C37569d.m84680u(positionEntityM25132o4), C37569d.m84679t(positionEntityM25132o4), "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        c36769hM25138p4.f80160e.setText(string);
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView message = c36769hM25138p4.f80160e;
        Intrinsics.checkNotNullExpressionValue(message, "message");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$color.c_text;
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i11)));
        int i12 = R$font.medium;
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(i12);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        Pair pair2 = new Pair(textTagEnum, typefaceSpanM36545b);
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN1;
        Context context = c36769hM25138p4.f80160e.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Pair pair3 = new Pair(textTagEnum2, new ForegroundColorSpan(C22890g.m54281f(context, C37569d.m84685z(positionEntityM25132o4))));
        TypefaceSpan typefaceSpanM36545b2 = C17056l0.m36545b(i12);
        if (typefaceSpanM36545b2 == null) {
            typefaceSpanM36545b2 = new TypefaceSpan("sans-serif-medium");
        }
        Pair pair4 = new Pair(textTagEnum2, typefaceSpanM36545b2);
        HighlightTextHelper.TextTagEnum textTagEnum3 = HighlightTextHelper.TextTagEnum.SPAN2;
        Pair pair5 = new Pair(textTagEnum3, new ForegroundColorSpan(c27017c.m66512a(i11)));
        TypefaceSpan typefaceSpanM36545b3 = C17056l0.m36545b(i12);
        if (typefaceSpanM36545b3 == null) {
            typefaceSpanM36545b3 = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(message, pair, pair2, pair3, pair4, pair5, new Pair(textTagEnum3, typefaceSpanM36545b3));
    }

    /* JADX INFO: renamed from: p4 */
    public final C36769h m25138p4() {
        return (C36769h) this.f22782q0.getValue(this, f22781u0[0]);
    }

    /* JADX INFO: renamed from: q4 */
    public final MarketClosePositionViewModel m25139q4() {
        return (MarketClosePositionViewModel) this.f22783r0.getValue();
    }

    public MarketCloseAllPositionDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.dialog.MarketCloseAllPositionDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.dialog.MarketCloseAllPositionDialog$special$$inlined$viewModels$default$2
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
        this.f22783r0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MarketClosePositionViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.dialog.MarketCloseAllPositionDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.dialog.MarketCloseAllPositionDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.dialog.MarketCloseAllPositionDialog$special$$inlined$viewModels$default$5
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
        this.f22784s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketCloseAllPositionDialog.m25137v4(this.f22853b);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m25134s4(MarketCloseAllPositionDialog marketCloseAllPositionDialog) {
        C43852m.m96591c(C17060n0.m36552b(), "MarketCloseAllPositionsConfirmCancell", null, null, 12, null);
        marketCloseAllPositionDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final PositionEntity m25137v4(MarketCloseAllPositionDialog marketCloseAllPositionDialog) {
        Bundle arguments = marketCloseAllPositionDialog.getArguments();
        if (arguments != null) {
            return (PositionEntity) arguments.getParcelable("data");
        }
        return null;
    }
}
