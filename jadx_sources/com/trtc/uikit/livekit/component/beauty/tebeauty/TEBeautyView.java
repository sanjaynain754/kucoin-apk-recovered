package com.trtc.uikit.livekit.component.beauty.tebeauty;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TEBeautyView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0003*\u0001\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "init", "unInit", "beautyListener", "com/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyView$beautyListener$1", "Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyView$beautyListener$1;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TEBeautyView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C35903a f77694b;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyView$a */
    /* JADX INFO: compiled from: TEBeautyView.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyView$beautyListener$1", "Lcom/trtc/uikit/livekit/component/beauty/tebeauty/TEBeautyManager$OnBeautyListener;", "onCreateBeautyView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onDestroyBeautyView", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35903a implements TEBeautyManager.a {
        public C35903a() {
        }

        @Override // com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyManager.a
        /* JADX INFO: renamed from: a */
        public void mo79575a() {
            TEBeautyView.this.removeAllViews();
        }

        @Override // com.trtc.uikit.livekit.component.beauty.tebeauty.TEBeautyManager.a
        /* JADX INFO: renamed from: b */
        public void mo79576b(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            TEBeautyView tEBeautyView = TEBeautyView.this;
            tEBeautyView.removeAllViews();
            tEBeautyView.addView(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TEBeautyView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77694b = new C35903a();
    }

    /* JADX INFO: renamed from: a */
    public final void m79573a() {
        TEBeautyManager tEBeautyManager = TEBeautyManager.f77696a;
        tEBeautyManager.setListener(this.f77694b);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tEBeautyManager.m79592p(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m79574b() {
        TEBeautyManager.f77696a.setListener(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m79573a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79574b();
    }
}
