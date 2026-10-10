package com.sumsub.sns.core.presentation.form;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.presentation.android.C28710y;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28168e extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57417a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28169f f57418b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f57419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28168e(C28169f c28169f, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.f57418b = c28169f;
        this.f57419c = bundle;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28168e c28168e = new C28168e(this.f57418b, this.f57419c, continuation);
        c28168e.f57417a = obj;
        return c28168e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28168e) create((C28799f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Parcelable parcelableM69320a;
        RecyclerView.LayoutManager layoutManager;
        String[] strArr;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C28799f c28799f = (C28799f) this.f57417a;
        C28169f c28169f = this.f57418b;
        Bundle bundle = this.f57419c;
        C28165b c28165b = C28169f.f57420o;
        Logger.DefaultImpls.v$default(C33272c.f67812a, c28169f.m69113c(), "handleFormStateUpdated:", null, 4, null);
        C28801h c28801h = null;
        if (!c28799f.f58567b.isEmpty()) {
            C28710y c28710y = c28169f.f57426e;
            if (c28710y != null) {
                strArr = c28710y.f58385c;
            } else {
                strArr = null;
            }
            if (strArr == null && c28710y != null) {
                c28169f.getLifecycle().removeObserver(c28710y);
                c28169f.f57426e = null;
            }
            c28169f.m69110a(c28799f.f58568c, bundle);
        }
        c28169f.m69111a(c28799f.f58567b, c28799f.f58566a);
        C28801h c28801h2 = (C28801h) CollectionsKt.getOrNull(c28799f.f58567b, c28799f.f58566a);
        if (c28801h2 != null) {
            if (!c28801h2.f58573d.isEmpty()) {
                c28801h = c28801h2;
            }
            if (c28801h != null && bundle != null && (parcelableM69320a = AbstractC28437b.m69320a(bundle, "SCROLL_STATE", Parcelable.class, c28169f.requireContext())) != null) {
                RecyclerView recyclerViewM69112b = c28169f.m69112b();
                if (recyclerViewM69112b != null && (layoutManager = recyclerViewM69112b.getLayoutManager()) != null) {
                    layoutManager.onRestoreInstanceState(parcelableM69320a);
                }
                bundle.remove("SCROLL_STATE");
            }
        }
        return Unit.INSTANCE;
    }
}
