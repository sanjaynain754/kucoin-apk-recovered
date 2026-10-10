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
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.store.ConnectionStatus;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.AtomicButton;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.ButtonColorType;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.ButtonVariant;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.CoHostLayoutTemplate;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import wd0.CoHostAnchor;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AnchorRecommendedAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0002J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0002J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0002J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0003J\b\u0010 \u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorRecommendedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorRecommendedAdapter$RecommendViewHolder;", "context", "Landroid/content/Context;", "anchorStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "data", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/CoHostAnchor;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "updateData", "", "recommendList", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "setUserName", "recommendUser", "setAvatar", "setConnectionStatus", "setConnectionClickListener", "initData", "RecommendViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorRecommendedAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f78400i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AnchorStore f78401j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final LiveKitLogger f78402k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final CopyOnWriteArrayList<CoHostAnchor> f78403l;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.k$a */
    /* JADX INFO: compiled from: AnchorRecommendedAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorRecommendedAdapter$RecommendViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "imageHead", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "getImageHead", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "textName", "Landroid/widget/TextView;", "getTextName", "()Landroid/widget/TextView;", "buttonConnect", "Lio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton;", "getButtonConnect", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final AtomicAvatar f78404g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f78405h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final AtomicButton f78406i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_head);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f78404g = (AtomicAvatar) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f78405h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.atomic_btn_connect);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f78406i = (AtomicButton) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AtomicButton getF78406i() {
            return this.f78406i;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final AtomicAvatar getF78404g() {
            return this.f78404g;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF78405h() {
            return this.f78405h;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.k$b */
    /* JADX INFO: compiled from: AnchorRecommendedAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/cohost/panel/AnchorRecommendedAdapter$setConnectionClickListener$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements CompletionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CoHostAnchor f78408b;

        public b(CoHostAnchor coHostAnchor) {
            this.f78408b = coHostAnchor;
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            AnchorRecommendedAdapter.this.f78402k.m79403a("AnchorRecommendedAdapter requestHostConnection failed:code:" + code + ",desc:" + desc);
            AnchorRecommendedAdapter.this.f78401j.getF78176i().m101150j(this.f78408b.getRoomId(), ConnectionStatus.UNKNOWN);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            AnchorRecommendedAdapter.this.f78402k.m79403a("AnchorRecommendedAdapter requestHostConnection onSuccess");
        }
    }

    public AnchorRecommendedAdapter(@NotNull Context context, @NotNull AnchorStore anchorStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorStore, "anchorStore");
        this.f78400i = context;
        this.f78401j = anchorStore;
        this.f78402k = LiveKitLogger.f77564c.getFeaturesLogger("AnchorRecommendedAdapter");
        this.f78403l = new CopyOnWriteArrayList<>();
        m80543j();
    }

    /* JADX INFO: renamed from: j */
    private final void m80543j() {
        String userID;
        List<CoHostAnchor> value = this.f78401j.m80233j().m101136a().getValue();
        this.f78403l.clear();
        UserProfile value2 = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value2 == null || (userID = value2.getUserID()) == null) {
            userID = "";
        }
        for (CoHostAnchor coHostAnchor : value) {
            if (!TextUtils.equals(coHostAnchor.getUserId(), userID)) {
                this.f78403l.add(coHostAnchor);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78403l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CoHostAnchor coHostAnchor = this.f78403l.get(i11);
        Intrinsics.checkNotNull(coHostAnchor);
        m80550q(holder, coHostAnchor);
        m80547m(holder, coHostAnchor);
        m80549p(holder, coHostAnchor);
        m80548n(holder, coHostAnchor);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f78400i).inflate(R$layout.livekit_layout_anchor_connection_recommendation_list, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    /* JADX INFO: renamed from: r */
    public final void m80551r(@NotNull List<CoHostAnchor> recommendList) {
        String userID;
        Intrinsics.checkNotNullParameter(recommendList, "recommendList");
        this.f78403l.clear();
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value == null || (userID = value.getUserID()) == null) {
            userID = "";
        }
        for (CoHostAnchor coHostAnchor : recommendList) {
            if (!TextUtils.equals(coHostAnchor.getUserId(), userID)) {
                this.f78403l.add(coHostAnchor);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m80544o(CoHostAnchor coHostAnchor, AnchorRecommendedAdapter anchorRecommendedAdapter, View view) {
        if (coHostAnchor.getConnectionStatus() == ConnectionStatus.UNKNOWN) {
            coHostAnchor.m101180h(ConnectionStatus.INVITING);
            anchorRecommendedAdapter.notifyDataSetChanged();
            CoHostStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).requestHostConnection(coHostAnchor.getRoomId(), CoHostLayoutTemplate.HOST_DYNAMIC_GRID, 10, "", anchorRecommendedAdapter.new b(coHostAnchor));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m80547m(a aVar, CoHostAnchor coHostAnchor) {
        aVar.getF78404g().setContent(new AtomicAvatar.AbstractC39363b.URL(coHostAnchor.getAvatarUrl(), R$drawable.livekit_ic_avatar));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: n */
    public final void m80548n(a aVar, final CoHostAnchor coHostAnchor) {
        aVar.getF78406i().setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.cohost.panel.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnchorRecommendedAdapter.m80544o(coHostAnchor, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m80549p(a aVar, CoHostAnchor coHostAnchor) {
        if (coHostAnchor.getConnectionStatus() == ConnectionStatus.INVITING) {
            AtomicButton f78406i = aVar.getF78406i();
            String string = this.f78400i.getString(R$string.common_connect_inviting);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            f78406i.setText(string);
            aVar.getF78406i().setColorType(ButtonColorType.SECONDARY);
            aVar.getF78406i().setVariant(ButtonVariant.OUTLINED);
            return;
        }
        AtomicButton f78406i2 = aVar.getF78406i();
        String string2 = this.f78400i.getString(R$string.common_voiceroom_invite);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        f78406i2.setText(string2);
        aVar.getF78406i().setColorType(ButtonColorType.PRIMARY);
        aVar.getF78406i().setVariant(ButtonVariant.FILLED);
    }

    /* JADX INFO: renamed from: q */
    public final void m80550q(a aVar, CoHostAnchor coHostAnchor) {
        String userName;
        TextView f78405h = aVar.getF78405h();
        if (TextUtils.isEmpty(coHostAnchor.getUserName())) {
            userName = coHostAnchor.getUserId();
        } else {
            userName = coHostAnchor.getUserName();
        }
        f78405h.setText(userName);
    }
}
