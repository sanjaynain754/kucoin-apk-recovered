package androidx.datastore.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 */
/* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m90122f = "MultiProcessCoordinator.android.kt", m90123i = {0, 0}, m90124l = {182}, m90125m = "getExclusiveFileLockWithRetryIfDeadlock", m90126n = {"lockFileStream", "backoff"}, m90127s = {"L$0", "J$0"})
public final class C2335xe413854a extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2335xe413854a(MultiProcessCoordinator.Companion companion, Continuation<? super C2335xe413854a> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
