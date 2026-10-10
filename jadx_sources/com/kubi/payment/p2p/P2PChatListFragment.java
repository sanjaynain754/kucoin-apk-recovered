package com.kubi.payment.p2p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.flutter.ui.FlutterDelegateFragment;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: P2PChatListFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PChatListFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "getTextureMode", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PChatListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PChatListFragment.kt\ncom/kubi/payment/p2p/P2PChatListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class P2PChatListFragment extends FlutterDelegateFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f39679Y = new Companion(null);

    /* JADX INFO: compiled from: P2PChatListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PChatListFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/p2p/P2PChatListFragment;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final P2PChatListFragment newInstance() {
            P2PChatListFragment p2PChatListFragment = new P2PChatListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", "payment/p2p/chat/list");
            p2PChatListFragment.setArguments(bundle);
            return p2PChatListFragment;
        }
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment
    /* JADX INFO: renamed from: l3 */
    public boolean mo37561l3() {
        return true;
    }

    @Override // com.kubi.sdk.flutter.ui.FlutterDelegateFragment, com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(inflater.getContext());
        linearLayout.setOrientation(1);
        View viewInflate = inflater.inflate(R$layout.p2p_common_title_bar, container, false);
        ((BaseTextView) viewInflate.findViewById(R$id.title_view)).setText(getStringRes(R$string.chat, new Object[0]));
        View viewFindViewById = viewInflate.findViewById(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.payment.p2p.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PChatListFragment.m48403o3(this.f39711b);
            }
        }, 1, null);
        linearLayout.addView(viewInflate);
        linearLayout.addView(super.onCreateView(inflater, savedInstanceState, container));
        return linearLayout;
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m48403o3(P2PChatListFragment p2PChatListFragment) {
        FragmentActivity activity = p2PChatListFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }
}
