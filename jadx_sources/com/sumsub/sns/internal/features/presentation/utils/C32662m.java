package com.sumsub.sns.internal.features.presentation.utils;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32662m {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty[] f66654e = {AbstractC28639a.m69485a(C32662m.class, "side", "getSide()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;", 0), AbstractC28639a.m69485a(C32662m.class, "sideness", "getSideness()Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;", 0)};

    /* JADX INFO: renamed from: a */
    public final Document f66655a;

    /* JADX INFO: renamed from: b */
    public final SecondSidePolicy f66656b;

    /* JADX INFO: renamed from: c */
    public final C28936t f66657c;

    /* JADX INFO: renamed from: d */
    public final C28936t f66658d;

    /* JADX INFO: renamed from: a */
    public final IdentitySide m71283a() {
        C28936t c28936t = this.f66657c;
        KProperty kProperty = f66654e[0];
        return (IdentitySide) c28936t.m69705a();
    }

    public C32662m(SavedStateHandle savedStateHandle, Document document, SecondSidePolicy secondSidePolicy) {
        this.f66655a = document;
        this.f66656b = secondSidePolicy;
        this.f66657c = new C28936t(savedStateHandle, "KEY_IDENTITY_SIDE", IdentitySide.Front, false);
        this.f66658d = new C28936t(savedStateHandle, "KEY_DOCUMENT_SIDENESS", DocumentSideness.UNKNOWN, false);
    }
}
