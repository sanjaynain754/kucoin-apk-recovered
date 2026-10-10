package com.geetest.captcha;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.geetest.captcha.y */
/* JADX INFO: loaded from: classes45.dex */
public final class C6705y {

    /* JADX INFO: renamed from: a */
    public final int f11249a;

    /* JADX INFO: renamed from: b */
    public final int f11250b;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6705y)) {
            return false;
        }
        C6705y c6705y = (C6705y) obj;
        return this.f11249a == c6705y.f11249a && this.f11250b == c6705y.f11250b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11250b) + (Integer.hashCode(this.f11249a) * 31);
    }

    @NotNull
    public final String toString() {
        return "ScreenMetrics(width=" + this.f11249a + ", height=" + this.f11250b + ')';
    }

    public C6705y(int i11, int i12) {
        this.f11249a = i11;
        this.f11250b = i12;
    }
}
