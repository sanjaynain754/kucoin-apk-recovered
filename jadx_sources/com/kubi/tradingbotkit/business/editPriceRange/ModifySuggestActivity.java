package com.kubi.tradingbotkit.business.editPriceRange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.coin.TransferJumper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.bean.ModifySuggestParameters;
import com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel;
import com.kubi.tradingbotkit.business.spot.observer.CountBalanceObserver;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.model.CurrencyBalanceModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.math.BigDecimal;
import l50.C42059b;
import n50.C42756a;
import o50.C42972f;
import o50.C42973g;
import o50.C42974h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p481ny.C42899b;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
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
import w00.C45678b;

/* JADX INFO: compiled from: ModifySuggestActivity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020\u001eH\u0014J\b\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u001eH\u0002J\b\u0010*\u001a\u00020\u001eH\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\rH\u0002J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020$H\u0002J\u0012\u0010/\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010$H\u0002J\b\u00101\u001a\u00020\u001eH\u0002J\b\u00102\u001a\u00020\u001eH\u0002J\b\u00103\u001a\u00020\u000bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u00065"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/editPriceRange/ModifySuggestActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "<init>", "()V", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitActivityModifySuggestBinding;", "getViewBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitActivityModifySuggestBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "parameters", "Lcom/kubi/tradingbotkit/bean/ModifySuggestParameters;", "getParameters", "()Lcom/kubi/tradingbotkit/bean/ModifySuggestParameters;", "insufficientBalance", "", "editPriceRangeViewModel", "Lcom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel;", "getEditPriceRangeViewModel", "()Lcom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel;", "editPriceRangeViewModel$delegate", "Lkotlin/Lazy;", "countBalanceObserver", "Lcom/kubi/tradingbotkit/business/spot/observer/CountBalanceObserver;", "getCountBalanceObserver", "()Lcom/kubi/tradingbotkit/business/spot/observer/CountBalanceObserver;", "countBalanceObserver$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initNavigationBar", "", "getQuoteCurrencyCode", "", "getQuoteCurrencyName", "getBaseCurrencyName", "onResume", "addObserver", "showAccountError", "setContentForView", "showBottomLine", "innerParameters", "showUseRecommendParams", "quoteCurrencyName", "toTransfer", FirebaseAnalytics.Param.CURRENCY, "showKeepMySettingTip", "clickCollect", "getChoseItem", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModifySuggestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifySuggestActivity.kt\ncom/kubi/tradingbotkit/business/editPriceRange/ModifySuggestActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n*L\n1#1,330:1\n49#2,15:331\n75#3,13:346\n45#4,4:359\n*S KotlinDebug\n*F\n+ 1 ModifySuggestActivity.kt\ncom/kubi/tradingbotkit/business/editPriceRange/ModifySuggestActivity\n*L\n42#1:331,15\n67#1:346,13\n170#1:359,4\n*E\n"})
public final class ModifySuggestActivity extends BaseUiActivity {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ KProperty<Object>[] f52360A = {Reflection.property1(new PropertyReference1Impl(ModifySuggestActivity.class, "viewBinding", "getViewBinding()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitActivityModifySuggestBinding;", 0))};

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final Companion f52361z = new Companion(null);

    /* JADX INFO: renamed from: w */
    public boolean f52363w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Lazy f52364x;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f52362v = C45678b.m100788b(this, new Function1<C42059b, Unit>() { // from class: com.kubi.tradingbotkit.business.editPriceRange.ModifySuggestActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C42059b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42059b c42059b) {
            invoke(c42059b);
            return Unit.INSTANCE;
        }
    }, new Function1<ModifySuggestActivity, C42059b>() { // from class: com.kubi.tradingbotkit.business.editPriceRange.ModifySuggestActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42059b invoke(@NotNull ModifySuggestActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s-1471887751(...)");
            return C42059b.m92269a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Lazy f52365y = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifySuggestActivity.m63985G0(this.f52368b);
        }
    });

    /* JADX INFO: compiled from: ModifySuggestActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/editPriceRange/ModifySuggestActivity$Companion;", "", "<init>", "()V", "MODIFY_SUGGEST_ACTIVITY_ARGUMENT", "", "CHECK_TYPE", "KEEP_MY_SETTING", "", "USE_RECOMMEND_PARAMS", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.editPriceRange.ModifySuggestActivity$a */
    /* JADX INFO: compiled from: ModifySuggestActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26148a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f52366b;

        public C26148a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52366b = function;
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
            return this.f52366b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52366b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: P0 */
    public Void m64010P0() {
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public static final CountBalanceObserver m63985G0(ModifySuggestActivity modifySuggestActivity) {
        return new CountBalanceObserver(modifySuggestActivity.m64006K0());
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m63988W0(String str) {
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, str, null, null, "MAIN", "TRADE", false, null, 102, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public final CountBalanceObserver m64005J0() {
        return (CountBalanceObserver) this.f52365y.getValue();
    }

    /* JADX INFO: renamed from: K0 */
    public final EditPriceRangeViewModel m64006K0() {
        return (EditPriceRangeViewModel) this.f52364x.getValue();
    }

    /* JADX INFO: renamed from: O0 */
    public final C42059b m64009O0() {
        return (C42059b) this.f52362v.getValue(this, f52360A[0]);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m64012R0() {
        TextView textView;
        String string = getString(R$string.trade_account);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strM94379h = C42974h.m94379h(string);
        String string2 = getString(R$string.kc_tb_range_balance_error, m63987N0(), strM94379h);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C42059b c42059bM64009O0 = m64009O0();
        if (c42059bM64009O0 == null || (textView = c42059bM64009O0.f92460z) == null) {
            return;
        }
        textView.setText(C42973g.m94370c(string2, strM94379h, C27017c.f54310a.m66512a(R$color.b_trading_bot_currency_account_color)));
    }

    /* JADX INFO: renamed from: V0 */
    public final void m64016V0(final String str) {
        C42972f.m94366b(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifySuggestActivity.m63988W0(str);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.btrading_bot_kit_activity_modify_suggest;
    }

    public ModifySuggestActivity() {
        final Function0 function0 = null;
        this.f52364x = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EditPriceRangeViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.editPriceRange.ModifySuggestActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getMViewModelStore();
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.tradingbotkit.business.editPriceRange.ModifySuggestActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.editPriceRange.ModifySuggestActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m63980A0(ModifySuggestActivity modifySuggestActivity) {
        RadioGroup radioGroup;
        C42059b c42059bM64009O0 = modifySuggestActivity.m64009O0();
        if (c42059bM64009O0 != null && (radioGroup = c42059bM64009O0.f92450p) != null) {
            radioGroup.check(R$id.rb_modified_to_recommended_parameters);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m63981B0(ModifySuggestActivity modifySuggestActivity) {
        modifySuggestActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m63982C0(ModifySuggestActivity modifySuggestActivity) {
        modifySuggestActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m63983E0(ModifySuggestActivity modifySuggestActivity) {
        modifySuggestActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m63984F0(ModifySuggestActivity modifySuggestActivity) {
        modifySuggestActivity.m64016V0(modifySuggestActivity.m64008M0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H0 */
    private final String m63986H0() {
        String baseCurrencyName;
        ModifySuggestParameters modifySuggestParametersM64007L0 = m64007L0();
        if (modifySuggestParametersM64007L0 != null) {
            baseCurrencyName = modifySuggestParametersM64007L0.getBaseCurrencyName();
        } else {
            baseCurrencyName = null;
        }
        return C27041f.m66668h(baseCurrencyName);
    }

    /* JADX INFO: renamed from: N0 */
    private final String m63987N0() {
        String quoteCurrencyName;
        ModifySuggestParameters modifySuggestParametersM64007L0 = m64007L0();
        if (modifySuggestParametersM64007L0 != null) {
            quoteCurrencyName = modifySuggestParametersM64007L0.getQuoteCurrencyName();
        } else {
            quoteCurrencyName = null;
        }
        return C27041f.m66668h(quoteCurrencyName);
    }

    /* JADX INFO: renamed from: v0 */
    private final void m64000v0() {
        m64006K0().m64051M().observe(this, new C26148a(new Function1() { // from class: com.kubi.tradingbotkit.business.editPriceRange.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifySuggestActivity.m64001w0(this.f52367b, (CurrencyBalanceModel) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m64001w0(ModifySuggestActivity modifySuggestActivity, CurrencyBalanceModel currencyBalanceModel) {
        Group group;
        Group group2;
        AppCompatTextView appCompatTextView;
        String strM92640e;
        ModifySuggestParameters modifySuggestParametersM64007L0 = modifySuggestActivity.m64007L0();
        if (modifySuggestParametersM64007L0 == null) {
            return Unit.INSTANCE;
        }
        C42059b c42059bM64009O0 = modifySuggestActivity.m64009O0();
        if (c42059bM64009O0 != null && (appCompatTextView = c42059bM64009O0.f92413A) != null) {
            BigDecimal availableBalance = currencyBalanceModel.getAvailableBalance();
            if (availableBalance != null) {
                strM92640e = C42180b.m92640e(availableBalance, null, C27039d.m66651k(modifySuggestParametersM64007L0.getPriceIncrementPrecision(), 8), false, false, false, 0, null, 125, null);
            } else {
                strM92640e = null;
            }
            appCompatTextView.setText(strM92640e);
        }
        modifySuggestActivity.m64012R0();
        if (C41014a.m89922G(modifySuggestParametersM64007L0.getRecommendAdditionalInvestmentBd(), null, 1, null).compareTo(C41014a.m89922G(currencyBalanceModel.getAvailableBalance(), null, 1, null)) > 0 && C41014a.m89922G(currencyBalanceModel.getAvailableBalance(), null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
            modifySuggestActivity.f52363w = true;
            C42059b c42059bM64009O1 = modifySuggestActivity.m64009O0();
            if (c42059bM64009O1 != null && (group2 = c42059bM64009O1.f92441g) != null) {
                ViewExtKt.m66594y(group2);
            }
        } else {
            modifySuggestActivity.f52363w = false;
            C42059b c42059bM64009O2 = modifySuggestActivity.m64009O0();
            if (c42059bM64009O2 != null && (group = c42059bM64009O2.f92441g) != null) {
                ViewExtKt.m66577h(group);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m64002y0(ModifySuggestActivity modifySuggestActivity) {
        int iM64004I0 = modifySuggestActivity.m64004I0();
        if (modifySuggestActivity.f52363w && iM64004I0 == 2) {
            return Unit.INSTANCE;
        }
        Intent intent = new Intent();
        intent.putExtra("check_type", iM64004I0);
        modifySuggestActivity.setResult(-1, intent);
        modifySuggestActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m64003z0(ModifySuggestActivity modifySuggestActivity) {
        RadioGroup radioGroup;
        C42059b c42059bM64009O0 = modifySuggestActivity.m64009O0();
        if (c42059bM64009O0 != null && (radioGroup = c42059bM64009O0.f92450p) != null) {
            radioGroup.check(R$id.rb_keep_my_setting_params);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public final int m64004I0() {
        Integer numValueOf;
        RadioGroup radioGroup;
        C42059b c42059bM64009O0 = m64009O0();
        if (c42059bM64009O0 != null && (radioGroup = c42059bM64009O0.f92450p) != null) {
            numValueOf = Integer.valueOf(radioGroup.getCheckedRadioButtonId());
        } else {
            numValueOf = null;
        }
        int i11 = R$id.rb_keep_my_setting_params;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            return 1;
        }
        int i12 = R$id.rb_modified_to_recommended_parameters;
        if (numValueOf == null || numValueOf.intValue() != i12) {
            return 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: L0 */
    public final ModifySuggestParameters m64007L0() {
        Intent intent = getIntent();
        if (intent != null) {
            return (ModifySuggestParameters) RouteExKt.m56272s(intent, "modify_suggest_activity_argument");
        }
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public final String m64008M0() {
        String quoteCurrencyCode;
        ModifySuggestParameters modifySuggestParametersM64007L0 = m64007L0();
        if (modifySuggestParametersM64007L0 != null) {
            quoteCurrencyCode = modifySuggestParametersM64007L0.getQuoteCurrencyCode();
        } else {
            quoteCurrencyCode = null;
        }
        return C27041f.m66668h(quoteCurrencyCode);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m64011Q0() {
        BigDecimal bigDecimalM89922G;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        ModifySuggestParameters modifySuggestParametersM64007L0 = m64007L0();
        if (modifySuggestParametersM64007L0 == null) {
            return;
        }
        m64014T0();
        String strM94374c = C42974h.m94374c(C27041f.m66668h(modifySuggestParametersM64007L0.getQuoteCurrencyName()));
        C42059b c42059bM64009O0 = m64009O0();
        if (c42059bM64009O0 != null && (appCompatTextView4 = c42059bM64009O0.f92428P) != null) {
            String string = getString(R$string.kc_tb_grid_order_section);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            appCompatTextView4.setText(t0.a(string, strM94374c));
        }
        C42059b c42059bM64009O1 = m64009O0();
        if (c42059bM64009O1 != null && (appCompatTextView3 = c42059bM64009O1.f92429Q) != null) {
            appCompatTextView3.setText(modifySuggestParametersM64007L0.getMinePriceRange());
        }
        try {
            bigDecimalM89922G = C41014a.m89922G(modifySuggestParametersM64007L0.getMineGridNumberBd(), null, 1, null);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalM89922G.compareTo(bigDecimal) <= 0) {
                bigDecimalM89922G = bigDecimal;
            }
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C42756a.m93685b(th2, "modify_suggest");
            }
            bigDecimalM89922G = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = bigDecimalM89922G;
        C42059b c42059bM64009O2 = m64009O0();
        if (c42059bM64009O2 != null && (appCompatTextView2 = c42059bM64009O2.f92416D) != null) {
            Intrinsics.checkNotNull(bigDecimal2);
            appCompatTextView2.setText(C42180b.m92640e(bigDecimal2, null, 0, false, false, false, 0, null, 125, null));
        }
        C42059b c42059bM64009O3 = m64009O0();
        if (c42059bM64009O3 != null && (appCompatTextView = c42059bM64009O3.f92430R) != null) {
            String string2 = getString(R$string.kc_tb_range_section_1);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String strM94375d = C42974h.m94375d(string2);
            String string3 = getString(R$string.kc_tb_range_section_2, m63986H0());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            appCompatTextView.setText(t0.a(strM94375d, string3));
        }
        m64015U0(strM94374c);
        m64013S0(modifySuggestParametersM64007L0);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m64013S0(ModifySuggestParameters modifySuggestParameters) {
        Group group;
        Group group2;
        Group group3;
        Group group4;
        BigDecimal bigDecimalM89922G = null;
        if (C41014a.m89922G(modifySuggestParameters.getLastPriceStartBd(), null, 1, null).compareTo(C41014a.m89922G(modifySuggestParameters.getRecommendPriceStartBd(), null, 1, null)) > 0) {
            C42059b c42059bM64009O0 = m64009O0();
            if (c42059bM64009O0 != null && (group4 = c42059bM64009O0.f92439e) != null) {
                ViewExtKt.m66594y(group4);
            }
        } else {
            C42059b c42059bM64009O1 = m64009O0();
            if (c42059bM64009O1 != null && (group = c42059bM64009O1.f92439e) != null) {
                ViewExtKt.m66577h(group);
            }
        }
        BigDecimal bigDecimalM89922G2 = C41014a.m89922G(modifySuggestParameters.getLastPriceEndBd(), null, 1, null);
        BigDecimal recommendPriceEndBd = modifySuggestParameters.getRecommendPriceEndBd();
        if (recommendPriceEndBd != null) {
            bigDecimalM89922G = C41014a.m89922G(recommendPriceEndBd, null, 1, null);
        }
        if (bigDecimalM89922G2.compareTo(bigDecimalM89922G) < 0) {
            C42059b c42059bM64009O2 = m64009O0();
            if (c42059bM64009O2 != null && (group3 = c42059bM64009O2.f92440f) != null) {
                ViewExtKt.m66594y(group3);
                return;
            }
            return;
        }
        C42059b c42059bM64009O3 = m64009O0();
        if (c42059bM64009O3 != null && (group2 = c42059bM64009O3.f92440f) != null) {
            ViewExtKt.m66577h(group2);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m64014T0() {
        String strM92640e;
        Group group;
        Group group2;
        AppCompatTextView appCompatTextView;
        String strM92640e2;
        TextView textView;
        int iIntValue;
        ModifySuggestParameters modifySuggestParametersM64007L0 = m64007L0();
        if (modifySuggestParametersM64007L0 != null) {
            StringBuilder sb2 = new StringBuilder();
            BigDecimal mineDealBaseNumberBd = modifySuggestParametersM64007L0.getMineDealBaseNumberBd();
            int iIntValue2 = 8;
            if (mineDealBaseNumberBd != null) {
                Integer baseIncrementPrecision = modifySuggestParametersM64007L0.getBaseIncrementPrecision();
                if (baseIncrementPrecision != null) {
                    iIntValue = baseIncrementPrecision.intValue();
                } else {
                    iIntValue = 8;
                }
                strM92640e = C42180b.m92640e(mineDealBaseNumberBd, null, iIntValue, false, false, false, 0, null, 125, null);
            } else {
                strM92640e = null;
            }
            sb2.append(C42180b.m92647l(strM92640e));
            sb2.append(C27041f.m66668h(modifySuggestParametersM64007L0.getBaseCurrencyName()));
            String string = sb2.toString();
            C42059b c42059bM64009O0 = m64009O0();
            if (c42059bM64009O0 != null && (textView = c42059bM64009O0.f92420H) != null) {
                textView.setText(C27017c.f54310a.m66516f(R$string.kc_tb_range_sell_lose_tip, string));
            }
            C42059b c42059bM64009O1 = m64009O0();
            if (c42059bM64009O1 != null && (appCompatTextView = c42059bM64009O1.f92418F) != null) {
                BigDecimal mineAdditionalInvestmentBd = modifySuggestParametersM64007L0.getMineAdditionalInvestmentBd();
                if (mineAdditionalInvestmentBd != null) {
                    Integer priceIncrementPrecision = modifySuggestParametersM64007L0.getPriceIncrementPrecision();
                    if (priceIncrementPrecision != null) {
                        iIntValue2 = priceIncrementPrecision.intValue();
                    }
                    strM92640e2 = C42180b.m92640e(mineAdditionalInvestmentBd, null, iIntValue2, false, false, false, 0, null, 125, null);
                } else {
                    strM92640e2 = null;
                }
                appCompatTextView.setText(C42180b.m92647l(strM92640e2));
            }
            if (C41014a.m89922G(modifySuggestParametersM64007L0.getMineAdditionalInvestmentBd(), null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
                C42059b c42059bM64009O2 = m64009O0();
                if (c42059bM64009O2 != null && (group2 = c42059bM64009O2.f92442h) != null) {
                    ViewExtKt.m66594y(group2);
                    return;
                }
                return;
            }
            C42059b c42059bM64009O3 = m64009O0();
            if (c42059bM64009O3 != null && (group = c42059bM64009O3.f92442h) != null) {
                ViewExtKt.m66577h(group);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m64015U0(String str) {
        Group group;
        TextView textView;
        TextView textView2;
        AppCompatTextView appCompatTextView;
        int iIntValue;
        AppCompatTextView appCompatTextView2;
        Group group2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        String strM92640e;
        AppCompatTextView appCompatTextView5;
        ModifySuggestParameters modifySuggestParametersM64007L0 = m64007L0();
        if (modifySuggestParametersM64007L0 != null) {
            C42059b c42059bM64009O0 = m64009O0();
            if (c42059bM64009O0 != null && (appCompatTextView5 = c42059bM64009O0.f92424L) != null) {
                appCompatTextView5.setText(modifySuggestParametersM64007L0.getRecommendPriceRange());
            }
            C42059b c42059bM64009O1 = m64009O0();
            String strM92640e2 = null;
            if (c42059bM64009O1 != null && (appCompatTextView4 = c42059bM64009O1.f92422J) != null) {
                BigDecimal recommendGridNumberBd = modifySuggestParametersM64007L0.getRecommendGridNumberBd();
                if (recommendGridNumberBd != null) {
                    strM92640e = C42180b.m92640e(recommendGridNumberBd, null, 0, false, false, false, 0, null, 127, null);
                } else {
                    strM92640e = null;
                }
                appCompatTextView4.setText(C42180b.m92647l(strM92640e));
            }
            C42059b c42059bM64009O2 = m64009O0();
            if (c42059bM64009O2 != null && (appCompatTextView3 = c42059bM64009O2.f92423K) != null) {
                String string = getString(R$string.kc_tb_grid_order_section);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                appCompatTextView3.setText(t0.a(string, str));
            }
            if (C41014a.m89922G(modifySuggestParametersM64007L0.getRecommendAdditionalInvestmentBd(), null, 1, null).compareTo(BigDecimal.ZERO) == 0) {
                C42059b c42059bM64009O3 = m64009O0();
                if (c42059bM64009O3 != null && (group2 = c42059bM64009O3.f92438d) != null) {
                    ViewExtKt.m66577h(group2);
                }
            } else {
                C42059b c42059bM64009O4 = m64009O0();
                if (c42059bM64009O4 != null && (group = c42059bM64009O4.f92438d) != null) {
                    ViewExtKt.m66594y(group);
                }
            }
            C42059b c42059bM64009O5 = m64009O0();
            if (c42059bM64009O5 != null && (appCompatTextView2 = c42059bM64009O5.f92456v) != null) {
                String string2 = getString(R$string.kc_tb_range_supplement);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                appCompatTextView2.setText(t0.a(string2, str));
            }
            C42059b c42059bM64009O6 = m64009O0();
            if (c42059bM64009O6 != null && (appCompatTextView = c42059bM64009O6.f92457w) != null) {
                BigDecimal recommendAdditionalInvestmentBd = modifySuggestParametersM64007L0.getRecommendAdditionalInvestmentBd();
                if (recommendAdditionalInvestmentBd != null) {
                    Integer priceIncrementPrecision = modifySuggestParametersM64007L0.getPriceIncrementPrecision();
                    if (priceIncrementPrecision != null) {
                        iIntValue = priceIncrementPrecision.intValue();
                    } else {
                        iIntValue = 8;
                    }
                    strM92640e2 = C42180b.m92640e(recommendAdditionalInvestmentBd, null, iIntValue, false, false, false, 0, null, 125, null);
                }
                appCompatTextView.setText(C42180b.m92647l(strM92640e2));
            }
            C42059b c42059bM64009O7 = m64009O0();
            if (c42059bM64009O7 != null && (textView2 = c42059bM64009O7.f92426N) != null) {
                textView2.setText(getString(R$string.kc_tb_range_plan_rec_tip, m63986H0()));
            }
            C42059b c42059bM64009O8 = m64009O0();
            if (c42059bM64009O8 != null && (textView = c42059bM64009O8.f92459y) != null) {
                String string3 = getString(R$string.available_balance);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                textView.setText(t0.a(string3, m63987N0()));
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ View mo32393c0() {
        return (View) m64010P0();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        m64011Q0();
        m64017x0();
        m64000v0();
        getLifecycle().addObserver(m64005J0());
        m64005J0().g(m64008M0());
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m64006K0().m64049K(m64008M0());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m64017x0() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        ImageView imageView;
        ImageView imageView2;
        RadioButton radioButton;
        RadioButton radioButton2;
        RadioGroup radioGroup;
        C42059b c42059bM64009O0 = m64009O0();
        if (c42059bM64009O0 != null && (radioGroup = c42059bM64009O0.f92450p) != null) {
            radioGroup.check(R$id.rb_keep_my_setting_params);
        }
        C42059b c42059bM64009O1 = m64009O0();
        if (c42059bM64009O1 != null && (radioButton2 = c42059bM64009O1.f92451q) != null) {
            C27046k.m66711z(radioButton2, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModifySuggestActivity.m64003z0(this.f52369b);
                }
            }, 1, null);
        }
        C42059b c42059bM64009O2 = m64009O0();
        if (c42059bM64009O2 != null && (radioButton = c42059bM64009O2.f92452r) != null) {
            C27046k.m66711z(radioButton, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModifySuggestActivity.m63980A0(this.f52370b);
                }
            }, 1, null);
        }
        C42059b c42059bM64009O3 = m64009O0();
        if (c42059bM64009O3 != null && (imageView2 = c42059bM64009O3.f92443i) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModifySuggestActivity.m63981B0(this.f52371b);
                }
            }, 1, null);
        }
        C42059b c42059bM64009O4 = m64009O0();
        if (c42059bM64009O4 != null && (imageView = c42059bM64009O4.f92444j) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModifySuggestActivity.m63982C0(this.f52372b);
                }
            }, 1, null);
        }
        C42059b c42059bM64009O5 = m64009O0();
        if (c42059bM64009O5 != null && (appCompatTextView3 = c42059bM64009O5.f92414B) != null) {
            C27046k.m66711z(appCompatTextView3, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModifySuggestActivity.m63983E0(this.f52373b);
                }
            }, 1, null);
        }
        C42059b c42059bM64009O6 = m64009O0();
        if (c42059bM64009O6 != null && (appCompatTextView2 = c42059bM64009O6.f92413A) != null) {
            C27046k.m66711z(appCompatTextView2, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModifySuggestActivity.m63984F0(this.f52374b);
                }
            }, 1, null);
        }
        C42059b c42059bM64009O7 = m64009O0();
        if (c42059bM64009O7 != null && (appCompatTextView = c42059bM64009O7.f92432T) != null) {
            C27046k.m66711z(appCompatTextView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModifySuggestActivity.m64002y0(this.f52375b);
                }
            }, 1, null);
        }
    }
}
