package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class ByteSource {

    public class AsCharSource extends CharSource {
        final Charset charset;

        public AsCharSource(Charset charset) {
            this.charset = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p069io.CharSource
        public ByteSource asByteSource(Charset charset) {
            return charset.equals(this.charset) ? ByteSource.this : super.asByteSource(charset);
        }

        @Override // com.google.common.p069io.CharSource
        public Reader openStream() throws IOException {
            return new InputStreamReader(ByteSource.this.openStream(), this.charset);
        }

        @Override // com.google.common.p069io.CharSource
        public String read() throws IOException {
            return new String(ByteSource.this.read(), this.charset);
        }

        public String toString() {
            return ByteSource.this.toString() + ".asCharSource(" + this.charset + ")";
        }
    }

    public static class ByteArrayByteSource extends ByteSource {
        final byte[] bytes;
        final int length;
        final int offset;

        public ByteArrayByteSource(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.google.common.p069io.ByteSource
        public byte[] read() {
            byte[] bArr = this.bytes;
            int i11 = this.offset;
            return Arrays.copyOfRange(bArr, i11, this.length + i11);
        }

        public ByteArrayByteSource(byte[] bArr, int i11, int i12) {
            this.bytes = bArr;
            this.offset = i11;
            this.length = i12;
        }

        @Override // com.google.common.p069io.ByteSource
        public long copyTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.bytes, this.offset, this.length);
            return this.length;
        }

        @Override // com.google.common.p069io.ByteSource
        public HashCode hash(HashFunction hashFunction) throws IOException {
            return hashFunction.hashBytes(this.bytes, this.offset, this.length);
        }

        @Override // com.google.common.p069io.ByteSource
        public boolean isEmpty() {
            return this.length == 0;
        }

        @Override // com.google.common.p069io.ByteSource
        public InputStream openStream() {
            return new ByteArrayInputStream(this.bytes, this.offset, this.length);
        }

        @Override // com.google.common.p069io.ByteSource
        @ParametricNullness
        public <T> T read(ByteProcessor<T> byteProcessor) throws IOException {
            byteProcessor.processBytes(this.bytes, this.offset, this.length);
            return byteProcessor.getResult();
        }

        @Override // com.google.common.p069io.ByteSource
        public long size() {
            return this.length;
        }

        @Override // com.google.common.p069io.ByteSource
        public Optional<Long> sizeIfKnown() {
            return Optional.m13374of(Long.valueOf(this.length));
        }

        @Override // com.google.common.p069io.ByteSource
        public ByteSource slice(long j11, long j12) {
            Preconditions.checkArgument(j11 >= 0, "offset (%s) may not be negative", j11);
            Preconditions.checkArgument(j12 >= 0, "length (%s) may not be negative", j12);
            long jMin = Math.min(j11, this.length);
            return new ByteArrayByteSource(this.bytes, this.offset + ((int) jMin), (int) Math.min(j12, ((long) this.length) - jMin));
        }

        public String toString() {
            return "ByteSource.wrap(" + Ascii.truncate(BaseEncoding.base16().encode(this.bytes, this.offset, this.length), 30, "...") + ")";
        }

        @Override // com.google.common.p069io.ByteSource
        public InputStream openBufferedStream() {
            return openStream();
        }
    }

    public static final class ConcatenatedByteSource extends ByteSource {
        final Iterable<? extends ByteSource> sources;

        @Override // com.google.common.p069io.ByteSource
        public boolean isEmpty() throws IOException {
            Iterator<? extends ByteSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p069io.ByteSource
        public InputStream openStream() throws IOException {
            return new MultiInputStream(this.sources.iterator());
        }

        @Override // com.google.common.p069io.ByteSource
        public long size() throws IOException {
            Iterator<? extends ByteSource> it = this.sources.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += it.next().size();
                if (size < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return size;
        }

        @Override // com.google.common.p069io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Iterable<? extends ByteSource> iterable = this.sources;
            if (!(iterable instanceof Collection)) {
                return Optional.absent();
            }
            Iterator<? extends ByteSource> it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalSizeIfKnown = it.next().sizeIfKnown();
                if (!optionalSizeIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalSizeIfKnown.get().longValue();
                if (jLongValue < 0) {
                    return Optional.m13374of(Long.MAX_VALUE);
                }
            }
            return Optional.m13374of(Long.valueOf(jLongValue));
        }

        public String toString() {
            return "ByteSource.concat(" + this.sources + ")";
        }

        public ConcatenatedByteSource(Iterable<? extends ByteSource> iterable) {
            this.sources = (Iterable) Preconditions.checkNotNull(iterable);
        }
    }

    public static final class EmptyByteSource extends ByteArrayByteSource {
        static final EmptyByteSource INSTANCE = new EmptyByteSource();

        public EmptyByteSource() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource, com.google.common.p069io.ByteSource
        public byte[] read() {
            return this.bytes;
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public String toString() {
            return "ByteSource.empty()";
        }

        @Override // com.google.common.p069io.ByteSource
        public CharSource asCharSource(Charset charset) {
            Preconditions.checkNotNull(charset);
            return CharSource.empty();
        }
    }

    public final class SlicedByteSource extends ByteSource {
        final long length;
        final long offset;

        public SlicedByteSource(long j11, long j12) {
            Preconditions.checkArgument(j11 >= 0, "offset (%s) may not be negative", j11);
            Preconditions.checkArgument(j12 >= 0, "length (%s) may not be negative", j12);
            this.offset = j11;
            this.length = j12;
        }

        private InputStream sliceStream(InputStream inputStream) throws Throwable {
            long j11 = this.offset;
            if (j11 > 0) {
                try {
                    if (ByteStreams.skipUpTo(inputStream, j11) < this.offset) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } catch (Throwable th2) {
                    Closer closerCreate = Closer.create();
                    closerCreate.register(inputStream);
                    try {
                        throw closerCreate.rethrow(th2);
                    } catch (Throwable th3) {
                        closerCreate.close();
                        throw th3;
                    }
                }
            }
            return ByteStreams.limit(inputStream, this.length);
        }

        @Override // com.google.common.p069io.ByteSource
        public boolean isEmpty() throws IOException {
            return this.length == 0 || super.isEmpty();
        }

        @Override // com.google.common.p069io.ByteSource
        public InputStream openBufferedStream() throws IOException {
            return sliceStream(ByteSource.this.openBufferedStream());
        }

        @Override // com.google.common.p069io.ByteSource
        public InputStream openStream() throws IOException {
            return sliceStream(ByteSource.this.openStream());
        }

        @Override // com.google.common.p069io.ByteSource
        public Optional<Long> sizeIfKnown() {
            Optional<Long> optionalSizeIfKnown = ByteSource.this.sizeIfKnown();
            if (!optionalSizeIfKnown.isPresent()) {
                return Optional.absent();
            }
            long jLongValue = optionalSizeIfKnown.get().longValue();
            return Optional.m13374of(Long.valueOf(Math.min(this.length, jLongValue - Math.min(this.offset, jLongValue))));
        }

        @Override // com.google.common.p069io.ByteSource
        public ByteSource slice(long j11, long j12) {
            Preconditions.checkArgument(j11 >= 0, "offset (%s) may not be negative", j11);
            Preconditions.checkArgument(j12 >= 0, "length (%s) may not be negative", j12);
            long j13 = this.length - j11;
            return j13 <= 0 ? ByteSource.empty() : ByteSource.this.slice(this.offset + j11, Math.min(j12, j13));
        }

        public String toString() {
            return ByteSource.this.toString() + ".slice(" + this.offset + ", " + this.length + ")";
        }
    }

    public static ByteSource concat(Iterable<? extends ByteSource> iterable) {
        return new ConcatenatedByteSource(iterable);
    }

    @CanIgnoreReturnValue
    public long copyTo(OutputStream outputStream) throws Throwable {
        Preconditions.checkNotNull(outputStream);
        Closer closerCreate = Closer.create();
        try {
            long jCopy = ByteStreams.copy((InputStream) closerCreate.register(openStream()), outputStream);
            closerCreate.close();
            return jCopy;
        } catch (Throwable th2) {
            try {
                throw closerCreate.rethrow(th2);
            } catch (Throwable th3) {
                closerCreate.close();
                throw th3;
            }
        }
    }

    public abstract InputStream openStream() throws IOException;

    public byte[] read() throws Throwable {
        Closer closerCreate = Closer.create();
        try {
            InputStream inputStream = (InputStream) closerCreate.register(openStream());
            Optional<Long> optionalSizeIfKnown = sizeIfKnown();
            byte[] byteArray = optionalSizeIfKnown.isPresent() ? ByteStreams.toByteArray(inputStream, optionalSizeIfKnown.get().longValue()) : ByteStreams.toByteArray(inputStream);
            closerCreate.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw closerCreate.rethrow(th2);
            } catch (Throwable th3) {
                closerCreate.close();
                throw th3;
            }
        }
    }

    public static ByteSource concat(Iterator<? extends ByteSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    private long countBySkipping(InputStream inputStream) throws IOException {
        long j11 = 0;
        while (true) {
            long jSkipUpTo = ByteStreams.skipUpTo(inputStream, 2147483647L);
            if (jSkipUpTo <= 0) {
                return j11;
            }
            j11 += jSkipUpTo;
        }
    }

    public static ByteSource empty() {
        return EmptyByteSource.INSTANCE;
    }

    public static ByteSource wrap(byte[] bArr) {
        return new ByteArrayByteSource(bArr);
    }

    public CharSource asCharSource(Charset charset) {
        return new AsCharSource(charset);
    }

    public ByteSource slice(long j11, long j12) {
        return new SlicedByteSource(j11, j12);
    }

    public static ByteSource concat(ByteSource... byteSourceArr) {
        return concat(ImmutableList.copyOf(byteSourceArr));
    }

    public boolean contentEquals(ByteSource byteSource) throws Throwable {
        int i11;
        Preconditions.checkNotNull(byteSource);
        byte[] bArrCreateBuffer = ByteStreams.createBuffer();
        byte[] bArrCreateBuffer2 = ByteStreams.createBuffer();
        Closer closerCreate = Closer.create();
        try {
            InputStream inputStream = (InputStream) closerCreate.register(openStream());
            InputStream inputStream2 = (InputStream) closerCreate.register(byteSource.openStream());
            do {
                i11 = ByteStreams.read(inputStream, bArrCreateBuffer, 0, bArrCreateBuffer.length);
                if (i11 == ByteStreams.read(inputStream2, bArrCreateBuffer2, 0, bArrCreateBuffer2.length) && Arrays.equals(bArrCreateBuffer, bArrCreateBuffer2)) {
                }
                closerCreate.close();
                return false;
            } while (i11 == bArrCreateBuffer.length);
            closerCreate.close();
            return true;
        } catch (Throwable th2) {
            try {
                throw closerCreate.rethrow(th2);
            } catch (Throwable th3) {
                closerCreate.close();
                throw th3;
            }
        }
    }

    public HashCode hash(HashFunction hashFunction) throws Throwable {
        Hasher hasherNewHasher = hashFunction.newHasher();
        copyTo(Funnels.asOutputStream(hasherNewHasher));
        return hasherNewHasher.hash();
    }

    public boolean isEmpty() throws Throwable {
        Optional<Long> optionalSizeIfKnown = sizeIfKnown();
        boolean z11 = false;
        if (optionalSizeIfKnown.isPresent()) {
            if (optionalSizeIfKnown.get().longValue() != 0) {
                return false;
            }
            return true;
        }
        Closer closerCreate = Closer.create();
        try {
            if (((InputStream) closerCreate.register(openStream())).read() == -1) {
                z11 = true;
            }
            closerCreate.close();
            return z11;
        } catch (Throwable th2) {
            try {
                throw closerCreate.rethrow(th2);
            } catch (Throwable th3) {
                closerCreate.close();
                throw th3;
            }
        }
    }

    public InputStream openBufferedStream() throws IOException {
        InputStream inputStreamOpenStream = openStream();
        if (inputStreamOpenStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStreamOpenStream;
        }
        return new BufferedInputStream(inputStreamOpenStream);
    }

    public long size() throws Throwable {
        Optional<Long> optionalSizeIfKnown = sizeIfKnown();
        if (optionalSizeIfKnown.isPresent()) {
            return optionalSizeIfKnown.get().longValue();
        }
        Closer closerCreate = Closer.create();
        try {
            long jCountBySkipping = countBySkipping((InputStream) closerCreate.register(openStream()));
            closerCreate.close();
            return jCountBySkipping;
        } catch (IOException unused) {
            closerCreate.close();
            Closer closerCreate2 = Closer.create();
            try {
                long jExhaust = ByteStreams.exhaust((InputStream) closerCreate2.register(openStream()));
                closerCreate2.close();
                return jExhaust;
            } catch (Throwable th2) {
                try {
                    throw closerCreate2.rethrow(th2);
                } catch (Throwable th3) {
                    closerCreate2.close();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            closerCreate.close();
            throw th4;
        }
    }

    public Optional<Long> sizeIfKnown() {
        return Optional.absent();
    }

    @CanIgnoreReturnValue
    public long copyTo(ByteSink byteSink) throws Throwable {
        Preconditions.checkNotNull(byteSink);
        Closer closerCreate = Closer.create();
        try {
            long jCopy = ByteStreams.copy((InputStream) closerCreate.register(openStream()), (OutputStream) closerCreate.register(byteSink.openStream()));
            closerCreate.close();
            return jCopy;
        } catch (Throwable th2) {
            try {
                throw closerCreate.rethrow(th2);
            } catch (Throwable th3) {
                closerCreate.close();
                throw th3;
            }
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T read(ByteProcessor<T> byteProcessor) throws Throwable {
        Preconditions.checkNotNull(byteProcessor);
        Closer closerCreate = Closer.create();
        try {
            T t11 = (T) ByteStreams.readBytes((InputStream) closerCreate.register(openStream()), byteProcessor);
            closerCreate.close();
            return t11;
        } catch (Throwable th2) {
            try {
                throw closerCreate.rethrow(th2);
            } catch (Throwable th3) {
                closerCreate.close();
                throw th3;
            }
        }
    }
}
