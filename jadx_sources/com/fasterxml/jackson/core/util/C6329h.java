package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.h */
/* JADX INFO: compiled from: JsonParserSequence.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6329h extends C6328g {

    /* JADX INFO: renamed from: f */
    public final JsonParser[] f10162f;

    /* JADX INFO: renamed from: g */
    public final boolean f10163g;

    /* JADX INFO: renamed from: h */
    public int f10164h;

    /* JADX INFO: renamed from: i */
    public boolean f10165i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6329h(boolean z11, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z12 = false;
        this.f10163g = z11;
        if (z11 && this.f10161e.mo10886i0()) {
            z12 = true;
        }
        this.f10165i = z12;
        this.f10162f = jsonParserArr;
        this.f10164h = 1;
    }

    /* JADX INFO: renamed from: E0 */
    public static C6329h m11083E0(boolean z11, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z12 = jsonParser instanceof C6329h;
        if (!z12 && !(jsonParser2 instanceof C6329h)) {
            return new C6329h(z11, new JsonParser[]{jsonParser, jsonParser2});
        }
        ArrayList arrayList = new ArrayList();
        if (z12) {
            ((C6329h) jsonParser).m11084D0(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof C6329h) {
            ((C6329h) jsonParser2).m11084D0(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new C6329h(z11, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: C0 */
    public JsonParser mo10856C0() throws IOException {
        if (this.f10161e.mo10889k() == JsonToken.START_OBJECT || this.f10161e.mo10889k() == JsonToken.START_ARRAY) {
            int i11 = 1;
            while (true) {
                JsonToken jsonTokenMo10905t0 = mo10905t0();
                if (jsonTokenMo10905t0 == null) {
                    break;
                }
                if (!jsonTokenMo10905t0.isStructStart()) {
                    if (jsonTokenMo10905t0.isStructEnd() && (i11 = i11 - 1) == 0) {
                        break;
                    }
                } else {
                    i11++;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: D0 */
    public void m11084D0(List<JsonParser> list) {
        int length = this.f10162f.length;
        for (int i11 = this.f10164h - 1; i11 < length; i11++) {
            JsonParser jsonParser = this.f10162f[i11];
            if (jsonParser instanceof C6329h) {
                ((C6329h) jsonParser).m11084D0(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public JsonToken m11085F0() throws IOException {
        JsonToken jsonTokenMo10905t0;
        do {
            int i11 = this.f10164h;
            JsonParser[] jsonParserArr = this.f10162f;
            if (i11 >= jsonParserArr.length) {
                return null;
            }
            this.f10164h = i11 + 1;
            JsonParser jsonParser = jsonParserArr[i11];
            this.f10161e = jsonParser;
            if (this.f10163g && jsonParser.mo10886i0()) {
                return this.f10161e.mo10912x();
            }
            jsonTokenMo10905t0 = this.f10161e.mo10905t0();
        } while (jsonTokenMo10905t0 == null);
        return jsonTokenMo10905t0;
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m11086G0() {
        int i11 = this.f10164h;
        JsonParser[] jsonParserArr = this.f10162f;
        if (i11 >= jsonParserArr.length) {
            return false;
        }
        this.f10164h = i11 + 1;
        this.f10161e = jsonParserArr[i11];
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.C6328g, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            this.f10161e.close();
        } while (m11086G0());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: t0 */
    public JsonToken mo10905t0() throws IOException {
        JsonParser jsonParser = this.f10161e;
        if (jsonParser == null) {
            return null;
        }
        if (this.f10165i) {
            this.f10165i = false;
            return jsonParser.mo10889k();
        }
        JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
        return jsonTokenMo10905t0 == null ? m11085F0() : jsonTokenMo10905t0;
    }
}
