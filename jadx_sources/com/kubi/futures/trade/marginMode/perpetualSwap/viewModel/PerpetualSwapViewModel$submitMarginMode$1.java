package com.kubi.futures.trade.marginMode.perpetualSwap.viewModel;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.futures.trade.marginMode.perpetualSwap.data.QuoteModel;
import com.kubi.kumex.data.platform.model.ModifyMarginModeErrorEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: PerpetualSwapViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.PerpetualSwapViewModel$submitMarginMode$1", m90122f = "PerpetualSwapViewModel.kt", m90123i = {0}, m90124l = {132}, m90125m = "invokeSuspend", m90126n = {"associateMap"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nPerpetualSwapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel$submitMarginMode$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1193#2,2:197\n1267#2,4:199\n*S KotlinDebug\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel$submitMarginMode$1\n*L\n131#1:197,2\n131#1:199,4\n*E\n"})
public final class PerpetualSwapViewModel$submitMarginMode$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $marginMode;
    Object L$0;
    int label;
    final /* synthetic */ PerpetualSwapViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.PerpetualSwapViewModel$submitMarginMode$1$1 */
    /* JADX INFO: compiled from: PerpetualSwapViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.PerpetualSwapViewModel$submitMarginMode$1$1", m90122f = "PerpetualSwapViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C137791 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, String> $associateMap;
        final /* synthetic */ boolean $isTrial;
        int label;
        final /* synthetic */ PerpetualSwapViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137791(Map<String, String> map, boolean z11, PerpetualSwapViewModel perpetualSwapViewModel, Continuation<? super C137791> continuation) {
            super(1, continuation);
            this.$associateMap = map;
            this.$isTrial = z11;
            this.this$0 = perpetualSwapViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C137791(this.$associateMap, this.$isTrial, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C137791) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Map<String, String> mapEmptyMap = this.$associateMap;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                ModifyMarginModeResultEntity modifyMarginModeResultEntityMo24483g1 = MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null).mo24483g1(this.$isTrial, mapEmptyMap);
                List<ModifyMarginModeErrorEntity> errors = modifyMarginModeResultEntityMo24483g1.getErrors();
                if (errors != null && (!errors.isEmpty())) {
                    this.this$0.f23865h0.postValue(C13782c.m27125b(modifyMarginModeResultEntityMo24483g1));
                } else {
                    this.this$0.f23867j0.postValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m27123f(Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualSwapViewModel$submitMarginMode$1(PerpetualSwapViewModel perpetualSwapViewModel, String str, boolean z11, Continuation<? super PerpetualSwapViewModel$submitMarginMode$1> continuation) {
        super(2, continuation);
        this.this$0 = perpetualSwapViewModel;
        this.$marginMode = str;
        this.$isTrial = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerpetualSwapViewModel$submitMarginMode$1(this.this$0, this.$marginMode, this.$isTrial, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PerpetualSwapViewModel$submitMarginMode$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Set set = (Set) this.this$0.f23863f0.getValue();
            if (set != null) {
                String str = this.$marginMode;
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    Pair pairM90091to = TuplesKt.m90091to(((QuoteModel) it.next()).getSymbol(), str);
                    linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
                }
            } else {
                linkedHashMap = null;
            }
            C137791 c137791 = new C137791(linkedHashMap, this.$isTrial, this.this$0, null);
            Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PerpetualSwapViewModel$submitMarginMode$1.m27123f((Throwable) obj2);
                }
            };
            this.L$0 = SpillingKt.nullOutSpilledVariable(linkedHashMap);
            this.label = 1;
            if (CoroutineExKt.m36471a(c137791, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.f23853V.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
