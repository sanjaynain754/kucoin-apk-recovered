package com.kubi.log.upload;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.dianping.logan.AbstractRunnableC5466i;
import com.dianping.logan.C5458a;
import com.kubi.log.core.C17473a;
import com.kubi.log.upload.LogUploader;
import com.kubi.monitor.BaseIssueException;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import mr.C42597a;
import o00.C42917g;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p669uo.C45281a;
import p697vo.InterfaceC45609a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import py.C43566c;
import retrofit2.Response;
import ro.C44128b;

/* JADX INFO: compiled from: LogUploader.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/log/upload/LogUploader;", "", "<init>", "()V", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/io/File;", "logFile", "e", "(Ljava/io/File;)V", "d", "", "uuid", "", "g", "(Ljava/io/File;Ljava/lang/String;)Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isUploading", "c", "isFailed", "Ljava/util/concurrent/ExecutorService;", "Lkotlin/Lazy;", "f", "()Ljava/util/concurrent/ExecutorService;", "uploadExecutor", "LopUploaderException", "Logger-Uploader_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LogUploader {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LogUploader f32615a = new LogUploader();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isUploading = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isFailed = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy uploadExecutor = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.kubi.log.upload.LogUploader$uploadExecutor$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ExecutorService invoke() {
            return C42917g.m94140f("logger-uploader");
        }
    });

    /* JADX INFO: compiled from: LogUploader.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/log/upload/LogUploader$LopUploaderException;", "Lcom/kubi/monitor/BaseIssueException;", "msg", "", "(Ljava/lang/String;)V", "e", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Logger-Uploader_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class LopUploaderException extends BaseIssueException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LopUploaderException(@NotNull String msg) {
            super("LogUploader", msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LopUploaderException(@NotNull String msg, @NotNull Throwable e11) {
            super("LogUploader", msg, e11);
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(e11, "e");
        }
    }

    /* JADX INFO: renamed from: com.kubi.log.upload.LogUploader$a */
    /* JADX INFO: compiled from: LogUploader.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"com/kubi/log/upload/LogUploader$a", "Lcom/dianping/logan/i;", "Ljava/io/File;", "logFile", "", "b", "(Ljava/io/File;)V", "Logger-Uploader_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C17474a extends AbstractRunnableC5466i {
        /* JADX INFO: renamed from: e */
        public static final void m37867e(File logFile) {
            Intrinsics.checkNotNullParameter(logFile, "$logFile");
            LogUploader.f32615a.m37862e(logFile);
        }

        @Override // com.dianping.logan.AbstractRunnableC5466i
        /* JADX INFO: renamed from: b */
        public void mo7547b(@NotNull final File logFile) {
            Intrinsics.checkNotNullParameter(logFile, "logFile");
            try {
                String name = logFile.getName();
                Intrinsics.checkNotNullExpressionValue(name, "logFile.name");
                if (StringsKt.contains$default((CharSequence) name, (CharSequence) C45281a.f101813a.m100080a(), false, 2, (Object) null)) {
                    LogUploader.f32615a.m37862e(logFile);
                } else {
                    LogUploader.f32615a.m37863f().execute(new Runnable() { // from class: vo.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            LogUploader.C17474a.m37867e(logFile);
                        }
                    });
                }
            } catch (Exception e11) {
                C43846g.m96568c(new LopUploaderException("report log failed", e11), null, 2, null);
                C44128b.m97270n("Logger:LogUploader", "upload log failed, " + e11);
            } finally {
                LogUploader.isUploading.set(false);
                m7546a();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m37862e(File logFile) {
        AtomicBoolean atomicBoolean = isFailed;
        if (atomicBoolean.get()) {
            C44128b.m97266j("Logger:LogUploader", "upload file is failed, skip uploading");
            return;
        }
        if (logFile.exists()) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            if (m37864g(logFile, string)) {
                m37861d(logFile);
            } else {
                atomicBoolean.set(true);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final ExecutorService m37863f() {
        return (ExecutorService) uploadExecutor.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m37864g(File logFile, String uuid) {
        C43566c c43566c = C43566c.f96121a;
        String path = logFile.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "logFile.path");
        String strM95838b = C43566c.m95838b(c43566c, path, "ku_mobilelog", 0, 4, null);
        if (strM95838b == null || strM95838b.length() == 0) {
            C43846g.m96568c(new LopUploaderException("upload log failed, fileId is null"), null, 2, null);
            return false;
        }
        int i11 = 0;
        while (true) {
            if (i11 > 3) {
                C44128b.m97270n("Logger:LogUploader", "upload log failed, max retryTimes");
                C43846g.m96568c(new LopUploaderException("upload log failed, max retryTimes"), null, 2, null);
                return false;
            }
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C17473a c17473a = C17473a.f32591a;
                linkedHashMap.put(AppsFlyerProperties.APP_ID, c17473a.m37856a().getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
                linkedHashMap.put("UUID", uuid);
                if (!TextUtils.isEmpty(c17473a.m37856a().getProvider().mo37854a())) {
                    linkedHashMap.put("userid", c17473a.m37856a().getProvider().mo37854a());
                }
                linkedHashMap.putAll(c17473a.m37856a().getProvider().mo37855b());
                Response<LogResponse> responseExecute = ((InterfaceC45609a) C42597a.m93386b().create(InterfaceC45609a.class)).m100693a(linkedHashMap, RequestBody.INSTANCE.create(strM95838b, MediaType.INSTANCE.parse(ShareTarget.ENCODING_TYPE_MULTIPART))).execute();
                C44128b.m97266j("Logger:LogUploader", "upload log " + responseExecute);
                if (!responseExecute.isSuccessful() || responseExecute.body() == null) {
                    i11++;
                    Thread.sleep(3000L);
                } else {
                    LogResponse logResponseBody = responseExecute.body();
                    Intrinsics.checkNotNull(logResponseBody);
                    if (!Intrinsics.areEqual(logResponseBody.getSuccess(), Boolean.FALSE)) {
                        return true;
                    }
                    LogResponse logResponseBody2 = responseExecute.body();
                    Intrinsics.checkNotNull(logResponseBody2);
                    if (!Intrinsics.areEqual(logResponseBody2.getRetry(), Boolean.TRUE)) {
                        return false;
                    }
                    i11++;
                    Thread.sleep(3000L);
                }
            } catch (Exception e11) {
                i11++;
                C43846g.m96568c(new LopUploaderException("upload log failed", e11), null, 2, null);
            }
            i11++;
            C43846g.m96568c(new LopUploaderException("upload log failed", e11), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m37865h() {
        if (!isUploading.compareAndSet(false, true)) {
            C44128b.m97266j("Logger:LogUploader", "uploadFile is running");
            return;
        }
        isFailed.set(false);
        C5458a.m7494a();
        C5458a.m7497d(C45281a.f101813a.m100081b(7), new C17474a());
    }

    /* JADX INFO: renamed from: d */
    public final void m37861d(File logFile) {
        try {
            logFile.delete();
            String absolutePath = logFile.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "logFile.absolutePath");
            new File(StringsKt.replace$default(absolutePath, ".copy", "", false, 4, (Object) null)).delete();
        } catch (Exception e11) {
            C44128b.m97262f("Logger:LogUploader", "delete failed", e11);
        }
    }
}
