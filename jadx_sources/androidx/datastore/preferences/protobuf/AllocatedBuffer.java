package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
@CheckReturnValue
abstract class AllocatedBuffer {
    public static AllocatedBuffer wrap(byte[] bArr) {
        return wrapNoCheck(bArr, 0, bArr.length);
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    @CanIgnoreReturnValue
    public abstract AllocatedBuffer position(int i11);

    public abstract int remaining();

    public static AllocatedBuffer wrap(byte[] bArr, int i11, int i12) {
        if (i11 < 0 || i12 < 0 || i11 + i12 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        return wrapNoCheck(bArr, i11, i12);
    }

    private static AllocatedBuffer wrapNoCheck(final byte[] bArr, final int i11, final int i12) {
        return new AllocatedBuffer() { // from class: androidx.datastore.preferences.protobuf.AllocatedBuffer.2
            private int position;

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return true;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return false;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int position() {
                return this.position;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public byte[] array() {
                return bArr;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return i11;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int limit() {
                return i12;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                throw new UnsupportedOperationException();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i13) {
                if (i13 >= 0 && i13 <= i12) {
                    this.position = i13;
                    return this;
                }
                throw new IllegalArgumentException("Invalid position: " + i13);
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int remaining() {
                return i12 - this.position;
            }
        };
    }

    public static AllocatedBuffer wrap(final ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer() { // from class: androidx.datastore.preferences.protobuf.AllocatedBuffer.1
            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return true;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int position() {
                return byteBuffer.position();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public byte[] array() {
                return byteBuffer.array();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return byteBuffer.arrayOffset();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return byteBuffer.hasArray();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int limit() {
                return byteBuffer.limit();
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public AllocatedBuffer position(int i11) {
                Java8Compatibility.position(byteBuffer, i11);
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int remaining() {
                return byteBuffer.remaining();
            }
        };
    }
}
