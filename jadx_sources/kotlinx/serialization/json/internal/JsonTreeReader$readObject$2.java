package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.serialization.json.internal.JsonTreeReader", m90122f = "JsonTreeReader.kt", m90123i = {0, 0, 0, 0}, m90124l = {24}, m90125m = "readObject", m90126n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
public final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(JsonTreeReader jsonTreeReader, Continuation<? super JsonTreeReader$readObject$2> continuation) {
        super(continuation);
        this.this$0 = jsonTreeReader;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m91806h(null, this);
    }
}
