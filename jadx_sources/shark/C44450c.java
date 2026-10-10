package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: shark.c */
/* JADX INFO: compiled from: FileSourceProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m90084d2 = {"Lshark/c;", "Lshark/b;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "Lokio/BufferedSource;", "b", "()Lokio/BufferedSource;", "Lshark/s;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lshark/s;", "Ljava/io/File;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44450c implements InterfaceC44449b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final File file;

    /* JADX INFO: renamed from: shark.c$a */
    /* JADX INFO: compiled from: FileSourceProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"shark/c$a", "Lshark/s;", "Lokio/Buffer;", "sink", "", ViewProps.POSITION, "byteCount", "D", "(Lokio/Buffer;JJ)J", "", "close", "()V", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class a implements InterfaceC44497s {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FileChannel f98256b;

        public a(FileChannel fileChannel) {
            this.f98256b = fileChannel;
        }

        @Override // shark.InterfaceC44497s
        /* JADX INFO: renamed from: D */
        public long mo98162D(@NotNull Buffer sink, long position, long byteCount) {
            return this.f98256b.transferTo(position, byteCount, sink);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f98256b.close();
        }

        @Override // shark.InterfaceC44497s
        @NotNull
        /* JADX INFO: renamed from: H */
        public BufferedSource mo98163H() {
            return InterfaceC44497s.a.m98465a(this);
        }
    }

    @Override // shark.InterfaceC44498t
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC44497s mo98160a() {
        return new a(new FileInputStream(this.file).getChannel());
    }

    @Override // shark.InterfaceC44501w
    @NotNull
    /* JADX INFO: renamed from: b */
    public BufferedSource mo98161b() {
        BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(new FileInputStream(this.file)));
        Intrinsics.checkExpressionValueIsNotNull(bufferedSourceBuffer, "Okio.buffer(Okio.source(file.inputStream()))");
        return bufferedSourceBuffer;
    }

    public C44450c(@NotNull File file) {
        this.file = file;
    }
}
