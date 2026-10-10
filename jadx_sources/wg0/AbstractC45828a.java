package wg0;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.C41865p1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import tg0.InterfaceC44963p;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: wg0.a */
/* JADX INFO: compiled from: AbstractEncoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J%\u00106\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J%\u00108\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001b¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020 ¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020#¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020&¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020)¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020,¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bF\u0010GJA\u0010K\u001a\u00020\t\"\n\b\u0000\u0010H*\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\bK\u0010LJA\u0010M\u001a\u00020\t\"\b\b\u0000\u0010H*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bM\u0010L¨\u0006N"}, m90084d2 = {"Lwg0/a;", "Lwg0/c;", "Lwg0/b;", "<init>", "()V", "Lvg0/f;", "descriptor", "beginStructure", "(Lvg0/f;)Lwg0/b;", "", "endStructure", "(Lvg0/f;)V", "", "index", "", "encodeElement", "(Lvg0/f;I)Z", "", "value", "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "enumDescriptor", "encodeEnum", "(Lvg0/f;I)V", "encodeInline", "(Lvg0/f;)Lwg0/c;", "encodeBooleanElement", "(Lvg0/f;IZ)V", "encodeByteElement", "(Lvg0/f;IB)V", "encodeShortElement", "(Lvg0/f;IS)V", "encodeIntElement", "(Lvg0/f;II)V", "encodeLongElement", "(Lvg0/f;IJ)V", "encodeFloatElement", "(Lvg0/f;IF)V", "encodeDoubleElement", "(Lvg0/f;ID)V", "encodeCharElement", "(Lvg0/f;IC)V", "encodeStringElement", "(Lvg0/f;ILjava/lang/String;)V", "encodeInlineElement", "(Lvg0/f;I)Lwg0/c;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/p;", "serializer", "encodeSerializableElement", "(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V", "encodeNullableSerializableElement", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC45828a implements InterfaceC45830c, InterfaceC45829b {
    @Override // wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45829b beginStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeBooleanElement(@NotNull InterfaceC45533f descriptor, int index, boolean value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, index)) {
            encodeBoolean(value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeByteElement(@NotNull InterfaceC45533f descriptor, int index, byte value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, index)) {
            encodeByte(value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeCharElement(@NotNull InterfaceC45533f descriptor, int index, char value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, index)) {
            encodeChar(value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeDoubleElement(@NotNull InterfaceC45533f descriptor, int index, double value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, index)) {
            encodeDouble(value);
        }
    }

    public boolean encodeElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // wg0.InterfaceC45830c
    public void encodeEnum(@NotNull InterfaceC45533f enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(index));
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeFloatElement(@NotNull InterfaceC45533f descriptor, int index, float value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, index)) {
            encodeFloat(value);
        }
    }

    @Override // wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45830c encodeInline(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // wg0.InterfaceC45829b
    @NotNull
    public final InterfaceC45830c encodeInlineElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return encodeElement(descriptor, index) ? encodeInline(descriptor.mo91525d(index)) : C41865p1.f92000a;
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeIntElement(@NotNull InterfaceC45533f descriptor, int index, int value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, index)) {
            encodeInt(value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeLongElement(@NotNull InterfaceC45533f descriptor, int index, long value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, index)) {
            encodeLong(value);
        }
    }

    @Override // wg0.InterfaceC45830c
    public void encodeNull() {
        throw new SerializationException("'null' is not supported by default");
    }

    public <T> void encodeNullableSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44963p<? super T> serializer, @Nullable T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, index)) {
            encodeNullableSerializableValue(serializer, value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public <T> void encodeSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44963p<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (encodeElement(descriptor, index)) {
            encodeSerializableValue(serializer, value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeShortElement(@NotNull InterfaceC45533f descriptor, int index, short value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (encodeElement(descriptor, index)) {
            encodeShort(value);
        }
    }

    @Override // wg0.InterfaceC45829b
    public final void encodeStringElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (encodeElement(descriptor, index)) {
            encodeString(value);
        }
    }

    public void endStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45829b beginCollection(@NotNull InterfaceC45533f interfaceC45533f, int i11) {
        return InterfaceC45830c.a.m101244a(this, interfaceC45533f, i11);
    }

    @Override // wg0.InterfaceC45830c
    public void encodeBoolean(boolean value) {
        encodeValue(Boolean.valueOf(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeByte(byte value) {
        encodeValue(Byte.valueOf(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeChar(char value) {
        encodeValue(Character.valueOf(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeDouble(double value) {
        encodeValue(Double.valueOf(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeFloat(float value) {
        encodeValue(Float.valueOf(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeInt(int value) {
        encodeValue(Integer.valueOf(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeLong(long value) {
        encodeValue(Long.valueOf(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeNotNullMark() {
        InterfaceC45830c.a.m101245b(this);
    }

    public <T> void encodeNullableSerializableValue(@NotNull InterfaceC44963p<? super T> interfaceC44963p, @Nullable T t11) {
        InterfaceC45830c.a.m101246c(this, interfaceC44963p, t11);
    }

    @Override // wg0.InterfaceC45830c
    public <T> void encodeSerializableValue(@NotNull InterfaceC44963p<? super T> interfaceC44963p, T t11) {
        InterfaceC45830c.a.m101247d(this, interfaceC44963p, t11);
    }

    @Override // wg0.InterfaceC45830c
    public void encodeShort(short value) {
        encodeValue(Short.valueOf(value));
    }

    @Override // wg0.InterfaceC45830c
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        encodeValue(value);
    }

    public void encodeValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(value.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(getClass()) + " encoder");
    }

    public boolean shouldEncodeElementDefault(@NotNull InterfaceC45533f interfaceC45533f, int i11) {
        return InterfaceC45829b.a.m101243a(this, interfaceC45533f, i11);
    }
}
