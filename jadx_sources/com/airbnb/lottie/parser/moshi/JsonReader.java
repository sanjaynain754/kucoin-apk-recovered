package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import p459n1.C42698a;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: h */
    public static final String[] f6186h = new String[128];

    /* JADX INFO: renamed from: b */
    public int f6187b;

    /* JADX INFO: renamed from: c */
    public int[] f6188c = new int[32];

    /* JADX INFO: renamed from: d */
    public String[] f6189d = new String[32];

    /* JADX INFO: renamed from: e */
    public int[] f6190e = new int[32];

    /* JADX INFO: renamed from: f */
    public boolean f6191f;

    /* JADX INFO: renamed from: g */
    public boolean f6192g;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo5829b() throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract void mo5830g() throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo5831h() throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo5832i() throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract boolean mo5833j() throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract boolean mo5834k() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract double mo5835l() throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract int mo5836m() throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract String mo5837n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract String mo5838o() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract Token mo5839q() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract int mo5841v(C5103a c5103a) throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract void mo5842w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract void mo5843x() throws IOException;

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.JsonReader$a */
    public static final class C5103a {

        /* JADX INFO: renamed from: a */
        public final String[] f6194a;

        /* JADX INFO: renamed from: b */
        public final Options f6195b;

        /* JADX INFO: renamed from: a */
        public static C5103a m5845a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    JsonReader.m5827z(buffer, strArr[i11]);
                    buffer.readByte();
                    byteStringArr[i11] = buffer.readByteString();
                }
                return new C5103a((String[]) strArr.clone(), Options.m94739of(byteStringArr));
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        public C5103a(String[] strArr, Options options) {
            this.f6194a = strArr;
            this.f6195b = options;
        }
    }

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f6186h[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f6186h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: p */
    public static JsonReader m5826p(BufferedSource bufferedSource) {
        return new C5104a(bufferedSource);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: z */
    public static void m5827z(BufferedSink bufferedSink, String str) throws IOException {
        String str2;
        String[] strArr = f6186h;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i11 < i12) {
                        bufferedSink.writeUtf8(str, i11, i12);
                    }
                    bufferedSink.writeUtf8(str2);
                    i11 = i12 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i12) {
                    bufferedSink.writeUtf8(str, i11, i12);
                }
                bufferedSink.writeUtf8(str2);
                i11 = i12 + 1;
            }
        }
        if (i11 < length) {
            bufferedSink.writeUtf8(str, i11, length);
        }
        bufferedSink.writeByte(34);
    }

    /* JADX INFO: renamed from: C */
    public final JsonEncodingException m5828C(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public final String getPath() {
        return C42698a.m93586a(this.f6187b, this.f6188c, this.f6189d, this.f6190e);
    }

    /* JADX INFO: renamed from: u */
    public final void m5840u(int i11) {
        int i12 = this.f6187b;
        int[] iArr = this.f6188c;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f6188c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f6189d;
            this.f6189d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f6190e;
            this.f6190e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f6188c;
        int i13 = this.f6187b;
        this.f6187b = i13 + 1;
        iArr3[i13] = i11;
    }
}
