package io.trtc.tuikit.atomicxcore.impl.view.call.pip;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39399b;
import io.trtc.tuikit.atomicxcore.api.view.VolumeLevel;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.view.call.C40040x;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.pip.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C40032l extends ConstraintLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f89043k = 0;

    /* JADX INFO: renamed from: a */
    public final C39510r f89044a;

    /* JADX INFO: renamed from: b */
    public final Context f89045b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41775x1 f89046c;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f89047d;

    /* JADX INFO: renamed from: e */
    public final TextView f89048e;

    /* JADX INFO: renamed from: f */
    public String f89049f;

    /* JADX INFO: renamed from: g */
    public C40040x f89050g;

    /* JADX INFO: renamed from: h */
    public Map f89051h;

    /* JADX INFO: renamed from: i */
    public Map f89052i;

    /* JADX INFO: renamed from: j */
    public Map f89053j;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88407a(C40032l c40032l, ContinuationImpl continuationImpl) {
        C40021a c40021a;
        c40032l.getClass();
        if (continuationImpl instanceof C40021a) {
            c40021a = (C40021a) continuationImpl;
            int i11 = c40021a.f89023c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40021a.f89023c = i11 - Integer.MIN_VALUE;
            } else {
                c40021a = new C40021a(c40032l, continuationImpl);
            }
        } else {
            c40021a = new C40021a(c40032l, continuationImpl);
        }
        Object obj = c40021a.f89021a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40021a.f89023c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<CallInfo> activeCall = CallStore.INSTANCE.getShared().getObserverState().getActiveCall();
            C40022b c40022b = new C40022b(c40032l);
            c40021a.f89023c = 1;
            if (activeCall.collect(c40022b, c40021a) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m88408b(C40032l c40032l, ContinuationImpl continuationImpl) {
        C40023c c40023c;
        c40032l.getClass();
        if (continuationImpl instanceof C40023c) {
            c40023c = (C40023c) continuationImpl;
            int i11 = c40023c.f89027c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40023c.f89027c = i11 - Integer.MIN_VALUE;
            } else {
                c40023c = new C40023c(c40032l, continuationImpl);
            }
        } else {
            c40023c = new C40023c(c40032l, continuationImpl);
        }
        Object obj = c40023c.f89025a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40023c.f89027c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<CallParticipantInfo> selfInfo = CallStore.INSTANCE.getShared().getObserverState().getSelfInfo();
            C40024d c40024d = new C40024d(c40032l);
            c40023c.f89027c = 1;
            if (selfInfo.collect(c40024d, c40023c) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m88409c(C40032l c40032l, ContinuationImpl continuationImpl) {
        C40025e c40025e;
        c40032l.getClass();
        if (continuationImpl instanceof C40025e) {
            c40025e = (C40025e) continuationImpl;
            int i11 = c40025e.f89031c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40025e.f89031c = i11 - Integer.MIN_VALUE;
            } else {
                c40025e = new C40025e(c40032l, continuationImpl);
            }
        } else {
            c40025e = new C40025e(c40032l, continuationImpl);
        }
        Object obj = c40025e.f89029a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40025e.f89031c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<Map<String, Integer>> speakerVolumes = CallStore.INSTANCE.getShared().getObserverState().getSpeakerVolumes();
            C40026f c40026f = new C40026f(c40032l);
            c40025e.f89031c = 1;
            if (speakerVolumes.collect(c40026f, c40025e) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40032l(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f89044a = AbstractC39398a.m88229a("CallPipView", "file", "AtomicXCore-Call", "CallPipView");
        Context applicationContext = context.getApplicationContext();
        this.f89045b = applicationContext;
        this.f89049f = "";
        this.f89051h = MapsKt.emptyMap();
        this.f89052i = MapsKt.emptyMap();
        this.f89053j = MapsKt.emptyMap();
        ConstraintLayout constraintLayout = new ConstraintLayout(applicationContext);
        constraintLayout.setBackgroundColor(0);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        addView(constraintLayout, layoutParams);
        FrameLayout frameLayout = new FrameLayout(applicationContext);
        this.f89047d = frameLayout;
        constraintLayout.addView(frameLayout, new ConstraintLayout.LayoutParams(-1, -1));
        TextView textView = new TextView(applicationContext);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTextSize(2, 12.0f);
        this.f89048e = textView;
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) ((applicationContext.getResources().getDisplayMetrics().density * 6.0f) + 0.5f);
        layoutParams2.bottomToBottom = 0;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        constraintLayout.addView(textView, layoutParams2);
    }

    /* JADX INFO: renamed from: d */
    public final void m88413d() {
        CallStore.Companion companion = CallStore.INSTANCE;
        CallParticipantInfo callParticipantInfoCopy$default = CallParticipantInfo.copy$default(companion.getShared().getObserverState().getSelfInfo().getValue(), null, null, null, null, null, false, false, 127, null);
        C39510r c39510r = this.f89044a;
        String message = "updateView self status=" + callParticipantInfoCopy$default.getStatus();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (callParticipantInfoCopy$default.getStatus() == CallParticipantStatus.None) {
            return;
        }
        TextView textView = this.f89048e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textCallDuration");
            textView = null;
        }
        CallParticipantStatus status = callParticipantInfoCopy$default.getStatus();
        CallParticipantStatus callParticipantStatus = CallParticipantStatus.Waiting;
        textView.setVisibility(status == callParticipantStatus ? 8 : 0);
        int size = companion.getShared().getObserverState().getActiveCall().getValue().getInviteeIds().size();
        String chatGroupId = ((CallInfo) AbstractC39399b.m88230a(companion)).getChatGroupId();
        if (size > 1 || chatGroupId.length() > 0) {
            CallParticipantInfo value = companion.getShared().getObserverState().getSelfInfo().getValue();
            if (Intrinsics.areEqual(this.f89049f, "")) {
                this.f89049f = value.getId();
                m88411b();
            }
            for (Map.Entry<String, Integer> entry : companion.getShared().getObserverState().getSpeakerVolumes().getValue().entrySet()) {
                String key = entry.getKey();
                if (entry.getValue().intValue() > 10) {
                    if (Intrinsics.areEqual(key, this.f89049f)) {
                        return;
                    }
                    this.f89049f = key;
                    m88411b();
                    return;
                }
            }
            return;
        }
        CallParticipantInfo value2 = companion.getShared().getObserverState().getSelfInfo().getValue();
        LinkedHashSet<String> inviteeIds = ((CallInfo) AbstractC39399b.m88230a(companion)).getInviteeIds();
        CallMediaType mediaType = ((CallInfo) AbstractC39399b.m88230a(companion)).getMediaType();
        if (inviteeIds.size() == 0) {
            AbstractC39465b.m88232a(this.f89044a, "inviteeIds is empty", "message", 2, "inviteeIds is empty");
            return;
        }
        String inviterId = ((CallInfo) AbstractC39399b.m88230a(companion)).getInviterId();
        String str = (String) CollectionsKt.first(((CallInfo) AbstractC39399b.m88230a(companion)).getInviteeIds());
        if (!Intrinsics.areEqual(value2.getId(), str)) {
            inviterId = str;
        }
        if (value2.getStatus() == CallParticipantStatus.Accept) {
            this.f89049f = inviterId;
            m88411b();
        } else if (value2.getStatus() == callParticipantStatus) {
            if (mediaType == CallMediaType.Video) {
                inviterId = value2.getId();
            }
            this.f89049f = inviterId;
            m88411b();
        }
    }

    public final void setNetworkQualityIcons(@NotNull Map<NetworkQuality, String> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f89053j = icons;
        C40040x c40040x = this.f89050g;
        if (c40040x != null) {
            c40040x.setNetworkQualityIcons(icons);
        }
    }

    public final void setParticipantsAvatar(@NotNull Map<String, String> avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.f89051h = avatars;
        C40040x c40040x = this.f89050g;
        if (c40040x != null) {
            c40040x.setParticipantsAvatar(avatars);
        }
    }

    public final void setVolumeLevelIcons(@NotNull Map<VolumeLevel, String> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f89052i = icons;
        C40040x c40040x = this.f89050g;
        if (c40040x != null) {
            c40040x.setVolumeLevelIcons(icons);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m88413d();
        m88412c();
        this.f89046c = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40031k(this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f89046c;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        m88410a();
    }

    /* JADX INFO: renamed from: a */
    public final void m88410a() {
        C40040x c40040x = this.f89050g;
        if (c40040x != null) {
            if (c40040x.getParent() != null) {
                ViewParent parent = c40040x.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(c40040x);
                }
            }
            c40040x.removeAllViews();
        }
        FrameLayout frameLayout = this.f89047d;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        this.f89050g = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m88411b() {
        C39510r c39510r = this.f89044a;
        String message = "show video, userId=" + this.f89049f;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        String str = this.f89049f;
        C40040x c40040x = this.f89050g;
        FrameLayout frameLayout = null;
        if (Intrinsics.areEqual(str, c40040x != null ? c40040x.getParticipantId() : null)) {
            return;
        }
        m88410a();
        Context context = this.f89045b;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C40040x c40040x2 = new C40040x(context, this.f89049f);
        this.f89050g = c40040x2;
        c40040x2.m88423a(true, (int) ((this.f89045b.getResources().getDisplayMetrics().density * 80.0f) + 0.5f), (int) ((this.f89045b.getResources().getDisplayMetrics().density * 80.0f) + 0.5f), 12.0f);
        C40040x c40040x3 = this.f89050g;
        if (c40040x3 != null) {
            c40040x3.setParticipantsAvatar(this.f89051h);
        }
        C40040x c40040x4 = this.f89050g;
        if (c40040x4 != null) {
            c40040x4.setNetworkQualityIcons(this.f89053j);
        }
        C40040x c40040x5 = this.f89050g;
        if (c40040x5 != null) {
            c40040x5.setVolumeLevelIcons(this.f89052i);
        }
        FrameLayout frameLayout2 = this.f89047d;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
            frameLayout2 = null;
        }
        frameLayout2.addView(this.f89050g);
        FrameLayout frameLayout3 = this.f89047d;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(0);
    }

    /* JADX INFO: renamed from: c */
    public final void m88412c() {
        String strValueOf;
        String str;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        String strValueOf5;
        String strValueOf6;
        CallStore.Companion companion = CallStore.INSTANCE;
        CallParticipantStatus status = companion.getShared().getObserverState().getSelfInfo().getValue().getStatus();
        long duration = ((CallInfo) AbstractC39399b.m88230a(companion)).getDuration();
        if (status == CallParticipantStatus.Accept) {
            TextView textView = this.f89048e;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textCallDuration");
                textView = null;
            }
            int i11 = (int) duration;
            int i12 = i11 % 60;
            int i13 = i11 / 60;
            if (i13 > 0) {
                int i14 = i13 % 60;
                int i15 = i13 / 60;
                if (i15 > 0) {
                    if (i15 >= 10) {
                        strValueOf4 = String.valueOf(i15);
                    } else {
                        strValueOf4 = "0" + i15;
                    }
                    if (i14 >= 10) {
                        strValueOf5 = String.valueOf(i14);
                    } else {
                        strValueOf5 = "0" + i14;
                    }
                    if (i12 >= 10) {
                        strValueOf6 = String.valueOf(i12);
                    } else {
                        strValueOf6 = "0" + i12;
                    }
                    str = strValueOf4 + ':' + strValueOf5 + ':' + strValueOf6;
                } else {
                    if (i14 >= 10) {
                        strValueOf2 = String.valueOf(i14);
                    } else {
                        strValueOf2 = "0" + i14;
                    }
                    if (i12 >= 10) {
                        strValueOf3 = String.valueOf(i12);
                    } else {
                        strValueOf3 = "0" + i12;
                    }
                    str = strValueOf2 + ':' + strValueOf3;
                }
            } else {
                if (i12 >= 10) {
                    strValueOf = String.valueOf(i12);
                } else {
                    strValueOf = "0" + i12;
                }
                str = "00:" + strValueOf;
            }
            textView.setText(str);
        }
    }
}
