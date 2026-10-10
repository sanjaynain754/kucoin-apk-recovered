package io.trtc.tuikit.atomicx.widget.basicwidget.label;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatTextView;
import bg0.Font;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.BaseActivity;
import io.trtc.tuikit.atomicx.R$styleable;
import io.trtc.tuikit.atomicx.theme.Theme;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import io.trtc.tuikit.atomicx.theme.tokens.ColorTokens;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AtomicLabel.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003@ABB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0012J\b\u0010(\u001a\u00020&H\u0014J\b\u0010)\u001a\u00020&H\u0014J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0002J\u001a\u00104\u001a\u00020&2\b\b\u0001\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u001cH\u0002J\u0010\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020\u0007H\u0002J\b\u00109\u001a\u00020&H\u0002J\u0012\u0010:\u001a\u00020&2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010;\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00070<*\u00020=2\u0006\u0010>\u001a\u00020\u0007H\u0002J\b\u0010?\u001a\u00020&H\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$IconConfiguration;", "iconConfiguration", "getIconConfiguration", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$IconConfiguration;", "setIconConfiguration", "(Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$IconConfiguration;)V", "appearanceProvider", "Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$AppearanceProvider;", "themeBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getThemeBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "themeBackgroundDrawable$delegate", "Lkotlin/Lazy;", "isBackgroundManaged", "", "cornerRadiusOverride", "", "Ljava/lang/Float;", "textColorTokenKey", "", "backgroundColorTokenKey", "backgroundColorStatic", "Ljava/lang/Integer;", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "setAppearanceProvider", "", "provider", "onAttachedToWindow", "onDetachedFromWindow", "startThemeObservation", "stopThemeObservation", "refreshAppearance", "applyTheme", BaseActivity.THEME, "Lio/trtc/tuikit/atomicx/theme/Theme;", "applyAppearance", "appearance", "Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;", "applyAtomicProperties", "updateBackgroundState", "color", "radius", "applyTypeface", "weight", "applyStaticFallback", "parseAttributes", "parseColorTokenAttributeWithFallback", "Lkotlin/Pair;", "Landroid/content/res/TypedArray;", "index", "applyIconConfiguration", "LabelAppearance", "IconConfiguration", "AppearanceProvider", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAtomicLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicLabel.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,242:1\n52#2,9:243\n*S KotlinDebug\n*F\n+ 1 AtomicLabel.kt\nio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel\n*L\n195#1:243,9\n*E\n"})
public final class AtomicLabel extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f87528b;

    /* JADX INFO: renamed from: c */
    public boolean f87529c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Float f87530d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f87531e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f87532f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Integer f87533g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public InterfaceC41709m0 f87534h;

    /* JADX INFO: compiled from: AtomicLabel.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;", "", "textColor", "", "backgroundColor", "textSize", "", "textWeight", "cornerRadius", "<init>", "(IIFIF)V", "getTextColor", "()I", "getBackgroundColor", "getTextSize", "()F", "getTextWeight", "getCornerRadius", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LabelAppearance {

        /* JADX INFO: renamed from: f */
        @NotNull
        public static final Companion f87535f = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int textColor;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int backgroundColor;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final float textSize;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final int textWeight;

        /* JADX INFO: renamed from: e, reason: from toString */
        public final float cornerRadius;

        /* JADX INFO: compiled from: AtomicLabel.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance$Companion;", "", "<init>", "()V", "defaultAppearance", "Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;", BaseActivity.THEME, "Lio/trtc/tuikit/atomicx/theme/Theme;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @NotNull
            public final LabelAppearance defaultAppearance(@NotNull Theme theme) {
                Intrinsics.checkNotNullParameter(theme, "theme");
                Font regular14 = theme.getTokens().getFont().getRegular14();
                return new LabelAppearance(theme.getTokens().getColor().getTextColorPrimary(), 0, regular14.getSize(), regular14.getWeight(), 0.0f);
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LabelAppearance)) {
                return false;
            }
            LabelAppearance labelAppearance = (LabelAppearance) other;
            return this.textColor == labelAppearance.textColor && this.backgroundColor == labelAppearance.backgroundColor && Float.compare(this.textSize, labelAppearance.textSize) == 0 && this.textWeight == labelAppearance.textWeight && Float.compare(this.cornerRadius, labelAppearance.cornerRadius) == 0;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.textColor) * 31) + Integer.hashCode(this.backgroundColor)) * 31) + Float.hashCode(this.textSize)) * 31) + Integer.hashCode(this.textWeight)) * 31) + Float.hashCode(this.cornerRadius);
        }

        @NotNull
        public String toString() {
            return "LabelAppearance(textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", textSize=" + this.textSize + ", textWeight=" + this.textWeight + ", cornerRadius=" + this.cornerRadius + ')';
        }

        public LabelAppearance(@ColorInt int i11, @ColorInt int i12, float f11, int i13, float f12) {
            this.textColor = i11;
            this.backgroundColor = i12;
            this.textSize = f11;
            this.textWeight = i13;
            this.cornerRadius = f12;
        }
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.label.AtomicLabel$a */
    /* JADX INFO: compiled from: AtomicLabel.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$AppearanceProvider;", "", "provide", "Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$LabelAppearance;", BaseActivity.THEME, "Lio/trtc/tuikit/atomicx/theme/Theme;", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC39370a {
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.label.AtomicLabel$b */
    /* JADX INFO: compiled from: AtomicLabel.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$IconConfiguration;", "", "drawable", "Landroid/graphics/drawable/Drawable;", ViewProps.POSITION, "Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$IconConfiguration$Position;", "spacing", "", "size", "Landroid/util/Size;", "<init>", "(Landroid/graphics/drawable/Drawable;Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$IconConfiguration$Position;FLandroid/util/Size;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getPosition", "()Lio/trtc/tuikit/atomicx/widget/basicwidget/label/AtomicLabel$IconConfiguration$Position;", "getSpacing", "()F", "getSize", "()Landroid/util/Size;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Position", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class C39371b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicLabel(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public final void m88150e() {
        setCompoundDrawablesRelative(null, null, null, null);
    }

    @Nullable
    public final C39371b getIconConfiguration() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final Pair<String, Integer> m88153i(TypedArray typedArray, int i11) {
        String tokenKeyFromColorResId;
        int resourceId = typedArray.getResourceId(i11, -1);
        return (resourceId == -1 || (tokenKeyFromColorResId = ColorTokens.f87322B0.getTokenKeyFromColorResId(resourceId)) == null) ? new Pair<>(null, Integer.valueOf(typedArray.getColor(i11, 0))) : new Pair<>(tokenKeyFromColorResId, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicLabel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final GradientDrawable getThemeBackgroundDrawable() {
        return (GradientDrawable) this.f87528b.getValue();
    }

    /* JADX INFO: renamed from: h */
    private final void m88147h(AttributeSet attributeSet) {
        this.f87531e = ColorTokens.f87322B0.parseColorAttribute(attributeSet, R.attr.textColor, "textColor");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] AtomicLabel = R$styleable.AtomicLabel;
        Intrinsics.checkNotNullExpressionValue(AtomicLabel, "AtomicLabel");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AtomicLabel, 0, 0);
        int i11 = R$styleable.AtomicLabel_labelCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f87530d = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(i11, 0.0f));
        }
        int i12 = R$styleable.AtomicLabel_labelBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            Pair<String, Integer> pairM88153i = m88153i(typedArrayObtainStyledAttributes, i12);
            String strComponent1 = pairM88153i.component1();
            Integer numComponent2 = pairM88153i.component2();
            this.f87532f = strComponent1;
            this.f87533g = numComponent2;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: m */
    public static final GradientDrawable m88148m() {
        return new GradientDrawable();
    }

    /* JADX INFO: renamed from: d */
    public final void m88149d(Theme theme) {
        Integer numValueOf;
        int iM87991e;
        String str = this.f87531e;
        if (str != null && (iM87991e = theme.getTokens().getColor().m87991e(str)) != 0) {
            setTextColor(iM87991e);
        }
        if (this.f87532f != null) {
            ColorTokens color = theme.getTokens().getColor();
            String str2 = this.f87532f;
            Intrinsics.checkNotNull(str2);
            numValueOf = Integer.valueOf(color.m87991e(str2));
        } else {
            numValueOf = this.f87533g;
            if (numValueOf != null) {
                Intrinsics.checkNotNull(numValueOf);
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Float f11 = this.f87530d;
            m88157n(iIntValue, f11 != null ? f11.floatValue() : 0.0f);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m88151f() {
        Integer num = this.f87533g;
        if (num == null || this.f87532f != null) {
            return;
        }
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Float f11 = this.f87530d;
        m88157n(iIntValue, f11 != null ? f11.floatValue() : 0.0f);
    }

    /* JADX INFO: renamed from: j */
    public final void m88154j() {
        ThemeStore.Companion companion = ThemeStore.f87316e;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        m88152g(companion.shared(context).m87980c().getValue().getCurrentTheme());
    }

    /* JADX INFO: renamed from: k */
    public final void m88155k() {
        if (this.f87534h != null) {
            return;
        }
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(C41782z0.m91393c().getImmediate().plus(C41727q2.m91192b(null, 1, null)));
        this.f87534h = interfaceC41709m0M91125a;
        if (interfaceC41709m0M91125a != null) {
            C41696j.m91104d(interfaceC41709m0M91125a, null, null, new AtomicLabel$startThemeObservation$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m88156l() {
        InterfaceC41709m0 interfaceC41709m0 = this.f87534h;
        if (interfaceC41709m0 != null) {
            C41713n0.m91129e(interfaceC41709m0, null, 1, null);
        }
        this.f87534h = null;
    }

    public final void setAppearanceProvider(@NotNull InterfaceC39370a provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (isAttachedToWindow()) {
            m88154j();
        }
    }

    public /* synthetic */ AtomicLabel(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: g */
    public final void m88152g(Theme theme) {
        m88149d(theme);
    }

    /* JADX INFO: renamed from: n */
    public final void m88157n(@ColorInt int i11, float f11) {
        if (!Intrinsics.areEqual(getBackground(), getThemeBackgroundDrawable())) {
            setBackground(getThemeBackgroundDrawable());
            this.f87529c = true;
        }
        getThemeBackgroundDrawable().setColor(i11);
        getThemeBackgroundDrawable().setCornerRadius(f11);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m88155k();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m88156l();
    }

    public final void setIconConfiguration(@Nullable C39371b c39371b) {
        m88150e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AtomicLabel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87528b = LazyKt.lazy(new Function0() { // from class: io.trtc.tuikit.atomicx.widget.basicwidget.label.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AtomicLabel.m88148m();
            }
        });
        if (getGravity() == 0) {
            setGravity(16);
        }
        m88147h(attributeSet);
        m88151f();
    }
}
