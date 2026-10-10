package com.trtc.uikit.livekit.features.anchorboardcast.view.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.utils.extensions.C27025c;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.component.audioeffect.AudioEffectPanel;
import com.trtc.uikit.livekit.component.dashboard.StreamDashboardDialog;
import com.trtc.uikit.livekit.component.pippanel.PIPTogglePanel;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveEntranceConfigEntity;
import com.trtc.uikit.livekit.p180kc.helper.LiveConfigHelper;
import com.trtc.uikit.livekit.p180kc.helper.LiveFlutterHelper;
import com.trtc.uikit.livekit.p180kc.share.KCLiveShareHelper;
import fd0.C37436d;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import ud0.DialogC45189c;

/* JADX INFO: compiled from: SettingsListAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "liveStreamManager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "settingsDialog", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsPanelDialog;", "liveEntranceConfig", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsPanelDialog;Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;)V", "data", "", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;", "audioEffectDialog", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "initData", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "handleCameraFlip", "switchMirror", "showMediaDashboardDialog", "showAudioEffectPanel", "showBeautyPanel", "showPipPanel", "handleShare", "handleFuture", "handleCopyTrading", "handleWeb3", "getItemCount", "Companion", "ViewHolder", "SettingsItem", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SettingsListAdapter extends RecyclerView.Adapter<C36164a> {

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Companion f78424p = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f78425i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AnchorStore f78426j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final LiveCoreView f78427k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final SettingsPanelDialog f78428l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final LiveEntranceConfigEntity f78429m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final List<SettingsItem> f78430n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public AtomicPopover f78431o;

    /* JADX INFO: compiled from: SettingsListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$Companion;", "", "<init>", "()V", "ITEM_TYPE_BEAUTY", "", "ITEM_TYPE_AUDIO_EFFECT", "ITEM_TYPE_FLIP", "ITEM_TYPE_MIRROR", "ITEM_TYPE_DASHBOARD", "ITEM_TYPE_PIP", "ITEM_TYPE_SHARE", "ITEM_TYPE_CARD_FUTURE", "ITEM_TYPE_CARD_COPY_TRADING", "ITEM_TYPE_CARD_WEB3", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: SettingsListAdapter.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$SettingsItem;", "", "title", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "type", "<init>", "(Ljava/lang/String;II)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()I", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SettingsItem {
        private final int icon;

        @NotNull
        private final String title;
        private final int type;

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

        public static /* synthetic */ SettingsItem copy$default(SettingsItem settingsItem, String str, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = settingsItem.title;
            }
            if ((i13 & 2) != 0) {
                i11 = settingsItem.icon;
            }
            if ((i13 & 4) != 0) {
                i12 = settingsItem.type;
            }
            return settingsItem.copy(str, i11, i12);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        public final SettingsItem copy(@NotNull String title, int icon, int type) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new SettingsItem(title, icon, type);
        }

        public final int getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

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

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.settings.SettingsListAdapter$a */
    /* JADX INFO: compiled from: SettingsListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "layoutRoot", "Landroid/widget/LinearLayout;", "getLayoutRoot", "()Landroid/widget/LinearLayout;", "textTitle", "Landroid/widget/TextView;", "getTextTitle", "()Landroid/widget/TextView;", "imageIcon", "Landroid/widget/ImageView;", "getImageIcon", "()Landroid/widget/ImageView;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36164a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final LinearLayout f78432g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f78433h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final ImageView f78434i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36164a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.ll_root);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f78432g = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f78433h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.iv_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f78434i = (ImageView) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF78434i() {
            return this.f78434i;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LinearLayout getF78432g() {
            return this.f78432g;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF78433h() {
            return this.f78433h;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.settings.SettingsListAdapter$b */
    /* JADX INFO: compiled from: SettingsListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$showAudioEffectPanel$1", "Lcom/trtc/uikit/livekit/component/audioeffect/AudioEffectPanel$OnBackButtonClickListener;", "onClick", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36165b implements AudioEffectPanel.InterfaceC35877a {
        public C36165b() {
        }

        @Override // com.trtc.uikit.livekit.component.audioeffect.AudioEffectPanel.InterfaceC35877a
        /* JADX INFO: renamed from: a */
        public void mo79459a() {
            AtomicPopover atomicPopover = SettingsListAdapter.this.f78431o;
            if (atomicPopover != null) {
                atomicPopover.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.settings.SettingsListAdapter$c */
    /* JADX INFO: compiled from: SettingsListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsListAdapter$switchMirror$1", "Lcom/trtc/uikit/livekit/component/videoquality/LocalMirrorSelectPanel$OnMirrorTypeSelectedListener;", "onVideoQualitySelected", "", "mirrorType", "Lio/trtc/tuikit/atomicxcore/api/device/MirrorType;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36166c implements DialogC45189c.b {
        @Override // ud0.DialogC45189c.b
        /* JADX INFO: renamed from: a */
        public void mo80595a(MirrorType mirrorType) {
            Intrinsics.checkNotNullParameter(mirrorType, "mirrorType");
            DeviceStore.INSTANCE.shared().switchMirror(mirrorType);
        }
    }

    public SettingsListAdapter(@NotNull Context context, @NotNull AnchorStore liveStreamManager, @NotNull LiveCoreView liveCoreView, @NotNull SettingsPanelDialog settingsDialog, @Nullable LiveEntranceConfigEntity liveEntranceConfigEntity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liveStreamManager, "liveStreamManager");
        Intrinsics.checkNotNullParameter(liveCoreView, "liveCoreView");
        Intrinsics.checkNotNullParameter(settingsDialog, "settingsDialog");
        this.f78425i = context;
        this.f78426j = liveStreamManager;
        this.f78427k = liveCoreView;
        this.f78428l = settingsDialog;
        this.f78429m = liveEntranceConfigEntity;
        this.f78430n = new ArrayList();
        m80578n();
    }

    /* JADX INFO: renamed from: n */
    private final void m80578n() {
        List<SettingsItem> list = this.f78430n;
        String string = this.f78425i.getString(R$string.live_share);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(new SettingsItem(string, R$drawable.ic2_share_thin_20, 6));
        if (LiveConfigHelper.f79160a.m81515a()) {
            LiveEntranceConfigEntity liveEntranceConfigEntity = this.f78429m;
            if (C27025c.m66566d(liveEntranceConfigEntity != null ? liveEntranceConfigEntity.getFuture() : null)) {
                List<SettingsItem> list2 = this.f78430n;
                String string2 = this.f78425i.getString(R$string.live_trade_future_card);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                list2.add(new SettingsItem(string2, R$drawable.ic2_futures_thin_20, 7));
            }
        }
        LiveEntranceConfigEntity liveEntranceConfigEntity2 = this.f78429m;
        if (C27025c.m66566d(liveEntranceConfigEntity2 != null ? liveEntranceConfigEntity2.getWeb3() : null)) {
            List<SettingsItem> list3 = this.f78430n;
            String string3 = this.f78425i.getString(R$string.platform_live_web3);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            list3.add(new SettingsItem(string3, R$drawable.ic2_web3_thin_20, 9));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78430n.size();
    }

    /* JADX INFO: renamed from: i */
    public final void m80580i() {
        DeviceStore.Companion companion = DeviceStore.INSTANCE;
        companion.shared().switchCamera(!companion.shared().getDeviceState().isFrontCamera().getValue().booleanValue());
    }

    /* JADX INFO: renamed from: j */
    public final void m80581j() {
        this.f78428l.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final void m80582k() {
        this.f78428l.dismiss();
        try {
            C43852m.m96590b("B1FeedLive", "more", "futuresCard", TuplesKt.m90091to("norm_version", 1));
        } catch (Exception unused) {
        }
        String roomId = this.f78426j.getF78170c().getRoomId();
        LiveFlutterHelper.f79161a.m81516a(this.f78426j.getF78170c().getLiveInfo().getLiveOwner().getUserID(), roomId);
    }

    /* JADX INFO: renamed from: l */
    public final void m80583l() {
        this.f78428l.dismiss();
        KCLiveShareHelper.f79190a.m81579f(this.f78425i, this.f78426j.getF78170c().getRoomId());
    }

    /* JADX INFO: renamed from: m */
    public final void m80584m() {
        this.f78428l.dismiss();
        try {
            C43852m.m96590b("B1FeedLive", "more", "web3Card", TuplesKt.m90091to("norm_version", 1));
        } catch (Exception unused) {
        }
        Context context = this.f78425i;
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null) {
            C44128b.m97261e("Live", "SettingsListAdapter: load web3 card info failed - context is not activity");
            return;
        }
        String roomId = this.f78426j.getF78170c().getRoomId();
        if (StringsKt.isBlank(roomId)) {
            C44128b.m97261e("Live", "SettingsListAdapter: load web3 card info failed - roomId is blank");
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(appCompatActivity), null, null, new SettingsListAdapter$handleWeb3$2(roomId, appCompatActivity, null), 3, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C36164a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SettingsItem settingsItem = this.f78430n.get(i11);
        holder.getF78433h().setText(settingsItem.getTitle());
        holder.getF78434i().setImageResource(settingsItem.getIcon());
        holder.getF78432g().setTag(Integer.valueOf(settingsItem.getType()));
        holder.getF78432g().setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.settings.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsListAdapter.m80579p(this.f78436b, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C36164a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.livekit_anchor_settings_panel_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new C36164a(viewInflate);
    }

    /* JADX INFO: renamed from: r */
    public final void m80587r() {
        this.f78428l.dismiss();
        if (this.f78431o == null) {
            this.f78431o = new AtomicPopover(this.f78425i, null, 2, null);
            AudioEffectPanel audioEffectPanel = new AudioEffectPanel(this.f78425i, null, 0, 6, null);
            audioEffectPanel.mo79409b(this.f78426j.getF78170c().getRoomId());
            audioEffectPanel.setOnBackButtonClickListener(new C36165b());
            AtomicPopover atomicPopover = this.f78431o;
            if (atomicPopover != null) {
                atomicPopover.m88181q(audioEffectPanel);
            }
        }
        AtomicPopover atomicPopover2 = this.f78431o;
        if (atomicPopover2 != null) {
            atomicPopover2.show();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m80588s() {
        this.f78428l.dismiss();
        C37436d.m84223e(this.f78425i);
    }

    /* JADX INFO: renamed from: t */
    public final void m80589t() {
        this.f78428l.dismiss();
        new StreamDashboardDialog(this.f78425i, this.f78426j.getF78170c().getRoomId()).show();
    }

    /* JADX INFO: renamed from: u */
    public final void m80590u() {
        this.f78428l.dismiss();
        new PIPTogglePanel(this.f78425i, this.f78426j.getF78170c().getRoomId()).show();
    }

    /* JADX INFO: renamed from: v */
    public final void m80591v() {
        this.f78428l.dismiss();
        DialogC45189c dialogC45189c = new DialogC45189c(this.f78425i, CollectionsKt.listOf((Object[]) new MirrorType[]{MirrorType.AUTO, MirrorType.ENABLE, MirrorType.DISABLE}));
        dialogC45189c.setOnMirrorTypeSelectedListener(new C36166c());
        dialogC45189c.show();
    }

    /* JADX INFO: renamed from: p */
    public static final void m80579p(SettingsListAdapter settingsListAdapter, View view) {
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        switch (((Integer) tag).intValue()) {
            case 0:
                settingsListAdapter.m80588s();
                break;
            case 1:
                settingsListAdapter.m80587r();
                break;
            case 2:
                settingsListAdapter.m80580i();
                break;
            case 3:
                settingsListAdapter.m80591v();
                break;
            case 4:
                settingsListAdapter.m80589t();
                break;
            case 5:
                settingsListAdapter.m80590u();
                break;
            case 6:
                settingsListAdapter.m80583l();
                break;
            case 7:
                settingsListAdapter.m80582k();
                break;
            case 8:
                settingsListAdapter.m80581j();
                break;
            case 9:
                settingsListAdapter.m80584m();
                break;
        }
    }
}
