package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: ReflectJavaClassFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    @NotNull
    private final ClassLoader classLoader;

    public ReflectJavaClassFinder(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.classLoader = classLoader;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    public JavaClass findClass(@NotNull JavaClassFinder.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ClassId classId = request.getClassId();
        FqName packageFqName = classId.getPackageFqName();
        String strReplace$default = StringsKt.replace$default(classId.getRelativeClassName().asString(), '.', Typography.dollar, false, 4, (Object) null);
        if (!packageFqName.isRoot()) {
            strReplace$default = packageFqName.asString() + '.' + strReplace$default;
        }
        Class<?> clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, strReplace$default);
        if (clsTryLoadClass != null) {
            return new ReflectJavaClass(clsTryLoadClass);
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    public JavaPackage findPackage(@NotNull FqName fqName, boolean z11) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return new ReflectJavaPackage(fqName);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    public Set<String> knownClassNamesInPackage(@NotNull FqName packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return null;
    }
}
