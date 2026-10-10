package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InvalidModuleException.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class InvalidModuleExceptionKt {

    @NotNull
    private static final ModuleCapability<InvalidModuleNotifier> INVALID_MODULE_NOTIFIER_CAPABILITY = new ModuleCapability<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.getCapability(INVALID_MODULE_NOTIFIER_CAPABILITY);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.notifyModuleInvalidated(moduleDescriptor);
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
    }
}
