package com.kubi.kumex.record.done.viewModel;

import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TwapDelegateRecordViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.done.viewModel.TwapDelegateRecordViewModel$fetchRecords$1", m90122f = "TwapDelegateRecordViewModel.kt", m90123i = {0, 1, 1}, m90124l = {53, 78}, m90125m = "invokeSuspend", m90126n = {"exception", "exception", "records"}, m90127s = {"L$0", "L$0", "L$1"})
public final class TwapDelegateRecordViewModel$fetchRecords$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $currentPage;
    final /* synthetic */ Long $endTime;
    final /* synthetic */ Long $startTime;
    final /* synthetic */ String $symbol;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TwapDelegateRecordViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.record.done.viewModel.TwapDelegateRecordViewModel$fetchRecords$1$1 */
    /* JADX INFO: compiled from: TwapDelegateRecordViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.record.done.viewModel.TwapDelegateRecordViewModel$fetchRecords$1$1", m90122f = "TwapDelegateRecordViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C166951 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Integer $currentPage;
        final /* synthetic */ Ref.ObjectRef<Throwable> $exception;
        final /* synthetic */ TwapDelegateHistPageEntity $records;
        int label;
        final /* synthetic */ TwapDelegateRecordViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166951(TwapDelegateRecordViewModel twapDelegateRecordViewModel, Integer num, Ref.ObjectRef<Throwable> objectRef, TwapDelegateHistPageEntity twapDelegateHistPageEntity, Continuation<? super C166951> continuation) {
            super(2, continuation);
            this.this$0 = twapDelegateRecordViewModel;
            this.$currentPage = num;
            this.$exception = objectRef;
            this.$records = twapDelegateHistPageEntity;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C166951(this.this$0, this.$currentPage, this.$exception, this.$records, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C166951) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m35707C(this.$currentPage);
                Integer num = this.$currentPage;
                if (num == null || (num != null && num.intValue() == 1)) {
                    this.this$0.f30221j0.clear();
                }
                Throwable th2 = this.$exception.element;
                if (th2 != null) {
                    this.this$0.m35704t(th2);
                } else {
                    this.this$0.m35708u(this.$records, this.$currentPage);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapDelegateRecordViewModel$fetchRecords$1(String str, Long l11, Long l12, Integer num, TwapDelegateRecordViewModel twapDelegateRecordViewModel, Continuation<? super TwapDelegateRecordViewModel$fetchRecords$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.$startTime = l11;
        this.$endTime = l12;
        this.$currentPage = num;
        this.this$0 = twapDelegateRecordViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Unit m35715f(Ref.ObjectRef objectRef, Throwable th2) {
        objectRef.element = th2;
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwapDelegateRecordViewModel$fetchRecords$1(this.$symbol, this.$startTime, this.$endTime, this.$currentPage, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TwapDelegateRecordViewModel$fetchRecords$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r11, r3, r10) == r0) goto L20;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final Ref.ObjectRef objectRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objectRef = new Ref.ObjectRef();
        TwapDelegateRecordViewModel$fetchRecords$1$records$1 twapDelegateRecordViewModel$fetchRecords$1$records$1 = new TwapDelegateRecordViewModel$fetchRecords$1$records$1(this.$symbol, this.$startTime, this.$endTime, this.$currentPage, null);
        Function1 function1 = new Function1() { // from class: com.kubi.kumex.record.done.viewModel.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TwapDelegateRecordViewModel$fetchRecords$1.m35715f(objectRef, (Throwable) obj2);
            }
        };
        this.L$0 = objectRef;
        this.label = 1;
        obj = CoroutineExKt.m36471a(twapDelegateRecordViewModel$fetchRecords$1$records$1, function1, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        Ref.ObjectRef objectRef2 = objectRef;
        TwapDelegateHistPageEntity twapDelegateHistPageEntity = (TwapDelegateHistPageEntity) obj;
        if (objectRef2.element instanceof CancellationException) {
            return Unit.INSTANCE;
        }
        AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
        C166951 c166951 = new C166951(this.this$0, this.$currentPage, objectRef2, twapDelegateHistPageEntity, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(objectRef2);
        this.L$1 = SpillingKt.nullOutSpilledVariable(twapDelegateHistPageEntity);
        this.label = 2;
    }
}
