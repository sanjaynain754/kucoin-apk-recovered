package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmBuiltInsCustomizerKt {

    @NotNull
    private static final Name GET_FIRST_LIST_NAME;

    @NotNull
    private static final Name GET_LAST_LIST_NAME;

    static {
        Name nameIdentifier = Name.identifier("getFirst");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        GET_FIRST_LIST_NAME = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("getLast");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        GET_LAST_LIST_NAME = nameIdentifier2;
    }
}
