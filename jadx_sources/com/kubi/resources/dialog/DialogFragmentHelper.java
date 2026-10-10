package com.kubi.resources.dialog;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.StyleRes;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bw.C4715d0;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5270g;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$style;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import io.chad.library.adapter.base.BaseViewHolder;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: DialogFragmentHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 X2\u00020\u0001:\u0005UVWXYB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010#\u001a\u00020\u000026\u0010\u0006\u001a2\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b()\u0012\u0004\u0012\u00020*0$J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J)\u0010+\u001a\u00020\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020*0,J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\tJ\b\u0010-\u001a\u00020\u000fH\u0016J\b\u0010.\u001a\u00020*H\u0016J\b\u0010/\u001a\u00020*H\u0016J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020*2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020*H\u0002J\b\u00107\u001a\u00020*H\u0002J\u0018\u00108\u001a\u00020*2\u0006\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020\u001dH\u0002J \u0010;\u001a\u00020*2\u0006\u0010<\u001a\u0002052\u0006\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020\u0005H\u0002J \u0010;\u001a\u00020*2\u0006\u0010<\u001a\u0002052\u0006\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0005H\u0002J\u0012\u0010@\u001a\u00020*2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010C\u001a\u00020*2\u0006\u0010D\u001a\u00020BH\u0016J&\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010K\u001a\u00020*H\u0002J\b\u0010L\u001a\u00020*H\u0002J\b\u0010M\u001a\u00020\u000fH\u0016J\b\u0010N\u001a\u00020*H\u0016J\b\u0010O\u001a\u00020*H\u0016J\b\u0010P\u001a\u00020*H\u0002J\b\u0010Q\u001a\u00020\u0005H\u0016J\b\u0010R\u001a\u00020\u000fH\u0016J\u0010\u0010S\u001a\u00020*2\u0006\u0010<\u001a\u00020FH\u0002J\u0010\u0010T\u001a\u00020*2\u0006\u0010<\u001a\u00020FH\u0002R\u0012\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u0012\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006Z"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "<init>", "()V", "resLayoutId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "viewListener", "Lcom/kubi/resources/dialog/DialogFragmentHelper$ViewListener;", "type", "getType$annotations", "animId", "height", "expand", "", "heightRatio", "", "getHeightRatio", "()F", "setHeightRatio", "(F)V", "isExitAnimating", "enterPlayed", "isAnimationEnabled", "isEnableDimAmount", "isDraggable", "isRnDialog", "hostSystemBarSnapshot", "Lcom/kubi/resources/dialog/DialogFragmentHelper$HostSystemBarSnapshot;", "dialogCrashValidation", "getDialogCrashValidation", "()Z", "dialogCrashValidation$delegate", "Lkotlin/Lazy;", "setListener", "Lkotlin/Function2;", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lkotlin/ParameterName;", "name", "viewHolder", "helper", "", "setViewListener", "Lkotlin/Function1;", "isBottomSheet", "onStart", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "syncHostSystemBars", InterfaceC33953u5.f72199F, "Landroid/view/Window;", "captureHostSystemBars", "restoreHostSystemBars", "applyHostSystemBars", "hostWindow", "snapshot", "mirrorWindowFlag", "target", "source", "flag", "enabled", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "playEnterAnimationIfNeededBottom", "playEnterAnimationIfNeededCenter", "playExitAnimationThenDismiss", "dismiss", "dismissAllowingStateLoss", "unpackBundle", "initType", "isCanceledOnTouchOutside", "ensureParentNoClip", "applyBottomInsetPadding", "DialogType", "InitViewListener", "ViewListener", "Companion", "HostSystemBarSnapshot", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDialogFragmentHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentHelper.kt\ncom/kubi/resources/dialog/DialogFragmentHelper\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,677:1\n28#2:678\n35#3,4:679\n39#3:685\n44#4,2:683\n*S KotlinDebug\n*F\n+ 1 DialogFragmentHelper.kt\ncom/kubi/resources/dialog/DialogFragmentHelper\n*L\n159#1:678\n98#1:679,4\n98#1:685\n98#1:683,2\n*E\n"})
public class DialogFragmentHelper extends BaseDialogFragment {

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public static final Companion f43568p0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @LayoutRes
    public int f43569Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public InterfaceC22882b f43570a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public InterfaceC22883c f43571b0;

    /* JADX INFO: renamed from: c0 */
    public int f43572c0;

    /* JADX INFO: renamed from: d0 */
    @StyleRes
    public int f43573d0;

    /* JADX INFO: renamed from: e0 */
    public int f43574e0;

    /* JADX INFO: renamed from: h0 */
    public boolean f43577h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f43578i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f43579j0;

    /* JADX INFO: renamed from: m0 */
    public boolean f43582m0;

    /* JADX INFO: renamed from: n0 */
    @Nullable
    public HostSystemBarSnapshot f43583n0;

    /* JADX INFO: renamed from: f0 */
    public boolean f43575f0 = true;

    /* JADX INFO: renamed from: g0 */
    public float f43576g0 = 0.5f;

    /* JADX INFO: renamed from: k0 */
    public boolean f43580k0 = true;

    /* JADX INFO: renamed from: l0 */
    public boolean f43581l0 = true;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final Lazy f43584o0 = LazyKt.lazy(new Function0() { // from class: bw.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(DialogFragmentHelper.m54210J3());
        }
    });

    /* JADX INFO: compiled from: DialogFragmentHelper.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0003\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogFragmentHelper$Companion;", "", "<init>", "()V", "TYPE_UNDEFINE", "", "TYPE_BOTTOM", "TYPE_CENTER", "TYPE_TOP", "TYPE_CENTER_MG_100", "TYPE_CENTER_MG_64", "TYPE_FILL_A_00", "TYPE_FILL_A_08", "TYPE_CENTER_ANIME", "TYPE_BOTTOM_WITHOUT_DRAG", "TYPE_FILL_A_06", "GRAVITY_BOTTOM_WITHOUT_HEIGHT_CONSTRAINT", "GRAVITY_BOTTOM_WITH_HALF_HEIGHT", "TAG", "", "newInstance", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "layoutId", "type", "anim", "height", "expand", "", "isBottomSheet", "isAnimationEnabled", "isDraggable", "isRnDialog", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int i11) {
            return newInstance$default(this, i11, 0, 0, 0, false, false, false, false, false, 510, null);
        }

        public Companion() {
        }

        public static /* synthetic */ DialogFragmentHelper newInstance$default(Companion companion, int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i12 = 0;
            }
            if ((i15 & 4) != 0) {
                i13 = 0;
            }
            if ((i15 & 8) != 0) {
                i14 = 0;
            }
            if ((i15 & 16) != 0) {
                z11 = true;
            }
            if ((i15 & 32) != 0) {
                z12 = false;
            }
            if ((i15 & 64) != 0) {
                z13 = false;
            }
            if ((i15 & 128) != 0) {
                z14 = true;
            }
            if ((i15 & 256) != 0) {
                z15 = false;
            }
            return companion.newInstance(i11, i12, i13, i14, z11, z12, z13, z14, z15);
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int i11, int i12) {
            return newInstance$default(this, i11, i12, 0, 0, false, false, false, false, false, 508, null);
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int i11, int i12, @StyleRes int i13) {
            return newInstance$default(this, i11, i12, i13, 0, false, false, false, false, false, 504, null);
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int i11, int i12, @StyleRes int i13, int i14) {
            return newInstance$default(this, i11, i12, i13, i14, false, false, false, false, false, 496, null);
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int i11, int i12, @StyleRes int i13, int i14, boolean z11) {
            return newInstance$default(this, i11, i12, i13, i14, z11, false, false, false, false, TXVodDownloadDataSource.QUALITY_480P, null);
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int i11, int i12, @StyleRes int i13, int i14, boolean z11, boolean z12) {
            return newInstance$default(this, i11, i12, i13, i14, z11, z12, false, false, false, 448, null);
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int i11, int i12, @StyleRes int i13, int i14, boolean z11, boolean z12, boolean z13) {
            return newInstance$default(this, i11, i12, i13, i14, z11, z12, z13, false, false, RendererCapabilities.DECODER_SUPPORT_MASK, null);
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int i11, int i12, @StyleRes int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14) {
            return newInstance$default(this, i11, i12, i13, i14, z11, z12, z13, z14, false, 256, null);
        }

        @JvmOverloads
        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int layoutId, int type, @StyleRes int anim, int height, boolean expand, boolean isBottomSheet, boolean isAnimationEnabled, boolean isDraggable, boolean isRnDialog) {
            DialogFragmentHelper dialogFragmentHelper = new DialogFragmentHelper();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, layoutId);
            bundle.putInt("type", type);
            bundle.putInt("anim", anim);
            bundle.putBoolean("isBottomSheet", isBottomSheet);
            bundle.putInt("height", height);
            bundle.putBoolean("expand", expand);
            bundle.putBoolean("isAnimationEnabled", isAnimationEnabled);
            bundle.putBoolean("isDraggable", isDraggable);
            bundle.putBoolean("isRnDialog", isRnDialog);
            dialogFragmentHelper.setArguments(bundle);
            return dialogFragmentHelper;
        }

        @NotNull
        public final DialogFragmentHelper newInstance(@LayoutRes int layoutId, boolean isBottomSheet) {
            return newInstance$default(this, layoutId, 0, 0, 0, false, isBottomSheet, false, false, false, 472, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.dialog.DialogFragmentHelper$a, reason: from toString */
    /* JADX INFO: compiled from: DialogFragmentHelper.kt */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogFragmentHelper$HostSystemBarSnapshot;", "", "statusBarColor", "", "systemUiVisibility", "isAppearanceLightStatusBars", "", "systemBarsBehavior", "drawsSystemBarBackgrounds", "<init>", "(IIZIZ)V", "getStatusBarColor", "()I", "getSystemUiVisibility", "()Z", "getSystemBarsBehavior", "getDrawsSystemBarBackgrounds", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HostSystemBarSnapshot {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int statusBarColor;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int systemUiVisibility;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final boolean isAppearanceLightStatusBars;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final int systemBarsBehavior;

        /* JADX INFO: renamed from: e, reason: from toString */
        public final boolean drawsSystemBarBackgrounds;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HostSystemBarSnapshot)) {
                return false;
            }
            HostSystemBarSnapshot hostSystemBarSnapshot = (HostSystemBarSnapshot) other;
            return this.statusBarColor == hostSystemBarSnapshot.statusBarColor && this.systemUiVisibility == hostSystemBarSnapshot.systemUiVisibility && this.isAppearanceLightStatusBars == hostSystemBarSnapshot.isAppearanceLightStatusBars && this.systemBarsBehavior == hostSystemBarSnapshot.systemBarsBehavior && this.drawsSystemBarBackgrounds == hostSystemBarSnapshot.drawsSystemBarBackgrounds;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDrawsSystemBarBackgrounds() {
            return this.drawsSystemBarBackgrounds;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStatusBarColor() {
            return this.statusBarColor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSystemBarsBehavior() {
            return this.systemBarsBehavior;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSystemUiVisibility() {
            return this.systemUiVisibility;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsAppearanceLightStatusBars() {
            return this.isAppearanceLightStatusBars;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.statusBarColor) * 31) + Integer.hashCode(this.systemUiVisibility)) * 31) + Boolean.hashCode(this.isAppearanceLightStatusBars)) * 31) + Integer.hashCode(this.systemBarsBehavior)) * 31) + Boolean.hashCode(this.drawsSystemBarBackgrounds);
        }

        @NotNull
        public String toString() {
            return "HostSystemBarSnapshot(statusBarColor=" + this.statusBarColor + ", systemUiVisibility=" + this.systemUiVisibility + ", isAppearanceLightStatusBars=" + this.isAppearanceLightStatusBars + ", systemBarsBehavior=" + this.systemBarsBehavior + ", drawsSystemBarBackgrounds=" + this.drawsSystemBarBackgrounds + ')';
        }

        public HostSystemBarSnapshot(int i11, int i12, boolean z11, int i13, boolean z12) {
            this.statusBarColor = i11;
            this.systemUiVisibility = i12;
            this.isAppearanceLightStatusBars = z11;
            this.systemBarsBehavior = i13;
            this.drawsSystemBarBackgrounds = z12;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.dialog.DialogFragmentHelper$b */
    /* JADX INFO: compiled from: DialogFragmentHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "", "setupView", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC22882b {
        /* JADX INFO: renamed from: b3 */
        void mo16191b3(@NotNull BaseViewHolder baseViewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper);
    }

    /* JADX INFO: renamed from: com.kubi.resources.dialog.DialogFragmentHelper$c */
    /* JADX INFO: compiled from: DialogFragmentHelper.kt */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogFragmentHelper$ViewListener;", "", "callBack", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC22883c {
        /* JADX INFO: renamed from: a */
        void mo54246a(@NotNull BaseViewHolder baseViewHolder);
    }

    /* JADX INFO: renamed from: com.kubi.resources.dialog.DialogFragmentHelper$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C22884d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.resources.dialog.DialogFragmentHelper$e */
    /* JADX INFO: compiled from: DialogFragmentHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/resources/dialog/DialogFragmentHelper$setListener$1", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "setupView", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22885e implements InterfaceC22882b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2<BaseViewHolder, DialogFragmentHelper, Unit> f43590b;

        /* JADX WARN: Multi-variable type inference failed */
        public C22885e(Function2<? super BaseViewHolder, ? super DialogFragmentHelper, Unit> function2) {
            this.f43590b = function2;
        }

        @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
        /* JADX INFO: renamed from: b3 */
        public void mo16191b3(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
            this.f43590b.invoke(viewHolder, dialogFragmentHelper);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.dialog.DialogFragmentHelper$f */
    /* JADX INFO: compiled from: DialogFragmentHelper.kt */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/resources/dialog/DialogFragmentHelper$setViewListener$1", "Lcom/kubi/resources/dialog/DialogFragmentHelper$ViewListener;", "callBack", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22886f implements InterfaceC22883c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1<BaseViewHolder, Unit> f43591a;

        /* JADX WARN: Multi-variable type inference failed */
        public C22886f(Function1<? super BaseViewHolder, Unit> function1) {
            this.f43591a = function1;
        }

        @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22883c
        /* JADX INFO: renamed from: a */
        public void mo54246a(BaseViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            this.f43591a.invoke(viewHolder);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m54213U3(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.f43578i0 = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m54214W3(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.f43578i0 = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m54215Y3(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.f43577h0 = false;
        super.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m54216Z3(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.f43577h0 = false;
        super.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 0;
    }

    /* JADX INFO: renamed from: O3 */
    public boolean mo25577O3() {
        return true;
    }

    /* JADX INFO: renamed from: G3 */
    public static final WindowInsetsCompat m54209G3(View v11, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            v11.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), insets2.bottom + viewGroup.getPaddingBottom());
        }
        return insets;
    }

    /* JADX INFO: renamed from: J3 */
    public static final boolean m54210J3() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C22884d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_dialog_crash_validation", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m54212S3() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m54217b4(DialogFragmentHelper dialogFragmentHelper, Window window, HostSystemBarSnapshot hostSystemBarSnapshot) {
        try {
            Result.Companion companion = Result.INSTANCE;
            dialogFragmentHelper.m54225H3(window, hostSystemBarSnapshot);
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m54218c4(DialogFragmentHelper dialogFragmentHelper, Window window, HostSystemBarSnapshot hostSystemBarSnapshot) {
        try {
            Result.Companion companion = Result.INSTANCE;
            dialogFragmentHelper.m54225H3(window, hostSystemBarSnapshot);
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m54224F3(View view) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: bw.q
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return DialogFragmentHelper.m54209G3(view2, windowInsetsCompat);
            }
        });
        view.requestApplyInsets();
    }

    /* JADX INFO: renamed from: I3 */
    public final void m54226I3() {
        Window window;
        if (this.f43582m0 && this.f43583n0 == null) {
            try {
                FragmentActivity activity = getActivity();
                if (activity != null && (window = activity.getWindow()) != null) {
                    WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                    Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
                    this.f43583n0 = new HostSystemBarSnapshot(window.getStatusBarColor(), window.getDecorView().getSystemUiVisibility(), insetsController.isAppearanceLightStatusBars(), insetsController.getSystemBarsBehavior(), (window.getAttributes().flags & Integer.MIN_VALUE) != 0);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final boolean m54228L3() {
        return ((Boolean) this.f43584o0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: M3, reason: from getter */
    public final float getF43576g0() {
        return this.f43576g0;
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m54231Q3(Window window, boolean z11, int i11) {
        if (z11) {
            window.addFlags(i11);
        } else {
            window.clearFlags(i11);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m54232T3() {
        Dialog dialog;
        Window window;
        View view;
        if (this.f43578i0 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null || (view = getView()) == null) {
            return;
        }
        if (this.f43579j0) {
            C4715d0.m4753y(C4715d0.f4670a, view, window, 0.0f, 0.0f, new Function0() { // from class: bw.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DialogFragmentHelper.m54213U3(this.f4743b);
                }
            }, 12, null);
        } else {
            this.f43578i0 = true;
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m54233V3() {
        Dialog dialog;
        Window window;
        View view;
        if (this.f43578i0 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null || (view = getView()) == null) {
            return;
        }
        if (this.f43579j0) {
            C4715d0.m4729C(C4715d0.f4670a, view, window, 0.0f, new Function0() { // from class: bw.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DialogFragmentHelper.m54214W3(this.f4744b);
                }
            }, 4, null);
        } else {
            this.f43578i0 = true;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m54234a4() {
        FragmentActivity activity;
        final Window window;
        if (this.f43582m0) {
            try {
                final HostSystemBarSnapshot hostSystemBarSnapshot = this.f43583n0;
                if (hostSystemBarSnapshot != null && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
                    m54225H3(window, hostSystemBarSnapshot);
                    window.getDecorView().post(new Runnable() { // from class: bw.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogFragmentHelper.m54217b4(this.f4734b, window, hostSystemBarSnapshot);
                        }
                    });
                    window.getDecorView().postDelayed(new Runnable() { // from class: bw.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogFragmentHelper.m54218c4(this.f4737b, window, hostSystemBarSnapshot);
                        }
                    }, 120L);
                    this.f43583n0 = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m54235d4(float f11) {
        this.f43576g0 = f11;
    }

    @NotNull
    /* JADX INFO: renamed from: e4 */
    public final DialogFragmentHelper m54236e4(@NotNull InterfaceC22882b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f43570a0 = listener;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: f4 */
    public final DialogFragmentHelper m54237f4(@NotNull Function2<? super BaseViewHolder, ? super DialogFragmentHelper, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f43570a0 = new C22885e(listener);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: g4 */
    public final DialogFragmentHelper m54238g4(@NotNull Function1<? super BaseViewHolder, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f43571b0 = new C22886f(listener);
        return this;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m54239h4(Window window) {
        Window window2;
        if (this.f43582m0) {
            try {
                FragmentActivity activity = getActivity();
                if (activity != null && (window2 = activity.getWindow()) != null) {
                    m54230P3(window, window2, Integer.MIN_VALUE);
                    window.setStatusBarColor(window2.getStatusBarColor());
                    window.getDecorView().setSystemUiVisibility((window2.getDecorView().getSystemUiVisibility() & 9472) | (window.getDecorView().getSystemUiVisibility() & (-9473)));
                    WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window2, window2.getDecorView());
                    Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
                    WindowInsetsControllerCompat insetsController2 = WindowCompat.getInsetsController(window, window.getDecorView());
                    Intrinsics.checkNotNullExpressionValue(insetsController2, "getInsetsController(...)");
                    insetsController2.setSystemBarsBehavior(insetsController.getSystemBarsBehavior());
                    insetsController2.setAppearanceLightStatusBars(insetsController.isAppearanceLightStatusBars());
                    C5270g.m6205s(window, insetsController.isAppearanceLightStatusBars());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        if (this.f43572c0 == 8) {
            return true;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return RouteExKt.m56252i(arguments, "isBottomSheet", false);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int i11;
        Dialog dialog;
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (m54228L3() && this.f43569Z == 0) {
            C43840a.m96550d("resLayoutId is 0 (isRnDialog=" + this.f43582m0 + "), dismiss to prevent crash. type:" + this.f43572c0, "DialogFragmentHelper");
            dismissAllowingStateLoss();
            return null;
        }
        if (this.f43573d0 != 0 && (i11 = this.f43572c0) != 0 && i11 != 8 && i11 != 3 && i11 != 4 && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(this.f43573d0);
        }
        View viewInflate = inflater.inflate(this.f43569Z, container);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[onCreateView] hashcode:");
        sb2.append(hashCode());
        sb2.append(", type:");
        sb2.append(this.f43572c0);
        sb2.append(", resLayoutId:");
        sb2.append(this.f43569Z);
        sb2.append(", listener is null:");
        sb2.append(this.f43570a0 == null);
        sb2.append(", savedInstanceState:");
        sb2.append(savedInstanceState);
        C44128b.m97259c("DialogFragmentHelper", sb2.toString());
        InterfaceC22882b interfaceC22882b = this.f43570a0;
        if (interfaceC22882b != null) {
            interfaceC22882b.mo16191b3(new BaseViewHolder(viewInflate), this);
        }
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.f43582m0) {
            try {
                m54234a4();
            } catch (Exception unused) {
            }
        }
        super.onDestroyView();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (this.f43582m0) {
            try {
                m54234a4();
            } catch (Exception unused) {
            }
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("saved_layout", this.f43569Z);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0153  */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View view;
        View view2;
        int i11;
        InterfaceC22883c interfaceC22883c;
        ViewGroup viewGroup;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        if (this.f43582m0) {
            try {
                m54226I3();
                m54239h4(window);
            } catch (Exception unused) {
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(mo25577O3());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setBackgroundDrawable(new ColorDrawable(0));
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes == null) {
            return;
        }
        attributes.width = displayMetrics.widthPixels;
        int i12 = this.f43572c0;
        if (i12 == -11) {
            if (getView() != null && this.f43572c0 != -11 && C5275i0.m6237b(getView()) > ((int) (C5267e0.m6182d() * this.f43576g0))) {
                attributes.height = (int) (C5267e0.m6182d() * this.f43576g0);
            }
            attributes.gravity = 80;
            view = getView();
            if (view != null) {
                m54227K3(view);
                m54224F3(view);
            }
            this.f43579j0 = true;
            m54232T3();
        } else if (i12 != -1 && i12 != 0) {
            switch (i12) {
                case 2:
                    attributes.windowAnimations = R$style.style_top_dialog;
                    attributes.gravity = 48;
                    window.setAttributes(attributes);
                    break;
                case 3:
                case 4:
                    attributes.gravity = 17;
                    attributes.height = -2;
                    if (this.f43579j0) {
                        attributes.windowAnimations = 0;
                        attributes.height = -1;
                    }
                    window.setAttributes(attributes);
                    View childAt = ((ViewGroup) window.getDecorView().findViewById(R.id.content)).getChildAt(0);
                    Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                    C27046k.m66711z(childAt, 0L, new Function0() { // from class: bw.o
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DialogFragmentHelper.m54211R3(this.f4742b);
                        }
                    }, 1, null);
                    View decorView = window.getDecorView();
                    if (decorView != null && (viewGroup = (ViewGroup) decorView.findViewById(R$id.alert_dialog_root)) != null) {
                        C27046k.m66711z(viewGroup, 0L, new Function0() { // from class: bw.p
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DialogFragmentHelper.m54212S3();
                            }
                        }, 1, null);
                    }
                    if (this.f43572c0 == 3) {
                        attributes.width = displayMetrics.widthPixels - C5275i0.m6236a(100.0f);
                    } else {
                        attributes.width = getResources().getConfiguration().orientation == 1 ? displayMetrics.widthPixels - C5275i0.m6236a(64.0f) : C5275i0.m6236a(320.0f);
                    }
                    window.setAttributes(attributes);
                    View view3 = getView();
                    if (view3 != null) {
                        m54227K3(view3);
                    }
                    m54233V3();
                    break;
                case 5:
                    window.setDimAmount(0.0f);
                    attributes.height = -1;
                    attributes.gravity = 119;
                    window.setAttributes(attributes);
                    break;
                case 6:
                    if (this.f43580k0) {
                        window.setDimAmount(0.8f);
                    }
                    attributes.height = -1;
                    attributes.gravity = 119;
                    window.setAttributes(attributes);
                    m54233V3();
                    break;
                case 7:
                    attributes.windowAnimations = R$style.style_top_dialog;
                    attributes.gravity = 17;
                    window.setAttributes(attributes);
                    break;
                case 8:
                    if (getView() != null) {
                        interfaceC22883c.mo54246a(new BaseViewHolder(getView()));
                    }
                    attributes.gravity = 80;
                    window.setAttributes(attributes);
                    view2 = getView();
                    if (view2 != null) {
                        m54227K3(view2);
                        m54224F3(view2);
                    }
                    i11 = this.f43572c0;
                    if (i11 == 0) {
                        this.f43579j0 = true;
                        m54232T3();
                    } else {
                        this.f43579j0 = true;
                        m54232T3();
                    }
                    break;
                case 9:
                    if (this.f43580k0) {
                        window.setDimAmount(0.6f);
                    }
                    attributes.height = -1;
                    attributes.gravity = 119;
                    window.setAttributes(attributes);
                    m54233V3();
                    break;
                case 10:
                    if (getView() != null) {
                        attributes.height = (int) (C5267e0.m6182d() * this.f43576g0);
                    }
                    attributes.gravity = 80;
                    view = getView();
                    if (view != null) {
                        m54227K3(view);
                        m54224F3(view);
                    }
                    this.f43579j0 = true;
                    m54232T3();
                    break;
                default:
                    attributes.gravity = 17;
                    window.setAttributes(attributes);
                    break;
            }
        } else {
            if (getView() != null && this.f43572c0 != -1 && (interfaceC22883c = this.f43571b0) != null) {
                interfaceC22883c.mo54246a(new BaseViewHolder(getView()));
            }
            attributes.gravity = 80;
            window.setAttributes(attributes);
            view2 = getView();
            if (view2 != null) {
                m54227K3(view2);
                m54224F3(view2);
            }
            i11 = this.f43572c0;
            if (i11 == 0 || i11 == 8) {
                this.f43579j0 = true;
                m54232T3();
            }
        }
        window.setAttributes(attributes);
        if (mo15372k3()) {
            if (this.f43574e0 > 0 || this.f43575f0) {
                Dialog dialog3 = getDialog();
                FrameLayout frameLayout = dialog3 != null ? (FrameLayout) dialog3.findViewById(R$id.design_bottom_sheet) : null;
                if (frameLayout == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                int i13 = this.f43574e0;
                if (i13 > 0) {
                    bottomSheetBehaviorFrom.setPeekHeight(i13);
                }
                if (this.f43575f0) {
                    bottomSheetBehaviorFrom.setState(3);
                }
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
                bottomSheetBehaviorFrom.setDraggable(this.f43572c0 != 8 ? this.f43581l0 : false);
            }
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m54211R3(DialogFragmentHelper dialogFragmentHelper) {
        if (dialogFragmentHelper.isCancelable()) {
            dialogFragmentHelper.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m54225H3(Window window, HostSystemBarSnapshot hostSystemBarSnapshot) {
        m54231Q3(window, hostSystemBarSnapshot.getDrawsSystemBarBackgrounds(), Integer.MIN_VALUE);
        window.setStatusBarColor(hostSystemBarSnapshot.getStatusBarColor());
        window.getDecorView().setSystemUiVisibility((window.getDecorView().getSystemUiVisibility() & (-9473)) | (hostSystemBarSnapshot.getSystemUiVisibility() & 9472));
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
        insetsController.setSystemBarsBehavior(hostSystemBarSnapshot.getSystemBarsBehavior());
        insetsController.setAppearanceLightStatusBars(hostSystemBarSnapshot.getIsAppearanceLightStatusBars());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C5270g.m6204r(activity, hostSystemBarSnapshot.getIsAppearanceLightStatusBars());
        }
    }

    /* JADX INFO: renamed from: K3 */
    public final void m54227K3(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipChildren(false);
            try {
                ((ViewGroup) parent).setClipToPadding(false);
            } catch (Throwable unused) {
            }
            parent = viewGroup.getParent();
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m54230P3(Window window, Window window2, int i11) {
        if ((window2.getAttributes().flags & i11) != 0) {
            window.addFlags(i11);
        } else {
            window.clearFlags(i11);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public boolean mo32431X3() {
        Window window;
        View view;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (view = getView()) == null) {
            return false;
        }
        if (this.f43577h0) {
            return true;
        }
        if (!this.f43579j0) {
            return false;
        }
        int i11 = this.f43572c0;
        if (i11 != 0) {
            if (i11 != 6) {
                if (i11 != 8) {
                    if (i11 != 3 && i11 != 4) {
                        return false;
                    }
                }
            }
            this.f43577h0 = true;
            C4715d0.m4730E(C4715d0.f4670a, view, window, 0.0f, 0L, 0.0f, new Function0() { // from class: bw.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DialogFragmentHelper.m54216Z3(this.f4741b);
                }
            }, 28, null);
            return true;
        }
        this.f43577h0 = true;
        C4715d0.m4728A(C4715d0.f4670a, view, window, 0.0f, 0.0f, new Function0() { // from class: bw.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogFragmentHelper.m54215Y3(this.f4740b);
            }
        }, 12, null);
        return true;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (!mo32431X3()) {
            super.dismiss();
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (!mo32431X3()) {
            super.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m54240i4() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            this.f43572c0 = mo24511N3();
            return;
        }
        this.f43569Z = RouteExKt.m56262n(arguments, TtmlNode.TAG_LAYOUT, 0);
        this.f43572c0 = RouteExKt.m56262n(arguments, "type", mo24511N3());
        this.f43573d0 = RouteExKt.m56262n(arguments, "anim", 0);
        this.f43574e0 = arguments.getInt("height", 0);
        this.f43575f0 = arguments.getBoolean("expand", true);
        this.f43579j0 = RouteExKt.m56252i(arguments, "isAnimationEnabled", false);
        this.f43580k0 = RouteExKt.m56252i(arguments, "isEnableDimAmount", true);
        this.f43581l0 = RouteExKt.m56252i(arguments, "isDraggable", true);
        this.f43582m0 = arguments.getBoolean("isRnDialog", false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54240i4();
        if (m54228L3() && savedInstanceState != null) {
            int iM56262n = RouteExKt.m56262n(savedInstanceState, "saved_layout", 0);
            if (this.f43569Z == 0 && iM56262n != 0) {
                this.f43569Z = iM56262n;
                C43840a.m96550d("DialogFragmentHelper", "[onCreate] restored resLayoutId from savedInstanceState: " + iM56262n);
            }
        }
        if (this.f43569Z == 0) {
            C43840a.m96550d("DialogFragmentHelper", "[onCreate] resLayoutId is 0, will guard in onCreateView if needed");
        }
        if (this.f43572c0 == 5) {
            setStyle(1, R$style.FillDialogStyle);
        }
    }
}
