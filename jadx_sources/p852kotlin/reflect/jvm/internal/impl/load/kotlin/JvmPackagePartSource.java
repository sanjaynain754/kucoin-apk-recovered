package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: JvmPackagePartSource.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJvmPackagePartSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackagePartSource.kt\norg/jetbrains/kotlin/load/kotlin/JvmPackagePartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class JvmPackagePartSource implements DeserializedContainerSource {

    @NotNull
    private final DeserializedContainerAbiStability abiStability;

    @NotNull
    private final JvmClassName className;

    @Nullable
    private final JvmClassName facadeClassName;

    @Nullable
    private final IncompatibleVersionErrorData<MetadataVersion> incompatibility;

    @Nullable
    private final KotlinJvmBinaryClass knownJvmBinaryClass;

    @NotNull
    private final String moduleName;

    @NotNull
    private final PreReleaseInfo preReleaseInfo;

    public JvmPackagePartSource(@NotNull JvmClassName className, @Nullable JvmClassName jvmClassName, @NotNull ProtoBuf.Package packageProto, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, @NotNull PreReleaseInfo preReleaseInfo, @NotNull DeserializedContainerAbiStability abiStability, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String string;
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(preReleaseInfo, "preReleaseInfo");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.className = className;
        this.facadeClassName = jvmClassName;
        this.incompatibility = incompatibleVersionErrorData;
        this.preReleaseInfo = preReleaseInfo;
        this.abiStability = abiStability;
        this.knownJvmBinaryClass = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.packageModuleName;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(packageProto, packageModuleName);
        this.moduleName = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @NotNull
    public final ClassId getClassId() {
        FqName packageFqName = getClassName().getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "getPackageFqName(...)");
        return new ClassId(packageFqName, getSimpleName());
    }

    @NotNull
    public JvmClassName getClassName() {
        return this.className;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Nullable
    public JvmClassName getFacadeClassName() {
        return this.facadeClassName;
    }

    @Nullable
    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.knownJvmBinaryClass;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    public String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + '\'';
    }

    @NotNull
    public String toString() {
        return JvmPackagePartSource.class.getSimpleName() + ": " + getClassName();
    }

    @NotNull
    public final Name getSimpleName() {
        String internalName = getClassName().getInternalName();
        Intrinsics.checkNotNullExpressionValue(internalName, "getInternalName(...)");
        Name nameIdentifier = Name.identifier(StringsKt.substringAfterLast$default(internalName, '/', (String) null, 2, (Object) null));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(@NotNull KotlinJvmBinaryClass kotlinClass, @NotNull ProtoBuf.Package packageProto, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z11, @NotNull DeserializedContainerAbiStability abiStability) {
        JvmClassName jvmClassNameByInternalName;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        JvmClassName jvmClassNameByClassId = JvmClassName.byClassId(kotlinClass.getClassId());
        Intrinsics.checkNotNullExpressionValue(jvmClassNameByClassId, "byClassId(...)");
        String multifileClassName = kotlinClass.getClassHeader().getMultifileClassName();
        if (multifileClassName != null) {
            jvmClassNameByInternalName = multifileClassName.length() > 0 ? JvmClassName.byInternalName(multifileClassName) : null;
        } else {
            jvmClassNameByInternalName = null;
        }
        this(jvmClassNameByClassId, jvmClassNameByInternalName, packageProto, nameResolver, incompatibleVersionErrorData, new PreReleaseInfo(z11, null, 2, null), abiStability, kotlinClass);
    }
}
