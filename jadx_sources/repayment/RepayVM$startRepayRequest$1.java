package repayment;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.unify.entity.ManualRepayEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RepayVM.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.RepayVM$startRepayRequest$1", m90122f = "RepayVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RepayVM$startRepayRequest$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $assetCurrencyList;
    final /* synthetic */ String $liabilityCurrency;
    int label;
    final /* synthetic */ RepayVM this$0;

    /* JADX INFO: renamed from: repayment.RepayVM$startRepayRequest$1$1 */
    /* JADX INFO: compiled from: RepayVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "repayment.RepayVM$startRepayRequest$1$1", m90122f = "RepayVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C440021 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RepayVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C440021(RepayVM repayVM, Continuation<? super C440021> continuation) {
            super(2, continuation);
            this.this$0 = repayVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C440021(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C440021) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f97245c0.setValue(new InterfaceC44007c.b());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepayVM$startRepayRequest$1(List<String> list, String str, RepayVM repayVM, Continuation<? super RepayVM$startRepayRequest$1> continuation) {
        super(2, continuation);
        this.$assetCurrencyList = list;
        this.$liabilityCurrency = str;
        this.this$0 = repayVM;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m96992f(RepayVM repayVM, Throwable th2) {
        ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
        repayVM.f97245c0.setValue(new InterfaceC44007c.a(Intrinsics.areEqual(apiException != null ? apiException.code : null, "603008"), th2));
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepayVM$startRepayRequest$1(this.$assetCurrencyList, this.$liabilityCurrency, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RepayVM$startRepayRequest$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ManualRepayEntity manualRepayEntity = new ManualRepayEntity(this.$assetCurrencyList, this.$liabilityCurrency);
            RepayVM repayVM = this.this$0;
            InterfaceC41634e<Object> interfaceC41634eM86736c = repayVM.m96982r().m86736c(manualRepayEntity);
            C440021 c440021 = new C440021(this.this$0, null);
            final RepayVM repayVM2 = this.this$0;
            repayVM.m96978F(interfaceC41634eM86736c, c440021, new Function1() { // from class: repayment.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RepayVM$startRepayRequest$1.m96992f(repayVM2, (Throwable) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
