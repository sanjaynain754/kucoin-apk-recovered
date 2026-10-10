package io.trtc.tuikit.atomicxcore.impl.view.call;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.cloud.tuikit.engine.call.TUICallEngine;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.impl.call.TUICallEngineJni;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.call.CallStore;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.api.view.VolumeLevel;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.ResultKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.x */
/* JADX INFO: loaded from: classes61.dex */
public final class C40040x extends FrameLayout {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f89067q = 0;

    /* JADX INFO: renamed from: a */
    public final C39510r f89068a;

    /* JADX INFO: renamed from: b */
    public InterfaceC41775x1 f89069b;

    /* JADX INFO: renamed from: c */
    public final Context f89070c;

    /* JADX INFO: renamed from: d */
    public final C39983B f89071d;

    /* JADX INFO: renamed from: e */
    public final TUIVideoView f89072e;

    /* JADX INFO: renamed from: f */
    public final TextView f89073f;

    /* JADX INFO: renamed from: g */
    public final ImageView f89074g;

    /* JADX INFO: renamed from: h */
    public final ImageView f89075h;

    /* JADX INFO: renamed from: i */
    public final ImageView f89076i;

    /* JADX INFO: renamed from: j */
    public final ImageView f89077j;

    /* JADX INFO: renamed from: k */
    public final ImageFilterView f89078k;

    /* JADX INFO: renamed from: l */
    public final CallParticipantInfo f89079l;

    /* JADX INFO: renamed from: m */
    public boolean f89080m;

    /* JADX INFO: renamed from: n */
    public String f89081n;

    /* JADX INFO: renamed from: o */
    public Map f89082o;

    /* JADX INFO: renamed from: p */
    public Map f89083p;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m88414a(C40040x c40040x, ContinuationImpl continuationImpl) {
        C39985b c39985b;
        c40040x.getClass();
        if (continuationImpl instanceof C39985b) {
            c39985b = (C39985b) continuationImpl;
            int i11 = c39985b.f88925c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39985b.f88925c = i11 - Integer.MIN_VALUE;
            } else {
                c39985b = new C39985b(c40040x, continuationImpl);
            }
        } else {
            c39985b = new C39985b(c40040x, continuationImpl);
        }
        Object obj = c39985b.f88923a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39985b.f88925c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<DeviceStatus> cameraStatus = DeviceStore.INSTANCE.shared().getDeviceState().getCameraStatus();
            C39986c c39986c = new C39986c(c40040x);
            c39985b.f88925c = 1;
            if (cameraStatus.collect(c39986c, c39985b) == coroutine_suspended) {
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
    public static final Object m88416b(C40040x c40040x, ContinuationImpl continuationImpl) {
        C39987d c39987d;
        c40040x.getClass();
        if (continuationImpl instanceof C39987d) {
            c39987d = (C39987d) continuationImpl;
            int i11 = c39987d.f88929c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39987d.f88929c = i11 - Integer.MIN_VALUE;
            } else {
                c39987d = new C39987d(c40040x, continuationImpl);
            }
        } else {
            c39987d = new C39987d(c40040x, continuationImpl);
        }
        Object obj = c39987d.f88927a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39987d.f88929c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<DeviceStatus> microphoneStatus = DeviceStore.INSTANCE.shared().getDeviceState().getMicrophoneStatus();
            C39988e c39988e = new C39988e(c40040x);
            c39987d.f88929c = 1;
            if (microphoneStatus.collect(c39988e, c39987d) == coroutine_suspended) {
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
    public static final Object m88417c(C40040x c40040x, ContinuationImpl continuationImpl) {
        C39989f c39989f;
        c40040x.getClass();
        if (continuationImpl instanceof C39989f) {
            c39989f = (C39989f) continuationImpl;
            int i11 = c39989f.f88933c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39989f.f88933c = i11 - Integer.MIN_VALUE;
            } else {
                c39989f = new C39989f(c40040x, continuationImpl);
            }
        } else {
            c39989f = new C39989f(c40040x, continuationImpl);
        }
        Object obj = c39989f.f88931a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39989f.f88933c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<Map<String, NetworkQuality>> networkQualities = CallStore.INSTANCE.getShared().getObserverState().getNetworkQualities();
            C40003g c40003g = new C40003g(c40040x);
            c39989f.f88933c = 1;
            if (networkQualities.collect(c40003g, c39989f) == coroutine_suspended) {
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
    public C40040x(Context context, String participantId) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(participantId, "participantId");
        C39510r c39510rM88229a = AbstractC39398a.m88229a("CallParticipantView", "file", "AtomicXCore-Call", "CallParticipantView");
        this.f89068a = c39510rM88229a;
        Context applicationContext = context.getApplicationContext();
        this.f89070c = applicationContext;
        this.f89071d = new C39983B(context);
        CallParticipantInfo callParticipantInfo = new CallParticipantInfo(null, null, null, null, null, false, false, 127, null);
        this.f89079l = callParticipantInfo;
        this.f89080m = true;
        this.f89081n = "";
        this.f89082o = MapsKt.emptyMap();
        this.f89083p = MapsKt.emptyMap();
        callParticipantInfo.setId(participantId);
        String message = "init view, participantId=" + callParticipantInfo.getId();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510rM88229a.m88251a(0, message);
        ConstraintLayout constraintLayout = new ConstraintLayout(applicationContext);
        addView(constraintLayout, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(applicationContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(8);
        this.f89075h = imageView;
        constraintLayout.addView(imageView, new ConstraintLayout.LayoutParams(-1, -1));
        TUIVideoView tUIVideoView = new TUIVideoView(applicationContext);
        tUIVideoView.setVisibility(8);
        this.f89072e = tUIVideoView;
        constraintLayout.addView(tUIVideoView, new ConstraintLayout.LayoutParams(-1, -1));
        ImageFilterView imageFilterView = new ImageFilterView(applicationContext);
        imageFilterView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageFilterView.setVisibility(8);
        this.f89078k = imageFilterView;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        constraintLayout.addView(imageFilterView, layoutParams);
        ImageView imageView2 = new ImageView(applicationContext);
        imageView2.setVisibility(8);
        this.f89077j = imageView2;
        int iM88421a = m88421a(64.0f);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(iM88421a, iM88421a);
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        constraintLayout.addView(imageView2, layoutParams2);
        TextView textView = new TextView(applicationContext);
        textView.setId(View.generateViewId());
        textView.setVisibility(8);
        textView.setBackgroundColor(0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        textView.setTextSize(2, 14.0f);
        this.f89073f = textView;
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(m88421a(10.0f));
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = m88421a(8.0f);
        layoutParams3.bottomToBottom = 0;
        layoutParams3.startToStart = 0;
        constraintLayout.addView(textView, layoutParams3);
        ImageView imageView3 = new ImageView(applicationContext);
        imageView3.setId(View.generateViewId());
        imageView3.setVisibility(8);
        this.f89074g = imageView3;
        int iM88421a2 = m88421a(24.0f);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(iM88421a2, iM88421a2);
        layoutParams4.setMarginStart(m88421a(4.0f));
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = m88421a(8.0f);
        layoutParams4.bottomToBottom = 0;
        layoutParams4.startToEnd = textView.getId();
        constraintLayout.addView(imageView3, layoutParams4);
        ImageView imageView4 = new ImageView(applicationContext);
        imageView4.setVisibility(8);
        this.f89076i = imageView4;
        int iM88421a3 = m88421a(24.0f);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(iM88421a3, iM88421a3);
        layoutParams5.setMarginStart(m88421a(4.0f));
        ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = m88421a(8.0f);
        layoutParams5.bottomToBottom = 0;
        layoutParams5.startToEnd = imageView3.getId();
        constraintLayout.addView(imageView4, layoutParams5);
    }

    @NotNull
    public final String getParticipantId() {
        return this.f89079l.getId();
    }

    public final void setNetworkQualityIcons(@NotNull Map<NetworkQuality, String> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f89083p = icons;
    }

    public final void setParticipantsAvatar(@NotNull Map<String, String> avatars) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        CallParticipantInfo callParticipantInfo = this.f89079l;
        String str = avatars.get(callParticipantInfo.getId());
        if (str == null) {
            str = "";
        }
        callParticipantInfo.setAvatarUrl(str);
        m88424b();
        m88422a();
    }

    public final void setVolumeLevelIcons(@NotNull Map<VolumeLevel, String> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f89082o = icons;
    }

    public final void setWaitingAnimation(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f89081n = path;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: d */
    public static final Object m88418d(C40040x c40040x, ContinuationImpl continuationImpl) {
        C40012h c40012h;
        c40040x.getClass();
        if (continuationImpl instanceof C40012h) {
            c40012h = (C40012h) continuationImpl;
            int i11 = c40012h.f89005c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40012h.f89005c = i11 - Integer.MIN_VALUE;
            } else {
                c40012h = new C40012h(c40040x, continuationImpl);
            }
        } else {
            c40012h = new C40012h(c40040x, continuationImpl);
        }
        Object obj = c40012h.f89003a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40012h.f89005c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<LinkedHashSet<CallParticipantInfo>> allParticipants = CallStore.INSTANCE.getShared().getObserverState().getAllParticipants();
            C40013i c40013i = new C40013i(c40040x);
            c40012h.f89005c = 1;
            if (allParticipants.collect(c40013i, c40012h) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: e */
    public static final Object m88419e(C40040x c40040x, ContinuationImpl continuationImpl) {
        C40014j c40014j;
        c40040x.getClass();
        if (continuationImpl instanceof C40014j) {
            c40014j = (C40014j) continuationImpl;
            int i11 = c40014j.f89009c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40014j.f89009c = i11 - Integer.MIN_VALUE;
            } else {
                c40014j = new C40014j(c40040x, continuationImpl);
            }
        } else {
            c40014j = new C40014j(c40040x, continuationImpl);
        }
        Object obj = c40014j.f89007a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40014j.f89009c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<CallParticipantInfo> selfInfo = CallStore.INSTANCE.getShared().getObserverState().getSelfInfo();
            C40015k c40015k = new C40015k(c40040x);
            c40014j.f89009c = 1;
            if (selfInfo.collect(c40015k, c40014j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: f */
    public static final Object m88420f(C40040x c40040x, ContinuationImpl continuationImpl) {
        C40016l c40016l;
        c40040x.getClass();
        if (continuationImpl instanceof C40016l) {
            c40016l = (C40016l) continuationImpl;
            int i11 = c40016l.f89013c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40016l.f89013c = i11 - Integer.MIN_VALUE;
            } else {
                c40016l = new C40016l(c40040x, continuationImpl);
            }
        } else {
            c40016l = new C40016l(c40040x, continuationImpl);
        }
        Object obj = c40016l.f89011a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40016l.f89013c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<Map<String, Integer>> speakerVolumes = CallStore.INSTANCE.getShared().getObserverState().getSpeakerVolumes();
            C40017m c40017m = new C40017m(c40040x);
            c40016l.f89013c = 1;
            if (speakerVolumes.collect(c40017m, c40016l) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z11;
        super.onAttachedToWindow();
        String id2 = CallStore.INSTANCE.getShared().getObserverState().getSelfInfo().getValue().getId();
        if (id2.length() == 0) {
            AbstractC39465b.m88232a(this.f89068a, "Invalid login userId", "message", 2, "Invalid login userId");
        } else if (Intrinsics.areEqual(id2, this.f89079l.getId())) {
            try {
                JSONObject jSONObject = new JSONObject();
                TUIVideoView tUIVideoView = this.f89072e;
                if (tUIVideoView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("videoView");
                    tUIVideoView = null;
                }
                jSONObject.put("videoView", TUICallEngineJni.getJObjectAddress(tUIVideoView));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("api", "setLocalView");
                jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
                TUICallEngine.createInstance(this.f89070c).callExperimentalAPI(jSONObject2.toString());
            } catch (JSONException e11) {
                C39510r c39510r = this.f89068a;
                String message = "setLocalView fail, e=" + e11.getMessage();
                c39510r.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                c39510r.m88251a(2, message);
            }
            CallParticipantInfo callParticipantInfo = this.f89079l;
            DeviceStore.Companion companion = DeviceStore.INSTANCE;
            DeviceStatus value = companion.shared().getDeviceState().getCameraStatus().getValue();
            DeviceStatus deviceStatus = DeviceStatus.ON;
            boolean z12 = true;
            if (value == deviceStatus) {
                z11 = true;
            } else {
                z11 = false;
            }
            callParticipantInfo.setCameraOpened(z11);
            CallParticipantInfo callParticipantInfo2 = this.f89079l;
            if (companion.shared().getDeviceState().getMicrophoneStatus().getValue() != deviceStatus) {
                z12 = false;
            }
            callParticipantInfo2.setMicrophoneOpened(z12);
            C39510r c39510r2 = this.f89068a;
            String message2 = "isCameraOpened = " + this.f89079l.isCameraOpened();
            c39510r2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            c39510r2.m88251a(0, message2);
            m88425c();
        } else {
            TUICallEngine tUICallEngineCreateInstance = TUICallEngine.createInstance(this.f89070c);
            String id3 = this.f89079l.getId();
            TUIVideoView tUIVideoView2 = this.f89072e;
            if (tUIVideoView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
                tUIVideoView2 = null;
            }
            tUICallEngineCreateInstance.startRemoteView(id3, tUIVideoView2, new C40039w(this));
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f89079l.getId());
        V2TIMManager.getFriendshipManager().getFriendsInfo(arrayList, new C40038v(objectRef, this));
        this.f89069b = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new C40037u(this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41775x1 interfaceC41775x1 = this.f89069b;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88415a(C40040x c40040x, int i11) {
        VolumeLevel volumeLevel;
        c40040x.getClass();
        ImageView imageView = null;
        CallParticipantInfo callParticipantInfoCopy$default = CallParticipantInfo.copy$default(CallStore.INSTANCE.getShared().getObserverState().getSelfInfo().getValue(), null, null, null, null, null, false, false, 127, null);
        if (!c40040x.f89079l.isMicrophoneOpened() && Intrinsics.areEqual(c40040x.f89079l.getId(), callParticipantInfoCopy$default.getId())) {
            String str = (String) c40040x.f89082o.get(VolumeLevel.Mute);
            if (str != null) {
                C39983B c39983b = c40040x.f89071d;
                ImageView imageView2 = c40040x.f89074g;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageAudioInput");
                    imageView2 = null;
                }
                c39983b.m88383a(imageView2, str);
                ImageView imageView3 = c40040x.f89074g;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageAudioInput");
                } else {
                    imageView = imageView3;
                }
                imageView.setVisibility(0);
                return;
            }
            ImageView imageView4 = c40040x.f89074g;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageAudioInput");
            } else {
                imageView = imageView4;
            }
            imageView.setVisibility(8);
            return;
        }
        if (i11 > 10) {
            Map map = c40040x.f89082o;
            if (i11 > 75) {
                volumeLevel = VolumeLevel.Peak;
            } else if (i11 > 50) {
                volumeLevel = VolumeLevel.High;
            } else if (i11 > 25) {
                volumeLevel = VolumeLevel.Medium;
            } else {
                volumeLevel = VolumeLevel.Low;
            }
            String str2 = (String) map.get(volumeLevel);
            if (str2 != null && str2.length() != 0) {
                C39983B c39983b2 = c40040x.f89071d;
                ImageView imageView5 = c40040x.f89074g;
                if (imageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageAudioInput");
                    imageView5 = null;
                }
                c39983b2.m88383a(imageView5, str2);
                ImageView imageView6 = c40040x.f89074g;
                if (imageView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageAudioInput");
                } else {
                    imageView = imageView6;
                }
                imageView.setVisibility(0);
                return;
            }
            ImageView imageView7 = c40040x.f89074g;
            if (imageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageAudioInput");
            } else {
                imageView = imageView7;
            }
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView8 = c40040x.f89074g;
        if (imageView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAudioInput");
        } else {
            imageView = imageView8;
        }
        imageView.setVisibility(8);
    }

    /* JADX INFO: renamed from: b */
    public final void m88424b() {
        if (!this.f89079l.isCameraOpened() && this.f89080m) {
            if (this.f89079l.getAvatarUrl().length() > 0) {
                this.f89071d.m88383a(this.f89078k, this.f89079l.getAvatarUrl());
            }
            ImageFilterView imageFilterView = this.f89078k;
            if (imageFilterView == null) {
                return;
            }
            imageFilterView.setVisibility(0);
            return;
        }
        ImageFilterView imageFilterView2 = this.f89078k;
        if (imageFilterView2 == null) {
            return;
        }
        imageFilterView2.setVisibility(8);
    }

    /* JADX INFO: renamed from: c */
    public final void m88425c() {
        ImageView imageView;
        TUIVideoView tUIVideoView = null;
        if (this.f89079l.isCameraOpened()) {
            TUIVideoView tUIVideoView2 = this.f89072e;
            if (tUIVideoView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
            } else {
                tUIVideoView = tUIVideoView2;
            }
            tUIVideoView.setVisibility(0);
        } else {
            TUIVideoView tUIVideoView3 = this.f89072e;
            if (tUIVideoView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoView");
            } else {
                tUIVideoView = tUIVideoView3;
            }
            tUIVideoView.setVisibility(8);
        }
        m88424b();
        m88422a();
        if (Intrinsics.areEqual(CallStore.INSTANCE.getShared().getObserverState().getSelfInfo().getValue().getId(), this.f89079l.getId())) {
            return;
        }
        if (this.f89079l.getStatus() == CallParticipantStatus.Waiting && (imageView = this.f89077j) != null) {
            this.f89071d.m88383a(imageView, this.f89081n);
            ImageView imageView2 = this.f89077j;
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(0);
            return;
        }
        ImageView imageView3 = this.f89077j;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public final void m88422a() {
        ImageView imageView = null;
        if (this.f89079l.isCameraOpened()) {
            ImageView imageView2 = this.f89075h;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f89075h;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
            imageView3 = null;
        }
        imageView3.setVisibility(0);
        if (this.f89079l.getAvatarUrl().length() > 0) {
            C39983B c39983b = this.f89071d;
            ImageView imageView4 = this.f89075h;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
            } else {
                imageView = imageView4;
            }
            c39983b.m88384a(imageView, this.f89079l.getAvatarUrl(), 25);
            return;
        }
        ImageView imageView5 = this.f89075h;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageBackground");
        } else {
            imageView = imageView5;
        }
        imageView.setColorFilter(-2145245650);
    }

    /* JADX INFO: renamed from: a */
    public final int m88421a(float f11) {
        return (int) ((f11 * this.f89070c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public final void m88423a(boolean z11, int i11, int i12, float f11) {
        this.f89080m = z11;
        ImageFilterView imageFilterView = this.f89078k;
        ViewGroup.LayoutParams layoutParams = imageFilterView != null ? imageFilterView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i11;
        }
        if (layoutParams != null) {
            layoutParams.height = i12;
        }
        ImageFilterView imageFilterView2 = this.f89078k;
        if (imageFilterView2 != null) {
            imageFilterView2.setRound(f11);
        }
        ImageFilterView imageFilterView3 = this.f89078k;
        if (imageFilterView3 != null) {
            imageFilterView3.setLayoutParams(layoutParams);
        }
        m88424b();
    }
}
