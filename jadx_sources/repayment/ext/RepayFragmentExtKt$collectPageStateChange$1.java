package repayment.ext;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;
import repayment.InterfaceC44006b;
import repayment.UnifiedRepayFragment;

/* JADX INFO: compiled from: RepayFragmentExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.ext.RepayFragmentExtKt$collectPageStateChange$1", m90122f = "RepayFragmentExt.kt", m90123i = {}, m90124l = {44}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RepayFragmentExtKt$collectPageStateChange$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnifiedRepayFragment $this_collectPageStateChange;
    int label;

    /* JADX INFO: renamed from: repayment.ext.RepayFragmentExtKt$collectPageStateChange$1$1 */
    /* JADX INFO: compiled from: RepayFragmentExt.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "uiState", "Lkotlin/reflect/KClass;", "Lrepayment/RepayContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "repayment.ext.RepayFragmentExtKt$collectPageStateChange$1$1", m90122f = "RepayFragmentExt.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C440321 extends SuspendLambda implements Function2<KClass<? extends InterfaceC44006b>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UnifiedRepayFragment $this_collectPageStateChange;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C440321(UnifiedRepayFragment unifiedRepayFragment, Continuation<? super C440321> continuation) {
            super(2, continuation);
            this.$this_collectPageStateChange = unifiedRepayFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C440321 c440321 = new C440321(this.$this_collectPageStateChange, continuation);
            c440321.L$0 = obj;
            return c440321;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(KClass<? extends InterfaceC44006b> kClass, Continuation<? super Unit> continuation) {
            return ((C440321) create(kClass, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KClass kClass = (KClass) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InterfaceC44006b.c.class))) {
                this.$this_collectPageStateChange.m97007t3().show();
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InterfaceC44006b.PageEmpty.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(InterfaceC44006b.PageLoaded.class))) {
                this.$this_collectPageStateChange.m97007t3().hide();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepayFragmentExtKt$collectPageStateChange$1(UnifiedRepayFragment unifiedRepayFragment, Continuation<? super RepayFragmentExtKt$collectPageStateChange$1> continuation) {
        super(2, continuation);
        this.$this_collectPageStateChange = unifiedRepayFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepayFragmentExtKt$collectPageStateChange$1(this.$this_collectPageStateChange, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RepayFragmentExtKt$collectPageStateChange$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<KClass<? extends InterfaceC44006b>> interfaceC41634eM96990z = this.$this_collectPageStateChange.m97008u3().m96990z();
            C440321 c440321 = new C440321(this.$this_collectPageStateChange, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eM96990z, c440321, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
