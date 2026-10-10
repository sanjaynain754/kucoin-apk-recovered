package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class ErrorValue extends ConstantValue<Unit> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final ErrorValue create(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorValueWithMessage(message);
        }
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class ErrorValueWithMessage extends ErrorValue {

        @NotNull
        private final String message;

        public ErrorValueWithMessage(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        @NotNull
        public ErrorType getType(@NotNull ModuleDescriptor module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return ErrorUtils.createErrorType(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.message);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        @NotNull
        public String toString() {
            return this.message;
        }
    }

    public ErrorValue() {
        super(Unit.INSTANCE);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public Unit getValue() {
        throw new UnsupportedOperationException();
    }
}
