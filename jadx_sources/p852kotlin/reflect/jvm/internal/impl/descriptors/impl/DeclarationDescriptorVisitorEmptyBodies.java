package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;

/* JADX INFO: loaded from: classes61.dex */
public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    public R visitDeclarationDescriptor(DeclarationDescriptor declarationDescriptor, D d11) {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitClassDescriptor(ClassDescriptor classDescriptor, D d11) {
        return visitDeclarationDescriptor(classDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, D d11) {
        return visitFunctionDescriptor(constructorDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitFunctionDescriptor(FunctionDescriptor functionDescriptor, D d11) {
        return visitDeclarationDescriptor(functionDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitModuleDeclaration(ModuleDescriptor moduleDescriptor, D d11) {
        return visitDeclarationDescriptor(moduleDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, D d11) {
        return visitDeclarationDescriptor(packageFragmentDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, D d11) {
        return visitDeclarationDescriptor(packageViewDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, D d11) {
        return visitVariableDescriptor(propertyDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, D d11) {
        return visitFunctionDescriptor(propertyGetterDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, D d11) {
        return visitFunctionDescriptor(propertySetterDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, D d11) {
        return visitDeclarationDescriptor(receiverParameterDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, D d11) {
        return visitDeclarationDescriptor(typeAliasDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, D d11) {
        return visitDeclarationDescriptor(typeParameterDescriptor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, D d11) {
        return visitVariableDescriptor(valueParameterDescriptor, d11);
    }

    public R visitVariableDescriptor(VariableDescriptor variableDescriptor, D d11) {
        return visitDeclarationDescriptor(variableDescriptor, d11);
    }
}
