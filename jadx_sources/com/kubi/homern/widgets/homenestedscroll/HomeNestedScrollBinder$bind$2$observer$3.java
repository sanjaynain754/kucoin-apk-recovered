package com.kubi.homern.widgets.homenestedscroll;

import android.view.View;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeNestedScrollBinder.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class HomeNestedScrollBinder$bind$2$observer$3 extends FunctionReferenceImpl implements Function1<View, Unit> {
    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    public HomeNestedScrollBinder$bind$2$observer$3(Object obj) {
        super(1, obj, HomeNestedScrollBinder.class, "setCurrentFeed", "setCurrentFeed(Landroid/view/View;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        ((HomeNestedScrollBinder) this.receiver).m31319t(p11);
    }
}
