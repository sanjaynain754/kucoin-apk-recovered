package p473nm;

import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nm.b */
/* JADX INFO: compiled from: MarketContractDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"findMarketSymbolProvider", "Lcom/kubi/kumex/market/v2/drawer/MarketSymbolProvider;", "Landroidx/fragment/app/Fragment;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42853b {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final InterfaceC42854c m93997a(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (fragment.getParentFragment() instanceof InterfaceC42854c) {
            ActivityResultCaller parentFragment = fragment.getParentFragment();
            if (parentFragment instanceof InterfaceC42854c) {
                return (InterfaceC42854c) parentFragment;
            }
            return null;
        }
        Fragment parentFragment2 = fragment.getParentFragment();
        if (parentFragment2 != null) {
            return m93997a(parentFragment2);
        }
        return null;
    }
}
