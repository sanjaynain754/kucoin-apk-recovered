package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p852kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import p852kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DeserializedMemberScope.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), Reflection.property1(new PropertyReference1Impl(DeserializedMemberScope.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: c */
    @NotNull
    private final DeserializationContext f91381c;

    @NotNull
    private final NotNullLazyValue classNames$delegate;

    @NotNull
    private final NullableLazyValue classifierNamesLazy$delegate;

    @NotNull
    private final Implementation impl;

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public interface Implementation {
        void addFunctionsAndPropertiesTo(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation);

        @NotNull
        Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        Set<Name> getFunctionNames();

        @Nullable
        TypeAliasDescriptor getTypeAliasByName(@NotNull Name name);

        @NotNull
        Set<Name> getTypeAliasNames();

        @NotNull
        Set<Name> getVariableNames();
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,512:1\n502#1:513\n508#1:517\n508#1:532\n508#1:546\n492#1:572\n493#1,5:575\n492#1:580\n493#1,5:583\n502#1:644\n502#1:648\n1634#2,3:514\n1617#2,9:518\n1869#2:527\n1870#2:530\n1626#2:531\n1617#2,9:533\n1869#2:542\n1870#2:544\n1626#2:545\n1617#2,9:547\n1869#2:556\n1870#2:558\n1626#2:559\n1374#2:560\n1460#2,5:561\n1374#2:566\n1460#2,5:567\n865#2,2:573\n865#2,2:581\n865#2,2:588\n865#2,2:590\n865#2,2:592\n1634#2,3:594\n1617#2,9:597\n1869#2:606\n1870#2:608\n1626#2:609\n1208#2,2:610\n1236#2,4:612\n1491#2:616\n1516#2,3:617\n1519#2,3:627\n1491#2:630\n1516#2,3:631\n1519#2,3:641\n1634#2,3:645\n1634#2,3:649\n1#3:528\n1#3:529\n1#3:543\n1#3:557\n1#3:607\n382#4,7:620\n382#4,7:634\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n*L\n429#1:513\n432#1:517\n435#1:532\n438#1:546\n447#1:572\n447#1:575,5\n450#1:580\n450#1:583,5\n421#1:644\n425#1:648\n429#1:514,3\n432#1:518,9\n432#1:527\n432#1:530\n432#1:531\n435#1:533,9\n435#1:542\n435#1:544\n435#1:545\n438#1:547,9\n438#1:556\n438#1:558\n438#1:559\n441#1:560\n441#1:561,5\n444#1:566\n444#1:567,5\n447#1:573,2\n450#1:581,2\n473#1:588,2\n477#1:590,2\n492#1:592,2\n502#1:594,3\n508#1:597,9\n508#1:606\n508#1:608\n508#1:609\n412#1:610,2\n412#1:612,4\n415#1:616\n415#1:617,3\n415#1:627,3\n418#1:630\n418#1:631,3\n418#1:641,3\n421#1:645,3\n425#1:649,3\n432#1:529\n435#1:543\n438#1:557\n508#1:607\n415#1:620,7\n418#1:634,7\n*E\n"})
    public final class NoReorderImplementation implements Implementation {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), Reflection.property1(new PropertyReference1Impl(NoReorderImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        @NotNull
        private final NotNullLazyValue allFunctions$delegate;

        @NotNull
        private final NotNullLazyValue allProperties$delegate;

        @NotNull
        private final NotNullLazyValue allTypeAliases$delegate;

        @NotNull
        private final NotNullLazyValue declaredFunctions$delegate;

        @NotNull
        private final NotNullLazyValue declaredProperties$delegate;

        @NotNull
        private final List<ProtoBuf.Function> functionList;

        @NotNull
        private final NotNullLazyValue functionNames$delegate;

        @NotNull
        private final NotNullLazyValue functionsByName$delegate;

        @NotNull
        private final NotNullLazyValue propertiesByName$delegate;

        @NotNull
        private final List<ProtoBuf.Property> propertyList;
        final /* synthetic */ DeserializedMemberScope this$0;

        @NotNull
        private final List<ProtoBuf.TypeAlias> typeAliasList;

        @NotNull
        private final NotNullLazyValue typeAliasesByName$delegate;

        @NotNull
        private final NotNullLazyValue variableNames$delegate;

        public NoReorderImplementation(@NotNull final DeserializedMemberScope deserializedMemberScope, @NotNull List<ProtoBuf.Function> functionList, @NotNull List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.this$0 = deserializedMemberScope;
            this.functionList = functionList;
            this.propertyList = propertyList;
            this.typeAliasList = deserializedMemberScope.getC().getComponents().getConfiguration().getTypeAliasesAllowed() ? typeAliasList : CollectionsKt.emptyList();
            this.declaredFunctions$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$0
                private final DeserializedMemberScope.NoReorderImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.arg$0.computeFunctions();
                }

                {
                    this.arg$0 = this;
                }
            });
            this.declaredProperties$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$1
                private final DeserializedMemberScope.NoReorderImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.arg$0.computeProperties();
                }

                {
                    this.arg$0 = this;
                }
            });
            this.allTypeAliases$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$2
                private final DeserializedMemberScope.NoReorderImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.arg$0.computeTypeAliases();
                }

                {
                    this.arg$0 = this;
                }
            });
            this.allFunctions$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$3
                private final DeserializedMemberScope.NoReorderImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.NoReorderImplementation.allFunctions_delegate$lambda$3(this.arg$0);
                }

                {
                    this.arg$0 = this;
                }
            });
            this.allProperties$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$4
                private final DeserializedMemberScope.NoReorderImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.NoReorderImplementation.allProperties_delegate$lambda$4(this.arg$0);
                }

                {
                    this.arg$0 = this;
                }
            });
            this.typeAliasesByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$5
                private final DeserializedMemberScope.NoReorderImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.NoReorderImplementation.typeAliasesByName_delegate$lambda$6(this.arg$0);
                }

                {
                    this.arg$0 = this;
                }
            });
            this.functionsByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$6
                private final DeserializedMemberScope.NoReorderImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.NoReorderImplementation.functionsByName_delegate$lambda$8(this.arg$0);
                }

                {
                    this.arg$0 = this;
                }
            });
            this.propertiesByName$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$7
                private final DeserializedMemberScope.NoReorderImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.NoReorderImplementation.propertiesByName_delegate$lambda$10(this.arg$0);
                }

                {
                    this.arg$0 = this;
                }
            });
            this.functionNames$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this, deserializedMemberScope) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$8
                private final DeserializedMemberScope.NoReorderImplementation arg$0;
                private final DeserializedMemberScope arg$1;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.NoReorderImplementation.functionNames_delegate$lambda$12(this.arg$0, this.arg$1);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = deserializedMemberScope;
                }
            });
            this.variableNames$delegate = deserializedMemberScope.getC().getStorageManager().createLazyValue(new Function0(this, deserializedMemberScope) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$$Lambda$9
                private final DeserializedMemberScope.NoReorderImplementation arg$0;
                private final DeserializedMemberScope arg$1;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.NoReorderImplementation.variableNames_delegate$lambda$14(this.arg$0, this.arg$1);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = deserializedMemberScope;
                }
            });
        }

        private final List<SimpleFunctionDescriptor> computeAllNonDeclaredFunctions() {
            Set<Name> nonDeclaredFunctionNames = this.this$0.getNonDeclaredFunctionNames();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nonDeclaredFunctionNames.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, computeNonDeclaredFunctionsForName((Name) it.next()));
            }
            return arrayList;
        }

        private final List<PropertyDescriptor> computeAllNonDeclaredProperties() {
            Set<Name> nonDeclaredVariableNames = this.this$0.getNonDeclaredVariableNames();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nonDeclaredVariableNames.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, computeNonDeclaredPropertiesForName((Name) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<SimpleFunctionDescriptor> computeFunctions() {
            List<ProtoBuf.Function> list = this.functionList;
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = deserializedMemberScope.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                if (!deserializedMemberScope.isDeclaredFunctionAvailable(simpleFunctionDescriptorLoadFunction)) {
                    simpleFunctionDescriptorLoadFunction = null;
                }
                if (simpleFunctionDescriptorLoadFunction != null) {
                    arrayList.add(simpleFunctionDescriptorLoadFunction);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<PropertyDescriptor> computeProperties() {
            List<ProtoBuf.Property> list = this.propertyList;
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PropertyDescriptor propertyDescriptorLoadProperty$default = MemberDeserializer.loadProperty$default(deserializedMemberScope.getC().getMemberDeserializer(), (ProtoBuf.Property) ((MessageLite) it.next()), false, 2, null);
                if (propertyDescriptorLoadProperty$default != null) {
                    arrayList.add(propertyDescriptorLoadProperty$default);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<TypeAliasDescriptor> computeTypeAliases() {
            List<ProtoBuf.TypeAlias> list = this.typeAliasList;
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeAliasDescriptor typeAliasDescriptorLoadTypeAlias = deserializedMemberScope.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it.next()));
                if (typeAliasDescriptorLoadTypeAlias != null) {
                    arrayList.add(typeAliasDescriptorLoadTypeAlias);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set functionNames_delegate$lambda$12(NoReorderImplementation noReorderImplementation, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Function> list = noReorderImplementation.functionList;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
            }
            return SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope.getNonDeclaredFunctionNames());
        }

        private final List<SimpleFunctionDescriptor> getAllFunctions() {
            return (List) StorageKt.getValue(this.allFunctions$delegate, this, (KProperty<?>) $$delegatedProperties[3]);
        }

        private final List<PropertyDescriptor> getAllProperties() {
            return (List) StorageKt.getValue(this.allProperties$delegate, this, (KProperty<?>) $$delegatedProperties[4]);
        }

        private final List<TypeAliasDescriptor> getAllTypeAliases() {
            return (List) StorageKt.getValue(this.allTypeAliases$delegate, this, (KProperty<?>) $$delegatedProperties[2]);
        }

        private final List<SimpleFunctionDescriptor> getDeclaredFunctions() {
            return (List) StorageKt.getValue(this.declaredFunctions$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
        }

        private final List<PropertyDescriptor> getDeclaredProperties() {
            return (List) StorageKt.getValue(this.declaredProperties$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
        }

        private final Map<Name, Collection<SimpleFunctionDescriptor>> getFunctionsByName() {
            return (Map) StorageKt.getValue(this.functionsByName$delegate, this, (KProperty<?>) $$delegatedProperties[6]);
        }

        private final Map<Name, Collection<PropertyDescriptor>> getPropertiesByName() {
            return (Map) StorageKt.getValue(this.propertiesByName$delegate, this, (KProperty<?>) $$delegatedProperties[7]);
        }

        private final Map<Name, TypeAliasDescriptor> getTypeAliasesByName() {
            return (Map) StorageKt.getValue(this.typeAliasesByName$delegate, this, (KProperty<?>) $$delegatedProperties[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set variableNames_delegate$lambda$14(NoReorderImplementation noReorderImplementation, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Property> list = noReorderImplementation.propertyList;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = noReorderImplementation.this$0;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it.next())).getName()));
            }
            return SetsKt.plus((Set) linkedHashSet, (Iterable) deserializedMemberScope.getNonDeclaredVariableNames());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public void addFunctionsAndPropertiesTo(@NotNull Collection<DeclarationDescriptor> result, @NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                for (Object obj : getAllProperties()) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                for (Object obj2 : getAllFunctions()) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!getFunctionNames().contains(name)) {
                return CollectionsKt.emptyList();
            }
            Collection<SimpleFunctionDescriptor> collection = getFunctionsByName().get(name);
            return collection == null ? CollectionsKt.emptyList() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!getVariableNames().contains(name)) {
                return CollectionsKt.emptyList();
            }
            Collection<PropertyDescriptor> collection = getPropertiesByName().get(name);
            return collection == null ? CollectionsKt.emptyList() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.functionNames$delegate, this, (KProperty<?>) $$delegatedProperties[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @Nullable
        public TypeAliasDescriptor getTypeAliasByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return getTypeAliasesByName().get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Set<Name> getTypeAliasNames() {
            List<ProtoBuf.TypeAlias> list = this.typeAliasList;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).getName()));
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.variableNames$delegate, this, (KProperty<?>) $$delegatedProperties[9]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List allFunctions_delegate$lambda$3(NoReorderImplementation noReorderImplementation) {
            return CollectionsKt.plus((Collection) noReorderImplementation.getDeclaredFunctions(), (Iterable) noReorderImplementation.computeAllNonDeclaredFunctions());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List allProperties_delegate$lambda$4(NoReorderImplementation noReorderImplementation) {
            return CollectionsKt.plus((Collection) noReorderImplementation.getDeclaredProperties(), (Iterable) noReorderImplementation.computeAllNonDeclaredProperties());
        }

        private final List<SimpleFunctionDescriptor> computeNonDeclaredFunctionsForName(Name name) {
            List<SimpleFunctionDescriptor> declaredFunctions = getDeclaredFunctions();
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredFunctions) {
                if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.computeNonDeclaredFunctions(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<PropertyDescriptor> computeNonDeclaredPropertiesForName(Name name) {
            List<PropertyDescriptor> declaredProperties = getDeclaredProperties();
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredProperties) {
                if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.computeNonDeclaredProperties(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map functionsByName_delegate$lambda$8(NoReorderImplementation noReorderImplementation) {
            List<SimpleFunctionDescriptor> allFunctions = noReorderImplementation.getAllFunctions();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : allFunctions) {
                Name name = ((SimpleFunctionDescriptor) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map propertiesByName_delegate$lambda$10(NoReorderImplementation noReorderImplementation) {
            List<PropertyDescriptor> allProperties = noReorderImplementation.getAllProperties();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : allProperties) {
                Name name = ((PropertyDescriptor) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map typeAliasesByName_delegate$lambda$6(NoReorderImplementation noReorderImplementation) {
            List<TypeAliasDescriptor> allTypeAliases = noReorderImplementation.getAllTypeAliases();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(allTypeAliases, 10)), 16));
            for (Object obj : allTypeAliases) {
                Name name = ((TypeAliasDescriptor) obj).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n269#1:513\n269#1:528\n269#1:543\n287#1,17:581\n305#1,2:604\n296#1:606\n303#1:607\n305#1,2:613\n287#1,17:620\n305#1,2:642\n296#1:644\n370#1,11:645\n370#1,11:656\n1491#2:514\n1516#2,3:515\n1519#2,3:525\n1491#2:529\n1516#2,3:530\n1519#2,3:540\n1491#2:544\n1516#2,3:545\n1519#2,3:555\n1252#2,2:560\n1563#2:562\n1634#2,3:563\n1255#2:566\n1491#2:567\n1516#2,3:568\n1519#2,3:578\n1625#2:598\n1869#2:599\n1870#2:602\n1626#2:603\n1625#2:608\n1869#2:609\n1870#2:611\n1626#2:612\n1625#2:615\n1869#2:616\n1870#2:618\n1626#2:619\n1625#2:637\n1869#2:638\n1870#2:640\n1626#2:641\n382#3,7:518\n382#3,7:533\n382#3,7:548\n463#3:558\n413#3:559\n382#3,7:571\n1#4:600\n1#4:601\n1#4:610\n1#4:617\n1#4:639\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n*L\n233#1:513\n235#1:528\n239#1:543\n272#1:581,17\n272#1:604,2\n272#1:606\n287#1:607\n287#1:613,2\n310#1:620,17\n310#1:642,2\n310#1:644\n348#1:645,11\n356#1:656,11\n233#1:514\n233#1:515,3\n233#1:525,3\n235#1:529\n235#1:530,3\n235#1:540,3\n239#1:544\n239#1:545,3\n239#1:555,3\n244#1:560,2\n246#1:562\n246#1:563,3\n244#1:566\n269#1:567\n269#1:568,3\n269#1:578,3\n272#1:598\n272#1:599\n272#1:602\n272#1:603\n287#1:608\n287#1:609\n287#1:611\n287#1:612\n303#1:615\n303#1:616\n303#1:618\n303#1:619\n310#1:637\n310#1:638\n310#1:640\n310#1:641\n233#1:518,7\n235#1:533,7\n239#1:548,7\n244#1:558\n244#1:559\n269#1:571,7\n272#1:601\n287#1:610\n303#1:617\n310#1:639\n*E\n"})
    public final class OptimizedImplementation implements Implementation {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptimizedImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), Reflection.property1(new PropertyReference1Impl(OptimizedImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        @NotNull
        private final NotNullLazyValue functionNames$delegate;

        @NotNull
        private final Map<Name, byte[]> functionProtosBytes;

        @NotNull
        private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> functions;

        @NotNull
        private final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> properties;

        @NotNull
        private final Map<Name, byte[]> propertyProtosBytes;
        final /* synthetic */ DeserializedMemberScope this$0;

        @NotNull
        private final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> typeAliasByName;

        @NotNull
        private final Map<Name, byte[]> typeAliasBytes;

        @NotNull
        private final NotNullLazyValue variableNames$delegate;

        public OptimizedImplementation(@NotNull DeserializedMemberScope deserializedMemberScope, @NotNull List<ProtoBuf.Function> functionList, @NotNull List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) throws IOException {
            Map<Name, byte[]> mapEmptyMap;
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.this$0 = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Name name = NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.functionProtosBytes = packToByteArray(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.this$0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                Name name2 = NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) obj2)).getName());
                Object arrayList2 = linkedHashMap2.get(name2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(name2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.propertyProtosBytes = packToByteArray(linkedHashMap2);
            if (this.this$0.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
                DeserializedMemberScope deserializedMemberScope3 = this.this$0;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    Name name3 = NameResolverUtilKt.getName(deserializedMemberScope3.getC().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).getName());
                    Object arrayList3 = linkedHashMap3.get(name3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(name3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapEmptyMap = packToByteArray(linkedHashMap3);
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            this.typeAliasBytes = mapEmptyMap;
            this.functions = this.this$0.getC().getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$0
                private final DeserializedMemberScope.OptimizedImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj4) {
                    return DeserializedMemberScope.OptimizedImplementation.functions$lambda$5(this.arg$0, (Name) obj4);
                }

                {
                    this.arg$0 = this;
                }
            });
            this.properties = this.this$0.getC().getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$1
                private final DeserializedMemberScope.OptimizedImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj4) {
                    return DeserializedMemberScope.OptimizedImplementation.properties$lambda$6(this.arg$0, (Name) obj4);
                }

                {
                    this.arg$0 = this;
                }
            });
            this.typeAliasByName = this.this$0.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$2
                private final DeserializedMemberScope.OptimizedImplementation arg$0;

                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj4) {
                    return DeserializedMemberScope.OptimizedImplementation.typeAliasByName$lambda$7(this.arg$0, (Name) obj4);
                }

                {
                    this.arg$0 = this;
                }
            });
            StorageManager storageManager = this.this$0.getC().getStorageManager();
            final DeserializedMemberScope deserializedMemberScope4 = this.this$0;
            this.functionNames$delegate = storageManager.createLazyValue(new Function0(this, deserializedMemberScope4) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$3
                private final DeserializedMemberScope.OptimizedImplementation arg$0;
                private final DeserializedMemberScope arg$1;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.OptimizedImplementation.functionNames_delegate$lambda$8(this.arg$0, this.arg$1);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = deserializedMemberScope4;
                }
            });
            StorageManager storageManager2 = this.this$0.getC().getStorageManager();
            final DeserializedMemberScope deserializedMemberScope5 = this.this$0;
            this.variableNames$delegate = storageManager2.createLazyValue(new Function0(this, deserializedMemberScope5) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$$Lambda$4
                private final DeserializedMemberScope.OptimizedImplementation arg$0;
                private final DeserializedMemberScope arg$1;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return DeserializedMemberScope.OptimizedImplementation.variableNames_delegate$lambda$9(this.arg$0, this.arg$1);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = deserializedMemberScope5;
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        private final Collection<SimpleFunctionDescriptor> computeFunctions(Name name) {
            List<ProtoBuf.Function> listEmptyList;
            Map<Name, byte[]> map = this.functionProtosBytes;
            Parser<ProtoBuf.Function> PARSER = ProtoBuf.Function.PARSER;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            byte[] bArr = map.get(name);
            if (bArr != null) {
                listEmptyList = SequencesKt.toList(SequencesKt.generateSequence(new C41429xb5e458c1(PARSER, new ByteArrayInputStream(bArr), this.this$0)));
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(listEmptyList.size());
            for (ProtoBuf.Function function : listEmptyList) {
                MemberDeserializer memberDeserializer = deserializedMemberScope.getC().getMemberDeserializer();
                Intrinsics.checkNotNull(function);
                SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = memberDeserializer.loadFunction(function);
                if (!deserializedMemberScope.isDeclaredFunctionAvailable(simpleFunctionDescriptorLoadFunction)) {
                    simpleFunctionDescriptorLoadFunction = null;
                }
                if (simpleFunctionDescriptorLoadFunction != null) {
                    arrayList.add(simpleFunctionDescriptorLoadFunction);
                }
            }
            deserializedMemberScope.computeNonDeclaredFunctions(name, arrayList);
            return p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        private final Collection<PropertyDescriptor> computeProperties(Name name) {
            List<ProtoBuf.Property> listEmptyList;
            Map<Name, byte[]> map = this.propertyProtosBytes;
            Parser<ProtoBuf.Property> PARSER = ProtoBuf.Property.PARSER;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            DeserializedMemberScope deserializedMemberScope = this.this$0;
            byte[] bArr = map.get(name);
            if (bArr != null) {
                listEmptyList = SequencesKt.toList(SequencesKt.generateSequence(new C41429xb5e458c1(PARSER, new ByteArrayInputStream(bArr), this.this$0)));
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(listEmptyList.size());
            for (ProtoBuf.Property property : listEmptyList) {
                MemberDeserializer memberDeserializer = deserializedMemberScope.getC().getMemberDeserializer();
                Intrinsics.checkNotNull(property);
                PropertyDescriptor propertyDescriptorLoadProperty$default = MemberDeserializer.loadProperty$default(memberDeserializer, property, false, 2, null);
                if (propertyDescriptorLoadProperty$default != null) {
                    arrayList.add(propertyDescriptorLoadProperty$default);
                }
            }
            deserializedMemberScope.computeNonDeclaredProperties(name, arrayList);
            return p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
        }

        private final TypeAliasDescriptor createTypeAlias(Name name) {
            ProtoBuf.TypeAlias delimitedFrom;
            byte[] bArr = this.typeAliasBytes.get(name);
            if (bArr == null || (delimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.this$0.getC().getComponents().getExtensionRegistryLite())) == null) {
                return null;
            }
            return this.this$0.getC().getMemberDeserializer().loadTypeAlias(delimitedFrom);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set functionNames_delegate$lambda$8(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return SetsKt.plus((Set) optimizedImplementation.functionProtosBytes.keySet(), (Iterable) deserializedMemberScope.getNonDeclaredFunctionNames());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection functions$lambda$5(OptimizedImplementation optimizedImplementation, Name it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return optimizedImplementation.computeFunctions(it);
        }

        private final Map<Name, byte[]> packToByteArray(Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractMessageLite) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(Unit.INSTANCE);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection properties$lambda$6(OptimizedImplementation optimizedImplementation, Name it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return optimizedImplementation.computeProperties(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TypeAliasDescriptor typeAliasByName$lambda$7(OptimizedImplementation optimizedImplementation, Name it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return optimizedImplementation.createTypeAlias(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set variableNames_delegate$lambda$9(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return SetsKt.plus((Set) optimizedImplementation.propertyProtosBytes.keySet(), (Iterable) deserializedMemberScope.getNonDeclaredVariableNames());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        public void addFunctionsAndPropertiesTo(@NotNull Collection<DeclarationDescriptor> result, @NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                Set<Name> variableNames = getVariableNames();
                ArrayList arrayList = new ArrayList();
                for (Name name : variableNames) {
                    if (nameFilter.invoke(name).booleanValue()) {
                        arrayList.addAll(getContributedVariables(name, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                CollectionsKt.sortWith(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                Set<Name> functionNames = getFunctionNames();
                ArrayList arrayList2 = new ArrayList();
                for (Name name2 : functionNames) {
                    if (nameFilter.invoke(name2).booleanValue()) {
                        arrayList2.addAll(getContributedFunctions(name2, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(INSTANCE2, "INSTANCE");
                CollectionsKt.sortWith(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !getFunctionNames().contains(name) ? CollectionsKt.emptyList() : this.functions.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !getVariableNames().contains(name) ? CollectionsKt.emptyList() : this.properties.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.functionNames$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @Nullable
        public TypeAliasDescriptor getTypeAliasByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.typeAliasByName.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Set<Name> getTypeAliasNames() {
            return this.typeAliasBytes.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.Implementation
        @NotNull
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.variableNames$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
        }
    }

    public abstract void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    public abstract ClassId createClassId(@NotNull Name name);

    @Nullable
    public abstract Set<Name> getNonDeclaredClassifierNames();

    @NotNull
    public abstract Set<Name> getNonDeclaredFunctionNames();

    @NotNull
    public abstract Set<Name> getNonDeclaredVariableNames();

    public DeserializedMemberScope(@NotNull DeserializationContext c11, @NotNull List<ProtoBuf.Function> functionList, @NotNull List<ProtoBuf.Property> propertyList, @NotNull List<ProtoBuf.TypeAlias> typeAliasList, @NotNull final Function0<? extends Collection<Name>> classNames) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.f91381c = c11;
        this.impl = createImplementation(functionList, propertyList, typeAliasList);
        this.classNames$delegate = c11.getStorageManager().createLazyValue(new Function0(classNames) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$$Lambda$0
            private final Function0 arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return DeserializedMemberScope.classNames_delegate$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = classNames;
            }
        });
        this.classifierNamesLazy$delegate = c11.getStorageManager().createNullableLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$$Lambda$1
            private final DeserializedMemberScope arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return DeserializedMemberScope.classifierNamesLazy_delegate$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    private final Implementation createImplementation(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        return this.f91381c.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new NoReorderImplementation(this, list, list2, list3) : new OptimizedImplementation(this, list, list2, list3);
    }

    private final ClassDescriptor deserializeClass(Name name) {
        return this.f91381c.getComponents().deserializeClass(createClassId(name));
    }

    private final Set<Name> getClassifierNamesLazy() {
        return (Set) StorageKt.getValue(this.classifierNamesLazy$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    private final TypeAliasDescriptor getTypeAliasByName(Name name) {
        return this.impl.getTypeAliasByName(name);
    }

    @NotNull
    public final Collection<DeclarationDescriptor> computeDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (kindFilter.acceptsKinds(companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, nameFilter);
        }
        this.impl.addFunctionsAndPropertiesTo(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.acceptsKinds(companion.getCLASSIFIERS_MASK())) {
            for (Name name : getClassNames$deserialization()) {
                if (nameFilter.invoke(name).booleanValue()) {
                    p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, deserializeClass(name));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (Name name2 : this.impl.getTypeAliasNames()) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, this.impl.getTypeAliasByName(name2));
                }
            }
        }
        return p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
    }

    public void computeNonDeclaredFunctions(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    public void computeNonDeclaredProperties(@NotNull Name name, @NotNull List<PropertyDescriptor> descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    @NotNull
    public final DeserializationContext getC() {
        return this.f91381c;
    }

    @NotNull
    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.classNames$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo105128getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (hasClass(name)) {
            return deserializeClass(name);
        }
        if (this.impl.getTypeAliasNames().contains(name)) {
            return getTypeAliasByName(name);
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.impl.getContributedFunctions(name, location);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.impl.getContributedVariables(name, location);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return this.impl.getFunctionNames();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return this.impl.getVariableNames();
    }

    public boolean hasClass(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getClassNames$deserialization().contains(name);
    }

    public boolean isDeclaredFunctionAvailable(@NotNull SimpleFunctionDescriptor function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set classNames_delegate$lambda$0(Function0 function0) {
        return CollectionsKt.toSet((Iterable) function0.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set classifierNamesLazy_delegate$lambda$1(DeserializedMemberScope deserializedMemberScope) {
        Set<Name> nonDeclaredClassifierNames = deserializedMemberScope.getNonDeclaredClassifierNames();
        if (nonDeclaredClassifierNames == null) {
            return null;
        }
        return SetsKt.plus(SetsKt.plus((Set) deserializedMemberScope.getClassNames$deserialization(), (Iterable) deserializedMemberScope.impl.getTypeAliasNames()), (Iterable) nonDeclaredClassifierNames);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return getClassifierNamesLazy();
    }
}
