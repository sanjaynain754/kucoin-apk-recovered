package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.flow.internal.C41658l;
import org.jetbrains.annotations.NotNull;
import p852kotlin.BuilderInference;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00028\u00012H\b\u0001\u0010\u0012\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r¢\u0006\u0004\b\u0013\u0010\u0014\u001a{\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00028\u00012H\b\u0001\u0010\u0012\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r¢\u0006\u0004\b\u0015\u0010\u0014\u001ak\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022F\u0010\u0012\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "b", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;", "R", "initial", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "accumulator", "value", "operation", "e", "(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;", "c", "d", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n17#1:174\n19#1:178\n17#1:179\n19#1:183\n46#2:168\n51#2:170\n46#2:171\n51#2:173\n46#2:175\n51#2:177\n46#2:180\n51#2:182\n46#2:184\n51#2:186\n46#2:187\n51#2:189\n46#2:190\n51#2:192\n46#2:194\n51#2:196\n105#3:169\n105#3:172\n105#3:176\n105#3:181\n105#3:185\n105#3:188\n105#3:191\n105#3:193\n105#3:195\n105#3:197\n105#3:198\n105#3:200\n1#4:199\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n32#1:174\n32#1:178\n37#1:179\n37#1:183\n17#1:168\n17#1:170\n24#1:171\n24#1:173\n32#1:175\n32#1:177\n37#1:180\n37#1:182\n42#1:184\n42#1:186\n49#1:187\n49#1:189\n56#1:190\n56#1:192\n74#1:194\n74#1:196\n17#1:169\n24#1:172\n32#1:176\n37#1:181\n42#1:185\n49#1:188\n56#1:191\n64#1:193\n74#1:195\n101#1:197\n121#1:198\n152#1:200\n*E\n"})
public final /* synthetic */ class FlowKt__TransformKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$a */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__TransformKt$a", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n122#2,10:109\n*E\n"})
    public static final class C41614a<T> implements InterfaceC41634e<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41634e f91600b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function3 f91601c;

        public C41614a(InterfaceC41634e interfaceC41634e, Function3 function3) {
            this.f91600b = interfaceC41634e;
            this.f91601c = function3;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41634e
        public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) C41658l.f91700a;
            Object objCollect = this.f91600b.collect(new FlowKt__TransformKt$runningReduce$1$1(objectRef, this.f91601c, interfaceC41635f), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41634e<T> m90804a(@NotNull final InterfaceC41634e<? extends T> interfaceC41634e) {
        return new InterfaceC41634e<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n43#2,2:50\n*E\n"})
            public static final class C416152<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f91603b;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m90122f = "Transform.kt", m90123i = {}, m90124l = {50}, m90125m = "emit", m90126n = {}, m90127s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C416152.this.emit(null, this);
                    }
                }

                public C416152(InterfaceC41635f interfaceC41635f) {
                    this.f91603b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(T t11, Continuation<? super Unit> continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC41635f interfaceC41635f = this.f91603b;
                        if (t11 != null) {
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(t11, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C416152(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41634e<T> m90805b(@NotNull final InterfaceC41634e<? extends T> interfaceC41634e, @NotNull final Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new InterfaceC41634e<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n75#2,2:50\n*E\n"})
            public static final class C416162<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f91606b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function2 f91607c;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m90122f = "Transform.kt", m90123i = {0, 0}, m90124l = {50, 51}, m90125m = "emit", m90126n = {"value", "$this$onEach_u24lambda_u248"}, m90127s = {"L$0", "L$1"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C416162.this.emit(null, this);
                    }
                }

                public C416162(InterfaceC41635f interfaceC41635f, Function2 function2) {
                    this.f91606b = interfaceC41635f;
                    this.f91607c = function2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r6.emit(r2, r0) == r1) goto L22;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t11, Continuation<? super Unit> continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj;
                    InterfaceC41635f interfaceC41635f;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            InterfaceC41635f interfaceC41635f2 = (InterfaceC41635f) anonymousClass1.L$1;
                            obj = anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            interfaceC41635f = interfaceC41635f2;
                        } else {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj2);
                    InterfaceC41635f interfaceC41635f3 = this.f91606b;
                    Function2 function2 = this.f91607c;
                    anonymousClass1.L$0 = t11;
                    anonymousClass1.L$1 = interfaceC41635f3;
                    anonymousClass1.label = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = function2.invoke(t11, anonymousClass1);
                    InlineMarker.mark(7);
                    if (objInvoke != coroutine_suspended) {
                        obj = t11;
                        interfaceC41635f = interfaceC41635f3;
                    }
                    return coroutine_suspended;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C416162(interfaceC41635f, function2), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T, R> InterfaceC41634e<R> m90806c(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, R r11, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r11, interfaceC41634e, function3);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC41634e<T> m90807d(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return new C41614a(interfaceC41634e, function3);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T, R> InterfaceC41634e<R> m90808e(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, R r11, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return C41636g.m90902Z(interfaceC41634e, r11, function3);
    }
}
