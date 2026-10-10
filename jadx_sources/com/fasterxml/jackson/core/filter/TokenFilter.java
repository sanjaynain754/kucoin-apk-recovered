package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class TokenFilter {

    /* JADX INFO: renamed from: a */
    public static final TokenFilter f10052a = new TokenFilter();

    public enum Inclusion {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL
    }

    /* JADX INFO: renamed from: a */
    public boolean mo10942a() {
        return true;
    }

    public String toString() {
        return this == f10052a ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }

    /* JADX INFO: renamed from: h */
    public boolean m10949h(JsonParser jsonParser) throws IOException {
        return mo10942a();
    }

    /* JADX INFO: renamed from: b */
    public void m10943b() {
    }

    /* JADX INFO: renamed from: c */
    public TokenFilter mo10944c() {
        return this;
    }

    /* JADX INFO: renamed from: d */
    public TokenFilter mo10945d() {
        return this;
    }

    /* JADX INFO: renamed from: e */
    public TokenFilter mo10946e(int i11) {
        return this;
    }

    /* JADX INFO: renamed from: f */
    public TokenFilter mo10947f(String str) {
        return this;
    }

    /* JADX INFO: renamed from: g */
    public TokenFilter m10948g(int i11) {
        return this;
    }
}
