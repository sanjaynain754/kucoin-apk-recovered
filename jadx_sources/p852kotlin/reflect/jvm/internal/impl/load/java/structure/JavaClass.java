package p852kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    @NotNull
    Collection<JavaConstructor> getConstructors();

    @NotNull
    Collection<JavaField> getFields();

    @Nullable
    FqName getFqName();

    @NotNull
    Collection<Name> getInnerClassNames();

    @Nullable
    LightClassOriginKind getLightClassOriginKind();

    @NotNull
    Collection<JavaMethod> getMethods();

    @Nullable
    JavaClass getOuterClass();

    @NotNull
    Collection<JavaRecordComponent> getRecordComponents();

    @NotNull
    Collection<JavaClassifierType> getSupertypes();

    boolean hasDefaultConstructor();

    boolean isAnnotationType();

    boolean isEnum();

    boolean isInterface();

    boolean isRecord();

    boolean isSealed();
}
