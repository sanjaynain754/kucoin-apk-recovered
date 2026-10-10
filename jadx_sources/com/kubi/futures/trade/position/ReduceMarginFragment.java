package com.kubi.futures.trade.position;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.trade.position.vm.ReduceMarginViewModel;
import com.kubi.futures.view.ModifyMarginInputView;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.C17071w;
import com.kubi.kumex.utils.Log;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36855v1;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ReduceMarginFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010\u0019\u001a\u00020\u00102\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0002J\u0012\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010)\u001a\u00020(H\u0014J\b\u0010*\u001a\u00020\u0010H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006,"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ReduceMarginFragment;", "Lcom/kubi/futures/trade/position/ChildModifyMarginFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "futuresViewModel", "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "getFuturesViewModel", "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;", "futuresViewModel$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "handlePositionChanged", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "handleSubmitResult", "it", "Lkotlin/Pair;", "", "", "handleInputBalance", "input", "", "handleTapConfirm", "trackConfirm", "initInputView", "inputView", "Lcom/kubi/futures/view/ModifyMarginInputView;", "onReduceBalanceChanged", "balance", "Ljava/math/BigDecimal;", "getAvailableBalance", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReduceMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReduceMarginFragment.kt\ncom/kubi/futures/trade/position/ReduceMarginFragment\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,309:1\n220#2,5:310\n*S KotlinDebug\n*F\n+ 1 ReduceMarginFragment.kt\ncom/kubi/futures/trade/position/ReduceMarginFragment\n*L\n43#1:310,5\n*E\n"})
public final class ReduceMarginFragment extends ChildModifyMarginFragment {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f24115b0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f24116Z = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.x3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReduceMarginFragment.m27713n4(this.f24443b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f24117a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.z3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReduceMarginFragment.m27696T3(this.f24454b);
        }
    });

    /* JADX INFO: compiled from: ReduceMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ReduceMarginFragment$Companion;", "", "<init>", "()V", "newInstance", "Landroidx/fragment/app/Fragment;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Fragment newInstance(@NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(position, "position");
            ReduceMarginFragment reduceMarginFragment = new ReduceMarginFragment();
            reduceMarginFragment.setArguments(BundleKt.bundleOf(new Pair("data", position)));
            return reduceMarginFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ReduceMarginFragment$a */
    /* JADX INFO: compiled from: ReduceMarginFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13909a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24118b;

        public C13909a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24118b = function;
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
            return this.f24118b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24118b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: U3 */
    private final com.kubi.futures.trade.vm.u m27697U3() {
        return (com.kubi.futures.trade.vm.u) this.f24117a0.getValue();
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m27703c4(ReduceMarginFragment reduceMarginFragment, CharSequence charSequence) throws Throwable {
        reduceMarginFragment.m27698W3(charSequence != null ? charSequence.toString() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m27706f4(ReduceMarginFragment reduceMarginFragment, PositionEntity it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        reduceMarginFragment.m27505E3(it);
        reduceMarginFragment.m27714V3().m28029O(it);
        reduceMarginFragment.m27715X3(it);
    }

    /* JADX INFO: renamed from: n4 */
    public static final ReduceMarginViewModel m27713n4(ReduceMarginFragment reduceMarginFragment) {
        return (ReduceMarginViewModel) new ViewModelProvider(reduceMarginFragment).get(ReduceMarginViewModel.class);
    }

    /* JADX INFO: renamed from: V3 */
    public final ReduceMarginViewModel m27714V3() {
        return (ReduceMarginViewModel) this.f24116Z.getValue();
    }

    @Override // com.kubi.futures.trade.position.ChildModifyMarginFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 == null) {
            return;
        }
        m27697U3().b();
        ModifyMarginInputView inputView = c36855v1M27509s3.f81220n;
        Intrinsics.checkNotNullExpressionValue(inputView, "inputView");
        m27701a4(inputView);
        c36855v1M27509s3.f81232z.setText(R$string.uta_isolate_margin_max_reduce_title);
        c36855v1M27509s3.f81208b.setText(R$string.kumex_modify_margin_reduce_after);
        DashTextView questionLabel = c36855v1M27509s3.f81232z;
        Intrinsics.checkNotNullExpressionValue(questionLabel, "questionLabel");
        C27046k.m66711z(questionLabel, 0L, new Function0() { // from class: com.kubi.futures.trade.position.a4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReduceMarginFragment.m27710k4(this.f24125b);
            }
        }, 1, null);
        KcPrimaryButton tvConfirm = c36855v1M27509s3.f81206D;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.position.b4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReduceMarginFragment.m27711l4(this.f24130b);
            }
        }, 1, null);
        Group autoGroup = c36855v1M27509s3.f81209c;
        Intrinsics.checkNotNullExpressionValue(autoGroup, "autoGroup");
        ViewExtKt.m66577h(autoGroup);
        m27704d4();
        m27714V3().m27944V();
        m27714V3().m28030z(getF24059W());
    }

    /* JADX INFO: renamed from: T3 */
    public static final com.kubi.futures.trade.vm.u m27696T3(ReduceMarginFragment reduceMarginFragment) {
        String symbol;
        Boolean boolValueOf;
        PositionEntity f24059w = reduceMarginFragment.getF24059W();
        String positionSide = null;
        if (f24059w != null) {
            symbol = f24059w.getSymbol();
        } else {
            symbol = null;
        }
        String strM66668h = C27041f.m66668h(symbol);
        PositionEntity f24059w2 = reduceMarginFragment.getF24059W();
        if (f24059w2 != null) {
            boolValueOf = Boolean.valueOf(f24059w2.isTrialFunds());
        } else {
            boolValueOf = null;
        }
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        PositionEntity f24059w3 = reduceMarginFragment.getF24059W();
        if (f24059w3 != null) {
            positionSide = f24059w3.getPositionSide();
        }
        return com.kubi.futures.trade.vm.v.b(reduceMarginFragment, strM66668h, zM66566d, positionSide, (MultiBizType) null, 8, (Object) null);
    }

    /* JADX INFO: renamed from: W3 */
    private final void m27698W3(String str) throws Throwable {
        PositionEntity f24059w;
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 == null || (f24059w = getF24059W()) == null) {
            return;
        }
        if (!Intrinsics.areEqual(c36855v1M27509s3.f81231y.getTag(), Boolean.TRUE)) {
            c36855v1M27509s3.f81231y.setProgress(0.0f);
        }
        BigDecimal bigDecimalM36622d = C17071w.m36622d(str);
        BigDecimal bigDecimalMo27489r3 = mo27489r3();
        boolean z11 = false;
        if (bigDecimalM36622d != null && bigDecimalM36622d.compareTo(BigDecimal.ZERO) == 0) {
            c36855v1M27509s3.f81206D.setEnabled(false);
            m27714V3().m27949e0(null, f24059w);
            return;
        }
        if (C27039d.m66656p(bigDecimalM36622d).compareTo(C27039d.m66656p(bigDecimalMo27489r3)) > 0) {
            c36855v1M27509s3.f81220n.m28884m(getStringRes(R$string.kumex_modify_margin_reduce_error_tips, new Object[0]));
            c36855v1M27509s3.f81206D.setEnabled(false);
            return;
        }
        c36855v1M27509s3.f81220n.m28883l();
        KcPrimaryButton kcPrimaryButton = c36855v1M27509s3.f81206D;
        if (str == null || str.length() == 0) {
            z11 = true;
        }
        kcPrimaryButton.setEnabled(!z11);
        m27714V3().m27949e0(bigDecimalM36622d, f24059w);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX INFO: renamed from: Y3 */
    private final void m27699Y3(Pair<Boolean, ? extends Throwable> pair) throws JSONException {
        String str;
        ModifyMarginDialog modifyMarginDialog;
        KcPrimaryButton kcPrimaryButton;
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 != null && (kcPrimaryButton = c36855v1M27509s3.f81206D) != null) {
            kcPrimaryButton.mo28851l();
        }
        PositionEntity f24059w = getF24059W();
        if (f24059w == null) {
            return;
        }
        if (pair.getFirst().booleanValue()) {
            ToastCompat.m66437C(R$string.kumex_modify_margin_add_submit_success);
            if (m27512v3()) {
                m27714V3().m28028I();
            }
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof ModifyMarginDialog) {
                modifyMarginDialog = (ModifyMarginDialog) parentFragment;
            } else {
                modifyMarginDialog = null;
            }
            if (modifyMarginDialog != null) {
                modifyMarginDialog.dismissAllowingStateLoss();
            }
            str = "success";
        } else {
            m27714V3().m27943U(C27041f.m66668h(f24059w.getSymbol()), f24059w.isTrialFunds(), C27041f.m66668h(f24059w.getPositionSide()));
            Throwable second = pair.getSecond();
            if (second != null) {
                if (second instanceof ApiException) {
                    ApiException apiException = (ApiException) second;
                    if (Intrinsics.areEqual(apiException.code, "200013") || Intrinsics.areEqual(apiException.code, "200012")) {
                        if (Intrinsics.areEqual(apiException.code, "200013")) {
                            C17058m0.m36548c(this, R$string.kumex_modify_margin_reduce_fail_risk_change);
                        } else {
                            C17058m0.m36548c(this, R$string.kumex_modify_margin_reduce_fail_max_amount);
                        }
                    } else {
                        C17058m0.m36550e(this, second);
                    }
                } else {
                    C17058m0.m36550e(this, second);
                }
            }
            str = "failure";
        }
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("AdjResult", str);
        jSONObject.put("MarginDirection", "ReduceMargin");
        jSONObject.put("isTrialFunds", String.valueOf(C27025c.m66566d(Boolean.valueOf(f24059w.isTrialFunds()))));
        jSONObject.put("positionMode", m27508H3());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36552b, "AdjustMargin", "6", jSONObject);
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m27700Z3() throws JSONException {
        PositionEntity f24059w;
        BigDecimal inputValue;
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 != null && (f24059w = getF24059W()) != null && !c36855v1M27509s3.f81206D.getF44406k() && (inputValue = c36855v1M27509s3.f81220n.getInputValue()) != null && inputValue.compareTo(BigDecimal.ZERO) > 0) {
            if (C27039d.m66656p(inputValue).compareTo(mo27489r3()) > 0) {
                c36855v1M27509s3.f81220n.m28884m(getStringRes(R$string.kumex_modify_margin_reduce_error_tips, new Object[0]));
                c36855v1M27509s3.f81206D.setEnabled(false);
            } else {
                m27712m4();
                c36855v1M27509s3.f81206D.m55043o();
                m27714V3().m27950f0(C27041f.m66668h(f24059w.getSymbol()), f24059w.isTrialFunds(), inputValue, C27041f.m66668h(f24059w.getPositionSide()));
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    private final void m27701a4(final ModifyMarginInputView modifyMarginInputView) {
        PositionEntity f24059w = getF24059W();
        if (f24059w == null) {
            return;
        }
        modifyMarginInputView.setSuffixText(C27041f.m66668h(C27041f.m66677q(f24059w.getSettleCurrency())));
        modifyMarginInputView.setSubTitleRes(R$string.kumex_modify_margin_reduce_margin);
        modifyMarginInputView.setActionListener(new Function0() { // from class: com.kubi.futures.trade.position.c4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReduceMarginFragment.m27702b4(modifyMarginInputView, this);
            }
        });
        modifyMarginInputView.setTextWatcher(new Function1() { // from class: com.kubi.futures.trade.position.d4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReduceMarginFragment.m27703c4(this.f24147b, (CharSequence) obj);
            }
        });
        int iM66650j = C27039d.m66650j(Integer.valueOf(C37567b.m84613c(m27510t3())));
        String plainString = C6447a.m11724a(C17071w.m36619a(String.valueOf(Math.pow(10.0d, ((double) iM66650j) * (-1.0d))), new BigDecimal("0.01"))).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        modifyMarginInputView.setInputHint(plainString);
        modifyMarginInputView.setPrecision(iM66650j);
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m27702b4(ModifyMarginInputView modifyMarginInputView, ReduceMarginFragment reduceMarginFragment) {
        modifyMarginInputView.setInputValue(reduceMarginFragment.mo27489r3());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    private final void m27704d4() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m27714V3().m28025F().observe(viewLifecycleOwner, new C13909a(new Function1() { // from class: com.kubi.futures.trade.position.e4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReduceMarginFragment.m27705e4(this.f24156b, (PositionRenderInfo) obj);
            }
        }));
        m27697U3().a(new Observer() { // from class: com.kubi.futures.trade.position.f4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                ReduceMarginFragment.m27706f4(this.f24166b, (PositionEntity) obj);
            }
        });
        m27714V3().m27945a0().observe(viewLifecycleOwner, new C13909a(new Function1() { // from class: com.kubi.futures.trade.position.g4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReduceMarginFragment.m27707g4(this.f24176b, (PositionRenderInfo) obj);
            }
        }));
        m27714V3().m27947c0().observe(viewLifecycleOwner, new C13909a(new Function1() { // from class: com.kubi.futures.trade.position.h4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReduceMarginFragment.m27708h4(this.f24180b, (BigDecimal) obj);
            }
        }));
        m27714V3().m27948d0().observe(viewLifecycleOwner, new C13909a(new Function1() { // from class: com.kubi.futures.trade.position.y3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReduceMarginFragment.m27709i4(this.f24449b, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m27705e4(ReduceMarginFragment reduceMarginFragment, PositionRenderInfo positionRenderInfo) {
        Intrinsics.checkNotNull(positionRenderInfo);
        reduceMarginFragment.m27515y3(positionRenderInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m27707g4(ReduceMarginFragment reduceMarginFragment, PositionRenderInfo positionRenderInfo) {
        Intrinsics.checkNotNull(positionRenderInfo);
        reduceMarginFragment.m27514x3(positionRenderInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m27708h4(ReduceMarginFragment reduceMarginFragment, BigDecimal bigDecimal) {
        reduceMarginFragment.m27716j4(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m27709i4(ReduceMarginFragment reduceMarginFragment, Pair pair) throws JSONException {
        Intrinsics.checkNotNull(pair);
        reduceMarginFragment.m27699Y3(pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m27710k4(ReduceMarginFragment reduceMarginFragment) {
        Boolean boolValueOf;
        int i11;
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        PositionEntity f24059w = reduceMarginFragment.getF24059W();
        if (f24059w != null) {
            boolValueOf = Boolean.valueOf(f24059w.isTrialFunds());
        } else {
            boolValueOf = null;
        }
        C43852m.m96589a(strM36552b, "AdjustMargin", "4", jSONObject.put("isTrialFunds", String.valueOf(C27025c.m66566d(boolValueOf))));
        int i12 = R$string.uta_isolate_margin_max_reduce_title;
        if (reduceMarginFragment.m27512v3()) {
            i11 = R$string.uta_isolate_margin_max_reduce_desc;
        } else {
            i11 = R$string.kumex_modify_margin_max_reduce_tips;
        }
        reduceMarginFragment.m27507G3(i12, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m27711l4(ReduceMarginFragment reduceMarginFragment) throws JSONException {
        reduceMarginFragment.m27700Z3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    private final void m27712m4() throws JSONException {
        String leverage;
        String leverage2;
        String entryPrice;
        String entryPrice2;
        String liquidation;
        String liquidation2;
        ModifyMarginInputView modifyMarginInputView;
        BigDecimal inputValue;
        BigDecimal bigDecimalM11724a;
        PositionEntity f24059w = getF24059W();
        if (f24059w == null) {
            return;
        }
        String strM36552b = C17060n0.m36552b();
        JSONObject jSONObject = new JSONObject();
        PositionRenderInfo value = m27714V3().m28025F().getValue();
        PositionRenderInfo value2 = m27714V3().m27945a0().getValue();
        jSONObject.put("MarginDirection", "ReduceMargin");
        String plainString = null;
        if (value != null) {
            leverage = value.getLeverage();
        } else {
            leverage = null;
        }
        jSONObject.put("lev1", C27041f.m66668h(leverage));
        if (value2 != null) {
            leverage2 = value2.getLeverage();
        } else {
            leverage2 = null;
        }
        jSONObject.put("lev2", C27041f.m66668h(leverage2));
        if (value != null) {
            entryPrice = value.getEntryPrice();
        } else {
            entryPrice = null;
        }
        jSONObject.put("openPrice1", C27041f.m66668h(entryPrice));
        if (value2 != null) {
            entryPrice2 = value2.getEntryPrice();
        } else {
            entryPrice2 = null;
        }
        jSONObject.put("openPrice2", C27041f.m66668h(entryPrice2));
        if (value != null) {
            liquidation = value.getLiquidation();
        } else {
            liquidation = null;
        }
        jSONObject.put("liqPrice1", C27041f.m66668h(liquidation));
        if (value2 != null) {
            liquidation2 = value2.getLiquidation();
        } else {
            liquidation2 = null;
        }
        jSONObject.put("liqPrice2", C27041f.m66668h(liquidation2));
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 != null && (modifyMarginInputView = c36855v1M27509s3.f81220n) != null && (inputValue = modifyMarginInputView.getInputValue()) != null && (bigDecimalM11724a = C6447a.m11724a(inputValue)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        }
        jSONObject.put("ChooseMargin", C27041f.m66668h(plainString));
        jSONObject.put("symbol", C27041f.m66668h(f24059w.getSymbol()));
        jSONObject.put("isTrialFunds", String.valueOf(f24059w.isTrialFunds()));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM36552b, "AdjustLeverage", "6", jSONObject);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m27715X3(PositionEntity positionEntity) throws Throwable {
        BigDecimal inputValue;
        ModifyMarginInputView modifyMarginInputView;
        C36855v1 c36855v1M27509s3 = m27509s3();
        if (c36855v1M27509s3 != null && (modifyMarginInputView = c36855v1M27509s3.f81220n) != null) {
            inputValue = modifyMarginInputView.getInputValue();
        } else {
            inputValue = null;
        }
        if (inputValue != null && (inputValue.compareTo(BigDecimal.ZERO) <= 0 || inputValue.compareTo(mo27489r3()) > 0)) {
            Log log = Log.f30813a;
            String tag = getTAG();
            Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
            log.m36615a(tag, "handlePositionChanged-不满足计算条件");
            return;
        }
        m27714V3().m27949e0(inputValue, positionEntity);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m27716j4(BigDecimal bigDecimal) {
        C36855v1 c36855v1M27509s3;
        Integer numValueOf;
        PositionEntity f24059w = getF24059W();
        if (f24059w == null || (c36855v1M27509s3 = m27509s3()) == null) {
            return;
        }
        if (bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) >= 0) {
            BaseTextView baseTextView = c36855v1M27509s3.f81212f;
            ContractEntity contractEntityM27510t3 = m27510t3();
            if (contractEntityM27510t3 != null) {
                numValueOf = Integer.valueOf(C37567b.m84613c(contractEntityM27510t3));
            } else {
                numValueOf = null;
            }
            baseTextView.setText(C42828b.m93906g(C27041f.m66669i(C42180b.m92640e(bigDecimal, null, C27039d.m66651k(numValueOf, 2), true, false, true, 0, null, 105, null), C37569d.m84684y()), C27041f.m66668h(C27041f.m66677q(f24059w.getSettleCurrency())), true, false, 4, null));
            return;
        }
        c36855v1M27509s3.f81212f.setText(C37569d.m84684y());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        PositionEntity f24059w = getF24059W();
        if (f24059w == null) {
            return;
        }
        m27714V3().m27943U(C27041f.m66668h(f24059w.getSymbol()), f24059w.isTrialFunds(), C27041f.m66668h(f24059w.getPositionSide()));
    }

    @Override // com.kubi.futures.trade.position.ChildModifyMarginFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public BigDecimal mo27489r3() {
        Integer numValueOf;
        BigDecimal bigDecimalM66656p = C27039d.m66656p(m27714V3().m27947c0().getValue());
        ContractEntity contractEntityM27510t3 = m27510t3();
        if (contractEntityM27510t3 != null) {
            numValueOf = Integer.valueOf(C37567b.m84613c(contractEntityM27510t3));
        } else {
            numValueOf = null;
        }
        BigDecimal scale = bigDecimalM66656p.setScale(C27039d.m66651k(numValueOf, 2), RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }
}
