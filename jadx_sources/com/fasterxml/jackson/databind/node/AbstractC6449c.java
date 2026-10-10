package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6391f;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.c */
/* JADX INFO: compiled from: NodeCursor.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6449c extends AbstractC6302f {

    /* JADX INFO: renamed from: c */
    public final AbstractC6449c f10576c;

    /* JADX INFO: renamed from: d */
    public String f10577d;

    /* JADX INFO: renamed from: e */
    public Object f10578e;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.c$a */
    /* JADX INFO: compiled from: NodeCursor.java */
    public static final class a extends AbstractC6449c {

        /* JADX INFO: renamed from: f */
        public Iterator<AbstractC6391f> f10579f;

        /* JADX INFO: renamed from: g */
        public AbstractC6391f f10580g;

        public a(AbstractC6391f abstractC6391f, AbstractC6449c abstractC6449c) {
            super(1, abstractC6449c);
            this.f10579f = abstractC6391f.elements();
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: k */
        public AbstractC6391f mo11729k() {
            return this.f10580g;
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: m */
        public JsonToken mo11731m() {
            if (!this.f10579f.hasNext()) {
                this.f10580g = null;
                return JsonToken.END_ARRAY;
            }
            this.f10051b++;
            AbstractC6391f next = this.f10579f.next();
            this.f10580g = next;
            return next.asToken();
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: n */
        public AbstractC6449c mo11732n() {
            return new a(this.f10580g, this);
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: o */
        public AbstractC6449c mo11733o() {
            return new b(this.f10580g, this);
        }

        @Override // com.fasterxml.jackson.core.AbstractC6302f
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC6302f mo10936e() {
            return super.m11730l();
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.c$b */
    /* JADX INFO: compiled from: NodeCursor.java */
    public static final class b extends AbstractC6449c {

        /* JADX INFO: renamed from: f */
        public Iterator<Map.Entry<String, AbstractC6391f>> f10581f;

        /* JADX INFO: renamed from: g */
        public Map.Entry<String, AbstractC6391f> f10582g;

        /* JADX INFO: renamed from: h */
        public boolean f10583h;

        public b(AbstractC6391f abstractC6391f, AbstractC6449c abstractC6449c) {
            super(2, abstractC6449c);
            this.f10581f = ((ObjectNode) abstractC6391f).fields();
            this.f10583h = true;
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: k */
        public AbstractC6391f mo11729k() {
            Map.Entry<String, AbstractC6391f> entry = this.f10582g;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: m */
        public JsonToken mo11731m() {
            if (!this.f10583h) {
                this.f10583h = true;
                return this.f10582g.getValue().asToken();
            }
            if (!this.f10581f.hasNext()) {
                this.f10577d = null;
                this.f10582g = null;
                return JsonToken.END_OBJECT;
            }
            this.f10051b++;
            this.f10583h = false;
            Map.Entry<String, AbstractC6391f> next = this.f10581f.next();
            this.f10582g = next;
            this.f10577d = next != null ? next.getKey() : null;
            return JsonToken.FIELD_NAME;
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: n */
        public AbstractC6449c mo11732n() {
            return new a(mo11729k(), this);
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: o */
        public AbstractC6449c mo11733o() {
            return new b(mo11729k(), this);
        }

        @Override // com.fasterxml.jackson.core.AbstractC6302f
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC6302f mo10936e() {
            return super.m11730l();
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.c$c */
    /* JADX INFO: compiled from: NodeCursor.java */
    public static final class c extends AbstractC6449c {

        /* JADX INFO: renamed from: f */
        public AbstractC6391f f10584f;

        /* JADX INFO: renamed from: g */
        public boolean f10585g;

        public c(AbstractC6391f abstractC6391f, AbstractC6449c abstractC6449c) {
            super(0, abstractC6449c);
            this.f10585g = false;
            this.f10584f = abstractC6391f;
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: k */
        public AbstractC6391f mo11729k() {
            if (this.f10585g) {
                return this.f10584f;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: m */
        public JsonToken mo11731m() {
            if (this.f10585g) {
                this.f10584f = null;
                return null;
            }
            this.f10051b++;
            this.f10585g = true;
            return this.f10584f.asToken();
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: n */
        public AbstractC6449c mo11732n() {
            return new a(this.f10584f, this);
        }

        @Override // com.fasterxml.jackson.databind.node.AbstractC6449c
        /* JADX INFO: renamed from: o */
        public AbstractC6449c mo11733o() {
            return new b(this.f10584f, this);
        }

        @Override // com.fasterxml.jackson.core.AbstractC6302f
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC6302f mo10936e() {
            return super.m11730l();
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract AbstractC6391f mo11729k();

    /* JADX INFO: renamed from: m */
    public abstract JsonToken mo11731m();

    /* JADX INFO: renamed from: n */
    public abstract AbstractC6449c mo11732n();

    /* JADX INFO: renamed from: o */
    public abstract AbstractC6449c mo11733o();

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: b */
    public final String mo10933b() {
        return this.f10577d;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: c */
    public Object mo10934c() {
        return this.f10578e;
    }

    @Override // com.fasterxml.jackson.core.AbstractC6302f
    /* JADX INFO: renamed from: i */
    public void mo10940i(Object obj) {
        this.f10578e = obj;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC6449c m11730l() {
        return this.f10576c;
    }

    public AbstractC6449c(int i11, AbstractC6449c abstractC6449c) {
        this.f10050a = i11;
        this.f10051b = -1;
        this.f10576c = abstractC6449c;
    }
}
