package repayment.ext;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import repayment.UnifiedRepayFragment;

/* JADX INFO: compiled from: RepayFragmentExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.ext.RepayFragmentExtKt$collectEstimateRepayData$1", m90122f = "RepayFragmentExt.kt", m90123i = {}, m90124l = {93}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RepayFragmentExtKt$collectEstimateRepayData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnifiedRepayFragment $this_collectEstimateRepayData;
    int label;

    /* JADX INFO: renamed from: repayment.ext.RepayFragmentExtKt$collectEstimateRepayData$1$a */
    /* JADX INFO: compiled from: RepayFragmentExt.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C44030a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UnifiedRepayFragment f97300b;

        public C44030a(UnifiedRepayFragment unifiedRepayFragment) {
            this.f97300b = unifiedRepayFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            RepayFragmentExtKt.m97096i(this.f97300b, str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepayFragmentExtKt$collectEstimateRepayData$1(UnifiedRepayFragment unifiedRepayFragment, Continuation<? super RepayFragmentExtKt$collectEstimateRepayData$1> continuation) {
        super(2, continuation);
        this.$this_collectEstimateRepayData = unifiedRepayFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepayFragmentExtKt$collectEstimateRepayData$1(this.$this_collectEstimateRepayData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RepayFragmentExtKt$collectEstimateRepayData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<String> interfaceC41678wM96988x = this.$this_collectEstimateRepayData.m97008u3().m96988x();
            C44030a c44030a = new C44030a(this.$this_collectEstimateRepayData);
            this.label = 1;
            if (interfaceC41678wM96988x.collect(c44030a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
