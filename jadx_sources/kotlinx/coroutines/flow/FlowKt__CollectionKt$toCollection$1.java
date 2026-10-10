package kotlinx.coroutines.flow;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Collection.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m90122f = "Collection.kt", m90123i = {0}, m90124l = {22}, m90125m = "toCollection", m90126n = {FirebaseAnalytics.Param.DESTINATION}, m90127s = {"L$0"})
public final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C41636g.m90924k0(null, null, this);
    }

    public FlowKt__CollectionKt$toCollection$1(Continuation<? super FlowKt__CollectionKt$toCollection$1> continuation) {
        super(continuation);
    }
}
