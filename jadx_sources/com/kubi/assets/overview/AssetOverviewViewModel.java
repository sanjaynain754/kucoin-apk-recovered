package com.kubi.assets.overview;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.facebook.AuthenticationTokenClaims;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.C9459a;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.CommonAccountEntity;
import com.kubi.assets.entity.DynamicsEntity;
import com.kubi.assets.entity.EarnBalance;
import com.kubi.assets.entity.EquityEntity;
import com.kubi.assets.entity.MarginEntity;
import com.kubi.assets.entity.NewOverviewEntity;
import com.kubi.assets.entity.OverviewAccountInfo;
import com.kubi.assets.entity.OverviewItemEntity;
import com.kubi.assets.entity.ProfitEventPoint;
import com.kubi.assets.entity.ProfitLossAnalysisApiResponse;
import com.kubi.assets.entity.RollbackEntity;
import com.kubi.assets.overview.account.C10615q;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.data.entity.UnifiedAssetEntity;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AssetOverviewViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015J.\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u001a\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0012\u0010'\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010(\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetOverviewViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleHideSmallAssetAccountIntent", "dispatchIntent", "handleGetRecentTransitionData", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;", "(Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListFromEntity", "assetV2OverviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "dataList", "", "Lcom/kubi/assets/entity/OverviewItemEntity;", "originDataList", "handleRangeProfitEventPoint", SessionDescription.ATTR_RANGE, "", "filterNonNullAccount", "", JAnalysisConstants.Account.KEY_ACCOUNT, "Lcom/kubi/assets/entity/OverviewAccountInfo;", "filterZeroSubAsset", AuthenticationTokenClaims.JSON_KEY_SUB, "Lcom/kubi/data/entity/SubAssetEntity;", "filterZeroAssets", "initState", "getInitState", "()Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOverviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewViewModel.kt\ncom/kubi/assets/overview/AssetOverviewViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n126#2,2:401\n135#2,2:416\n774#3:403\n865#3,2:404\n774#3:408\n865#3,2:409\n774#3:412\n865#3,2:413\n1869#3:415\n1870#3:418\n25#4:406\n26#4:411\n1#5:407\n*S KotlinDebug\n*F\n+ 1 AssetOverviewViewModel.kt\ncom/kubi/assets/overview/AssetOverviewViewModel\n*L\n51#1:401,2\n269#1:416,2\n113#1:403\n113#1:404,2\n232#1:408\n232#1:409,2\n255#1:412\n255#1:413,2\n258#1:415\n258#1:418\n231#1:406\n231#1:411\n231#1:407\n*E\n"})
public final class AssetOverviewViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18197W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetOverviewViewModel.m18284r();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AssetOverviewViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewViewModel", m90122f = "AssetOverviewViewModel.kt", m90123i = {0, 1, 2, 3}, m90124l = {59, 71, 83, 93}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class C105811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105811(Continuation<? super C105811> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetOverviewViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$3 */
    /* JADX INFO: compiled from: AssetOverviewViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/RollbackEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$3", m90122f = "AssetOverviewViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105823 extends SuspendLambda implements Function2<List<? extends RollbackEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RollbackEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<RollbackEntity>) list, continuation);
        }

        public C105823(Continuation<? super C105823> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105823 c105823 = AssetOverviewViewModel.this.new C105823(continuation);
            c105823.L$0 = obj;
            return c105823;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RollbackEntity> list, Continuation<? super Unit> continuation) {
            return ((C105823) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOverviewViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.overview.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetOverviewViewModel.C105823.m18296f(list, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m18296f(List list, UIState uIState) {
            return uIState.copy((15999 & 1) != 0 ? uIState.data : null, (15999 & 2) != 0 ? uIState.list : null, (15999 & 4) != 0 ? uIState.throwable : null, (15999 & 8) != 0 ? uIState.originDataList : null, (15999 & 16) != 0 ? uIState.isChecked : false, (15999 & 32) != 0 ? uIState.uiHideNumberFlag : false, (15999 & 64) != 0 ? uIState.isNew : null, (15999 & 128) != 0 ? uIState.isShowRollBackTip : !list.isEmpty(), (15999 & 256) != 0 ? uIState.rollbackList : list, (15999 & 512) != 0 ? uIState.dynamicsBarList : null, (15999 & 1024) != 0 ? uIState.dynamicsCardList : null, (15999 & 2048) != 0 ? uIState.lineChartPointList : null, (15999 & 4096) != 0 ? uIState.newOverviewEntity : null, (15999 & 8192) != 0 ? uIState.oldOverviewEntity : null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$4 */
    /* JADX INFO: compiled from: AssetOverviewViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/DynamicsEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$4", m90122f = "AssetOverviewViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetOverviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewViewModel.kt\ncom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n774#2:401\n865#2,2:402\n774#2:404\n865#2,2:405\n*S KotlinDebug\n*F\n+ 1 AssetOverviewViewModel.kt\ncom/kubi/assets/overview/AssetOverviewViewModel$dispatchIntentOnIO$4\n*L\n74#1:401\n74#1:402,2\n75#1:404\n75#1:405,2\n*E\n"})
    public static final class C105834 extends SuspendLambda implements Function2<ArrayList<DynamicsEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C105834(Continuation<? super C105834> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m18298f(ArrayList arrayList, UIState uIState) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.areEqual(((DynamicsEntity) obj).getStyle(), "bar")) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((DynamicsEntity) obj2).getStyle(), "card")) {
                    arrayList3.add(obj2);
                }
            }
            return uIState.copy((15999 & 1) != 0 ? uIState.data : null, (15999 & 2) != 0 ? uIState.list : null, (15999 & 4) != 0 ? uIState.throwable : null, (15999 & 8) != 0 ? uIState.originDataList : null, (15999 & 16) != 0 ? uIState.isChecked : false, (15999 & 32) != 0 ? uIState.uiHideNumberFlag : false, (15999 & 64) != 0 ? uIState.isNew : null, (15999 & 128) != 0 ? uIState.isShowRollBackTip : false, (15999 & 256) != 0 ? uIState.rollbackList : null, (15999 & 512) != 0 ? uIState.dynamicsBarList : arrayList2, (15999 & 1024) != 0 ? uIState.dynamicsCardList : arrayList3, (15999 & 2048) != 0 ? uIState.lineChartPointList : null, (15999 & 4096) != 0 ? uIState.newOverviewEntity : null, (15999 & 8192) != 0 ? uIState.oldOverviewEntity : null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105834 c105834 = AssetOverviewViewModel.this.new C105834(continuation);
            c105834.L$0 = obj;
            return c105834;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<DynamicsEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C105834) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOverviewViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.overview.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetOverviewViewModel.C105834.m18298f(arrayList, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$5 */
    /* JADX INFO: compiled from: AssetOverviewViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/ProfitLossAnalysisApiResponse;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$5", m90122f = "AssetOverviewViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105845 extends SuspendLambda implements Function2<ProfitLossAnalysisApiResponse, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse, Continuation<? super Unit> continuation) {
            return ((C105845) create(profitLossAnalysisApiResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C105845(Continuation<? super C105845> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105845 c105845 = AssetOverviewViewModel.this.new C105845(continuation);
            c105845.L$0 = obj;
            return c105845;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse = (ProfitLossAnalysisApiResponse) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOverviewViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.overview.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetOverviewViewModel.C105845.m18300f(profitLossAnalysisApiResponse, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m18300f(ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse, UIState uIState) {
            return uIState.copy((15999 & 1) != 0 ? uIState.data : null, (15999 & 2) != 0 ? uIState.list : null, (15999 & 4) != 0 ? uIState.throwable : null, (15999 & 8) != 0 ? uIState.originDataList : null, (15999 & 16) != 0 ? uIState.isChecked : false, (15999 & 32) != 0 ? uIState.uiHideNumberFlag : false, (15999 & 64) != 0 ? uIState.isNew : null, (15999 & 128) != 0 ? uIState.isShowRollBackTip : false, (15999 & 256) != 0 ? uIState.rollbackList : null, (15999 & 512) != 0 ? uIState.dynamicsBarList : null, (15999 & 1024) != 0 ? uIState.dynamicsCardList : null, (15999 & 2048) != 0 ? uIState.lineChartPointList : profitLossAnalysisApiResponse.getTrendList(), (15999 & 4096) != 0 ? uIState.newOverviewEntity : null, (15999 & 8192) != 0 ? uIState.oldOverviewEntity : null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$6 */
    /* JADX INFO: compiled from: AssetOverviewViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/NewOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewViewModel$dispatchIntentOnIO$6", m90122f = "AssetOverviewViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105856 extends SuspendLambda implements Function2<NewOverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(NewOverviewEntity newOverviewEntity, Continuation<? super Unit> continuation) {
            return ((C105856) create(newOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C105856(Continuation<? super C105856> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m18302f(NewOverviewEntity newOverviewEntity, UIState uIState) {
            return uIState.copy((15999 & 1) != 0 ? uIState.data : null, (15999 & 2) != 0 ? uIState.list : null, (15999 & 4) != 0 ? uIState.throwable : null, (15999 & 8) != 0 ? uIState.originDataList : null, (15999 & 16) != 0 ? uIState.isChecked : false, (15999 & 32) != 0 ? uIState.uiHideNumberFlag : false, (15999 & 64) != 0 ? uIState.isNew : null, (15999 & 128) != 0 ? uIState.isShowRollBackTip : false, (15999 & 256) != 0 ? uIState.rollbackList : null, (15999 & 512) != 0 ? uIState.dynamicsBarList : null, (15999 & 1024) != 0 ? uIState.dynamicsCardList : null, (15999 & 2048) != 0 ? uIState.lineChartPointList : null, (15999 & 4096) != 0 ? uIState.newOverviewEntity : newOverviewEntity, (15999 & 8192) != 0 ? uIState.oldOverviewEntity : null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105856 c105856 = AssetOverviewViewModel.this.new C105856(continuation);
            c105856.L$0 = obj;
            return c105856;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final NewOverviewEntity newOverviewEntity = (NewOverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOverviewViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.overview.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetOverviewViewModel.C105856.m18302f(newOverviewEntity, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18290u(OverviewAccountInfo overviewAccountInfo) {
        UnifiedAssetEntity unified;
        CommonAccountEntity mining;
        CommonAccountEntity alpha;
        CommonAccountEntity option;
        SubAssetEntity robot;
        SubAssetEntity copyTrading;
        EarnBalance earn;
        MarginEntity margin;
        EquityEntity kumex;
        AssetSingleEntity trade;
        AssetSingleEntity main;
        BigDecimal bigDecimalM89922G = C41014a.m89922G((overviewAccountInfo == null || (main = overviewAccountInfo.getMain()) == null) ? null : main.getTotalBalance(), null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalM89922G.compareTo(bigDecimal) <= 0) {
            if (C41014a.m89922G((overviewAccountInfo == null || (trade = overviewAccountInfo.getTrade()) == null) ? null : trade.getTotalBalance(), null, 1, null).compareTo(bigDecimal) <= 0) {
                if (C41014a.m89922G((overviewAccountInfo == null || (kumex = overviewAccountInfo.getKumex()) == null) ? null : kumex.getTotalEquity(), null, 1, null).compareTo(bigDecimal) <= 0) {
                    if (C41014a.m89922G((overviewAccountInfo == null || (margin = overviewAccountInfo.getMargin()) == null) ? null : margin.getTotalBalanceIfExecuted(), null, 1, null).compareTo(bigDecimal) <= 0) {
                        if (C41014a.m89922G((overviewAccountInfo == null || (earn = overviewAccountInfo.getEarn()) == null) ? null : earn.getTotalValue(), null, 1, null).compareTo(bigDecimal) <= 0) {
                            if (C41014a.m89922G((overviewAccountInfo == null || (copyTrading = overviewAccountInfo.getCopyTrading()) == null) ? null : copyTrading.getTotalBalance(), null, 1, null).compareTo(bigDecimal) <= 0 || !AssetsDepend.f18689a.m19181a().mo20634o()) {
                                if (C41014a.m89922G((overviewAccountInfo == null || (robot = overviewAccountInfo.getRobot()) == null) ? null : robot.getTotalBalance(), null, 1, null).compareTo(bigDecimal) <= 0) {
                                    if (C41014a.m89922G((overviewAccountInfo == null || (option = overviewAccountInfo.getOption()) == null) ? null : option.getTotalBalance(), null, 1, null).compareTo(bigDecimal) <= 0 || !IUserService.a.get().d0().getHasMarginOption()) {
                                        if (C41014a.m89922G((overviewAccountInfo == null || (alpha = overviewAccountInfo.getAlpha()) == null) ? null : alpha.getTotalBalance(), null, 1, null).compareTo(bigDecimal) <= 0) {
                                            if (C41014a.m89922G((overviewAccountInfo == null || (mining = overviewAccountInfo.getMining()) == null) ? null : mining.getTotalBalance(), null, 1, null).compareTo(bigDecimal) <= 0) {
                                                if (C41014a.m89922G((overviewAccountInfo == null || (unified = overviewAccountInfo.getUnified()) == null) ? null : unified.getTotalBalance(), null, 1, null).compareTo(bigDecimal) <= 0 || !IUnifyAccountService.f53155a.get().mo64991e()) {
                                                    if (!C27025c.m66566d(overviewAccountInfo != null ? Boolean.valueOf(overviewAccountInfo.filterZeroSubAsset(overviewAccountInfo.getSub())) : null)) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: z */
    public final Object m18294z(AssetV2OverviewContract$UiIntent.GetRecentTransitionData getRecentTransitionData, Continuation<? super Unit> continuation) {
        AssetOverviewViewModel$handleGetRecentTransitionData$1 assetOverviewViewModel$handleGetRecentTransitionData$1;
        boolean z11;
        final List<OverviewItemEntity> list;
        List<OverviewItemEntity> list2;
        if (continuation instanceof AssetOverviewViewModel$handleGetRecentTransitionData$1) {
            assetOverviewViewModel$handleGetRecentTransitionData$1 = (AssetOverviewViewModel$handleGetRecentTransitionData$1) continuation;
            int i11 = assetOverviewViewModel$handleGetRecentTransitionData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetOverviewViewModel$handleGetRecentTransitionData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetOverviewViewModel$handleGetRecentTransitionData$1 = new AssetOverviewViewModel$handleGetRecentTransitionData$1(this, continuation);
            }
        } else {
            assetOverviewViewModel$handleGetRecentTransitionData$1 = new AssetOverviewViewModel$handleGetRecentTransitionData$1(this, continuation);
        }
        AssetOverviewViewModel$handleGetRecentTransitionData$1 assetOverviewViewModel$handleGetRecentTransitionData$2 = assetOverviewViewModel$handleGetRecentTransitionData$1;
        Object obj = assetOverviewViewModel$handleGetRecentTransitionData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetOverviewViewModel$handleGetRecentTransitionData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AssetV2OverviewEntity data = getRecentTransitionData.getData();
            if (data != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                m18293y(data, arrayList, arrayList2);
                boolean zM18400a = C10615q.m18400a();
                InterfaceC41634e interfaceC41634eM17056O = AssetV2Api.m17056O(m18286w(), 0, 0, 3, null);
                AssetOverviewViewModel$handleGetRecentTransitionData$2$1 assetOverviewViewModel$handleGetRecentTransitionData$2$1 = new AssetOverviewViewModel$handleGetRecentTransitionData$2$1(arrayList, arrayList2, this, zM18400a, null);
                z11 = zM18400a;
                assetOverviewViewModel$handleGetRecentTransitionData$2.L$0 = SpillingKt.nullOutSpilledVariable(getRecentTransitionData);
                assetOverviewViewModel$handleGetRecentTransitionData$2.L$1 = SpillingKt.nullOutSpilledVariable(data);
                assetOverviewViewModel$handleGetRecentTransitionData$2.L$2 = arrayList;
                assetOverviewViewModel$handleGetRecentTransitionData$2.L$3 = arrayList2;
                assetOverviewViewModel$handleGetRecentTransitionData$2.I$0 = 0;
                assetOverviewViewModel$handleGetRecentTransitionData$2.Z$0 = z11;
                assetOverviewViewModel$handleGetRecentTransitionData$2.label = 1;
                Object objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17056O, false, assetOverviewViewModel$handleGetRecentTransitionData$2$1, assetOverviewViewModel$handleGetRecentTransitionData$2, 1, null);
                if (objM42824e == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = arrayList2;
                obj = objM42824e;
                list2 = arrayList;
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z11 = assetOverviewViewModel$handleGetRecentTransitionData$2.Z$0;
        list = (List) assetOverviewViewModel$handleGetRecentTransitionData$2.L$3;
        list2 = (List) assetOverviewViewModel$handleGetRecentTransitionData$2.L$2;
        ResultKt.throwOnFailure(obj);
        if (((C19334f) obj).getThrowable() != null) {
            final ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                if (z11 ? C10724j0.m18648a(((OverviewItemEntity) obj2).getAccountInfo()) : true) {
                    arrayList3.add(obj2);
                }
            }
            updateState(new Function1() { // from class: com.kubi.assets.overview.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return AssetOverviewViewModel.m18276A(arrayList3, list, (UIState) obj3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m18276A(List list, List list2, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((15999 & 1) != 0 ? updateState.data : null, (15999 & 2) != 0 ? updateState.list : list, (15999 & 4) != 0 ? updateState.throwable : null, (15999 & 8) != 0 ? updateState.originDataList : list2, (15999 & 16) != 0 ? updateState.isChecked : false, (15999 & 32) != 0 ? updateState.uiHideNumberFlag : false, (15999 & 64) != 0 ? updateState.isNew : null, (15999 & 128) != 0 ? updateState.isShowRollBackTip : false, (15999 & 256) != 0 ? updateState.rollbackList : null, (15999 & 512) != 0 ? updateState.dynamicsBarList : null, (15999 & 1024) != 0 ? updateState.dynamicsCardList : null, (15999 & 2048) != 0 ? updateState.lineChartPointList : null, (15999 & 4096) != 0 ? updateState.newOverviewEntity : null, (15999 & 8192) != 0 ? updateState.oldOverviewEntity : null);
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m18277C(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((15999 & 1) != 0 ? updateState.data : null, (15999 & 2) != 0 ? updateState.list : list, (15999 & 4) != 0 ? updateState.throwable : null, (15999 & 8) != 0 ? updateState.originDataList : null, (15999 & 16) != 0 ? updateState.isChecked : false, (15999 & 32) != 0 ? updateState.uiHideNumberFlag : false, (15999 & 64) != 0 ? updateState.isNew : null, (15999 & 128) != 0 ? updateState.isShowRollBackTip : false, (15999 & 256) != 0 ? updateState.rollbackList : null, (15999 & 512) != 0 ? updateState.dynamicsBarList : null, (15999 & 1024) != 0 ? updateState.dynamicsCardList : null, (15999 & 2048) != 0 ? updateState.lineChartPointList : null, (15999 & 4096) != 0 ? updateState.newOverviewEntity : null, (15999 & 8192) != 0 ? updateState.oldOverviewEntity : null);
    }

    /* JADX INFO: renamed from: s */
    public static final UIState m18285s(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy((15999 & 1) != 0 ? updateState.data : null, (15999 & 2) != 0 ? updateState.list : null, (15999 & 4) != 0 ? updateState.throwable : null, (15999 & 8) != 0 ? updateState.originDataList : null, (15999 & 16) != 0 ? updateState.isChecked : false, (15999 & 32) != 0 ? updateState.uiHideNumberFlag : ((AssetV2OverviewContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked(), (15999 & 64) != 0 ? updateState.isNew : null, (15999 & 128) != 0 ? updateState.isShowRollBackTip : false, (15999 & 256) != 0 ? updateState.rollbackList : null, (15999 & 512) != 0 ? updateState.dynamicsBarList : null, (15999 & 1024) != 0 ? updateState.dynamicsCardList : null, (15999 & 2048) != 0 ? updateState.lineChartPointList : null, (15999 & 4096) != 0 ? updateState.newOverviewEntity : null, (15999 & 8192) != 0 ? updateState.oldOverviewEntity : null);
    }

    /* JADX INFO: renamed from: w */
    private final AssetV2Api m18286w() {
        return (AssetV2Api) this.f18197W.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (!(interfaceC19282d instanceof AssetV2OverviewContract$UiIntent.GetRecentTransitionData)) {
            return Unit.INSTANCE;
        }
        Object objM18294z = m18294z((AssetV2OverviewContract$UiIntent.GetRecentTransitionData) interfaceC19282d, continuation);
        return objM18294z == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM18294z : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r10, false, r2, r4) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r10, false, r2, r4) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r1, false, r3, r4, 1, null) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r1, false, r3, r4, 1, null) == r0) goto L53;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C105811 c105811;
        if (continuation instanceof C105811) {
            c105811 = (C105811) continuation;
            int i11 = c105811.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c105811.label = i11 - Integer.MIN_VALUE;
            } else {
                c105811 = new C105811(continuation);
            }
        } else {
            c105811 = new C105811(continuation);
        }
        C105811 c105812 = c105811;
        Object obj = c105812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c105812.label;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC19282d = (InterfaceC19282d) c105812.L$0;
                ResultKt.throwOnFailure(obj);
                m18288D(((AssetV2OverviewContract$UiIntent.GetProfitLoss) interfaceC19282d).getRange());
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (interfaceC19282d instanceof AssetV2OverviewContract$UiIntent.HideSmallAssetAccount) {
            m18287B();
            Unit unit = Unit.INSTANCE;
        } else {
            if (!(interfaceC19282d instanceof AssetV2OverviewContract$UiIntent.HideOrShowNumber)) {
                if (interfaceC19282d instanceof AssetV2OverviewContract$UiIntent.GetRollbackData) {
                    InterfaceC41634e<List<RollbackEntity>> interfaceC41634eM17134h = m18286w().m17134h(true);
                    C105823 c105823 = new C105823(null);
                    c105812.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                    c105812.label = 1;
                } else if (interfaceC19282d instanceof AssetV2OverviewContract$UiIntent.GetDynamicsData) {
                    if (C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
                        InterfaceC41634e<ArrayList<DynamicsEntity>> interfaceC41634eM17132g0 = m18286w().m17132g0();
                        C105834 c105834 = new C105834(null);
                        c105812.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c105812.label = 2;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                } else if (interfaceC19282d instanceof AssetV2OverviewContract$UiIntent.GetLineChartPoint) {
                    InterfaceC41634e<ProfitLossAnalysisApiResponse> interfaceC41634eM17136i = m18286w().m17136i(((AssetV2OverviewContract$UiIntent.GetLineChartPoint) interfaceC19282d).getRange());
                    C105845 c105845 = new C105845(null);
                    c105812.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                    c105812.label = 3;
                } else if (interfaceC19282d instanceof AssetV2OverviewContract$UiIntent.GetProfitLoss) {
                    InterfaceC41634e<NewOverviewEntity> interfaceC41634eM17106U0 = m18286w().m17106U0(((AssetV2OverviewContract$UiIntent.GetProfitLoss) interfaceC19282d).getRange());
                    C105856 c105856 = new C105856(null);
                    c105812.L$0 = interfaceC19282d;
                    c105812.label = 4;
                }
                return coroutine_suspended;
            }
            AssetV2OverviewContract$UiIntent.HideOrShowNumber hideOrShowNumber = (AssetV2OverviewContract$UiIntent.HideOrShowNumber) interfaceC19282d;
            AssetsProfitLossAnalysisManager.f40608a.m49943e(hideOrShowNumber.getIsChecked());
            C46392a.m102328k(C42153h.f93593a.m92500D(), hideOrShowNumber.getIsChecked());
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.assets.overview.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetOverviewViewModel.m18285s(interfaceC19282d, (UIState) obj2);
                }
            }));
        }
        return Unit.INSTANCE;
        Unit unit3 = Unit.INSTANCE;
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, null, false, false, null, false, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m18293y(AssetV2OverviewEntity assetV2OverviewEntity, List<OverviewItemEntity> list, List<OverviewItemEntity> list2) {
        ArrayList<OverviewAccountInfo> arrayList;
        if (assetV2OverviewEntity != null) {
            List<OverviewAccountInfo> accounts = assetV2OverviewEntity.getAccounts();
            if (accounts != null) {
                arrayList = new ArrayList();
                for (Object obj : accounts) {
                    if (m18289t((OverviewAccountInfo) obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (OverviewAccountInfo overviewAccountInfo : arrayList) {
                    if (m18291v(overviewAccountInfo, overviewAccountInfo.getSub())) {
                        list2.add(new OverviewItemEntity(overviewAccountInfo, null, 1));
                    }
                    if (C46392a.m102322d(C42153h.f93593a.m92523m(), false)) {
                        if (m18290u(overviewAccountInfo)) {
                            list.add(new OverviewItemEntity(overviewAccountInfo, null, 1));
                        }
                    } else if (overviewAccountInfo.getSub() == null || m18291v(overviewAccountInfo, overviewAccountInfo.getSub())) {
                        list.add(new OverviewItemEntity(overviewAccountInfo, null, 1));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final AssetV2Api m18284r() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final void m18287B() {
        final List originDataList;
        if (C10615q.m18400a()) {
            List<OverviewItemEntity> originDataList2 = ((UIState) getState()).getOriginDataList();
            originDataList = new ArrayList();
            for (Object obj : originDataList2) {
                OverviewItemEntity overviewItemEntity = (OverviewItemEntity) obj;
                boolean zM18648a = true;
                if (overviewItemEntity.getType() == 1) {
                    zM18648a = C10724j0.m18648a(overviewItemEntity.getAccountInfo());
                }
                if (zM18648a) {
                    originDataList.add(obj);
                }
            }
        } else {
            originDataList = ((UIState) getState()).getOriginDataList();
        }
        updateState(new Function1() { // from class: com.kubi.assets.overview.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AssetOverviewViewModel.m18277C(originDataList, (UIState) obj2);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: D */
    public final void m18288D(String str) {
        switch (str.hashCode()) {
            case -1675056170:
                if (str.equals("LAST_90_DAYS")) {
                    OverviewAnalyticsReporter.f18247a.m18418p(ProfitEventPoint.PnL3M.getValue());
                    break;
                }
                break;
            case -642393211:
                if (str.equals("LAST_1_DAY")) {
                    OverviewAnalyticsReporter.f18247a.m18418p(ProfitEventPoint.PNL1D.getValue());
                    break;
                }
                break;
            case 39779190:
                if (str.equals("LAST_180_DAYS")) {
                    OverviewAnalyticsReporter.f18247a.m18418p(ProfitEventPoint.PnL6M.getValue());
                    break;
                }
                break;
            case 1589856336:
                if (str.equals("LAST_30_DAYS")) {
                    OverviewAnalyticsReporter.f18247a.m18418p(ProfitEventPoint.PnL30D.getValue());
                    break;
                }
                break;
            case 1732421928:
                if (str.equals("LAST_7_DAYS")) {
                    OverviewAnalyticsReporter.f18247a.m18418p(ProfitEventPoint.PnL7D.getValue());
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18289t(OverviewAccountInfo overviewAccountInfo) {
        if (overviewAccountInfo.getMain() == null && overviewAccountInfo.getTrade() == null) {
            if (overviewAccountInfo.getMargin() == null || !C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
                if (overviewAccountInfo.getKumex() == null || !C9459a.m15238a()) {
                    if (overviewAccountInfo.getRobot() == null || !C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
                        if (overviewAccountInfo.getEarn() == null || !C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
                            if (overviewAccountInfo.getOption() == null || !C24129b.m58030b(SiteVisibleConfigKey.Option)) {
                                if (overviewAccountInfo.getAlpha() == null || !IQuoteFacadeService.f41383a.get().mo50712o()) {
                                    if (overviewAccountInfo.getCopyTrading() == null || !C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
                                        if ((overviewAccountInfo.getMining() == null || !C24129b.m58030b(SiteVisibleConfigKey.CLOUD_MINING)) && overviewAccountInfo.getSub() == null && overviewAccountInfo.getUnified() == null) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m18291v(OverviewAccountInfo overviewAccountInfo, SubAssetEntity subAssetEntity) {
        Boolean hasSubAccount;
        Boolean showSubAccountBalanceSwitch;
        BigDecimal totalBalance;
        if (overviewAccountInfo.getSub() != null) {
            if (subAssetEntity != null) {
                hasSubAccount = subAssetEntity.getHasSubAccount();
            } else {
                hasSubAccount = null;
            }
            if (C27025c.m66566d(hasSubAccount)) {
                if (subAssetEntity != null) {
                    showSubAccountBalanceSwitch = subAssetEntity.getShowSubAccountBalanceSwitch();
                } else {
                    showSubAccountBalanceSwitch = null;
                }
                if (C27025c.m66566d(showSubAccountBalanceSwitch)) {
                    if (subAssetEntity != null) {
                        totalBalance = subAssetEntity.getTotalBalance();
                    } else {
                        totalBalance = null;
                    }
                    if (C41014a.m89922G(totalBalance, null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
