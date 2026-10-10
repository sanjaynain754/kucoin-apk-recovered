package com.kubi.mine.lib.p101ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mine.R$layout;
import com.kubi.redpackage.api.IRedPackageService;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.site.C24128a;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.share.api.GalleryShareParam;
import com.kubi.share.api.IShareService;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gq.C37995p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
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

/* JADX INFO: compiled from: SocialFriendsFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/SocialFriendsFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentSocialFriendsBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinFragmentSocialFriendsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocialFriendsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialFriendsFragment.kt\ncom/kubi/mine/lib/ui/SocialFriendsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,89:1\n147#2,16:90\n*S KotlinDebug\n*F\n+ 1 SocialFriendsFragment.kt\ncom/kubi/mine/lib/ui/SocialFriendsFragment\n*L\n36#1:90,16\n*E\n"})
public final class SocialFriendsFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35246U = C45681e.m100799e(this, new Function1<SocialFriendsFragment, C37995p>() { // from class: com.kubi.mine.lib.ui.SocialFriendsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37995p invoke(@NotNull SocialFriendsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37995p.m85865a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37995p, Unit>() { // from class: com.kubi.mine.lib.ui.SocialFriendsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37995p it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37995p c37995p) {
            invoke(c37995p);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f35245W = {Reflection.property1(new PropertyReference1Impl(SocialFriendsFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinFragmentSocialFriendsBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f35244V = new Companion(null);

    /* JADX INFO: compiled from: SocialFriendsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/SocialFriendsFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: m3 */
    private final void m42269m3() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C37995p c37995pM42272l3;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5;
        if (C24129b.m58030b(SiteVisibleConfigKey.FriendShare)) {
            C37995p c37995pM42272l4 = m42272l3();
            if (c37995pM42272l4 != null && (frameLayout5 = c37995pM42272l4.f85586c) != null) {
                C27046k.m66685H(frameLayout5);
            }
        } else {
            C37995p c37995pM42272l5 = m42272l3();
            if (c37995pM42272l5 != null && (frameLayout = c37995pM42272l5.f85586c) != null) {
                C27046k.m66700o(frameLayout);
            }
        }
        C37995p c37995pM42272l6 = m42272l3();
        if (c37995pM42272l6 != null && (frameLayout4 = c37995pM42272l6.f85586c) != null) {
            C27046k.m66711z(frameLayout4, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.x4
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SocialFriendsFragment.m42270n3();
                }
            }, 1, null);
        }
        if (!C24128a.m58028a() && (c37995pM42272l3 = m42272l3()) != null && (frameLayout3 = c37995pM42272l3.f85585b) != null) {
            C27046k.m66700o(frameLayout3);
        }
        C37995p c37995pM42272l7 = m42272l3();
        if (c37995pM42272l7 == null || (frameLayout2 = c37995pM42272l7.f85585b) == null) {
            return;
        }
        C27046k.m66711z(frameLayout2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.y4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SocialFriendsFragment.m42271o3();
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final Unit m42270n3() {
        C43852m.m96591c("B1friends", FirebaseAnalytics.Event.SHARE, null, null, 12, null);
        IShareService iShareService = IShareService.f49268a.get();
        GalleryShareParam galleryShareParam = new GalleryShareParam("app_g_Share", null, null, 0, false, null, null, null, null, 510, null);
        galleryShareParam.setGalleryType("SHARE_APP");
        IShareService.m59640c(iShareService, galleryShareParam, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m42271o3() {
        C43852m.m96591c("B1friends", "redEnvelop", null, null, 12, null);
        IRedPackageService.f43051a.get().mo53745c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l3 */
    public final C37995p m42272l3() {
        return (C37995p) this.f35246U.getValue(this, f35245W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_social_friends, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m42269m3();
    }

    public SocialFriendsFragment() {
        setPageId("B1friends");
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
