package com.kubi.kumex.utils;

import com.blankj.utilcode.util.C5303w0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.utils.a */
/* JADX INFO: compiled from: BooleanEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"geOrLe", "", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17033a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m36493a(boolean z11) {
        if (C5303w0.m6511a()) {
            if (!z11) {
                return "≥";
            }
            return "≤";
        }
        if (z11) {
            return "≥";
        }
        return "≤";
    }
}
