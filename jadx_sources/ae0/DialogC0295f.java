package ae0;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.features.anchorboardcast.store.AnchorStore;
import com.trtc.uikit.livekit.p180kc.helper.LiveFlutterHelper;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog;
import io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.C39361f;
import io.trtc.tuikit.atomicx.widget.basicwidget.avatar.AtomicAvatar;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import java.util.Iterator;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import wc0.C45791b;

/* JADX INFO: renamed from: ae0.f */
/* JADX INFO: compiled from: UserManagerDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r*\u0001\u001d\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0015H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\u000e\u0010)\u001a\u00020 H\u0082@¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020 H\u0002J\b\u0010,\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006-"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/usermanage/UserManagerDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "context", "Landroid/content/Context;", "anchorStore", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorStore;Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V", "imageHeadView", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/AtomicAvatar;", "userIdText", "Landroid/widget/TextView;", "userNameText", "ivDisableMessage", "Landroid/widget/ImageView;", "tvDisableMessage", "textUnfollow", "imageFollowIcon", "userInfoView", "Landroid/view/View;", TUIConstantDefine.IS_MESSAGE_DISABLED, "", "confirmDialog", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;", "subscribeStateJob", "Lkotlinx/coroutines/Job;", "liveAudienceListener", "com/trtc/uikit/livekit/features/anchorboardcast/view/usermanage/UserManagerDialog$liveAudienceListener$1", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/usermanage/UserManagerDialog$liveAudienceListener$1;", "onAttachedToWindow", "", "onDetachedFromWindow", "initView", "bindViewId", "rootView", "initFollowButtonView", "initUserInfoView", "addObserver", "removeObserver", "onFollowingUserChanged", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDisableMessageButtonClicked", "onKickUserButtonClicked", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserManagerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserManagerDialog.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/usermanage/UserManagerDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
public final class DialogC0295f extends AtomicPopover {

    /* JADX INFO: renamed from: A */
    @NotNull
    public final a f779A;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Context f780m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final AnchorStore f781n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final LiveUserInfo f782o;

    /* JADX INFO: renamed from: p */
    public AtomicAvatar f783p;

    /* JADX INFO: renamed from: q */
    public TextView f784q;

    /* JADX INFO: renamed from: r */
    public TextView f785r;

    /* JADX INFO: renamed from: s */
    public ImageView f786s;

    /* JADX INFO: renamed from: t */
    public TextView f787t;

    /* JADX INFO: renamed from: u */
    public TextView f788u;

    /* JADX INFO: renamed from: v */
    public ImageView f789v;

    /* JADX INFO: renamed from: w */
    public View f790w;

    /* JADX INFO: renamed from: x */
    public boolean f791x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public AtomicAlertDialog f792y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public InterfaceC41775x1 f793z;

    /* JADX INFO: renamed from: ae0.f$a */
    /* JADX INFO: compiled from: UserManagerDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/features/anchorboardcast/view/usermanage/UserManagerDialog$liveAudienceListener$1", "Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceListener;", "onAudienceLeft", "", "audience", "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "onAudienceMessageDisabled", "isDisable", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends LiveAudienceListener {
        public a() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
        public void onAudienceLeft(LiveUserInfo audience) {
            Intrinsics.checkNotNullParameter(audience, "audience");
            if (TextUtils.isEmpty(DialogC0295f.this.f782o.getUserID()) || TextUtils.isEmpty(audience.getUserID()) || !Intrinsics.areEqual(DialogC0295f.this.f782o.getUserID(), audience.getUserID())) {
                return;
            }
            DialogC0295f.this.dismiss();
            AtomicAlertDialog atomicAlertDialog = DialogC0295f.this.f792y;
            if (atomicAlertDialog != null) {
                atomicAlertDialog.m88063s();
            }
        }

        @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener
        public void onAudienceMessageDisabled(LiveUserInfo audience, boolean isDisable) {
            Intrinsics.checkNotNullParameter(audience, "audience");
            if (Intrinsics.areEqual(DialogC0295f.this.f782o.getUserID(), audience.getUserID())) {
                TextView textView = null;
                if (isDisable) {
                    ImageView imageView = DialogC0295f.this.f786s;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivDisableMessage");
                        imageView = null;
                    }
                    imageView.setImageResource(R$drawable.livekit_ic_disable_message);
                    TextView textView2 = DialogC0295f.this.f787t;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvDisableMessage");
                    } else {
                        textView = textView2;
                    }
                    textView.setText(R$string.common_enable_message);
                    return;
                }
                ImageView imageView2 = DialogC0295f.this.f786s;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivDisableMessage");
                    imageView2 = null;
                }
                imageView2.setImageResource(R$drawable.livekit_ic_enable_message);
                TextView textView3 = DialogC0295f.this.f787t;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvDisableMessage");
                } else {
                    textView = textView3;
                }
                textView.setText(R$string.common_disable_message);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0295f(@NotNull Context context, @NotNull AnchorStore anchorStore, @NotNull LiveUserInfo userInfo) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorStore, "anchorStore");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.f780m = context;
        this.f781n = anchorStore;
        this.f782o = userInfo;
        this.f779A = new a();
        m1032S();
    }

    /* JADX INFO: renamed from: L */
    private final void m1026L() {
        this.f781n.getF78171d().addLiveAudienceListener(this.f779A);
    }

    /* JADX INFO: renamed from: M */
    private final void m1027M(View view) {
        View viewFindViewById = view.findViewById(R$id.user_id);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f784q = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.user_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f785r = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.iv_head);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f783p = (AtomicAvatar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.iv_disable_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f786s = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.tv_disable_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f787t = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.tv_unfollow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f788u = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.iv_follow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById7;
        this.f789v = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageFollowIcon");
            imageView = null;
        }
        imageView.setVisibility(8);
        View viewFindViewById8 = view.findViewById(R$id.cl_user_info);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f790w = viewFindViewById8;
        view.findViewById(R$id.disable_message_container).setOnClickListener(new View.OnClickListener() { // from class: ae0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DialogC0295f.m1028N(this.f774b, view2);
            }
        });
        view.findViewById(R$id.kick_out_room_container).setOnClickListener(new View.OnClickListener() { // from class: ae0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DialogC0295f.m1029O(this.f775b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m1031R(DialogC0295f dialogC0295f, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LiveFlutterHelper.f79161a.m81517b(dialogC0295f.f782o.getUserID());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    private final void m1032S() {
        Object next;
        AtomicAvatar atomicAvatar = null;
        View viewInflate = View.inflate(this.f780m, R$layout.livekit_user_manager, null);
        Intrinsics.checkNotNull(viewInflate);
        m88181q(viewInflate);
        m1027M(viewInflate);
        m1030P(viewInflate);
        m1036Q();
        Iterator<T> it = LiveAudienceStore.INSTANCE.create(this.f781n.getF78170c().getRoomId()).getLiveAudienceState().getMessageBannedUserList().getValue().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((LiveUserInfo) next).getUserID(), this.f782o.getUserID()));
        boolean z11 = next != null;
        this.f791x = z11;
        if (z11) {
            ImageView imageView = this.f786s;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivDisableMessage");
                imageView = null;
            }
            imageView.setImageResource(R$drawable.livekit_ic_disable_message);
            TextView textView = this.f787t;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDisableMessage");
                textView = null;
            }
            textView.setText(R$string.common_enable_message);
        } else {
            ImageView imageView2 = this.f786s;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivDisableMessage");
                imageView2 = null;
            }
            imageView2.setImageResource(R$drawable.livekit_ic_enable_message);
            TextView textView2 = this.f787t;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDisableMessage");
                textView2 = null;
            }
            textView2.setText(R$string.common_disable_message);
        }
        TextView textView3 = this.f784q;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userIdText");
            textView3 = null;
        }
        textView3.setText(this.f780m.getString(R$string.common_user_id, this.f782o.getUserID()));
        String userID = TextUtils.isEmpty(this.f782o.getUserName()) ? this.f782o.getUserID() : this.f782o.getUserName();
        TextView textView4 = this.f785r;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNameText");
            textView4 = null;
        }
        textView4.setText(userID);
        AtomicAvatar atomicAvatar2 = this.f783p;
        if (atomicAvatar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageHeadView");
        } else {
            atomicAvatar = atomicAvatar2;
        }
        atomicAvatar.setContent(new AtomicAvatar.AbstractC39363b.URL(this.f782o.getAvatarURL(), R$drawable.livekit_ic_avatar));
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m1033V(final DialogC0295f dialogC0295f, String str, AtomicAlertDialog.DialogConfig init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        String string = dialogC0295f.f780m.getString(R$string.common_kick_user_confirm_message, str);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        init.m88090o(string);
        String string2 = dialogC0295f.f780m.getString(R$string.common_kick_out_of_room);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C39361f.m88097g(init, string2, AtomicAlertDialog.TextColorPreset.RED, false, new Function1() { // from class: ae0.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC0295f.m1034W(this.f778b, (Dialog) obj);
            }
        }, 4, null);
        String string3 = dialogC0295f.f780m.getString(R$string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C39361f.m88095e(init, string3, AtomicAlertDialog.TextColorPreset.PRIMARY, false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m1034W(DialogC0295f dialogC0295f, Dialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        dialogC0295f.f781n.getF78174g().m101194h(dialogC0295f.f782o.getUserID());
        dialogC0295f.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    private final void m1035X() {
        InterfaceC41775x1 interfaceC41775x1 = this.f793z;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f781n.getF78171d().removeLiveAudienceListener(this.f779A);
    }

    /* JADX INFO: renamed from: Q */
    public final void m1036Q() {
        View view = this.f790w;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfoView");
            view = null;
        }
        C45791b.m101117c(view, 0L, new Function1() { // from class: ae0.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC0295f.m1031R(this.f773b, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m1037T() {
        this.f791x = !this.f791x;
        this.f781n.getF78174g().m101191e(this.f782o.getUserID(), this.f791x);
        TextView textView = null;
        if (this.f791x) {
            ImageView imageView = this.f786s;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivDisableMessage");
                imageView = null;
            }
            imageView.setImageResource(R$drawable.livekit_ic_disable_message);
            TextView textView2 = this.f787t;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvDisableMessage");
            } else {
                textView = textView2;
            }
            textView.setText(R$string.common_enable_message);
            return;
        }
        ImageView imageView2 = this.f786s;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDisableMessage");
            imageView2 = null;
        }
        imageView2.setImageResource(R$drawable.livekit_ic_enable_message);
        TextView textView3 = this.f787t;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDisableMessage");
        } else {
            textView = textView3;
        }
        textView.setText(R$string.common_disable_message);
    }

    /* JADX INFO: renamed from: U */
    public final void m1038U() {
        if (this.f792y == null) {
            this.f792y = new AtomicAlertDialog(this.f780m, null, 2, null);
        }
        final String userID = TextUtils.isEmpty(this.f782o.getUserName()) ? this.f782o.getUserID() : this.f782o.getUserName();
        AtomicAlertDialog atomicAlertDialog = this.f792y;
        if (atomicAlertDialog != null) {
            atomicAlertDialog.m88065u(new Function1() { // from class: ae0.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DialogC0295f.m1033V(this.f776b, userID, (AtomicAlertDialog.DialogConfig) obj);
                }
            });
        }
        AtomicAlertDialog atomicAlertDialog2 = this.f792y;
        if (atomicAlertDialog2 != null) {
            atomicAlertDialog2.m88054I();
        }
    }

    /* JADX INFO: renamed from: N */
    public static final void m1028N(DialogC0295f dialogC0295f, View view) {
        dialogC0295f.m1037T();
    }

    /* JADX INFO: renamed from: O */
    public static final void m1029O(DialogC0295f dialogC0295f, View view) {
        dialogC0295f.m1038U();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1026L();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1035X();
    }

    /* JADX INFO: renamed from: P */
    private final void m1030P(View view) {
    }
}
