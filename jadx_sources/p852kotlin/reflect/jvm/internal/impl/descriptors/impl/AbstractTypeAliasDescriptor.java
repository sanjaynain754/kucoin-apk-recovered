package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: AbstractTypeAliasDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nAbstractTypeAliasDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1617#2,9:130\n1869#2:139\n1870#2:141\n1626#2:142\n1#3:140\n*S KotlinDebug\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n*L\n69#1:130,9\n69#1:139\n69#1:141\n69#1:142\n69#1:140\n*E\n"})
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AbstractTypeAliasDescriptor.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    @NotNull
    private final NotNullLazyValue constructors$delegate;
    private List<? extends TypeParameterDescriptor> declaredTypeParametersImpl;

    @NotNull
    private final StorageManager storageManager;

    @NotNull
    private final AbstractTypeAliasDescriptor$typeConstructor$1 typeConstructor;

    @NotNull
    private final DescriptorVisibility visibilityImpl;

    @NotNull
    public abstract List<TypeParameterDescriptor> getTypeConstructorTypeParameters();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List list = this.declaredTypeParametersImpl;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("declaredTypeParametersImpl");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        return Modality.FINAL;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.visibilityImpl;
    }

    public final void initialize(@NotNull List<? extends TypeParameterDescriptor> declaredTypeParameters) {
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        this.declaredTypeParametersImpl = declaredTypeParameters;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "typealias " + getName().asString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor containingDeclaration, @NotNull Annotations annotations, @NotNull Name name, @NotNull SourceElement sourceElement, @NotNull DescriptorVisibility visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        Intrinsics.checkNotNullParameter(visibilityImpl, "visibilityImpl");
        this.storageManager = storageManager;
        this.visibilityImpl = visibilityImpl;
        this.constructors$delegate = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$0
            private final AbstractTypeAliasDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.arg$0.getTypeAliasConstructors();
            }

            {
                this.arg$0 = this;
            }
        });
        this.typeConstructor = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public boolean isDenotable() {
                return true;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: getDeclarationDescriptor */
            public TypeAliasDescriptor mo105126getDeclarationDescriptor() {
                return this.this$0;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public List<TypeParameterDescriptor> getParameters() {
                return this.this$0.getTypeConstructorTypeParameters();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this;
            }

            public String toString() {
                return "[typealias " + mo105126getDeclarationDescriptor().getName().asString() + ']';
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public KotlinBuiltIns getBuiltIns() {
                return DescriptorUtilsKt.getBuiltIns(mo105126getDeclarationDescriptor());
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: getSupertypes */
            public Collection<KotlinType> mo105127getSupertypes() {
                Collection<KotlinType> collectionMo105127getSupertypes = mo105126getDeclarationDescriptor().getUnderlyingType().getConstructor().mo105127getSupertypes();
                Intrinsics.checkNotNullExpressionValue(collectionMo105127getSupertypes, "getSupertypes(...)");
                return collectionMo105127getSupertypes;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType computeDefaultType$lambda$4(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(abstractTypeAliasDescriptor);
        if (classifierDescriptorRefineDescriptor != null) {
            return classifierDescriptorRefineDescriptor.getDefaultType();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public static final Boolean isInner$lambda$2(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, UnwrappedType unwrappedType) {
        boolean z11;
        Intrinsics.checkNotNull(unwrappedType);
        if (!KotlinTypeKt.isError(unwrappedType)) {
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = unwrappedType.getConstructor().mo105126getDeclarationDescriptor();
            if ((classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptor) && !Intrinsics.areEqual(((TypeParameterDescriptor) classifierDescriptorMo105126getDeclarationDescriptor).getContainingDeclaration(), abstractTypeAliasDescriptor)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d11) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.visitTypeAliasDescriptor(this, d11);
    }

    @NotNull
    public final SimpleType computeDefaultType() {
        MemberScope unsubstitutedMemberScope;
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null || (unsubstitutedMemberScope = classDescriptor.getUnsubstitutedMemberScope()) == null) {
            unsubstitutedMemberScope = MemberScope.Empty.INSTANCE;
        }
        SimpleType simpleTypeMakeUnsubstitutedType = TypeUtils.makeUnsubstitutedType(this, unsubstitutedMemberScope, (Function1<KotlinTypeRefiner, SimpleType>) new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$2
            private final AbstractTypeAliasDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractTypeAliasDescriptor.computeDefaultType$lambda$4(this.arg$0, (KotlinTypeRefiner) obj);
            }

            {
                this.arg$0 = this;
            }
        });
        Intrinsics.checkNotNullExpressionValue(simpleTypeMakeUnsubstitutedType, "makeUnsubstitutedType(...)");
        return simpleTypeMakeUnsubstitutedType;
    }

    @NotNull
    public final Collection<TypeAliasConstructorDescriptor> getTypeAliasConstructors() {
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null) {
            return CollectionsKt.emptyList();
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.Companion;
            StorageManager storageManager = this.storageManager;
            Intrinsics.checkNotNull(classConstructorDescriptor);
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptorCreateIfAvailable = companion.createIfAvailable(storageManager, this, classConstructorDescriptor);
            if (typeAliasConstructorDescriptorCreateIfAvailable != null) {
                arrayList.add(typeAliasConstructorDescriptorCreateIfAvailable);
            }
        }
        return arrayList;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return TypeUtils.contains(getUnderlyingType(), new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$1
            private final AbstractTypeAliasDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractTypeAliasDescriptor.isInner$lambda$2(this.arg$0, (UnwrappedType) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public TypeAliasDescriptor getOriginal() {
        DeclarationDescriptorWithSource original = super.getOriginal();
        Intrinsics.checkNotNull(original, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (TypeAliasDescriptor) original;
    }
}
