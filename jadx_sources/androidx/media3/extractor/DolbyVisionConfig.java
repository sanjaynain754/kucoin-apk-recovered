package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import com.tencent.bugly.proguard.C33978va;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DolbyVisionConfig {
    public final String codecs;
    public final int level;
    public final int profile;

    @Nullable
    public static DolbyVisionConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = unsignedByte >> 1;
        int unsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i11 == 4 || i11 == 5 || i11 == 7) {
            str = "dvhe";
        } else if (i11 == 8) {
            str = "hev1";
        } else {
            if (i11 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i11);
        sb2.append(unsignedByte2 >= 10 ? C33978va.f72339h : ".0");
        sb2.append(unsignedByte2);
        return new DolbyVisionConfig(i11, unsignedByte2, sb2.toString());
    }

    private DolbyVisionConfig(int i11, int i12, String str) {
        this.profile = i11;
        this.level = i12;
        this.codecs = str;
    }
}
