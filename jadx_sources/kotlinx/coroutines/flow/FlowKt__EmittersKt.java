package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aR\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\n\u001ai\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\u0010\b\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001ap\u0010\u0014\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032D\u0010\b\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\u0002\b\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "e", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "d", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;", "b", "(Lkotlinx/coroutines/flow/f;)V", "c", "(Lkotlinx/coroutines/flow/f;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,218:1\n105#2:219\n105#2:220\n105#2:221\n105#2:222\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n46#1:219\n72#1:220\n142#1:221\n177#1:222\n*E\n"})
public final /* synthetic */ class FlowKt__EmittersKt {
    /* JADX INFO: renamed from: b */
    public static final void m90772b(@NotNull InterfaceC41635f<?> interfaceC41635f) {
        if (interfaceC41635f instanceof C41681z) {
            throw ((C41681z) interfaceC41635f).e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final <T> Object m90773c(InterfaceC41635f<? super T> interfaceC41635f, Function3<? super InterfaceC41635f<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3, Throwable th2, Continuation<? super Unit> continuation) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (continuation instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuation;
            int i11 = flowKt__EmittersKt$invokeSafely$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__EmittersKt$invokeSafely$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                flowKt__EmittersKt$invokeSafely$1.L$0 = th2;
                flowKt__EmittersKt$invokeSafely$1.label = 1;
                if (function3.invoke(interfaceC41635f, th2, flowKt__EmittersKt$invokeSafely$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                ExceptionsKt.addSuppressed(th3, th2);
            }
            throw th3;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC41634e<T> m90774d(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function3<? super InterfaceC41635f<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(interfaceC41634e, function3);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41634e<T> m90775e(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super InterfaceC41635f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(function2, interfaceC41634e);
    }
}
