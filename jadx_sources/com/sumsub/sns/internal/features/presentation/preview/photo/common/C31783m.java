package com.sumsub.sns.internal.features.presentation.preview.photo.common;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.documents.C30149t;
import com.sumsub.sns.internal.features.domain.mrtd.C30237b;
import com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.common.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31783m extends AbstractC31770c0 {
    public C31783m(Document document, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C28547d c28547d, C30156e c30156e, C30237b c30237b, C32635M c32635m, C30149t c30149t) {
        super(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c28547d, c32635m, c30149t, c30156e, c30237b);
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Preview Common Document is created", null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m70874c(ContinuationImpl continuationImpl) {
        C31781k c31781k;
        if (continuationImpl instanceof C31781k) {
            c31781k = (C31781k) continuationImpl;
            int i11 = c31781k.f64584c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31781k.f64584c = i11 - Integer.MIN_VALUE;
            } else {
                c31781k = new C31781k(this, continuationImpl);
            }
        } else {
            c31781k = new C31781k(this, continuationImpl);
        }
        Object objM70042a = c31781k.f64582a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31781k.f64584c;
        boolean z11 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f64478c;
            c31781k.f64584c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c31781k);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        C29154m c29154mM69794a = abstractC29172p != null ? abstractC29172p.m69794a(this.f64476a.getType()) : null;
        if (c29154mM69794a != null && c29154mM69794a.m69791e()) {
            z11 = true;
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0
    /* JADX INFO: renamed from: a */
    public final Object mo70860a(Continuation continuation) {
        C31777g c31777g;
        if (continuation instanceof C31777g) {
            c31777g = (C31777g) continuation;
            int i11 = c31777g.f64572c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31777g.f64572c = i11 - Integer.MIN_VALUE;
            } else {
                c31777g = new C31777g(this, (ContinuationImpl) continuation);
            }
        } else {
            c31777g = new C31777g(this, (ContinuationImpl) continuation);
        }
        Object objM70874c = c31777g.f64570a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31777g.f64572c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70874c);
            c31777g.f64572c = 1;
            objM70874c = m70874c((ContinuationImpl) c31777g);
            if (objM70874c != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70874c);
                return objM70874c;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70874c);
            return objM70874c;
        }
        ResultKt.throwOnFailure(objM70874c);
        if (((Boolean) objM70874c).booleanValue()) {
            c31777g.f64572c = 2;
            Object string = getString("sns_preview_portraitSelfie_action_accept", c31777g);
            if (string != coroutine_suspended) {
                return string;
            }
        } else {
            c31777g.f64572c = 3;
            Object string2 = getString("sns_preview_photo_action_accept", c31777g);
            if (string2 != coroutine_suspended) {
                return string2;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0
    /* JADX INFO: renamed from: b */
    public final Object mo70863b(Continuation continuation) {
        C31778h c31778h;
        if (continuation instanceof C31778h) {
            c31778h = (C31778h) continuation;
            int i11 = c31778h.f64575c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31778h.f64575c = i11 - Integer.MIN_VALUE;
            } else {
                c31778h = new C31778h(this, (ContinuationImpl) continuation);
            }
        } else {
            c31778h = new C31778h(this, (ContinuationImpl) continuation);
        }
        Object objM70874c = c31778h.f64573a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31778h.f64575c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70874c);
            c31778h.f64575c = 1;
            objM70874c = m70874c((ContinuationImpl) c31778h);
            if (objM70874c != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70874c);
                return objM70874c;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70874c);
            return objM70874c;
        }
        ResultKt.throwOnFailure(objM70874c);
        if (((Boolean) objM70874c).booleanValue()) {
            c31778h.f64575c = 2;
            Object string = getString("sns_preview_portraitSelfie_action_retake", c31778h);
            if (string != coroutine_suspended) {
                return string;
            }
        } else {
            c31778h.f64575c = 3;
            Object string2 = getString("sns_preview_photo_action_retake", c31778h);
            if (string2 != coroutine_suspended) {
                return string2;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r7 == r1) goto L30;
     */
    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo70866d(Continuation continuation) {
        C31780j c31780j;
        if (continuation instanceof C31780j) {
            c31780j = (C31780j) continuation;
            int i11 = c31780j.f64581c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31780j.f64581c = i11 - Integer.MIN_VALUE;
            } else {
                c31780j = new C31780j(this, (ContinuationImpl) continuation);
            }
        } else {
            c31780j = new C31780j(this, (ContinuationImpl) continuation);
        }
        Object objM70874c = c31780j.f64579a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31780j.f64581c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70874c);
            c31780j.f64581c = 1;
            objM70874c = m70874c((ContinuationImpl) c31780j);
            if (objM70874c != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70874c);
                return (CharSequence) objM70874c;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70874c);
            return (CharSequence) objM70874c;
        }
        ResultKt.throwOnFailure(objM70874c);
        if (((Boolean) objM70874c).booleanValue()) {
            c31780j.f64581c = 2;
            objM70874c = getString("sns_preview_portraitSelfie_title", c31780j);
        } else {
            c31780j.f64581c = 3;
            objM70874c = getString("sns_preview_photo_subtitle", c31780j);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (m70861a((p852kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L21;
     */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onPrepare(Continuation continuation) {
        C31782l c31782l;
        if (continuation instanceof C31782l) {
            c31782l = (C31782l) continuation;
            int i11 = c31782l.f64587c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31782l.f64587c = i11 - Integer.MIN_VALUE;
            } else {
                c31782l = new C31782l(this, (ContinuationImpl) continuation);
            }
        } else {
            c31782l = new C31782l(this, (ContinuationImpl) continuation);
        }
        Object obj = c31782l.f64585a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31782l.f64587c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c31782l.f64587c = 1;
            if (AbstractC31770c0.m70856a(this, c31782l) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        c31782l.f64587c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31770c0
    /* JADX INFO: renamed from: c */
    public final Object mo70865c(Continuation continuation) {
        C31779i c31779i;
        if (continuation instanceof C31779i) {
            c31779i = (C31779i) continuation;
            int i11 = c31779i.f64578c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31779i.f64578c = i11 - Integer.MIN_VALUE;
            } else {
                c31779i = new C31779i(this, (ContinuationImpl) continuation);
            }
        } else {
            c31779i = new C31779i(this, (ContinuationImpl) continuation);
        }
        Object objM70874c = c31779i.f64576a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31779i.f64578c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70874c);
            c31779i.f64578c = 1;
            objM70874c = m70874c((ContinuationImpl) c31779i);
            if (objM70874c != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM70874c);
                return objM70874c;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70874c);
            return objM70874c;
        }
        ResultKt.throwOnFailure(objM70874c);
        if (((Boolean) objM70874c).booleanValue()) {
            c31779i.f64578c = 2;
            Object string = getString("sns_preview_portraitSelfie_subtitle", c31779i);
            if (string != coroutine_suspended) {
                return string;
            }
        } else {
            c31779i.f64578c = 3;
            Object string2 = getString("sns_preview_photo_subtitle", c31779i);
            if (string2 != coroutine_suspended) {
                return string2;
            }
        }
        return coroutine_suspended;
    }
}
