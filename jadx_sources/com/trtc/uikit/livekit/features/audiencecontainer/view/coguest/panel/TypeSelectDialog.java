package com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.permission.AbstractC35867d;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import ee0.C37144f;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import vc0.C45494c;
import vc0.C45495d;
import vc0.C45497f;

/* JADX INFO: compiled from: TypeSelectDialog.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/TypeSelectDialog;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore$AudienceViewListener;", "context", "Landroid/content/Context;", "audienceStore", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "seatIndex", "", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;I)V", "imageLinkSettings", "Landroid/widget/ImageView;", "layoutLinkVideo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutLinkAudio", "initView", "", "onAttachedToWindow", "onDetachedFromWindow", "bindViewId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initLinkAudioView", "initLinkVideoView", "initLinkSettingsView", "applyLinkMic", "openCamera", "", "onRoomDismissed", "roomId", "", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class TypeSelectDialog extends AtomicPopover implements C37144f.a {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f78817r = new Companion(null);

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final LiveKitLogger f78818s = LiveKitLogger.f77564c.getLiveStreamLogger("TypeSelectDialog");

    /* JADX INFO: renamed from: m */
    @NotNull
    public final C37144f f78819m;

    /* JADX INFO: renamed from: n */
    public final int f78820n;

    /* JADX INFO: renamed from: o */
    public ImageView f78821o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f78822p;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f78823q;

    /* JADX INFO: compiled from: TypeSelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/TypeSelectDialog$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.TypeSelectDialog$a */
    /* JADX INFO: compiled from: TypeSelectDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/TypeSelectDialog$applyLinkMic$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36267a extends AbstractC35867d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f78824a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TypeSelectDialog f78825b;

        /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.TypeSelectDialog$a$a */
        /* JADX INFO: compiled from: TypeSelectDialog.kt */
        @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/TypeSelectDialog$applyLinkMic$1$onGranted$1", "Lcom/trtc/tuikit/common/permission/PermissionCallback;", "onGranted", "", "onDenied", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends AbstractC35867d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TypeSelectDialog f78826a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f78827b;

            public a(TypeSelectDialog typeSelectDialog, boolean z11) {
                this.f78826a = typeSelectDialog;
                this.f78827b = z11;
            }

            /* JADX INFO: renamed from: g */
            public static final Unit m81124g(final TypeSelectDialog typeSelectDialog, C45494c completionHandler) {
                Intrinsics.checkNotNullParameter(completionHandler, "$this$completionHandler");
                completionHandler.m100462i(new Function0() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.g0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TypeSelectDialog.C36267a.a.m81125h(typeSelectDialog);
                    }
                });
                completionHandler.m100461h(new Function2() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.h0
                    @Override // p852kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TypeSelectDialog.C36267a.a.m81126i(typeSelectDialog, ((Integer) obj).intValue(), (String) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: i */
            public static final Unit m81126i(TypeSelectDialog typeSelectDialog, int i11, String str) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                typeSelectDialog.f78819m.getF82429k().m80790g(false);
                ErrorLocalized.f77561a.onError(i11);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: h */
            public static final Unit m81125h(TypeSelectDialog typeSelectDialog) {
                typeSelectDialog.f78819m.getF82429k().m80790g(false);
                return Unit.INSTANCE;
            }

            @Override // com.trtc.tuikit.common.permission.AbstractC35867d
            /* JADX INFO: renamed from: a */
            public void mo79393a() {
                TypeSelectDialog.f78818s.m79403a("requestCameraPermissions:[onDenied]");
            }

            @Override // com.trtc.tuikit.common.permission.AbstractC35867d
            /* JADX INFO: renamed from: b */
            public void mo79394b() {
                TypeSelectDialog.f78818s.m79404b("requestCameraPermissions:[onGranted]");
                this.f78826a.f78819m.getF82429k().m80790g(true);
                this.f78826a.f78819m.getF82429k().m80789f(this.f78827b);
                CoGuestStore f82424f = this.f78826a.f78819m.getF82424f();
                int i11 = this.f78826a.f78820n;
                String strValueOf = String.valueOf(this.f78827b);
                final TypeSelectDialog typeSelectDialog = this.f78826a;
                f82424f.applyForSeat(i11, 60, strValueOf, C45495d.m100463a(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.f0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TypeSelectDialog.C36267a.a.m81124g(typeSelectDialog, (C45494c) obj);
                    }
                }));
            }
        }

        public C36267a(boolean z11, TypeSelectDialog typeSelectDialog) {
            this.f78824a = z11;
            this.f78825b = typeSelectDialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m81118g(final TypeSelectDialog typeSelectDialog, C45494c completionHandler) {
            Intrinsics.checkNotNullParameter(completionHandler, "$this$completionHandler");
            completionHandler.m100462i(new Function0() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.d0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TypeSelectDialog.C36267a.m81119h(typeSelectDialog);
                }
            });
            completionHandler.m100461h(new Function2() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.e0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TypeSelectDialog.C36267a.m81120i(typeSelectDialog, ((Integer) obj).intValue(), (String) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final Unit m81120i(TypeSelectDialog typeSelectDialog, int i11, String str) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            typeSelectDialog.f78819m.getF82429k().m80790g(false);
            ErrorLocalized.f77561a.onError(i11);
            return Unit.INSTANCE;
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: b */
        public void mo79394b() {
            if (this.f78824a) {
                C45497f c45497f = C45497f.f102528a;
                Context contextM79397b = ContextProvider.m79397b();
                Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
                c45497f.m100466a(contextM79397b, new a(this.f78825b, this.f78824a));
                return;
            }
            this.f78825b.f78819m.getF82429k().m80790g(true);
            this.f78825b.f78819m.getF82429k().m80789f(this.f78824a);
            CoGuestStore f82424f = this.f78825b.f78819m.getF82424f();
            int i11 = this.f78825b.f78820n;
            String strValueOf = String.valueOf(this.f78824a);
            final TypeSelectDialog typeSelectDialog = this.f78825b;
            f82424f.applyForSeat(i11, 60, strValueOf, C45495d.m100463a(new Function1() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TypeSelectDialog.C36267a.m81118g(typeSelectDialog, (C45494c) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Unit m81119h(TypeSelectDialog typeSelectDialog) {
            typeSelectDialog.f78819m.getF82429k().m80790g(false);
            return Unit.INSTANCE;
        }

        @Override // com.trtc.tuikit.common.permission.AbstractC35867d
        /* JADX INFO: renamed from: a */
        public void mo79393a() {
            TypeSelectDialog.f78818s.m79403a("requestCameraPermissions:[onDenied]");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeSelectDialog(@NotNull Context context, @NotNull C37144f audienceStore, int i11) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(audienceStore, "audienceStore");
        this.f78819m = audienceStore;
        this.f78820n = i11;
        m81110Q();
    }

    /* JADX INFO: renamed from: J */
    private final void m81106J(View view) {
        View viewFindViewById = view.findViewById(R$id.iv_link_settings);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f78821o = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.cl_link_video);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f78822p = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.cl_link_audio);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f78823q = (ConstraintLayout) viewFindViewById3;
    }

    /* JADX INFO: renamed from: N */
    public static final void m81108N(TypeSelectDialog typeSelectDialog, View view) {
        Context context = typeSelectDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        new VideoCoGuestSettingsDialog(context, typeSelectDialog.f78819m, typeSelectDialog.f78820n).show();
        typeSelectDialog.dismiss();
    }

    /* JADX INFO: renamed from: I */
    public final void m81111I(boolean z11) {
        AtomicToast atomicToast = AtomicToast.f87566a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String string = getContext().getString(R$string.common_toast_apply_link_mic);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AtomicToast.m88196j(atomicToast, context, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        C45497f c45497f = C45497f.f102528a;
        Context contextM79397b = ContextProvider.m79397b();
        Intrinsics.checkNotNullExpressionValue(contextM79397b, "getApplicationContext(...)");
        c45497f.m100467b(contextM79397b, new C36267a(z11, this));
        dismiss();
    }

    /* JADX INFO: renamed from: K */
    public final void m81112K() {
        ConstraintLayout constraintLayout = this.f78823q;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutLinkAudio");
            constraintLayout = null;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TypeSelectDialog.m81107L(this.f78859b, view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m81113M() {
        ImageView imageView = this.f78821o;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageLinkSettings");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TypeSelectDialog.m81108N(this.f78888b, view);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m81114O() {
        ConstraintLayout constraintLayout = this.f78822p;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutLinkVideo");
            constraintLayout = null;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.audiencecontainer.view.coguest.panel.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TypeSelectDialog.m81109P(this.f78857b, view);
            }
        });
    }

    @Override // ee0.C37144f.a
    public void onRoomDismissed(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        dismiss();
    }

    /* JADX INFO: renamed from: L */
    public static final void m81107L(TypeSelectDialog typeSelectDialog, View view) {
        if (!view.isEnabled()) {
            return;
        }
        view.setEnabled(false);
        typeSelectDialog.m81111I(false);
    }

    /* JADX INFO: renamed from: P */
    public static final void m81109P(TypeSelectDialog typeSelectDialog, View view) {
        if (!view.isEnabled()) {
            return;
        }
        view.setEnabled(false);
        typeSelectDialog.m81111I(true);
    }

    /* JADX INFO: renamed from: Q */
    private final void m81110Q() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.livekit_dialog_link_mic_selector, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate);
        m81106J(viewInflate);
        m81113M();
        m81114O();
        m81112K();
        m88181q(viewInflate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78819m.m83085d(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78819m.m83081B(this);
    }
}
