package com.kubi.sdk.fileupload;

import android.webkit.MimeTypeMap;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.p110rn.Constants;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import mr.C42597a;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import py.C43564a;
import py.C43565b;
import retrofit2.Response;
import ro.C44128b;

/* JADX INFO: compiled from: SingleFileUploadTask.kt */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "use uploadSingleFileWithUriSync instead")
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 (2\u00020\u0001:\u0002)\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u0002*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/SingleFileUploadTask;", "", "", "fileName", Constants.BIZ, "", "maxRetry", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "c", "()I", "e", "Lcom/kubi/sdk/fileupload/UploadResult;", "d", "()Lcom/kubi/sdk/fileupload/UploadResult;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/io/File;", "b", "(Ljava/io/File;)Ljava/lang/String;", "Ljava/lang/String;", "I", "taskId", "Lcom/kubi/sdk/fileupload/a;", "Lcom/kubi/sdk/fileupload/a;", "uploadApi", "f", "fileToken", "g", "fileId", "Ljava/util/concurrent/atomic/AtomicBoolean;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCanceled", "i", "Ljava/io/File;", "file", "Lcom/kubi/sdk/fileupload/SingleFileUploadTask$a;", "j", "Lcom/kubi/sdk/fileupload/SingleFileUploadTask$a;", "monitorInfo", "k", "Companion", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SingleFileUploadTask {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final String f46568l = C43564a.f96120a.m95836a("SingleFileUploadTask");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String fileName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String biz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int maxRetry;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String taskId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC23715a uploadApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String fileToken;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String fileId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isCanceled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public File file;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public UploadMonitorInfo monitorInfo;

    /* JADX INFO: renamed from: com.kubi.sdk.fileupload.SingleFileUploadTask$a, reason: from toString */
    /* JADX INFO: compiled from: SingleFileUploadTask.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\"\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\nR\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\nR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/fileupload/SingleFileUploadTask$a;", "", "", "size", "<init>", "(J)V", "", "resultCode", "", "e", "(I)V", "f", "()V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "()J", "g", "b", "I", "c", CmcdData.Factory.STREAMING_FORMAT_HLS, "tokenRetryTimes", "d", "i", "uploadRetryTimes", "startTime", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSingleFileUploadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleFileUploadTask.kt\ncom/kubi/sdk/fileupload/SingleFileUploadTask$UploadMonitorInfo\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,286:1\n71#2,4:287\n71#2,4:291\n*S KotlinDebug\n*F\n+ 1 SingleFileUploadTask.kt\ncom/kubi/sdk/fileupload/SingleFileUploadTask$UploadMonitorInfo\n*L\n260#1:287,4\n270#1:291,4\n*E\n"})
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
        public final void m56624e(int resultCode) {
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
        public final void m56625f() {
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
        public final void m56626g(long j11) {
            this.size = j11;
        }

        /* JADX INFO: renamed from: h */
        public final void m56627h(int i11) {
            this.tokenRetryTimes = i11;
        }

        public int hashCode() {
            return Long.hashCode(this.size);
        }

        /* JADX INFO: renamed from: i */
        public final void m56628i(int i11) {
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

    /* JADX INFO: renamed from: e */
    public int m56619e() {
        int i11 = 0;
        while (!this.isCanceled.get()) {
            try {
                if (i11 > this.maxRetry) {
                    C44128b.m97261e(f46568l, "upload log failed, max retryTimes");
                } else {
                    if (i11 > 0) {
                        Thread.sleep(3000L);
                    }
                    String strM56616b = m56616b(this.file);
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    String name = this.file.getName();
                    RequestBody.Companion companion2 = RequestBody.INSTANCE;
                    File file = this.file;
                    MediaType.Companion companion3 = MediaType.INSTANCE;
                    Response<UploadResponse> responseExecute = this.uploadApi.m56649a(companion.createFormData("file", name, companion2.create(file, companion3.parse(strM56616b))), companion2.create(this.fileToken, companion3.parse(ShareTarget.ENCODING_TYPE_MULTIPART))).execute();
                    C44128b.m97266j(f46568l, "upload:responseCode:" + responseExecute.code() + ",error:" + responseExecute.errorBody());
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
            this.monitorInfo.m56628i(i11);
            String str = this.fileId;
            if (str == null || str.length() == 0) {
                this.monitorInfo.m56624e(2);
                return 2;
            }
            this.monitorInfo.m56625f();
            return 0;
        }
        return -1;
    }

    public SingleFileUploadTask(@NotNull String fileName, @NotNull String biz, int i11) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(biz, "biz");
        this.fileName = fileName;
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
        this.file = new File(fileName);
        this.monitorInfo = new UploadMonitorInfo(0L, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m56615a() {
        if (!this.file.exists() || !this.file.isFile()) {
            C44128b.m97266j(f46568l, "upload:checkParams:" + this.file + " is not exist or is an directory");
            this.monitorInfo.m56624e(3);
            return 3;
        }
        if (this.file.length() > 31457280) {
            C44128b.m97266j(f46568l, "upload:checkParams:" + this.file + " is too large");
            this.monitorInfo.m56624e(3);
            return 3;
        }
        if (this.biz.length() != 0) {
            return 0;
        }
        C44128b.m97266j(f46568l, "upload:checkParams:" + this.biz + " biz empty");
        this.monitorInfo.m56624e(4);
        return 4;
    }

    /* JADX INFO: renamed from: c */
    public int m56617c() {
        int i11 = 0;
        while (!this.isCanceled.get()) {
            try {
                if (i11 > this.maxRetry) {
                    C44128b.m97261e(f46568l, "upload log failed, max retryTimes");
                } else {
                    if (i11 > 0) {
                        Thread.sleep(3000L);
                    }
                    InterfaceC23715a interfaceC23715a = this.uploadApi;
                    String str = this.biz;
                    String name = this.file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "file.name");
                    Response responseExecute = InterfaceC23715a.a.m56651a(interfaceC23715a, str, name, null, 4, null).execute();
                    C44128b.m97266j(f46568l, "generateToken:responseCode:" + responseExecute.code() + ",error:" + responseExecute.errorBody());
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
                C44128b.m97262f(f46568l, "generateToken:failed", e12);
                C43846g.m96568c(new FileTransferException("getToken", e12), null, 2, null);
            }
            this.monitorInfo.m56627h(i11);
            String str2 = this.fileToken;
            if (str2 != null && str2.length() != 0) {
                return 0;
            }
            this.monitorInfo.m56624e(1);
            return 1;
        }
        return -1;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public UploadResult m56618d() {
        UploadResult uploadResult = new UploadResult(0, null, null, 7, null);
        long j11 = 0;
        this.monitorInfo = new UploadMonitorInfo(j11, 1, null);
        uploadResult.setResultCode(m56615a());
        this.monitorInfo.m56626g(this.file.length());
        if (C43565b.m95837a(uploadResult.getResultCode())) {
            uploadResult.setResultCode(m56617c());
            if (C43565b.m95837a(uploadResult.getResultCode())) {
                uploadResult.setResultCode(m56619e());
                uploadResult.setFileId(this.fileId);
                return uploadResult;
            }
        }
        return uploadResult;
    }

    /* JADX INFO: renamed from: b */
    public final String m56616b(File file) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file));
        if (mimeTypeFromExtension == null) {
            return ConstantsKt.MIME_TYPE_OCTET_STREAM;
        }
        return mimeTypeFromExtension;
    }
}
