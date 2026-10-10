package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* JADX INFO: compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    @NotNull
    private final LazyJavaPackageFragment packageFragment;

    public KotlinJvmBinaryPackageSourceElement(@NotNull LazyJavaPackageFragment packageFragment) {
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.packageFragment = packageFragment;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @NotNull
    public String toString() {
        return this.packageFragment + ": " + this.packageFragment.getBinaryClasses$descriptors_jvm().keySet();
    }
}
