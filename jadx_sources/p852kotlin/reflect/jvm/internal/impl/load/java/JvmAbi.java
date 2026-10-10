package p852kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: JvmAbi.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmAbi {

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    @JvmField
    @NotNull
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;

    @JvmField
    @NotNull
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;

    @NotNull
    private static final ClassId REFLECTION_FACTORY_IMPL;

    @NotNull
    private static final ClassId REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        ClassId.Companion companion = ClassId.Companion;
        JVM_FIELD_ANNOTATION_CLASS_ID = companion.topLevel(fqName);
        REFLECTION_FACTORY_IMPL = companion.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION = ClassId.Companion.fromString$default(companion, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final String getterName(@NotNull String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (startsWithIsPrefix(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
    }

    @JvmStatic
    public static final boolean isGetterName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.startsWith$default(name, "get", false, 2, (Object) null) || StringsKt.startsWith$default(name, "is", false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean isSetterName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.startsWith$default(name, "set", false, 2, (Object) null);
    }

    @JvmStatic
    @NotNull
    public static final String setterName(@NotNull String propertyName) {
        String strCapitalizeAsciiOnly;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (startsWithIsPrefix(propertyName)) {
            strCapitalizeAsciiOnly = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(strCapitalizeAsciiOnly, "substring(...)");
        } else {
            strCapitalizeAsciiOnly = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
        }
        sb2.append(strCapitalizeAsciiOnly);
        return sb2.toString();
    }

    @JvmStatic
    public static final boolean startsWithIsPrefix(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!StringsKt.startsWith$default(name, "is", false, 2, (Object) null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return Intrinsics.compare(97, (int) cCharAt) > 0 || Intrinsics.compare((int) cCharAt, 122) > 0;
    }

    @NotNull
    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;
    }

    private JvmAbi() {
    }
}
