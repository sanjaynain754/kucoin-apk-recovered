package com.kubi.kumex.dialog;

import androidx.lifecycle.Observer;
import com.kubi.kumex.data.trade.model.PositionEntity;

/* JADX INFO: renamed from: com.kubi.kumex.dialog.w0 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C15952w0 implements Observer {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LimitCloseDialog f29002b;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        LimitCloseDialog.m4(this.f29002b, (PositionEntity) obj);
    }
}
