package v70;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.utils.exception.DowngradeCode;
import com.kubi.utils.exception.DowngradeException;
import com.kubi.utils.exception.GsonCode;
import com.kubi.utils.exception.JsonConvertException;
import com.kubi.utils.exception.UtilsException;
import com.kubi.utils.exception.UtilsMessage;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: v70.a */
/* JADX INFO: compiled from: UtilsIssue.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000f\u001a\u00020\u00042\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"", "e", "", "source", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;Ljava/lang/String;)V", "msg", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ignore", "Lcom/kubi/utils/exception/DowngradeCode;", "code", "c", "(Ljava/lang/Exception;Lcom/kubi/utils/exception/DowngradeCode;)V", "Lcom/kubi/utils/exception/GsonCode;", "d", "(Ljava/lang/Throwable;Lcom/kubi/utils/exception/GsonCode;)V", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45463a {
    @PublishedApi
    /* JADX INFO: renamed from: a */
    public static final void m100408a(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new UtilsException(e11, source, false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m100410c(@NotNull Exception ignore, @NotNull DowngradeCode code) {
        Intrinsics.checkNotNullParameter(ignore, "ignore");
        Intrinsics.checkNotNullParameter(code, "code");
        C43846g.m96568c(new DowngradeException(ignore, "downgrade", false, null, 8, null), null, 2, null);
        C43847h.m96575d(KunlunTechEventEnum.CATE_DOWNGRADE, code.ordinal());
    }

    @PublishedApi
    /* JADX INFO: renamed from: d */
    public static final void m100411d(@NotNull Throwable ignore, @NotNull GsonCode code) {
        Intrinsics.checkNotNullParameter(ignore, "ignore");
        Intrinsics.checkNotNullParameter(code, "code");
        C44128b.m97263g("GsonConvert", ignore);
        C43847h.m96575d(KunlunTechEventEnum.CATE_GSON, code.ordinal());
        C43846g.m96568c(new JsonConvertException(ignore, "GsonConvert", false, null, 8, null), null, 2, null);
    }

    @PublishedApi
    /* JADX INFO: renamed from: b */
    public static final void m100409b(@NotNull String msg, @NotNull String source) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new UtilsMessage(msg, source, false, 4, null), null, 2, null);
    }
}
