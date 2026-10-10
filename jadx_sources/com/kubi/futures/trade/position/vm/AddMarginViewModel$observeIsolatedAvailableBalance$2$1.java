package com.kubi.futures.trade.position.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.kumex.utils.Log;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AddMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$2$1", m90122f = "AddMarginViewModel.kt", m90123i = {}, m90124l = {304}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AddMarginViewModel$observeIsolatedAvailableBalance$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    int label;
    final /* synthetic */ AddMarginViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$2$1$1 */
    /* JADX INFO: compiled from: AddMarginViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel$observeIsolatedAvailableBalance$2$1$1", m90122f = "AddMarginViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C140371 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $currency;
        int label;
        final /* synthetic */ AddMarginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140371(String str, AddMarginViewModel addMarginViewModel, Continuation<? super C140371> continuation) {
            super(1, continuation);
            this.$currency = str;
            this.this$0 = addMarginViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C140371(this.$currency, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C140371) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BigDecimal bigDecimalMo93940t = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null).mo93940t(this.$currency);
                if (bigDecimalMo93940t != null) {
                    this.this$0.m27790a0().postValue(bigDecimalMo93940t);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMarginViewModel$observeIsolatedAvailableBalance$2$1(String str, AddMarginViewModel addMarginViewModel, Continuation<? super AddMarginViewModel$observeIsolatedAvailableBalance$2$1> continuation) {
        super(2, continuation);
        this.$currency = str;
        this.this$0 = addMarginViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m27803f(AddMarginViewModel addMarginViewModel, Throwable th2) {
        Log.f30813a.m36615a(addMarginViewModel.f24265a0, "observeIsolatedAvailableBalance ws trigger error: " + th2.getMessage());
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddMarginViewModel$observeIsolatedAvailableBalance$2$1(this.$currency, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AddMarginViewModel$observeIsolatedAvailableBalance$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C140371 c140371 = new C140371(this.$currency, this.this$0, null);
            final AddMarginViewModel addMarginViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.position.vm.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AddMarginViewModel$observeIsolatedAvailableBalance$2$1.m27803f(addMarginViewModel, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c140371, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
