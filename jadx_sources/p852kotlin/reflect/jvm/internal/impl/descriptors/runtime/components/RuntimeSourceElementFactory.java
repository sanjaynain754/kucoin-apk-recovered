package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import p852kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import p852kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

/* JADX INFO: compiled from: RuntimeSourceElementFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {

    @NotNull
    public static final RuntimeSourceElementFactory INSTANCE = new RuntimeSourceElementFactory();

    /* JADX INFO: compiled from: RuntimeSourceElementFactory.kt */
    public static final class RuntimeSourceElement implements JavaSourceElement {

        @NotNull
        private final ReflectJavaElement javaElement;

        @Override // p852kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        @NotNull
        public ReflectJavaElement getJavaElement() {
            return this.javaElement;
        }

        public RuntimeSourceElement(@NotNull ReflectJavaElement javaElement) {
            Intrinsics.checkNotNullParameter(javaElement, "javaElement");
            this.javaElement = javaElement;
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
            return RuntimeSourceElement.class.getName() + ": " + getJavaElement();
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    @NotNull
    public JavaSourceElement source(@NotNull JavaElement javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }

    private RuntimeSourceElementFactory() {
    }
}
