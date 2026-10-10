package kotlinx.coroutines.flow;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m90122f = "Reduce.kt", m90123i = {0, 0}, m90124l = {179}, m90125m = "firstOrNull", m90126n = {DbParams.KEY_CHANNEL_RESULT, "collector$iv"}, m90127s = {"L$0", "L$1"})
public final class FlowKt__ReduceKt$firstOrNull$3<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C41636g.m90885I(null, null, this);
    }

    public FlowKt__ReduceKt$firstOrNull$3(Continuation<? super FlowKt__ReduceKt$firstOrNull$3> continuation) {
        super(continuation);
    }
}
