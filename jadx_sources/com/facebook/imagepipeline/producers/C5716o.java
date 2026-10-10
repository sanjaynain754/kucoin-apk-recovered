package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import p651u3.C45098a;
import p712w3.C45708h;
import p749x5.C46075i;
import p819z3.InterfaceC46679h;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.o */
/* JADX INFO: compiled from: DataFetchProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5716o extends AbstractC5695g0 {
    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public static byte[] m9769g(String str) {
        C45708h.m100891b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        if (m9770h(str.substring(0, iIndexOf))) {
            return Base64.decode(strSubstring, 0);
        }
        String strDecode = Uri.decode(strSubstring);
        C45708h.m100896g(strDecode);
        return strDecode.getBytes();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public static boolean m9770h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] strArrSplit = str.split(";");
        return strArrSplit[strArrSplit.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    /* JADX INFO: renamed from: f */
    public String mo9573f() {
        return "DataFetchProducer";
    }

    public C5716o(InterfaceC46679h interfaceC46679h) {
        super(C45098a.m99711a(), interfaceC46679h);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    /* JADX INFO: renamed from: d */
    public C46075i mo9572d(ImageRequest imageRequest) throws IOException {
        byte[] bArrM9769g = m9769g(imageRequest.getSourceUri().toString());
        return m9692c(new ByteArrayInputStream(bArrM9769g), bArrM9769g.length);
    }
}
