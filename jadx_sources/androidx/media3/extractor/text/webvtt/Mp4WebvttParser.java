package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.C2711C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Mp4WebvttParser implements SubtitleParser {
    private static final int BOX_HEADER_SIZE = 8;
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    private static Cue parseVttCueBox(ParsableByteArray parsableByteArray, int i11) {
        CharSequence cueText = null;
        Cue.Builder cueSettingsList = null;
        while (i11 > 0) {
            Assertions.checkArgument(i11 >= 8, "Incomplete vtt cue box header found.");
            int i12 = parsableByteArray.readInt();
            int i13 = parsableByteArray.readInt();
            int i14 = i12 - 8;
            String strFromUtf8Bytes = Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i14);
            parsableByteArray.skipBytes(i14);
            i11 = (i11 - 8) - i14;
            if (i13 == TYPE_sttg) {
                cueSettingsList = WebvttCueParser.parseCueSettingsList(strFromUtf8Bytes);
            } else if (i13 == TYPE_payl) {
                cueText = WebvttCueParser.parseCueText(null, strFromUtf8Bytes.trim(), Collections.EMPTY_LIST);
            }
        }
        if (cueText == null) {
            cueText = "";
        }
        return cueSettingsList != null ? cueSettingsList.setText(cueText).build() : WebvttCueParser.newCueForText(cueText);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.parsableByteArray.reset(bArr, i12 + i11);
        this.parsableByteArray.setPosition(i11);
        ArrayList arrayList = new ArrayList();
        while (this.parsableByteArray.bytesLeft() > 0) {
            Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int i13 = this.parsableByteArray.readInt();
            if (this.parsableByteArray.readInt() == TYPE_vttc) {
                arrayList.add(parseVttCueBox(this.parsableByteArray, i13 - 8));
            } else {
                this.parsableByteArray.skipBytes(i13 - 8);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, C2711C.TIME_UNSET, C2711C.TIME_UNSET));
    }
}
