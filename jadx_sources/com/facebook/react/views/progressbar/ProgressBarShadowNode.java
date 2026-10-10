package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.AbstractC6262a;
import com.facebook.yoga.YogaMeasureMode;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193d7.C36635h;
import p193d7.InterfaceC36634g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProgressBarShadowNode.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R.\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lcom/facebook/react/views/progressbar/ProgressBarShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Ld7/g;", "<init>", "()V", "Lcom/facebook/yoga/a;", "node", "", "width", "Lcom/facebook/yoga/YogaMeasureMode;", "widthMode", "height", "heightMode", "", "measure", "(Lcom/facebook/yoga/a;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;)J", "Landroid/util/SparseIntArray;", "Landroid/util/SparseIntArray;", "", "", "measured", "Ljava/util/Set;", "", "value", TtmlNode.TAG_STYLE, "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "setStyle", "(Ljava/lang/String;)V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ProgressBarShadowNode extends LayoutShadowNode implements InterfaceC36634g {

    @Nullable
    private String style;

    @NotNull
    private final SparseIntArray height = new SparseIntArray();

    @NotNull
    private final SparseIntArray width = new SparseIntArray();

    @NotNull
    private final Set<Integer> measured = new HashSet();

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @Override // p193d7.InterfaceC36634g
    public long measure(@NotNull AbstractC6262a node, float width, @NotNull YogaMeasureMode widthMode, float height, @NotNull YogaMeasureMode heightMode) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        ReactProgressBarViewManager.Companion companion = ReactProgressBarViewManager.INSTANCE;
        int styleFromString$ReactAndroid_release = companion.getStyleFromString$ReactAndroid_release(this.style);
        if (!this.measured.contains(Integer.valueOf(styleFromString$ReactAndroid_release))) {
            ProgressBar progressBarCreateProgressBar = companion.createProgressBar(getThemedContext(), styleFromString$ReactAndroid_release);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.height.put(styleFromString$ReactAndroid_release, progressBarCreateProgressBar.getMeasuredHeight());
            this.width.put(styleFromString$ReactAndroid_release, progressBarCreateProgressBar.getMeasuredWidth());
            this.measured.add(Integer.valueOf(styleFromString$ReactAndroid_release));
        }
        return C36635h.m81967b(this.width.get(styleFromString$ReactAndroid_release), this.height.get(styleFromString$ReactAndroid_release));
    }

    @ReactProp(name = ReactProgressBarViewManager.PROP_STYLE)
    public final void setStyle(@Nullable String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.style = str;
    }

    public ProgressBarShadowNode() {
        setMeasureFunction(this);
        this.style = ReactProgressBarViewManager.DEFAULT_STYLE;
    }
}
