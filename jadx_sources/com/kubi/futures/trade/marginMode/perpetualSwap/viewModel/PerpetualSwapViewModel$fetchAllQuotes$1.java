package com.kubi.futures.trade.marginMode.perpetualSwap.viewModel;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import ni.C42842a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PerpetualSwapViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.PerpetualSwapViewModel$fetchAllQuotes$1", m90122f = "PerpetualSwapViewModel.kt", m90123i = {}, m90124l = {70}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class PerpetualSwapViewModel$fetchAllQuotes$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    int label;
    final /* synthetic */ PerpetualSwapViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.PerpetualSwapViewModel$fetchAllQuotes$1$1 */
    /* JADX INFO: compiled from: PerpetualSwapViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.PerpetualSwapViewModel$fetchAllQuotes$1$1", m90122f = "PerpetualSwapViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nPerpetualSwapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel$fetchAllQuotes$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n827#2:197\n855#2,2:198\n1563#2:200\n1634#2,3:201\n*S KotlinDebug\n*F\n+ 1 PerpetualSwapViewModel.kt\ncom/kubi/futures/trade/marginMode/perpetualSwap/viewModel/PerpetualSwapViewModel$fetchAllQuotes$1$1\n*L\n75#1:197\n75#1:198,2\n75#1:200\n75#1:201,3\n*E\n"})
    public static final class C137781 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isTrial;
        int label;
        final /* synthetic */ PerpetualSwapViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137781(boolean z11, PerpetualSwapViewModel perpetualSwapViewModel, Continuation<? super C137781> continuation) {
            super(1, continuation);
            this.$isTrial = z11;
            this.this$0 = perpetualSwapViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C137781(this.$isTrial, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C137781) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List listFilterNotNull;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = null;
                List<QuoteEntity> listMo24485n0 = MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null).mo24485n0(this.$isTrial);
                if (listMo24485n0 != null && (listFilterNotNull = CollectionsKt.filterNotNull(listMo24485n0)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listFilterNotNull) {
                        if (!C42842a.m93959a((QuoteEntity) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(C42842a.m93960b((QuoteEntity) it.next()));
                    }
                    arrayList = arrayList3;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.this$0.f23859b0.postValue(arrayList);
                } else {
                    this.this$0.f23855X.postValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualSwapViewModel$fetchAllQuotes$1(PerpetualSwapViewModel perpetualSwapViewModel, boolean z11, Continuation<? super PerpetualSwapViewModel$fetchAllQuotes$1> continuation) {
        super(2, continuation);
        this.this$0 = perpetualSwapViewModel;
        this.$isTrial = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerpetualSwapViewModel$fetchAllQuotes$1(this.this$0, this.$isTrial, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PerpetualSwapViewModel$fetchAllQuotes$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m27121f(PerpetualSwapViewModel perpetualSwapViewModel, Throwable th2) {
        perpetualSwapViewModel.f23857Z.postValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            C137781 c137781 = new C137781(this.$isTrial, this.this$0, null);
            final PerpetualSwapViewModel perpetualSwapViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.marginMode.perpetualSwap.viewModel.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PerpetualSwapViewModel$fetchAllQuotes$1.m27121f(perpetualSwapViewModel, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c137781, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.f23853V.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
