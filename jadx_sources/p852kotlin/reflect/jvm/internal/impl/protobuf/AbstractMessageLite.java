package p852kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractMessageLite implements MessageLite {
    protected int memoizedHashCode = 0;

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {

        public static final class LimitedInputStream extends FilterInputStream {
            private int limit;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int i11 = super.read();
                if (i11 >= 0) {
                    this.limit--;
                }
                return i11;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j11) throws IOException {
                long jSkip = super.skip(Math.min(j11, this.limit));
                if (jSkip >= 0) {
                    this.limit = (int) (((long) this.limit) - jSkip);
                }
                return jSkip;
            }

            public LimitedInputStream(InputStream inputStream, int i11) {
                super(inputStream);
                this.limit = i11;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i11, int i12) throws IOException {
                int i13 = this.limit;
                if (i13 <= 0) {
                    return -1;
                }
                int i14 = super.read(bArr, i11, Math.min(i12, i13));
                if (i14 >= 0) {
                    this.limit -= i14;
                }
                return i14;
            }
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo105124clone();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            if (iterable instanceof LazyStringList) {
                checkForNullValues(((LazyStringList) iterable).getUnderlyingElements());
                collection.addAll((Collection) iterable);
            } else {
                if (iterable instanceof Collection) {
                    checkForNullValues(iterable);
                    collection.addAll((Collection) iterable);
                    return;
                }
                for (T t11 : iterable) {
                    t11.getClass();
                    collection.add(t11);
                }
            }
        }

        public static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        private static void checkForNullValues(Iterable<?> iterable) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr);
            writeTo(codedOutputStreamNewInstance);
            codedOutputStreamNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e11);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize));
        codedOutputStreamNewInstance.writeRawVarint32(serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }
}
