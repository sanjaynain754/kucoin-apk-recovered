package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.internal.CombineKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"R", "Lkotlinx/coroutines/flow/f;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", m90122f = "Zip.kt", m90123i = {}, m90124l = {269}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C41623xd7c321e8<R> extends SuspendLambda implements Function2<InterfaceC41635f<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41634e[] $flows;
    final /* synthetic */ Function5 $transform$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: Zip.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Lkotlin/Array;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", m90122f = "Zip.kt", m90123i = {}, m90124l = {270}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n135#2,6:270\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<InterfaceC41635f<? super R>, Object[], Continuation<? super Unit>, Object> {
        final /* synthetic */ Function5 $transform$inlined;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, Function5 function5) {
            super(3, continuation);
            this.$transform$inlined = function5;
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super R> interfaceC41635f, Object[] objArr, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.$transform$inlined);
            anonymousClass1.L$0 = interfaceC41635f;
            anonymousClass1.L$1 = objArr;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                Function5 function5 = this.$transform$inlined;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.label = 1;
                InlineMarker.mark(6);
                Object objInvoke = function5.invoke(interfaceC41635f, obj2, obj3, obj4, this);
                InlineMarker.mark(7);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41623xd7c321e8(InterfaceC41634e[] interfaceC41634eArr, Continuation continuation, Function5 function5) {
        super(2, continuation);
        this.$flows = interfaceC41634eArr;
        this.$transform$inlined = function5;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C41623xd7c321e8 c41623xd7c321e8 = new C41623xd7c321e8(this.$flows, continuation, this.$transform$inlined);
        c41623xd7c321e8.L$0 = obj;
        return c41623xd7c321e8;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super R> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((C41623xd7c321e8) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            InterfaceC41634e[] interfaceC41634eArr = this.$flows;
            Function0 function0M90816h = FlowKt__ZipKt.m90816h();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$transform$inlined);
            this.label = 1;
            if (CombineKt.m90958a(interfaceC41635f, interfaceC41634eArr, function0M90816h, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
