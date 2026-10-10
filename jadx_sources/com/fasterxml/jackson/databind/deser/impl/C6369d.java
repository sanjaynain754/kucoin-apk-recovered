package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.util.C6499p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.d */
/* JADX INFO: compiled from: ExternalTypeHandler.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6369d {

    /* JADX INFO: renamed from: a */
    public final JavaType f10297a;

    /* JADX INFO: renamed from: b */
    public final b[] f10298b;

    /* JADX INFO: renamed from: c */
    public final Map<String, Object> f10299c;

    /* JADX INFO: renamed from: d */
    public final String[] f10300d;

    /* JADX INFO: renamed from: e */
    public final C6499p[] f10301e;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.d$a */
    /* JADX INFO: compiled from: ExternalTypeHandler.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final JavaType f10302a;

        /* JADX INFO: renamed from: b */
        public final List<b> f10303b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final Map<String, Object> f10304c = new HashMap();

        /* JADX INFO: renamed from: a */
        public final void m11341a(String str, Integer num) {
            Object obj = this.f10304c.get(str);
            if (obj == null) {
                this.f10304c.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this.f10304c.put(str, linkedList);
        }

        /* JADX INFO: renamed from: b */
        public void m11342b(SettableBeanProperty settableBeanProperty, AbstractC6428b abstractC6428b) {
            Integer numValueOf = Integer.valueOf(this.f10303b.size());
            this.f10303b.add(new b(settableBeanProperty, abstractC6428b));
            m11341a(settableBeanProperty.getName(), numValueOf);
            m11341a(abstractC6428b.getPropertyName(), numValueOf);
        }

        /* JADX INFO: renamed from: c */
        public C6369d m11343c(BeanPropertyMap beanPropertyMap) {
            int size = this.f10303b.size();
            b[] bVarArr = new b[size];
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f10303b.get(i11);
                SettableBeanProperty settableBeanPropertyFind = beanPropertyMap.find(bVar.m11347d());
                if (settableBeanPropertyFind != null) {
                    bVar.m11350g(settableBeanPropertyFind);
                }
                bVarArr[i11] = bVar;
            }
            return new C6369d(this.f10302a, bVarArr, this.f10304c, null, null);
        }

        public a(JavaType javaType) {
            this.f10302a = javaType;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.d$b */
    /* JADX INFO: compiled from: ExternalTypeHandler.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final SettableBeanProperty f10305a;

        /* JADX INFO: renamed from: b */
        public final AbstractC6428b f10306b;

        /* JADX INFO: renamed from: c */
        public final String f10307c;

        /* JADX INFO: renamed from: d */
        public SettableBeanProperty f10308d;

        /* JADX INFO: renamed from: a */
        public String m11344a() {
            Class<?> defaultImpl = this.f10306b.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this.f10306b.getTypeIdResolver().mo11687e(null, defaultImpl);
        }

        /* JADX INFO: renamed from: b */
        public SettableBeanProperty m11345b() {
            return this.f10305a;
        }

        /* JADX INFO: renamed from: c */
        public SettableBeanProperty m11346c() {
            return this.f10308d;
        }

        /* JADX INFO: renamed from: d */
        public String m11347d() {
            return this.f10307c;
        }

        /* JADX INFO: renamed from: e */
        public boolean m11348e() {
            return this.f10306b.hasDefaultImpl();
        }

        /* JADX INFO: renamed from: f */
        public boolean m11349f(String str) {
            return str.equals(this.f10307c);
        }

        /* JADX INFO: renamed from: g */
        public void m11350g(SettableBeanProperty settableBeanProperty) {
            this.f10308d = settableBeanProperty;
        }

        public b(SettableBeanProperty settableBeanProperty, AbstractC6428b abstractC6428b) {
            this.f10305a = settableBeanProperty;
            this.f10306b = abstractC6428b;
            this.f10307c = abstractC6428b.getPropertyName();
        }
    }

    public C6369d(JavaType javaType, b[] bVarArr, Map<String, Object> map, String[] strArr, C6499p[] c6499pArr) {
        this.f10297a = javaType;
        this.f10298b = bVarArr;
        this.f10299c = map;
        this.f10300d = strArr;
        this.f10301e = c6499pArr;
    }

    /* JADX INFO: renamed from: d */
    public static a m11332d(JavaType javaType) {
        return new a(javaType);
    }

    /* JADX INFO: renamed from: a */
    public final Object m11333a(JsonParser jsonParser, DeserializationContext deserializationContext, int i11, String str) throws IOException {
        JsonParser jsonParserM12014U0 = this.f10301e[i11].m12014U0(jsonParser);
        if (jsonParserM12014U0.mo10905t0() == JsonToken.VALUE_NULL) {
            return null;
        }
        C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        c6499pBufferForInputBuffering.mo10843u0();
        c6499pBufferForInputBuffering.mo10787C0(str);
        c6499pBufferForInputBuffering.m12017X0(jsonParserM12014U0);
        c6499pBufferForInputBuffering.mo10805W();
        JsonParser jsonParserM12014U1 = c6499pBufferForInputBuffering.m12014U0(jsonParser);
        jsonParserM12014U1.mo10905t0();
        return this.f10298b[i11].m11345b().deserialize(jsonParserM12014U1, deserializationContext);
    }

    /* JADX INFO: renamed from: b */
    public final void m11334b(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i11, String str) throws IOException {
        if (str == null) {
            deserializationContext.reportInputMismatch(this.f10297a, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        JsonParser jsonParserM12014U0 = this.f10301e[i11].m12014U0(jsonParser);
        if (jsonParserM12014U0.mo10905t0() == JsonToken.VALUE_NULL) {
            this.f10298b[i11].m11345b().set(obj, null);
            return;
        }
        C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        c6499pBufferForInputBuffering.mo10843u0();
        c6499pBufferForInputBuffering.mo10787C0(str);
        c6499pBufferForInputBuffering.m12017X0(jsonParserM12014U0);
        c6499pBufferForInputBuffering.mo10805W();
        JsonParser jsonParserM12014U1 = c6499pBufferForInputBuffering.m12014U0(jsonParser);
        jsonParserM12014U1.mo10905t0();
        this.f10298b[i11].m11345b().deserializeAndSet(jsonParserM12014U1, deserializationContext, obj);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11335c(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i11) throws IOException {
        if (!this.f10298b[i11].m11349f(str)) {
            return false;
        }
        if (obj == null || this.f10301e[i11] == null) {
            this.f10300d[i11] = str2;
            return true;
        }
        m11334b(jsonParser, deserializationContext, obj, i11, str2);
        this.f10301e[i11] = null;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public Object m11336e(JsonParser jsonParser, DeserializationContext deserializationContext, C6372g c6372g, PropertyBasedCreator propertyBasedCreator) throws IOException {
        String strM11344a;
        Object obj;
        int length = this.f10298b.length;
        Object[] objArr = new Object[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str = this.f10300d[i11];
            b bVar = this.f10298b[i11];
            if (str == null) {
                C6499p c6499p = this.f10301e[i11];
                if (c6499p != null && c6499p.m12019Z0() != JsonToken.VALUE_NULL) {
                    if (bVar.m11348e()) {
                        strM11344a = bVar.m11344a();
                    } else {
                        deserializationContext.reportPropertyInputMismatch(this.f10297a, bVar.m11345b().getName(), "Missing external type id property '%s'", bVar.m11347d());
                        strM11344a = str;
                    }
                }
            } else if (this.f10301e[i11] == null) {
                SettableBeanProperty settableBeanPropertyM11345b = bVar.m11345b();
                if (settableBeanPropertyM11345b.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    strM11344a = str;
                    strM11344a = str;
                    strM11344a = str;
                    deserializationContext.reportPropertyInputMismatch(this.f10297a, settableBeanPropertyM11345b.getName(), "Missing property '%s' for external type id '%s'", settableBeanPropertyM11345b.getName(), this.f10298b[i11].m11347d());
                    strM11344a = str;
                }
            }
            strM11344a = str;
            strM11344a = str;
            strM11344a = str;
            if (this.f10301e[i11] != null) {
                objArr[i11] = m11333a(jsonParser, deserializationContext, i11, strM11344a);
            }
            SettableBeanProperty settableBeanPropertyM11345b2 = bVar.m11345b();
            if (settableBeanPropertyM11345b2.getCreatorIndex() >= 0) {
                c6372g.m11365b(settableBeanPropertyM11345b2, objArr[i11]);
                SettableBeanProperty settableBeanPropertyM11346c = bVar.m11346c();
                if (settableBeanPropertyM11346c != null && settableBeanPropertyM11346c.getCreatorIndex() >= 0) {
                    if (!settableBeanPropertyM11346c.getType().hasRawClass(String.class)) {
                        obj = strM11344a;
                        C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
                        c6499pBufferForInputBuffering.mo10787C0(strM11344a);
                        Object objDeserialize = settableBeanPropertyM11346c.getValueDeserializer().deserialize(c6499pBufferForInputBuffering.m12016W0(), deserializationContext);
                        c6499pBufferForInputBuffering.close();
                        obj = objDeserialize;
                    }
                    obj = strM11344a;
                    c6372g.m11365b(settableBeanPropertyM11346c, obj);
                }
            }
        }
        Object objM11298a = propertyBasedCreator.m11298a(deserializationContext, c6372g);
        for (int i12 = 0; i12 < length; i12++) {
            SettableBeanProperty settableBeanPropertyM11345b3 = this.f10298b[i12].m11345b();
            if (settableBeanPropertyM11345b3.getCreatorIndex() < 0) {
                settableBeanPropertyM11345b3.set(objM11298a, objArr[i12]);
            }
        }
        return objM11298a;
    }

    /* JADX INFO: renamed from: f */
    public Object m11337f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        Object obj2;
        int length = this.f10298b.length;
        int i11 = 0;
        while (i11 < length) {
            String strM11344a = this.f10300d[i11];
            b bVar = this.f10298b[i11];
            if (strM11344a != null) {
                if (this.f10301e[i11] == null) {
                    SettableBeanProperty settableBeanPropertyM11345b = bVar.m11345b();
                    if (!settableBeanPropertyM11345b.isRequired() && !deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                        break;
                    }
                    deserializationContext.reportPropertyInputMismatch(obj.getClass(), settableBeanPropertyM11345b.getName(), "Missing property '%s' for external type id '%s'", settableBeanPropertyM11345b.getName(), bVar.m11347d());
                    return obj;
                }
            } else {
                C6499p c6499p = this.f10301e[i11];
                if (c6499p != null) {
                    if (c6499p.m12019Z0().isScalarValue()) {
                        JsonParser jsonParserM12014U0 = c6499p.m12014U0(jsonParser);
                        jsonParserM12014U0.mo10905t0();
                        SettableBeanProperty settableBeanPropertyM11345b2 = bVar.m11345b();
                        Object objDeserializeIfNatural = AbstractC6428b.deserializeIfNatural(jsonParserM12014U0, deserializationContext, settableBeanPropertyM11345b2.getType());
                        if (objDeserializeIfNatural != null) {
                            settableBeanPropertyM11345b2.set(obj, objDeserializeIfNatural);
                        }
                    }
                    if (bVar.m11348e()) {
                        strM11344a = bVar.m11344a();
                        if (strM11344a == null) {
                            deserializationContext.reportPropertyInputMismatch(this.f10297a, bVar.m11345b().getName(), "Invalid default type id for property '%s': `null` returned by TypeIdResolver", bVar.m11347d());
                        }
                    } else {
                        deserializationContext.reportPropertyInputMismatch(this.f10297a, bVar.m11345b().getName(), "Missing external type id property '%s' (and no 'defaultImpl' specified)", bVar.m11347d());
                    }
                }
                jsonParser2 = jsonParser;
                deserializationContext2 = deserializationContext;
                obj2 = obj;
                i11++;
                jsonParser = jsonParser2;
                deserializationContext = deserializationContext2;
                obj = obj2;
            }
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            obj2 = obj;
            m11334b(jsonParser2, deserializationContext2, obj2, i11, strM11344a);
            i11++;
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            obj = obj2;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX INFO: renamed from: g */
    public boolean m11338g(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.f10299c.get(str);
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof List) {
            Iterator it = ((List) obj2).iterator();
            Integer num = (Integer) it.next();
            if (this.f10298b[num.intValue()].m11349f(str)) {
                String strMo10869W = jsonParser.mo10869W();
                jsonParser.mo10856C0();
                this.f10300d[num.intValue()] = strMo10869W;
                while (it.hasNext()) {
                    this.f10300d[((Integer) it.next()).intValue()] = strMo10869W;
                }
            } else {
                C6499p c6499pBufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                this.f10301e[num.intValue()] = c6499pBufferAsCopyOfValue;
                while (it.hasNext()) {
                    this.f10301e[((Integer) it.next()).intValue()] = c6499pBufferAsCopyOfValue;
                }
            }
            return true;
        }
        int iIntValue = ((Integer) obj2).intValue();
        if (this.f10298b[iIntValue].m11349f(str)) {
            this.f10300d[iIntValue] = jsonParser.mo10882g0();
            jsonParser.mo10856C0();
            if (obj != null && this.f10301e[iIntValue] != null) {
                String[] strArr = this.f10300d;
                String str2 = strArr[iIntValue];
                strArr[iIntValue] = null;
                m11334b(jsonParser, deserializationContext, obj, iIntValue, str2);
                this.f10301e[iIntValue] = null;
            }
        } else {
            this.f10301e[iIntValue] = deserializationContext.bufferAsCopyOfValue(jsonParser);
            if (obj != null && this.f10300d[iIntValue] != null) {
                String[] strArr2 = this.f10300d;
                String str3 = strArr2[iIntValue];
                strArr2[iIntValue] = null;
                m11334b(jsonParser, deserializationContext, obj, iIntValue, str3);
                this.f10301e[iIntValue] = null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m11339h(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.f10299c.get(str);
        boolean z11 = false;
        if (obj2 == null) {
            return false;
        }
        String strMo10869W = jsonParser.mo10869W();
        if (!(obj2 instanceof List)) {
            return m11335c(jsonParser, deserializationContext, str, obj, strMo10869W, ((Integer) obj2).intValue());
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            JsonParser jsonParser2 = jsonParser;
            DeserializationContext deserializationContext2 = deserializationContext;
            String str2 = str;
            Object obj3 = obj;
            if (m11335c(jsonParser2, deserializationContext2, str2, obj3, strMo10869W, ((Integer) it.next()).intValue())) {
                z11 = true;
            }
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            str = str2;
            obj = obj3;
        }
        return z11;
    }

    /* JADX INFO: renamed from: i */
    public C6369d m11340i() {
        return new C6369d(this);
    }

    public C6369d(C6369d c6369d) {
        this.f10297a = c6369d.f10297a;
        b[] bVarArr = c6369d.f10298b;
        this.f10298b = bVarArr;
        this.f10299c = c6369d.f10299c;
        int length = bVarArr.length;
        this.f10300d = new String[length];
        this.f10301e = new C6499p[length];
    }
}
