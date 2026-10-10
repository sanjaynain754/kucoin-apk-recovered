package p852kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: JavaModuleAnnotationsProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaModuleAnnotationsProvider {
    @Nullable
    List<JavaAnnotation> getAnnotationsForModuleOwnerOfClass(@NotNull ClassId classId);
}
