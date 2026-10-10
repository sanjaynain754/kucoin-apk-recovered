package com.kubi.kumex.trade.menu.announcement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.Article;
import com.kubi.kumex.trade.menu.p092vm.AnnouncementType;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36739c;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BaseAnnouncementTypeFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H$J\b\u0010\u001f\u001a\u00020\u001cH$J\b\u0010 \u001a\u00020\u001cH\u0004J\b\u0010!\u001a\u00020\u001cH\u0004J\b\u0010\"\u001a\u00020\u001cH\u0004J\b\u0010#\u001a\u00020\u001cH\u0004J\n\u0010$\u001a\u0004\u0018\u00010%H\u0004J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006)"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment;", "Lcom/kubi/sdk/BaseFragment;", "type", "Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;", "<init>", "(Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;)V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexAnnouncementTypeBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexAnnouncementTypeBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "kotlin.jvm.PlatformType", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "refresh", "showLoadingView", "showContent", "showContentEmpty", "showError", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onActionClick", "article", "Lcom/kubi/kumex/data/platform/model/Article;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseAnnouncementTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAnnouncementTypeFragment.kt\ncom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,242:1\n147#2,16:243\n*S KotlinDebug\n*F\n+ 1 BaseAnnouncementTypeFragment.kt\ncom/kubi/kumex/trade/menu/announcement/BaseAnnouncementTypeFragment\n*L\n29#1:243,16\n*E\n"})
public abstract class BaseAnnouncementTypeFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f30594X = {Reflection.property1(new PropertyReference1Impl(BaseAnnouncementTypeFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexAnnouncementTypeBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final AnnouncementType f30595U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f30596V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f30597W;

    /* JADX INFO: renamed from: B0 */
    public abstract void mo36344B0();

    /* JADX INFO: renamed from: o3 */
    public abstract void mo36345o3(@NotNull View view);

    public BaseAnnouncementTypeFragment(@NotNull AnnouncementType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f30595U = type;
        this.f30596V = C45681e.m100799e(this, new Function1<BaseAnnouncementTypeFragment, C36739c>() { // from class: com.kubi.kumex.trade.menu.announcement.BaseAnnouncementTypeFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36739c invoke(@NotNull BaseAnnouncementTypeFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36739c.m82329a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36739c, Unit>() { // from class: com.kubi.kumex.trade.menu.announcement.BaseAnnouncementTypeFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36739c it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36739c c36739c) {
                invoke(c36739c);
                return Unit.INSTANCE;
            }
        });
        this.f30597W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.menu.announcement.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseAnnouncementTypeFragment.m36357p3(this.f30607b);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    private final WrapperLoadingView m36356m3() {
        return (WrapperLoadingView) this.f30597W.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m36358r3(BaseAnnouncementTypeFragment baseAnnouncementTypeFragment, Article article) {
        Intrinsics.checkNotNullParameter(article, "article");
        baseAnnouncementTypeFragment.m36361q3(article);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n3 */
    public final C36739c m36360n3() {
        return (C36739c) this.f30596V.getValue(this, f30594X[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_announcement_type, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36739c c36739cM36360n3 = m36360n3();
        if (c36739cM36360n3 == null) {
            return;
        }
        c36739cM36360n3.f79764b.setLayoutManager(new LinearLayoutManager(view.getContext()));
        c36739cM36360n3.f79764b.setAdapter(new AnnouncementTypeAdapter(this.f30595U, null, new Function1() { // from class: com.kubi.kumex.trade.menu.announcement.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseAnnouncementTypeFragment.m36358r3(this.f30606b, (Article) obj);
            }
        }, 2, null));
        mo36345o3(view);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m36361q3(@NotNull Article article) {
        Intrinsics.checkNotNullParameter(article, "article");
        C37304a c37304a = C37304a.f82764a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.e());
        sb2.append("/announcement");
        sb2.append(article.getPath());
        sb2.append("?theme=");
        sb2.append(DayNightThemeManager.f28592a.m33187l() ? "light" : "dark");
        sb2.append("&appNeedLang=true");
        InterfaceC37766r.a.m85190a(c37304a, sb2.toString(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: p3 */
    public static final WrapperLoadingView m36357p3(BaseAnnouncementTypeFragment baseAnnouncementTypeFragment) {
        C36739c c36739cM36360n3 = baseAnnouncementTypeFragment.m36360n3();
        Intrinsics.checkNotNull(c36739cM36360n3);
        return WrapperLoadingView.injectView(c36739cM36360n3.f79764b);
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m36359v3(BaseAnnouncementTypeFragment baseAnnouncementTypeFragment, View view) {
        baseAnnouncementTypeFragment.mo36344B0();
    }

    @Nullable
    /* JADX INFO: renamed from: s3 */
    public final RecyclerView m36362s3() {
        C36739c c36739cM36360n3 = m36360n3();
        if (c36739cM36360n3 != null) {
            return c36739cM36360n3.f79764b;
        }
        return null;
    }

    public final void showContent() {
        m36356m3().showContent();
    }

    /* JADX INFO: renamed from: t3 */
    public final void m36363t3() {
        m36356m3().showEmpty(R$string.no_more_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m36364u3() {
        m36356m3().showEmpty(R$string.load_failed_click_retry, R$drawable.ic2_common_system_maintain, new View.OnClickListener() { // from class: com.kubi.kumex.trade.menu.announcement.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseAnnouncementTypeFragment.m36359v3(this.f30608b, view);
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public final void m36365w3() {
        WrapperLoadingView wrapperLoadingViewM36356m3 = m36356m3();
        if (wrapperLoadingViewM36356m3 != null) {
            wrapperLoadingViewM36356m3.showLoading();
        }
    }
}
