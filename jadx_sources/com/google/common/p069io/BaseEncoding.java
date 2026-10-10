package com.google.common.p069io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public abstract class BaseEncoding {
    private static final BaseEncoding BASE64 = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding BASE64_URL = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final BaseEncoding BASE32 = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final BaseEncoding BASE32_HEX = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");

    public static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        private final boolean ignoreCase;
        final int mask;
        private final String name;
        private final boolean[] validPadding;

        public Alphabet(String str, char[] cArr) {
            this(str, cArr, decodabetFor(cArr), false);
        }

        private Alphabet(String str, char[] cArr, byte[] bArr, boolean z11) {
            this.name = (String) Preconditions.checkNotNull(str);
            this.chars = (char[]) Preconditions.checkNotNull(cArr);
            try {
                int iLog2 = IntMath.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.bitsPerChar = iLog2;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iLog2);
                int i11 = 1 << (3 - iNumberOfTrailingZeros);
                this.charsPerChunk = i11;
                this.bytesPerChunk = iLog2 >> iNumberOfTrailingZeros;
                this.mask = cArr.length - 1;
                this.decodabet = bArr;
                boolean[] zArr = new boolean[i11];
                for (int i12 = 0; i12 < this.bytesPerChunk; i12++) {
                    zArr[IntMath.divide(i12 * 8, this.bitsPerChar, RoundingMode.CEILING)] = true;
                }
                this.validPadding = zArr;
                this.ignoreCase = z11;
            } catch (ArithmeticException e11) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e11);
            }
        }

        private static byte[] decodabetFor(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i11 = 0; i11 < cArr.length; i11++) {
                char c11 = cArr[i11];
                boolean z11 = true;
                Preconditions.checkArgument(c11 < 128, "Non-ASCII character: %s", c11);
                if (bArr[c11] != -1) {
                    z11 = false;
                }
                Preconditions.checkArgument(z11, "Duplicate character: %s", c11);
                bArr[c11] = (byte) i11;
            }
            return bArr;
        }

        private boolean hasLowerCase() {
            for (char c11 : this.chars) {
                if (Ascii.isLowerCase(c11)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char c11 : this.chars) {
                if (Ascii.isUpperCase(c11)) {
                    return true;
                }
            }
            return false;
        }

        public boolean canDecode(char c11) {
            return c11 <= 127 && this.decodabet[c11] != -1;
        }

        public int decode(char c11) throws DecodingException {
            if (c11 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c11));
            }
            byte b11 = this.decodabet[c11];
            if (b11 != -1) {
                return b11;
            }
            if (c11 <= ' ' || c11 == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c11));
            }
            throw new DecodingException("Unrecognized character: " + c11);
        }

        public char encode(int i11) {
            return this.chars[i11];
        }

        public boolean equals(Object obj) {
            if (obj instanceof Alphabet) {
                Alphabet alphabet = (Alphabet) obj;
                if (this.ignoreCase == alphabet.ignoreCase && Arrays.equals(this.chars, alphabet.chars)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.chars) + (this.ignoreCase ? 1231 : 1237);
        }

        public Alphabet ignoreCase() {
            if (this.ignoreCase) {
                return this;
            }
            byte[] bArr = this.decodabet;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i11 = 65;
            while (true) {
                if (i11 > 90) {
                    return new Alphabet(this.name + ".ignoreCase()", this.chars, bArrCopyOf, true);
                }
                int i12 = i11 | 32;
                byte[] bArr2 = this.decodabet;
                byte b11 = bArr2[i11];
                byte b12 = bArr2[i12];
                if (b11 == -1) {
                    bArrCopyOf[i11] = b12;
                } else {
                    Preconditions.checkState(b12 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i11, (char) i12);
                    bArrCopyOf[i12] = b11;
                }
                i11++;
            }
        }

        public boolean isValidPaddingStartPosition(int i11) {
            return this.validPadding[i11 % this.charsPerChunk];
        }

        public boolean matches(char c11) {
            byte[] bArr = this.decodabet;
            return c11 < bArr.length && bArr[c11] != -1;
        }

        public String toString() {
            return this.name;
        }

        public Alphabet lowerCase() {
            if (!hasUpperCase()) {
                return this;
            }
            Preconditions.checkState(!hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i11 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i11 >= cArr2.length) {
                    break;
                }
                cArr[i11] = Ascii.toLowerCase(cArr2[i11]);
                i11++;
            }
            Alphabet alphabet = new Alphabet(this.name + ".lowerCase()", cArr);
            if (this.ignoreCase) {
                return alphabet.ignoreCase();
            }
            return alphabet;
        }

        public Alphabet upperCase() {
            if (!hasLowerCase()) {
                return this;
            }
            Preconditions.checkState(!hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i11 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i11 >= cArr2.length) {
                    break;
                }
                cArr[i11] = Ascii.toUpperCase(cArr2[i11]);
                i11++;
            }
            Alphabet alphabet = new Alphabet(this.name + ".upperCase()", cArr);
            if (this.ignoreCase) {
                return alphabet.ignoreCase();
            }
            return alphabet;
        }
    }

    public static final class Base16Encoding extends StandardBaseEncoding {
        final char[] encoding;

        public Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[512];
            Preconditions.checkArgument(alphabet.chars.length == 16);
            for (int i11 = 0; i11 < 256; i11++) {
                this.encoding[i11] = alphabet.encode(i11 >>> 4);
                this.encoding[i11 | 256] = alphabet.encode(i11 & 15);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, Character ch2) {
            return new Base16Encoding(alphabet);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.p069io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 != 1) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < charSequence.length()) {
                    bArr[i12] = (byte) ((this.alphabet.decode(charSequence.charAt(i11)) << 4) | this.alphabet.decode(charSequence.charAt(i11 + 1)));
                    i11 += 2;
                    i12++;
                }
                return i12;
            }
            throw new DecodingException("Invalid input length " + charSequence.length());
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.p069io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = bArr[i11 + i13] & 255;
                appendable.append(this.encoding[i14]);
                appendable.append(this.encoding[i14 | 256]);
            }
        }
    }

    public static final class Base64Encoding extends StandardBaseEncoding {
        public Base64Encoding(String str, String str2, Character ch2) {
            this(new Alphabet(str, str2.toCharArray()), ch2);
        }

        private Base64Encoding(Alphabet alphabet, Character ch2) {
            super(alphabet, ch2);
            Preconditions.checkArgument(alphabet.chars.length == 64);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, Character ch2) {
            return new Base64Encoding(alphabet, ch2);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.p069io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < charSequenceTrimTrailingPadding.length()) {
                    int i13 = i11 + 2;
                    int iDecode = (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i11)) << 18) | (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i11 + 1)) << 12);
                    int i14 = i12 + 1;
                    bArr[i12] = (byte) (iDecode >>> 16);
                    if (i13 < charSequenceTrimTrailingPadding.length()) {
                        int i15 = i11 + 3;
                        int iDecode2 = iDecode | (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i13)) << 6);
                        int i16 = i12 + 2;
                        bArr[i14] = (byte) ((iDecode2 >>> 8) & 255);
                        if (i15 < charSequenceTrimTrailingPadding.length()) {
                            i11 += 4;
                            i12 += 3;
                            bArr[i16] = (byte) ((iDecode2 | this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i15))) & 255);
                        } else {
                            i12 = i16;
                            i11 = i15;
                        }
                    } else {
                        i12 = i14;
                        i11 = i13;
                    }
                }
                return i12;
            }
            throw new DecodingException("Invalid input length " + charSequenceTrimTrailingPadding.length());
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.p069io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            Preconditions.checkNotNull(appendable);
            int i13 = i11 + i12;
            Preconditions.checkPositionIndexes(i11, i13, bArr.length);
            while (i12 >= 3) {
                int i14 = i11 + 2;
                int i15 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
                i11 += 3;
                int i16 = i15 | (bArr[i14] & 255);
                appendable.append(this.alphabet.encode(i16 >>> 18));
                appendable.append(this.alphabet.encode((i16 >>> 12) & 63));
                appendable.append(this.alphabet.encode((i16 >>> 6) & 63));
                appendable.append(this.alphabet.encode(i16 & 63));
                i12 -= 3;
            }
            if (i11 < i13) {
                encodeChunkTo(appendable, bArr, i11, i13 - i11);
            }
        }
    }

    public static final class SeparatedBaseEncoding extends BaseEncoding {
        private final int afterEveryChars;
        private final BaseEncoding delegate;
        private final String separator;

        @Override // com.google.common.p069io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < charSequence.length(); i11++) {
                char cCharAt = charSequence.charAt(i11);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.delegate.canDecode(sb2);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            StringBuilder sb2 = new StringBuilder(charSequence.length());
            for (int i11 = 0; i11 < charSequence.length(); i11++) {
                char cCharAt = charSequence.charAt(i11);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.delegate.decodeTo(bArr, sb2);
        }

        @Override // com.google.common.p069io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
            return this.delegate.decodingStream(BaseEncoding.ignoringReader(reader, this.separator));
        }

        @Override // com.google.common.p069io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            this.delegate.encodeTo(BaseEncoding.separatingAppendable(appendable, this.separator, this.afterEveryChars), bArr, i11, i12);
        }

        @Override // com.google.common.p069io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
            return this.delegate.encodingStream(BaseEncoding.separatingWriter(writer, this.separator, this.afterEveryChars));
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding ignoreCase() {
            return this.delegate.ignoreCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.delegate.lowerCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public int maxDecodedSize(int i11) {
            return this.delegate.maxDecodedSize(i11);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public int maxEncodedSize(int i11) {
            int iMaxEncodedSize = this.delegate.maxEncodedSize(i11);
            return iMaxEncodedSize + (this.separator.length() * IntMath.divide(Math.max(0, iMaxEncodedSize - 1), this.afterEveryChars, RoundingMode.FLOOR));
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.delegate.omitPadding().withSeparator(this.separator, this.afterEveryChars);
        }

        public String toString() {
            return this.delegate + ".withSeparator(\"" + this.separator + "\", " + this.afterEveryChars + ")";
        }

        @Override // com.google.common.p069io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
            return this.delegate.trimTrailingPadding(charSequence);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.delegate.upperCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding withPadChar(char c11) {
            return this.delegate.withPadChar(c11).withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i11) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        public SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i11) {
            boolean z11;
            this.delegate = (BaseEncoding) Preconditions.checkNotNull(baseEncoding);
            this.separator = (String) Preconditions.checkNotNull(str);
            this.afterEveryChars = i11;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "Cannot add a separator after every %s chars", i11);
        }
    }

    public static class StandardBaseEncoding extends BaseEncoding {
        final Alphabet alphabet;

        @LazyInit
        private volatile BaseEncoding ignoreCase;

        @LazyInit
        private volatile BaseEncoding lowerCase;
        final Character paddingChar;

        @LazyInit
        private volatile BaseEncoding upperCase;

        public StandardBaseEncoding(String str, String str2, Character ch2) {
            this(new Alphabet(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i11) {
            for (int i12 = 0; i12 < str.length(); i12++) {
                Preconditions.checkArgument(!this.alphabet.matches(str.charAt(i12)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch2 = this.paddingChar;
            if (ch2 != null) {
                Preconditions.checkArgument(str.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new SeparatedBaseEncoding(this, str, i11);
        }

        public StandardBaseEncoding(Alphabet alphabet, Character ch2) {
            this.alphabet = (Alphabet) Preconditions.checkNotNull(alphabet);
            Preconditions.checkArgument(ch2 == null || !alphabet.matches(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.paddingChar = ch2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof StandardBaseEncoding) {
                StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
                if (this.alphabet.equals(standardBaseEncoding.alphabet) && Objects.equals(this.paddingChar, standardBaseEncoding.paddingChar)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ Objects.hashCode(this.paddingChar);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding ignoreCase() {
            BaseEncoding baseEncodingNewInstance = this.ignoreCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetIgnoreCase = this.alphabet.ignoreCase();
                baseEncodingNewInstance = alphabetIgnoreCase == this.alphabet ? this : newInstance(alphabetIgnoreCase, this.paddingChar);
                this.ignoreCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncodingNewInstance = this.lowerCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetLowerCase = this.alphabet.lowerCase();
                baseEncodingNewInstance = alphabetLowerCase == this.alphabet ? this : newInstance(alphabetLowerCase, this.paddingChar);
                this.lowerCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.p069io.BaseEncoding
        public int maxDecodedSize(int i11) {
            return (int) (((((long) this.alphabet.bitsPerChar) * ((long) i11)) + 7) / 8);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public int maxEncodedSize(int i11) {
            Alphabet alphabet = this.alphabet;
            return alphabet.charsPerChunk * IntMath.divide(i11, alphabet.bytesPerChunk, RoundingMode.CEILING);
        }

        public BaseEncoding newInstance(Alphabet alphabet, Character ch2) {
            return new StandardBaseEncoding(alphabet, ch2);
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : newInstance(this.alphabet, null);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.alphabet);
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.paddingChar);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncodingNewInstance = this.upperCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetUpperCase = this.alphabet.upperCase();
                baseEncodingNewInstance = alphabetUpperCase == this.alphabet ? this : newInstance(alphabetUpperCase, this.paddingChar);
                this.upperCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.p069io.BaseEncoding
        public BaseEncoding withPadChar(char c11) {
            Character ch2;
            return (8 % this.alphabet.bitsPerChar == 0 || ((ch2 = this.paddingChar) != null && ch2.charValue() == c11)) ? this : newInstance(this.alphabet, Character.valueOf(c11));
        }

        @Override // com.google.common.p069io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                return false;
            }
            for (int i11 = 0; i11 < charSequenceTrimTrailingPadding.length(); i11++) {
                if (!this.alphabet.canDecode(charSequenceTrimTrailingPadding.charAt(i11))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p069io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Alphabet alphabet;
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < charSequenceTrimTrailingPadding.length()) {
                    long jDecode = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        alphabet = this.alphabet;
                        if (i13 >= alphabet.charsPerChunk) {
                            break;
                        }
                        jDecode <<= alphabet.bitsPerChar;
                        if (i11 + i13 < charSequenceTrimTrailingPadding.length()) {
                            jDecode |= (long) this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i14 + i11));
                            i14++;
                        }
                        i13++;
                    }
                    int i15 = alphabet.bytesPerChunk;
                    int i16 = (i15 * 8) - (i14 * alphabet.bitsPerChar);
                    int i17 = (i15 - 1) * 8;
                    while (i17 >= i16) {
                        bArr[i12] = (byte) ((jDecode >>> i17) & 255);
                        i17 -= 8;
                        i12++;
                    }
                    i11 += this.alphabet.charsPerChunk;
                }
                return i12;
            }
            throw new DecodingException("Invalid input length " + charSequenceTrimTrailingPadding.length());
        }

        @Override // com.google.common.p069io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public InputStream decodingStream(final Reader reader) {
            Preconditions.checkNotNull(reader);
            return new InputStream(this) { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.2
                final /* synthetic */ StandardBaseEncoding this$0;
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int readChars = 0;
                boolean hitPadding = false;

                @Override // java.io.InputStream
                public int read() throws IOException {
                    int i11;
                    while (true) {
                        int i12 = reader.read();
                        if (i12 == -1) {
                            if (this.hitPadding || this.this$0.alphabet.isValidPaddingStartPosition(this.readChars)) {
                                return -1;
                            }
                            throw new DecodingException("Invalid input length " + this.readChars);
                        }
                        this.readChars++;
                        char c11 = (char) i12;
                        Character ch2 = this.this$0.paddingChar;
                        if (ch2 == null || ch2.charValue() != c11) {
                            if (this.hitPadding) {
                                throw new DecodingException("Expected padding character but found '" + c11 + "' at index " + this.readChars);
                            }
                            int i13 = this.bitBuffer;
                            Alphabet alphabet = this.this$0.alphabet;
                            int i14 = i13 << alphabet.bitsPerChar;
                            this.bitBuffer = i14;
                            int iDecode = alphabet.decode(c11) | i14;
                            this.bitBuffer = iDecode;
                            int i15 = this.bitBufferLength + this.this$0.alphabet.bitsPerChar;
                            this.bitBufferLength = i15;
                            if (i15 >= 8) {
                                int i16 = i15 - 8;
                                this.bitBufferLength = i16;
                                return (iDecode >> i16) & 255;
                            }
                        } else {
                            if (!this.hitPadding && ((i11 = this.readChars) == 1 || !this.this$0.alphabet.isValidPaddingStartPosition(i11 - 1))) {
                                throw new DecodingException("Padding cannot start at index " + this.readChars);
                            }
                            this.hitPadding = true;
                        }
                    }
                }

                {
                    this.this$0 = this;
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    reader.close();
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i11, int i12) throws IOException {
                    int i13 = i12 + i11;
                    Preconditions.checkPositionIndexes(i11, i13, bArr.length);
                    int i14 = i11;
                    while (i14 < i13) {
                        int i15 = read();
                        if (i15 == -1) {
                            int i16 = i14 - i11;
                            if (i16 == 0) {
                                return -1;
                            }
                            return i16;
                        }
                        bArr[i14] = (byte) i15;
                        i14++;
                    }
                    return i14 - i11;
                }
            };
        }

        public void encodeChunkTo(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            boolean z11;
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
            int i13 = 0;
            if (i12 <= this.alphabet.bytesPerChunk) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11);
            long j11 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                j11 = (j11 | ((long) (bArr[i11 + i14] & 255))) << 8;
            }
            int i15 = ((i12 + 1) * 8) - this.alphabet.bitsPerChar;
            while (i13 < i12 * 8) {
                Alphabet alphabet = this.alphabet;
                appendable.append(alphabet.encode(((int) (j11 >>> (i15 - i13))) & alphabet.mask));
                i13 += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i13 < this.alphabet.bytesPerChunk * 8) {
                    appendable.append(this.paddingChar.charValue());
                    i13 += this.alphabet.bitsPerChar;
                }
            }
        }

        @Override // com.google.common.p069io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
            int i13 = 0;
            while (i13 < i12) {
                encodeChunkTo(appendable, bArr, i11 + i13, Math.min(this.alphabet.bytesPerChunk, i12 - i13));
                i13 += this.alphabet.bytesPerChunk;
            }
        }

        @Override // com.google.common.p069io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public OutputStream encodingStream(final Writer writer) {
            Preconditions.checkNotNull(writer);
            return new OutputStream(this) { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.1
                final /* synthetic */ StandardBaseEncoding this$0;
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int writtenChars = 0;

                {
                    this.this$0 = this;
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    int i11 = this.bitBufferLength;
                    if (i11 > 0) {
                        int i12 = this.bitBuffer;
                        Alphabet alphabet = this.this$0.alphabet;
                        writer.write(alphabet.encode((i12 << (alphabet.bitsPerChar - i11)) & alphabet.mask));
                        this.writtenChars++;
                        if (this.this$0.paddingChar != null) {
                            while (true) {
                                int i13 = this.writtenChars;
                                StandardBaseEncoding standardBaseEncoding = this.this$0;
                                if (i13 % standardBaseEncoding.alphabet.charsPerChunk == 0) {
                                    break;
                                }
                                writer.write(standardBaseEncoding.paddingChar.charValue());
                                this.writtenChars++;
                            }
                        }
                    }
                    writer.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws IOException {
                    writer.flush();
                }

                @Override // java.io.OutputStream
                public void write(int i11) throws IOException {
                    this.bitBuffer = (i11 & 255) | (this.bitBuffer << 8);
                    this.bitBufferLength += 8;
                    while (true) {
                        int i12 = this.bitBufferLength;
                        Alphabet alphabet = this.this$0.alphabet;
                        int i13 = alphabet.bitsPerChar;
                        if (i12 < i13) {
                            return;
                        }
                        writer.write(alphabet.encode((this.bitBuffer >> (i12 - i13)) & alphabet.mask));
                        this.writtenChars++;
                        this.bitBufferLength -= this.this$0.alphabet.bitsPerChar;
                    }
                }
            };
        }

        @Override // com.google.common.p069io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch2 = this.paddingChar;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }
    }

    private static byte[] extract(byte[] bArr, int i11) {
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    public abstract boolean canDecode(CharSequence charSequence);

    public abstract int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException;

    @J2ktIncompatible
    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public abstract void encodeTo(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException;

    @J2ktIncompatible
    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    public abstract BaseEncoding ignoreCase();

    public abstract BaseEncoding lowerCase();

    public abstract int maxDecodedSize(int i11);

    public abstract int maxEncodedSize(int i11);

    public abstract BaseEncoding omitPadding();

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c11);

    public abstract BaseEncoding withSeparator(String str, int i11);

    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    public static BaseEncoding base32() {
        return BASE32;
    }

    public static BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    public final String encode(byte[] bArr, int i11, int i12) {
        Preconditions.checkPositionIndexes(i11, i11 + i12, bArr.length);
        StringBuilder sb2 = new StringBuilder(maxEncodedSize(i12));
        try {
            encodeTo(sb2, bArr, i11, i12);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Reader ignoringReader(final Reader reader, final String str) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(str);
        return new Reader() { // from class: com.google.common.io.BaseEncoding.3
            @Override // java.io.Reader
            public int read() throws IOException {
                int i11;
                do {
                    i11 = reader.read();
                    if (i11 == -1) {
                        break;
                    }
                } while (str.indexOf((char) i11) >= 0);
                return i11;
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                reader.close();
            }

            @Override // java.io.Reader
            public int read(char[] cArr, int i11, int i12) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static Appendable separatingAppendable(Appendable appendable, String str, int i11) {
        boolean z11;
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(str);
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        return new Appendable(i11, appendable, str) { // from class: com.google.common.io.BaseEncoding.4
            int charsUntilSeparator;
            final /* synthetic */ int val$afterEveryChars;
            final /* synthetic */ Appendable val$delegate;
            final /* synthetic */ String val$separator;

            @Override // java.lang.Appendable
            public Appendable append(char c11) throws IOException {
                if (this.charsUntilSeparator == 0) {
                    this.val$delegate.append(this.val$separator);
                    this.charsUntilSeparator = this.val$afterEveryChars;
                }
                this.val$delegate.append(c11);
                this.charsUntilSeparator--;
                return this;
            }

            {
                this.val$afterEveryChars = i11;
                this.val$delegate = appendable;
                this.val$separator = str;
                this.charsUntilSeparator = i11;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i12, int i13) {
                throw new UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Writer separatingWriter(final Writer writer, String str, int i11) {
        final Appendable appendableSeparatingAppendable = separatingAppendable(writer, str, i11);
        return new Writer() { // from class: com.google.common.io.BaseEncoding.5
            @Override // java.io.Writer
            public void write(int i12) throws IOException {
                appendableSeparatingAppendable.append((char) i12);
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                writer.close();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() throws IOException {
                writer.flush();
            }

            @Override // java.io.Writer
            public void write(char[] cArr, int i12, int i13) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    public final byte[] decode(CharSequence charSequence) {
        try {
            return decodeChecked(charSequence);
        } catch (DecodingException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final byte[] decodeChecked(CharSequence charSequence) throws DecodingException {
        CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
        byte[] bArr = new byte[maxDecodedSize(charSequenceTrimTrailingPadding.length())];
        return extract(bArr, decodeTo(bArr, charSequenceTrimTrailingPadding));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public final ByteSource decodingSource(final CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        return new ByteSource(this) { // from class: com.google.common.io.BaseEncoding.2
            final /* synthetic */ BaseEncoding this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.p069io.ByteSource
            public InputStream openStream() throws IOException {
                return this.this$0.decodingStream(charSource.openStream());
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    public final ByteSink encodingSink(final CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        return new ByteSink(this) { // from class: com.google.common.io.BaseEncoding.1
            final /* synthetic */ BaseEncoding this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.p069io.ByteSink
            public OutputStream openStream() throws IOException {
                return this.this$0.encodingStream(charSink.openStream());
            }
        };
    }

    public CharSequence trimTrailingPadding(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }
}
