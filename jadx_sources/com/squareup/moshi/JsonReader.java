package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: classes59.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: b */
    public int f56541b;

    /* JADX INFO: renamed from: c */
    public int[] f56542c = new int[32];

    /* JADX INFO: renamed from: d */
    public String[] f56543d = new String[32];

    /* JADX INFO: renamed from: e */
    public int[] f56544e = new int[32];

    /* JADX INFO: renamed from: f */
    public boolean f56545f;

    /* JADX INFO: renamed from: g */
    public boolean f56546g;

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

    /* JADX INFO: renamed from: C */
    public abstract int mo68625C(C27787a c27787a) throws IOException;

    /* JADX INFO: renamed from: L */
    public abstract void mo68628L() throws IOException;

    /* JADX INFO: renamed from: M */
    public abstract void mo68629M() throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract void mo68631a() throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract void mo68632b() throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract void mo68633g() throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo68634h() throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract boolean mo68636j() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract boolean mo68638l() throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract double mo68639m() throws IOException;

    /* JADX INFO: renamed from: n */
    public abstract int mo68640n() throws IOException;

    /* JADX INFO: renamed from: o */
    public abstract long mo68641o() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract <T> T mo68642p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract String mo68643q() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract Token mo68644v() throws IOException;

    /* JADX INFO: renamed from: w */
    public abstract void mo68645w() throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract int mo68647z(C27787a c27787a) throws IOException;

    /* JADX INFO: renamed from: com.squareup.moshi.JsonReader$a */
    public static final class C27787a {

        /* JADX INFO: renamed from: a */
        public final String[] f56548a;

        /* JADX INFO: renamed from: b */
        public final Options f56549b;

        /* JADX INFO: renamed from: a */
        public static C27787a m68648a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    C27805k.m68703R(buffer, strArr[i11]);
                    buffer.readByte();
                    byteStringArr[i11] = buffer.readByteString();
                }
                return new C27787a((String[]) strArr.clone(), Options.m94739of(byteStringArr));
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        public C27787a(String[] strArr, Options options) {
            this.f56548a = strArr;
            this.f56549b = options;
        }
    }

    /* JADX INFO: renamed from: u */
    public static JsonReader m68624u(BufferedSource bufferedSource) {
        return new C27804j(bufferedSource);
    }

    /* JADX INFO: renamed from: E */
    public final void m68626E(boolean z11) {
        this.f56546g = z11;
    }

    /* JADX INFO: renamed from: J */
    public final void m68627J(boolean z11) {
        this.f56545f = z11;
    }

    /* JADX INFO: renamed from: O */
    public final JsonEncodingException m68630O(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public final String getPath() {
        return C27803i.m68686a(this.f56541b, this.f56542c, this.f56543d, this.f56544e);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m68635i() {
        return this.f56546g;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m68637k() {
        return this.f56545f;
    }

    /* JADX INFO: renamed from: x */
    public final void m68646x(int i11) {
        int i12 = this.f56541b;
        int[] iArr = this.f56542c;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f56542c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f56543d;
            this.f56543d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f56544e;
            this.f56544e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f56542c;
        int i13 = this.f56541b;
        this.f56541b = i13 + 1;
        iArr3[i13] = i11;
    }
}
