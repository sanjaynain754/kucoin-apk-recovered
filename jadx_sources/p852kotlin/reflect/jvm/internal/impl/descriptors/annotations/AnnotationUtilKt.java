package p852kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: annotationUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class AnnotationUtilKt {

    @NotNull
    private static final Name DEPRECATED_LEVEL_NAME;

    @NotNull
    private static final Name DEPRECATED_MESSAGE_NAME;

    @NotNull
    private static final Name DEPRECATED_REPLACE_WITH_NAME;

    @NotNull
    private static final Name REPLACE_WITH_EXPRESSION_NAME;

    @NotNull
    private static final Name REPLACE_WITH_IMPORTS_NAME;

    static {
        Name nameIdentifier = Name.identifier("message");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        DEPRECATED_MESSAGE_NAME = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("replaceWith");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        DEPRECATED_REPLACE_WITH_NAME = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier(FirebaseAnalytics.Param.LEVEL);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        DEPRECATED_LEVEL_NAME = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("expression");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        REPLACE_WITH_EXPRESSION_NAME = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("imports");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        REPLACE_WITH_IMPORTS_NAME = nameIdentifier5;
    }

    @NotNull
    public static final AnnotationDescriptor createDeprecatedAnnotation(@NotNull final KotlinBuiltIns kotlinBuiltIns, @NotNull String message, @NotNull String replaceWith, @NotNull String level, boolean z11) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        Intrinsics.checkNotNullParameter(level, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, MapsKt.mapOf(TuplesKt.m90091to(REPLACE_WITH_EXPRESSION_NAME, new StringValue(replaceWith)), TuplesKt.m90091to(REPLACE_WITH_IMPORTS_NAME, new ArrayValue(CollectionsKt.emptyList(), new Function1(kotlinBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$$Lambda$0
            private final KotlinBuiltIns arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AnnotationUtilKt.createDeprecatedAnnotation$lambda$0(this.arg$0, (ModuleDescriptor) obj);
            }

            {
                this.arg$0 = kotlinBuiltIns;
            }
        }))), false, 8, null);
        FqName fqName = StandardNames.FqNames.deprecated;
        Pair pairM90091to = TuplesKt.m90091to(DEPRECATED_MESSAGE_NAME, new StringValue(message));
        Pair pairM90091to2 = TuplesKt.m90091to(DEPRECATED_REPLACE_WITH_NAME, new AnnotationValue(builtInAnnotationDescriptor));
        Name name = DEPRECATED_LEVEL_NAME;
        ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.deprecationLevel);
        Name nameIdentifier = Name.identifier(level);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to(name, new EnumValue(classId, nameIdentifier))), z11);
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType createDeprecatedAnnotation$lambda$0(KotlinBuiltIns kotlinBuiltIns, ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType arrayType = module.getBuiltIns().getArrayType(Variance.INVARIANT, kotlinBuiltIns.getStringType());
        Intrinsics.checkNotNullExpressionValue(arrayType, "getArrayType(...)");
        return arrayType;
    }
}
