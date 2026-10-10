package p852kotlin.reflect.jvm.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: typeOfImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\t"}, m90084d2 = {"createPlatformKType", "Lkotlin/reflect/KType;", "lowerBound", "upperBound", "createMutableCollectionKType", "type", "readOnlyToMutable", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "createNothingType", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\ntypeOfImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeOfImpl.kt\nkotlin/reflect/jvm/internal/TypeOfImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class TypeOfImplKt {
    @NotNull
    public static final KType createPlatformKType(@NotNull KType lowerBound, @NotNull KType upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        KotlinType type = ((KTypeImpl) lowerBound).getType();
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType type2 = ((KTypeImpl) upperBound).getType();
        Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new KTypeImpl(KotlinTypeFactory.flexibleType((SimpleType) type, (SimpleType) type2), null, 2, null);
    }

    private static final ClassDescriptor readOnlyToMutable(ClassDescriptor classDescriptor) {
        FqName onlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
        if (onlyToMutable != null) {
            ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(classDescriptor).getBuiltInClassByFqName(onlyToMutable);
            Intrinsics.checkNotNullExpressionValue(builtInClassByFqName, "getBuiltInClassByFqName(...)");
            return builtInClassByFqName;
        }
        throw new IllegalArgumentException("Not a readonly collection: " + classDescriptor);
    }

    @NotNull
    public static final KType createMutableCollectionKType(@NotNull KType type) {
        ClassDescriptor classDescriptor;
        Intrinsics.checkNotNullParameter(type, "type");
        KotlinType type2 = ((KTypeImpl) type).getType();
        if (type2 instanceof SimpleType) {
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = type2.getConstructor().mo105126getDeclarationDescriptor();
            if (classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor) {
                classDescriptor = (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor;
            } else {
                classDescriptor = null;
            }
            if (classDescriptor != null) {
                SimpleType simpleType = (SimpleType) type2;
                TypeConstructor typeConstructor = readOnlyToMutable(classDescriptor).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
                return new KTypeImpl(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null, 2, null);
            }
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
    }

    @NotNull
    public static final KType createNothingType(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KotlinType type2 = ((KTypeImpl) type).getType();
        if (type2 instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) type2;
            TypeConstructor typeConstructor = TypeUtilsKt.getBuiltIns(type2).getNothing().getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
            return new KTypeImpl(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null, 2, null);
        }
        throw new IllegalArgumentException(("Non-simple type cannot be a Nothing type: " + type).toString());
    }
}
