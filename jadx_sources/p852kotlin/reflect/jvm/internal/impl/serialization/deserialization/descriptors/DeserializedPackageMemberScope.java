package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;

/* JADX INFO: compiled from: DeserializedPackageMemberScope.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nDeserializedPackageMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1374#2:82\n1460#2,5:83\n1761#2,3:88\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n*L\n55#1:82\n55#1:83,5\n58#1:88,3\n*E\n"})
public class DeserializedPackageMemberScope extends DeserializedMemberScope {

    @NotNull
    private final String debugName;

    @NotNull
    private final PackageFragmentDescriptor packageDescriptor;

    @NotNull
    private final FqName packageFqName;

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (Function1<? super Name, Boolean>) function1);
    }

    public DeserializedPackageMemberScope(@NotNull PackageFragmentDescriptor packageDescriptor, @NotNull ProtoBuf.Package proto, @NotNull NameResolver nameResolver, @NotNull BinaryVersion metadataVersion, @Nullable DeserializedContainerSource deserializedContainerSource, @NotNull DeserializationComponents components, @NotNull String debugName, @NotNull Function0<? extends Collection<Name>> classNames) {
        Intrinsics.checkNotNullParameter(packageDescriptor, "packageDescriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        ProtoBuf.TypeTable typeTable = proto.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = proto.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextCreateContext = components.createContext(packageDescriptor, nameResolver, typeTable2, companion.create(versionRequirementTable), metadataVersion, deserializedContainerSource);
        List<ProtoBuf.Function> functionList = proto.getFunctionList();
        Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
        List<ProtoBuf.Property> propertyList = proto.getPropertyList();
        Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
        List<ProtoBuf.TypeAlias> typeAliasList = proto.getTypeAliasList();
        Intrinsics.checkNotNullExpressionValue(typeAliasList, "getTypeAliasList(...)");
        super(deserializationContextCreateContext, functionList, propertyList, typeAliasList, classNames);
        this.packageDescriptor = packageDescriptor;
        this.debugName = debugName;
        this.packageFqName = packageDescriptor.getFqName();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> result, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    public ClassId createClassId(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ClassId(this.packageFqName, name);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo105128getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo105132recordLookup(name, location);
        return super.mo105128getContributedClassifier(name, location);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public List<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection<DeclarationDescriptor> collectionComputeDescriptors = computeDescriptors(kindFilter, nameFilter, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        ArrayList arrayList = new ArrayList();
        Iterator<ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, it.next().getAllContributedClassesIfPossible(this.packageFqName));
        }
        return CollectionsKt.plus((Collection) collectionComputeDescriptors, (Iterable) arrayList);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public boolean hasClass(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (super.hasClass(name)) {
            return true;
        }
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        if ((fictitiousClassDescriptorFactories instanceof Collection) && ((Collection) fictitiousClassDescriptorFactories).isEmpty()) {
            return false;
        }
        Iterator<ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            if (it.next().shouldCreateClass(this.packageFqName, name)) {
                return true;
            }
        }
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo105132recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        UtilsKt.record(getC().getComponents().getLookupTracker(), location, this.packageDescriptor, name);
    }

    @NotNull
    public String toString() {
        return this.debugName;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @Nullable
    public Set<Name> getNonDeclaredClassifierNames() {
        return SetsKt.emptySet();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    public Set<Name> getNonDeclaredFunctionNames() {
        return SetsKt.emptySet();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    public Set<Name> getNonDeclaredVariableNames() {
        return SetsKt.emptySet();
    }
}
