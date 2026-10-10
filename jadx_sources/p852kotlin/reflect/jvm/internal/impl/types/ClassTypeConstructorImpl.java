package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes61.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor {
    private final ClassDescriptor classDescriptor;
    private final List<TypeParameterDescriptor> parameters;
    private final Collection<KotlinType> supertypes;

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getParameters";
        } else if (i11 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i11 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i11 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(@NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull Collection<KotlinType> collection, @NotNull StorageManager storageManager) {
        super(storageManager);
        if (classDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (list == null) {
            $$$reportNull$$$0(1);
        }
        if (collection == null) {
            $$$reportNull$$$0(2);
        }
        if (storageManager == null) {
            $$$reportNull$$$0(3);
        }
        this.classDescriptor = classDescriptor;
        this.parameters = Collections.unmodifiableList(new ArrayList(list));
        this.supertypes = Collections.unmodifiableCollection(collection);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public Collection<KotlinType> computeSupertypes() {
        Collection<KotlinType> collection = this.supertypes;
        if (collection == null) {
            $$$reportNull$$$0(6);
        }
        return collection;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, p852kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassDescriptor mo105126getDeclarationDescriptor() {
        ClassDescriptor classDescriptor = this.classDescriptor;
        if (classDescriptor == null) {
            $$$reportNull$$$0(5);
        }
        return classDescriptor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        List<TypeParameterDescriptor> list = this.parameters;
        if (list == null) {
            $$$reportNull$$$0(4);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    public SupertypeLoopChecker getSupertypeLoopChecker() {
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        if (empty == null) {
            $$$reportNull$$$0(7);
        }
        return empty;
    }

    public String toString() {
        return DescriptorUtils.getFqName(this.classDescriptor).asString();
    }
}
