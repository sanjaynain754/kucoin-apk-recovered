package p852kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes61.dex */
class LiteralByteString extends ByteString {
    protected final byte[] bytes;
    private int hash = 0;

    public class LiteralByteIterator implements ByteString.ByteIterator {
        private final int limit;
        private int position;

        private LiteralByteIterator() {
            this.position = 0;
            this.limit = LiteralByteString.this.size();
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
            try {
                byte[] bArr = LiteralByteString.this.bytes;
                int i11 = this.position;
                this.position = i11 + 1;
                return bArr[i11];
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new NoSuchElementException(e11.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof LiteralByteString) {
            return equalsRange((LiteralByteString) obj, 0, size());
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int getOffsetIntoBytes() {
        return 0;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int getTreeDepth() {
        return 0;
    }

    public int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isBalanced() {
        return true;
    }

    public byte byteAt(int i11) {
        return this.bytes[i11];
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.bytes, i11, bArr, i12, i13);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new LiteralByteIterator();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialHash(int i11, int i12, int i13) {
        return hashCode(i11, this.bytes, getOffsetIntoBytes() + i12, i13);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int peekCachedHashCode() {
        return this.hash;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.bytes.length;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) throws UnsupportedEncodingException {
        return new String(this.bytes, getOffsetIntoBytes(), size(), str);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i11, int i12) throws IOException {
        outputStream.write(this.bytes, getOffsetIntoBytes() + i11, i12);
    }

    public LiteralByteString(byte[] bArr) {
        this.bytes = bArr;
    }

    public boolean equalsRange(LiteralByteString literalByteString, int i11, int i12) {
        if (i12 <= literalByteString.size()) {
            if (i11 + i12 <= literalByteString.size()) {
                byte[] bArr = this.bytes;
                byte[] bArr2 = literalByteString.bytes;
                int offsetIntoBytes = getOffsetIntoBytes() + i12;
                int offsetIntoBytes2 = getOffsetIntoBytes();
                int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i11;
                while (offsetIntoBytes2 < offsetIntoBytes) {
                    if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                        return false;
                    }
                    offsetIntoBytes2++;
                    offsetIntoBytes3++;
                }
                return true;
            }
            int size = literalByteString.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        int size2 = size();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i12);
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int offsetIntoBytes = getOffsetIntoBytes();
        return Utf8.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int partialIsValidUtf8(int i11, int i12, int i13) {
        int offsetIntoBytes = getOffsetIntoBytes() + i12;
        return Utf8.partialIsValidUtf8(i11, this.bytes, offsetIntoBytes, i13 + offsetIntoBytes);
    }

    public static int hashCode(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }
}
