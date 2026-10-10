package com.sumsub.sns.internal.features.presentation.intro;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import java.util.HashMap;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.intro.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31161n extends AbstractC28073M0 {

    /* JADX INFO: renamed from: a */
    public final String f63001a;

    /* JADX INFO: renamed from: b */
    public final String f63002b;

    /* JADX INFO: renamed from: c */
    public final String f63003c;

    /* JADX INFO: renamed from: d */
    public final String f63004d;

    /* JADX INFO: renamed from: e */
    public final boolean f63005e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC31150c f63006f;

    /* JADX INFO: renamed from: g */
    public final C31283h f63007g;

    /* JADX INFO: renamed from: h */
    public final HashMap f63008h;

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final /* bridge */ /* synthetic */ InterfaceC28147s getDefaultState() {
        return C31158k.f62997a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        AbstractC28073M0.updateState$default(this, false, new C31160m(this, null), 1, null);
        return Unit.INSTANCE;
    }

    public C31161n(String str, String str2, String str3, String str4, boolean z11, InterfaceC31150c interfaceC31150c, C31283h c31283h, HashMap map, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m);
        this.f63001a = str;
        this.f63002b = str2;
        this.f63003c = str3;
        this.f63004d = str4;
        this.f63005e = z11;
        this.f63006f = interfaceC31150c;
        this.f63007g = c31283h;
        this.f63008h = map;
    }
}
