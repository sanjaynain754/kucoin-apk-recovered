package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "it", "Lcom/kubi/mvi/state/MVIStatus;"}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mvi.state.StatusView$bindState$1", m90122f = "Status.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class StatusView$bindState$1 extends SuspendLambda implements Function2<MVIStatus, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StatusView<S> this$0;

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull MVIStatus mVIStatus, @Nullable Continuation<? super Unit> continuation) {
        return ((StatusView$bindState$1) create(mVIStatus, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusView$bindState$1(StatusView<S> statusView, Continuation<? super StatusView$bindState$1> continuation) {
        super(2, continuation);
        this.this$0 = statusView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StatusView$bindState$1 statusView$bindState$1 = new StatusView$bindState$1(this.this$0, continuation);
        statusView$bindState$1.L$0 = obj;
        return statusView$bindState$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MVIStatus mVIStatus = (MVIStatus) this.L$0;
            if (Intrinsics.areEqual(mVIStatus, MVIStatus.Success.INSTANCE)) {
                this.this$0.mo42689c();
            } else if (Intrinsics.areEqual(mVIStatus, MVIStatus.Fail.INSTANCE)) {
                this.this$0.mo42687a();
            } else if (Intrinsics.areEqual(mVIStatus, MVIStatus.Empty.INSTANCE)) {
                this.this$0.mo42688b();
            } else if (Intrinsics.areEqual(mVIStatus, MVIStatus.Error.INSTANCE)) {
                this.this$0.mo42691e();
            } else {
                this.this$0.mo42689c();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
