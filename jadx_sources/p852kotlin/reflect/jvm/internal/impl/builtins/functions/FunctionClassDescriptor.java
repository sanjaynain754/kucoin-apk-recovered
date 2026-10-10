package p852kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt;

/* JADX INFO: compiled from: FunctionClassDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1563#2:147\n1634#2,3:148\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n*L\n54#1:147\n54#1:148,3\n*E\n"})
public final class FunctionClassDescriptor extends AbstractClassDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ClassId functionClassId;

    @NotNull
    private static final ClassId kFunctionClassId;
    private final int arity;

    @NotNull
    private final PackageFragmentDescriptor containingDeclaration;

    @NotNull
    private final FunctionClassKind functionKind;

    @NotNull
    private final FunctionTypeKind functionTypeKind;

    @NotNull
    private final FunctionClassScope memberScope;

    @NotNull
    private final List<TypeParameterDescriptor> parameters;

    @NotNull
    private final StorageManager storageManager;

    @NotNull
    private final FunctionTypeConstructor typeConstructor;

    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: FunctionClassDescriptor.kt */
    @SourceDebugExtension({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor$FunctionTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1563#2:147\n1634#2,2:148\n1563#2:150\n1634#2,3:151\n1636#2:154\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor$FunctionTypeConstructor\n*L\n113#1:147\n113#1:148,2\n117#1:150\n117#1:151,3\n113#1:154\n*E\n"})
    public final class FunctionTypeConstructor extends AbstractClassTypeConstructor {
        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        public FunctionTypeConstructor() {
            super(FunctionClassDescriptor.this.storageManager);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public Collection<KotlinType> computeSupertypes() {
            List<ClassId> listListOf;
            FunctionTypeKind functionTypeKind = FunctionClassDescriptor.this.getFunctionTypeKind();
            FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
            if (Intrinsics.areEqual(functionTypeKind, function)) {
                listListOf = CollectionsKt.listOf(FunctionClassDescriptor.functionClassId);
            } else if (Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE)) {
                listListOf = CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.kFunctionClassId, new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, function.numberedClassName(FunctionClassDescriptor.this.getArity()))});
            } else {
                FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
                if (Intrinsics.areEqual(functionTypeKind, suspendFunction)) {
                    listListOf = CollectionsKt.listOf(FunctionClassDescriptor.functionClassId);
                } else {
                    if (!Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE)) {
                        AddToStdlibKt.shouldNotBeCalled$default(null, 1, null);
                        throw new KotlinNothingValueException();
                    }
                    listListOf = CollectionsKt.listOf((Object[]) new ClassId[]{FunctionClassDescriptor.kFunctionClassId, new ClassId(StandardNames.COROUTINES_PACKAGE_FQ_NAME, suspendFunction.numberedClassName(FunctionClassDescriptor.this.getArity()))});
                }
            }
            ModuleDescriptor containingDeclaration = FunctionClassDescriptor.this.containingDeclaration.getContainingDeclaration();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            for (ClassId classId : listListOf) {
                ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
                if (classDescriptorFindClassAcrossModuleDependencies == null) {
                    throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
                List listTakeLast = CollectionsKt.takeLast(getParameters(), classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters().size());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTakeLast, 10));
                Iterator it = listTakeLast.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).getDefaultType()));
                }
                arrayList.add(KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptorFindClassAcrossModuleDependencies, arrayList2));
            }
            return CollectionsKt.toList(arrayList);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.parameters;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, p852kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public FunctionClassDescriptor mo105126getDeclarationDescriptor() {
            return FunctionClassDescriptor.this;
        }

        @NotNull
        public String toString() {
            return mo105126getDeclarationDescriptor().toString();
        }
    }

    @Nullable
    public Void getCompanionObjectDescriptor() {
        return null;
    }

    @Nullable
    public Void getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
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

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    static {
        FqName fqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier("Function");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        functionClassId = new ClassId(fqName, nameIdentifier);
        FqName fqName2 = StandardNames.KOTLIN_REFLECT_FQ_NAME;
        Name nameIdentifier2 = Name.identifier("KFunction");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        kFunctionClassId = new ClassId(fqName2, nameIdentifier2);
    }

    private static final void _init_$typeParameter(ArrayList<TypeParameterDescriptor> arrayList, FunctionClassDescriptor functionClassDescriptor, Variance variance, String str) {
        arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(functionClassDescriptor, Annotations.Companion.getEMPTY(), false, variance, Name.identifier(str), arrayList.size(), functionClassDescriptor.storageManager));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public final int getArity() {
        return this.arity;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassDescriptor mo105115getCompanionObjectDescriptor() {
        return (ClassDescriptor) getCompanionObjectDescriptor();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List<ClassConstructorDescriptor> getConstructors() {
        return CollectionsKt.emptyList();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public PackageFragmentDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.parameters;
    }

    @NotNull
    public final FunctionTypeKind getFunctionTypeKind() {
        return this.functionTypeKind;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        return Modality.ABSTRACT;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope.Empty getStaticScope() {
        return MemberScope.Empty.INSTANCE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public FunctionClassScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.memberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor mo105116getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) getUnsubstitutedPrimaryConstructor();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility PUBLIC = DescriptorVisibilities.PUBLIC;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(@NotNull StorageManager storageManager, @NotNull PackageFragmentDescriptor containingDeclaration, @NotNull FunctionTypeKind functionTypeKind, int i11) {
        super(storageManager, functionTypeKind.numberedClassName(i11));
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
        this.storageManager = storageManager;
        this.containingDeclaration = containingDeclaration;
        this.functionTypeKind = functionTypeKind;
        this.arity = i11;
        this.typeConstructor = new FunctionTypeConstructor();
        this.memberScope = new FunctionClassScope(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i11);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iNextInt);
            _init_$typeParameter(arrayList, this, variance, sb2.toString());
            arrayList2.add(Unit.INSTANCE);
        }
        _init_$typeParameter(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.parameters = CollectionsKt.toList(arrayList);
        this.functionKind = FunctionClassKind.Companion.getFunctionClassKind(this.functionTypeKind);
    }

    @NotNull
    public String toString() {
        String strAsString = getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }
}
