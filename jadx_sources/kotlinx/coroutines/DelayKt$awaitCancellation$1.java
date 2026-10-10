package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.DelayKt", m90122f = "Delay.kt", m90123i = {}, m90124l = {160}, m90125m = "awaitCancellation", m90126n = {}, m90127s = {})
public final class DelayKt$awaitCancellation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DelayKt.m90349a(this);
    }

    public DelayKt$awaitCancellation$1(Continuation<? super DelayKt$awaitCancellation$1> continuation) {
        super(continuation);
    }
}
