package p852kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpecialNames.kt */
/* JADX INFO: loaded from: classes23.dex */
@SourceDebugExtension({"SMAP\nSpecialNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialNames.kt\norg/jetbrains/kotlin/name/SpecialNames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class SpecialNames {

    @JvmField
    @NotNull
    public static final Name ANONYMOUS;

    @JvmField
    @NotNull
    public static final FqName ANONYMOUS_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name ARRAY;

    @JvmField
    @NotNull
    public static final Name DEFAULT_NAME_FOR_COMPANION_OBJECT;

    @JvmField
    @NotNull
    public static final Name DESTRUCT;

    @JvmField
    @NotNull
    public static final Name ENUM_GET_ENTRIES;

    @JvmField
    @NotNull
    public static final Name IMPLICIT_SET_PARAMETER;

    @JvmField
    @NotNull
    public static final Name INIT;

    @NotNull
    public static final SpecialNames INSTANCE = new SpecialNames();

    @JvmField
    @NotNull
    public static final Name ITERATOR;

    @JvmField
    @NotNull
    public static final Name LOCAL;

    @JvmField
    @NotNull
    public static final Name NO_NAME_PROVIDED;

    @JvmField
    @NotNull
    public static final Name RECEIVER;

    @JvmField
    @NotNull
    public static final Name ROOT_PACKAGE;

    @JvmField
    @NotNull
    public static final Name SAFE_IDENTIFIER_FOR_NO_NAME;

    @JvmField
    @NotNull
    public static final Name THIS;

    @JvmField
    @NotNull
    public static final Name UNARY;

    @JvmField
    @NotNull
    public static final Name UNDERSCORE_FOR_UNUSED_VAR;

    @JvmField
    @NotNull
    public static final Name WHEN_SUBJECT;

    static {
        Name nameSpecial = Name.special("<no name provided>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(...)");
        NO_NAME_PROVIDED = nameSpecial;
        Name nameSpecial2 = Name.special("<root package>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial2, "special(...)");
        ROOT_PACKAGE = nameSpecial2;
        Name nameIdentifier = Name.identifier("Companion");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        DEFAULT_NAME_FOR_COMPANION_OBJECT = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        SAFE_IDENTIFIER_FOR_NO_NAME = nameIdentifier2;
        Name nameSpecial3 = Name.special("<anonymous>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial3, "special(...)");
        ANONYMOUS = nameSpecial3;
        FqName.Companion companion = FqName.Companion;
        Name nameSpecial4 = Name.special("<anonymous>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial4, "special(...)");
        ANONYMOUS_FQ_NAME = companion.topLevel(nameSpecial4);
        Name nameSpecial5 = Name.special("<unary>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial5, "special(...)");
        UNARY = nameSpecial5;
        Name nameSpecial6 = Name.special("<this>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial6, "special(...)");
        THIS = nameSpecial6;
        Name nameSpecial7 = Name.special("<init>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial7, "special(...)");
        INIT = nameSpecial7;
        Name nameSpecial8 = Name.special("<when-subject>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial8, "special(...)");
        WHEN_SUBJECT = nameSpecial8;
        Name nameSpecial9 = Name.special("<iterator>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial9, "special(...)");
        ITERATOR = nameSpecial9;
        Name nameSpecial10 = Name.special("<destruct>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial10, "special(...)");
        DESTRUCT = nameSpecial10;
        Name nameSpecial11 = Name.special("<local>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial11, "special(...)");
        LOCAL = nameSpecial11;
        Name nameSpecial12 = Name.special("<unused var>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial12, "special(...)");
        UNDERSCORE_FOR_UNUSED_VAR = nameSpecial12;
        Name nameSpecial13 = Name.special("<set-?>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial13, "special(...)");
        IMPLICIT_SET_PARAMETER = nameSpecial13;
        Name nameSpecial14 = Name.special("<array>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial14, "special(...)");
        ARRAY = nameSpecial14;
        Name nameSpecial15 = Name.special("<receiver>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial15, "special(...)");
        RECEIVER = nameSpecial15;
        Name nameSpecial16 = Name.special("<get-entries>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial16, "special(...)");
        ENUM_GET_ENTRIES = nameSpecial16;
    }

    @JvmStatic
    @NotNull
    public static final Name safeIdentifier(@Nullable Name name) {
        return (name == null || name.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : name;
    }

    private SpecialNames() {
    }

    public final boolean isSafeIdentifier(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        if (strAsString.length() > 0 && !name.isSpecial()) {
            return true;
        }
        return false;
    }
}
