package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: compiled from: ClassDeserializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nClassDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n295#3,2:93\n*S KotlinDebug\n*F\n+ 1 ClassDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/ClassDeserializer\n*L\n57#1:93,2\n*E\n"})
public final class ClassDeserializer {

    @NotNull
    private final Function1<ClassKey, ClassDescriptor> classes;

    @NotNull
    private final DeserializationComponents components;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<ClassId> BLACK_LIST = SetsKt.setOf(ClassId.Companion.topLevel(StandardNames.FqNames.cloneable.toSafe()));

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class ClassKey {

        @Nullable
        private final ClassData classData;

        @NotNull
        private final ClassId classId;

        public ClassKey(@NotNull ClassId classId, @Nullable ClassData classData) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.classId = classId;
            this.classData = classData;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof ClassKey) && Intrinsics.areEqual(this.classId, ((ClassKey) obj).classId);
        }

        @Nullable
        public final ClassData getClassData() {
            return this.classData;
        }

        @NotNull
        public final ClassId getClassId() {
            return this.classId;
        }

        public int hashCode() {
            return this.classId.hashCode();
        }
    }

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.BLACK_LIST;
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.components = components;
        this.classes = components.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$$Lambda$0
            private final ClassDeserializer arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ClassDeserializer.classes$lambda$0(this.arg$0, (ClassDeserializer.ClassKey) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor classes$lambda$0(ClassDeserializer classDeserializer, ClassKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return classDeserializer.createClass(key);
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId, @Nullable ClassData classData) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return this.classes.invoke(new ClassKey(classId, classData));
    }

    private final ClassDescriptor createClass(ClassKey classKey) {
        Object next;
        DeserializationContext deserializationContextCreateContext;
        PackageFragmentDescriptor packageFragmentDescriptor;
        DeserializedClassDescriptor deserializedClassDescriptor;
        ClassId classId = classKey.getClassId();
        Iterator<ClassDescriptorFactory> it = this.components.getFictitiousClassDescriptorFactories().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorCreateClass = it.next().createClass(classId);
            if (classDescriptorCreateClass != null) {
                return classDescriptorCreateClass;
            }
        }
        if (BLACK_LIST.contains(classId)) {
            return null;
        }
        ClassData classData = classKey.getClassData();
        if (classData == null && (classData = this.components.getClassDataFinder().findClassData(classId)) == null) {
            return null;
        }
        NameResolver nameResolverComponent1 = classData.component1();
        ProtoBuf.Class classComponent2 = classData.component2();
        BinaryVersion binaryVersionComponent3 = classData.component3();
        SourceElement sourceElementComponent4 = classData.component4();
        ClassId outerClassId = classId.getOuterClassId();
        if (outerClassId != null) {
            ClassDescriptor classDescriptorDeserializeClass$default = deserializeClass$default(this, outerClassId, null, 2, null);
            if (classDescriptorDeserializeClass$default instanceof DeserializedClassDescriptor) {
                deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptorDeserializeClass$default;
            } else {
                deserializedClassDescriptor = null;
            }
            if (deserializedClassDescriptor == null || !deserializedClassDescriptor.hasNestedClass$deserialization(classId.getShortClassName())) {
                return null;
            }
            deserializationContextCreateContext = deserializedClassDescriptor.getC();
        } else {
            Iterator<T> it2 = PackageFragmentProviderKt.packageFragments(this.components.getPackageFragmentProvider(), classId.getPackageFqName()).iterator();
            do {
                if (it2.hasNext()) {
                    next = it2.next();
                    packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                    if (!(packageFragmentDescriptor instanceof DeserializedPackageFragment)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!((DeserializedPackageFragment) packageFragmentDescriptor).hasTopLevelClass(classId.getShortClassName()));
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            DeserializationComponents deserializationComponents = this.components;
            ProtoBuf.TypeTable typeTable = classComponent2.getTypeTable();
            Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
            TypeTable typeTable2 = new TypeTable(typeTable);
            VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
            ProtoBuf.VersionRequirementTable versionRequirementTable = classComponent2.getVersionRequirementTable();
            Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "getVersionRequirementTable(...)");
            deserializationContextCreateContext = deserializationComponents.createContext(packageFragmentDescriptor2, nameResolverComponent1, typeTable2, companion.create(versionRequirementTable), binaryVersionComponent3, null);
            binaryVersionComponent3 = binaryVersionComponent3;
        }
        return new DeserializedClassDescriptor(deserializationContextCreateContext, classComponent2, nameResolverComponent1, binaryVersionComponent3, sourceElementComponent4);
    }
}
