package p340if;

import com.kubi.data.exception.CoinDataException;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: if.a */
/* JADX INFO: compiled from: CoinDataIssue.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "categoryMessage", "msg", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38527a {
    /* JADX INFO: renamed from: a */
    public static final void m87142a(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        if (C42899b.m94075e(e11)) {
            return;
        }
        C43846g.m96568c(new CoinDataException(e11, source, false, null, 8, null), null, 2, null);
    }
}
