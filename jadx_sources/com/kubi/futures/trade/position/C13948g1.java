package com.kubi.futures.trade.position;

import com.kubi.resources.dialog.DialogFragmentHelper;
import io.chad.library.adapter.base.BaseViewHolder;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.kubi.futures.trade.position.g1 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C13948g1 implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f24170b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FuturesPositionFragment f24171c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref.BooleanRef f24172d;

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
        FuturesPositionFragment.j3(this.f24170b, this.f24171c, this.f24172d, baseViewHolder, dialogFragmentHelper);
    }

    public /* synthetic */ C13948g1(boolean z11, FuturesPositionFragment futuresPositionFragment, Ref.BooleanRef booleanRef) {
        this.f24170b = z11;
        this.f24171c = futuresPositionFragment;
        this.f24172d = booleanRef;
    }
}
