package com.kubi.futures.trade.welfare;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.host.HostManager;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36740c0;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.math.BigDecimal;
import java.util.Iterator;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: FuturesTrialRulesDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010+\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u0016H\u0002J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u001bH\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u001dH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesTrialRulesDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogFuturesTrialRulesBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFuturesTrialRulesBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialRulesViewModel;", "viewModel$delegate", "trialCode", "", "getTrialCode", "()Ljava/lang/String;", "trialCode$delegate", "lastTrial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "supportPairsExpanded", "", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onResume", "showFail", "trialId", "bindData", "trial", "getTime", "time", "", "isBottomSheet", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTrialRulesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialRulesDialog.kt\ncom/kubi/futures/trade/welfare/FuturesTrialRulesDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,202:1\n143#2,20:203\n20#3:223\n1869#4,2:224\n220#5,5:226\n*S KotlinDebug\n*F\n+ 1 FuturesTrialRulesDialog.kt\ncom/kubi/futures/trade/welfare/FuturesTrialRulesDialog\n*L\n47#1:203,20\n132#1:223\n162#1:224,2\n49#1:226,5\n*E\n"})
public final class FuturesTrialRulesDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ KProperty<Object>[] f24483w0 = {Reflection.property1(new PropertyReference1Impl(FuturesTrialRulesDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogFuturesTrialRulesBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f24484q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesTrialRulesDialog.m28080A4(this.f24893b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f24485r0 = C45681e.m100799e(this, new Function1<FuturesTrialRulesDialog, C36740c0>() { // from class: com.kubi.futures.trade.welfare.FuturesTrialRulesDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36740c0 invoke(@NotNull FuturesTrialRulesDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36740c0.m82331a(fragment.requireView());
        }
    }, new Function1<C36740c0, Unit>() { // from class: com.kubi.futures.trade.welfare.FuturesTrialRulesDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36740c0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36740c0 c36740c0) {
            invoke(c36740c0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24486s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesTrialRulesDialog.m28086H4(this.f24896b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24487t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesTrialRulesDialog.m28085G4(this.f24899b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public FuturesWelfareTrialItemEntity f24488u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f24489v0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.FuturesTrialRulesDialog$a */
    /* JADX INFO: compiled from: FuturesTrialRulesDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14171a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24490b;

        public C14171a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24490b = function;
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
            return this.f24490b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24490b.invoke(obj);
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

    /* JADX INFO: renamed from: B4 */
    public static final Unit m28081B4(FuturesTrialRulesDialog futuresTrialRulesDialog, C36740c0 c36740c0) {
        futuresTrialRulesDialog.f24489v0 = !futuresTrialRulesDialog.f24489v0;
        c36740c0.f79765A.m28819j();
        BaseTextView supportPairs = c36740c0.f79800z;
        Intrinsics.checkNotNullExpressionValue(supportPairs, "supportPairs");
        C27046k.m66684G(supportPairs, futuresTrialRulesDialog.f24489v0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final FuturesTrialRulesViewModel m28086H4(FuturesTrialRulesDialog futuresTrialRulesDialog) {
        return (FuturesTrialRulesViewModel) new ViewModelProvider(futuresTrialRulesDialog).get(FuturesTrialRulesViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX INFO: renamed from: s4 */
    private final void m28096s4(final FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        boolean z11;
        String strM92640e;
        C27096v0 c27096v0M24440e;
        PropertyEntity properties;
        this.f24488u0 = futuresWelfareTrialItemEntity;
        C36740c0 c36740c0M28103y4 = m28103y4();
        if (c36740c0M28103y4 == null) {
            return;
        }
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(futuresWelfareTrialItemEntity.getCurrency()), false, 2, null);
        int iM66651k = C27039d.m66651k((coinEntityM99528E == null || (properties = coinEntityM99528E.getProperties()) == null) ? null : properties.getShortDisplayPrecision(), 4);
        String strM66668h = C27041f.m66668h(C27041f.m66677q(futuresWelfareTrialItemEntity.getCurrency()));
        c36740c0M28103y4.f79766B.setText(futuresWelfareTrialItemEntity.isLeadTrialFund() ? R$string.kuemx_lead_trial_title : R$string.kumex_welfare_trial_rule_title);
        c36740c0M28103y4.f79776b.setText(C42180b.m92640e(C27039d.m66656p(futuresWelfareTrialItemEntity.getFaceValue()), null, iM66651k, true, false, false, 0, null, 121, null));
        c36740c0M28103y4.f79778d.setText(strM66668h);
        if (futuresWelfareTrialItemEntity.isLeadTrialFund()) {
            LinearLayoutCompat leverageLayout = c36740c0M28103y4.f79784j;
            Intrinsics.checkNotNullExpressionValue(leverageLayout, "leverageLayout");
            ViewExtKt.m66577h(leverageLayout);
            LinearLayoutCompat validLayout = c36740c0M28103y4.f79773I;
            Intrinsics.checkNotNullExpressionValue(validLayout, "validLayout");
            ViewExtKt.m66577h(validLayout);
        } else {
            LinearLayoutCompat leverageLayout2 = c36740c0M28103y4.f79784j;
            Intrinsics.checkNotNullExpressionValue(leverageLayout2, "leverageLayout");
            C27046k.m66684G(leverageLayout2, true);
            LinearLayoutCompat validLayout2 = c36740c0M28103y4.f79773I;
            Intrinsics.checkNotNullExpressionValue(validLayout2, "validLayout");
            C27046k.m66684G(validLayout2, true);
            c36740c0M28103y4.f79785k.setText(getString(R$string.kumex_welfare_trial_rule_leverage_value, C6447a.m11724a(C27039d.m66656p(futuresWelfareTrialItemEntity.getMaxLeverage())).toPlainString()));
            c36740c0M28103y4.f79774J.setText(m28100w4(C27039d.m66652l(futuresWelfareTrialItemEntity.getActivateValidPeriod())));
        }
        List<String> contractList = futuresWelfareTrialItemEntity.getContractList();
        int iM66650j = C27039d.m66650j(contractList != null ? Integer.valueOf(contractList.size()) : null);
        if (iM66650j <= 0) {
            LinearLayoutCompat supportLayout = c36740c0M28103y4.f79799y;
            Intrinsics.checkNotNullExpressionValue(supportLayout, "supportLayout");
            ViewExtKt.m66577h(supportLayout);
            return;
        }
        c36740c0M28103y4.f79765A.setText(getString(R$string.kumex_welfare_trial_rule_contract_pair, String.valueOf(iM66650j)));
        ?? sb2 = new StringBuilder();
        List<String> contractList2 = futuresWelfareTrialItemEntity.getContractList();
        if (contractList2 != null) {
            Iterator it = contractList2.iterator();
            while (it.hasNext()) {
                ?? r13 = (String) it.next();
                ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), r13, false, 2, null);
                if (contractEntityM99529O != null && (c27096v0M24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) != null) {
                    r13 = c27096v0M24440e;
                }
                sb2.append(r13);
                sb2.append(", ");
            }
        }
        c36740c0M28103y4.f79800z.setText(StringsKt.removeSuffix((CharSequence) sb2, ", "));
        BaseTextView baseTextView = c36740c0M28103y4.f79795u;
        BigDecimal minCloseRealisedPnl = futuresWelfareTrialItemEntity.getMinCloseRealisedPnl();
        if (minCloseRealisedPnl != null) {
            z11 = true;
            strM92640e = C42180b.m92640e(minCloseRealisedPnl, null, iM66651k, true, false, false, 0, null, 121, null);
        } else {
            z11 = true;
            strM92640e = null;
        }
        baseTextView.setText(C42828b.m93906g(C27041f.m66668h(strM92640e), strM66668h, true, false, 4, null));
        BaseTextView baseTextView2 = c36740c0M28103y4.f79792r;
        BigDecimal maxValue = futuresWelfareTrialItemEntity.getMaxValue();
        baseTextView2.setText(C42828b.m93906g(C27041f.m66668h(maxValue != null ? C42180b.m92640e(maxValue, null, iM66651k, true, false, false, 0, null, 121, null) : null), strM66668h, true, false, 4, null));
        BaseTextView baseTextView3 = c36740c0M28103y4.f79769E;
        BigDecimal minTotalAmount = futuresWelfareTrialItemEntity.getMinTotalAmount();
        baseTextView3.setText(C42828b.m93906g(C27041f.m66668h(minTotalAmount != null ? C42180b.m92640e(minTotalAmount, null, iM66651k, true, false, false, 0, null, 121, null) : null), strM66668h, true, false, 4, null));
        if (futuresWelfareTrialItemEntity.isLeadTrialFund()) {
            LinearLayoutCompat validLayout3 = c36740c0M28103y4.f79773I;
            Intrinsics.checkNotNullExpressionValue(validLayout3, "validLayout");
            ViewExtKt.m66577h(validLayout3);
        } else {
            LinearLayoutCompat linearLayoutCompat = c36740c0M28103y4.f79773I;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, r9);
            C27046k.m66684G(linearLayoutCompat, z11);
            c36740c0M28103y4.f79774J.setText(m28100w4(C27039d.m66652l(futuresWelfareTrialItemEntity.getActivateValidPeriod())));
        }
        c36740c0M28103y4.f79782h.setText(m28100w4(C27039d.m66652l(futuresWelfareTrialItemEntity.getValidPeriod())));
        c36740c0M28103y4.f79796v.setText(C27041f.m66668h(futuresWelfareTrialItemEntity.getRuleText()));
        BaseTextView ruleUrl = c36740c0M28103y4.f79797w;
        Intrinsics.checkNotNullExpressionValue(ruleUrl, "ruleUrl");
        String ruleUrl2 = futuresWelfareTrialItemEntity.getRuleUrl();
        C27046k.m66684G(ruleUrl, !((ruleUrl2 == null || ruleUrl2.length() == 0) ? z11 : false));
        BaseTextView ruleUrl3 = c36740c0M28103y4.f79797w;
        Intrinsics.checkNotNullExpressionValue(ruleUrl3, "ruleUrl");
        C27046k.m66711z(ruleUrl3, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTrialRulesDialog.m28097t4(futuresWelfareTrialItemEntity);
            }
        }, 1, null);
        LinearLayout trialUsageIns = c36740c0M28103y4.f79770F;
        Intrinsics.checkNotNullExpressionValue(trialUsageIns, "trialUsageIns");
        C27046k.m66711z(trialUsageIns, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTrialRulesDialog.m28098u4();
            }
        }, 1, null);
        BaseTextView supportPairs = c36740c0M28103y4.f79800z;
        Intrinsics.checkNotNullExpressionValue(supportPairs, "supportPairs");
        C27046k.m66684G(supportPairs, this.f24489v0);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m28097t4(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C27041f.m66668h(futuresWelfareTrialItemEntity.getRuleUrl()), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m28098u4() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.m() + "/support/25463084736025", null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    private final WrapperLoadingView m28099v4() {
        Object value = this.f24484q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (WrapperLoadingView) value;
    }

    /* JADX INFO: renamed from: w4 */
    private final String m28100w4(long j11) {
        return C42179a.m92633f(j11, null, false, true, null, 11, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 10;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_futures_trial_rules, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final String strM28102x4 = m28102x4();
        final C36740c0 c36740c0M28103y4 = m28103y4();
        if (strM28102x4.length() == 0 || c36740c0M28103y4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        m54235d4(0.7f);
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetBehavior<FrameLayout> behavior = ((BottomSheetDialog) dialog).getBehavior();
        behavior.setMaxHeight((int) (((double) C5267e0.m6182d()) * 0.7d));
        behavior.setPeekHeight(behavior.getMaxHeight());
        c36740c0M28103y4.f79765A.setAlignTop(false);
        AnimateDrawableEndView supportValue = c36740c0M28103y4.f79765A;
        Intrinsics.checkNotNullExpressionValue(supportValue, "supportValue");
        C27046k.m66711z(supportValue, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTrialRulesDialog.m28081B4(this.f24882b, c36740c0M28103y4);
            }
        }, 1, null);
        m28099v4().showLoading();
        m28104z4().m28747d(strM28102x4);
        m28104z4().m28748n().observe(getViewLifecycleOwner(), new C14171a(new Function1() { // from class: com.kubi.futures.trade.welfare.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTrialRulesDialog.m28082C4(this.f24886b, strM28102x4, (Pair) obj);
            }
        }));
        KcPrimaryButton tvConfirm = c36740c0M28103y4.f79771G;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTrialRulesDialog.m28083D4(this.f24889b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: x4 */
    public final String m28102x4() {
        return (String) this.f24487t0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final C36740c0 m28103y4() {
        return (C36740c0) this.f24485r0.getValue(this, f24483w0[0]);
    }

    /* JADX INFO: renamed from: z4 */
    public final FuturesTrialRulesViewModel m28104z4() {
        return (FuturesTrialRulesViewModel) this.f24486s0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public static final WrapperLoadingView m28080A4(FuturesTrialRulesDialog futuresTrialRulesDialog) {
        return WrapperLoadingView.injectView(futuresTrialRulesDialog.requireView());
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m28082C4(FuturesTrialRulesDialog futuresTrialRulesDialog, String str, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue() && pair.getSecond() != null) {
            futuresTrialRulesDialog.m28099v4().showContent();
            Object second = pair.getSecond();
            Intrinsics.checkNotNull(second);
            futuresTrialRulesDialog.m28096s4((FuturesWelfareTrialItemEntity) second);
        } else {
            futuresTrialRulesDialog.m28101E4(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m28083D4(FuturesTrialRulesDialog futuresTrialRulesDialog) {
        futuresTrialRulesDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m28084F4(WrapperLoadingView wrapperLoadingView, FuturesTrialRulesDialog futuresTrialRulesDialog, String str, View view) {
        wrapperLoadingView.showLoading();
        futuresTrialRulesDialog.m28104z4().m28747d(str);
    }

    /* JADX INFO: renamed from: G4 */
    public static final String m28085G4(FuturesTrialRulesDialog futuresTrialRulesDialog) {
        String string;
        Bundle arguments = futuresTrialRulesDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m28101E4(final String str) {
        final WrapperLoadingView wrapperLoadingViewM28099v4 = m28099v4();
        if (wrapperLoadingViewM28099v4 == null) {
            return;
        }
        wrapperLoadingViewM28099v4.showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FuturesTrialRulesDialog.m28084F4(wrapperLoadingViewM28099v4, this, str, view);
            }
        });
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = this.f24488u0;
        if (futuresWelfareTrialItemEntity != null) {
            m28099v4().showContent();
            m28096s4(futuresWelfareTrialItemEntity);
        }
    }
}
