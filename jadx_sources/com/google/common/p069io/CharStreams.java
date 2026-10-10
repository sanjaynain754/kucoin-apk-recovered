package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class CharStreams {
    private static final int DEFAULT_BUF_SIZE = 2048;

    public static final class NullWriter extends Writer {
        private static final NullWriter INSTANCE = new NullWriter();

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c11) {
            return this;
        }

        @Override // java.io.Writer
        public void write(int i11) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            return this;
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            Preconditions.checkNotNull(cArr);
        }

        private NullWriter() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12 + i11, cArr.length);
        }

        @Override // java.io.Writer
        public void write(String str) {
            Preconditions.checkNotNull(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12 + i11, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public static List<String> readLines(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(readable);
        while (true) {
            String line = lineReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    public static Writer asWriter(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    @CanIgnoreReturnValue
    public static long copy(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            return appendable instanceof StringBuilder ? copyReaderToBuilder((Reader) readable, (StringBuilder) appendable) : copyReaderToWriter((Reader) readable, asWriter(appendable));
        }
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(appendable);
        CharBuffer charBufferCreateBuffer = createBuffer();
        long jRemaining = 0;
        while (readable.read(charBufferCreateBuffer) != -1) {
            Java8Compatibility.flip(charBufferCreateBuffer);
            appendable.append(charBufferCreateBuffer);
            jRemaining += (long) charBufferCreateBuffer.remaining();
            Java8Compatibility.clear(charBufferCreateBuffer);
        }
        return jRemaining;
    }

    public static CharBuffer createBuffer() {
        return CharBuffer.allocate(2048);
    }

    private static StringBuilder toStringBuilder(Readable readable) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (readable instanceof Reader) {
            copyReaderToBuilder((Reader) readable, sb2);
            return sb2;
        }
        copy(readable, sb2);
        return sb2;
    }

    private CharStreams() {
    }

    @CanIgnoreReturnValue
    public static long copyReaderToBuilder(Reader reader, StringBuilder sb2) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(sb2);
        char[] cArr = new char[2048];
        long j11 = 0;
        while (true) {
            int i11 = reader.read(cArr);
            if (i11 != -1) {
                sb2.append(cArr, 0, i11);
                j11 += (long) i11;
            } else {
                return j11;
            }
        }
    }

    @CanIgnoreReturnValue
    public static long copyReaderToWriter(Reader reader, Writer writer) throws IOException {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(writer);
        char[] cArr = new char[2048];
        long j11 = 0;
        while (true) {
            int i11 = reader.read(cArr);
            if (i11 != -1) {
                writer.write(cArr, 0, i11);
                j11 += (long) i11;
            } else {
                return j11;
            }
        }
    }

    @CanIgnoreReturnValue
    public static long exhaust(Readable readable) throws IOException {
        CharBuffer charBufferCreateBuffer = createBuffer();
        long j11 = 0;
        while (true) {
            long j12 = readable.read(charBufferCreateBuffer);
            if (j12 != -1) {
                j11 += j12;
                Java8Compatibility.clear(charBufferCreateBuffer);
            } else {
                return j11;
            }
        }
    }

    public static Writer nullWriter() {
        return NullWriter.INSTANCE;
    }

    public static void skipFully(Reader reader, long j11) throws IOException {
        Preconditions.checkNotNull(reader);
        while (j11 > 0) {
            long jSkip = reader.skip(j11);
            if (jSkip != 0) {
                j11 -= jSkip;
            } else {
                throw new EOFException();
            }
        }
    }

    public static String toString(Readable readable) throws IOException {
        return toStringBuilder(readable).toString();
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readLines(Readable readable, LineProcessor<T> lineProcessor) throws IOException {
        String line;
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(lineProcessor);
        LineReader lineReader = new LineReader(readable);
        do {
            line = lineReader.readLine();
            if (line == null) {
                break;
            }
        } while (lineProcessor.processLine(line));
        return lineProcessor.getResult();
    }
}
