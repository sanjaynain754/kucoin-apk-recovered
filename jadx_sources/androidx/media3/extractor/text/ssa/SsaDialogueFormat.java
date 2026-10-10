package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes34.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    @Nullable
    public static SsaDialogueFormat fromFormatLine(String str) {
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i15].trim());
            lowerCase.getClass();
            switch (lowerCase) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i11, i12, i13, i14, strArrSplit.length);
    }

    private SsaDialogueFormat(int i11, int i12, int i13, int i14, int i15) {
        this.startTimeIndex = i11;
        this.endTimeIndex = i12;
        this.styleIndex = i13;
        this.textIndex = i14;
        this.length = i15;
    }
}
