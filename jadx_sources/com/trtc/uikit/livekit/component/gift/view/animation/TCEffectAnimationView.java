package com.trtc.uikit.livekit.component.gift.view.animation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUIService;
import com.tencent.qcloud.tuicore.interfaces.TUIExtensionInfo;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import vc0.C45496e;

/* JADX INFO: compiled from: TCEffectAnimationView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView;", "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mEffectAnimView", "Landroid/view/View;", "mEffectPlayerService", "Lcom/tencent/qcloud/tuicore/interfaces/ITUIService;", "mServiceCallback", "Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;", "createAnimationView", "playAnimation", "", "playUrl", "", "stopPlay", "reportData", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TCEffectAnimationView extends AnimationView {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f77816g = new Companion(null);

    /* JADX INFO: renamed from: d */
    @Nullable
    public final View f77817d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ITUIService f77818e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final TUIServiceCallback f77819f;

    /* JADX INFO: compiled from: TCEffectAnimationView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView$Companion;", "", "<init>", "()V", "TAG", "", "KEY_EXTENSION_NAME", "KEY_SERVICE_NAME", "KEY_GET_VIEW", "KEY_METHOD_START_PLAY", "KEY_METHOD_STOP_PLAY", "KEY_PARAM_PLAY_URL", "KEY_PARAM_CONTEXT", "KEY_PARAM_VIEW", "KEY_PARAM_CLEAR_LAST_FRAME", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.view.animation.TCEffectAnimationView$a */
    /* JADX INFO: compiled from: TCEffectAnimationView.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/animation/TCEffectAnimationView$mServiceCallback$1", "Lcom/tencent/qcloud/tuicore/interfaces/TUIServiceCallback;", "onServiceCallback", "", "errorCode", "", "errorMessage", "", "bundle", "Landroid/os/Bundle;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35931a extends TUIServiceCallback {
        public C35931a() {
        }

        @Override // com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback
        public void onServiceCallback(int errorCode, String errorMessage, Bundle bundle) {
            AnimationView.InterfaceC35926a f77795b = TCEffectAnimationView.this.getF77795b();
            if (f77795b != null) {
                f77795b.mo79658a(errorCode);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public TCEffectAnimationView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TCEffectAnimationView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.trtc.uikit.livekit.component.gift.view.animation.AnimationView
    /* JADX INFO: renamed from: d */
    public void mo79684d(@NotNull String playUrl) {
        Intrinsics.checkNotNullParameter(playUrl, "playUrl");
        View view = this.f77817d;
        if (view != null) {
            view.setVisibility(0);
        }
        HashMap map = new HashMap();
        map.put("playUrl", playUrl);
        map.put(TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, this.f77817d);
        ITUIService iTUIService = this.f77818e;
        if (iTUIService != null) {
            iTUIService.onCall("startPlay", map, this.f77819f);
        }
        m79711g();
    }

    @Override // com.trtc.uikit.livekit.component.gift.view.animation.AnimationView
    /* JADX INFO: renamed from: e */
    public void mo79685e() {
        HashMap map = new HashMap();
        map.put("clearLastFrame", Boolean.TRUE);
        map.put(TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, this.f77817d);
        ITUIService iTUIService = this.f77818e;
        if (iTUIService != null) {
            iTUIService.onCall("stopPlay", map, this.f77819f);
        }
    }

    /* JADX INFO: renamed from: f */
    public final View m79712f() {
        Map<String, Object> data;
        HashMap map = new HashMap();
        map.put("context", getContext());
        map.put("TCEffectAnimView", "");
        List<TUIExtensionInfo> extensionList = TUICore.getExtensionList("TUIEffectPlayerExtension", map);
        if (!extensionList.isEmpty() && (data = extensionList.get(0).getData()) != null && data.containsKey("TCEffectAnimView")) {
            return (View) data.get("TCEffectAnimView");
        }
        Log.w("EffectAnimationView", "TUIEffectPlayerExtension create view failed!");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TCEffectAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77819f = new C35931a();
        View viewM79712f = m79712f();
        this.f77817d = viewM79712f;
        if (viewM79712f != null) {
            this.f77818e = TUICore.getService("TUIEffectPlayerService");
            addView(viewM79712f, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.f77818e = null;
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m79711g() {
        int i11;
        boolean z11 = false;
        if (!TextUtils.isEmpty(getF77796c()) && StringsKt.startsWith$default(getF77796c(), "voice_", false, 2, (Object) null)) {
            z11 = true;
        }
        if (z11) {
            i11 = 191024;
        } else {
            i11 = 190024;
        }
        C45496e.m100464a(i11);
    }
}
