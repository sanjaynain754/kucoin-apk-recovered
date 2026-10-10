package com.trtc.uikit.livekit.features.livelist.view.liveListviewpager;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NotImplementedError;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u001e\u001a\u00020\u00192\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0003J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH&J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH&J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0016J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010\u0011J\u0016\u0010-\u001a\u00020\u00192\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "liveInfoListStore", "Lcom/trtc/uikit/livekit/features/livelist/store/LiveInfoListStore;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/trtc/uikit/livekit/features/livelist/store/LiveInfoListStore;)V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "liveInfoList", "", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "isDataLoaded", "", "isLoading", "onDataChangedListener", "Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter$OnDataChangedListener;", "getFragment", "Landroidx/fragment/app/Fragment;", ViewProps.POSITION, "", "getDataList", "", "fetchData", "", "refreshData", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter$ActionCallback;", "createFragment", "updateLiveList", "getItemCount", "createLiveInfoView", "Landroid/view/View;", "liveInfo", "updateLiveInfoView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onViewWillSlideIn", "onViewDidSlideIn", "onViewSlideInCancelled", "onViewWillSlideOut", "onViewDidSlideOut", "onViewSlideOutCancelled", "setOnDataChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addData", "Companion", "ActionCallback", "OnDataChangedListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveListViewPagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveListViewPagerAdapter.kt\ncom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1878#2,3:141\n*S KotlinDebug\n*F\n+ 1 LiveListViewPagerAdapter.kt\ncom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter\n*L\n98#1:141,3\n*E\n"})
public abstract class LiveListViewPagerAdapter extends FragmentStateAdapter {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f79105n = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final LiveKitLogger f79106o = LiveKitLogger.f77564c.getCommonLogger("LiveListViewPagerAdapter");

    /* JADX INFO: renamed from: i */
    @NotNull
    public final FragmentManager f79107i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<LiveInfo> f79108j;

    /* JADX INFO: renamed from: k */
    public boolean f79109k;

    /* JADX INFO: renamed from: l */
    public boolean f79110l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InterfaceC36389b f79111m;

    /* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPagerAdapter$a */
    /* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter$ActionCallback;", "", "onComplete", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC36388a {
        void onComplete();
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPagerAdapter$b */
    /* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter$OnDataChangedListener;", "", "onChanged", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC36389b {
        /* JADX INFO: renamed from: a */
        void mo81467a();
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPagerAdapter$c */
    /* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter$fetchData$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36390c implements CompletionHandler {
        public C36390c() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            LiveListViewPagerAdapter.f79106o.m79403a("fetchLiveList failed,errorCode:" + code + ",desc:" + desc);
            LiveListViewPagerAdapter.this.f79110l = false;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            int size = LiveListViewPagerAdapter.this.f79108j.size();
            LiveListViewPagerAdapter.this.f79108j.clear();
            LiveListViewPagerAdapter.this.f79108j.addAll(LiveListStore.INSTANCE.shared().getLiveState().getLiveList().getValue());
            LiveListViewPagerAdapter liveListViewPagerAdapter = LiveListViewPagerAdapter.this;
            liveListViewPagerAdapter.notifyItemRangeInserted(size, liveListViewPagerAdapter.f79108j.size());
            LiveListViewPagerAdapter.this.f79109k = true;
            LiveListViewPagerAdapter.this.f79110l = false;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.liveListviewpager.LiveListViewPagerAdapter$d */
    /* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/livelist/view/liveListviewpager/LiveListViewPagerAdapter$refreshData$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36391d implements CompletionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC36388a f79114b;

        public C36391d(InterfaceC36388a interfaceC36388a) {
            this.f79114b = interfaceC36388a;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            LiveListViewPagerAdapter.this.f79108j.clear();
            LiveListViewPagerAdapter.this.f79108j.addAll(LiveListStore.INSTANCE.shared().getLiveState().getLiveList().getValue());
            LiveListViewPagerAdapter liveListViewPagerAdapter = LiveListViewPagerAdapter.this;
            liveListViewPagerAdapter.m81466x(liveListViewPagerAdapter.f79108j);
            InterfaceC36388a interfaceC36388a = this.f79114b;
            if (interfaceC36388a != null) {
                interfaceC36388a.onComplete();
            }
            LiveListViewPagerAdapter.this.f79109k = true;
            LiveListViewPagerAdapter.this.f79110l = false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public abstract View m81454l(@NotNull LiveInfo liveInfo);

    /* JADX INFO: renamed from: w */
    public abstract void m81465w(@NotNull View view, @NotNull LiveInfo liveInfo);

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        return new LiveListFragment(this.f79108j.get(position), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f79108j.size();
    }

    /* JADX INFO: renamed from: m */
    public final void m81455m() {
        LiveKitLogger liveKitLogger = f79106o;
        liveKitLogger.m79404b("fetchLiveList enableSliding:");
        if (this.f79110l) {
            liveKitLogger.m79404b("is start fetch data, waiting");
        } else {
            if (this.f79109k) {
                throw null;
            }
            this.f79110l = true;
            new C36390c();
            throw null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<LiveInfo> m81456n() {
        return this.f79108j;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Fragment m81457o(int i11) {
        FragmentManager fragmentManager = this.f79107i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('f');
        sb2.append(i11);
        return fragmentManager.findFragmentByTag(sb2.toString());
    }

    /* JADX INFO: renamed from: p */
    public void m81458p(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: renamed from: q */
    public void m81459q(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: renamed from: r */
    public void m81460r(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: renamed from: s */
    public void m81461s(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void setOnDataChangedListener(@Nullable InterfaceC36389b interfaceC36389b) {
        this.f79111m = interfaceC36389b;
    }

    /* JADX INFO: renamed from: t */
    public void m81462t(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: renamed from: u */
    public void m81463u(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: renamed from: v */
    public final void m81464v(@Nullable InterfaceC36388a interfaceC36388a) {
        f79106o.m79404b("refreshData enableSliding:");
        this.f79110l = true;
        new C36391d(interfaceC36388a);
        throw null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: x */
    public final void m81466x(List<LiveInfo> list) {
        LiveListFragment liveListFragment;
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LiveInfo liveInfo = (LiveInfo) obj;
            Fragment fragmentM81457o = m81457o(i11);
            if (fragmentM81457o instanceof LiveListFragment) {
                liveListFragment = (LiveListFragment) fragmentM81457o;
            } else {
                liveListFragment = null;
            }
            if (liveListFragment != null) {
                liveListFragment.m81421j3(liveInfo);
            }
            i11 = i12;
        }
        notifyDataSetChanged();
        InterfaceC36389b interfaceC36389b = this.f79111m;
        if (interfaceC36389b != null) {
            interfaceC36389b.mo81467a();
        }
    }
}
