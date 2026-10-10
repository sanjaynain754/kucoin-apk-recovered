package com.kubi.futures.compliance.leverage;

import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EuropeUnlockLeverageViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1", m90122f = "EuropeUnlockLeverageViewModel.kt", m90123i = {}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EuropeUnlockLeverageViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1$1 */
    /* JADX INFO: compiled from: EuropeUnlockLeverageViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1$1", m90122f = "EuropeUnlockLeverageViewModel.kt", m90123i = {}, m90124l = {38}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C128881 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ EuropeUnlockLeverageViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128881(EuropeUnlockLeverageViewModel europeUnlockLeverageViewModel, Continuation<? super C128881> continuation) {
            super(1, continuation);
            this.this$0 = europeUnlockLeverageViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C128881(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C128881) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
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
                IComplianceService iComplianceService = IComplianceService.f22675a.get();
                this.label = 1;
                obj = iComplianceService.mo97160c(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.this$0.m24687u().postValue(new Pair<>((EuropeUnlockLeverageLevelEntity) obj, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1(EuropeUnlockLeverageViewModel europeUnlockLeverageViewModel, Continuation<? super EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1> continuation) {
        super(2, continuation);
        this.this$0 = europeUnlockLeverageViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m24691f(EuropeUnlockLeverageViewModel europeUnlockLeverageViewModel, Throwable th2) {
        europeUnlockLeverageViewModel.m24687u().postValue(new Pair<>(null, th2));
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
            C128881 c128881 = new C128881(this.this$0, null);
            final EuropeUnlockLeverageViewModel europeUnlockLeverageViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.compliance.leverage.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EuropeUnlockLeverageViewModel$fetchEuropeUnlockLeverageLevel$1.m24691f(europeUnlockLeverageViewModel, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c128881, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
