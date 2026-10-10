package xc0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceState;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xc0.a */
/* JADX INFO: compiled from: AudienceListIconAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListIconAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListIconAdapter$ViewHolder;", "context", "Landroid/content/Context;", "audienceState", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;", "<init>", "(Landroid/content/Context;Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceState;)V", "data", "", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "updateData", "ViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46136a extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f103621i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final LiveAudienceState f103622j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public List<LiveUserInfo> f103623k;

    /* JADX INFO: renamed from: xc0.a$a */
    /* JADX INFO: compiled from: AudienceListIconAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/audiencelist/view/adapter/AudienceListIconAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "imageHead", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "getImageHead", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "layoutRoot", "Landroid/widget/RelativeLayout;", "getLayoutRoot", "()Landroid/widget/RelativeLayout;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final AtomicAvatar f103624g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final RelativeLayout f103625h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_head);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f103624g = (AtomicAvatar) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.rl_root);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f103625h = (RelativeLayout) viewFindViewById2;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicAvatar getF103624g() {
            return this.f103624g;
        }
    }

    public C46136a(@NotNull Context context, @NotNull LiveAudienceState audienceState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceState, "audienceState");
        this.f103621i = context;
        this.f103622j = audienceState;
        this.f103623k = new ArrayList(audienceState.getAudienceList().getValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getF103624g().setContent(new AtomicAvatar.AbstractC39363b.URL(this.f103623k.get(i11).getAvatarURL(), R$drawable.audience_list_default_avatar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Math.min(this.f103623k.size(), 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.audience_list_layout_icon_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: i */
    public final void m101682i() {
        this.f103623k = new ArrayList(this.f103622j.getAudienceList().getValue());
        notifyDataSetChanged();
    }
}
