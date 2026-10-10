package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import okio.BufferedSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.TypeCastException;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: HprofHeader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001a\u0010\u000e¨\u0006 "}, m90084d2 = {"Lshark/HprofHeader;", "", "", "heapDumpTimestamp", "Lshark/HprofVersion;", "version", "", "identifierByteSize", "<init>", "(JLshark/HprofVersion;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "d", "recordsPosition", "b", "J", "()J", "c", "Lshark/HprofVersion;", "e", "()Lshark/HprofVersion;", "f", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class HprofHeader {

    /* JADX INFO: renamed from: e */
    public static final Map<String, HprofVersion> f98161e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int recordsPosition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long heapDumpTimestamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final HprofVersion version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int identifierByteSize;

    /* JADX INFO: compiled from: HprofHeader.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lshark/HprofHeader$Companion;", "", "()V", "supportedVersions", "", "", "Lshark/HprofVersion;", "parseHeaderOf", "Lshark/HprofHeader;", "hprofFile", "Ljava/io/File;", "source", "Lokio/BufferedSource;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final HprofHeader parseHeaderOf(@NotNull File hprofFile) {
            if (hprofFile.length() == 0) {
                throw new IllegalArgumentException("Hprof file is 0 byte length");
            }
            BufferedSource it = Okio.buffer(Okio.source(new FileInputStream(hprofFile)));
            try {
                Companion companion = HprofHeader.INSTANCE;
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                HprofHeader headerOf = companion.parseHeaderOf(it);
                CloseableKt.closeFinally(it, null);
                return headerOf;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(it, th2);
                    throw th3;
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HprofHeader parseHeaderOf(@NotNull BufferedSource source) throws IOException {
            if (!source.exhausted()) {
                String utf8 = source.readUtf8(source.indexOf((byte) 0));
                HprofVersion hprofVersion = (HprofVersion) HprofHeader.f98161e.get(utf8);
                if (hprofVersion != null) {
                    source.skip(1L);
                    return new HprofHeader(source.readLong(), hprofVersion, source.readInt());
                }
                throw new IllegalStateException(("Unsupported Hprof version [" + utf8 + "] not in supported list " + HprofHeader.f98161e.keySet()).toString());
            }
            throw new IllegalArgumentException("Source has no available bytes");
        }
    }

    public HprofHeader() {
        this(0L, null, 0, 7, null);
    }

    static {
        HprofVersion[] hprofVersionArrValues = HprofVersion.values();
        ArrayList arrayList = new ArrayList(hprofVersionArrValues.length);
        for (HprofVersion hprofVersion : hprofVersionArrValues) {
            arrayList.add(TuplesKt.m90091to(hprofVersion.getVersionString(), hprofVersion));
        }
        f98161e = MapsKt.toMap(arrayList);
    }

    public HprofHeader(long j11, @NotNull HprofVersion hprofVersion, int i11) {
        this.heapDumpTimestamp = j11;
        this.version = hprofVersion;
        this.identifierByteSize = i11;
        String versionString = hprofVersion.getVersionString();
        Charset charset = Charsets.UTF_8;
        if (versionString == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = versionString.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        this.recordsPosition = bytes.length + 13;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getHeapDumpTimestamp() {
        return this.heapDumpTimestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIdentifierByteSize() {
        return this.identifierByteSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRecordsPosition() {
        return this.recordsPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final HprofVersion getVersion() {
        return this.version;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HprofHeader)) {
            return false;
        }
        HprofHeader hprofHeader = (HprofHeader) other;
        return this.heapDumpTimestamp == hprofHeader.heapDumpTimestamp && Intrinsics.areEqual(this.version, hprofHeader.version) && this.identifierByteSize == hprofHeader.identifierByteSize;
    }

    public int hashCode() {
        long j11 = this.heapDumpTimestamp;
        int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
        HprofVersion hprofVersion = this.version;
        return ((i11 + (hprofVersion != null ? hprofVersion.hashCode() : 0)) * 31) + this.identifierByteSize;
    }

    @NotNull
    public String toString() {
        return "HprofHeader(heapDumpTimestamp=" + this.heapDumpTimestamp + ", version=" + this.version + ", identifierByteSize=" + this.identifierByteSize + ")";
    }

    public /* synthetic */ HprofHeader(long j11, HprofVersion hprofVersion, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? System.currentTimeMillis() : j11, (i12 & 2) != 0 ? HprofVersion.ANDROID : hprofVersion, (i12 & 4) != 0 ? 4 : i11);
    }
}
