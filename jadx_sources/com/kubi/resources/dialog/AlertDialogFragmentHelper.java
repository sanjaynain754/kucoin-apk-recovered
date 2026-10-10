package com.kubi.resources.dialog;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5287o0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlertDialogFragmentHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u00103\u001a\u00020\u00002\b\b\u0001\u00104\u001a\u00020\u0005J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rJ\u0010\u00106\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0005J\u0010\u00107\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u00010\tJ\u0010\u00109\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u00109\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\u0005J\u0010\u0010:\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\u0005J\u0010\u0010:\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0005J\u0010\u0010<\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010:\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012J\u0010\u0010:\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0014J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\rJ\u000e\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\rJ\u000e\u0010A\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\rJ\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0005J\u0016\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u0005J\u001a\u0010H\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010I\u001a\u0004\u0018\u00010+J\u001a\u0010H\u001a\u00020\u00002\b\b\u0001\u0010J\u001a\u00020\u00052\b\u0010I\u001a\u0004\u0018\u00010+J\u0010\u0010K\u001a\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010+J\u001a\u0010L\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010'J\u001a\u0010M\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010'J\u001a\u0010L\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010'J\u001a\u0010M\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'J\u0010\u0010N\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0005J\u001a\u0010N\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010'J\u001a\u0010O\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\u0005J\u000e\u0010P\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\rJ\u001a\u0010Q\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\tJ\u000e\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rJ\u0010\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WJ\u0012\u0010X\u001a\u00020U2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\b\u0010[\u001a\u00020UH\u0016J\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020.0-J\b\u0010]\u001a\u00020UH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006_"}, m90084d2 = {"Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "orientation", "", "topImageResId", "statusImageResId", "statusLottieName", "", "closeImageResId", "title", "titleCenter", "", "titleInAllLine", "content", "", "contentSpan", "Landroid/text/SpannableString;", "contentSpanBuilder", "Landroid/text/SpannableStringBuilder;", "messageCenter", "isShow", "isShowCloseStatusButton", "isSpan", "url", "messageFont", "Landroid/graphics/Typeface;", "contentView", "Landroid/view/View;", "leftBtnStr", "rightBtnStr", "leftBtnColor", "rightBtnColor", "buttonMarginTop", "statusImageViewWidth", "statusImageViewHeight", "messageColor", "leftBtnClick", "Landroid/content/DialogInterface$OnClickListener;", "rightBtnClick", "closeBtnClick", "mInnerViewListener", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "deferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/kubi/resources/dialog/AlertDialogResult;", "safeContext", "Landroid/content/Context;", "getSafeContext", "()Landroid/content/Context;", "setTopImage", "imageResId", "showViewSpace", "setStatusImage", "setStatusLottieView", "lottieName", "setTitle", "setMessage", "setMessageColor", "setMessageFont", "setTitleCenter", TtmlNode.CENTER, "setTitleInAllLine", "allLine", "setMessageCenter", "setOrientation", "setButtonMarginTop", ViewProps.MARGIN_TOP, "setStatusImageViewSize", "statusImageWidthDp", "statusImageHeightDp", "setContentView", "initViewListener", "layoutId", "setInitViewListener", "setNegativeButton", "setPositiveButton", "setClosButton", "setButtonColor", "setIsShowCloseStatusButton", "setSpan", "setIsCancelable", "isCan", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "getAlertCompletableDeferred", "bindCompletableDeferred", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlertDialogFragmentHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialogFragmentHelper.kt\ncom/kubi/resources/dialog/AlertDialogFragmentHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
public final class AlertDialogFragmentHelper extends DialogFragmentHelper {

    /* JADX INFO: renamed from: a1 */
    @NotNull
    public static final Companion f43512a1 = new Companion(null);

    /* JADX INFO: renamed from: A0 */
    @Nullable
    public SpannableStringBuilder f43513A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f43514B0;

    /* JADX INFO: renamed from: E0 */
    public boolean f43517E0;

    /* JADX INFO: renamed from: F0 */
    @Nullable
    public String f43518F0;

    /* JADX INFO: renamed from: G0 */
    @Nullable
    public Typeface f43519G0;

    /* JADX INFO: renamed from: K0 */
    @Nullable
    public View f43520K0;

    /* JADX INFO: renamed from: P0 */
    @Nullable
    public String f43521P0;

    /* JADX INFO: renamed from: Q0 */
    @Nullable
    public String f43522Q0;

    /* JADX INFO: renamed from: S0 */
    public int f43524S0;

    /* JADX INFO: renamed from: T0 */
    public int f43525T0;

    /* JADX INFO: renamed from: V0 */
    @Nullable
    public DialogInterface.OnClickListener f43527V0;

    /* JADX INFO: renamed from: W0 */
    @Nullable
    public DialogInterface.OnClickListener f43528W0;

    /* JADX INFO: renamed from: X0 */
    @Nullable
    public DialogInterface.OnClickListener f43529X0;

    /* JADX INFO: renamed from: Y0 */
    @Nullable
    public DialogFragmentHelper.InterfaceC22882b f43530Y0;

    /* JADX INFO: renamed from: r0 */
    public int f43533r0;

    /* JADX INFO: renamed from: s0 */
    public int f43534s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public String f43535t0;

    /* JADX INFO: renamed from: u0 */
    public int f43536u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public String f43537v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f43538w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f43539x0;

    /* JADX INFO: renamed from: y0 */
    @Nullable
    public CharSequence f43540y0;

    /* JADX INFO: renamed from: z0 */
    @Nullable
    public SpannableString f43541z0;

    /* JADX INFO: renamed from: q0 */
    public int f43532q0 = 1;

    /* JADX INFO: renamed from: C0 */
    public boolean f43515C0 = true;

    /* JADX INFO: renamed from: D0 */
    public boolean f43516D0 = true;

    /* JADX INFO: renamed from: R0 */
    public int f43523R0 = -1;

    /* JADX INFO: renamed from: U0 */
    public int f43526U0 = -1;

    /* JADX INFO: renamed from: Z0 */
    @NotNull
    public final InterfaceC41769w<AlertDialogResult> f43531Z0 = C41777y.m91388c(null, 1, null);

    /* JADX INFO: compiled from: AlertDialogFragmentHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;", "", "<init>", "()V", "newInstanceAlert", "Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final AlertDialogFragmentHelper newInstanceAlert() {
            AlertDialogFragmentHelper alertDialogFragmentHelper = new AlertDialogFragmentHelper();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.kucoin_alert_dialog);
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            alertDialogFragmentHelper.setArguments(bundle);
            alertDialogFragmentHelper.m54174r4();
            return alertDialogFragmentHelper;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.dialog.AlertDialogFragmentHelper$a */
    /* JADX INFO: compiled from: AlertDialogFragmentHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/resources/dialog/AlertDialogFragmentHelper$onCreate$1$2$6$1", "Landroid/text/style/ClickableSpan;", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "onClick", "widget", "Landroid/view/View;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22878a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f43542b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AlertDialogFragmentHelper f43543c;

        public C22878a(TextView textView, AlertDialogFragmentHelper alertDialogFragmentHelper) {
            this.f43542b = textView;
            this.f43543c = alertDialogFragmentHelper;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            String str = this.f43543c.f43518F0;
            if (str != null) {
                InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setUnderlineText(true);
            ds2.setColor(ContextCompat.getColor(this.f43542b.getContext(), R$color.brandGreen));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m54141w4(final AlertDialogFragmentHelper alertDialogFragmentHelper, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        ViewStub viewStub = (ViewStub) viewHolder.getView(R$id.view_stup);
        viewStub.setLayoutResource(alertDialogFragmentHelper.f43532q0 == 1 ? R$layout.kucoin_alert_dialog_button_vertical : R$layout.kucoin_alert_dialog_button_horizontal);
        View viewInflate = viewStub.inflate();
        if (alertDialogFragmentHelper.f43523R0 >= 0) {
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = alertDialogFragmentHelper.f43523R0;
                viewInflate.setLayoutParams(marginLayoutParams);
            }
        }
        if (alertDialogFragmentHelper.f43524S0 != 0 && alertDialogFragmentHelper.f43525T0 != 0) {
            ImageView imageView = (ImageView) viewHolder.getView(R$id.ivStatusImage);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            float f11 = imageView.getContext().getResources().getDisplayMetrics().density;
            layoutParams2.width = (int) (alertDialogFragmentHelper.f43524S0 * f11);
            layoutParams2.height = (int) (alertDialogFragmentHelper.f43525T0 * f11);
            imageView.setLayoutParams(layoutParams2);
        }
        int i11 = R$id.rivTopImage;
        viewHolder.setImageResource(i11, alertDialogFragmentHelper.f43533r0);
        viewHolder.setGone(i11, alertDialogFragmentHelper.f43533r0 != 0);
        int i12 = R$id.ivStatusImage;
        viewHolder.setImageResource(i12, alertDialogFragmentHelper.f43534s0);
        viewHolder.setGone(i12, alertDialogFragmentHelper.f43534s0 != 0);
        viewHolder.setGone(R$id.statusLottie, !TextUtils.isEmpty(alertDialogFragmentHelper.f43535t0));
        int i13 = R$id.tv_title;
        viewHolder.setText(i13, alertDialogFragmentHelper.f43537v0);
        viewHolder.setGone(i13, !TextUtils.isEmpty(alertDialogFragmentHelper.f43537v0));
        int i14 = R$id.tv_content;
        viewHolder.setGone(i14, (TextUtils.isEmpty(alertDialogFragmentHelper.f43540y0) && TextUtils.isEmpty(alertDialogFragmentHelper.f43541z0) && TextUtils.isEmpty(alertDialogFragmentHelper.f43513A0)) ? false : true);
        int i15 = R$id.tv_right_btn;
        viewHolder.setGone(i15, !TextUtils.isEmpty(alertDialogFragmentHelper.f43522Q0));
        int i16 = R$id.tv_left_btn;
        viewHolder.setGone(i16, !TextUtils.isEmpty(alertDialogFragmentHelper.f43521P0));
        viewHolder.setGone(R$id.view_spacingHeight, alertDialogFragmentHelper.f43515C0);
        viewHolder.setText(i16, alertDialogFragmentHelper.f43521P0);
        viewHolder.setText(i15, alertDialogFragmentHelper.f43522Q0);
        viewHolder.setOnClickListener(i15, new View.OnClickListener() { // from class: bw.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialogFragmentHelper.m54142x4(this.f4666b, view);
            }
        });
        viewHolder.setOnClickListener(i16, new View.OnClickListener() { // from class: bw.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialogFragmentHelper.m54143y4(this.f4669b, view);
            }
        });
        if (alertDialogFragmentHelper.f43534s0 != 0) {
            viewHolder.setGone(R$id.iv_close_status, alertDialogFragmentHelper.f43516D0);
            viewHolder.setGone(R$id.iv_close, false);
            if (alertDialogFragmentHelper.f43539x0 && (constraintLayout = (ConstraintLayout) viewHolder.getView(R$id.cl_title_layout)) != null) {
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.clear(i13, 7);
                constraintSet.connect(i13, 7, 0, 7);
                constraintSet.applyTo(constraintLayout);
            }
        } else {
            int i17 = R$id.iv_close;
            viewHolder.setGone(i17, alertDialogFragmentHelper.f43536u0 != 0);
            viewHolder.setImageResource(i17, alertDialogFragmentHelper.f43536u0);
        }
        viewHolder.setOnClickListener(R$id.iv_close, new View.OnClickListener() { // from class: bw.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialogFragmentHelper.m54144z4(this.f4714b, view);
            }
        });
        viewHolder.setOnClickListener(R$id.iv_close_status, new View.OnClickListener() { // from class: bw.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialogFragmentHelper.m54130A4(this.f4715b, view);
            }
        });
        TextView textView = (TextView) viewHolder.getView(i14);
        if (textView != null) {
            int i18 = alertDialogFragmentHelper.f43526U0;
            if (i18 != -1) {
                textView.setTextColor(i18);
            }
            textView.setTypeface(alertDialogFragmentHelper.f43519G0);
            if (!TextUtils.isEmpty(alertDialogFragmentHelper.f43540y0)) {
                textView.setText(alertDialogFragmentHelper.f43540y0);
            }
            if (alertDialogFragmentHelper.f43517E0) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setHighlightColor(0);
                HighlightTextHelper.f43497a.m54116a(textView, HighlightTextHelper.TextTagEnum.SPAN, new C22878a(textView, alertDialogFragmentHelper));
            }
            CharSequence charSequence = alertDialogFragmentHelper.f43540y0;
            if (charSequence instanceof SpannableStringBuilder) {
                Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            if (!TextUtils.isEmpty(alertDialogFragmentHelper.f43541z0)) {
                textView.setText(alertDialogFragmentHelper.f43541z0);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (!TextUtils.isEmpty(alertDialogFragmentHelper.f43513A0)) {
                textView.setText(alertDialogFragmentHelper.f43513A0);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        TextView textView2 = (TextView) viewHolder.getView(i13);
        int i19 = GravityCompat.START;
        if (textView2 != null) {
            textView2.setGravity(alertDialogFragmentHelper.f43538w0 ? 17 : 8388611);
        }
        TextView textView3 = (TextView) viewHolder.getView(i14);
        if (textView3 != null) {
            if (alertDialogFragmentHelper.f43514B0) {
                i19 = 17;
            }
            textView3.setGravity(i19);
        }
        View view = alertDialogFragmentHelper.f43520K0;
        if (view != null && (frameLayout = (FrameLayout) viewHolder.getView(R$id.fl_container)) != null) {
            frameLayout.addView(view);
            frameLayout.setVisibility(0);
        }
        DialogFragmentHelper.InterfaceC22882b interfaceC22882b = alertDialogFragmentHelper.f43530Y0;
        if (interfaceC22882b != null) {
            interfaceC22882b.mo16191b3(viewHolder, alertDialogFragmentHelper);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m54130A4(AlertDialogFragmentHelper alertDialogFragmentHelper, View view) {
        DialogInterface.OnClickListener onClickListener = alertDialogFragmentHelper.f43529X0;
        if (onClickListener != null) {
            onClickListener.onClick(alertDialogFragmentHelper.getDialog(), 0);
        }
        alertDialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m54139s4(AlertDialogFragmentHelper alertDialogFragmentHelper, Throwable th2) {
        if (th2 == null) {
            alertDialogFragmentHelper.f43531Z0.mo91370n(AlertDialogResult.Close);
        } else {
            alertDialogFragmentHelper.f43531Z0.mo91369m(th2);
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: v4 */
    public static final AlertDialogFragmentHelper m54140v4() {
        return f43512a1.newInstanceAlert();
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m54142x4(AlertDialogFragmentHelper alertDialogFragmentHelper, View view) {
        alertDialogFragmentHelper.f43531Z0.mo91370n(AlertDialogResult.Positive);
        alertDialogFragmentHelper.dismiss();
        DialogInterface.OnClickListener onClickListener = alertDialogFragmentHelper.f43528W0;
        if (onClickListener != null) {
            onClickListener.onClick(alertDialogFragmentHelper.getDialog(), 1);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m54143y4(AlertDialogFragmentHelper alertDialogFragmentHelper, View view) {
        alertDialogFragmentHelper.f43531Z0.mo91370n(AlertDialogResult.Negative);
        DialogInterface.OnClickListener onClickListener = alertDialogFragmentHelper.f43527V0;
        if (onClickListener != null) {
            onClickListener.onClick(alertDialogFragmentHelper.getDialog(), 0);
        }
        alertDialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m54144z4(AlertDialogFragmentHelper alertDialogFragmentHelper, View view) {
        DialogInterface.OnClickListener onClickListener = alertDialogFragmentHelper.f43529X0;
        if (onClickListener != null) {
            onClickListener.onClick(alertDialogFragmentHelper.getDialog(), 0);
        }
        alertDialogFragmentHelper.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: B4 */
    public final AlertDialogFragmentHelper m54145B4(int i11) {
        this.f43523R0 = i11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: C4 */
    public final AlertDialogFragmentHelper m54146C4(@DrawableRes int i11) {
        this.f43536u0 = i11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: D4 */
    public final AlertDialogFragmentHelper m54147D4(@DrawableRes int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        this.f43536u0 = i11;
        this.f43529X0 = onClickListener;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: F4 */
    public final AlertDialogFragmentHelper m54149F4(@Nullable View view, @Nullable DialogFragmentHelper.InterfaceC22882b interfaceC22882b) {
        this.f43520K0 = view;
        this.f43530Y0 = interfaceC22882b;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: G4 */
    public final AlertDialogFragmentHelper m54150G4(@Nullable DialogFragmentHelper.InterfaceC22882b interfaceC22882b) {
        this.f43530Y0 = interfaceC22882b;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: I4 */
    public final AlertDialogFragmentHelper m54152I4(boolean z11) {
        this.f43516D0 = z11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: K4 */
    public final AlertDialogFragmentHelper m54154K4(@Nullable SpannableString spannableString) {
        this.f43541z0 = spannableString;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: L4 */
    public final AlertDialogFragmentHelper m54155L4(@Nullable SpannableStringBuilder spannableStringBuilder) {
        this.f43513A0 = spannableStringBuilder;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: M4 */
    public final AlertDialogFragmentHelper m54156M4(@Nullable CharSequence charSequence) {
        this.f43540y0 = charSequence;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final AlertDialogFragmentHelper m54157N4(boolean z11) {
        this.f43514B0 = z11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final AlertDialogFragmentHelper m54158O4(@Nullable Typeface typeface) {
        this.f43519G0 = typeface;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final AlertDialogFragmentHelper m54160Q4(@Nullable String str, @Nullable DialogInterface.OnClickListener onClickListener) {
        this.f43521P0 = str;
        this.f43527V0 = onClickListener;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: R4 */
    public final AlertDialogFragmentHelper m54161R4(int i11) {
        this.f43532q0 = i11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: T4 */
    public final AlertDialogFragmentHelper m54163T4(@Nullable String str, @Nullable DialogInterface.OnClickListener onClickListener) {
        this.f43522Q0 = str;
        this.f43528W0 = onClickListener;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final AlertDialogFragmentHelper m54164U4(boolean z11, @Nullable String str) {
        this.f43517E0 = z11;
        this.f43518F0 = str;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: V4 */
    public final AlertDialogFragmentHelper m54165V4(@DrawableRes int i11) {
        this.f43534s0 = i11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: W4 */
    public final AlertDialogFragmentHelper m54166W4(int i11, int i12) {
        this.f43524S0 = i11;
        this.f43525T0 = i12;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: Y4 */
    public final AlertDialogFragmentHelper m54168Y4(@Nullable String str) {
        this.f43537v0 = str;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: Z4 */
    public final AlertDialogFragmentHelper m54169Z4(boolean z11) {
        this.f43538w0 = z11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: a5 */
    public final AlertDialogFragmentHelper m54170a5(boolean z11) {
        this.f43539x0 = z11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: b5 */
    public final AlertDialogFragmentHelper m54171b5(@DrawableRes int i11) {
        this.f43533r0 = i11;
        return this;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m54172c5(@Nullable FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            show(fragmentManager, this.f43537v0 + this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d5 */
    public final AlertDialogFragmentHelper m54173d5(boolean z11) {
        this.f43515C0 = z11;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: t4 */
    public final InterfaceC41769w<AlertDialogResult> m54175t4() {
        return this.f43531Z0;
    }

    @NotNull
    /* JADX INFO: renamed from: E4 */
    public final AlertDialogFragmentHelper m54148E4(@LayoutRes int i11, @Nullable DialogFragmentHelper.InterfaceC22882b interfaceC22882b) {
        m54149F4(LayoutInflater.from(m54176u4()).inflate(i11, (ViewGroup) null), interfaceC22882b);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: H4 */
    public final AlertDialogFragmentHelper m54151H4(boolean z11) {
        setCancelable(z11);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: J4 */
    public final AlertDialogFragmentHelper m54153J4(@StringRes int i11) {
        this.f43540y0 = m54176u4().getString(i11);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final AlertDialogFragmentHelper m54159P4(@StringRes int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        this.f43521P0 = m54176u4().getString(i11);
        this.f43527V0 = onClickListener;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final AlertDialogFragmentHelper m54162S4(@StringRes int i11, @Nullable DialogInterface.OnClickListener onClickListener) {
        this.f43522Q0 = m54176u4().getString(i11);
        this.f43528W0 = onClickListener;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: X4 */
    public final AlertDialogFragmentHelper m54167X4(@StringRes int i11) {
        this.f43537v0 = m54176u4().getString(i11);
        return this;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54237f4(new Function2() { // from class: bw.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlertDialogFragmentHelper.m54141w4(this.f4663b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        View view;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null && (view = getView()) != null) {
            int paddingStart = (attributes.width - view.getPaddingStart()) + view.getPaddingEnd();
            TextView textView = (TextView) view.findViewById(R$id.tv_left_btn);
            if (textView != null) {
                textView.setMaxWidth(paddingStart / 2);
            }
            TextView textView2 = (TextView) view.findViewById(R$id.tv_right_btn);
            if (textView2 != null) {
                textView2.setMaxWidth(paddingStart / 2);
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m54174r4() {
        super.m54187h3().mo90426j(new Function1() { // from class: bw.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertDialogFragmentHelper.m54139s4(this.f4664b, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public final Context m54176u4() {
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h != null) {
            return activityM6125h;
        }
        Application applicationM6331a = C5287o0.m6331a();
        Intrinsics.checkNotNullExpressionValue(applicationM6331a, "getApp(...)");
        return applicationM6331a;
    }
}
