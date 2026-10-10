package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/mvi/state/StatusVM;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/SingleThreadVM;", "Lcom/kubi/mvi/state/StatusState;", "<init>", "()V", "Lcom/kubi/mvi/state/MVIStatus;", "status", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "", "u", "(Lcom/kubi/mvi/state/MVIStatus;Lkotlin/jvm/functions/Function1;)V", CmcdData.Factory.STREAMING_FORMAT_SS, "()Lcom/kubi/mvi/state/StatusState;", "initState", "t", "()Ljava/lang/Object;", "initStatusState", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class StatusVM<S> extends SingleThreadVM<StatusState<S>> {
    /* JADX INFO: renamed from: t */
    public abstract S mo40890t();

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public StatusState<S> getInitState() {
        return new StatusState<>(mo40890t(), null, 2, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m42645u(@Nullable final MVIStatus status, @NotNull final Function1<? super S, ? extends S> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getUpdateLock()) {
            try {
                if (status == null) {
                    updateState(new Function1<StatusState<S>, StatusState<S>>() { // from class: com.kubi.mvi.state.StatusVM$updateStateData$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // p852kotlin.jvm.functions.Function1
                        @NotNull
                        public final StatusState<S> invoke(@NotNull StatusState<S> updateState) {
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            return StatusState.copy$default(updateState, block.invoke(updateState.getData()), null, 2, null);
                        }
                    });
                } else {
                    updateState(new Function1<StatusState<S>, StatusState<S>>() { // from class: com.kubi.mvi.state.StatusVM$updateStateData$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // p852kotlin.jvm.functions.Function1
                        @NotNull
                        public final StatusState<S> invoke(@NotNull StatusState<S> updateState) {
                            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                            return updateState.copy(block.invoke(updateState.getData()), status);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
