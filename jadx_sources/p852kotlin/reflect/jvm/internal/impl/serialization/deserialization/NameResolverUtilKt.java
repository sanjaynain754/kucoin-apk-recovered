package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: NameResolverUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NameResolverUtilKt {
    @NotNull
    public static final ClassId getClassId(@NotNull NameResolver nameResolver, int i11) {
        Intrinsics.checkNotNullParameter(nameResolver, "<this>");
        return ClassId.Companion.fromString(nameResolver.getQualifiedClassName(i11), nameResolver.isLocalClassName(i11));
    }

    @NotNull
    public static final Name getName(@NotNull NameResolver nameResolver, int i11) {
        Intrinsics.checkNotNullParameter(nameResolver, "<this>");
        Name nameGuessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i11));
        Intrinsics.checkNotNullExpressionValue(nameGuessByFirstCharacter, "guessByFirstCharacter(...)");
        return nameGuessByFirstCharacter;
    }
}
