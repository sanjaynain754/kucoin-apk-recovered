package com.jumio.ale.swig;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/jumio/ale/swig/AESGCMInputStream;", "Ljava/io/FilterInputStream;", "input", "Ljava/io/InputStream;", "key", "", "iv", "<init>", "(Ljava/io/InputStream;[B[B)V", "aesgcm", "Lcom/jumio/ale/swig/AESGCM;", "read", "finished", "", "", "buffer", TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "skip", "", "n", "available", "close", "", "markSupported", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AESGCMInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f13381a;

    /* JADX INFO: renamed from: b */
    public final AESGCM f13382b;

    /* JADX INFO: renamed from: c */
    public byte[] f13383c;

    /* JADX INFO: renamed from: d */
    public boolean f13384d;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NotNull byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return read(buffer, 0, buffer.length);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AESGCMInputStream(@NotNull InputStream input, @NotNull byte[] key, @NotNull byte[] iv2) throws Exception {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iv2, "iv");
        this.f13381a = input;
        AESGCM aesgcm = new AESGCM();
        this.f13382b = aesgcm;
        this.f13383c = new byte[0];
        aesgcm.setKey(key);
        aesgcm.setIV(iv2);
        aesgcm.setMode(0);
        aesgcm.init();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.f13381a.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13381a.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NotNull byte[] buffer, int offset, int length) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i11 = length - offset;
        if (this.f13383c.length < i11) {
            this.f13383c = new byte[i11];
        }
        int i12 = this.f13381a.read(this.f13383c, 0, i11);
        if (i12 != -1) {
            return this.f13382b.update(this.f13383c, i12, buffer, offset);
        }
        if (this.f13384d) {
            return -1;
        }
        this.f13384d = true;
        return this.f13382b.finish(buffer, offset);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long n11) throws IOException {
        return this.f13381a.skip(n11);
    }
}
