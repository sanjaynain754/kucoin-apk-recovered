package dj;

import android.net.Uri;
import com.kubi.home.shortcut.HomeMenuDisableHelper;
import com.kubi.router.core.Router;
import f00.C37304a;
import g00.InterfaceC37749a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p569qq.C43841b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: dj.h */
/* JADX INFO: compiled from: StringEx.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, m90084d2 = {"gotoUrl", "", "", "pageId", "blockId", "locationId", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36723h {
    /* JADX INFO: renamed from: a */
    public static final void m82297a(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (HomeMenuDisableHelper.f26238a.m30301a(str)) {
            InterfaceC37749a.a.m85111f(C37304a.f82764a, null, null, null, 7, null);
            return;
        }
        try {
            Uri.parse(str).getPath();
        } catch (Exception e11) {
            C44128b.m97264h(e11);
        }
        if (Intrinsics.areEqual(str, "otc?type=2")) {
            C43841b.m96557d("event_click_home_grid_fast_trade", "click_start_btn", null, 4, null);
        }
        C4400a c4400aM56184f = Router.f46192a.m56184f(str);
        if (str2 != null && str3 != null && str4 != null) {
            c4400aM56184f.m4038a("spm", C43852m.m96601m(str2, str3, str4));
        }
        c4400aM56184f.m4048k();
    }
}
