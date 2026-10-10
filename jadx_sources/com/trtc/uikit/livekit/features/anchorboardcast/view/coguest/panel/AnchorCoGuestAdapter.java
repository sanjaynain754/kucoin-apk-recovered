package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnchorCoGuestAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0007J\b\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$LinkMicViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "data", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "initData", "updateData", "getItemCount", "Companion", "LinkMicViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnchorCoGuestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorCoGuestAdapter.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n827#2:101\n855#2,2:102\n*S KotlinDebug\n*F\n+ 1 AnchorCoGuestAdapter.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter\n*L\n78#1:101\n78#1:102,2\n*E\n"})
public final class AnchorCoGuestAdapter extends RecyclerView.Adapter<C36094a> {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f78257k = new Companion(null);

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final LiveKitLogger f78258l = LiveKitLogger.f77564c.getFeaturesLogger("AnchorCoGuestAdapter");

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f78259i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final CopyOnWriteArrayList<SeatUserInfo> f78260j;

    /* JADX INFO: compiled from: AnchorCoGuestAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestAdapter$a */
    /* JADX INFO: compiled from: AnchorCoGuestAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$LinkMicViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "imageHead", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "getImageHead", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "textName", "Landroid/widget/TextView;", "getTextName", "()Landroid/widget/TextView;", "textHangUp", "getTextHangUp", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36094a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final AtomicAvatar f78261g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f78262h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final TextView f78263i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36094a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_head);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f78261g = (AtomicAvatar) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f78262h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.tv_hang_up);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f78263i = (TextView) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicAvatar getF78261g() {
            return this.f78261g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF78263i() {
            return this.f78263i;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF78262h() {
            return this.f78262h;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorCoGuestAdapter$b */
    /* JADX INFO: compiled from: AnchorCoGuestAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorCoGuestAdapter$onBindViewHolder$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36095b implements CompletionHandler {
        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            ErrorLocalized.f77561a.onError(code);
            AnchorCoGuestAdapter.f78258l.m79403a("AnchorCoGuestAdapter disconnectUser failed:code:" + code + ",desc:" + desc);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m80348m(View view) {
        view.setEnabled(false);
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo");
        LiveSeatStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).kickUserOutOfSeat(((SeatUserInfo) tag).getUserID(), new C36095b());
    }

    public AnchorCoGuestAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78259i = context;
        this.f78260j = new CopyOnWriteArrayList<>();
        m80346j();
    }

    /* JADX INFO: renamed from: j */
    private final void m80346j() {
        final String userID;
        List<SeatUserInfo> value = CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoGuestState().getConnected().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID())) {
                arrayList.add(obj);
            }
        }
        this.f78260j.clear();
        this.f78260j.addAll(arrayList);
        UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value2 == null || (userID = value2.getUserID()) == null) {
            userID = "";
        }
        CollectionsKt.removeAll((List) this.f78260j, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(AnchorCoGuestAdapter.m80347k(userID, (SeatUserInfo) obj2));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78260j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C36094a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SeatUserInfo seatUserInfo = this.f78260j.get(i11);
        if (TextUtils.isEmpty(seatUserInfo.getUserName())) {
            holder.getF78262h().setText(seatUserInfo.getUserID());
        } else {
            holder.getF78262h().setText(seatUserInfo.getUserName());
        }
        holder.getF78261g().setContent(new AtomicAvatar.AbstractC39363b.URL(this.f78260j.get(i11).getAvatarURL(), R$drawable.livekit_ic_avatar));
        holder.getF78263i().setTag(seatUserInfo);
        holder.getF78263i().setEnabled(true);
        holder.getF78263i().setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorCoGuestAdapter.m80348m(view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C36094a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f78259i).inflate(R$layout.livekit_layout_anchor_link_mic_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new C36094a(viewInflate);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m80347k(String str, SeatUserInfo seatUserInfo) {
        return Intrinsics.areEqual(seatUserInfo.getUserID(), str);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: o */
    public final void m80351o() {
        m80346j();
        notifyDataSetChanged();
    }
}
