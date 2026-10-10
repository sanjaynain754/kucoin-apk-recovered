package androidx.window.embedding;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SplitRule.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u0000 -2\u00020\u0001:\u0004+,-.BM\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u001d\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\b#J\u001a\u0010$\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010%\u001a\u00020\u0005H\u0002J\u0013\u0010&\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0003H\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006/"}, m90084d2 = {"Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/EmbeddingRule;", "tag", "", "minWidthDp", "", "minHeightDp", "minSmallestWidthDp", "maxAspectRatioInPortrait", "Landroidx/window/embedding/EmbeddingAspectRatio;", "maxAspectRatioInLandscape", "defaultSplitAttributes", "Landroidx/window/embedding/SplitAttributes;", "(Ljava/lang/String;IIILandroidx/window/embedding/EmbeddingAspectRatio;Landroidx/window/embedding/EmbeddingAspectRatio;Landroidx/window/embedding/SplitAttributes;)V", "getDefaultSplitAttributes", "()Landroidx/window/embedding/SplitAttributes;", "getMaxAspectRatioInLandscape", "()Landroidx/window/embedding/EmbeddingAspectRatio;", "getMaxAspectRatioInPortrait", "getMinHeightDp", "()I", "getMinSmallestWidthDp", "getMinWidthDp", "checkParentBounds", "", "density", "", "bounds", "Landroid/graphics/Rect;", "checkParentBounds$window_release", "checkParentMetrics", "context", "Landroid/content/Context;", "parentMetrics", "Landroid/view/WindowMetrics;", "checkParentMetrics$window_release", "convertDpToPx", "dimensionDp", "equals", "other", "", "hashCode", "toString", "Api30Impl", "Api34Impl", "Companion", "FinishBehavior", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class SplitRule extends EmbeddingRule {
    public static final int SPLIT_MIN_DIMENSION_ALWAYS_ALLOW = 0;
    public static final int SPLIT_MIN_DIMENSION_DP_DEFAULT = 600;

    @NotNull
    private final SplitAttributes defaultSplitAttributes;

    @NotNull
    private final EmbeddingAspectRatio maxAspectRatioInLandscape;

    @NotNull
    private final EmbeddingAspectRatio maxAspectRatioInPortrait;
    private final int minHeightDp;
    private final int minSmallestWidthDp;
    private final int minWidthDp;

    @JvmField
    @NotNull
    public static final EmbeddingAspectRatio SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT = EmbeddingAspectRatio.INSTANCE.ratio(1.4f);

    @JvmField
    @NotNull
    public static final EmbeddingAspectRatio SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT = EmbeddingAspectRatio.ALWAYS_ALLOW;

    /* JADX INFO: compiled from: SplitRule.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Landroidx/window/embedding/SplitRule$FinishBehavior;", "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "value", "", "(Ljava/lang/String;I)V", "getValue$window_release", "()I", "toString", "Companion", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class FinishBehavior {

        @NotNull
        private final String description;
        private final int value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        public static final FinishBehavior NEVER = new FinishBehavior("NEVER", 0);

        @JvmField
        @NotNull
        public static final FinishBehavior ALWAYS = new FinishBehavior("ALWAYS", 1);

        @JvmField
        @NotNull
        public static final FinishBehavior ADJACENT = new FinishBehavior("ADJACENT", 2);

        /* JADX INFO: compiled from: SplitRule.kt */
        @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Landroidx/window/embedding/SplitRule$FinishBehavior$Companion;", "", "()V", "ADJACENT", "Landroidx/window/embedding/SplitRule$FinishBehavior;", "ALWAYS", "NEVER", "getFinishBehaviorFromValue", "value", "", "getFinishBehaviorFromValue$window_release", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final FinishBehavior getFinishBehaviorFromValue$window_release(@IntRange(from = 0, m1553to = 2) int value) {
                FinishBehavior finishBehavior = FinishBehavior.NEVER;
                if (value == finishBehavior.getValue()) {
                    return finishBehavior;
                }
                FinishBehavior finishBehavior2 = FinishBehavior.ALWAYS;
                if (value == finishBehavior2.getValue()) {
                    return finishBehavior2;
                }
                FinishBehavior finishBehavior3 = FinishBehavior.ADJACENT;
                if (value == finishBehavior3.getValue()) {
                    return finishBehavior3;
                }
                throw new IllegalArgumentException("Unknown finish behavior:" + value);
            }
        }

        /* JADX INFO: renamed from: getValue$window_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }

        private FinishBehavior(String str, int i11) {
            this.description = str;
            this.value = i11;
        }
    }

    public /* synthetic */ SplitRule(String str, int i11, int i12, int i13, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, SplitAttributes splitAttributes, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? 600 : i11, (i14 & 4) != 0 ? 600 : i12, (i14 & 8) != 0 ? 600 : i13, (i14 & 16) != 0 ? SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i14 & 32) != 0 ? SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2, splitAttributes);
    }

    private final int convertDpToPx(float density, @IntRange(from = 0) int dimensionDp) {
        return (int) ((dimensionDp * density) + 0.5f);
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitRule) || !super.equals(other)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) other;
        return this.minWidthDp == splitRule.minWidthDp && this.minHeightDp == splitRule.minHeightDp && this.minSmallestWidthDp == splitRule.minSmallestWidthDp && Intrinsics.areEqual(this.maxAspectRatioInPortrait, splitRule.maxAspectRatioInPortrait) && Intrinsics.areEqual(this.maxAspectRatioInLandscape, splitRule.maxAspectRatioInLandscape) && Intrinsics.areEqual(this.defaultSplitAttributes, splitRule.defaultSplitAttributes);
    }

    /* JADX INFO: compiled from: SplitRule.kt */
    @RequiresApi(30)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Landroidx/window/embedding/SplitRule$Api30Impl;", "", "()V", "getBounds", "Landroid/graphics/Rect;", "windowMetrics", "Landroid/view/WindowMetrics;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api30Impl {

        @NotNull
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        @NotNull
        public final Rect getBounds(@NotNull WindowMetrics windowMetrics) {
            Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    /* JADX INFO: compiled from: SplitRule.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m90084d2 = {"Landroidx/window/embedding/SplitRule$Api34Impl;", "", "()V", "getDensity", "", "windowMetrics", "Landroid/view/WindowMetrics;", "context", "Landroid/content/Context;", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @DoNotInline
        public final float getDensity(@NotNull WindowMetrics windowMetrics, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                return windowMetrics.getDensity();
            } catch (NoSuchMethodError unused) {
                return context.getResources().getDisplayMetrics().density;
            }
        }
    }

    public final boolean checkParentBounds$window_release(float density, @NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth != 0 && iHeight != 0) {
            int iConvertDpToPx = convertDpToPx(density, this.minWidthDp);
            int iConvertDpToPx2 = convertDpToPx(density, this.minHeightDp);
            int iConvertDpToPx3 = convertDpToPx(density, this.minSmallestWidthDp);
            boolean z11 = this.minWidthDp == 0 || iWidth >= iConvertDpToPx;
            boolean z12 = this.minHeightDp == 0 || iHeight >= iConvertDpToPx2;
            boolean z13 = this.minSmallestWidthDp == 0 || Math.min(iWidth, iHeight) >= iConvertDpToPx3;
            boolean z14 = iHeight < iWidth ? Intrinsics.areEqual(this.maxAspectRatioInLandscape, EmbeddingAspectRatio.ALWAYS_ALLOW) || (((float) iWidth) * 1.0f) / ((float) iHeight) <= this.maxAspectRatioInLandscape.getValue() : Intrinsics.areEqual(this.maxAspectRatioInPortrait, EmbeddingAspectRatio.ALWAYS_ALLOW) || (((float) iHeight) * 1.0f) / ((float) iWidth) <= this.maxAspectRatioInPortrait.getValue();
            if (z11 && z12 && z13 && z14) {
                return true;
            }
        }
        return false;
    }

    public final boolean checkParentMetrics$window_release(@NotNull Context context, @NotNull WindowMetrics parentMetrics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentMetrics, "parentMetrics");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 30) {
            return false;
        }
        return checkParentBounds$window_release(i11 <= 33 ? context.getResources().getDisplayMetrics().density : Api34Impl.INSTANCE.getDensity(parentMetrics, context), Api30Impl.INSTANCE.getBounds(parentMetrics));
    }

    @NotNull
    public final SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }

    @NotNull
    public final EmbeddingAspectRatio getMaxAspectRatioInLandscape() {
        return this.maxAspectRatioInLandscape;
    }

    @NotNull
    public final EmbeddingAspectRatio getMaxAspectRatioInPortrait() {
        return this.maxAspectRatioInPortrait;
    }

    public final int getMinHeightDp() {
        return this.minHeightDp;
    }

    public final int getMinSmallestWidthDp() {
        return this.minSmallestWidthDp;
    }

    public final int getMinWidthDp() {
        return this.minWidthDp;
    }

    @NotNull
    public String toString() {
        return SplitRule.class.getSimpleName() + "{ tag=" + getTag() + ", defaultSplitAttributes=" + this.defaultSplitAttributes + ", minWidthDp=" + this.minWidthDp + ", minHeightDp=" + this.minHeightDp + ", minSmallestWidthDp=" + this.minSmallestWidthDp + ", maxAspectRatioInPortrait=" + this.maxAspectRatioInPortrait + ", maxAspectRatioInLandscape=" + this.maxAspectRatioInLandscape + '}';
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + this.minWidthDp) * 31) + this.minHeightDp) * 31) + this.minSmallestWidthDp) * 31) + this.maxAspectRatioInPortrait.hashCode()) * 31) + this.maxAspectRatioInLandscape.hashCode()) * 31) + this.defaultSplitAttributes.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitRule(@Nullable String str, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, @IntRange(from = 0) int i13, @NotNull EmbeddingAspectRatio maxAspectRatioInPortrait, @NotNull EmbeddingAspectRatio maxAspectRatioInLandscape, @NotNull SplitAttributes defaultSplitAttributes) {
        super(str);
        Intrinsics.checkNotNullParameter(maxAspectRatioInPortrait, "maxAspectRatioInPortrait");
        Intrinsics.checkNotNullParameter(maxAspectRatioInLandscape, "maxAspectRatioInLandscape");
        Intrinsics.checkNotNullParameter(defaultSplitAttributes, "defaultSplitAttributes");
        this.minWidthDp = i11;
        this.minHeightDp = i12;
        this.minSmallestWidthDp = i13;
        this.maxAspectRatioInPortrait = maxAspectRatioInPortrait;
        this.maxAspectRatioInLandscape = maxAspectRatioInLandscape;
        this.defaultSplitAttributes = defaultSplitAttributes;
        Preconditions.checkArgumentNonnegative(i11, "minWidthDp must be non-negative");
        Preconditions.checkArgumentNonnegative(i12, "minHeightDp must be non-negative");
        Preconditions.checkArgumentNonnegative(i13, "minSmallestWidthDp must be non-negative");
    }
}
