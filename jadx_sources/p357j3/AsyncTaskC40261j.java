package p357j3;

import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import org.jetbrains.annotations.NotNull;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j3.j */
/* JADX INFO: compiled from: FileDownloadTask.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lj3/j;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "uriStr", "Ljava/io/File;", "destFile", "Lj3/j$a;", "onSuccess", "<init>", "(Ljava/lang/String;Ljava/io/File;Lj3/j$a;)V", "", "args", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "([Ljava/lang/String;)Ljava/lang/Boolean;", "isSuccess", "", "b", "(Z)V", "Ljava/lang/String;", "Ljava/io/File;", "c", "Lj3/j$a;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AsyncTaskC40261j extends AsyncTask<String, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String uriStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File destFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final a onSuccess;

    /* JADX INFO: renamed from: j3.j$a */
    /* JADX INFO: compiled from: FileDownloadTask.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lj3/j$a;", "", "Ljava/io/File;", "file", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/io/File;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo88631a(@NotNull File file);
    }

    public AsyncTaskC40261j(@NotNull String uriStr, @NotNull File destFile, @NotNull a onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.uriStr = uriStr;
        this.destFile = destFile;
        this.onSuccess = onSuccess;
    }

    @VisibleForTesting(otherwise = 4)
    @NotNull
    /* JADX INFO: renamed from: a */
    public Boolean m88629a(@NotNull String... args) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    URL url = new URL(this.uriStr);
                    int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.destFile));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            C42757a.m93687b(th3, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m88630b(boolean isSuccess) {
        if (!C42757a.m93689d(this)) {
            try {
                if (!C42757a.m93689d(this) && isSuccess) {
                    try {
                        this.onSuccess.mo88631a(this.destFile);
                    } catch (Throwable th2) {
                        C42757a.m93687b(th2, this);
                    }
                }
            } catch (Throwable th3) {
                C42757a.m93687b(th3, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                return m88629a(strArr);
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            C42757a.m93687b(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (!C42757a.m93689d(this)) {
            try {
                if (!C42757a.m93689d(this)) {
                    try {
                        m88630b(bool.booleanValue());
                    } catch (Throwable th2) {
                        C42757a.m93687b(th2, this);
                    }
                }
            } catch (Throwable th3) {
                C42757a.m93687b(th3, this);
            }
        }
    }
}
