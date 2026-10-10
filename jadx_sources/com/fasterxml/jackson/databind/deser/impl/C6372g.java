package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.g */
/* JADX INFO: compiled from: PropertyValueBuffer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6372g {

    /* JADX INFO: renamed from: a */
    public final JsonParser f10317a;

    /* JADX INFO: renamed from: b */
    public final DeserializationContext f10318b;

    /* JADX INFO: renamed from: c */
    public final ObjectIdReader f10319c;

    /* JADX INFO: renamed from: d */
    public final Object[] f10320d;

    /* JADX INFO: renamed from: e */
    public int f10321e;

    /* JADX INFO: renamed from: f */
    public int f10322f;

    /* JADX INFO: renamed from: g */
    public final BitSet f10323g;

    /* JADX INFO: renamed from: h */
    public AbstractC6371f f10324h;

    /* JADX INFO: renamed from: i */
    public Object f10325i;

    /* JADX INFO: renamed from: c */
    public void m11366c(SettableAnyProperty settableAnyProperty, String str, Object obj) {
        this.f10324h = new AbstractC6371f.a(this.f10324h, obj, settableAnyProperty, str);
    }

    /* JADX INFO: renamed from: d */
    public void m11367d(Object obj, Object obj2) {
        this.f10324h = new AbstractC6371f.b(this.f10324h, obj2, obj);
    }

    /* JADX INFO: renamed from: e */
    public void m11368e(SettableBeanProperty settableBeanProperty, Object obj) {
        this.f10324h = new AbstractC6371f.c(this.f10324h, obj, settableBeanProperty);
    }

    /* JADX INFO: renamed from: f */
    public AbstractC6371f m11369f() {
        return this.f10324h;
    }

    /* JADX INFO: renamed from: g */
    public Object[] m11370g(SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (this.f10321e > 0) {
            if (this.f10323g != null) {
                int length = this.f10320d.length;
                int i11 = 0;
                while (true) {
                    int iNextClearBit = this.f10323g.nextClearBit(i11);
                    if (iNextClearBit >= length) {
                        break;
                    }
                    this.f10320d[iNextClearBit] = m11364a(settableBeanPropertyArr[iNextClearBit]);
                    i11 = iNextClearBit + 1;
                }
            } else {
                int i12 = this.f10322f;
                int length2 = this.f10320d.length;
                int i13 = 0;
                while (i13 < length2) {
                    if ((i12 & 1) == 0) {
                        this.f10320d[i13] = m11364a(settableBeanPropertyArr[i13]);
                    }
                    i13++;
                    i12 >>= 1;
                }
            }
        }
        if (this.f10318b.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i14 = 0; i14 < settableBeanPropertyArr.length; i14++) {
                if (this.f10320d[i14] == null) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i14];
                    this.f10318b.reportInputMismatch(settableBeanProperty, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanPropertyArr[i14].getCreatorIndex()));
                }
            }
        }
        return this.f10320d;
    }

    /* JADX INFO: renamed from: h */
    public Object m11371h(DeserializationContext deserializationContext, Object obj) throws IOException {
        ObjectIdReader objectIdReader = this.f10319c;
        if (objectIdReader != null) {
            Object obj2 = this.f10325i;
            if (obj2 != null) {
                deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).m11374b(obj);
                SettableBeanProperty settableBeanProperty = this.f10319c.idProperty;
                if (settableBeanProperty != null) {
                    return settableBeanProperty.setAndReturn(obj, this.f10325i);
                }
            } else {
                deserializationContext.reportUnresolvedObjectId(objectIdReader, obj);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public boolean m11372i(String str) throws IOException {
        ObjectIdReader objectIdReader = this.f10319c;
        if (objectIdReader == null || !str.equals(objectIdReader.propertyName.getSimpleName())) {
            return false;
        }
        this.f10325i = this.f10319c.readObjectReference(this.f10317a, this.f10318b);
        return true;
    }

    public C6372g(JsonParser jsonParser, DeserializationContext deserializationContext, int i11, ObjectIdReader objectIdReader) {
        this.f10317a = jsonParser;
        this.f10318b = deserializationContext;
        this.f10321e = i11;
        this.f10319c = objectIdReader;
        this.f10320d = new Object[i11];
        if (i11 < 32) {
            this.f10323g = null;
        } else {
            this.f10323g = new BitSet();
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m11364a(SettableBeanProperty settableBeanProperty) throws DatabindException {
        if (settableBeanProperty.getInjectableValueId() != null) {
            return this.f10318b.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
        }
        if (settableBeanProperty.isRequired()) {
            this.f10318b.reportInputMismatch(settableBeanProperty, "Missing required creator property '%s' (index %d)", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        if (this.f10318b.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this.f10318b.reportInputMismatch(settableBeanProperty, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        try {
            Object absentValue = settableBeanProperty.getNullValueProvider().getAbsentValue(this.f10318b);
            if (absentValue != null) {
                return absentValue;
            }
            return settableBeanProperty.getValueDeserializer().getAbsentValue(this.f10318b);
        } catch (DatabindException e11) {
            AnnotatedMember member = settableBeanProperty.getMember();
            if (member != null) {
                e11.prependPath(member.getDeclaringClass(), settableBeanProperty.getName());
            }
            throw e11;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m11365b(SettableBeanProperty settableBeanProperty, Object obj) {
        int creatorIndex = settableBeanProperty.getCreatorIndex();
        this.f10320d[creatorIndex] = obj;
        BitSet bitSet = this.f10323g;
        if (bitSet == null) {
            int i11 = this.f10322f;
            int i12 = (1 << creatorIndex) | i11;
            if (i11 != i12) {
                this.f10322f = i12;
                int i13 = this.f10321e - 1;
                this.f10321e = i13;
                if (i13 <= 0) {
                    if (this.f10319c != null && this.f10325i == null) {
                        return false;
                    }
                    return true;
                }
            }
        } else if (!bitSet.get(creatorIndex)) {
            this.f10323g.set(creatorIndex);
            this.f10321e--;
        }
        return false;
    }
}
