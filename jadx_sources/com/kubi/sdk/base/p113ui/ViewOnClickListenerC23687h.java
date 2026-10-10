package com.kubi.sdk.base.p113ui;

import android.view.View;

/* JADX INFO: renamed from: com.kubi.sdk.base.ui.h */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC23687h implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OldBaseFragment f46518b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f46518b.retryClick(view);
    }

    public /* synthetic */ ViewOnClickListenerC23687h(OldBaseFragment oldBaseFragment) {
        this.f46518b = oldBaseFragment;
    }
}
