package com.kubi.helpcenter.p085ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.helpcenter.CustomerServiceHelper;
import com.kubi.helpcenter.R$layout;
import com.kubi.helpcenter.UserLabelManager;
import com.kubi.helpcenter.api.CustomerServiceType;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p762xi.C46251b;
import p798yi.InterfaceC46506a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: HelpCenterFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/helpcenter/ui/HelpCenterFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/helpcenter/databinding/KucoinFragmentHelpCenterBinding;", "getBinding$HelpCenterLib_googleRelease", "()Lcom/kubi/helpcenter/databinding/KucoinFragmentHelpCenterBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHelpCenterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterFragment.kt\ncom/kubi/helpcenter/ui/HelpCenterFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,75:1\n147#2,16:76\n25#3,3:92\n*S KotlinDebug\n*F\n+ 1 HelpCenterFragment.kt\ncom/kubi/helpcenter/ui/HelpCenterFragment\n*L\n38#1:76,16\n62#1:92,3\n*E\n"})
public final class HelpCenterFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f25342U;

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f25341W = {Reflection.property1(new PropertyReference1Impl(HelpCenterFragment.class, "binding", "getBinding$HelpCenterLib_googleRelease()Lcom/kubi/helpcenter/databinding/KucoinFragmentHelpCenterBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f25340V = new Companion(null);

    /* JADX INFO: compiled from: HelpCenterFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/helpcenter/ui/HelpCenterFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m28935m3(HelpCenterFragment helpCenterFragment) {
        C43852m.m96591c("B1support", "onlineSupport", null, null, 12, null);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46506a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            FragmentActivity fragmentActivityRequireActivity = helpCenterFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ((InterfaceC46506a) objM56186h).m102578a(fragmentActivityRequireActivity);
        } else {
            CustomerServiceHelper.Companion companion = CustomerServiceHelper.f25162a;
            FragmentActivity fragmentActivityRequireActivity2 = helpCenterFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
            CustomerServiceHelper.Companion.toChatDirectly$default(companion, fragmentActivityRequireActivity2, null, CustomerServiceType.HELP_CENTER, null, false, 26, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m28936n3() {
        C43852m.m96591c("B1support", "submitRequest", null, null, 12, null);
        IHelpCenterService.m28903c(IHelpCenterService.f25326a.get(), null, 1, null);
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: l3 */
    public final C46251b m28937l3() {
        return (C46251b) this.f25342U.getValue(this, f25341W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_help_center, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public HelpCenterFragment() {
        setPageId("B1support");
        this.f25342U = C45681e.m100799e(this, new Function1<HelpCenterFragment, C46251b>() { // from class: com.kubi.helpcenter.ui.HelpCenterFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C46251b invoke(@NotNull HelpCenterFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C46251b.m102007a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C46251b, Unit>() { // from class: com.kubi.helpcenter.ui.HelpCenterFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C46251b it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C46251b c46251b) {
                invoke(c46251b);
                return Unit.INSTANCE;
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

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        UserLabelManager.m28893e(UserLabelManager.f25240a, null, 1, null);
        C46251b c46251bM28937l3 = m28937l3();
        if (c46251bM28937l3 != null && (frameLayout2 = c46251bM28937l3.f103817b) != null) {
            C27046k.m66711z(frameLayout2, 0L, new Function0() { // from class: com.kubi.helpcenter.ui.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HelpCenterFragment.m28935m3(this.f25353b);
                }
            }, 1, null);
        }
        C46251b c46251bM28937l4 = m28937l3();
        if (c46251bM28937l4 != null && (frameLayout = c46251bM28937l4.f103818c) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.helpcenter.ui.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HelpCenterFragment.m28936n3();
                }
            }, 1, null);
        }
    }
}
