package p236em;

import com.kubi.kumex.exception.KuMexException;
import com.kubi.kumex.exception.KuMexMessage;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: em.b */
/* JADX INFO: compiled from: KuMexIssue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "ignore", "", "categoryMessage", "msg", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37214b {
    /* JADX INFO: renamed from: a */
    public static final void m83255a(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        if (C42899b.m94075e(e11)) {
            return;
        }
        C43846g.m96568c(new KuMexException(e11, source, false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m83256b(@NotNull Throwable e11, @NotNull String source, boolean z11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        if (C42899b.m94075e(e11)) {
            return;
        }
        C43846g.m96568c(new KuMexException(e11, source, z11, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final void m83257c(@NotNull String msg, @NotNull String source) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(source, "source");
        C43846g.m96568c(new KuMexMessage(msg, source, false, 4, null), null, 2, null);
    }
}
