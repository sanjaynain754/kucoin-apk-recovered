package androidx.media3.extractor.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Cea708Decoder extends CeaDecoder {
    private static final int CC_VALID_FLAG = 4;
    private static final int CHARACTER_BIG_CARONS = 42;
    private static final int CHARACTER_BIG_OE = 44;
    private static final int CHARACTER_BOLD_BULLET = 53;
    private static final int CHARACTER_CLOSE_DOUBLE_QUOTE = 52;
    private static final int CHARACTER_CLOSE_SINGLE_QUOTE = 50;
    private static final int CHARACTER_DIAERESIS_Y = 63;
    private static final int CHARACTER_ELLIPSIS = 37;
    private static final int CHARACTER_FIVE_EIGHTHS = 120;
    private static final int CHARACTER_HORIZONTAL_BORDER = 125;
    private static final int CHARACTER_LOWER_LEFT_BORDER = 124;
    private static final int CHARACTER_LOWER_RIGHT_BORDER = 126;
    private static final int CHARACTER_MN = 127;
    private static final int CHARACTER_NBTSP = 33;
    private static final int CHARACTER_ONE_EIGHTH = 118;
    private static final int CHARACTER_OPEN_DOUBLE_QUOTE = 51;
    private static final int CHARACTER_OPEN_SINGLE_QUOTE = 49;
    private static final int CHARACTER_SEVEN_EIGHTHS = 121;
    private static final int CHARACTER_SM = 61;
    private static final int CHARACTER_SMALL_CARONS = 58;
    private static final int CHARACTER_SMALL_OE = 60;
    private static final int CHARACTER_SOLID_BLOCK = 48;
    private static final int CHARACTER_THREE_EIGHTHS = 119;
    private static final int CHARACTER_TM = 57;
    private static final int CHARACTER_TSP = 32;
    private static final int CHARACTER_UPPER_LEFT_BORDER = 127;
    private static final int CHARACTER_UPPER_RIGHT_BORDER = 123;
    private static final int CHARACTER_VERTICAL_BORDER = 122;
    private static final int COMMAND_BS = 8;
    private static final int COMMAND_CLW = 136;
    private static final int COMMAND_CR = 13;
    private static final int COMMAND_CW0 = 128;
    private static final int COMMAND_CW1 = 129;
    private static final int COMMAND_CW2 = 130;
    private static final int COMMAND_CW3 = 131;
    private static final int COMMAND_CW4 = 132;
    private static final int COMMAND_CW5 = 133;
    private static final int COMMAND_CW6 = 134;
    private static final int COMMAND_CW7 = 135;
    private static final int COMMAND_DF0 = 152;
    private static final int COMMAND_DF1 = 153;
    private static final int COMMAND_DF2 = 154;
    private static final int COMMAND_DF3 = 155;
    private static final int COMMAND_DF4 = 156;
    private static final int COMMAND_DF5 = 157;
    private static final int COMMAND_DF6 = 158;
    private static final int COMMAND_DF7 = 159;
    private static final int COMMAND_DLC = 142;
    private static final int COMMAND_DLW = 140;
    private static final int COMMAND_DLY = 141;
    private static final int COMMAND_DSW = 137;
    private static final int COMMAND_ETX = 3;
    private static final int COMMAND_EXT1 = 16;
    private static final int COMMAND_EXT1_END = 23;
    private static final int COMMAND_EXT1_START = 17;
    private static final int COMMAND_FF = 12;
    private static final int COMMAND_HCR = 14;
    private static final int COMMAND_HDW = 138;
    private static final int COMMAND_NUL = 0;
    private static final int COMMAND_P16_END = 31;
    private static final int COMMAND_P16_START = 24;
    private static final int COMMAND_RST = 143;
    private static final int COMMAND_SPA = 144;
    private static final int COMMAND_SPC = 145;
    private static final int COMMAND_SPL = 146;
    private static final int COMMAND_SWA = 151;
    private static final int COMMAND_TGW = 139;
    private static final int DTVCC_PACKET_DATA = 2;
    private static final int DTVCC_PACKET_START = 3;
    private static final int GROUP_C0_END = 31;
    private static final int GROUP_C1_END = 159;
    private static final int GROUP_C2_END = 31;
    private static final int GROUP_C3_END = 159;
    private static final int GROUP_G0_END = 127;
    private static final int GROUP_G1_END = 255;
    private static final int GROUP_G2_END = 127;
    private static final int GROUP_G3_END = 255;
    private static final int NUM_WINDOWS = 8;
    private static final String TAG = "Cea708Decoder";
    private final CueInfoBuilder[] cueInfoBuilders;

    @Nullable
    private List<Cue> cues;
    private CueInfoBuilder currentCueInfoBuilder;

    @Nullable
    private DtvCcPacket currentDtvCcPacket;
    private int currentWindow;
    private final boolean isWideAspectRatio;

    @Nullable
    private List<Cue> lastCues;
    private final int selectedServiceNumber;
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ParsableBitArray captionChannelPacketData = new ParsableBitArray();
    private int previousSequenceNumber = -1;

    public static final class Cea708CueInfo {
        private static final Comparator<Cea708CueInfo> LEAST_IMPORTANT_FIRST = new Comparator() { // from class: androidx.media3.extractor.text.cea.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((Cea708Decoder.Cea708CueInfo) obj2).priority, ((Cea708Decoder.Cea708CueInfo) obj).priority);
            }
        };
        public final Cue cue;
        public final int priority;

        public Cea708CueInfo(CharSequence charSequence, Layout.Alignment alignment, float f11, int i11, int i12, float f12, int i13, float f13, boolean z11, int i14, int i15) {
            Cue.Builder size = new Cue.Builder().setText(charSequence).setTextAlignment(alignment).setLine(f11, i11).setLineAnchor(i12).setPosition(f12).setPositionAnchor(i13).setSize(f13);
            if (z11) {
                size.setWindowColor(i14);
            }
            this.cue = size.build();
            this.priority = i15;
        }
    }

    public static final class CueInfoBuilder {
        private static final int BORDER_AND_EDGE_TYPE_NONE = 0;
        private static final int BORDER_AND_EDGE_TYPE_UNIFORM = 3;
        public static final int COLOR_SOLID_BLACK;
        public static final int COLOR_SOLID_WHITE = getArgbColorFromCeaColor(2, 2, 2, 0);
        public static final int COLOR_TRANSPARENT;
        private static final int DEFAULT_PRIORITY = 4;
        private static final int DIRECTION_BOTTOM_TO_TOP = 3;
        private static final int DIRECTION_LEFT_TO_RIGHT = 0;
        private static final int DIRECTION_RIGHT_TO_LEFT = 1;
        private static final int DIRECTION_TOP_TO_BOTTOM = 2;
        private static final int HORIZONTAL_SIZE = 209;
        private static final int JUSTIFICATION_CENTER = 2;
        private static final int JUSTIFICATION_FULL = 3;
        private static final int JUSTIFICATION_LEFT = 0;
        private static final int JUSTIFICATION_RIGHT = 1;
        private static final int MAXIMUM_ROW_COUNT = 15;
        private static final int PEN_FONT_STYLE_DEFAULT = 0;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITHOUT_SERIFS = 3;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITH_SERIFS = 1;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITHOUT_SERIFS = 4;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITH_SERIFS = 2;
        private static final int PEN_OFFSET_NORMAL = 1;
        private static final int PEN_SIZE_STANDARD = 1;
        private static final int[] PEN_STYLE_BACKGROUND;
        private static final int[] PEN_STYLE_EDGE_TYPE;
        private static final int[] PEN_STYLE_FONT_STYLE;
        private static final int RELATIVE_CUE_SIZE = 99;
        private static final int VERTICAL_SIZE = 74;
        private static final int[] WINDOW_STYLE_FILL;
        private static final int[] WINDOW_STYLE_JUSTIFICATION;
        private static final int[] WINDOW_STYLE_PRINT_DIRECTION;
        private static final int[] WINDOW_STYLE_SCROLL_DIRECTION;
        private static final boolean[] WINDOW_STYLE_WORD_WRAP;
        private int anchorId;
        private int backgroundColor;
        private int backgroundColorStartPosition;
        private boolean defined;
        private int foregroundColor;
        private int foregroundColorStartPosition;
        private int horizontalAnchor;
        private int italicsStartPosition;
        private int justification;
        private int penStyleId;
        private int priority;
        private boolean relativePositioning;
        private int row;
        private int rowCount;
        private int underlineStartPosition;
        private int verticalAnchor;
        private boolean visible;
        private int windowFillColor;
        private int windowStyleId;
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            COLOR_SOLID_BLACK = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            COLOR_TRANSPARENT = argbColorFromCeaColor2;
            WINDOW_STYLE_JUSTIFICATION = new int[]{0, 0, 0, 0, 0, 2, 0};
            WINDOW_STYLE_PRINT_DIRECTION = new int[]{0, 0, 0, 0, 0, 0, 2};
            WINDOW_STYLE_SCROLL_DIRECTION = new int[]{3, 3, 3, 3, 3, 3, 1};
            WINDOW_STYLE_WORD_WRAP = new boolean[]{false, false, false, true, true, true, false};
            WINDOW_STYLE_FILL = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            PEN_STYLE_FONT_STYLE = new int[]{0, 1, 2, 3, 4, 3, 4};
            PEN_STYLE_EDGE_TYPE = new int[]{0, 0, 0, 0, 0, 3, 3};
            PEN_STYLE_BACKGROUND = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public static int getArgbColorFromCeaColor(int i11, int i12, int i13) {
            return getArgbColorFromCeaColor(i11, i12, i13, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int getArgbColorFromCeaColor(int i11, int i12, int i13, int i14) {
            int i15;
            Assertions.checkIndex(i11, 0, 4);
            Assertions.checkIndex(i12, 0, 4);
            Assertions.checkIndex(i13, 0, 4);
            Assertions.checkIndex(i14, 0, 4);
            if (i14 == 0 || i14 == 1) {
                i15 = 255;
            } else if (i14 == 2) {
                i15 = 127;
            } else if (i14 != 3) {
                i15 = 255;
            } else {
                i15 = 0;
            }
            return Color.argb(i15, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0, i13 > 1 ? 255 : 0);
        }

        public void append(char c11) {
            if (c11 != '\n') {
                this.captionStringBuilder.append(c11);
                return;
            }
            this.rolledUpCaptions.add(buildSpannableString());
            this.captionStringBuilder.clear();
            if (this.italicsStartPosition != -1) {
                this.italicsStartPosition = 0;
            }
            if (this.underlineStartPosition != -1) {
                this.underlineStartPosition = 0;
            }
            if (this.foregroundColorStartPosition != -1) {
                this.foregroundColorStartPosition = 0;
            }
            if (this.backgroundColorStartPosition != -1) {
                this.backgroundColorStartPosition = 0;
            }
            while (true) {
                if (this.rolledUpCaptions.size() < this.rowCount && this.rolledUpCaptions.size() < 15) {
                    this.row = this.rolledUpCaptions.size();
                    return;
                }
                this.rolledUpCaptions.remove(0);
            }
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
            }
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.italicsStartPosition != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, length, 33);
                }
                if (this.underlineStartPosition != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, length, 33);
                }
                if (this.foregroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, length, 33);
                }
                if (this.backgroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void clear() {
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.clear();
            this.italicsStartPosition = -1;
            this.underlineStartPosition = -1;
            this.foregroundColorStartPosition = -1;
            this.backgroundColorStartPosition = -1;
            this.row = 0;
        }

        public void defineWindow(boolean z11, int i11, boolean z12, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.defined = true;
            this.visible = z11;
            this.priority = i11;
            this.relativePositioning = z12;
            this.verticalAnchor = i12;
            this.horizontalAnchor = i13;
            this.anchorId = i15;
            int i18 = i14 + 1;
            if (this.rowCount != i18) {
                this.rowCount = i18;
                while (true) {
                    if (this.rolledUpCaptions.size() < this.rowCount && this.rolledUpCaptions.size() < 15) {
                        break;
                    } else {
                        this.rolledUpCaptions.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.windowStyleId != i16) {
                this.windowStyleId = i16;
                int i19 = i16 - 1;
                setWindowAttributes(WINDOW_STYLE_FILL[i19], COLOR_TRANSPARENT, WINDOW_STYLE_WORD_WRAP[i19], 0, WINDOW_STYLE_PRINT_DIRECTION[i19], WINDOW_STYLE_SCROLL_DIRECTION[i19], WINDOW_STYLE_JUSTIFICATION[i19]);
            }
            if (i17 == 0 || this.penStyleId == i17) {
                return;
            }
            this.penStyleId = i17;
            int i21 = i17 - 1;
            setPenAttributes(0, 1, 1, false, false, PEN_STYLE_EDGE_TYPE[i21], PEN_STYLE_FONT_STYLE[i21]);
            setPenColor(COLOR_SOLID_WHITE, PEN_STYLE_BACKGROUND[i21], COLOR_SOLID_BLACK);
        }

        public boolean isDefined() {
            return this.defined;
        }

        public boolean isVisible() {
            return this.visible;
        }

        public void setPenAttributes(int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15) {
            if (this.italicsStartPosition != -1) {
                if (!z11) {
                    this.captionStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, this.captionStringBuilder.length(), 33);
                    this.italicsStartPosition = -1;
                }
            } else if (z11) {
                this.italicsStartPosition = this.captionStringBuilder.length();
            }
            if (this.underlineStartPosition == -1) {
                if (z12) {
                    this.underlineStartPosition = this.captionStringBuilder.length();
                }
            } else {
                if (z12) {
                    return;
                }
                this.captionStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, this.captionStringBuilder.length(), 33);
                this.underlineStartPosition = -1;
            }
        }

        public void setPenColor(int i11, int i12, int i13) {
            if (this.foregroundColorStartPosition != -1 && this.foregroundColor != i11) {
                this.captionStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, this.captionStringBuilder.length(), 33);
            }
            if (i11 != COLOR_SOLID_WHITE) {
                this.foregroundColorStartPosition = this.captionStringBuilder.length();
                this.foregroundColor = i11;
            }
            if (this.backgroundColorStartPosition != -1 && this.backgroundColor != i12) {
                this.captionStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, this.captionStringBuilder.length(), 33);
            }
            if (i12 != COLOR_SOLID_BLACK) {
                this.backgroundColorStartPosition = this.captionStringBuilder.length();
                this.backgroundColor = i12;
            }
        }

        public void setPenLocation(int i11, int i12) {
            if (this.row != i11) {
                append('\n');
            }
            this.row = i11;
        }

        public void setVisibility(boolean z11) {
            this.visible = z11;
        }

        public void setWindowAttributes(int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
            this.windowFillColor = i11;
            this.justification = i16;
        }

        public CueInfoBuilder() {
            reset();
        }

        @Nullable
        public Cea708CueInfo build() {
            Layout.Alignment alignment;
            float f11;
            float f12;
            int i11;
            boolean z11;
            if (isEmpty()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.rolledUpCaptions.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            int i13 = this.justification;
            int i14 = 2;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalArgumentException("Unexpected justification value: " + this.justification);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            if (this.relativePositioning) {
                f11 = this.horizontalAnchor / 99.0f;
                f12 = this.verticalAnchor / 99.0f;
            } else {
                f11 = this.horizontalAnchor / 209.0f;
                f12 = this.verticalAnchor / 74.0f;
            }
            float f13 = (f11 * 0.9f) + 0.05f;
            float f14 = (f12 * 0.9f) + 0.05f;
            int i15 = this.anchorId;
            if (i15 / 3 == 0) {
                i11 = 0;
            } else if (i15 / 3 == 1) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            if (i15 % 3 == 0) {
                i14 = 0;
            } else if (i15 % 3 == 1) {
                i14 = 1;
            }
            if (this.windowFillColor != COLOR_SOLID_BLACK) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new Cea708CueInfo(spannableStringBuilder, alignment, f14, 0, i11, f13, i14, -3.4028235E38f, z11, this.windowFillColor, this.priority);
        }

        public boolean isEmpty() {
            if (isDefined()) {
                if (!this.rolledUpCaptions.isEmpty() || this.captionStringBuilder.length() != 0) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public void reset() {
            clear();
            this.defined = false;
            this.visible = false;
            this.priority = 4;
            this.relativePositioning = false;
            this.verticalAnchor = 0;
            this.horizontalAnchor = 0;
            this.anchorId = 0;
            this.rowCount = 15;
            this.justification = 0;
            this.windowStyleId = 0;
            this.penStyleId = 0;
            int i11 = COLOR_SOLID_BLACK;
            this.windowFillColor = i11;
            this.foregroundColor = COLOR_SOLID_WHITE;
            this.backgroundColor = i11;
        }
    }

    private void handleC2Command(int i11) {
        if (i11 <= 7) {
            return;
        }
        if (i11 <= 15) {
            this.captionChannelPacketData.skipBits(8);
        } else if (i11 <= 23) {
            this.captionChannelPacketData.skipBits(16);
        } else if (i11 <= 31) {
            this.captionChannelPacketData.skipBits(24);
        }
    }

    private void resetCueBuilders() {
        for (int i11 = 0; i11 < 8; i11++) {
            this.cueInfoBuilders[i11].reset();
        }
    }

    public static final class DtvCcPacket {
        int currentIndex = 0;
        public final byte[] packetData;
        public final int packetSize;
        public final int sequenceNumber;

        public DtvCcPacket(int i11, int i12) {
            this.sequenceNumber = i11;
            this.packetSize = i12;
            this.packetData = new byte[(i12 * 2) - 1];
        }
    }

    private void finalizeCurrentPacket() {
        if (this.currentDtvCcPacket == null) {
            return;
        }
        processCurrentPacket();
        this.currentDtvCcPacket = null;
    }

    private List<Cue> getDisplayCues() {
        Cea708CueInfo cea708CueInfoBuild;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 8; i11++) {
            if (!this.cueInfoBuilders[i11].isEmpty() && this.cueInfoBuilders[i11].isVisible() && (cea708CueInfoBuild = this.cueInfoBuilders[i11].build()) != null) {
                arrayList.add(cea708CueInfoBuild);
            }
        }
        Collections.sort(arrayList, Cea708CueInfo.LEAST_IMPORTANT_FIRST);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(((Cea708CueInfo) arrayList.get(i12)).cue);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void handleC0Command(int i11) {
        if (i11 != 0) {
            if (i11 == 3) {
                this.cues = getDisplayCues();
                return;
            }
            if (i11 == 8) {
                this.currentCueInfoBuilder.backspace();
                return;
            }
            switch (i11) {
                case 12:
                    resetCueBuilders();
                    break;
                case 13:
                    this.currentCueInfoBuilder.append('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i11 >= 17 && i11 <= 23) {
                        Log.m2961w(TAG, "Currently unsupported COMMAND_EXT1 Command: " + i11);
                        this.captionChannelPacketData.skipBits(8);
                    } else if (i11 >= 24 && i11 <= 31) {
                        Log.m2961w(TAG, "Currently unsupported COMMAND_P16 Command: " + i11);
                        this.captionChannelPacketData.skipBits(16);
                    } else {
                        Log.m2961w(TAG, "Invalid C0 command: " + i11);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void handleC1Command(int i11) {
        int i12 = 1;
        switch (i11) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i13 = i11 - 128;
                if (this.currentWindow != i13) {
                    this.currentWindow = i13;
                    this.currentCueInfoBuilder = this.cueInfoBuilders[i13];
                }
                break;
            case 136:
                while (i12 <= 8) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i12].clear();
                    }
                    i12++;
                }
                break;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i14].setVisibility(true);
                    }
                }
                break;
            case 138:
                while (i12 <= 8) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i12].setVisibility(false);
                    }
                    i12++;
                }
                break;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.captionChannelPacketData.readBit()) {
                        CueInfoBuilder cueInfoBuilder = this.cueInfoBuilders[8 - i15];
                        cueInfoBuilder.setVisibility(!cueInfoBuilder.isVisible());
                    }
                }
                break;
            case 140:
                while (i12 <= 8) {
                    if (this.captionChannelPacketData.readBit()) {
                        this.cueInfoBuilders[8 - i12].reset();
                    }
                    i12++;
                }
                break;
            case 141:
                this.captionChannelPacketData.skipBits(8);
                break;
            case 142:
                break;
            case 143:
                resetCueBuilders();
                break;
            case 144:
                if (this.currentCueInfoBuilder.isDefined()) {
                    handleSetPenAttributes();
                } else {
                    this.captionChannelPacketData.skipBits(16);
                }
                break;
            case 145:
                if (this.currentCueInfoBuilder.isDefined()) {
                    handleSetPenColor();
                } else {
                    this.captionChannelPacketData.skipBits(24);
                }
                break;
            case 146:
                if (this.currentCueInfoBuilder.isDefined()) {
                    handleSetPenLocation();
                } else {
                    this.captionChannelPacketData.skipBits(16);
                }
                break;
            case 147:
            case BuiltinOperator.RANDOM_UNIFORM /* 148 */:
            case 149:
            case 150:
            default:
                Log.m2961w(TAG, "Invalid C1 command: " + i11);
                break;
            case 151:
                if (this.currentCueInfoBuilder.isDefined()) {
                    handleSetWindowAttributes();
                } else {
                    this.captionChannelPacketData.skipBits(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i16 = i11 - 152;
                handleDefineWindow(i16);
                if (this.currentWindow != i16) {
                    this.currentWindow = i16;
                    this.currentCueInfoBuilder = this.cueInfoBuilders[i16];
                }
                break;
        }
    }

    private void handleC3Command(int i11) {
        if (i11 <= 135) {
            this.captionChannelPacketData.skipBits(32);
            return;
        }
        if (i11 <= 143) {
            this.captionChannelPacketData.skipBits(40);
        } else if (i11 <= 159) {
            this.captionChannelPacketData.skipBits(2);
            this.captionChannelPacketData.skipBits(this.captionChannelPacketData.readBits(6) * 8);
        }
    }

    private void handleDefineWindow(int i11) {
        CueInfoBuilder cueInfoBuilder = this.cueInfoBuilders[i11];
        this.captionChannelPacketData.skipBits(2);
        boolean bit = this.captionChannelPacketData.readBit();
        this.captionChannelPacketData.skipBits(2);
        int bits = this.captionChannelPacketData.readBits(3);
        boolean bit2 = this.captionChannelPacketData.readBit();
        int bits2 = this.captionChannelPacketData.readBits(7);
        int bits3 = this.captionChannelPacketData.readBits(8);
        int bits4 = this.captionChannelPacketData.readBits(4);
        int bits5 = this.captionChannelPacketData.readBits(4);
        this.captionChannelPacketData.skipBits(2);
        this.captionChannelPacketData.skipBits(6);
        this.captionChannelPacketData.skipBits(2);
        cueInfoBuilder.defineWindow(bit, bits, bit2, bits2, bits3, bits5, bits4, this.captionChannelPacketData.readBits(3), this.captionChannelPacketData.readBits(3));
    }

    private void handleG0Character(int i11) {
        if (i11 == 127) {
            this.currentCueInfoBuilder.append((char) 9835);
        } else {
            this.currentCueInfoBuilder.append((char) (i11 & 255));
        }
    }

    private void handleG1Character(int i11) {
        this.currentCueInfoBuilder.append((char) (i11 & 255));
    }

    private void handleG2Character(int i11) {
        if (i11 == 32) {
            this.currentCueInfoBuilder.append(' ');
            return;
        }
        if (i11 == 33) {
            this.currentCueInfoBuilder.append(Typography.nbsp);
            return;
        }
        if (i11 == 37) {
            this.currentCueInfoBuilder.append(Typography.ellipsis);
            return;
        }
        if (i11 == 42) {
            this.currentCueInfoBuilder.append((char) 352);
            return;
        }
        if (i11 == 44) {
            this.currentCueInfoBuilder.append((char) 338);
            return;
        }
        if (i11 == 63) {
            this.currentCueInfoBuilder.append((char) 376);
            return;
        }
        if (i11 == 57) {
            this.currentCueInfoBuilder.append(Typography.tm);
            return;
        }
        if (i11 == 58) {
            this.currentCueInfoBuilder.append((char) 353);
            return;
        }
        if (i11 == 60) {
            this.currentCueInfoBuilder.append((char) 339);
            return;
        }
        if (i11 == 61) {
            this.currentCueInfoBuilder.append((char) 8480);
            return;
        }
        switch (i11) {
            case 48:
                this.currentCueInfoBuilder.append((char) 9608);
                break;
            case 49:
                this.currentCueInfoBuilder.append(Typography.leftSingleQuote);
                break;
            case 50:
                this.currentCueInfoBuilder.append(Typography.rightSingleQuote);
                break;
            case 51:
                this.currentCueInfoBuilder.append(Typography.leftDoubleQuote);
                break;
            case 52:
                this.currentCueInfoBuilder.append(Typography.rightDoubleQuote);
                break;
            case 53:
                this.currentCueInfoBuilder.append(Typography.bullet);
                break;
            default:
                switch (i11) {
                    case 118:
                        this.currentCueInfoBuilder.append((char) 8539);
                        break;
                    case 119:
                        this.currentCueInfoBuilder.append((char) 8540);
                        break;
                    case 120:
                        this.currentCueInfoBuilder.append((char) 8541);
                        break;
                    case 121:
                        this.currentCueInfoBuilder.append((char) 8542);
                        break;
                    case 122:
                        this.currentCueInfoBuilder.append((char) 9474);
                        break;
                    case 123:
                        this.currentCueInfoBuilder.append((char) 9488);
                        break;
                    case 124:
                        this.currentCueInfoBuilder.append((char) 9492);
                        break;
                    case 125:
                        this.currentCueInfoBuilder.append((char) 9472);
                        break;
                    case 126:
                        this.currentCueInfoBuilder.append((char) 9496);
                        break;
                    case 127:
                        this.currentCueInfoBuilder.append((char) 9484);
                        break;
                    default:
                        Log.m2961w(TAG, "Invalid G2 character: " + i11);
                        break;
                }
                break;
        }
    }

    private void handleG3Character(int i11) {
        if (i11 == 160) {
            this.currentCueInfoBuilder.append((char) 13252);
            return;
        }
        Log.m2961w(TAG, "Invalid G3 character: " + i11);
        this.currentCueInfoBuilder.append('_');
    }

    private void handleSetPenAttributes() {
        this.currentCueInfoBuilder.setPenAttributes(this.captionChannelPacketData.readBits(4), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBit(), this.captionChannelPacketData.readBit(), this.captionChannelPacketData.readBits(3), this.captionChannelPacketData.readBits(3));
    }

    private void handleSetPenColor() {
        int argbColorFromCeaColor = CueInfoBuilder.getArgbColorFromCeaColor(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2));
        int argbColorFromCeaColor2 = CueInfoBuilder.getArgbColorFromCeaColor(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2));
        this.captionChannelPacketData.skipBits(2);
        this.currentCueInfoBuilder.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, CueInfoBuilder.getArgbColorFromCeaColor(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2)));
    }

    private void handleSetPenLocation() {
        this.captionChannelPacketData.skipBits(4);
        int bits = this.captionChannelPacketData.readBits(4);
        this.captionChannelPacketData.skipBits(2);
        this.currentCueInfoBuilder.setPenLocation(bits, this.captionChannelPacketData.readBits(6));
    }

    private void handleSetWindowAttributes() {
        int argbColorFromCeaColor = CueInfoBuilder.getArgbColorFromCeaColor(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2));
        int bits = this.captionChannelPacketData.readBits(2);
        int argbColorFromCeaColor2 = CueInfoBuilder.getArgbColorFromCeaColor(this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2), this.captionChannelPacketData.readBits(2));
        if (this.captionChannelPacketData.readBit()) {
            bits |= 4;
        }
        boolean bit = this.captionChannelPacketData.readBit();
        int bits2 = this.captionChannelPacketData.readBits(2);
        int bits3 = this.captionChannelPacketData.readBits(2);
        int bits4 = this.captionChannelPacketData.readBits(2);
        this.captionChannelPacketData.skipBits(8);
        this.currentCueInfoBuilder.setWindowAttributes(argbColorFromCeaColor, argbColorFromCeaColor2, bit, bits, bits2, bits3, bits4);
    }

    private void processCurrentPacket() {
        DtvCcPacket dtvCcPacket = this.currentDtvCcPacket;
        if (dtvCcPacket.currentIndex != (dtvCcPacket.packetSize * 2) - 1) {
            Log.m2955d(TAG, "DtvCcPacket ended prematurely; size is " + ((this.currentDtvCcPacket.packetSize * 2) - 1) + ", but current index is " + this.currentDtvCcPacket.currentIndex + " (sequence number " + this.currentDtvCcPacket.sequenceNumber + ");");
        }
        ParsableBitArray parsableBitArray = this.captionChannelPacketData;
        DtvCcPacket dtvCcPacket2 = this.currentDtvCcPacket;
        parsableBitArray.reset(dtvCcPacket2.packetData, dtvCcPacket2.currentIndex);
        boolean z11 = false;
        while (this.captionChannelPacketData.bitsLeft() > 0) {
            int bits = this.captionChannelPacketData.readBits(3);
            int bits2 = this.captionChannelPacketData.readBits(5);
            if (bits == 7) {
                this.captionChannelPacketData.skipBits(2);
                bits = this.captionChannelPacketData.readBits(6);
                if (bits < 7) {
                    Log.m2961w(TAG, "Invalid extended service number: " + bits);
                }
            }
            if (bits2 == 0) {
                if (bits == 0) {
                    break;
                }
                Log.m2961w(TAG, "serviceNumber is non-zero (" + bits + ") when blockSize is 0");
                break;
            }
            if (bits != this.selectedServiceNumber) {
                this.captionChannelPacketData.skipBytes(bits2);
            } else {
                int position = this.captionChannelPacketData.getPosition() + (bits2 * 8);
                while (this.captionChannelPacketData.getPosition() < position) {
                    int bits3 = this.captionChannelPacketData.readBits(8);
                    if (bits3 == 16) {
                        int bits4 = this.captionChannelPacketData.readBits(8);
                        if (bits4 <= 31) {
                            handleC2Command(bits4);
                        } else {
                            if (bits4 <= 127) {
                                handleG2Character(bits4);
                            } else if (bits4 <= 159) {
                                handleC3Command(bits4);
                            } else if (bits4 <= 255) {
                                handleG3Character(bits4);
                            } else {
                                Log.m2961w(TAG, "Invalid extended command: " + bits4);
                            }
                            z11 = true;
                        }
                    } else if (bits3 <= 31) {
                        handleC0Command(bits3);
                    } else {
                        if (bits3 <= 127) {
                            handleG0Character(bits3);
                        } else if (bits3 <= 159) {
                            handleC1Command(bits3);
                        } else if (bits3 <= 255) {
                            handleG1Character(bits3);
                        } else {
                            Log.m2961w(TAG, "Invalid base command: " + bits3);
                        }
                        z11 = true;
                    }
                }
            }
        }
        if (z11) {
            this.cues = getDisplayCues();
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle((List) Assertions.checkNotNull(list));
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public void decode(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
        this.ccData.reset(byteBuffer.array(), byteBuffer.limit());
        while (this.ccData.bytesLeft() >= 3) {
            int unsignedByte = this.ccData.readUnsignedByte();
            int i11 = unsignedByte & 3;
            boolean z11 = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) this.ccData.readUnsignedByte();
            byte unsignedByte3 = (byte) this.ccData.readUnsignedByte();
            if (i11 == 2 || i11 == 3) {
                if (z11) {
                    if (i11 == 3) {
                        finalizeCurrentPacket();
                        int i12 = (unsignedByte2 & 192) >> 6;
                        int i13 = this.previousSequenceNumber;
                        if (i13 != -1 && i12 != (i13 + 1) % 4) {
                            resetCueBuilders();
                            Log.m2961w(TAG, "Sequence number discontinuity. previous=" + this.previousSequenceNumber + " current=" + i12);
                        }
                        this.previousSequenceNumber = i12;
                        int i14 = unsignedByte2 & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i12, i14);
                        this.currentDtvCcPacket = dtvCcPacket;
                        byte[] bArr = dtvCcPacket.packetData;
                        int i15 = dtvCcPacket.currentIndex;
                        dtvCcPacket.currentIndex = i15 + 1;
                        bArr[i15] = unsignedByte3;
                    } else {
                        Assertions.checkArgument(i11 == 2);
                        DtvCcPacket dtvCcPacket2 = this.currentDtvCcPacket;
                        if (dtvCcPacket2 == null) {
                            Log.m2957e(TAG, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = dtvCcPacket2.packetData;
                            int i16 = dtvCcPacket2.currentIndex;
                            int i17 = i16 + 1;
                            dtvCcPacket2.currentIndex = i17;
                            bArr2[i16] = unsignedByte2;
                            dtvCcPacket2.currentIndex = i16 + 2;
                            bArr2[i17] = unsignedByte3;
                        }
                    }
                    DtvCcPacket dtvCcPacket3 = this.currentDtvCcPacket;
                    if (dtvCcPacket3.currentIndex == (dtvCcPacket3.packetSize * 2) - 1) {
                        finalizeCurrentPacket();
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    public Cea708Decoder(int i11, @Nullable List<byte[]> list) {
        this.selectedServiceNumber = i11 == -1 ? 1 : i11;
        this.isWideAspectRatio = list != null && CodecSpecificDataUtil.parseCea708InitializationData(list);
        this.cueInfoBuilders = new CueInfoBuilder[8];
        for (int i12 = 0; i12 < 8; i12++) {
            this.cueInfoBuilders[i12] = new CueInfoBuilder();
        }
        this.currentCueInfoBuilder = this.cueInfoBuilders[0];
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        this.currentWindow = 0;
        this.currentCueInfoBuilder = this.cueInfoBuilders[0];
        resetCueBuilders();
        this.currentDtvCcPacket = null;
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // androidx.media3.extractor.text.cea.CeaDecoder, androidx.media3.extractor.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j11) {
        super.setPositionUs(j11);
    }
}
