package com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.audiencecontainer.store.LiveInfoListStore;
import de0.InterfaceC36666c;
import ee0.C37139a;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 +2\u00020\u0001:\u0002+,B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0012J\u0010\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010%\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010&\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010'\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010(\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010)\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\"H\u0016J\u0016\u0010*\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "liveInfoListStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/LiveInfoListStore;", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/LiveInfoListStore;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V", "liveInfoList", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "isDataLoaded", "", "isLoading", "retainOnlyFirstElement", "", "getFragment", "Landroidx/fragment/app/Fragment;", ViewProps.POSITION, "", "dataList", "", "getDataList", "()Ljava/util/List;", "fetchData", "refreshData", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$ActionCallback;", "createFragment", "getItemCount", "onCreateView", "Landroid/view/View;", "onViewWillSlideIn", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onViewDidSlideIn", "onViewSlideInCancelled", "onViewWillSlideOut", "onViewDidSlideOut", "onViewSlideOutCancelled", "addData", "Companion", "ActionCallback", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class LiveListViewPagerAdapter extends FragmentStateAdapter {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f78938n = new Companion(null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final LiveKitLogger f78939o = LiveKitLogger.f77564c.getCommonLogger("AudienceViewPagerAdapter");

    /* JADX INFO: renamed from: i */
    @NotNull
    public final LiveInfoListStore f78940i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<LiveInfo> f78941j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final FragmentManager f78942k;

    /* JADX INFO: renamed from: l */
    public boolean f78943l;

    /* JADX INFO: renamed from: m */
    public boolean f78944m;

    /* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.liveListviewpager.LiveListViewPagerAdapter$a */
    /* JADX INFO: compiled from: LiveListViewPagerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$fetchData$1", "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListCallback;", "onSuccess", "", InterfaceC33953u5.f72198E, "", "liveInfoList", "", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onError", "code", "", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36336a implements InterfaceC36666c {
        public C36336a() {
        }

        @Override // de0.InterfaceC36666c
        public void onError(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            LiveListViewPagerAdapter.f78939o.m79403a("fetchLiveList failed,errorCode:" + code + ",message:" + message);
            LiveListViewPagerAdapter.this.f78944m = false;
        }

        @Override // de0.InterfaceC36666c
        public void onSuccess(String cursor, List<LiveInfo> liveInfoList) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(liveInfoList, "liveInfoList");
            if (!C37139a.f82409a.m83071e().getValue().booleanValue()) {
                int size = LiveListViewPagerAdapter.this.f78941j.size();
                LiveListViewPagerAdapter.this.f78941j.addAll(liveInfoList);
                LiveListViewPagerAdapter liveListViewPagerAdapter = LiveListViewPagerAdapter.this;
                liveListViewPagerAdapter.notifyItemRangeInserted(size, liveListViewPagerAdapter.f78941j.size());
            }
            LiveListViewPagerAdapter.this.f78943l = true;
            LiveListViewPagerAdapter.this.f78944m = false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public abstract View mo80738o(@NotNull LiveInfo liveInfo);

    /* JADX INFO: renamed from: p */
    public abstract void mo80739p(@Nullable View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo80740q(@Nullable View view);

    /* JADX INFO: renamed from: r */
    public abstract void mo80741r(@Nullable View view);

    /* JADX INFO: renamed from: t */
    public abstract void mo80742t(@Nullable View view);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveListViewPagerAdapter(@NotNull FragmentActivity fragmentActivity, @NotNull LiveInfoListStore liveInfoListStore, @Nullable LiveInfo liveInfo) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(liveInfoListStore, "liveInfoListStore");
        this.f78940i = liveInfoListStore;
        this.f78941j = new ArrayList();
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        this.f78942k = supportFragmentManager;
        List<LiveInfo> listM80766g = liveInfoListStore.m80766g();
        if (!listM80766g.isEmpty()) {
            m81258k(listM80766g);
            this.f78943l = true;
        } else if (liveInfo != null) {
            liveInfoListStore.m80768i(liveInfo);
            ArrayList arrayList = new ArrayList();
            arrayList.add(liveInfo);
            m81258k(arrayList);
        }
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        return new LiveListFragment(this.f78941j.get(position), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78941j.size();
    }

    /* JADX INFO: renamed from: k */
    public final void m81258k(List<LiveInfo> list) {
        int size = this.f78941j.size();
        this.f78941j.addAll(list);
        notifyItemRangeInserted(size, this.f78941j.size());
    }

    /* JADX INFO: renamed from: l */
    public final void m81259l() {
        boolean z11 = C37139a.f82409a.m83071e().getValue().booleanValue();
        LiveKitLogger liveKitLogger = f78939o;
        liveKitLogger.m79404b("fetchLiveList disableRoomSliding:" + z11);
        if (z11) {
            return;
        }
        if (this.f78944m) {
            liveKitLogger.m79404b("is start fetch data, waiting");
        } else if (this.f78943l && TextUtils.isEmpty(this.f78940i.getF78568b())) {
            liveKitLogger.m79404b("there is no more data");
        } else {
            this.f78944m = true;
            this.f78940i.m80764e(new C36336a());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<LiveInfo> m81260m() {
        return this.f78941j;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Fragment m81261n(int i11) {
        FragmentManager fragmentManager = this.f78942k;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('f');
        sb2.append(i11);
        return fragmentManager.findFragmentByTag(sb2.toString());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: v */
    public final void m81264v() {
        if (this.f78941j.size() > 1) {
            List<LiveInfo> list = this.f78941j;
            list.subList(1, list.size()).clear();
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m81262s(@Nullable View view) {
    }

    /* JADX INFO: renamed from: u */
    public void m81263u(@Nullable View view) {
    }
}
