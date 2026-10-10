package io.trtc.tuikit.atomicx.widget.basicwidget.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.graphics.drawable.DrawableCompat;
import bg0.FontTokens;
import cg0.C4968b;
import com.facebook.react.uimanager.ViewProps;
import io.trtc.tuikit.atomicx.R$styleable;
import io.trtc.tuikit.atomicx.theme.Theme;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import io.trtc.tuikit.atomicx.theme.tokens.ColorTokens;
import io.trtc.tuikit.atomicx.theme.tokens.DesignTokenSet;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AtomicButton.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 b2\u00020\u0001:\u0002bcB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u000207H\u0016J\b\u0010H\u001a\u00020FH\u0014J\b\u0010I\u001a\u00020FH\u0014J\u0018\u0010J\u001a\u00020F2\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0007H\u0014J\u0010\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u000207H\u0016J\u0010\u0010Q\u001a\u00020F2\u0006\u0010R\u001a\u000207H\u0016J\b\u0010S\u001a\u00020FH\u0002J\b\u0010T\u001a\u00020UH\u0002J\u0012\u0010V\u001a\u00020F2\b\b\u0002\u0010W\u001a\u00020UH\u0002J\u001a\u0010X\u001a\u0002072\u0006\u0010Y\u001a\u00020\u000b2\b\u0010Z\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010[\u001a\u00020F2\u0006\u0010Y\u001a\u00020\u000bH\u0002J\u0012\u0010\\\u001a\u00020F2\b\b\u0003\u0010]\u001a\u00020\u0007H\u0002J\u001a\u0010^\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020U2\b\b\u0002\u0010_\u001a\u000207H\u0002J\u0018\u0010`\u001a\u00020%2\u0006\u0010W\u001a\u00020U2\u0006\u0010a\u001a\u00020\u000bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0019@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0012\u001a\u0004\u0018\u00010%@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020+@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0002012\u0006\u0010\u0012\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0002072\u0006\u0010\u0012\u001a\u000207@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010=\u001a\u0004\u0018\u00010<2\b\u0010\u0012\u001a\u0004\u0018\u00010<@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lastDesignConfig", "Lio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton$ButtonDesignConfig;", "contentContainer", "Landroid/widget/LinearLayout;", "iconView", "Landroid/widget/ImageView;", "textView", "Landroid/widget/TextView;", "value", "Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonVariant;", "variant", "getVariant", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonVariant;", "setVariant", "(Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonVariant;)V", "Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonColorType;", "colorType", "getColorType", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonColorType;", "setColorType", "(Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonColorType;)V", "Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonSize;", "size", "getSize", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonSize;", "setSize", "(Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonSize;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonIconPosition;", "iconPosition", "getIconPosition", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonIconPosition;", "setIconPosition", "(Lio/trtc/tuikit/atomicx/widget/basicwidget/button/ButtonIconPosition;)V", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "", "isBold", "()Z", "setBold", "(Z)V", "", "customTextSizeSp", "getCustomTextSizeSp", "()Ljava/lang/Float;", "setCustomTextSizeSp", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "buttonScope", "Lkotlinx/coroutines/CoroutineScope;", "setEnabled", "", "enabled", "onAttachedToWindow", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "performClick", "setPressed", "pressed", "bindTheme", "getCurrentTokens", "Lio/trtc/tuikit/atomicx/theme/tokens/DesignTokenSet;", "updateAppearance", "tokens", "shouldRecreateBackground", "newConfig", "oldConfig", "updateExistingBackground", "updateIcon", "tintColor", "getButtonDesignConfig", "forcePressed", "createBackgroundDrawable", "config", "Companion", "ButtonDesignConfig", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAtomicButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicButton.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,579:1\n59#2,2:580\n*S KotlinDebug\n*F\n+ 1 AtomicButton.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton\n*L\n162#1:580,2\n*E\n"})
public final class AtomicButton extends FrameLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f87496n = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public ButtonDesignConfig f87497b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final LinearLayout f87498c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final ImageView f87499d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TextView f87500e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public ButtonVariant f87501f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public ButtonColorType f87502g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public ButtonSize f87503h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Drawable f87504i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public ButtonIconPosition f87505j;

    /* JADX INFO: renamed from: k */
    public boolean f87506k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Float f87507l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InterfaceC41709m0 f87508m;

    /* JADX INFO: compiled from: AtomicButton.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton$Companion;", "", "<init>", "()V", "ICON_PADDING_DP", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.button.AtomicButton$a, reason: from toString */
    /* JADX INFO: compiled from: AtomicButton.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006$"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/button/AtomicButton$ButtonDesignConfig;", "", "backgroundColor", "", ViewProps.BORDER_COLOR, "textColor", ViewProps.BORDER_WIDTH, "", "cornerRadiusDp", "fontSize", "isBold", "", "<init>", "(IIIFFFZ)V", "getBackgroundColor", "()I", "getBorderColor", "getTextColor", "getBorderWidth", "()F", "getCornerRadiusDp", "getFontSize", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ButtonDesignConfig {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int backgroundColor;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int borderColor;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final int textColor;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final float borderWidth;

        /* JADX INFO: renamed from: e, reason: from toString */
        public final float cornerRadiusDp;

        /* JADX INFO: renamed from: f, reason: from toString */
        public final float fontSize;

        /* JADX INFO: renamed from: g, reason: from toString */
        public final boolean isBold;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonDesignConfig)) {
                return false;
            }
            ButtonDesignConfig buttonDesignConfig = (ButtonDesignConfig) other;
            return this.backgroundColor == buttonDesignConfig.backgroundColor && this.borderColor == buttonDesignConfig.borderColor && this.textColor == buttonDesignConfig.textColor && Float.compare(this.borderWidth, buttonDesignConfig.borderWidth) == 0 && Float.compare(this.cornerRadiusDp, buttonDesignConfig.cornerRadiusDp) == 0 && Float.compare(this.fontSize, buttonDesignConfig.fontSize) == 0 && this.isBold == buttonDesignConfig.isBold;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getBorderColor() {
            return this.borderColor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getBorderWidth() {
            return this.borderWidth;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getFontSize() {
            return this.fontSize;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getTextColor() {
            return this.textColor;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.backgroundColor) * 31) + Integer.hashCode(this.borderColor)) * 31) + Integer.hashCode(this.textColor)) * 31) + Float.hashCode(this.borderWidth)) * 31) + Float.hashCode(this.cornerRadiusDp)) * 31) + Float.hashCode(this.fontSize)) * 31) + Boolean.hashCode(this.isBold);
        }

        @NotNull
        public String toString() {
            return "ButtonDesignConfig(backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", textColor=" + this.textColor + ", borderWidth=" + this.borderWidth + ", cornerRadiusDp=" + this.cornerRadiusDp + ", fontSize=" + this.fontSize + ", isBold=" + this.isBold + ')';
        }

        public ButtonDesignConfig(@ColorInt int i11, @ColorInt int i12, @ColorInt int i13, float f11, float f12, float f13, boolean z11) {
            this.backgroundColor = i11;
            this.borderColor = i12;
            this.textColor = i13;
            this.borderWidth = f11;
            this.cornerRadiusDp = f12;
            this.fontSize = f13;
            this.isBold = z11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m88130f(ButtonDesignConfig buttonDesignConfig, ButtonDesignConfig buttonDesignConfig2) {
        if (buttonDesignConfig2 != null && buttonDesignConfig.getCornerRadiusDp() == buttonDesignConfig2.getCornerRadiusDp() && buttonDesignConfig.getBorderWidth() == buttonDesignConfig2.getBorderWidth()) {
            return (buttonDesignConfig.getBorderWidth() == 0.0f && buttonDesignConfig2.getBorderWidth() != 0.0f) || (buttonDesignConfig.getBorderWidth() != 0.0f && buttonDesignConfig2.getBorderWidth() == 0.0f);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m88131g(DesignTokenSet designTokenSet) {
        ButtonDesignConfig buttonDesignConfigM88124e = m88124e(this, designTokenSet, false, 2, null);
        this.f87500e.setTextColor(buttonDesignConfigM88124e.getTextColor());
        this.f87500e.setTextSize(2, buttonDesignConfigM88124e.getFontSize());
        this.f87500e.setTypeface(buttonDesignConfigM88124e.getIsBold() ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        if (m88130f(buttonDesignConfigM88124e, this.f87497b)) {
            setBackground(m88128c(designTokenSet, buttonDesignConfigM88124e));
        } else {
            m88132i(buttonDesignConfigM88124e);
        }
        m88133j(buttonDesignConfigM88124e.getTextColor());
        this.f87497b = buttonDesignConfigM88124e;
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.button.AtomicButton$b */
    /* JADX INFO: compiled from: AtomicButton.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C39368b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ButtonIconPosition.values().length];
            try {
                iArr[ButtonIconPosition.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonIconPosition.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonIconPosition.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonColorType.values().length];
            try {
                iArr2[ButtonColorType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonColorType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonColorType.DANGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ButtonVariant.values().length];
            try {
                iArr3[ButtonVariant.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ButtonVariant.OUTLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ButtonVariant.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ButtonSize.values().length];
            try {
                iArr4[ButtonSize.XS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[ButtonSize.S.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ButtonSize.M.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ButtonSize.L.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ButtonDesignConfig m88124e(AtomicButton atomicButton, DesignTokenSet designTokenSet, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return atomicButton.m88129d(designTokenSet, z11);
    }

    private final DesignTokenSet getCurrentTokens() {
        ThemeStore.Companion companion = ThemeStore.f87316e;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.shared(context).m87980c().getValue().getCurrentTheme().getTokens();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m88125h(AtomicButton atomicButton, DesignTokenSet designTokenSet, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            designTokenSet = atomicButton.getCurrentTokens();
        }
        atomicButton.m88131g(designTokenSet);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m88126k(AtomicButton atomicButton, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = atomicButton.f87500e.getCurrentTextColor();
        }
        atomicButton.m88133j(i11);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:88:0x0213  */
    /* JADX INFO: renamed from: d */
    public final ButtonDesignConfig m88129d(DesignTokenSet designTokenSet, boolean z11) {
        Triple triple;
        Triple triple2;
        int textColorButton;
        int i11;
        int i12;
        float f11;
        int textColorButton2;
        int i13;
        float size;
        Float f12;
        ColorTokens color = designTokenSet.getColor();
        FontTokens font = designTokenSet.getFont();
        boolean zIsEnabled = isEnabled();
        int i14 = 0;
        boolean z12 = z11 || isPressed();
        ButtonColorType buttonColorType = this.f87502g;
        int[] iArr = C39368b.$EnumSwitchMapping$1;
        int i15 = iArr[buttonColorType.ordinal()];
        if (i15 == 1) {
            triple = new Triple(Integer.valueOf(color.getButtonColorPrimaryDefault()), Integer.valueOf(color.getButtonColorPrimaryActive()), Integer.valueOf(color.getButtonColorPrimaryDisabled()));
        } else if (i15 == 2) {
            triple = new Triple(Integer.valueOf(color.getButtonColorSecondaryDefault()), Integer.valueOf(color.getButtonColorSecondaryActive()), Integer.valueOf(color.getButtonColorSecondaryDisabled()));
        } else {
            if (i15 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            triple = new Triple(Integer.valueOf(color.getButtonColorHangupDefault()), Integer.valueOf(color.getButtonColorHangupActive()), Integer.valueOf(color.getButtonColorHangupDisabled()));
        }
        int i16 = iArr[this.f87502g.ordinal()];
        if (i16 == 1) {
            triple2 = new Triple(Integer.valueOf(color.getTextColorLink()), Integer.valueOf(color.getTextColorLinkActive()), Integer.valueOf(color.getTextColorLinkDisabled()));
        } else if (i16 == 2) {
            triple2 = new Triple(Integer.valueOf(color.getTextColorPrimary()), Integer.valueOf(color.getTextColorSecondary()), Integer.valueOf(color.getTextColorDisable()));
        } else {
            if (i16 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            triple2 = new Triple(Integer.valueOf(color.getButtonColorHangupDefault()), Integer.valueOf(color.getButtonColorHangupActive()), Integer.valueOf(color.getButtonColorHangupDisabled()));
        }
        int iIntValue = ((Number) triple.getFirst()).intValue();
        int iIntValue2 = ((Number) triple.getSecond()).intValue();
        int iIntValue3 = ((Number) triple.getThird()).intValue();
        int iIntValue4 = ((Number) triple2.getFirst()).intValue();
        int iIntValue5 = ((Number) triple2.getSecond()).intValue();
        int iIntValue6 = ((Number) triple2.getThird()).intValue();
        float f13 = 1.0f;
        if (zIsEnabled) {
            if (z12) {
                iIntValue = iIntValue2;
            }
            if (z12) {
                iIntValue4 = iIntValue5;
            }
            int i17 = C39368b.$EnumSwitchMapping$2[this.f87501f.ordinal()];
            if (i17 == 1) {
                textColorButton = color.getTextColorButton();
                i11 = iIntValue;
                i12 = i11;
            } else if (i17 == 2) {
                int i18 = iArr[this.f87502g.ordinal()];
                if (i18 == 1) {
                    textColorButton2 = iIntValue;
                } else if (i18 != 2) {
                    if (i18 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textColorButton2 = iIntValue;
                } else {
                    textColorButton2 = color.getTextColorButton();
                }
                i11 = 0;
                textColorButton = textColorButton2;
                i12 = iIntValue;
            } else {
                if (i17 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i11 = 0;
                i12 = 0;
                textColorButton = iIntValue4;
            }
            f11 = 0.0f;
            i13 = C39368b.$EnumSwitchMapping$3[this.f87503h.ordinal()];
            if (i13 != 1) {
                size = font.getBold12().getSize();
            } else if (i13 == 2) {
                size = font.getBold14().getSize();
            } else if (i13 == 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f12 = this.f87507l;
            if (f12 != null) {
                size = f12.floatValue();
            }
            return new ButtonDesignConfig(i11, i12, textColorButton, f11, 9999.0f, size, this.f87506k);
        }
        ButtonVariant buttonVariant = this.f87501f;
        int[] iArr2 = C39368b.$EnumSwitchMapping$2;
        int i19 = iArr2[buttonVariant.ordinal()];
        if (i19 == 1) {
            iIntValue6 = color.getTextColorButtonDisabled();
        } else if (i19 != 2 && i19 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i21 = iArr2[this.f87501f.ordinal()];
        if (i21 == 1) {
            i14 = iIntValue3;
        } else if (i21 != 2) {
            if (i21 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue3 = 0;
        }
        f13 = this.f87501f != ButtonVariant.OUTLINED ? 0.0f : 1.0f;
        i11 = i14;
        i12 = iIntValue3;
        textColorButton = iIntValue6;
        f11 = f13;
        i13 = C39368b.$EnumSwitchMapping$3[this.f87503h.ordinal()];
        if (i13 != 1) {
            size = font.getBold12().getSize();
        } else if (i13 == 2) {
            size = i13 == 3 ? font.getBold16().getSize() : font.getBold16().getSize();
        } else {
            size = font.getBold14().getSize();
        }
        f12 = this.f87507l;
        if (f12 != null) {
            size = f12.floatValue();
        }
        return new ButtonDesignConfig(i11, i12, textColorButton, f11, 9999.0f, size, this.f87506k);
    }

    @NotNull
    /* JADX INFO: renamed from: getColorType, reason: from getter */
    public final ButtonColorType getF87502g() {
        return this.f87502g;
    }

    @Nullable
    /* JADX INFO: renamed from: getCustomTextSizeSp, reason: from getter */
    public final Float getF87507l() {
        return this.f87507l;
    }

    @Nullable
    /* JADX INFO: renamed from: getIconDrawable, reason: from getter */
    public final Drawable getF87504i() {
        return this.f87504i;
    }

    @NotNull
    /* JADX INFO: renamed from: getIconPosition, reason: from getter */
    public final ButtonIconPosition getF87505j() {
        return this.f87505j;
    }

    @NotNull
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final ButtonSize getF87503h() {
        return this.f87503h;
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = this.f87500e.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    @NotNull
    /* JADX INFO: renamed from: getVariant, reason: from getter */
    public final ButtonVariant getF87501f() {
        return this.f87501f;
    }

    /* JADX INFO: renamed from: j */
    public final void m88133j(@ColorInt int i11) {
        Drawable drawable = this.f87504i;
        float iconSizeDp = this.f87503h.getIconSizeDp();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM5262a = C4968b.m5262a(context, iconSizeDp);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM5262a2 = C4968b.m5262a(context2, 4.0f);
        if (drawable == null || this.f87505j == ButtonIconPosition.NONE) {
            this.f87499d.setVisibility(8);
            return;
        }
        this.f87499d.setVisibility(0);
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "wrap(...)");
        DrawableCompat.setTint(drawableWrap, i11);
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        this.f87499d.setImageDrawable(drawableWrap);
        ViewGroup.LayoutParams layoutParams = this.f87499d.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(iM5262a, iM5262a);
        }
        layoutParams2.width = iM5262a;
        layoutParams2.height = iM5262a;
        int i12 = C39368b.$EnumSwitchMapping$0[this.f87505j.ordinal()];
        if (i12 == 1) {
            layoutParams2.setMargins(0, 0, iM5262a2, 0);
            this.f87498c.removeAllViews();
            this.f87498c.addView(this.f87499d);
            this.f87498c.addView(this.f87500e);
        } else if (i12 == 2) {
            layoutParams2.setMargins(iM5262a2, 0, 0, 0);
            this.f87498c.removeAllViews();
            this.f87498c.addView(this.f87500e);
            this.f87498c.addView(this.f87499d);
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.f87499d.setVisibility(8);
        }
        this.f87499d.setLayoutParams(layoutParams2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ButtonSize buttonSize = this.f87503h;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int heightPx = buttonSize.getHeightPx(context);
        ButtonSize buttonSize2 = this.f87503h;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int minWidthPx = buttonSize2.getMinWidthPx(context2);
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(heightPx, 1073741824));
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            size = RangesKt.coerceAtMost(Math.max(getMeasuredWidth(), minWidthPx), size);
        } else if (mode == 0) {
            size = Math.max(getMeasuredWidth(), minWidthPx);
        } else if (mode != 1073741824) {
            size = getMeasuredWidth();
        }
        setMeasuredDimension(size, heightPx);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z11 = false;
        if (!isEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            setPressed(true);
        } else if (action != 1) {
            if (action == 2) {
                if (event.getX() >= 0.0f && event.getX() <= getWidth() && event.getY() >= 0.0f && event.getY() <= getHeight()) {
                    z11 = true;
                }
                setPressed(z11);
            } else if (action == 3) {
                setPressed(false);
            }
        } else if (isPressed()) {
            setPressed(false);
            performClick();
        }
        return true;
    }

    public final void setBold(boolean z11) {
        this.f87506k = z11;
        m88125h(this, null, 1, null);
    }

    public final void setCustomTextSizeSp(@Nullable Float f11) {
        this.f87507l = f11;
        m88125h(this, null, 1, null);
    }

    public final void setIconDrawable(@Nullable Drawable drawable) {
        this.f87504i = drawable;
        m88126k(this, 0, 1, null);
    }

    public /* synthetic */ AtomicButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    public final void m88127b() {
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(C41782z0.m91393c().plus(C41727q2.m91192b(null, 1, null)));
        this.f87508m = interfaceC41709m0M91125a;
        if (interfaceC41709m0M91125a != null) {
            C41696j.m91104d(interfaceC41709m0M91125a, null, null, new AtomicButton$bindTheme$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m88128c(DesignTokenSet designTokenSet, ButtonDesignConfig buttonDesignConfig) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fM5262a = C4968b.m5262a(context, buttonDesignConfig.getCornerRadiusDp());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iM5262a = C4968b.m5262a(context2, buttonDesignConfig.getBorderWidth());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fM5262a);
        gradientDrawable.setColor(buttonDesignConfig.getBackgroundColor());
        gradientDrawable.setStroke(iM5262a, buttonDesignConfig.getBorderColor());
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: i */
    public final void m88132i(ButtonDesignConfig buttonDesignConfig) {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setColor(buttonDesignConfig.getBackgroundColor());
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setStroke(C4968b.m5262a(context, buttonDesignConfig.getBorderWidth()), buttonDesignConfig.getBorderColor());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m88127b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC41709m0 interfaceC41709m0 = this.f87508m;
        if (interfaceC41709m0 != null) {
            C41713n0.m91129e(interfaceC41709m0, null, 1, null);
        }
        this.f87508m = null;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final void setColorType(@NotNull ButtonColorType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87502g = value;
        m88125h(this, null, 1, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.f87500e.setEnabled(enabled);
        this.f87499d.setEnabled(enabled);
        m88125h(this, null, 1, null);
    }

    public final void setIconPosition(@NotNull ButtonIconPosition value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87505j = value;
        m88126k(this, 0, 1, null);
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        boolean zIsPressed = isPressed();
        super.setPressed(pressed);
        if (zIsPressed != pressed) {
            m88125h(this, null, 1, null);
        }
    }

    public final void setSize(@NotNull ButtonSize value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87503h = value;
        requestLayout();
        m88125h(this, null, 1, null);
    }

    public final void setText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87500e.setText(value);
    }

    public final void setVariant(@NotNull ButtonVariant value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f87501f = value;
        m88125h(this, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f87499d = imageView;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        this.f87500e = textView;
        ButtonVariant buttonVariant = ButtonVariant.FILLED;
        this.f87501f = buttonVariant;
        ButtonColorType buttonColorType = ButtonColorType.PRIMARY;
        this.f87502g = buttonColorType;
        ButtonSize buttonSize = ButtonSize.S;
        this.f87503h = buttonSize;
        ButtonIconPosition buttonIconPosition = ButtonIconPosition.NONE;
        this.f87505j = buttonIconPosition;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        this.f87498c = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        addView(linearLayout, layoutParams);
        setClickable(true);
        setFocusable(true);
        if (attributeSet != null) {
            int[] AtomicButton = R$styleable.AtomicButton;
            Intrinsics.checkNotNullExpressionValue(AtomicButton, "AtomicButton");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AtomicButton, i11, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.AtomicButton_buttonVariant, 0);
            if (i12 == 1) {
                buttonVariant = ButtonVariant.OUTLINED;
            } else if (i12 == 2) {
                buttonVariant = ButtonVariant.TEXT;
            }
            setVariant(buttonVariant);
            int i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.AtomicButton_buttonColorType, 0);
            if (i13 == 1) {
                buttonColorType = ButtonColorType.SECONDARY;
            } else if (i13 == 2) {
                buttonColorType = ButtonColorType.DANGER;
            }
            setColorType(buttonColorType);
            int i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.AtomicButton_customButtonSize, 1);
            if (i14 == 0) {
                buttonSize = ButtonSize.XS;
            } else if (i14 != 1) {
                if (i14 == 2) {
                    buttonSize = ButtonSize.M;
                } else if (i14 == 3) {
                    buttonSize = ButtonSize.L;
                }
            }
            setSize(buttonSize);
            int i15 = typedArrayObtainStyledAttributes.getInt(R$styleable.AtomicButton_buttonIconPosition, 2);
            if (i15 == 0) {
                buttonIconPosition = ButtonIconPosition.START;
            } else if (i15 == 1) {
                buttonIconPosition = ButtonIconPosition.END;
            }
            setIconPosition(buttonIconPosition);
            setIconDrawable(typedArrayObtainStyledAttributes.getDrawable(R$styleable.AtomicButton_buttonIcon));
            textView.setText(typedArrayObtainStyledAttributes.getText(R$styleable.AtomicButton_android_text));
            setBold(typedArrayObtainStyledAttributes.getBoolean(R$styleable.AtomicButton_textStyle, false));
            int i16 = R$styleable.AtomicButton_buttonTextSize;
            if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                setCustomTextSizeSp(Float.valueOf(typedArrayObtainStyledAttributes.getDimension(i16, 0.0f) / typedArrayObtainStyledAttributes.getResources().getDisplayMetrics().scaledDensity));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m88131g(Theme.f87312d.lightTheme(context).getTokens());
        }
    }
}
