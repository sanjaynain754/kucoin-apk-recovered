package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.m */
/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lkotlinx/serialization/json/internal/m;", "", "<init>", "()V", "", "f", "e", "", "c", "", "esc", "b", "(IC)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(CC)V", "", "cl", "d", "(IB)V", "(CB)V", "", "[C", "ESCAPE_2_CHAR", "", "[B", "CHAR_TO_TOKEN", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41937m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41937m f92130a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final char[] ESCAPE_2_CHAR;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final byte[] CHAR_TO_TOKEN;

    /* JADX INFO: renamed from: e */
    public final void m91962e() {
        for (int i11 = 0; i11 < 33; i11++) {
            m91961d(i11, (byte) 127);
        }
        m91961d(9, (byte) 3);
        m91961d(10, (byte) 3);
        m91961d(13, (byte) 3);
        m91961d(32, (byte) 3);
        m91960c(',', (byte) 4);
        m91960c(':', (byte) 5);
        m91960c('{', (byte) 6);
        m91960c('}', (byte) 7);
        m91960c('[', (byte) 8);
        m91960c(']', (byte) 9);
        m91960c('\"', (byte) 1);
        m91960c('\\', (byte) 2);
    }

    /* JADX INFO: renamed from: f */
    public final void m91963f() {
        for (int i11 = 0; i11 < 32; i11++) {
            m91959b(i11, 'u');
        }
        m91959b(8, 'b');
        m91959b(9, 't');
        m91959b(10, 'n');
        m91959b(12, 'f');
        m91959b(13, 'r');
        m91958a('/', '/');
        m91958a('\"', '\"');
        m91958a('\\', '\\');
    }

    static {
        C41937m c41937m = new C41937m();
        f92130a = c41937m;
        ESCAPE_2_CHAR = new char[117];
        CHAR_TO_TOKEN = new byte[126];
        c41937m.m91963f();
        c41937m.m91962e();
    }

    /* JADX INFO: renamed from: b */
    public final void m91959b(int c11, char esc) {
        if (esc != 'u') {
            ESCAPE_2_CHAR[esc] = (char) c11;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m91961d(int c11, byte cl2) {
        CHAR_TO_TOKEN[c11] = cl2;
    }

    /* JADX INFO: renamed from: a */
    public final void m91958a(char c11, char esc) {
        m91959b(c11, esc);
    }

    /* JADX INFO: renamed from: c */
    public final void m91960c(char c11, byte cl2) {
        m91961d(c11, cl2);
    }
}
