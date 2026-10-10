package p516ow;

import org.jetbrains.annotations.NotNull;
import p479nw.Frame;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ow.b */
/* JADX INFO: compiled from: ChartConfiguration.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"toOuterFrame", "Lcom/kubi/resources/widget/chart/data/Frame;", "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43334b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Frame m95402a(@NotNull C43333a c43333a) {
        Intrinsics.checkNotNullParameter(c43333a, "<this>");
        return new Frame(c43333a.getF95652c().getLeft(), c43333a.getF95652c().getTop(), c43333a.getF95650a() - c43333a.getF95652c().getRight(), c43333a.getF95651b() - c43333a.getF95652c().getBottom());
    }
}
