package com.kubi.mine.lib.p101ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.KeyEventDispatcher;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5304x;
import com.kubi.mine.R$layout;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gq.C37993n;
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

/* JADX INFO: compiled from: PermissionSettingFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/PermissionSettingFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentPermissionSettingsBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinFragmentPermissionSettingsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPermissionSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionSettingFragment.kt\ncom/kubi/mine/lib/ui/PermissionSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,47:1\n147#2,16:48\n*S KotlinDebug\n*F\n+ 1 PermissionSettingFragment.kt\ncom/kubi/mine/lib/ui/PermissionSettingFragment\n*L\n22#1:48,16\n*E\n"})
public final class PermissionSettingFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f35228V = {Reflection.property1(new PropertyReference1Impl(PermissionSettingFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinFragmentPermissionSettingsBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35229U = C45681e.m100799e(this, new Function1<PermissionSettingFragment, C37993n>() { // from class: com.kubi.mine.lib.ui.PermissionSettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37993n invoke(@NotNull PermissionSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37993n.m85861a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37993n, Unit>() { // from class: com.kubi.mine.lib.ui.PermissionSettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37993n it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37993n c37993n) {
            invoke(c37993n);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final Unit m42163l3(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C5304x.m6514b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k3 */
    public final C37993n m42164k3() {
        return (C37993n) this.f35229U.getValue(this, f35228V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_permission_settings, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37993n c37993nM42164k3 = m42164k3();
        if (c37993nM42164k3 == null || (kcPrimaryButton = c37993nM42164k3.f85555b) == null) {
            return;
        }
        ViewExtKt.m66575f(kcPrimaryButton, new Function1() { // from class: com.kubi.mine.lib.ui.i3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionSettingFragment.m42163l3((View) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        InterfaceC23686g interfaceC23686g;
        NavigationBar navigationBar;
        super.onCreate(savedInstanceState);
        getTitleBar().m58934f();
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof InterfaceC23686g) {
            interfaceC23686g = (InterfaceC23686g) activity;
        } else {
            interfaceC23686g = null;
        }
        if (interfaceC23686g != null && (navigationBar = interfaceC23686g.getNavigationBar()) != null) {
            navigationBar.m54692c();
        }
    }
}
