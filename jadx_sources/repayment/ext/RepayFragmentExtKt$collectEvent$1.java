package repayment.ext;

import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseFragment;
import com.kubi.unify.R$string;
import com.kubi.utils.ToastCompat;
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
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import repayment.InterfaceC44007c;
import repayment.UnifiedRepayFragment;

/* JADX INFO: compiled from: RepayFragmentExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.ext.RepayFragmentExtKt$collectEvent$1", m90122f = "RepayFragmentExt.kt", m90123i = {}, m90124l = {102}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RepayFragmentExtKt$collectEvent$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnifiedRepayFragment $this_collectEvent;
    int label;

    /* JADX INFO: renamed from: repayment.ext.RepayFragmentExtKt$collectEvent$1$1 */
    /* JADX INFO: compiled from: RepayFragmentExt.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C440311<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UnifiedRepayFragment f97301b;

        public C440311(UnifiedRepayFragment unifiedRepayFragment) {
            this.f97301b = unifiedRepayFragment;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        
            if (kotlinx.coroutines.DelayKt.m90350b(500, r0) == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
        
            if (kotlinx.coroutines.DelayKt.m90350b(500, r0) == r1) goto L28;
         */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(InterfaceC44007c interfaceC44007c, Continuation<? super Unit> continuation) {
            RepayFragmentExtKt$collectEvent$1$1$emit$1 repayFragmentExtKt$collectEvent$1$1$emit$1;
            if (continuation instanceof RepayFragmentExtKt$collectEvent$1$1$emit$1) {
                repayFragmentExtKt$collectEvent$1$1$emit$1 = (RepayFragmentExtKt$collectEvent$1$1$emit$1) continuation;
                int i11 = repayFragmentExtKt$collectEvent$1$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    repayFragmentExtKt$collectEvent$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    repayFragmentExtKt$collectEvent$1$1$emit$1 = new RepayFragmentExtKt$collectEvent$1$1$emit$1(this, continuation);
                }
            } else {
                repayFragmentExtKt$collectEvent$1$1$emit$1 = new RepayFragmentExtKt$collectEvent$1$1$emit$1(this, continuation);
            }
            Object obj = repayFragmentExtKt$collectEvent$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = repayFragmentExtKt$collectEvent$1$1$emit$1.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                if (interfaceC44007c instanceof InterfaceC44007c.b) {
                    BaseFragment.hideLoadingDialog$default(this.f97301b, false, 1, null);
                    ToastCompat.m66437C(R$string.return_coin_success);
                    repayFragmentExtKt$collectEvent$1$1$emit$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC44007c);
                    repayFragmentExtKt$collectEvent$1$1$emit$1.label = 1;
                } else if (interfaceC44007c instanceof InterfaceC44007c.a) {
                    BaseFragment.hideLoadingDialog$default(this.f97301b, false, 1, null);
                    InterfaceC44007c.a aVar = (InterfaceC44007c.a) interfaceC44007c;
                    C19331c.m42836c(aVar.getF97272b(), null, 2, null);
                    if (aVar.getF97271a()) {
                        repayFragmentExtKt$collectEvent$1$1$emit$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC44007c);
                        repayFragmentExtKt$collectEvent$1$1$emit$1.label = 2;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
                this.f97301b.preformBackPressed();
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f97301b.preformBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepayFragmentExtKt$collectEvent$1(UnifiedRepayFragment unifiedRepayFragment, Continuation<? super RepayFragmentExtKt$collectEvent$1> continuation) {
        super(2, continuation);
        this.$this_collectEvent = unifiedRepayFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepayFragmentExtKt$collectEvent$1(this.$this_collectEvent, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RepayFragmentExtKt$collectEvent$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41678w<InterfaceC44007c> interfaceC41678wM96973A = this.$this_collectEvent.m97008u3().m96973A();
            C440311 c440311 = new C440311(this.$this_collectEvent);
            this.label = 1;
            if (interfaceC41678wM96973A.collect(c440311, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
