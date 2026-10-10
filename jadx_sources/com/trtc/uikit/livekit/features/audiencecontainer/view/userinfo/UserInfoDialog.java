package com.trtc.uikit.livekit.features.audiencecontainer.view.userinfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.imsdk.p128v2.V2TIMFollowInfo;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import ee0.C37144f;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.AtomicButton;
import io.trtc.tuikit.atomicx.widget.basicwidget.button.ButtonColorType;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserInfoDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0003J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;)V", "buttonFollow", "Lio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton;", "textUserName", "Landroid/widget/TextView;", "textUserId", "imageAvatar", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "textFans", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "init", "", "addObserver", "removeObserver", "initView", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onAttachedToWindow", "onDetachedFromWindow", "updateView", "getFansNumber", "refreshFollowButton", "onFollowingUserChanged", "onFollowButtonClick", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class UserInfoDialog extends AtomicPopover {

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Companion f78980v = new Companion(null);

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final LiveKitLogger f78981w = LiveKitLogger.f77564c.getLiveStreamLogger("UserInfoDialog");

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Context f78982m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final C37144f f78983n;

    /* JADX INFO: renamed from: o */
    public AtomicButton f78984o;

    /* JADX INFO: renamed from: p */
    public TextView f78985p;

    /* JADX INFO: renamed from: q */
    public TextView f78986q;

    /* JADX INFO: renamed from: r */
    public AtomicAvatar f78987r;

    /* JADX INFO: renamed from: s */
    public TextView f78988s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public LiveUserInfo f78989t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public InterfaceC41775x1 f78990u;

    /* JADX INFO: compiled from: UserInfoDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.userinfo.UserInfoDialog$a */
    /* JADX INFO: compiled from: UserInfoDialog.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/userinfo/UserInfoDialog$getFansNumber$1", "Lcom/tencent/imsdk/v2/V2TIMValueCallback;", "", "Lcom/tencent/imsdk/v2/V2TIMFollowInfo;", "onSuccess", "", "v2TIMFollowInfos", "onError", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36354a implements V2TIMValueCallback<List<? extends V2TIMFollowInfo>> {
        public C36354a() {
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<? extends V2TIMFollowInfo> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            TextView textView = UserInfoDialog.this.f78988s;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textFans");
                textView = null;
            }
            textView.setText(String.valueOf(list.get(0).getFollowersCount()));
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
        public void onError(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            UserInfoDialog.f78981w.m79403a("UserInfoDialog getUserFollowInfo failed:errorCode:message:" + desc);
            Context contextM79397b = ContextProvider.m79397b();
            AtomicToast atomicToast = AtomicToast.f87566a;
            Intrinsics.checkNotNull(contextM79397b);
            AtomicToast.m88196j(atomicToast, contextM79397b, code + ',' + desc, AtomicToast.Style.ERROR, null, null, null, null, null, 248, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoDialog(@NotNull Context context, @NotNull C37144f audienceStore) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceStore, "audienceStore");
        this.f78982m = context;
        this.f78983n = audienceStore;
        m81299L();
    }

    /* JADX INFO: renamed from: I */
    private final void m81298I(View view) {
        View viewFindViewById = view.findViewById(R$id.atomic_btn_follow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78984o = (AtomicButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.tv_anchor_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78985p = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.tv_user_id);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78986q = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.iv_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f78987r = (AtomicAvatar) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.tv_fans);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f78988s = (TextView) viewFindViewById5;
    }

    /* JADX INFO: renamed from: L */
    private final void m81299L() {
        View viewInflate = LayoutInflater.from(this.f78982m).inflate(R$layout.livekit_user_info, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m81298I(viewInflate);
        m81301Q();
        m88181q(viewInflate);
    }

    /* JADX INFO: renamed from: P */
    private final void m81300P() {
        InterfaceC41775x1 interfaceC41775x1 = this.f78990u;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Q */
    private final void m81301Q() {
        LiveUserInfo liveUserInfo = this.f78989t;
        if (liveUserInfo == null || TextUtils.isEmpty(liveUserInfo.getUserID())) {
            return;
        }
        TextView textView = this.f78985p;
        AtomicButton atomicButton = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textUserName");
            textView = null;
        }
        textView.setText(TextUtils.isEmpty(liveUserInfo.getUserName()) ? liveUserInfo.getUserID() : liveUserInfo.getUserName());
        TextView textView2 = this.f78986q;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textUserId");
            textView2 = null;
        }
        textView2.setText(this.f78982m.getString(R$string.common_user_id, liveUserInfo.getUserID()));
        String avatarURL = liveUserInfo.getAvatarURL();
        AtomicAvatar atomicAvatar = this.f78987r;
        if (atomicAvatar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageAvatar");
            atomicAvatar = null;
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(avatarURL, R$drawable.livekit_ic_avatar));
        m81307O();
        AtomicButton atomicButton2 = this.f78984o;
        if (atomicButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonFollow");
        } else {
            atomicButton = atomicButton2;
        }
        atomicButton.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.userinfo.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoDialog.m81302R(this.f78993b, view);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m81303J() {
        LiveUserInfo liveUserInfo = this.f78989t;
        if (liveUserInfo == null || TextUtils.isEmpty(liveUserInfo.getUserID())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(liveUserInfo.getUserID());
        V2TIMManager.getFriendshipManager().getUserFollowInfo(arrayList, new C36354a());
    }

    /* JADX INFO: renamed from: K */
    public final void m81304K(@NotNull LiveUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.f78989t = userInfo;
        this.f78983n.getF82427i().m80749d(userInfo.getUserID());
        m81301Q();
    }

    /* JADX INFO: renamed from: M */
    public final void m81305M() {
        LiveUserInfo liveUserInfo = this.f78989t;
        if (liveUserInfo == null) {
            return;
        }
        if (this.f78983n.m83093l().m83106a().getValue().contains(liveUserInfo.getUserID())) {
            this.f78983n.getF82427i().m80755j(liveUserInfo.getUserID());
        } else {
            this.f78983n.getF82427i().m80751f(liveUserInfo.getUserID());
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m81306N() {
        LiveUserInfo liveUserInfo = this.f78989t;
        if (liveUserInfo == null || TextUtils.isEmpty(liveUserInfo.getUserID())) {
            return;
        }
        m81307O();
    }

    /* JADX INFO: renamed from: O */
    public final void m81307O() {
        LiveUserInfo liveUserInfo = this.f78989t;
        if (liveUserInfo == null) {
            return;
        }
        AtomicButton atomicButton = null;
        if (this.f78983n.m83093l().m83106a().getValue().contains(liveUserInfo.getUserID())) {
            AtomicButton atomicButton2 = this.f78984o;
            if (atomicButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonFollow");
            } else {
                atomicButton = atomicButton2;
            }
            String string = atomicButton.getContext().getString(R$string.common_unfollow_anchor);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            atomicButton.setText(string);
            atomicButton.setColorType(ButtonColorType.SECONDARY);
        } else {
            AtomicButton atomicButton3 = this.f78984o;
            if (atomicButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buttonFollow");
            } else {
                atomicButton = atomicButton3;
            }
            String string2 = atomicButton.getContext().getString(R$string.common_follow_anchor);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            atomicButton.setText(string2);
            atomicButton.setColorType(ButtonColorType.PRIMARY);
        }
        m81303J();
    }

    /* JADX INFO: renamed from: H */
    private final void m81297H() {
        this.f78990u = C41696j.m91104d(C41713n0.m91125a(C41782z0.m91393c()), null, null, new UserInfoDialog$addObserver$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: R */
    public static final void m81302R(UserInfoDialog userInfoDialog, View view) {
        userInfoDialog.m81305M();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81297H();
        m81303J();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81300P();
    }
}
