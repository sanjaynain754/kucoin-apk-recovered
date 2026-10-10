package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.utils.DFS;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nLazyJavaStaticClassScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1491#2:172\n1516#2,3:173\n1519#2,3:183\n1563#2:192\n1634#2,3:193\n382#3,7:176\n77#4:186\n97#4,5:187\n*S KotlinDebug\n*F\n+ 1 LazyJavaStaticClassScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaStaticClassScope\n*L\n112#1:172\n112#1:173,3\n112#1:183,3\n168#1:192\n168#1:193,3\n112#1:176,7\n114#1:186\n114#1:187,5\n*E\n"})
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    @NotNull
    private final JavaClass jClass;

    @NotNull
    private final JavaClassDescriptor ownerDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext c11, @NotNull JavaClass jClass, @NotNull JavaClassDescriptor ownerDescriptor) {
        super(c11);
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.jClass = jClass;
        this.ownerDescriptor = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeMemberIndex$lambda$0(JavaMember it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection computeNonDeclaredProperties$lambda$4(Name name, MemberScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection computePropertyNames$lambda$3$lambda$2(MemberScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getVariableNames();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeClassNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return SetsKt.emptySet();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set<Name> mutableSet = CollectionsKt.toMutableSet(getDeclaredMemberIndex().invoke().getMethodNames());
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        Set<Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = SetsKt.emptySet();
        }
        mutableSet.addAll(functionNames);
        if (this.jClass.isEnum()) {
            mutableSet.addAll(CollectionsKt.listOf((Object[]) new Name[]{StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES}));
        }
        mutableSet.addAll(getC().getComponents().getSyntheticPartsProvider().getStaticFunctionNames(getOwnerDescriptor(), getC()));
        return mutableSet;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeImplicitlyDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        getC().getComponents().getSyntheticPartsProvider().generateStaticFunctions(getOwnerDescriptor(), name, result, getC());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(LazyJavaStaticClassScope.computeMemberIndex$lambda$0((JavaMember) obj));
            }
        });
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, getStaticFunctionsFromJavaSuperClasses(name, getOwnerDescriptor()), result, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionResolveOverridesForStaticMembers);
        if (this.jClass.isEnum()) {
            if (Intrinsics.areEqual(name, StandardNames.ENUM_VALUE_OF)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptorCreateEnumValueOfMethod, "createEnumValueOfMethod(...)");
                result.add(simpleFunctionDescriptorCreateEnumValueOfMethod);
            } else if (Intrinsics.areEqual(name, StandardNames.ENUM_VALUES)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptorCreateEnumValuesMethod, "createEnumValuesMethod(...)");
                result.add(simpleFunctionDescriptorCreateEnumValuesMethod);
            }
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(@NotNull final Name name, @NotNull Collection<PropertyDescriptor> result) {
        Name name2;
        Collection<PropertyDescriptor> collection;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Set setFlatMapJavaStaticSupertypesScopes = flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), new LinkedHashSet(), new Function1(name) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$2
            private final Name arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaStaticClassScope.computeNonDeclaredProperties$lambda$4(this.arg$0, (MemberScope) obj);
            }

            {
                this.arg$0 = name;
            }
        });
        if (result.isEmpty()) {
            name2 = name;
            collection = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setFlatMapJavaStaticSupertypesScopes) {
                PropertyDescriptor realOriginal = getRealOriginal((PropertyDescriptor) obj);
                Object arrayList = linkedHashMap.get(realOriginal);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(realOriginal, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name2, (Collection) ((Map.Entry) it.next()).getValue(), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
                Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
                CollectionsKt.addAll(arrayList2, collectionResolveOverridesForStaticMembers);
            }
            collection.addAll(arrayList2);
        } else {
            Collection<? extends PropertyDescriptor> collectionResolveOverridesForStaticMembers2 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, setFlatMapJavaStaticSupertypesScopes, result, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
            name2 = name;
            collection = result;
            Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers2, "resolveOverridesForStaticMembers(...)");
            collection.addAll(collectionResolveOverridesForStaticMembers2);
        }
        if (this.jClass.isEnum() && Intrinsics.areEqual(name2, StandardNames.ENUM_ENTRIES)) {
            p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection, DescriptorFactory.createEnumEntriesProperty(getOwnerDescriptor()));
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computePropertyNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set<Name> mutableSet = CollectionsKt.toMutableSet(getDeclaredMemberIndex().invoke().getFieldNames());
        flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), mutableSet, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaStaticClassScope.computePropertyNames$lambda$3$lambda$2((MemberScope) obj);
            }
        });
        if (this.jClass.isEnum()) {
            mutableSet.add(StandardNames.ENUM_ENTRIES);
        }
        return mutableSet;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo105128getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public JavaClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    private final <R> Set<R> flatMapJavaStaticSupertypesScopes(final ClassDescriptor classDescriptor, final Set<R> set, final Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        DFS.dfs(CollectionsKt.listOf(classDescriptor), new DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$3
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes$lambda$8((ClassDescriptor) obj);
            }
        }, new DFS.AbstractNodeHandler<ClassDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes.2
            /* JADX INFO: renamed from: result, reason: collision with other method in class */
            public void m105123result() {
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(ClassDescriptor current) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (current == classDescriptor) {
                    return true;
                }
                MemberScope staticScope = current.getStaticScope();
                Intrinsics.checkNotNullExpressionValue(staticScope, "getStaticScope(...)");
                if (!(staticScope instanceof LazyJavaStaticScope)) {
                    return true;
                }
                set.addAll((Collection<? extends R>) ((Collection) function1.invoke(staticScope)));
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public /* bridge */ /* synthetic */ Object result() {
                m105123result();
                return Unit.INSTANCE;
            }
        });
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable flatMapJavaStaticSupertypesScopes$lambda$8(ClassDescriptor classDescriptor) {
        Collection<KotlinType> collectionMo105127getSupertypes = classDescriptor.getTypeConstructor().mo105127getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collectionMo105127getSupertypes, "getSupertypes(...)");
        return SequencesKt.asIterable(SequencesKt.mapNotNull(CollectionsKt.asSequence(collectionMo105127getSupertypes), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$$Lambda$4
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes$lambda$8$lambda$7((KotlinType) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor flatMapJavaStaticSupertypesScopes$lambda$8$lambda$7(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor;
        }
        return null;
    }

    private final PropertyDescriptor getRealOriginal(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(overriddenDescriptors, 10));
        for (PropertyDescriptor propertyDescriptor2 : overriddenDescriptors) {
            Intrinsics.checkNotNull(propertyDescriptor2);
            arrayList.add(getRealOriginal(propertyDescriptor2));
        }
        return (PropertyDescriptor) CollectionsKt.single(CollectionsKt.distinct(arrayList));
    }

    private final Set<SimpleFunctionDescriptor> getStaticFunctionsFromJavaSuperClasses(Name name, ClassDescriptor classDescriptor) {
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(classDescriptor);
        if (parentJavaStaticClassScope == null) {
            return SetsKt.emptySet();
        }
        return CollectionsKt.toSet(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }
}
