package wf;

import com.kubi.fallback.internal.monitor.FallbackException;
import com.kubi.fallback.internal.monitor.FallbackMessage;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wf.a */
/* JADX INFO: compiled from: FallbackIssue.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "categoryMessage", "msg", "LFallback_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45824a {
    /* JADX INFO: renamed from: a */
    public static final void m101236a(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new FallbackException(e11, source, false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m101237b(@NotNull String msg, @NotNull String source) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new FallbackMessage(msg, source, false, 4, null), null, 2, null);
    }
}
