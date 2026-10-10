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
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnchorApplyCoGuestAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0007J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorApplyCoGuestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorApplyCoGuestAdapter$ApplyLinkMicViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "data", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "initData", "updateData", "getItemCount", "ApplyLinkMicViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorApplyCoGuestAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f78321i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final LiveKitLogger f78322j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final CopyOnWriteArrayList<LiveUserInfo> f78323k;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.c$a */
    /* JADX INFO: compiled from: AnchorApplyCoGuestAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorApplyCoGuestAdapter$ApplyLinkMicViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "imageHead", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "getImageHead", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "textName", "Landroid/widget/TextView;", "getTextName", "()Landroid/widget/TextView;", "textAccept", "getTextAccept", "textReject", "getTextReject", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final AtomicAvatar f78324g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f78325h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final TextView f78326i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final TextView f78327j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_head);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f78324g = (AtomicAvatar) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f78325h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.atomic_btn_accept);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f78326i = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.atomic_btn_reject);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.f78327j = (TextView) viewFindViewById4;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicAvatar getF78324g() {
            return this.f78324g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF78326i() {
            return this.f78326i;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF78325h() {
            return this.f78325h;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getF78327j() {
            return this.f78327j;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.c$b */
    /* JADX INFO: compiled from: AnchorApplyCoGuestAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorApplyCoGuestAdapter$onBindViewHolder$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements CompletionHandler {
        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.c$c */
    /* JADX INFO: compiled from: AnchorApplyCoGuestAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorApplyCoGuestAdapter$onBindViewHolder$2$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements CompletionHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f78328a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnchorApplyCoGuestAdapter f78329b;

        public c(View view, AnchorApplyCoGuestAdapter anchorApplyCoGuestAdapter) {
            this.f78328a = view;
            this.f78329b = anchorApplyCoGuestAdapter;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            if (code == TUICommonDefine.Error.ALL_SEAT_OCCUPIED.getValue()) {
                this.f78328a.setEnabled(true);
            }
            ErrorLocalized.f77561a.onError(code);
            this.f78329b.f78322j.m79403a("AnchorApplyCoGuestAdapter respondIntraRoomConnection failed:code:" + code + ",desc:" + desc);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m80460l(View view) {
        view.setEnabled(false);
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo");
        CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).rejectApplication(((LiveUserInfo) tag).getUserID(), new b());
    }

    /* JADX INFO: renamed from: m */
    public static final void m80461m(AnchorApplyCoGuestAdapter anchorApplyCoGuestAdapter, View view) {
        view.setEnabled(false);
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo");
        CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).acceptApplication(((LiveUserInfo) tag).getUserID(), new c(view, anchorApplyCoGuestAdapter));
    }

    public AnchorApplyCoGuestAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78321i = context;
        this.f78322j = LiveKitLogger.f77564c.getFeaturesLogger("AnchorApplyCoGuestAdapter");
        this.f78323k = new CopyOnWriteArrayList<>();
        m80459j();
    }

    /* JADX INFO: renamed from: j */
    private final void m80459j() {
        this.f78323k.clear();
        this.f78323k.addAll(CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoGuestState().getApplicants().getValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78323k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        LiveUserInfo liveUserInfo = this.f78323k.get(i11);
        if (TextUtils.isEmpty(liveUserInfo.getUserName())) {
            holder.getF78325h().setText(liveUserInfo.getUserID());
        } else {
            holder.getF78325h().setText(liveUserInfo.getUserName());
        }
        holder.getF78324g().setContent(new AtomicAvatar.AbstractC39363b.URL(this.f78323k.get(i11).getAvatarURL(), R$drawable.livekit_ic_avatar));
        holder.getF78327j().setTag(liveUserInfo);
        holder.getF78327j().setEnabled(true);
        holder.getF78327j().setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorApplyCoGuestAdapter.m80460l(view);
            }
        });
        holder.getF78326i().setTag(liveUserInfo);
        holder.getF78326i().setEnabled(true);
        holder.getF78326i().setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorApplyCoGuestAdapter.m80461m(this.f78320b, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f78321i).inflate(R$layout.livekit_layout_anchor_link_mic_panel_item_request, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: o */
    public final void m80464o() {
        m80459j();
        notifyDataSetChanged();
    }
}
