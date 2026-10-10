package io.trtc.tuikit.atomicx.widget.basicwidget.popover;

import ag0.ThemeState;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicx.R$dimen;
import io.trtc.tuikit.atomicx.R$style;
import io.trtc.tuikit.atomicx.pictureinpicture.PictureInPictureStore;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import io.trtc.tuikit.atomicx.theme.tokens.DesignTokenSet;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AtomicPopover.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0003345B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0013J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0015J\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0015J\b\u0010)\u001a\u00020\u001aH\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\b\u0010+\u001a\u00020\u001aH\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002J\f\u00100\u001a\u000201*\u00020\u0005H\u0002J\b\u00102\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "panelGravity", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;", "<init>", "(Landroid/content/Context;Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;)V", "DIALOG_WIDTH_RATIO", "", "dialogScope", "Lkotlinx/coroutines/CoroutineScope;", "rootContainer", "Landroid/widget/FrameLayout;", "contentContainer", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$MaxHeightFrameLayout;", "themeJob", "Lkotlinx/coroutines/Job;", "panelHeight", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelHeight;", "isAnimating", "", "showAnimation", "useTransparentBackground", "showMask", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", TIMPushProvider.f75062n, "dismiss", "setContent", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "setPanelHeight", "value", "setTransparentBackground", "transparent", "setShowMask", "showWithAnimation", "dismissWithAnimation", "updatePanelHeight", "getCurrentTokens", "Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;", "setMaskColor", "setPanelBackground", "toAndroidGravity", "", "isActivityValid", "PanelGravity", "PanelHeight", "MaxHeightFrameLayout", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAtomicPopover.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicPopover.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,453:1\n1#2:454\n*E\n"})
public class AtomicPopover extends Dialog {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final PanelGravity f87542b;

    /* JADX INFO: renamed from: c */
    public final double f87543c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41709m0 f87544d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final FrameLayout f87545e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final MaxHeightFrameLayout f87546f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC41775x1 f87547g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public AbstractC39374a f87548h;

    /* JADX INFO: renamed from: i */
    public boolean f87549i;

    /* JADX INFO: renamed from: j */
    public final boolean f87550j;

    /* JADX INFO: renamed from: k */
    public boolean f87551k;

    /* JADX INFO: renamed from: l */
    public boolean f87552l;

    /* JADX INFO: compiled from: AtomicPopover.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$MaxHeightFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", ViewProps.MAX_HEIGHT, "", "getMaxHeight", "()I", "setMaxHeight", "(I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class MaxHeightFrameLayout extends FrameLayout {

        /* JADX INFO: renamed from: b */
        public int f87553b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxHeightFrameLayout(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX INFO: renamed from: a */
        public final void m88187a(int i11) {
            this.f87553b = i11;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (this.f87553b > 0) {
                int size = View.MeasureSpec.getSize(heightMeasureSpec);
                int mode = View.MeasureSpec.getMode(heightMeasureSpec);
                if (mode != Integer.MIN_VALUE) {
                    heightMeasureSpec = mode != 1073741824 ? View.MeasureSpec.makeMeasureSpec(this.f87553b, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(size, this.f87553b), 1073741824);
                } else {
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.f87553b), Integer.MIN_VALUE);
                }
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (this.f87553b <= 0 || getMeasuredHeight() <= this.f87553b) {
                return;
            }
            setMeasuredDimension(getMeasuredWidth(), this.f87553b);
        }
    }

    /* JADX INFO: compiled from: AtomicPopover.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelGravity;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM", "CENTER", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum PanelGravity {
        BOTTOM,
        CENTER;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87555c = EnumEntriesKt.enumEntries(m88188a());

        @NotNull
        public static EnumEntries<PanelGravity> getEntries() {
            return f87555c;
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$a */
    /* JADX INFO: compiled from: AtomicPopover.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelHeight;", "", "<init>", "()V", "WrapContent", "Ratio", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelHeight$Ratio;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelHeight$WrapContent;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC39374a {

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$a$a, reason: from toString */
        /* JADX INFO: compiled from: AtomicPopover.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelHeight$Ratio;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelHeight;", "value", "", "<init>", "(F)V", "getValue", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Ratio extends AbstractC39374a {

            /* JADX INFO: renamed from: a, reason: from toString */
            public final float value;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ratio) && Float.compare(this.value, ((Ratio) other).value) == 0;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @NotNull
            public String toString() {
                return "Ratio(value=" + this.value + ')';
            }
        }

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$a$b */
        /* JADX INFO: compiled from: AtomicPopover.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelHeight$WrapContent;", "Lio/trtc/tuikit/atomicx/widget/basicwidget/popover/AtomicPopover$PanelHeight;", "<init>", "()V", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b extends AbstractC39374a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f87557a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC39374a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC39374a() {
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1 */
    /* JADX INFO: compiled from: AtomicPopover.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1", m90122f = "AtomicPopover.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C393761 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: AtomicPopover.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1$1", m90122f = "AtomicPopover.kt", m90123i = {}, m90124l = {164}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AtomicPopover this$0;

            /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: AtomicPopover.kt */
            @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lio/trtc/tuikit/atomicx/theme/ThemeState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1$1$1", m90122f = "AtomicPopover.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            public static final class C470101 extends SuspendLambda implements Function2<ThemeState, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ AtomicPopover this$0;

                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(ThemeState themeState, Continuation<? super Unit> continuation) {
                    return ((C470101) create(themeState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C470101(AtomicPopover atomicPopover, Continuation<? super C470101> continuation) {
                    super(2, continuation);
                    this.this$0 = atomicPopover;
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C470101(this.this$0, continuation);
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.m88183t();
                        this.this$0.m88182s();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AtomicPopover atomicPopover, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = atomicPopover;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ThemeStore.Companion companion = ThemeStore.f87316e;
                    Context context = this.this$0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    InterfaceC41678w<ThemeState> interfaceC41678wM87980c = companion.shared(context).m87980c();
                    C470101 c470101 = new C470101(this.this$0, null);
                    this.label = 1;
                    if (C41636g.m90925l(interfaceC41678wM87980c, c470101, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: AtomicPopover.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1$2", m90122f = "AtomicPopover.kt", m90123i = {}, m90124l = {172}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AtomicPopover this$0;

            /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: AtomicPopover.kt */
            @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @DebugMetadata(m90121c = "io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$onStart$1$2$1", m90122f = "AtomicPopover.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AtomicPopover this$0;

                @Override // p852kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AtomicPopover atomicPopover, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = atomicPopover;
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    boolean z11 = this.Z$0;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (z11) {
                        this.this$0.dismiss();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AtomicPopover atomicPopover, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = atomicPopover;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41678w<Boolean> interfaceC41678wM103162a = PictureInPictureStore.f87308c.getShared().getF87311b().m103162a();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (C41636g.m90925l(interfaceC41678wM103162a, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C393761(Continuation<? super C393761> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C393761 c393761 = AtomicPopover.this.new C393761(continuation);
            c393761.L$0 = obj;
            return c393761;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C393761) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C41696j.m91104d(interfaceC41709m0, null, null, new AnonymousClass1(AtomicPopover.this, null), 3, null);
            C41696j.m91104d(interfaceC41709m0, null, null, new AnonymousClass2(AtomicPopover.this, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AtomicPopover(Context context, PanelGravity panelGravity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? PanelGravity.BOTTOM : panelGravity);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m88171n(AtomicPopover atomicPopover) {
        atomicPopover.f87549i = false;
        if (atomicPopover.m88180p()) {
            super.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public final void m88178l() {
        this.f87549i = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f87546f.getTranslationY(), this.f87546f.getHeight());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.popover.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AtomicPopover.m88170m(this.f87558b, valueAnimator);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        C39385i.m88191b(valueAnimatorOfFloat, new Function0() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.popover.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AtomicPopover.m88171n(this.f87559b);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover$b */
    /* JADX INFO: compiled from: AtomicPopover.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C39375b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PanelGravity.values().length];
            try {
                iArr[PanelGravity.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PanelGravity.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m88170m(AtomicPopover atomicPopover, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        MaxHeightFrameLayout maxHeightFrameLayout = atomicPopover.f87546f;
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        maxHeightFrameLayout.setTranslationY(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: z */
    public static final void m88175z(AtomicPopover atomicPopover, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        MaxHeightFrameLayout maxHeightFrameLayout = atomicPopover.f87546f;
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        maxHeightFrameLayout.setTranslationY(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: A */
    public final int m88176A(PanelGravity panelGravity) {
        int i11 = C39375b.$EnumSwitchMapping$0[panelGravity.ordinal()];
        if (i11 == 1) {
            return 80;
        }
        if (i11 == 2) {
            return 17;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: B */
    public final void m88177B() {
        if (this.f87542b == PanelGravity.CENTER) {
            return;
        }
        int i11 = getContext().getResources().getDisplayMetrics().heightPixels;
        int i12 = getContext().getResources().getDisplayMetrics().widthPixels;
        float f11 = i11;
        int i13 = (int) (0.9f * f11);
        this.f87546f.m88187a(i13);
        ViewGroup.LayoutParams layoutParams = this.f87546f.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        AbstractC39374a abstractC39374a = this.f87548h;
        if (abstractC39374a instanceof AbstractC39374a.b) {
            layoutParams2.height = -2;
            this.f87546f.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE));
        } else {
            if (!(abstractC39374a instanceof AbstractC39374a.Ratio)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(abstractC39374a, "null cannot be cast to non-null type io.trtc.tuikit.atomicx.widget.basicwidget.popover.AtomicPopover.PanelHeight.Ratio");
            layoutParams2.height = MathKt.roundToInt(f11 * RangesKt.coerceIn(((AbstractC39374a.Ratio) abstractC39374a).getValue(), 0.0f, 1.0f));
        }
        this.f87546f.requestLayout();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (!this.f87549i && m88180p()) {
            if (this.f87550j) {
                m88178l();
            } else {
                super.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final DesignTokenSet m88179o(Context context) {
        return ThemeStore.f87316e.shared(context).m87980c().getValue().getCurrentTheme().getTokens();
    }

    @Override // android.app.Dialog
    public void onStop() {
        InterfaceC41775x1 interfaceC41775x1 = this.f87547g;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f87547g = null;
        super.onStop();
    }

    /* JADX INFO: renamed from: s */
    public final void m88182s() {
        if (!this.f87552l) {
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.0f);
                return;
            }
            return;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.addFlags(2);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fAlpha = Color.alpha(m88179o(context).getColor().getBgColorMask()) / 255.0f;
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setDimAmount(fAlpha);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m88183t() {
        float[] fArr;
        if (this.f87551k) {
            this.f87546f.setBackground(null);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int bgColorDialog = m88179o(context).getColor().getBgColorDialog();
        float dimension = getContext().getResources().getDimension(R$dimen.radius_20);
        float dimension2 = getContext().getResources().getDimension(R$dimen.radius_12);
        int i11 = C39375b.$EnumSwitchMapping$0[this.f87542b.ordinal()];
        if (i11 == 1) {
            fArr = new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f};
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fArr = new float[]{dimension2, dimension2, dimension2, dimension2, dimension2, dimension2, dimension2, dimension2};
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(bgColorDialog);
        gradientDrawable.setCornerRadii(fArr);
        this.f87546f.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: u */
    public final void m88184u(boolean z11) {
        this.f87552l = z11;
        if (isShowing()) {
            m88182s();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m88185v(boolean z11) {
        this.f87551k = z11;
        if (isShowing()) {
            m88183t();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m88186y() {
        this.f87546f.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f87546f.getHeight(), 0.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.popover.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AtomicPopover.m88175z(this.f87564b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AtomicPopover(@NotNull Context context, @NotNull PanelGravity panelGravity) {
        int i11;
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(panelGravity, "panelGravity");
        int[] iArr = C39375b.$EnumSwitchMapping$0;
        int i12 = iArr[panelGravity.ordinal()];
        if (i12 == 1) {
            i11 = R$style.dialogStyleFromBottom;
        } else if (i12 == 2) {
            i11 = R$style.dialogStyleCenter;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        super(context, i11);
        this.f87542b = panelGravity;
        this.f87543c = 0.8d;
        this.f87544d = C41713n0.m91125a(C41782z0.m91393c().plus(C41727q2.m91192b(null, 1, null)));
        this.f87548h = AbstractC39374a.b.f87557a;
        PanelGravity panelGravity2 = PanelGravity.BOTTOM;
        this.f87550j = panelGravity == panelGravity2;
        this.f87552l = true;
        MaxHeightFrameLayout maxHeightFrameLayout = new MaxHeightFrameLayout(context);
        maxHeightFrameLayout.m88187a(panelGravity == panelGravity2 ? (int) (context.getResources().getDisplayMetrics().heightPixels * 0.9f) : 0);
        int i13 = iArr[panelGravity.ordinal()];
        if (i13 == 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
        } else if (i13 == 2) {
            layoutParams = new FrameLayout.LayoutParams((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.8d), -2);
            layoutParams.gravity = 17;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        maxHeightFrameLayout.setLayoutParams(layoutParams);
        maxHeightFrameLayout.setClickable(true);
        this.f87546f = maxHeightFrameLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        int i14 = iArr[panelGravity.ordinal()];
        if (i14 == 1) {
            layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        } else if (i14 == 2) {
            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.popover.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AtomicPopover.m88162d(this.f87560b, view);
            }
        });
        frameLayout.setBackgroundColor(0);
        frameLayout.addView(maxHeightFrameLayout);
        this.f87545e = frameLayout;
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.popover.d
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AtomicPopover.m88167i(view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m88162d(AtomicPopover atomicPopover, View view) {
        atomicPopover.dismiss();
    }

    /* JADX INFO: renamed from: i */
    public static final WindowInsetsCompat m88167i(View v11, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        if (v11 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v11;
            v11.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), insets2.bottom);
        }
        return insets;
    }

    /* JADX INFO: renamed from: r */
    public static final void m88172r(AtomicPopover atomicPopover) {
        atomicPopover.m88177B();
    }

    /* JADX INFO: renamed from: w */
    public static final void m88173w(final AtomicPopover atomicPopover) {
        atomicPopover.m88177B();
        atomicPopover.f87546f.postDelayed(new Runnable() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.popover.g
            @Override // java.lang.Runnable
            public final void run() {
                AtomicPopover.m88174x(this.f87563b);
            }
        }, 16L);
    }

    /* JADX INFO: renamed from: x */
    public static final void m88174x(AtomicPopover atomicPopover) {
        atomicPopover.m88186y();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        super.onCreate(savedInstanceState);
        setContentView(this.f87545e);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
            window2.getDecorView().setBackgroundColor(0);
            window2.setWindowAnimations(0);
            window2.setGravity(m88176A(this.f87542b));
            int i11 = C39375b.$EnumSwitchMapping$0[this.f87542b.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    window2.setLayout(-2, -2);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                window2.setLayout(-1, -1);
            }
            if (this.f87552l) {
                window2.addFlags(2);
            }
            window2.addFlags(16777216);
        }
        m88183t();
        m88182s();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        InterfaceC41775x1 interfaceC41775x1 = this.f87547g;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f87547g = C41696j.m91104d(this.f87544d, null, null, new C393761(null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m88180p() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m88181q(@NotNull View view) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.f87546f.removeAllViews();
        this.f87546f.addView(view, -1, -2);
        if (isShowing()) {
            this.f87546f.post(new Runnable() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.popover.f
                @Override // java.lang.Runnable
                public final void run() {
                    AtomicPopover.m88172r(this.f87562b);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (this.f87550j) {
            MaxHeightFrameLayout maxHeightFrameLayout = this.f87546f;
            maxHeightFrameLayout.setTranslationY(maxHeightFrameLayout.getHeight());
            this.f87546f.setVisibility(4);
            this.f87546f.post(new Runnable() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.popover.e
                @Override // java.lang.Runnable
                public final void run() {
                    AtomicPopover.m88173w(this.f87561b);
                }
            });
            return;
        }
        this.f87546f.setVisibility(0);
    }
}
