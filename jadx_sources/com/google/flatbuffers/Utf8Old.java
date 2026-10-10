package com.google.flatbuffers;

import androidx.emoji2.text.flatbuffer.C2510b;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes56.dex */
public class Utf8Old extends Utf8 {
    private static final ThreadLocal<Cache> CACHE = new C2510b(new Supplier() { // from class: com.google.flatbuffers.a
        @Override // java.util.function.Supplier
        public final Object get() {
            return Utf8Old.m13888a();
        }
    });

    public static class Cache {
        final CharsetDecoder decoder;
        final CharsetEncoder encoder;
        CharSequence lastInput = null;
        ByteBuffer lastOutput = null;

        public Cache() {
            Charset charset = StandardCharsets.UTF_8;
            this.encoder = charset.newEncoder();
            this.decoder = charset.newDecoder();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Cache m13888a() {
        return new Cache();
    }

    @Override // com.google.flatbuffers.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i11, int i12) {
        CharsetDecoder charsetDecoder = CACHE.get().decoder;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i11);
        byteBufferDuplicate.limit(i11 + i12);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e11) {
            throw new IllegalArgumentException("Bad encoding", e11);
        }
    }

    @Override // com.google.flatbuffers.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        Cache cache = CACHE.get();
        if (cache.lastInput != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(cache.lastOutput);
    }

    @Override // com.google.flatbuffers.Utf8
    public int encodedLength(CharSequence charSequence) {
        Cache cache = CACHE.get();
        int length = (int) (charSequence.length() * cache.encoder.maxBytesPerChar());
        ByteBuffer byteBuffer = cache.lastOutput;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            cache.lastOutput = ByteBuffer.allocate(Math.max(128, length));
        }
        cache.lastOutput.clear();
        cache.lastInput = charSequence;
        CoderResult coderResultEncode = cache.encoder.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), cache.lastOutput, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e11) {
                throw new IllegalArgumentException("bad character encoding", e11);
            }
        }
        cache.lastOutput.flip();
        return cache.lastOutput.remaining();
    }
}
