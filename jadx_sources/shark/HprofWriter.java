package shark;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HprofWriter.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"Lshark/HprofWriter;", "Ljava/io/Closeable;", "Lokio/BufferedSink;", "sink", "Lshark/HprofHeader;", "hprofHeader", "<init>", "(Lokio/BufferedSink;Lshark/HprofHeader;)V", "", "close", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lokio/BufferedSink;)V", "", "tag", "", SessionDescription.ATTR_LENGTH, "b", "(Lokio/BufferedSink;IJ)V", "Lokio/Buffer;", "Lokio/Buffer;", "workBuffer", "c", "Lokio/BufferedSink;", "d", "Lshark/HprofHeader;", "getHprofHeader", "()Lshark/HprofHeader;", "e", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class HprofWriter implements Closeable {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Buffer workBuffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final BufferedSink sink;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final HprofHeader hprofHeader;

    /* JADX INFO: compiled from: HprofWriter.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u0010"}, m90084d2 = {"Lshark/HprofWriter$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "Lshark/HprofWriter;", "hprofFile", "Ljava/io/File;", "identifierByteSize", "", "hprofVersion", "Lshark/Hprof$HprofVersion;", "openWriterFor", "hprofHeader", "Lshark/HprofHeader;", "hprofSink", "Lokio/BufferedSink;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public static /* synthetic */ HprofWriter openWriterFor$default(Companion companion, File file, HprofHeader hprofHeader, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                hprofHeader = new HprofHeader(0L, null, 0, 7, null);
            }
            return companion.openWriterFor(file, hprofHeader);
        }

        @NotNull
        public final HprofWriter openWriterFor(@NotNull File hprofFile, @NotNull HprofHeader hprofHeader) {
            BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(new FileOutputStream(hprofFile)));
            Intrinsics.checkExpressionValueIsNotNull(bufferedSinkBuffer, "Okio.buffer(Okio.sink(hprofFile.outputStream()))");
            return openWriterFor(bufferedSinkBuffer, hprofHeader);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ HprofWriter open$default(Companion companion, File file, int i11, Hprof.HprofVersion hprofVersion, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 4;
            }
            if ((i12 & 4) != 0) {
                hprofVersion = Hprof.HprofVersion.ANDROID;
            }
            return companion.open(file, i11, hprofVersion);
        }

        public static /* synthetic */ HprofWriter openWriterFor$default(Companion companion, BufferedSink bufferedSink, HprofHeader hprofHeader, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                hprofHeader = new HprofHeader(0L, null, 0, 7, null);
            }
            return companion.openWriterFor(bufferedSink, hprofHeader);
        }

        @Deprecated(message = "Replaced by HprofWriter.openWriterFor()", replaceWith = @ReplaceWith(expression = "shark.HprofWriter.openWriterFor(hprofFile)", imports = {}))
        @NotNull
        public final HprofWriter open(@NotNull File hprofFile, int identifierByteSize, @NotNull Hprof.HprofVersion hprofVersion) {
            return openWriterFor(hprofFile, new HprofHeader(0L, HprofVersion.valueOf(hprofVersion.name()), identifierByteSize, 1, null));
        }

        @NotNull
        public final HprofWriter openWriterFor(@NotNull BufferedSink hprofSink, @NotNull HprofHeader hprofHeader) throws IOException {
            hprofSink.writeUtf8(hprofHeader.getVersion().getVersionString());
            hprofSink.writeByte(0);
            hprofSink.writeInt(hprofHeader.getIdentifierByteSize());
            hprofSink.writeLong(hprofHeader.getHeapDumpTimestamp());
            return new HprofWriter(hprofSink, hprofHeader, null);
        }
    }

    public HprofWriter(BufferedSink bufferedSink, HprofHeader hprofHeader) {
        this.sink = bufferedSink;
        this.hprofHeader = hprofHeader;
        this.workBuffer = new Buffer();
    }

    /* JADX INFO: renamed from: a */
    public final void m98145a(BufferedSink bufferedSink) throws IOException {
        if (this.workBuffer.size() > 0) {
            m98146b(bufferedSink, HprofRecordTag.HEAP_DUMP.getTag(), this.workBuffer.size());
            bufferedSink.writeAll(this.workBuffer);
            m98146b(bufferedSink, HprofRecordTag.HEAP_DUMP_END.getTag(), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m98145a(this.sink);
        this.sink.close();
    }

    public /* synthetic */ HprofWriter(BufferedSink bufferedSink, HprofHeader hprofHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(bufferedSink, hprofHeader);
    }

    /* JADX INFO: renamed from: b */
    public final void m98146b(BufferedSink bufferedSink, int i11, long j11) throws IOException {
        bufferedSink.writeByte(i11);
        bufferedSink.writeInt(0);
        bufferedSink.writeInt((int) j11);
    }
}
