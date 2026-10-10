package bj;

import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bj.b */
/* JADX INFO: compiled from: TopSpacesItemDecoration.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"itemStartMargin", "", "Landroidx/recyclerview/widget/RecyclerView;", "space", "", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4625b {
    /* JADX INFO: renamed from: a */
    public static final void m4550a(@NotNull RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.addItemDecoration(new C4624a(i11));
    }
}
