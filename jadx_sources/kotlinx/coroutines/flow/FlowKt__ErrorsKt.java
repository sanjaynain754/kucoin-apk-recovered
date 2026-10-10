package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0018\u001a\u00020\u0014*\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/f;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", TUIConstants.TIMPush.NOTIFICATION.ACTION, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;", "collector", "b", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n105#2:221\n105#2:223\n1#3:222\n159#4:224\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n54#1:221\n128#1:223\n217#1:224\n*E\n"})
public final /* synthetic */ class FlowKt__ErrorsKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41634e<T> m90776a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function3<? super InterfaceC41635f<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(interfaceC41634e, function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m90777b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Throwable> continuation) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuation;
            int i11 = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuation);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuation);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ErrorsKt$catchImpl$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                InterfaceC41635f<? super Object> flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2<>(interfaceC41635f, objectRef2);
                flowKt__ErrorsKt$catchImpl$1.L$0 = objectRef2;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (interfaceC41634e.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) objectRef.element;
        if (m90779d(th, th4) || m90778c(th, flowKt__ErrorsKt$catchImpl$1.getContext())) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            ExceptionsKt.addSuppressed(th4, th);
            throw th4;
        }
        ExceptionsKt.addSuppressed(th, th4);
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m90778c(Throwable th2, CoroutineContext coroutineContext) {
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) coroutineContext.get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 == null || !interfaceC41775x1.isCancelled()) {
            return false;
        }
        return m90779d(th2, interfaceC41775x1.mo90442x());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m90779d(Throwable th2, Throwable th3) {
        return th3 != null && Intrinsics.areEqual(th3, th2);
    }
}
