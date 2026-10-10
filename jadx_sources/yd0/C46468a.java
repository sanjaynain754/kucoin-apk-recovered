package yd0;

import com.tencent.imsdk.p128v2.V2TIMFriendshipListener;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import java.lang.ref.WeakReference;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import wd0.C45812p;

/* JADX INFO: renamed from: yd0.a */
/* JADX INFO: compiled from: IMFriendshipListener.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/observer/IMFriendshipListener;", "Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;", "liveStreamManager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "<init>", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V", "liveManager", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "onMyFollowingListChanged", "", "userInfoList", "", "Lcom/tencent/imsdk/v2/V2TIMUserFullInfo;", "isAdd", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46468a extends V2TIMFriendshipListener {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final WeakReference<AnchorStore> f104230b;

    public C46468a(@NotNull AnchorStore liveStreamManager) {
        Intrinsics.checkNotNullParameter(liveStreamManager, "liveStreamManager");
        this.f104230b = new WeakReference<>(liveStreamManager);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public void onMyFollowingListChanged(@NotNull List<? extends V2TIMUserFullInfo> userInfoList, boolean isAdd) {
        C45812p f78174g;
        Intrinsics.checkNotNullParameter(userInfoList, "userInfoList");
        AnchorStore anchorStore = this.f104230b.get();
        if (anchorStore == null || (f78174g = anchorStore.getF78174g()) == null) {
            return;
        }
        f78174g.m101196j(userInfoList, isAdd);
    }
}
