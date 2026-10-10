package py;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.ThreadUtils;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.fileupload.SingleFileUploadTask;
import com.kubi.sdk.fileupload.SingleFileUriUploadTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: py.c */
/* JADX INFO: compiled from: UploadManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lpy/c;", "", "<init>", "()V", "", "filePath", Constants.BIZ, "", "maxRetry", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "Landroid/content/Context;", "context", "fileUri", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "fileupload_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C43566c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43566c f96121a = new C43566c();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m95838b(C43566c c43566c, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 3;
        }
        return c43566c.m95840a(str, str2, i11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m95839d(C43566c c43566c, Context context, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 3;
        }
        return c43566c.m95841c(context, str, str2, i11);
    }

    @Deprecated(message = "use uploadSingleFileWithUriSync instead")
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m95840a(@NotNull String filePath, @NotNull String biz, int maxRetry) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(biz, "biz");
        if (ThreadUtils.m6113f()) {
            throw new RuntimeException("uploadSingleFileSync can not be called in main thread");
        }
        return new SingleFileUploadTask(filePath, biz, maxRetry).m56618d().getFileId();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m95841c(@NotNull Context context, @NotNull String fileUri, @NotNull String biz, int maxRetry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intrinsics.checkNotNullParameter(biz, "biz");
        if (ThreadUtils.m6113f()) {
            throw new RuntimeException("uploadSingleFileSync can not be called in main thread");
        }
        return new SingleFileUriUploadTask(fileUri, context, biz, maxRetry).m56634f().getFileId();
    }
}
