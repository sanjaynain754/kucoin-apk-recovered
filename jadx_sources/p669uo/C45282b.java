package p669uo;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: uo.b */
/* JADX INFO: compiled from: LoggerUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, m90084d2 = {"Luo/b;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "", "value", "b", "(I)Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45282b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45282b f101815a = new C45282b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SuppressLint({"ConstantLocale"})
    @NotNull
    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS", Locale.getDefault());

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m100085b(int value) {
        if (value == 2) {
            return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
        }
        if (value == 3) {
            return "D";
        }
        if (value == 4) {
            return "I";
        }
        if (value == 5) {
            return ExifInterface.LONGITUDE_WEST;
        }
        if (value != 6) {
            return value != 10 ? "U" : "M";
        }
        return ExifInterface.LONGITUDE_EAST;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m100084a() {
        String str = format.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format.format(Date())");
        return str;
    }
}
