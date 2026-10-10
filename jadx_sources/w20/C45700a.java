package w20;

import com.kubi.spot.exeption.SpotException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w20.a */
/* JADX INFO: compiled from: SpotIssue.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "ignore", "", "categoryMessage", "msg", "noIgnoreReport", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45700a {
    /* JADX INFO: renamed from: b */
    public static final void m100876b(@NotNull Throwable e11, @NotNull String source, boolean z11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!z11) {
            m100877c(e11, source);
            return;
        }
        C43846g.m96568c(new SpotException(e11, source, true, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m100877c(Throwable th2, String str) {
        C43846g.m96568c(new SpotException(th2, str, false, null, 8, null), null, 2, null);
    }
}
