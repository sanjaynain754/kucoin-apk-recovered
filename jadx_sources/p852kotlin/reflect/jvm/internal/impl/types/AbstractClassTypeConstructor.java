package p852kotlin.reflect.jvm.internal.impl.types;

import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 1 || i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 3 || i11 == 4) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i11 == 2) {
            objArr[0] = DocumentClassifier.KEY_SIDE;
        } else if (i11 == 3 || i11 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i11 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i11 == 3 || i11 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i11 != 1) {
            if (i11 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i11 != 3 && i11 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i11 != 1 && i11 != 3 && i11 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassDescriptor mo105126getDeclarationDescriptor();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(@NotNull StorageManager storageManager) {
        super(storageManager);
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    public boolean isSameClassifier(@NotNull ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        return (classifierDescriptor instanceof ClassDescriptor) && areFqNamesEqual(mo105126getDeclarationDescriptor(), classifierDescriptor);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(mo105126getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z11) {
        DeclarationDescriptor containingDeclaration = mo105126getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                $$$reportNull$$$0(3);
            }
            return list;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        ClassDescriptor classDescriptorMo105115getCompanionObjectDescriptor = classDescriptor.mo105115getCompanionObjectDescriptor();
        if (z11 && classDescriptorMo105115getCompanionObjectDescriptor != null) {
            smartList.add(classDescriptorMo105115getCompanionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(mo105126getDeclarationDescriptor());
        if (builtIns == null) {
            $$$reportNull$$$0(1);
        }
        return builtIns;
    }
}
