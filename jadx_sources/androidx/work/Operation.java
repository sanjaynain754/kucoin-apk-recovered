package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import com.sensorsdata.abtest.entity.AppConstants;

/* JADX INFO: loaded from: classes34.dex */
public interface Operation {

    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.IN_PROGRESS IN_PROGRESS;

    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.SUCCESS SUCCESS;

    @NonNull
    ListenableFuture<State.SUCCESS> getResult();

    @NonNull
    LiveData<State> getState();

    public static abstract class State {

        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            @NonNull
            public Throwable getThrowable() {
                return this.mThrowable;
            }

            @NonNull
            public String toString() {
                return "FAILURE (" + this.mThrowable.getMessage() + ")";
            }

            public FAILURE(@NonNull Throwable th2) {
                this.mThrowable = th2;
            }
        }

        public static final class IN_PROGRESS extends State {
            private IN_PROGRESS() {
            }

            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class SUCCESS extends State {
            private SUCCESS() {
            }

            @NonNull
            public String toString() {
                return AppConstants.AB_TEST_SUCCESS;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public State() {
        }
    }

    static {
        SUCCESS = new State.SUCCESS();
        IN_PROGRESS = new State.IN_PROGRESS();
    }
}
