package com.kubi.assets.overview.detail;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.AssetCoinDetailEntity;
import com.kubi.assets.entity.FundsInfo;
import com.kubi.assets.entity.Isolated;
import com.kubi.assets.entity.IsolatedPositionDetail;
import com.kubi.assets.entity.Margin;
import com.kubi.assets.entity.MarginPositionDetail;
import com.kubi.assets.entity.OnGoingEntity;
import com.kubi.assets.entity.Pool;
import com.kubi.assets.entity.PoolDetail;
import com.kubi.assets.entity.PoolItem;
import com.kubi.assets.entity.Robot;
import com.kubi.assets.entity.RobotItem;
import com.kubi.assets.entity.ShowOnGoingEntity;
import com.kubi.assets.entity.ShowOnGoingFutureEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.kumex.entity.PositionWrapperEntity;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradebase.entity.CurrencyBalance;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetCoinDetailViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0094@¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u00102\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AssetCoinDetailViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOnGoingData", "onGoingEntity", "Lcom/kubi/assets/entity/OnGoingEntity;", FirebaseAnalytics.Param.CURRENCY, "", "handleFutureData", "futureData", "", "Lcom/kubi/kumex/entity/PositionWrapperEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetCoinDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinDetailViewModel.kt\ncom/kubi/assets/overview/detail/AssetCoinDetailViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n25#2:91\n26#2:93\n1#3:92\n1761#4,2:94\n1761#4,3:96\n1763#4:99\n1761#4,3:100\n1761#4,3:103\n230#4,2:106\n774#4:108\n865#4,2:109\n*S KotlinDebug\n*F\n+ 1 AssetCoinDetailViewModel.kt\ncom/kubi/assets/overview/detail/AssetCoinDetailViewModel\n*L\n34#1:91\n34#1:93\n34#1:92\n55#1:94,2\n56#1:96,3\n55#1:99\n62#1:100,3\n63#1:103,3\n65#1:106,2\n79#1:108\n79#1:109,2\n*E\n"})
public final class AssetCoinDetailViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18314X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.detail.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetCoinDetailViewModel.m18592u();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.overview.detail.AssetCoinDetailViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: AssetCoinDetailViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.detail.AssetCoinDetailViewModel", m90122f = "AssetCoinDetailViewModel.kt", m90123i = {0, 1, 2, 3}, m90124l = {29, 32, 40, 46}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class C106681 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C106681(Continuation<? super C106681> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetCoinDetailViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.detail.AssetCoinDetailViewModel$dispatchIntent$2 */
    /* JADX INFO: compiled from: AssetCoinDetailViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/AssetCoinDetailEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.detail.AssetCoinDetailViewModel$dispatchIntent$2", m90122f = "AssetCoinDetailViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106692 extends SuspendLambda implements Function2<AssetCoinDetailEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: f */
        public static final UIState m18600f(AssetCoinDetailEntity assetCoinDetailEntity, UIState uIState) {
            return UIState.copy$default(uIState, assetCoinDetailEntity, null, null, 6, null);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AssetCoinDetailEntity assetCoinDetailEntity, Continuation<? super Unit> continuation) {
            return ((C106692) create(assetCoinDetailEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C106692(Continuation<? super C106692> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106692 c106692 = AssetCoinDetailViewModel.this.new C106692(continuation);
            c106692.L$0 = obj;
            return c106692;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final AssetCoinDetailEntity assetCoinDetailEntity = (AssetCoinDetailEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetCoinDetailViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.overview.detail.z
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetCoinDetailViewModel.C106692.m18600f(assetCoinDetailEntity, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.detail.AssetCoinDetailViewModel$dispatchIntent$4 */
    /* JADX INFO: compiled from: AssetCoinDetailViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/OnGoingEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.detail.AssetCoinDetailViewModel$dispatchIntent$4", m90122f = "AssetCoinDetailViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106704 extends SuspendLambda implements Function2<OnGoingEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC19282d $intent;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(OnGoingEntity onGoingEntity, Continuation<? super Unit> continuation) {
            return ((C106704) create(onGoingEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106704(InterfaceC19282d interfaceC19282d, Continuation<? super C106704> continuation) {
            super(2, continuation);
            this.$intent = interfaceC19282d;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106704 c106704 = AssetCoinDetailViewModel.this.new C106704(this.$intent, continuation);
            c106704.L$0 = obj;
            return c106704;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OnGoingEntity onGoingEntity = (OnGoingEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetCoinDetailViewModel.this.m18596A(onGoingEntity, ((AssetCoinDetailContract$UiIntent.GetOnGoingData) this.$intent).getCurrency());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.detail.AssetCoinDetailViewModel$dispatchIntent$5 */
    /* JADX INFO: compiled from: AssetCoinDetailViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/kumex/entity/PositionWrapperEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.detail.AssetCoinDetailViewModel$dispatchIntent$5", m90122f = "AssetCoinDetailViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106715 extends SuspendLambda implements Function2<List<? extends PositionWrapperEntity>, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC19282d $intent;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends PositionWrapperEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<PositionWrapperEntity>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106715(InterfaceC19282d interfaceC19282d, Continuation<? super C106715> continuation) {
            super(2, continuation);
            this.$intent = interfaceC19282d;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106715 c106715 = AssetCoinDetailViewModel.this.new C106715(this.$intent, continuation);
            c106715.L$0 = obj;
            return c106715;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<PositionWrapperEntity> list, Continuation<? super Unit> continuation) {
            return ((C106715) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetCoinDetailViewModel.this.m18598y(list, ((AssetCoinDetailContract$UiIntent.GetFutureData) this.$intent).getCurrency());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m18596A(OnGoingEntity onGoingEntity, String str) {
        final boolean z11;
        final boolean z12;
        Pool pool;
        List<PoolItem> items;
        List<PoolDetail> list;
        Robot robot;
        List<RobotItem> items2;
        Isolated isolated;
        IsolatedPositionDetail isolatedPositionDetail;
        List<MarginPosition> positions;
        Margin margin;
        List<MarginPositionDetail> marginPositionDetailList;
        final boolean z13 = true;
        final int size = 0;
        if (onGoingEntity == null || (margin = onGoingEntity.getMargin()) == null || (marginPositionDetailList = margin.getMarginPositionDetailList()) == null || marginPositionDetailList.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator<T> it = marginPositionDetailList.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            List<FundsInfo> fundsInfoList = ((MarginPositionDetail) it.next()).getFundsInfoList();
            if (fundsInfoList != null && !fundsInfoList.isEmpty()) {
                for (FundsInfo fundsInfo : fundsInfoList) {
                    if (Intrinsics.areEqual(fundsInfo.getCurrency(), str)) {
                        String liability = fundsInfo.getLiability();
                        if ((liability != null ? new BigDecimal(liability) : BigDecimal.ZERO).compareTo(BigDecimal.ZERO) > 0) {
                            z11 = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        if (onGoingEntity == null || (isolated = onGoingEntity.getIsolated()) == null || (isolatedPositionDetail = isolated.getIsolatedPositionDetail()) == null || (positions = isolatedPositionDetail.getPositions()) == null || positions.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it2 = positions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    MarginPosition marginPosition = (MarginPosition) it2.next();
                    CurrencyBalance baseAsset = marginPosition.getBaseAsset();
                    if (!Intrinsics.areEqual(baseAsset != null ? baseAsset.getCurrency() : null, str)) {
                        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
                        if (Intrinsics.areEqual(quoteAsset != null ? quoteAsset.getCurrency() : null, str)) {
                        }
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
        }
        if (onGoingEntity != null && (robot = onGoingEntity.getRobot()) != null && (items2 = robot.getItems()) != null && !items2.isEmpty()) {
            Iterator<T> it3 = items2.iterator();
            do {
                if (!it3.hasNext()) {
                    z13 = false;
                    break;
                }
            } while (!Intrinsics.areEqual(((RobotItem) it3.next()).getQuota(), str));
        } else {
            z13 = false;
            break;
        }
        if (onGoingEntity != null && (pool = onGoingEntity.getPool()) != null && (items = pool.getItems()) != null) {
            for (PoolItem poolItem : items) {
                if (Intrinsics.areEqual(poolItem.getCurrency(), str)) {
                    if (poolItem != null && (list = poolItem.getList()) != null) {
                        size = list.size();
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        updateState(new Function1() { // from class: com.kubi.assets.overview.detail.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCoinDetailViewModel.m18584B(z11, z12, size, z13, (UIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final UIState m18584B(boolean z11, boolean z12, int i11, boolean z13, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new ShowOnGoingEntity(Boolean.valueOf(z11 || z12), Boolean.valueOf(i11 > 0), Boolean.valueOf(z13), Integer.valueOf(i11)), null, 5, null);
    }

    /* JADX INFO: renamed from: v */
    public static final UIState m18593v(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, null, 6, null);
    }

    /* JADX INFO: renamed from: w */
    private final AssetV2Api m18594w() {
        return (AssetV2Api) this.f18314X.getValue();
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m18595z(int i11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new ShowOnGoingFutureEntity(Boolean.valueOf(i11 > 0), Integer.valueOf(i11)), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r9 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r9, false, r3, r4, 1, null) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r9, false, r3, r4, 1, null) == r0) goto L41;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C106681 c106681;
        if (continuation instanceof C106681) {
            c106681 = (C106681) continuation;
            int i11 = c106681.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c106681.label = i11 - Integer.MIN_VALUE;
            } else {
                c106681 = new C106681(continuation);
            }
        } else {
            c106681 = new C106681(continuation);
        }
        C106681 c106682 = c106681;
        Object objM42824e = c106682.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c106682.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            c106682.L$0 = interfaceC19282d;
            c106682.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c106682) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c106682.L$0;
            ResultKt.throwOnFailure(objM42824e);
        } else if (i12 == 2) {
            ResultKt.throwOnFailure(objM42824e);
            if (((C19334f) objM42824e).getThrowable() != null) {
                updateState(new Function1() { // from class: com.kubi.assets.overview.detail.v
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetCoinDetailViewModel.m18593v((UIState) obj);
                    }
                });
            }
        } else {
            if (i12 != 3 && i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        return Unit.INSTANCE;
        if (interfaceC19282d instanceof AssetCoinDetailContract$UiIntent.GetCoinDetail) {
            InterfaceC41634e<AssetCoinDetailEntity> interfaceC41634eM17154p = m18594w().m17154p(((AssetCoinDetailContract$UiIntent.GetCoinDetail) interfaceC19282d).getCurrency());
            C106692 c106692 = new C106692(null);
            c106682.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c106682.label = 2;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17154p, false, c106692, c106682, 1, null);
        } else {
            if (!(interfaceC19282d instanceof AssetCoinDetailContract$UiIntent.GetOnGoingData)) {
                if (interfaceC19282d instanceof AssetCoinDetailContract$UiIntent.GetFutureData) {
                    InterfaceC41634e<List<PositionWrapperEntity>> interfaceC41634eMo35844a = AssetsDepend.m19180c().mo33290t().mo35844a();
                    C106715 c106715 = new C106715(interfaceC19282d, null);
                    c106682.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                    c106682.label = 4;
                }
                return Unit.INSTANCE;
            }
            InterfaceC41634e interfaceC41634eM17049D = AssetV2Api.m17049D(m18594w(), null, null, 3, null);
            C106704 c106704 = new C106704(interfaceC19282d, null);
            c106682.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c106682.label = 3;
        }
        return coroutine_suspended;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m18598y(List<PositionWrapperEntity> list, String str) {
        final int size;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((PositionWrapperEntity) obj).getQuoteCurrency(), str)) {
                    arrayList.add(obj);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        updateState(new Function1() { // from class: com.kubi.assets.overview.detail.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AssetCoinDetailViewModel.m18595z(size, (UIState) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final AssetV2Api m18592u() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
