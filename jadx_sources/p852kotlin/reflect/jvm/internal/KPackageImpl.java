package p852kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KPackageImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001)B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020(H\u0016R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\f\u0012\b\u0012\u00060\nR\u00020\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015¨\u0006*"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "data", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "getProperties", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getLocalProperty", "index", "", "equals", "", "other", "", "hashCode", "toString", "", "Data", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KPackageImpl extends KDeclarationContainerImpl {

    @NotNull
    private final Lazy<Data> data;

    @NotNull
    private final Class<?> jClass;

    /* JADX INFO: compiled from: KPackageImpl.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR!\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b!\u0010\"¨\u0006$"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope$delegate", "multifileFacade", "Ljava/lang/Class;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade$delegate", "Lkotlin/Lazy;", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/MetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "members", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class Data extends KDeclarationContainerImpl.Data {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Data.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0)), Reflection.property1(new PropertyReference1Impl(Data.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)), Reflection.property1(new PropertyReference1Impl(Data.class, "members", "getMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: kotlinClass$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal kotlinClass;

        /* JADX INFO: renamed from: members$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal members;

        /* JADX INFO: renamed from: metadata$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy metadata;

        /* JADX INFO: renamed from: multifileFacade$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy multifileFacade;

        /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal scope;

        public Data() {
            super();
            this.kotlinClass = ReflectProperties.lazySoft(new Function0(KPackageImpl.this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$0
                private final KPackageImpl arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return KPackageImpl.Data.kotlinClass_delegate$lambda$0(this.arg$0);
                }

                {
                    this.arg$0 = kPackageImpl;
                }
            });
            this.scope = ReflectProperties.lazySoft(new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$1
                private final KPackageImpl.Data arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return KPackageImpl.Data.scope_delegate$lambda$1(this.arg$0);
                }

                {
                    this.arg$0 = this;
                }
            });
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.multifileFacade = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this, KPackageImpl.this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$2
                private final KPackageImpl.Data arg$0;
                private final KPackageImpl arg$1;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return KPackageImpl.Data.multifileFacade_delegate$lambda$2(this.arg$0, this.arg$1);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = kPackageImpl;
                }
            });
            this.metadata = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$3
                private final KPackageImpl.Data arg$0;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return KPackageImpl.Data.metadata_delegate$lambda$4(this.arg$0);
                }

                {
                    this.arg$0 = this;
                }
            });
            this.members = ReflectProperties.lazySoft(new Function0(KPackageImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$4
                private final KPackageImpl arg$0;
                private final KPackageImpl.Data arg$1;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return KPackageImpl.Data.members_delegate$lambda$5(this.arg$0, this.arg$1);
                }

                {
                    this.arg$0 = kPackageImpl;
                    this.arg$1 = this;
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final ReflectKotlinClass getKotlinClass() {
            return (ReflectKotlinClass) this.kotlinClass.getValue(this, $$delegatedProperties[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReflectKotlinClass kotlinClass_delegate$lambda$0(KPackageImpl kPackageImpl) {
            return ReflectKotlinClass.Factory.create(kPackageImpl.getJClass());
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getMembers() {
            T value = this.members.getValue(this, $$delegatedProperties[2]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @Nullable
        public final Triple<JvmNameResolver, ProtoBuf.Package, MetadataVersion> getMetadata() {
            return (Triple) this.metadata.getValue();
        }

        @Nullable
        public final Class<?> getMultifileFacade() {
            return (Class) this.multifileFacade.getValue();
        }

        @NotNull
        public final MemberScope getScope() {
            T value = this.scope.getValue(this, $$delegatedProperties[1]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (MemberScope) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection members_delegate$lambda$5(KPackageImpl kPackageImpl, Data data) {
            return kPackageImpl.getMembers(data.getScope(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Triple metadata_delegate$lambda$4(Data data) {
            KotlinClassHeader classHeader;
            ReflectKotlinClass kotlinClass = data.getKotlinClass();
            if (kotlinClass != null && (classHeader = kotlinClass.getClassHeader()) != null) {
                String[] data2 = classHeader.getData();
                String[] strings = classHeader.getStrings();
                if (data2 != null && strings != null) {
                    Pair<JvmNameResolver, ProtoBuf.Package> packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data2, strings);
                    return new Triple(packageDataFrom.component1(), packageDataFrom.component2(), classHeader.getMetadataVersion());
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Class multifileFacade_delegate$lambda$2(Data data, KPackageImpl kPackageImpl) {
            String multifileClassName;
            KotlinClassHeader classHeader;
            ReflectKotlinClass kotlinClass = data.getKotlinClass();
            if (kotlinClass != null && (classHeader = kotlinClass.getClassHeader()) != null) {
                multifileClassName = classHeader.getMultifileClassName();
            } else {
                multifileClassName = null;
            }
            if (multifileClassName == null || multifileClassName.length() <= 0) {
                return null;
            }
            return kPackageImpl.getJClass().getClassLoader().loadClass(StringsKt.replace$default(multifileClassName, '/', '.', false, 4, (Object) null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MemberScope scope_delegate$lambda$1(Data data) {
            ReflectKotlinClass kotlinClass = data.getKotlinClass();
            if (kotlinClass != null) {
                return data.getModuleData().getPackagePartScopeCache().getPackagePartScope(kotlinClass);
            }
            return MemberScope.Empty.INSTANCE;
        }
    }

    public KPackageImpl(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
        this.data = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$$Lambda$0
            private final KPackageImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return KPackageImpl.data$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Data data$lambda$0(KPackageImpl kPackageImpl) {
        return kPackageImpl.new Data();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropertyDescriptor getLocalProperty$lambda$3$lambda$2$lambda$1(MemberDeserializer deserializeToDescriptor, ProtoBuf.Property proto) {
        Intrinsics.checkNotNullParameter(deserializeToDescriptor, "$this$deserializeToDescriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return deserializeToDescriptor.loadProperty(proto, true);
    }

    private final MemberScope getScope() {
        return this.data.getValue().getScope();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KPackageImpl) && Intrinsics.areEqual(getJClass(), ((KPackageImpl) other).getJClass());
    }

    @Override // p852kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<FunctionDescriptor> getFunctions(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getScope().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // p852kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // p852kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int index) {
        Triple<JvmNameResolver, ProtoBuf.Package, MetadataVersion> metadata = this.data.getValue().getMetadata();
        if (metadata != null) {
            JvmNameResolver jvmNameResolverComponent1 = metadata.component1();
            ProtoBuf.Package packageComponent2 = metadata.component2();
            MetadataVersion metadataVersionComponent3 = metadata.component3();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable = JvmProtoBuf.packageLocalVariable;
            Intrinsics.checkNotNullExpressionValue(packageLocalVariable, "packageLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(packageComponent2, packageLocalVariable, index);
            if (property != null) {
                Class<?> jClass = getJClass();
                ProtoBuf.TypeTable typeTable = packageComponent2.getTypeTable();
                Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
                return (PropertyDescriptor) UtilKt.deserializeToDescriptor(jClass, property, jvmNameResolverComponent1, new TypeTable(typeTable), metadataVersionComponent3, new Function2() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$$Lambda$1
                    @Override // p852kotlin.jvm.functions.Function2
                    public Object invoke(Object obj, Object obj2) {
                        return KPackageImpl.getLocalProperty$lambda$3$lambda$2$lambda$1((MemberDeserializer) obj, (ProtoBuf.Property) obj2);
                    }
                });
            }
        }
        return null;
    }

    @Override // p852kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        return this.data.getValue().getMembers();
    }

    @Override // p852kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Class<?> getMethodOwner() {
        Class<?> multifileFacade = this.data.getValue().getMultifileFacade();
        return multifileFacade == null ? getJClass() : multifileFacade;
    }

    @Override // p852kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<PropertyDescriptor> getProperties(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getScope().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    @NotNull
    public String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(getJClass()).asSingleFqName();
    }

    @Override // p852kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        return CollectionsKt.emptyList();
    }

    public int hashCode() {
        return getJClass().hashCode();
    }
}
