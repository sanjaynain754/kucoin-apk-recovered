package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class Streams {

    /* JADX INFO: loaded from: classes56.dex */
    public static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite = new CurrentWrite();

        public static class CurrentWrite implements CharSequence {
            char[] chars;

            @Override // java.lang.CharSequence
            public char charAt(int i11) {
                return this.chars[i11];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.chars.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i11, int i12) {
                return new String(this.chars, i11, i12 - i11);
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) throws IOException {
            CurrentWrite currentWrite = this.currentWrite;
            currentWrite.chars = cArr;
            this.appendable.append(currentWrite, i11, i12 + i11);
        }

        public AppendableWriter(Appendable appendable) {
            this.appendable = appendable;
        }

        @Override // java.io.Writer
        public void write(int i11) throws IOException {
            this.appendable.append((char) i11);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    private Streams() {
        throw new UnsupportedOperationException();
    }

    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
        boolean z11;
        try {
            try {
                jsonReader.peek();
                z11 = false;
                try {
                    return TypeAdapters.JSON_ELEMENT.read2(jsonReader);
                } catch (EOFException e11) {
                    e = e11;
                    if (z11) {
                        return JsonNull.INSTANCE;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e12) {
                e = e12;
                z11 = true;
            }
        } catch (MalformedJsonException e13) {
            throw new JsonSyntaxException(e13);
        } catch (IOException e14) {
            throw new JsonIOException(e14);
        } catch (NumberFormatException e15) {
            throw new JsonSyntaxException(e15);
        }
    }
}
