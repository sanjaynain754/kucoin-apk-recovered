package com.kubi.spot.business.mvi;

import com.kubi.core.spot.entity.ComplianceInfoEntity;
import com.kubi.core.spot.entity.SpotBannerEntity;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.restful.C19321b;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import e20.InterfaceC37050a;
import eg.InterfaceC37174b;
import er.C37237b;
import f20.C37328c;
import f30.C37335f;
import gr.C38000b;
import gr.C38006h;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
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

/* JADX INFO: compiled from: SpotTradeViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0094@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/spot/business/mvi/SpotTradeViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/spot/business/mvi/SpotTradeRepository;", "initState", "getInitState", "()Lcom/kubi/spot/business/mvi/SpotTradeContract$UIState;", "protocolScope", "Lcom/kubi/spot/utils/ParentCoroutineScope;", "subPushChannelApi", "Lcom/kubi/spot/api/IRestfulApi;", "getSubPushChannelApi", "()Lcom/kubi/spot/api/IRestfulApi;", "subPushChannelApi$delegate", "Lkotlin/Lazy;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRiskWarning", "symbol", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeBannerData", "Lkotlinx/coroutines/Job;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeViewModel.kt\ncom/kubi/spot/business/mvi/SpotTradeViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,116:1\n25#2:117\n26#2:119\n25#2:122\n26#2:124\n1#3:118\n1#3:123\n17#4,2:120\n*S KotlinDebug\n*F\n+ 1 SpotTradeViewModel.kt\ncom/kubi/spot/business/mvi/SpotTradeViewModel\n*L\n60#1:117\n60#1:119\n72#1:122\n72#1:124\n60#1:118\n72#1:123\n69#1:120,2\n*E\n"})
public final class SpotTradeViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final SpotTradeRepository f50256X = new SpotTradeRepository();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final C37335f f50257Y = new C37335f(C42911a.m94120b());

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f50258Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.mvi.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotTradeViewModel.m61227D();
        }
    });

    /* JADX INFO: renamed from: com.kubi.spot.business.mvi.SpotTradeViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: SpotTradeViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.mvi.SpotTradeViewModel", m90122f = "SpotTradeViewModel.kt", m90123i = {0, 1, 2, 2, 2, 2, 2, 2, 2, 3}, m90124l = {45, 51, 64, 70}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent", "$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-SpotTradeViewModel$dispatchIntent$4", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0"})
    public static final class C250381 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C250381(Continuation<? super C250381> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpotTradeViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.mvi.SpotTradeViewModel$dispatchIntent$2 */
    /* JADX INFO: compiled from: SpotTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.mvi.SpotTradeViewModel$dispatchIntent$2", m90122f = "SpotTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250392 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C250392(Continuation<? super C250392> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250392 c250392 = SpotTradeViewModel.this.new C250392(continuation);
            c250392.Z$0 = ((Boolean) obj).booleanValue();
            return c250392;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C250392) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SpotTradeViewModel.this.send(new C25044b(z11));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.mvi.SpotTradeViewModel$dispatchIntent$3 */
    /* JADX INFO: compiled from: SpotTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/SpotBannerEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.mvi.SpotTradeViewModel$dispatchIntent$3", m90122f = "SpotTradeViewModel.kt", m90123i = {0}, m90124l = {59}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSpotTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeViewModel.kt\ncom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n774#2:117\n865#2,2:118\n774#2:120\n865#2,2:121\n774#2:123\n865#2,2:124\n*S KotlinDebug\n*F\n+ 1 SpotTradeViewModel.kt\ncom/kubi/spot/business/mvi/SpotTradeViewModel$dispatchIntent$3\n*L\n52#1:117\n52#1:118,2\n53#1:120\n53#1:121,2\n54#1:123\n54#1:124,2\n*E\n"})
    public static final class C250403 extends SuspendLambda implements Function2<SpotBannerEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC19282d $intent;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpotBannerEntity spotBannerEntity, Continuation<? super Unit> continuation) {
            return ((C250403) create(spotBannerEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C250403(InterfaceC19282d interfaceC19282d, Continuation<? super C250403> continuation) {
            super(2, continuation);
            this.$intent = interfaceC19282d;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250403 c250403 = SpotTradeViewModel.this.new C250403(this.$intent, continuation);
            c250403.L$0 = obj;
            return c250403;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final SpotBannerEntity spotBannerEntity = (SpotBannerEntity) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                SpotTradeViewModel.this.updateState(new Function1() { // from class: com.kubi.spot.business.mvi.j
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SpotTradeViewModel.C250403.m61250h(spotBannerEntity, (UIState) obj2);
                    }
                });
                final SpotTradeViewModel spotTradeViewModel = SpotTradeViewModel.this;
                spotTradeViewModel.updateState(new Function1() { // from class: com.kubi.spot.business.mvi.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SpotTradeViewModel.C250403.m61251i(spotBannerEntity, spotTradeViewModel, (UIState) obj2);
                    }
                });
                SpotTradeViewModel.this.updateState(new Function1() { // from class: com.kubi.spot.business.mvi.l
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SpotTradeViewModel.C250403.m61252j(spotBannerEntity, (UIState) obj2);
                    }
                });
                SpotTradeViewModel.this.f50257Y.close();
                SpotTradeViewModel.this.m61246E();
                SpotTradeViewModel spotTradeViewModel2 = SpotTradeViewModel.this;
                String symbolCode = ((SpotTradeContract$UiIntent.GetNoticeList) this.$intent).getSymbolCode();
                this.L$0 = SpillingKt.nullOutSpilledVariable(spotBannerEntity);
                this.label = 1;
                if (spotTradeViewModel2.m61226B(symbolCode, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: h */
        public static final UIState m61250h(SpotBannerEntity spotBannerEntity, UIState uIState) {
            ArrayList arrayList;
            String id2;
            List<SpotBannerItemEntity> list = spotBannerEntity.getList();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    SpotBannerItemEntity spotBannerItemEntity = (SpotBannerItemEntity) obj;
                    if (spotBannerItemEntity.getNoticeType() == 3 && (id2 = spotBannerItemEntity.getId()) != null && C37328c.m83906c(id2)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            return UIState.copy$default(uIState, false, null, null, arrayList, null, null, 55, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public static final UIState m61251i(SpotBannerEntity spotBannerEntity, SpotTradeViewModel spotTradeViewModel, UIState uIState) {
            ArrayList arrayList;
            List<SpotBannerItemEntity> complianceNoticeList;
            List<SpotBannerItemEntity> list = spotBannerEntity.getList();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((SpotBannerItemEntity) obj).getNoticeType() == 1 && ((complianceNoticeList = ((UIState) spotTradeViewModel.getState()).getComplianceNoticeList()) == null || complianceNoticeList.isEmpty())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            return UIState.copy$default(uIState, false, arrayList, null, null, null, null, 61, null);
        }

        /* JADX INFO: renamed from: j */
        public static final UIState m61252j(SpotBannerEntity spotBannerEntity, UIState uIState) {
            ArrayList arrayList;
            String id2;
            List<SpotBannerItemEntity> list = spotBannerEntity.getList();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    SpotBannerItemEntity spotBannerItemEntity = (SpotBannerItemEntity) obj;
                    if (spotBannerItemEntity.getNoticeType() == 2 && (id2 = spotBannerItemEntity.getId()) != null && C37328c.m83906c(id2)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            return UIState.copy$default(uIState, false, null, arrayList, null, null, null, 59, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.mvi.SpotTradeViewModel$dispatchIntent$7 */
    /* JADX INFO: compiled from: SpotTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/ComplianceInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.mvi.SpotTradeViewModel$dispatchIntent$7", m90122f = "SpotTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250417 extends SuspendLambda implements Function2<ComplianceInfoEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ComplianceInfoEntity complianceInfoEntity, Continuation<? super Unit> continuation) {
            return ((C250417) create(complianceInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C250417(Continuation<? super C250417> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m61254f(ComplianceInfoEntity complianceInfoEntity, UIState uIState) {
            return UIState.copy$default(uIState, false, null, null, null, null, complianceInfoEntity, 31, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250417 c250417 = SpotTradeViewModel.this.new C250417(continuation);
            c250417.L$0 = obj;
            return c250417;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ComplianceInfoEntity complianceInfoEntity = (ComplianceInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SpotTradeViewModel.this.updateState(new Function1() { // from class: com.kubi.spot.business.mvi.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SpotTradeViewModel.C250417.m61254f(complianceInfoEntity, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final Object m61226B(String str, Continuation<? super Unit> continuation) {
        Object objM42823d = RetrofitFlowExKt.m42823d(this.f50256X.m61275f(str), false, new SpotTradeViewModel$getRiskWarning$2(this, null), continuation);
        return objM42823d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM42823d : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final InterfaceC37050a m61227D() {
        return (InterfaceC37050a) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC37050a.class);
    }

    /* JADX INFO: renamed from: w */
    public static final UIState m61240w(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, null, null, null, null, 61, null);
    }

    /* JADX INFO: renamed from: x */
    public static final UIState m61241x(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, null, null, null, null, 59, null);
    }

    /* JADX INFO: renamed from: y */
    public static final UIState m61242y(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, null, null, null, null, 55, null);
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m61243z(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, false, null, null, null, null, null, 31, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(false, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC37050a m61245C() {
        return (InterfaceC37050a) this.f50258Z.getValue();
    }

    /* JADX INFO: renamed from: E */
    public final InterfaceC41775x1 m61246E() {
        return C41696j.m91104d(this.f50257Y, null, null, new SpotTradeViewModel$subscribeBannerData$1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r10, false, r3, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        if (m61226B(r3, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
    
        if (r10 == r1) goto L46;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C250381 c250381;
        C19334f c19334f;
        Throwable throwable;
        if (continuation instanceof C250381) {
            c250381 = (C250381) continuation;
            int i11 = c250381.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c250381.label = i11 - Integer.MIN_VALUE;
            } else {
                c250381 = new C250381(continuation);
            }
        } else {
            c250381 = new C250381(continuation);
        }
        Object objM42823d = c250381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c250381.label;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(objM42823d);
                return Unit.INSTANCE;
            }
            if (i12 == 2) {
                interfaceC19282d = (InterfaceC19282d) c250381.L$0;
                ResultKt.throwOnFailure(objM42823d);
                c19334f = (C19334f) objM42823d;
                throwable = c19334f.getThrowable();
                if (throwable != null) {
                    updateState(new Function1() { // from class: com.kubi.spot.business.mvi.e
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SpotTradeViewModel.m61240w((UIState) obj);
                        }
                    });
                    updateState(new Function1() { // from class: com.kubi.spot.business.mvi.f
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SpotTradeViewModel.m61241x((UIState) obj);
                        }
                    });
                    updateState(new Function1() { // from class: com.kubi.spot.business.mvi.g
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SpotTradeViewModel.m61242y((UIState) obj);
                        }
                    });
                    String symbolCode = ((SpotTradeContract$UiIntent.GetNoticeList) interfaceC19282d).getSymbolCode();
                    c250381.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                    c250381.L$1 = c19334f;
                    c250381.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                    c250381.L$3 = SpillingKt.nullOutSpilledVariable(throwable);
                    c250381.I$0 = 0;
                    c250381.I$1 = 0;
                    c250381.I$2 = 0;
                    c250381.label = 3;
                }
            } else if (i12 == 3) {
                ResultKt.throwOnFailure(objM42823d);
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM42823d);
                if (((C19334f) objM42823d).getThrowable() != null) {
                    updateState(new Function1() { // from class: com.kubi.spot.business.mvi.h
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SpotTradeViewModel.m61243z((UIState) obj);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM42823d);
        if (interfaceC19282d instanceof SpotTradeContract$UiIntent.GetAssetTotal) {
            InterfaceC41634e<Boolean> interfaceC41634eM61276g = this.f50256X.m61276g(((SpotTradeContract$UiIntent.GetAssetTotal) interfaceC19282d).getSymbol());
            C250392 c250392 = new C250392(null);
            c250381.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c250381.label = 1;
        } else {
            if (!(interfaceC19282d instanceof SpotTradeContract$UiIntent.GetNoticeList)) {
                if (interfaceC19282d instanceof SpotTradeContract$UiIntent.GetComplianceInfo) {
                    Object objM56186h = Router.f46192a.m56186h(InterfaceC37174b.class, SiteInfoManager.f47913a.m58109c());
                    if (objM56186h != null ? ((InterfaceC37174b) objM56186h).m83146f() : false) {
                        InterfaceC41634e<ComplianceInfoEntity> interfaceC41634eM61273d = this.f50256X.m61273d(((SpotTradeContract$UiIntent.GetComplianceInfo) interfaceC19282d).getSymbol());
                        C250417 c250417 = new C250417(null);
                        c250381.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                        c250381.label = 4;
                        objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM61273d, false, c250417, c250381);
                    }
                }
                return Unit.INSTANCE;
            }
            InterfaceC41634e<SpotBannerEntity> interfaceC41634eM61274e = this.f50256X.m61274e(((SpotTradeContract$UiIntent.GetNoticeList) interfaceC19282d).getSymbolCode());
            C250403 c250403 = new C250403(interfaceC19282d, null);
            c250381.L$0 = interfaceC19282d;
            c250381.label = 2;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM61274e, false, c250403, c250381);
            if (objM42823d != coroutine_suspended) {
                c19334f = (C19334f) objM42823d;
                throwable = c19334f.getThrowable();
                if (throwable != null) {
                    updateState(new Function1() { // from class: com.kubi.spot.business.mvi.e
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SpotTradeViewModel.m61240w((UIState) obj);
                        }
                    });
                    updateState(new Function1() { // from class: com.kubi.spot.business.mvi.f
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SpotTradeViewModel.m61241x((UIState) obj);
                        }
                    });
                    updateState(new Function1() { // from class: com.kubi.spot.business.mvi.g
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SpotTradeViewModel.m61242y((UIState) obj);
                        }
                    });
                    String symbolCode2 = ((SpotTradeContract$UiIntent.GetNoticeList) interfaceC19282d).getSymbolCode();
                    c250381.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                    c250381.L$1 = c19334f;
                    c250381.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                    c250381.L$3 = SpillingKt.nullOutSpilledVariable(throwable);
                    c250381.I$0 = 0;
                    c250381.I$1 = 0;
                    c250381.I$2 = 0;
                    c250381.label = 3;
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f50257Y.close();
    }
}
