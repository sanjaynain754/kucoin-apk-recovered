package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.os.Bundle;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30590m {
    /* JADX INFO: renamed from: a */
    public static C30471K m70412a(boolean z11, C29070X c29070x, List list, boolean z12, String str, DocCapture$PreferredMode docCapture$PreferredMode, boolean z13, String str2) {
        C30471K c30471k = new C30471K();
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
        c30471k.setArguments(bundle);
        return c30471k;
    }
}
