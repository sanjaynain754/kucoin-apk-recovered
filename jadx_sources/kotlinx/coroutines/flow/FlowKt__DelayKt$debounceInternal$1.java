package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.wallet.WalletConstants;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41576o;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.internal.C41658l;
import kotlinx.coroutines.selects.C41747b;
import kotlinx.coroutines.selects.SelectImplementation;
import og0.C43045a0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/flow/f;", "downstream", "", "<anonymous>", "(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m90122f = "Delay.kt", m90123i = {0, 0, 0, 0, 1, 1, 1}, m90124l = {215, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE}, m90125m = "invokeSuspend", m90126n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n14#2:408\n14#2:410\n1#3:409\n54#4,5:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n212#1:408\n215#1:410\n222#1:411,5\n*E\n"})
public final class FlowKt__DelayKt$debounceInternal$1<T> extends SuspendLambda implements Function3<InterfaceC41709m0, InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41634e<T> $this_debounceInternal;
    final /* synthetic */ Function1<T, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1(Function1<? super T, Long> function1, InterfaceC41634e<? extends T> interfaceC41634e, Continuation<? super FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.$timeoutMillisSelector = function1;
        this.$this_debounceInternal = interfaceC41634e;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, continuation);
        flowKt__DelayKt$debounceInternal$1.L$0 = interfaceC41709m0;
        flowKt__DelayKt$debounceInternal$1.L$1 = interfaceC41635f;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0066  */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
      0x00a4: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r5v3 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v2 kotlinx.coroutines.channels.o) = (r6v4 kotlinx.coroutines.channels.o), (r6v5 kotlinx.coroutines.channels.o), (r6v5 kotlinx.coroutines.channels.o) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r7v2 kotlinx.coroutines.flow.f) = (r7v4 kotlinx.coroutines.flow.f), (r7v5 kotlinx.coroutines.flow.f), (r7v5 kotlinx.coroutines.flow.f) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r7.emit(r15, r14) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r7.m91283o(r14) == r0) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        InterfaceC41635f interfaceC41635f;
        InterfaceC41576o interfaceC41576o;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef2;
        InterfaceC41576o interfaceC41576o2;
        InterfaceC41635f interfaceC41635f2;
        SelectImplementation selectImplementation;
        T t11;
        C43045a0 c43045a0;
        long jLongValue;
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    objectRef2 = (Ref.ObjectRef) this.L$2;
                    interfaceC41576o2 = (InterfaceC41576o) this.L$1;
                    interfaceC41635f2 = (InterfaceC41635f) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                longRef = (Ref.LongRef) this.L$3;
                objectRef = (Ref.ObjectRef) this.L$2;
                interfaceC41576o = (InterfaceC41576o) this.L$1;
                interfaceC41635f = (InterfaceC41635f) this.L$0;
                ResultKt.throwOnFailure(obj);
                objectRef.element = null;
                longRef2 = longRef;
                objectRef2 = objectRef;
                interfaceC41576o2 = interfaceC41576o;
                interfaceC41635f2 = interfaceC41635f;
                selectImplementation = new SelectImplementation(get$context());
                if (objectRef2.element != null) {
                    C41747b.m91297a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(interfaceC41635f2, objectRef2, null));
                }
                selectImplementation.mo91279g(interfaceC41576o2.mo90596f(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, interfaceC41635f2, null));
                this.L$0 = interfaceC41635f2;
                this.L$1 = interfaceC41576o2;
                this.L$2 = objectRef2;
                this.L$3 = null;
                this.label = 2;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            InterfaceC41635f interfaceC41635f3 = (InterfaceC41635f) this.L$1;
            InterfaceC41576o interfaceC41576oM90684d = ProduceKt.m90684d(interfaceC41709m0, null, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, null), 3, null);
            objectRef = new Ref.ObjectRef();
            interfaceC41635f = interfaceC41635f3;
            interfaceC41576o = interfaceC41576oM90684d;
            if (objectRef.element != C41658l.f91702c) {
                longRef = new Ref.LongRef();
                t11 = objectRef.element;
                if (t11 != null) {
                    Function1<T, Long> function1 = this.$timeoutMillisSelector;
                    c43045a0 = C41658l.f91700a;
                    if (t11 == c43045a0) {
                        t11 = null;
                    }
                    jLongValue = function1.invoke(t11).longValue();
                    longRef.element = jLongValue;
                    if (jLongValue < 0) {
                        if (jLongValue != 0) {
                            t12 = objectRef.element;
                            if (t12 == c43045a0) {
                                t12 = null;
                            }
                            this.L$0 = interfaceC41635f;
                            this.L$1 = interfaceC41576o;
                            this.L$2 = objectRef;
                            this.L$3 = longRef;
                            this.label = 1;
                        } else {
                            longRef2 = longRef;
                            objectRef2 = objectRef;
                            interfaceC41576o2 = interfaceC41576o;
                            interfaceC41635f2 = interfaceC41635f;
                            selectImplementation = new SelectImplementation(get$context());
                            if (objectRef2.element != null) {
                                C41747b.m91297a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(interfaceC41635f2, objectRef2, null));
                            }
                            selectImplementation.mo91279g(interfaceC41576o2.mo90596f(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, interfaceC41635f2, null));
                            this.L$0 = interfaceC41635f2;
                            this.L$1 = interfaceC41576o2;
                            this.L$2 = objectRef2;
                            this.L$3 = null;
                            this.label = 2;
                        }
                    } else {
                        throw new IllegalArgumentException("Debounce timeout should not be negative");
                    }
                } else {
                    longRef2 = longRef;
                    objectRef2 = objectRef;
                    interfaceC41576o2 = interfaceC41576o;
                    interfaceC41635f2 = interfaceC41635f;
                    selectImplementation = new SelectImplementation(get$context());
                    if (objectRef2.element != null) {
                        C41747b.m91297a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(interfaceC41635f2, objectRef2, null));
                    }
                    selectImplementation.mo91279g(interfaceC41576o2.mo90596f(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, interfaceC41635f2, null));
                    this.L$0 = interfaceC41635f2;
                    this.L$1 = interfaceC41576o2;
                    this.L$2 = objectRef2;
                    this.L$3 = null;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        interfaceC41635f = interfaceC41635f2;
        interfaceC41576o = interfaceC41576o2;
        objectRef = objectRef2;
        if (objectRef.element != C41658l.f91702c) {
            longRef = new Ref.LongRef();
            t11 = objectRef.element;
            if (t11 != null) {
                Function1<T, Long> function2 = this.$timeoutMillisSelector;
                c43045a0 = C41658l.f91700a;
                if (t11 == c43045a0) {
                    t11 = null;
                }
                jLongValue = function2.invoke(t11).longValue();
                longRef.element = jLongValue;
                if (jLongValue < 0) {
                    if (jLongValue != 0) {
                        t12 = objectRef.element;
                        if (t12 == c43045a0) {
                            t12 = null;
                        }
                        this.L$0 = interfaceC41635f;
                        this.L$1 = interfaceC41576o;
                        this.L$2 = objectRef;
                        this.L$3 = longRef;
                        this.label = 1;
                    } else {
                        longRef2 = longRef;
                        objectRef2 = objectRef;
                        interfaceC41576o2 = interfaceC41576o;
                        interfaceC41635f2 = interfaceC41635f;
                        selectImplementation = new SelectImplementation(get$context());
                        if (objectRef2.element != null) {
                            C41747b.m91297a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(interfaceC41635f2, objectRef2, null));
                        }
                        selectImplementation.mo91279g(interfaceC41576o2.mo90596f(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, interfaceC41635f2, null));
                        this.L$0 = interfaceC41635f2;
                        this.L$1 = interfaceC41576o2;
                        this.L$2 = objectRef2;
                        this.L$3 = null;
                        this.label = 2;
                    }
                } else {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
            } else {
                longRef2 = longRef;
                objectRef2 = objectRef;
                interfaceC41576o2 = interfaceC41576o;
                interfaceC41635f2 = interfaceC41635f;
                selectImplementation = new SelectImplementation(get$context());
                if (objectRef2.element != null) {
                    C41747b.m91297a(selectImplementation, longRef2.element, new FlowKt__DelayKt$debounceInternal$1$3$1(interfaceC41635f2, objectRef2, null));
                }
                selectImplementation.mo91279g(interfaceC41576o2.mo90596f(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, interfaceC41635f2, null));
                this.L$0 = interfaceC41635f2;
                this.L$1 = interfaceC41576o2;
                this.L$2 = objectRef2;
                this.L$3 = null;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
