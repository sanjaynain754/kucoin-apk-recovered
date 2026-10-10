package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Hprof.kt */
/* JADX INFO: loaded from: classes61.dex */
@Deprecated(message = "Replaced by HprofStreamingReader.readerFor or HprofRandomAccessReader.openReaderFor")
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m90084d2 = {"Lshark/Hprof;", "Ljava/io/Closeable;", "Ljava/io/File;", "file", "Lshark/HprofHeader;", "header", "<init>", "(Ljava/io/File;Lshark/HprofHeader;)V", "closeable", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/io/Closeable;)V", "close", "()V", "Lshark/k;", "b", "Lshark/k;", "getReader", "()Lshark/k;", "reader", "", "c", "Ljava/util/List;", "closeables", "d", "Ljava/io/File;", "()Ljava/io/File;", "e", "Lshark/HprofHeader;", "g", "()Lshark/HprofHeader;", "f", "Companion", "HprofVersion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class Hprof implements Closeable {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C44489k reader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final List<Closeable> closeables;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final HprofHeader header;

    /* JADX INFO: compiled from: Hprof.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lshark/Hprof$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "Lshark/Hprof;", "hprofFile", "Ljava/io/File;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Replaced by HprofStreamingReader.readerFor or HprofRandomAccessReader.openReaderFor")
        @NotNull
        public final Hprof open(@NotNull File hprofFile) {
            return new Hprof(hprofFile, HprofHeader.INSTANCE.parseHeaderOf(hprofFile), null);
        }
    }

    public Hprof(File file, HprofHeader hprofHeader) {
        this.file = file;
        this.header = hprofHeader;
        this.reader = new C44489k(this);
        this.closeables = new ArrayList();
    }

    /* JADX INFO: compiled from: Hprof.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lshark/Hprof$HprofVersion;", "", "(Ljava/lang/String;I)V", "versionString", "", "getVersionString", "()Ljava/lang/String;", "JDK1_2_BETA3", "JDK1_2_BETA4", "JDK_6", "ANDROID", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    @Deprecated(message = "Moved to top level class", replaceWith = @ReplaceWith(expression = "shark.HprofVersion", imports = {}))
    public enum HprofVersion {
        JDK1_2_BETA3,
        JDK1_2_BETA4,
        JDK_6,
        ANDROID;

        @NotNull
        public final String getVersionString() {
            return shark.HprofVersion.valueOf(name()).getVersionString();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m98050a(@NotNull Closeable closeable) {
        this.closeables.add(closeable);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<T> it = this.closeables.iterator();
        while (it.hasNext()) {
            ((Closeable) it.next()).close();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final HprofHeader getHeader() {
        return this.header;
    }

    public /* synthetic */ Hprof(File file, HprofHeader hprofHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, hprofHeader);
    }
}
