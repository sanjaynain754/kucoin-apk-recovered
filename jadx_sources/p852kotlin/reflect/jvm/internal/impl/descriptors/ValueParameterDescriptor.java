package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: ValueParameterDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    /* JADX INFO: compiled from: ValueParameterDescriptor.kt */
    public static final class DefaultImpls {
        public static boolean isLateInit(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
            return false;
        }
    }

    @NotNull
    ValueParameterDescriptor copy(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i11);

    boolean declaresDefaultValue();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    CallableDescriptor getContainingDeclaration();

    int getIndex();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ValueParameterDescriptor getOriginal();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    Collection<ValueParameterDescriptor> getOverriddenDescriptors();

    @Nullable
    KotlinType getVarargElementType();

    boolean isCrossinline();

    boolean isNoinline();
}
