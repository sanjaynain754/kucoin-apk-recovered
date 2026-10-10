package p852kotlin.reflect.jvm.internal.impl.load.java.sources;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

/* JADX INFO: compiled from: JavaSourceElementFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaSourceElement extends SourceElement {
    @NotNull
    JavaElement getJavaElement();
}
