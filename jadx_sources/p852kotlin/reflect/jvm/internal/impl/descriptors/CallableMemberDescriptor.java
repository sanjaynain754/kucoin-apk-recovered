package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes61.dex */
public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    @NotNull
    CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, Kind kind, boolean z11);

    @NotNull
    Kind getKind();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    CallableMemberDescriptor getOriginal();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    Collection<? extends CallableMemberDescriptor> getOverriddenDescriptors();

    void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> collection);
}
