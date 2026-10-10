package com.kubi.assets.overview.ongoing;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.C9459a;
import com.kubi.assets.IRestfulApi;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.CopyTradingItem;
import com.kubi.assets.entity.CopyTradingOnGoingEntity;
import com.kubi.assets.entity.Isolated;
import com.kubi.assets.entity.IsolatedPositionDetail;
import com.kubi.assets.entity.LeadTradingItem;
import com.kubi.assets.entity.LeadTradingOnGoingEntity;
import com.kubi.assets.entity.Margin;
import com.kubi.assets.entity.MarginPositionDetail;
import com.kubi.assets.entity.OnGoingEntity;
import com.kubi.assets.entity.Pool;
import com.kubi.assets.entity.PoolItem;
import com.kubi.assets.entity.Robot;
import com.kubi.assets.entity.RobotItem;
import com.kubi.assets.overview.OverviewAnalyticsReporter;
import com.kubi.assets.overview.ongoing.mapper.ContractMapper;
import com.kubi.assets.overview.ongoing.mapper.CopyTradingMapper;
import com.kubi.assets.overview.ongoing.mapper.CrossMapper;
import com.kubi.assets.overview.ongoing.mapper.FinancialMapper;
import com.kubi.assets.overview.ongoing.mapper.IsolatedMapper;
import com.kubi.assets.overview.ongoing.mapper.LeadTradingMapper;
import com.kubi.assets.overview.ongoing.mapper.ProductItem;
import com.kubi.assets.overview.ongoing.mapper.RobotMapper;
import com.kubi.data.coin.AccountType;
import com.kubi.kumex.entity.PositionWrapperEntity;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.restful.C19321b;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.DowngradeExKt;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42151f;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0094@¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001eH\u0002J\u001c\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010#\u001a\u00020\nH\u0002J&\u0010(\u001a\u00020\u001e2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u0010-\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u0010.\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u0010/\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u00100\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u001e\u00101\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\u0018\u00102\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\nH\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000204H\u0002J\u0018\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\nH\u0002J\b\u0010;\u001a\u00020\u001eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006?"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;", "<init>", "()V", "protocolScope", "Lcom/kubi/assets/utils/ParentCoroutineScope;", "hashMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "restfulApi", "Lcom/kubi/assets/IRestfulApi;", "getRestfulApi", "()Lcom/kubi/assets/IRestfulApi;", "restfulApi$delegate", "originalData", "Lcom/kubi/assets/entity/OnGoingEntity;", "positionData", "", "Lcom/kubi/kumex/entity/PositionWrapperEntity;", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOnGoingData", "isSubscribe", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contractSubscription", "updateProducts", "apiData", "updateContractData", "data", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;", "updateLeverData", "updateRobotData", "updateFinancialData", "updateCopyTradingData", "updateLeadTradingData", "handleSubscribe", "subscribeLeverageData", "Lkotlinx/coroutines/Job;", "symbols", "", "startTimer", "handleTitleClickEvent", "subType", "isExpanded", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "initState", "getInitState", "()Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOnGoingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingViewModel.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,432:1\n25#2:433\n26#2:435\n1#3:434\n1#3:436\n1563#4:437\n1634#4,3:438\n1563#4:441\n1634#4,3:442\n1563#4:445\n1634#4,3:446\n1563#4:449\n1634#4,3:450\n1563#4:453\n1634#4,3:454\n1563#4:457\n1634#4,3:458\n1563#4:461\n1634#4,3:462\n*S KotlinDebug\n*F\n+ 1 AssetOnGoingViewModel.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingViewModel\n*L\n103#1:433\n103#1:435\n103#1:434\n197#1:437\n197#1:438,3\n225#1:441\n225#1:442,3\n232#1:445\n232#1:446,3\n261#1:449\n261#1:450,3\n290#1:453\n290#1:454,3\n315#1:457\n315#1:458,3\n345#1:461\n345#1:462,3\n*E\n"})
public final class AssetOnGoingViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final C42151f f18411W = new C42151f(C42911a.m94120b());

    /* JADX INFO: renamed from: X */
    @NotNull
    public HashMap<Integer, Boolean> f18412X = new HashMap<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f18413Y = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.ongoing.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetOnGoingViewModel.m18726y();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f18414Z = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.ongoing.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetOnGoingViewModel.m18708K();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public OnGoingEntity f18415a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public List<PositionWrapperEntity> f18416b0;

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel", m90122f = "AssetOnGoingViewModel.kt", m90123i = {0, 1}, m90124l = {74, 77}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C107521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C107521(Continuation<? super C107521> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetOnGoingViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Object m18705F(AssetOnGoingViewModel assetOnGoingViewModel, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return assetOnGoingViewModel.m18728E(z11, continuation);
    }

    /* JADX INFO: renamed from: N */
    public final void m18733N(List<PositionWrapperEntity> list, List<ProductItem> list2) throws JSONException {
        int iM66650j = C27039d.m66650j(list != null ? Integer.valueOf(list.size()) : null);
        if (iM66650j == 0) {
            return;
        }
        boolean z11 = false;
        String strM66551u = DowngradeExKt.m66551u(C27017c.f54310a.m66516f(R$string.kc_assets_my_futures, new Object[0]), new Object[]{Integer.valueOf(iM66650j)}, null, 2, null);
        boolean zM66567e = C27025c.m66567e(this.f18412X.get(1), true);
        List listTake = list != null ? CollectionsKt.take(list, 10) : null;
        ProductItem.HeaderItem headerItem = new ProductItem.HeaderItem(1, zM66567e, null, 4, null);
        headerItem.m18776c(strM66551u);
        list2.add(headerItem);
        if (zM66567e) {
            if (listTake != null) {
                ContractMapper contractMapper = new ContractMapper(strM66551u);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
                Iterator it = listTake.iterator();
                while (it.hasNext()) {
                    arrayList.add(contractMapper.m18867d((PositionWrapperEntity) it.next()));
                }
                list2.addAll(arrayList);
            }
            if (iM66650j > 10) {
                ProductItem.LoadMoreItem loadMoreItem = new ProductItem.LoadMoreItem(Integer.valueOf(iM66650j), 1);
                loadMoreItem.m18776c(strM66551u);
                list2.add(loadMoreItem);
                z11 = true;
            }
            OverviewAnalyticsReporter.f18247a.m18404b("myFuture", iM66650j, z11);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m18702A(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, ((AssetOnGoingContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked(), 3, null);
    }

    /* JADX INFO: renamed from: B */
    private final AssetV2Api m18703B() {
        return (AssetV2Api) this.f18413Y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final IRestfulApi m18704D() {
        return (IRestfulApi) this.f18414Z.getValue();
    }

    /* JADX INFO: renamed from: I */
    public static final CharSequence m18707I(MarginPosition it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AssetOnGoingViewModelHelper.f18540a.m18886a(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final IRestfulApi m18708K() {
        return (IRestfulApi) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(IRestfulApi.class);
    }

    /* JADX INFO: renamed from: T */
    public static final UIState m18709T(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, list, null, false, 6, null);
    }

    /* JADX INFO: renamed from: U */
    public static final UIState m18710U(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, list, null, false, 6, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: E */
    public final Object m18728E(boolean z11, Continuation<? super Unit> continuation) {
        AssetOnGoingViewModel$handleOnGoingData$1 assetOnGoingViewModel$handleOnGoingData$1;
        if (continuation instanceof AssetOnGoingViewModel$handleOnGoingData$1) {
            assetOnGoingViewModel$handleOnGoingData$1 = (AssetOnGoingViewModel$handleOnGoingData$1) continuation;
            int i11 = assetOnGoingViewModel$handleOnGoingData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetOnGoingViewModel$handleOnGoingData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetOnGoingViewModel$handleOnGoingData$1 = new AssetOnGoingViewModel$handleOnGoingData$1(this, continuation);
            }
        } else {
            assetOnGoingViewModel$handleOnGoingData$1 = new AssetOnGoingViewModel$handleOnGoingData$1(this, continuation);
        }
        AssetOnGoingViewModel$handleOnGoingData$1 assetOnGoingViewModel$handleOnGoingData$2 = assetOnGoingViewModel$handleOnGoingData$1;
        Object objM42824e = assetOnGoingViewModel$handleOnGoingData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetOnGoingViewModel$handleOnGoingData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            if (z11) {
                this.f18411W.close();
                m18731L();
                C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.assets.overview.ongoing.v
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetOnGoingViewModel.m18706G(this.f18539b);
                    }
                });
            }
            InterfaceC41634e interfaceC41634eM17049D = AssetV2Api.m17049D(m18703B(), null, null, 3, null);
            AssetOnGoingViewModel$handleOnGoingData$3 assetOnGoingViewModel$handleOnGoingData$3 = new AssetOnGoingViewModel$handleOnGoingData$3(this, z11, null);
            assetOnGoingViewModel$handleOnGoingData$2.Z$0 = z11;
            assetOnGoingViewModel$handleOnGoingData$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17049D, false, assetOnGoingViewModel$handleOnGoingData$3, assetOnGoingViewModel$handleOnGoingData$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        if (((C19334f) objM42824e).getThrowable() != null) {
            sendSingleEvent(C10774m.f18431a);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public final void m18729H(OnGoingEntity onGoingEntity, boolean z11) {
        Isolated isolated;
        String strJoinToString$default;
        boolean zM66567e = C27025c.m66567e(this.f18412X.get(2), true);
        if (z11 && zM66567e && (isolated = onGoingEntity.getIsolated()) != null) {
            if (!C27025c.m66566d(isolated.getExecute())) {
                isolated = null;
            }
            if (isolated != null) {
                IsolatedPositionDetail isolatedPositionDetail = isolated.getIsolatedPositionDetail();
                List<MarginPosition> positions = isolatedPositionDetail != null ? isolatedPositionDetail.getPositions() : null;
                if (positions == null || (strJoinToString$default = CollectionsKt.joinToString$default(positions, ",", null, null, 0, null, new Function1() { // from class: com.kubi.assets.overview.ongoing.w
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetOnGoingViewModel.m18707I((MarginPosition) obj);
                    }
                }, 30, null)) == null) {
                    return;
                }
                m18732M(AssetOnGoingViewModelHelper.f18540a.m18888c(strJoinToString$default));
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m18730J(int i11, boolean z11) throws JSONException {
        this.f18412X.put(Integer.valueOf(i11), Boolean.valueOf(!z11));
        OnGoingEntity onGoingEntity = this.f18415a0;
        OnGoingEntity onGoingEntityCopy$default = onGoingEntity != null ? OnGoingEntity.copy$default(onGoingEntity, null, null, null, null, null, null, 63, null) : null;
        if (onGoingEntityCopy$default != null) {
            m18738S(onGoingEntityCopy$default, false);
        }
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC41775x1 m18731L() {
        return C41696j.m91104d(this.f18411W, null, null, new AssetOnGoingViewModel$startTimer$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC41775x1 m18732M(String str) {
        return C41696j.m91104d(this.f18411W, null, null, new AssetOnGoingViewModel$subscribeLeverageData$1(this, str, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m18738S(OnGoingEntity onGoingEntity, boolean z11) throws JSONException {
        boolean z12;
        LeadTradingOnGoingEntity leadTrading;
        CopyTradingOnGoingEntity copyTrading;
        Robot robot;
        Pool pool;
        Isolated isolated;
        IsolatedPositionDetail isolatedPositionDetail;
        Margin margin;
        final ArrayList arrayList = new ArrayList();
        if (C9459a.m15238a()) {
            m18733N(this.f18416b0, arrayList);
        }
        List<MarginPositionDetail> marginPositionDetailList = (onGoingEntity == null || (margin = onGoingEntity.getMargin()) == null) ? null : margin.getMarginPositionDetailList();
        if (marginPositionDetailList == null || marginPositionDetailList.isEmpty()) {
            List<MarginPosition> positions = (onGoingEntity == null || (isolated = onGoingEntity.getIsolated()) == null || (isolatedPositionDetail = isolated.getIsolatedPositionDetail()) == null) ? null : isolatedPositionDetail.getPositions();
            if (positions == null || positions.isEmpty()) {
                List<PoolItem> items = (onGoingEntity == null || (pool = onGoingEntity.getPool()) == null) ? null : pool.getItems();
                if (items == null || items.isEmpty()) {
                    List<RobotItem> items2 = (onGoingEntity == null || (robot = onGoingEntity.getRobot()) == null) ? null : robot.getItems();
                    if (items2 == null || items2.isEmpty()) {
                        List<CopyTradingItem> items3 = (onGoingEntity == null || (copyTrading = onGoingEntity.getCopyTrading()) == null) ? null : copyTrading.getItems();
                        if (items3 == null || items3.isEmpty()) {
                            List<LeadTradingItem> items4 = (onGoingEntity == null || (leadTrading = onGoingEntity.getLeadTrading()) == null) ? null : leadTrading.getItems();
                            if (items4 == null || items4.isEmpty()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (onGoingEntity == null || z12) {
            updateState(new Function1() { // from class: com.kubi.assets.overview.ongoing.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetOnGoingViewModel.m18709T(arrayList, (UIState) obj);
                }
            });
            return;
        }
        m18737R(onGoingEntity, arrayList);
        m18729H(onGoingEntity, z11);
        m18739V(onGoingEntity, arrayList);
        m18734O(onGoingEntity, arrayList);
        m18736Q(onGoingEntity, arrayList);
        m18735P(onGoingEntity, arrayList);
        OverviewAnalyticsReporter overviewAnalyticsReporter = OverviewAnalyticsReporter.f18247a;
        List<ProductItem> data = ((UIState) getState()).getData();
        overviewAnalyticsReporter.m18405c(C27039d.m66650j(data != null ? Integer.valueOf(data.size()) : null), arrayList.size());
        updateState(new Function1() { // from class: com.kubi.assets.overview.ongoing.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetOnGoingViewModel.m18710U(arrayList, (UIState) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (m18705F(r5, false, r0, 1, null) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) throws JSONException {
        C107521 c107521;
        if (continuation instanceof C107521) {
            c107521 = (C107521) continuation;
            int i11 = c107521.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c107521.label = i11 - Integer.MIN_VALUE;
            } else {
                c107521 = new C107521(continuation);
            }
        } else {
            c107521 = new C107521(continuation);
        }
        Object obj = c107521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c107521.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c107521.L$0 = interfaceC19282d;
            c107521.label = 1;
            if (super.dispatchIntentOnIO(interfaceC19282d, c107521) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c107521.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(interfaceC19282d instanceof AssetOnGoingContract$UiIntent.GetOnGoingData)) {
            if (interfaceC19282d instanceof AssetOnGoingContract$UiIntent.HideOrShowNumber) {
                updateState(new Function1() { // from class: com.kubi.assets.overview.ongoing.s
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetOnGoingViewModel.m18702A(interfaceC19282d, (UIState) obj2);
                    }
                });
            } else if (interfaceC19282d instanceof AssetOnGoingContract$UiIntent.TitleClickEvent) {
                AssetOnGoingContract$UiIntent.TitleClickEvent titleClickEvent = (AssetOnGoingContract$UiIntent.TitleClickEvent) interfaceC19282d;
                m18730J(titleClickEvent.getSubType(), titleClickEvent.getIsExpanded());
            }
            return Unit.INSTANCE;
        }
        c107521.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c107521.label = 2;
    }

    /* JADX INFO: renamed from: z */
    public final void m18740z() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m103844constructorimpl(C41696j.m91104d(this.f18411W, null, null, new AssetOnGoingViewModel$contractSubscription$1$1(this, null), 3, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m18706G(AssetOnGoingViewModel assetOnGoingViewModel) {
        assetOnGoingViewModel.m18740z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final AssetV2Api m18726y() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: O */
    public final void m18734O(OnGoingEntity onGoingEntity, List<ProductItem> list) throws JSONException {
        Integer totalCount;
        CopyTradingOnGoingEntity copyTrading = onGoingEntity.getCopyTrading();
        CopyTradingOnGoingEntity copyTradingOnGoingEntity = null;
        if (copyTrading != null) {
            totalCount = copyTrading.getTotalCount();
        } else {
            totalCount = null;
        }
        int iM66650j = C27039d.m66650j(totalCount);
        if (iM66650j != 0) {
            StringBuilder sb2 = new StringBuilder();
            boolean z11 = false;
            sb2.append(C27017c.f54310a.m66516f(R$string.copytd_copy_trading, new Object[0]));
            sb2.append(" (");
            sb2.append(iM66650j);
            sb2.append(')');
            String string = sb2.toString();
            boolean zM66567e = C27025c.m66567e(this.f18412X.get(8), true);
            ProductItem.HeaderItem headerItem = new ProductItem.HeaderItem(8, zM66567e, null, 4, null);
            headerItem.m18776c(string);
            list.add(headerItem);
            if (!zM66567e) {
                return;
            }
            CopyTradingOnGoingEntity copyTrading2 = onGoingEntity.getCopyTrading();
            if (copyTrading2 != null) {
                if (C27025c.m66566d(copyTrading2.getExecute())) {
                    copyTradingOnGoingEntity = copyTrading2;
                }
                if (copyTradingOnGoingEntity != null) {
                    List<CopyTradingItem> items = copyTradingOnGoingEntity.getItems();
                    if (items != null) {
                        CopyTradingMapper copyTradingMapper = new CopyTradingMapper(string);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                        Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(copyTradingMapper.m18869e((CopyTradingItem) it.next()));
                        }
                        list.addAll(arrayList);
                    }
                    if (C27025c.m66566d(copyTradingOnGoingEntity.getHasMore())) {
                        ProductItem.LoadMoreItem loadMoreItem = new ProductItem.LoadMoreItem(Integer.valueOf(iM66650j), 8);
                        loadMoreItem.m18776c(string);
                        list.add(loadMoreItem);
                        z11 = true;
                    }
                }
            }
            OverviewAnalyticsReporter.f18247a.m18404b("myCopyTrading", iM66650j, z11);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m18735P(OnGoingEntity onGoingEntity, List<ProductItem> list) throws JSONException {
        Integer totalCount;
        Pool pool = onGoingEntity.getPool();
        Pool pool2 = null;
        if (pool != null) {
            totalCount = pool.getTotalCount();
        } else {
            totalCount = null;
        }
        int iM66650j = C27039d.m66650j(totalCount);
        if (iM66650j != 0) {
            C27017c c27017c = C27017c.f54310a;
            boolean z11 = false;
            DowngradeExKt.m66551u(c27017c.m66516f(R$string.kc_assets_my_earn, new Object[0]), new Object[]{Integer.valueOf(iM66650j)}, null, 2, null);
            String str = c27017c.m66516f(AccountType.FINANCE.getNickNameRes(), new Object[0]) + " (" + iM66650j + ')';
            boolean zM66567e = C27025c.m66567e(this.f18412X.get(5), true);
            ProductItem.HeaderItem headerItem = new ProductItem.HeaderItem(5, zM66567e, null, 4, null);
            headerItem.m18776c(str);
            list.add(headerItem);
            if (!zM66567e) {
                return;
            }
            Pool pool3 = onGoingEntity.getPool();
            if (pool3 != null) {
                if (C27025c.m66566d(pool3.getExecute())) {
                    pool2 = pool3;
                }
                if (pool2 != null) {
                    List<PoolItem> items = pool2.getItems();
                    if (items != null) {
                        FinancialMapper financialMapper = new FinancialMapper(str);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                        Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(financialMapper.m18878g((PoolItem) it.next()));
                        }
                        list.addAll(arrayList);
                    }
                    if (C27025c.m66566d(pool2.getHasMore())) {
                        ProductItem.LoadMoreItem loadMoreItem = new ProductItem.LoadMoreItem(Integer.valueOf(iM66650j), 5);
                        loadMoreItem.m18776c(str);
                        list.add(loadMoreItem);
                        z11 = true;
                    }
                }
            }
            OverviewAnalyticsReporter.f18247a.m18404b("myEarn", iM66650j, z11);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m18736Q(OnGoingEntity onGoingEntity, List<ProductItem> list) throws JSONException {
        Integer totalCount;
        Integer alreadyCopyTraders;
        boolean z11;
        LeadTradingOnGoingEntity leadTrading = onGoingEntity.getLeadTrading();
        LeadTradingOnGoingEntity leadTradingOnGoingEntity = null;
        if (leadTrading != null) {
            totalCount = leadTrading.getTotalCount();
        } else {
            totalCount = null;
        }
        int iM66650j = C27039d.m66650j(totalCount);
        if (iM66650j != 0) {
            StringBuilder sb2 = new StringBuilder();
            boolean z12 = false;
            sb2.append(C27017c.f54310a.m66516f(R$string.copytd_lead_trading, new Object[0]));
            sb2.append(" (");
            sb2.append(iM66650j);
            sb2.append(')');
            String string = sb2.toString();
            boolean zM66567e = C27025c.m66567e(this.f18412X.get(9), true);
            LeadTradingOnGoingEntity leadTrading2 = onGoingEntity.getLeadTrading();
            if (leadTrading2 != null) {
                alreadyCopyTraders = leadTrading2.getAlreadyCopyTraders();
            } else {
                alreadyCopyTraders = null;
            }
            int iM66650j2 = C27039d.m66650j(alreadyCopyTraders);
            ProductItem.HeaderItem headerItem = new ProductItem.HeaderItem(9, zM66567e, null, 4, null);
            headerItem.m18776c(string);
            Integer numValueOf = Integer.valueOf(iM66650j2);
            if (numValueOf.intValue() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                numValueOf = null;
            }
            headerItem.m18829g(numValueOf);
            list.add(headerItem);
            if (!zM66567e) {
                return;
            }
            LeadTradingOnGoingEntity leadTrading3 = onGoingEntity.getLeadTrading();
            if (leadTrading3 != null) {
                if (C27025c.m66566d(leadTrading3.getExecute())) {
                    leadTradingOnGoingEntity = leadTrading3;
                }
                if (leadTradingOnGoingEntity != null) {
                    List<LeadTradingItem> items = leadTradingOnGoingEntity.getItems();
                    if (items != null) {
                        LeadTradingMapper leadTradingMapper = new LeadTradingMapper(string);
                        Collection<? extends ProductItem> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(items, 10));
                        Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(leadTradingMapper.m18771f((LeadTradingItem) it.next()));
                        }
                        list.addAll(arrayList);
                    }
                    if (C27025c.m66566d(leadTradingOnGoingEntity.getHasMore())) {
                        ProductItem loadMoreItem = new ProductItem.LoadMoreItem(Integer.valueOf(iM66650j), 9);
                        loadMoreItem.m18776c(string);
                        list.add(loadMoreItem);
                        z12 = true;
                    }
                }
            }
            OverviewAnalyticsReporter.f18247a.m18404b("myLeadTrading", iM66650j, z12);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m18737R(OnGoingEntity onGoingEntity, List<ProductItem> list) throws JSONException {
        Integer totalCount;
        Integer totalCount2;
        List<MarginPositionDetail> marginPositionDetailList;
        Margin margin = onGoingEntity.getMargin();
        List<MarginPosition> positions = null;
        if (margin != null) {
            totalCount = margin.getTotalCount();
        } else {
            totalCount = null;
        }
        int iM66650j = C27039d.m66650j(totalCount);
        Isolated isolated = onGoingEntity.getIsolated();
        if (isolated != null) {
            totalCount2 = isolated.getTotalCount();
        } else {
            totalCount2 = null;
        }
        int iM66650j2 = iM66650j + C27039d.m66650j(totalCount2);
        if (iM66650j2 != 0) {
            boolean z11 = false;
            String strM66551u = DowngradeExKt.m66551u(C27017c.f54310a.m66516f(R$string.kc_assets_my_margin, new Object[0]), new Object[]{Integer.valueOf(iM66650j2)}, null, 2, null);
            boolean zM66567e = C27025c.m66567e(this.f18412X.get(2), true);
            ProductItem.HeaderItem headerItem = new ProductItem.HeaderItem(2, zM66567e, null, 4, null);
            headerItem.m18776c(strM66551u);
            list.add(headerItem);
            if (!zM66567e) {
                return;
            }
            Margin margin2 = onGoingEntity.getMargin();
            if (margin2 != null) {
                if (!C27025c.m66566d(margin2.getExecute())) {
                    margin2 = null;
                }
                if (margin2 != null && (marginPositionDetailList = margin2.getMarginPositionDetailList()) != null) {
                    CrossMapper crossMapper = new CrossMapper(iM66650j2, margin2.getHasMore());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(marginPositionDetailList, 10));
                    Iterator<T> it = marginPositionDetailList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(crossMapper.m18871e((MarginPositionDetail) it.next()));
                    }
                    list.addAll(arrayList);
                }
            }
            Isolated isolated2 = onGoingEntity.getIsolated();
            if (isolated2 != null) {
                if (!C27025c.m66566d(isolated2.getExecute())) {
                    isolated2 = null;
                }
                if (isolated2 != null) {
                    IsolatedPositionDetail isolatedPositionDetail = isolated2.getIsolatedPositionDetail();
                    if (isolatedPositionDetail != null) {
                        positions = isolatedPositionDetail.getPositions();
                    }
                    if (positions != null) {
                        IsolatedMapper isolatedMapper = new IsolatedMapper(strM66551u);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(positions, 10));
                        Iterator<T> it2 = positions.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(isolatedMapper.m18882g((MarginPosition) it2.next()));
                        }
                        list.addAll(arrayList2);
                    }
                    if (C27025c.m66566d(isolated2.getHasMore())) {
                        ProductItem.LoadMoreItem loadMoreItem = new ProductItem.LoadMoreItem(Integer.valueOf(iM66650j2), 2);
                        loadMoreItem.m18776c(strM66551u);
                        list.add(loadMoreItem);
                        z11 = true;
                    }
                }
            }
            OverviewAnalyticsReporter.f18247a.m18404b("myMargin", iM66650j2, z11);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m18739V(OnGoingEntity onGoingEntity, List<ProductItem> list) throws JSONException {
        Integer totalCount;
        Robot robot = onGoingEntity.getRobot();
        Robot robot2 = null;
        if (robot != null) {
            totalCount = robot.getTotalCount();
        } else {
            totalCount = null;
        }
        int iM66650j = C27039d.m66650j(totalCount);
        if (iM66650j != 0) {
            boolean z11 = false;
            String strM66551u = DowngradeExKt.m66551u(C27017c.f54310a.m66516f(R$string.kc_assets_my_robot, new Object[0]), new Object[]{Integer.valueOf(iM66650j)}, null, 2, null);
            boolean zM66567e = C27025c.m66567e(this.f18412X.get(4), true);
            ProductItem.HeaderItem headerItem = new ProductItem.HeaderItem(4, zM66567e, null, 4, null);
            headerItem.m18776c(strM66551u);
            list.add(headerItem);
            if (!zM66567e) {
                return;
            }
            Robot robot3 = onGoingEntity.getRobot();
            if (robot3 != null) {
                if (C27025c.m66566d(robot3.getExecute())) {
                    robot2 = robot3;
                }
                if (robot2 != null) {
                    List<RobotItem> items = robot2.getItems();
                    if (items != null) {
                        RobotMapper robotMapper = new RobotMapper(strM66551u);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                        Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(robotMapper.m18885f((RobotItem) it.next()));
                        }
                        list.addAll(arrayList);
                    }
                    if (C27025c.m66566d(robot2.getHasMore())) {
                        ProductItem.LoadMoreItem loadMoreItem = new ProductItem.LoadMoreItem(Integer.valueOf(iM66650j), 4);
                        loadMoreItem.m18776c(strM66551u);
                        list.add(loadMoreItem);
                        z11 = true;
                    }
                }
            }
            OverviewAnalyticsReporter.f18247a.m18404b("myBot", iM66650j, z11);
        }
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f18411W.close();
    }
}
