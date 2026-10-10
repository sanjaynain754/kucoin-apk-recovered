package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Bytes {

    @GwtCompatible
    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        public ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.array[this.start + i11] != byteArrayAsList.array[byteArrayAsList.start + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        public ByteArrayAsList(byte[] bArr, int i11, int i12) {
            this.array = bArr;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Byte) && Bytes.indexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return Byte.valueOf(this.array[this.start + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i11 = this.start; i11 < this.end; i11++) {
                iHashCode = (iHashCode * 31) + Bytes.hashCode(this.array[i11]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Byte) || (iIndexOf = Bytes.indexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Byte) || (iLastIndexOf = Bytes.lastIndexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int i11, Byte b11) {
            Preconditions.checkElementIndex(i11, size());
            byte[] bArr = this.array;
            int i12 = this.start;
            byte b12 = bArr[i12 + i11];
            bArr[i12 + i11] = ((Byte) Preconditions.checkNotNull(b11)).byteValue();
            return Byte.valueOf(b12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        public byte[] toByteArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append((int) this.array[this.start]);
            int i11 = this.start;
            while (true) {
                i11++;
                if (i11 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.array[i11]);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.array;
            int i13 = this.start;
            return new ByteArrayAsList(bArr, i11 + i13, i13 + i12);
        }
    }

    public static List<Byte> asList(byte... bArr) {
        return bArr.length == 0 ? Collections.EMPTY_LIST : new ByteArrayAsList(bArr);
    }

    private static int checkNoOverflow(long j11) {
        int i11 = (int) j11;
        Preconditions.checkArgument(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static byte[] concat(byte[]... bArr) {
        long length = 0;
        for (byte[] bArr2 : bArr) {
            length += (long) bArr2.length;
        }
        byte[] bArr3 = new byte[checkNoOverflow(length)];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean contains(byte[] bArr, byte b11) {
        for (byte b12 : bArr) {
            if (b12 == b11) {
                return true;
            }
        }
        return false;
    }

    public static byte[] ensureCapacity(byte[] bArr, int i11, int i12) {
        Preconditions.checkArgument(i11 >= 0, "Invalid minLength: %s", i11);
        Preconditions.checkArgument(i12 >= 0, "Invalid padding: %s", i12);
        return bArr.length < i11 ? Arrays.copyOf(bArr, i11 + i12) : bArr;
    }

    public static int indexOf(byte[] bArr, byte b11) {
        return indexOf(bArr, b11, 0, bArr.length);
    }

    public static int lastIndexOf(byte[] bArr, byte b11) {
        return lastIndexOf(bArr, b11, 0, bArr.length);
    }

    public static void reverse(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        reverse(bArr, 0, bArr.length);
    }

    public static void rotate(byte[] bArr, int i11) {
        rotate(bArr, i11, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(byte[] bArr, byte b11, int i11, int i12) {
        while (i11 < i12) {
            if (bArr[i11] == b11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(byte[] bArr, byte b11, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (bArr[i13] == b11) {
                return i13;
            }
        }
        return -1;
    }

    public static void rotate(byte[] bArr, int i11, int i12, int i13) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i12, i13, bArr.length);
        if (bArr.length <= 1) {
            return;
        }
        int i14 = i13 - i12;
        int i15 = (-i11) % i14;
        if (i15 < 0) {
            i15 += i14;
        }
        int i16 = i15 + i12;
        if (i16 == i12) {
            return;
        }
        reverse(bArr, i12, i16);
        reverse(bArr, i16, i13);
        reverse(bArr, i12, i13);
    }

    public static byte[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ByteArrayAsList) {
            return ((ByteArrayAsList) collection).toByteArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).byteValue();
        }
        return bArr;
    }

    private Bytes() {
    }

    public static int indexOf(byte[] bArr, byte[] bArr2) {
        Preconditions.checkNotNull(bArr, "array");
        Preconditions.checkNotNull(bArr2, "target");
        if (bArr2.length == 0) {
            return 0;
        }
        for (int i11 = 0; i11 < (bArr.length - bArr2.length) + 1; i11++) {
            for (int i12 = 0; i12 < bArr2.length; i12++) {
                if (bArr[i11 + i12] != bArr2[i12]) {
                }
            }
            return i11;
        }
        return -1;
    }

    public static void reverse(byte[] bArr, int i11, int i12) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i11, i12, bArr.length);
        for (int i13 = i12 - 1; i11 < i13; i13--) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[i13];
            bArr[i13] = b11;
            i11++;
        }
    }

    public static int hashCode(byte b11) {
        return b11;
    }
}
