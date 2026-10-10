package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.Arrays;
import java.util.Set;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: StreamingHprofReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m90084d2 = {"Lshark/StreamingHprofReader;", "", "Lshark/w;", "sourceProvider", "Lshark/HprofHeader;", "header", "<init>", "(Lshark/w;Lshark/HprofHeader;)V", "", "Lshark/HprofRecordTag;", "recordTags", "Lshark/OnHprofRecordTagListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Set;Lshark/OnHprofRecordTagListener;)J", "Lshark/w;", "b", "Lshark/HprofHeader;", "c", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class StreamingHprofReader {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final InterfaceC44501w sourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final HprofHeader header;

    /* JADX INFO: compiled from: StreamingHprofReader.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lshark/StreamingHprofReader$Companion;", "", "<init>", "()V", "Ljava/io/File;", "hprofFile", "Lshark/HprofHeader;", "hprofHeader", "Lshark/StreamingHprofReader;", "readerFor", "(Ljava/io/File;Lshark/HprofHeader;)Lshark/StreamingHprofReader;", "Lshark/w;", "hprofSourceProvider", "(Lshark/w;Lshark/HprofHeader;)Lshark/StreamingHprofReader;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public static /* synthetic */ StreamingHprofReader readerFor$default(Companion companion, File file, HprofHeader hprofHeader, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                hprofHeader = HprofHeader.INSTANCE.parseHeaderOf(file);
            }
            return companion.readerFor(file, hprofHeader);
        }

        @NotNull
        public final StreamingHprofReader readerFor(@NotNull File hprofFile, @NotNull HprofHeader hprofHeader) {
            return readerFor(new C44450c(hprofFile), hprofHeader);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ StreamingHprofReader readerFor$default(Companion companion, InterfaceC44501w interfaceC44501w, HprofHeader hprofHeader, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                BufferedSource bufferedSourceMo98161b = interfaceC44501w.mo98161b();
                try {
                    HprofHeader headerOf = HprofHeader.INSTANCE.parseHeaderOf(bufferedSourceMo98161b);
                    CloseableKt.closeFinally(bufferedSourceMo98161b, null);
                    hprofHeader = headerOf;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedSourceMo98161b, th2);
                        throw th3;
                    }
                }
            }
            return companion.readerFor(interfaceC44501w, hprofHeader);
        }

        @NotNull
        public final StreamingHprofReader readerFor(@NotNull InterfaceC44501w hprofSourceProvider, @NotNull HprofHeader hprofHeader) {
            return new StreamingHprofReader(hprofSourceProvider, hprofHeader, null);
        }
    }

    public StreamingHprofReader(InterfaceC44501w interfaceC44501w, HprofHeader hprofHeader) {
        this.sourceProvider = interfaceC44501w;
        this.header = hprofHeader;
    }

    public /* synthetic */ StreamingHprofReader(InterfaceC44501w interfaceC44501w, HprofHeader hprofHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC44501w, hprofHeader);
    }

    /* JADX INFO: renamed from: a */
    public final long m98155a(@NotNull Set<? extends HprofRecordTag> recordTags, @NotNull OnHprofRecordTagListener listener) {
        int i11;
        BufferedSource bufferedSourceMo98161b = this.sourceProvider.mo98161b();
        try {
            HprofRecordReader hprofRecordReader = new HprofRecordReader(this.header, bufferedSourceMo98161b);
            hprofRecordReader.m98108U(this.header.getRecordsPosition());
            int byteSize = PrimitiveType.INT.getByteSize();
            int iM98107T = hprofRecordReader.m98107T(2);
            while (!bufferedSourceMo98161b.exhausted()) {
                int iM98101N = hprofRecordReader.m98101N();
                hprofRecordReader.m98108U(byteSize);
                long jM98102O = hprofRecordReader.m98102O();
                HprofRecordTag hprofRecordTag = HprofRecordTag.STRING_IN_UTF8;
                if (iM98101N != hprofRecordTag.getTag()) {
                    HprofRecordTag hprofRecordTag2 = HprofRecordTag.LOAD_CLASS;
                    if (iM98101N != hprofRecordTag2.getTag()) {
                        HprofRecordTag hprofRecordTag3 = HprofRecordTag.STACK_FRAME;
                        if (iM98101N != hprofRecordTag3.getTag()) {
                            HprofRecordTag hprofRecordTag4 = HprofRecordTag.STACK_TRACE;
                            if (iM98101N != hprofRecordTag4.getTag()) {
                                if (iM98101N == HprofRecordTag.HEAP_DUMP.getTag() || iM98101N == HprofRecordTag.HEAP_DUMP_SEGMENT.getTag()) {
                                    long bytesRead = hprofRecordReader.getBytesRead();
                                    int i12 = 0;
                                    long j11 = 0;
                                    while (hprofRecordReader.getBytesRead() - bytesRead < jM98102O) {
                                        long j12 = jM98102O;
                                        int i13 = i12;
                                        long bytesRead2 = hprofRecordReader.getBytesRead();
                                        int iM98101N2 = hprofRecordReader.m98101N();
                                        int i14 = byteSize;
                                        HprofRecordTag hprofRecordTag5 = HprofRecordTag.ROOT_UNKNOWN;
                                        long j13 = j11;
                                        if (iM98101N2 != hprofRecordTag5.getTag()) {
                                            HprofRecordTag hprofRecordTag6 = HprofRecordTag.ROOT_JNI_GLOBAL;
                                            if (iM98101N2 != hprofRecordTag6.getTag()) {
                                                HprofRecordTag hprofRecordTag7 = HprofRecordTag.ROOT_JNI_LOCAL;
                                                if (iM98101N2 != hprofRecordTag7.getTag()) {
                                                    HprofRecordTag hprofRecordTag8 = HprofRecordTag.ROOT_JAVA_FRAME;
                                                    if (iM98101N2 != hprofRecordTag8.getTag()) {
                                                        HprofRecordTag hprofRecordTag9 = HprofRecordTag.ROOT_NATIVE_STACK;
                                                        if (iM98101N2 != hprofRecordTag9.getTag()) {
                                                            HprofRecordTag hprofRecordTag10 = HprofRecordTag.ROOT_STICKY_CLASS;
                                                            if (iM98101N2 != hprofRecordTag10.getTag()) {
                                                                HprofRecordTag hprofRecordTag11 = HprofRecordTag.ROOT_THREAD_BLOCK;
                                                                if (iM98101N2 != hprofRecordTag11.getTag()) {
                                                                    HprofRecordTag hprofRecordTag12 = HprofRecordTag.ROOT_MONITOR_USED;
                                                                    if (iM98101N2 != hprofRecordTag12.getTag()) {
                                                                        HprofRecordTag hprofRecordTag13 = HprofRecordTag.ROOT_THREAD_OBJECT;
                                                                        if (iM98101N2 != hprofRecordTag13.getTag()) {
                                                                            HprofRecordTag hprofRecordTag14 = HprofRecordTag.ROOT_INTERNED_STRING;
                                                                            if (iM98101N2 != hprofRecordTag14.getTag()) {
                                                                                HprofRecordTag hprofRecordTag15 = HprofRecordTag.ROOT_FINALIZING;
                                                                                if (iM98101N2 != hprofRecordTag15.getTag()) {
                                                                                    HprofRecordTag hprofRecordTag16 = HprofRecordTag.ROOT_DEBUGGER;
                                                                                    if (iM98101N2 != hprofRecordTag16.getTag()) {
                                                                                        HprofRecordTag hprofRecordTag17 = HprofRecordTag.ROOT_REFERENCE_CLEANUP;
                                                                                        if (iM98101N2 != hprofRecordTag17.getTag()) {
                                                                                            HprofRecordTag hprofRecordTag18 = HprofRecordTag.ROOT_VM_INTERNAL;
                                                                                            if (iM98101N2 != hprofRecordTag18.getTag()) {
                                                                                                HprofRecordTag hprofRecordTag19 = HprofRecordTag.ROOT_JNI_MONITOR;
                                                                                                if (iM98101N2 != hprofRecordTag19.getTag()) {
                                                                                                    HprofRecordTag hprofRecordTag20 = HprofRecordTag.ROOT_UNREACHABLE;
                                                                                                    if (iM98101N2 != hprofRecordTag20.getTag()) {
                                                                                                        HprofRecordTag hprofRecordTag21 = HprofRecordTag.CLASS_DUMP;
                                                                                                        if (iM98101N2 != hprofRecordTag21.getTag()) {
                                                                                                            HprofRecordTag hprofRecordTag22 = HprofRecordTag.INSTANCE_DUMP;
                                                                                                            if (iM98101N2 != hprofRecordTag22.getTag()) {
                                                                                                                HprofRecordTag hprofRecordTag23 = HprofRecordTag.OBJECT_ARRAY_DUMP;
                                                                                                                if (iM98101N2 != hprofRecordTag23.getTag()) {
                                                                                                                    HprofRecordTag hprofRecordTag24 = HprofRecordTag.PRIMITIVE_ARRAY_DUMP;
                                                                                                                    if (iM98101N2 != hprofRecordTag24.getTag()) {
                                                                                                                        HprofRecordTag hprofRecordTag25 = HprofRecordTag.PRIMITIVE_ARRAY_NODATA;
                                                                                                                        if (iM98101N2 == hprofRecordTag25.getTag()) {
                                                                                                                            throw new UnsupportedOperationException(hprofRecordTag25 + " cannot be parsed");
                                                                                                                        }
                                                                                                                        HprofRecordTag hprofRecordTag26 = HprofRecordTag.HEAP_DUMP_INFO;
                                                                                                                        if (iM98101N2 != hprofRecordTag26.getTag()) {
                                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                                            sb2.append("Unknown tag ");
                                                                                                                            String str = String.format("0x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(iM98101N2)}, 1));
                                                                                                                            Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(this, *args)");
                                                                                                                            sb2.append(str);
                                                                                                                            sb2.append(" at ");
                                                                                                                            sb2.append(bytesRead2);
                                                                                                                            sb2.append(" after ");
                                                                                                                            String str2 = String.format("0x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
                                                                                                                            Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(this, *args)");
                                                                                                                            sb2.append(str2);
                                                                                                                            sb2.append(" at ");
                                                                                                                            sb2.append(j13);
                                                                                                                            throw new IllegalStateException(sb2.toString());
                                                                                                                        }
                                                                                                                        if (recordTags.contains(hprofRecordTag26)) {
                                                                                                                            listener.mo98153a(hprofRecordTag26, -1L, hprofRecordReader);
                                                                                                                        } else {
                                                                                                                            hprofRecordReader.m98117b0();
                                                                                                                        }
                                                                                                                    } else if (recordTags.contains(hprofRecordTag24)) {
                                                                                                                        listener.mo98153a(hprofRecordTag24, -1L, hprofRecordReader);
                                                                                                                    } else {
                                                                                                                        hprofRecordReader.m98123e0();
                                                                                                                    }
                                                                                                                } else if (recordTags.contains(hprofRecordTag23)) {
                                                                                                                    listener.mo98153a(hprofRecordTag23, -1L, hprofRecordReader);
                                                                                                                } else {
                                                                                                                    hprofRecordReader.m98121d0();
                                                                                                                }
                                                                                                            } else if (recordTags.contains(hprofRecordTag22)) {
                                                                                                                listener.mo98153a(hprofRecordTag22, -1L, hprofRecordReader);
                                                                                                            } else {
                                                                                                                hprofRecordReader.m98119c0();
                                                                                                            }
                                                                                                        } else if (recordTags.contains(hprofRecordTag21)) {
                                                                                                            listener.mo98153a(hprofRecordTag21, -1L, hprofRecordReader);
                                                                                                        } else {
                                                                                                            hprofRecordReader.m98113Z();
                                                                                                        }
                                                                                                    } else if (recordTags.contains(hprofRecordTag20)) {
                                                                                                        listener.mo98153a(hprofRecordTag20, -1L, hprofRecordReader);
                                                                                                    } else {
                                                                                                        hprofRecordReader.m98108U(iM98107T);
                                                                                                    }
                                                                                                } else if (recordTags.contains(hprofRecordTag19)) {
                                                                                                    listener.mo98153a(hprofRecordTag19, -1L, hprofRecordReader);
                                                                                                } else {
                                                                                                    hprofRecordReader.m98108U(iM98107T + i14 + i14);
                                                                                                }
                                                                                            } else if (recordTags.contains(hprofRecordTag18)) {
                                                                                                listener.mo98153a(hprofRecordTag18, -1L, hprofRecordReader);
                                                                                            } else {
                                                                                                hprofRecordReader.m98108U(iM98107T);
                                                                                            }
                                                                                        } else if (recordTags.contains(hprofRecordTag17)) {
                                                                                            listener.mo98153a(hprofRecordTag17, -1L, hprofRecordReader);
                                                                                        } else {
                                                                                            hprofRecordReader.m98108U(iM98107T);
                                                                                        }
                                                                                    } else if (recordTags.contains(hprofRecordTag16)) {
                                                                                        listener.mo98153a(hprofRecordTag16, -1L, hprofRecordReader);
                                                                                    } else {
                                                                                        hprofRecordReader.m98108U(iM98107T);
                                                                                    }
                                                                                } else if (recordTags.contains(hprofRecordTag15)) {
                                                                                    listener.mo98153a(hprofRecordTag15, -1L, hprofRecordReader);
                                                                                } else {
                                                                                    hprofRecordReader.m98108U(iM98107T);
                                                                                }
                                                                            } else if (recordTags.contains(hprofRecordTag14)) {
                                                                                listener.mo98153a(hprofRecordTag14, -1L, hprofRecordReader);
                                                                            } else {
                                                                                hprofRecordReader.m98108U(iM98107T);
                                                                            }
                                                                        } else if (recordTags.contains(hprofRecordTag13)) {
                                                                            listener.mo98153a(hprofRecordTag13, -1L, hprofRecordReader);
                                                                        } else {
                                                                            hprofRecordReader.m98108U(iM98107T + i14 + i14);
                                                                        }
                                                                    } else if (recordTags.contains(hprofRecordTag12)) {
                                                                        listener.mo98153a(hprofRecordTag12, -1L, hprofRecordReader);
                                                                    } else {
                                                                        hprofRecordReader.m98108U(iM98107T);
                                                                    }
                                                                } else if (recordTags.contains(hprofRecordTag11)) {
                                                                    listener.mo98153a(hprofRecordTag11, -1L, hprofRecordReader);
                                                                } else {
                                                                    hprofRecordReader.m98108U(iM98107T + i14);
                                                                }
                                                            } else if (recordTags.contains(hprofRecordTag10)) {
                                                                listener.mo98153a(hprofRecordTag10, -1L, hprofRecordReader);
                                                            } else {
                                                                hprofRecordReader.m98108U(iM98107T);
                                                            }
                                                        } else if (recordTags.contains(hprofRecordTag9)) {
                                                            listener.mo98153a(hprofRecordTag9, -1L, hprofRecordReader);
                                                        } else {
                                                            hprofRecordReader.m98108U(iM98107T + i14);
                                                        }
                                                    } else if (recordTags.contains(hprofRecordTag8)) {
                                                        listener.mo98153a(hprofRecordTag8, -1L, hprofRecordReader);
                                                    } else {
                                                        hprofRecordReader.m98108U(iM98107T + i14 + i14);
                                                    }
                                                } else if (recordTags.contains(hprofRecordTag7)) {
                                                    listener.mo98153a(hprofRecordTag7, -1L, hprofRecordReader);
                                                } else {
                                                    hprofRecordReader.m98108U(iM98107T + i14 + i14);
                                                }
                                            } else if (recordTags.contains(hprofRecordTag6)) {
                                                listener.mo98153a(hprofRecordTag6, -1L, hprofRecordReader);
                                            } else {
                                                hprofRecordReader.m98108U(iM98107T + iM98107T);
                                            }
                                        } else if (recordTags.contains(hprofRecordTag5)) {
                                            listener.mo98153a(hprofRecordTag5, -1L, hprofRecordReader);
                                        } else {
                                            hprofRecordReader.m98108U(iM98107T);
                                        }
                                        j11 = bytesRead2;
                                        jM98102O = j12;
                                        byteSize = i14;
                                        i12 = iM98101N2;
                                    }
                                } else {
                                    i11 = byteSize;
                                    HprofRecordTag hprofRecordTag27 = HprofRecordTag.HEAP_DUMP_END;
                                    if (iM98101N != hprofRecordTag27.getTag()) {
                                        hprofRecordReader.m98109V(jM98102O);
                                    } else if (recordTags.contains(hprofRecordTag27)) {
                                        listener.mo98153a(hprofRecordTag27, jM98102O, hprofRecordReader);
                                    }
                                }
                                byteSize = i11;
                            } else if (recordTags.contains(hprofRecordTag4)) {
                                listener.mo98153a(hprofRecordTag4, jM98102O, hprofRecordReader);
                            } else {
                                hprofRecordReader.m98109V(jM98102O);
                            }
                        } else if (recordTags.contains(hprofRecordTag3)) {
                            listener.mo98153a(hprofRecordTag3, jM98102O, hprofRecordReader);
                        } else {
                            hprofRecordReader.m98109V(jM98102O);
                        }
                    } else if (recordTags.contains(hprofRecordTag2)) {
                        listener.mo98153a(hprofRecordTag2, jM98102O, hprofRecordReader);
                    } else {
                        hprofRecordReader.m98109V(jM98102O);
                    }
                } else if (recordTags.contains(hprofRecordTag)) {
                    listener.mo98153a(hprofRecordTag, jM98102O, hprofRecordReader);
                } else {
                    hprofRecordReader.m98109V(jM98102O);
                }
                i11 = byteSize;
                byteSize = i11;
            }
            long bytesRead3 = hprofRecordReader.getBytesRead();
            CloseableKt.closeFinally(bufferedSourceMo98161b, null);
            return bytesRead3;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedSourceMo98161b, th2);
                throw th3;
            }
        }
    }
}
