package p852kotlin.reflect.jvm.internal.impl.resolve;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: compiled from: StdlibClassFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface StdlibClassFinder {
    @Nullable
    ClassDescriptor findEnumEntriesClass(@NotNull ModuleDescriptor moduleDescriptor);
}
