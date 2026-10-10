package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p852kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;

/* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nDeserializedDescriptorResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n116#1,14:145\n116#1,14:159\n1#2:173\n*S KotlinDebug\n*F\n+ 1 DeserializedDescriptorResolver.kt\norg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver\n*L\n45#1:145,14\n60#1:159,14\n*E\n"})
public final class DeserializedDescriptorResolver {
    public DeserializationComponents components;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<KotlinClassHeader.Kind> KOTLIN_CLASS = SetsKt.setOf(KotlinClassHeader.Kind.CLASS);

    @NotNull
    private static final Set<KotlinClassHeader.Kind> KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART = SetsKt.setOf((Object[]) new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});

    @NotNull
    private static final MetadataVersion KOTLIN_1_1_EAP_METADATA_VERSION = new MetadataVersion(1, 1, 2);

    @NotNull
    private static final MetadataVersion KOTLIN_1_3_M1_METADATA_VERSION = new MetadataVersion(1, 1, 11);

    @NotNull
    private static final MetadataVersion KOTLIN_1_3_RC_METADATA_VERSION = new MetadataVersion(1, 1, 13);

    /* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final MetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.KOTLIN_1_3_RC_METADATA_VERSION;
        }
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents) {
        Intrinsics.checkNotNullParameter(deserializationComponents, "<set-?>");
        this.components = deserializationComponents;
    }

    @Nullable
    public final MemberScope createKotlinPackagePartScope(@NotNull PackageFragmentDescriptor descriptor, @NotNull KotlinJvmBinaryClass kotlinClass) {
        String[] strings;
        Pair<JvmNameResolver, ProtoBuf.Package> packageDataFrom;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        String[] data = readData(kotlinClass, KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART);
        if (data == null || (strings = kotlinClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            try {
                packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e11);
            }
        } catch (Throwable th2) {
            if (getSkipMetadataVersionCheck() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible(getOwnMetadataVersion())) {
                throw th2;
            }
            packageDataFrom = null;
        }
        if (packageDataFrom == null) {
            return null;
        }
        JvmNameResolver jvmNameResolverComponent1 = packageDataFrom.component1();
        ProtoBuf.Package packageComponent2 = packageDataFrom.component2();
        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinClass, packageComponent2, jvmNameResolverComponent1, getIncompatibility(kotlinClass), isPreReleaseInvisible(kotlinClass), getAbiStability(kotlinClass));
        return new DeserializedPackageMemberScope(descriptor, packageComponent2, jvmNameResolverComponent1, kotlinClass.getClassHeader().getMetadataVersion(), jvmPackagePartSource, getComponents(), "scope for " + jvmPackagePartSource + " in " + descriptor, new Function0() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return CollectionsKt.emptyList();
            }
        });
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        return null;
    }

    @Nullable
    public final ClassData readClassData$descriptors_jvm(@NotNull KotlinJvmBinaryClass kotlinClass) {
        String[] strings;
        Pair<JvmNameResolver, ProtoBuf.Class> classDataFrom;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        String[] data = readData(kotlinClass, KOTLIN_CLASS);
        if (data == null || (strings = kotlinClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            try {
                classDataFrom = JvmProtoBufUtil.readClassDataFrom(data, strings);
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e11);
            }
        } catch (Throwable th2) {
            if (getSkipMetadataVersionCheck() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible(getOwnMetadataVersion())) {
                throw th2;
            }
            classDataFrom = null;
        }
        if (classDataFrom == null) {
            return null;
        }
        return new ClassData(classDataFrom.component1(), classDataFrom.component2(), kotlinClass.getClassHeader().getMetadataVersion(), new KotlinJvmBinarySourceElement(kotlinClass, getIncompatibility(kotlinClass), new PreReleaseInfo(isPreReleaseInvisible(kotlinClass), null, 2, null), getAbiStability(kotlinClass)));
    }

    @Nullable
    public final ClassDescriptor resolveClass(@NotNull KotlinJvmBinaryClass kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        ClassData classData$descriptors_jvm = readClassData$descriptors_jvm(kotlinClass);
        if (classData$descriptors_jvm == null) {
            return null;
        }
        return getComponents().getClassDeserializer().deserializeClass(kotlinClass.getClassId(), classData$descriptors_jvm);
    }

    public final void setComponents(@NotNull DeserializationComponentsForJava components) {
        Intrinsics.checkNotNullParameter(components, "components");
        setComponents(components.getComponents());
    }

    private final DeserializedContainerAbiStability getAbiStability(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getAllowUnstableDependencies()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().isUnstableJvmIrBinary()) {
            return DeserializedContainerAbiStability.UNSTABLE;
        }
        return DeserializedContainerAbiStability.STABLE;
    }

    private final IncompatibleVersionErrorData<MetadataVersion> getIncompatibility(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (!getSkipMetadataVersionCheck() && !kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(getOwnMetadataVersion())) {
            return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), MetadataVersion.INSTANCE, getOwnMetadataVersion(), getOwnMetadataVersion().lastSupportedVersionWithThisLanguageVersion(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isStrictSemantics()), kotlinJvmBinaryClass.getLocation());
        }
        return null;
    }

    private final MetadataVersion getOwnMetadataVersion() {
        return getComponents().getConfiguration().getMetadataVersion();
    }

    private final boolean getSkipMetadataVersionCheck() {
        return getComponents().getConfiguration().getSkipMetadataVersionCheck();
    }

    private final boolean isCompiledWith13M1(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (!getComponents().getConfiguration().getSkipPrereleaseCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_3_M1_METADATA_VERSION)) {
            return true;
        }
        return false;
    }

    private final boolean isPreReleaseInvisible(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if ((getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || Intrinsics.areEqual(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_1_EAP_METADATA_VERSION))) || isCompiledWith13M1(kotlinJvmBinaryClass)) {
            return true;
        }
        return false;
    }

    private final String[] readData(KotlinJvmBinaryClass kotlinJvmBinaryClass, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null || !set.contains(classHeader.getKind())) {
            return null;
        }
        return data;
    }
}
