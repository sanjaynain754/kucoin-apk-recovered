package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private OutputStream output;
    private final ProtobufValueEncoderContext valueEncoderContext = new ProtobufValueEncoderContext(this);
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final FieldDescriptor MAP_KEY_DESC = FieldDescriptor.builder("key").withProperty(AtProtobuf.builder().tag(1).build()).build();
    private static final FieldDescriptor MAP_VALUE_DESC = FieldDescriptor.builder("value").withProperty(AtProtobuf.builder().tag(2).build()).build();
    private static final ObjectEncoder<Map.Entry<Object, Object>> DEFAULT_MAP_ENCODER = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.a
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            ProtobufDataEncoderContext.m13756a((Map.Entry) obj, objectEncoderContext);
        }
    };

    private <T> ProtobufDataEncoderContext doEncode(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t11, boolean z11) throws IOException {
        long jDetermineSize = determineSize(objectEncoder, t11);
        if (z11 && jDetermineSize == 0) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
        writeVarInt64(jDetermineSize);
        objectEncoder.encode(t11, this);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.m13752of(str));
    }

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1 */
    public static /* synthetic */ class C86831 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding */
        static final /* synthetic */ int[] f12519x531607dd;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f12519x531607dd = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12519x531607dd[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12519x531607dd[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13756a(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(MAP_KEY_DESC, entry.getKey());
        objectEncoderContext.add(MAP_VALUE_DESC, entry.getValue());
    }

    private <T> long determineSize(ObjectEncoder<T> objectEncoder, T t11) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.output;
            this.output = lengthCountingOutputStream;
            try {
                objectEncoder.encode(t11, this);
                this.output = outputStream;
                long length = lengthCountingOutputStream.getLength();
                lengthCountingOutputStream.close();
                return length;
            } catch (Throwable th2) {
                this.output = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static Protobuf getProtobuf(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int getTag(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void writeVarInt32(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            this.output.write((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.output.write(i11 & 127);
    }

    private void writeVarInt64(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            this.output.write((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.output.write(((int) j11) & 127);
    }

    public ProtobufDataEncoderContext encode(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.output = outputStream;
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    private static ByteBuffer allocateBuffer(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        return encode(obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        return add(FieldDescriptor.m13752of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, double d11) throws IOException {
        return add(FieldDescriptor.m13752of(str), d11);
    }

    private <T> ProtobufDataEncoderContext doEncode(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t11, boolean z11) throws IOException {
        this.valueEncoderContext.resetContext(fieldDescriptor, z11);
        valueEncoder.encode(t11, this.valueEncoderContext);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, int i11) throws IOException {
        return add(FieldDescriptor.m13752of(str), i11);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, long j11) throws IOException {
        return add(FieldDescriptor.m13752of(str), j11);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, boolean z11) throws IOException {
        return add(FieldDescriptor.m13752of(str), z11);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return add(fieldDescriptor, obj, true);
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z11) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z11 || charSequence.length() != 0) {
                    writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(UTF_8);
                    writeVarInt32(bytes.length);
                    this.output.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    add(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    doEncode((ObjectEncoder<Map.Entry>) DEFAULT_MAP_ENCODER, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return add(fieldDescriptor, ((Double) obj).doubleValue(), z11);
                }
                if (obj instanceof Float) {
                    return add(fieldDescriptor, ((Float) obj).floatValue(), z11);
                }
                if (obj instanceof Number) {
                    return add(fieldDescriptor, ((Number) obj).longValue(), z11);
                }
                if (obj instanceof Boolean) {
                    return add(fieldDescriptor, ((Boolean) obj).booleanValue(), z11);
                }
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (!z11 || bArr.length != 0) {
                        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                        writeVarInt32(bArr.length);
                        this.output.write(bArr);
                        return this;
                    }
                } else {
                    ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
                    if (objectEncoder != null) {
                        return doEncode(objectEncoder, fieldDescriptor, obj, z11);
                    }
                    ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
                    if (valueEncoder != null) {
                        return doEncode(valueEncoder, fieldDescriptor, obj, z11);
                    }
                    if (obj instanceof ProtoEnum) {
                        return add(fieldDescriptor, ((ProtoEnum) obj).getNumber());
                    }
                    if (obj instanceof Enum) {
                        return add(fieldDescriptor, ((Enum) obj).ordinal());
                    }
                    return doEncode(this.fallbackEncoder, fieldDescriptor, obj, z11);
                }
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d11) throws IOException {
        return add(fieldDescriptor, d11, true);
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d11, boolean z11) throws IOException {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 1);
        this.output.write(allocateBuffer(8).putDouble(d11).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f11) throws IOException {
        return add(fieldDescriptor, f11, true);
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f11, boolean z11) throws IOException {
        if (z11 && f11 == 0.0f) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 5);
        this.output.write(allocateBuffer(4).putFloat(f11).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i11) throws IOException {
        return add(fieldDescriptor, i11, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i11, boolean z11) throws IOException {
        if (!z11 || i11 != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i12 = C86831.f12519x531607dd[protobuf.intEncoding().ordinal()];
            if (i12 == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32(i11);
                return this;
            }
            if (i12 == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32((i11 << 1) ^ (i11 >> 31));
                return this;
            }
            if (i12 == 3) {
                writeVarInt32((protobuf.tag() << 3) | 5);
                this.output.write(allocateBuffer(4).putInt(i11).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j11) throws IOException {
        return add(fieldDescriptor, j11, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j11, boolean z11) throws IOException {
        if (!z11 || j11 != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i11 = C86831.f12519x531607dd[protobuf.intEncoding().ordinal()];
            if (i11 == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64(j11);
                return this;
            }
            if (i11 == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64((j11 >> 63) ^ (j11 << 1));
                return this;
            }
            if (i11 == 3) {
                writeVarInt32((protobuf.tag() << 3) | 1);
                this.output.write(allocateBuffer(8).putLong(j11).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z11) throws IOException {
        return add(fieldDescriptor, z11, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z11, boolean z12) throws IOException {
        return add(fieldDescriptor, z11 ? 1 : 0, z12);
    }
}
