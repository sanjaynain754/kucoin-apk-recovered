package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {

    @Nullable
    private final DeserializedContainerSource containerSource;

    @NotNull
    private final NameResolver nameResolver;

    @NotNull
    private final ProtoBuf.Constructor proto;

    @NotNull
    private final TypeTable typeTable;

    @NotNull
    private final VersionRequirementTable versionRequirementTable;

    public /* synthetic */ DeserializedClassConstructorDescriptor(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z11, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor constructor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, constructorDescriptor, annotations, z11, kind, constructor, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i11 & 1024) != 0 ? null : sourceElement);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassConstructorDescriptor(@NotNull ClassDescriptor containingDeclaration, @Nullable ConstructorDescriptor constructorDescriptor, @NotNull Annotations annotations, boolean z11, @NotNull CallableMemberDescriptor.Kind kind, @NotNull ProtoBuf.Constructor proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable SourceElement sourceElement) {
        super(containingDeclaration, constructorDescriptor, annotations, z11, kind, sourceElement == null ? SourceElement.NO_SOURCE : sourceElement);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.proto = proto;
        this.nameResolver = nameResolver;
        this.typeTable = typeTable;
        this.versionRequirementTable = versionRequirementTable;
        this.containerSource = deserializedContainerSource;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @Nullable
    public DeserializedContainerSource getContainerSource() {
        return this.containerSource;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public ProtoBuf.Constructor getProto() {
        return this.proto;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    @NotNull
    public TypeTable getTypeTable() {
        return this.typeTable;
    }

    @NotNull
    public VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public DeserializedClassConstructorDescriptor createSubstitutedCopy(@NotNull DeclarationDescriptor newOwner, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor((ClassDescriptor) newOwner, (ConstructorDescriptor) functionDescriptor, annotations, this.isPrimary, kind, getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource(), source);
        deserializedClassConstructorDescriptor.setHasStableParameterNames(hasStableParameterNames());
        return deserializedClassConstructorDescriptor;
    }
}
