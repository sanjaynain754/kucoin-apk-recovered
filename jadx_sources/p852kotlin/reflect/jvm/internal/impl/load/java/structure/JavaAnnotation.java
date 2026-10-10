package p852kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaAnnotation extends JavaElement {
    @NotNull
    Collection<JavaAnnotationArgument> getArguments();

    @Nullable
    ClassId getClassId();

    boolean isFreshlySupportedTypeUseAnnotation();

    boolean isIdeExternalAnnotation();

    @Nullable
    JavaClass resolve();
}
