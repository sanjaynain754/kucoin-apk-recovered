package com.trtc.uikit.livekit.component.barrage.view;

import ad0.C0241a;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.C2711C;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.util.SPUtils;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.R$style;
import com.trtc.uikit.livekit.common.ErrorLocalized;
import com.trtc.uikit.livekit.component.barrage.view.BarrageSendView;
import dd0.ViewTreeObserverOnGlobalLayoutListenerC36662a;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import vc0.C45496e;

/* JADX INFO: compiled from: BarrageSendView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u00107\u001a\u000203H\u0003J\u0010\u00108\u001a\u0002032\u0006\u00109\u001a\u000205H\u0002J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020\u000fH\u0002J\b\u0010<\u001a\u000203H\u0002J\u0012\u0010=\u001a\u0002032\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\b\u0010@\u001a\u000203H\u0002J\b\u0010A\u001a\u000203H\u0016J\u0018\u0010B\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000fH\u0016J\b\u0010D\u001a\u000203H\u0016J\b\u0010E\u001a\u000203H\u0016J\b\u0010F\u001a\u000203H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b$\u0010\u0016R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b-\u0010.R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/BarrageSendView;", "Landroid/app/Dialog;", "Lcom/trtc/uikit/livekit/component/barrage/view/util/OnDecorViewListener$OnKeyboardCallback;", "context", "Landroid/content/Context;", "liveId", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "keyboardSP", "Lcom/tencent/qcloud/tuicore/util/SPUtils;", "kotlin.jvm.PlatformType", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "keyboardHeight", "", "lastScreenOrientation", "onGlobalLayoutListener", "Lcom/trtc/uikit/livekit/component/barrage/view/util/OnDecorViewListener;", "bottomView", "Landroid/view/View;", "getBottomView", "()Landroid/view/View;", "bottomView$delegate", "Lkotlin/Lazy;", "emojiSwitchImage", "Landroid/widget/ImageView;", "getEmojiSwitchImage", "()Landroid/widget/ImageView;", "emojiSwitchImage$delegate", "editText", "Lcom/trtc/uikit/livekit/component/barrage/view/EmojiEditText;", "getEditText", "()Lcom/trtc/uikit/livekit/component/barrage/view/EmojiEditText;", "editText$delegate", "layoutOutSide", "getLayoutOutSide", "layoutOutSide$delegate", "buttonSend", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "getButtonSend", "()Lcom/kubi/resources/widget/button/KcPrimaryButton;", "buttonSend$delegate", "bottomPlaceholder", "Landroid/view/ViewGroup;", "getBottomPlaceholder", "()Landroid/view/ViewGroup;", "bottomPlaceholder$delegate", "barrageStore", "Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;", TIMPushProvider.f75062n, "", "showEmoji", "", "getScreenOrientation", "initListener", "notifyExitTextContent", "isEmpty", "setEmojiSwitchImageResId", "resId", "sendText", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "initStatusBar", "dismiss", "onKeyboardHeightUpdated", "navigationBarHeight", "onAttachedToWindow", "onDetachedFromWindow", "reportData", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BarrageSendView extends Dialog implements ViewTreeObserverOnGlobalLayoutListenerC36662a.a {

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Companion f77632o = new Companion(null);

    /* JADX INFO: renamed from: p */
    public static final int f77633p = ScreenUtil.dip2px(300.0f);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f77634b;

    /* JADX INFO: renamed from: c */
    public final SPUtils f77635c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InputMethodManager f77636d;

    /* JADX INFO: renamed from: e */
    public int f77637e;

    /* JADX INFO: renamed from: f */
    public int f77638f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ViewTreeObserverOnGlobalLayoutListenerC36662a f77639g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f77640h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f77641i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f77642j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Lazy f77643k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final Lazy f77644l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy f77645m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final BarrageStore f77646n;

    /* JADX INFO: compiled from: BarrageSendView.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/BarrageSendView$Companion;", "", "<init>", "()V", "TAG", "", "FILE_NAME", "KEY_KEYBOARD_HEIGHT", "KEY_KEYBOARD_HEIGHT_DEFAULT", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.view.BarrageSendView$a */
    /* JADX INFO: compiled from: BarrageSendView.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J*\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, m90084d2 = {"com/trtc/uikit/livekit/component/barrage/view/BarrageSendView$initListener$1", "Landroid/text/TextWatcher;", "beforeTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "Landroid/text/Editable;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35890a implements TextWatcher {
        public C35890a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            BarrageSendView barrageSendView = BarrageSendView.this;
            boolean z11 = true;
            if (s11 != null && s11.length() != 0) {
                z11 = false;
            }
            barrageSendView.m79517L(z11);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.barrage.view.BarrageSendView$b */
    /* JADX INFO: compiled from: BarrageSendView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/trtc/uikit/livekit/component/barrage/view/BarrageSendView$sendText$1$1", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "onSuccess", "", "onFailure", "code", "", "desc", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35891b implements CompletionHandler {
        public C35891b() {
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onFailure(int code, String desc) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            ErrorLocalized.f77561a.onError(code);
        }

        @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
        public void onSuccess() {
            BarrageSendView.this.m79526z().setText((CharSequence) null);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m79485F(BarrageSendView barrageSendView, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return false;
        }
        barrageSendView.m79519N();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarrageSendView(@NotNull Context context, @NotNull String liveId) {
        super(context, R$style.LiveKitBarrageInputDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liveId, "liveId");
        this.f77634b = liveId;
        SPUtils sPUtils = SPUtils.getInstance("keyboard.common");
        this.f77635c = sPUtils;
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f77636d = (InputMethodManager) systemService;
        this.f77637e = sPUtils.getInt("sp.key.keyboard.height", f77633p);
        this.f77638f = m79514C(context);
        this.f77640h = LazyKt.lazy(new Function0() { // from class: bd0.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageSendView.m79507r(this.f4029b);
            }
        });
        this.f77641i = LazyKt.lazy(new Function0() { // from class: bd0.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageSendView.m79511v(this.f4033b);
            }
        });
        this.f77642j = LazyKt.lazy(new Function0() { // from class: bd0.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageSendView.m79510u(this.f4034b);
            }
        });
        this.f77643k = LazyKt.lazy(new Function0() { // from class: bd0.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageSendView.m79489K(this.f4035b);
            }
        });
        this.f77644l = LazyKt.lazy(new Function0() { // from class: bd0.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageSendView.m79508s(this.f4036b);
            }
        });
        this.f77645m = LazyKt.lazy(new Function0() { // from class: bd0.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageSendView.m79506q(this.f4037b);
            }
        });
        this.f77646n = BarrageStore.INSTANCE.create(liveId);
        setContentView(R$layout.livekit_barrage_dialog_send);
        C0241a c0241a = new C0241a();
        m79526z().setEmojiResource(c0241a);
        EmojiLayout emojiLayout = new EmojiLayout(context, c0241a.m877d());
        emojiLayout.setEmojiListener(m79526z());
        m79523w().addView(emojiLayout);
        m79523w().getChildAt(0).setVisibility(8);
        m79515D();
    }

    /* JADX INFO: renamed from: E */
    public static final void m79484E(BarrageSendView barrageSendView, View view) {
        C44128b.m97266j("BarrageSendView", "mEmojiSwitchImage onClick, layoutParams.height:" + barrageSendView.m79523w().getLayoutParams().height);
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) tag).intValue();
        int i11 = R$drawable.live_barrage_ic_emoticons;
        if (iIntValue == i11) {
            Log.i("BarrageSendView", "mEmojiSwitchImage setTag:softkeyboard");
            barrageSendView.m79520P(R$drawable.live_barrage_softkeyboard);
            if (barrageSendView.m79523w().getLayoutParams().height > 0) {
                barrageSendView.m79523w().getChildAt(0).setVisibility(0);
                barrageSendView.f77636d.hideSoftInputFromWindow(barrageSendView.m79526z().getWindowToken(), 0);
                barrageSendView.m79524x().setPadding(barrageSendView.m79524x().getPaddingStart(), barrageSendView.m79524x().getPaddingTop(), barrageSendView.m79524x().getPaddingEnd(), EdgeToEdgeCompat.f48106a.m58271i());
                Log.i("BarrageSendView", "hideSoftInputFromWindow");
                return;
            }
            return;
        }
        Log.i("BarrageSendView", "mEmojiSwitchImage setTag:emoticons");
        barrageSendView.m79520P(i11);
        if (barrageSendView.m79523w().getLayoutParams().height > 0) {
            barrageSendView.m79523w().getChildAt(0).setVisibility(8);
            barrageSendView.m79526z().requestFocus();
            barrageSendView.m79524x().setPadding(barrageSendView.m79524x().getPaddingStart(), barrageSendView.m79524x().getPaddingTop(), barrageSendView.m79524x().getPaddingEnd(), 0);
            barrageSendView.f77636d.showSoftInput(barrageSendView.m79526z(), 2);
            C44128b.m97266j("BarrageSendView", "showSoftInput");
        }
    }

    /* JADX INFO: renamed from: K */
    public static final View m79489K(BarrageSendView barrageSendView) {
        return barrageSendView.findViewById(R$id.ll_outside_view);
    }

    /* JADX INFO: renamed from: q */
    public static final ViewGroup m79506q(BarrageSendView barrageSendView) {
        return (ViewGroup) barrageSendView.findViewById(R$id.fl_bottom_placeholder);
    }

    /* JADX INFO: renamed from: r */
    public static final View m79507r(BarrageSendView barrageSendView) {
        return barrageSendView.findViewById(R$id.ll_bottom);
    }

    /* JADX INFO: renamed from: s */
    public static final KcPrimaryButton m79508s(BarrageSendView barrageSendView) {
        return (KcPrimaryButton) barrageSendView.findViewById(R$id.btn_send_barrage);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m79509t(BarrageSendView barrageSendView) {
        barrageSendView.f77636d.hideSoftInputFromWindow(barrageSendView.m79526z().getWindowToken(), 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final EmojiEditText m79510u(BarrageSendView barrageSendView) {
        return (EmojiEditText) barrageSendView.findViewById(R$id.et_input_message);
    }

    /* JADX INFO: renamed from: v */
    public static final ImageView m79511v(BarrageSendView barrageSendView) {
        return (ImageView) barrageSendView.findViewById(R$id.rl_emoticons);
    }

    /* JADX INFO: renamed from: A */
    public final ImageView m79512A() {
        Object value = this.f77641i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    /* JADX INFO: renamed from: B */
    public final View m79513B() {
        Object value = this.f77643k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    /* JADX INFO: renamed from: M */
    public final void m79518M() {
        C45496e.m100464a((TextUtils.isEmpty(this.f77634b) || !StringsKt.startsWith$default(this.f77634b, "voice_", false, 2, (Object) null)) ? 190012 : 191011);
    }

    /* JADX INFO: renamed from: N */
    public final void m79519N() {
        C43852m.m96591c("B1FeedLive", "commentSubmit", null, null, 12, null);
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: bd0.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageSendView.m79490O(this.f4032b);
            }
        }, 1, (Object) null);
    }

    @Override // dd0.ViewTreeObserverOnGlobalLayoutListenerC36662a.a
    /* JADX INFO: renamed from: a */
    public void mo79522a(int i11, int i12) {
        C44128b.m97266j("BarrageSendView", "onKeyboardHeightUpdated:" + i11 + ",navigationBarHeight:" + i12);
        if (this.f77637e != i11) {
            this.f77637e = i11;
            if (i11 > 0) {
                this.f77635c.put("sp.key.keyboard.height", i11);
            }
        }
        Object tag = m79512A().getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) tag).intValue() == R$drawable.live_barrage_softkeyboard && i11 == 0) {
            return;
        }
        if (i11 > 0) {
            i12 = 0;
        }
        m79524x().setPadding(m79524x().getPaddingStart(), m79524x().getPaddingTop(), m79524x().getPaddingEnd(), i12);
        if (i11 > 0) {
            m79520P(R$drawable.live_barrage_ic_emoticons);
            m79523w().getChildAt(0).setVisibility(8);
        }
        m79523w().getLayoutParams().height = i11;
        m79523w().requestLayout();
        C44128b.m97259c("BarrageSendView", "bottomPlaceholder.layoutParams.height:" + i11);
        m79523w().setVisibility(i11 <= 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: w */
    public final ViewGroup m79523w() {
        Object value = this.f77645m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewGroup) value;
    }

    /* JADX INFO: renamed from: x */
    public final View m79524x() {
        Object value = this.f77640h.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    /* JADX INFO: renamed from: y */
    public final KcPrimaryButton m79525y() {
        Object value = this.f77644l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (KcPrimaryButton) value;
    }

    /* JADX INFO: renamed from: z */
    public final EmojiEditText m79526z() {
        Object value = this.f77642j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EmojiEditText) value;
    }

    /* JADX INFO: renamed from: G */
    public static final void m79486G(BarrageSendView barrageSendView, View view) {
        barrageSendView.m79519N();
    }

    /* JADX INFO: renamed from: H */
    public static final void m79487H(BarrageSendView barrageSendView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int screenHeight = ScreenUtil.getScreenHeight(barrageSendView.getContext());
        Context context = barrageSendView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM79514C = barrageSendView.m79514C(context);
        if (barrageSendView.f77638f != iM79514C) {
            barrageSendView.f77638f = iM79514C;
            return;
        }
        int i19 = screenHeight / 3;
        if (i18 != 0 && i14 != 0 && i14 - i18 > i19) {
            barrageSendView.dismiss();
        }
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m79488I(BarrageSendView barrageSendView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < barrageSendView.m79524x().getTop()) {
            barrageSendView.dismiss();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m79490O(BarrageSendView barrageSendView) {
        String string;
        String string2;
        Editable text = barrageSendView.m79526z().getText();
        if (text != null && (string = text.toString()) != null && (string2 = StringsKt.trim((CharSequence) string).toString()) != null) {
            if (TextUtils.isEmpty(string2)) {
                AtomicToast atomicToast = AtomicToast.f87566a;
                Context context = barrageSendView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String string3 = barrageSendView.getContext().getString(R$string.live_barrage_warning_not_empty);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                AtomicToast.m88196j(atomicToast, context, string3, AtomicToast.Style.WARNING, null, null, AtomicToast.Duration.LONG, null, null, 216, null);
            } else {
                barrageSendView.f77646n.sendTextMessage(string2, null, barrageSendView.new C35891b());
                barrageSendView.dismiss();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final int m79514C(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: D */
    public final void m79515D() {
        m79526z().addTextChangedListener(new C35890a());
        m79526z().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: bd0.l
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                return BarrageSendView.m79485F(this.f4039b, textView, i11, keyEvent);
            }
        });
        m79525y().setOnClickListener(new View.OnClickListener() { // from class: bd0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarrageSendView.m79486G(this.f4040b, view);
            }
        });
        m79513B().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: bd0.n
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                BarrageSendView.m79487H(this.f4041b, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        m79513B().setOnTouchListener(new View.OnTouchListener() { // from class: bd0.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BarrageSendView.m79488I(this.f4030b, view, motionEvent);
            }
        });
        m79520P(R$drawable.live_barrage_softkeyboard);
        m79512A().setOnClickListener(new View.OnClickListener() { // from class: bd0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarrageSendView.m79484E(this.f4031b, view);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m79516J() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.clearFlags(C2711C.BUFFER_FLAG_FIRST_SAMPLE);
            window.getDecorView().setSystemUiVisibility(9984);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m79517L(boolean z11) {
        EmojiLayout emojiLayout;
        m79525y().setEnabled(!z11);
        View childAt = m79523w().getChildAt(0);
        if (childAt instanceof EmojiLayout) {
            emojiLayout = (EmojiLayout) childAt;
        } else {
            emojiLayout = null;
        }
        if (emojiLayout != null) {
            emojiLayout.setDeleteViewEnable(!z11);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m79520P(int i11) {
        m79512A().setTag(Integer.valueOf(i11));
        m79512A().setBackgroundResource(i11);
    }

    /* JADX INFO: renamed from: Q */
    public final void m79521Q(boolean z11) {
        super.show();
        C44128b.m97266j("BarrageSendView", "show showEmoji:" + z11 + ",keyboardHeight:" + this.f77637e);
        ViewGroup.LayoutParams layoutParams = m79523w().getLayoutParams();
        int i11 = this.f77637e;
        if (i11 <= 0) {
            i11 = f77633p;
        }
        layoutParams.height = i11;
        m79523w().setVisibility(0);
        m79523w().getChildAt(0).setVisibility(0);
        m79520P(R$drawable.live_barrage_softkeyboard);
        if (z11) {
            m79524x().setPadding(m79524x().getPaddingStart(), m79524x().getPaddingTop(), m79524x().getPaddingEnd(), EdgeToEdgeCompat.f48106a.m58271i());
            m79526z().clearFocus();
        } else {
            m79524x().setPadding(m79524x().getPaddingStart(), m79524x().getPaddingTop(), m79524x().getPaddingEnd(), 0);
            C44128b.m97266j("BarrageSendView", "EmojiSwitchImage.performClick:" + m79512A().performClick());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m79523w().getLayoutParams().height = 0;
        C27100x0.m66923d(new Function0() { // from class: bd0.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BarrageSendView.m79509t(this.f4038b);
            }
        });
        ViewTreeObserverOnGlobalLayoutListenerC36662a viewTreeObserverOnGlobalLayoutListenerC36662a = this.f77639g;
        if (viewTreeObserverOnGlobalLayoutListenerC36662a != null) {
            viewTreeObserverOnGlobalLayoutListenerC36662a.m82028a();
        }
        m79526z().clearFocus();
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        View decorView;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            if (this.f77639g == null) {
                this.f77639g = new ViewTreeObserverOnGlobalLayoutListenerC36662a(decorView, this);
            }
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.f77639g);
        }
        Editable text = m79526z().getText();
        boolean z11 = true;
        if (text != null && text.length() != 0) {
            z11 = false;
        }
        m79517L(z11);
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m79516J();
        m79518M();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        View decorView;
        super.onDetachedFromWindow();
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC36662a viewTreeObserverOnGlobalLayoutListenerC36662a = this.f77639g;
            if (viewTreeObserverOnGlobalLayoutListenerC36662a != null) {
                viewTreeObserverOnGlobalLayoutListenerC36662a.m82028a();
            }
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f77639g);
        }
    }
}
