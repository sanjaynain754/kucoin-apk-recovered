package kotlinx.serialization.encoding;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44949c;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.encoding.a */
/* JADX INFO: compiled from: AbstractDecoder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J5\u00102\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010\u00052\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\n\b\u0002\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00122\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00152\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00182\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020!2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020$2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010MJ=\u0010N\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bN\u0010OJC\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010.*\u00020\u00052\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bP\u0010O¨\u0006Q"}, m90084d2 = {"Lkotlinx/serialization/encoding/a;", "Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "", "decodeValue", "()Ljava/lang/Object;", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "", "decodeString", "()Ljava/lang/String;", "Lvg0/f;", "enumDescriptor", "decodeEnum", "(Lvg0/f;)I", "descriptor", "decodeInline", "(Lvg0/f;)Lkotlinx/serialization/encoding/b;", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/c;", "deserializer", "previousValue", "decodeSerializableValue", "(Ltg0/c;Ljava/lang/Object;)Ljava/lang/Object;", "beginStructure", "(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lvg0/f;)V", "index", "decodeBooleanElement", "(Lvg0/f;I)Z", "decodeByteElement", "(Lvg0/f;I)B", "decodeShortElement", "(Lvg0/f;I)S", "decodeIntElement", "(Lvg0/f;I)I", "decodeLongElement", "(Lvg0/f;I)J", "decodeFloatElement", "(Lvg0/f;I)F", "decodeDoubleElement", "(Lvg0/f;I)D", "decodeCharElement", "(Lvg0/f;I)C", "decodeStringElement", "(Lvg0/f;I)Ljava/lang/String;", "decodeInlineElement", "(Lvg0/f;I)Lkotlinx/serialization/encoding/b;", "decodeSerializableElement", "(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbstractDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,81:1\n270#2,2:82\n*S KotlinDebug\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n*L\n77#1:82,2\n*E\n"})
public abstract class AbstractC41786a implements InterfaceC41787b, CompositeDecoder {
    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public <T> T decodeSerializableValue(@NotNull InterfaceC44949c<? extends T> interfaceC44949c) {
        return (T) InterfaceC41787b.a.m91416b(this, interfaceC44949c);
    }

    public static /* synthetic */ Object decodeSerializableValue$default(AbstractC41786a abstractC41786a, InterfaceC44949c interfaceC44949c, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        return abstractC41786a.decodeSerializableValue(interfaceC44949c, obj);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public CompositeDecoder beginStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public int decodeEnum(@NotNull InterfaceC45533f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public InterfaceC41787b decodeInline(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public InterfaceC41787b decodeInlineElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeInline(descriptor.mo91525d(index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @Nullable
    public final <T> T decodeNullableSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44949c<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().mo91523b() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer, previousValue) : (T) decodeNull();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(@NotNull InterfaceC45533f descriptor, int index, @NotNull InterfaceC44949c<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer, previousValue);
    }

    public <T> T decodeSerializableValue(@NotNull InterfaceC44949c<? extends T> deserializer, @Nullable T previousValue) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public final String decodeStringElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeString();
    }

    @NotNull
    public Object decodeValue() {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public boolean decodeBoolean() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objDecodeValue).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public byte decodeByte() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objDecodeValue).byteValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public char decodeChar() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objDecodeValue).charValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(@NotNull InterfaceC45533f interfaceC45533f) {
        return CompositeDecoder.C41785a.m91412a(this, interfaceC45533f);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public double decodeDouble() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objDecodeValue).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public float decodeFloat() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objDecodeValue).floatValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public int decodeInt() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objDecodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public long decodeLong() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objDecodeValue).longValue();
    }

    @Nullable
    public <T> T decodeNullableSerializableValue(@NotNull InterfaceC44949c<? extends T> interfaceC44949c) {
        return (T) InterfaceC41787b.a.m91415a(this, interfaceC44949c);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public boolean decodeSequentially() {
        return CompositeDecoder.C41785a.m91413b(this);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    public short decodeShort() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objDecodeValue).shortValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC41787b
    @NotNull
    public String decodeString() {
        Object objDecodeValue = decodeValue();
        Intrinsics.checkNotNull(objDecodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objDecodeValue;
    }
}
