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
import repayment.InterfaceC44005a;
import repayment.UnifiedRepayFragment;
import repayment.UnifyLiabilityData;

/* JADX INFO: compiled from: RepayFragmentExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.ext.RepayFragmentExtKt$collectSelectedLiabilityData$1", m90122f = "RepayFragmentExt.kt", m90123i = {}, m90124l = {63}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RepayFragmentExtKt$collectSelectedLiabilityData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnifiedRepayFragment $this_collectSelectedLiabilityData;
    int label;

    /* JADX INFO: renamed from: repayment.ext.RepayFragmentExtKt$collectSelectedLiabilityData$1$a */
    /* JADX INFO: compiled from: RepayFragmentExt.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C44034a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UnifiedRepayFragment f97303b;

        public C44034a(UnifiedRepayFragment unifiedRepayFragment) {
            this.f97303b = unifiedRepayFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(UnifyLiabilityData unifyLiabilityData, Continuation<? super Unit> continuation) {
            RepayFragmentExtKt.m97097j(this.f97303b);
            C44042h.m97118c(this.f97303b, unifyLiabilityData);
            this.f97303b.m97008u3().m96976D(InterfaceC44005a.a.f97260a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepayFragmentExtKt$collectSelectedLiabilityData$1(UnifiedRepayFragment unifiedRepayFragment, Continuation<? super RepayFragmentExtKt$collectSelectedLiabilityData$1> continuation) {
        super(2, continuation);
        this.$this_collectSelectedLiabilityData = unifiedRepayFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepayFragmentExtKt$collectSelectedLiabilityData$1(this.$this_collectSelectedLiabilityData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RepayFragmentExtKt$collectSelectedLiabilityData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41678w<UnifyLiabilityData> interfaceC41678wM96987w = this.$this_collectSelectedLiabilityData.m97008u3().m96987w();
            C44034a c44034a = new C44034a(this.$this_collectSelectedLiabilityData);
            this.label = 1;
            if (interfaceC41678wM96987w.collect(c44034a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
