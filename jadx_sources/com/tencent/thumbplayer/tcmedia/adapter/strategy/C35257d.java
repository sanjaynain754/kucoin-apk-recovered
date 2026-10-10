package com.tencent.thumbplayer.tcmedia.adapter.strategy;

import com.tencent.thumbplayer.tcmedia.adapter.C35244b;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.p154a.C35253a;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.p154a.C35254b;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.strategy.d */
/* JADX INFO: loaded from: classes62.dex */
public class C35257d extends AbstractC35255b {

    /* JADX INFO: renamed from: b */
    private int f75800b;

    /* JADX INFO: renamed from: c */
    private int[] f75801c;

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.AbstractC35255b, com.tencent.thumbplayer.tcmedia.adapter.strategy.InterfaceC35252a
    /* JADX INFO: renamed from: a */
    public int mo77841a(C35244b c35244b) {
        int[] iArr = this.f75801c;
        int length = iArr.length;
        int i11 = this.f75800b;
        int i12 = length > i11 ? iArr[i11] : 0;
        int i13 = (!(i12 == 2 || i12 == 3) || m77853b(c35244b)) ? i12 : 0;
        TPLogUtil.m78800i("TPThumbPlayer[TPExtStrategy.java]", "strategyForOpen, playerType:".concat(String.valueOf(i13)));
        return i13;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.AbstractC35255b, com.tencent.thumbplayer.tcmedia.adapter.strategy.InterfaceC35252a
    /* JADX INFO: renamed from: a */
    public int mo77842a(C35244b c35244b, C35254b c35254b) {
        int i11;
        if (c35254b != null && c35254b.m77851a() == 0) {
            return mo77841a(c35244b);
        }
        int[] iArr = this.f75801c;
        int length = iArr.length - 1;
        int i12 = this.f75800b;
        if (length > i12) {
            int i13 = i12 + 1;
            this.f75800b = i13;
            i11 = iArr[i13];
        } else {
            i11 = 0;
        }
        int i14 = (!(i11 == 2 || i11 == 3) || m77853b(c35244b)) ? i11 : 0;
        TPLogUtil.m78800i("TPThumbPlayer[TPExtStrategy.java]", "strategyForRetry, playerType:".concat(String.valueOf(i14)));
        return i14;
    }

    public C35257d(C35253a c35253a) {
        super(c35253a);
        this.f75800b = 0;
        int[] iArrM77849c = c35253a.m77849c();
        this.f75801c = iArrM77849c;
        if (iArrM77849c != null && iArrM77849c.length != 0) {
            return;
        }
        this.f75801c = new int[1];
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.AbstractC35255b, com.tencent.thumbplayer.tcmedia.adapter.strategy.InterfaceC35252a
    /* JADX INFO: renamed from: a */
    public int[] mo77843a() {
        StringBuilder sb2;
        int i11;
        int[] iArr = {-1};
        int i12 = this.f75800b;
        int[] iArr2 = this.f75801c;
        if (i12 >= iArr2.length) {
            sb2 = new StringBuilder("strategyForDec error, decType:");
            i11 = iArr[0];
        } else {
            int i13 = iArr2[i12];
            if (i13 == 1 || i13 == 2) {
                iArr[0] = 102;
            } else if (i13 == 3) {
                iArr[0] = 101;
            }
            sb2 = new StringBuilder("strategyForDec, decType:");
            i11 = iArr[0];
        }
        sb2.append(i11);
        TPLogUtil.m78800i("TPThumbPlayer[TPExtStrategy.java]", sb2.toString());
        return iArr;
    }
}
