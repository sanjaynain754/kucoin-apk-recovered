package com.trtc.uikit.livekit.component.gift;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.common.p179ui.BasicView;
import com.trtc.uikit.livekit.component.gift.view.animation.AnimationView;
import com.trtc.uikit.livekit.component.gift.view.animation.ImageAnimationView;
import com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer;
import com.trtc.uikit.livekit.component.gift.view.animation.manager.GiftAnimationManager;
import com.trtc.uikit.livekit.component.gift.view.like.GiftHeartLayout;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.gift.GiftListener;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import io.trtc.tuikit.atomicxcore.api.live.LikeListener;
import io.trtc.tuikit.atomicxcore.api.live.LikeStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.Locale;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import pd0.C43444a;

/* JADX INFO: compiled from: GiftPlayView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 >2\u00020\u0001:\u0004;<=>B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\"H\u0014J\b\u0010&\u001a\u00020\"H\u0014J\b\u0010'\u001a\u00020\"H\u0014J\b\u0010(\u001a\u00020\"H\u0002J\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\b\u0010+\u001a\u00020\"H\u0014J\u000e\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020$J\u0010\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u0013J \u00100\u001a\u00020\"2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020\"H\u0002J\b\u00107\u001a\u00020\"H\u0002J\u0010\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0007H\u0002J\b\u0010:\u001a\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00060\u001eR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;", "Lcom/trtc/uikit/livekit/common/ui/BasicView;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "imageAnimationView", "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView;", "animationView", "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView;", "heartLayout", "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartLayout;", "giftPlayViewListener", "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$TUIGiftPlayViewListener;", "giftStore", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;", "likeStore", "Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;", "giftAnimationManager", "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/GiftAnimationManager;", "giftImageAnimationManager", "likeListenerImpl", "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$LikeListenerImpl;", "giftListenerImpl", "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$GiftListenerImpl;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "init", "", "roomId", "", "initStore", "addObserver", "removeObserver", "initView", "initAnimationPlayer", "initImageAnimationPlayer", "onDetachedFromWindow", "playGiftAnimation", "playUrl", "setListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "playGift", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "giftCount", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "playLike", "playLikeFromSelf", "playLikeFromOther", "count", "getLanguage", "TUIGiftPlayViewListener", "GiftListenerImpl", "LikeListenerImpl", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nGiftPlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPlayView.kt\ncom/trtc/uikit/livekit/component/gift/GiftPlayView\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,293:1\n106#2,2:294\n*S KotlinDebug\n*F\n+ 1 GiftPlayView.kt\ncom/trtc/uikit/livekit/component/gift/GiftPlayView\n*L\n70#1:294,2\n*E\n"})
public final class GiftPlayView extends BasicView {

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Companion f77740q = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Context f77741d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final LiveKitLogger f77742e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public ImageAnimationView f77743f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public AnimationView f77744g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public GiftHeartLayout f77745h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public InterfaceC35914c f77746i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public GiftStore f77747j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public LikeStore f77748k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final GiftAnimationManager f77749l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final GiftAnimationManager f77750m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final C35913b f77751n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final C35912a f77752o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final InterfaceC41709m0 f77753p;

    /* JADX INFO: compiled from: GiftPlayView.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$Companion;", "", "<init>", "()V", "TAG", "", "LIKE_ANIMATION_INTERVAL_MS", "", "LIKE_ANIMATION_COUNT_MAX", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftPlayView$a */
    /* JADX INFO: compiled from: GiftPlayView.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$GiftListenerImpl;", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftListener;", "<init>", "(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V", "onReceiveGift", "", "liveId", "", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "count", "", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C35912a extends GiftListener {
        public C35912a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.gift.GiftListener
        public void onReceiveGift(@NotNull String liveId, @NotNull Gift gift, int count, @NotNull LiveUserInfo sender) {
            Intrinsics.checkNotNullParameter(liveId, "liveId");
            Intrinsics.checkNotNullParameter(gift, "gift");
            Intrinsics.checkNotNullParameter(sender, "sender");
            GiftPlayView.this.f77742e.m79404b("onReceiveGift: liveId:" + liveId + ", gift:" + gift + ", count:" + count + ", sender:" + sender);
            if (Intrinsics.areEqual(liveId, GiftPlayView.this.getF77568c())) {
                GiftPlayView.this.m79648s(gift, count, sender);
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftPlayView$b */
    /* JADX INFO: compiled from: GiftPlayView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$LikeListenerImpl;", "Lio/trtc/tuikit/atomicxcore/api/live/LikeListener;", "<init>", "(Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;)V", "onReceiveLikesMessage", "", "liveId", "", "totalLikesReceived", "", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C35913b extends LikeListener {
        public C35913b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LikeListener
        public void onReceiveLikesMessage(@NotNull String liveId, long totalLikesReceived, @NotNull LiveUserInfo sender) {
            Intrinsics.checkNotNullParameter(liveId, "liveId");
            Intrinsics.checkNotNullParameter(sender, "sender");
            if (Intrinsics.areEqual(liveId, GiftPlayView.this.getF77568c())) {
                String userID = sender.getUserID();
                UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
                if (Intrinsics.areEqual(userID, value != null ? value.getUserID() : null)) {
                    return;
                }
                GiftPlayView.this.m79651w(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftPlayView$c */
    /* JADX INFO: compiled from: GiftPlayView.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/GiftPlayView$TUIGiftPlayViewListener;", "", "onReceiveGift", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/trtc/uikit/livekit/component/gift/GiftPlayView;", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "giftCount", "", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onPlayGiftAnimation", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35914c {
        /* JADX INFO: renamed from: a */
        void mo79652a(@Nullable GiftPlayView giftPlayView, @NotNull Gift gift);

        /* JADX INFO: renamed from: b */
        void mo79653b(@Nullable GiftPlayView giftPlayView, @NotNull Gift gift, int i11, @NotNull LiveUserInfo liveUserInfo);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftPlayView$d */
    /* JADX INFO: compiled from: GiftPlayView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/GiftPlayView$initAnimationPlayer$animationPlayer$1", "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer;", "preparePlay", "", "model", "Lcom/trtc/uikit/livekit/component/gift/viewmodel/GiftModel;", "startPlay", "stopPlay", "setCallback", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer$PlayCallback;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35915d extends AnimationPlayer {

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftPlayView$d$a */
        /* JADX INFO: compiled from: GiftPlayView.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/GiftPlayView$initAnimationPlayer$animationPlayer$1$setCallback$1", "Lcom/trtc/uikit/livekit/component/gift/view/animation/AnimationView$Callback;", "onFinished", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements AnimationView.InterfaceC35926a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AnimationPlayer.a f77757a;

            public a(AnimationPlayer.a aVar) {
                this.f77757a = aVar;
            }

            @Override // com.trtc.uikit.livekit.component.gift.view.animation.AnimationView.InterfaceC35926a
            /* JADX INFO: renamed from: a */
            public void mo79658a(int i11) {
                AnimationPlayer.a aVar = this.f77757a;
                if (aVar != null) {
                    aVar.mo79721a(i11);
                }
            }
        }

        public C35915d() {
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer
        /* JADX INFO: renamed from: a */
        public void mo79654a(C43444a model) {
            Intrinsics.checkNotNullParameter(model, "model");
            if (!GiftPlayView.this.isAttachedToWindow() || model.getF95973a() == null) {
                return;
            }
            GiftPlayView giftPlayView = GiftPlayView.this;
            InterfaceC35914c interfaceC35914c = giftPlayView.f77746i;
            if (interfaceC35914c != null) {
                Gift f95973a = model.getF95973a();
                Intrinsics.checkNotNull(f95973a);
                interfaceC35914c.mo79652a(giftPlayView, f95973a);
            }
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer
        /* JADX INFO: renamed from: b */
        public void mo79655b(AnimationPlayer.a aVar) {
            AnimationView animationView = GiftPlayView.this.f77744g;
            if (animationView != null) {
                animationView.setCallback(new a(aVar));
            }
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer
        /* JADX INFO: renamed from: c */
        public void mo79656c(C43444a model) {
            AnimationView animationView;
            Intrinsics.checkNotNullParameter(model, "model");
            if (!GiftPlayView.this.isAttachedToWindow() || model.getF95973a() == null || (animationView = GiftPlayView.this.f77744g) == null) {
                return;
            }
            Gift f95973a = model.getF95973a();
            Intrinsics.checkNotNull(f95973a);
            animationView.mo79684d(f95973a.getResourceURL());
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer
        /* JADX INFO: renamed from: d */
        public void mo79657d() {
            AnimationView animationView = GiftPlayView.this.f77744g;
            if (animationView != null) {
                animationView.mo79685e();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftPlayView$e */
    /* JADX INFO: compiled from: GiftPlayView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/GiftPlayView$initImageAnimationPlayer$imageAnimationPlayer$1", "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer;", "preparePlay", "", "model", "Lcom/trtc/uikit/livekit/component/gift/viewmodel/GiftModel;", "startPlay", "stopPlay", "setCallback", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/component/gift/view/animation/manager/AnimationPlayer$PlayCallback;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35916e extends AnimationPlayer {

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftPlayView$e$a */
        /* JADX INFO: compiled from: GiftPlayView.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/GiftPlayView$initImageAnimationPlayer$imageAnimationPlayer$1$setCallback$1", "Lcom/trtc/uikit/livekit/component/gift/view/animation/ImageAnimationView$Callback;", "onFinished", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements ImageAnimationView.InterfaceC35928b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AnimationPlayer.a f77759a;

            public a(AnimationPlayer.a aVar) {
                this.f77759a = aVar;
            }

            @Override // com.trtc.uikit.livekit.component.gift.view.animation.ImageAnimationView.InterfaceC35928b
            /* JADX INFO: renamed from: a */
            public void mo79659a(int i11) {
                AnimationPlayer.a aVar = this.f77759a;
                if (aVar != null) {
                    aVar.mo79721a(i11);
                }
            }
        }

        public C35916e() {
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer
        /* JADX INFO: renamed from: a */
        public void mo79654a(C43444a model) {
            Intrinsics.checkNotNullParameter(model, "model");
            if (GiftPlayView.this.isAttachedToWindow()) {
                GiftPlayView.this.f77750m.m79719g(model);
            }
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer
        /* JADX INFO: renamed from: b */
        public void mo79655b(AnimationPlayer.a aVar) {
            ImageAnimationView imageAnimationView = GiftPlayView.this.f77743f;
            if (imageAnimationView != null) {
                imageAnimationView.setCallback(new a(aVar));
            }
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer
        /* JADX INFO: renamed from: c */
        public void mo79656c(C43444a model) {
            Intrinsics.checkNotNullParameter(model, "model");
            if (!GiftPlayView.this.isAttachedToWindow() || model.getF95973a() == null) {
                return;
            }
            GiftPlayView giftPlayView = GiftPlayView.this;
            ImageAnimationView.C35929c c35929c = new ImageAnimationView.C35929c();
            Gift f95973a = model.getF95973a();
            Intrinsics.checkNotNull(f95973a);
            c35929c.m79704h(f95973a.getIconURL());
            Gift f95973a2 = model.getF95973a();
            Intrinsics.checkNotNull(f95973a2);
            c35929c.m79705i(f95973a2.getName());
            c35929c.m79703g(model.getF95974b());
            LiveUserInfo f95975c = model.getF95975c();
            Intrinsics.checkNotNull(f95975c);
            c35929c.m79707k(f95975c.getUserName());
            LiveUserInfo f95975c2 = model.getF95975c();
            Intrinsics.checkNotNull(f95975c2);
            c35929c.m79706j(f95975c2.getAvatarURL());
            ImageAnimationView imageAnimationView = giftPlayView.f77743f;
            if (imageAnimationView != null) {
                imageAnimationView.m79695d(c35929c);
            }
        }

        @Override // com.trtc.uikit.livekit.component.gift.view.animation.manager.AnimationPlayer
        /* JADX INFO: renamed from: d */
        public void mo79657d() {
            ImageAnimationView imageAnimationView = GiftPlayView.this.f77743f;
            if (imageAnimationView != null) {
                imageAnimationView.m79696f();
            }
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.gift.GiftPlayView$f */
    /* JADX INFO: compiled from: GiftPlayView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/GiftPlayView$playLikeFromOther$task$1", "Ljava/lang/Runnable;", "run", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC35917f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int[] f77760b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GiftPlayView f77761c;

        public RunnableC35917f(int[] iArr, GiftPlayView giftPlayView) {
            this.f77760b = iArr;
            this.f77761c = giftPlayView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f77760b[0] > 0) {
                this.f77761c.m79650v();
                this.f77761c.postDelayed(this, 100L);
                int[] iArr = this.f77760b;
                iArr[0] = iArr[0] - 1;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftPlayView(@NotNull Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftPlayView(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    /* JADX INFO: renamed from: r */
    private final void m79644r() {
        this.f77743f = (ImageAnimationView) findViewById(R$id.gift_image_anim_view);
        this.f77744g = (AnimationView) findViewById(R$id.gift_anim_view);
        this.f77745h = (GiftHeartLayout) findViewById(R$id.heart_layout);
    }

    /* JADX INFO: renamed from: u */
    public static final void m79645u(GiftPlayView giftPlayView, C43444a c43444a) {
        giftPlayView.f77749l.m79719g(c43444a);
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: a */
    public void mo79408a() {
        GiftStore giftStore = this.f77747j;
        if (giftStore != null) {
            giftStore.addGiftListener(this.f77752o);
        }
        LikeStore likeStore = this.f77748k;
        if (likeStore != null) {
            likeStore.addLikeListener(this.f77751n);
        }
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: b */
    public void mo79409b(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        super.mo79409b(roomId);
        GiftStore giftStore = this.f77747j;
        if (giftStore != null) {
            giftStore.setLanguage(getLanguage());
        }
        AnimationView animationView = this.f77744g;
        if (animationView != null) {
            animationView.setRoomId(roomId);
        }
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: c */
    public void mo79410c() {
        this.f77747j = GiftStore.INSTANCE.create(getF77568c());
        this.f77748k = LikeStore.INSTANCE.create(getF77568c());
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView
    /* JADX INFO: renamed from: d */
    public void mo79411d() {
        GiftStore giftStore = this.f77747j;
        if (giftStore != null) {
            giftStore.removeGiftListener(this.f77752o);
        }
        LikeStore likeStore = this.f77748k;
        if (likeStore != null) {
            likeStore.removeLikeListener(this.f77751n);
        }
    }

    @Override // com.trtc.uikit.livekit.common.p179ui.BasicView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f77749l.m79720h();
        this.f77750m.m79720h();
        C41713n0.m91129e(this.f77753p, null, 1, null);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: p */
    public final void m79646p() {
        this.f77749l.m79718e(new C35915d());
    }

    /* JADX INFO: renamed from: q */
    public final void m79647q() {
        this.f77750m.m79718e(new C35916e());
    }

    /* JADX INFO: renamed from: s */
    public final void m79648s(Gift gift, int i11, LiveUserInfo liveUserInfo) {
        C43444a c43444a = new C43444a();
        c43444a.m95650f(gift);
        c43444a.m95651g(i11);
        c43444a.m95652h(liveUserInfo);
        String userID = liveUserInfo.getUserID();
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        c43444a.m95649e(TextUtils.equals(userID, value != null ? value.getUserID() : null));
        if (TextUtils.isEmpty(gift.getResourceURL())) {
            this.f77750m.m79715b(c43444a);
        } else {
            this.f77749l.m79715b(c43444a);
        }
        InterfaceC35914c interfaceC35914c = this.f77746i;
        if (interfaceC35914c != null) {
            interfaceC35914c.mo79653b(this, gift, i11, liveUserInfo);
        }
    }

    public final void setListener(@Nullable InterfaceC35914c interfaceC35914c) {
        this.f77746i = interfaceC35914c;
    }

    /* JADX INFO: renamed from: t */
    public final void m79649t(@NotNull String playUrl) {
        Intrinsics.checkNotNullParameter(playUrl, "playUrl");
        final C43444a c43444a = new C43444a();
        c43444a.m95650f(new Gift(null, null, null, null, playUrl, 0L, 0L, null, 239, null));
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.f77749l.m79719g(c43444a);
        } else {
            post(new Runnable() { // from class: com.trtc.uikit.livekit.component.gift.a
                @Override // java.lang.Runnable
                public final void run() {
                    GiftPlayView.m79645u(this.f77772b, c43444a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m79650v() {
        GiftHeartLayout giftHeartLayout = this.f77745h;
        if (giftHeartLayout != null) {
            giftHeartLayout.m79748a();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m79651w(int i11) {
        post(new RunnableC35917f(new int[]{Math.max(Math.min(i11, 30), 0)}, this));
    }

    public /* synthetic */ GiftPlayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        String languageTag = Locale.getDefault().toLanguageTag();
        this.f77742e.m79404b("getLanguage language:" + language + ", languageTag:" + languageTag);
        if (!TextUtils.isEmpty(language) && !TextUtils.isEmpty(languageTag)) {
            Intrinsics.checkNotNull(languageTag);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = languageTag.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.equals(TUIThemeManager.LANGUAGE_ZH_CN, language, true)) {
                if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "zh-hans", false, 2, (Object) null) && !Intrinsics.areEqual(lowerCase, TUIThemeManager.LANGUAGE_ZH_CN) && !Intrinsics.areEqual(lowerCase, "zh-cn") && !Intrinsics.areEqual(lowerCase, "zh-sg") && !Intrinsics.areEqual(lowerCase, "zh-my")) {
                    return "zh-Hant";
                }
                return "zh-Hans";
            }
        }
        return TUIThemeManager.LANGUAGE_EN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftPlayView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i11) {
        super(mContext, attributeSet, i11);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f77741d = mContext;
        this.f77742e = LiveKitLogger.f77564c.getComponentLogger("GiftPlayView");
        this.f77749l = new GiftAnimationManager();
        this.f77750m = new GiftAnimationManager();
        this.f77751n = new C35913b();
        this.f77752o = new C35912a();
        InterfaceC41709m0 interfaceC41709m0M91126b = C41713n0.m91126b();
        this.f77753p = interfaceC41709m0M91126b;
        LayoutInflater.from(getContext()).inflate(R$layout.gift_layout_animator, (ViewGroup) this, true);
        m79644r();
        m79646p();
        m79647q();
        if (C12573b.f21598a.m23696a()) {
            "com.trtc.uikit.livekit.kc.LiveEvent:like_event".length();
        }
        C12572a.m23693b(interfaceC41709m0M91126b, new GiftPlayView$special$$inlined$bindFlowEvent$1("com.trtc.uikit.livekit.kc.LiveEvent:like_event", null, this));
    }
}
