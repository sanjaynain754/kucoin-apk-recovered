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
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseActivity;
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

/* JADX INFO: compiled from: P2PProfileFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PProfileFragment;", "Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "getTextureMode", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PProfileFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PProfileFragment.kt\ncom/kubi/payment/p2p/P2PProfileFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class P2PProfileFragment extends FlutterDelegateFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f39690Y = new Companion(null);

    /* JADX INFO: compiled from: P2PProfileFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PProfileFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/p2p/P2PProfileFragment;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final P2PProfileFragment newInstance() {
            P2PProfileFragment p2PProfileFragment = new P2PProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putString("flutterInitialRoute", "payment/p2p/profile/home");
            p2PProfileFragment.setArguments(bundle);
            return p2PProfileFragment;
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
        ((BaseTextView) viewInflate.findViewById(R$id.title_view)).setText("");
        View viewFindViewById = viewInflate.findViewById(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.payment.p2p.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PProfileFragment.m48455o3(this.f39696b);
            }
        }, 1, null);
        linearLayout.addView(viewInflate);
        linearLayout.addView(super.onCreateView(inflater, savedInstanceState, container));
        return linearLayout;
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m48455o3(P2PProfileFragment p2PProfileFragment) {
        FragmentActivity activity = p2PProfileFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BaseActivity baseActivity;
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            getF46737W().m56764l(baseActivity);
        }
    }
}
