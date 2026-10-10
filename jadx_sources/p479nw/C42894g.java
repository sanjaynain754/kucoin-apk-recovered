package p479nw;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nw.g */
/* JADX INFO: compiled from: Paddings.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"mergeWith", "Lcom/kubi/resources/widget/chart/data/Paddings;", "paddings", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42894g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Paddings m94066a(@NotNull Paddings paddings, @NotNull Paddings paddings2) {
        Intrinsics.checkNotNullParameter(paddings, "<this>");
        Intrinsics.checkNotNullParameter(paddings2, "paddings");
        return new Paddings(Math.max(paddings.getLeft(), paddings2.getLeft()), Math.max(paddings.getTop(), paddings2.getTop()), Math.max(paddings.getRight(), paddings2.getRight()), Math.max(paddings.getBottom(), paddings2.getBottom()));
    }
}
