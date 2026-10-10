package p852kotlin.reflect.jvm.internal.impl.builtins.functions;

import org.jetbrains.annotations.NotNull;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FunctionClassKind.kt */
/* JADX INFO: loaded from: classes61.dex */
public enum FunctionClassKind {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: FunctionClassKind.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final FunctionClassKind getFunctionClassKind(@NotNull FunctionTypeKind functionTypeKind) {
            Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
            if (Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.Function.INSTANCE)) {
                return FunctionClassKind.Function;
            }
            if (Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE)) {
                return FunctionClassKind.SuspendFunction;
            }
            if (Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE)) {
                return FunctionClassKind.KFunction;
            }
            return Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE) ? FunctionClassKind.KSuspendFunction : FunctionClassKind.UNKNOWN;
        }
    }
}
