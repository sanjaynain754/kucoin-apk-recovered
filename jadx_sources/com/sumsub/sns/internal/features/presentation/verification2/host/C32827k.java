package com.sumsub.sns.internal.features.presentation.verification2.host;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32827k {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty[] f67173c = {AbstractC28639a.m69485a(C32827k.class, "latestAttempt", "getLatestAttempt()Lcom/sumsub/sns/internal/features/presentation/verification2/host/VerificationAttempt;", 0)};

    /* JADX INFO: renamed from: a */
    public final C28936t f67174a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41678w f67175b;

    public C32827k(SavedStateHandle savedStateHandle) {
        this.f67174a = new C28936t(savedStateHandle, "latestVerificationAttempt", null, false);
        this.f67175b = savedStateHandle.getStateFlow("latestVerificationAttempt", null);
    }
}
