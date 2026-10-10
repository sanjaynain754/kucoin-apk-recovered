package io.trtc.tuikit.atomicxcore.api.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceFocusOwner;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.view.call.AbstractC39984a;
import io.trtc.tuikit.atomicxcore.impl.view.call.grid.C40011h;
import io.trtc.tuikit.atomicxcore.impl.view.call.p851float.C40002m;
import io.trtc.tuikit.atomicxcore.impl.view.call.pip.C40032l;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u0019\u0010\u0017J!\u0010\u001b\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u0017R\"\u0010;\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0012R.\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u00107\u001a\u0004\bA\u00109\"\u0004\bB\u0010\u0017R.\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u00107\u001a\u0004\bD\u00109\"\u0004\bE\u0010\u0017¨\u0006F"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/view/CallCoreView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/trtc/tuikit/atomicxcore/api/view/CallLayoutTemplate;", "template", "", "setLayoutTemplate", "(Lio/trtc/tuikit/atomicxcore/api/view/CallLayoutTemplate;)V", "", "path", "setWaitingAnimation", "(Ljava/lang/String;)V", "", "Lio/trtc/tuikit/atomicxcore/api/view/VolumeLevel;", "icons", "setVolumeLevelIcons", "(Ljava/util/Map;)V", "Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;", "setNetworkQualityIcons", "avatars", "setParticipantAvatars", "Lio/trtc/tuikit/atomicxcore/impl/common/r;", "logger", "Lio/trtc/tuikit/atomicxcore/impl/common/r;", "getLogger$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/common/r;", "Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;", "callFloatView", "Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;", "getCallFloatView$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;", "setCallFloatView$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;)V", "Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;", "callGridView", "Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;", "getCallGridView$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;", "setCallGridView$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/view/call/grid/h;)V", "Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;", "callPipView", "Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;", "getCallPipView$atomicxcore_release", "()Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;", "setCallPipView$atomicxcore_release", "(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;)V", "avatarsPath", "Ljava/util/Map;", "getAvatarsPath$atomicxcore_release", "()Ljava/util/Map;", "setAvatarsPath$atomicxcore_release", "waitingAnimationPath", "Ljava/lang/String;", "getWaitingAnimationPath$atomicxcore_release", "()Ljava/lang/String;", "setWaitingAnimationPath$atomicxcore_release", "volumeLevelIconPath", "getVolumeLevelIconPath$atomicxcore_release", "setVolumeLevelIconPath$atomicxcore_release", "networkQualityIconPath", "getNetworkQualityIconPath$atomicxcore_release", "setNetworkQualityIconPath$atomicxcore_release", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class CallCoreView extends ConstraintLayout {

    @NotNull
    private Map<String, String> avatarsPath;

    @Nullable
    private C40002m callFloatView;

    @Nullable
    private C40011h callGridView;

    @Nullable
    private C40032l callPipView;

    @NotNull
    private final C39510r logger;

    @NotNull
    private Map<NetworkQuality, String> networkQualityIconPath;

    @NotNull
    private Map<VolumeLevel, String> volumeLevelIconPath;

    @NotNull
    private String waitingAnimationPath;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CallCoreView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CallCoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final Map<String, String> getAvatarsPath$atomicxcore_release() {
        return this.avatarsPath;
    }

    @Nullable
    /* JADX INFO: renamed from: getCallFloatView$atomicxcore_release, reason: from getter */
    public final C40002m getCallFloatView() {
        return this.callFloatView;
    }

    @Nullable
    /* JADX INFO: renamed from: getCallGridView$atomicxcore_release, reason: from getter */
    public final C40011h getCallGridView() {
        return this.callGridView;
    }

    @Nullable
    /* JADX INFO: renamed from: getCallPipView$atomicxcore_release, reason: from getter */
    public final C40032l getCallPipView() {
        return this.callPipView;
    }

    @NotNull
    /* JADX INFO: renamed from: getLogger$atomicxcore_release, reason: from getter */
    public final C39510r getLogger() {
        return this.logger;
    }

    @NotNull
    public final Map<NetworkQuality, String> getNetworkQualityIconPath$atomicxcore_release() {
        return this.networkQualityIconPath;
    }

    @NotNull
    public final Map<VolumeLevel, String> getVolumeLevelIconPath$atomicxcore_release() {
        return this.volumeLevelIconPath;
    }

    @NotNull
    /* JADX INFO: renamed from: getWaitingAnimationPath$atomicxcore_release, reason: from getter */
    public final String getWaitingAnimationPath() {
        return this.waitingAnimationPath;
    }

    public final void setAvatarsPath$atomicxcore_release(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.avatarsPath = map;
    }

    public final void setCallFloatView$atomicxcore_release(@Nullable C40002m c40002m) {
        this.callFloatView = c40002m;
    }

    public final void setCallGridView$atomicxcore_release(@Nullable C40011h c40011h) {
        this.callGridView = c40011h;
    }

    public final void setCallPipView$atomicxcore_release(@Nullable C40032l c40032l) {
        this.callPipView = c40032l;
    }

    public final void setNetworkQualityIconPath$atomicxcore_release(@NotNull Map<NetworkQuality, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.networkQualityIconPath = map;
    }

    public final void setNetworkQualityIcons(@NotNull Map<NetworkQuality, String> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(icons, "icons");
        setNetworkQualityIconPath$atomicxcore_release(icons);
        C40032l callPipView = getCallPipView();
        if (callPipView != null) {
            callPipView.setNetworkQualityIcons(icons);
        }
        C40011h callGridView = getCallGridView();
        if (callGridView != null) {
            callGridView.setNetworkQualityIcons(icons);
        }
    }

    public final void setParticipantAvatars(@NotNull Map<String, String> avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        setAvatarsPath$atomicxcore_release(avatars);
        C40002m callFloatView = getCallFloatView();
        if (callFloatView != null) {
            callFloatView.setParticipantsAvatar(avatars);
        }
        C40011h callGridView = getCallGridView();
        if (callGridView != null) {
            callGridView.setParticipantsAvatar(avatars);
        }
        C40032l callPipView = getCallPipView();
        if (callPipView != null) {
            callPipView.setParticipantsAvatar(avatars);
        }
    }

    public final void setVolumeLevelIconPath$atomicxcore_release(@NotNull Map<VolumeLevel, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.volumeLevelIconPath = map;
    }

    public final void setVolumeLevelIcons(@NotNull Map<VolumeLevel, String> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(icons, "icons");
        setVolumeLevelIconPath$atomicxcore_release(icons);
        C40032l callPipView = getCallPipView();
        if (callPipView != null) {
            callPipView.setVolumeLevelIcons(icons);
        }
        C40011h callGridView = getCallGridView();
        if (callGridView != null) {
            callGridView.setVolumeLevelIcons(icons);
        }
    }

    public final void setWaitingAnimation(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        setWaitingAnimationPath$atomicxcore_release(path);
        C40011h callGridView = getCallGridView();
        if (callGridView != null) {
            callGridView.setWaitingAnimation(path);
        }
    }

    public final void setWaitingAnimationPath$atomicxcore_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.waitingAnimationPath = str;
    }

    public /* synthetic */ CallCoreView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void setLayoutTemplate(@NotNull CallLayoutTemplate template) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(template, "template");
        C39510r logger = getLogger();
        String message = "setLayoutTemplate layout=" + template;
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        int size = ((CallInfo) AbstractC39399b.m88230a(CallStore.INSTANCE)).getInviteeIds().size();
        if (template == CallLayoutTemplate.Float && size > 1) {
            C39510r logger2 = getLogger();
            logger2.getClass();
            Intrinsics.checkNotNullParameter("setLayoutTemplate fail. The Float layout type only supports a single invited participant.", "message");
            logger2.m88251a(2, "setLayoutTemplate fail. The Float layout type only supports a single invited participant.");
            return;
        }
        removeAllViews();
        int i11 = AbstractC39984a.f88922a[template.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                setCallPipView$atomicxcore_release(new C40032l(context));
                C40032l callPipView = getCallPipView();
                if (callPipView != null) {
                    callPipView.setParticipantsAvatar(getAvatarsPath$atomicxcore_release());
                }
                C40032l callPipView2 = getCallPipView();
                if (callPipView2 != null) {
                    callPipView2.setVolumeLevelIcons(getVolumeLevelIconPath$atomicxcore_release());
                }
                C40032l callPipView3 = getCallPipView();
                if (callPipView3 != null) {
                    callPipView3.setNetworkQualityIcons(getNetworkQualityIconPath$atomicxcore_release());
                }
                addView(getCallPipView(), layoutParams);
                return;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setCallGridView$atomicxcore_release(new C40011h(context2));
            C40011h callGridView = getCallGridView();
            if (callGridView != null) {
                callGridView.setWaitingAnimation(getWaitingAnimationPath());
            }
            C40011h callGridView2 = getCallGridView();
            if (callGridView2 != null) {
                callGridView2.setParticipantsAvatar(getAvatarsPath$atomicxcore_release());
            }
            C40011h callGridView3 = getCallGridView();
            if (callGridView3 != null) {
                callGridView3.setVolumeLevelIcons(getVolumeLevelIconPath$atomicxcore_release());
            }
            C40011h callGridView4 = getCallGridView();
            if (callGridView4 != null) {
                callGridView4.setNetworkQualityIcons(getNetworkQualityIconPath$atomicxcore_release());
            }
            addView(getCallGridView(), layoutParams);
            return;
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setCallFloatView$atomicxcore_release(new C40002m(context3));
        C40002m callFloatView = getCallFloatView();
        if (callFloatView != null) {
            callFloatView.setParticipantsAvatar(getAvatarsPath$atomicxcore_release());
        }
        addView(getCallFloatView(), layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CallCoreView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.logger = AbstractC39398a.m88229a("CallCoreView", "file", "AtomicXCore-Call", "CallCoreView");
        this.avatarsPath = MapsKt.emptyMap();
        this.waitingAnimationPath = "";
        this.volumeLevelIconPath = MapsKt.emptyMap();
        this.networkQualityIconPath = MapsKt.emptyMap();
        Intrinsics.checkNotNullParameter(this, "<this>");
        CallInfo callInfo = (CallInfo) AbstractC39399b.m88230a(CallStore.INSTANCE);
        C39510r logger = getLogger();
        String message = "init callCoreView: inviterId=" + callInfo.getInviterId() + ", inviteeIds=" + callInfo.getInviteeIds() + ", mediaType=" + callInfo.getMediaType();
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
        DeviceStore.INSTANCE.shared().setFocus$atomicxcore_release(DeviceFocusOwner.CALL);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        if (callInfo.getInviteeIds().size() > 1) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setCallGridView$atomicxcore_release(new C40011h(context2));
            addView(getCallGridView(), layoutParams);
            return;
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setCallFloatView$atomicxcore_release(new C40002m(context3));
        addView(getCallFloatView(), layoutParams);
    }
}
