package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: ClassifierBasedTypeConstructor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nClassifierBasedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassifierBasedTypeConstructor.kt\norg/jetbrains/kotlin/types/ClassifierBasedTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {
    private int hashCode;

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo105126getDeclarationDescriptor();

    public abstract boolean isSameClassifier(@NotNull ClassifierDescriptor classifierDescriptor);

    public final boolean areFqNamesEqual(@NotNull ClassifierDescriptor first, @NotNull ClassifierDescriptor second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (!Intrinsics.areEqual(first.getName(), second.getName())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = first.getContainingDeclaration();
        for (DeclarationDescriptor containingDeclaration2 = second.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof ModuleDescriptor) {
                return containingDeclaration2 instanceof ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof PackageFragmentDescriptor) && Intrinsics.areEqual(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !Intrinsics.areEqual(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = mo105126getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor2 = typeConstructor.mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor2 != null && hasMeaningfulFqName(classifierDescriptorMo105126getDeclarationDescriptor) && hasMeaningfulFqName(classifierDescriptorMo105126getDeclarationDescriptor2)) {
            return isSameClassifier(classifierDescriptorMo105126getDeclarationDescriptor2);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = mo105126getDeclarationDescriptor();
        int iHashCode = hasMeaningfulFqName(classifierDescriptorMo105126getDeclarationDescriptor) ? DescriptorUtils.getFqName(classifierDescriptorMo105126getDeclarationDescriptor).hashCode() : System.identityHashCode(this);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    private final boolean hasMeaningfulFqName(ClassifierDescriptor classifierDescriptor) {
        if (!ErrorUtils.isError(classifierDescriptor) && !DescriptorUtils.isLocal(classifierDescriptor)) {
            return true;
        }
        return false;
    }
}
