package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.j */
/* JADX INFO: compiled from: MappingIterator.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6424j<T> implements Iterator<T>, Closeable {

    /* JADX INFO: renamed from: j */
    public static final C6424j<?> f10512j = new C6424j<>(null, null, null, null, false, null);

    /* JADX INFO: renamed from: b */
    public final JavaType f10513b;

    /* JADX INFO: renamed from: c */
    public final DeserializationContext f10514c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6390e<T> f10515d;

    /* JADX INFO: renamed from: e */
    public final JsonParser f10516e;

    /* JADX INFO: renamed from: f */
    public final AbstractC6302f f10517f;

    /* JADX INFO: renamed from: g */
    public final T f10518g;

    /* JADX INFO: renamed from: h */
    public final boolean f10519h;

    /* JADX INFO: renamed from: i */
    public int f10520i;

    /* JADX INFO: renamed from: a */
    public <R> R m11676a(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    /* JADX INFO: renamed from: b */
    public <R> R m11677b(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f10520i != 0) {
            this.f10520i = 0;
            JsonParser jsonParser = this.f10516e;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11678g() throws IOException {
        JsonParser jsonParser = this.f10516e;
        if (jsonParser.mo10866T() == this.f10517f) {
            return;
        }
        while (true) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            if (jsonTokenMo10905t0 == JsonToken.END_ARRAY || jsonTokenMo10905t0 == JsonToken.END_OBJECT) {
                if (jsonParser.mo10866T() == this.f10517f) {
                    jsonParser.mo10885i();
                    return;
                }
            } else if (jsonTokenMo10905t0 == JsonToken.START_ARRAY || jsonTokenMo10905t0 == JsonToken.START_OBJECT) {
                jsonParser.mo10856C0();
            } else if (jsonTokenMo10905t0 == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public <R> R m11679h() {
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: i */
    public boolean m11680i() throws IOException {
        JsonToken jsonTokenMo10905t0;
        int i11 = this.f10520i;
        if (i11 == 0) {
            return false;
        }
        if (i11 == 1) {
            m11678g();
        } else if (i11 != 2) {
            return true;
        }
        JsonParser jsonParser = this.f10516e;
        if (jsonParser == null) {
            return false;
        }
        if (jsonParser.mo10889k() != null || ((jsonTokenMo10905t0 = this.f10516e.mo10905t0()) != null && jsonTokenMo10905t0 != JsonToken.END_ARRAY)) {
            this.f10520i = 3;
            return true;
        }
        this.f10520i = 0;
        if (this.f10519h) {
            this.f10516e.close();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public T m11681j() throws IOException {
        T tDeserialize;
        int i11 = this.f10520i;
        if (i11 == 0) {
            return (T) m11679h();
        }
        int i12 = 2;
        int i13 = 1;
        if ((i11 == i13 || i11 == i12) && !m11680i()) {
            return (T) m11679h();
        }
        try {
            T t11 = this.f10518g;
            if (t11 == null) {
                tDeserialize = this.f10515d.deserialize(this.f10516e, this.f10514c);
            } else {
                this.f10515d.deserialize(this.f10516e, this.f10514c, t11);
                tDeserialize = this.f10518g;
            }
            return tDeserialize;
        } finally {
            this.f10520i = i13;
            this.f10516e.mo10885i();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6424j(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6390e<?> abstractC6390e, boolean z11, Object obj) {
        this.f10513b = javaType;
        this.f10516e = jsonParser;
        this.f10514c = deserializationContext;
        this.f10515d = abstractC6390e;
        this.f10519h = z11;
        if (obj == 0) {
            this.f10518g = null;
        } else {
            this.f10518g = obj;
        }
        if (jsonParser == null) {
            this.f10517f = null;
            this.f10520i = 0;
            return;
        }
        AbstractC6302f abstractC6302fMo10866T = jsonParser.mo10866T();
        if (z11 && jsonParser.mo10898o0()) {
            jsonParser.mo10885i();
        } else {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == JsonToken.START_OBJECT || jsonTokenMo10889k == JsonToken.START_ARRAY) {
                abstractC6302fMo10866T = abstractC6302fMo10866T.mo10936e();
            }
        }
        this.f10517f = abstractC6302fMo10866T;
        this.f10520i = 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return m11680i();
        } catch (JsonMappingException e11) {
            return ((Boolean) m11677b(e11)).booleanValue();
        } catch (IOException e12) {
            return ((Boolean) m11676a(e12)).booleanValue();
        }
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return m11681j();
        } catch (JsonMappingException e11) {
            return (T) m11677b(e11);
        } catch (IOException e12) {
            return (T) m11676a(e12);
        }
    }
}
