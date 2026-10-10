package androidx.media3.p022ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    private static int anchorTypeToTranslatePercent(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertVerticalTypeToCss(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    /* JADX INFO: renamed from: androidx.media3.ui.WebViewSubtitleOutput$2 */
    public static /* synthetic */ class C36312 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.EMPTY_LIST;
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    private static String convertAlignmentToCss(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i11 = C36312.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? TtmlNode.CENTER : "end";
        }
        return "start";
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i11 = captionStyleCompat.edgeType;
        if (i11 == 1) {
            return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i11 == 2) {
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i11 != 3) {
            return i11 != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        float f11 = cue.shearDegrees;
        if (f11 == 0.0f) {
            return "";
        }
        int i11 = cue.verticalType;
        return Util.formatInvariant("%s(%.2fdeg)", (i11 == 2 || i11 == 1) ? "skewY" : "skewX", Float.valueOf(f11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:28:0x0109  */
    /* JADX WARN: Code duplicated, block: B:31:0x0124  */
    /* JADX WARN: Code duplicated, block: B:32:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0140  */
    /* JADX WARN: Code duplicated, block: B:39:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x014a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0189  */
    /* JADX WARN: Code duplicated, block: B:60:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fd  */
    private void updateWebView() {
        float f11;
        String invariant;
        int iAnchorTypeToTranslatePercent;
        boolean z11;
        String str;
        float f12;
        String invariant2;
        int i11;
        int i12;
        String str2;
        String str3;
        String str4;
        Object obj;
        String str5;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCssConvert;
        Layout.Alignment alignment;
        String str6;
        boolean z12;
        StringBuilder sb2 = new StringBuilder();
        String cssRgba = HtmlUtils.toCssRgba(this.style.foregroundColor);
        String strConvertTextSizeToCss = convertTextSizeToCss(this.defaultTextSizeType, this.defaultTextSize);
        float f13 = CSS_LINE_HEIGHT;
        sb2.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", cssRgba, strConvertTextSizeToCss, Float.valueOf(CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(this.style)));
        HashMap map = new HashMap();
        map.put(HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(this.style.backgroundColor)));
        int i13 = 0;
        while (i13 < this.textCues.size()) {
            Cue cue = this.textCues.get(i13);
            float f14 = cue.position;
            float f15 = f14 != -3.4028235E38f ? f14 * 100.0f : 50.0f;
            int iAnchorTypeToTranslatePercent2 = anchorTypeToTranslatePercent(cue.positionAnchor);
            float f16 = cue.line;
            float f17 = f13;
            if (f16 != -3.4028235E38f) {
                if (cue.lineType != 1) {
                    String invariant3 = Util.formatInvariant("%.2f%%", Float.valueOf(f16 * 100.0f));
                    iAnchorTypeToTranslatePercent = cue.verticalType == 1 ? -anchorTypeToTranslatePercent(cue.lineAnchor) : anchorTypeToTranslatePercent(cue.lineAnchor);
                    f11 = -3.4028235E38f;
                    str = invariant3;
                    z11 = false;
                } else {
                    f11 = -3.4028235E38f;
                    if (f16 >= 0.0f) {
                        invariant = Util.formatInvariant("%.2fem", Float.valueOf(f16 * f17));
                        z11 = false;
                        iAnchorTypeToTranslatePercent = 0;
                    } else {
                        invariant = Util.formatInvariant("%.2fem", Float.valueOf(((-f16) - 1.0f) * f17));
                        iAnchorTypeToTranslatePercent = 0;
                        z11 = true;
                    }
                }
                f12 = cue.size;
                if (f12 != f11) {
                    invariant2 = Util.formatInvariant("%.2f%%", Float.valueOf(f12 * 100.0f));
                } else {
                    invariant2 = "fit-content";
                }
                String str7 = invariant2;
                String strConvertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                String strConvertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                String strConvertTextSizeToCss2 = convertTextSizeToCss(cue.textSizeType, cue.textSize);
                if (cue.windowColorSet) {
                    i11 = cue.windowColor;
                } else {
                    i11 = this.style.windowColor;
                }
                String cssRgba2 = HtmlUtils.toCssRgba(i11);
                i12 = cue.verticalType;
                str2 = "right";
                str3 = ViewProps.TOP;
                if (i12 != 1) {
                    if (z11) {
                        str2 = "left";
                    }
                    str4 = str2;
                    obj = ViewProps.TOP;
                } else if (i12 != 2) {
                    if (z11) {
                        str3 = ViewProps.BOTTOM;
                    }
                    str4 = str3;
                    obj = "left";
                } else {
                    if (!z11) {
                        str2 = "left";
                    }
                    str4 = str2;
                    obj = ViewProps.TOP;
                }
                if (i12 != 2 || i12 == 1) {
                    str5 = "height";
                    int i14 = iAnchorTypeToTranslatePercent;
                    iAnchorTypeToTranslatePercent = iAnchorTypeToTranslatePercent2;
                    iAnchorTypeToTranslatePercent2 = i14;
                } else {
                    str5 = "width";
                }
                String str8 = str5;
                htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                for (String str9 : map.keySet()) {
                    str6 = (String) map.put(str9, (String) map.get(str9));
                    if (str6 != null || str6.equals(map.get(str9))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Assertions.checkState(z12);
                }
                sb2.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i13), obj, Float.valueOf(f15), str4, str, str8, str7, strConvertAlignmentToCss, strConvertVerticalTypeToCss, strConvertTextSizeToCss2, cssRgba2, Integer.valueOf(iAnchorTypeToTranslatePercent2), Integer.valueOf(iAnchorTypeToTranslatePercent), getBlockShearTransformFunction(cue)));
                sb2.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                alignment = cue.multiRowAlignment;
                if (alignment != null) {
                    sb2.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                    sb2.append(htmlAndCssConvert.html);
                    sb2.append("</span>");
                } else {
                    sb2.append(htmlAndCssConvert.html);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i13++;
                f13 = f17;
            } else {
                f11 = -3.4028235E38f;
                invariant = Util.formatInvariant("%.2f%%", Float.valueOf((1.0f - this.bottomPaddingFraction) * 100.0f));
                iAnchorTypeToTranslatePercent = -100;
                z11 = false;
            }
            str = invariant;
            f12 = cue.size;
            if (f12 != f11) {
                invariant2 = Util.formatInvariant("%.2f%%", Float.valueOf(f12 * 100.0f));
            } else {
                invariant2 = "fit-content";
            }
            String str10 = invariant2;
            String strConvertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            String strConvertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            String strConvertTextSizeToCss3 = convertTextSizeToCss(cue.textSizeType, cue.textSize);
            if (cue.windowColorSet) {
                i11 = cue.windowColor;
            } else {
                i11 = this.style.windowColor;
            }
            String cssRgba3 = HtmlUtils.toCssRgba(i11);
            i12 = cue.verticalType;
            str2 = "right";
            str3 = ViewProps.TOP;
            if (i12 != 1) {
                if (z11) {
                    str2 = "left";
                }
                str4 = str2;
                obj = ViewProps.TOP;
            } else if (i12 != 2) {
                if (z11) {
                    str3 = ViewProps.BOTTOM;
                }
                str4 = str3;
                obj = "left";
            } else {
                if (!z11) {
                    str2 = "left";
                }
                str4 = str2;
                obj = ViewProps.TOP;
            }
            if (i12 != 2) {
                str5 = "height";
                int i15 = iAnchorTypeToTranslatePercent;
                iAnchorTypeToTranslatePercent = iAnchorTypeToTranslatePercent2;
                iAnchorTypeToTranslatePercent2 = i15;
            } else {
                str5 = "height";
                int i16 = iAnchorTypeToTranslatePercent;
                iAnchorTypeToTranslatePercent = iAnchorTypeToTranslatePercent2;
                iAnchorTypeToTranslatePercent2 = i16;
            }
            String str11 = str5;
            htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str6 = (String) map.put(str9, (String) map.get(str9));
                if (str6 != null) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                Assertions.checkState(z12);
            }
            sb2.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i13), obj, Float.valueOf(f15), str4, str, str11, str10, strConvertAlignmentToCss2, strConvertVerticalTypeToCss2, strConvertTextSizeToCss3, cssRgba3, Integer.valueOf(iAnchorTypeToTranslatePercent2), Integer.valueOf(iAnchorTypeToTranslatePercent), getBlockShearTransformFunction(cue)));
            sb2.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            alignment = cue.multiRowAlignment;
            if (alignment != null) {
                sb2.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                sb2.append(htmlAndCssConvert.html);
                sb2.append("</span>");
            } else {
                sb2.append(htmlAndCssConvert.html);
            }
            sb2.append("</span>");
            sb2.append("</div>");
            i13++;
            f13 = f17;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html><head><style>");
        for (String str12 : map.keySet()) {
            sb3.append(str12);
            sb3.append("{");
            sb3.append((String) map.get(str12));
            sb3.append("}");
        }
        sb3.append("</style></head>");
        sb2.insert(0, sb3.toString());
        this.webView.loadData(Base64.encodeToString(sb2.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    public void destroy() {
        this.webView.destroy();
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f11, int i11, float f12) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f11;
        this.defaultTextSizeType = i11;
        this.bottomPaddingFraction = f12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            Cue cue = list.get(i12);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f11, i11, f12);
        invalidate();
    }

    private String convertTextSizeToCss(int i11, float f11) {
        float fResolveTextSize = SubtitleViewUtils.resolveTextSize(i11, f11, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fResolveTextSize == -3.4028235E38f) {
            return "unset";
        }
        return Util.formatInvariant("%.2fpx", Float.valueOf(fResolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11 && !this.textCues.isEmpty()) {
            updateWebView();
        }
    }
}
