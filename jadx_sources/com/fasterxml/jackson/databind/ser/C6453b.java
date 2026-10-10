package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.C6463a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.b */
/* JADX INFO: compiled from: BeanSerializerBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6453b {

    /* JADX INFO: renamed from: i */
    public static final BeanPropertyWriter[] f10596i = new BeanPropertyWriter[0];

    /* JADX INFO: renamed from: a */
    public final AbstractC6340b f10597a;

    /* JADX INFO: renamed from: b */
    public SerializationConfig f10598b;

    /* JADX INFO: renamed from: c */
    public List<BeanPropertyWriter> f10599c = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: d */
    public BeanPropertyWriter[] f10600d;

    /* JADX INFO: renamed from: e */
    public C6452a f10601e;

    /* JADX INFO: renamed from: f */
    public Object f10602f;

    /* JADX INFO: renamed from: g */
    public AnnotatedMember f10603g;

    /* JADX INFO: renamed from: h */
    public C6463a f10604h;

    /* JADX INFO: renamed from: a */
    public AbstractC6393h<?> m11744a() {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this.f10603g != null && this.f10598b.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.f10603g.fixAccess(this.f10598b.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        C6452a c6452a = this.f10601e;
        if (c6452a != null) {
            c6452a.m11740a(this.f10598b);
        }
        List<BeanPropertyWriter> list = this.f10599c;
        if (list == null || list.isEmpty()) {
            if (this.f10601e == null && this.f10604h == null) {
                return null;
            }
            beanPropertyWriterArr = f10596i;
        } else {
            List<BeanPropertyWriter> list2 = this.f10599c;
            beanPropertyWriterArr = (BeanPropertyWriter[]) list2.toArray(new BeanPropertyWriter[list2.size()]);
            if (this.f10598b.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                    beanPropertyWriter.fixAccess(this.f10598b);
                }
            }
        }
        BeanPropertyWriter[] beanPropertyWriterArr2 = this.f10600d;
        if (beanPropertyWriterArr2 == null || beanPropertyWriterArr2.length == this.f10599c.size()) {
            return new BeanSerializer(this.f10597a.m11151A(), this, beanPropertyWriterArr, this.f10600d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.f10599c.size()), Integer.valueOf(this.f10600d.length)));
    }

    /* JADX INFO: renamed from: b */
    public BeanSerializer m11745b() {
        return BeanSerializer.createDummy(this.f10597a.m11151A(), this);
    }

    /* JADX INFO: renamed from: c */
    public C6452a m11746c() {
        return this.f10601e;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC6340b m11747d() {
        return this.f10597a;
    }

    /* JADX INFO: renamed from: e */
    public Object m11748e() {
        return this.f10602f;
    }

    /* JADX INFO: renamed from: f */
    public C6463a m11749f() {
        return this.f10604h;
    }

    /* JADX INFO: renamed from: g */
    public List<BeanPropertyWriter> m11750g() {
        return this.f10599c;
    }

    /* JADX INFO: renamed from: h */
    public AnnotatedMember m11751h() {
        return this.f10603g;
    }

    /* JADX INFO: renamed from: i */
    public void m11752i(C6452a c6452a) {
        this.f10601e = c6452a;
    }

    /* JADX INFO: renamed from: j */
    public void m11753j(SerializationConfig serializationConfig) {
        this.f10598b = serializationConfig;
    }

    /* JADX INFO: renamed from: k */
    public void m11754k(Object obj) {
        this.f10602f = obj;
    }

    /* JADX INFO: renamed from: l */
    public void m11755l(BeanPropertyWriter[] beanPropertyWriterArr) {
        if (beanPropertyWriterArr != null && beanPropertyWriterArr.length != this.f10599c.size()) {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", Integer.valueOf(beanPropertyWriterArr.length), Integer.valueOf(this.f10599c.size())));
        }
        this.f10600d = beanPropertyWriterArr;
    }

    /* JADX INFO: renamed from: m */
    public void m11756m(C6463a c6463a) {
        this.f10604h = c6463a;
    }

    /* JADX INFO: renamed from: n */
    public void m11757n(List<BeanPropertyWriter> list) {
        this.f10599c = list;
    }

    /* JADX INFO: renamed from: o */
    public void m11758o(AnnotatedMember annotatedMember) {
        if (this.f10603g == null) {
            this.f10603g = annotatedMember;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.f10603g + " and " + annotatedMember);
    }

    public C6453b(AbstractC6340b abstractC6340b) {
        this.f10597a = abstractC6340b;
    }
}
