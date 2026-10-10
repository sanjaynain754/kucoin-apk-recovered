package p852kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes61.dex */
class BoundedByteString extends LiteralByteString {
    private final int bytesLength;
    private final int bytesOffset;

    public class BoundedByteIterator implements ByteString.ByteIterator {
        private final int limit;
        private int position;

        private BoundedByteIterator() {
            int offsetIntoBytes = BoundedByteString.this.getOffsetIntoBytes();
            this.position = offsetIntoBytes;
            this.limit = offsetIntoBytes + BoundedByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i11 = this.position;
            if (i11 >= this.limit) {
                throw new NoSuchElementException();
            }
            byte[] bArr = BoundedByteString.this.bytes;
            this.position = i11 + 1;
            return bArr[i11];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public byte byteAt(int i11) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < size()) {
            return this.bytes[this.bytesOffset + i11];
        }
        int size = size();
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i11, bArr, i12, i13);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new BoundedByteIterator();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.bytesLength;
    }

    public BoundedByteString(byte[] bArr, int i11, int i12) {
        super(bArr);
        if (i11 >= 0) {
            if (i12 >= 0) {
                if (((long) i11) + ((long) i12) <= bArr.length) {
                    this.bytesOffset = i11;
                    this.bytesLength = i12;
                    return;
                }
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Offset+Length too large: ");
                sb2.append(i11);
                sb2.append("+");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i11);
            throw new IllegalArgumentException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(29);
        sb4.append("Offset too small: ");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }
}
