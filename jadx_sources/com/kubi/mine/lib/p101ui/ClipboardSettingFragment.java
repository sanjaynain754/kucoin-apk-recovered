package com.kubi.mine.lib.p101ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.KeyEventDispatcher;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.ClipboardDataHelper;
import com.kubi.mine.R$layout;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import gq.C37990k;
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

/* JADX INFO: compiled from: ClipboardSettingFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/ClipboardSettingFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentClipboardBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinFragmentClipboardBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nClipboardSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardSettingFragment.kt\ncom/kubi/mine/lib/ui/ClipboardSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,49:1\n147#2,16:50\n*S KotlinDebug\n*F\n+ 1 ClipboardSettingFragment.kt\ncom/kubi/mine/lib/ui/ClipboardSettingFragment\n*L\n20#1:50,16\n*E\n"})
public final class ClipboardSettingFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f35177V = {Reflection.property1(new PropertyReference1Impl(ClipboardSettingFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinFragmentClipboardBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35178U = C45681e.m100799e(this, new Function1<ClipboardSettingFragment, C37990k>() { // from class: com.kubi.mine.lib.ui.ClipboardSettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37990k invoke(@NotNull ClipboardSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37990k.m85855a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37990k, Unit>() { // from class: com.kubi.mine.lib.ui.ClipboardSettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37990k it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37990k c37990k) {
            invoke(c37990k);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: k3 */
    public final C37990k m41899k3() {
        return (C37990k) this.f35178U.getValue(this, f35177V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_clipboard, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcSwitchButton kcSwitchButton;
        KcSwitchButton kcSwitchButton2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37990k c37990kM41899k3 = m41899k3();
        if (c37990kM41899k3 != null && (kcSwitchButton2 = c37990kM41899k3.f85495b) != null) {
            kcSwitchButton2.setChecked(ClipboardDataHelper.m23650a());
        }
        C37990k c37990kM41899k4 = m41899k3();
        if (c37990kM41899k4 == null || (kcSwitchButton = c37990kM41899k4.f85495b) == null) {
            return;
        }
        kcSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.mine.lib.ui.w
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                ClipboardSettingFragment.m41898l3(compoundButton, z11);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static final void m41898l3(CompoundButton compoundButton, boolean z11) {
        ClipboardDataHelper.m23651b(z11);
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
