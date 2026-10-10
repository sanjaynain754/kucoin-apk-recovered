package shark;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: RandomAccessHprofReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m90084d2 = {"Lshark/RandomAccessHprofReader;", "Ljava/io/Closeable;", "Lshark/s;", "source", "Lshark/HprofHeader;", "hprofHeader", "<init>", "(Lshark/s;Lshark/HprofHeader;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "recordPosition", "recordSize", "Lkotlin/Function1;", "Lshark/HprofRecordReader;", "Lkotlin/ExtensionFunctionType;", "withRecordReader", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JJLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "close", "()V", "Lokio/Buffer;", "b", "Lokio/Buffer;", "buffer", "c", "Lshark/HprofRecordReader;", "reader", "d", "Lshark/s;", "e", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class RandomAccessHprofReader implements Closeable {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Buffer buffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final HprofRecordReader reader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC44497s source;

    /* JADX INFO: compiled from: RandomAccessHprofReader.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lshark/RandomAccessHprofReader$Companion;", "", "<init>", "()V", "Ljava/io/File;", "hprofFile", "Lshark/HprofHeader;", "hprofHeader", "Lshark/RandomAccessHprofReader;", "openReaderFor", "(Ljava/io/File;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;", "Lshark/t;", "hprofSourceProvider", "(Lshark/t;Lshark/HprofHeader;)Lshark/RandomAccessHprofReader;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public static /* synthetic */ RandomAccessHprofReader openReaderFor$default(Companion companion, File file, HprofHeader hprofHeader, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                hprofHeader = HprofHeader.INSTANCE.parseHeaderOf(file);
            }
            return companion.openReaderFor(file, hprofHeader);
        }

        @NotNull
        public final RandomAccessHprofReader openReaderFor(@NotNull File hprofFile, @NotNull HprofHeader hprofHeader) {
            return openReaderFor(new C44450c(hprofFile), hprofHeader);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RandomAccessHprofReader openReaderFor$default(Companion companion, InterfaceC44498t interfaceC44498t, HprofHeader hprofHeader, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                InterfaceC44497s interfaceC44497sMo98160a = interfaceC44498t.mo98160a();
                try {
                    HprofHeader headerOf = HprofHeader.INSTANCE.parseHeaderOf(interfaceC44497sMo98160a.mo98163H());
                    CloseableKt.closeFinally(interfaceC44497sMo98160a, null);
                    hprofHeader = headerOf;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(interfaceC44497sMo98160a, th2);
                        throw th3;
                    }
                }
            }
            return companion.openReaderFor(interfaceC44498t, hprofHeader);
        }

        @NotNull
        public final RandomAccessHprofReader openReaderFor(@NotNull InterfaceC44498t hprofSourceProvider, @NotNull HprofHeader hprofHeader) {
            return new RandomAccessHprofReader(hprofSourceProvider.mo98160a(), hprofHeader, null);
        }
    }

    public RandomAccessHprofReader(InterfaceC44497s interfaceC44497s, HprofHeader hprofHeader) {
        this.source = interfaceC44497s;
        Buffer buffer = new Buffer();
        this.buffer = buffer;
        this.reader = new HprofRecordReader(hprofHeader, buffer);
    }

    /* JADX INFO: renamed from: a */
    public final <T> T m98154a(long recordPosition, long recordSize, @NotNull Function1<? super HprofRecordReader, ? extends T> withRecordReader) throws IOException {
        if (!(recordSize > 0)) {
            throw new IllegalArgumentException(("recordSize " + recordSize + " must be > 0").toString());
        }
        long j11 = recordPosition;
        long j12 = recordSize;
        while (j12 > 0) {
            long jMo98162D = this.source.mo98162D(this.buffer, j11, j12);
            if (!(jMo98162D > 0)) {
                throw new IllegalStateException(("Requested " + j12 + " bytes after reading " + (j11 - recordPosition) + ", got 0 bytes instead.").toString());
            }
            j11 += jMo98162D;
            j12 -= jMo98162D;
        }
        T tInvoke = withRecordReader.invoke(this.reader);
        if (this.buffer.size() == 0) {
            return tInvoke;
        }
        throw new IllegalStateException(("Buffer not fully consumed: " + this.buffer.size() + " bytes left").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public /* synthetic */ RandomAccessHprofReader(InterfaceC44497s interfaceC44497s, HprofHeader hprofHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC44497s, hprofHeader);
    }
}
