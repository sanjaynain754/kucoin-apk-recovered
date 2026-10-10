package com.trtc.uikit.livekit.features.livelist.view.liveListviewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LiveListFragment.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListFragment;", "Landroidx/fragment/app/Fragment;", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter;", "<init>", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "updateLiveInfo", "", "onFragmentWillSlideIn", "onFragmentDidSlideIn", "onFragmentSlideInCancelled", "onFragmentWillSlideOut", "onFragmentDidSlideOut", "onFragmentSlideOutCancelled", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveListFragment.kt\ncom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class LiveListFragment extends Fragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public LiveInfo f79096U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final LiveListViewPagerAdapter f79097V;

    public LiveListFragment(@NotNull LiveInfo liveInfo, @NotNull LiveListViewPagerAdapter liveListViewAdapter) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(liveListViewAdapter, "liveListViewAdapter");
        this.f79096U = liveInfo;
        this.f79097V = liveListViewAdapter;
    }

    /* JADX INFO: renamed from: j3 */
    public final void m81421j3(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f79096U = liveInfo;
        View view = getView();
        if (view != null) {
            this.f79097V.m81465w(view, liveInfo);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.f79097V.m81454l(this.f79096U);
    }

    /* JADX INFO: renamed from: d3 */
    public final void m81415d3() {
        View view = getView();
        if (view != null) {
            this.f79097V.m81458p(view);
        }
    }

    /* JADX INFO: renamed from: e3 */
    public final void m81416e3() {
        View view = getView();
        if (view != null) {
            this.f79097V.m81459q(view);
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final void m81417f3() {
        View view = getView();
        if (view != null) {
            this.f79097V.m81460r(view);
        }
    }

    /* JADX INFO: renamed from: g3 */
    public final void m81418g3() {
        View view = getView();
        if (view != null) {
            this.f79097V.m81461s(view);
        }
    }

    /* JADX INFO: renamed from: h3 */
    public final void m81419h3() {
        View view = getView();
        if (view != null) {
            this.f79097V.m81462t(view);
        }
    }

    /* JADX INFO: renamed from: i3 */
    public final void m81420i3() {
        View view = getView();
        if (view != null) {
            this.f79097V.m81463u(view);
        }
    }
}
