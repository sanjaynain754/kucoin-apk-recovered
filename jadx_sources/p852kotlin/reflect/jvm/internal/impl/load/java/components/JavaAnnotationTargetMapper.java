package p852kotlin.reflect.jvm.internal.impl.load.java.components;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n808#2,11:183\n1374#2:194\n1460#2,5:195\n1563#2:200\n1634#2,3:201\n*S KotlinDebug\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n*L\n153#1:183,11\n154#1:194\n154#1:195,5\n155#1:200\n155#1:201,3\n*E\n"})
public final class JavaAnnotationTargetMapper {

    @NotNull
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();

    @NotNull
    private static final Map<String, EnumSet<KotlinTarget>> targetNameLists = MapsKt.mapOf(TuplesKt.m90091to("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), TuplesKt.m90091to(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), TuplesKt.m90091to("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), TuplesKt.m90091to("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), TuplesKt.m90091to("FIELD", EnumSet.of(KotlinTarget.FIELD)), TuplesKt.m90091to("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), TuplesKt.m90091to("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), TuplesKt.m90091to("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), TuplesKt.m90091to("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), TuplesKt.m90091to("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    @NotNull
    private static final Map<String, KotlinRetention> retentionNameList = MapsKt.mapOf(TuplesKt.m90091to("RUNTIME", KotlinRetention.RUNTIME), TuplesKt.m90091to("CLASS", KotlinRetention.BINARY), TuplesKt.m90091to("SOURCE", KotlinRetention.SOURCE));

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType mapJavaTargetArguments$lambda$2(ModuleDescriptor module) {
        KotlinType type;
        Intrinsics.checkNotNullParameter(module, "module");
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), module.getBuiltIns().getBuiltInClassByFqName(StandardNames.FqNames.target));
        return (annotationParameterByName == null || (type = annotationParameterByName.getType()) == null) ? ErrorUtils.createErrorType(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }

    @Nullable
    public final ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(@Nullable JavaAnnotationArgument javaAnnotationArgument) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
        if (javaEnumValueAnnotationArgument != null) {
            Map<String, KotlinRetention> map = retentionNameList;
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            KotlinRetention kotlinRetention = map.get(entryName != null ? entryName.asString() : null);
            if (kotlinRetention != null) {
                ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.annotationRetention);
                Name nameIdentifier = Name.identifier(kotlinRetention.name());
                Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                return new EnumValue(classId, nameIdentifier);
            }
        }
        return null;
    }

    @NotNull
    public final Set<KotlinTarget> mapJavaTargetArgumentByName(@Nullable String str) {
        EnumSet<KotlinTarget> enumSet = targetNameLists.get(str);
        return enumSet != null ? enumSet : SetsKt.emptySet();
    }

    @NotNull
    public final ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(@NotNull List<? extends JavaAnnotationArgument> arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList<JavaEnumValueAnnotationArgument> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            CollectionsKt.addAll(arrayList2, javaAnnotationTargetMapper.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.annotationTarget);
            Name nameIdentifier = Name.identifier(kotlinTarget.name());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            arrayList3.add(new EnumValue(classId, nameIdentifier));
        }
        return new ArrayValue(arrayList3, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj2) {
                return JavaAnnotationTargetMapper.mapJavaTargetArguments$lambda$2((ModuleDescriptor) obj2);
            }
        });
    }

    private JavaAnnotationTargetMapper() {
    }
}
