package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes61.dex */
public abstract class VariableDescriptorWithInitializerImpl extends VariableDescriptorImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected NullableLazyValue<ConstantValue<?>> compileTimeInitializer;
    protected Function0<NullableLazyValue<ConstantValue<?>>> compileTimeInitializerFactory;
    private final boolean isVar;

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1) {
            objArr[0] = "annotations";
        } else if (i11 == 2) {
            objArr[0] = "name";
        } else if (i11 == 3) {
            objArr[0] = "source";
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i11 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i11 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableDescriptorWithInitializerImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @Nullable KotlinType kotlinType, boolean z11, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, kotlinType, sourceElement);
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
        }
        this.isVar = z11;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    @Nullable
    /* JADX INFO: renamed from: getCompileTimeInitializer */
    public ConstantValue<?> mo105118getCompileTimeInitializer() {
        NullableLazyValue<ConstantValue<?>> nullableLazyValue = this.compileTimeInitializer;
        if (nullableLazyValue != null) {
            return nullableLazyValue.invoke();
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return this.isVar;
    }

    public void setCompileTimeInitializer(@Nullable NullableLazyValue<ConstantValue<?>> nullableLazyValue, @NotNull Function0<NullableLazyValue<ConstantValue<?>>> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(5);
        }
        this.compileTimeInitializerFactory = function0;
        if (nullableLazyValue == null) {
            nullableLazyValue = function0.invoke();
        }
        this.compileTimeInitializer = nullableLazyValue;
    }

    public void setCompileTimeInitializerFactory(@NotNull Function0<NullableLazyValue<ConstantValue<?>>> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(4);
        }
        setCompileTimeInitializer(null, function0);
    }
}
