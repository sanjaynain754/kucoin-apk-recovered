package com.sumsub.sns.internal.features.data.repository.applicant;

import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.domain.C30303o0;
import java.io.File;
import java.util.Map;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.applicant.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29920c {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m70003a(InterfaceC29921d interfaceC29921d, String str, File file, String str2, IdentitySide identitySide, Map map, C29070X c29070x, C30303o0 c30303o0, ContinuationImpl continuationImpl, int i11) {
        if ((i11 & 8) != 0) {
            identitySide = null;
        }
        if ((i11 & 16) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i11 & 32) != 0) {
            c29070x = null;
        }
        return ((C29950z) interfaceC29921d).m70014a(str, file, str2, identitySide, map, c29070x, c30303o0, continuationImpl);
    }
}
