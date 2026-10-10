package p333i6;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i6.k */
/* JADX INFO: compiled from: NativeAppCallAttachmentStore.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Li6/k;", "", "<init>", "()V", "Ljava/util/UUID;", TUIConstants.TUICalling.CALL_ID, "", "attachmentName", "Ljava/io/File;", "c", "(Ljava/util/UUID;Ljava/lang/String;)Ljava/io/File;", "", "create", "b", "(Ljava/util/UUID;Z)Ljava/io/File;", "createDirs", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/UUID;Ljava/lang/String;Z)Ljava/io/File;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/io/File;", "attachmentsDirectory", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38452k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38452k f86291a = new C38452k();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C38452k.class.getName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static File attachmentsDirectory;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final File m86717a(@NotNull UUID callId, @Nullable String attachmentName, boolean createDirs) throws IOException {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File fileM86718b = m86718b(callId, createDirs);
        if (fileM86718b == null) {
            return null;
        }
        try {
            return new File(fileM86718b, URLEncoder.encode(attachmentName, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final File m86718b(@NotNull UUID callId, boolean create) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, callId.toString());
        if (create && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final File m86719c(@Nullable UUID callId, @Nullable String attachmentName) throws FileNotFoundException {
        if (!C5760c.m10057Z(attachmentName) && callId != null) {
            try {
                return m86717a(callId, attachmentName, false);
            } catch (IOException unused) {
                throw new FileNotFoundException();
            }
        }
        throw new FileNotFoundException();
    }
}
