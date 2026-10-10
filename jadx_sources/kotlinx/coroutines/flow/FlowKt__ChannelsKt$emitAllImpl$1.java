package kotlinx.coroutines.flow;

import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m90122f = "Channels.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {32, 33}, m90125m = "emitAllImpl$FlowKt__ChannelsKt", m90126n = {"$this$emitAllImpl", AppsFlyerProperties.CHANNEL, "consume", "$this$emitAllImpl", AppsFlyerProperties.CHANNEL, "consume"}, m90127s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.m90752d(null, null, false, this);
    }

    public FlowKt__ChannelsKt$emitAllImpl$1(Continuation<? super FlowKt__ChannelsKt$emitAllImpl$1> continuation) {
        super(continuation);
    }
}
