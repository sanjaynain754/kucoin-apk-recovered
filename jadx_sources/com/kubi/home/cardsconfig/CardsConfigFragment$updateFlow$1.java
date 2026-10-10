package com.kubi.home.cardsconfig;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.ProduceKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CardsConfigFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.cardsconfig.CardsConfigFragment$updateFlow$1", m90122f = "CardsConfigFragment.kt", m90123i = {0, 0}, m90124l = {124}, m90125m = "invokeSuspend", m90126n = {"$this$callbackFlow", "dataObserver"}, m90127s = {"L$0", "L$1"})
public final class CardsConfigFragment$updateFlow$1 extends SuspendLambda implements Function2<InterfaceC41574m<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CardsConfigFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsConfigFragment$updateFlow$1(CardsConfigFragment cardsConfigFragment, Continuation<? super CardsConfigFragment$updateFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = cardsConfigFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CardsConfigFragment$updateFlow$1 cardsConfigFragment$updateFlow$1 = new CardsConfigFragment$updateFlow$1(this.this$0, continuation);
        cardsConfigFragment$updateFlow$1.L$0 = obj;
        return cardsConfigFragment$updateFlow$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41574m<? super Boolean> interfaceC41574m, Continuation<? super Unit> continuation) {
        return ((CardsConfigFragment$updateFlow$1) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.recyclerview.widget.RecyclerView$AdapterDataObserver, com.kubi.home.cardsconfig.CardsConfigFragment$updateFlow$1$dataObserver$1, java.lang.Object] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final CardsConfigFragment cardsConfigFragment = this.this$0;
            final ?? r11 = new SimpleAdapterDataObserver() { // from class: com.kubi.home.cardsconfig.CardsConfigFragment$updateFlow$1$dataObserver$1
                @Override // com.kubi.home.cardsconfig.SimpleAdapterDataObserver
                /* JADX INFO: renamed from: a */
                public void mo29040a() {
                    C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(cardsConfigFragment), null, null, new CardsConfigFragment$updateFlow$1$dataObserver$1$onItemModified$1(interfaceC41574m, null), 3, null);
                }
            };
            this.this$0.m29028z3().registerAdapterDataObserver(r11);
            final CardsConfigFragment cardsConfigFragment2 = this.this$0;
            Function0 function0 = new Function0() { // from class: com.kubi.home.cardsconfig.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardsConfigFragment$updateFlow$1.m29039f(cardsConfigFragment2, r11);
                }
            };
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41574m);
            this.L$1 = SpillingKt.nullOutSpilledVariable(r11);
            this.label = 1;
            if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: f */
    public static final Unit m29039f(CardsConfigFragment cardsConfigFragment, CardsConfigFragment$updateFlow$1$dataObserver$1 cardsConfigFragment$updateFlow$1$dataObserver$1) {
        cardsConfigFragment.m29028z3().unregisterAdapterDataObserver(cardsConfigFragment$updateFlow$1$dataObserver$1);
        return Unit.INSTANCE;
    }
}
