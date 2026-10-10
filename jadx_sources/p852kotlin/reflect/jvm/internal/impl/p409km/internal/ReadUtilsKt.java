package p852kotlin.reflect.jvm.internal.impl.p409km.internal;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.UByte;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotation;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotationArgument;

/* JADX INFO: compiled from: ReadUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nReadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadUtils.kt\nkotlin/metadata/internal/ReadUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1617#2,9:65\n1869#2:74\n1870#2:76\n1626#2:77\n1617#2,9:78\n1869#2:87\n1870#2:89\n1626#2:90\n1#3:75\n1#3:88\n*S KotlinDebug\n*F\n+ 1 ReadUtils.kt\nkotlin/metadata/internal/ReadUtilsKt\n*L\n19#1:65,9\n19#1:74\n19#1:76\n19#1:77\n55#1:78,9\n55#1:87\n55#1:89\n55#1:90\n19#1:75\n55#1:88\n*E\n"})
public final class ReadUtilsKt {

    /* JADX INFO: compiled from: ReadUtils.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getClassName(@NotNull NameResolver nameResolver, int i11) {
        Intrinsics.checkNotNullParameter(nameResolver, "<this>");
        String qualifiedClassName = nameResolver.getQualifiedClassName(i11);
        if (!nameResolver.isLocalClassName(i11)) {
            return qualifiedClassName;
        }
        return '.' + qualifiedClassName;
    }

    @NotNull
    public static final KmAnnotation readAnnotation(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver strings) {
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        String className = getClassName(strings, annotation.getId());
        List<ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
        ArrayList arrayList = new ArrayList();
        for (ProtoBuf.Annotation.Argument argument : argumentList) {
            ProtoBuf.Annotation.Argument.Value value = argument.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            KmAnnotationArgument annotationArgument = readAnnotationArgument(value, strings);
            Pair pairM90091to = annotationArgument != null ? TuplesKt.m90091to(strings.getString(argument.getNameId()), annotationArgument) : null;
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return new KmAnnotation(className, MapsKt.toMap(arrayList));
    }

    @Nullable
    public static final KmAnnotationArgument readAnnotationArgument(@NotNull ProtoBuf.Annotation.Argument.Value value, @NotNull NameResolver strings) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (Flags.IS_UNSIGNED.get(value.getFlags()).booleanValue()) {
            ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
            int i11 = type != null ? WhenMappings.$EnumSwitchMapping$0[type.ordinal()] : -1;
            if (i11 == 1) {
                return new KmAnnotationArgument.UByteValue(UByte.m103862constructorimpl((byte) value.getIntValue()), defaultConstructorMarker);
            }
            if (i11 == 2) {
                return new KmAnnotationArgument.UShortValue(UShort.m104125constructorimpl((short) value.getIntValue()), defaultConstructorMarker);
            }
            if (i11 == 3) {
                return new KmAnnotationArgument.UIntValue(UInt.m103939constructorimpl((int) value.getIntValue()), defaultConstructorMarker);
            }
            if (i11 == 4) {
                return new KmAnnotationArgument.ULongValue(ULong.m104018constructorimpl(value.getIntValue()), defaultConstructorMarker);
            }
            throw new IllegalStateException(("Cannot read value of unsigned type: " + value.getType()).toString());
        }
        ProtoBuf.Annotation.Argument.Value.Type type2 = value.getType();
        switch (type2 != null ? WhenMappings.$EnumSwitchMapping$0[type2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new KmAnnotationArgument.ByteValue((byte) value.getIntValue());
            case 2:
                return new KmAnnotationArgument.ShortValue((short) value.getIntValue());
            case 3:
                return new KmAnnotationArgument.IntValue((int) value.getIntValue());
            case 4:
                return new KmAnnotationArgument.LongValue(value.getIntValue());
            case 5:
                return new KmAnnotationArgument.CharValue((char) value.getIntValue());
            case 6:
                return new KmAnnotationArgument.FloatValue(value.getFloatValue());
            case 7:
                return new KmAnnotationArgument.DoubleValue(value.getDoubleValue());
            case 8:
                return new KmAnnotationArgument.BooleanValue(value.getIntValue() != 0);
            case 9:
                return new KmAnnotationArgument.StringValue(strings.getString(value.getStringValue()));
            case 10:
                String className = getClassName(strings, value.getClassId());
                return value.getArrayDimensionCount() == 0 ? new KmAnnotationArgument.KClassValue(className) : new KmAnnotationArgument.ArrayKClassValue(className, value.getArrayDimensionCount());
            case 11:
                return new KmAnnotationArgument.EnumValue(getClassName(strings, value.getClassId()), strings.getString(value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                Intrinsics.checkNotNullExpressionValue(annotation, "getAnnotation(...)");
                return new KmAnnotationArgument.AnnotationValue(readAnnotation(annotation, strings));
            case 13:
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                Intrinsics.checkNotNullExpressionValue(arrayElementList, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument.Value value2 : arrayElementList) {
                    Intrinsics.checkNotNull(value2);
                    KmAnnotationArgument annotationArgument = readAnnotationArgument(value2, strings);
                    if (annotationArgument != null) {
                        arrayList.add(annotationArgument);
                    }
                }
                return new KmAnnotationArgument.ArrayValue(arrayList);
        }
    }
}
