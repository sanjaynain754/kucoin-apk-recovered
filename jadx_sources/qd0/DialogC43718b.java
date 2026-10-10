package qd0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.C7090R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.R$color;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.component.gift.GiftListView;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qd0.b */
/* JADX INFO: compiled from: GiftSendDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/GiftSendDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "Lcom/trtc/uikit/livekit/component/gift/GiftListView$OnSendGiftListener;", "context", "Landroid/content/Context;", "roomId", "", TUIConstantDefine.OWNER_ID, TUIConstantDefine.OWNER_NAME, TUIConstantDefine.OWNER_AVATAR_URL, "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "getOwnerId", "getOwnerName", "getOwnerAvatarUrl", "TAG", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSendGift", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/trtc/uikit/livekit/component/gift/GiftListView;", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "count", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DialogC43718b extends BottomSheetDialog implements GiftListView.InterfaceC35909a {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f96639b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f96640c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f96641d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f96642e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final String f96643f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC43718b(@NotNull Context context, @NotNull String roomId, @NotNull String ownerId, @NotNull String ownerName, @NotNull String ownerAvatarUrl) throws Exception {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(ownerAvatarUrl, "ownerAvatarUrl");
        this.f96639b = roomId;
        this.f96640c = ownerId;
        this.f96641d = ownerName;
        this.f96642e = ownerAvatarUrl;
        this.f96643f = "GiftSendDialog";
        setContentView(R$layout.gift_layout_send_dialog_panel);
        m96273c();
    }

    /* JADX INFO: renamed from: c */
    private final void m96273c() throws Exception {
        GiftListView giftListView = (GiftListView) findViewById(R$id.gift_list_view);
        if (giftListView != null) {
            giftListView.m79626f(this.f96639b);
            giftListView.setListener(this);
        }
        setCanceledOnTouchOutside(true);
    }

    @Override // com.trtc.uikit.livekit.component.gift.GiftListView.InterfaceC35909a
    /* JADX INFO: renamed from: a */
    public void mo79631a(@NotNull GiftListView view, @NotNull Gift gift, int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(gift, "gift");
        view.m79629k(gift, i11);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewFindViewById = findViewById(C7090R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R$color.common_design_bottom_sheet_color);
        }
    }
}
