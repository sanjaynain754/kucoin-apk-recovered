package p852kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaPackage extends JavaAnnotationOwner {
    @NotNull
    Collection<JavaClass> getClasses(@NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    FqName getFqName();

    @NotNull
    Collection<JavaPackage> getSubPackages();
}
