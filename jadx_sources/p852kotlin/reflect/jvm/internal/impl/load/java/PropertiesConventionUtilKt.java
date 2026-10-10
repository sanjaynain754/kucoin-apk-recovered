package p852kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: propertiesConventionUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\npropertiesConventionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n774#2:103\n865#2,2:104\n*S KotlinDebug\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n*L\n90#1:103\n90#1:104,2\n*E\n"})
public final class PropertiesConventionUtilKt {
    @NotNull
    public static final List<Name> getPropertyNamesCandidatesByAccessorName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        if (JvmAbi.isGetterName(strAsString)) {
            return CollectionsKt.listOfNotNull(propertyNameByGetMethodName(name));
        }
        return JvmAbi.isSetterName(strAsString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    @Nullable
    public static final Name propertyNameByGetMethodName(@NotNull Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Name namePropertyNameFromAccessorMethodName$default = propertyNameFromAccessorMethodName$default(methodName, "get", false, null, 12, null);
        return namePropertyNameFromAccessorMethodName$default == null ? propertyNameFromAccessorMethodName$default(methodName, "is", false, null, 8, null) : namePropertyNameFromAccessorMethodName$default;
    }

    @Nullable
    public static final Name propertyNameBySetMethodName(@NotNull Name methodName, boolean z11) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return propertyNameFromAccessorMethodName$default(methodName, "set", false, z11 ? "is" : null, 4, null);
    }

    public static /* synthetic */ Name propertyNameFromAccessorMethodName$default(Name name, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        return propertyNameFromAccessorMethodName(name, str, z11, str2);
    }

    @NotNull
    public static final List<Name> propertyNamesBySetMethodName(@NotNull Name methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return CollectionsKt.listOfNotNull((Object[]) new Name[]{propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true)});
    }

    private static final Name propertyNameFromAccessorMethodName(Name name, String str, boolean z11, String str2) {
        if (name.isSpecial()) {
            return null;
        }
        String identifier = name.getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
        if (!StringsKt.startsWith$default(identifier, str, false, 2, (Object) null) || identifier.length() == str.length()) {
            return null;
        }
        char cCharAt = identifier.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Name.identifier(str2 + StringsKt.removePrefix(identifier, (CharSequence) str));
        }
        if (!z11) {
            return name;
        }
        String strDecapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(StringsKt.removePrefix(identifier, (CharSequence) str), true);
        if (!Name.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
            return null;
        }
        return Name.identifier(strDecapitalizeSmartForCompiler);
    }
}
