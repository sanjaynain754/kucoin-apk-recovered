package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.base.Ascii;
import com.tencent.bugly.proguard.C33844oi;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
final class WebvttCssParser {
    private static final String PROPERTY_BGCOLOR = "background-color";
    private static final String PROPERTY_COLOR = "color";
    private static final String PROPERTY_FONT_FAMILY = "font-family";
    private static final String PROPERTY_FONT_SIZE = "font-size";
    private static final String PROPERTY_FONT_STYLE = "font-style";
    private static final String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final String PROPERTY_RUBY_POSITION = "ruby-position";
    private static final String PROPERTY_TEXT_COMBINE_UPRIGHT = "text-combine-upright";
    private static final String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final String RULE_END = "}";
    private static final String RULE_START = "{";
    private static final String TAG = "WebvttCssParser";
    private static final String VALUE_ALL = "all";
    private static final String VALUE_BOLD = "bold";
    private static final String VALUE_DIGITS = "digits";
    private static final String VALUE_ITALIC = "italic";
    private static final String VALUE_OVER = "over";
    private static final String VALUE_UNDER = "under";
    private static final String VALUE_UNDERLINE = "underline";
    private static final Pattern VOICE_NAME_PATTERN = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern FONT_SIZE_PATTERN = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final ParsableByteArray styleInput = new ParsableByteArray();
    private final StringBuilder stringBuilder = new StringBuilder();

    private static void parseFontSize(String str, WebvttCssStyle webvttCssStyle) {
        Matcher matcher = FONT_SIZE_PATTERN.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            Log.m2961w(TAG, "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                webvttCssStyle.setFontSizeUnit(3);
                break;
            case "em":
                webvttCssStyle.setFontSizeUnit(2);
                break;
            case "px":
                webvttCssStyle.setFontSizeUnit(1);
                break;
            default:
                throw new IllegalStateException();
        }
        webvttCssStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static String parseIdentifier(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        boolean z11 = false;
        sb2.setLength(0);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && !z11) {
            char c11 = (char) parsableByteArray.getData()[position];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z11 = true;
            } else {
                position++;
                sb2.append(c11);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb2.toString();
    }

    public static void skipWhitespaceAndComments(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z11 = true; parsableByteArray.bytesLeft() > 0 && z11; z11 = false) {
                if (!maybeSkipWhitespace(parsableByteArray) && !maybeSkipComment(parsableByteArray)) {
                }
            }
            return;
        }
    }

    private void applySelectorToStyle(WebvttCssStyle webvttCssStyle, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = VOICE_NAME_PATTERN.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice((String) Assertions.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = Util.split(str, "\\.");
        String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, iIndexOf2));
            webvttCssStyle.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            webvttCssStyle.setTargetClasses((String[]) Util.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }

    @Nullable
    private static String parsePropertyValue(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z11 = false;
        while (!z11) {
            int position = parsableByteArray.getPosition();
            String nextToken = parseNextToken(parsableByteArray, sb2);
            if (nextToken == null) {
                return null;
            }
            if (RULE_END.equals(nextToken) || ";".equals(nextToken)) {
                parsableByteArray.setPosition(position);
                z11 = true;
            } else {
                sb3.append(nextToken);
            }
        }
        return sb3.toString();
    }

    public List<WebvttCssStyle> parseBlock(ParsableByteArray parsableByteArray) {
        this.stringBuilder.setLength(0);
        int position = parsableByteArray.getPosition();
        skipStyleBlock(parsableByteArray);
        this.styleInput.reset(parsableByteArray.getData(), parsableByteArray.getPosition());
        this.styleInput.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String selector = parseSelector(this.styleInput, this.stringBuilder);
            if (selector == null || !RULE_START.equals(parseNextToken(this.styleInput, this.stringBuilder))) {
                break;
            }
            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
            applySelectorToStyle(webvttCssStyle, selector);
            String str = null;
            boolean z11 = false;
            while (!z11) {
                int position2 = this.styleInput.getPosition();
                String nextToken = parseNextToken(this.styleInput, this.stringBuilder);
                boolean z12 = nextToken == null || RULE_END.equals(nextToken);
                if (!z12) {
                    this.styleInput.setPosition(position2);
                    parseStyleDeclaration(this.styleInput, webvttCssStyle, this.stringBuilder);
                }
                str = nextToken;
                z11 = z12;
            }
            if (RULE_END.equals(str)) {
                arrayList.add(webvttCssStyle);
            }
        }
        return arrayList;
    }

    private static boolean maybeSkipComment(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        if (position + 2 <= iLimit) {
            int i11 = position + 1;
            if (data[position] == 47) {
                int i12 = position + 2;
                if (data[i11] != 42) {
                    return false;
                }
                while (true) {
                    int i13 = i12 + 1;
                    if (i13 < iLimit) {
                        if (((char) data[i12]) == '*' && ((char) data[i13]) == '/') {
                            i12 += 2;
                            iLimit = i12;
                        } else {
                            i12 = i13;
                        }
                    } else {
                        parsableByteArray.skipBytes(iLimit - parsableByteArray.getPosition());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean maybeSkipWhitespace(ParsableByteArray parsableByteArray) {
        char cPeekCharAtPosition = peekCharAtPosition(parsableByteArray, parsableByteArray.getPosition());
        if (cPeekCharAtPosition != '\t' && cPeekCharAtPosition != '\n' && cPeekCharAtPosition != '\f' && cPeekCharAtPosition != '\r' && cPeekCharAtPosition != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    @Nullable
    public static String parseNextToken(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String identifier = parseIdentifier(parsableByteArray, sb2);
        if (!"".equals(identifier)) {
            return identifier;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }

    @Nullable
    private static String parseSelector(ParsableByteArray parsableByteArray, StringBuilder sb2) {
        String cueTarget;
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        String nextToken = parseNextToken(parsableByteArray, sb2);
        if (nextToken == null) {
            return null;
        }
        if (RULE_START.equals(nextToken)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        if ("(".equals(nextToken)) {
            cueTarget = readCueTarget(parsableByteArray);
        } else {
            cueTarget = null;
        }
        if (!")".equals(parseNextToken(parsableByteArray, sb2))) {
            return null;
        }
        return cueTarget;
    }

    private static void parseStyleDeclaration(ParsableByteArray parsableByteArray, WebvttCssStyle webvttCssStyle, StringBuilder sb2) {
        skipWhitespaceAndComments(parsableByteArray);
        String identifier = parseIdentifier(parsableByteArray, sb2);
        if (!"".equals(identifier) && C33844oi.f71346o.equals(parseNextToken(parsableByteArray, sb2))) {
            skipWhitespaceAndComments(parsableByteArray);
            String propertyValue = parsePropertyValue(parsableByteArray, sb2);
            if (propertyValue != null && !"".equals(propertyValue)) {
                int position = parsableByteArray.getPosition();
                String nextToken = parseNextToken(parsableByteArray, sb2);
                if (!";".equals(nextToken)) {
                    if (RULE_END.equals(nextToken)) {
                        parsableByteArray.setPosition(position);
                    } else {
                        return;
                    }
                }
                if ("color".equals(identifier)) {
                    webvttCssStyle.setFontColor(ColorParser.parseCssColor(propertyValue));
                    return;
                }
                if (PROPERTY_BGCOLOR.equals(identifier)) {
                    webvttCssStyle.setBackgroundColor(ColorParser.parseCssColor(propertyValue));
                    return;
                }
                boolean z11 = true;
                if (PROPERTY_RUBY_POSITION.equals(identifier)) {
                    if (VALUE_OVER.equals(propertyValue)) {
                        webvttCssStyle.setRubyPosition(1);
                        return;
                    } else {
                        if (VALUE_UNDER.equals(propertyValue)) {
                            webvttCssStyle.setRubyPosition(2);
                            return;
                        }
                        return;
                    }
                }
                if (PROPERTY_TEXT_COMBINE_UPRIGHT.equals(identifier)) {
                    if (!"all".equals(propertyValue) && !propertyValue.startsWith(VALUE_DIGITS)) {
                        z11 = false;
                    }
                    webvttCssStyle.setCombineUpright(z11);
                    return;
                }
                if (PROPERTY_TEXT_DECORATION.equals(identifier)) {
                    if ("underline".equals(propertyValue)) {
                        webvttCssStyle.setUnderline(true);
                        return;
                    }
                    return;
                }
                if (PROPERTY_FONT_FAMILY.equals(identifier)) {
                    webvttCssStyle.setFontFamily(propertyValue);
                    return;
                }
                if (PROPERTY_FONT_WEIGHT.equals(identifier)) {
                    if ("bold".equals(propertyValue)) {
                        webvttCssStyle.setBold(true);
                    }
                } else if (PROPERTY_FONT_STYLE.equals(identifier)) {
                    if ("italic".equals(propertyValue)) {
                        webvttCssStyle.setItalic(true);
                    }
                } else if (PROPERTY_FONT_SIZE.equals(identifier)) {
                    parseFontSize(propertyValue, webvttCssStyle);
                }
            }
        }
    }

    private static char peekCharAtPosition(ParsableByteArray parsableByteArray, int i11) {
        return (char) parsableByteArray.getData()[i11];
    }

    private static String readCueTarget(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        boolean z11 = false;
        while (position < iLimit && !z11) {
            int i11 = position + 1;
            if (((char) parsableByteArray.getData()[position]) == ')') {
                z11 = true;
            } else {
                z11 = false;
            }
            position = i11;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    public static void skipStyleBlock(ParsableByteArray parsableByteArray) {
        while (!TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }
}
