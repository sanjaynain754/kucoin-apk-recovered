package com.kubi.fallback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p759xf.InterfaceC46157a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import tf.C44939a;
import w00.C45681e;

/* JADX INFO: compiled from: GlobalFallbackFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/fallback/GlobalFallbackFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "isPageShowing", "", "binding", "Lcom/kubi/fallback/databinding/FallbackFragmentGlobalBinding;", "getBinding", "()Lcom/kubi/fallback/databinding/FallbackFragmentGlobalBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGlobalFallbackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalFallbackFragment.kt\ncom/kubi/fallback/GlobalFallbackFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,50:1\n147#2,16:51\n*S KotlinDebug\n*F\n+ 1 GlobalFallbackFragment.kt\ncom/kubi/fallback/GlobalFallbackFragment\n*L\n22#1:51,16\n*E\n"})
public final class GlobalFallbackFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f21856W = {Reflection.property1(new PropertyReference1Impl(GlobalFallbackFragment.class, "binding", "getBinding()Lcom/kubi/fallback/databinding/FallbackFragmentGlobalBinding;", 0))};

    /* JADX INFO: renamed from: U */
    public boolean f21857U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f21858V = C45681e.m100799e(this, new Function1<GlobalFallbackFragment, C44939a>() { // from class: com.kubi.fallback.GlobalFallbackFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44939a invoke(@NotNull GlobalFallbackFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44939a.m99385a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44939a, Unit>() { // from class: com.kubi.fallback.GlobalFallbackFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44939a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44939a c44939a) {
            invoke(c44939a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: m3 */
    public static final Unit m23745m3(final GlobalFallbackFragment globalFallbackFragment) {
        InterfaceC46157a interfaceC46157a = (InterfaceC46157a) Router.f46192a.m56192n(InterfaceC46157a.class);
        FragmentManager childFragmentManager = globalFallbackFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        interfaceC46157a.mo94006a(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(globalFallbackFragment), new Function0() { // from class: com.kubi.fallback.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(GlobalFallbackFragment.m23746n3(this.f21940b));
            }
        }, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n3 */
    public static final boolean m23746n3(GlobalFallbackFragment globalFallbackFragment) {
        return globalFallbackFragment.f21857U;
    }

    /* JADX INFO: renamed from: l3 */
    public final C44939a m23747l3() {
        return (C44939a) this.f21858V.getValue(this, f21856W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fallback_fragment_global, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44939a c44939aM23747l3 = m23747l3();
        if (c44939aM23747l3 == null || (kcPrimaryButton = c44939aM23747l3.f101335b) == null) {
            return;
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.fallback.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GlobalFallbackFragment.m23745m3(this.f21939b);
            }
        }, 1, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        this.f21857U = false;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        this.f21857U = true;
    }
}
