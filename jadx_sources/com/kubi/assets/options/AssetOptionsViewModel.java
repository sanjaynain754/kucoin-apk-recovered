package com.kubi.assets.options;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.IRestfulApi;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.assets.entity.OptionsPositionEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.restful.C19321b;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42151f;
import lb.C42153h;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AssetOptionsViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00182\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0002J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020+H\u0002R\u0014\u0010\u0006\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/options/AssetOptionsViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/options/AssetOptionsContract$UiIntent;", "Lcom/kubi/assets/options/AssetOptionsContract$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/assets/options/AssetOptionsContract$UIState;", "protocolScope", "Lcom/kubi/assets/utils/ParentCoroutineScope;", "assetApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/assets/AssetV2Api;", "assetApi$delegate", "Lkotlin/Lazy;", "subPushChannelApi", "Lcom/kubi/assets/IRestfulApi;", "getSubPushChannelApi", "()Lcom/kubi/assets/IRestfulApi;", "subPushChannelApi$delegate", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "", "dispatchIntentOnIO", "intent", "(Lcom/kubi/assets/options/AssetOptionsContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeAssetOptions", "Lkotlinx/coroutines/Job;", "fetchOptionsOverview", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOptionsOverviewEntity", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/assets/entity/OptionsOverviewEntity;", "sendOptionsPositionsList", "data", "", "Lcom/kubi/assets/entity/OptionsPositionEntity;", "changeNumberHideStatus", "Lcom/kubi/assets/options/AssetOptionsContract$UiIntent$HideOrShowNumber;", "checkSameCurrency", "checkSame", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOptionsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOptionsViewModel.kt\ncom/kubi/assets/options/AssetOptionsViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,164:1\n25#2:165\n26#2:167\n1#3:166\n126#4,2:168\n*S KotlinDebug\n*F\n+ 1 AssetOptionsViewModel.kt\ncom/kubi/assets/options/AssetOptionsViewModel\n*L\n110#1:165\n110#1:167\n110#1:166\n142#1:168,2\n*E\n"})
public final class AssetOptionsViewModel extends BaseStateVM<AssetOptionsContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final C42151f f18124V = new C42151f(C42911a.m94120b());

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18125W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.options.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetOptionsViewModel.m18095y();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18126X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.options.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetOptionsViewModel.m18082K();
        }
    });

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m18080C(AssetOptionsViewModel assetOptionsViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        assetOptionsViewModel.m18079B(z11);
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m18078A(AssetOptionsContract$UiIntent.HideOrShowNumber hideOrShowNumber, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, hideOrShowNumber.getIsChecked(), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX INFO: renamed from: B */
    private final void m18079B(boolean z11) {
        boolean z12;
        String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
        if (getState().getOptionsOverviewEntity() == null) {
            z12 = false;
        } else {
            OptionsOverviewEntity optionsOverviewEntity = getState().getOptionsOverviewEntity();
            if (Intrinsics.areEqual(optionsOverviewEntity != null ? optionsOverviewEntity.getCurrency() : null, balanceCurrency)) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        if (!z11 || z12) {
            updateState(new Function1() { // from class: com.kubi.assets.options.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetOptionsViewModel.m18081D((UIState) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D */
    public static final UIState m18081D(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, new OptionsOverviewEntity(null, null, null, null, null, null, null, 126, null), 1, null);
    }

    /* JADX INFO: renamed from: K */
    public static final IRestfulApi m18082K() {
        return (IRestfulApi) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(IRestfulApi.class);
    }

    /* JADX INFO: renamed from: N */
    public static final UIState m18083N(OptionsOverviewEntity optionsOverviewEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, optionsOverviewEntity, 1, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Object dispatchIntentOnIO(@NotNull AssetOptionsContract$UiIntent assetOptionsContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        if (assetOptionsContract$UiIntent instanceof AssetOptionsContract$UiIntent.HideOrShowNumber) {
            m18104z((AssetOptionsContract$UiIntent.HideOrShowNumber) assetOptionsContract$UiIntent);
            return Unit.INSTANCE;
        }
        if (!(assetOptionsContract$UiIntent instanceof AssetOptionsContract$UiIntent.FetchOptionsOverview)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objM18097F = m18097F(continuation);
        return objM18097F == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM18097F : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public final Object m18097F(Continuation<? super Unit> continuation) {
        AssetOptionsViewModel$fetchOptionsOverview$1 assetOptionsViewModel$fetchOptionsOverview$1;
        if (continuation instanceof AssetOptionsViewModel$fetchOptionsOverview$1) {
            assetOptionsViewModel$fetchOptionsOverview$1 = (AssetOptionsViewModel$fetchOptionsOverview$1) continuation;
            int i11 = assetOptionsViewModel$fetchOptionsOverview$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetOptionsViewModel$fetchOptionsOverview$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetOptionsViewModel$fetchOptionsOverview$1 = new AssetOptionsViewModel$fetchOptionsOverview$1(this, continuation);
            }
        } else {
            assetOptionsViewModel$fetchOptionsOverview$1 = new AssetOptionsViewModel$fetchOptionsOverview$1(this, continuation);
        }
        Object objM42823d = assetOptionsViewModel$fetchOptionsOverview$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetOptionsViewModel$fetchOptionsOverview$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
            m18080C(this, false, 1, null);
            InterfaceC41634e<OptionsOverviewEntity> interfaceC41634eM17168u1 = m18098G().m17168u1(balanceCurrency);
            AssetOptionsViewModel$fetchOptionsOverview$2 assetOptionsViewModel$fetchOptionsOverview$2 = new AssetOptionsViewModel$fetchOptionsOverview$2(this, null);
            assetOptionsViewModel$fetchOptionsOverview$1.L$0 = SpillingKt.nullOutSpilledVariable(balanceCurrency);
            assetOptionsViewModel$fetchOptionsOverview$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM17168u1, false, assetOptionsViewModel$fetchOptionsOverview$2, assetOptionsViewModel$fetchOptionsOverview$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        if (((C19334f) objM42823d).getThrowable() != null) {
            sendSingleEvent(SingleEvent.C19247c.f35626b);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public final AssetV2Api m18098G() {
        return (AssetV2Api) this.f18125W.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(false, null, 3, null);
    }

    /* JADX INFO: renamed from: I */
    public final IRestfulApi m18100I() {
        return (IRestfulApi) this.f18126X.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final void m18101J(List<OptionsPositionEntity> list) {
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        C12572a.m23695d("option_positions_change", list, 0L, 4, null);
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC41775x1 m18102L() {
        return C41696j.m91104d(this.f18124V, null, null, new AssetOptionsViewModel$subscribeAssetOptions$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m18104z(final AssetOptionsContract$UiIntent.HideOrShowNumber hideOrShowNumber) {
        C46392a.m102328k(C42153h.f93593a.m92500D(), hideOrShowNumber.getIsChecked());
        updateState(new Function1() { // from class: com.kubi.assets.options.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetOptionsViewModel.m18078A(hideOrShowNumber, (UIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static final AssetV2Api m18095y() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: M */
    public final void m18103M(final OptionsOverviewEntity optionsOverviewEntity) {
        if (!Intrinsics.areEqual(optionsOverviewEntity.getCurrency(), AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency())) {
            return;
        }
        updateState(new Function1() { // from class: com.kubi.assets.options.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetOptionsViewModel.m18083N(optionsOverviewEntity, (UIState) obj);
            }
        });
        sendSingleEvent(SingleEvent.C19247c.f35626b);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f18124V.close();
    }
}
