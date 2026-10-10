package com.kubi.futures.mock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.futures.mock.FuturesMockFragment;
import com.kubi.kumex.R$layout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36862w2;
import fi.C37500b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FuturesMockFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/mock/FuturesMockFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentMockBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentMockBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleMarkPrice", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesMockFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesMockFragment.kt\ncom/kubi/futures/mock/FuturesMockFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,43:1\n143#2,20:44\n*S KotlinDebug\n*F\n+ 1 FuturesMockFragment.kt\ncom/kubi/futures/mock/FuturesMockFragment\n*L\n20#1:44,20\n*E\n"})
public final class FuturesMockFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f23123W = {Reflection.property1(new PropertyReference1Impl(FuturesMockFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentMockBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f23124U = C45681e.m100799e(this, new Function1<FuturesMockFragment, C36862w2>() { // from class: com.kubi.futures.mock.FuturesMockFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36862w2 invoke(@NotNull FuturesMockFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36862w2.m82589a(fragment.requireView());
        }
    }, new Function1<C36862w2, Unit>() { // from class: com.kubi.futures.mock.FuturesMockFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36862w2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36862w2 c36862w2) {
            invoke(c36862w2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public boolean f23125V;

    /* JADX INFO: renamed from: m3 */
    public static final void m25659m3(CompoundButton compoundButton, boolean z11) {
        C37500b.f83191a.m84429b(z11);
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF23125V() {
        return this.f23125V;
    }

    /* JADX INFO: renamed from: k3 */
    public final C36862w2 m25660k3() {
        return (C36862w2) this.f23124U.getValue(this, f23123W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_mock, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m25661l3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f23125V = z11;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m25661l3() {
        SwitchCompat switchCompat;
        C36862w2 c36862w2M25660k3 = m25660k3();
        if (c36862w2M25660k3 != null && (switchCompat = c36862w2M25660k3.f81281b) != null) {
            switchCompat.setChecked(C37500b.f83191a.m84428a());
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fi.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    FuturesMockFragment.m25659m3(compoundButton, z11);
                }
            });
        }
    }
}
