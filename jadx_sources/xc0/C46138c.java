package xc0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.audiencelist.AudienceListView;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceState;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xc0.c */
/* JADX INFO: compiled from: AudienceListPanelAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListPanelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListPanelAdapter$ViewHolder;", "context", "Landroid/content/Context;", "audienceState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;", "<init>", "(Landroid/content/Context;Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;)V", "data", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onItemClickListener", "Lcom/trtc/uikit/livekit/component/audiencelist/AudienceListView$OnUserItemClickListener;", "setOnItemClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "updateData", "ViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46138c extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f103628i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final LiveAudienceState f103629j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public CopyOnWriteArrayList<LiveUserInfo> f103630k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public AudienceListView.InterfaceC35869a f103631l;

    /* JADX INFO: renamed from: xc0.c$a */
    /* JADX INFO: compiled from: AudienceListPanelAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListPanelAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "imageHead", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "getImageHead", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "textName", "Landroid/widget/TextView;", "getTextName", "()Landroid/widget/TextView;", "textLevel", "getTextLevel", "more", "Landroid/widget/ImageView;", "getMore", "()Landroid/widget/ImageView;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final AtomicAvatar f103632g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f103633h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final TextView f103634i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final ImageView f103635j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_head);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f103632g = (AtomicAvatar) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f103633h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.tv_level);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f103634i = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.more);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.f103635j = (ImageView) viewFindViewById4;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicAvatar getF103632g() {
            return this.f103632g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageView getF103635j() {
            return this.f103635j;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF103634i() {
            return this.f103634i;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getF103633h() {
            return this.f103633h;
        }
    }

    public C46138c(@NotNull Context context, @NotNull LiveAudienceState audienceState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceState, "audienceState");
        this.f103628i = context;
        this.f103629j = audienceState;
        this.f103630k = new CopyOnWriteArrayList<>(audienceState.getAudienceList().getValue());
    }

    /* JADX INFO: renamed from: i */
    public static final void m101685i(C46138c c46138c, int i11, View view) {
        AudienceListView.InterfaceC35869a interfaceC35869a = c46138c.f103631l;
        if (interfaceC35869a != null) {
            LiveUserInfo liveUserInfo = c46138c.f103630k.get(i11);
            Intrinsics.checkNotNullExpressionValue(liveUserInfo, "get(...)");
            interfaceC35869a.mo79430a(liveUserInfo);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f103630k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, final int i11) {
        String userID;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: xc0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C46138c.m101685i(this.f103626b, i11, view);
            }
        });
        holder.getF103632g().setContent(new AtomicAvatar.AbstractC39363b.URL(this.f103630k.get(i11).getAvatarURL(), R$drawable.audience_list_default_avatar));
        if (TextUtils.isEmpty(this.f103630k.get(i11).getUserName())) {
            holder.getF103633h().setText(this.f103630k.get(i11).getUserID());
        } else {
            holder.getF103633h().setText(this.f103630k.get(i11).getUserName());
        }
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value == null || (userID = value.getUserID()) == null) {
            userID = "";
        }
        if (TextUtils.isEmpty(userID) || !Intrinsics.areEqual(userID, LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveOwner().getUserID())) {
            holder.getF103635j().setVisibility(8);
        } else {
            holder.getF103635j().setVisibility(this.f103631l == null ? 8 : 0);
        }
        holder.getF103634i().setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.audience_list_layout_panel_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: k */
    public final void m101688k() {
        this.f103630k = new CopyOnWriteArrayList<>(this.f103629j.getAudienceList().getValue());
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@Nullable AudienceListView.InterfaceC35869a interfaceC35869a) {
        this.f103631l = interfaceC35869a;
    }
}
