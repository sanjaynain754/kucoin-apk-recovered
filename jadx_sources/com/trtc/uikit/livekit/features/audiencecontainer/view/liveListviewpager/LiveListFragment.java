package com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveListFragment.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListFragment;", "Landroidx/fragment/app/Fragment;", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;", "<init>", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentWillSlideIn", "", "onFragmentDidSlideIn", "onFragmentSlideInCancelled", "onFragmentWillSlideOut", "onFragmentDidSlideOut", "onFragmentSlideOutCancelled", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveListFragment extends Fragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final LiveInfo f78927U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public final LiveListViewPagerAdapter f78928V;

    public LiveListFragment(@NotNull LiveInfo liveInfo, @Nullable LiveListViewPagerAdapter liveListViewPagerAdapter) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f78927U = liveInfo;
        this.f78928V = liveListViewPagerAdapter;
    }

    /* JADX INFO: renamed from: d3 */
    public final void m81221d3() {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78928V;
        if (liveListViewPagerAdapter != null) {
            liveListViewPagerAdapter.mo80739p(getView());
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final void m81222e3() {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78928V;
        if (liveListViewPagerAdapter != null) {
            liveListViewPagerAdapter.mo80740q(getView());
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final void m81223f3() {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78928V;
        if (liveListViewPagerAdapter != null) {
            liveListViewPagerAdapter.mo80741r(getView());
        }
    }

    /* JADX INFO: renamed from: g3 */
    public final void m81224g3() {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78928V;
        if (liveListViewPagerAdapter != null) {
            liveListViewPagerAdapter.m81262s(getView());
        }
    }

    /* JADX INFO: renamed from: h3 */
    public final void m81225h3() {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78928V;
        if (liveListViewPagerAdapter != null) {
            liveListViewPagerAdapter.mo80742t(getView());
        }
    }

    /* JADX INFO: renamed from: i3 */
    public final void m81226i3() {
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78928V;
        if (liveListViewPagerAdapter != null) {
            liveListViewPagerAdapter.m81263u(getView());
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LiveListViewPagerAdapter liveListViewPagerAdapter = this.f78928V;
        return liveListViewPagerAdapter == null ? new RelativeLayout(getContext()) : liveListViewPagerAdapter.mo80738o(this.f78927U);
    }
}
