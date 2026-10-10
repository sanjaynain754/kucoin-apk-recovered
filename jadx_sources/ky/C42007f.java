package ky;

import com.kubi.market.monitor.lib.startup.MarketMonitorMainActivityLifecycle;
import com.kubi.quotefacade.lifecycle.QuoteMainActLifecycle;
import com.kubi.search.lifecycle.SearchMainActLifecycle;
import com.kubi.share.lib.lifecycle.ShareMainActLifecycle;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p196da.C36653a;
import p269fs.C37590a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ky.f */
/* JADX INFO: compiled from: RegisterLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/delegate/RegisterLifecycle;", "", "<init>", "()V", "injectActivityLifecycle", "", "list", "", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "injectFragmentLifecycle", "Lcom/kubi/sdk/delegate/IFragmentLifecycle;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42007f {
    /* JADX INFO: renamed from: a */
    public final void m92094a(@NotNull List<? extends InterfaceC42005d> list) {
        list.add(new C36653a());
        list.add(new MarketMonitorMainActivityLifecycle());
        list.add(new SearchMainActLifecycle());
        list.add(new ShareMainActLifecycle());
        list.add(new C37590a());
        list.add(new QuoteMainActLifecycle());
        Intrinsics.checkNotNullParameter(list, "list");
    }

    /* JADX INFO: renamed from: b */
    public final void m92095b(@NotNull List<? extends InterfaceC42006e> list) {
        Intrinsics.checkNotNullParameter(list, "list");
    }
}
