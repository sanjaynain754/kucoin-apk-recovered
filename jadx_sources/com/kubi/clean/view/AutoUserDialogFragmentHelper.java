package com.kubi.clean.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.view.GravityCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.clean.lib.R$id;
import com.kubi.clean.lib.R$layout;
import com.kubi.clean.view.AutoUserDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoUserDialogFragmentHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010&\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005J\u0010\u0010'\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0005J\u001a\u0010+\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010,\u001a\u0004\u0018\u00010!J\u001a\u0010+\u001a\u00020\u00002\b\b\u0001\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010!J\u0010\u0010.\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010!J\u001a\u0010/\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u001a\u00100\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u001a\u00101\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u000bJ\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006:"}, m90084d2 = {"Lcom/kubi/clean/view/AutoUserDialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "orientation", "", "statusImageResId", "closeImageResId", "title", "", "titleCenter", "", "content", "", "contentSpan", "Landroid/text/SpannableString;", "contentSpanBuilder", "Landroid/text/SpannableStringBuilder;", "messageCenter", "messageFont", "Landroid/graphics/Typeface;", "contentView", "Landroid/view/View;", "leftBtnStr", "rightBtnStr", "leftBtnColor", "rightBtnColor", "buttonMarginTop", "leftBtnClick", "Landroid/content/DialogInterface$OnClickListener;", "rightBtnClick", "closeBtnClick", "mInnerViewListener", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "safeContext", "Landroid/content/Context;", "getSafeContext", "()Landroid/content/Context;", "setStatusImage", "setTitle", "setOrientation", "setButtonMarginTop", "mraginTop", "setContentView", "initViewListener", "layoutId", "setInitViewListener", "setNegativeButton", "setPositiveButton", "setCloseButton", "setIsCancelable", "isCan", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "Companion", "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AutoUserDialogFragmentHelper extends DialogFragmentHelper {

    /* JADX INFO: renamed from: R0 */
    @NotNull
    public static final Companion f19574R0 = new Companion(null);

    /* JADX INFO: renamed from: A0 */
    @Nullable
    public View f19575A0;

    /* JADX INFO: renamed from: B0 */
    @Nullable
    public String f19576B0;

    /* JADX INFO: renamed from: C0 */
    @Nullable
    public String f19577C0;

    /* JADX INFO: renamed from: D0 */
    @ColorInt
    public int f19578D0;

    /* JADX INFO: renamed from: E0 */
    @ColorInt
    public int f19579E0;

    /* JADX INFO: renamed from: F0 */
    public int f19580F0 = -1;

    /* JADX INFO: renamed from: G0 */
    @Nullable
    public DialogInterface.OnClickListener f19581G0;

    /* JADX INFO: renamed from: K0 */
    @Nullable
    public DialogInterface.OnClickListener f19582K0;

    /* JADX INFO: renamed from: P0 */
    @Nullable
    public DialogInterface.OnClickListener f19583P0;

    /* JADX INFO: renamed from: Q0 */
    @Nullable
    public DialogFragmentHelper.InterfaceC22882b f19584Q0;

    /* JADX INFO: renamed from: q0 */
    public int f19585q0;

    /* JADX INFO: renamed from: r0 */
    public int f19586r0;

    /* JADX INFO: renamed from: s0 */
    public int f19587s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public String f19588t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f19589u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public CharSequence f19590v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public SpannableString f19591w0;

    /* JADX INFO: renamed from: x0 */
    @Nullable
    public SpannableStringBuilder f19592x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f19593y0;

    /* JADX INFO: renamed from: z0 */
    @Nullable
    public Typeface f19594z0;

    /* JADX INFO: compiled from: AutoUserDialogFragmentHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/clean/view/AutoUserDialogFragmentHelper$Companion;", "", "<init>", "()V", "newInstanceAlert", "Lcom/kubi/clean/view/AutoUserDialogFragmentHelper;", "AutoCleanUserLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AutoUserDialogFragmentHelper newInstanceAlert() {
            AutoUserDialogFragmentHelper autoUserDialogFragmentHelper = new AutoUserDialogFragmentHelper();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.auto_clean_user_alert_dialog);
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            autoUserDialogFragmentHelper.setArguments(bundle);
            return autoUserDialogFragmentHelper;
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m20434p4(AutoUserDialogFragmentHelper autoUserDialogFragmentHelper, View view) {
        DialogInterface.OnClickListener onClickListener = autoUserDialogFragmentHelper.f19581G0;
        if (onClickListener != null) {
            Intrinsics.checkNotNull(onClickListener);
            onClickListener.onClick(autoUserDialogFragmentHelper.getDialog(), 0);
        }
        autoUserDialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m20435q4(AutoUserDialogFragmentHelper autoUserDialogFragmentHelper, View view) {
        DialogInterface.OnClickListener onClickListener = autoUserDialogFragmentHelper.f19583P0;
        if (onClickListener != null) {
            Intrinsics.checkNotNull(onClickListener);
            onClickListener.onClick(autoUserDialogFragmentHelper.getDialog(), 0);
        }
        autoUserDialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m20432n4(final AutoUserDialogFragmentHelper autoUserDialogFragmentHelper, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        boolean z11;
        boolean z12;
        int i11;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ViewStub viewStub = (ViewStub) viewHolder.getView(R$id.view_stup);
        viewStub.setLayoutResource(R$layout.kucoin_alert_dialog_button_horizontal);
        View viewInflate = viewStub.inflate();
        if (autoUserDialogFragmentHelper.f19580F0 >= 0) {
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = autoUserDialogFragmentHelper.f19580F0;
                viewInflate.setLayoutParams(layoutParams);
            }
        }
        int i12 = autoUserDialogFragmentHelper.f19586r0;
        if (i12 != 0) {
            viewHolder.setImageResource(R$id.ivStatusImage, i12);
        }
        int i13 = R$id.ivStatusImage;
        boolean z13 = true;
        if (autoUserDialogFragmentHelper.f19586r0 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        viewHolder.setGone(i13, z11);
        int i14 = R$id.tv_title;
        BaseViewHolder gone = viewHolder.setText(i14, autoUserDialogFragmentHelper.f19588t0).setGone(i14, !TextUtils.isEmpty(autoUserDialogFragmentHelper.f19588t0));
        int i15 = R$id.tv_content;
        if (TextUtils.isEmpty(autoUserDialogFragmentHelper.f19590v0) && TextUtils.isEmpty(autoUserDialogFragmentHelper.f19591w0) && TextUtils.isEmpty(autoUserDialogFragmentHelper.f19592x0)) {
            z12 = false;
        } else {
            z12 = true;
        }
        BaseViewHolder gone2 = gone.setGone(i15, z12);
        int i16 = R$id.tv_right_btn;
        BaseViewHolder gone3 = gone2.setGone(i16, !TextUtils.isEmpty(autoUserDialogFragmentHelper.f19577C0));
        int i17 = R$id.tv_left_btn;
        gone3.setGone(i17, !TextUtils.isEmpty(autoUserDialogFragmentHelper.f19576B0)).setText(i17, autoUserDialogFragmentHelper.f19576B0).setText(i16, autoUserDialogFragmentHelper.f19577C0).setOnClickListener(i16, new View.OnClickListener() { // from class: zb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoUserDialogFragmentHelper.m20433o4(this.f104570b, view);
            }
        }).setOnClickListener(i17, new View.OnClickListener() { // from class: zb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoUserDialogFragmentHelper.m20434p4(this.f104571b, view);
            }
        });
        if (autoUserDialogFragmentHelper.f19585q0 == 1 && !TextUtils.isEmpty(autoUserDialogFragmentHelper.f19576B0)) {
            viewHolder.itemView.setPadding(0, 0, 0, 0);
        } else {
            viewHolder.itemView.setPadding(0, 0, 0, C5275i0.m6236a(32.0f));
        }
        if (autoUserDialogFragmentHelper.f19587s0 != 0) {
            int i18 = R$id.iv_close;
            viewHolder.setGone(i18, true);
            viewHolder.setImageResource(i18, autoUserDialogFragmentHelper.f19587s0);
            viewHolder.setOnClickListener(i18, new View.OnClickListener() { // from class: zb.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutoUserDialogFragmentHelper.m20435q4(this.f104572b, view);
                }
            });
        } else {
            viewHolder.setGone(R$id.iv_close, false);
        }
        TextView textView = (TextView) viewHolder.getView(i15);
        int i19 = autoUserDialogFragmentHelper.f19578D0;
        if (i19 != 0) {
            viewHolder.setTextColor(i17, i19);
        }
        int i21 = autoUserDialogFragmentHelper.f19579E0;
        if (i21 != 0) {
            viewHolder.setTextColor(i16, i21);
        }
        Typeface typeface = autoUserDialogFragmentHelper.f19594z0;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        if (!TextUtils.isEmpty(autoUserDialogFragmentHelper.f19590v0)) {
            textView.setText(autoUserDialogFragmentHelper.f19590v0);
        }
        CharSequence charSequence = autoUserDialogFragmentHelper.f19590v0;
        if (charSequence instanceof SpannableStringBuilder) {
            Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
            CharSequence charSequence2 = autoUserDialogFragmentHelper.f19590v0;
            Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableStringBuilder) charSequence).getSpans(0, ((SpannableStringBuilder) charSequence2).length(), ClickableSpan.class);
            if (clickableSpanArr != null) {
                if (clickableSpanArr.length != 0) {
                    z13 = false;
                }
                if (!z13) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (!TextUtils.isEmpty(autoUserDialogFragmentHelper.f19591w0)) {
            textView.setText(autoUserDialogFragmentHelper.f19591w0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (!TextUtils.isEmpty(autoUserDialogFragmentHelper.f19592x0)) {
            textView.setText(autoUserDialogFragmentHelper.f19592x0);
        }
        TextView textView2 = (TextView) viewHolder.getView(i14);
        boolean z14 = autoUserDialogFragmentHelper.f19589u0;
        int i22 = GravityCompat.START;
        if (z14) {
            i11 = 17;
        } else {
            i11 = 8388611;
        }
        textView2.setGravity(i11);
        TextView textView3 = (TextView) viewHolder.getView(i15);
        if (autoUserDialogFragmentHelper.f19593y0) {
            i22 = 17;
        }
        textView3.setGravity(i22);
        if (autoUserDialogFragmentHelper.f19575A0 != null) {
            FrameLayout frameLayout = (FrameLayout) viewHolder.getView(R$id.fl_container);
            frameLayout.addView(autoUserDialogFragmentHelper.f19575A0);
            frameLayout.setVisibility(0);
        }
        DialogFragmentHelper.InterfaceC22882b interfaceC22882b = autoUserDialogFragmentHelper.f19584Q0;
        if (interfaceC22882b != null) {
            Intrinsics.checkNotNull(interfaceC22882b);
            interfaceC22882b.mo16191b3(viewHolder, autoUserDialogFragmentHelper);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m20433o4(AutoUserDialogFragmentHelper autoUserDialogFragmentHelper, View view) {
        autoUserDialogFragmentHelper.dismiss();
        DialogInterface.OnClickListener onClickListener = autoUserDialogFragmentHelper.f19582K0;
        if (onClickListener != null) {
            Intrinsics.checkNotNull(onClickListener);
            onClickListener.onClick(autoUserDialogFragmentHelper.getDialog(), 1);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54237f4(new Function2() { // from class: zb.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AutoUserDialogFragmentHelper.m20432n4(this.f104569b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        int i11 = window.getAttributes().width;
        View view = getView();
        Intrinsics.checkNotNull(view);
        TextView textView = (TextView) view.findViewById(R$id.tv_left_btn);
        TextView textView2 = (TextView) view.findViewById(R$id.tv_right_btn);
        int paddingStart = (i11 - view.getPaddingStart()) + view.getPaddingEnd();
        if (textView != null) {
            textView.setMaxWidth(paddingStart / 2);
        }
        if (textView2 != null) {
            textView2.setMaxWidth(paddingStart / 2);
        }
    }
}
