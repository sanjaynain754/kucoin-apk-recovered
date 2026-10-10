package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: CloneableClassScope.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {

    @NotNull
    private static final Name CLONE_NAME;

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: CloneableClassScope.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Name getCLONE_NAME() {
            return CloneableClassScope.CLONE_NAME;
        }
    }

    static {
        Name nameIdentifier = Name.identifier("clone");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        CLONE_NAME = nameIdentifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(@NotNull StorageManager storageManager, @NotNull ClassDescriptor containingClass) {
        super(storageManager, containingClass);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @NotNull
    public List<FunctionDescriptor> computeDeclaredFunctions() {
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = SimpleFunctionDescriptorImpl.create(getContainingClass(), Annotations.Companion.getEMPTY(), CLONE_NAME, CallableMemberDescriptor.Kind.DECLARATION, SourceElement.NO_SOURCE);
        simpleFunctionDescriptorImplCreate.initialize((ReceiverParameterDescriptor) null, getContainingClass().getThisAsReceiverParameter(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), (KotlinType) DescriptorUtilsKt.getBuiltIns(getContainingClass()).getAnyType(), Modality.OPEN, DescriptorVisibilities.PROTECTED);
        return CollectionsKt.listOf(simpleFunctionDescriptorImplCreate);
    }
}
