package p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import p852kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport;
import p852kotlin.reflect.jvm.internal.impl.utils.DFS;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: DescriptorUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nDescriptorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n+ 2 ClassKind.kt\norg/jetbrains/kotlin/descriptors/ClassKindKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,466:1\n34#2:467\n827#3:468\n855#3,2:469\n1617#3,9:471\n1869#3:480\n1870#3:482\n1626#3:483\n827#3:484\n855#3,2:485\n827#3:489\n855#3,2:490\n360#3,7:493\n1761#3,3:500\n2746#3,3:503\n1563#3:506\n1634#3,3:507\n1#4:481\n1#4:492\n1310#5,2:487\n*S KotlinDebug\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n*L\n148#1:467\n167#1:468\n167#1:469,2\n168#1:471,9\n168#1:480\n168#1:482\n168#1:483\n175#1:484\n175#1:485,2\n233#1:489\n233#1:490,2\n303#1:493,7\n449#1:500,3\n455#1:503,3\n208#1:506\n208#1:507,3\n168#1:481\n226#1:487,2\n*E\n"})
public final class DescriptorUtilsKt {

    @NotNull
    private static final Name RETENTION_PARAMETER_NAME;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 */
    /* JADX INFO: compiled from: DescriptorUtils.kt */
    public static final /* synthetic */ class C414162 extends FunctionReferenceImpl implements Function1<ValueParameterDescriptor, Boolean> {
        public static final C414162 INSTANCE = new C414162();

        @Override // p852kotlin.jvm.functions.Function1
        public final Boolean invoke(ValueParameterDescriptor p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return Boolean.valueOf(p11.declaresDefaultValue());
        }

        public C414162() {
            super(1, ValueParameterDescriptor.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }
    }

    @Nullable
    public static final ClassId getClassId(@Nullable ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor containingDeclaration;
        ClassId classId;
        if (classifierDescriptor != null && (containingDeclaration = classifierDescriptor.getContainingDeclaration()) != null) {
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
                Name name = classifierDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return new ClassId(fqName, name);
            }
            if ((containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) && (classId = getClassId((ClassifierDescriptor) containingDeclaration)) != null) {
                Name name2 = classifierDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                return classId.createNestedClassId(name2);
            }
        }
        return null;
    }

    @Nullable
    public static final InlineClassRepresentation<SimpleType> getInlineClassRepresentation(@Nullable ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof InlineClassRepresentation) {
            return (InlineClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    @Nullable
    public static final MultiFieldValueClassRepresentation<SimpleType> getMultiFieldValueClassRepresentation(@Nullable ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof MultiFieldValueClassRepresentation) {
            return (MultiFieldValueClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeclarationDescriptor _get_parentsWithSelf_$lambda$8(DeclarationDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getContainingDeclaration();
    }

    public static final boolean declaresOrInheritsDefaultValue(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        Intrinsics.checkNotNullParameter(valueParameterDescriptor, "<this>");
        Boolean boolIfAny = DFS.ifAny(CollectionsKt.listOf(valueParameterDescriptor), new DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$0
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return DescriptorUtilsKt.declaresOrInheritsDefaultValue$lambda$5((ValueParameterDescriptor) obj);
            }
        }, C414162.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(boolIfAny, "ifAny(...)");
        return boolIfAny.booleanValue();
    }

    @Nullable
    public static final CallableMemberDescriptor firstOverridden(@NotNull CallableMemberDescriptor callableMemberDescriptor, final boolean z11, @NotNull final Function1<? super CallableMemberDescriptor, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return (CallableMemberDescriptor) DFS.dfs(CollectionsKt.listOf(callableMemberDescriptor), new DFS.Neighbors(z11) { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$2
            private final boolean arg$0;

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return DescriptorUtilsKt.firstOverridden$lambda$10(this.arg$0, (CallableMemberDescriptor) obj);
            }

            {
                this.arg$0 = z11;
            }
        }, new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public void afterChildren(CallableMemberDescriptor current) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (objectRef.element == null && predicate.invoke(current).booleanValue()) {
                    objectRef.element = current;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(CallableMemberDescriptor current) {
                Intrinsics.checkNotNullParameter(current, "current");
                return objectRef.element == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public CallableMemberDescriptor result() {
                return objectRef.element;
            }
        });
    }

    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return firstOverridden(callableMemberDescriptor, z11, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable firstOverridden$lambda$10(boolean z11, CallableMemberDescriptor callableMemberDescriptor) {
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors;
        if (z11) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.getOriginal() : null;
        }
        return (callableMemberDescriptor == null || (overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors()) == null) ? CollectionsKt.emptyList() : overriddenDescriptors;
    }

    @Nullable
    public static final FqName fqNameOrNull(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    @Nullable
    public static final ClassDescriptor getAnnotationClass(@NotNull AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkNotNullParameter(annotationDescriptor, "<this>");
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = annotationDescriptor.getType().getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor;
        }
        return null;
    }

    @NotNull
    public static final KotlinBuiltIns getBuiltIns(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return getModule(declarationDescriptor).getBuiltIns();
    }

    @NotNull
    public static final FqName getFqNameSafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FqName fqNameSafe = DescriptorUtils.getFqNameSafe(declarationDescriptor);
        Intrinsics.checkNotNullExpressionValue(fqNameSafe, "getFqNameSafe(...)");
        return fqNameSafe;
    }

    @NotNull
    public static final FqNameUnsafe getFqNameUnsafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FqNameUnsafe fqName = DescriptorUtils.getFqName(declarationDescriptor);
        Intrinsics.checkNotNullExpressionValue(fqName, "getFqName(...)");
        return fqName;
    }

    @NotNull
    public static final KotlinTypeRefiner getKotlinTypeRefiner(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        p852kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (p852kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        TypeRefinementSupport typeRefinementSupport = ref != null ? (TypeRefinementSupport) ref.getValue() : null;
        return typeRefinementSupport instanceof TypeRefinementSupport.Enabled ? ((TypeRefinementSupport.Enabled) typeRefinementSupport).getTypeRefiner() : KotlinTypeRefiner.Default.INSTANCE;
    }

    @NotNull
    public static final ModuleDescriptor getModule(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(declarationDescriptor);
        Intrinsics.checkNotNullExpressionValue(containingModule, "getContainingModule(...)");
        return containingModule;
    }

    @NotNull
    public static final Sequence<DeclarationDescriptor> getParents(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return SequencesKt.drop(getParentsWithSelf(declarationDescriptor), 1);
    }

    @NotNull
    public static final Sequence<DeclarationDescriptor> getParentsWithSelf(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return SequencesKt.generateSequence(declarationDescriptor, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return DescriptorUtilsKt._get_parentsWithSelf_$lambda$8((DeclarationDescriptor) obj);
            }
        });
    }

    @NotNull
    public static final CallableMemberDescriptor getPropertyIfAccessor(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        Intrinsics.checkNotNullExpressionValue(correspondingProperty, "getCorrespondingProperty(...)");
        return correspondingProperty;
    }

    @Nullable
    public static final ClassDescriptor getSuperClassNotAny(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        for (KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().mo105127getSupertypes()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
                if (DescriptorUtils.isClassOrEnumClass(classifierDescriptorMo105126getDeclarationDescriptor)) {
                    Intrinsics.checkNotNull(classifierDescriptorMo105126getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor;
                }
            }
        }
        return null;
    }

    public static final boolean isTypeRefinementEnabled(@NotNull ModuleDescriptor moduleDescriptor) {
        TypeRefinementSupport typeRefinementSupport;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        p852kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (p852kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        return (ref == null || (typeRefinementSupport = (TypeRefinementSupport) ref.getValue()) == null || !typeRefinementSupport.isEnabled()) ? false : true;
    }

    @NotNull
    public static final Sequence<CallableMemberDescriptor> overriddenTreeAsSequence(@NotNull CallableMemberDescriptor callableMemberDescriptor, final boolean z11) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        if (z11) {
            callableMemberDescriptor = callableMemberDescriptor.getOriginal();
        }
        Sequence sequenceSequenceOf = SequencesKt.sequenceOf((Object[]) new CallableMemberDescriptor[]{callableMemberDescriptor});
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        return SequencesKt.plus(sequenceSequenceOf, SequencesKt.flatMap(CollectionsKt.asSequence(overriddenDescriptors), new Function1(z11) { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$3
            private final boolean arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return DescriptorUtilsKt.overriddenTreeAsSequence$lambda$12$lambda$11(this.arg$0, (CallableMemberDescriptor) obj);
            }

            {
                this.arg$0 = z11;
            }
        }));
    }

    @Nullable
    public static final ClassDescriptor resolveTopLevelClass(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName topLevelClassFqName, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
        Intrinsics.checkNotNullParameter(location, "location");
        topLevelClassFqName.isRoot();
        ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier = moduleDescriptor.getPackage(topLevelClassFqName.parent()).getMemberScope().mo105128getContributedClassifier(topLevelClassFqName.shortName(), location);
        if (classifierDescriptorMo105128getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo105128getContributedClassifier;
        }
        return null;
    }

    static {
        Name nameIdentifier = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        RETENTION_PARAMETER_NAME = nameIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable declaresOrInheritsDefaultValue$lambda$5(ValueParameterDescriptor valueParameterDescriptor) {
        Collection<ValueParameterDescriptor> overriddenDescriptors = valueParameterDescriptor.getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(overriddenDescriptors, 10));
        Iterator<T> it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getOriginal());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence overriddenTreeAsSequence$lambda$12$lambda$11(boolean z11, CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNull(callableMemberDescriptor);
        return overriddenTreeAsSequence(callableMemberDescriptor, z11);
    }
}
