package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactTextUpdate.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001c\u0018\u0000 $2\u00020\u0001:\u0001$BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011BI\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0014B9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0015J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u0006%"}, m90084d2 = {"Lcom/facebook/react/views/text/ReactTextUpdate;", "", "text", "Landroid/text/Spannable;", "jsEventCounter", "", "containsImages", "", ViewProps.PADDING_LEFT, "", ViewProps.PADDING_TOP, ViewProps.PADDING_RIGHT, ViewProps.PADDING_BOTTOM, "textAlign", ViewProps.TEXT_BREAK_STRATEGY, "justificationMode", "<init>", "(Landroid/text/Spannable;IZFFFFIII)V", ViewProps.PADDING_START, ViewProps.PADDING_END, "(Landroid/text/Spannable;IZFFFFI)V", "(Landroid/text/Spannable;IZIII)V", "getText", "()Landroid/text/Spannable;", "getJsEventCounter", "()I", "getContainsImages", "()Z", "getPaddingLeft", "()F", "getPaddingTop", "getPaddingRight", "getPaddingBottom", "getTextAlign", "getTextBreakStrategy", "getJustificationMode", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ReactTextUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean containsImages;
    private final int jsEventCounter;
    private final int justificationMode;
    private final float paddingBottom;
    private final float paddingLeft;
    private final float paddingRight;
    private final float paddingTop;

    @NotNull
    private final Spannable text;
    private final int textAlign;
    private final int textBreakStrategy;

    /* JADX INFO: compiled from: ReactTextUpdate.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¨\u0006\r"}, m90084d2 = {"Lcom/facebook/react/views/text/ReactTextUpdate$Companion;", "", "<init>", "()V", "buildReactTextUpdateFromState", "Lcom/facebook/react/views/text/ReactTextUpdate;", "text", "Landroid/text/Spannable;", "jsEventCounter", "", "textAlign", ViewProps.TEXT_BREAK_STRATEGY, "justificationMode", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ReactTextUpdate buildReactTextUpdateFromState(@NotNull Spannable text, int jsEventCounter, int textAlign, int textBreakStrategy, int justificationMode) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ReactTextUpdate(text, jsEventCounter, false, textAlign, textBreakStrategy, justificationMode);
        }
    }

    public ReactTextUpdate(@NotNull Spannable text, int i11, boolean z11, float f11, float f12, float f13, float f14, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.jsEventCounter = i11;
        this.containsImages = z11;
        this.paddingLeft = f11;
        this.paddingTop = f12;
        this.paddingRight = f13;
        this.paddingBottom = f14;
        this.textAlign = i12;
        this.textBreakStrategy = i13;
        this.justificationMode = i14;
    }

    @JvmStatic
    @NotNull
    public static final ReactTextUpdate buildReactTextUpdateFromState(@NotNull Spannable spannable, int i11, int i12, int i13, int i14) {
        return INSTANCE.buildReactTextUpdateFromState(spannable, i11, i12, i13, i14);
    }

    @Deprecated(message = "This is just for backwards compatibility and will be removed some time in the future", replaceWith = @ReplaceWith(expression = "containsImages", imports = {}))
    /* JADX INFO: renamed from: containsImages, reason: from getter */
    public final boolean getContainsImages() {
        return this.containsImages;
    }

    public final boolean getContainsImages() {
        return this.containsImages;
    }

    public final int getJsEventCounter() {
        return this.jsEventCounter;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public final float getPaddingBottom() {
        return this.paddingBottom;
    }

    public final float getPaddingLeft() {
        return this.paddingLeft;
    }

    public final float getPaddingRight() {
        return this.paddingRight;
    }

    public final float getPaddingTop() {
        return this.paddingTop;
    }

    @NotNull
    public final Spannable getText() {
        return this.text;
    }

    public final int getTextAlign() {
        return this.textAlign;
    }

    public final int getTextBreakStrategy() {
        return this.textBreakStrategy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactTextUpdate(@NotNull Spannable text, int i11, boolean z11, float f11, float f12, float f13, float f14, int i12) {
        this(text, i11, z11, f11, f12, f13, f14, i12, 1, 0);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactTextUpdate(@NotNull Spannable text, int i11, boolean z11, int i12, int i13, int i14) {
        this(text, i11, z11, -1.0f, -1.0f, -1.0f, -1.0f, i12, i13, i14);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
