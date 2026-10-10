package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.UByte;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class KmAnnotationArgument {

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class AnnotationValue extends KmAnnotationArgument {

        @NotNull
        private final KmAnnotation annotation;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnnotationValue) && Intrinsics.areEqual(this.annotation, ((AnnotationValue) obj).annotation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnnotationValue(@NotNull KmAnnotation annotation) {
            super(null);
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.annotation = annotation;
        }

        @NotNull
        public final KmAnnotation getAnnotation() {
            return this.annotation;
        }

        public int hashCode() {
            return this.annotation.hashCode();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return "AnnotationValue(" + this.annotation + ')';
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    @SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\nkotlin/metadata/KmAnnotationArgument$ArrayKClassValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
    public static final class ArrayKClassValue extends KmAnnotationArgument {
        private final int arrayDimensionCount;

        @NotNull
        private final String className;

        @NotNull
        private final String stringRepresentation;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayKClassValue)) {
                return false;
            }
            ArrayKClassValue arrayKClassValue = (ArrayKClassValue) obj;
            return Intrinsics.areEqual(this.className, arrayKClassValue.className) && this.arrayDimensionCount == arrayKClassValue.arrayDimensionCount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayKClassValue(@NotNull String className, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(className, "className");
            this.className = className;
            this.arrayDimensionCount = i11;
            if (i11 <= 0) {
                throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ArrayKClassValue(");
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append("kotlin/Array<");
            }
            sb2.append(this.className);
            int i13 = this.arrayDimensionCount;
            for (int i14 = 0; i14 < i13; i14++) {
                sb2.append(">");
            }
            sb2.append(")");
            this.stringRepresentation = sb2.toString();
        }

        public final int getArrayDimensionCount() {
            return this.arrayDimensionCount;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        public int hashCode() {
            return (this.className.hashCode() * 31) + Integer.hashCode(this.arrayDimensionCount);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return this.stringRepresentation;
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class ArrayValue extends KmAnnotationArgument {

        @NotNull
        private final List<KmAnnotationArgument> elements;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArrayValue) && Intrinsics.areEqual(this.elements, ((ArrayValue) obj).elements);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ArrayValue(@NotNull List<? extends KmAnnotationArgument> elements) {
            super(null);
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }

        @NotNull
        public final List<KmAnnotationArgument> getElements() {
            return this.elements;
        }

        public int hashCode() {
            return this.elements.hashCode();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return "ArrayValue(" + this.elements + ')';
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class BooleanValue extends LiteralValue<Boolean> {
        private final boolean value;

        public BooleanValue(boolean z11) {
            super(null);
            this.value = z11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BooleanValue) && this.value == ((BooleanValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Boolean getValue() {
            return Boolean.valueOf(this.value);
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class ByteValue extends LiteralValue<Byte> {
        private final byte value;

        public ByteValue(byte b11) {
            super(null);
            this.value = b11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ByteValue) && this.value == ((ByteValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Byte getValue() {
            return Byte.valueOf(this.value);
        }

        public int hashCode() {
            return Byte.hashCode(this.value);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class CharValue extends LiteralValue<Character> {
        private final char value;

        public CharValue(char c11) {
            super(null);
            this.value = c11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CharValue) && this.value == ((CharValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Character getValue() {
            return Character.valueOf(this.value);
        }

        public int hashCode() {
            return Character.hashCode(this.value);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class DoubleValue extends LiteralValue<Double> {
        private final double value;

        public DoubleValue(double d11) {
            super(null);
            this.value = d11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoubleValue) && Double.compare(this.value, ((DoubleValue) obj).value) == 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Double getValue() {
            return Double.valueOf(this.value);
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class EnumValue extends KmAnnotationArgument {

        @NotNull
        private final String enumClassName;

        @NotNull
        private final String enumEntryName;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnumValue)) {
                return false;
            }
            EnumValue enumValue = (EnumValue) obj;
            return Intrinsics.areEqual(this.enumClassName, enumValue.enumClassName) && Intrinsics.areEqual(this.enumEntryName, enumValue.enumEntryName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumValue(@NotNull String enumClassName, @NotNull String enumEntryName) {
            super(null);
            Intrinsics.checkNotNullParameter(enumClassName, "enumClassName");
            Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
            this.enumClassName = enumClassName;
            this.enumEntryName = enumEntryName;
        }

        @NotNull
        public final String getEnumClassName() {
            return this.enumClassName;
        }

        @NotNull
        public final String getEnumEntryName() {
            return this.enumEntryName;
        }

        public int hashCode() {
            return (this.enumClassName.hashCode() * 31) + this.enumEntryName.hashCode();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return "EnumValue(" + this.enumClassName + '.' + this.enumEntryName + ')';
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class FloatValue extends LiteralValue<Float> {
        private final float value;

        public FloatValue(float f11) {
            super(null);
            this.value = f11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatValue) && Float.compare(this.value, ((FloatValue) obj).value) == 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Float getValue() {
            return Float.valueOf(this.value);
        }

        public int hashCode() {
            return Float.hashCode(this.value);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class IntValue extends LiteralValue<Integer> {
        private final int value;

        public IntValue(int i11) {
            super(null);
            this.value = i11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntValue) && this.value == ((IntValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Integer getValue() {
            return Integer.valueOf(this.value);
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class KClassValue extends KmAnnotationArgument {

        @NotNull
        private final String className;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KClassValue) && Intrinsics.areEqual(this.className, ((KClassValue) obj).className);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KClassValue(@NotNull String className) {
            super(null);
            Intrinsics.checkNotNullParameter(className, "className");
            this.className = className;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        public int hashCode() {
            return this.className.hashCode();
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return "KClassValue(" + this.className + ')';
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static abstract class LiteralValue<T> extends KmAnnotationArgument {
        public /* synthetic */ LiteralValue(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract T getValue();

        private LiteralValue() {
            super(null);
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotationArgument
        @NotNull
        public final String toString() {
            String string;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append('(');
            if (this instanceof StringValue) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append('\"');
                sb3.append((Object) ((StringValue) this).getValue());
                sb3.append('\"');
                string = sb3.toString();
            } else {
                string = getValue().toString();
            }
            sb2.append(string);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class LongValue extends LiteralValue<Long> {
        private final long value;

        public LongValue(long j11) {
            super(null);
            this.value = j11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LongValue) && this.value == ((LongValue) obj).value;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Long getValue() {
            return Long.valueOf(this.value);
        }

        public int hashCode() {
            return Long.hashCode(this.value);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class ShortValue extends LiteralValue<Short> {
        private final short value;

        public ShortValue(short s11) {
            super(null);
            this.value = s11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShortValue) && this.value == ((ShortValue) obj).value;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Short getValue() {
            return Short.valueOf(this.value);
        }

        public int hashCode() {
            return Short.hashCode(this.value);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class StringValue extends LiteralValue<String> {

        @NotNull
        private final String value;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringValue) && Intrinsics.areEqual(this.value, ((StringValue) obj).value);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringValue(@NotNull String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class UByteValue extends LiteralValue<UByte> {
        private final byte value;

        public /* synthetic */ UByteValue(byte b11, DefaultConstructorMarker defaultConstructorMarker) {
            this(b11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UByteValue) && this.value == ((UByteValue) obj).value;
        }

        private UByteValue(byte b11) {
            super(null);
            this.value = b11;
        }

        /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name */
        public byte m105119getValuew2LRezQ() {
            return this.value;
        }

        public int hashCode() {
            return UByte.m103874hashCodeimpl(this.value);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* bridge */ /* synthetic */ UByte getValue() {
            return UByte.m103856boximpl(m105119getValuew2LRezQ());
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class UIntValue extends LiteralValue<UInt> {
        private final int value;

        public /* synthetic */ UIntValue(int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UIntValue) && this.value == ((UIntValue) obj).value;
        }

        private UIntValue(int i11) {
            super(null);
            this.value = i11;
        }

        /* JADX INFO: renamed from: getValue-pVg5ArA, reason: not valid java name */
        public int m105120getValuepVg5ArA() {
            return this.value;
        }

        public int hashCode() {
            return UInt.m103951hashCodeimpl(this.value);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* bridge */ /* synthetic */ UInt getValue() {
            return UInt.m103933boximpl(m105120getValuepVg5ArA());
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class ULongValue extends LiteralValue<ULong> {
        private final long value;

        public /* synthetic */ ULongValue(long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ULongValue) && this.value == ((ULongValue) obj).value;
        }

        private ULongValue(long j11) {
            super(null);
            this.value = j11;
        }

        /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name */
        public long m105121getValuesVKNKU() {
            return this.value;
        }

        public int hashCode() {
            return ULong.m104030hashCodeimpl(this.value);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* bridge */ /* synthetic */ ULong getValue() {
            return ULong.m104012boximpl(m105121getValuesVKNKU());
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class UShortValue extends LiteralValue<UShort> {
        private final short value;

        public /* synthetic */ UShortValue(short s11, DefaultConstructorMarker defaultConstructorMarker) {
            this(s11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UShortValue) && this.value == ((UShortValue) obj).value;
        }

        private UShortValue(short s11) {
            super(null);
            this.value = s11;
        }

        /* JADX INFO: renamed from: getValue-Mh2AYeg, reason: not valid java name */
        public short m105122getValueMh2AYeg() {
            return this.value;
        }

        public int hashCode() {
            return UShort.m104137hashCodeimpl(this.value);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* bridge */ /* synthetic */ UShort getValue() {
            return UShort.m104119boximpl(m105122getValueMh2AYeg());
        }
    }

    public /* synthetic */ KmAnnotationArgument(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String toString();

    private KmAnnotationArgument() {
    }
}
