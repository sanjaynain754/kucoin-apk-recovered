package p285g7;

import com.fasterxml.jackson.core.C6301e;
import com.fasterxml.jackson.core.filter.TokenFilter;

/* JADX INFO: renamed from: g7.a */
/* JADX INFO: compiled from: JsonPointerBasedFilter.java */
/* JADX INFO: loaded from: classes45.dex */
public class C37829a extends TokenFilter {

    /* JADX INFO: renamed from: b */
    public final C6301e f85206b;

    public C37829a(String str) {
        this(C6301e.m10925e(str));
    }

    public C37829a(C6301e c6301e) {
        this.f85206b = c6301e;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    /* JADX INFO: renamed from: a */
    public boolean mo10942a() {
        return this.f85206b.m10930j();
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    /* JADX INFO: renamed from: e */
    public TokenFilter mo10946e(int i11) {
        C6301e c6301eM10928h = this.f85206b.m10928h(i11);
        if (c6301eM10928h == null) {
            return null;
        }
        return c6301eM10928h.m10930j() ? TokenFilter.f10052a : new C37829a(c6301eM10928h);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    /* JADX INFO: renamed from: f */
    public TokenFilter mo10947f(String str) {
        C6301e c6301eM10929i = this.f85206b.m10929i(str);
        if (c6301eM10929i == null) {
            return null;
        }
        return c6301eM10929i.m10930j() ? TokenFilter.f10052a : new C37829a(c6301eM10929i);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public String toString() {
        return "[JsonPointerFilter at: " + this.f85206b + "]";
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    /* JADX INFO: renamed from: c */
    public TokenFilter mo10944c() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    /* JADX INFO: renamed from: d */
    public TokenFilter mo10945d() {
        return this;
    }
}
