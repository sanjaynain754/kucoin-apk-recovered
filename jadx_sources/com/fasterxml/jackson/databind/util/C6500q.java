package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.p062io.ContentReference;
import p334i7.C38466d;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.q */
/* JADX INFO: compiled from: TokenBufferReadContext.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6500q extends AbstractC6302f {

    /* JADX INFO: renamed from: c */
    public final AbstractC6302f f10789c;

    /* JADX INFO: renamed from: d */
    public final JsonLocation f10790d;

    /* JADX INFO: renamed from: e */
    public String f10791e;

    /* JADX INFO: renamed from: f */
    public Object f10792f;

    public C6500q(AbstractC6302f abstractC6302f, ContentReference contentReference) {
        super(abstractC6302f);
        this.f10789c = abstractC6302f.mo10936e();
        this.f10791e = abstractC6302f.mo10933b();
        this.f10792f = abstractC6302f.mo10934c();
        if (abstractC6302f instanceof C38466d) {
            this.f10790d = ((C38466d) abstractC6302f).m86806u(contentReference);
        } else {
            this.f10790d = JsonLocation.f10025NA;
        }
    }

    /* JADX INFO: renamed from: m */
    public static C6500q m12047m(AbstractC6302f abstractC6302f) {
        return abstractC6302f == null ? new C6500q() : new C6500q(abstractC6302f, ContentReference.unknown());
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: b */
    public String mo10933b() {
        return this.f10791e;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: c */
    public Object mo10934c() {
        return this.f10792f;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: e */
    public AbstractC6302f mo10936e() {
        return this.f10789c;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: i */
    public void mo10940i(Object obj) {
        this.f10792f = obj;
    }

    /* JADX INFO: renamed from: k */
    public C6500q m12048k() {
        this.f10051b++;
        return new C6500q(this, 1, -1);
    }

    /* JADX INFO: renamed from: l */
    public C6500q m12049l() {
        this.f10051b++;
        return new C6500q(this, 2, -1);
    }

    /* JADX INFO: renamed from: n */
    public C6500q m12050n() {
        AbstractC6302f abstractC6302f = this.f10789c;
        if (abstractC6302f instanceof C6500q) {
            return (C6500q) abstractC6302f;
        }
        return abstractC6302f == null ? new C6500q() : new C6500q(abstractC6302f, this.f10790d);
    }

    /* JADX INFO: renamed from: o */
    public void m12051o(String str) throws JsonProcessingException {
        this.f10791e = str;
    }

    /* JADX INFO: renamed from: p */
    public void m12052p() {
        this.f10051b++;
    }

    public C6500q(AbstractC6302f abstractC6302f, JsonLocation jsonLocation) {
        super(abstractC6302f);
        this.f10789c = abstractC6302f.mo10936e();
        this.f10791e = abstractC6302f.mo10933b();
        this.f10792f = abstractC6302f.mo10934c();
        this.f10790d = jsonLocation;
    }

    public C6500q() {
        super(0, -1);
        this.f10789c = null;
        this.f10790d = JsonLocation.f10025NA;
    }

    public C6500q(C6500q c6500q, int i11, int i12) {
        super(i11, i12);
        this.f10789c = c6500q;
        this.f10790d = c6500q.f10790d;
    }
}
