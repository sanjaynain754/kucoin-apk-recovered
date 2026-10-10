package p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: ExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KmExtensionType {

    @NotNull
    private final KClass<? extends KmExtension> klass;

    public KmExtensionType(@NotNull KClass<? extends KmExtension> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.klass = klass;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof KmExtensionType) && Intrinsics.areEqual(this.klass, ((KmExtensionType) obj).klass);
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    @NotNull
    public String toString() {
        String name = JvmClassMappingKt.getJavaClass((KClass) this.klass).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }
}
