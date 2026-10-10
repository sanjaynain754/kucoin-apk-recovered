package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\ntypeParameterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n+ 2 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n16#2,2:101\n1563#3:103\n1634#3,3:104\n*S KotlinDebug\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n*L\n37#1:101,2\n42#1:103\n42#1:104,3\n*E\n"})
public final class TypeParameterUtilsKt {
    @Nullable
    public static final PossiblyInnerType buildPossiblyInnerType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        return buildPossiblyInnerType(kotlinType, classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo105126getDeclarationDescriptor : null, 0);
    }

    private static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i11) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.isError(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i11;
        if (classifierDescriptorWithTypeParameters.isInner()) {
            List<TypeProjection> listSubList = kotlinType.getArguments().subList(i11, size);
            DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, buildPossiblyInnerType(kotlinType, containingDeclaration instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) containingDeclaration : null, size));
        }
        if (size != kotlinType.getArguments().size()) {
            DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i11, kotlinType.getArguments().size()), null);
    }

    private static final CapturedTypeParameterDescriptor capturedCopyForInnerDeclaration(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i11) {
        return new CapturedTypeParameterDescriptor(typeParameterDescriptor, declarationDescriptor, i11);
    }

    @NotNull
    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> listEmptyList;
        DeclarationDescriptor next;
        TypeConstructor typeConstructor;
        Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters, "<this>");
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        List list = SequencesKt.toList(SequencesKt.flatMap(SequencesKt.filter(SequencesKt.takeWhile(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(TypeParameterUtilsKt.computeConstructorTypeParameters$lambda$0((DeclarationDescriptor) obj));
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(TypeParameterUtilsKt.computeConstructorTypeParameters$lambda$1((DeclarationDescriptor) obj));
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$$Lambda$2
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return TypeParameterUtilsKt.computeConstructorTypeParameters$lambda$2((DeclarationDescriptor) obj);
            }
        }));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        do {
            listEmptyList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof ClassDescriptor));
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            listEmptyList = typeConstructor.getParameters();
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (list.isEmpty() && listEmptyList.isEmpty()) {
            List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
            Intrinsics.checkNotNullExpressionValue(declaredTypeParameters2, "getDeclaredTypeParameters(...)");
            return declaredTypeParameters2;
        }
        List<TypeParameterDescriptor> listPlus = CollectionsKt.plus((Collection) list, (Iterable) listEmptyList);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : listPlus) {
            Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(capturedCopyForInnerDeclaration(typeParameterDescriptor, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return CollectionsKt.plus((Collection) declaredTypeParameters, (Iterable) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeConstructorTypeParameters$lambda$0(DeclarationDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof CallableDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeConstructorTypeParameters$lambda$1(DeclarationDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !(it instanceof ConstructorDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence computeConstructorTypeParameters$lambda$2(DeclarationDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return CollectionsKt.asSequence(typeParameters);
    }
}
