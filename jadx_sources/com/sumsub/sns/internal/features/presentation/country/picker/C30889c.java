package com.sumsub.sns.internal.features.presentation.country.picker;

import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.Set;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30889c extends FunctionReferenceImpl implements Function1 {
    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C30877b c30877b = (C30877b) obj;
        C30891d c30891d = (C30891d) this.receiver;
        Set set = c30891d.f62408f;
        Set setMinus = set.contains(c30877b) ? SetsKt.minus((Set<? extends C30877b>) set, c30877b) : SetsKt.plus((Set<? extends C30877b>) set, c30877b);
        c30891d.f62408f = setMinus;
        c30891d.f62409g.setValue(setMinus);
        return Unit.INSTANCE;
    }

    public C30889c(C30891d c30891d) {
        super(1, c30891d, C30891d.class, "onItemClicked", "onItemClicked(Lcom/sumsub/sns/internal/features/presentation/country/CountryItem;)V", 0);
    }
}
