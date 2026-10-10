package com.kubi.sdk.pkg.task;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: WorkPool.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.task.WorkPool$pullJson$2", m90122f = "WorkPool.kt", m90123i = {}, m90124l = {100}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WorkPool$pullJson$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $jsonUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkPool$pullJson$2(String str, Continuation<? super WorkPool$pullJson$2> continuation) {
        super(1, continuation);
        this.$jsonUrl = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new WorkPool$pullJson$2(this.$jsonUrl, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super String> continuation) {
        return ((WorkPool$pullJson$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$jsonUrl;
        this.label = 1;
        Object objM57784j = HttpHelperKt.m57784j(str, this);
        if (objM57784j == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM57784j;
    }
}
