package com.kubi.spot.business.marketChanges;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.spot.business.discover.entity.MarketChangesItemEntity;
import com.kubi.spot.business.discover.entity.MarketChangesRequestEntity;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KlineMarketChangeVM.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0094@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/spot/business/marketChanges/KlineMarketChangeVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/spot/business/marketChanges/KlineMarketChangeContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/spot/business/marketChanges/MarketChangeRepository;", "initState", "getInitState", "()Lcom/kubi/spot/business/marketChanges/KlineMarketChangeContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineMarketChangeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineMarketChangeVM.kt\ncom/kubi/spot/business/marketChanges/KlineMarketChangeVM\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n25#2:54\n26#2:56\n1#3:55\n*S KotlinDebug\n*F\n+ 1 KlineMarketChangeVM.kt\ncom/kubi/spot/business/marketChanges/KlineMarketChangeVM\n*L\n47#1:54\n47#1:56\n47#1:55\n*E\n"})
public final class KlineMarketChangeVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MarketChangeRepository f50241X = new MarketChangeRepository();

    /* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.KlineMarketChangeVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: KlineMarketChangeVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.marketChanges.KlineMarketChangeVM", m90122f = "KlineMarketChangeVM.kt", m90123i = {0, 1, 2, 2}, m90124l = {25, 31, 45}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent", "marketChangesRequestEntity"}, m90127s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class C250141 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C250141(Continuation<? super C250141> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KlineMarketChangeVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.KlineMarketChangeVM$dispatchIntent$2 */
    /* JADX INFO: compiled from: KlineMarketChangeVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.marketChanges.KlineMarketChangeVM$dispatchIntent$2", m90122f = "KlineMarketChangeVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250152 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C250152(Continuation<? super C250152> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250152 c250152 = KlineMarketChangeVM.this.new C250152(continuation);
            c250152.Z$0 = ((Boolean) obj).booleanValue();
            return c250152;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C250152) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            KlineMarketChangeVM.this.updateState(new Function1() { // from class: com.kubi.spot.business.marketChanges.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KlineMarketChangeVM.C250152.m61193f(z11, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m61193f(boolean z11, UIState uIState) {
            return UIState.copy$default(uIState, null, null, Boolean.valueOf(z11), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.KlineMarketChangeVM$dispatchIntent$3 */
    /* JADX INFO: compiled from: KlineMarketChangeVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.marketChanges.KlineMarketChangeVM$dispatchIntent$3", m90122f = "KlineMarketChangeVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250163 extends SuspendLambda implements Function2<InterfaceC41635f<? super List<? extends MarketChangesItemEntity>>, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: f */
        public static final UIState m61195f(UIState uIState) {
            return UIState.copy$default(uIState, null, null, null, 5, null);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super List<? extends MarketChangesItemEntity>> interfaceC41635f, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC41635f<? super List<MarketChangesItemEntity>>) interfaceC41635f, continuation);
        }

        public C250163(Continuation<? super C250163> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KlineMarketChangeVM.this.new C250163(continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41635f<? super List<MarketChangesItemEntity>> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C250163) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                KlineMarketChangeVM.this.updateState(new Function1() { // from class: com.kubi.spot.business.marketChanges.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return KlineMarketChangeVM.C250163.m61195f((UIState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.marketChanges.KlineMarketChangeVM$dispatchIntent$4 */
    /* JADX INFO: compiled from: KlineMarketChangeVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.marketChanges.KlineMarketChangeVM$dispatchIntent$4", m90122f = "KlineMarketChangeVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250174 extends SuspendLambda implements Function2<List<? extends MarketChangesItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MarketChangesItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MarketChangesItemEntity>) list, continuation);
        }

        public C250174(Continuation<? super C250174> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m61197f(List list, UIState uIState) {
            return UIState.copy$default(uIState, list, Boolean.TRUE, null, 4, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C250174 c250174 = KlineMarketChangeVM.this.new C250174(continuation);
            c250174.L$0 = obj;
            return c250174;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MarketChangesItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C250174) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            KlineMarketChangeVM.this.updateState(new Function1() { // from class: com.kubi.spot.business.marketChanges.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KlineMarketChangeVM.C250174.m61197f(list, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final UIState m61190e(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, Boolean.FALSE, null, 5, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r13, false, r2, r4) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r13 == r0) goto L33;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C250141 c250141;
        if (continuation instanceof C250141) {
            c250141 = (C250141) continuation;
            int i11 = c250141.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c250141.label = i11 - Integer.MIN_VALUE;
            } else {
                c250141 = new C250141(continuation);
            }
        } else {
            c250141 = new C250141(continuation);
        }
        C250141 c250142 = c250141;
        Object objM42824e = c250142.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c250142.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            c250142.L$0 = interfaceC19282d;
            c250142.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c250142) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM42824e);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
            if (((C19334f) objM42824e).getThrowable() != null) {
                updateState(new Function1() { // from class: com.kubi.spot.business.marketChanges.a
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KlineMarketChangeVM.m61190e((UIState) obj);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        interfaceC19282d = (InterfaceC19282d) c250142.L$0;
        ResultKt.throwOnFailure(objM42824e);
        if (!(interfaceC19282d instanceof KlineMarketChangeContract$UiIntent.SymbolSupport)) {
            if (interfaceC19282d instanceof KlineMarketChangeContract$UiIntent.GetMarketChangeData) {
                MarketChangesRequestEntity marketChangesRequestEntity = new MarketChangesRequestEntity(null, "SPOT", ((KlineMarketChangeContract$UiIntent.GetMarketChangeData) interfaceC19282d).getSymbol(), 1, null);
                InterfaceC41634e interfaceC41634eM90897U = C41636g.m90897U(this.f50241X.m61224d(marketChangesRequestEntity), new C250163(null));
                C250174 c250174 = new C250174(null);
                c250142.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c250142.L$1 = SpillingKt.nullOutSpilledVariable(marketChangesRequestEntity);
                c250142.label = 3;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM90897U, false, c250174, c250142, 1, null);
            }
            return Unit.INSTANCE;
        }
        InterfaceC41634e<Boolean> interfaceC41634eM61225e = this.f50241X.m61225e(((KlineMarketChangeContract$UiIntent.SymbolSupport) interfaceC19282d).getSymbol());
        C250152 c250152 = new C250152(null);
        c250142.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c250142.label = 2;
        return coroutine_suspended;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }
}
