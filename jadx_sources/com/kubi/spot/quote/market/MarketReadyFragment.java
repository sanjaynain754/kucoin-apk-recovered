package com.kubi.spot.quote.market;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import f00.C37304a;
import g00.InterfaceC37762n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketReadyFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/spot/quote/market/MarketReadyFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "getLayout", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketReadyFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f50881V = 0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f50882U = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketReadyFragment.m62357m3(this.f50903b);
        }
    });

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return 0;
    }

    /* JADX INFO: renamed from: l3 */
    private final String m62356l3() {
        return (String) this.f50882U.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        String strM62356l3 = m62356l3();
        if (strM62356l3 != null && strM62356l3.length() != 0) {
            InterfaceC37762n.a.m85177a(C37304a.f82764a, m62356l3(), null, null, null, 14, null);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        return new FrameLayout(inflater.getContext());
    }

    /* JADX INFO: renamed from: m3 */
    public static final String m62357m3(MarketReadyFragment marketReadyFragment) {
        Bundle arguments = marketReadyFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "symbol");
        }
        return null;
    }
}
