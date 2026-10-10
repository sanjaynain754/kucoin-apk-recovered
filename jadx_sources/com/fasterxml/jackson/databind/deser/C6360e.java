package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p062io.C6312f;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p303h7.InterfaceC38132a;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.e */
/* JADX INFO: compiled from: DataFormatReaders.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6360e {

    /* JADX INFO: renamed from: a */
    public final ObjectReader[] f10260a;

    /* JADX INFO: renamed from: b */
    public final MatchStrength f10261b;

    /* JADX INFO: renamed from: c */
    public final MatchStrength f10262c;

    /* JADX INFO: renamed from: d */
    public final int f10263d;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.e$a */
    /* JADX INFO: compiled from: DataFormatReaders.java */
    public static class a extends InterfaceC38132a.a {
        public a(InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        public a(byte[] bArr, int i11, int i12) {
            super(bArr, i11, i12);
        }

        /* JADX INFO: renamed from: c */
        public b m11261c(ObjectReader objectReader, MatchStrength matchStrength) {
            InputStream inputStream = this.f85804a;
            byte[] bArr = this.f85805b;
            int i11 = this.f85806c;
            return new b(inputStream, bArr, i11, this.f85807d - i11, objectReader, matchStrength);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.e$b */
    /* JADX INFO: compiled from: DataFormatReaders.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final InputStream f10264a;

        /* JADX INFO: renamed from: b */
        public final byte[] f10265b;

        /* JADX INFO: renamed from: c */
        public final int f10266c;

        /* JADX INFO: renamed from: d */
        public final int f10267d;

        /* JADX INFO: renamed from: e */
        public final ObjectReader f10268e;

        /* JADX INFO: renamed from: f */
        public final MatchStrength f10269f;

        /* JADX INFO: renamed from: a */
        public JsonParser m11262a() throws IOException {
            ObjectReader objectReader = this.f10268e;
            if (objectReader == null) {
                return null;
            }
            JsonFactory factory = objectReader.getFactory();
            return this.f10264a == null ? factory.createParser(this.f10265b, this.f10266c, this.f10267d) : factory.createParser(m11263b());
        }

        /* JADX INFO: renamed from: b */
        public InputStream m11263b() {
            return this.f10264a == null ? new ByteArrayInputStream(this.f10265b, this.f10266c, this.f10267d) : new C6312f(null, this.f10264a, this.f10265b, this.f10266c, this.f10267d);
        }

        /* JADX INFO: renamed from: c */
        public ObjectReader m11264c() {
            return this.f10268e;
        }

        /* JADX INFO: renamed from: d */
        public boolean m11265d() {
            return this.f10268e != null;
        }

        public b(InputStream inputStream, byte[] bArr, int i11, int i12, ObjectReader objectReader, MatchStrength matchStrength) {
            this.f10264a = inputStream;
            this.f10265b = bArr;
            this.f10266c = i11;
            this.f10267d = i12;
            this.f10268e = objectReader;
            this.f10269f = matchStrength;
        }
    }

    public C6360e(ObjectReader... objectReaderArr) {
        this(objectReaderArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    public C6360e(ObjectReader[] objectReaderArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i11) {
        this.f10260a = objectReaderArr;
        this.f10261b = matchStrength;
        this.f10262c = matchStrength2;
        this.f10263d = i11;
    }

    /* JADX INFO: renamed from: a */
    public final b m11256a(a aVar) throws IOException {
        ObjectReader objectReader = null;
        MatchStrength matchStrength = null;
        for (ObjectReader objectReader2 : this.f10260a) {
            aVar.m86053b();
            MatchStrength matchStrengthHasFormat = objectReader2.getFactory().hasFormat(aVar);
            if (matchStrengthHasFormat != null && matchStrengthHasFormat.ordinal() >= this.f10262c.ordinal() && (objectReader == null || matchStrength.ordinal() < matchStrengthHasFormat.ordinal())) {
                if (matchStrengthHasFormat.ordinal() >= this.f10261b.ordinal()) {
                    objectReader = objectReader2;
                    matchStrength = matchStrengthHasFormat;
                    break;
                }
                objectReader = objectReader2;
                matchStrength = matchStrengthHasFormat;
            }
        }
        return aVar.m11261c(objectReader, matchStrength);
    }

    /* JADX INFO: renamed from: b */
    public b m11257b(InputStream inputStream) throws IOException {
        return m11256a(new a(inputStream, new byte[this.f10263d]));
    }

    /* JADX INFO: renamed from: c */
    public b m11258c(byte[] bArr, int i11, int i12) throws IOException {
        return m11256a(new a(bArr, i11, i12));
    }

    /* JADX INFO: renamed from: d */
    public C6360e m11259d(DeserializationConfig deserializationConfig) {
        int length = this.f10260a.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i11 = 0; i11 < length; i11++) {
            objectReaderArr[i11] = this.f10260a[i11].with(deserializationConfig);
        }
        return new C6360e(objectReaderArr, this.f10261b, this.f10262c, this.f10263d);
    }

    /* JADX INFO: renamed from: e */
    public C6360e m11260e(JavaType javaType) {
        int length = this.f10260a.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i11 = 0; i11 < length; i11++) {
            objectReaderArr[i11] = this.f10260a[i11].forType(javaType);
        }
        return new C6360e(objectReaderArr, this.f10261b, this.f10262c, this.f10263d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        ObjectReader[] objectReaderArr = this.f10260a;
        int length = objectReaderArr.length;
        if (length > 0) {
            sb2.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i11 = 1; i11 < length; i11++) {
                sb2.append(", ");
                sb2.append(this.f10260a[i11].getFactory().getFormatName());
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
