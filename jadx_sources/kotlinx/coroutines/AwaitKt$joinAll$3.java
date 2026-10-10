package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.AwaitKt", m90122f = "Await.kt", m90123i = {}, m90124l = {58}, m90125m = "joinAll", m90126n = {}, m90127s = {})
public final class AwaitKt$joinAll$3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AwaitKt.m90347c(null, this);
    }

    public AwaitKt$joinAll$3(Continuation<? super AwaitKt$joinAll$3> continuation) {
        super(continuation);
    }
}
