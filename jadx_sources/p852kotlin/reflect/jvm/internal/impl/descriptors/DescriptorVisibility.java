package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* JADX INFO: compiled from: DescriptorVisibility.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class DescriptorVisibility {
    @NotNull
    public abstract Visibility getDelegate();

    @NotNull
    public abstract String getInternalDisplayName();

    public abstract boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z11);

    @NotNull
    public abstract DescriptorVisibility normalize();

    @Nullable
    public final Integer compareTo(@NotNull DescriptorVisibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return getDelegate().compareTo(visibility.getDelegate());
    }

    public final boolean isPublicAPI() {
        return getDelegate().isPublicAPI();
    }

    @NotNull
    public final String toString() {
        return getDelegate().toString();
    }
}
