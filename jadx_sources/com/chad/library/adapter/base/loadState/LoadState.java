package com.chad.library.adapter.base.loadState;

import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LoadState.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/chad/library/adapter/base/loadState/LoadState;", "", "endOfPaginationReached", "", "(Z)V", "getEndOfPaginationReached", "()Z", "Error", "Loading", "None", "NotLoading", "Lcom/chad/library/adapter/base/loadState/LoadState$Error;", "Lcom/chad/library/adapter/base/loadState/LoadState$Loading;", "Lcom/chad/library/adapter/base/loadState/LoadState$None;", "Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class LoadState {
    private final boolean endOfPaginationReached;

    /* JADX INFO: compiled from: LoadState.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m90084d2 = {"Lcom/chad/library/adapter/base/loadState/LoadState$Error;", "Lcom/chad/library/adapter/base/loadState/LoadState;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "equals", "", "other", "", "hashCode", "", "toString", "", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Error extends LoadState {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Throwable error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return getEndOfPaginationReached() == error.getEndOfPaginationReached() && Intrinsics.areEqual(this.error, error.error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public String toString() {
            return "Error(endOfPaginationReached=" + getEndOfPaginationReached() + ", error=" + this.error + ')';
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached()) + this.error.hashCode();
        }
    }

    /* JADX INFO: compiled from: LoadState.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/chad/library/adapter/base/loadState/LoadState$Loading;", "Lcom/chad/library/adapter/base/loadState/LoadState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Loading extends LoadState {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(false, null);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Loading) && getEndOfPaginationReached() == ((Loading) other).getEndOfPaginationReached();
        }

        @NotNull
        public String toString() {
            return "Loading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }
    }

    /* JADX INFO: compiled from: LoadState.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/chad/library/adapter/base/loadState/LoadState$None;", "Lcom/chad/library/adapter/base/loadState/LoadState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class None extends LoadState {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(false, null);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof None) && getEndOfPaginationReached() == ((None) other).getEndOfPaginationReached();
        }

        @NotNull
        public String toString() {
            return "None(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }
    }

    /* JADX INFO: compiled from: LoadState.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;", "Lcom/chad/library/adapter/base/loadState/LoadState;", "endOfPaginationReached", "", "(Z)V", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class NotLoading extends LoadState {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final NotLoading Complete = new NotLoading(true);

        @NotNull
        private static final NotLoading Incomplete = new NotLoading(false);

        /* JADX INFO: compiled from: LoadState.kt */
        @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m90084d2 = {"Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading$Companion;", "", "()V", "Complete", "Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;", "getComplete", "()Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;", "Incomplete", "getIncomplete", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @NotNull
            public final NotLoading getComplete() {
                return NotLoading.Complete;
            }

            @NotNull
            public final NotLoading getIncomplete() {
                return NotLoading.Incomplete;
            }
        }

        public NotLoading(boolean z11) {
            super(z11, null);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof NotLoading) && getEndOfPaginationReached() == ((NotLoading) other).getEndOfPaginationReached();
        }

        @NotNull
        public String toString() {
            return "NotLoading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }
    }

    public /* synthetic */ LoadState(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    private LoadState(boolean z11) {
        this.endOfPaginationReached = z11;
    }

    public final boolean getEndOfPaginationReached() {
        return this.endOfPaginationReached;
    }
}
