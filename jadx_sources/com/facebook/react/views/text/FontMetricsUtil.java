package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FontMetricsUtil.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/react/views/text/FontMetricsUtil;", "", "<init>", "()V", "CAP_HEIGHT_MEASUREMENT_TEXT", "", "X_HEIGHT_MEASUREMENT_TEXT", "AMPLIFICATION_FACTOR", "", "getFontMetrics", "Lcom/facebook/react/bridge/WritableArray;", "text", "", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "paint", "Landroid/text/TextPaint;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFontMetricsUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMetricsUtil.kt\ncom/facebook/react/views/text/FontMetricsUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class FontMetricsUtil {
    private static final float AMPLIFICATION_FACTOR = 100.0f;

    @NotNull
    private static final String CAP_HEIGHT_MEASUREMENT_TEXT = "T";

    @NotNull
    public static final FontMetricsUtil INSTANCE = new FontMetricsUtil();

    @NotNull
    private static final String X_HEIGHT_MEASUREMENT_TEXT = "x";

    @JvmStatic
    @NotNull
    public static final WritableArray getFontMetrics(@NotNull CharSequence text, @NotNull Layout layout, @NotNull TextPaint paint, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(textPaint.getTextSize() * 100.0f);
        Rect rect = new Rect();
        int i11 = 0;
        int i12 = 1;
        textPaint.getTextBounds("T", 0, 1, rect);
        float fHeight = (rect.height() / 100.0f) / displayMetrics.density;
        Rect rect2 = new Rect();
        textPaint.getTextBounds(X_HEIGHT_MEASUREMENT_TEXT, 0, 1, rect2);
        float fHeight2 = (rect2.height() / 100.0f) / displayMetrics.density;
        int lineCount = layout.getLineCount();
        while (i11 < lineCount) {
            float lineWidth = (text.length() <= 0 || text.charAt(layout.getLineEnd(i11) - i12) != '\n') ? layout.getLineWidth(i11) : layout.getLineMax(i11);
            Rect rect3 = new Rect();
            layout.getLineBounds(i11, rect3);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble(X_HEIGHT_MEASUREMENT_TEXT, layout.getLineLeft(i11) / displayMetrics.density);
            writableMapCreateMap.putDouble("y", rect3.top / displayMetrics.density);
            writableMapCreateMap.putDouble("width", lineWidth / displayMetrics.density);
            writableMapCreateMap.putDouble("height", rect3.height() / displayMetrics.density);
            writableMapCreateMap.putDouble("descender", layout.getLineDescent(i11) / displayMetrics.density);
            writableMapCreateMap.putDouble("ascender", (-layout.getLineAscent(i11)) / displayMetrics.density);
            writableMapCreateMap.putDouble("baseline", layout.getLineBaseline(i11) / displayMetrics.density);
            writableMapCreateMap.putDouble("capHeight", fHeight);
            writableMapCreateMap.putDouble("xHeight", fHeight2);
            writableMapCreateMap.putString("text", text.subSequence(layout.getLineStart(i11), layout.getLineEnd(i11)).toString());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            i11++;
            i12 = 1;
        }
        Intrinsics.checkNotNull(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    private FontMetricsUtil() {
    }
}
