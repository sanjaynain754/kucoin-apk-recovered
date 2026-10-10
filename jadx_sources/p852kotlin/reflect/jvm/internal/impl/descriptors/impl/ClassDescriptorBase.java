package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes61.dex */
public abstract class ClassDescriptorBase extends AbstractClassDescriptor {
    private final DeclarationDescriptor containingDeclaration;
    private final boolean isExternal;
    private final SourceElement source;

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i11 == 2) {
            objArr[0] = "name";
        } else if (i11 == 3) {
            objArr[0] = "source";
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i11 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDescriptorBase(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, @NotNull SourceElement sourceElement, boolean z11) {
        super(storageManager, name);
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
        }
        this.containingDeclaration = declarationDescriptor;
        this.source = sourceElement;
        this.isExternal = z11;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor = this.containingDeclaration;
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(4);
        }
        return declarationDescriptor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = this.source;
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        return sourceElement;
    }

    public boolean isExternal() {
        return this.isExternal;
    }
}
