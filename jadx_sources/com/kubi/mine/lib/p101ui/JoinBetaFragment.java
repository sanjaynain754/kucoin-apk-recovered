package com.kubi.mine.lib.p101ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.KeyEventDispatcher;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5264d;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.mine.R$color;
import com.kubi.mine.R$drawable;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$string;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gq.C37991l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46396e;

/* JADX INFO: compiled from: JoinBetaFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0003J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\""}, m90084d2 = {"Lcom/kubi/mine/lib/ui/JoinBetaFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinFragmentJoinBetaBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinFragmentJoinBetaBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "updateButton", "openBetaTester", "", "downloadGp", "updateKuCoin", "buildContent", "content", "", "onDestroyView", "onDestroy", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJoinBetaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinBetaFragment.kt\ncom/kubi/mine/lib/ui/JoinBetaFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n147#2,16:225\n774#3:241\n865#3,2:242\n1573#3:244\n1604#3,4:245\n1869#3,2:249\n*S KotlinDebug\n*F\n+ 1 JoinBetaFragment.kt\ncom/kubi/mine/lib/ui/JoinBetaFragment\n*L\n49#1:225,16\n168#1:241\n168#1:242,2\n170#1:244\n170#1:245,4\n198#1:249,2\n*E\n"})
public final class JoinBetaFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35188U = C45681e.m100799e(this, new Function1<JoinBetaFragment, C37991l>() { // from class: com.kubi.mine.lib.ui.JoinBetaFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37991l invoke(@NotNull JoinBetaFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37991l.m85857a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37991l, Unit>() { // from class: com.kubi.mine.lib.ui.JoinBetaFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37991l it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37991l c37991l) {
            invoke(c37991l);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f35187W = {Reflection.property1(new PropertyReference1Impl(JoinBetaFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinFragmentJoinBetaBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f35186V = new Companion(null);

    /* JADX INFO: compiled from: JoinBetaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/JoinBetaFragment$Companion;", "", "<init>", "()V", "getBetaInfo", "Lcom/kubi/mine/lib/ui/BetaEntity;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nJoinBetaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinBetaFragment.kt\ncom/kubi/mine/lib/ui/JoinBetaFragment$Companion\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,224:1\n160#2,4:225\n*S KotlinDebug\n*F\n+ 1 JoinBetaFragment.kt\ncom/kubi/mine/lib/ui/JoinBetaFragment$Companion\n*L\n205#1:225,4\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.kubi.mine.lib.ui.JoinBetaFragment$Companion$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        /* JADX INFO: loaded from: classes29.dex */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
        public static final class C19018a extends TypeToken<BetaEntity> {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BetaEntity getBetaInfo() {
            Object objM66914d;
            String strM20458b = RemoteConfig.m20458b("ios_test_flight");
            if (strM20458b == null) {
                strM20458b = "{}";
            }
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM20458b, new C19018a().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            BetaEntity betaEntity = (BetaEntity) objM66914d;
            return betaEntity == null ? new BetaEntity(null, null, null, 7, null) : betaEntity;
        }
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m41938p3(JoinBetaFragment joinBetaFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        joinBetaFragment.m41940l3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m41939q3(JoinBetaFragment joinBetaFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!joinBetaFragment.m41942n3()) {
            joinBetaFragment.m41944r3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m41940l3() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.kubi.kucoin"));
            intent.addFlags(268435456);
            BaseApplication.INSTANCE.get().startActivity(intent);
        } catch (Throwable unused) {
            C5258a.m6129l(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.kubi.kucoin")));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m3 */
    public final C37991l m41941m3() {
        return (C37991l) this.f35188U.getValue(this, f35187W[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m41943o3() {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        if (C5264d.m6169o("com.android.vending")) {
            C37991l c37991lM41941m3 = m41941m3();
            if (c37991lM41941m3 != null) {
                BaseTextView downloadGpStep = c37991lM41941m3.f85499d;
                Intrinsics.checkNotNullExpressionValue(downloadGpStep, "downloadGpStep");
                C27046k.m66703r(downloadGpStep);
                c37991lM41941m3.f85506k.setBackgroundResource(R$drawable.shape_oval_emphasis);
                c37991lM41941m3.f85505j.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
                c37991lM41941m3.f85497b.setEnabled(false);
                c37991lM41941m3.f85504i.setEnabled(true);
            }
        } else {
            C37991l c37991lM41941m4 = m41941m3();
            if (c37991lM41941m4 != null) {
                BaseTextView downloadGpStep2 = c37991lM41941m4.f85499d;
                Intrinsics.checkNotNullExpressionValue(downloadGpStep2, "downloadGpStep");
                C27046k.m66685H(downloadGpStep2);
                c37991lM41941m4.f85506k.setBackgroundResource(R$drawable.shape_oval_emphasis20_without_stroke);
                c37991lM41941m4.f85505j.setTextColor(C27017c.f54310a.m66512a(R$color.c_text60));
                c37991lM41941m4.f85497b.setEnabled(true);
                c37991lM41941m4.f85504i.setEnabled(false);
            }
        }
        C37991l c37991lM41941m5 = m41941m3();
        if (c37991lM41941m5 != null && (kcPrimaryButton2 = c37991lM41941m5.f85497b) != null) {
            ViewExtKt.m66575f(kcPrimaryButton2, new Function1() { // from class: com.kubi.mine.lib.ui.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return JoinBetaFragment.m41938p3(this.f35301b, (View) obj);
                }
            });
        }
        C37991l c37991lM41941m6 = m41941m3();
        if (c37991lM41941m6 == null || (kcPrimaryButton = c37991lM41941m6.f85504i) == null) {
            return;
        }
        ViewExtKt.m66575f(kcPrimaryButton, new Function1() { // from class: com.kubi.mine.lib.ui.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JoinBetaFragment.m41939q3(this.f35310b, (View) obj);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_join_beta, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setTitle(getString(R$string.join_internal_test));
    }

    /* JADX INFO: renamed from: r3 */
    public final void m41944r3() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.kubi.kucoin"));
            intent.addFlags(268435456);
            intent.setPackage("com.android.vending");
            startActivity(intent);
        } catch (Throwable unused) {
            Router.f46192a.m56184f("https://play.google.com/store/apps/details?id=com.kubi.kucoin").m4048k();
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final boolean m41942n3() {
        String strM6166l = C5264d.m6166l();
        Intrinsics.checkNotNullExpressionValue(strM6166l, "getAppVersionName(...)");
        if (!StringsKt.contains$default((CharSequence) strM6166l, (CharSequence) "beta", false, 2, (Object) null) && !C46396e.m102347d("mine", "has_open_beta_tester", false)) {
            C46396e.m102354k("mine", "has_open_beta_tester", true);
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/apps/testing/com.kubi.kucoin"));
                intent.addFlags(268435456);
                intent.setPackage("com.android.chrome");
                BaseApplication.INSTANCE.get().startActivity(intent);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        InterfaceC23686g interfaceC23686g;
        NavigationBar navigationBar;
        super.onCreate(savedInstanceState);
        getTitleBar().m58941n();
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m41943o3();
    }
}
