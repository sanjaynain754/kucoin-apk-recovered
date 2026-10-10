package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31879j implements InterfaceC28773g {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty[] f64785e = {AbstractC28639a.m69485a(C31879j.class, "isShowing", "isShowing()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final Function0 f64786a;

    /* JADX INFO: renamed from: b */
    public final Function0 f64787b;

    /* JADX INFO: renamed from: c */
    public final C28936t f64788c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w f64789d;

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g
    public final InterfaceC41678w getState() {
        return this.f64789d;
    }

    public C31879j(InterfaceC41709m0 interfaceC41709m0, SavedStateHandle savedStateHandle, Function0 function0, Function0 function1) {
        this.f64786a = function0;
        this.f64787b = function1;
        Boolean bool = Boolean.FALSE;
        this.f64788c = new C28936t(savedStateHandle, "STATE_IS_SHOWING_EXIT_CONFIRMATION", bool, false);
        this.f64789d = C41636g.m90916g0(new C31876i(savedStateHandle.getStateFlow("STATE_IS_SHOWING_EXIT_CONFIRMATION", bool)), interfaceC41709m0, SharingStarted.INSTANCE.getLazily(), C31864e.f64752a);
    }
}
