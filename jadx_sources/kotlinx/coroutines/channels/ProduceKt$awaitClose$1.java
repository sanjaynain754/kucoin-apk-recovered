package kotlinx.coroutines.channels;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.channels.ProduceKt", m90122f = "Produce.kt", m90123i = {0, 0}, m90124l = {302}, m90125m = "awaitClose", m90126n = {"$this$awaitClose", "block"}, m90127s = {"L$0", "L$1"})
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ProduceKt.m90681a(null, null, this);
    }

    public ProduceKt$awaitClose$1(Continuation<? super ProduceKt$awaitClose$1> continuation) {
        super(continuation);
    }
}
