package com.tencent.thumbplayer.tcmedia.p164g.p171f;

import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.p164g.C35357a;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35361a;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35365e;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35367g;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35381c;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.f.a */
/* JADX INFO: loaded from: classes64.dex */
public final class C35376a {

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.f.a$a */
    public enum a {
        ADAPTATION_WORKAROUND_MODE_NEVER,
        ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION,
        ADAPTATION_WORKAROUND_MODE_ALWAYS
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.f.a$b */
    public enum b {
        KEEP_CODEC_RESULT_NO,
        KEEP_CODEC_RESULT_YES_WITH_FLUSH,
        KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION,
        KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION
    }

    /* JADX INFO: renamed from: a */
    public static a m78315a(String str) {
        return (Build.VERSION.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (TPSystemInfo.getDeviceName().startsWith("SM-T585") || TPSystemInfo.getDeviceName().startsWith("SM-A510") || TPSystemInfo.getDeviceName().startsWith("SM-A520") || TPSystemInfo.getDeviceName().startsWith("SM-J700"))) ? a.ADAPTATION_WORKAROUND_MODE_ALWAYS : a.ADAPTATION_WORKAROUND_MODE_NEVER;
    }

    /* JADX INFO: renamed from: a */
    public static void m78316a(C35365e c35365e, MediaFormat mediaFormat) {
        C35377b c35377bM78199d = C35357a.m78185a().m78199d();
        int iMax = Math.max(c35377bM78199d.f76177b, c35365e.f76080b);
        int iMax2 = Math.max(c35377bM78199d.f76178c, c35365e.f76081c);
        if (c35377bM78199d.f76176a) {
            c35377bM78199d.f76177b = iMax;
            c35377bM78199d.f76178c = iMax2;
        }
        int iMax3 = Math.max(0, C35381c.m78341a(c35365e.f76088j, iMax, iMax2, false));
        if (C35380b.m78332a()) {
            C35380b.m78334b("ReuseHelper", "initFormatWrapper initWidth:" + iMax + " initHeight:" + iMax2 + " initMaxInputSize:" + iMax3 + " reusePolicy:" + c35377bM78199d);
        }
        c35365e.f76085g = iMax;
        c35365e.f76086h = iMax2;
        c35365e.f76087i = iMax3;
        mediaFormat.setInteger("max-input-size", Math.max(iMax3, 0));
        if (c35365e.m78258a()) {
            mediaFormat.setInteger("max-width", iMax);
            mediaFormat.setInteger("max-height", iMax2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78317a(AbstractC35366f abstractC35366f, C35365e c35365e) {
        return m78318a(abstractC35366f, c35365e, false);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78318a(AbstractC35366f abstractC35366f, C35365e c35365e, boolean z11) {
        C35365e c35365e2 = abstractC35366f.f76098e;
        if (abstractC35366f instanceof C35367g) {
            return TextUtils.equals(c35365e2.f76088j, c35365e.f76088j) && c35365e2.f76082d == c35365e.f76082d && (abstractC35366f.f76096c || (c35365e2.f76080b == c35365e.f76080b && c35365e2.f76081c == c35365e.f76081c));
        }
        if (!(abstractC35366f instanceof C35361a)) {
            return true;
        }
        if (TextUtils.equals("audio/mp4a-latm", c35365e2.f76088j)) {
            TextUtils.equals(c35365e2.f76088j, c35365e.f76088j);
        }
        return false;
    }
}
