package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.mvi.common.MviExKt;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: StateEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aw\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0004\b\u000f\u0010\u0010\u001aR\u0010\u0015\u001a\u00020\f\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/mvi/state/d;", "I", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/mvi/state/MviConfig;", "mviConfig", "Lkotlin/reflect/KProperty1;", "kp", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/mvi/state/BaseStateVM;Lcom/kubi/mvi/state/MviConfig;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "stateName", "data", "b", "(Ljava/lang/String;Lcom/kubi/mvi/state/MviConfig;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MVI_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStateEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,99:1\n47#2:100\n49#2:104\n50#3:101\n55#3:103\n106#4:102\n*S KotlinDebug\n*F\n+ 1 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n28#1:100\n28#1:104\n28#1:101\n28#1:103\n28#1:102\n*E\n"})
public final class StateExKt {
    /* JADX INFO: renamed from: a */
    public static final <I extends InterfaceC19282d, S extends InterfaceC19284f, A> void m42639a(@NotNull BaseStateVM<I, S> baseStateVM, @NotNull MviConfig mviConfig, @NotNull final KProperty1<S, ? extends A> kp2, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(baseStateVM, "<this>");
        Intrinsics.checkNotNullParameter(mviConfig, "mviConfig");
        Intrinsics.checkNotNullParameter(kp2, "kp");
        Intrinsics.checkNotNullParameter(action, "action");
        String strM42567g = mviConfig.m42567g();
        String str = strM42567g + ".state." + kp2.getName();
        final InterfaceC41634e<S> stateFlow = baseStateVM.getStateFlow();
        MviExKt.m42506b(C41636g.m90939v(new InterfaceC41634e<Tuple1<A>>() { // from class: com.kubi.mvi.state.StateExKt$bindState$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.mvi.state.StateExKt$bindState$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,222:1\n48#2:223\n28#3:224\n*E\n"})
            public static final class C192742<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f35670b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ KProperty1 f35671c;

                /* JADX INFO: renamed from: com.kubi.mvi.state.StateExKt$bindState$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.mvi.state.StateExKt$bindState$$inlined$map$1$2", m90122f = "StateEx.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
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
                        return C192742.this.emit(null, this);
                    }
                }

                public C192742(InterfaceC41635f interfaceC41635f, KProperty1 kProperty1) {
                    this.f35670b = interfaceC41635f;
                    this.f35671c = kProperty1;
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
                        InterfaceC41635f interfaceC41635f = this.f35670b;
                        Tuple1 tuple1 = new Tuple1(this.f35671c.get((InterfaceC19284f) obj));
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
                Object objCollect = stateFlow.collect(new C192742(interfaceC41635f, kp2), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), mviConfig.getLifecycleOwner(), new StateExKt$bindState$2(mviConfig, strM42567g, str, action, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r9.m42591e(r5, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r7.invoke(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m42640b(@NotNull String str, @NotNull MviConfig mviConfig, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, T t11, @NotNull Continuation<? super Unit> continuation) throws JSONException {
        StateExKt$measureTime$1 stateExKt$measureTime$1;
        if (continuation instanceof StateExKt$measureTime$1) {
            stateExKt$measureTime$1 = (StateExKt$measureTime$1) continuation;
            int i11 = stateExKt$measureTime$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                stateExKt$measureTime$1.label = i11 - Integer.MIN_VALUE;
            } else {
                stateExKt$measureTime$1 = new StateExKt$measureTime$1(continuation);
            }
        } else {
            stateExKt$measureTime$1 = new StateExKt$measureTime$1(continuation);
        }
        Object obj = stateExKt$measureTime$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = stateExKt$measureTime$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mviConfig = (MviConfig) stateExKt$measureTime$1.L$1;
            str = (String) stateExKt$measureTime$1.L$0;
            ResultKt.throwOnFailure(obj);
            MVITracker.INSTANCE.trackStartHandleState(mviConfig.m42567g(), C27025c.m66566d(Boxing.boxBoolean(mviConfig.m42572l())), str);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (mviConfig.m42565e()) {
            StateCostTime stateCostTime = new StateCostTime(str, mviConfig.m42567g(), mviConfig.getHandler(), mviConfig);
            StateExKt$measureTime$2 stateExKt$measureTime$2 = new StateExKt$measureTime$2(function2, t11, null);
            stateExKt$measureTime$1.label = 1;
        } else {
            MVITracker.INSTANCE.trackStartHandleState(mviConfig.m42567g(), C27025c.m66566d(Boxing.boxBoolean(mviConfig.m42572l())), str);
            stateExKt$measureTime$1.L$0 = str;
            stateExKt$measureTime$1.L$1 = mviConfig;
            stateExKt$measureTime$1.label = 2;
        }
        return coroutine_suspended;
    }
}
