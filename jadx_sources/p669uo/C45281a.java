package p669uo;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: uo.a */
/* JADX INFO: compiled from: LoganUtils.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Luo/a;", "", "<init>", "()V", "", "days", "", "", "b", "(I)[Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "", "time", "d", "(J)Ljava/lang/String;", "ymd", "c", "(Ljava/lang/String;)J", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45281a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45281a f101813a = new C45281a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.UK);

    /* JADX INFO: renamed from: c */
    public final long m100082c(String ymd) {
        try {
            return format.parse(ymd).getTime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m100083d(long time) {
        String str = format.format(new Date(time));
        Intrinsics.checkNotNullExpressionValue(str, "format.format(Date(time))");
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m100080a() {
        return String.valueOf(m100082c(m100083d(System.currentTimeMillis())));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String[] m100081b(int days) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArr = new String[days];
        for (int i11 = 0; i11 < days; i11++) {
            strArr[i11] = m100083d(jCurrentTimeMillis - (((long) i11) * 86400000));
        }
        return strArr;
    }
}
