package io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.trtc.tuikit.atomicx.R$dimen;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import io.trtc.tuikit.atomicx.theme.tokens.ColorTokens;
import io.trtc.tuikit.atomicx.theme.tokens.DesignTokenSet;
import io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AtomicAlertDialog.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003CDEB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0018\u001a\u00020\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190\u001b¢\u0006\u0002\b\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020#H\u0002J*\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020#H\u0002J(\u0010)\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020#H\u0002J \u0010*\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020#H\u0002J\b\u0010+\u001a\u00020\u000bH\u0002J\b\u0010,\u001a\u00020\u000bH\u0002J\u0018\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u0010\f\u001a\u00020\rH\u0002J \u00100\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020#H\u0002J \u00101\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020#H\u0002J*\u00102\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020#H\u0002J*\u00103\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020#H\u0002J*\u00104\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020#H\u0002J\u0018\u00105\u001a\u00020\u00192\u0006\u0010'\u001a\u00020/2\u0006\u00106\u001a\u000207H\u0002J\u0018\u00108\u001a\u00020\u00192\u0006\u0010'\u001a\u00020/2\u0006\u00106\u001a\u000207H\u0002J,\u00109\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020:2\u0006\u0010%\u001a\u00020#2\b\b\u0002\u0010;\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!H\u0002J\u0018\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0003J\u0010\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020BH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog;", "", "context", "Landroid/content/Context;", "gravity", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;", "<init>", "(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;)V", "DIVIDER_THICKNESS_PX", "", "rootLayout", "Landroid/widget/LinearLayout;", "config", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$DialogConfig;", "atomicPopover", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "dialogScope", "Lkotlinx/coroutines/CoroutineScope;", "countdownJob", "Lkotlinx/coroutines/Job;", "cancelButtonView", "Landroid/widget/TextView;", "originalCancelText", "", "init", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", TIMPushProvider.f75062n, "Landroid/app/Dialog;", "dismiss", "isShowing", "", "getCurrentTokens", "Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;", "createRootLayout", "tokens", "renderDialogContent", "root", "dialog", "updateDialogTheme", "renderHeaderSection", "createHeaderContainer", "createTitleWrapper", "renderIconIfPresent", "parent", "Landroid/view/ViewGroup;", "renderTitleText", "renderMessageContentIfPresent", "renderBottomSection", "renderVerticalListMode", "renderStandardButtonMode", "addHorizontalDivider", "colorTokens", "Lio/trtc/tuikit/atomicx/theme/tokens/ColorTokens;", "addVerticalDivider", "createButtonView", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$ButtonConfig;", "isBottomLeftRounded", "isBottomRightRounded", "resolveButtonTextColor", "type", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;", "startCountdown", "durationSeconds", "", "TextColorPreset", "DialogConfig", "ButtonConfig", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAtomicAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicAlertDialog.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n1878#2,3:482\n*S KotlinDebug\n*F\n+ 1 AtomicAlertDialog.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog\n*L\n256#1:482,3\n*E\n"})
public final class AtomicAlertDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f87420a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AtomicPopover.PanelGravity f87421b;

    /* JADX INFO: renamed from: c */
    public final int f87422c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f87423d;

    /* JADX INFO: renamed from: e */
    public DialogConfig f87424e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public AtomicPopover f87425f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC41709m0 f87426g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public InterfaceC41775x1 f87427h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public TextView f87428i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public String f87429j;

    /* JADX INFO: compiled from: AtomicAlertDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "GREY", "BLUE", "RED", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum TextColorPreset {
        PRIMARY,
        GREY,
        BLUE,
        RED;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87431c = EnumEntriesKt.enumEntries(m88071a());

        @NotNull
        public static EnumEntries<TextColorPreset> getEntries() {
            return f87431c;
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog$a */
    /* JADX INFO: compiled from: AtomicAlertDialog.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$ButtonConfig;", "", "text", "", "type", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;", "onClick", "Lkotlin/Function1;", "Landroid/app/Dialog;", "", "isBold", "", "<init>", "(Ljava/lang/String;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;Lkotlin/jvm/functions/Function1;Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getType", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;", "setType", "(Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$TextColorPreset;)V", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "()Z", "setBold", "(Z)V", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C39352a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public String f87432a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public TextColorPreset f87433b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Function1<? super Dialog, Unit> f87434c;

        /* JADX INFO: renamed from: d */
        public boolean f87435d;

        @Nullable
        /* JADX INFO: renamed from: a */
        public final Function1<Dialog, Unit> m88072a() {
            return this.f87434c;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF87432a() {
            return this.f87432a;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextColorPreset getF87433b() {
            return this.f87433b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getF87435d() {
            return this.f87435d;
        }

        public C39352a(@NotNull String text, @NotNull TextColorPreset type, @Nullable Function1<? super Dialog, Unit> function1, boolean z11) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f87432a = text;
            this.f87433b = type;
            this.f87434c = function1;
            this.f87435d = z11;
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog$b, reason: from toString */
    /* JADX INFO: compiled from: AtomicAlertDialog.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u000fHÆ\u0003Jg\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fHÆ\u0001J\u0013\u00105\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006:"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$DialogConfig;", "", "title", "", "content", "iconView", "Landroid/view/View;", "autoDismiss", "", "countdownDuration", "", "confirmConfig", "Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$ButtonConfig;", "cancelConfig", "itemList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;ZJLio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$ButtonConfig;Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$ButtonConfig;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getContent", "setContent", "getIconView", "()Landroid/view/View;", "setIconView", "(Landroid/view/View;)V", "getAutoDismiss", "()Z", "setAutoDismiss", "(Z)V", "getCountdownDuration", "()J", "setCountdownDuration", "(J)V", "getConfirmConfig", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$ButtonConfig;", "setConfirmConfig", "(Lio/trtc/tuikit/atomicx/widget/basicwidget/alertdialog/AtomicAlertDialog$ButtonConfig;)V", "getCancelConfig", "setCancelConfig", "getItemList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class DialogConfig {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public String title;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public String content;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public View iconView;

        /* JADX INFO: renamed from: d, reason: from toString */
        public boolean autoDismiss;

        /* JADX INFO: renamed from: e, reason: from toString */
        public long countdownDuration;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public C39352a confirmConfig;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public C39352a cancelConfig;

        /* JADX INFO: renamed from: h, reason: from toString */
        @NotNull
        public final List<C39352a> itemList;

        public DialogConfig() {
            this(null, null, null, false, 0L, null, null, null, 255, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogConfig)) {
                return false;
            }
            DialogConfig dialogConfig = (DialogConfig) other;
            return Intrinsics.areEqual(this.title, dialogConfig.title) && Intrinsics.areEqual(this.content, dialogConfig.content) && Intrinsics.areEqual(this.iconView, dialogConfig.iconView) && this.autoDismiss == dialogConfig.autoDismiss && this.countdownDuration == dialogConfig.countdownDuration && Intrinsics.areEqual(this.confirmConfig, dialogConfig.confirmConfig) && Intrinsics.areEqual(this.cancelConfig, dialogConfig.cancelConfig) && Intrinsics.areEqual(this.itemList, dialogConfig.itemList);
        }

        public DialogConfig(@NotNull String title, @Nullable String str, @Nullable View view, boolean z11, long j11, @Nullable C39352a c39352a, @Nullable C39352a c39352a2, @NotNull List<C39352a> itemList) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(itemList, "itemList");
            this.title = title;
            this.content = str;
            this.iconView = view;
            this.autoDismiss = z11;
            this.countdownDuration = j11;
            this.confirmConfig = c39352a;
            this.cancelConfig = c39352a2;
            this.itemList = itemList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAutoDismiss() {
            return this.autoDismiss;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39352a getCancelConfig() {
            return this.cancelConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final C39352a getConfirmConfig() {
            return this.confirmConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getCountdownDuration() {
            return this.countdownDuration;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final View getIconView() {
            return this.iconView;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final List<C39352a> m88082g() {
            return this.itemList;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.content;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            View view = this.iconView;
            int iHashCode3 = (((((iHashCode2 + (view == null ? 0 : view.hashCode())) * 31) + Boolean.hashCode(this.autoDismiss)) * 31) + Long.hashCode(this.countdownDuration)) * 31;
            C39352a c39352a = this.confirmConfig;
            int iHashCode4 = (iHashCode3 + (c39352a == null ? 0 : c39352a.hashCode())) * 31;
            C39352a c39352a2 = this.cancelConfig;
            return ((iHashCode4 + (c39352a2 != null ? c39352a2.hashCode() : 0)) * 31) + this.itemList.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final void m88084i(boolean z11) {
            this.autoDismiss = z11;
        }

        /* JADX INFO: renamed from: j */
        public final void m88085j(@Nullable C39352a c39352a) {
            this.cancelConfig = c39352a;
        }

        /* JADX INFO: renamed from: k */
        public final void m88086k(@Nullable C39352a c39352a) {
            this.confirmConfig = c39352a;
        }

        /* JADX INFO: renamed from: l */
        public final void m88087l(@Nullable String str) {
            this.content = str;
        }

        /* JADX INFO: renamed from: m */
        public final void m88088m(long j11) {
            this.countdownDuration = j11;
        }

        /* JADX INFO: renamed from: n */
        public final void m88089n(@Nullable View view) {
            this.iconView = view;
        }

        /* JADX INFO: renamed from: o */
        public final void m88090o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.title = str;
        }

        @NotNull
        public String toString() {
            return "DialogConfig(title=" + this.title + ", content=" + this.content + ", iconView=" + this.iconView + ", autoDismiss=" + this.autoDismiss + ", countdownDuration=" + this.countdownDuration + ", confirmConfig=" + this.confirmConfig + ", cancelConfig=" + this.cancelConfig + ", itemList=" + this.itemList + ')';
        }

        public /* synthetic */ DialogConfig(String str, String str2, View view, boolean z11, long j11, C39352a c39352a, C39352a c39352a2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : view, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? 0L : j11, (i11 & 32) != 0 ? null : c39352a, (i11 & 64) != 0 ? null : c39352a2, (i11 & 128) != 0 ? new ArrayList() : list);
        }
    }

    public AtomicAlertDialog(@NotNull Context context, @NotNull AtomicPopover.PanelGravity gravity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.f87420a = context;
        this.f87421b = gravity;
        this.f87422c = 1;
        this.f87429j = "";
    }

    /* JADX INFO: renamed from: J */
    public static final void m88036J(AtomicAlertDialog atomicAlertDialog, DialogInterface dialogInterface) {
        atomicAlertDialog.f87425f = null;
        InterfaceC41775x1 interfaceC41775x1 = atomicAlertDialog.f87427h;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final TextView m88059o(C39352a c39352a, DesignTokenSet designTokenSet, boolean z11, boolean z12) {
        float size = designTokenSet.getFont().getBold16().getSize();
        TextView textView = new TextView(this.f87420a);
        textView.setText(c39352a.getF87432a());
        textView.setTextSize(size);
        textView.setGravity(17);
        textView.setTextColor(m88053H(c39352a.getF87433b(), designTokenSet.getColor()));
        textView.setTypeface(c39352a.getF87435d() ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        textView.setBackgroundColor(0);
        if (!z11 && !z12) {
            return textView;
        }
        float dimension = this.f87420a.getResources().getDimension(R$dimen.radius_20);
        float f11 = z12 ? dimension : 0.0f;
        if (!z11) {
            dimension = 0.0f;
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, f11, f11, dimension, dimension};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setCornerRadii(fArr);
        textView.setBackground(gradientDrawable);
        return textView;
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.AtomicAlertDialog$c */
    /* JADX INFO: compiled from: AtomicAlertDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C39354c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextColorPreset.values().length];
            try {
                iArr[TextColorPreset.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextColorPreset.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextColorPreset.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextColorPreset.GREY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m88050B(LinearLayout linearLayout, DialogConfig dialogConfig, final Dialog dialog, DesignTokenSet designTokenSet) {
        String f87432a;
        m88057m(linearLayout, designTokenSet.getColor());
        int dimensionPixelSize = this.f87420a.getResources().getDimensionPixelSize(R$dimen.spacing_56);
        LinearLayout linearLayout2 = new LinearLayout(this.f87420a);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, dimensionPixelSize));
        linearLayout.addView(linearLayout2);
        boolean z11 = dialogConfig.getCancelConfig() != null;
        boolean z12 = dialogConfig.getConfirmConfig() != null;
        boolean z13 = this.f87421b == AtomicPopover.PanelGravity.CENTER;
        final C39352a cancelConfig = dialogConfig.getCancelConfig();
        if (cancelConfig != null) {
            this.f87429j = cancelConfig.getF87432a();
            if (dialogConfig.getCountdownDuration() > 0) {
                f87432a = this.f87429j + " (" + dialogConfig.getCountdownDuration() + ')';
            } else {
                f87432a = cancelConfig.getF87432a();
            }
            TextView textViewM88059o = m88059o(new C39352a(f87432a, cancelConfig.getF87433b(), cancelConfig.m88072a(), cancelConfig.getF87435d()), designTokenSet, z13, !z12 && z13);
            this.f87428i = textViewM88059o;
            textViewM88059o.setOnClickListener(new View.OnClickListener() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AtomicAlertDialog.m88033C(cancelConfig, dialog, view);
                }
            });
            linearLayout2.addView(textViewM88059o, new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
        if (z11 && z12) {
            m88058n(linearLayout2, designTokenSet.getColor());
        }
        final C39352a confirmConfig = dialogConfig.getConfirmConfig();
        if (confirmConfig != null) {
            TextView textViewM88059o2 = m88059o(confirmConfig, designTokenSet, !z11 && z13, z13);
            textViewM88059o2.setOnClickListener(new View.OnClickListener() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AtomicAlertDialog.m88034D(confirmConfig, dialog, view);
                }
            });
            linearLayout2.addView(textViewM88059o2, new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
    }

    @ColorInt
    /* JADX INFO: renamed from: H */
    public final int m88053H(TextColorPreset textColorPreset, ColorTokens colorTokens) {
        int i11 = C39354c.$EnumSwitchMapping$0[textColorPreset.ordinal()];
        if (i11 == 1) {
            return colorTokens.getTextColorError();
        }
        if (i11 == 2) {
            return colorTokens.getTextColorLink();
        }
        if (i11 == 3) {
            return colorTokens.getTextColorPrimary();
        }
        if (i11 == 4) {
            return colorTokens.getTextColorSecondary();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final Dialog m88054I() {
        AtomicPopover atomicPopover = this.f87425f;
        if (atomicPopover != null) {
            atomicPopover.dismiss();
        }
        InterfaceC41709m0 interfaceC41709m0 = this.f87426g;
        DialogConfig dialogConfig = null;
        if (interfaceC41709m0 != null) {
            C41713n0.m91129e(interfaceC41709m0, null, 1, null);
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f87427h;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f87426g = C41713n0.m91125a(C41782z0.m91393c().plus(C41727q2.m91192b(null, 1, null)));
        AtomicPopover atomicPopover2 = new AtomicPopover(this.f87420a, this.f87421b);
        LinearLayout linearLayout = this.f87423d;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
            linearLayout = null;
        }
        atomicPopover2.m88181q(linearLayout);
        DialogConfig dialogConfig2 = this.f87424e;
        if (dialogConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            dialogConfig2 = null;
        }
        atomicPopover2.setCancelable(dialogConfig2.getAutoDismiss());
        DialogConfig dialogConfig3 = this.f87424e;
        if (dialogConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            dialogConfig3 = null;
        }
        atomicPopover2.setCanceledOnTouchOutside(dialogConfig3.getAutoDismiss());
        atomicPopover2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.a
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AtomicAlertDialog.m88036J(this.f87444b, dialogInterface);
            }
        });
        this.f87425f = atomicPopover2;
        InterfaceC41709m0 interfaceC41709m1 = this.f87426g;
        if (interfaceC41709m1 != null) {
            C41696j.m91104d(interfaceC41709m1, null, null, new AtomicAlertDialog$show$2(this, atomicPopover2, null), 3, null);
        }
        AtomicPopover atomicPopover3 = this.f87425f;
        if (atomicPopover3 != null) {
            atomicPopover3.show();
        }
        DialogConfig dialogConfig4 = this.f87424e;
        if (dialogConfig4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            dialogConfig4 = null;
        }
        if (dialogConfig4.getCountdownDuration() > 0 && this.f87428i != null) {
            DialogConfig dialogConfig5 = this.f87424e;
            if (dialogConfig5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
            } else {
                dialogConfig = dialogConfig5;
            }
            m88055K(dialogConfig.getCountdownDuration());
        }
        AtomicPopover atomicPopover4 = this.f87425f;
        Intrinsics.checkNotNull(atomicPopover4);
        return atomicPopover4;
    }

    /* JADX INFO: renamed from: K */
    public final void m88055K(long j11) {
        InterfaceC41775x1 interfaceC41775x1 = this.f87427h;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        InterfaceC41709m0 interfaceC41709m0 = this.f87426g;
        this.f87427h = interfaceC41709m0 != null ? C41696j.m91104d(interfaceC41709m0, null, null, new AtomicAlertDialog$startCountdown$1(j11, this, null), 3, null) : null;
    }

    /* JADX INFO: renamed from: m */
    public final void m88057m(ViewGroup viewGroup, ColorTokens colorTokens) {
        View view = new View(this.f87420a);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f87422c));
        view.setBackgroundColor(colorTokens.getStrokeColorSecondary());
        viewGroup.addView(view);
    }

    /* JADX INFO: renamed from: n */
    public final void m88058n(ViewGroup viewGroup, ColorTokens colorTokens) {
        View view = new View(this.f87420a);
        view.setLayoutParams(new LinearLayout.LayoutParams(this.f87422c, -1));
        view.setBackgroundColor(colorTokens.getStrokeColorSecondary());
        viewGroup.addView(view);
    }

    /* JADX INFO: renamed from: p */
    public final LinearLayout m88060p() {
        LinearLayout linearLayout = new LinearLayout(this.f87420a);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int dimensionPixelSize = linearLayout.getContext().getResources().getDimensionPixelSize(R$dimen.spacing_24);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        return linearLayout;
    }

    /* JADX INFO: renamed from: q */
    public final LinearLayout m88061q(DesignTokenSet designTokenSet) {
        LinearLayout linearLayout = new LinearLayout(this.f87420a);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* JADX INFO: renamed from: r */
    public final LinearLayout m88062r() {
        LinearLayout linearLayout = new LinearLayout(this.f87420a);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    /* JADX INFO: renamed from: s */
    public final void m88063s() {
        InterfaceC41709m0 interfaceC41709m0 = this.f87426g;
        if (interfaceC41709m0 != null) {
            C41713n0.m91129e(interfaceC41709m0, null, 1, null);
        }
        this.f87426g = null;
        InterfaceC41775x1 interfaceC41775x1 = this.f87427h;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f87427h = null;
        AtomicPopover atomicPopover = this.f87425f;
        if (atomicPopover != null) {
            atomicPopover.dismiss();
        }
        this.f87425f = null;
    }

    /* JADX INFO: renamed from: t */
    public final DesignTokenSet m88064t(Context context) {
        return ThemeStore.f87316e.shared(context).m87980c().getValue().getCurrentTheme().getTokens();
    }

    /* JADX INFO: renamed from: u */
    public final void m88065u(@NotNull Function1<? super DialogConfig, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DialogConfig dialogConfig = new DialogConfig(null, null, null, false, 0L, null, null, null, 255, null);
        block.invoke(dialogConfig);
        this.f87424e = dialogConfig;
        DesignTokenSet designTokenSetM88064t = m88064t(this.f87420a);
        LinearLayout linearLayoutM88061q = m88061q(designTokenSetM88064t);
        this.f87423d = linearLayoutM88061q;
        if (linearLayoutM88061q == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootLayout");
            linearLayoutM88061q = null;
        }
        DialogConfig dialogConfig2 = this.f87424e;
        if (dialogConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            dialogConfig2 = null;
        }
        m88068x(linearLayoutM88061q, dialogConfig2, null, designTokenSetM88064t);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m88066v() {
        AtomicPopover atomicPopover = this.f87425f;
        return atomicPopover != null && atomicPopover.isShowing();
    }

    /* JADX INFO: renamed from: C */
    public static final void m88033C(C39352a c39352a, Dialog dialog, View view) {
        Function1<Dialog, Unit> function1M88072a = c39352a.m88072a();
        if (function1M88072a != null) {
            if (dialog != null) {
                function1M88072a.invoke(dialog);
            } else {
                return;
            }
        }
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m88034D(C39352a c39352a, Dialog dialog, View view) {
        Function1<Dialog, Unit> function1M88072a = c39352a.m88072a();
        if (function1M88072a != null) {
            if (dialog != null) {
                function1M88072a.invoke(dialog);
            } else {
                return;
            }
        }
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m88035G(C39352a c39352a, Dialog dialog, View view) {
        Function1<Dialog, Unit> function1M88072a = c39352a.m88072a();
        if (function1M88072a != null) {
            Intrinsics.checkNotNull(dialog);
            function1M88072a.invoke(dialog);
        }
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m88049A(ViewGroup viewGroup, DialogConfig dialogConfig, DesignTokenSet designTokenSet) {
        String content = dialogConfig.getContent();
        if (content != null && content.length() != 0) {
            int textColorSecondary = designTokenSet.getColor().getTextColorSecondary();
            float size = designTokenSet.getFont().getBold16().getSize();
            TextView textView = new TextView(this.f87420a);
            textView.setText(dialogConfig.getContent());
            textView.setTextSize(size);
            textView.setTextColor(textColorSecondary);
            textView.setGravity(17);
            textView.setPadding(0, textView.getContext().getResources().getDimensionPixelSize(R$dimen.spacing_16), 0, 0);
            viewGroup.addView(textView);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m88051E(ViewGroup viewGroup, DialogConfig dialogConfig, DesignTokenSet designTokenSet) {
        int textColorPrimary = designTokenSet.getColor().getTextColorPrimary();
        float size = designTokenSet.getFont().getBold16().getSize();
        TextView textView = new TextView(this.f87420a);
        textView.setText(dialogConfig.getTitle());
        textView.setTextSize(size);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setTextColor(textColorPrimary);
        textView.setGravity(17);
        viewGroup.addView(textView);
    }

    /* JADX INFO: renamed from: F */
    public final void m88052F(LinearLayout linearLayout, DialogConfig dialogConfig, final Dialog dialog, DesignTokenSet designTokenSet) {
        boolean z11;
        boolean z12;
        if (!dialogConfig.m88082g().isEmpty()) {
            m88057m(linearLayout, designTokenSet.getColor());
        }
        int i11 = 0;
        for (Object obj : dialogConfig.m88082g()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final C39352a c39352a = (C39352a) obj;
            if (i11 > 0) {
                m88057m(linearLayout, designTokenSet.getColor());
            }
            boolean z13 = true;
            if (i11 == CollectionsKt.getLastIndex(dialogConfig.m88082g())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f87421b == AtomicPopover.PanelGravity.CENTER) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 || this.f87421b != AtomicPopover.PanelGravity.CENTER) {
                z13 = false;
            }
            TextView textViewM88059o = m88059o(c39352a, designTokenSet, z12, z13);
            textViewM88059o.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f87420a.getResources().getDimensionPixelSize(R$dimen.spacing_56)));
            textViewM88059o.setOnClickListener(new View.OnClickListener() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.alertdialog.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AtomicAlertDialog.m88035G(c39352a, dialog, view);
                }
            });
            linearLayout.addView(textViewM88059o);
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m88056L(LinearLayout linearLayout, DialogConfig dialogConfig, Dialog dialog, DesignTokenSet designTokenSet) {
        linearLayout.removeAllViews();
        m88068x(linearLayout, dialogConfig, dialog, designTokenSet);
    }

    /* JADX INFO: renamed from: w */
    public final void m88067w(LinearLayout linearLayout, DialogConfig dialogConfig, Dialog dialog, DesignTokenSet designTokenSet) {
        if (!dialogConfig.m88082g().isEmpty()) {
            m88052F(linearLayout, dialogConfig, dialog, designTokenSet);
        } else {
            if (dialogConfig.getConfirmConfig() == null && dialogConfig.getCancelConfig() == null) {
                return;
            }
            m88050B(linearLayout, dialogConfig, dialog, designTokenSet);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m88068x(LinearLayout linearLayout, DialogConfig dialogConfig, Dialog dialog, DesignTokenSet designTokenSet) {
        linearLayout.removeAllViews();
        m88069y(linearLayout, dialogConfig, designTokenSet);
        m88067w(linearLayout, dialogConfig, dialog, designTokenSet);
    }

    /* JADX INFO: renamed from: y */
    public final void m88069y(LinearLayout linearLayout, DialogConfig dialogConfig, DesignTokenSet designTokenSet) {
        LinearLayout linearLayoutM88060p = m88060p();
        linearLayout.addView(linearLayoutM88060p);
        LinearLayout linearLayoutM88062r = m88062r();
        linearLayoutM88060p.addView(linearLayoutM88062r);
        m88070z(linearLayoutM88062r, dialogConfig);
        m88051E(linearLayoutM88062r, dialogConfig, designTokenSet);
        m88049A(linearLayoutM88060p, dialogConfig, designTokenSet);
    }

    /* JADX INFO: renamed from: z */
    public final void m88070z(ViewGroup viewGroup, DialogConfig dialogConfig) {
        ViewGroup viewGroup2;
        View iconView = dialogConfig.getIconView();
        if (iconView != null) {
            int dimensionPixelSize = this.f87420a.getResources().getDimensionPixelSize(R$dimen.spacing_20);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.setMarginEnd(this.f87420a.getResources().getDimensionPixelSize(R$dimen.spacing_8));
            iconView.setLayoutParams(layoutParams);
            ViewParent parent = iconView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                viewGroup2.removeView(iconView);
            }
            viewGroup.addView(iconView);
        }
    }

    public /* synthetic */ AtomicAlertDialog(Context context, AtomicPopover.PanelGravity panelGravity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? AtomicPopover.PanelGravity.CENTER : panelGravity);
    }
}
