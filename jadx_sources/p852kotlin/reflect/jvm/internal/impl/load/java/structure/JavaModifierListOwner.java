package p852kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: compiled from: javaElements.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaModifierListOwner extends JavaElement {
    @NotNull
    Visibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isStatic();
}
