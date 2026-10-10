package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DescriptorVisibility.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    @NotNull
    private final Visibility delegate;

    public DelegatedDescriptorVisibility(@NotNull Visibility delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public Visibility getDelegate() {
        return this.delegate;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public String getInternalDisplayName() {
        return getDelegate().getInternalDisplayName();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public DescriptorVisibility normalize() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.toDescriptorVisibility(getDelegate().normalize());
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "toDescriptorVisibility(...)");
        return descriptorVisibility;
    }
}
