package com.kubi.quotefacade.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.view.TabContainerFragment;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TabContainerFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0001H&J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0006\u0010\u001d\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/quotefacade/view/TabContainerFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "createInitialContent", "contentTag", "", "getContentTag", "()Ljava/lang/String;", "contentFragment", "getContentFragment", "()Lcom/kubi/sdk/BaseFragment;", "contentContainerId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onAgainShow", "addContent", "removeContent", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTabContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabContainerFragment.kt\ncom/kubi/quotefacade/view/TabContainerFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
public abstract class TabContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    public int f42765U = View.generateViewId();

    @NotNull
    /* JADX INFO: renamed from: l3 */
    public abstract BaseFragment mo51732l3();

    /* JADX INFO: renamed from: n3 */
    public final String m53329n3() {
        return "tab_content_" + getClass().getSimpleName();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setId(this.f42765U);
        return frameLayout;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m53327k3();
    }

    /* JADX INFO: renamed from: p3 */
    public static final void m53326p3(TabContainerFragment tabContainerFragment) {
        tabContainerFragment.m53330o3();
    }

    /* JADX INFO: renamed from: k3 */
    public final void m53327k3() {
        if (m53328m3() == null) {
            getChildFragmentManager().beginTransaction().replace(this.f42765U, mo51732l3(), m53329n3()).commitNowAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final BaseFragment m53328m3() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(m53329n3());
        if (fragmentFindFragmentByTag instanceof BaseFragment) {
            return (BaseFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public final void m53330o3() {
        BaseFragment baseFragmentM53328m3 = m53328m3();
        if (baseFragmentM53328m3 != null) {
            if (getChildFragmentManager().isStateSaved()) {
                View view = getView();
                if (view != null) {
                    view.post(new Runnable() { // from class: sv.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            TabContainerFragment.m53326p3(this.f98838b);
                        }
                    });
                    return;
                }
                return;
            }
            C27032f.m66620k(this, baseFragmentM53328m3);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        m53327k3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        BaseFragment baseFragmentM53328m3 = m53328m3();
        if (baseFragmentM53328m3 != null && baseFragmentM53328m3.isAdded()) {
            baseFragmentM53328m3.onHide();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        BaseFragment baseFragmentM53328m3 = m53328m3();
        if (baseFragmentM53328m3 != null && baseFragmentM53328m3.isAdded()) {
            baseFragmentM53328m3.onShow();
        }
    }
}
