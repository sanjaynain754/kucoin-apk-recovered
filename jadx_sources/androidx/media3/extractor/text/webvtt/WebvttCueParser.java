package androidx.media3.extractor.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.VoiceSpan;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> DEFAULT_BACKGROUND_COLORS;
    static final float DEFAULT_POSITION = 0.5f;
    private static final Map<String, Integer> DEFAULT_TEXT_COLORS;
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_RUBY = "ruby";
    private static final String TAG_RUBY_TEXT = "rt";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    public static class Element {
        private static final Comparator<Element> BY_START_POSITION_ASC = new Comparator() { // from class: androidx.media3.extractor.text.webvtt.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((WebvttCueParser.Element) obj).startTag.position, ((WebvttCueParser.Element) obj2).startTag.position);
            }
        };
        private final int endPosition;
        private final StartTag startTag;

        private Element(StartTag startTag, int i11) {
            this.startTag = startTag;
            this.endPosition = i11;
        }
    }

    public static final class StartTag {
        public final Set<String> classes;
        public final String name;
        public final int position;
        public final String voice;

        public static StartTag buildWholeCueVirtualTag() {
            return new StartTag("", 0, "", Collections.EMPTY_SET);
        }

        private StartTag(String str, int i11, String str2, Set<String> set) {
            this.position = i11;
            this.name = str;
            this.voice = str2;
            this.classes = set;
        }

        public static StartTag buildStartTag(String str, int i11) {
            String str2;
            String strTrim = str.trim();
            Assertions.checkArgument(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(C33627eb.f69716f);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrSplit = Util.split(strTrim, "\\.");
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i12 = 1; i12 < strArrSplit.length; i12++) {
                hashSet.add(strArrSplit[i12]);
            }
            return new StartTag(str3, i11, str2, hashSet);
        }
    }

    public static final class StyleMatch implements Comparable<StyleMatch> {
        public final int score;
        public final WebvttCssStyle style;

        @Override // java.lang.Comparable
        public int compareTo(StyleMatch styleMatch) {
            return Integer.compare(this.score, styleMatch.score);
        }

        public StyleMatch(int i11, WebvttCssStyle webvttCssStyle) {
            this.score = i11;
            this.style = webvttCssStyle;
        }
    }

    public static final class WebvttCueInfoBuilder {
        public CharSequence text;
        public long startTimeUs = 0;
        public long endTimeUs = 0;
        public int textAlignment = 2;
        public float line = -3.4028235E38f;
        public int lineType = 1;
        public int lineAnchor = 0;
        public float position = -3.4028235E38f;
        public int positionAnchor = Integer.MIN_VALUE;
        public float size = 1.0f;
        public int verticalType = Integer.MIN_VALUE;

        @Nullable
        private static Layout.Alignment convertTextAlignment(int i11) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            Log.m2961w(WebvttCueParser.TAG, "Unknown textAlignment: " + i11);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float derivePosition(int i11) {
            if (i11 != 4) {
                return i11 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int derivePositionAnchor(int i11) {
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 3) {
                return 2;
            }
            if (i11 != 4) {
                return i11 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static float deriveMaxSize(int i11, float f11) {
            if (i11 == 0) {
                return 1.0f - f11;
            }
            if (i11 == 1) {
                return f11 <= 0.5f ? f11 * 2.0f : (1.0f - f11) * 2.0f;
            }
            if (i11 == 2) {
                return f11;
            }
            throw new IllegalStateException(String.valueOf(i11));
        }

        public WebvttCueInfo build() {
            return new WebvttCueInfo(toCueBuilder().build(), this.startTimeUs, this.endTimeUs);
        }

        public Cue.Builder toCueBuilder() {
            float fDerivePosition = this.position;
            if (fDerivePosition == -3.4028235E38f) {
                fDerivePosition = derivePosition(this.textAlignment);
            }
            int iDerivePositionAnchor = this.positionAnchor;
            if (iDerivePositionAnchor == Integer.MIN_VALUE) {
                iDerivePositionAnchor = derivePositionAnchor(this.textAlignment);
            }
            Cue.Builder verticalType = new Cue.Builder().setTextAlignment(convertTextAlignment(this.textAlignment)).setLine(computeLine(this.line, this.lineType), this.lineType).setLineAnchor(this.lineAnchor).setPosition(fDerivePosition).setPositionAnchor(iDerivePositionAnchor).setSize(Math.min(this.size, deriveMaxSize(iDerivePositionAnchor, fDerivePosition))).setVerticalType(this.verticalType);
            CharSequence charSequence = this.text;
            if (charSequence != null) {
                verticalType.setText(charSequence);
            }
            return verticalType;
        }

        private static float computeLine(float f11, int i11) {
            if (f11 != -3.4028235E38f && i11 == 0 && (f11 < 0.0f || f11 > 1.0f)) {
                return 1.0f;
            }
            if (f11 != -3.4028235E38f) {
                return f11;
            }
            if (i11 != 0) {
                return -3.4028235E38f;
            }
            return 1.0f;
        }
    }

    private static void applySpansForTag(@Nullable String str, StartTag startTag, List<Element> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        int i11 = startTag.position;
        int length = spannableStringBuilder.length();
        String str2 = startTag.name;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case "c":
                applyDefaultColors(spannableStringBuilder, startTag.classes, i11, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case "v":
                applyVoiceSpan(spannableStringBuilder, startTag.voice, i11, length);
                break;
            case "ruby":
                applyRubySpans(spannableStringBuilder, str, startTag, list, list2);
                break;
            default:
                return;
        }
        List<StyleMatch> applicableStyles = getApplicableStyles(list2, str, startTag);
        for (int i12 = 0; i12 < applicableStyles.size(); i12++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i12).style, i11, length);
        }
    }

    private static int firstKnownRubyPosition(int i11, int i12, int i13) {
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        if (i13 != -1) {
            return i13;
        }
        throw new IllegalArgumentException();
    }

    private static boolean isSupportedTag(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    @Nullable
    public static WebvttCueInfo parseCue(ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        String line = parsableByteArray.readLine();
        if (line == null) {
            return null;
        }
        Pattern pattern = CUE_HEADER_PATTERN;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return parseCue(null, matcher, parsableByteArray, list);
        }
        String line2 = parsableByteArray.readLine();
        if (line2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return parseCue(line.trim(), matcher2, parsableByteArray, list);
        }
        return null;
    }

    public static Cue.Builder parseCueSettingsList(String str) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        parseCueSettingsList(str, webvttCueInfoBuilder);
        return webvttCueInfoBuilder.toCueBuilder();
    }

    private static int parseLineAnchor(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                Log.m2961w(TAG, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int parsePositionAnchor(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                Log.m2961w(TAG, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int parseTextAlignment(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                Log.m2961w(TAG, "Invalid alignment value: " + str);
                return 2;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_TEXT_COLORS = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        DEFAULT_BACKGROUND_COLORS = Collections.unmodifiableMap(map2);
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle webvttCssStyle, int i11, int i12) {
        if (webvttCssStyle == null) {
            return;
        }
        if (webvttCssStyle.getStyle() != -1) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new StyleSpan(webvttCssStyle.getStyle()), i11, i12, 33);
        }
        if (webvttCssStyle.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i11, i12, 33);
        }
        if (webvttCssStyle.isUnderline()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, 33);
        }
        if (webvttCssStyle.hasFontColor()) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.getFontColor()), i11, i12, 33);
        }
        if (webvttCssStyle.hasBackgroundColor()) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.getBackgroundColor()), i11, i12, 33);
        }
        if (webvttCssStyle.getFontFamily() != null) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.getFontFamily()), i11, i12, 33);
        }
        int fontSizeUnit = webvttCssStyle.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.getFontSize(), true), i11, i12, 33);
        } else if (fontSizeUnit == 2) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.getFontSize()), i11, i12, 33);
        } else if (fontSizeUnit == 3) {
            SpanUtil.addOrReplaceSpan(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.getFontSize() / 100.0f), i11, i12, 33);
        }
        if (webvttCssStyle.getCombineUpright()) {
            spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i11, i12, 33);
        }
    }

    private static void applyVoiceSpan(SpannableStringBuilder spannableStringBuilder, String str, int i11, int i12) {
        spannableStringBuilder.setSpan(new VoiceSpan(str), i11, i12, 33);
    }

    private static int findEndOfTag(String str, int i11) {
        int iIndexOf = str.indexOf(62, i11);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static List<StyleMatch> getApplicableStyles(List<WebvttCssStyle> list, @Nullable String str, StartTag startTag) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            WebvttCssStyle webvttCssStyle = list.get(i11);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, startTag.name, startTag.classes, startTag.voice);
            if (specificityScore > 0) {
                arrayList.add(new StyleMatch(specificityScore, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @VisibleForTesting(otherwise = 3)
    public static Cue newCueForText(CharSequence charSequence) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        webvttCueInfoBuilder.text = charSequence;
        return webvttCueInfoBuilder.toCueBuilder().build();
    }

    public static SpannedString parseCueText(@Nullable String str, String str2, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < str2.length()) {
            char cCharAt = str2.charAt(i11);
            if (cCharAt == '&') {
                i11++;
                int iIndexOf = str2.indexOf(59, i11);
                int iIndexOf2 = str2.indexOf(32, i11);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    applyEntity(str2.substring(i11, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) C33627eb.f69716f);
                    }
                    i11 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i11++;
            } else {
                int iFindEndOfTag = i11 + 1;
                if (iFindEndOfTag < str2.length()) {
                    boolean z11 = str2.charAt(iFindEndOfTag) == '/';
                    iFindEndOfTag = findEndOfTag(str2, iFindEndOfTag);
                    int i12 = iFindEndOfTag - 2;
                    boolean z12 = str2.charAt(i12) == '/';
                    int i13 = i11 + (z11 ? 2 : 1);
                    if (!z12) {
                        i12 = iFindEndOfTag - 1;
                    }
                    String strSubstring = str2.substring(i13, i12);
                    if (!strSubstring.trim().isEmpty()) {
                        String tagName = getTagName(strSubstring);
                        if (isSupportedTag(tagName)) {
                            if (z11) {
                                while (!arrayDeque.isEmpty()) {
                                    StartTag startTag = (StartTag) arrayDeque.pop();
                                    applySpansForTag(str, startTag, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new Element(startTag, spannableStringBuilder.length()));
                                    }
                                    if (startTag.name.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z12) {
                                arrayDeque.push(StartTag.buildStartTag(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i11 = iFindEndOfTag;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, StartTag.buildWholeCueVirtualTag(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void parseLineAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            webvttCueInfoBuilder.lineAnchor = parseLineAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.line = WebvttParserUtil.parsePercentage(str);
            webvttCueInfoBuilder.lineType = 0;
        } else {
            webvttCueInfoBuilder.line = Integer.parseInt(str);
            webvttCueInfoBuilder.lineType = 1;
        }
    }

    private static void parsePositionAttribute(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            webvttCueInfoBuilder.positionAnchor = parsePositionAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        webvttCueInfoBuilder.position = WebvttParserUtil.parsePercentage(str);
    }

    private static void applyDefaultColors(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i11, int i12) {
        for (String str : set) {
            Map<String, Integer> map = DEFAULT_TEXT_COLORS;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i11, i12, 33);
            } else {
                Map<String, Integer> map2 = DEFAULT_BACKGROUND_COLORS;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i11, i12, 33);
                }
            }
        }
    }

    private static void applyEntity(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(CHAR_SPACE);
                break;
            default:
                Log.m2961w(TAG, "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void applyRubySpans(SpannableStringBuilder spannableStringBuilder, @Nullable String str, StartTag startTag, List<Element> list, List<WebvttCssStyle> list2) {
        int rubyPosition = getRubyPosition(list2, str, startTag);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, Element.BY_START_POSITION_ASC);
        int i11 = startTag.position;
        int length = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (TAG_RUBY_TEXT.equals(((Element) arrayList.get(i12)).startTag.name)) {
                Element element = (Element) arrayList.get(i12);
                int iFirstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, element.startTag), rubyPosition, 1);
                int i13 = element.startTag.position - length;
                int i14 = element.endPosition - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new RubySpan(charSequenceSubSequence.toString(), iFirstKnownRubyPosition), i11, i13, 33);
                length += charSequenceSubSequence.length();
                i11 = i13;
            }
        }
    }

    private static int getRubyPosition(List<WebvttCssStyle> list, @Nullable String str, StartTag startTag) {
        List<StyleMatch> applicableStyles = getApplicableStyles(list, str, startTag);
        for (int i11 = 0; i11 < applicableStyles.size(); i11++) {
            WebvttCssStyle webvttCssStyle = applicableStyles.get(i11).style;
            if (webvttCssStyle.getRubyPosition() != -1) {
                return webvttCssStyle.getRubyPosition();
            }
        }
        return -1;
    }

    private static String getTagName(String str) {
        String strTrim = str.trim();
        Assertions.checkArgument(!strTrim.isEmpty());
        return Util.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static int parseVerticalAttribute(String str) {
        str.getClass();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                Log.m2961w(TAG, "Invalid 'vertical' value: " + str);
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }

    private static void parseCueSettingsList(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(1));
            String str3 = (String) Assertions.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    parseLineAttribute(str3, webvttCueInfoBuilder);
                } else if ("align".equals(str2)) {
                    webvttCueInfoBuilder.textAlignment = parseTextAlignment(str3);
                } else if (ViewProps.POSITION.equals(str2)) {
                    parsePositionAttribute(str3, webvttCueInfoBuilder);
                } else if ("size".equals(str2)) {
                    webvttCueInfoBuilder.size = WebvttParserUtil.parsePercentage(str3);
                } else if ("vertical".equals(str2)) {
                    webvttCueInfoBuilder.verticalType = parseVerticalAttribute(str3);
                } else {
                    Log.m2961w(TAG, "Unknown cue setting " + str2 + C33844oi.f71346o + str3);
                }
            } catch (NumberFormatException unused) {
                Log.m2961w(TAG, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    @Nullable
    private static WebvttCueInfo parseCue(@Nullable String str, Matcher matcher, ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        try {
            webvttCueInfoBuilder.startTimeUs = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(1)));
            webvttCueInfoBuilder.endTimeUs = WebvttParserUtil.parseTimestampUs((String) Assertions.checkNotNull(matcher.group(2)));
            parseCueSettingsList((String) Assertions.checkNotNull(matcher.group(3)), webvttCueInfoBuilder);
            StringBuilder sb2 = new StringBuilder();
            String line = parsableByteArray.readLine();
            while (!TextUtils.isEmpty(line)) {
                if (sb2.length() > 0) {
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                sb2.append(line.trim());
                line = parsableByteArray.readLine();
            }
            webvttCueInfoBuilder.text = parseCueText(str, sb2.toString(), list);
            return webvttCueInfoBuilder.build();
        } catch (NumberFormatException unused) {
            Log.m2961w(TAG, "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }
}
