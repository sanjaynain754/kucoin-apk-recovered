package com.kubi.utils.extensions.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.extensions.core.d */
/* JADX INFO: compiled from: DateTimeExt.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"", "", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "kotlin.jvm.PlatformType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JLjava/lang/String;)Ljava/lang/String;", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27030d {
    /* JADX INFO: renamed from: a */
    public static final String m66607a(long j11, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return new SimpleDateFormat(format, Locale.getDefault()).format(new Date(j11));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m66608b(long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        return m66607a(j11, str);
    }
}
