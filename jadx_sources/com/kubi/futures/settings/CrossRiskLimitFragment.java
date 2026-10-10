package com.kubi.futures.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bm.C4634g;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p729wl.C45875l0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: CrossRiskLimitFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/futures/settings/CrossRiskLimitFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CrossRiskLimitFragment extends BaseFragment {
    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_cross_risk_limit, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R$id.learnMore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.futures.settings.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossRiskLimitFragment.m25748l3(this.f23381b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: k3 */
    private final String m25747k3() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, C4634g.m4564a());
    }

    /* JADX INFO: renamed from: l3 */
    public static final Unit m25748l3(CrossRiskLimitFragment crossRiskLimitFragment) {
        C43852m.m96591c(C17060n0.m36556f(), "RiskLimit", "6", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(C45875l0.f103336a.m101343k0(), Arrays.copyOf(new Object[]{crossRiskLimitFragment.m25747k3()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        InterfaceC37766r.a.m85190a(c37304a, str, null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }
}
