package p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: ClassDescriptorFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ClassDescriptorFactory {
    @Nullable
    ClassDescriptor createClass(@NotNull ClassId classId);

    @NotNull
    Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName fqName);

    boolean shouldCreateClass(@NotNull FqName fqName, @NotNull Name name);
}
