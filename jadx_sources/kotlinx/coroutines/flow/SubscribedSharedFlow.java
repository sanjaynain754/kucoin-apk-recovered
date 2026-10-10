package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R;\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lkotlinx/coroutines/flow/SubscribedSharedFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/r;", "sharedFlow", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "<init>", "(Lkotlinx/coroutines/flow/r;Lkotlin/jvm/functions/Function2;)V", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/r;", "c", "Lkotlin/jvm/functions/Function2;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SubscribedSharedFlow<T> implements InterfaceC41673r<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41673r<T> sharedFlow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function2<InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> action;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 */
    /* JADX INFO: compiled from: Share.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m90122f = "Share.kt", m90123i = {}, m90124l = {412}, m90125m = "collect", m90126n = {}, m90127s = {})
    public static final class C416291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SubscribedSharedFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C416291(SubscribedSharedFlow<T> subscribedSharedFlow, Continuation<? super C416291> continuation) {
            super(continuation);
            this.this$0 = subscribedSharedFlow;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<T> mo86421a() {
        return this.sharedFlow.mo86421a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41673r, kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<?> continuation) {
        C416291 c416291;
        if (continuation instanceof C416291) {
            c416291 = (C416291) continuation;
            int i11 = c416291.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c416291.label = i11 - Integer.MIN_VALUE;
            } else {
                c416291 = new C416291(this, continuation);
            }
        } else {
            c416291 = new C416291(this, continuation);
        }
        Object obj = c416291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c416291.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41673r<T> interfaceC41673r = this.sharedFlow;
            SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(interfaceC41635f, this.action);
            c416291.label = 1;
            if (interfaceC41673r.collect(subscribedFlowCollector, c416291) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedSharedFlow(@NotNull InterfaceC41673r<? extends T> interfaceC41673r, @NotNull Function2<? super InterfaceC41635f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.sharedFlow = interfaceC41673r;
        this.action = function2;
    }
}
