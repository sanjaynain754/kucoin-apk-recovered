package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.m13489of("auto", "none");
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.m13490of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.m13489of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.m13490of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:73:0x010c  */
    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
        byte b11;
        int i11;
        int i12;
        String str;
        int iHashCode;
        String str2 = (String) Iterables.getFirst(Sets.intersection(POSITION_VALUES, immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode2 = str2.hashCode();
        int i13 = 2;
        byte b12 = 0;
        int i14 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    b11 = 0;
                } else {
                    b11 = -1;
                }
            } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                b11 = 1;
            } else {
                b11 = -1;
            }
        } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            b11 = 2;
        } else {
            b11 = -1;
        }
        if (b11 != 0) {
            i11 = b11 != 1 ? 1 : -2;
        } else {
            i11 = 2;
        }
        Sets.SetView setViewIntersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        if (!setViewIntersection.isEmpty()) {
            String str3 = (String) setViewIntersection.iterator().next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i14 = 0;
            }
            return new TextEmphasis(i14, 0, i11);
        }
        Sets.SetView setViewIntersection2 = Sets.intersection(MARK_FILL_VALUES, immutableSet);
        Sets.SetView setViewIntersection3 = Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
        if (setViewIntersection2.isEmpty() && setViewIntersection3.isEmpty()) {
            return new TextEmphasis(-1, 0, i11);
        }
        String str4 = (String) Iterables.getFirst(setViewIntersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                i12 = 2;
            }
            str = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        b12 = -1;
                    }
                } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    b12 = 1;
                } else {
                    b12 = -1;
                }
            } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                b12 = 2;
            } else {
                b12 = -1;
            }
            if (b12 != 0) {
                if (b12 != 1) {
                    i13 = 1;
                } else {
                    i13 = 3;
                }
            }
            return new TextEmphasis(i13, i12, i11);
        }
        str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        i12 = 1;
        str = (String) Iterables.getFirst(setViewIntersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b12 = -1;
                } else {
                    b12 = -1;
                }
            } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                b12 = 1;
            } else {
                b12 = -1;
            }
        } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
            b12 = 2;
        } else {
            b12 = -1;
        }
        if (b12 != 0) {
            if (b12 != 1) {
                i13 = 1;
            } else {
                i13 = 3;
            }
        }
        return new TextEmphasis(i13, i12, i11);
    }

    private TextEmphasis(int i11, int i12, int i13) {
        this.markShape = i11;
        this.markFill = i12;
        this.position = i13;
    }
}
