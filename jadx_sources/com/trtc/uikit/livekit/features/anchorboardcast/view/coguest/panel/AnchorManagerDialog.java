package com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import com.trtc.tuikit.common.permission.AbstractC35867d;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.features.anchorboardcast.store.MediaStore;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.C39361f;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.NotImplementedError;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vc0.C45494c;
import vc0.C45495d;
import vc0.C45497f;

/* JADX INFO: compiled from: AnchorManagerDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\b\u0004*\u0001<\u0018\u0000 >2\u00020\u0001:\u0001>B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020!H\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0010H\u0002J\u000e\u00100\u001a\u00020!H\u0082@¢\u0006\u0002\u00101J\b\u00102\u001a\u00020!H\u0002J\b\u00103\u001a\u00020!H\u0002J\b\u00104\u001a\u00020!H\u0002J\b\u00105\u001a\u00020!H\u0002J\b\u00106\u001a\u00020!H\u0002J\u000e\u00107\u001a\u00020!H\u0082@¢\u0006\u0002\u00101J\u000e\u00108\u001a\u00020!H\u0082@¢\u0006\u0002\u00101J\u000e\u00109\u001a\u00020!H\u0082@¢\u0006\u0002\u00101J\u000e\u0010:\u001a\u00020!H\u0082@¢\u0006\u0002\u00101R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0004\n\u0002\u0010=¨\u0006?"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "anchorManager", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;)V", "seatInfo", "Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;", "imageHeadView", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "userIdText", "Landroid/widget/TextView;", "userNameText", "flipCameraContainer", "Landroid/view/View;", "followContainer", "handUpContainer", "audioContainer", "videoContainer", "ivAudio", "Landroid/widget/ImageView;", "tvAudio", "ivVideo", "tvVideo", "textUnfollow", "imageFollowIcon", "confirmDialog", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "init", "", "userInfo", "onAttachedToWindow", "onDetachedFromWindow", "initView", "bindViewId", "rootView", "updateView", "updateMediaDeviceButton", "isSelfUser", "", "isAdmin", "addObserver", "removeObserver", "initFollowButtonView", "onFollowingUserChanged", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clickHangupButton", "clickMicrophoneButton", "clickCameraButton", "clickSwitchCameraButton", "startCamera", "onMicrophoneStatusChanged", "onLockAudioUserListChanged", "onCameraStatusChanged", "onConnectUserListChanged", "tuiRoomObserver", "com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$tuiRoomObserver$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$tuiRoomObserver$1;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorManagerDialog extends AtomicPopover {

    /* JADX INFO: renamed from: G */
    @NotNull
    public static final Companion f78277G = new Companion(null);

    /* JADX INFO: renamed from: H */
    @NotNull
    public static final LiveKitLogger f78278H = LiveKitLogger.f77564c.getFeaturesLogger("AnchorManagerDialog");

    /* JADX INFO: renamed from: A */
    public TextView f78279A;

    /* JADX INFO: renamed from: B */
    public TextView f78280B;

    /* JADX INFO: renamed from: C */
    public ImageView f78281C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public AtomicAlertDialog f78282D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public InterfaceC41775x1 f78283E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final C36111g f78284F;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Context f78285m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final AnchorStore f78286n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public SeatInfo f78287o;

    /* JADX INFO: renamed from: p */
    public AtomicAvatar f78288p;

    /* JADX INFO: renamed from: q */
    public TextView f78289q;

    /* JADX INFO: renamed from: r */
    public TextView f78290r;

    /* JADX INFO: renamed from: s */
    public View f78291s;

    /* JADX INFO: renamed from: t */
    public View f78292t;

    /* JADX INFO: renamed from: u */
    public View f78293u;

    /* JADX INFO: renamed from: v */
    public View f78294v;

    /* JADX INFO: renamed from: w */
    public View f78295w;

    /* JADX INFO: renamed from: x */
    public ImageView f78296x;

    /* JADX INFO: renamed from: y */
    public TextView f78297y;

    /* JADX INFO: renamed from: z */
    public ImageView f78298z;

    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "BUTTON_DISABLE_ALPHA", "", "BUTTON_ENABLE_ALPHA", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$a */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$clickMicrophoneButton$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36100a implements CompletionHandler {
        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            AnchorManagerDialog.f78278H.m79403a("unMuteMicrophone failed:code:" + code + ",desc:" + desc);
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$b */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36106b<T> implements InterfaceC41635f {
        public C36106b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(LinkedHashSet<String> linkedHashSet, Continuation<? super Unit> continuation) {
            SeatInfo seatInfo = AnchorManagerDialog.this.f78287o;
            if (seatInfo != null) {
                AnchorManagerDialog anchorManagerDialog = AnchorManagerDialog.this;
                boolean zContains = linkedHashSet.contains(seatInfo.getUserInfo().getUserID());
                View view = null;
                TextView textView = null;
                View view2 = null;
                View view3 = null;
                if (anchorManagerDialog.m80435z0()) {
                    Object[] objArr = DeviceStatus.ON == DeviceStore.INSTANCE.shared().getDeviceState().getCameraStatus().getValue();
                    if (zContains) {
                        View view4 = anchorManagerDialog.f78295w;
                        if (view4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
                            view4 = null;
                        }
                        view4.setEnabled(false);
                        ImageView imageView = anchorManagerDialog.f78298z;
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                            imageView = null;
                        }
                        imageView.setAlpha(0.24f);
                        ImageView imageView2 = anchorManagerDialog.f78298z;
                        if (imageView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                            imageView2 = null;
                        }
                        imageView2.setImageResource(R$drawable.livekit_ic_stop_video);
                        TextView textView2 = anchorManagerDialog.f78279A;
                        if (textView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvVideo");
                            textView2 = null;
                        }
                        textView2.setText(R$string.common_start_video);
                        View view5 = anchorManagerDialog.f78291s;
                        if (view5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
                        } else {
                            view2 = view5;
                        }
                        view2.setVisibility(8);
                    } else {
                        View view6 = anchorManagerDialog.f78295w;
                        if (view6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
                            view6 = null;
                        }
                        view6.setEnabled(true);
                        ImageView imageView3 = anchorManagerDialog.f78298z;
                        if (imageView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                            imageView3 = null;
                        }
                        imageView3.setAlpha(1.0f);
                        if (objArr == true) {
                            ImageView imageView4 = anchorManagerDialog.f78298z;
                            if (imageView4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                                imageView4 = null;
                            }
                            imageView4.setImageResource(R$drawable.livekit_ic_start_video);
                            TextView textView3 = anchorManagerDialog.f78279A;
                            if (textView3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("tvVideo");
                                textView3 = null;
                            }
                            textView3.setText(R$string.common_stop_video);
                            View view7 = anchorManagerDialog.f78291s;
                            if (view7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
                            } else {
                                view3 = view7;
                            }
                            view3.setVisibility(0);
                        } else {
                            ImageView imageView5 = anchorManagerDialog.f78298z;
                            if (imageView5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                                imageView5 = null;
                            }
                            imageView5.setImageResource(R$drawable.livekit_ic_stop_video);
                            TextView textView4 = anchorManagerDialog.f78279A;
                            if (textView4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("tvVideo");
                                textView4 = null;
                            }
                            textView4.setText(R$string.common_start_video);
                            View view8 = anchorManagerDialog.f78291s;
                            if (view8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
                            } else {
                                view = view8;
                            }
                            view.setVisibility(8);
                        }
                    }
                } else if (anchorManagerDialog.m80434y0()) {
                    View view9 = anchorManagerDialog.f78295w;
                    if (view9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
                        view9 = null;
                    }
                    view9.setEnabled(true);
                    ImageView imageView6 = anchorManagerDialog.f78298z;
                    if (imageView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                        imageView6 = null;
                    }
                    imageView6.setAlpha(1.0f);
                    ImageView imageView7 = anchorManagerDialog.f78298z;
                    if (imageView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivVideo");
                        imageView7 = null;
                    }
                    imageView7.setImageResource(zContains ? R$drawable.livekit_ic_disable_video : R$drawable.livekit_ic_start_video);
                    TextView textView5 = anchorManagerDialog.f78279A;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvVideo");
                    } else {
                        textView = textView5;
                    }
                    textView.setText(zContains ? R$string.common_enable_video : R$string.common_disable_video);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$c */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnchorManagerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$onConnectUserListChanged$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,514:1\n827#2:515\n855#2,2:516\n1761#2,3:518\n*S KotlinDebug\n*F\n+ 1 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$onConnectUserListChanged$2\n*L\n482#1:515\n482#1:516,2\n484#1:518,3\n*E\n"})
    public static final class C36107c<T> implements InterfaceC41635f {
        public C36107c() {
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0079  */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<SeatUserInfo> list, Continuation<? super Unit> continuation) {
            AtomicAlertDialog atomicAlertDialog;
            ArrayList arrayList = new ArrayList();
            for (T t11 : list) {
                if (Intrinsics.areEqual(((SeatUserInfo) t11).getLiveID(), LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID())) {
                    arrayList.add(t11);
                }
            }
            SeatInfo seatInfo = AnchorManagerDialog.this.f78287o;
            if (seatInfo != null) {
                AnchorManagerDialog anchorManagerDialog = AnchorManagerDialog.this;
                if (arrayList.isEmpty()) {
                    anchorManagerDialog.dismiss();
                    atomicAlertDialog = anchorManagerDialog.f78282D;
                    if (atomicAlertDialog != null) {
                        atomicAlertDialog.m88063s();
                    }
                } else {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(seatInfo.getUserInfo().getUserID(), ((SeatUserInfo) it.next()).getUserID())) {
                        }
                    }
                    anchorManagerDialog.dismiss();
                    atomicAlertDialog = anchorManagerDialog.f78282D;
                    if (atomicAlertDialog != null) {
                        atomicAlertDialog.m88063s();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$d */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36108d<T> implements InterfaceC41635f {
        public C36108d() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(LinkedHashSet<String> linkedHashSet, Continuation<? super Unit> continuation) {
            SeatInfo seatInfo = AnchorManagerDialog.this.f78287o;
            if (seatInfo != null) {
                AnchorManagerDialog anchorManagerDialog = AnchorManagerDialog.this;
                boolean zContains = linkedHashSet.contains(seatInfo.getUserInfo().getUserID());
                TextView textView = null;
                if (anchorManagerDialog.m80435z0()) {
                    if (zContains) {
                        View view = anchorManagerDialog.f78294v;
                        if (view == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
                            view = null;
                        }
                        view.setEnabled(false);
                        ImageView imageView = anchorManagerDialog.f78296x;
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                            imageView = null;
                        }
                        imageView.setAlpha(0.24f);
                        ImageView imageView2 = anchorManagerDialog.f78296x;
                        if (imageView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                            imageView2 = null;
                        }
                        imageView2.setImageResource(R$drawable.livekit_ic_mute_audio);
                        TextView textView2 = anchorManagerDialog.f78297y;
                        if (textView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                        } else {
                            textView = textView2;
                        }
                        textView.setText(R$string.common_unmute_audio);
                    } else {
                        View view2 = anchorManagerDialog.f78294v;
                        if (view2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
                            view2 = null;
                        }
                        view2.setEnabled(true);
                        ImageView imageView3 = anchorManagerDialog.f78296x;
                        if (imageView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                            imageView3 = null;
                        }
                        imageView3.setAlpha(1.0f);
                        if (DeviceStore.INSTANCE.shared().getDeviceState().getMicrophoneStatus().getValue() == DeviceStatus.OFF) {
                            ImageView imageView4 = anchorManagerDialog.f78296x;
                            if (imageView4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                                imageView4 = null;
                            }
                            imageView4.setImageResource(R$drawable.livekit_ic_mute_audio);
                            TextView textView3 = anchorManagerDialog.f78297y;
                            if (textView3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                            } else {
                                textView = textView3;
                            }
                            textView.setText(R$string.common_unmute_audio);
                        } else {
                            ImageView imageView5 = anchorManagerDialog.f78296x;
                            if (imageView5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                                imageView5 = null;
                            }
                            imageView5.setImageResource(R$drawable.livekit_ic_unmute_audio);
                            TextView textView4 = anchorManagerDialog.f78297y;
                            if (textView4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                            } else {
                                textView = textView4;
                            }
                            textView.setText(R$string.common_mute_audio);
                        }
                    }
                } else if (anchorManagerDialog.m80434y0()) {
                    View view3 = anchorManagerDialog.f78294v;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
                        view3 = null;
                    }
                    view3.setEnabled(true);
                    ImageView imageView6 = anchorManagerDialog.f78296x;
                    if (imageView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                        imageView6 = null;
                    }
                    imageView6.setAlpha(1.0f);
                    ImageView imageView7 = anchorManagerDialog.f78296x;
                    if (imageView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                        imageView7 = null;
                    }
                    imageView7.setImageResource(zContains ? R$drawable.livekit_ic_disable_audio : R$drawable.livekit_ic_unmute_audio);
                    TextView textView5 = anchorManagerDialog.f78297y;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                    } else {
                        textView = textView5;
                    }
                    textView.setText(zContains ? R$string.common_enable_audio : R$string.common_disable_audio);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$e */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36109e<T> implements InterfaceC41635f {
        public C36109e() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DeviceStatus deviceStatus, Continuation<? super Unit> continuation) {
            SeatInfo seatInfo = AnchorManagerDialog.this.f78287o;
            if (seatInfo != null) {
                AnchorManagerDialog anchorManagerDialog = AnchorManagerDialog.this;
                LinkedHashSet<String> value = anchorManagerDialog.f78286n.getF78170c().m101161b().getValue();
                TextView textView = null;
                Boolean boolBoxBoolean = value != null ? Boxing.boxBoolean(value.contains(seatInfo.getUserInfo().getUserID())) : null;
                if (anchorManagerDialog.m80435z0()) {
                    if (Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(true))) {
                        View view = anchorManagerDialog.f78294v;
                        if (view == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
                            view = null;
                        }
                        view.setEnabled(false);
                        ImageView imageView = anchorManagerDialog.f78296x;
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                            imageView = null;
                        }
                        imageView.setAlpha(0.24f);
                        ImageView imageView2 = anchorManagerDialog.f78296x;
                        if (imageView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                            imageView2 = null;
                        }
                        imageView2.setImageResource(R$drawable.livekit_ic_mute_audio);
                        TextView textView2 = anchorManagerDialog.f78297y;
                        if (textView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                        } else {
                            textView = textView2;
                        }
                        textView.setText(R$string.common_unmute_audio);
                    } else {
                        View view2 = anchorManagerDialog.f78294v;
                        if (view2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
                            view2 = null;
                        }
                        view2.setEnabled(true);
                        ImageView imageView3 = anchorManagerDialog.f78296x;
                        if (imageView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                            imageView3 = null;
                        }
                        imageView3.setAlpha(1.0f);
                        if (seatInfo.getUserInfo().getMicrophoneStatus() != DeviceStatus.ON) {
                            ImageView imageView4 = anchorManagerDialog.f78296x;
                            if (imageView4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                                imageView4 = null;
                            }
                            imageView4.setImageResource(R$drawable.livekit_ic_mute_audio);
                            TextView textView3 = anchorManagerDialog.f78297y;
                            if (textView3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                            } else {
                                textView = textView3;
                            }
                            textView.setText(R$string.common_unmute_audio);
                        } else {
                            ImageView imageView5 = anchorManagerDialog.f78296x;
                            if (imageView5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                                imageView5 = null;
                            }
                            imageView5.setImageResource(R$drawable.livekit_ic_unmute_audio);
                            TextView textView4 = anchorManagerDialog.f78297y;
                            if (textView4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                            } else {
                                textView = textView4;
                            }
                            textView.setText(R$string.common_mute_audio);
                        }
                    }
                } else if (anchorManagerDialog.m80434y0()) {
                    View view3 = anchorManagerDialog.f78294v;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
                        view3 = null;
                    }
                    view3.setEnabled(true);
                    ImageView imageView6 = anchorManagerDialog.f78296x;
                    if (imageView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                        imageView6 = null;
                    }
                    imageView6.setAlpha(1.0f);
                    ImageView imageView7 = anchorManagerDialog.f78296x;
                    if (imageView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivAudio");
                        imageView7 = null;
                    }
                    imageView7.setImageResource(Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(true)) ? R$drawable.livekit_ic_disable_audio : R$drawable.livekit_ic_unmute_audio);
                    TextView textView5 = anchorManagerDialog.f78297y;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvAudio");
                    } else {
                        textView = textView5;
                    }
                    textView.setText(Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(true)) ? R$string.common_enable_audio : R$string.common_disable_audio);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$f */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$startCamera$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onRequesting", "", "onGranted", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36110f extends AbstractC35867d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f78303a;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$f$a */
        /* JADX INFO: compiled from: AnchorManagerDialog.kt */
        @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$startCamera$1$onGranted$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements CompletionHandler {
            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                AnchorManagerDialog.f78278H.m79403a("startCamera failed:code:" + code + ",desc:" + desc);
                ErrorLocalized.f77561a.onError(code);
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                throw new NotImplementedError("An operation is not implemented: Not yet implemented");
            }
        }

        public C36110f(boolean z11) {
            this.f78303a = z11;
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() {
            AnchorManagerDialog.f78278H.m79404b("requestCameraPermissions:[onGranted]");
            DeviceStore.INSTANCE.shared().openLocalCamera(this.f78303a, new a());
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: c */
        public void mo79395c() {
            AnchorManagerDialog.f78278H.m79404b("requestCameraPermissions:[onRequesting]");
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.AnchorManagerDialog$g */
    /* JADX INFO: compiled from: AnchorManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\r"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/coguest/panel/AnchorManagerDialog$tuiRoomObserver$1", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;", "onKickedOffSeat", "", "seatIndex", "", "operateUser", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;", "extensionInfo", "", "onRemoteUserLeaveRoom", "roomId", "userInfo", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36111g extends TUIRoomObserver {
        public C36111g() {
        }

        @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
        public void onKickedOffSeat(int seatIndex, TUIRoomDefine.UserInfo operateUser, String extensionInfo) {
            Intrinsics.checkNotNullParameter(operateUser, "operateUser");
            Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
            AnchorManagerDialog.this.dismiss();
            AtomicAlertDialog atomicAlertDialog = AnchorManagerDialog.this.f78282D;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88063s();
            }
        }

        @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
        public void onRemoteUserLeaveRoom(String roomId, TUIRoomDefine.UserInfo userInfo) {
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            SeatInfo seatInfo = AnchorManagerDialog.this.f78287o;
            if (seatInfo == null || TextUtils.isEmpty(seatInfo.getUserInfo().getUserID()) || !Intrinsics.areEqual(userInfo.userId, seatInfo.getUserInfo().getUserID())) {
                return;
            }
            AnchorManagerDialog.this.dismiss();
            AtomicAlertDialog atomicAlertDialog = AnchorManagerDialog.this.f78282D;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88063s();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorManagerDialog(@NotNull Context context, @NotNull AnchorStore anchorManager) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorManager, "anchorManager");
        this.f78285m = context;
        this.f78286n = anchorManager;
        m80421x0();
        this.f78284F = new C36111g();
    }

    /* JADX INFO: renamed from: E0 */
    private final void m80381E0() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78283E;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        TUIRoomEngine.sharedInstance().removeObserver(this.f78284F);
    }

    /* JADX INFO: renamed from: H0 */
    private final void m80385H0() {
        SeatInfo seatInfo = this.f78287o;
        if (seatInfo == null || TextUtils.isEmpty(seatInfo.getUserInfo().getUserID())) {
            return;
        }
        AtomicAvatar atomicAvatar = this.f78288p;
        TextView textView = null;
        if (atomicAvatar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageHeadView");
            atomicAvatar = null;
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(seatInfo.getUserInfo().getAvatarURL(), R$drawable.livekit_ic_avatar));
        TextView textView2 = this.f78290r;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNameText");
            textView2 = null;
        }
        textView2.setText(seatInfo.getUserInfo().getUserName());
        TextView textView3 = this.f78289q;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userIdText");
        } else {
            textView = textView3;
        }
        textView.setText(this.f78285m.getString(R$string.common_user_id, seatInfo.getUserInfo().getUserID()));
        m80427G0();
    }

    /* JADX INFO: renamed from: f0 */
    private final void m80409f0(View view) {
        View viewFindViewById = view.findViewById(R$id.user_id);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78289q = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.user_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78290r = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.iv_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78288p = (AtomicAvatar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.hand_up_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78293u = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.flip_camera_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f78291s = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.fl_follow_panel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f78292t = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.iv_audio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f78296x = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R$id.audio_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f78294v = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R$id.tv_audio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f78297y = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R$id.video_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f78295w = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R$id.iv_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f78298z = (ImageView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R$id.tv_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f78279A = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R$id.tv_unfollow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f78280B = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R$id.iv_follow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f78281C = (ImageView) viewFindViewById14;
        View view2 = this.f78293u;
        View view3 = null;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handUpContainer");
            view2 = null;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                AnchorManagerDialog.m80410g0(this.f78333b, view4);
            }
        });
        View view4 = this.f78291s;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
            view4 = null;
        }
        view4.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                AnchorManagerDialog.m80411h0(this.f78334b, view5);
            }
        });
        View view5 = this.f78294v;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioContainer");
            view5 = null;
        }
        view5.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                AnchorManagerDialog.m80412i0(this.f78335b, view6);
            }
        });
        View view6 = this.f78295w;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
        } else {
            view3 = view6;
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                AnchorManagerDialog.m80413j0(this.f78336b, view7);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m80414m0(final AnchorManagerDialog anchorManagerDialog, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = anchorManagerDialog.f78285m.getString(R$string.common_terminate_room_connection_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        init.m88090o(string);
        String string2 = anchorManagerDialog.f78285m.getString(R$string.common_disconnection);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88097g(init, string2, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorManagerDialog.m80415n0(this.f78340b, (Dialog) obj);
            }
        }, 4, null);
        String string3 = anchorManagerDialog.f78285m.getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88095e(init, string3, AtomicAlertDialog.TextColorPreset.PRIMARY, false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m80415n0(AnchorManagerDialog anchorManagerDialog, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).disconnect(null);
        anchorManagerDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m80416o0(final AnchorManagerDialog anchorManagerDialog, final SeatInfo seatInfo, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = anchorManagerDialog.f78285m.getString(R$string.common_disconnect_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        init.m88090o(string);
        String string2 = anchorManagerDialog.f78285m.getString(R$string.common_disconnection);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88097g(init, string2, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorManagerDialog.m80417p0(seatInfo, anchorManagerDialog, (Dialog) obj);
            }
        }, 4, null);
        String string3 = anchorManagerDialog.f78285m.getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88095e(init, string3, AtomicAlertDialog.TextColorPreset.PRIMARY, false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m80417p0(SeatInfo seatInfo, AnchorManagerDialog anchorManagerDialog, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LiveSeatStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).kickUserOutOfSeat(seatInfo.getUserInfo().getUserID(), C45495d.m100463a(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnchorManagerDialog.m80418q0((C45494c) obj);
            }
        }));
        anchorManagerDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m80418q0(C45494c completionHandler) {
        Intrinsics.checkNotNullParameter(completionHandler, "$this$completionHandler");
        completionHandler.m100461h(new Function2() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AnchorManagerDialog.m80419r0(((Integer) obj).intValue(), (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m80419r0(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        f78278H.m79403a("disconnectUser failed:code:" + i11 + ",desc:" + desc);
        ErrorLocalized.f77561a.onError(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m80420w0(AnchorManagerDialog anchorManagerDialog, View view) {
        SeatInfo seatInfo = anchorManagerDialog.f78287o;
        if (seatInfo == null) {
            return;
        }
        if (anchorManagerDialog.f78286n.m80239p().m101186a().getValue().contains(seatInfo.getUserInfo().getUserID())) {
            anchorManagerDialog.f78286n.getF78174g().m101197k(seatInfo.getUserInfo().getUserID());
        } else {
            anchorManagerDialog.f78286n.getF78174g().m101192f(seatInfo.getUserInfo().getUserID());
        }
    }

    /* JADX INFO: renamed from: x0 */
    private final void m80421x0() {
        View viewInflate = View.inflate(this.f78285m, R$layout.livekit_anchor_manager_panel, null);
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
        m80409f0(viewInflate);
        m80433v0(viewInflate);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A0 */
    public final Object m80422A0(Continuation<? super Unit> continuation) {
        AnchorManagerDialog$onCameraStatusChanged$1 anchorManagerDialog$onCameraStatusChanged$1;
        if (continuation instanceof AnchorManagerDialog$onCameraStatusChanged$1) {
            anchorManagerDialog$onCameraStatusChanged$1 = (AnchorManagerDialog$onCameraStatusChanged$1) continuation;
            int i11 = anchorManagerDialog$onCameraStatusChanged$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorManagerDialog$onCameraStatusChanged$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorManagerDialog$onCameraStatusChanged$1 = new AnchorManagerDialog$onCameraStatusChanged$1(this, continuation);
            }
        } else {
            anchorManagerDialog$onCameraStatusChanged$1 = new AnchorManagerDialog$onCameraStatusChanged$1(this, continuation);
        }
        Object obj = anchorManagerDialog$onCameraStatusChanged$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorManagerDialog$onCameraStatusChanged$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<LinkedHashSet<String>> interfaceC41678wM101162c = this.f78286n.getF78170c().m101162c();
            C36106b c36106b = new C36106b();
            anchorManagerDialog$onCameraStatusChanged$1.label = 1;
            if (interfaceC41678wM101162c.collect(c36106b, anchorManagerDialog$onCameraStatusChanged$1) == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B0 */
    public final Object m80423B0(Continuation<? super Unit> continuation) {
        AnchorManagerDialog$onConnectUserListChanged$1 anchorManagerDialog$onConnectUserListChanged$1;
        if (continuation instanceof AnchorManagerDialog$onConnectUserListChanged$1) {
            anchorManagerDialog$onConnectUserListChanged$1 = (AnchorManagerDialog$onConnectUserListChanged$1) continuation;
            int i11 = anchorManagerDialog$onConnectUserListChanged$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorManagerDialog$onConnectUserListChanged$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorManagerDialog$onConnectUserListChanged$1 = new AnchorManagerDialog$onConnectUserListChanged$1(this, continuation);
            }
        } else {
            anchorManagerDialog$onConnectUserListChanged$1 = new AnchorManagerDialog$onConnectUserListChanged$1(this, continuation);
        }
        Object obj = anchorManagerDialog$onConnectUserListChanged$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorManagerDialog$onConnectUserListChanged$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<SeatUserInfo>> connected = CoGuestStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).getCoGuestState().getConnected();
            C36107c c36107c = new C36107c();
            anchorManagerDialog$onConnectUserListChanged$1.label = 1;
            if (connected.collect(c36107c, anchorManagerDialog$onConnectUserListChanged$1) == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C0 */
    public final Object m80424C0(Continuation<? super Unit> continuation) {
        AnchorManagerDialog$onLockAudioUserListChanged$1 anchorManagerDialog$onLockAudioUserListChanged$1;
        if (continuation instanceof AnchorManagerDialog$onLockAudioUserListChanged$1) {
            anchorManagerDialog$onLockAudioUserListChanged$1 = (AnchorManagerDialog$onLockAudioUserListChanged$1) continuation;
            int i11 = anchorManagerDialog$onLockAudioUserListChanged$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorManagerDialog$onLockAudioUserListChanged$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorManagerDialog$onLockAudioUserListChanged$1 = new AnchorManagerDialog$onLockAudioUserListChanged$1(this, continuation);
            }
        } else {
            anchorManagerDialog$onLockAudioUserListChanged$1 = new AnchorManagerDialog$onLockAudioUserListChanged$1(this, continuation);
        }
        Object obj = anchorManagerDialog$onLockAudioUserListChanged$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorManagerDialog$onLockAudioUserListChanged$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<LinkedHashSet<String>> interfaceC41678wM101161b = this.f78286n.getF78170c().m101161b();
            C36108d c36108d = new C36108d();
            anchorManagerDialog$onLockAudioUserListChanged$1.label = 1;
            if (interfaceC41678wM101161b.collect(c36108d, anchorManagerDialog$onLockAudioUserListChanged$1) == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D0 */
    public final Object m80425D0(Continuation<? super Unit> continuation) {
        AnchorManagerDialog$onMicrophoneStatusChanged$1 anchorManagerDialog$onMicrophoneStatusChanged$1;
        if (continuation instanceof AnchorManagerDialog$onMicrophoneStatusChanged$1) {
            anchorManagerDialog$onMicrophoneStatusChanged$1 = (AnchorManagerDialog$onMicrophoneStatusChanged$1) continuation;
            int i11 = anchorManagerDialog$onMicrophoneStatusChanged$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anchorManagerDialog$onMicrophoneStatusChanged$1.label = i11 - Integer.MIN_VALUE;
            } else {
                anchorManagerDialog$onMicrophoneStatusChanged$1 = new AnchorManagerDialog$onMicrophoneStatusChanged$1(this, continuation);
            }
        } else {
            anchorManagerDialog$onMicrophoneStatusChanged$1 = new AnchorManagerDialog$onMicrophoneStatusChanged$1(this, continuation);
        }
        Object obj = anchorManagerDialog$onMicrophoneStatusChanged$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anchorManagerDialog$onMicrophoneStatusChanged$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<DeviceStatus> microphoneStatus = DeviceStore.INSTANCE.shared().getDeviceState().getMicrophoneStatus();
            C36109e c36109e = new C36109e();
            anchorManagerDialog$onMicrophoneStatusChanged$1.label = 1;
            if (microphoneStatus.collect(c36109e, anchorManagerDialog$onMicrophoneStatusChanged$1) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: F0 */
    public final void m80426F0() {
        boolean zBooleanValue = DeviceStore.INSTANCE.shared().getDeviceState().isFrontCamera().getValue().booleanValue();
        C45497f c45497f = C45497f.f102528a;
        Context contextM79397b = ContextProvider.m79397b();
        Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
        c45497f.m100466a(contextM79397b, new C36110f(zBooleanValue));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m80428k0() {
        SeatInfo seatInfo = this.f78287o;
        if (seatInfo == null) {
            return;
        }
        if (!m80435z0()) {
            if (m80434y0()) {
                SeatInfo seatInfo2 = this.f78287o;
                if (seatInfo2 != null) {
                    this.f78286n.getF78175h().m80252e(seatInfo.getUserInfo().getUserID(), MediaStore.MediaDevice.CAMERA, this.f78286n.getF78170c().m101162c().getValue().contains(seatInfo2.getUserInfo().getUserID()));
                }
                dismiss();
                return;
            }
            return;
        }
        DeviceStore.Companion companion = DeviceStore.INSTANCE;
        if (companion.shared().getDeviceState().getCameraStatus().getValue() == DeviceStatus.ON) {
            companion.shared().closeLocalCamera();
            View view = this.f78291s;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
                view = null;
            }
            view.setVisibility(8);
        } else {
            m80426F0();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m80429l0() {
        final SeatInfo seatInfo = this.f78287o;
        if (seatInfo == null) {
            return;
        }
        if (this.f78282D == null) {
            this.f78282D = new AtomicAlertDialog(this.f78285m, null, 2, null);
        }
        if (m80434y0()) {
            AtomicAlertDialog atomicAlertDialog = this.f78282D;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnchorManagerDialog.m80416o0(this.f78337b, seatInfo, (AtomicAlertDialog.DialogConfig) obj);
                    }
                });
            }
            AtomicAlertDialog atomicAlertDialog2 = this.f78282D;
            if (atomicAlertDialog2 != null) {
                atomicAlertDialog2.m88054I();
                return;
            }
            return;
        }
        if (m80435z0()) {
            AtomicAlertDialog atomicAlertDialog3 = this.f78282D;
            if (atomicAlertDialog3 != null) {
                atomicAlertDialog3.m88065u(new Function1() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.n
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnchorManagerDialog.m80414m0(this.f78339b, (AtomicAlertDialog.DialogConfig) obj);
                    }
                });
            }
            AtomicAlertDialog atomicAlertDialog4 = this.f78282D;
            if (atomicAlertDialog4 != null) {
                atomicAlertDialog4.m88054I();
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m80430s0() {
        SeatInfo seatInfo = this.f78287o;
        if (seatInfo != null) {
            if (m80435z0()) {
                if (seatInfo.getUserInfo().getMicrophoneStatus() == DeviceStatus.ON) {
                    LiveSeatStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).muteMicrophone();
                } else {
                    LiveSeatStore.INSTANCE.create(LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveID()).unmuteMicrophone(new C36100a());
                }
                dismiss();
                return;
            }
            if (m80434y0()) {
                this.f78286n.getF78175h().m80252e(seatInfo.getUserInfo().getUserID(), MediaStore.MediaDevice.MICROPHONE, this.f78286n.getF78170c().m101161b().getValue().contains(seatInfo.getUserInfo().getUserID()));
                dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m80431t0() {
        DeviceStore.Companion companion = DeviceStore.INSTANCE;
        companion.shared().switchCamera(!companion.shared().getDeviceState().isFrontCamera().getValue().booleanValue());
        dismiss();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m80432u0(@NotNull SeatInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.f78287o = userInfo;
        this.f78286n.getF78174g().m101189c(userInfo.getUserInfo().getUserID());
        m80385H0();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m80433v0(View view) {
        view.findViewById(R$id.fl_follow_panel).setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.anchorboardcast.view.coguest.panel.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AnchorManagerDialog.m80420w0(this.f78332b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m80434y0() {
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        return Intrinsics.areEqual(value != null ? value.getUserID() : null, LiveListStore.INSTANCE.shared().getLiveState().getCurrentLive().getValue().getLiveOwner().getUserID());
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m80435z0() {
        SeatInfo seatInfo = this.f78287o;
        if (seatInfo == null || TextUtils.isEmpty(seatInfo.getUserInfo().getUserID())) {
            return false;
        }
        String userID = seatInfo.getUserInfo().getUserID();
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        return Intrinsics.areEqual(userID, value != null ? value.getUserID() : null);
    }

    /* JADX INFO: renamed from: e0 */
    private final void m80408e0() {
        this.f78283E = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new AnchorManagerDialog$addObserver$1(this, null), 3, null);
        TUIRoomEngine.sharedInstance().addObserver(this.f78284F);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m80410g0(AnchorManagerDialog anchorManagerDialog, View view) {
        anchorManagerDialog.m80429l0();
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m80411h0(AnchorManagerDialog anchorManagerDialog, View view) {
        anchorManagerDialog.m80431t0();
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m80412i0(AnchorManagerDialog anchorManagerDialog, View view) {
        anchorManagerDialog.m80430s0();
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m80413j0(AnchorManagerDialog anchorManagerDialog, View view) {
        anchorManagerDialog.m80428k0();
    }

    /* JADX INFO: renamed from: G0 */
    public final void m80427G0() {
        View view = null;
        if (m80435z0()) {
            View view2 = this.f78291s;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = this.f78293u;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handUpContainer");
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = this.f78292t;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("followContainer");
                view4 = null;
            }
            view4.setVisibility(8);
            View view5 = this.f78295w;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
            } else {
                view = view5;
            }
            view.setVisibility(8);
            return;
        }
        View view6 = this.f78291s;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flipCameraContainer");
            view6 = null;
        }
        view6.setVisibility(8);
        View view7 = this.f78293u;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handUpContainer");
            view7 = null;
        }
        view7.setVisibility(0);
        View view8 = this.f78292t;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("followContainer");
            view8 = null;
        }
        view8.setVisibility(8);
        View view9 = this.f78295w;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoContainer");
        } else {
            view = view9;
        }
        view.setVisibility(8);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m80408e0();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80381E0();
    }
}
