package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/f;", "c", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,429:1\n375#2:430\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n420#1:430\n*E\n"})
public final class SubscribedFlowCollector<T> implements InterfaceC41635f<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41635f<T> collector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> action;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r7).m90870a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90870a(@NotNull Continuation<? super Unit> continuation) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        SafeCollector safeCollector;
        SubscribedFlowCollector<T> subscribedFlowCollector;
        if (continuation instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) continuation;
            int i11 = subscribedFlowCollector$onSubscription$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.label = i11 - Integer.MIN_VALUE;
            } else {
                subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuation);
            }
        } else {
            subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuation);
        }
        Object obj = subscribedFlowCollector$onSubscription$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = subscribedFlowCollector$onSubscription$1.label;
        try {
            if (r11 != 0) {
                if (r11 == 1) {
                    safeCollector = (SafeCollector) subscribedFlowCollector$onSubscription$1.L$1;
                    subscribedFlowCollector = (SubscribedFlowCollector) subscribedFlowCollector$onSubscription$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (r11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            safeCollector = new SafeCollector(this.collector, subscribedFlowCollector$onSubscription$1.getContext());
            Function2<InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> function2 = this.action;
            subscribedFlowCollector$onSubscription$1.L$0 = this;
            subscribedFlowCollector$onSubscription$1.L$1 = safeCollector;
            subscribedFlowCollector$onSubscription$1.label = 1;
            if (function2.invoke(safeCollector, subscribedFlowCollector$onSubscription$1) != coroutine_suspended) {
                subscribedFlowCollector = this;
            }
            return coroutine_suspended;
            safeCollector.releaseIntercepted();
            InterfaceC41635f<T> interfaceC41635f = subscribedFlowCollector.collector;
            r11 = interfaceC41635f instanceof SubscribedFlowCollector;
            if (r11 == 0) {
                return Unit.INSTANCE;
            }
            subscribedFlowCollector$onSubscription$1.L$0 = null;
            subscribedFlowCollector$onSubscription$1.L$1 = null;
            subscribedFlowCollector$onSubscription$1.label = 2;
        } catch (Throwable th2) {
            r11.releaseIntercepted();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    @Nullable
    public Object emit(T t11, @NotNull Continuation<? super Unit> continuation) {
        return this.collector.emit(t11, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Function2<? super InterfaceC41635f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.collector = interfaceC41635f;
        this.action = function2;
    }
}
