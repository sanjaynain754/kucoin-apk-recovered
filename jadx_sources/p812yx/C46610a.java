package p812yx;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.router.exception.RouterException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yx.a */
/* JADX INFO: compiled from: RouterIssue.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"", "e", "", "source", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;Ljava/lang/String;)V", "RouterSDK_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C46610a {
    /* JADX INFO: renamed from: a */
    public static final void m102762a(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new RouterException(e11, source, false, null, 8, null), null, 2, null);
    }
}
