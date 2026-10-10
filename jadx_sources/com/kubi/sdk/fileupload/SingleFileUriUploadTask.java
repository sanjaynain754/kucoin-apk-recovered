package com.kubi.sdk.fileupload;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import mr.C42597a;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;
import py.C43564a;
import py.C43565b;
import retrofit2.Response;
import ro.C44128b;

/* JADX INFO: compiled from: SingleFileUriUploadTask.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 22\u00020\u0001:\u00033\u001c\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\fJ!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/SingleFileUriUploadTask;", "", "", "fileUri", "Landroid/content/Context;", "context", Constants.BIZ, "", "maxRetry", "<init>", "(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;I)V", "e", "()I", "g", "Lcom/kubi/sdk/fileupload/UploadResult;", "f", "()Lcom/kubi/sdk/fileupload/UploadResult;", "Landroid/net/Uri;", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "b", "(Landroid/net/Uri;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "c", "uri", "Lcom/kubi/sdk/fileupload/SingleFileUriUploadTask$a;", "d", "(Landroid/content/Context;Landroid/net/Uri;)Lcom/kubi/sdk/fileupload/SingleFileUriUploadTask$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "Landroid/content/Context;", "I", "taskId", "Lcom/kubi/sdk/fileupload/a;", "Lcom/kubi/sdk/fileupload/a;", "uploadApi", "fileToken", CmcdData.Factory.STREAMING_FORMAT_HLS, "fileId", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCanceled", "Lcom/kubi/sdk/fileupload/SingleFileUriUploadTask$b;", "j", "Lcom/kubi/sdk/fileupload/SingleFileUriUploadTask$b;", "monitorInfo", "k", "Lcom/kubi/sdk/fileupload/SingleFileUriUploadTask$a;", "fileMetaData", CmcdData.Factory.STREAM_TYPE_LIVE, "Companion", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSingleFileUriUploadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleFileUriUploadTask.kt\ncom/kubi/sdk/fileupload/SingleFileUriUploadTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,347:1\n1#2:348\n*E\n"})
public final class SingleFileUriUploadTask {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final String f46584m = C43564a.f96120a.m95836a("SingleFileUploadTask");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String fileUri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String biz;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int maxRetry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String taskId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC23715a uploadApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String fileToken;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public String fileId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isCanceled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public UploadMonitorInfo monitorInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public FileMetaData fileMetaData;

    /* JADX INFO: renamed from: com.kubi.sdk.fileupload.SingleFileUriUploadTask$a, reason: from toString */
    /* JADX INFO: compiled from: SingleFileUriUploadTask.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/SingleFileUriUploadTask$a;", "", "Landroid/net/Uri;", "uri", "", "name", "", "size", "mimeType", "<init>", "(Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/net/Uri;", "d", "()Landroid/net/Uri;", "b", "Ljava/lang/String;", "c", "J", "()J", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class FileMetaData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final Uri uri;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public final long size;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String mimeType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileMetaData)) {
                return false;
            }
            FileMetaData fileMetaData = (FileMetaData) other;
            return Intrinsics.areEqual(this.uri, fileMetaData.uri) && Intrinsics.areEqual(this.name, fileMetaData.name) && this.size == fileMetaData.size && Intrinsics.areEqual(this.mimeType, fileMetaData.mimeType);
        }

        public FileMetaData(@NotNull Uri uri, @NotNull String name, long j11, @Nullable String str) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(name, "name");
            this.uri = uri;
            this.name = name;
            this.size = j11;
            this.mimeType = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iHashCode = ((((this.uri.hashCode() * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.size)) * 31;
            String str = this.mimeType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "FileMetaData(uri=" + this.uri + ", name=" + this.name + ", size=" + this.size + ", mimeType=" + this.mimeType + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.fileupload.SingleFileUriUploadTask$b, reason: from toString */
    /* JADX INFO: compiled from: SingleFileUriUploadTask.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\"\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\nR\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\nR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/SingleFileUriUploadTask$b;", "", "", "size", "<init>", "(J)V", "", "resultCode", "", "e", "(I)V", "f", "()V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "()J", "g", "b", "I", "c", CmcdData.Factory.STREAMING_FORMAT_HLS, "tokenRetryTimes", "d", "i", "uploadRetryTimes", "startTime", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSingleFileUriUploadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleFileUriUploadTask.kt\ncom/kubi/sdk/fileupload/SingleFileUriUploadTask$UploadMonitorInfo\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,347:1\n71#2,4:348\n71#2,4:352\n*S KotlinDebug\n*F\n+ 1 SingleFileUriUploadTask.kt\ncom/kubi/sdk/fileupload/SingleFileUriUploadTask$UploadMonitorInfo\n*L\n284#1:348,4\n294#1:352,4\n*E\n"})
    public static final /* data */ class UploadMonitorInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public long size;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int tokenRetryTimes;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int uploadRetryTimes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final long startTime;

        public UploadMonitorInfo() {
            this(0L, 1, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadMonitorInfo) && this.size == ((UploadMonitorInfo) other).size;
        }

        public UploadMonitorInfo(long j11) {
            this.size = j11;
            this.startTime = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTokenRetryTimes() {
            return this.tokenRetryTimes;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getUploadRetryTimes() {
            return this.uploadRetryTimes;
        }

        /* JADX INFO: renamed from: e */
        public final void m56644e(int resultCode) {
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42391b("code", resultCode);
            eventParametersBuilderAcquire.m42391b("number1", getTokenRetryTimes());
            eventParametersBuilderAcquire.m42391b("number2", getUploadRetryTimes());
            eventParametersBuilderAcquire.m42392c(TypedValues.TransitionType.S_DURATION, System.currentTimeMillis() - getStartTime());
            eventParametersBuilderAcquire.m42392c("size", getSize());
            TechnologyEvent.m42388d("log_upload", eventParametersBuilderAcquire);
        }

        /* JADX INFO: renamed from: f */
        public final void m56645f() {
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42391b("code", 0);
            eventParametersBuilderAcquire.m42391b("number1", getTokenRetryTimes());
            eventParametersBuilderAcquire.m42391b("number2", getUploadRetryTimes());
            eventParametersBuilderAcquire.m42392c(TypedValues.TransitionType.S_DURATION, System.currentTimeMillis() - getStartTime());
            eventParametersBuilderAcquire.m42392c("size", getSize());
            TechnologyEvent.m42388d("log_upload", eventParametersBuilderAcquire);
        }

        /* JADX INFO: renamed from: g */
        public final void m56646g(long j11) {
            this.size = j11;
        }

        /* JADX INFO: renamed from: h */
        public final void m56647h(int i11) {
            this.tokenRetryTimes = i11;
        }

        public int hashCode() {
            return Long.hashCode(this.size);
        }

        /* JADX INFO: renamed from: i */
        public final void m56648i(int i11) {
            this.uploadRetryTimes = i11;
        }

        @NotNull
        public String toString() {
            return "UploadMonitorInfo(size=" + this.size + ')';
        }

        public /* synthetic */ UploadMonitorInfo(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0L : j11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.fileupload.SingleFileUriUploadTask$c */
    /* JADX INFO: compiled from: SingleFileUriUploadTask.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"com/kubi/sdk/fileupload/SingleFileUriUploadTask$c", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSingleFileUriUploadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleFileUriUploadTask.kt\ncom/kubi/sdk/fileupload/SingleFileUriUploadTask$asRequestBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,347:1\n1#2:348\n*E\n"})
    public static final class C23714c extends RequestBody {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ MediaType f46604g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ SingleFileUriUploadTask f46605h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Uri f46606i;

        public C23714c(MediaType mediaType, SingleFileUriUploadTask singleFileUriUploadTask, Uri uri) {
            this.f46604g = mediaType;
            this.f46605h = singleFileUriUploadTask;
            this.f46606i = uri;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws FileNotFoundException {
            InputStream inputStreamOpenInputStream = this.f46605h.context.getContentResolver().openInputStream(this.f46606i);
            if (inputStreamOpenInputStream == null) {
                return 0L;
            }
            try {
                long jAvailable = inputStreamOpenInputStream.available();
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return jAvailable;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        }

        @Override // okhttp3.RequestBody
        @Nullable
        /* JADX INFO: renamed from: contentType, reason: from getter */
        public MediaType getF27464i() {
            return this.f46604g;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(@NotNull BufferedSink sink) throws FileNotFoundException {
            Source source;
            Intrinsics.checkNotNullParameter(sink, "sink");
            InputStream inputStreamOpenInputStream = this.f46605h.context.getContentResolver().openInputStream(this.f46606i);
            if (inputStreamOpenInputStream == null || (source = Okio.source(inputStreamOpenInputStream)) == null) {
                return;
            }
            try {
                sink.writeAll(source);
                CloseableKt.closeFinally(source, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(source, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public int m56635g() {
        int i11 = 0;
        while (!this.isCanceled.get()) {
            try {
                if (i11 > this.maxRetry) {
                    C44128b.m97261e(f46584m, "upload log failed, max retryTimes");
                } else {
                    if (i11 > 0) {
                        Thread.sleep(3000L);
                    }
                    FileMetaData fileMetaData = this.fileMetaData;
                    if (fileMetaData == null) {
                        return 3;
                    }
                    String mimeType = fileMetaData.getMimeType();
                    Response<UploadResponse> responseExecute = this.uploadApi.m56649a(MultipartBody.Part.INSTANCE.createFormData("file", fileMetaData.getName(), m56630b(fileMetaData.getUri(), mimeType != null ? MediaType.INSTANCE.parse(mimeType) : null)), RequestBody.INSTANCE.create(this.fileToken, MediaType.INSTANCE.parse(ShareTarget.ENCODING_TYPE_MULTIPART))).execute();
                    C44128b.m97266j(f46584m, "upload:responseCode:" + responseExecute.code() + ",error:" + responseExecute.errorBody());
                    if (responseExecute.isSuccessful() && responseExecute.body() != null) {
                        UploadResponse uploadResponseBody = responseExecute.body();
                        Intrinsics.checkNotNull(uploadResponseBody);
                        UploadResponse uploadResponse = uploadResponseBody;
                        if (uploadResponse.getSuccess()) {
                            String data = uploadResponse.getData();
                            this.fileId = data;
                            if (data.length() == 0) {
                            }
                        } else if (!uploadResponse.getRetry()) {
                        }
                    }
                    i11++;
                }
            } catch (Error e11) {
                C43846g.m96568c(new FileTransferException("upload error", e11), null, 2, null);
            } catch (Exception e12) {
                C43846g.m96568c(new FileTransferException("upload exception", e12), null, 2, null);
            }
            this.monitorInfo.m56648i(i11);
            if (this.fileId.length() > 0) {
                this.monitorInfo.m56645f();
                return 0;
            }
            this.monitorInfo.m56644e(2);
            return 2;
        }
        return -1;
    }

    public SingleFileUriUploadTask(@NotNull String fileUri, @NotNull Context context, @NotNull String biz, int i11) {
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biz, "biz");
        this.fileUri = fileUri;
        this.context = context;
        this.biz = biz;
        this.maxRetry = i11;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.taskId = string;
        Object objCreate = C42597a.m93386b().create(InterfaceC23715a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "getDefaultRetrofit().create(UploadApi::class.java)");
        this.uploadApi = (InterfaceC23715a) objCreate;
        this.fileToken = "";
        this.fileId = "";
        this.isCanceled = new AtomicBoolean(false);
        this.monitorInfo = new UploadMonitorInfo(0L, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final RequestBody m56630b(@NotNull Uri uri, @Nullable MediaType mediaType) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return new C23714c(mediaType, this, uri);
    }

    /* JADX INFO: renamed from: c */
    public final int m56631c() {
        if (this.fileUri.length() == 0) {
            C44128b.m97266j(f46584m, "upload:checkParams:" + this.fileUri + " is not exist or is an directory");
            this.monitorInfo.m56644e(3);
            return 3;
        }
        Uri uri = Uri.parse(this.fileUri);
        if (uri == null) {
            C44128b.m97266j(f46584m, "upload:checkParams:" + this.fileUri + " is not exist or is an directory");
            this.monitorInfo.m56644e(3);
            return 3;
        }
        FileMetaData fileMetaDataM56632d = m56632d(this.context, uri);
        this.fileMetaData = fileMetaDataM56632d;
        if (fileMetaDataM56632d == null) {
            C44128b.m97266j(f46584m, "upload:checkParams:" + this.fileUri + " is not exist or is an directory");
            this.monitorInfo.m56644e(3);
            return 3;
        }
        if ((fileMetaDataM56632d != null ? fileMetaDataM56632d.getSize() : Long.MAX_VALUE) > 31457280) {
            C44128b.m97266j(f46584m, "upload:checkParams:" + this.fileUri + " is too large or size is 0");
            this.monitorInfo.m56644e(3);
            return 3;
        }
        if (this.biz.length() != 0) {
            return 0;
        }
        C44128b.m97266j(f46584m, "upload:checkParams:" + this.biz + " biz empty");
        this.monitorInfo.m56644e(4);
        return 4;
    }

    /* JADX INFO: renamed from: e */
    public int m56633e() {
        int i11 = 0;
        while (!this.isCanceled.get()) {
            try {
                if (i11 > this.maxRetry) {
                    C44128b.m97261e(f46584m, "upload log failed, max retryTimes");
                } else {
                    FileMetaData fileMetaData = this.fileMetaData;
                    if (fileMetaData == null) {
                        return 3;
                    }
                    if (i11 > 0) {
                        Thread.sleep(3000L);
                    }
                    Response responseExecute = InterfaceC23715a.a.m56651a(this.uploadApi, this.biz, fileMetaData.getName(), null, 4, null).execute();
                    C44128b.m97266j(f46584m, "generateToken:responseCode:" + responseExecute.code() + ",error:" + responseExecute.errorBody());
                    if (responseExecute.isSuccessful() && responseExecute.body() != null) {
                        Object objBody = responseExecute.body();
                        Intrinsics.checkNotNull(objBody);
                        TokenResponse tokenResponse = (TokenResponse) objBody;
                        if (tokenResponse.getSuccess()) {
                            String token = tokenResponse.getData().getToken();
                            this.fileToken = token;
                            if (token.length() == 0) {
                            }
                        } else if (tokenResponse.getRetry()) {
                            if (Intrinsics.areEqual(tokenResponse.getCode(), "20002")) {
                                Thread.sleep(1000L);
                            }
                        }
                    }
                    i11++;
                }
            } catch (Error e11) {
                C43846g.m96568c(new FileTransferException("getToken", e11), null, 2, null);
            } catch (Exception e12) {
                C44128b.m97262f(f46584m, "generateToken:failed", e12);
                C43846g.m96568c(new FileTransferException("getToken", e12), null, 2, null);
            }
            this.monitorInfo.m56647h(i11);
            if (this.fileToken.length() > 0) {
                return 0;
            }
            this.monitorInfo.m56644e(1);
            return 1;
        }
        return -1;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public UploadResult m56634f() {
        UploadResult uploadResult = new UploadResult(0, null, null, 7, null);
        this.monitorInfo = new UploadMonitorInfo(0L, 1, null);
        uploadResult.setResultCode(m56631c());
        UploadMonitorInfo uploadMonitorInfo = this.monitorInfo;
        FileMetaData fileMetaData = this.fileMetaData;
        uploadMonitorInfo.m56646g(fileMetaData != null ? fileMetaData.getSize() : 0L);
        if (C43565b.m95837a(uploadResult.getResultCode())) {
            uploadResult.setResultCode(m56633e());
            if (C43565b.m95837a(uploadResult.getResultCode())) {
                uploadResult.setResultCode(m56635g());
                uploadResult.setFileId(this.fileId);
                return uploadResult;
            }
        }
        return uploadResult;
    }

    /* JADX INFO: renamed from: d */
    public final FileMetaData m56632d(Context context, Uri uri) {
        Cursor cursorQuery;
        File file;
        if (StringsKt.equals$default(uri.getScheme(), "file", false, 2, null)) {
            String path = uri.getPath();
            if (path != null) {
                file = new File(path);
            } else {
                file = null;
            }
            if (file != null) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "file.name");
                return new FileMetaData(uri, name, file.length(), context.getContentResolver().getType(uri));
            }
        } else if (StringsKt.equals$default(uri.getScheme(), "content", false, 2, null) && (cursorQuery = context.getContentResolver().query(uri, null, null, null, null)) != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("_display_name");
                    int columnIndex2 = cursorQuery.getColumnIndex("_size");
                    String name2 = cursorQuery.getString(columnIndex);
                    long j11 = cursorQuery.getLong(columnIndex2);
                    Intrinsics.checkNotNullExpressionValue(name2, "name");
                    FileMetaData fileMetaData = new FileMetaData(uri, name2, j11, context.getContentResolver().getType(uri));
                    CloseableKt.closeFinally(cursorQuery, null);
                    return fileMetaData;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        return null;
    }
}
