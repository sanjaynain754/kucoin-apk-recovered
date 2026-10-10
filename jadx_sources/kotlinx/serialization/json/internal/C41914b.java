package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.b */
/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"", InterfaceC33826o0.f71244p, "", "c", "(B)Ljava/lang/String;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(C)B", "", "b", "(I)C", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41914b {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m91860c(byte b11) {
        if (b11 == 1) {
            return "quotation mark '\"'";
        }
        if (b11 == 2) {
            return "string escape sequence '\\'";
        }
        if (b11 == 4) {
            return "comma ','";
        }
        if (b11 == 5) {
            return "colon ':'";
        }
        if (b11 == 6) {
            return "start of the object '{'";
        }
        if (b11 == 7) {
            return "end of the object '}'";
        }
        if (b11 == 8) {
            return "start of the array '['";
        }
        if (b11 == 9) {
            return "end of the array ']'";
        }
        if (b11 == 10) {
            return "end of the input";
        }
        return b11 == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: a */
    public static final byte m91858a(char c11) {
        if (c11 < '~') {
            return C41937m.CHAR_TO_TOKEN[c11];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: b */
    public static final char m91859b(int i11) {
        if (i11 < 117) {
            return C41937m.ESCAPE_2_CHAR[i11];
        }
        return (char) 0;
    }
}
