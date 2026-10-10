package com.kubi.mine.lib.p101ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5276j;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcCoordinatorLayout;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.bar.CollapsingCenterToolbarLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.user.api.site.protocol.b;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import gq.C37988i;
import iq.InterfaceC40159a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k00.C40841e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: AboutUsFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u000bH\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, m90084d2 = {"Lcom/kubi/mine/lib/ui/AboutUsFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentAboutUsBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinFragmentAboutUsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mPageIsShowIng", "", "aboutUsTitleClickCount", "", "cloudMiningWhiteList", "", "", "getCloudMiningWhiteList", "()Ljava/util/List;", "cloudMiningWhiteList$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onAboutUsTitleClicked", "isCloudMiningDevice", "showCloudMiningEntry", "onDestroyView", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAboutUsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutUsFragment.kt\ncom/kubi/mine/lib/ui/AboutUsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,145:1\n147#2,16:146\n25#3,3:162\n1374#4:165\n1460#4,5:166\n1563#4:171\n1634#4,3:172\n774#4:175\n865#4,2:176\n35#5,4:178\n39#5:184\n44#6,2:182\n*S KotlinDebug\n*F\n+ 1 AboutUsFragment.kt\ncom/kubi/mine/lib/ui/AboutUsFragment\n*L\n35#1:146,16\n63#1:162,3\n114#1:165\n114#1:166,5\n115#1:171\n115#1:172,3\n116#1:175\n116#1:176,2\n40#1:178,4\n40#1:184\n40#1:182,2\n*E\n"})
public final class AboutUsFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public boolean f35164V;

    /* JADX INFO: renamed from: W */
    public int f35165W;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f35162Z = {Reflection.property1(new PropertyReference1Impl(AboutUsFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinFragmentAboutUsBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f35161Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35163U = C45681e.m100799e(this, new Function1<AboutUsFragment, C37988i>() { // from class: com.kubi.mine.lib.ui.AboutUsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37988i invoke(@NotNull AboutUsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37988i.m85851a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37988i, Unit>() { // from class: com.kubi.mine.lib.ui.AboutUsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37988i it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37988i c37988i) {
            invoke(c37988i);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f35166X = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.ui.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AboutUsFragment.m41846q3();
        }
    });

    /* JADX INFO: compiled from: AboutUsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/AboutUsFragment$Companion;", "", "<init>", "()V", "CLOUD_MINING_WHITE_LIST_KEY", "", "CLOUD_MINING_TITLE_CLICK_COUNT", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.AboutUsFragment$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C19010a extends TypeToken<List<? extends String>> {
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f35165W = 0;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: t3 */
    public final boolean m41855t3() {
        String strM6247f = C5276j.m6247f();
        if (strM6247f == null) {
            strM6247f = "";
        }
        String string = StringsKt.trim((CharSequence) strM6247f).toString();
        if (string.length() == 0) {
            return false;
        }
        List<String> listM41854s3 = m41854s3();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM41854s3.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, StringsKt.split$default((CharSequence) it.next(), new char[]{','}, false, 0, 6, (Object) null));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(StringsKt.trim((CharSequence) it2.next()).toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        return arrayList3.contains(string);
    }

    /* JADX INFO: renamed from: q3 */
    public static final List m41846q3() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C19010a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_rn_panel_white_list", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        List list = (List) objM20457a;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: y3 */
    public static final boolean m41850y3(AboutUsFragment aboutUsFragment) {
        return aboutUsFragment.f35164V;
    }

    /* JADX INFO: renamed from: B3 */
    public final void m41852B3() {
        IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        iReactNativeService.showKrnPanelEntry(fragmentActivityRequireActivity);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_about_us, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        KcCoordinatorLayout root;
        C40841e f43827b;
        CollapsingCenterToolbarLayout collapsingCenterToolbarLayout;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37988i c37988iM41853r3 = m41853r3();
        if (c37988iM41853r3 != null && (baseTextView = c37988iM41853r3.f85483f) != null) {
            baseTextView.setText(getString(R$string.version_stub, C45590s.f102687a.m100676a0()));
        }
        C37988i c37988iM41853r4 = m41853r3();
        if (c37988iM41853r4 != null && (root = c37988iM41853r4.getRoot()) != null && (f43827b = root.getF43827b()) != null && (collapsingCenterToolbarLayout = f43827b.f90749d) != null) {
            collapsingCenterToolbarLayout.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.mine.lib.ui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AboutUsFragment.m41847v3(this.f35247b, view2);
                }
            });
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40159a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40159a) objM56186h).m88510a(m41853r3());
        } else {
            C37988i c37988iM41853r5 = m41853r3();
            if (c37988iM41853r5 != null && (frameLayout = c37988iM41853r5.f85479b) != null) {
                C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AboutUsFragment.m41848w3(view, this);
                    }
                }, 1, null);
            }
        }
        C37988i c37988iM41853r6 = m41853r3();
        if (c37988iM41853r6 != null && (frameLayout4 = c37988iM41853r6.f85482e) != null) {
            C27046k.m66711z(frameLayout4, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AboutUsFragment.m41849x3(view, this);
                }
            }, 1, null);
        }
        C37988i c37988iM41853r7 = m41853r3();
        if (c37988iM41853r7 != null && (frameLayout3 = c37988iM41853r7.f85481d) != null) {
            C27046k.m66711z(frameLayout3, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AboutUsFragment.m41851z3(view);
                }
            }, 1, null);
        }
        C37988i c37988iM41853r8 = m41853r3();
        if (c37988iM41853r8 == null || (frameLayout2 = c37988iM41853r8.f85480c) == null) {
            return;
        }
        C27046k.m66711z(frameLayout2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AboutUsFragment.m41838A3(view);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: r3 */
    public final C37988i m41853r3() {
        return (C37988i) this.f35163U.getValue(this, f35162Z[0]);
    }

    /* JADX INFO: renamed from: s3 */
    public final List<String> m41854s3() {
        return (List) this.f35166X.getValue();
    }

    /* JADX INFO: renamed from: u3 */
    public final void m41856u3() {
        int i11 = this.f35165W + 1;
        this.f35165W = i11;
        if (i11 < 10 || !m41855t3()) {
            return;
        }
        m41852B3();
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m41838A3(View view) {
        if (!C27014a1.m66501a(view)) {
            C37304a c37304a = C37304a.f82764a;
            String strDecode = Uri.decode(b.a.a());
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m41847v3(AboutUsFragment aboutUsFragment, View view) {
        aboutUsFragment.m41856u3();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m41848w3(View view, AboutUsFragment aboutUsFragment) {
        if (!C27014a1.m66501a(view)) {
            IUserService.Companion companion = IUserService.a;
            if (companion.get().p0()) {
                BaseFragmentActivity.m56573m0(view.getContext(), aboutUsFragment.getString(R$string.contact_us), ContactUsFragment.class.getName());
            } else {
                Router.f46192a.m56184f(companion.get().s()).m4048k();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m41849x3(View view, final AboutUsFragment aboutUsFragment) {
        if (!C27014a1.m66501a(view)) {
            MineDepend.f35159a.m41824c(aboutUsFragment, new Function0() { // from class: com.kubi.mine.lib.ui.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(AboutUsFragment.m41850y3(this.f35280b));
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m41851z3(View view) {
        if (!C27014a1.m66501a(view)) {
            C37304a c37304a = C37304a.f82764a;
            String strDecode = Uri.decode(b.a.d());
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
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

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        this.f35164V = false;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        this.f35164V = true;
    }
}
