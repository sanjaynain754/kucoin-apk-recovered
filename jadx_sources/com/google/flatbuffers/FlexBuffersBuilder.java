package com.google.flatbuffers;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;

    /* JADX INFO: renamed from: bb */
    private final ReadWriteBuf f12712bb;
    private boolean finished;
    private final int flags;
    private Comparator<Value> keyComparator;
    private final HashMap<String, Integer> keyPool;
    private final ArrayList<Value> stack;
    private final HashMap<String, Integer> stringPool;

    public static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        public Value(int i11, int i12, int i13, long j11) {
            this.key = i11;
            this.type = i12;
            this.minBitWidth = i13;
            this.iValue = j11;
            this.dValue = Double.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i11, int i12) {
            return elemWidth(this.type, this.minBitWidth, this.iValue, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i11, int i12) {
            return ((~i11) + 1) & (i12 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        public static Value blob(int i11, int i12, int i13, int i14) {
            return new Value(i11, i13, i14, i12);
        }

        public static Value bool(int i11, boolean z11) {
            return new Value(i11, 26, 0, z11 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i11, int i12, long j11, int i13, int i14) {
            if (FlexBuffers.isTypeInline(i11)) {
                return i12;
            }
            for (int i15 = 1; i15 <= 32; i15 *= 2) {
                int iWidthUInBits = FlexBuffersBuilder.widthUInBits((int) (((long) ((paddingBytes(i13, i15) + i13) + (i14 * i15))) - j11));
                if ((1 << iWidthUInBits) == i15) {
                    return iWidthUInBits;
                }
            }
            return 3;
        }

        public static Value float32(int i11, float f11) {
            return new Value(i11, 3, 2, f11);
        }

        public static Value float64(int i11, double d11) {
            return new Value(i11, 3, 3, d11);
        }

        public static Value int16(int i11, int i12) {
            return new Value(i11, 1, 1, i12);
        }

        public static Value int32(int i11, int i12) {
            return new Value(i11, 1, 2, i12);
        }

        public static Value int64(int i11, long j11) {
            return new Value(i11, 1, 3, j11);
        }

        public static Value int8(int i11, int i12) {
            return new Value(i11, 1, 0, i12);
        }

        private static byte packedType(int i11, int i12) {
            return (byte) (i11 | (i12 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i11) {
            return packedType(storedWidth(i11), this.type);
        }

        private int storedWidth(int i11) {
            return FlexBuffers.isTypeInline(this.type) ? Math.max(this.minBitWidth, i11) : this.minBitWidth;
        }

        public static Value uInt16(int i11, int i12) {
            return new Value(i11, 2, 1, i12);
        }

        public static Value uInt32(int i11, int i12) {
            return new Value(i11, 2, 2, i12);
        }

        public static Value uInt64(int i11, long j11) {
            return new Value(i11, 2, 3, j11);
        }

        public static Value uInt8(int i11, int i12) {
            return new Value(i11, 2, 0, i12);
        }

        public Value(int i11, int i12, int i13, double d11) {
            this.key = i11;
            this.type = i12;
            this.minBitWidth = i13;
            this.dValue = d11;
            this.iValue = Long.MIN_VALUE;
        }
    }

    public FlexBuffersBuilder(int i11) {
        this(new ArrayReadWriteBuf(i11), 1);
    }

    private int align(int i11) {
        int i12 = 1 << i11;
        int iPaddingBytes = Value.paddingBytes(this.f12712bb.writePosition(), i12);
        while (true) {
            int i13 = iPaddingBytes - 1;
            if (iPaddingBytes == 0) {
                return i12;
            }
            this.f12712bb.put((byte) 0);
            iPaddingBytes = i13;
        }
    }

    private Value createKeyVector(int i11, int i12) {
        long j11 = i12;
        int iMax = Math.max(0, widthUInBits(j11));
        int i13 = i11;
        while (i13 < this.stack.size()) {
            int i14 = i13 + 1;
            iMax = Math.max(iMax, Value.elemWidth(4, 0, this.stack.get(i13).key, this.f12712bb.writePosition(), i14));
            i13 = i14;
        }
        int iAlign = align(iMax);
        writeInt(j11, iAlign);
        int iWritePosition = this.f12712bb.writePosition();
        while (i11 < this.stack.size()) {
            int i15 = this.stack.get(i11).key;
            writeOffset(this.stack.get(i11).key, iAlign);
            i11++;
        }
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), iMax, iWritePosition);
    }

    public static int widthUInBits(long j11) {
        if (j11 <= FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) {
            return 0;
        }
        if (j11 <= FlexBuffers.Unsigned.shortToUnsignedInt((short) -1)) {
            return 1;
        }
        return j11 <= FlexBuffers.Unsigned.intToUnsignedLong(-1) ? 2 : 3;
    }

    private Value writeBlob(int i11, byte[] bArr, int i12, boolean z11) {
        int iWidthUInBits = widthUInBits(bArr.length);
        writeInt(bArr.length, align(iWidthUInBits));
        int iWritePosition = this.f12712bb.writePosition();
        this.f12712bb.put(bArr, 0, bArr.length);
        if (z11) {
            this.f12712bb.put((byte) 0);
        }
        return Value.blob(i11, iWritePosition, i12, iWidthUInBits);
    }

    private void writeDouble(double d11, int i11) {
        if (i11 == 4) {
            this.f12712bb.putFloat((float) d11);
        } else if (i11 == 8) {
            this.f12712bb.putDouble(d11);
        }
    }

    private void writeInt(long j11, int i11) {
        if (i11 == 1) {
            this.f12712bb.put((byte) j11);
            return;
        }
        if (i11 == 2) {
            this.f12712bb.putShort((short) j11);
        } else if (i11 == 4) {
            this.f12712bb.putInt((int) j11);
        } else {
            if (i11 != 8) {
                return;
            }
            this.f12712bb.putLong(j11);
        }
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z11) {
        putBoolean(null, z11);
    }

    public void putFloat(float f11) {
        putFloat((String) null, f11);
    }

    public void putInt(int i11) {
        putInt((String) null, i11);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i11) {
        putUInt(null, i11);
    }

    public void putUInt64(BigInteger bigInteger) {
        putUInt64(null, bigInteger.longValue());
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    private Value createVector(int i11, int i12, int i13, boolean z11, boolean z12, Value value) {
        int i14;
        int typedVector;
        int i15 = i13;
        long j11 = i15;
        int iMax = Math.max(0, widthUInBits(j11));
        if (value != null) {
            iMax = Math.max(iMax, value.elemWidth(this.f12712bb.writePosition(), 0));
            i14 = 3;
        } else {
            i14 = 1;
        }
        int i16 = 4;
        int iMax2 = iMax;
        for (int i17 = i12; i17 < this.stack.size(); i17++) {
            iMax2 = Math.max(iMax2, this.stack.get(i17).elemWidth(this.f12712bb.writePosition(), i17 + i14));
            if (z11 && i17 == i12) {
                i16 = this.stack.get(i17).type;
                if (!FlexBuffers.isTypedVectorElementType(i16)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i18 = i12;
        int iAlign = align(iMax2);
        if (value != null) {
            writeOffset(value.iValue, iAlign);
            writeInt(1 << value.minBitWidth, iAlign);
        }
        if (!z12) {
            writeInt(j11, iAlign);
        }
        int iWritePosition = this.f12712bb.writePosition();
        for (int i19 = i18; i19 < this.stack.size(); i19++) {
            writeAny(this.stack.get(i19), iAlign);
        }
        if (!z11) {
            while (i18 < this.stack.size()) {
                this.f12712bb.put(this.stack.get(i18).storedPackedType(iMax2));
                i18++;
            }
        }
        if (value != null) {
            typedVector = 9;
        } else if (z11) {
            if (!z12) {
                i15 = 0;
            }
            typedVector = FlexBuffers.toTypedVector(i16, i15);
        } else {
            typedVector = 10;
        }
        return new Value(i11, typedVector, iMax2, iWritePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int iWritePosition = this.f12712bb.writePosition();
        if ((this.flags & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f12712bb.put(bytes, 0, bytes.length);
            this.f12712bb.put((byte) 0);
            this.keyPool.put(str, Integer.valueOf(iWritePosition));
            return iWritePosition;
        }
        Integer num = this.keyPool.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f12712bb.put(bytes2, 0, bytes2.length);
        this.f12712bb.put((byte) 0);
        this.keyPool.put(str, Integer.valueOf(iWritePosition));
        return iWritePosition;
    }

    private void putUInt64(String str, long j11) {
        this.stack.add(Value.uInt64(putKey(str), j11));
    }

    private void writeAny(Value value, int i11) {
        int i12 = value.type;
        if (i12 != 0 && i12 != 1 && i12 != 2) {
            if (i12 == 3) {
                writeDouble(value.dValue, i11);
                return;
            } else if (i12 != 26) {
                writeOffset(value.iValue, i11);
                return;
            }
        }
        writeInt(value.iValue, i11);
    }

    private void writeOffset(long j11, int i11) {
        writeInt((int) (((long) this.f12712bb.writePosition()) - j11), i11);
    }

    private Value writeString(int i11, String str) {
        return writeBlob(i11, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public ByteBuffer finish() {
        int iAlign = align(this.stack.get(0).elemWidth(this.f12712bb.writePosition(), 0));
        writeAny(this.stack.get(0), iAlign);
        this.f12712bb.put(this.stack.get(0).storedPackedType());
        this.f12712bb.put((byte) iAlign);
        this.finished = true;
        return ByteBuffer.wrap(this.f12712bb.data(), 0, this.f12712bb.writePosition());
    }

    public ReadWriteBuf getBuffer() {
        return this.f12712bb;
    }

    public int putBlob(String str, byte[] bArr) {
        Value valueWriteBlob = writeBlob(putKey(str), bArr, 25, false);
        this.stack.add(valueWriteBlob);
        return (int) valueWriteBlob.iValue;
    }

    public void putBoolean(String str, boolean z11) {
        this.stack.add(Value.bool(putKey(str), z11));
    }

    public void putFloat(String str, float f11) {
        this.stack.add(Value.float32(putKey(str), f11));
    }

    public void putInt(String str, int i11) {
        putInt(str, i11);
    }

    public int putString(String str, String str2) {
        int iPutKey = putKey(str);
        if ((this.flags & 2) == 0) {
            Value valueWriteString = writeString(iPutKey, str2);
            this.stack.add(valueWriteString);
            return (int) valueWriteString.iValue;
        }
        Integer num = this.stringPool.get(str2);
        if (num != null) {
            this.stack.add(Value.blob(iPutKey, num.intValue(), 5, widthUInBits(str2.length())));
            return num.intValue();
        }
        Value valueWriteString2 = writeString(iPutKey, str2);
        this.stringPool.put(str2, Integer.valueOf((int) valueWriteString2.iValue));
        this.stack.add(valueWriteString2);
        return (int) valueWriteString2.iValue;
    }

    public void putUInt(long j11) {
        putUInt(null, j11);
    }

    public int startMap() {
        return this.stack.size();
    }

    public int startVector() {
        return this.stack.size();
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i11) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i11);
    }

    private void putUInt(String str, long j11) {
        Value valueUInt64;
        int iPutKey = putKey(str);
        int iWidthUInBits = widthUInBits(j11);
        if (iWidthUInBits == 0) {
            valueUInt64 = Value.uInt8(iPutKey, (int) j11);
        } else if (iWidthUInBits == 1) {
            valueUInt64 = Value.uInt16(iPutKey, (int) j11);
        } else if (iWidthUInBits == 2) {
            valueUInt64 = Value.uInt32(iPutKey, (int) j11);
        } else {
            valueUInt64 = Value.uInt64(iPutKey, j11);
        }
        this.stack.add(valueUInt64);
    }

    public int endMap(String str, int i11) {
        int iPutKey = putKey(str);
        ArrayList<Value> arrayList = this.stack;
        Collections.sort(arrayList.subList(i11, arrayList.size()), this.keyComparator);
        Value valueCreateVector = createVector(iPutKey, i11, this.stack.size() - i11, false, false, createKeyVector(i11, this.stack.size() - i11));
        while (this.stack.size() > i11) {
            ArrayList<Value> arrayList2 = this.stack;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.stack.add(valueCreateVector);
        return (int) valueCreateVector.iValue;
    }

    public int endVector(String str, int i11, boolean z11, boolean z12) {
        Value valueCreateVector = createVector(putKey(str), i11, this.stack.size() - i11, z11, z12, null);
        while (this.stack.size() > i11) {
            ArrayList<Value> arrayList = this.stack;
            arrayList.remove(arrayList.size() - 1);
        }
        this.stack.add(valueCreateVector);
        return (int) valueCreateVector.iValue;
    }

    public void putFloat(double d11) {
        putFloat((String) null, d11);
    }

    public void putInt(String str, long j11) {
        int iPutKey = putKey(str);
        if (-128 <= j11 && j11 <= 127) {
            this.stack.add(Value.int8(iPutKey, (int) j11));
            return;
        }
        if (-32768 <= j11 && j11 <= 32767) {
            this.stack.add(Value.int16(iPutKey, (int) j11));
        } else if (-2147483648L <= j11 && j11 <= 2147483647L) {
            this.stack.add(Value.int32(iPutKey, (int) j11));
        } else {
            this.stack.add(Value.int64(iPutKey, j11));
        }
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf, int i11) {
        this.stack = new ArrayList<>();
        this.keyPool = new HashMap<>();
        this.stringPool = new HashMap<>();
        this.finished = false;
        this.keyComparator = new Comparator<Value>() { // from class: com.google.flatbuffers.FlexBuffersBuilder.1
            @Override // java.util.Comparator
            public int compare(Value value, Value value2) {
                byte b11;
                byte b12;
                int i12 = value.key;
                int i13 = value2.key;
                do {
                    b11 = FlexBuffersBuilder.this.f12712bb.get(i12);
                    b12 = FlexBuffersBuilder.this.f12712bb.get(i13);
                    if (b11 == 0) {
                        return b11 - b12;
                    }
                    i12++;
                    i13++;
                } while (b11 == b12);
                return b11 - b12;
            }
        };
        this.f12712bb = readWriteBuf;
        this.flags = i11;
    }

    public void putFloat(String str, double d11) {
        this.stack.add(Value.float64(putKey(str), d11));
    }

    public void putInt(long j11) {
        putInt((String) null, j11);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
