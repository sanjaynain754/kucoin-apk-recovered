package com.trtc.uikit.livekit.features.audiencecontainer.view.settings;

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
import ee0.C37144f;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AudienceSettingsPanelDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsPanelDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "context", "Landroid/content/Context;", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;)V", "initView", "", "initSettingsListView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onAttachedToWindow", "onDetachedFromWindow", "onRoomDismissed", "roomId", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class AudienceSettingsPanelDialog extends AtomicPopover implements C37144f.a {

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Context f78972m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final C37144f f78973n;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.settings.e$a */
    /* JADX INFO: compiled from: AudienceSettingsPanelDialog.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/settings/AudienceSettingsPanelDialog$initSettingsListView$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f78974d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f78975e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f78976f;

        public a(int i11, int i12, int i13) {
            this.f78974d = i11;
            this.f78975e = i12;
            this.f78976f = i13;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int childLayoutPosition = parent.getChildLayoutPosition(view) % this.f78974d;
            if (ViewCompat.getLayoutDirection(parent) == 1) {
                outRect.right = ((childLayoutPosition + 1) * this.f78975e) - (childLayoutPosition * this.f78976f);
            } else {
                outRect.left = ((childLayoutPosition + 1) * this.f78975e) - (childLayoutPosition * this.f78976f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceSettingsPanelDialog(@NotNull Context context, @NotNull C37144f audienceStore) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceStore, "audienceStore");
        this.f78972m = context;
        this.f78973n = audienceStore;
        m81291D();
    }

    /* JADX INFO: renamed from: C */
    private final void m81290C(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.rv_settings_list);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f78972m, 3));
        int screenWidth = ScreenUtil.getScreenWidth(this.f78972m) - (ScreenUtil.dip2px(80.0f) * 3);
        recyclerView.addItemDecoration(new a(3, screenWidth / 4, screenWidth / 3));
        recyclerView.setAdapter(new AudienceSettingsListAdapter(this.f78972m, this.f78973n, this));
    }

    /* JADX INFO: renamed from: D */
    private final void m81291D() {
        View viewInflate = LayoutInflater.from(this.f78972m).inflate(R$layout.livekit_audience_settings_panel, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m81290C(viewInflate);
        m88181q(viewInflate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f78973n.m83081B(this);
        super.onDetachedFromWindow();
    }

    @Override // ee0.C37144f.a
    public void onRoomDismissed(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78973n.m83085d(this);
    }
}
