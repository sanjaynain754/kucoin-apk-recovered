package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.common.MviExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aK\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus;", "", "c", "(Lcom/kubi/mvi/state/MVIStatus;)Z", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/StatusVM;", "Lcom/kubi/mvi/state/MviConfig;", "mviConfig", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/mvi/state/StatusVM;Lcom/kubi/mvi/state/MviConfig;Lkotlin/jvm/functions/Function2;)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/reflect/KProperty1;", "kp", "b", "(Lcom/kubi/mvi/state/StatusVM;Lcom/kubi/mvi/state/MviConfig;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", "MVI_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Status.kt\ncom/kubi/mvi/state/StatusKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,289:1\n47#2:290\n49#2:294\n47#2:295\n49#2:299\n47#2:300\n49#2:304\n50#3:291\n55#3:293\n50#3:296\n55#3:298\n50#3:301\n55#3:303\n106#4:292\n106#4:297\n106#4:302\n*S KotlinDebug\n*F\n+ 1 Status.kt\ncom/kubi/mvi/state/StatusKt\n*L\n215#1:290\n215#1:294\n238#1:295\n238#1:299\n240#1:300\n240#1:304\n215#1:291\n215#1:293\n238#1:296\n238#1:298\n240#1:301\n240#1:303\n215#1:292\n238#1:297\n240#1:302\n*E\n"})
public final class StatusKt {
    /* JADX INFO: renamed from: a */
    public static final <S> void m42641a(@NotNull StatusVM<S> statusVM, @NotNull MviConfig mviConfig, @NotNull Function2<? super MVIStatus, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(statusVM, "<this>");
        Intrinsics.checkNotNullParameter(mviConfig, "mviConfig");
        Intrinsics.checkNotNullParameter(action, "action");
        String strM42567g = mviConfig.m42567g();
        final InterfaceC41634e<S> stateFlow = statusVM.getStateFlow();
        MviExKt.m42506b(C41636g.m90939v(new InterfaceC41634e<MVIStatus>() { // from class: com.kubi.mvi.state.StatusKt$bindStatus$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.mvi.state.StatusKt$bindStatus$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Status.kt\ncom/kubi/mvi/state/StatusKt\n*L\n1#1,222:1\n48#2:223\n215#3:224\n*E\n"})
            public static final class C192752<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35673b;

                /* JADX INFO: renamed from: com.kubi.mvi.state.StatusKt$bindStatus$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.mvi.state.StatusKt$bindStatus$$inlined$map$1$2", m90122f = "Status.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C192752.this.emit(null, this);
                    }
                }

                public C192752(InterfaceC41635f interfaceC41635f) {
                    this.f35673b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
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
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f35673b;
                        MVIStatus status = ((StatusState) obj).getStatus();
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(status, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            @Nullable
            public Object collect(@NotNull InterfaceC41635f<? super MVIStatus> interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = stateFlow.collect(new C192752(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), mviConfig.getLifecycleOwner(), new StatusKt$bindStatus$2(mviConfig, strM42567g, "MVIStatus", action, null));
    }

    /* JADX INFO: renamed from: b */
    public static final <S, A> void m42642b(@NotNull StatusVM<S> statusVM, @NotNull MviConfig mviConfig, @NotNull final KProperty1<S, ? extends A> kp2, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(statusVM, "<this>");
        Intrinsics.checkNotNullParameter(mviConfig, "mviConfig");
        Intrinsics.checkNotNullParameter(kp2, "kp");
        Intrinsics.checkNotNullParameter(action, "action");
        String strM42567g = mviConfig.m42567g();
        String str = strM42567g + ".state." + kp2.getName();
        final InterfaceC41634e<S> stateFlow = statusVM.getStateFlow();
        final InterfaceC41634e<S> interfaceC41634e = new InterfaceC41634e<S>() { // from class: com.kubi.mvi.state.StatusKt$bindStatusState$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.mvi.state.StatusKt$bindStatusState$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Status.kt\ncom/kubi/mvi/state/StatusKt\n*L\n1#1,222:1\n48#2:223\n239#3:224\n*E\n"})
            public static final class C192762<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35675b;

                /* JADX INFO: renamed from: com.kubi.mvi.state.StatusKt$bindStatusState$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.mvi.state.StatusKt$bindStatusState$$inlined$map$1$2", m90122f = "Status.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C192762.this.emit(null, this);
                    }
                }

                public C192762(InterfaceC41635f interfaceC41635f) {
                    this.f35675b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
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
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f35675b;
                        Object data = ((StatusState) obj).getData();
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(data, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            @Nullable
            public Object collect(@NotNull InterfaceC41635f interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = stateFlow.collect(new C192762(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        MviExKt.m42506b(C41636g.m90939v(new InterfaceC41634e<Tuple1<A>>() { // from class: com.kubi.mvi.state.StatusKt$bindStatusState$$inlined$map$2

            /* JADX INFO: renamed from: com.kubi.mvi.state.StatusKt$bindStatusState$$inlined$map$2$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Status.kt\ncom/kubi/mvi/state/StatusKt\n*L\n1#1,222:1\n48#2:223\n240#3:224\n*E\n"})
            public static final class C192772<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35678b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ KProperty1 f35679c;

                /* JADX INFO: renamed from: com.kubi.mvi.state.StatusKt$bindStatusState$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.mvi.state.StatusKt$bindStatusState$$inlined$map$2$2", m90122f = "Status.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C192772.this.emit(null, this);
                    }
                }

                public C192772(InterfaceC41635f interfaceC41635f, KProperty1 kProperty1) {
                    this.f35678b = interfaceC41635f;
                    this.f35679c = kProperty1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
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
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f35678b;
                        Tuple1 tuple1 = new Tuple1(this.f35679c.get(obj));
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(tuple1, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            @Nullable
            public Object collect(@NotNull InterfaceC41635f interfaceC41635f, @NotNull Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C192772(interfaceC41635f, kp2), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), mviConfig.getLifecycleOwner(), new StatusKt$bindStatusState$3(mviConfig, strM42567g, str, action, null));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m42643c(@NotNull MVIStatus mVIStatus) {
        Intrinsics.checkNotNullParameter(mVIStatus, "<this>");
        return Intrinsics.areEqual(mVIStatus, MVIStatus.Empty.INSTANCE);
    }
}
