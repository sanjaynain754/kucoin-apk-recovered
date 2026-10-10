package p830zf;

import com.kubi.home.rank.impl.RankTab;
import com.kubi.home.rank.impl.RankWidget;
import com.kubi.sdk.BaseFragment;
import fj.C37522h0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45660a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: zf.s */
/* JADX INFO: compiled from: IHomeRandCardFlavor.kt */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC45660a
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flavor/IHomeRandCardFlavor;", "", "flavorRankFragmentList", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/BaseFragment;", "Lkotlin/collections/ArrayList;", "flavorRankTabList", "", "Lcom/kubi/home/rank/impl/RankTab;", "flavorHandleClick", "", "kucoinHomeCardRankBinding", "Lcom/kubi/home/databinding/KucoinHomeCardRankBinding;", "flavorHandleNewCoinEvent", "flavorInitUI", "rankWidget", "Lcom/kubi/home/rank/impl/RankWidget;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46822s {
    /* JADX INFO: renamed from: a */
    void m103149a(@Nullable C37522h0 c37522h0);

    /* JADX INFO: renamed from: b */
    void m103150b();

    @NotNull
    /* JADX INFO: renamed from: c */
    ArrayList<BaseFragment> m103151c();

    @NotNull
    /* JADX INFO: renamed from: d */
    List<RankTab> m103152d();

    /* JADX INFO: renamed from: e */
    void m103153e(@NotNull RankWidget rankWidget);
}
