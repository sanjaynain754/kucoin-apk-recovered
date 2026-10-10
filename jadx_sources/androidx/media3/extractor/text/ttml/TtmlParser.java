package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Ascii;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TtmlParser implements SubtitleParser {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int DEFAULT_CELL_ROWS = 15;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlParser";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);

    private static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            String attributeName = xmlPullParser.getAttributeName(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case "textAlign":
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case "textDecoration":
                    String lowerCase = Ascii.toLowerCase(attributeValue);
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = createIfNull(ttmlStyle).setBold(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String lowerCase2 = Ascii.toLowerCase(attributeValue);
                    lowerCase2.getClass();
                    switch (lowerCase2) {
                        case "baseContainer":
                        case "base":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                            break;
                        case "container":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                            break;
                        case "delimiter":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                            break;
                        case "textContainer":
                        case "text":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                            break;
                    }
                    break;
                case "color":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        Log.m2961w(TAG, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case "textCombine":
                    String lowerCase3 = Ascii.toLowerCase(attributeValue);
                    lowerCase3.getClass();
                    if (!lowerCase3.equals(TtmlNode.COMBINE_ALL)) {
                        if (lowerCase3.equals("none")) {
                            ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        Log.m2961w(TAG, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(TextEmphasis.parse(attributeValue));
                    break;
                case "rubyPosition":
                    String lowerCase4 = Ascii.toLowerCase(attributeValue);
                    lowerCase4.getClass();
                    if (!lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        if (lowerCase4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        Log.m2961w(TAG, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        double d11;
        double d12;
        byte b11 = 4;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double d13 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * C33978va.f72340i) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d14 = d13 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d15 = d14 + (strGroup2 != null ? Long.parseLong(strGroup2) / frameAndTickRate.effectiveFrameRate : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d15 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) frameAndTickRate.subFrameRate)) / ((double) frameAndTickRate.effectiveFrameRate) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d16 = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
        String str2 = (String) Assertions.checkNotNull(matcher2.group(2));
        str2.getClass();
        switch (str2.hashCode()) {
            case 102:
                b11 = !str2.equals("f") ? (byte) -1 : (byte) 0;
                break;
            case 104:
                b11 = !str2.equals(CmcdData.Factory.STREAMING_FORMAT_HLS) ? (byte) -1 : (byte) 1;
                break;
            case 109:
                b11 = !str2.equals("m") ? (byte) -1 : (byte) 2;
                break;
            case 116:
                b11 = !str2.equals("t") ? (byte) -1 : (byte) 3;
                break;
            case 3494:
                if (!str2.equals("ms")) {
                    b11 = -1;
                }
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                d11 = frameAndTickRate.effectiveFrameRate;
                d16 /= d11;
                return (long) (d16 * 1000000.0d);
            case 1:
                d12 = 3600.0d;
                break;
            case 2:
                d12 = 60.0d;
                break;
            case 3:
                d11 = frameAndTickRate.tickRate;
                d16 /= d11;
                return (long) (d16 * 1000000.0d);
            case 4:
                d11 = 1000.0d;
                d16 /= d11;
                return (long) (d16 * 1000000.0d);
            default:
                return (long) (d16 * 1000000.0d);
        }
        d16 *= d12;
        return (long) (d16 * 1000000.0d);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        public FrameAndTickRate(float f11, int i11, int i12) {
            this.effectiveFrameRate = f11;
            this.subFrameRate = i11;
            this.tickRate = i12;
        }
    }

    public static final class TtsExtent {
        final int height;
        final int width;

        public TtsExtent(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }
    }

    private static TtmlStyle createIfNull(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static int parseCellRows(XmlPullParser xmlPullParser, int i11) {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return i11;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.m2961w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return i11;
        }
        boolean z11 = true;
        try {
            int i12 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int i13 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (i12 == 0 || i13 == 0) {
                z11 = false;
            }
            Assertions.checkArgument(z11, "Invalid cell resolution " + i12 + C33627eb.f69716f + i13);
            return i13;
        } catch (NumberFormatException unused) {
            Log.m2961w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return i11;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrSplit = Util.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrSplit.length + C33978va.f72339h);
            }
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
            Log.m2961w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                ttmlStyle.setFontSizeUnit(3);
                break;
            case "em":
                ttmlStyle.setFontSizeUnit(2);
                break;
            case "px":
                ttmlStyle.setFontSizeUnit(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        float f11;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i11 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrSplit = Util.split(attributeValue2, C33627eb.f69716f);
            Assertions.checkArgument(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f11 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f11 = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i12 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i11 * f11, i12, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x0035  */
    private static TtmlNode parseNode(XmlPullParser xmlPullParser, @Nullable TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, null);
        long j11 = -9223372036854775807L;
        long timeExpression = -9223372036854775807L;
        long timeExpression2 = -9223372036854775807L;
        long timeExpression3 = -9223372036854775807L;
        String str = "";
        int i11 = 0;
        String strSubstring = null;
        while (i11 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i11);
            long j12 = j11;
            String attributeValue = xmlPullParser.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i11++;
                    j11 = j12;
                    break;
                case "dur":
                    timeExpression3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    timeExpression2 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    timeExpression = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    String[] styleIds = parseStyleIds(attributeValue);
                    if (styleIds.length > 0) {
                        strArr = styleIds;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith(RunnableC33958ua.f72251f)) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i11++;
            j11 = j12;
        }
        long j13 = j11;
        if (ttmlNode != null) {
            long j14 = ttmlNode.startTimeUs;
            if (j14 != j13) {
                if (timeExpression != j13) {
                    timeExpression += j14;
                }
                if (timeExpression2 != j13) {
                    timeExpression2 += j14;
                }
            }
        }
        long j15 = timeExpression;
        if (timeExpression2 == j13) {
            if (timeExpression3 != j13) {
                timeExpression2 = j15 + timeExpression3;
            } else if (ttmlNode != null) {
                long j16 = ttmlNode.endTimeUs;
                if (j16 != j13) {
                    timeExpression2 = j16;
                }
            }
        }
        return TtmlNode.buildNode(xmlPullParser.getName(), j15, timeExpression2, styleAttributes, strArr, str, strSubstring, ttmlNode);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b9  */
    @Nullable
    private static TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, int i11, @Nullable TtsExtent ttsExtent) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        int i13;
        byte b11 = 0;
        int i14 = 1;
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue == null) {
            return null;
        }
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue2 == null) {
            Log.m2961w(TAG, "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = PERCENTAGE_COORDINATES;
        Matcher matcher = pattern.matcher(attributeValue2);
        Pattern pattern2 = PIXEL_COORDINATES;
        Matcher matcher2 = pattern2.matcher(attributeValue2);
        if (matcher.matches()) {
            try {
                f11 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                f12 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                Log.m2961w(TAG, "Ignoring region with malformed origin: " + attributeValue2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                Log.m2961w(TAG, "Ignoring region with unsupported origin: " + attributeValue2);
                return null;
            }
            if (ttsExtent == null) {
                Log.m2961w(TAG, "Ignoring region with missing tts:extent: " + attributeValue2);
                return null;
            }
            try {
                int i15 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)));
                int i16 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)));
                float f15 = i15 / ttsExtent.width;
                float f16 = i16 / ttsExtent.height;
                f11 = f15;
                f12 = f16;
            } catch (NumberFormatException unused2) {
                Log.m2961w(TAG, "Ignoring region with malformed origin: " + attributeValue2);
                return null;
            }
        }
        String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue3 == null) {
            Log.m2961w(TAG, "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(attributeValue3);
        Matcher matcher4 = pattern2.matcher(attributeValue3);
        if (matcher3.matches()) {
            try {
                f13 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                f14 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                Log.m2961w(TAG, "Ignoring region with malformed extent: " + attributeValue2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                Log.m2961w(TAG, "Ignoring region with unsupported extent: " + attributeValue2);
                return null;
            }
            if (ttsExtent == null) {
                Log.m2961w(TAG, "Ignoring region with missing tts:extent: " + attributeValue2);
                return null;
            }
            try {
                int i17 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(1)));
                int i18 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(2)));
                float f17 = i17 / ttsExtent.width;
                f14 = i18 / ttsExtent.height;
                f13 = f17;
            } catch (NumberFormatException unused4) {
                Log.m2961w(TAG, "Ignoring region with malformed extent: " + attributeValue2);
                return null;
            }
        }
        float f18 = f14;
        String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        if (attributeValue4 != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue4);
            lowerCase.getClass();
            if (lowerCase.equals(TtmlNode.CENTER)) {
                f12 += f18 / 2.0f;
                i12 = 1;
            } else if (lowerCase.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                f12 += f18;
                i12 = 2;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        float f19 = f12;
        float f21 = 1.0f / i11;
        String attributeValue5 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
        if (attributeValue5 != null) {
            String lowerCase2 = Ascii.toLowerCase(attributeValue5);
            lowerCase2.getClass();
            switch (lowerCase2.hashCode()) {
                case 3694:
                    if (!lowerCase2.equals("tb")) {
                        b11 = -1;
                    }
                    break;
                case 3553396:
                    b11 = !lowerCase2.equals(TtmlNode.VERTICAL_LR) ? (byte) -1 : (byte) 1;
                    break;
                case 3553576:
                    b11 = !lowerCase2.equals(TtmlNode.VERTICAL_RL) ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b11 = -1;
                    break;
            }
            switch (b11) {
                case 0:
                case 1:
                    i13 = 2;
                    break;
                default:
                    i14 = Integer.MIN_VALUE;
                case 2:
                    i13 = i14;
                    break;
            }
        } else {
            i14 = Integer.MIN_VALUE;
            i13 = i14;
        }
        return new TtmlRegion(attributeValue, f11, f19, 0, i12, f13, f18, 1, f21, i13);
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.m2961w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e11) {
            Log.m2962w(TAG, "Failed to parse shear: " + str, e11);
            return Float.MAX_VALUE;
        }
    }

    @Nullable
    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.m2961w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.m2961w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public Subtitle parseToLegacySubtitle(byte[] bArr, int i11, int i12) {
        char c11;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new TtmlRegion(""));
            TtmlSubtitle ttmlSubtitle = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i11, i12), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = 0;
            int cellRows = 15;
            FrameAndTickRate frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            TtsExtent ttsExtent = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i13 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            c11 = 15;
                            cellRows = parseCellRows(xmlPullParserNewPullParser, 15);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        } else {
                            c11 = 15;
                        }
                        FrameAndTickRate frameAndTickRate = frameAndTickRates;
                        TtsExtent ttsExtent2 = ttsExtent;
                        int i14 = cellRows;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                parseHeader(xmlPullParserNewPullParser, map, i14, ttsExtent2, map2, map3);
                            } else {
                                try {
                                    TtmlNode node = parseNode(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                    arrayDeque.push(node);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(node);
                                    }
                                } catch (SubtitleDecoderException e11) {
                                    Log.m2962w(TAG, "Suppressing parser error", e11);
                                    i13++;
                                }
                            }
                            cellRows = i14;
                            ttsExtent = ttsExtent2;
                            frameAndTickRates = frameAndTickRate;
                        } else {
                            Log.m2959i(TAG, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i13++;
                        cellRows = i14;
                        ttsExtent = ttsExtent2;
                        frameAndTickRates = frameAndTickRate;
                    } else {
                        c11 = 15;
                        if (eventType == 4) {
                            ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (Subtitle) Assertions.checkNotNull(ttmlSubtitle);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new IllegalStateException("Unable to decode source", e13);
        }
    }

    public TtmlParser() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    private static boolean isSupportedTag(String str) {
        if (!str.equals(TtmlNode.TAG_TT) && !str.equals(TtmlNode.TAG_HEAD) && !str.equals(TtmlNode.TAG_BODY) && !str.equals(TtmlNode.TAG_DIV) && !str.equals("p") && !str.equals(TtmlNode.TAG_SPAN) && !str.equals("br") && !str.equals("style") && !str.equals(TtmlNode.TAG_STYLING) && !str.equals(TtmlNode.TAG_LAYOUT) && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals(TtmlNode.TAG_INFORMATION)) {
            return false;
        }
        return true;
    }

    @Nullable
    private static Layout.Alignment parseAlignment(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, int i11, @Nullable TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                String id2 = styleAttributes.getId();
                if (id2 != null) {
                    map.put(id2, styleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion regionAttributes = parseRegionAttributes(xmlPullParser, i11, ttsExtent);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.f3539id, regionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "metadata")) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "metadata"));
    }

    private static String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        return Util.split(strTrim, "\\s+");
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        LegacySubtitleUtil.toCuesWithTiming(parseToLegacySubtitle(bArr, i11, i12), outputOptions, consumer);
    }
}
