package com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel;

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
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnchorConnectingAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorConnectingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorConnectingAdapter$LinkMicViewHolder;", "context", "Landroid/content/Context;", "anchorStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V", "data", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "initData", "updateData", "connectionUsers", "", "getItemCount", "LinkMicViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorConnectingAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f78393i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AnchorStore f78394j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final CopyOnWriteArrayList<SeatUserInfo> f78395k;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.i$a */
    /* JADX INFO: compiled from: AnchorConnectingAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorConnectingAdapter$LinkMicViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "imageHead", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "getImageHead", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "textName", "Landroid/widget/TextView;", "getTextName", "()Landroid/widget/TextView;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final AtomicAvatar f78396g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f78397h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_head);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f78396g = (AtomicAvatar) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f78397h = (TextView) viewFindViewById2;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicAvatar getF78396g() {
            return this.f78396g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF78397h() {
            return this.f78397h;
        }
    }

    public AnchorConnectingAdapter(@NotNull Context context, @NotNull AnchorStore anchorStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorStore, "anchorStore");
        this.f78393i = context;
        this.f78394j = anchorStore;
        this.f78395k = new CopyOnWriteArrayList<>();
        m80534g();
    }

    /* JADX INFO: renamed from: g */
    private final void m80534g() {
        this.f78395k.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78395k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SeatUserInfo seatUserInfo = this.f78395k.get(i11);
        if (TextUtils.isEmpty(seatUserInfo.getUserName())) {
            holder.getF78397h().setText(seatUserInfo.getUserID());
        } else {
            holder.getF78397h().setText(seatUserInfo.getUserName());
        }
        holder.getF78396g().setContent(new AtomicAvatar.AbstractC39363b.URL(this.f78395k.get(i11).getAvatarURL(), R$drawable.livekit_ic_avatar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f78393i).inflate(R$layout.livekit_layout_anchor_connecting_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: j */
    public final void m80537j(@NotNull List<SeatUserInfo> connectionUsers) {
        Intrinsics.checkNotNullParameter(connectionUsers, "connectionUsers");
        this.f78395k.clear();
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        String userID = value != null ? value.getUserID() : null;
        for (SeatUserInfo seatUserInfo : connectionUsers) {
            if (!TextUtils.equals(seatUserInfo.getUserID(), userID)) {
                this.f78395k.add(seatUserInfo);
            }
        }
    }
}
