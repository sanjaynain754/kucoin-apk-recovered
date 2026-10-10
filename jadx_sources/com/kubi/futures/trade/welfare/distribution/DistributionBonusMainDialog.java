package com.kubi.futures.trade.welfare.distribution;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.trade.welfare.FuturesTrialRulesDialog;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.DistributionRetentionEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36835s;
import f00.C37304a;
import g00.InterfaceC37752d;
import java.util.concurrent.TimeUnit;
import k10.DialogC40864b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
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

/* JADX INFO: compiled from: DistributionBonusMainDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J \u0010)\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J \u0010.\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020'H\u0002J\u0010\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020'H\u0016J\b\u00104\u001a\u00020'H\u0002J\b\u00105\u001a\u00020'H\u0002J\b\u00106\u001a\u00020'H\u0002J \u00107\u001a\u00020'2\u0006\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020-H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "trialViewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getTrialViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "trialViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainViewModel;", "viewModel$delegate", "countDownTimer", "Landroid/os/CountDownTimer;", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "getTrial", "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "trial$delegate", "loadingDialog", "Lcom/kubi/sdk/widget/loading/LoadingDialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setMiniTraAmount", "precision", "", FirebaseAnalytics.Param.CURRENCY, "", "setMiniProRequirement", "startTimeCountDownText", "formatLong", "time", "", "onDestroy", "activeBonus", "showLoading", "hideLoading", "setCountDownString", "days", "hours", "minutes", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDistributionBonusMainDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionBonusMainDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,345:1\n143#2,20:346\n106#3,15:366\n20#4:381\n153#5,7:382\n220#6,5:389\n*S KotlinDebug\n*F\n+ 1 DistributionBonusMainDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog\n*L\n70#1:346,20\n74#1:366,15\n107#1:381\n179#1:382,7\n72#1:389,5\n*E\n"})
public final class DistributionBonusMainDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24674q0 = C45681e.m100799e(this, new Function1<DistributionBonusMainDialog, C36835s>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36835s invoke(@NotNull DistributionBonusMainDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36835s.m82534a(fragment.requireView());
        }
    }, new Function1<C36835s, Unit>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36835s it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36835s c36835s) {
            invoke(c36835s);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24675r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DistributionBonusMainDialog.m28451M4(this.f24727b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24676s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public CountDownTimer f24677t0;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f24678u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public DialogC40864b f24679v0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f24673x0 = {Reflection.property1(new PropertyReference1Impl(DistributionBonusMainDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogFutureBonusDistributionBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f24672w0 = new Companion(null);

    /* JADX INFO: compiled from: DistributionBonusMainDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$Companion;", "", "<init>", "()V", "DISTRIBUTION_BONUS_DIALOG_KEY", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$a */
    /* JADX INFO: compiled from: DistributionBonusMainDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14262a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24680b;

        public C14262a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24680b = function;
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
            return this.f24680b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24680b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$b */
    /* JADX INFO: compiled from: DistributionBonusMainDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$startTimeCountDownText$1", "Landroid/os/CountDownTimer;", "onTick", "", "millisUntilFinished", "", "onFinish", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownTimerC14263b extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DistributionBonusMainDialog f24681a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountDownTimerC14263b(long j11, DistributionBonusMainDialog distributionBonusMainDialog) {
            super(j11, 1000L);
            this.f24681a = distributionBonusMainDialog;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f24681a.m28449I4("00", "00", "00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long days = timeUnit.toDays(millisUntilFinished);
            long hours = timeUnit.toHours(millisUntilFinished) % ((long) 24);
            long minutes = timeUnit.toMinutes(millisUntilFinished) % ((long) 60);
            DistributionBonusMainDialog distributionBonusMainDialog = this.f24681a;
            distributionBonusMainDialog.m28449I4(distributionBonusMainDialog.m28465w4(days), this.f24681a.m28465w4(hours), this.f24681a.m28465w4(minutes));
        }
    }

    /* JADX INFO: renamed from: B4 */
    private final void m28442B4() {
        DialogC40864b dialogC40864b = this.f24679v0;
        if (dialogC40864b != null) {
            dialogC40864b.m89436a(true);
        }
        this.f24679v0 = null;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m28445E4(DistributionBonusMainDialog distributionBonusMainDialog) {
        FragmentManager childFragmentManager;
        FuturesTrialRulesDialog futuresTrialRulesDialog = new FuturesTrialRulesDialog();
        futuresTrialRulesDialog.setArguments(BundleKt.bundleOf(new Pair("data", distributionBonusMainDialog.m28472y4().getCode())));
        Fragment parentFragment = distributionBonusMainDialog.getParentFragment();
        if (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) {
            return Unit.INSTANCE;
        }
        futuresTrialRulesDialog.show(childFragmentManager, "FuturesTrialRulesDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m28446F4(DistributionBonusMainDialog distributionBonusMainDialog) {
        PopupFrequencyManager.f24773a.m28614a(C46894j.f104736a.m103273l(C27041f.m66668h(distributionBonusMainDialog.m28472y4().getCode())));
        distributionBonusMainDialog.showLoading();
        distributionBonusMainDialog.m28467A4().m28477s(C27041f.m66668h(distributionBonusMainDialog.m28472y4().getCode()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    private final void m28450L4() {
        long jMo25031v = RepositoryServiceLocator.f19236a.m20288g().mo25031v();
        long jMax = Math.max(C27039d.m66653m(m28472y4().getActivateValidPeriod(), jMo25031v) - jMo25031v, 0L);
        if (jMax <= 0) {
            return;
        }
        CountDownTimer countDownTimer = this.f24677t0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimerC14263b countDownTimerC14263b = new CountDownTimerC14263b(jMax, this);
        this.f24677t0 = countDownTimerC14263b;
        countDownTimerC14263b.start();
    }

    private final void showLoading() {
        DialogC40864b dialogC40864b = this.f24679v0;
        if (dialogC40864b != null) {
            dialogC40864b.m89436a(true);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DialogC40864b dialogC40864b2 = new DialogC40864b(contextRequireContext, false, 2, null);
        dialogC40864b2.show();
        this.f24679v0 = dialogC40864b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public final String m28465w4(long j11) {
        if (j11 >= 10) {
            return String.valueOf(j11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('0');
        sb2.append(j11);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public final FuturesTrialViewModel m28466z4() {
        return (FuturesTrialViewModel) this.f24675r0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public final DistributionBonusMainViewModel m28467A4() {
        return (DistributionBonusMainViewModel) this.f24676s0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_future_bonus_distribution, container);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [T, java.lang.String] */
    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        PropertyEntity properties;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m54191p3();
        if (TextUtils.isEmpty(m28472y4().getCode())) {
            dismiss();
            return;
        }
        final C36835s c36835sM28471x4 = m28471x4();
        if (c36835sM28471x4 == null) {
            return;
        }
        c36835sM28471x4.f81008k.setText("🎉 " + getString(R$string.kumex_trail_fund_message));
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(m28472y4().getCurrency()), false, 2, null);
        int iM66651k = C27039d.m66651k((coinEntityM99528E == null || (properties = coinEntityM99528E.getProperties()) == null) ? null : properties.getShortDisplayPrecision(), 4);
        c36835sM28471x4.f80999b.setText(C42180b.m92640e(C27039d.m66656p(m28472y4().getFaceValue()), null, iM66651k, true, false, false, 0, null, 121, null));
        c36835sM28471x4.f81000c.setText(C27041f.m66668h(C27041f.m66677q(m28472y4().getCurrency())));
        BaseTextView baseTextView = c36835sM28471x4.f81018u;
        C27017c c27017c = C27017c.f54310a;
        baseTextView.setText(c27017c.m66516f(R$string.kumex_welfare_select_max, C42180b.m92640e(C27039d.m66656p(m28472y4().getMaxValue()), null, iM66651k, true, false, false, 0, null, 121, null), C27041f.m66668h(C27041f.m66677q(m28472y4().getCurrency()))));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView rightDesc = c36835sM28471x4.f81018u;
        Intrinsics.checkNotNullExpressionValue(rightDesc, "rightDesc");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper.m54120f(rightDesc, new Pair(textTagEnum, new StyleSpan(1)), new Pair(textTagEnum, new ForegroundColorSpan(getResources().getColor(R$color.c_text))));
        if (Intrinsics.areEqual(m28472y4().getType(), "VIP")) {
            AppCompatImageView leftLeverage = c36835sM28471x4.f81012o;
            Intrinsics.checkNotNullExpressionValue(leftLeverage, "leftLeverage");
            ViewExtKt.m66577h(leftLeverage);
            c36835sM28471x4.f81011n.setImageResource(R$drawable.bkumex_futures_vip);
            c36835sM28471x4.f80999b.setTextColor(Color.parseColor("#DB984B"));
            c36835sM28471x4.f81000c.setTextColor(Color.parseColor("#DB984B"));
        } else {
            AppCompatImageView leftLeverage2 = c36835sM28471x4.f81012o;
            Intrinsics.checkNotNullExpressionValue(leftLeverage2, "leftLeverage");
            ViewExtKt.m66594y(leftLeverage2);
            AppCompatImageView leftLeverage3 = c36835sM28471x4.f81012o;
            Intrinsics.checkNotNullExpressionValue(leftLeverage3, "leftLeverage");
            C27046k.m66701p(leftLeverage3, Color.parseColor("#0d00B47D"));
            c36835sM28471x4.f81011n.setImageResource(R$drawable.bkumex_futures_trial);
            BaseTextView baseTextView2 = c36835sM28471x4.f80999b;
            int i11 = R$color.primary;
            baseTextView2.setTextColor(c27017c.m66512a(i11));
            c36835sM28471x4.f81000c.setTextColor(c27017c.m66512a(i11));
        }
        BaseTextView baseTextView3 = c36835sM28471x4.f81009l;
        int i12 = R$string.kumex_expires_time;
        Long expiredPeriod = m28472y4().getExpiredPeriod();
        baseTextView3.setText(c27017c.m66516f(i12, C27041f.m66669i(expiredPeriod != null ? C42179a.m92633f(expiredPeriod.longValue(), null, false, true, null, 11, null) : null, "--")));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M66668h = C27041f.m66668h(C27041f.m66677q(m28472y4().getCurrency()));
        objectRef.element = M66668h;
        m28469K4(c36835sM28471x4, iM66651k, M66668h);
        m28468J4(c36835sM28471x4, iM66651k, (String) objectRef.element);
        m28449I4("00", "00", "00");
        m28450L4();
        KcPrimaryButton btnActive = c36835sM28471x4.f81001d;
        Intrinsics.checkNotNullExpressionValue(btnActive, "btnActive");
        C27046k.m66711z(btnActive, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionBonusMainDialog.m28444D4(this.f24711b);
            }
        }, 1, null);
        BaseTextView condition = c36835sM28471x4.f81005h;
        Intrinsics.checkNotNullExpressionValue(condition, "condition");
        C27046k.m66711z(condition, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionBonusMainDialog.m28445E4(this.f24713b);
            }
        }, 1, null);
        ImageView close = c36835sM28471x4.f81004g;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        C27046k.m66711z(close, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionBonusMainDialog.m28446F4(this.f24714b);
            }
        }, 1, null);
        m28466z4().m28770w().observe(getViewLifecycleOwner(), new C14262a(new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DistributionBonusMainDialog.m28447G4(c36835sM28471x4, (Boolean) obj);
            }
        }));
        m28466z4().m28766s().observe(getViewLifecycleOwner(), new C14262a(new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DistributionBonusMainDialog.m28448H4(this.f24721b, (Pair) obj);
            }
        }));
        if (C12573b.f21598a.m23696a()) {
            "open_contract_dialog_dismissed_event".length();
        }
        C12572a.m23692a(this, false, new C14264x21880fa4("open_contract_dialog_dismissed_event", null, this));
        m28467A4().m28478u().observe(getViewLifecycleOwner(), new C14262a(new Function1() { // from class: com.kubi.futures.trade.welfare.distribution.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DistributionBonusMainDialog.m28443C4(this.f24724b, objectRef, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public final C36835s m28471x4() {
        return (C36835s) this.f24674q0.getValue(this, f24673x0[0]);
    }

    /* JADX INFO: renamed from: y4 */
    public final FuturesWelfareTrialItemEntity m28472y4() {
        return (FuturesWelfareTrialItemEntity) this.f24678u0.getValue();
    }

    public DistributionBonusMainDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$special$$inlined$viewModels$default$2
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
        this.f24676s0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DistributionBonusMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog$special$$inlined$viewModels$default$5
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
        this.f24678u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionBonusMainDialog.m28452N4(this.f24728b);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: C4 */
    public static final Unit m28443C4(DistributionBonusMainDialog distributionBonusMainDialog, Ref.ObjectRef objectRef, Pair pair) {
        distributionBonusMainDialog.m28442B4();
        DistributionRetentionEntity distributionRetentionEntity = (DistributionRetentionEntity) pair.getSecond();
        if (distributionRetentionEntity != null) {
            DistributionRetentionDialog.Companion companion = DistributionRetentionDialog.f24705g0;
            FragmentManager childFragmentManager = distributionBonusMainDialog.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            objectRef.element = C27041f.m66668h(distributionBonusMainDialog.m28472y4().getCurrency());
            Unit unit = Unit.INSTANCE;
            companion.show(childFragmentManager, distributionRetentionEntity, R$string.kumex_distribution_retention_dialog_desc, false);
        } else {
            distributionBonusMainDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m28444D4(DistributionBonusMainDialog distributionBonusMainDialog) {
        distributionBonusMainDialog.m28470v4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m28447G4(C36835s c36835s, Boolean bool) {
        if (bool.booleanValue()) {
            c36835s.f81001d.m55043o();
        } else {
            c36835s.f81001d.mo28851l();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m28448H4(DistributionBonusMainDialog distributionBonusMainDialog, Pair pair) {
        FragmentManager childFragmentManager;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            DistributionChooseSymbolDialog distributionChooseSymbolDialog = new DistributionChooseSymbolDialog();
            distributionChooseSymbolDialog.setArguments(BundleKt.bundleOf(new Pair("data", distributionBonusMainDialog.m28472y4())));
            Fragment parentFragment = distributionBonusMainDialog.getParentFragment();
            if (parentFragment != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null) {
                distributionChooseSymbolDialog.show(childFragmentManager, "DistributionChooseSymbolDialog");
                distributionBonusMainDialog.dismiss();
            } else {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public final void m28449I4(String str, String str2, String str3) {
        C36835s c36835sM28471x4 = m28471x4();
        if (c36835sM28471x4 == null) {
            return;
        }
        c36835sM28471x4.f81006i.setText(str);
        c36835sM28471x4.f81010m.setText(str2);
        c36835sM28471x4.f81017t.setText(str3);
    }

    /* JADX INFO: renamed from: M4 */
    public static final FuturesTrialViewModel m28451M4(DistributionBonusMainDialog distributionBonusMainDialog) {
        Fragment parentFragment;
        FuturesTrialViewModel futuresTrialViewModel;
        Fragment parentFragment2 = distributionBonusMainDialog.getParentFragment();
        if (parentFragment2 != null && (parentFragment = parentFragment2.getParentFragment()) != null && (futuresTrialViewModel = (FuturesTrialViewModel) new ViewModelProvider(parentFragment).get(FuturesTrialViewModel.class)) != null) {
            return futuresTrialViewModel;
        }
        return (FuturesTrialViewModel) new ViewModelProvider(distributionBonusMainDialog).get(FuturesTrialViewModel.class);
    }

    /* JADX INFO: renamed from: N4 */
    public static final FuturesWelfareTrialItemEntity m28452N4(DistributionBonusMainDialog distributionBonusMainDialog) {
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity;
        Bundle arguments = distributionBonusMainDialog.getArguments();
        if (arguments != null && (futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) RouteExKt.m56274t(arguments, "data")) != null) {
            return futuresWelfareTrialItemEntity;
        }
        return new FuturesWelfareTrialItemEntity("", "", null, null, null, null, null, null, null, null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1028, 63, null);
    }

    /* JADX INFO: renamed from: J4 */
    public final void m28468J4(C36835s c36835s, int i11, String str) {
        c36835s.f81015r.setText(C27017c.f54310a.m66516f(R$string.kumex_minimum_profit_requirement, C42180b.m92640e(C27039d.m66656p(m28472y4().getMinCloseRealisedPnl()), null, i11, true, false, false, 0, null, 121, null), str));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView miniProRequirement = c36835s.f81015r;
        Intrinsics.checkNotNullExpressionValue(miniProRequirement, "miniProRequirement");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper.m54120f(miniProRequirement, new Pair(textTagEnum, new StyleSpan(1)), new Pair(textTagEnum, new ForegroundColorSpan(getResources().getColor(R$color.c_text))));
        BaseTextView miniProRequirement2 = c36835s.f81015r;
        Intrinsics.checkNotNullExpressionValue(miniProRequirement2, "miniProRequirement");
        ViewExtKt.m66594y(miniProRequirement2);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m28469K4(C36835s c36835s, int i11, String str) {
        c36835s.f81016s.setText(C27017c.f54310a.m66516f(R$string.kumex_minimum_transaction_amount, C42180b.m92640e(C27039d.m66656p(m28472y4().getMinTotalAmount()), null, i11, true, false, false, 0, null, 121, null), str));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView miniTraAmount = c36835s.f81016s;
        Intrinsics.checkNotNullExpressionValue(miniTraAmount, "miniTraAmount");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper.m54120f(miniTraAmount, new Pair(textTagEnum, new StyleSpan(1)), new Pair(textTagEnum, new ForegroundColorSpan(getResources().getColor(R$color.c_text))));
        BaseTextView miniTraAmount2 = c36835s.f81016s;
        Intrinsics.checkNotNullExpressionValue(miniTraAmount2, "miniTraAmount");
        ViewExtKt.m66594y(miniTraAmount2);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f24677t0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m28470v4() {
        C43852m.m96591c(C17060n0.m36552b(), "RealTimeRewardStart", "1", null, 8, null);
        if (KuMexDepend.f30378a.m35906h()) {
            FuturesTrialViewModel futuresTrialViewModelM28466z4 = m28466z4();
            String code = m28472y4().getCode();
            if (code == null) {
                code = "";
            }
            futuresTrialViewModelM28466z4.m28759f(code, true);
            return;
        }
        InterfaceC37752d.a.m85123b(C37304a.f82764a, null, null, Boolean.TRUE, null, null, null, 59, null);
    }
}
