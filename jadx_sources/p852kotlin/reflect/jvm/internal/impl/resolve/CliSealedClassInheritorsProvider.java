package p852kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;

/* JADX INFO: compiled from: SealedClassInheritorsProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nSealedClassInheritorsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n183#2,2:87\n1056#3:89\n*S KotlinDebug\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n*L\n73#1:87,2\n82#1:89\n*E\n"})
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {

    @NotNull
    public static final CliSealedClassInheritorsProvider INSTANCE = new CliSealedClassInheritorsProvider();

    private static final void computeSealedSubclasses$collectSubclasses(ClassDescriptor classDescriptor, LinkedHashSet<ClassDescriptor> linkedHashSet, MemberScope memberScope, boolean z11) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor2.isExpect()) {
                    Name name = classDescriptor2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier = memberScope.mo105128getContributedClassifier(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    classDescriptor2 = classifierDescriptorMo105128getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105128getContributedClassifier : classifierDescriptorMo105128getContributedClassifier instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorMo105128getContributedClassifier).getClassDescriptor() : null;
                }
                if (classDescriptor2 != null) {
                    if (DescriptorUtils.isDirectSubclass(classDescriptor2, classDescriptor)) {
                        linkedHashSet.add(classDescriptor2);
                    }
                    if (z11) {
                        MemberScope unsubstitutedInnerClassesScope = classDescriptor2.getUnsubstitutedInnerClassesScope();
                        Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
                        computeSealedSubclasses$collectSubclasses(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, z11);
                    }
                }
            }
        }
    }

    @NotNull
    public Collection<ClassDescriptor> computeSealedSubclasses(@NotNull ClassDescriptor sealedClass, boolean z11) {
        DeclarationDescriptor next;
        DeclarationDescriptor containingDeclaration;
        Intrinsics.checkNotNullParameter(sealedClass, "sealedClass");
        if (sealedClass.getModality() != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z11) {
            Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.getParents(sealedClass).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof PackageFragmentDescriptor));
            containingDeclaration = next;
        } else {
            containingDeclaration = sealedClass.getContainingDeclaration();
        }
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            computeSealedSubclasses$collectSubclasses(sealedClass, linkedHashSet, ((PackageFragmentDescriptor) containingDeclaration).getMemberScope(), z11);
        }
        MemberScope unsubstitutedInnerClassesScope = sealedClass.getUnsubstitutedInnerClassesScope();
        Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
        computeSealedSubclasses$collectSubclasses(sealedClass, linkedHashSet, unsubstitutedInnerClassesScope, true);
        return CollectionsKt.sortedWith(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return ComparisonsKt.compareValues(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t11).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t12).asString());
            }
        });
    }

    private CliSealedClassInheritorsProvider() {
    }
}
