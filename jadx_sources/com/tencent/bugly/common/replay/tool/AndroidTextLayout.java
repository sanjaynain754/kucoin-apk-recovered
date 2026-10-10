package com.tencent.bugly.common.replay.tool;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/tool/AndroidTextLayout;", "Lcom/tencent/bugly/common/replay/tool/TextLayout;", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "dominantTextColor", "", "getDominantTextColor", "()Ljava/lang/Integer;", "lineCount", "getLineCount", "()I", "getEllipsisCount", "line", "getLineBottom", "getLineStart", "getLineTop", "getLineVisibleEnd", "getPrimaryHorizontal", "", TypedValues.CycleType.S_WAVE_OFFSET, "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AndroidTextLayout implements TextLayout {

    @NotNull
    private final Layout layout;

    public AndroidTextLayout(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
    }

    @Override // com.tencent.bugly.common.replay.tool.TextLayout
    @Nullable
    public Integer getDominantTextColor() {
        int i11;
        if (!(this.layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.layout.getText();
        if (text == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.text.Spanned");
        }
        ForegroundColorSpan[] spans = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.layout.getText().length(), ForegroundColorSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "spans");
        int i12 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : spans) {
            CharSequence text2 = this.layout.getText();
            if (text2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.text.Spanned");
            }
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.layout.getText();
            if (text3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.text.Spanned");
            }
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i11 = spanEnd - spanStart) > i12) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i12 = i11;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(ViewsKt.toOpaque(numValueOf.intValue()));
        }
        return null;
    }

    @Override // com.tencent.bugly.common.replay.tool.TextLayout
    public int getEllipsisCount(int line) {
        return this.layout.getEllipsisCount(line);
    }

    @Override // com.tencent.bugly.common.replay.tool.TextLayout
    public int getLineBottom(int line) {
        return this.layout.getLineBottom(line);
    }

    @Override // com.tencent.bugly.common.replay.tool.TextLayout
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // com.tencent.bugly.common.replay.tool.TextLayout
    public int getLineStart(int line) {
        return this.layout.getLineStart(line);
    }

    @Override // com.tencent.bugly.common.replay.tool.TextLayout
    public int getLineTop(int line) {
        return this.layout.getLineTop(line);
    }

    @Override // com.tencent.bugly.common.replay.tool.TextLayout
    public int getLineVisibleEnd(int line) {
        return this.layout.getLineVisibleEnd(line);
    }

    @Override // com.tencent.bugly.common.replay.tool.TextLayout
    public float getPrimaryHorizontal(int line, int offset) {
        return this.layout.getPrimaryHorizontal(offset);
    }
}
