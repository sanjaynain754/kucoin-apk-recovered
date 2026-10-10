package kotlinx.coroutines.channels;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.channels.BufferedChannel", m90122f = "BufferedChannel.kt", m90123i = {}, m90124l = {759}, m90125m = "receiveCatching-JP2dKIU$suspendImpl", m90126n = {}, m90127s = {})
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM90515Y0 = BufferedChannel.m90515Y0(this.this$0, this);
        return objM90515Y0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90515Y0 : ChannelResult.m90669b(objM90515Y0);
    }
}
