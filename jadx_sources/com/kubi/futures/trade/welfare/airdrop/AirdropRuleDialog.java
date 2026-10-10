package com.kubi.futures.trade.welfare.airdrop;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.welfare.vm.FuturesTrialRulesViewModel;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36763g;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: AirdropRuleDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0003J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0016H\u0002J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0016H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018¨\u00064"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirdropRuleDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogAirdropRuleBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogAirdropRuleBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;", "viewModel$delegate", "trialCode", "", "getTrialCode", "()Ljava/lang/String;", "trialCode$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "bindData", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "showFail", "trialId", "getTime", "time", "", "isBottomSheet", "", "getMarginDesc", "marginMode", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAirdropRuleDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirdropRuleDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropRuleDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,189:1\n143#2,20:190\n20#3:210\n220#4,5:211\n*S KotlinDebug\n*F\n+ 1 AirdropRuleDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropRuleDialog\n*L\n62#1:190,20\n122#1:210\n65#1:211,5\n*E\n"})
public final class AirdropRuleDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f24581q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropRuleDialog.m28426x4(this.f24605b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f24582r0 = C45681e.m100799e(this, new Function1<AirdropRuleDialog, C36763g>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirdropRuleDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36763g invoke(@NotNull AirdropRuleDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36763g.m82379a(fragment.requireView());
        }
    }, new Function1<C36763g, Unit>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirdropRuleDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36763g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36763g c36763g) {
            invoke(c36763g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24583s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropRuleDialog.m28412E4(this.f24607b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24584t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropRuleDialog.m28411D4(this.f24609b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f24580v0 = {Reflection.property1(new PropertyReference1Impl(AirdropRuleDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogAirdropRuleBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f24579u0 = new Companion(null);

    /* JADX INFO: compiled from: AirdropRuleDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirdropRuleDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "trialCode", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull String trialCode) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(trialCode, "trialCode");
            AirdropRuleDialog airdropRuleDialog = new AirdropRuleDialog();
            Bundle bundle = new Bundle();
            bundle.putString("data", trialCode);
            bundle.putInt("type", 8);
            airdropRuleDialog.setArguments(bundle);
            airdropRuleDialog.show(manager, "AirdropRuleDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.airdrop.AirdropRuleDialog$a */
    /* JADX INFO: compiled from: AirdropRuleDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14208a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24585b;

        public C14208a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24585b = function;
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
            return this.f24585b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24585b.invoke(obj);
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

    /* JADX INFO: renamed from: E4 */
    public static final FuturesTrialRulesViewModel m28412E4(AirdropRuleDialog airdropRuleDialog) {
        return (FuturesTrialRulesViewModel) new ViewModelProvider(airdropRuleDialog).get(FuturesTrialRulesViewModel.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: q4 */
    private final void m28420q4(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        String str;
        CharSequence charSequence;
        C27096v0 c27096v0M24440e;
        String str2;
        PropertyEntity properties;
        C36763g c36763gM28429v4 = m28429v4();
        if (c36763gM28429v4 == null) {
            return;
        }
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(repositoryServiceLocator.m20288g(), C27041f.m66668h(futuresWelfareTrialItemEntity.getCurrency()), false, 2, null);
        int iM66651k = C27039d.m66651k((coinEntityM99528E == null || (properties = coinEntityM99528E.getProperties()) == null) ? null : properties.getShortDisplayPrecision(), 4);
        String strM66668h = C27041f.m66668h(C27041f.m66677q(futuresWelfareTrialItemEntity.getCurrency()));
        c36763gM28429v4.f80067b.setText(C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getFaceValue()), null, iM66651k, true, false, false, 0, null, 121, null));
        c36763gM28429v4.f80068c.setText(strM66668h);
        c36763gM28429v4.f80077l.setText(C6447a.m11724a(C27039d.m66656p(futuresWelfareTrialItemEntity.getMaxLeverage())).toPlainString() + 'x');
        List<String> contractList = futuresWelfareTrialItemEntity.getContractList();
        if (C27039d.m66650j(contractList != null ? Integer.valueOf(contractList.size()) : null) <= 0) {
            LinearLayout llContractName = c36763gM28429v4.f80070e;
            Intrinsics.checkNotNullExpressionValue(llContractName, "llContractName");
            ViewExtKt.m66577h(llContractName);
            return;
        }
        List<String> contractList2 = futuresWelfareTrialItemEntity.getContractList();
        if (contractList2 != null) {
            str2 = (String) CollectionsKt.firstOrNull((List) contractList2);
        } else {
            str = null;
        }
        if (str != null) {
            LinearLayout llContractName2 = c36763gM28429v4.f80070e;
            Intrinsics.checkNotNullExpressionValue(llContractName2, "llContractName");
            ViewExtKt.m66594y(llContractName2);
            BaseTextView baseTextView = c36763gM28429v4.f80076k;
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), str, false, 2, null);
            if (contractEntityM99529O != null && (c27096v0M24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) != null) {
                str = str2;
                charSequence = str;
                charSequence = str;
                charSequence = c27096v0M24440e;
            }
            str = str2;
            charSequence = str;
            charSequence = str;
            str = str2;
            charSequence = str;
            baseTextView.setText(charSequence);
        }
        str = str2;
        c36763gM28429v4.f80078m.setText(m28422s4(C27041f.m66668h(futuresWelfareTrialItemEntity.getMarginMode())));
        c36763gM28429v4.f80079n.setText(futuresWelfareTrialItemEntity.getUseDurition() + ' ' + getString(R$string.day));
        BaseTextView baseTextView2 = c36763gM28429v4.f80074i;
        BigDecimal minCloseRealisedPnl = futuresWelfareTrialItemEntity.getMinCloseRealisedPnl();
        baseTextView2.setText(C42828b.m93906g(C27041f.m66668h(minCloseRealisedPnl != null ? C42180b.m92640e(minCloseRealisedPnl, null, iM66651k, true, false, false, 0, null, 121, null) : null), strM66668h, true, false, 4, null));
        BaseTextView baseTextView3 = c36763gM28429v4.f80073h;
        BigDecimal maxValue = futuresWelfareTrialItemEntity.getMaxValue();
        baseTextView3.setText(C42828b.m93906g(C27041f.m66668h(maxValue != null ? C42180b.m92640e(maxValue, null, iM66651k, true, false, false, 0, null, 121, null) : null), strM66668h, true, false, 4, null));
        BaseTextView baseTextView4 = c36763gM28429v4.f80075j;
        BigDecimal minTotalAmount = futuresWelfareTrialItemEntity.getMinTotalAmount();
        baseTextView4.setText(C42828b.m93906g(C27041f.m66668h(minTotalAmount != null ? C42180b.m92640e(minTotalAmount, null, iM66651k, true, false, false, 0, null, 121, null) : null), strM66668h, true, false, 4, null));
        c36763gM28429v4.f80071f.setText(m28423t4(C27039d.m66652l(futuresWelfareTrialItemEntity.getActivateValidPeriod())));
        c36763gM28429v4.f80080o.setText(m28423t4(C27039d.m66652l(futuresWelfareTrialItemEntity.getValidPeriod())));
        c36763gM28429v4.f80081p.setText(C27041f.m66668h(futuresWelfareTrialItemEntity.getRuleText()));
    }

    /* JADX INFO: renamed from: r4 */
    private final WrapperLoadingView m28421r4() {
        Object value = this.f24581q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (WrapperLoadingView) value;
    }

    /* JADX INFO: renamed from: s4 */
    private final String m28422s4(String str) {
        if (Intrinsics.areEqual(str, "CROSS")) {
            String string = getString(R$string.kumex_cross_position);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = getString(R$string.kumex_isolate_position);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX INFO: renamed from: t4 */
    private final String m28423t4(long j11) {
        return C42179a.m92633f(j11, null, false, true, null, 11, null);
    }

    /* JADX INFO: renamed from: u4 */
    private final String m28424u4() {
        return (String) this.f24584t0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    private final FuturesTrialRulesViewModel m28425w4() {
        return (FuturesTrialRulesViewModel) this.f24583s0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return -11;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_airdrop_rule, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final String strM28424u4 = m28424u4();
        C36763g c36763gM28429v4 = m28429v4();
        if (strM28424u4.length() == 0 || c36763gM28429v4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        m54235d4(0.7f);
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetBehavior<FrameLayout> behavior = ((BottomSheetDialog) dialog).getBehavior();
        behavior.setMaxHeight((int) (((double) C5267e0.m6182d()) * 0.7d));
        behavior.setPeekHeight(behavior.getMaxHeight());
        m28421r4().showLoading();
        m28425w4().m28747d(strM28424u4);
        m28425w4().m28748n().observe(getViewLifecycleOwner(), new C14208a(new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirdropRuleDialog.m28427y4(this.f24611b, strM28424u4, (Pair) obj);
            }
        }));
        KcSecondaryButton tvIKnow = c36763gM28429v4.f80072g;
        Intrinsics.checkNotNullExpressionValue(tvIKnow, "tvIKnow");
        C27046k.m66711z(tvIKnow, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirdropRuleDialog.m28428z4(this.f24613b);
            }
        }, 1, null);
        ImageView ivClose = c36763gM28429v4.f80069d;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirdropRuleDialog.m28408A4(this.f24617b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: v4 */
    public final C36763g m28429v4() {
        return (C36763g) this.f24582r0.getValue(this, f24580v0[0]);
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m28408A4(AirdropRuleDialog airdropRuleDialog) {
        airdropRuleDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    private final void m28409B4(final String str) {
        final WrapperLoadingView wrapperLoadingViewM28421r4 = m28421r4();
        wrapperLoadingViewM28421r4.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.airdrop.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AirdropRuleDialog.m28410C4(wrapperLoadingViewM28421r4, this, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m28410C4(WrapperLoadingView wrapperLoadingView, AirdropRuleDialog airdropRuleDialog, String str, View view) {
        wrapperLoadingView.showLoading();
        airdropRuleDialog.m28425w4().m28747d(str);
    }

    /* JADX INFO: renamed from: D4 */
    public static final String m28411D4(AirdropRuleDialog airdropRuleDialog) {
        String string;
        Bundle arguments = airdropRuleDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: x4 */
    public static final WrapperLoadingView m28426x4(AirdropRuleDialog airdropRuleDialog) {
        return WrapperLoadingView.injectView(airdropRuleDialog.requireView());
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m28427y4(AirdropRuleDialog airdropRuleDialog, String str, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue() && pair.getSecond() != null) {
            airdropRuleDialog.m28421r4().showContent();
            Object second = pair.getSecond();
            Intrinsics.checkNotNull(second);
            airdropRuleDialog.m28420q4((FuturesWelfareTrialItemEntity) second);
        } else {
            airdropRuleDialog.m28409B4(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m28428z4(AirdropRuleDialog airdropRuleDialog) {
        airdropRuleDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
