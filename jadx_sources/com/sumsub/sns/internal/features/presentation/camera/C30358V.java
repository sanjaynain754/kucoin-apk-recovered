package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28885f;
import com.sumsub.sns.internal.core.presentation.helper.camera.C28883d;
import com.sumsub.sns.internal.core.presentation.intro.C28890b;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30358V extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30359W f61050b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f61051c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC29172p f61052d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f61053e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30358V(AbstractC30359W abstractC30359W, String str, AbstractC29172p abstractC29172p, String str2, Continuation continuation) {
        super(2, continuation);
        this.f61050b = abstractC30359W;
        this.f61051c = str;
        this.f61052d = abstractC29172p;
        this.f61053e = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30358V c30358v = new C30358V(this.f61050b, this.f61051c, this.f61052d, this.f61053e, continuation);
        c30358v.f61049a = obj;
        return c30358v;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30358V) create((C30351N) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        AbstractC28885f abstractC28885fMo70244a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30351N c30351n = (C30351N) this.f61049a;
        AbstractC30359W abstractC30359W = this.f61050b;
        int i11 = AbstractC30359W.f61054V;
        C29124h config = abstractC30359W.getConfig();
        boolean zM69774a = false;
        if (config != null) {
            String str = this.f61051c;
            if (((IdentitySide) this.f61050b.f61060f.get("current_side")) == IdentitySide.Back) {
                zM69774a = true;
            }
            zM69774a = AbstractC29130i.m69774a(config, str, zM69774a);
        }
        String strM69795b = this.f61050b.f61057c;
        if (strM69795b == null) {
            strM69795b = this.f61052d.m69795b();
        }
        C29983l strings = this.f61050b.getStrings();
        C29124h config2 = this.f61050b.getConfig();
        if (config2 != null) {
            map = config2.f59071d;
        } else {
            map = null;
        }
        C28890b c28890b = new C28890b(strings, map, this.f61051c, this.f61050b.f61056b, this.f61053e, false);
        C28895g c28895g = new C28895g(this.f61051c, this.f61053e, this.f61050b.f61056b, strM69795b);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "countryCode for instructions: " + strM69795b, null);
        if (zM69774a && c28890b.m69670b()) {
            abstractC28885fMo70244a = new C28883d(c28895g, c28890b.f58739e);
        } else {
            abstractC28885fMo70244a = this.f61050b.mo70244a(this.f61052d, c28895g);
        }
        return C30351N.m70242a(c30351n, false, false, false, false, abstractC28885fMo70244a, 31);
    }
}
