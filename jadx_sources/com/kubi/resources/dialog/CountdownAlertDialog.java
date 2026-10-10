package com.kubi.resources.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.dialog.CountdownAlertDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CountdownAlertDialog.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J \u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00052\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ \u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00052\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\nJ\u0012\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/resources/dialog/CountdownAlertDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "title", "", "message", "positiveButtonText", "negativeButtonText", "closeButtonIcon", "", "onPositiveClick", "Lkotlin/Function0;", "", "onNegativeClick", "tvTitle", "Landroid/view/View;", "tvMessage", "btnPositive", "btnNegative", "ivClose", "initType", "isCanceledOnTouchOutside", "", "setTitle", "setMessage", "setPositiveButton", "text", "onClick", "setNegativeButton", "setCloseButton", TUIConstants.TUIChat.INPUT_MORE_ICON, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCountdownAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountdownAlertDialog.kt\ncom/kubi/resources/dialog/CountdownAlertDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,179:1\n256#2,2:180\n256#2,2:182\n256#2,2:184\n*S KotlinDebug\n*F\n+ 1 CountdownAlertDialog.kt\ncom/kubi/resources/dialog/CountdownAlertDialog\n*L\n71#1:180,2\n140#1:182,2\n155#1:184,2\n*E\n"})
public final class CountdownAlertDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public static final Companion f43556B0 = new Companion(null);

    /* JADX INFO: renamed from: A0 */
    @Nullable
    public View f43557A0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public String f43558q0 = "";

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public String f43559r0 = "";

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public String f43560s0 = "";

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public String f43561t0 = "";

    /* JADX INFO: renamed from: u0 */
    public int f43562u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public Function0<Unit> f43563v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public View f43564w0;

    /* JADX INFO: renamed from: x0 */
    @Nullable
    public View f43565x0;

    /* JADX INFO: renamed from: y0 */
    @Nullable
    public View f43566y0;

    /* JADX INFO: renamed from: z0 */
    @Nullable
    public View f43567z0;

    /* JADX INFO: compiled from: CountdownAlertDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/resources/dialog/CountdownAlertDialog$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/kubi/resources/dialog/CountdownAlertDialog;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CountdownAlertDialog newInstance() {
            CountdownAlertDialog countdownAlertDialog = new CountdownAlertDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.kucoin_alert_countdown_dialog);
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            countdownAlertDialog.setArguments(bundle);
            return countdownAlertDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 3;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: O3 */
    public boolean mo25577O3() {
        return false;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m54198l4(final CountdownAlertDialog countdownAlertDialog, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        View view;
        View view2;
        View view3;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        countdownAlertDialog.f43564w0 = viewHolder.getView(R$id.tv_title);
        countdownAlertDialog.f43565x0 = viewHolder.getView(R$id.tv_content);
        countdownAlertDialog.f43566y0 = viewHolder.getView(R$id.tv_right_btn);
        countdownAlertDialog.f43567z0 = viewHolder.getView(R$id.tv_left_btn);
        countdownAlertDialog.f43557A0 = viewHolder.getView(R$id.iv_close);
        if (countdownAlertDialog.f43558q0.length() > 0 && (view3 = countdownAlertDialog.f43564w0) != null && (view3 instanceof TextView)) {
            ((TextView) view3).setText(countdownAlertDialog.f43558q0);
        }
        if (countdownAlertDialog.f43559r0.length() > 0 && (view2 = countdownAlertDialog.f43565x0) != null && (view2 instanceof TextView)) {
            ((TextView) view2).setText(countdownAlertDialog.f43559r0);
        }
        if (countdownAlertDialog.f43560s0.length() > 0 && (view = countdownAlertDialog.f43566y0) != null) {
            if (view instanceof TextView) {
                ((TextView) view).setText(countdownAlertDialog.f43560s0);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: bw.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    CountdownAlertDialog.m54199m4(this.f4733b, view4);
                }
            });
        }
        View view4 = countdownAlertDialog.f43567z0;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View view5 = countdownAlertDialog.f43557A0;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        C44128b.m97266j("CountdownAlertDialog", "CountdownAlertDialog initialized: title=" + countdownAlertDialog.f43558q0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m54199m4(CountdownAlertDialog countdownAlertDialog, View view) {
        Function0<Unit> function0 = countdownAlertDialog.f43563v0;
        if (function0 != null) {
            function0.invoke();
        }
        countdownAlertDialog.dismissAllowingStateLoss();
    }

    @NotNull
    /* JADX INFO: renamed from: n4 */
    public final CountdownAlertDialog m54200n4(int i11) {
        this.f43562u0 = i11;
        View view = this.f43557A0;
        if (view != null && (view instanceof ImageView)) {
            ((ImageView) view).setImageResource(i11);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: o4 */
    public final CountdownAlertDialog m54201o4(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f43559r0 = message;
        View view = this.f43565x0;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(message);
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public final CountdownAlertDialog m54202p4(@NotNull String text, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f43560s0 = text;
        View view = this.f43566y0;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(text);
        }
        this.f43563v0 = function0;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: q4 */
    public final CountdownAlertDialog m54203q4(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f43558q0 = title;
        View view = this.f43564w0;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(title);
        }
        return this;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54237f4(new Function2() { // from class: bw.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CountdownAlertDialog.m54198l4(this.f4728b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }
}
