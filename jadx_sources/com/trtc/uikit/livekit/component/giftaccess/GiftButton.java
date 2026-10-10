package com.trtc.uikit.livekit.component.giftaccess;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.giftaccess.GiftButton;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveListListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveListStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import qd0.DialogC43718b;

/* JADX INFO: compiled from: GiftButton.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u001e\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010 \u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bJ\b\u0010\"\u001a\u00020!H\u0014J\b\u0010#\u001a\u00020!H\u0014J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006'"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "roomId", "", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", TUIConstantDefine.OWNER_ID, "getOwnerId", "setOwnerId", TUIConstantDefine.OWNER_NAME, "getOwnerName", "setOwnerName", TUIConstantDefine.OWNER_AVATAR_URL, "getOwnerAvatarUrl", "setOwnerAvatarUrl", "imageButton", "Landroid/widget/ImageView;", "giftSendDialog", "Lcom/trtc/uikit/livekit/component/giftaccess/GiftSendDialog;", "liveListListener", "com/trtc/uikit/livekit/component/giftaccess/GiftButton$liveListListener$1", "Lcom/trtc/uikit/livekit/component/giftaccess/GiftButton$liveListListener$1;", "init", "", "onAttachedToWindow", "onDetachedFromWindow", "initView", "bindViewId", "initImageButton", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class GiftButton extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f77870b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f77871c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f77872d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f77873e;

    /* JADX INFO: renamed from: f */
    public ImageView f77874f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public DialogC43718b f77875g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final C35935a f77876h;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.giftaccess.GiftButton$a */
    /* JADX INFO: compiled from: GiftButton.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/giftaccess/GiftButton$liveListListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveListListener;", "onLiveEnded", "", "liveID", "", "reason", "Lio/trtc/tuikit/atomicxcore/api/live/LiveEndedReason;", "message", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35935a extends LiveListListener {
        public C35935a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveListListener
        public void onLiveEnded(String liveID, LiveEndedReason reason, String message) {
            Intrinsics.checkNotNullParameter(liveID, "liveID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(message, "message");
            DialogC43718b dialogC43718b = GiftButton.this.f77875g;
            if (dialogC43718b != null) {
                dialogC43718b.dismiss();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public static final void m79759f(GiftButton giftButton, View view) {
        if (giftButton.f77875g == null) {
            Context context = giftButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String str = giftButton.f77870b;
            Intrinsics.checkNotNull(str);
            String str2 = giftButton.f77871c;
            Intrinsics.checkNotNull(str2);
            String str3 = giftButton.f77872d;
            Intrinsics.checkNotNull(str3);
            String str4 = giftButton.f77873e;
            Intrinsics.checkNotNull(str4);
            giftButton.f77875g = new DialogC43718b(context, str, str2, str3, str4);
        }
        DialogC43718b dialogC43718b = giftButton.f77875g;
        if (dialogC43718b != null) {
            dialogC43718b.show();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m79760c() {
        View viewFindViewById = findViewById(R$id.iv_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f77874f = (ImageView) viewFindViewById;
    }

    /* JADX INFO: renamed from: d */
    public final void m79761d(@NotNull String roomId, @NotNull String ownerId, @NotNull String ownerName, @NotNull String ownerAvatarUrl) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(ownerAvatarUrl, "ownerAvatarUrl");
        this.f77870b = roomId;
        this.f77871c = ownerId;
        this.f77872d = ownerName;
        this.f77873e = ownerAvatarUrl;
        m79763g();
    }

    /* JADX INFO: renamed from: e */
    public final void m79762e() {
        ImageView imageView = this.f77874f;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageButton");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: qd0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftButton.m79759f(this.f96638b, view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: getOwnerAvatarUrl, reason: from getter */
    public final String getF77873e() {
        return this.f77873e;
    }

    @Nullable
    /* JADX INFO: renamed from: getOwnerId, reason: from getter */
    public final String getF77871c() {
        return this.f77871c;
    }

    @Nullable
    /* JADX INFO: renamed from: getOwnerName, reason: from getter */
    public final String getF77872d() {
        return this.f77872d;
    }

    @Nullable
    /* JADX INFO: renamed from: getRoomId, reason: from getter */
    public final String getF77870b() {
        return this.f77870b;
    }

    public final void setOwnerAvatarUrl(@Nullable String str) {
        this.f77873e = str;
    }

    public final void setOwnerId(@Nullable String str) {
        this.f77871c = str;
    }

    public final void setOwnerName(@Nullable String str) {
        this.f77872d = str;
    }

    public final void setRoomId(@Nullable String str) {
        this.f77870b = str;
    }

    public /* synthetic */ GiftButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: g */
    public final void m79763g() {
        m79760c();
        m79762e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LiveListStore.INSTANCE.shared().addLiveListListener(this.f77876h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LiveListStore.INSTANCE.shared().removeLiveListListener(this.f77876h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77876h = new C35935a();
        LayoutInflater.from(context).inflate(R$layout.gift_layout_extension_view, this);
    }
}
