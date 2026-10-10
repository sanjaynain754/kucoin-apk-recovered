package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: findClassInModule.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
public final class FindClassInModuleKt {
    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    @Nullable
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier = packageViewDescriptor.getMemberScope().mo105128getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo105128getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo105128getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier2 = ((ClassDescriptor) classifierDescriptorMo105128getContributedClassifier).getUnsubstitutedInnerClassesScope().mo105128getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo105128getContributedClassifier = classifierDescriptorMo105128getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105128getContributedClassifier2 : null;
                if (classifierDescriptorMo105128getContributedClassifier == null) {
                    return null;
                }
            }
            return classifierDescriptorMo105128getContributedClassifier;
        }
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier3 = packageViewDescriptor2.getMemberScope().mo105128getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments2), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo105128getContributedClassifier3 == null) {
            classifierDescriptorMo105128getContributedClassifier3 = null;
            break;
        }
        for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
            if (classifierDescriptorMo105128getContributedClassifier3 instanceof ClassDescriptor) {
                ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier4 = ((ClassDescriptor) classifierDescriptorMo105128getContributedClassifier3).getUnsubstitutedInnerClassesScope().mo105128getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo105128getContributedClassifier3 = classifierDescriptorMo105128getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105128getContributedClassifier4 : null;
                if (classifierDescriptorMo105128getContributedClassifier3 != null) {
                }
            }
            classifierDescriptorMo105128getContributedClassifier3 = null;
        }
        if (classifierDescriptorMo105128getContributedClassifier3 != null) {
            return classifierDescriptorMo105128getContributedClassifier3;
        }
        PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier5 = packageViewDescriptor3.getMemberScope().mo105128getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments3), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo105128getContributedClassifier5 == null) {
            return null;
        }
        for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
            if (!(classifierDescriptorMo105128getContributedClassifier5 instanceof ClassDescriptor)) {
                return null;
            }
            ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier6 = ((ClassDescriptor) classifierDescriptorMo105128getContributedClassifier5).getUnsubstitutedInnerClassesScope().mo105128getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
            classifierDescriptorMo105128getContributedClassifier5 = classifierDescriptorMo105128getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105128getContributedClassifier6 : null;
            if (classifierDescriptorMo105128getContributedClassifier5 == null) {
                return null;
            }
        }
        return classifierDescriptorMo105128getContributedClassifier5;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt.toList(SequencesKt.map(SequencesKt.generateSequence(classId, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Integer.valueOf(FindClassInModuleKt.findNonGenericClassAcrossDependencies$lambda$1((ClassId) obj));
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findNonGenericClassAcrossDependencies$lambda$1(ClassId it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 0;
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
