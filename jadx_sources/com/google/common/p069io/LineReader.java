package com.google.common.p069io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class LineReader {
    private final char[] buf;
    private final CharBuffer cbuf;
    private final LineBuffer lineBuf;
    private final Queue<String> lines;
    private final Readable readable;
    private final Reader reader;

    @CanIgnoreReturnValue
    public String readLine() throws IOException {
        int i11;
        while (this.lines.peek() == null) {
            Java8Compatibility.clear(this.cbuf);
            Reader reader = this.reader;
            if (reader != null) {
                char[] cArr = this.buf;
                i11 = reader.read(cArr, 0, cArr.length);
            } else {
                i11 = this.readable.read(this.cbuf);
            }
            if (i11 == -1) {
                this.lineBuf.finish();
                break;
            }
            this.lineBuf.add(this.buf, 0, i11);
        }
        return this.lines.poll();
    }

    public LineReader(Readable readable) {
        Reader reader;
        CharBuffer charBufferCreateBuffer = CharStreams.createBuffer();
        this.cbuf = charBufferCreateBuffer;
        this.buf = charBufferCreateBuffer.array();
        this.lines = new ArrayDeque();
        this.lineBuf = new LineBuffer() { // from class: com.google.common.io.LineReader.1
            @Override // com.google.common.p069io.LineBuffer
            public void handleLine(String str, String str2) {
                LineReader.this.lines.add(str);
            }
        };
        this.readable = (Readable) Preconditions.checkNotNull(readable);
        if (readable instanceof Reader) {
            reader = (Reader) readable;
        } else {
            reader = null;
        }
        this.reader = reader;
    }
}
