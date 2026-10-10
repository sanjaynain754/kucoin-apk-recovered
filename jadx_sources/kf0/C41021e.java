package kf0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.text.ttml.TtmlNode;
import gf0.AbstractC37904b;
import gf0.C37905c;
import java.util.Map;
import lf0.C42185d;

/* JADX INFO: renamed from: kf0.e */
/* JADX INFO: compiled from: ImageSizeParserImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41021e implements C41020d.a {

    /* JADX INFO: renamed from: a */
    public final AbstractC37904b f91253a;

    @Override // kf0.C41020d.a
    public C42185d parse(@NonNull Map<String, String> map) {
        C42185d.a aVarM89976a;
        C42185d.a aVarM89976a2;
        String str = map.get(TtmlNode.TAG_STYLE);
        if (!TextUtils.isEmpty(str)) {
            aVarM89976a = null;
            aVarM89976a2 = null;
            for (C37905c c37905c : this.f91253a.mo85680b(str)) {
                String strM85686a = c37905c.m85686a();
                if ("width".equals(strM85686a)) {
                    aVarM89976a = m89976a(c37905c.m85688c());
                } else if ("height".equals(strM85686a)) {
                    aVarM89976a2 = m89976a(c37905c.m85688c());
                }
                if (aVarM89976a != null && aVarM89976a2 != null) {
                    break;
                }
            }
        } else {
            aVarM89976a = null;
            aVarM89976a2 = null;
        }
        if (aVarM89976a != null && aVarM89976a2 != null) {
            return new C42185d(aVarM89976a, aVarM89976a2);
        }
        if (aVarM89976a == null) {
            aVarM89976a = m89976a(map.get("width"));
        }
        if (aVarM89976a2 == null) {
            aVarM89976a2 = m89976a(map.get("height"));
        }
        if (aVarM89976a == null && aVarM89976a2 == null) {
            return null;
        }
        return new C42185d(aVarM89976a, aVarM89976a2);
    }

    public C41021e(@NonNull AbstractC37904b abstractC37904b) {
        this.f91253a = abstractC37904b;
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public C42185d.a m89976a(@Nullable String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        int i11 = length - 1;
        for (int i12 = i11; i12 > -1; i12--) {
            if (Character.isDigit(str.charAt(i12))) {
                int i13 = i12 + 1;
                try {
                    float f11 = Float.parseFloat(str.substring(0, i13));
                    if (i12 == i11) {
                        strSubstring = null;
                    } else {
                        strSubstring = str.substring(i13, length);
                    }
                    return new C42185d.a(f11, strSubstring);
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
