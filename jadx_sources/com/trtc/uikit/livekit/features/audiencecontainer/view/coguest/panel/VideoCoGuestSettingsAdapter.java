package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCoGuestSettingsAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$BaseViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "settingsItem", "", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$SettingsItem;", "data", "", "onItemClickListener", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$OnItemClickListener;", "setOnItemClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "initSettingsItem", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "Companion", "BaseViewHolder", "SettingsViewHolder", "SettingsItem", "OnItemClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class VideoCoGuestSettingsAdapter extends RecyclerView.Adapter<AbstractC36268a> {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f78828m = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f78829i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<C36270c> f78830j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<C36270c> f78831k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public InterfaceC36269b f78832l;

    /* JADX INFO: compiled from: VideoCoGuestSettingsAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$Companion;", "", "<init>", "()V", "ITEM_SETTINGS_BEAUTY", "", "ITEM_SETTINGS_FLIP", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter$a */
    /* JADX INFO: compiled from: VideoCoGuestSettingsAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bindData", "", ViewProps.POSITION, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC36268a extends RecyclerView.ViewHolder {
        /* JADX INFO: renamed from: a */
        public abstract void mo81135a(int i11);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC36268a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter$b */
    /* JADX INFO: compiled from: VideoCoGuestSettingsAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$OnItemClickListener;", "", "onBeautyItemClicked", "", "onFlipItemClicked", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC36269b {
        /* JADX INFO: renamed from: a */
        void mo81136a();

        /* JADX INFO: renamed from: b */
        void mo81137b();
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter$c */
    /* JADX INFO: compiled from: VideoCoGuestSettingsAdapter.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$SettingsItem;", "", "title", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "type", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "<init>", "(Ljava/lang/String;IILandroid/view/View$OnClickListener;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()I", "getType", "getListener", "()Landroid/view/View$OnClickListener;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36270c {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f78833a;

        /* JADX INFO: renamed from: b */
        public final int f78834b;

        /* JADX INFO: renamed from: c */
        public final int f78835c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final View.OnClickListener f78836d;

        public C36270c(@NotNull String title, int i11, int i12, @NotNull View.OnClickListener listener) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f78833a = title;
            this.f78834b = i11;
            this.f78835c = i12;
            this.f78836d = listener;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF78834b() {
            return this.f78834b;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final View.OnClickListener getF78836d() {
            return this.f78836d;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF78833a() {
            return this.f78833a;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getF78835c() {
            return this.f78835c;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter$d */
    /* JADX INFO: compiled from: VideoCoGuestSettingsAdapter.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$SettingsViewHolder;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter$BaseViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/VideoCoGuestSettingsAdapter;Landroid/view/View;)V", "layoutRoot", "Landroid/widget/RelativeLayout;", "getLayoutRoot", "()Landroid/widget/RelativeLayout;", "textTitle", "Landroid/widget/TextView;", "getTextTitle", "()Landroid/widget/TextView;", "imageIcon", "Landroid/widget/ImageView;", "getImageIcon", "()Landroid/widget/ImageView;", "bindData", "", ViewProps.POSITION, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C36271d extends AbstractC36268a {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final RelativeLayout f78837g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f78838h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final ImageView f78839i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ VideoCoGuestSettingsAdapter f78840j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36271d(@NotNull VideoCoGuestSettingsAdapter videoCoGuestSettingsAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f78840j = videoCoGuestSettingsAdapter;
            View viewFindViewById = itemView.findViewById(R$id.rl_settings_item_root);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f78837g = (RelativeLayout) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.item_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f78838h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.item_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f78839i = (ImageView) viewFindViewById3;
        }

        @Override // com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.VideoCoGuestSettingsAdapter.AbstractC36268a
        /* JADX INFO: renamed from: a */
        public void mo81135a(int i11) {
            this.f78838h.setText(((C36270c) this.f78840j.f78831k.get(i11)).getF78833a());
            this.f78839i.setImageResource(((C36270c) this.f78840j.f78831k.get(i11)).getF78834b());
            this.f78837g.setTag(Integer.valueOf(((C36270c) this.f78840j.f78831k.get(i11)).getF78835c()));
            this.f78837g.setOnClickListener(((C36270c) this.f78840j.f78831k.get(i11)).getF78836d());
        }
    }

    public VideoCoGuestSettingsAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78829i = context;
        ArrayList arrayList = new ArrayList();
        this.f78830j = arrayList;
        m81132j();
        this.f78831k = arrayList;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: k */
    public static final void m81130k(VideoCoGuestSettingsAdapter videoCoGuestSettingsAdapter, View view) {
        InterfaceC36269b interfaceC36269b = videoCoGuestSettingsAdapter.f78832l;
        if (interfaceC36269b != null) {
            interfaceC36269b.mo81136a();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m81131l(VideoCoGuestSettingsAdapter videoCoGuestSettingsAdapter, View view) {
        InterfaceC36269b interfaceC36269b = videoCoGuestSettingsAdapter.f78832l;
        if (interfaceC36269b != null) {
            interfaceC36269b.mo81137b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78831k.size();
    }

    /* JADX INFO: renamed from: j */
    public final void m81132j() {
        List<C36270c> list = this.f78830j;
        String string = this.f78829i.getString(R$string.common_video_settings_item_beauty);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(new C36270c(string, R$drawable.livekit_video_settings_beauty, 101, new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoCoGuestSettingsAdapter.m81130k(this.f78870b, view);
            }
        }));
        List<C36270c> list2 = this.f78830j;
        String string2 = this.f78829i.getString(R$string.common_video_settings_item_flip);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list2.add(new C36270c(string2, R$drawable.livekit_video_settings_flip, 105, new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoCoGuestSettingsAdapter.m81131l(this.f78872b, view);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC36268a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.mo81135a(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC36268a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.livekit_video_settings_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new C36271d(this, viewInflate);
    }

    public final void setOnItemClickListener(@NotNull InterfaceC36269b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f78832l = listener;
    }
}
