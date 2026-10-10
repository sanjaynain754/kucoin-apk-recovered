package p852kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: NameUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    @NotNull
    private static final Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new Regex("[^\\p{L}\\p{Digit}]");

    @NotNull
    private static final String CONTEXT_RECEIVER_PREFIX = "$context_receiver";

    @JvmStatic
    @NotNull
    public static final Name contextReceiverName(int i11) {
        Name nameIdentifier = Name.identifier(CONTEXT_RECEIVER_PREFIX + '_' + i11);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    @JvmStatic
    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.replace(name, "_");
    }

    private NameUtils() {
    }
}
