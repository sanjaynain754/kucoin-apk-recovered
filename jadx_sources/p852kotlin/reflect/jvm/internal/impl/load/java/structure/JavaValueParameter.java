package p852kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaValueParameter extends JavaAnnotationOwner {
    @Nullable
    Name getName();

    @NotNull
    JavaType getType();

    boolean isVararg();
}
