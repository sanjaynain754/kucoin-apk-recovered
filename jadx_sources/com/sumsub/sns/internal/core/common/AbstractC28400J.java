package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.internal.core.data.serializer.C28530a;
import com.sumsub.sns.internal.core.data.serializer.C28532c;
import java.util.Date;
import kotlinx.serialization.modules.C41967c;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Reflection;
import xg0.AbstractC46162a;
import xg0.C46168d;
import xg0.C46185t;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28400J {
    /* JADX INFO: renamed from: a */
    public static final AbstractC46162a m69286a(final boolean z11) {
        return C46185t.m101852b(null, new Function1() { // from class: com.sumsub.sns.internal.core.common.g1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28400J.m69285a(z11, (C46168d) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69285a(boolean z11, C46168d c46168d) {
        c46168d.m101782e(true);
        c46168d.m101781d(true);
        c46168d.m101783f(z11);
        C41967c c41967c = new C41967c();
        c41967c.mo91989b(Reflection.getOrCreateKotlinClass(Object.class), C28532c.f58084a);
        c41967c.mo91989b(Reflection.getOrCreateKotlinClass(Date.class), C28530a.f58079a);
        c46168d.m101784g(c41967c.m92035f());
        c46168d.m101780c(true);
        return Unit.INSTANCE;
    }
}
