package androidx.media3.extractor.text.ttml;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.jumio.commons.log.LogUtils;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
final class TtmlRenderUtil {
    private static final String TAG = "TtmlRenderUtil";

    @Nullable
    public static TtmlStyle resolveStyle(@Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, Map<String, TtmlStyle> map) {
        int i11 = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i11 < length) {
                    ttmlStyle2.chain(map.get(strArr[i11]));
                    i11++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return ttmlStyle.chain(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i11 < length2) {
                    ttmlStyle.chain(map.get(strArr[i11]));
                    i11++;
                }
            }
        }
        return ttmlStyle;
    }

    public static String applyTextElementSpacePolicy(String str) {
        return str.replaceAll(LogUtils.NEW_LINE, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(" *\n *", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, C33627eb.f69716f).replaceAll("[ \t\\x0B\f\r]+", C33627eb.f69716f);
    }

    @Nullable
    private static TtmlNode findRubyContainerNode(@Nullable TtmlNode ttmlNode, Map<String, TtmlStyle> map) {
        while (ttmlNode != null) {
            TtmlStyle ttmlStyleResolveStyle = resolveStyle(ttmlNode.style, ttmlNode.getStyleIds(), map);
            if (ttmlStyleResolveStyle != null && ttmlStyleResolveStyle.getRubyType() == 1) {
                return ttmlNode;
            }
            ttmlNode = ttmlNode.parent;
        }
        return null;
    }

    @Nullable
    private static TtmlNode findRubyTextNode(TtmlNode ttmlNode, Map<String, TtmlStyle> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(ttmlNode);
        while (!arrayDeque.isEmpty()) {
            TtmlNode ttmlNode2 = (TtmlNode) arrayDeque.pop();
            TtmlStyle ttmlStyleResolveStyle = resolveStyle(ttmlNode2.style, ttmlNode2.getStyleIds(), map);
            if (ttmlStyleResolveStyle != null && ttmlStyleResolveStyle.getRubyType() == 3) {
                return ttmlNode2;
            }
            for (int childCount = ttmlNode2.getChildCount() - 1; childCount >= 0; childCount--) {
                arrayDeque.push(ttmlNode2.getChild(childCount));
            }
        }
        return null;
    }

    private TtmlRenderUtil() {
    }

    public static void applyStylesToSpan(Spannable spannable, int i11, int i12, TtmlStyle ttmlStyle, @Nullable TtmlNode ttmlNode, Map<String, TtmlStyle> map, int i13) {
        TtmlNode ttmlNodeFindRubyTextNode;
        int rubyPosition;
        TtmlStyle ttmlStyleResolveStyle;
        int i14;
        if (ttmlStyle.getStyle() != -1) {
            spannable.setSpan(new StyleSpan(ttmlStyle.getStyle()), i11, i12, 33);
        }
        if (ttmlStyle.isLinethrough()) {
            spannable.setSpan(new StrikethroughSpan(), i11, i12, 33);
        }
        if (ttmlStyle.isUnderline()) {
            spannable.setSpan(new UnderlineSpan(), i11, i12, 33);
        }
        if (ttmlStyle.hasFontColor()) {
            SpanUtil.addOrReplaceSpan(spannable, new ForegroundColorSpan(ttmlStyle.getFontColor()), i11, i12, 33);
        }
        if (ttmlStyle.hasBackgroundColor()) {
            SpanUtil.addOrReplaceSpan(spannable, new BackgroundColorSpan(ttmlStyle.getBackgroundColor()), i11, i12, 33);
        }
        if (ttmlStyle.getFontFamily() != null) {
            SpanUtil.addOrReplaceSpan(spannable, new TypefaceSpan(ttmlStyle.getFontFamily()), i11, i12, 33);
        }
        if (ttmlStyle.getTextEmphasis() != null) {
            TextEmphasis textEmphasis = (TextEmphasis) Assertions.checkNotNull(ttmlStyle.getTextEmphasis());
            int i15 = textEmphasis.markShape;
            if (i15 == -1) {
                if (i13 != 2 && i13 != 1) {
                    i15 = 1;
                } else {
                    i15 = 3;
                }
                i14 = 1;
            } else {
                i14 = textEmphasis.markFill;
            }
            int i16 = textEmphasis.position;
            if (i16 == -2) {
                i16 = 1;
            }
            SpanUtil.addOrReplaceSpan(spannable, new TextEmphasisSpan(i15, i14, i16), i11, i12, 33);
        }
        int rubyType = ttmlStyle.getRubyType();
        if (rubyType != 2) {
            if (rubyType == 3 || rubyType == 4) {
                spannable.setSpan(new DeleteTextSpan(), i11, i12, 33);
            }
        } else {
            TtmlNode ttmlNodeFindRubyContainerNode = findRubyContainerNode(ttmlNode, map);
            if (ttmlNodeFindRubyContainerNode != null && (ttmlNodeFindRubyTextNode = findRubyTextNode(ttmlNodeFindRubyContainerNode, map)) != null) {
                if (ttmlNodeFindRubyTextNode.getChildCount() == 1 && ttmlNodeFindRubyTextNode.getChild(0).text != null) {
                    String str = (String) Util.castNonNull(ttmlNodeFindRubyTextNode.getChild(0).text);
                    TtmlStyle ttmlStyleResolveStyle2 = resolveStyle(ttmlNodeFindRubyTextNode.style, ttmlNodeFindRubyTextNode.getStyleIds(), map);
                    if (ttmlStyleResolveStyle2 != null) {
                        rubyPosition = ttmlStyleResolveStyle2.getRubyPosition();
                    } else {
                        rubyPosition = -1;
                    }
                    if (rubyPosition == -1 && (ttmlStyleResolveStyle = resolveStyle(ttmlNodeFindRubyContainerNode.style, ttmlNodeFindRubyContainerNode.getStyleIds(), map)) != null) {
                        rubyPosition = ttmlStyleResolveStyle.getRubyPosition();
                    }
                    spannable.setSpan(new RubySpan(str, rubyPosition), i11, i12, 33);
                } else {
                    Log.m2959i(TAG, "Skipping rubyText node without exactly one text child.");
                }
            }
        }
        if (ttmlStyle.getTextCombine()) {
            SpanUtil.addOrReplaceSpan(spannable, new HorizontalTextInVerticalContextSpan(), i11, i12, 33);
        }
        int fontSizeUnit = ttmlStyle.getFontSizeUnit();
        if (fontSizeUnit != 1) {
            if (fontSizeUnit != 2) {
                if (fontSizeUnit != 3) {
                    return;
                }
                SpanUtil.addInheritedRelativeSizeSpan(spannable, ttmlStyle.getFontSize() / 100.0f, i11, i12, 33);
                return;
            }
            SpanUtil.addOrReplaceSpan(spannable, new RelativeSizeSpan(ttmlStyle.getFontSize()), i11, i12, 33);
            return;
        }
        SpanUtil.addOrReplaceSpan(spannable, new AbsoluteSizeSpan((int) ttmlStyle.getFontSize(), true), i11, i12, 33);
    }

    public static void endParagraph(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
