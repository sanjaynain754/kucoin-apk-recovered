package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.os.Bundle;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30654y {
    /* JADX INFO: renamed from: a */
    public static AbstractC28064I m70415a(C30119M c30119m) {
        if (C33048a.f67488u.m71434a()) {
            return m70416a(c30119m.f60550a, c30119m.f60551b.getType(), c30119m.f60552c, c30119m.f60553d, c30119m.f60554e, c30119m.f60556g, c30119m.f60555f, c30119m.f60557h, c30119m.f60551b, c30119m.f60558i);
        }
        C30471K.f61458R.getClass();
        return C30590m.m70412a(c30119m.f60550a, c30119m.f60551b.getType(), c30119m.f60552c, c30119m.f60553d, c30119m.f60554e, c30119m.f60556g, c30119m.f60555f, c30119m.f60557h);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC28064I m70416a(boolean z11, C29070X c29070x, List list, boolean z12, String str, DocCapture$PreferredMode docCapture$PreferredMode, boolean z13, String str2, Document document, boolean z14) {
        if (!C33048a.f67488u.m71434a()) {
            C30471K.f61458R.getClass();
            return C30590m.m70412a(z11, c29070x, list, z12, str, docCapture$PreferredMode, z13, str2);
        }
        C30468J c30468j = new C30468J();
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_IS_SEAMLESS", z11);
        bundle.putString("EXTRA_DOCUMENT_TYPE", c29070x.f59014a);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((IdentitySide) it.next()).getValue());
        }
        bundle.putStringArrayList("EXTRA_DOCUMENT_SIDES", new ArrayList<>(arrayList));
        bundle.putBoolean("EXTRA_GALLERY_AVAILABLE", z12 || C33048a.f67483p.m71434a());
        bundle.putString("EXTRA_PREFER_AUTO_CAPTURE", docCapture$PreferredMode != null ? docCapture$PreferredMode.getValue() : null);
        bundle.putBoolean("EXTRA_IS_RETAKE", z13);
        if (str != null) {
            bundle.putString("EXTRA_ONLY_ID_DOC", str);
        }
        if (str2 != null) {
            bundle.putString("EXTRA_COUNTRY_CODE", str2);
        }
        if (document != null) {
            bundle.putParcelable("EXTRA_DOCUMENT", document);
        }
        bundle.putBoolean("EXTRA_ALLOW_IN_PLACE_UPLOAD", z14);
        c30468j.setArguments(bundle);
        return c30468j;
    }
}
