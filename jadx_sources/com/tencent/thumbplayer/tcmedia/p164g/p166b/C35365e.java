package com.tencent.thumbplayer.tcmedia.p164g.p166b;

import android.media.MediaFormat;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35381c;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.e */
/* JADX INFO: loaded from: classes64.dex */
public final class C35365e {

    /* JADX INFO: renamed from: d */
    public int f76082d;

    /* JADX INFO: renamed from: e */
    public int f76083e;

    /* JADX INFO: renamed from: f */
    public int f76084f;

    /* JADX INFO: renamed from: j */
    public final String f76088j;

    /* JADX INFO: renamed from: k */
    private boolean f76089k;

    /* JADX INFO: renamed from: l */
    private boolean f76090l;

    /* JADX INFO: renamed from: a */
    public ArrayList<byte[]> f76079a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public int f76080b = -1;

    /* JADX INFO: renamed from: c */
    public int f76081c = -1;

    /* JADX INFO: renamed from: g */
    public int f76085g = -1;

    /* JADX INFO: renamed from: h */
    public int f76086h = -1;

    /* JADX INFO: renamed from: i */
    public int f76087i = -1;

    /* JADX INFO: renamed from: a */
    public static int m78253a(MediaFormat mediaFormat, String str) {
        return m78254a(mediaFormat, str, -1);
    }

    /* JADX INFO: renamed from: a */
    public static int m78254a(MediaFormat mediaFormat, String str, int i11) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i11;
    }

    public C35365e(String str) {
        this.f76088j = str;
    }

    /* JADX INFO: renamed from: a */
    public static C35365e m78255a(MediaFormat mediaFormat) {
        C35365e c35365e = new C35365e(mediaFormat.getString("mime"));
        try {
            c35365e.f76084f = m78253a(mediaFormat, "sample-rate");
            c35365e.f76087i = m78253a(mediaFormat, "max-input-size");
            c35365e.f76079a = C35381c.m78343a(mediaFormat);
            if (!c35365e.m78258a()) {
                c35365e.f76083e = m78253a(mediaFormat, "channel-count");
                return c35365e;
            }
            c35365e.f76082d = m78253a(mediaFormat, MediaUtils.KEY_ROTATION);
            c35365e.f76080b = m78253a(mediaFormat, "width");
            c35365e.f76081c = m78253a(mediaFormat, "height");
            c35365e.f76085g = m78253a(mediaFormat, "max-width");
            c35365e.f76086h = m78253a(mediaFormat, "max-height");
            return c35365e;
        } catch (Throwable th2) {
            C35380b.m78335b("FormatWrapper", "create format error", th2);
            return c35365e;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m78256a(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(", length:");
        sb2.append(bArr.length);
        sb2.append("  [");
        for (int i11 = 0; i11 < Math.min(bArr.length, 20); i11++) {
            if (i11 != 0) {
                sb2.append(" ,");
            }
            sb2.append((int) bArr[i11]);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m78257a(ArrayList<byte[]> arrayList) {
        if (arrayList != null && C35380b.m78332a()) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sb2.append(m78256a(C35381c.f76193a[i11], arrayList.get(i11)));
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
            C35380b.m78334b("FormatWrapper", "csdData size:" + arrayList.size() + "    " + sb2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78258a() {
        if (!this.f76089k) {
            this.f76089k = true;
            this.f76090l = C35381c.m78346a(this.f76088j);
        }
        return this.f76090l;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78259a(C35365e c35365e) {
        if (this.f76079a.size() != c35365e.f76079a.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f76079a.size(); i11++) {
            if (!this.f76079a.get(i11).equals(c35365e.f76079a.get(i11))) {
                return false;
            }
        }
        return true;
    }
}
