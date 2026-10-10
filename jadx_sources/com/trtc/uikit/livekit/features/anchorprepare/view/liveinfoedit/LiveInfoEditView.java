package com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.features.anchorprepare.LiveStreamPrivacyStatus;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareState;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import sc0.C44385c;

/* JADX INFO: compiled from: LiveInfoEditView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\b\u0010 \u001a\u00020\u0019H\u0014J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\u0012\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0012\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/LiveInfoEditView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "store", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;", "state", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareState;", "editRoomName", "Landroid/widget/EditText;", "textStreamPrivacyStatus", "Landroid/widget/TextView;", "imageStreamCover", "Landroid/widget/ImageView;", "liveCoverPicker", "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livecoverpicker/LiveCoverPicker;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "init", "", "initStore", CmcdData.Factory.STREAMING_FORMAT_SS, "initView", "addObserver", "removeObserver", "onAttachedToWindow", "onDetachedFromWindow", "bindViewId", "initLiveCoverPicker", "initLiveNameEditText", "initLivePrivacyStatusPicker", "onLiveCoverChange", "coverURL", "", "onLivePrivacyStatusChange", "status", "Lcom/trtc/uikit/livekit/features/anchorprepare/LiveStreamPrivacyStatus;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiveInfoEditView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public AnchorPrepareState f78511b;

    /* JADX INFO: renamed from: c */
    public TextView f78512c;

    /* JADX INFO: renamed from: d */
    public ImageView f78513d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC41775x1 f78514e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveInfoEditView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m80692c() {
        AnchorPrepareState anchorPrepareState = this.f78511b;
        if (anchorPrepareState != null) {
            this.f78514e = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new LiveInfoEditView$addObserver$1$1(anchorPrepareState, this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m80695f() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78514e;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveInfoEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public final void m80694e(LiveStreamPrivacyStatus liveStreamPrivacyStatus) {
        if (liveStreamPrivacyStatus != null) {
            TextView textView = this.f78512c;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textStreamPrivacyStatus");
                textView = null;
            }
            textView.setText(liveStreamPrivacyStatus.getResId());
        }
    }

    public /* synthetic */ LiveInfoEditView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public final void m80693d(String str) {
        Context context = getContext();
        ImageView imageView = this.f78513d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageStreamCover");
            imageView = null;
        }
        C44385c.m97893c(context, imageView, str, R$drawable.anchor_prepare_live_stream_default_cover);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m80692c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80695f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveInfoEditView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.anchor_prepare_layout_live_info_edit_view, (ViewGroup) this, true);
    }
}
