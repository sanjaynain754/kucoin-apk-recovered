package com.kubi.futures.trade.position;

import android.content.DialogInterface;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.v0 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC14030v0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.BooleanRef f24257b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FuturesPositionFragment f24258c;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        FuturesPositionFragment.l3(this.f24257b, this.f24258c, dialogInterface, i11);
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC14030v0(Ref.BooleanRef booleanRef, FuturesPositionFragment futuresPositionFragment) {
        this.f24257b = booleanRef;
        this.f24258c = futuresPositionFragment;
    }
}
