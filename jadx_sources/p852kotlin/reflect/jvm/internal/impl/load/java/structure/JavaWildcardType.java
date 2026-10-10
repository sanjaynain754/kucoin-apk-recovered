package p852kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: javaTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaWildcardType extends JavaType {
    @Nullable
    JavaType getBound();

    boolean isExtends();
}
