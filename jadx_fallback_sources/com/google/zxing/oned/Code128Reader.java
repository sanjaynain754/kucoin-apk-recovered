package com.google.zxing.oned;

/* JADX INFO: loaded from: classes56.dex */
public final class Code128Reader extends com.google.zxing.oned.OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = null;
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    static {
            r0 = 6
            int[] r1 = new int[r0]
            r1 = {x0390: FILL_ARRAY_DATA , data: [2, 1, 2, 2, 2, 2} // fill-array
            int[] r2 = new int[r0]
            r2 = {x03a0: FILL_ARRAY_DATA , data: [2, 2, 2, 1, 2, 2} // fill-array
            int[] r3 = new int[r0]
            r3 = {x03b0: FILL_ARRAY_DATA , data: [2, 2, 2, 2, 2, 1} // fill-array
            int[] r4 = new int[r0]
            r4 = {x03c0: FILL_ARRAY_DATA , data: [1, 2, 1, 2, 2, 3} // fill-array
            int[] r5 = new int[r0]
            r5 = {x03d0: FILL_ARRAY_DATA , data: [1, 2, 1, 3, 2, 2} // fill-array
            int[] r6 = new int[r0]
            r6 = {x03e0: FILL_ARRAY_DATA , data: [1, 3, 1, 2, 2, 2} // fill-array
            int[] r7 = new int[r0]
            r7 = {x03f0: FILL_ARRAY_DATA , data: [1, 2, 2, 2, 1, 3} // fill-array
            int[] r8 = new int[r0]
            r8 = {x0400: FILL_ARRAY_DATA , data: [1, 2, 2, 3, 1, 2} // fill-array
            int[] r9 = new int[r0]
            r9 = {x0410: FILL_ARRAY_DATA , data: [1, 3, 2, 2, 1, 2} // fill-array
            int[] r10 = new int[r0]
            r10 = {x0420: FILL_ARRAY_DATA , data: [2, 2, 1, 2, 1, 3} // fill-array
            int[] r11 = new int[r0]
            r11 = {x0430: FILL_ARRAY_DATA , data: [2, 2, 1, 3, 1, 2} // fill-array
            int[] r12 = new int[r0]
            r12 = {x0440: FILL_ARRAY_DATA , data: [2, 3, 1, 2, 1, 2} // fill-array
            int[] r13 = new int[r0]
            r13 = {x0450: FILL_ARRAY_DATA , data: [1, 1, 2, 2, 3, 2} // fill-array
            int[] r14 = new int[r0]
            r14 = {x0460: FILL_ARRAY_DATA , data: [1, 2, 2, 1, 3, 2} // fill-array
            int[] r15 = new int[r0]
            r15 = {x0470: FILL_ARRAY_DATA , data: [1, 2, 2, 2, 3, 1} // fill-array
            r16 = r1
            int[] r1 = new int[r0]
            r1 = {x0480: FILL_ARRAY_DATA , data: [1, 1, 3, 2, 2, 2} // fill-array
            r17 = r1
            int[] r1 = new int[r0]
            r1 = {x0490: FILL_ARRAY_DATA , data: [1, 2, 3, 1, 2, 2} // fill-array
            r18 = r1
            int[] r1 = new int[r0]
            r1 = {x04a0: FILL_ARRAY_DATA , data: [1, 2, 3, 2, 2, 1} // fill-array
            r19 = r1
            int[] r1 = new int[r0]
            r1 = {x04b0: FILL_ARRAY_DATA , data: [2, 2, 3, 2, 1, 1} // fill-array
            r20 = r1
            int[] r1 = new int[r0]
            r1 = {x04c0: FILL_ARRAY_DATA , data: [2, 2, 1, 1, 3, 2} // fill-array
            r21 = r1
            int[] r1 = new int[r0]
            r1 = {x04d0: FILL_ARRAY_DATA , data: [2, 2, 1, 2, 3, 1} // fill-array
            r22 = r1
            int[] r1 = new int[r0]
            r1 = {x04e0: FILL_ARRAY_DATA , data: [2, 1, 3, 2, 1, 2} // fill-array
            r23 = r1
            int[] r1 = new int[r0]
            r1 = {x04f0: FILL_ARRAY_DATA , data: [2, 2, 3, 1, 1, 2} // fill-array
            r24 = r1
            int[] r1 = new int[r0]
            r1 = {x0500: FILL_ARRAY_DATA , data: [3, 1, 2, 1, 3, 1} // fill-array
            r25 = r1
            int[] r1 = new int[r0]
            r1 = {x0510: FILL_ARRAY_DATA , data: [3, 1, 1, 2, 2, 2} // fill-array
            r26 = r1
            int[] r1 = new int[r0]
            r1 = {x0520: FILL_ARRAY_DATA , data: [3, 2, 1, 1, 2, 2} // fill-array
            r27 = r1
            int[] r1 = new int[r0]
            r1 = {x0530: FILL_ARRAY_DATA , data: [3, 2, 1, 2, 2, 1} // fill-array
            r28 = r1
            int[] r1 = new int[r0]
            r1 = {x0540: FILL_ARRAY_DATA , data: [3, 1, 2, 2, 1, 2} // fill-array
            r29 = r1
            int[] r1 = new int[r0]
            r1 = {x0550: FILL_ARRAY_DATA , data: [3, 2, 2, 1, 1, 2} // fill-array
            r30 = r1
            int[] r1 = new int[r0]
            r1 = {x0560: FILL_ARRAY_DATA , data: [3, 2, 2, 2, 1, 1} // fill-array
            r31 = r1
            int[] r1 = new int[r0]
            r1 = {x0570: FILL_ARRAY_DATA , data: [2, 1, 2, 1, 2, 3} // fill-array
            r32 = r1
            int[] r1 = new int[r0]
            r1 = {x0580: FILL_ARRAY_DATA , data: [2, 1, 2, 3, 2, 1} // fill-array
            r33 = r1
            int[] r1 = new int[r0]
            r1 = {x0590: FILL_ARRAY_DATA , data: [2, 3, 2, 1, 2, 1} // fill-array
            r34 = r1
            int[] r1 = new int[r0]
            r1 = {x05a0: FILL_ARRAY_DATA , data: [1, 1, 1, 3, 2, 3} // fill-array
            r35 = r1
            int[] r1 = new int[r0]
            r1 = {x05b0: FILL_ARRAY_DATA , data: [1, 3, 1, 1, 2, 3} // fill-array
            r36 = r1
            int[] r1 = new int[r0]
            r1 = {x05c0: FILL_ARRAY_DATA , data: [1, 3, 1, 3, 2, 1} // fill-array
            r37 = r1
            int[] r1 = new int[r0]
            r1 = {x05d0: FILL_ARRAY_DATA , data: [1, 1, 2, 3, 1, 3} // fill-array
            r38 = r1
            int[] r1 = new int[r0]
            r1 = {x05e0: FILL_ARRAY_DATA , data: [1, 3, 2, 1, 1, 3} // fill-array
            r39 = r1
            int[] r1 = new int[r0]
            r1 = {x05f0: FILL_ARRAY_DATA , data: [1, 3, 2, 3, 1, 1} // fill-array
            r40 = r1
            int[] r1 = new int[r0]
            r1 = {x0600: FILL_ARRAY_DATA , data: [2, 1, 1, 3, 1, 3} // fill-array
            r41 = r1
            int[] r1 = new int[r0]
            r1 = {x0610: FILL_ARRAY_DATA , data: [2, 3, 1, 1, 1, 3} // fill-array
            r42 = r1
            int[] r1 = new int[r0]
            r1 = {x0620: FILL_ARRAY_DATA , data: [2, 3, 1, 3, 1, 1} // fill-array
            r43 = r1
            int[] r1 = new int[r0]
            r1 = {x0630: FILL_ARRAY_DATA , data: [1, 1, 2, 1, 3, 3} // fill-array
            r44 = r1
            int[] r1 = new int[r0]
            r1 = {x0640: FILL_ARRAY_DATA , data: [1, 1, 2, 3, 3, 1} // fill-array
            r45 = r1
            int[] r1 = new int[r0]
            r1 = {x0650: FILL_ARRAY_DATA , data: [1, 3, 2, 1, 3, 1} // fill-array
            r46 = r1
            int[] r1 = new int[r0]
            r1 = {x0660: FILL_ARRAY_DATA , data: [1, 1, 3, 1, 2, 3} // fill-array
            r47 = r1
            int[] r1 = new int[r0]
            r1 = {x0670: FILL_ARRAY_DATA , data: [1, 1, 3, 3, 2, 1} // fill-array
            r48 = r1
            int[] r1 = new int[r0]
            r1 = {x0680: FILL_ARRAY_DATA , data: [1, 3, 3, 1, 2, 1} // fill-array
            r49 = r1
            int[] r1 = new int[r0]
            r1 = {x0690: FILL_ARRAY_DATA , data: [3, 1, 3, 1, 2, 1} // fill-array
            r50 = r1
            int[] r1 = new int[r0]
            r1 = {x06a0: FILL_ARRAY_DATA , data: [2, 1, 1, 3, 3, 1} // fill-array
            r51 = r1
            int[] r1 = new int[r0]
            r1 = {x06b0: FILL_ARRAY_DATA , data: [2, 3, 1, 1, 3, 1} // fill-array
            r52 = r1
            int[] r1 = new int[r0]
            r1 = {x06c0: FILL_ARRAY_DATA , data: [2, 1, 3, 1, 1, 3} // fill-array
            r53 = r1
            int[] r1 = new int[r0]
            r1 = {x06d0: FILL_ARRAY_DATA , data: [2, 1, 3, 3, 1, 1} // fill-array
            r54 = r1
            int[] r1 = new int[r0]
            r1 = {x06e0: FILL_ARRAY_DATA , data: [2, 1, 3, 1, 3, 1} // fill-array
            r55 = r1
            int[] r1 = new int[r0]
            r1 = {x06f0: FILL_ARRAY_DATA , data: [3, 1, 1, 1, 2, 3} // fill-array
            r56 = r1
            int[] r1 = new int[r0]
            r1 = {x0700: FILL_ARRAY_DATA , data: [3, 1, 1, 3, 2, 1} // fill-array
            r57 = r1
            int[] r1 = new int[r0]
            r1 = {x0710: FILL_ARRAY_DATA , data: [3, 3, 1, 1, 2, 1} // fill-array
            r58 = r1
            int[] r1 = new int[r0]
            r1 = {x0720: FILL_ARRAY_DATA , data: [3, 1, 2, 1, 1, 3} // fill-array
            r59 = r1
            int[] r1 = new int[r0]
            r1 = {x0730: FILL_ARRAY_DATA , data: [3, 1, 2, 3, 1, 1} // fill-array
            r60 = r1
            int[] r1 = new int[r0]
            r1 = {x0740: FILL_ARRAY_DATA , data: [3, 3, 2, 1, 1, 1} // fill-array
            r61 = r1
            int[] r1 = new int[r0]
            r1 = {x0750: FILL_ARRAY_DATA , data: [3, 1, 4, 1, 1, 1} // fill-array
            r62 = r1
            int[] r1 = new int[r0]
            r1 = {x0760: FILL_ARRAY_DATA , data: [2, 2, 1, 4, 1, 1} // fill-array
            r63 = r1
            int[] r1 = new int[r0]
            r1 = {x0770: FILL_ARRAY_DATA , data: [4, 3, 1, 1, 1, 1} // fill-array
            r64 = r1
            int[] r1 = new int[r0]
            r1 = {x0780: FILL_ARRAY_DATA , data: [1, 1, 1, 2, 2, 4} // fill-array
            r65 = r1
            int[] r1 = new int[r0]
            r1 = {x0790: FILL_ARRAY_DATA , data: [1, 1, 1, 4, 2, 2} // fill-array
            r66 = r1
            int[] r1 = new int[r0]
            r1 = {x07a0: FILL_ARRAY_DATA , data: [1, 2, 1, 1, 2, 4} // fill-array
            r67 = r1
            int[] r1 = new int[r0]
            r1 = {x07b0: FILL_ARRAY_DATA , data: [1, 2, 1, 4, 2, 1} // fill-array
            r68 = r1
            int[] r1 = new int[r0]
            r1 = {x07c0: FILL_ARRAY_DATA , data: [1, 4, 1, 1, 2, 2} // fill-array
            r69 = r1
            int[] r1 = new int[r0]
            r1 = {x07d0: FILL_ARRAY_DATA , data: [1, 4, 1, 2, 2, 1} // fill-array
            r70 = r1
            int[] r1 = new int[r0]
            r1 = {x07e0: FILL_ARRAY_DATA , data: [1, 1, 2, 2, 1, 4} // fill-array
            r71 = r1
            int[] r1 = new int[r0]
            r1 = {x07f0: FILL_ARRAY_DATA , data: [1, 1, 2, 4, 1, 2} // fill-array
            r72 = r1
            int[] r1 = new int[r0]
            r1 = {x0800: FILL_ARRAY_DATA , data: [1, 2, 2, 1, 1, 4} // fill-array
            r73 = r1
            int[] r1 = new int[r0]
            r1 = {x0810: FILL_ARRAY_DATA , data: [1, 2, 2, 4, 1, 1} // fill-array
            r74 = r1
            int[] r1 = new int[r0]
            r1 = {x0820: FILL_ARRAY_DATA , data: [1, 4, 2, 1, 1, 2} // fill-array
            r75 = r1
            int[] r1 = new int[r0]
            r1 = {x0830: FILL_ARRAY_DATA , data: [1, 4, 2, 2, 1, 1} // fill-array
            r76 = r1
            int[] r1 = new int[r0]
            r1 = {x0840: FILL_ARRAY_DATA , data: [2, 4, 1, 2, 1, 1} // fill-array
            r77 = r1
            int[] r1 = new int[r0]
            r1 = {x0850: FILL_ARRAY_DATA , data: [2, 2, 1, 1, 1, 4} // fill-array
            r78 = r1
            int[] r1 = new int[r0]
            r1 = {x0860: FILL_ARRAY_DATA , data: [4, 1, 3, 1, 1, 1} // fill-array
            r79 = r1
            int[] r1 = new int[r0]
            r1 = {x0870: FILL_ARRAY_DATA , data: [2, 4, 1, 1, 1, 2} // fill-array
            r80 = r1
            int[] r1 = new int[r0]
            r1 = {x0880: FILL_ARRAY_DATA , data: [1, 3, 4, 1, 1, 1} // fill-array
            r81 = r1
            int[] r1 = new int[r0]
            r1 = {x0890: FILL_ARRAY_DATA , data: [1, 1, 1, 2, 4, 2} // fill-array
            r82 = r1
            int[] r1 = new int[r0]
            r1 = {x08a0: FILL_ARRAY_DATA , data: [1, 2, 1, 1, 4, 2} // fill-array
            r83 = r1
            int[] r1 = new int[r0]
            r1 = {x08b0: FILL_ARRAY_DATA , data: [1, 2, 1, 2, 4, 1} // fill-array
            r84 = r1
            int[] r1 = new int[r0]
            r1 = {x08c0: FILL_ARRAY_DATA , data: [1, 1, 4, 2, 1, 2} // fill-array
            r85 = r1
            int[] r1 = new int[r0]
            r1 = {x08d0: FILL_ARRAY_DATA , data: [1, 2, 4, 1, 1, 2} // fill-array
            r86 = r1
            int[] r1 = new int[r0]
            r1 = {x08e0: FILL_ARRAY_DATA , data: [1, 2, 4, 2, 1, 1} // fill-array
            r87 = r1
            int[] r1 = new int[r0]
            r1 = {x08f0: FILL_ARRAY_DATA , data: [4, 1, 1, 2, 1, 2} // fill-array
            r88 = r1
            int[] r1 = new int[r0]
            r1 = {x0900: FILL_ARRAY_DATA , data: [4, 2, 1, 1, 1, 2} // fill-array
            r89 = r1
            int[] r1 = new int[r0]
            r1 = {x0910: FILL_ARRAY_DATA , data: [4, 2, 1, 2, 1, 1} // fill-array
            r90 = r1
            int[] r1 = new int[r0]
            r1 = {x0920: FILL_ARRAY_DATA , data: [2, 1, 2, 1, 4, 1} // fill-array
            r91 = r1
            int[] r1 = new int[r0]
            r1 = {x0930: FILL_ARRAY_DATA , data: [2, 1, 4, 1, 2, 1} // fill-array
            r92 = r1
            int[] r1 = new int[r0]
            r1 = {x0940: FILL_ARRAY_DATA , data: [4, 1, 2, 1, 2, 1} // fill-array
            r93 = r1
            int[] r1 = new int[r0]
            r1 = {x0950: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 4, 3} // fill-array
            r94 = r1
            int[] r1 = new int[r0]
            r1 = {x0960: FILL_ARRAY_DATA , data: [1, 1, 1, 3, 4, 1} // fill-array
            r95 = r1
            int[] r1 = new int[r0]
            r1 = {x0970: FILL_ARRAY_DATA , data: [1, 3, 1, 1, 4, 1} // fill-array
            r96 = r1
            int[] r1 = new int[r0]
            r1 = {x0980: FILL_ARRAY_DATA , data: [1, 1, 4, 1, 1, 3} // fill-array
            r97 = r1
            int[] r1 = new int[r0]
            r1 = {x0990: FILL_ARRAY_DATA , data: [1, 1, 4, 3, 1, 1} // fill-array
            r98 = r1
            int[] r1 = new int[r0]
            r1 = {x09a0: FILL_ARRAY_DATA , data: [4, 1, 1, 1, 1, 3} // fill-array
            r99 = r1
            int[] r1 = new int[r0]
            r1 = {x09b0: FILL_ARRAY_DATA , data: [4, 1, 1, 3, 1, 1} // fill-array
            r100 = r1
            int[] r1 = new int[r0]
            r1 = {x09c0: FILL_ARRAY_DATA , data: [1, 1, 3, 1, 4, 1} // fill-array
            r101 = r1
            int[] r1 = new int[r0]
            r1 = {x09d0: FILL_ARRAY_DATA , data: [1, 1, 4, 1, 3, 1} // fill-array
            r102 = r1
            int[] r1 = new int[r0]
            r1 = {x09e0: FILL_ARRAY_DATA , data: [3, 1, 1, 1, 4, 1} // fill-array
            r103 = r1
            int[] r1 = new int[r0]
            r1 = {x09f0: FILL_ARRAY_DATA , data: [4, 1, 1, 1, 3, 1} // fill-array
            r104 = r1
            int[] r1 = new int[r0]
            r1 = {x0a00: FILL_ARRAY_DATA , data: [2, 1, 1, 4, 1, 2} // fill-array
            r105 = r1
            int[] r1 = new int[r0]
            r1 = {x0a10: FILL_ARRAY_DATA , data: [2, 1, 1, 2, 1, 4} // fill-array
            int[] r0 = new int[r0]
            r0 = {x0a20: FILL_ARRAY_DATA , data: [2, 1, 1, 2, 3, 2} // fill-array
            r106 = r0
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x0a30: FILL_ARRAY_DATA , data: [2, 3, 3, 1, 1, 1, 2} // fill-array
            r107 = r105
            r105 = r1
            r1 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r35
            r35 = r36
            r36 = r37
            r37 = r38
            r38 = r39
            r39 = r40
            r40 = r41
            r41 = r42
            r42 = r43
            r43 = r44
            r44 = r45
            r45 = r46
            r46 = r47
            r47 = r48
            r48 = r49
            r49 = r50
            r50 = r51
            r51 = r52
            r52 = r53
            r53 = r54
            r54 = r55
            r55 = r56
            r56 = r57
            r57 = r58
            r58 = r59
            r59 = r60
            r60 = r61
            r61 = r62
            r62 = r63
            r63 = r64
            r64 = r65
            r65 = r66
            r66 = r67
            r67 = r68
            r68 = r69
            r69 = r70
            r70 = r71
            r71 = r72
            r72 = r73
            r73 = r74
            r74 = r75
            r75 = r76
            r76 = r77
            r77 = r78
            r78 = r79
            r79 = r80
            r80 = r81
            r81 = r82
            r82 = r83
            r83 = r84
            r84 = r85
            r85 = r86
            r86 = r87
            r87 = r88
            r88 = r89
            r89 = r90
            r90 = r91
            r91 = r92
            r92 = r93
            r93 = r94
            r94 = r95
            r95 = r96
            r96 = r97
            r97 = r98
            r98 = r99
            r99 = r100
            r100 = r101
            r101 = r102
            r102 = r103
            r103 = r104
            r104 = r107
            r107 = r0
            int[][] r0 = new int[][]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107}
            com.google.zxing.oned.Code128Reader.CODE_PATTERNS = r0
            return
    }

    public Code128Reader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int decodeCode(com.google.zxing.common.BitArray r3, int[] r4, int r5) throws com.google.zxing.NotFoundException {
            com.google.zxing.oned.OneDReader.recordPattern(r3, r5, r4)
            r3 = 1048576000(0x3e800000, float:0.25)
            r5 = -1
            r0 = 0
        L7:
            int[][] r1 = com.google.zxing.oned.Code128Reader.CODE_PATTERNS
            int r2 = r1.length
            if (r0 >= r2) goto L1e
            r1 = r1[r0]
            r2 = 1060320051(0x3f333333, float:0.7)
            float r1 = com.google.zxing.oned.OneDReader.patternMatchVariance(r4, r1, r2)
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 >= 0) goto L1b
            r5 = r0
            r3 = r1
        L1b:
            int r0 = r0 + 1
            goto L7
        L1e:
            if (r5 < 0) goto L21
            return r5
        L21:
            com.google.zxing.NotFoundException r3 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r3
    }

    private static int[] findStartPattern(com.google.zxing.common.BitArray r13) throws com.google.zxing.NotFoundException {
            int r0 = r13.getSize()
            r1 = 0
            int r2 = r13.getNextSet(r1)
            r3 = 6
            int[] r3 = new int[r3]
            r5 = r1
            r6 = r5
            r4 = r2
        Lf:
            if (r2 >= r0) goto L70
            boolean r7 = r13.get(r2)
            r8 = 1
            if (r7 == r5) goto L1e
            r7 = r3[r6]
            int r7 = r7 + r8
            r3[r6] = r7
            goto L6d
        L1e:
            r7 = 5
            if (r6 != r7) goto L67
            r7 = -1
            r9 = 1048576000(0x3e800000, float:0.25)
            r10 = 103(0x67, float:1.44E-43)
        L26:
            r11 = 105(0x69, float:1.47E-43)
            if (r10 > r11) goto L3e
            int[][] r11 = com.google.zxing.oned.Code128Reader.CODE_PATTERNS
            r11 = r11[r10]
            r12 = 1060320051(0x3f333333, float:0.7)
            float r11 = com.google.zxing.oned.OneDReader.patternMatchVariance(r3, r11, r12)
            int r12 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r12 >= 0) goto L3b
            r7 = r10
            r9 = r11
        L3b:
            int r10 = r10 + 1
            goto L26
        L3e:
            r9 = 2
            if (r7 < 0) goto L55
            int r10 = r2 - r4
            int r10 = r10 / r9
            int r10 = r4 - r10
            int r10 = java.lang.Math.max(r1, r10)
            boolean r10 = r13.isRange(r10, r4, r1)
            if (r10 == 0) goto L55
            int[] r13 = new int[]{r4, r2, r7}
            return r13
        L55:
            r7 = r3[r1]
            r10 = r3[r8]
            int r7 = r7 + r10
            int r4 = r4 + r7
            int r7 = r6 + (-1)
            java.lang.System.arraycopy(r3, r9, r3, r1, r7)
            r3[r7] = r1
            r3[r6] = r1
            int r6 = r6 + (-1)
            goto L69
        L67:
            int r6 = r6 + 1
        L69:
            r3[r6] = r8
            r5 = r5 ^ 1
        L6d:
            int r2 = r2 + 1
            goto Lf
        L70:
            com.google.zxing.NotFoundException r13 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r13
    }

    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int r27, com.google.zxing.common.BitArray r28, java.util.Map<com.google.zxing.DecodeHintType, ?> r29) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
            r26 = this;
            r0 = r28
            r1 = r29
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            com.google.zxing.DecodeHintType r4 = com.google.zxing.DecodeHintType.ASSUME_GS1
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L12
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            int[] r4 = findStartPattern(r0)
            r5 = 2
            r6 = r4[r5]
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            byte r9 = (byte) r6
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r7.add(r9)
            switch(r6) {
                case 103: goto L37;
                case 104: goto L34;
                case 105: goto L31;
                default: goto L2c;
            }
        L2c:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        L31:
            r12 = 99
            goto L39
        L34:
            r12 = 100
            goto L39
        L37:
            r12 = 101(0x65, float:1.42E-43)
        L39:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r8)
            r8 = r4[r3]
            r14 = r4[r2]
            r15 = 6
            r16 = r2
            int[] r2 = new int[r15]
            r29 = r12
            r12 = r8
            r8 = r14
            r14 = r29
            r9 = r3
            r17 = r9
            r18 = r17
            r19 = r18
            r20 = r19
            r29 = r5
            r21 = r16
            r5 = r20
        L5c:
            if (r17 != 0) goto L194
            int r5 = decodeCode(r0, r2, r8)
            byte r12 = (byte) r5
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)
            r7.add(r12)
            r12 = 106(0x6a, float:1.49E-43)
            if (r5 == r12) goto L70
            r21 = r16
        L70:
            if (r5 == r12) goto L78
            int r20 = r20 + 1
            int r23 = r20 * r5
            int r6 = r6 + r23
        L78:
            r24 = r8
            r10 = 0
        L7b:
            if (r10 >= r15) goto L84
            r25 = r2[r10]
            int r24 = r24 + r25
            int r10 = r10 + 1
            goto L7b
        L84:
            switch(r5) {
                case 103: goto L18f;
                case 104: goto L18f;
                case 105: goto L18f;
                default: goto L87;
            }
        L87:
            r10 = 96
            java.lang.String r11 = "]C1"
            switch(r14) {
                case 99: goto L141;
                case 100: goto Lfc;
                case 101: goto L8f;
                default: goto L8e;
            }
        L8e:
            goto La3
        L8f:
            r15 = 64
            if (r5 >= r15) goto La8
            if (r9 != r3) goto L9c
            int r9 = r5 + 32
            char r9 = (char) r9
            r13.append(r9)
            goto La2
        L9c:
            int r9 = r5 + 160
            char r9 = (char) r9
            r13.append(r9)
        La2:
            r9 = 0
        La3:
            r10 = 100
        La5:
            r11 = 0
            goto L179
        La8:
            if (r5 >= r10) goto Lba
            if (r9 != r3) goto Lb3
            int r9 = r5 + (-64)
            char r9 = (char) r9
            r13.append(r9)
            goto La2
        Lb3:
            int r9 = r5 + 64
            char r9 = (char) r9
            r13.append(r9)
            goto La2
        Lba:
            if (r5 == r12) goto Lbe
            r21 = 0
        Lbe:
            if (r5 == r12) goto Lf9
            switch(r5) {
                case 96: goto La3;
                case 97: goto La3;
                case 98: goto Lf4;
                case 99: goto Led;
                case 100: goto Le6;
                case 101: goto Ld6;
                case 102: goto Lc4;
                default: goto Lc3;
            }
        Lc3:
            goto La3
        Lc4:
            if (r1 == 0) goto La3
            int r10 = r13.length()
            if (r10 != 0) goto Ld0
            r13.append(r11)
            goto La3
        Ld0:
            r10 = 29
            r13.append(r10)
            goto La3
        Ld6:
            if (r3 != 0) goto Ldd
            if (r9 == 0) goto Ldd
        Lda:
            r3 = r16
            goto La2
        Ldd:
            if (r3 == 0) goto Le3
            if (r9 == 0) goto Le3
        Le1:
            r3 = 0
            goto La2
        Le3:
            r9 = r16
            goto La3
        Le6:
            r10 = 100
            r11 = 0
        Le9:
            r14 = 100
            goto L179
        Led:
            r10 = 100
            r11 = 0
            r14 = 99
            goto L179
        Lf4:
            r11 = r16
            r10 = 100
            goto Le9
        Lf9:
            r17 = r16
            goto La3
        Lfc:
            if (r5 >= r10) goto L10e
            if (r9 != r3) goto L107
            int r9 = r5 + 32
            char r9 = (char) r9
            r13.append(r9)
            goto La2
        L107:
            int r9 = r5 + 160
            char r9 = (char) r9
            r13.append(r9)
            goto La2
        L10e:
            if (r5 == r12) goto L112
            r21 = 0
        L112:
            if (r5 == r12) goto Lf9
            switch(r5) {
                case 96: goto La3;
                case 97: goto La3;
                case 98: goto L13c;
                case 99: goto Led;
                case 100: goto L132;
                case 101: goto L12c;
                case 102: goto L118;
                default: goto L117;
            }
        L117:
            goto La3
        L118:
            if (r1 == 0) goto La3
            int r10 = r13.length()
            if (r10 != 0) goto L125
            r13.append(r11)
            goto La3
        L125:
            r10 = 29
            r13.append(r10)
            goto La3
        L12c:
            r10 = 100
        L12e:
            r11 = 0
        L12f:
            r14 = 101(0x65, float:1.42E-43)
            goto L179
        L132:
            if (r3 != 0) goto L137
            if (r9 == 0) goto L137
            goto Lda
        L137:
            if (r3 == 0) goto Le3
            if (r9 == 0) goto Le3
            goto Le1
        L13c:
            r11 = r16
            r10 = 100
            goto L12f
        L141:
            r10 = 100
            if (r5 >= r10) goto L153
            r11 = 10
            if (r5 >= r11) goto L14e
            r11 = 48
            r13.append(r11)
        L14e:
            r13.append(r5)
            goto La5
        L153:
            if (r5 == r12) goto L157
            r21 = 0
        L157:
            if (r5 == r12) goto L175
            switch(r5) {
                case 100: goto L172;
                case 101: goto L12e;
                case 102: goto L15e;
                default: goto L15c;
            }
        L15c:
            goto La5
        L15e:
            if (r1 == 0) goto La5
            int r12 = r13.length()
            if (r12 != 0) goto L16b
            r13.append(r11)
            goto La5
        L16b:
            r11 = 29
            r13.append(r11)
            goto La5
        L172:
            r14 = r10
            goto La5
        L175:
            r17 = r16
            goto La5
        L179:
            r12 = 101(0x65, float:1.42E-43)
            if (r18 == 0) goto L182
            if (r14 != r12) goto L181
            r14 = r10
            goto L182
        L181:
            r14 = r12
        L182:
            r12 = r19
            r19 = r5
            r5 = r12
            r12 = r8
            r18 = r11
            r8 = r24
            r15 = 6
            goto L5c
        L18f:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        L194:
            int r1 = r8 - r12
            int r2 = r0.getNextUnset(r8)
            int r3 = r0.getSize()
            int r8 = r2 - r12
            int r8 = r8 / 2
            int r8 = r8 + r2
            int r3 = java.lang.Math.min(r3, r8)
            r8 = 0
            boolean r0 = r0.isRange(r2, r3, r8)
            if (r0 == 0) goto L21e
            int r20 = r20 * r5
            int r6 = r6 - r20
            int r6 = r6 % 103
            if (r6 != r5) goto L219
            int r0 = r13.length()
            if (r0 == 0) goto L214
            if (r0 <= 0) goto L1cf
            if (r21 == 0) goto L1cf
            r2 = 99
            if (r14 != r2) goto L1ca
            int r2 = r0 + (-2)
            r13.delete(r2, r0)
            goto L1cf
        L1ca:
            int r2 = r0 + (-1)
            r13.delete(r2, r0)
        L1cf:
            r0 = r4[r16]
            r22 = 0
            r2 = r4[r22]
            int r0 = r0 + r2
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = (float) r12
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r3 + r1
            int r1 = r7.size()
            byte[] r2 = new byte[r1]
            r4 = r22
        L1e6:
            if (r4 >= r1) goto L1f7
            java.lang.Object r5 = r7.get(r4)
            java.lang.Byte r5 = (java.lang.Byte) r5
            byte r5 = r5.byteValue()
            r2[r4] = r5
            int r4 = r4 + 1
            goto L1e6
        L1f7:
            com.google.zxing.Result r1 = new com.google.zxing.Result
            java.lang.String r4 = r13.toString()
            com.google.zxing.ResultPoint r5 = new com.google.zxing.ResultPoint
            r6 = r27
            float r6 = (float) r6
            r5.<init>(r0, r6)
            com.google.zxing.ResultPoint r0 = new com.google.zxing.ResultPoint
            r0.<init>(r3, r6)
            com.google.zxing.ResultPoint[] r0 = new com.google.zxing.ResultPoint[]{r5, r0}
            com.google.zxing.BarcodeFormat r3 = com.google.zxing.BarcodeFormat.CODE_128
            r1.<init>(r4, r2, r0, r3)
            return r1
        L214:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r0
        L219:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.getChecksumInstance()
            throw r0
        L21e:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r0
    }
}
