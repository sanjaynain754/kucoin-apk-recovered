package com.sumsub.sns.internal.features.presentation.camera;

import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28881b;
import com.sumsub.sns.internal.core.presentation.helper.camera.C28883d;
import com.sumsub.sns.internal.core.presentation.intro.C28890b;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30386l extends SuspendLambda implements Function4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ AbstractC29172p f61127a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C29124h f61128b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C29983l f61129c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30388m f61130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30386l(C30388m c30388m, Continuation continuation) {
        super(4, continuation);
        this.f61130d = c30388m;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C30386l c30386l = new C30386l(this.f61130d, (Continuation) obj4);
        c30386l.f61127a = (AbstractC29172p) obj;
        c30386l.f61128b = (C29124h) obj2;
        c30386l.f61129c = (C29983l) obj3;
        return c30386l.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String sceneName;
        List listM69796b;
        Object objM69665a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC29172p abstractC29172p = this.f61127a;
        C29124h c29124h = this.f61128b;
        C29983l c29983l = this.f61129c;
        C29070X c29070x = this.f61130d.f57254b;
        String str = c29070x.f59014a;
        C29154m c29154mM69794a = abstractC29172p.m69794a(c29070x);
        boolean z11 = true;
        if (c29154mM69794a != null && c29154mM69794a.m69792f()) {
            sceneName = IntroScene.PHOTOSELFIE.getSceneName();
        } else if (c29154mM69794a != null && c29154mM69794a.m69791e()) {
            sceneName = IntroScene.PORTRAIT_SELFIE.getSceneName();
        } else if (((IdentitySide) this.f61130d.f57253a.get("CONTROLLER_CURRENT_SIDE")) == IdentitySide.Back) {
            sceneName = IntroScene.SCAN_BACKSIDE.getSceneName();
        } else {
            sceneName = IntroScene.SCAN_FRONTSIDE.getSceneName();
        }
        String str2 = sceneName;
        if (((IdentitySide) this.f61130d.f57253a.get("CONTROLLER_CURRENT_SIDE")) != IdentitySide.Back) {
            z11 = false;
        }
        boolean zM69774a = AbstractC29130i.m69774a(c29124h, str, z11);
        String strM69795b = this.f61130d.f61134l;
        if (strM69795b == null) {
            strM69795b = abstractC29172p.m69795b();
        }
        String str3 = strM69795b;
        this.f61130d.m69067a("countryCode for instructions: " + str3);
        C28890b c28890b = new C28890b(c29983l, c29124h.f59071d, str, this.f61130d.f61133k, str2, false);
        C28895g c28895g = new C28895g(str, str2, this.f61130d.f61133k, str3);
        if (zM69774a && c28890b.m69670b()) {
            objM69665a = new C28883d(c28895g, c28890b.f58739e);
        } else {
            C30388m c30388m = this.f61130d;
            String str4 = c30388m.f61133k;
            if (str4 == null || (listM69796b = CollectionsKt.listOf(AbstractC29121g2.m69769a(str4))) == null) {
                listM69796b = abstractC29172p.m69796b(c30388m.f57254b);
            }
            List list = listM69796b;
            C29070X c29070x2 = c30388m.f57254b;
            objM69665a = AbstractC28881b.m69665a(c29983l, c29070x2, abstractC29172p.m69794a(c29070x2), c28895g, list, (IdentitySide) c30388m.f57253a.get("CONTROLLER_CURRENT_SIDE"));
        }
        this.f61130d.f57260h.setValue(objM69665a);
        return Unit.INSTANCE;
    }
}
