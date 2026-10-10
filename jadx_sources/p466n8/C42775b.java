package p466n8;

import android.text.TextUtils;
import com.github.penfeizhou.animation.p065io.C6953b;

/* JADX INFO: renamed from: n8.b */
/* JADX INFO: compiled from: WebPWriter.java */
/* JADX INFO: loaded from: classes.dex */
public class C42775b extends C6953b {
    /* JADX INFO: renamed from: g */
    public void m93728g(int i11) {
        m93730i(i11 - 1);
    }

    /* JADX INFO: renamed from: i */
    public void m93730i(int i11) {
        m12799b((byte) (i11 & 255));
        m12799b((byte) ((i11 >> 8) & 255));
        m12799b((byte) ((i11 >> 16) & 255));
    }

    /* JADX INFO: renamed from: j */
    public void m93731j(int i11) {
        m12799b((byte) (i11 & 255));
        m12799b((byte) ((i11 >> 8) & 255));
        m12799b((byte) ((i11 >> 16) & 255));
        m12799b((byte) ((i11 >> 24) & 255));
    }

    /* JADX INFO: renamed from: h */
    public void m93729h(String str) {
        if (!TextUtils.isEmpty(str) && str.length() == 4) {
            m12799b((byte) (str.charAt(0) & 255));
            m12799b((byte) (str.charAt(1) & 255));
            m12799b((byte) (str.charAt(2) & 255));
            m12799b((byte) (str.charAt(3) & 255));
            return;
        }
        m12801e(4);
    }
}
