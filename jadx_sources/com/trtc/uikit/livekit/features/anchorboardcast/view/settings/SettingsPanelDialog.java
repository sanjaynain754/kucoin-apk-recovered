package com.trtc.uikit.livekit.features.anchorboardcast.view.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveEntranceConfigEntity;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.settings.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SettingsPanelDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsPanelDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "liveManager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "liveCoreView", "Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;", "liveEntranceConfig", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;)V", "initView", "", "initSettingsListView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class SettingsPanelDialog extends AtomicPopover {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Context f78437m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final AnchorStore f78438n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final LiveCoreView f78439o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final LiveEntranceConfigEntity f78440p;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.settings.b$a */
    /* JADX INFO: compiled from: SettingsPanelDialog.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/settings/SettingsPanelDialog$initSettingsListView$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f78441d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f78442e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f78443f;

        public a(int i11, int i12, int i13) {
            this.f78441d = i11;
            this.f78442e = i12;
            this.f78443f = i13;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int childLayoutPosition = parent.getChildLayoutPosition(view) % this.f78441d;
            int i11 = ((childLayoutPosition + 1) * this.f78442e) - (childLayoutPosition * this.f78443f);
            if (ViewCompat.getLayoutDirection(parent) == 1) {
                outRect.right = i11;
            } else {
                outRect.left = i11;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPanelDialog(@NotNull Context context, @NotNull AnchorStore liveManager, @NotNull LiveCoreView liveCoreView, @Nullable LiveEntranceConfigEntity liveEntranceConfigEntity) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liveManager, "liveManager");
        Intrinsics.checkNotNullParameter(liveCoreView, "liveCoreView");
        this.f78437m = context;
        this.f78438n = liveManager;
        this.f78439o = liveCoreView;
        this.f78440p = liveEntranceConfigEntity;
        m80596D();
    }

    /* JADX INFO: renamed from: D */
    private final void m80596D() {
        View viewInflate = LayoutInflater.from(this.f78437m).inflate(R$layout.livekit_anchor_settings_panel, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m80597C(viewInflate);
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: C */
    public final void m80597C(View view) {
        View viewFindViewById = view.findViewById(R$id.rv_settings_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        SettingsListAdapter settingsListAdapter = new SettingsListAdapter(this.f78437m, this.f78438n, this.f78439o, this, this.f78440p);
        int iCoerceIn = RangesKt.coerceIn(settingsListAdapter.getItemCount(), 1, 3);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f78437m, iCoerceIn));
        int screenWidth = ScreenUtil.getScreenWidth(this.f78437m) - (ScreenUtil.dip2px(80.0f) * iCoerceIn);
        recyclerView.addItemDecoration(new a(iCoerceIn, screenWidth / (iCoerceIn + 1), screenWidth / iCoerceIn));
        recyclerView.setAdapter(settingsListAdapter);
    }
}
