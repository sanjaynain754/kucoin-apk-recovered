package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC31234Y extends AbstractC31245b0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public C29697t2 f63190a;

    /* JADX INFO: renamed from: b */
    public final boolean f63191b;

    public AbstractC31234Y(C29697t2 c29697t2) {
        this.f63190a = c29697t2;
        this.f63191b = true;
    }

    public AbstractC31234Y(C29697t2 c29697t2, int i11) {
        this.f63190a = (i11 & 1) != 0 ? null : c29697t2;
        this.f63191b = false;
    }
}
