package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements Predicate<Character> {
    private static final int DISTINCT_CHARS = 65536;

    public static final class And extends CharMatcher {
        final CharMatcher first;
        final CharMatcher second;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return this.first.matches(c11) && this.second.matches(c11);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.first.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.second.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.first + ", " + this.second + ")";
        }

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.first = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.second = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }
    }

    public static final class Any extends NamedFastMatcher {
        static final CharMatcher INSTANCE = new Any();

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c11) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c11);
            return new String(cArr);
        }

        private Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i11) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i11, length);
            if (i11 == length) {
                return -1;
            }
            return i11;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c11) {
            if (charSequence.length() == 0) {
                return "";
            }
            return String.valueOf(c11);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        /* JADX INFO: renamed from: or */
        public CharMatcher mo13371or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i11 = 0; i11 < charSequence.length(); i11++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    public static final class AnyOf extends CharMatcher {
        private final char[] chars;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return Arrays.binarySearch(this.chars, c11) >= 0;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            for (char c11 : this.chars) {
                bitSet.set(c11);
            }
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c11 : this.chars) {
                sb2.append(CharMatcher.showCharacter(c11));
            }
            sb2.append("\")");
            return sb2.toString();
        }

        public AnyOf(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.chars = charArray;
            Arrays.sort(charArray);
        }
    }

    public static final class Ascii extends NamedFastMatcher {
        static final CharMatcher INSTANCE = new Ascii();

        public Ascii() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return c11 <= 127;
        }
    }

    @GwtIncompatible
    public static final class BitSetMatcher extends NamedFastMatcher {
        private final BitSet table;

        private BitSetMatcher(BitSet bitSet, String str) {
            super(str);
            this.table = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return this.table.get(c11);
        }

        @Override // com.google.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.or(this.table);
        }
    }

    public static final class BreakingWhitespace extends CharMatcher {
        static final CharMatcher INSTANCE = new BreakingWhitespace();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            if (c11 != ' ' && c11 != 133 && c11 != 5760) {
                if (c11 != 8199) {
                    if (c11 != 8287 && c11 != 12288 && c11 != 8232 && c11 != 8233) {
                        switch (c11) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c11 >= 8192 && c11 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }

        private BreakingWhitespace() {
        }
    }

    public static final class Digit extends RangesMatcher {
        static final CharMatcher INSTANCE = new Digit();
        private static final String ZEROES = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        private static char[] nines() {
            char[] cArr = new char[37];
            for (int i11 = 0; i11 < 37; i11++) {
                cArr[i11] = (char) (ZEROES.charAt(i11) + '\t');
            }
            return cArr;
        }

        private static char[] zeroes() {
            return ZEROES.toCharArray();
        }

        private Digit() {
            super("CharMatcher.digit()", zeroes(), nines());
        }
    }

    public static abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new NegatedFastMatcher(this);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    public static final class ForPredicate extends CharMatcher {
        private final Predicate<? super Character> predicate;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public boolean apply(Character ch2) {
            return this.predicate.apply(Preconditions.checkNotNull(ch2));
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return this.predicate.apply(Character.valueOf(c11));
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.predicate + ")";
        }

        public ForPredicate(Predicate<? super Character> predicate) {
            this.predicate = (Predicate) Preconditions.checkNotNull(predicate);
        }
    }

    public static final class InRange extends FastMatcher {
        private final char endInclusive;
        private final char startInclusive;

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return this.startInclusive <= c11 && c11 <= this.endInclusive;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            bitSet.set(this.startInclusive, this.endInclusive + 1);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.startInclusive) + "', '" + CharMatcher.showCharacter(this.endInclusive) + "')";
        }

        public InRange(char c11, char c12) {
            boolean z11;
            if (c12 >= c11) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11);
            this.startInclusive = c11;
            this.endInclusive = c12;
        }
    }

    public static final class Invisible extends RangesMatcher {
        static final CharMatcher INSTANCE = new Invisible();
        private static final String RANGE_ENDS = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";
        private static final String RANGE_STARTS = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        private Invisible() {
            super("CharMatcher.invisible()", RANGE_STARTS.toCharArray(), RANGE_ENDS.toCharArray());
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.CharMatcher$Is */
    public static final class C7972Is extends FastMatcher {
        private final char match;

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? this : CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return c11 == this.match;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        /* JADX INFO: renamed from: or */
        public CharMatcher mo13371or(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? charMatcher : super.mo13371or(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            bitSet.set(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.match) + "')";
        }

        public C7972Is(char c11) {
            this.match = c11;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c11) {
            return charSequence.toString().replace(this.match, c11);
        }
    }

    public static final class IsEither extends FastMatcher {
        private final char match1;
        private final char match2;

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return c11 == this.match1 || c11 == this.match2;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            bitSet.set(this.match1);
            bitSet.set(this.match2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.match1) + CharMatcher.showCharacter(this.match2) + "\")";
        }

        public IsEither(char c11, char c12) {
            this.match1 = c11;
            this.match2 = c12;
        }
    }

    public static final class IsNot extends FastMatcher {
        private final char match;

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.match);
            bitSet.set(this.match + 1, 65536);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return c11 != this.match;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.m13370is(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        /* JADX INFO: renamed from: or */
        public CharMatcher mo13371or(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? CharMatcher.any() : this;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.match) + "')";
        }

        public IsNot(char c11) {
            this.match = c11;
        }
    }

    public static final class JavaDigit extends CharMatcher {
        static final CharMatcher INSTANCE = new JavaDigit();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }

        private JavaDigit() {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return Character.isDigit(c11);
        }
    }

    public static final class JavaIsoControl extends NamedFastMatcher {
        static final CharMatcher INSTANCE = new JavaIsoControl();

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            if (c11 > 31) {
                return c11 >= 127 && c11 <= 159;
            }
            return true;
        }
    }

    public static final class JavaLetter extends CharMatcher {
        static final CharMatcher INSTANCE = new JavaLetter();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }

        private JavaLetter() {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return Character.isLetter(c11);
        }
    }

    public static final class JavaLetterOrDigit extends CharMatcher {
        static final CharMatcher INSTANCE = new JavaLetterOrDigit();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }

        private JavaLetterOrDigit() {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return Character.isLetterOrDigit(c11);
        }
    }

    public static final class JavaLowerCase extends CharMatcher {
        static final CharMatcher INSTANCE = new JavaLowerCase();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }

        private JavaLowerCase() {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return Character.isLowerCase(c11);
        }
    }

    public static final class JavaUpperCase extends CharMatcher {
        static final CharMatcher INSTANCE = new JavaUpperCase();

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }

        private JavaUpperCase() {
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return Character.isUpperCase(c11);
        }
    }

    public static abstract class NamedFastMatcher extends FastMatcher {
        private final String description;

        @Override // com.google.common.base.CharMatcher
        public final String toString() {
            return this.description;
        }

        public NamedFastMatcher(String str) {
            this.description = (String) Preconditions.checkNotNull(str);
        }
    }

    public static class Negated extends CharMatcher {
        final CharMatcher original;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return !this.original.matches(c11);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.original.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.original.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return this.original;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.original.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.original + ".negate()";
        }

        public Negated(CharMatcher charMatcher) {
            this.original = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.original.countIn(charSequence);
        }
    }

    public static final class None extends NamedFastMatcher {
        static final CharMatcher INSTANCE = new None();

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c11) {
            return charSequence.toString();
        }

        private None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i11) {
            Preconditions.checkPositionIndex(i11, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c11) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.google.common.base.CharMatcher
        /* JADX INFO: renamed from: or */
        public CharMatcher mo13371or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.CharMatcher$Or */
    public static final class C7973Or extends CharMatcher {
        final CharMatcher first;
        final CharMatcher second;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            return this.first.matches(c11) || this.second.matches(c11);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            this.first.setBits(bitSet);
            this.second.setBits(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.first + ", " + this.second + ")";
        }

        public C7973Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.first = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.second = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }
    }

    public static class RangesMatcher extends CharMatcher {
        private final String description;
        private final char[] rangeEnds;
        private final char[] rangeStarts;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            int iBinarySearch = Arrays.binarySearch(this.rangeStarts, c11);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i11 = (~iBinarySearch) - 1;
            return i11 >= 0 && c11 <= this.rangeEnds[i11];
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.description;
        }

        public RangesMatcher(String str, char[] cArr, char[] cArr2) {
            boolean z11;
            boolean z12;
            boolean z13;
            this.description = str;
            this.rangeStarts = cArr;
            this.rangeEnds = cArr2;
            if (cArr.length == cArr2.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11);
            int i11 = 0;
            while (i11 < cArr.length) {
                if (cArr[i11] <= cArr2[i11]) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Preconditions.checkArgument(z12);
                int i12 = i11 + 1;
                if (i12 < cArr.length) {
                    if (cArr2[i11] < cArr[i12]) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Preconditions.checkArgument(z13);
                }
                i11 = i12;
            }
        }
    }

    public static final class SingleWidth extends RangesMatcher {
        static final CharMatcher INSTANCE = new SingleWidth();

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    @VisibleForTesting
    public static final class Whitespace extends NamedFastMatcher {
        static final int MULTIPLIER = 1682554634;
        static final String TABLE = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";
        static final int SHIFT = Integer.numberOfLeadingZeros(31);
        static final CharMatcher INSTANCE = new Whitespace();

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        public void setBits(BitSet bitSet) {
            for (int i11 = 0; i11 < 32; i11++) {
                bitSet.set(TABLE.charAt(i11));
            }
        }

        public Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c11) {
            if (TABLE.charAt((MULTIPLIER * c11) >>> SHIFT) == c11) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c11) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(c11 & 15);
            c11 = (char) (c11 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int countIn(CharSequence charSequence) {
        int i11 = 0;
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            if (matches(charSequence.charAt(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public abstract boolean matches(char c11);

    public String replaceFrom(CharSequence charSequence, char c11) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c11;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c11;
            }
        }
    }

    public static class NegatedFastMatcher extends Negated {
        public NegatedFastMatcher(CharMatcher charMatcher) {
            super(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    public static CharMatcher any() {
        return Any.INSTANCE;
    }

    public static CharMatcher ascii() {
        return Ascii.INSTANCE;
    }

    public static CharMatcher breakingWhitespace() {
        return BreakingWhitespace.INSTANCE;
    }

    @Deprecated
    public static CharMatcher digit() {
        return Digit.INSTANCE;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i11, int i12, char c11, StringBuilder sb2, boolean z11) {
        while (i11 < i12) {
            char cCharAt = charSequence.charAt(i11);
            if (!matches(cCharAt)) {
                sb2.append(cCharAt);
                z11 = false;
            } else if (!z11) {
                sb2.append(c11);
                z11 = true;
            }
            i11++;
        }
        return sb2.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new ForPredicate(predicate);
    }

    public static CharMatcher inRange(char c11, char c12) {
        return new InRange(c11, c12);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return Invisible.INSTANCE;
    }

    /* JADX INFO: renamed from: is */
    public static CharMatcher m13370is(char c11) {
        return new C7972Is(c11);
    }

    private static IsEither isEither(char c11, char c12) {
        return new IsEither(c11, c12);
    }

    public static CharMatcher isNot(char c11) {
        return new IsNot(c11);
    }

    @GwtIncompatible
    private static boolean isSmall(int i11, int i12) {
        return i11 <= 1023 && i12 > i11 * 64;
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return JavaDigit.INSTANCE;
    }

    public static CharMatcher javaIsoControl() {
        return JavaIsoControl.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return JavaLetter.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return JavaLetterOrDigit.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return JavaLowerCase.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return JavaUpperCase.INSTANCE;
    }

    public static CharMatcher none() {
        return None.INSTANCE;
    }

    @GwtIncompatible
    private static CharMatcher precomputedPositive(int i11, BitSet bitSet, String str) {
        if (i11 == 0) {
            return none();
        }
        if (i11 == 1) {
            return m13370is((char) bitSet.nextSetBit(0));
        }
        if (i11 != 2) {
            return isSmall(i11, bitSet.length()) ? SmallCharMatcher.from(bitSet, str) : new BitSetMatcher(bitSet, str);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return isEither(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return SingleWidth.INSTANCE;
    }

    public static CharMatcher whitespace() {
        return Whitespace.INSTANCE;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch2) {
        return matches(ch2.charValue());
    }

    public int indexIn(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i11, length);
        while (i11 < length) {
            if (matches(charSequence.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public CharMatcher negate() {
        return new Negated(this);
    }

    /* JADX INFO: renamed from: or */
    public CharMatcher mo13371or(CharMatcher charMatcher) {
        return new C7973Or(this, charMatcher);
    }

    @GwtIncompatible
    public CharMatcher precomputedInternal() {
        String strSubstring;
        BitSet bitSet = new BitSet();
        setBits(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return precomputedPositive(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i11 = 65536 - iCardinality;
        final String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new NegatedFastMatcher(this, precomputedPositive(i11, bitSet, strSubstring)) { // from class: com.google.common.base.CharMatcher.1
            final /* synthetic */ CharMatcher this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.base.CharMatcher.Negated, com.google.common.base.CharMatcher
            public String toString() {
                return string;
            }
        };
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new AnyOf(charSequence);
                }
                return isEither(charSequence.charAt(0), charSequence.charAt(1));
            }
            return m13370is(charSequence.charAt(0));
        }
        return none();
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    public String collapseFrom(CharSequence charSequence, char c11) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (matches(cCharAt)) {
                if (cCharAt == c11 && (i11 == length - 1 || !matches(charSequence.charAt(i11 + 1)))) {
                    i11++;
                } else {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i11);
                    sb2.append(c11);
                    return finishCollapseFrom(charSequence, i11 + 1, length, c11, sb2, true);
                }
            }
            i11++;
            c11 = c11;
        }
        return charSequence.toString();
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        if (indexIn(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public CharMatcher precomputed() {
        return Platform.precomputeCharMatcher(this);
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i11 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    i11++;
                } else {
                    charArray[iIndexIn - i11] = charArray[iIndexIn];
                    iIndexIn++;
                }
            }
            return new String(charArray, 0, iIndexIn - i11);
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    @GwtIncompatible
    public void setBits(BitSet bitSet) {
        for (int i11 = 65535; i11 >= 0; i11--) {
            if (matches((char) i11)) {
                bitSet.set(i11);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c11) {
        int length = charSequence.length();
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < length && matches(charSequence.charAt(i12))) {
            i12++;
        }
        int i13 = i11;
        while (i13 > i12 && matches(charSequence.charAt(i13))) {
            i13--;
        }
        if (i12 == 0 && i13 == i11) {
            return collapseFrom(charSequence, c11);
        }
        int i14 = i13 + 1;
        return finishCollapseFrom(charSequence, i12, i14, c11, new StringBuilder(i14 - i12), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && matches(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = length - 1;
        while (i12 > i11 && matches(charSequence.charAt(i12))) {
            i12--;
        }
        return charSequence.subSequence(i11, i12 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!matches(charSequence.charAt(i11))) {
                return charSequence.subSequence(i11, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i11 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) string, i11, iIndexIn);
            sb2.append(charSequence2);
            i11 = iIndexIn + 1;
            iIndexIn = indexIn(string, i11);
        } while (iIndexIn != -1);
        sb2.append((CharSequence) string, i11, length2);
        return sb2.toString();
    }
}
