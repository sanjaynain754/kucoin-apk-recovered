package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.internal.C41658l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012:\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018RH\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "areEquivalent", "<init>", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/e;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class DistinctFlowImpl<T> implements InterfaceC41634e<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41634e<T> upstream;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Function1<T, Object> keySelector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Function2<Object, Object, Boolean> areEquivalent;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2 */
    /* JADX INFO: compiled from: Distinct.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C415932<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DistinctFlowImpl<T> f91554b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Ref.ObjectRef<Object> f91555c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC41635f<T> f91556d;

        /* JADX WARN: Multi-variable type inference failed */
        public C415932(DistinctFlowImpl<T> distinctFlowImpl, Ref.ObjectRef<Object> objectRef, InterfaceC41635f<? super T> interfaceC41635f) {
            this.f91554b = distinctFlowImpl;
            this.f91555c = objectRef;
            this.f91556d = interfaceC41635f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final Object emit(T t11, Continuation<? super Unit> continuation) {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
                int i11 = distinctFlowImpl$collect$2$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
            }
            Object obj = distinctFlowImpl$collect$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = distinctFlowImpl$collect$2$emit$1.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                T t12 = (T) this.f91554b.keySelector.invoke(t11);
                Object obj2 = this.f91555c.element;
                if (obj2 != C41658l.f91700a && this.f91554b.areEquivalent.invoke(obj2, t12).booleanValue()) {
                    return Unit.INSTANCE;
                }
                this.f91555c.element = t12;
                InterfaceC41635f<T> interfaceC41635f = this.f91556d;
                distinctFlowImpl$collect$2$emit$1.label = 1;
                if (interfaceC41635f.emit(t11, distinctFlowImpl$collect$2$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) C41658l.f91700a;
        Object objCollect = this.upstream.collect(new C415932(this, objectRef, interfaceC41635f), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.upstream = interfaceC41634e;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }
}
