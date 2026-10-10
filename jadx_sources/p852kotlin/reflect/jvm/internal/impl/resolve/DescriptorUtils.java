package p852kotlin.reflect.jvm.internal.impl.resolve;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes61.dex */
public class DescriptorUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final FqName JVM_NAME = new FqName("kotlin.jvm.JvmName");

    @Nullable
    public static ModuleDescriptor getContainingModuleOrNull(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(20);
        }
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor == null) {
            return null;
        }
        return getContainingModuleOrNull(classifierDescriptorMo105126getDeclarationDescriptor);
    }

    @Nullable
    public static <D extends DeclarationDescriptor> D getParentOfType(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull Class<D> cls) {
        if (cls == null) {
            $$$reportNull$$$0(18);
        }
        return (D) getParentOfType(declarationDescriptor, cls, true);
    }

    public static boolean isLocal(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        while (declarationDescriptor != null) {
            if (isAnonymousObject(declarationDescriptor) || isDescriptorWithLocalVisibility(declarationDescriptor)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean areInSameModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(16);
        }
        if (declarationDescriptor2 == null) {
            $$$reportNull$$$0(17);
        }
        return getContainingModule(declarationDescriptor).equals(getContainingModule(declarationDescriptor2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends CallableDescriptor> void collectAllOverriddenDescriptors(@NotNull D d11, @NotNull Set<D> set) {
        if (d11 == null) {
            $$$reportNull$$$0(72);
        }
        if (set == 0) {
            $$$reportNull$$$0(73);
        }
        if (set.contains(d11)) {
            return;
        }
        Iterator<? extends CallableDescriptor> it = d11.getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            CallableDescriptor original = it.next().getOriginal();
            collectAllOverriddenDescriptors(original, set);
            set.add(original);
        }
    }

    @NotNull
    public static <D extends CallableDescriptor> Set<D> getAllOverriddenDescriptors(@NotNull D d11) {
        if (d11 == null) {
            $$$reportNull$$$0(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        collectAllOverriddenDescriptors(d11.getOriginal(), linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static ClassDescriptor getClassDescriptorForType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(45);
        }
        return getClassDescriptorForTypeConstructor(kotlinType.getConstructor());
    }

    @NotNull
    public static ClassDescriptor getClassDescriptorForTypeConstructor(@NotNull TypeConstructor typeConstructor) {
        if (typeConstructor == null) {
            $$$reportNull$$$0(46);
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) typeConstructor.mo105126getDeclarationDescriptor();
        if (classDescriptor == null) {
            $$$reportNull$$$0(47);
        }
        return classDescriptor;
    }

    @NotNull
    public static ModuleDescriptor getContainingModule(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(21);
        }
        ModuleDescriptor containingModuleOrNull = getContainingModuleOrNull(declarationDescriptor);
        if (containingModuleOrNull == null) {
            $$$reportNull$$$0(22);
        }
        return containingModuleOrNull;
    }

    @NotNull
    public static SourceFile getContainingSourceFile(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(81);
        }
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).getCorrespondingProperty();
        }
        if (declarationDescriptor instanceof DeclarationDescriptorWithSource) {
            SourceFile containingFile = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile();
            if (containingFile == null) {
                $$$reportNull$$$0(82);
            }
            return containingFile;
        }
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        if (sourceFile == null) {
            $$$reportNull$$$0(83);
        }
        return sourceFile;
    }

    @NotNull
    public static DescriptorVisibility getDefaultConstructorVisibility(@NotNull ClassDescriptor classDescriptor, boolean z11) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(48);
        }
        ClassKind kind = classDescriptor.getKind();
        if (kind == ClassKind.ENUM_CLASS || kind.isSingleton()) {
            DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PRIVATE;
            if (descriptorVisibility == null) {
                $$$reportNull$$$0(49);
            }
            return descriptorVisibility;
        }
        if (isSealedClass(classDescriptor)) {
            if (z11) {
                DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.PROTECTED;
                if (descriptorVisibility2 == null) {
                    $$$reportNull$$$0(50);
                }
                return descriptorVisibility2;
            }
            DescriptorVisibility descriptorVisibility3 = DescriptorVisibilities.PRIVATE;
            if (descriptorVisibility3 == null) {
                $$$reportNull$$$0(51);
            }
            return descriptorVisibility3;
        }
        if (isAnonymousObject(classDescriptor)) {
            DescriptorVisibility descriptorVisibility4 = DescriptorVisibilities.DEFAULT_VISIBILITY;
            if (descriptorVisibility4 == null) {
                $$$reportNull$$$0(52);
            }
            return descriptorVisibility4;
        }
        DescriptorVisibility descriptorVisibility5 = DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility5 == null) {
            $$$reportNull$$$0(53);
        }
        return descriptorVisibility5;
    }

    @Nullable
    public static ReceiverParameterDescriptor getDispatchReceiverParameterIfNeeded(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) declarationDescriptor).getThisAsReceiverParameter();
        }
        return null;
    }

    @NotNull
    public static FqNameUnsafe getFqName(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        FqName fqNameSafeIfPossible = getFqNameSafeIfPossible(declarationDescriptor);
        return fqNameSafeIfPossible != null ? fqNameSafeIfPossible.toUnsafe() : getFqNameUnsafe(declarationDescriptor);
    }

    @NotNull
    public static FqName getFqNameSafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(3);
        }
        FqName fqNameSafeIfPossible = getFqNameSafeIfPossible(declarationDescriptor);
        if (fqNameSafeIfPossible == null) {
            fqNameSafeIfPossible = getFqNameUnsafe(declarationDescriptor).toSafe();
        }
        if (fqNameSafeIfPossible == null) {
            $$$reportNull$$$0(4);
        }
        return fqNameSafeIfPossible;
    }

    @Nullable
    private static FqName getFqNameSafeIfPossible(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(5);
        }
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.isError(declarationDescriptor)) {
            return FqName.ROOT;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).getFqName();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).getFqName();
        }
        return null;
    }

    @NotNull
    private static FqNameUnsafe getFqNameUnsafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(6);
        }
        FqNameUnsafe fqNameUnsafeChild = getFqName(declarationDescriptor.getContainingDeclaration()).child(declarationDescriptor.getName());
        if (fqNameUnsafeChild == null) {
            $$$reportNull$$$0(7);
        }
        return fqNameUnsafeChild;
    }

    @Nullable
    public static <D extends DeclarationDescriptor> D getParentOfType(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull Class<D> cls, boolean z11) {
        if (cls == null) {
            $$$reportNull$$$0(19);
        }
        if (declarationDescriptor == null) {
            return null;
        }
        if (z11) {
            declarationDescriptor = (D) declarationDescriptor.getContainingDeclaration();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return (D) declarationDescriptor;
            }
            declarationDescriptor = (D) declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }

    @Nullable
    public static ClassDescriptor getSuperClassDescriptor(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(44);
        }
        Iterator<KotlinType> it = classDescriptor.getTypeConstructor().mo105127getSupertypes().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorForType = getClassDescriptorForType(it.next());
            if (classDescriptorForType.getKind() != ClassKind.INTERFACE) {
                return classDescriptorForType;
            }
        }
        return null;
    }

    public static boolean isAnnotationClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean isAnonymousObject(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(34);
        }
        return isClass(declarationDescriptor) && declarationDescriptor.getName().equals(SpecialNames.NO_NAME_PROVIDED);
    }

    public static boolean isClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.CLASS);
    }

    public static boolean isCompanionObject(@Nullable DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.OBJECT) && ((ClassDescriptor) declarationDescriptor).isCompanionObject();
    }

    public static boolean isDescriptorWithLocalVisibility(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == DescriptorVisibilities.LOCAL;
    }

    public static boolean isDirectSubclass(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(26);
        }
        if (classDescriptor2 == null) {
            $$$reportNull$$$0(27);
        }
        Iterator<KotlinType> it = classDescriptor.getTypeConstructor().mo105127getSupertypes().iterator();
        while (it.hasNext()) {
            if (isSameClass(it.next(), classDescriptor2.getOriginal())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEnumClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.ENUM_CLASS);
    }

    public static boolean isEnumEntry(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(36);
        }
        return isKindOf(declarationDescriptor, ClassKind.ENUM_ENTRY);
    }

    public static boolean isInterface(@Nullable DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.INTERFACE);
    }

    private static boolean isKindOf(@Nullable DeclarationDescriptor declarationDescriptor, @NotNull ClassKind classKind) {
        if (classKind == null) {
            $$$reportNull$$$0(37);
        }
        return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).getKind() == classKind;
    }

    private static boolean isSameClass(@NotNull KotlinType kotlinType, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            $$$reportNull$$$0(30);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(31);
        }
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor == null) {
            return false;
        }
        DeclarationDescriptor original = classifierDescriptorMo105126getDeclarationDescriptor.getOriginal();
        return (original instanceof ClassifierDescriptor) && (declarationDescriptor instanceof ClassifierDescriptor) && ((ClassifierDescriptor) declarationDescriptor).getTypeConstructor().equals(((ClassifierDescriptor) original).getTypeConstructor());
    }

    public static boolean isSealedClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return (isKindOf(declarationDescriptor, ClassKind.CLASS) || isKindOf(declarationDescriptor, ClassKind.INTERFACE)) && ((ClassDescriptor) declarationDescriptor).getModality() == Modality.SEALED;
    }

    public static boolean isSubclass(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(28);
        }
        if (classDescriptor2 == null) {
            $$$reportNull$$$0(29);
        }
        return isSubtypeOfClass(classDescriptor.getDefaultType(), classDescriptor2.getOriginal());
    }

    public static boolean isSubtypeOfClass(@NotNull KotlinType kotlinType, @NotNull DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            $$$reportNull$$$0(32);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(33);
        }
        if (isSameClass(kotlinType, declarationDescriptor)) {
            return true;
        }
        Iterator<KotlinType> it = kotlinType.getConstructor().mo105127getSupertypes().iterator();
        while (it.hasNext()) {
            if (isSubtypeOfClass(it.next(), declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTopLevelDeclaration(@Nullable DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor);
    }

    public static boolean shouldRecordInitializerForProperty(@NotNull VariableDescriptor variableDescriptor, @NotNull KotlinType kotlinType) {
        if (variableDescriptor == null) {
            $$$reportNull$$$0(65);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(66);
        }
        if (variableDescriptor.isVar() || KotlinTypeKt.isError(kotlinType)) {
            return false;
        }
        if (TypeUtils.acceptsNullable(kotlinType)) {
            return true;
        }
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(variableDescriptor);
        if (!KotlinBuiltIns.isPrimitiveType(kotlinType)) {
            KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
            if (!kotlinTypeChecker.equalTypes(builtIns.getStringType(), kotlinType) && !kotlinTypeChecker.equalTypes(builtIns.getNumber().getDefaultType(), kotlinType) && !kotlinTypeChecker.equalTypes(builtIns.getAnyType(), kotlinType) && !UnsignedTypes.isUnsignedType(kotlinType)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static <D extends CallableMemberDescriptor> D unwrapFakeOverride(@NotNull D d11) {
        if (d11 == null) {
            $$$reportNull$$$0(58);
        }
        while (d11.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = d11.getOverriddenDescriptors();
            if (overriddenDescriptors.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d11);
            }
            d11 = (D) overriddenDescriptors.iterator().next();
        }
        return d11;
    }

    @NotNull
    public static <D extends DeclarationDescriptorWithVisibility> D unwrapFakeOverrideToAnyDeclaration(@NotNull D d11) {
        if (d11 == null) {
            $$$reportNull$$$0(63);
        }
        if (d11 instanceof CallableMemberDescriptor) {
            return unwrapFakeOverride((CallableMemberDescriptor) d11);
        }
        if (d11 == null) {
            $$$reportNull$$$0(64);
        }
        return d11;
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = FirebaseAnalytics.Param.LOCATION;
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = DbParams.KEY_CHANNEL_RESULT;
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i11) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private DescriptorUtils() {
    }

    @Nullable
    public static ModuleDescriptor getContainingModuleOrNull(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(23);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).getModule();
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }

    public static boolean isClassOrEnumClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (!isClass(declarationDescriptor) && !isEnumClass(declarationDescriptor)) {
            return false;
        }
        return true;
    }
}
