package com.trtc.uikit.livekit.p180kc.web3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$layout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import vd0.C45517d;
import w00.C45681e;

/* JADX INFO: compiled from: KCWeb3CardFragment.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/web3/KCWeb3CardFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/trtc/uikit/livekit/databinding/LiveKcFragmentWeb3CardBinding;", "getBinding", "()Lcom/trtc/uikit/livekit/databinding/LiveKcFragmentWeb3CardBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCWeb3CardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCWeb3CardFragment.kt\ncom/trtc/uikit/livekit/kc/web3/KCWeb3CardFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n147#2,16:37\n1#3:53\n*S KotlinDebug\n*F\n+ 1 KCWeb3CardFragment.kt\ncom/trtc/uikit/livekit/kc/web3/KCWeb3CardFragment\n*L\n16#1:37,16\n*E\n"})
public final class KCWeb3CardFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f79200V = {Reflection.property1(new PropertyReference1Impl(KCWeb3CardFragment.class, "binding", "getBinding()Lcom/trtc/uikit/livekit/databinding/LiveKcFragmentWeb3CardBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f79201U = C45681e.m100799e(this, new Function1<KCWeb3CardFragment, C45517d>() { // from class: com.trtc.uikit.livekit.kc.web3.KCWeb3CardFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45517d invoke(@NotNull KCWeb3CardFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45517d.m100505a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45517d, Unit>() { // from class: com.trtc.uikit.livekit.kc.web3.KCWeb3CardFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45517d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45517d c45517d) {
            invoke(c45517d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final Unit m81608l3() {
        Router.f46192a.m56184f("wallet/splash").m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k3 */
    public final C45517d m81609k3() {
        return (C45517d) this.f79201U.getValue(this, f79200V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.live_kc_fragment_web3_card, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C45517d c45517dM81609k3 = m81609k3();
        if (c45517dM81609k3 != null && (imageView = c45517dM81609k3.f102574d) != null) {
            KCWeb3PreviewCardUi.f79211a.m81621a(imageView);
        }
        C45517d c45517dM81609k4 = m81609k3();
        if (c45517dM81609k4 == null || (textView = c45517dM81609k4.f102573c) == null) {
            return;
        }
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.trtc.uikit.livekit.kc.web3.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCWeb3CardFragment.m81608l3();
            }
        }, 1, null);
    }
}
