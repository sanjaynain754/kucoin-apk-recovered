package shark;

import com.facebook.react.uimanager.ViewProps;
import java.io.Closeable;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: shark.s */
/* JADX INFO: compiled from: RandomAccessSource.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lshark/s;", "Ljava/io/Closeable;", "Lokio/Buffer;", "sink", "", ViewProps.POSITION, "byteCount", "D", "(Lokio/Buffer;JJ)J", "Lokio/BufferedSource;", "H", "()Lokio/BufferedSource;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public interface InterfaceC44497s extends Closeable {

    /* JADX INFO: renamed from: shark.s$a */
    /* JADX INFO: compiled from: RandomAccessSource.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90085k = 3, m90086mv = {1, 4, 1})
    public static final class a {

        /* JADX INFO: renamed from: shark.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RandomAccessSource.kt */
        @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"shark/s$a$a", "Lokio/Source;", "Lokio/Timeout;", "kotlin.jvm.PlatformType", "timeout", "()Lokio/Timeout;", "", "close", "()V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "b", "J", "getPosition", "()J", "setPosition", "(J)V", ViewProps.POSITION, "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C47027a implements Source {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public long position;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC44497s f98558c;

            public C47027a(InterfaceC44497s interfaceC44497s) {
                this.f98558c = interfaceC44497s;
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.position = -1L;
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long byteCount) throws IOException {
                long j11 = this.position;
                if (j11 == -1) {
                    throw new IOException("Source closed");
                }
                long jMo98162D = this.f98558c.mo98162D(sink, j11, byteCount);
                if (jMo98162D == 0) {
                    return -1L;
                }
                this.position += jMo98162D;
                return jMo98162D;
            }

            @Override // okio.Source
            /* JADX INFO: renamed from: timeout */
            public Timeout getTimeout() {
                return Timeout.NONE;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public static BufferedSource m98465a(@NotNull InterfaceC44497s interfaceC44497s) {
            BufferedSource bufferedSourceBuffer = Okio.buffer(new C47027a(interfaceC44497s));
            Intrinsics.checkExpressionValueIsNotNull(bufferedSourceBuffer, "Okio.buffer(object : Sou… bytesRead\n      }\n    })");
            return bufferedSourceBuffer;
        }
    }

    /* JADX INFO: renamed from: D */
    long mo98162D(@NotNull Buffer sink, long position, long byteCount) throws IOException;

    @NotNull
    /* JADX INFO: renamed from: H */
    BufferedSource mo98163H();
}
