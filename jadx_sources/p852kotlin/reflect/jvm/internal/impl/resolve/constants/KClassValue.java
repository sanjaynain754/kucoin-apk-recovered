package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KClassValue extends ConstantValue<Value> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final ConstantValue<?> create(@NotNull KotlinType argumentType) {
            Intrinsics.checkNotNullParameter(argumentType, "argumentType");
            if (KotlinTypeKt.isError(argumentType)) {
                return null;
            }
            KotlinType type = argumentType;
            int i11 = 0;
            while (KotlinBuiltIns.isArray(type)) {
                type = ((TypeProjection) CollectionsKt.single((List) type.getArguments())).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                i11++;
            }
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = type.getConstructor().mo105126getDeclarationDescriptor();
            if (classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor) {
                ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptorMo105126getDeclarationDescriptor);
                return classId == null ? new KClassValue(new Value.LocalClass(argumentType)) : new KClassValue(classId, i11);
            }
            if (classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                return new KClassValue(ClassId.Companion.topLevel(StandardNames.FqNames.any.toSafe()), 0);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static abstract class Value {

        /* JADX INFO: compiled from: constantValues.kt */
        public static final class LocalClass extends Value {

            @NotNull
            private final KotlinType type;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.areEqual(this.type, ((LocalClass) obj).type);
            }

            @NotNull
            public final KotlinType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            @NotNull
            public String toString() {
                return "LocalClass(type=" + this.type + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(@NotNull KotlinType type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
            }
        }

        /* JADX INFO: compiled from: constantValues.kt */
        public static final class NormalClass extends Value {

            @NotNull
            private final ClassLiteralValue value;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.areEqual(this.value, ((NormalClass) obj).value);
            }

            public final int getArrayDimensions() {
                return this.value.getArrayNestedness();
            }

            @NotNull
            public final ClassId getClassId() {
                return this.value.getClassId();
            }

            @NotNull
            public final ClassLiteralValue getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return "NormalClass(value=" + this.value + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(@NotNull ClassLiteralValue value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        public /* synthetic */ Value(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Value() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull Value value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull ClassLiteralValue value) {
        this(new Value.NormalClass(value));
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @NotNull
    public final KotlinType getArgumentType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Value value = getValue();
        if (value instanceof Value.LocalClass) {
            return ((Value.LocalClass) getValue()).getType();
        }
        if (!(value instanceof Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        ClassLiteralValue value2 = ((Value.NormalClass) getValue()).getValue();
        ClassId classIdComponent1 = value2.component1();
        int iComponent2 = value2.component2();
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, classIdComponent1);
        if (classDescriptorFindClassAcrossModuleDependencies == null) {
            return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, classIdComponent1.toString(), String.valueOf(iComponent2));
        }
        SimpleType defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        KotlinType kotlinTypeReplaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
        for (int i11 = 0; i11 < iComponent2; i11++) {
            kotlinTypeReplaceArgumentsWithStarProjections = module.getBuiltIns().getArrayType(Variance.INVARIANT, kotlinTypeReplaceArgumentsWithStarProjections);
            Intrinsics.checkNotNullExpressionValue(kotlinTypeReplaceArgumentsWithStarProjections, "getArrayType(...)");
        }
        return kotlinTypeReplaceArgumentsWithStarProjections;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        TypeAttributes empty = TypeAttributes.Companion.getEmpty();
        ClassDescriptor kClass = module.getBuiltIns().getKClass();
        Intrinsics.checkNotNullExpressionValue(kClass, "getKClass(...)");
        return KotlinTypeFactory.simpleNotNullType(empty, kClass, CollectionsKt.listOf(new TypeProjectionImpl(getArgumentType(module))));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(@NotNull ClassId classId, int i11) {
        this(new ClassLiteralValue(classId, i11));
        Intrinsics.checkNotNullParameter(classId, "classId");
    }
}
