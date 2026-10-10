package com.kubi.core.biz.symbolbarold;

import ae.C0276r;
import ae.C0285v0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import be.InterfaceC4578a;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.biz.BaseTradeCoreFragment;
import com.kubi.core.biz.loan.entity.MarginLeverageEntity;
import com.kubi.core.biz.menu.more.MoreDialogSectionTab;
import com.kubi.core.biz.menu.more.MultiTabBottomDialog;
import com.kubi.core.biz.menu.more.MultiTabItemInfo;
import com.kubi.core.biz.menu.more.TradeFunctionsFragment;
import com.kubi.core.biz.menu.more.TradeWebContainerFragment;
import com.kubi.core.biz.submit.UtaMarginTradeCoreViewModel;
import com.kubi.core.biz.symbol.ShareSymbolBizVM;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.biz.symbolbar.SymbolBarLayout;
import com.kubi.core.biz.togglesymbols.ToggleSymbolDialogHelperKt;
import com.kubi.core.utils.C12462a;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.margin.api.IMarginService;
import com.kubi.mart.api.entity.MartChangeSymbolEvent;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.entity.SymbolData;
import com.kubi.resources.MenuItem;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradebase.BizType;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41673r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p260fd.ChangeRateData;
import p309hd.InterfaceC38170b;
import p402kf.C41014a;
import p569qq.C43841b;
import p569qq.C43852m;
import p661ue.C45193a;
import p722wd.C45794c;
import p722wd.C45795d;
import p757xd.C46148j;
import p757xd.InterfaceC46139a;
import p757xd.InterfaceC46140b;
import p757xd.SymbolBarData;
import p768xo.InterfaceC46302c;
import p794yd.C46466a;
import p794yd.C46467b;
import p827zc.AbstractC46753c;
import p828zd.C46760a;
import p828zd.C46761b;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
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
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import v30.C45380f;
import w00.C45681e;

/* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 E2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020&H\u0014J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020&H\u0014J\u0010\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0002J\u0012\u0010.\u001a\u00020&2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\b\u00101\u001a\u00020&H\u0002J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0002J\u001e\u00107\u001a\u00020&2\b\b\u0002\u00108\u001a\u0002092\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0014\u0010:\u001a\u0004\u0018\u00010;2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010,\u001a\u00020-H\u0002J \u0010@\u001a\u00020&2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\b\b\u0002\u00108\u001a\u000209H\u0002J\b\u0010D\u001a\u00020&H\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006F"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiIntent;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarContract$UiState;", "Lcom/kubi/core/biz/symbolbarold/SymbolBarVM;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSymbolBarLayoutBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSymbolBarLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "getViewModel", "()Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "tradeAccount", "Lcom/kubi/core/base/TradeAccountType;", "getTradeAccount", "()Lcom/kubi/core/base/TradeAccountType;", "tradeAccount$delegate", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "getLayout", "", "initView", "", "bindFlowEvent", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onRefresh", "bindState", "resetSymbolInfo", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "updateSymbolChangeRateInfo", "changeRateInfo", "Lcom/kubi/core/base/quote/data/ChangeRateData;", "showToggleSymbol", "showMarginToggleSymbol", "showSpotToggleSymbol", "updateLeverUI", "leverConfig", "Lcom/kubi/core/biz/symbolbarold/LeverConfig;", "showMoreMenuPanel", "tab", "Lcom/kubi/core/biz/menu/more/MoreDialogSectionTab;", "trackTransferToAccount", "Lcom/kubi/data/coin/AccountType;", "createMenuItemsProvider", "Lcom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider;", "createMarginMenuItemsProvider", "Lcom/kubi/core/biz/symbolbarold/menu/MarginMoreItemsProvider;", "showMultiTabModeMoreDialog", "menuItems", "", "Lcom/kubi/resources/MenuItem;", "jumpToLeverTrade", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolBarFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolBarFragmentBase.kt\ncom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,576:1\n147#2,16:577\n106#3,15:593\n158#4,2:608\n49#5:610\n51#5:614\n46#6:611\n51#6:613\n105#7:612\n44#8,8:615\n44#8,8:623\n1#9:631\n*S KotlinDebug\n*F\n+ 1 SymbolBarFragmentBase.kt\ncom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase\n*L\n97#1:577,16\n103#1:593,15\n197#1:608,2\n226#1:610\n226#1:614\n226#1:611\n226#1:613\n226#1:612\n364#1:615,8\n431#1:623,8\n*E\n"})
public final class SymbolBarFragmentBase extends AbsTradeBaseBizFragment<SymbolBarContract$UiIntent, UiState, SymbolBarVM> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f20884Y = C45681e.m100799e(this, new Function1<SymbolBarFragmentBase, C45380f>() { // from class: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45380f invoke(@NotNull SymbolBarFragmentBase fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45380f.m100290a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45380f, Unit>() { // from class: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45380f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45380f c45380f) {
            invoke(c45380f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f20885Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f20886a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC4578a f20887b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f20883d0 = {Reflection.property1(new PropertyReference1Impl(SymbolBarFragmentBase.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSymbolBarLayoutBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f20882c0 = new Companion(null);

    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase$Companion;", "", "<init>", "()V", "TRADE_ACCOUNT", "", "newInstance", "Lcom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSymbolBarFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolBarFragmentBase.kt\ncom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,576:1\n1#2:577\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SymbolBarFragmentBase newInstance(@NotNull TradeAccountType tradeAccountType) {
            Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
            SymbolBarFragmentBase symbolBarFragmentBase = new SymbolBarFragmentBase();
            Bundle bundle = new Bundle();
            bundle.putParcelable("tradeAccountType", tradeAccountType);
            symbolBarFragmentBase.setArguments(bundle);
            return symbolBarFragmentBase;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$a */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/biz/symbolbarold/SymbolBarFragmentBase$createMarginMenuItemsProvider$1", "Lcom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider$TradeTypeToggleChangeListener;", "onChange", "", "mode", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12248a implements C0285v0.a {
        public C12248a() {
        }

        @Override // ae.C0285v0.a
        /* JADX INFO: renamed from: a */
        public void mo1016a(InterfaceC38170b mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            C44128b.m97258b("pittttttttt--createMarginMenuItemsProvider: " + mode + ", result: " + Intrinsics.areEqual(mode, InterfaceC38170b.b.f85867a));
            SymbolBarVM symbolBarVMM21011A3 = SymbolBarFragmentBase.this.m21011A3();
            if (symbolBarVMM21011A3 != null) {
                symbolBarVMM21011A3.m22828v(new SymbolBarContract$UiIntent.TradePanelModelChange(mode));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$b */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/biz/symbolbarold/SymbolBarFragmentBase$createMenuItemsProvider$1", "Lcom/kubi/core/biz/symbolbarold/menu/MenuItemsProvider$TradeTypeToggleChangeListener;", "onChange", "", "mode", "Lcom/kubi/core/base/setting/data/TradePanelModel;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12249b implements C0285v0.a {
        public C12249b() {
        }

        @Override // ae.C0285v0.a
        /* JADX INFO: renamed from: a */
        public void mo1016a(InterfaceC38170b mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            SymbolBarVM symbolBarVMM21011A3 = SymbolBarFragmentBase.this.m21011A3();
            if (symbolBarVMM21011A3 != null) {
                symbolBarVMM21011A3.m22828v(new SymbolBarContract$UiIntent.TradePanelModelChange(mode));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$10 */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbolbarold/LeverConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$10", m90122f = "SymbolBarFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1225110 extends SuspendLambda implements Function2<LeverConfig, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(LeverConfig leverConfig, Continuation<? super Unit> continuation) {
            return ((C1225110) create(leverConfig, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1225110(Continuation<? super C1225110> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1225110 c1225110 = SymbolBarFragmentBase.this.new C1225110(continuation);
            c1225110.L$0 = obj;
            return c1225110;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LeverConfig leverConfig = (LeverConfig) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SymbolBarFragmentBase.this.m22811U4(leverConfig);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$2 */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$2", m90122f = "SymbolBarFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122522 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C122522) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C122522(Continuation<? super C122522> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122522 c122522 = SymbolBarFragmentBase.this.new C122522(continuation);
            c122522.L$0 = obj;
            return c122522;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TradeItemBean tradeItemBean = symbolBizUiState.getTradeItemBean();
            if (tradeItemBean != null) {
                SymbolBarFragmentBase symbolBarFragmentBase = SymbolBarFragmentBase.this;
                symbolBarFragmentBase.m22804G4(tradeItemBean);
                SymbolBarVM symbolBarVMM21011A3 = symbolBarFragmentBase.m21011A3();
                if (symbolBarVMM21011A3 != null) {
                    String symbol = tradeItemBean.getSymbol();
                    Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                    symbolBarVMM21011A3.m22828v(new SymbolBarContract$UiIntent.SymbolChange(symbol));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$4 */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$4", m90122f = "SymbolBarFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122534 extends SuspendLambda implements Function2<Pair<? extends String, ? extends Boolean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Pair<? extends String, ? extends Boolean> pair, Continuation<? super Unit> continuation) {
            return invoke2((Pair<String, Boolean>) pair, continuation);
        }

        public C122534(Continuation<? super C122534> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122534 c122534 = SymbolBarFragmentBase.this.new C122534(continuation);
            c122534.L$0 = obj;
            return c122534;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Pair<String, Boolean> pair, Continuation<? super Unit> continuation) {
            return ((C122534) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBarLayout symbolBarLayout;
            C46148j f20881c;
            SymbolBarLayout symbolBarLayout2;
            C46148j f20881c2;
            Pair pair = (Pair) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C45380f c45380fM22816p4 = SymbolBarFragmentBase.this.m22816p4();
            if (c45380fM22816p4 != null && (symbolBarLayout2 = c45380fM22816p4.f102072b) != null && (f20881c2 = symbolBarLayout2.getF20881c()) != null) {
                String str = (String) pair.getFirst();
                if (str == null) {
                    str = "";
                }
                f20881c2.m101736r(str, null, !((Boolean) pair.getSecond()).booleanValue());
            }
            C45380f c45380fM22816p5 = SymbolBarFragmentBase.this.m22816p4();
            if (c45380fM22816p5 != null && (symbolBarLayout = c45380fM22816p5.f102072b) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
                C46148j.m101730v(f20881c, 0, false, !((Boolean) pair.getSecond()).booleanValue(), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$6 */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/quote/data/ChangeRateData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$6", m90122f = "SymbolBarFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122546 extends SuspendLambda implements Function2<ChangeRateData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ChangeRateData changeRateData, Continuation<? super Unit> continuation) {
            return ((C122546) create(changeRateData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C122546(Continuation<? super C122546> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122546 c122546 = SymbolBarFragmentBase.this.new C122546(continuation);
            c122546.L$0 = obj;
            return c122546;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChangeRateData changeRateData = (ChangeRateData) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SymbolBarFragmentBase.this.m22812V4(changeRateData);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$7 */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$7", m90122f = "SymbolBarFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122557 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C122557(Continuation<? super C122557> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Boolean> continuation) {
            return ((C122557) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122557 c122557 = new C122557(continuation);
            c122557.L$0 = obj;
            return c122557;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(symbolBizUiState.isSupportLabel());
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$8 */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$8", m90122f = "SymbolBarFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122568 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C122568(Continuation<? super C122568> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122568 c122568 = SymbolBarFragmentBase.this.new C122568(continuation);
            c122568.Z$0 = ((Boolean) obj).booleanValue();
            return c122568;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C122568) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBarLayout symbolBarLayout;
            C46148j f20881c;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C45380f c45380fM22816p4 = SymbolBarFragmentBase.this.m22816p4();
            if (c45380fM22816p4 != null && (symbolBarLayout = c45380fM22816p4.f102072b) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
                f20881c.m101741y(z11);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$c */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12258c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f20892b;

        public C12258c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f20892b = function;
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
            return this.f20892b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f20892b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$initView$2 */
    /* JADX INFO: compiled from: SymbolBarFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "event", "Lcom/kubi/core/biz/sharevm/MoreDialogEvent;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$initView$2", m90122f = "SymbolBarFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C122592 extends SuspendLambda implements Function2<C45795d, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C122592(Continuation<? super C122592> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C122592 c122592 = SymbolBarFragmentBase.this.new C122592(continuation);
            c122592.L$0 = obj;
            return c122592;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(C45795d c45795d, Continuation<? super Unit> continuation) {
            return ((C122592) create(c45795d, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C45795d c45795d = (C45795d) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SymbolBarFragmentBase.this.m22806K4(c45795d.getF103216a(), SymbolBarFragmentBase.this.m22817q4());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: I4 */
    public static final Unit m22758I4(CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
        SymbolData data;
        String symbolCode;
        SymbolData data2;
        SymbolData data3;
        String symbolCode2;
        String symbolCode3;
        SymbolData data4;
        String symbolCode4;
        SymbolData data5;
        String symbolCode5;
        String level1 = currencyFilterTransferData != null ? currencyFilterTransferData.getLevel1() : null;
        if (level1 != null) {
            switch (level1.hashCode()) {
                case -1263170109:
                    if (level1.equals(ClickCardReport.ReportData.CARD_TYPE_FUTURE) && (data = currencyFilterTransferData.getData()) != null && (symbolCode = data.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85131c(C37304a.f82764a, symbolCode, "buy", null, null, null, null, null, null, null, 508, null);
                    }
                    break;
                case -1081309778:
                    if (level1.equals(ViewProps.MARGIN) && (data2 = currencyFilterTransferData.getData()) != null && data2.getSymbolCode() != null) {
                        if (Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "cross")) {
                            SymbolData data6 = currencyFilterTransferData.getData();
                            if (data6 != null && (symbolCode3 = data6.getSymbolCode()) != null) {
                                InterfaceC37754f.a.m85136h(C37304a.f82764a, symbolCode3, Boolean.TRUE, null, null, null, 28, null);
                            }
                        } else if (Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "isolated") && (data3 = currencyFilterTransferData.getData()) != null && (symbolCode2 = data3.getSymbolCode()) != null) {
                            InterfaceC37754f.a.m85134f(C37304a.f82764a, symbolCode2, Boolean.TRUE, null, null, null, 28, null);
                        }
                    }
                    break;
                case 3537154:
                    if (level1.equals(SearchCategory$Companion.SPOT) && (data4 = currencyFilterTransferData.getData()) != null && (symbolCode4 = data4.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85140l(C37304a.f82764a, symbolCode4, Boolean.TRUE, null, null, null, null, 60, null);
                    }
                    break;
                case 92909918:
                    if (level1.equals("alpha") && (data5 = currencyFilterTransferData.getData()) != null && (symbolCode5 = data5.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85129a(C37304a.f82764a, Long.valueOf(DowngradeExKt.m66546p(symbolCode5, 0L, 1, null)), Boolean.TRUE, null, null, null, 28, null);
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P4 */
    public static final Unit m22769P4(CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
        SymbolData data;
        String symbolCode;
        SymbolData data2;
        String symbolCode2;
        String symbolCode3;
        SymbolData data3;
        String symbolCode4;
        SymbolData data4;
        String symbolCode5;
        String level1 = currencyFilterTransferData != null ? currencyFilterTransferData.getLevel1() : null;
        if (level1 != null) {
            switch (level1.hashCode()) {
                case -1263170109:
                    if (level1.equals(ClickCardReport.ReportData.CARD_TYPE_FUTURE) && (data = currencyFilterTransferData.getData()) != null && (symbolCode = data.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85131c(C37304a.f82764a, symbolCode, "buy", null, null, null, null, null, null, null, 508, null);
                    }
                    break;
                case -1081309778:
                    if (level1.equals(ViewProps.MARGIN)) {
                        if (Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "cross")) {
                            SymbolData data5 = currencyFilterTransferData.getData();
                            if (data5 != null && (symbolCode3 = data5.getSymbolCode()) != null) {
                                InterfaceC37754f.a.m85136h(C37304a.f82764a, symbolCode3, Boolean.TRUE, null, null, null, 28, null);
                            }
                        } else if (Intrinsics.areEqual(currencyFilterTransferData.getLevel2(), "isolated") && (data2 = currencyFilterTransferData.getData()) != null && (symbolCode2 = data2.getSymbolCode()) != null) {
                            InterfaceC37754f.a.m85134f(C37304a.f82764a, symbolCode2, Boolean.TRUE, null, null, null, 28, null);
                        }
                    }
                    break;
                case 3537154:
                    if (level1.equals(SearchCategory$Companion.SPOT) && (data3 = currencyFilterTransferData.getData()) != null && (symbolCode4 = data3.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85140l(C37304a.f82764a, symbolCode4, Boolean.TRUE, null, null, null, null, 60, null);
                    }
                    break;
                case 92909918:
                    if (level1.equals("alpha") && (data4 = currencyFilterTransferData.getData()) != null && (symbolCode5 = data4.getSymbolCode()) != null) {
                        InterfaceC37754f.a.m85129a(C37304a.f82764a, Long.valueOf(DowngradeExKt.m66546p(symbolCode5, 0L, 1, null)), Boolean.TRUE, null, null, null, 28, null);
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m22754C4(SymbolBarFragmentBase symbolBarFragmentBase, boolean z11) {
        symbolBarFragmentBase.m21014E3(new C45794c(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m22756E4(SymbolBarFragmentBase symbolBarFragmentBase, MarginLeverageEntity marginLeverageEntity) {
        String strM66668h = C27041f.m66668h(marginLeverageEntity.getSymbol());
        String symbol = marginLeverageEntity.getSymbol();
        boolean z11 = (symbol == null || symbol.length() == 0 || (C41014a.m89917B(marginLeverageEntity.getQuoteLeverage()) && C41014a.m89917B(marginLeverageEntity.getBaseLeverage()))) ? false : true;
        BigDecimal quoteLeverage = marginLeverageEntity.getQuoteLeverage();
        if (quoteLeverage == null && (quoteLeverage = marginLeverageEntity.getBaseLeverage()) == null) {
            quoteLeverage = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(quoteLeverage);
        symbolBarFragmentBase.m22811U4(new LeverConfig(strM66668h, z11, quoteLeverage, false, 8, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static /* synthetic */ void m22763L4(SymbolBarFragmentBase symbolBarFragmentBase, MoreDialogSectionTab moreDialogSectionTab, TradeAccountType tradeAccountType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            moreDialogSectionTab = MoreDialogSectionTab.a.f20520a;
        }
        if ((i11 & 2) != 0) {
            tradeAccountType = null;
        }
        symbolBarFragmentBase.m22806K4(moreDialogSectionTab, tradeAccountType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public static final Unit m22766N4(Ref.ObjectRef objectRef) {
        MultiTabBottomDialog multiTabBottomDialog = (MultiTabBottomDialog) objectRef.element;
        if (multiTabBottomDialog != null) {
            multiTabBottomDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final String m22793k4(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    /* JADX INFO: renamed from: l4 */
    public static final ChangeRateData m22794l4(ChangeRateData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m22798v4(SymbolBarFragmentBase symbolBarFragmentBase, boolean z11) {
        symbolBarFragmentBase.m21014E3(new C45794c(z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m22802z4(SymbolBarFragmentBase symbolBarFragmentBase, boolean z11) {
        symbolBarFragmentBase.m21014E3(new C45794c(z11));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [T, com.kubi.core.biz.menu.more.MultiTabBottomDialog] */
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
    /* JADX INFO: renamed from: M4 */
    public final void m22807M4(List<MenuItem> list, MoreDialogSectionTab moreDialogSectionTab) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String string = getString(R$string.kc_trade_more_tab_feature);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        MultiTabItemInfo multiTabItemInfo = new MultiTabItemInfo(string, TradeFunctionsFragment.f20509Y.create(list, Intrinsics.areEqual(m22817q4(), TradeAccountType.Margin.INSTANCE) ? BizType.MARGIN : BizType.SPOT, new Function0() { // from class: com.kubi.core.biz.symbolbarold.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SymbolBarFragmentBase.m22766N4(objectRef);
            }
        }));
        String string2 = getString(R$string.kc_trade_more_tab_guide);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        TradeWebContainerFragment.Companion companion = TradeWebContainerFragment.f20516W;
        MultiTabBottomDialog.Companion companion2 = MultiTabBottomDialog.f20501v0;
        ?? Create = companion2.create(CollectionsKt.mutableListOf(multiTabItemInfo, new MultiTabItemInfo(string2, companion.create(companion2.getSPOT_USER_GUIDES_URL()))), Intrinsics.areEqual(moreDialogSectionTab, MoreDialogSectionTab.b.f20521a) ? 1 : 0);
        objectRef.element = Create;
        Create.m21980u4(this, "funcitons");
    }

    /* JADX INFO: renamed from: S4 */
    public final AccountType m22810S4(TradeAccountType tradeAccountType) {
        if (Intrinsics.areEqual(tradeAccountType, TradeAccountType.ClassicSpot.INSTANCE)) {
            return AccountType.TRADE;
        }
        if (Intrinsics.areEqual(tradeAccountType, TradeAccountType.Unified.INSTANCE)) {
            return AccountType.UNIFIED;
        }
        if (Intrinsics.areEqual(tradeAccountType, TradeAccountType.Margin.INSTANCE)) {
            return AccountType.MARGIN;
        }
        if (Intrinsics.areEqual(tradeAccountType, TradeAccountType.IsolatedMargin.INSTANCE)) {
            return AccountType.ISOLATED;
        }
        return null;
    }

    /* JADX INFO: renamed from: V4 */
    public final void m22812V4(ChangeRateData changeRateData) {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        SymbolBarLayout symbolBarLayout2;
        C46148j f20881c2;
        if (changeRateData == null) {
            C45380f c45380fM22816p4 = m22816p4();
            if (c45380fM22816p4 == null || (symbolBarLayout2 = c45380fM22816p4.f102072b) == null || (f20881c2 = symbolBarLayout2.getF20881c()) == null) {
                return;
            }
            C46148j.m101729s(f20881c2, "", null, false, 4, null);
            return;
        }
        C45380f c45380fM22816p5 = m22816p4();
        if (c45380fM22816p5 == null || (symbolBarLayout = c45380fM22816p5.f102072b) == null || (f20881c = symbolBarLayout.getF20881c()) == null) {
            return;
        }
        String symbol = changeRateData.getSymbol();
        BigDecimal changeRate = changeRateData.getChangeRate();
        C46148j.m101729s(f20881c, symbol, changeRate != null ? Double.valueOf(changeRate.doubleValue()) : null, false, 4, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bkcoin_core_symbol_bar_layout;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<SymbolBarVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SymbolBarVM.class);
    }

    /* JADX INFO: renamed from: m4 */
    public final C0276r m22813m4(TradeItemBean tradeItemBean) {
        C0276r c0276r = new C0276r(tradeItemBean);
        c0276r.m926b0(new C12248a());
        return c0276r;
    }

    /* JADX INFO: renamed from: n4 */
    public final C0285v0 m22814n4(TradeItemBean tradeItemBean) {
        C0285v0 c0285v0 = new C0285v0(tradeItemBean);
        c0285v0.m993D0(new C12249b());
        return c0285v0;
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
    public SymbolBarVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new SymbolBarVM(manager);
    }

    /* JADX INFO: renamed from: p4 */
    public final C45380f m22816p4() {
        return (C45380f) this.f20884Y.getValue(this, f20883d0[0]);
    }

    /* JADX INFO: renamed from: q4 */
    public final TradeAccountType m22817q4() {
        return (TradeAccountType) this.f20886a0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public final UtaMarginTradeCoreViewModel m22818r4() {
        return (UtaMarginTradeCoreViewModel) this.f20885Z.getValue();
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20538a0() {
        return this.f20887b0;
    }

    public SymbolBarFragmentBase() {
        final Function0 function0 = new Function0() { // from class: com.kubi.core.biz.symbolbarold.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SymbolBarFragmentBase.m22779W4(this.f20898b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$special$$inlined$viewModels$default$1
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
        this.f20885Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UtaMarginTradeCoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$special$$inlined$viewModels$default$4
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
        this.f20886a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.symbolbarold.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SymbolBarFragmentBase.m22775T4(this.f20906b);
            }
        });
        this.f20887b0 = InterfaceC4578a.i.f4054a;
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m22752A4(SymbolBarFragmentBase symbolBarFragmentBase) {
        m22763L4(symbolBarFragmentBase, null, symbolBarFragmentBase.m22817q4(), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m22753B4(SymbolBarFragmentBase symbolBarFragmentBase) {
        symbolBarFragmentBase.m22809R4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m22755D4(SymbolBarFragmentBase symbolBarFragmentBase) {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        C45380f c45380fM22816p4 = symbolBarFragmentBase.m22816p4();
        if (c45380fM22816p4 != null && (symbolBarLayout = c45380fM22816p4.f102072b) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
            f20881c.m101737t(true);
        }
        symbolBarFragmentBase.m21014E3(new C45794c(true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m22760J4(SymbolBarFragmentBase symbolBarFragmentBase) {
        BaseTradeCoreFragment baseTradeCoreFragmentM21018w3 = symbolBarFragmentBase.m21018w3();
        if (!baseTradeCoreFragmentM21018w3.isAdded()) {
            baseTradeCoreFragmentM21018w3 = null;
        }
        if (baseTradeCoreFragmentM21018w3 != null) {
            baseTradeCoreFragmentM21018w3.setUserVisibleHint(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m22771Q4(SymbolBarFragmentBase symbolBarFragmentBase) {
        BaseTradeCoreFragment baseTradeCoreFragmentM21018w3 = symbolBarFragmentBase.m21018w3();
        if (!baseTradeCoreFragmentM21018w3.isAdded()) {
            baseTradeCoreFragmentM21018w3 = null;
        }
        if (baseTradeCoreFragmentM21018w3 != null) {
            baseTradeCoreFragmentM21018w3.setUserVisibleHint(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final TradeAccountType m22775T4(SymbolBarFragmentBase symbolBarFragmentBase) {
        Bundle arguments = symbolBarFragmentBase.getArguments();
        if (arguments != null) {
            return (TradeAccountType) arguments.getParcelable("tradeAccountType");
        }
        return null;
    }

    /* JADX INFO: renamed from: W4 */
    public static final ViewModelStoreOwner m22779W4(SymbolBarFragmentBase symbolBarFragmentBase) {
        Fragment fragmentRequireParentFragment = symbolBarFragmentBase.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m22795s4(SymbolBarFragmentBase symbolBarFragmentBase) {
        symbolBarFragmentBase.m22809R4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m22796t4(SymbolBarFragmentBase symbolBarFragmentBase) {
        symbolBarFragmentBase.m22803F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m22797u4(SymbolBarFragmentBase symbolBarFragmentBase) {
        m22763L4(symbolBarFragmentBase, null, symbolBarFragmentBase.m22817q4(), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m22799w4(SymbolBarFragmentBase symbolBarFragmentBase) {
        symbolBarFragmentBase.m22809R4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m22800x4(SymbolBarFragmentBase symbolBarFragmentBase) {
        symbolBarFragmentBase.m22803F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m22801y4(SymbolBarFragmentBase symbolBarFragmentBase) {
        m22763L4(symbolBarFragmentBase, null, symbolBarFragmentBase.m22817q4(), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public final void m22803F4() {
        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) m21013D3().m22742v().mo86421a());
        if (symbolBizUiState != null) {
            IMarginService iMarginService = IMarginService.f32724a.get();
            String symbol = symbolBizUiState.getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            IMarginService.m37900d0(iMarginService, symbol, false, false, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m22804G4(TradeItemBean tradeItemBean) {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        boolean z11;
        ShareSymbolBizVM shareSymbolBizVMM21013D3 = m21013D3();
        String symbol = tradeItemBean.getSymbol();
        if (symbol != null) {
            shareSymbolBizVMM21013D3.m22746z(symbol);
            C45380f c45380fM22816p4 = m22816p4();
            if (c45380fM22816p4 != null && (symbolBarLayout = c45380fM22816p4.f102072b) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
                String symbol2 = tradeItemBean.getSymbol();
                if (symbol2 == null) {
                    symbol2 = "";
                }
                String showSymbol = tradeItemBean.getShowSymbol();
                Integer numValueOf = Integer.valueOf(C27063n.m66765c("k_panel_position", 0, 1, null));
                if (f20881c.m101734p()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f20881c.m101735q(new SymbolBarData(symbol2, showSymbol, null, null, null, numValueOf, z11, false, 152, null));
            }
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final void m22805H4() {
        String symbol;
        String str;
        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) m21013D3().m22742v().mo86421a());
        if (symbolBizUiState != null && (symbol = symbolBizUiState.getSymbol()) != null) {
            IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
            if (companion.get().mo50718w()) {
                try {
                    if (Intrinsics.areEqual(m22817q4(), TradeAccountType.IsolatedMargin.INSTANCE)) {
                        str = "isolated";
                    } else {
                        str = "cross";
                    }
                    String str2 = str;
                    IQuoteFacadeService iQuoteFacadeService = companion.get();
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    iQuoteFacadeService.mo50714q(this, childFragmentManager, new CurrencyFilterTransferData(ViewProps.MARGIN, str2, null, new SymbolData(symbol, null, 2, null), 4, null), "TradeMarginRnToggleSymbolDialog", new Function2() { // from class: com.kubi.core.biz.symbolbarold.n
                        @Override // p852kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SymbolBarFragmentBase.m22758I4((CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                        }
                    });
                    return;
                } catch (Exception e11) {
                    C45193a.m99856c(e11, "TradeMarginSymbolFilter");
                    return;
                }
            }
            TradeItemBean tradeItemBean = new TradeItemBean(symbol);
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            ToggleSymbolDialogHelperKt.m22836g(1, false, tradeItemBean, childFragmentManager2, new Function0() { // from class: com.kubi.core.biz.symbolbarold.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SymbolBarFragmentBase.m22760J4(this.f20907b);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m22806K4(MoreDialogSectionTab moreDialogSectionTab, TradeAccountType tradeAccountType) {
        List<MenuItem> mutableList;
        TradeItemBean tradeItemBean = m21013D3().m22740t().getTradeItemBean();
        if (tradeItemBean == null) {
            return;
        }
        if (Intrinsics.areEqual(tradeAccountType, TradeAccountType.Margin.INSTANCE)) {
            mutableList = CollectionsKt.toMutableList((Collection) m22813m4(tradeItemBean).m920Q(this));
        } else {
            mutableList = CollectionsKt.toMutableList((Collection) m22814n4(tradeItemBean).m1015z0(this, tradeAccountType, m22810S4(tradeAccountType)));
        }
        if (IMarginService.f32724a.get().mo37927a()) {
            m22807M4(mutableList, moreDialogSectionTab);
        } else {
            DialogFragmentHelper dialogFragmentHelperM59005W = BottomSheetDialogHelper.f48599a.m59005W(mutableList);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM59005W.show(childFragmentManager, "funcitons");
        }
        C43852m.m96590b(C12462a.m23402a(), "moreUpperRightCorner", "1", TuplesKt.m90091to("norm_version", "1"));
    }

    /* JADX INFO: renamed from: O4 */
    public final void m22808O4() {
        String symbol;
        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) CollectionsKt.lastOrNull((List) m21013D3().m22742v().mo86421a());
        if (symbolBizUiState != null && (symbol = symbolBizUiState.getSymbol()) != null) {
            IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
            if (companion.get().mo50718w()) {
                try {
                    IQuoteFacadeService iQuoteFacadeService = companion.get();
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    try {
                        iQuoteFacadeService.mo50714q(this, childFragmentManager, new CurrencyFilterTransferData(SearchCategory$Companion.SPOT, null, null, new SymbolData(symbol, null, 2, null), 6, null), "TradeSpotRnToggleSymbolDialog", new Function2() { // from class: com.kubi.core.biz.symbolbarold.j
                            @Override // p852kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SymbolBarFragmentBase.m22769P4((CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                            }
                        });
                    } catch (Exception e11) {
                        e = e11;
                        C45193a.m99856c(e, "TradeSpotSymbolFilter");
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } else {
                C12572a.m23695d("mart_changeSymol", new MartChangeSymbolEvent("spot_trade", symbol), 0L, 4, null);
                ToggleSymbolDialogHelperKt.m22841l(this, symbol, new Function0() { // from class: com.kubi.core.biz.symbolbarold.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22771Q4(this.f20904b);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final void m22809R4() {
        C43852m.m96591c(C12462a.m23402a(), "symbolSelect", null, null, 12, null);
        if (!Intrinsics.areEqual(m22817q4(), TradeAccountType.Margin.INSTANCE) && !Intrinsics.areEqual(m22817q4(), TradeAccountType.IsolatedMargin.INSTANCE)) {
            m22808O4();
        } else {
            m22805H4();
        }
        C43841b.m96557d("unified_click_spot_exchange", "click_start_btn", null, 4, null);
    }

    /* JADX INFO: renamed from: U4 */
    public final void m22811U4(LeverConfig leverConfig) {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        SymbolBarLayout symbolBarLayout2;
        C46148j f20881c2;
        if (!leverConfig.getIsShow()) {
            C45380f c45380fM22816p4 = m22816p4();
            if (c45380fM22816p4 != null && (symbolBarLayout2 = c45380fM22816p4.f102072b) != null && (f20881c2 = symbolBarLayout2.getF20881c()) != null) {
                f20881c2.m101739w(false, null);
                return;
            }
            return;
        }
        C45380f c45380fM22816p5 = m22816p4();
        if (c45380fM22816p5 != null && (symbolBarLayout = c45380fM22816p5.f102072b) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
            f20881c.m101739w(true, leverConfig.getLever());
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "handle_click_event".length();
        }
        C12572a.m23692a(this, true, new SymbolBarFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1("handle_click_event", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        m21016u3(C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.symbolbarold.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolBarFragmentBase.m22793k4((SymbolBizUiState) obj);
            }
        }), new C122522(null));
        final InterfaceC41673r<SymbolBizUiState> interfaceC41673rM22742v = m21013D3().m22742v();
        m21016u3(C41636g.m90939v(new InterfaceC41634e<Pair<? extends String, ? extends Boolean>>() { // from class: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SymbolBarFragmentBase.kt\ncom/kubi/core/biz/symbolbarold/SymbolBarFragmentBase\n*L\n1#1,49:1\n50#2:50\n226#3:51\n*E\n"})
            public static final class C122502<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f20891b;

                /* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase$bindState$$inlined$map$1$2", m90122f = "SymbolBarFragmentBase.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C122502.this.emit(null, this);
                    }
                }

                public C122502(InterfaceC41635f interfaceC41635f) {
                    this.f20891b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f20891b;
                        SymbolBizUiState symbolBizUiState = (SymbolBizUiState) obj;
                        Pair pair = new Pair(symbolBizUiState.getSymbol(), Boxing.boxBoolean(symbolBizUiState.isInCallAuctionTrade()));
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(pair, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Pair<? extends String, ? extends Boolean>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41673rM22742v.collect(new C122502(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C122534(null));
        m21016u3(C41636g.m90941x(m21013D3().m22741u(), new Function1() { // from class: com.kubi.core.biz.symbolbarold.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolBarFragmentBase.m22794l4((ChangeRateData) obj);
            }
        }), new C122546(null));
        m21016u3(C41636g.m90892P(m21013D3().m22742v(), new C122557(null)), new C122568(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getLeverConfig();
            }
        }, new C1225110(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        View viewMo63550M2;
        SymbolBarLayout symbolBarLayout;
        InterfaceC46140b c46467b;
        InterfaceC46139a c46466a;
        ImageView f104635k;
        SymbolBarLayout symbolBarLayout2;
        C46148j f20881c;
        SymbolBarLayout symbolBarLayout3;
        InterfaceC46140b f20880b;
        super.initView();
        C45380f c45380fM22816p4 = m22816p4();
        InterfaceC46302c interfaceC46302c = null;
        if (c45380fM22816p4 != null && (symbolBarLayout = c45380fM22816p4.f102072b) != null) {
            TradeAccountType tradeAccountTypeM22817q4 = m22817q4();
            if (Intrinsics.areEqual(tradeAccountTypeM22817q4, TradeAccountType.Unified.INSTANCE)) {
                Context context = symbolBarLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                c46467b = new C46761b(context);
                c46466a = new C46760a(C12462a.m23402a(), new Function0() { // from class: com.kubi.core.biz.symbolbarold.p
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22799w4(this.f20908b);
                    }
                }, new Function0() { // from class: com.kubi.core.biz.symbolbarold.t
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22800x4(this.f20912b);
                    }
                }, new Function0() { // from class: com.kubi.core.biz.symbolbarold.u
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22801y4(this.f20913b);
                    }
                }, new Function1() { // from class: com.kubi.core.biz.symbolbarold.v
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SymbolBarFragmentBase.m22802z4(this.f20914b, ((Boolean) obj).booleanValue());
                    }
                });
            } else if (!Intrinsics.areEqual(tradeAccountTypeM22817q4, TradeAccountType.Margin.INSTANCE) && !Intrinsics.areEqual(tradeAccountTypeM22817q4, TradeAccountType.IsolatedMargin.INSTANCE)) {
                Context context2 = symbolBarLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                c46467b = new C46761b(context2);
                c46466a = new C46760a(C12462a.m23402a(), new Function0() { // from class: com.kubi.core.biz.symbolbarold.e
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22795s4(this.f20901b);
                    }
                }, new Function0() { // from class: com.kubi.core.biz.symbolbarold.f
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22796t4(this.f20902b);
                    }
                }, new Function0() { // from class: com.kubi.core.biz.symbolbarold.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22797u4(this.f20903b);
                    }
                }, new Function1() { // from class: com.kubi.core.biz.symbolbarold.q
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SymbolBarFragmentBase.m22798v4(this.f20909b, ((Boolean) obj).booleanValue());
                    }
                });
            } else {
                Context context3 = symbolBarLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                c46467b = new C46467b(context3);
                c46466a = new C46466a(C12462a.m23402a(), Intrinsics.areEqual(m22817q4(), TradeAccountType.IsolatedMargin.INSTANCE), new Function0() { // from class: com.kubi.core.biz.symbolbarold.w
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22752A4(this.f20915b);
                    }
                }, new Function0() { // from class: com.kubi.core.biz.symbolbarold.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SymbolBarFragmentBase.m22753B4(this.f20899b);
                    }
                }, new Function1() { // from class: com.kubi.core.biz.symbolbarold.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SymbolBarFragmentBase.m22754C4(this.f20900b, ((Boolean) obj).booleanValue());
                    }
                });
            }
            symbolBarLayout.m22751a(c46467b, c46466a);
            ISpotCommonService iSpotCommonService = ISpotCommonService.f49644a.get();
            C45380f c45380fM22816p5 = m22816p4();
            if (c45380fM22816p5 != null && (symbolBarLayout3 = c45380fM22816p5.f102072b) != null && (f20880b = symbolBarLayout3.getF20880b()) != null) {
                f104635k = f20880b.getF104635k();
            } else {
                f104635k = null;
            }
            boolean zMo59959c = iSpotCommonService.mo59959c(f104635k);
            C45380f c45380fM22816p6 = m22816p4();
            if (c45380fM22816p6 != null && (symbolBarLayout2 = c45380fM22816p6.f102072b) != null && (f20881c = symbolBarLayout2.getF20881c()) != null) {
                f20881c.m101740x(zMo59959c, zMo59959c);
            }
        }
        m21016u3(C41636g.m90881E(m21020z3().m21739r()), new C122592(null));
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC46302c) {
            interfaceC46302c = (InterfaceC46302c) parentFragment;
        }
        if (interfaceC46302c != null && (viewMo63550M2 = interfaceC46302c.mo63550M2()) != null) {
            C27046k.m66711z(viewMo63550M2, 0L, new Function0() { // from class: com.kubi.core.biz.symbolbarold.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SymbolBarFragmentBase.m22755D4(this.f20910b);
                }
            }, 1, null);
        }
        m22818r4().m22510v().observe(getViewLifecycleOwner(), new C12258c(new Function1() { // from class: com.kubi.core.biz.symbolbarold.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SymbolBarFragmentBase.m22756E4(this.f20911b, (MarginLeverageEntity) obj);
            }
        }));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        SymbolBarLayout symbolBarLayout;
        C46148j f20881c;
        super.onShow();
        C45380f c45380fM22816p4 = m22816p4();
        if (c45380fM22816p4 != null && (symbolBarLayout = c45380fM22816p4.f102072b) != null && (f20881c = symbolBarLayout.getF20881c()) != null) {
            C46148j.m101730v(f20881c, C27063n.m66765c("k_panel_position", 0, 1, null), false, false, 6, null);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
    }
}
