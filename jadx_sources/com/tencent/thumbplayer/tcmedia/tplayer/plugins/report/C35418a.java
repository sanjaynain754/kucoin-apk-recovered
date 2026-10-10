package com.tencent.thumbplayer.tcmedia.tplayer.plugins.report;

import com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.a */
/* JADX INFO: loaded from: classes64.dex */
public class C35418a implements InterfaceC35415a {
    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: a */
    public void mo78182a() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: a */
    public void mo78183a(int i11, int i12, int i13, String str, Object obj) {
        String strConcat;
        switch (i11) {
            case 101:
                strConcat = "create player adapter";
                break;
            case 102:
                strConcat = "start prepare";
                break;
            case 103:
                strConcat = "on prepared";
                break;
            case 104:
                strConcat = "start play";
                break;
            case 105:
            default:
                return;
            case 106:
                strConcat = "on paused";
                break;
            case 107:
                strConcat = "on stoped";
                break;
            case 108:
                strConcat = "on error:".concat(String.valueOf(i12));
                break;
            case 109:
                strConcat = "start seek";
                break;
            case 110:
                strConcat = "seek complete";
                break;
            case 111:
                strConcat = "on play complete";
                break;
            case 112:
                strConcat = "on release";
                break;
            case 113:
                strConcat = "on reset";
                break;
        }
        TPLogUtil.m78796d("TPLogPlugin", strConcat);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: b */
    public void mo78184b() {
    }
}
