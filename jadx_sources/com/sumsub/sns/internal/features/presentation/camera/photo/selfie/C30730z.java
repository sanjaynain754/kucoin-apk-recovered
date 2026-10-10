package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28881b;
import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28885f;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30730z extends AbstractC30359W {
    public C30730z(SavedStateHandle savedStateHandle, C29070X c29070x, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, String str, boolean z11) {
        super(c29070x, null, str, z11, interfaceC29953a, interfaceC29984m, savedStateHandle);
    }

    @Override // com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W
    /* JADX INFO: renamed from: a */
    public final AbstractC28885f mo70244a(AbstractC29172p abstractC29172p, C28895g c28895g) {
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Selfie With Document Picker", null, 4, null);
        C29983l strings = getStrings();
        C29070X c29070x = this.f61055a;
        return AbstractC28881b.m69665a(strings, c29070x, abstractC29172p.m69794a(c29070x), c28895g, CollectionsKt.emptyList(), null);
    }
}
