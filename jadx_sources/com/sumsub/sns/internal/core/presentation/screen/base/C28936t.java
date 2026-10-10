package com.sumsub.sns.internal.core.presentation.screen.base;

import androidx.lifecycle.SavedStateHandle;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28936t {

    /* JADX INFO: renamed from: a */
    public final SavedStateHandle f58834a;

    /* JADX INFO: renamed from: b */
    public final String f58835b;

    /* JADX INFO: renamed from: c */
    public final Object f58836c;

    /* JADX INFO: renamed from: d */
    public final boolean f58837d;

    /* JADX INFO: renamed from: a */
    public final Object m69705a() {
        Object obj = this.f58834a.get(this.f58835b);
        if (obj == null) {
            obj = this.f58836c;
            if (this.f58837d) {
                this.f58834a.set(this.f58835b, obj);
            }
        }
        return obj;
    }

    public C28936t(SavedStateHandle savedStateHandle, String str, Object obj, boolean z11) {
        this.f58834a = savedStateHandle;
        this.f58835b = str;
        this.f58836c = obj;
        this.f58837d = z11;
    }
}
