package com.google.zxing.pdf417.decoder;

/* JADX INFO: loaded from: classes56.dex */
final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: AL */
    private static final int f12799AL = 28;

    /* JADX INFO: renamed from: AS */
    private static final int f12800AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final java.math.BigInteger[] EXP900 = null;

    /* JADX INFO: renamed from: LL */
    private static final int f12801LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final char[] MIXED_CHARS = null;

    /* JADX INFO: renamed from: ML */
    private static final int f12802ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;

    /* JADX INFO: renamed from: PL */
    private static final int f12803PL = 25;

    /* JADX INFO: renamed from: PS */
    private static final int f12804PS = 29;
    private static final char[] PUNCT_CHARS = null;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1 */
    public static /* synthetic */ class C91551 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode */
        static final /* synthetic */ int[] f12805x45bba1d = null;

        static {
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C91551.f12805x45bba1d = r0
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C91551.f12805x45bba1d     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C91551.f12805x45bba1d     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C91551.f12805x45bba1d     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C91551.f12805x45bba1d     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA_SHIFT     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C91551.f12805x45bba1d     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    public static final enum Mode extends java.lang.Enum<com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode> {
        private static final /* synthetic */ com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode[] $VALUES = null;
        public static final com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode ALPHA = null;
        public static final com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode ALPHA_SHIFT = null;
        public static final com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode LOWER = null;
        public static final com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode MIXED = null;
        public static final com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode PUNCT = null;
        public static final com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode PUNCT_SHIFT = null;

        static {
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = new com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode
                java.lang.String r1 = "ALPHA"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA = r0
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = new com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode
                java.lang.String r2 = "LOWER"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER = r1
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r2 = new com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode
                java.lang.String r3 = "MIXED"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED = r2
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = new com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode
                java.lang.String r4 = "PUNCT"
                r5 = 3
                r3.<init>(r4, r5)
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT = r3
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r4 = new com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode
                java.lang.String r5 = "ALPHA_SHIFT"
                r6 = 4
                r4.<init>(r5, r6)
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA_SHIFT = r4
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r5 = new com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode
                java.lang.String r6 = "PUNCT_SHIFT"
                r7 = 5
                r5.<init>(r6, r7)
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT = r5
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode[] r0 = new com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode[]{r0, r1, r2, r3, r4, r5}
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.$VALUES = r0
                return
        }

        private Mode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode valueOf(java.lang.String r1) {
                java.lang.Class<com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode> r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = (com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode) r1
                return r1
        }

        public static com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode[] values() {
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode[] r0 = (com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'"
            char[] r0 = r0.toCharArray()
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser.PUNCT_CHARS = r0
            java.lang.String r0 = "0123456789&\r\t,:#-.$/+%*=^"
            char[] r0 = r0.toCharArray()
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser.MIXED_CHARS = r0
            r0 = 16
            java.math.BigInteger[] r0 = new java.math.BigInteger[r0]
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser.EXP900 = r0
            r1 = 0
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            r0[r1] = r2
            r1 = 900(0x384, double:4.447E-321)
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            r0 = 2
        L25:
            java.math.BigInteger[] r2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.EXP900
            int r3 = r2.length
            if (r0 >= r3) goto L37
            int r3 = r0 + (-1)
            r3 = r2[r3]
            java.math.BigInteger r3 = r3.multiply(r1)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L25
        L37:
            return
    }

    private DecodedBitStreamParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int byteCompaction(int r19, int[] r20, java.nio.charset.Charset r21, int r22, java.lang.StringBuilder r23) {
            r0 = r19
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 901(0x385, float:1.263E-42)
            r3 = 928(0x3a0, float:1.3E-42)
            r6 = 900(0x384, float:1.261E-42)
            r7 = 6
            r9 = 0
            if (r0 == r2) goto L66
            r2 = 924(0x39c, float:1.295E-42)
            if (r0 == r2) goto L19
            r0 = r22
            goto Lcb
        L19:
            r0 = r22
            r2 = r9
            r12 = r2
            r13 = 0
        L1f:
            r15 = r20[r9]
            if (r0 >= r15) goto Lcb
            if (r2 != 0) goto Lcb
            int r15 = r0 + 1
            r16 = 900(0x384, double:4.447E-321)
            r4 = r20[r0]
            if (r4 >= r6) goto L35
            int r12 = r12 + 1
            long r13 = r13 * r16
            long r4 = (long) r4
            long r13 = r13 + r4
        L33:
            r0 = r15
            goto L3f
        L35:
            if (r4 == r3) goto L3e
            switch(r4) {
                case 900: goto L3e;
                case 901: goto L3e;
                case 902: goto L3e;
                default: goto L3a;
            }
        L3a:
            switch(r4) {
                case 922: goto L3e;
                case 923: goto L3e;
                case 924: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L33
        L3e:
            r2 = 1
        L3f:
            int r4 = r12 % 5
            if (r4 != 0) goto L61
            if (r12 <= 0) goto L61
            r4 = r9
        L46:
            if (r4 >= r7) goto L5a
            int r5 = 5 - r4
            int r5 = r5 * 8
            r18 = r9
            long r8 = r13 >> r5
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1.write(r5)
            int r4 = r4 + 1
            r9 = r18
            goto L46
        L5a:
            r18 = r9
            r12 = r18
            r13 = 0
            goto L63
        L61:
            r18 = r9
        L63:
            r9 = r18
            goto L1f
        L66:
            r18 = r9
            r16 = 900(0x384, double:4.447E-321)
            int[] r0 = new int[r7]
            int r2 = r22 + 1
            r4 = r20[r22]
            r5 = r18
            r8 = r5
        L73:
            r12 = 0
        L75:
            r9 = r20[r18]
            if (r2 >= r9) goto Lb4
            if (r5 != 0) goto Lb4
            int r9 = r8 + 1
            r0[r8] = r4
            long r12 = r12 * r16
            long r10 = (long) r4
            long r12 = r12 + r10
            int r4 = r2 + 1
            r8 = r20[r2]
            if (r8 == r3) goto Lb0
            switch(r8) {
                case 900: goto Lb0;
                case 901: goto Lb0;
                case 902: goto Lb0;
                default: goto L8c;
            }
        L8c:
            switch(r8) {
                case 922: goto Lb0;
                case 923: goto Lb0;
                case 924: goto Lb0;
                default: goto L8f;
            }
        L8f:
            int r2 = r9 % 5
            if (r2 != 0) goto Lac
            if (r9 <= 0) goto Lac
            r2 = r18
        L97:
            if (r2 >= r7) goto La7
            int r9 = 5 - r2
            int r9 = r9 * 8
            long r9 = r12 >> r9
            int r9 = (int) r9
            byte r9 = (byte) r9
            r1.write(r9)
            int r2 = r2 + 1
            goto L97
        La7:
            r2 = r4
            r4 = r8
            r8 = r18
            goto L73
        Lac:
            r2 = r4
            r4 = r8
            r8 = r9
            goto L75
        Lb0:
            r4 = r8
            r8 = r9
            r5 = 1
            goto L75
        Lb4:
            if (r2 != r9) goto Lbd
            if (r4 >= r6) goto Lbd
            int r3 = r8 + 1
            r0[r8] = r4
            r8 = r3
        Lbd:
            r9 = r18
        Lbf:
            if (r9 >= r8) goto Lca
            r3 = r0[r9]
            byte r3 = (byte) r3
            r1.write(r3)
            int r9 = r9 + 1
            goto Lbf
        Lca:
            r0 = r2
        Lcb:
            java.lang.String r2 = new java.lang.String
            byte[] r1 = r1.toByteArray()
            r3 = r21
            r2.<init>(r1, r3)
            r1 = r23
            r1.append(r2)
            return r0
    }

    public static com.google.zxing.common.DecoderResult decode(int[] r6, java.lang.String r7) throws com.google.zxing.FormatException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            com.google.zxing.pdf417.PDF417ResultMetadata r3 = new com.google.zxing.pdf417.PDF417ResultMetadata
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L6d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L58
            switch(r2) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2d;
                case 928: goto L28;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            int r2 = textCompaction(r6, r4, r0)
            goto L60
        L28:
            int r2 = decodeMacroBlock(r6, r4, r3)
            goto L60
        L2d:
            int r2 = r4 + 1
            r1 = r6[r4]
            com.google.zxing.common.CharacterSetECI r1 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L60
        L3e:
            int r2 = r4 + 2
            goto L60
        L41:
            int r2 = r4 + 1
            goto L60
        L44:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        L49:
            int r2 = numericCompaction(r6, r4, r0)
            goto L60
        L4e:
            int r2 = byteCompaction(r2, r6, r1, r4, r0)
            goto L60
        L53:
            int r2 = textCompaction(r6, r4, r0)
            goto L60
        L58:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L60:
            int r4 = r6.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L68:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        L6d:
            int r6 = r0.length()
            if (r6 == 0) goto L81
            com.google.zxing.common.DecoderResult r6 = new com.google.zxing.common.DecoderResult
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.setOther(r3)
            return r6
        L81:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
    }

    private static java.lang.String decodeBase900toBase10(int[] r6, int r7) throws com.google.zxing.FormatException {
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            r1 = 0
            r2 = r1
        L4:
            r3 = 1
            if (r2 >= r7) goto L20
            java.math.BigInteger[] r4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.EXP900
            int r5 = r7 - r2
            int r5 = r5 - r3
            r3 = r4[r5]
            r4 = r6[r2]
            long r4 = (long) r4
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r0 = r0.add(r3)
            int r2 = r2 + 1
            goto L4
        L20:
            java.lang.String r6 = r0.toString()
            char r7 = r6.charAt(r1)
            r0 = 49
            if (r7 != r0) goto L31
            java.lang.String r6 = r6.substring(r3)
            return r6
        L31:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
    }

    public static int decodeMacroBlock(int[] r6, int r7, com.google.zxing.pdf417.PDF417ResultMetadata r8) throws com.google.zxing.FormatException {
            int r0 = r7 + 2
            r1 = 0
            r2 = r6[r1]
            if (r0 > r2) goto L10e
            r0 = 2
            int[] r2 = new int[r0]
            r3 = r1
        Lb:
            if (r3 >= r0) goto L16
            r4 = r6[r7]
            r2[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            goto Lb
        L16:
            java.lang.String r0 = decodeBase900toBase10(r2, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r8.setSegmentIndex(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r7 = textCompaction(r6, r7, r0)
            java.lang.String r0 = r0.toString()
            r8.setFileId(r0)
            r0 = r6[r7]
            r2 = 923(0x39b, float:1.293E-42)
            r3 = -1
            if (r0 != r2) goto L3b
            int r0 = r7 + 1
            goto L3c
        L3b:
            r0 = r3
        L3c:
            r4 = r6[r1]
            if (r7 >= r4) goto Lf9
            r4 = r6[r7]
            r5 = 922(0x39a, float:1.292E-42)
            if (r4 == r5) goto Lf1
            if (r4 != r2) goto Lec
            int r4 = r7 + 1
            r4 = r6[r4]
            switch(r4) {
                case 0: goto Ld8;
                case 1: goto Lc0;
                case 2: goto La8;
                case 3: goto L95;
                case 4: goto L82;
                case 5: goto L6b;
                case 6: goto L54;
                default: goto L4f;
            }
        L4f:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        L54:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r7 = r7 + 2
            int r7 = numericCompaction(r6, r7, r4)
            java.lang.String r4 = r4.toString()
            int r4 = java.lang.Integer.parseInt(r4)
            r8.setChecksum(r4)
            goto L3c
        L6b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r7 = r7 + 2
            int r7 = numericCompaction(r6, r7, r4)
            java.lang.String r4 = r4.toString()
            long r4 = java.lang.Long.parseLong(r4)
            r8.setFileSize(r4)
            goto L3c
        L82:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r7 = r7 + 2
            int r7 = textCompaction(r6, r7, r4)
            java.lang.String r4 = r4.toString()
            r8.setAddressee(r4)
            goto L3c
        L95:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r7 = r7 + 2
            int r7 = textCompaction(r6, r7, r4)
            java.lang.String r4 = r4.toString()
            r8.setSender(r4)
            goto L3c
        La8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r7 = r7 + 2
            int r7 = numericCompaction(r6, r7, r4)
            java.lang.String r4 = r4.toString()
            long r4 = java.lang.Long.parseLong(r4)
            r8.setTimestamp(r4)
            goto L3c
        Lc0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r7 = r7 + 2
            int r7 = numericCompaction(r6, r7, r4)
            java.lang.String r4 = r4.toString()
            int r4 = java.lang.Integer.parseInt(r4)
            r8.setSegmentCount(r4)
            goto L3c
        Ld8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r7 = r7 + 2
            int r7 = textCompaction(r6, r7, r4)
            java.lang.String r4 = r4.toString()
            r8.setFileName(r4)
            goto L3c
        Lec:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        Lf1:
            int r7 = r7 + 1
            r4 = 1
            r8.setLastSegment(r4)
            goto L3c
        Lf9:
            if (r0 == r3) goto L10d
            int r1 = r7 - r0
            boolean r2 = r8.isLastSegment()
            if (r2 == 0) goto L105
            int r1 = r1 + (-1)
        L105:
            int r1 = r1 + r0
            int[] r6 = java.util.Arrays.copyOfRange(r6, r0, r1)
            r8.setOptionalData(r6)
        L10d:
            return r7
        L10e:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
    }

    private static void decodeTextCompaction(int[] r11, int[] r12, int r13, java.lang.StringBuilder r14) {
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            r1 = 0
            r2 = r0
            r3 = r1
        L5:
            if (r3 >= r13) goto Le4
            r4 = r11[r3]
            int[] r5 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C91551.f12805x45bba1d
            int r6 = r0.ordinal()
            r5 = r5[r6]
            r6 = 32
            r7 = 26
            r8 = 29
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            switch(r5) {
                case 1: goto Lb6;
                case 2: goto L95;
                case 3: goto L6a;
                case 4: goto L4e;
                case 5: goto L3f;
                case 6: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L39
        L1f:
            if (r4 >= r8) goto L28
            char[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.PUNCT_CHARS
            char r6 = r0[r4]
        L25:
            r0 = r2
            goto Ldb
        L28:
            if (r4 == r8) goto L3c
            if (r4 == r10) goto L37
            if (r4 == r9) goto L2f
            goto L35
        L2f:
            r0 = r12[r3]
            char r0 = (char) r0
            r14.append(r0)
        L35:
            r6 = r1
            goto L25
        L37:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
        L39:
            r6 = r1
            goto Ldb
        L3c:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L39
        L3f:
            if (r4 >= r7) goto L45
            int r4 = r4 + 65
            char r6 = (char) r4
            goto L25
        L45:
            if (r4 == r7) goto L25
            if (r4 == r10) goto L4b
            r0 = r2
            goto L39
        L4b:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L39
        L4e:
            if (r4 >= r8) goto L56
            char[] r5 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.PUNCT_CHARS
            char r6 = r5[r4]
            goto Ldb
        L56:
            if (r4 == r8) goto L67
            if (r4 == r10) goto L64
            if (r4 == r9) goto L5d
            goto L39
        L5d:
            r4 = r12[r3]
            char r4 = (char) r4
            r14.append(r4)
            goto L39
        L64:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L39
        L67:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L39
        L6a:
            r5 = 25
            if (r4 >= r5) goto L74
            char[] r5 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.MIXED_CHARS
            char r6 = r5[r4]
            goto Ldb
        L74:
            if (r4 == r10) goto L92
            if (r4 == r9) goto L8b
            switch(r4) {
                case 25: goto L88;
                case 26: goto Ldb;
                case 27: goto L85;
                case 28: goto L82;
                case 29: goto L7c;
                default: goto L7b;
            }
        L7b:
            goto L39
        L7c:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT
        L7e:
            r6 = r2
            r2 = r0
            r0 = r6
            goto L39
        L82:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L39
        L85:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER
            goto L39
        L88:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT
            goto L39
        L8b:
            r4 = r12[r3]
            char r4 = (char) r4
            r14.append(r4)
            goto L39
        L92:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L39
        L95:
            if (r4 >= r7) goto L9b
            int r4 = r4 + 97
        L99:
            char r6 = (char) r4
            goto Ldb
        L9b:
            if (r4 == r10) goto Lb3
            if (r4 == r9) goto Lac
            switch(r4) {
                case 26: goto Ldb;
                case 27: goto La9;
                case 28: goto La6;
                case 29: goto La3;
                default: goto La2;
            }
        La2:
            goto L39
        La3:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT
            goto L7e
        La6:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED
            goto L39
        La9:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA_SHIFT
            goto L7e
        Lac:
            r4 = r12[r3]
            char r4 = (char) r4
            r14.append(r4)
            goto L39
        Lb3:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L39
        Lb6:
            if (r4 >= r7) goto Lbb
            int r4 = r4 + 65
            goto L99
        Lbb:
            if (r4 == r10) goto Ld7
            if (r4 == r9) goto Lcf
            switch(r4) {
                case 26: goto Ldb;
                case 27: goto Lcb;
                case 28: goto Lc7;
                case 29: goto Lc4;
                default: goto Lc2;
            }
        Lc2:
            goto L39
        Lc4:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT
            goto L7e
        Lc7:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED
            goto L39
        Lcb:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER
            goto L39
        Lcf:
            r4 = r12[r3]
            char r4 = (char) r4
            r14.append(r4)
            goto L39
        Ld7:
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L39
        Ldb:
            if (r6 == 0) goto Le0
            r14.append(r6)
        Le0:
            int r3 = r3 + 1
            goto L5
        Le4:
            return
    }

    private static int numericCompaction(int[] r8, int r9, java.lang.StringBuilder r10) throws com.google.zxing.FormatException {
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L43
            if (r2 != 0) goto L43
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
        L1d:
            r9 = r5
            goto L2e
        L1f:
            if (r6 == r4) goto L2d
            r4 = 901(0x385, float:1.263E-42)
            if (r6 == r4) goto L2d
            r4 = 928(0x3a0, float:1.3E-42)
            if (r6 == r4) goto L2d
            switch(r6) {
                case 922: goto L2d;
                case 923: goto L2d;
                case 924: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L1d
        L2d:
            r2 = r7
        L2e:
            int r4 = r3 % 15
            if (r4 == 0) goto L38
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L38
            if (r2 == 0) goto L7
        L38:
            if (r3 <= 0) goto L7
            java.lang.String r3 = decodeBase900toBase10(r0, r3)
            r10.append(r3)
            r3 = r1
            goto L7
        L43:
            return r9
    }

    private static int textCompaction(int[] r10, int r11, java.lang.StringBuilder r12) {
            r0 = 0
            r1 = r10[r0]
            int r2 = r1 - r11
            r3 = 1
            int r2 = r2 << r3
            int[] r2 = new int[r2]
            int r1 = r1 - r11
            int r1 = r1 << r3
            int[] r1 = new int[r1]
            r4 = r0
            r5 = r4
        Lf:
            r6 = r10[r0]
            if (r11 >= r6) goto L4d
            if (r4 != 0) goto L4d
            int r6 = r11 + 1
            r7 = r10[r11]
            r8 = 900(0x384, float:1.261E-42)
            if (r7 >= r8) goto L2b
            int r11 = r7 / 30
            r2[r5] = r11
            int r11 = r5 + 1
            int r7 = r7 % 30
            r2[r11] = r7
            int r5 = r5 + 2
        L29:
            r11 = r6
            goto Lf
        L2b:
            r9 = 913(0x391, float:1.28E-42)
            if (r7 == r9) goto L42
            r9 = 928(0x3a0, float:1.3E-42)
            if (r7 == r9) goto L40
            switch(r7) {
                case 900: goto L3a;
                case 901: goto L40;
                case 902: goto L40;
                default: goto L36;
            }
        L36:
            switch(r7) {
                case 922: goto L40;
                case 923: goto L40;
                case 924: goto L40;
                default: goto L39;
            }
        L39:
            goto L29
        L3a:
            int r11 = r5 + 1
            r2[r5] = r8
            r5 = r11
            goto L29
        L40:
            r4 = r3
            goto Lf
        L42:
            r2[r5] = r9
            int r11 = r11 + 2
            r6 = r10[r6]
            r1[r5] = r6
            int r5 = r5 + 1
            goto Lf
        L4d:
            decodeTextCompaction(r2, r1, r5, r12)
            return r11
    }
}
