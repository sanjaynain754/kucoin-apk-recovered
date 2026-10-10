package com.kubi.spot.business.callAuction.callAuctionProcessDialog;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.C5275i0;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.host.HostManager;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleVBStateContentFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$color;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$mipmap;
import com.kubi.spot.R$string;
import com.kubi.spot.business.callAuction.CallAuctionViewController;
import com.kubi.spot.business.callAuction.bean.CallAuctionConfigBean;
import com.kubi.spot.business.callAuction.mvi.CallAuctionContract$Phase;
import com.kubi.spot.business.callAuction.mvi.CallAuctionContract$UiIntent;
import com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel;
import com.kubi.spot.business.callAuction.mvi.UIState;
import com.kubi.spot.entity.LinkEntity;
import com.kubi.spot.entity.TradeItemBeanEquals;
import com.kubi.spot.exeption.SpotMessage;
import com.kubi.spot.quote.market.trade.MarketTradeFragment;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import f30.C37347r;
import g00.InterfaceC37766r;
import gf.C37890n;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import t20.C44629a0;
import t20.C44677z;
import w00.C45681e;

/* JADX INFO: compiled from: CallAuctionProcessFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010)\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u000202H\u0014J\b\u00103\u001a\u000202H\u0016J\b\u00104\u001a\u000202H\u0016J\b\u00105\u001a\u000202H\u0015J\b\u00106\u001a\u000202H\u0002J\b\u00107\u001a\u000202H\u0002J\u0006\u00108\u001a\u000202J\b\u00109\u001a\u000202H\u0002J\u0006\u0010:\u001a\u000202R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR)\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00158TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b/\u0010,¨\u0006<"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessFragment;", "Lcom/kubi/mvi/state/SimpleVBStateContentFragment;", "Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;", "Lcom/kubi/spot/databinding/FragmentCallAuctionProgressBinding;", "<init>", "()V", "failedCount", "", "getFailedCount", "()I", "setFailedCount", "(I)V", "callAuctionRules", "", "", "Lcom/kubi/spot/entity/LinkEntity;", "getCallAuctionRules", "()Ljava/util/Map;", "callAuctionRules$delegate", "Lkotlin/Lazy;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "getBinding", "()Lcom/kubi/spot/databinding/FragmentCallAuctionProgressBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "contentBinding", "Lcom/kubi/spot/databinding/FragmentCallAuctionProgressContentBinding;", "getContentBinding", "()Lcom/kubi/spot/databinding/FragmentCallAuctionProgressContentBinding;", "contentBinding$delegate", "getBindingRootViewLayout", "symbol", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "fromPage", "getFromPage", "fromPage$delegate", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "handleProgressOpening", "showProgressOpening", "showProgressStep2", "showProgressStep1", "showProgressStep3", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionProcessFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionProcessFragment.kt\ncom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,266:1\n147#2,16:267\n8#3,2:283\n8#3,2:285\n8#3,2:287\n8#3,2:296\n35#4,4:289\n39#4:295\n44#5,2:293\n*S KotlinDebug\n*F\n+ 1 CallAuctionProcessFragment.kt\ncom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessFragment\n*L\n55#1:267,16\n101#1:283,2\n202#1:285,2\n212#1:287,2\n88#1:296,2\n47#1:289,4\n47#1:295\n47#1:293,2\n*E\n"})
public final class CallAuctionProcessFragment extends SimpleVBStateContentFragment<UIState, C44677z> {

    /* JADX INFO: renamed from: V */
    public int f49836V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f49837W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallAuctionProcessFragment.m60499A3();
        }
    });

    /* JADX INFO: renamed from: X */
    public boolean f49838X = true;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f49839Y = C45681e.m100799e(this, new Function1<CallAuctionProcessFragment, C44677z>() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44677z invoke(@NotNull CallAuctionProcessFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44677z.m98830a(this.this$0.m42580n3());
        }

        {
            super(1);
        }
    }, new Function1<C44677z, Unit>() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44677z it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44677z c44677z) {
            invoke(c44677z);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f49840Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallAuctionProcessFragment.m60500B3(this.f49845b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f49841a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallAuctionProcessFragment.m60504R3(this.f49846b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f49842b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallAuctionProcessFragment.m60501C3(this.f49847b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f49835d0 = {Reflection.property1(new PropertyReference1Impl(CallAuctionProcessFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/FragmentCallAuctionProgressBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f49834c0 = new Companion(null);

    /* JADX INFO: compiled from: CallAuctionProcessFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessFragment$Companion;", "", "<init>", "()V", "FROM_PAGE", "", "CALL_AUCTION_PROCESS", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24724a extends TypeToken<Map<String, ? extends LinkEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$bindState$2 */
    /* JADX INFO: compiled from: CallAuctionProcessFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "bean", "Lcom/kubi/spot/entity/TradeItemBeanEquals;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$bindState$2", m90122f = "CallAuctionProcessFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCallAuctionProcessFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionProcessFragment.kt\ncom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessFragment$bindState$2\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n+ 3 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,266:1\n8#2,2:267\n8#2,2:269\n52#3,2:271\n*S KotlinDebug\n*F\n+ 1 CallAuctionProcessFragment.kt\ncom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessFragment$bindState$2\n*L\n131#1:267,2\n143#1:269,2\n150#1:271,2\n*E\n"})
    public static final class C247262 extends SuspendLambda implements Function2<TradeItemBeanEquals, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(TradeItemBeanEquals tradeItemBeanEquals, Continuation<? super Unit> continuation) {
            return ((C247262) create(tradeItemBeanEquals, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C247262(Continuation<? super C247262> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C247262 c247262 = CallAuctionProcessFragment.this.new C247262(continuation);
            c247262.L$0 = obj;
            return c247262;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TradeItemBeanEquals tradeItemBeanEquals = (TradeItemBeanEquals) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (tradeItemBeanEquals != null) {
                CallAuctionProcessFragment callAuctionProcessFragment = CallAuctionProcessFragment.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UIState::response->it.symbolInfoEntity?.enableAuctionTrade:");
                SymbolInfoEntity symbolInfoEntity = tradeItemBeanEquals.getSymbolInfoEntity();
                sb2.append(symbolInfoEntity != null ? symbolInfoEntity.getEnableAuctionTrade() : null);
                C44128b.m97266j("trade|Spot|CallAuctionProcessFragment", sb2.toString());
                SymbolInfoEntity symbolInfoEntity2 = tradeItemBeanEquals.getSymbolInfoEntity();
                if (C27025c.m66566d(symbolInfoEntity2 != null ? symbolInfoEntity2.getEnableAuctionTrade() : null)) {
                    C44128b.m97266j("trade|Spot|CallAuctionProcessFragment", "UIState::response->failedCount:" + callAuctionProcessFragment.getF49836V());
                    if (callAuctionProcessFragment.getF49836V() < 4) {
                        callAuctionProcessFragment.sendIntent(CallAuctionContract$UiIntent.GetCallAuction.INSTANCE);
                    } else {
                        C43846g.m96568c(new SpotMessage("enableAuctionTrade false. failedCount > MAX_REQUEST_COUNT", "CallAuctionProcessFragment", false, 4, null), null, 2, null);
                    }
                    int f49836v = callAuctionProcessFragment.getF49836V();
                    callAuctionProcessFragment.m60523M3(f49836v + 1);
                    Boxing.boxInt(f49836v);
                } else {
                    Fragment parentFragment = callAuctionProcessFragment.getParentFragment();
                    MarketTradeFragment marketTradeFragment = parentFragment instanceof MarketTradeFragment ? (MarketTradeFragment) parentFragment : null;
                    if (marketTradeFragment != null) {
                        CallAuctionViewController callAuctionViewController = CallAuctionViewController.f49857a;
                        String symbol = tradeItemBeanEquals.getSymbol();
                        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                        callAuctionViewController.m60535b(marketTradeFragment, symbol, marketTradeFragment.m62958L3());
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$bindState$4 */
    /* JADX INFO: compiled from: CallAuctionProcessFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", TypedValues.CycleType.S_WAVE_PHASE, "Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$bindState$4", m90122f = "CallAuctionProcessFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C247284 extends SuspendLambda implements Function2<CallAuctionContract$Phase, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CallAuctionContract$Phase callAuctionContract$Phase, Continuation<? super Unit> continuation) {
            return ((C247284) create(callAuctionContract$Phase, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$bindState$4$a */
        /* JADX INFO: compiled from: CallAuctionProcessFragment.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallAuctionContract$Phase.values().length];
                try {
                    iArr[CallAuctionContract$Phase.Phase1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallAuctionContract$Phase.Phase2.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallAuctionContract$Phase.Phase3.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C247284(Continuation<? super C247284> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C247284 c247284 = CallAuctionProcessFragment.this.new C247284(continuation);
            c247284.L$0 = obj;
            return c247284;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CallAuctionContract$Phase callAuctionContract$Phase = (CallAuctionContract$Phase) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!(CallAuctionProcessFragment.this.getParentFragment() instanceof DialogFragment)) {
                C12572a.m23695d("call_auction_process", callAuctionContract$Phase, 0L, 4, null);
                int i11 = a.$EnumSwitchMapping$0[callAuctionContract$Phase.ordinal()];
                if (i11 == 1) {
                    CallAuctionProcessFragment.this.m60525O3();
                } else if (i11 == 2) {
                    CallAuctionProcessFragment.this.m60526P3();
                } else if (i11 != 3) {
                    CallAuctionProcessFragment.this.m60522J3();
                } else {
                    CallAuctionProcessFragment.this.m60527Q3();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$bindState$6 */
    /* JADX INFO: compiled from: CallAuctionProcessFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "config", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment$bindState$6", m90122f = "CallAuctionProcessFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C247306 extends SuspendLambda implements Function2<CallAuctionConfigBean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CallAuctionConfigBean callAuctionConfigBean, Continuation<? super Unit> continuation) {
            return ((C247306) create(callAuctionConfigBean, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C247306(Continuation<? super C247306> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C247306 c247306 = CallAuctionProcessFragment.this.new C247306(continuation);
            c247306.L$0 = obj;
            return c247306;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CallAuctionConfigBean callAuctionConfigBean = (CallAuctionConfigBean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (callAuctionConfigBean != null) {
                CallAuctionProcessFragment callAuctionProcessFragment = CallAuctionProcessFragment.this;
                callAuctionProcessFragment.m60518F3().f98950i.setText(callAuctionProcessFragment.getString(R$string.kc_call_auction_phase1) + ' ' + callAuctionConfigBean.getFirstStageStartTime() + '-' + callAuctionConfigBean.getFirstStageEndTime() + " (" + C37347r.m83947g() + ')');
                BaseTextView baseTextView = callAuctionProcessFragment.m60518F3().f98952k;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(callAuctionProcessFragment.getString(R$string.kc_call_auction_phase2));
                sb2.append(' ');
                sb2.append(callAuctionConfigBean.getSecondStageStartTime());
                sb2.append('-');
                sb2.append(callAuctionConfigBean.getSecondStageEndTime());
                baseTextView.setText(sb2.toString());
                callAuctionProcessFragment.m60518F3().f98955n.setText(callAuctionProcessFragment.getString(R$string.kc_call_auction_phase3) + ' ' + callAuctionConfigBean.getThirdStageStartTime() + '-' + callAuctionConfigBean.getThirdStageEndTime());
                BaseTextView baseTextView2 = callAuctionProcessFragment.m60518F3().f98954m;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.getDefault();
                String string = callAuctionProcessFragment.getString(R$string.kc_preview_trade_time);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String str = String.format(locale, string, Arrays.copyOf(new Object[]{callAuctionConfigBean.getOpeningTime()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                baseTextView2.setText(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Map m60499A3() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24724a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_spot_trade_links", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return (Map) objM20457a;
    }

    @Nullable
    /* JADX INFO: renamed from: D3 */
    public C44677z m60516D3() {
        return (C44677z) this.f49839Y.getValue(this, f49835d0[0]);
    }

    /* JADX INFO: renamed from: E3 */
    public final Map<String, LinkEntity> m60517E3() {
        return (Map) this.f49837W.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    public final C44629a0 m60518F3() {
        return (C44629a0) this.f49840Z.getValue();
    }

    /* JADX INFO: renamed from: G3, reason: from getter */
    public final int getF49836V() {
        return this.f49836V;
    }

    @NotNull
    /* JADX INFO: renamed from: H3 */
    public final String m60520H3() {
        return (String) this.f49842b0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: I3 */
    public final String m60521I3() {
        return (String) this.f49841a0.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public final void m60523M3(int i11) {
        this.f49836V = i11;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF49838X() {
        return this.f49838X;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(CallAuctionViewModel.class);
    }

    @Override // com.kubi.mvi.state.SimpleVBStateContentFragment
    /* JADX INFO: renamed from: m3 */
    public int mo21545m3() {
        return R$layout.fragment_call_auction_progress;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f49838X = z11;
    }

    /* JADX INFO: renamed from: B3 */
    public static final C44629a0 m60500B3(CallAuctionProcessFragment callAuctionProcessFragment) {
        return C44629a0.m98737a(callAuctionProcessFragment.m42580n3());
    }

    /* JADX INFO: renamed from: C3 */
    public static final String m60501C3(CallAuctionProcessFragment callAuctionProcessFragment) {
        String string;
        Bundle arguments = callAuctionProcessFragment.getArguments();
        if (arguments != null && (string = arguments.getString("from_page")) != null) {
            return string;
        }
        return "";
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m60502K3(CallAuctionProcessFragment callAuctionProcessFragment) {
        DialogFragment dialogFragment;
        Fragment parentFragment = callAuctionProcessFragment.getParentFragment();
        if (parentFragment instanceof DialogFragment) {
            dialogFragment = (DialogFragment) parentFragment;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m60503L3(CallAuctionProcessFragment callAuctionProcessFragment) {
        LinkEntity linkEntity;
        String str;
        Map<String, LinkEntity> mapM60517E3 = callAuctionProcessFragment.m60517E3();
        if (mapM60517E3 != null) {
            linkEntity = mapM60517E3.get("call_auction_notice");
        } else {
            linkEntity = null;
        }
        String strM = HostManager.a.m();
        if (linkEntity != null) {
            C44128b.m97266j("trade|Spot|CallAuctionProcessFragment", "tvUnderstandRules.onClick");
            if (!MultiLanguageManager.f46811g.equals(LanguageType.CHINA) && !MultiLanguageManager.f46811g.equals(LanguageType.HONGKONG)) {
                str = strM + linkEntity.getEnUS();
            } else {
                str = strM + linkEntity.getZhCN();
            }
            InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final String m60504R3(CallAuctionProcessFragment callAuctionProcessFragment) {
        String string;
        Bundle arguments = callAuctionProcessFragment.getArguments();
        if (arguments != null && (string = arguments.getString("symbol")) != null) {
            return string;
        }
        return "BTC-USDT";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J3 */
    public final void m60522J3() {
        boolean zBooleanValue;
        MarketTradeFragment marketTradeFragment;
        Boolean enableAuctionTrade;
        m60524N3();
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(m60521I3());
        if (symbolInfoEntityM85601B != null && (enableAuctionTrade = symbolInfoEntityM85601B.getEnableAuctionTrade()) != null) {
            zBooleanValue = enableAuctionTrade.booleanValue();
        } else {
            zBooleanValue = false;
        }
        DialogFragment dialogFragment = null;
        if (!zBooleanValue) {
            C44128b.m97266j("trade|Spot|CallAuctionProcessFragment", "callAuction->SymbolsCoinDao->enableAuctionTrade:" + zBooleanValue);
            TradeItemBeanEquals bean = ((UIState) getState()).getBean();
            if (bean != null) {
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof MarketTradeFragment) {
                    marketTradeFragment = (MarketTradeFragment) parentFragment;
                } else {
                    marketTradeFragment = null;
                }
                if (marketTradeFragment != null) {
                    CallAuctionViewController callAuctionViewController = CallAuctionViewController.f49857a;
                    String symbol = bean.getSymbol();
                    Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                    callAuctionViewController.m60535b(marketTradeFragment, symbol, marketTradeFragment.m62958L3());
                }
            }
        } else {
            C44128b.m97266j("trade|Spot|CallAuctionProcessFragment", "callAuction->SymbolsCoinDao->enableAuctionTrade:" + zBooleanValue);
            sendIntent(CallAuctionContract$UiIntent.GetCallAuction.INSTANCE);
        }
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 instanceof DialogFragment) {
            dialogFragment = (DialogFragment) parentFragment2;
        }
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final void m60524N3() {
        m60518F3().f98947f.setImageResource(R$mipmap.ic_call_auction_progress_step2);
        AppCompatImageView appCompatImageView = m60518F3().f98944c;
        int i11 = R$mipmap.ic_call_auction_progress_connect;
        appCompatImageView.setImageResource(i11);
        m60518F3().f98948g.setImageResource(R$mipmap.ic_call_auction_progress_step3);
        m60518F3().f98945d.setImageResource(i11);
        m60518F3().f98949h.setImageResource(R$mipmap.ic_call_auction_progress_step4);
        BaseTextView baseTextView = m60518F3().f98952k;
        int i12 = R$color.c_text;
        baseTextView.setTextColor(getColorRes(i12));
        m60518F3().f98954m.setTextColor(getColorRes(i12));
        m60518F3().f98955n.setTextColor(getColorRes(i12));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m60525O3() {
        m60518F3().f98947f.setImageResource(R$mipmap.ic_call_auction_progress_step2_gray);
        AppCompatImageView appCompatImageView = m60518F3().f98944c;
        int i11 = R$mipmap.ic_call_auction_progress_connect_gray;
        appCompatImageView.setImageResource(i11);
        m60518F3().f98948g.setImageResource(R$mipmap.ic_call_auction_progress_step3_gray);
        m60518F3().f98945d.setImageResource(i11);
        m60518F3().f98949h.setImageResource(R$mipmap.ic_call_auction_progress_step4_gray);
        BaseTextView baseTextView = m60518F3().f98952k;
        int i12 = R$color.c_text40;
        baseTextView.setTextColor(getColorRes(i12));
        m60518F3().f98954m.setTextColor(getColorRes(i12));
        m60518F3().f98955n.setTextColor(getColorRes(i12));
    }

    /* JADX INFO: renamed from: P3 */
    public final void m60526P3() {
        m60518F3().f98947f.setImageResource(R$mipmap.ic_call_auction_progress_step2);
        m60518F3().f98944c.setImageResource(R$mipmap.ic_call_auction_progress_connect);
        m60518F3().f98948g.setImageResource(R$mipmap.ic_call_auction_progress_step3_gray);
        m60518F3().f98945d.setImageResource(R$mipmap.ic_call_auction_progress_connect_gray);
        m60518F3().f98949h.setImageResource(R$mipmap.ic_call_auction_progress_step4_gray);
        m60518F3().f98952k.setTextColor(getColorRes(R$color.c_text));
        BaseTextView baseTextView = m60518F3().f98954m;
        int i11 = R$color.c_text40;
        baseTextView.setTextColor(getColorRes(i11));
        m60518F3().f98955n.setTextColor(getColorRes(i11));
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m60527Q3() {
        m60518F3().f98947f.setImageResource(R$mipmap.ic_call_auction_progress_step2);
        AppCompatImageView appCompatImageView = m60518F3().f98944c;
        int i11 = R$mipmap.ic_call_auction_progress_connect;
        appCompatImageView.setImageResource(i11);
        m60518F3().f98948g.setImageResource(R$mipmap.ic_call_auction_progress_step3);
        m60518F3().f98945d.setImageResource(i11);
        m60518F3().f98949h.setImageResource(R$mipmap.ic_call_auction_progress_step4_gray);
        BaseTextView baseTextView = m60518F3().f98952k;
        int i12 = R$color.c_text;
        baseTextView.setTextColor(getColorRes(i12));
        m60518F3().f98955n.setTextColor(getColorRes(i12));
        m60518F3().f98954m.setTextColor(getColorRes(R$color.c_text40));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"SetTextI18n"})
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getResponse();
            }
        }, new C247262(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPhase();
            }
        }, new C247284(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCallAuctionGetConfig();
            }
        }, new C247306(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        KcPrimaryButton kcPrimaryButton;
        View view;
        KcPrimaryButton kcPrimaryButton2;
        super.initView();
        C44677z c44677zM60516D3 = m60516D3();
        if (c44677zM60516D3 != null && (kcPrimaryButton2 = c44677zM60516D3.f99471b) != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionProcessFragment.m60502K3(this.f49848b);
                }
            }, 1, null);
        }
        BaseTextView tvUnderstandRules = m60518F3().f98958q;
        Intrinsics.checkNotNullExpressionValue(tvUnderstandRules, "tvUnderstandRules");
        C27046k.m66711z(tvUnderstandRules, 0L, new Function0() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CallAuctionProcessFragment.m60503L3(this.f49849b);
            }
        }, 1, null);
        if (Intrinsics.areEqual(m60520H3(), "MarketTradeFragment")) {
            C44128b.m97266j("trade|Spot|CallAuctionProcessFragment", "进入K线详情页");
            ViewGroup.LayoutParams layoutParams = m60518F3().f98957p.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C5275i0.m6236a(16.0f);
            m60518F3().f98957p.setLayoutParams(marginLayoutParams);
            C44677z c44677zM60516D4 = m60516D3();
            if (c44677zM60516D4 != null && (view = c44677zM60516D4.f99472c) != null) {
                ViewExtKt.m66577h(view);
            }
            C44677z c44677zM60516D5 = m60516D3();
            if (c44677zM60516D5 != null && (kcPrimaryButton = c44677zM60516D5.f99471b) != null) {
                ViewExtKt.m66577h(kcPrimaryButton);
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        sendIntent(CallAuctionContract$UiIntent.OnFragmentHide.INSTANCE);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (getParentFragment() instanceof DialogFragment) {
            m60524N3();
            sendIntent(new CallAuctionContract$UiIntent.RequestCurrentStage(m60521I3(), false));
        } else {
            sendIntent(new CallAuctionContract$UiIntent.RequestCurrentStage(m60521I3(), true));
        }
    }
}
