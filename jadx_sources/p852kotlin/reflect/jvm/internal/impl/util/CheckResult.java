package p852kotlin.reflect.jvm.internal.impl.util;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class CheckResult {
    private final boolean isSuccess;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class IllegalFunctionName extends CheckResult {

        @NotNull
        public static final IllegalFunctionName INSTANCE = new IllegalFunctionName();

        private IllegalFunctionName() {
            super(false, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class IllegalSignature extends CheckResult {

        @NotNull
        private final String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(@NotNull String error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class SuccessCheck extends CheckResult {

        @NotNull
        public static final SuccessCheck INSTANCE = new SuccessCheck();

        private SuccessCheck() {
            super(true, null);
        }
    }

    public /* synthetic */ CheckResult(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    private CheckResult(boolean z11) {
        this.isSuccess = z11;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
