package p852kotlin.reflect.jvm.internal.impl.types.error;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: ErrorClassDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ErrorClassDescriptor extends ClassDescriptorImpl {
    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public ClassDescriptor substitute(@NotNull TypeSubstitutor substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ErrorClassDescriptor(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ErrorUtils errorUtils = ErrorUtils.INSTANCE;
        ModuleDescriptor errorModule = errorUtils.getErrorModule();
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        List listEmptyList = CollectionsKt.emptyList();
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        super(errorModule, name, modality, classKind, listEmptyList, sourceElement, false, LockBasedStorageManager.NO_LOCKS);
        ClassConstructorDescriptorImpl classConstructorDescriptorImplCreate = ClassConstructorDescriptorImpl.create(this, Annotations.Companion.getEMPTY(), true, sourceElement);
        classConstructorDescriptorImplCreate.initialize(CollectionsKt.emptyList(), DescriptorVisibilities.INTERNAL);
        Intrinsics.checkNotNullExpressionValue(classConstructorDescriptorImplCreate, "apply(...)");
        MemberScope memberScopeCreateErrorScope = ErrorUtils.createErrorScope(ErrorScopeKind.SCOPE_FOR_ERROR_CLASS, classConstructorDescriptorImplCreate.getName().toString(), "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        classConstructorDescriptorImplCreate.setReturnType(new ErrorType(errorUtils.createErrorTypeConstructor(errorTypeKind, new String[0]), memberScopeCreateErrorScope, errorTypeKind, null, false, new String[0], 24, null));
        initialize(memberScopeCreateErrorScope, SetsKt.setOf(classConstructorDescriptorImplCreate), classConstructorDescriptorImplCreate);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ErrorUtils.createErrorScope(ErrorScopeKind.SCOPE_FOR_ERROR_CLASS, getName().toString(), typeSubstitution.toString());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
    @NotNull
    public String toString() {
        String strAsString = getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }
}
