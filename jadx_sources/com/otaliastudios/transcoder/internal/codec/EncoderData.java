package com.otaliastudios.transcoder.internal.codec;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Encoder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001cB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/EncoderData;", "", "Ljava/nio/ByteBuffer;", "buffer", "", "id", "", "timeUs", "<init>", "(Ljava/nio/ByteBuffer;IJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "I", "c", "J", "d", "()J", "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final /* data */ class EncoderData {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final EncoderData f55701e = new EncoderData(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final ByteBuffer buffer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final long timeUs;

    /* JADX INFO: compiled from: Encoder.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/EncoderData$Companion;", "", "()V", "Empty", "Lcom/otaliastudios/transcoder/internal/codec/EncoderData;", "getEmpty", "()Lcom/otaliastudios/transcoder/internal/codec/EncoderData;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final EncoderData getEmpty() {
            return EncoderData.f55701e;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncoderData)) {
            return false;
        }
        EncoderData encoderData = (EncoderData) other;
        return Intrinsics.areEqual(this.buffer, encoderData.buffer) && this.id == encoderData.id && this.timeUs == encoderData.timeUs;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTimeUs() {
        return this.timeUs;
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.buffer;
        return ((((byteBuffer == null ? 0 : byteBuffer.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Long.hashCode(this.timeUs);
    }

    @NotNull
    public String toString() {
        return "EncoderData(buffer=" + this.buffer + ", id=" + this.id + ", timeUs=" + this.timeUs + ')';
    }

    public EncoderData(@Nullable ByteBuffer byteBuffer, int i11, long j11) {
        this.buffer = byteBuffer;
        this.id = i11;
        this.timeUs = j11;
    }
}
