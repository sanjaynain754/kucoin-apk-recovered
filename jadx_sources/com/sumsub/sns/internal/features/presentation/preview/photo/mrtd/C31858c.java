package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31858c extends AbstractC28787t {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty[] f64742i = {AbstractC28118g.m69077a(C31858c.class, "customViewContainer", "getCustomViewContainer()Landroid/widget/FrameLayout;", 0)};

    /* JADX INFO: renamed from: e */
    public final Function0 f64743e;

    /* JADX INFO: renamed from: f */
    public final String f64744f;

    /* JADX INFO: renamed from: g */
    public final C28778k f64745g;

    /* JADX INFO: renamed from: h */
    public boolean f64746h;

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        this.f64746h = false;
    }

    public C31858c(C31905w c31905w, Function0 function0) {
        super(c31905w.f58549a, c31905w);
        this.f64743e = function0;
        this.f64744f = "MrtdCustomLayoutState";
        this.f64745g = m69602a(R$id.sns_custom_view_container);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f64744f;
    }
}
