package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.C6405b;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p450m7.InterfaceC42439e;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.b */
/* JADX INFO: compiled from: BeanDescription.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6340b {

    /* JADX INFO: renamed from: a */
    public final JavaType f10203a;

    /* JADX INFO: renamed from: B */
    public abstract boolean mo11152B();

    /* JADX INFO: renamed from: C */
    public abstract Object mo11153C(boolean z11);

    /* JADX INFO: renamed from: a */
    public abstract AnnotatedMember mo11155a();

    /* JADX INFO: renamed from: b */
    public abstract AnnotatedMember mo11156b();

    /* JADX INFO: renamed from: c */
    public abstract List<AbstractC6414k> mo11157c();

    /* JADX INFO: renamed from: d */
    public abstract AnnotatedConstructor mo11158d();

    /* JADX INFO: renamed from: e */
    public abstract Class<?>[] mo11159e();

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC6491h<Object, Object> mo11160f();

    /* JADX INFO: renamed from: g */
    public abstract JsonFormat.Value mo11161g(JsonFormat.Value value);

    /* JADX INFO: renamed from: h */
    public abstract Map<Object, AnnotatedMember> mo11162h();

    /* JADX INFO: renamed from: i */
    public abstract AnnotatedMember mo11163i();

    /* JADX INFO: renamed from: j */
    public abstract AnnotatedMember mo11164j();

    @Deprecated
    /* JADX INFO: renamed from: k */
    public abstract AnnotatedMethod mo11165k();

    /* JADX INFO: renamed from: l */
    public abstract AnnotatedMethod mo11166l(String str, Class<?>[] clsArr);

    /* JADX INFO: renamed from: m */
    public abstract Class<?> mo11167m();

    /* JADX INFO: renamed from: n */
    public abstract InterfaceC42439e.a mo11168n();

    /* JADX INFO: renamed from: o */
    public abstract List<AbstractC6414k> mo11169o();

    /* JADX INFO: renamed from: p */
    public abstract JsonInclude.Value mo11170p(JsonInclude.Value value);

    /* JADX INFO: renamed from: q */
    public abstract InterfaceC6491h<Object, Object> mo11171q();

    /* JADX INFO: renamed from: s */
    public abstract InterfaceC6484a mo11173s();

    /* JADX INFO: renamed from: t */
    public abstract C6406c mo11174t();

    /* JADX INFO: renamed from: u */
    public abstract List<AnnotatedConstructor> mo11175u();

    /* JADX INFO: renamed from: v */
    public abstract List<C6405b<AnnotatedConstructor, JsonCreator.Mode>> mo11176v();

    /* JADX INFO: renamed from: w */
    public abstract List<AnnotatedMethod> mo11177w();

    /* JADX INFO: renamed from: x */
    public abstract List<C6405b<AnnotatedMethod, JsonCreator.Mode>> mo11178x();

    /* JADX INFO: renamed from: y */
    public abstract Set<String> mo11179y();

    /* JADX INFO: renamed from: z */
    public abstract C6419p mo11180z();

    /* JADX INFO: renamed from: A */
    public JavaType m11151A() {
        return this.f10203a;
    }

    /* JADX INFO: renamed from: r */
    public Class<?> m11172r() {
        return this.f10203a.getRawClass();
    }

    public AbstractC6340b(JavaType javaType) {
        this.f10203a = javaType;
    }

    /* JADX INFO: renamed from: D */
    public boolean m11154D() {
        return mo11174t().m11469m();
    }
}
