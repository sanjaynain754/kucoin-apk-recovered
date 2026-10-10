package com.trtc.uikit.livekit.features.audiencecontainer.view.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.user.api.IUserService;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog;
import com.trtc.uikit.livekit.component.pippanel.PIPTogglePanel;
import com.trtc.uikit.livekit.p180kc.audience.AudienceBlockConfirmDialog;
import com.trtc.uikit.livekit.p180kc.helper.LiveFlutterHelper;
import com.trtc.uikit.livekit.p180kc.share.KCLiveShareHelper;
import ee0.C37144f;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ud0.DialogC45191e;

/* JADX INFO: compiled from: AudienceSettingsListAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "settingsDialog", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsPanelDialog;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsPanelDialog;)V", "data", "", "Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$SettingsItem;", "initData", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "showMediaDashboardDialog", "showVideoQualityDialog", "showPipDialog", "handleShare", "handleReport", "handleBlock", "getItemCount", "Companion", "ViewHolder", "SettingsItem", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AudienceSettingsListAdapter extends RecyclerView.Adapter<C36345b> {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f78954m = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f78955i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final C37144f f78956j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final AudienceSettingsPanelDialog f78957k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final List<SettingsItem> f78958l;

    /* JADX INFO: compiled from: AudienceSettingsListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$Companion;", "", "<init>", "()V", "ITEM_TYPE_DASHBOARD", "", "ITEM_TYPE_VIDEO_QUALITY", "ITEM_TYPE_PIP", "ITEM_TYPE_SHARE", "ITEM_TYPE_REPORT", "ITEM_TYPE_BLOCK", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.AudienceSettingsListAdapter$a, reason: from toString */
    /* JADX INFO: compiled from: AudienceSettingsListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$SettingsItem;", "", "title", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "type", "<init>", "(Ljava/lang/String;II)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()I", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SettingsItem {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int icon;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final int type;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsItem)) {
                return false;
            }
            SettingsItem settingsItem = (SettingsItem) other;
            return Intrinsics.areEqual(this.title, settingsItem.title) && this.icon == settingsItem.icon && this.type == settingsItem.type;
        }

        public SettingsItem(@NotNull String title, int i11, int i12) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.icon = i11;
            this.type = i12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.type);
        }

        @NotNull
        public String toString() {
            return "SettingsItem(title=" + this.title + ", icon=" + this.icon + ", type=" + this.type + ')';
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.AudienceSettingsListAdapter$b */
    /* JADX INFO: compiled from: AudienceSettingsListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "layoutRoot", "Landroid/widget/LinearLayout;", "getLayoutRoot", "()Landroid/widget/LinearLayout;", "textTitle", "Landroid/widget/TextView;", "getTextTitle", "()Landroid/widget/TextView;", "imageIcon", "Landroid/widget/ImageView;", "getImageIcon", "()Landroid/widget/ImageView;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36345b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final LinearLayout f78962g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f78963h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final ImageView f78964i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36345b(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.ll_root);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f78962g = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f78963h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.iv_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f78964i = (ImageView) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF78964i() {
            return this.f78964i;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LinearLayout getF78962g() {
            return this.f78962g;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF78963h() {
            return this.f78963h;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.AudienceSettingsListAdapter$c */
    /* JADX INFO: compiled from: AudienceSettingsListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsListAdapter$showVideoQualityDialog$1", "Lcom/trtc/uikit/livekit/component/videoquality/VideoQualitySelectPanel$OnVideoQualitySelectedListener;", "onVideoQualitySelected", "", "videoQuality", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36346c implements DialogC45191e.a {
        public C36346c() {
        }

        @Override // ud0.DialogC45191e.a
        /* JADX INFO: renamed from: a */
        public void mo80689a(VideoQuality videoQuality) {
            Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
            AudienceSettingsListAdapter.this.f78956j.getF82428j().m80783o(videoQuality);
        }
    }

    public AudienceSettingsListAdapter(@NotNull Context context, @NotNull C37144f audienceStore, @NotNull AudienceSettingsPanelDialog settingsDialog) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceStore, "audienceStore");
        Intrinsics.checkNotNullParameter(settingsDialog, "settingsDialog");
        this.f78955i = context;
        this.f78956j = audienceStore;
        this.f78957k = settingsDialog;
        this.f78958l = new ArrayList();
        m81275s();
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m81271n(final AppCompatActivity appCompatActivity, final AudienceSettingsListAdapter audienceSettingsListAdapter) {
        AudienceBlockConfirmDialog.f79153s0.show(appCompatActivity, new Function0() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudienceSettingsListAdapter.m81272o(appCompatActivity, audienceSettingsListAdapter);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m81273q(AudienceSettingsListAdapter audienceSettingsListAdapter) {
        LiveFlutterHelper.f79161a.m81518c(audienceSettingsListAdapter.f78956j.getF82419a().getLiveState().getCurrentLive().getValue().getLiveID());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    private final void m81274r() {
        this.f78957k.dismiss();
        C43852m.m96591c("B1FeedLive", "more", FirebaseAnalytics.Event.SHARE, null, 8, null);
        KCLiveShareHelper.f79190a.m81579f(this.f78955i, this.f78956j.getF82419a().getLiveState().getCurrentLive().getValue().getLiveID());
    }

    /* JADX INFO: renamed from: s */
    private final void m81275s() {
        List<SettingsItem> list = this.f78958l;
        String string = this.f78955i.getString(R$string.live_share);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(new SettingsItem(string, R$drawable.ic2_share_thin_20, 3));
        List<SettingsItem> list2 = this.f78958l;
        String string2 = this.f78955i.getString(R$string.live_report);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list2.add(new SettingsItem(string2, R$drawable.ic2_warning_20, 4));
        List<SettingsItem> list3 = this.f78958l;
        String string3 = this.f78955i.getString(R$string.platform_live_block);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        list3.add(new SettingsItem(string3, R$drawable.ic2_trade_sub_20, 5));
    }

    /* JADX INFO: renamed from: w */
    private final void m81277w() {
        this.f78957k.dismiss();
        new StreamDashboardDialog(this.f78955i, this.f78956j.getF82419a().getLiveState().getCurrentLive().getValue().getLiveID()).show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78958l.size();
    }

    /* JADX INFO: renamed from: m */
    public final void m81278m() {
        this.f78957k.dismiss();
        Context context = this.f78955i;
        final AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null) {
            return;
        }
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudienceSettingsListAdapter.m81271n(appCompatActivity, this);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: renamed from: p */
    public final void m81279p() {
        this.f78957k.dismiss();
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudienceSettingsListAdapter.m81273q(this.f78969b);
            }
        }, 1, (Object) null);
        C43852m.m96591c("B1FeedLive", "more", "complaint", null, 8, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C36345b holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getF78963h().setText(this.f78958l.get(i11).getTitle());
        holder.getF78964i().setImageResource(this.f78958l.get(i11).getIcon());
        holder.getF78962g().setTag(Integer.valueOf(this.f78958l.get(i11).getType()));
        holder.getF78962g().setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudienceSettingsListAdapter.m81276u(this.f78966b, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C36345b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.livekit_anchor_settings_panel_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new C36345b(viewInflate);
    }

    /* JADX INFO: renamed from: x */
    public final void m81282x() {
        this.f78957k.dismiss();
        new PIPTogglePanel(this.f78955i, this.f78956j.getF82419a().getLiveState().getCurrentLive().getValue().getLiveID()).show();
    }

    /* JADX INFO: renamed from: y */
    public final void m81283y() {
        this.f78957k.dismiss();
        DialogC45191e dialogC45191e = new DialogC45191e(this.f78955i, this.f78956j.m83100s().m83109c().getValue());
        dialogC45191e.setOnVideoQualitySelectedListener(new C36346c());
        dialogC45191e.show();
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m81272o(AppCompatActivity appCompatActivity, AudienceSettingsListAdapter audienceSettingsListAdapter) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(appCompatActivity), null, null, new AudienceSettingsListAdapter$handleBlock$1$1$1(audienceSettingsListAdapter, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final void m81276u(AudienceSettingsListAdapter audienceSettingsListAdapter, View view) {
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) tag).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        if (iIntValue != 4) {
                            if (iIntValue != 5) {
                                return;
                            }
                            audienceSettingsListAdapter.m81278m();
                            return;
                        }
                        audienceSettingsListAdapter.m81279p();
                        return;
                    }
                    audienceSettingsListAdapter.m81274r();
                    return;
                }
                audienceSettingsListAdapter.m81282x();
                return;
            }
            audienceSettingsListAdapter.m81283y();
            return;
        }
        audienceSettingsListAdapter.m81277w();
    }
}
