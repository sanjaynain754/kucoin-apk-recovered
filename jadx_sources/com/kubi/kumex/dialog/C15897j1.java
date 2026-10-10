package com.kubi.kumex.dialog;

import androidx.lifecycle.Observer;
import com.kubi.kumex.data.trade.model.PositionEntity;

/* JADX INFO: renamed from: com.kubi.kumex.dialog.j1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C15897j1 implements Observer {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MarketCloseDialog f28935b;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MarketCloseDialog.s4(this.f28935b, (PositionEntity) obj);
    }
}
