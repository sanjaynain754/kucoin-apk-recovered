package p852kotlin.reflect.jvm.internal.impl.resolve;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: compiled from: ResolutionAnchorProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ResolutionAnchorProvider {
    @Nullable
    ModuleDescriptor getResolutionAnchor(@NotNull ModuleDescriptor moduleDescriptor);
}
