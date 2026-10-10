package com.sumsub.sns.internal.features.presentation.preview.photo;

import android.graphics.Bitmap;
import android.os.Parcelable;
import android.text.Spanned;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28491s;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29121g2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29050S;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29095c0;
import com.sumsub.sns.internal.features.data.model.common.C29119g0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30217h0;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import com.sumsub.sns.internal.features.domain.documents.C30132c;
import com.sumsub.sns.internal.features.domain.documents.C30134e;
import com.sumsub.sns.internal.features.domain.documents.C30136g;
import com.sumsub.sns.internal.features.domain.documents.C30138i;
import com.sumsub.sns.internal.features.domain.documents.C30141l;
import com.sumsub.sns.internal.features.domain.documents.C30143n;
import com.sumsub.sns.internal.features.domain.documents.C30145p;
import com.sumsub.sns.internal.features.domain.documents.C30149t;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import com.sumsub.sns.internal.features.domain.mrtd.C30237b;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h;
import com.sumsub.sns.internal.features.presentation.preview.C31509b;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32640S;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32661l;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32638P;
import com.sumsub.sns.internal.features.presentation.utils.C32666q;
import com.sumsub.sns.internal.features.presentation.utils.C32668s;
import com.sumsub.sns.internal.features.presentation.utils.InterfaceC32636N;
import com.sumsub.sns.internal.features.presentation.utils.SecondSideStep;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC31770c0 extends AbstractC31739h implements InterfaceC32636N {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty[] f64557l = {AbstractC28639a.m69485a(AbstractC31770c0.class, "showPhotoPickerOnStart", "getShowPhotoPickerOnStart()Z", 0)};

    /* JADX INFO: renamed from: g */
    public final InterfaceC30000a f64558g;

    /* JADX INFO: renamed from: h */
    public final C32635M f64559h;

    /* JADX INFO: renamed from: i */
    public final C30149t f64560i;

    /* JADX INFO: renamed from: j */
    public final C30237b f64561j;

    /* JADX INFO: renamed from: k */
    public final C28936t f64562k;

    public AbstractC31770c0(Document document, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, InterfaceC30000a interfaceC30000a, C32635M c32635m, C30149t c30149t, C30156e c30156e, C30237b c30237b) {
        super(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c30156e);
        this.f64558g = interfaceC30000a;
        this.f64559h = c32635m;
        this.f64560i = c30149t;
        this.f64561j = c30237b;
        this.f64562k = new C28936t(savedStateHandle, "showPhotoPickerOnStart", Boolean.TRUE, false);
        c32635m.f66621m = this;
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.InterfaceC32636N
    /* JADX INFO: renamed from: a */
    public final Object mo70459a(C32666q c32666q, List list, ContinuationImpl continuationImpl) {
        return m70855a(this, c32666q, list, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70864b(ContinuationImpl continuationImpl) {
        C31938x c31938x;
        CharSequence charSequence;
        CharSequence charSequence2;
        SNSPreviewPhotoDocumentViewModel$Content$ButtonAction sNSPreviewPhotoDocumentViewModel$Content$ButtonAction;
        Object objMo70860a;
        CharSequence charSequence3;
        C31913n c31913n;
        SNSPreviewPhotoDocumentViewModel$Content$ButtonAction sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2;
        Object objMo70863b;
        SNSPreviewPhotoDocumentViewModel$Content$ButtonAction sNSPreviewPhotoDocumentViewModel$Content$ButtonAction3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        C31913n c31913n2;
        if (continuationImpl instanceof C31938x) {
            c31938x = (C31938x) continuationImpl;
            int i11 = c31938x.f64935g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31938x.f64935g = i11 - Integer.MIN_VALUE;
            } else {
                c31938x = new C31938x(this, continuationImpl);
            }
        } else {
            c31938x = new C31938x(this, continuationImpl);
        }
        Object objMo70866d = c31938x.f64933e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31938x.f64935g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo70866d);
            c31938x.f64935g = 1;
            objMo70866d = mo70866d(c31938x);
            if (objMo70866d != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objMo70866d);
        } else {
            if (i12 == 2) {
                charSequence = c31938x.f64929a;
                ResultKt.throwOnFailure(objMo70866d);
                charSequence2 = (CharSequence) objMo70866d;
                sNSPreviewPhotoDocumentViewModel$Content$ButtonAction = SNSPreviewPhotoDocumentViewModel$Content$ButtonAction.CONTINUE;
                c31938x.f64929a = charSequence;
                c31938x.f64930b = charSequence2;
                c31938x.f64931c = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction;
                c31938x.f64935g = 3;
                objMo70860a = mo70860a((Continuation) c31938x);
                if (objMo70860a != coroutine_suspended) {
                    charSequence3 = charSequence2;
                    objMo70866d = objMo70860a;
                    c31913n = new C31913n(sNSPreviewPhotoDocumentViewModel$Content$ButtonAction, (CharSequence) objMo70866d);
                    sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2 = SNSPreviewPhotoDocumentViewModel$Content$ButtonAction.TRY_AGAIN;
                    c31938x.f64929a = charSequence;
                    c31938x.f64930b = charSequence3;
                    c31938x.f64931c = c31913n;
                    c31938x.f64932d = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2;
                    c31938x.f64935g = 4;
                    objMo70863b = mo70863b((Continuation) c31938x);
                    if (objMo70863b != coroutine_suspended) {
                        sNSPreviewPhotoDocumentViewModel$Content$ButtonAction3 = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2;
                        objMo70866d = objMo70863b;
                        charSequence4 = charSequence;
                        charSequence5 = charSequence3;
                        c31913n2 = c31913n;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                SNSPreviewPhotoDocumentViewModel$Content$ButtonAction sNSPreviewPhotoDocumentViewModel$Content$ButtonAction4 = (SNSPreviewPhotoDocumentViewModel$Content$ButtonAction) c31938x.f64931c;
                charSequence3 = c31938x.f64930b;
                CharSequence charSequence6 = c31938x.f64929a;
                ResultKt.throwOnFailure(objMo70866d);
                sNSPreviewPhotoDocumentViewModel$Content$ButtonAction = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction4;
                charSequence = charSequence6;
                c31913n = new C31913n(sNSPreviewPhotoDocumentViewModel$Content$ButtonAction, (CharSequence) objMo70866d);
                sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2 = SNSPreviewPhotoDocumentViewModel$Content$ButtonAction.TRY_AGAIN;
                c31938x.f64929a = charSequence;
                c31938x.f64930b = charSequence3;
                c31938x.f64931c = c31913n;
                c31938x.f64932d = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2;
                c31938x.f64935g = 4;
                objMo70863b = mo70863b((Continuation) c31938x);
                if (objMo70863b != coroutine_suspended) {
                    sNSPreviewPhotoDocumentViewModel$Content$ButtonAction3 = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2;
                    objMo70866d = objMo70863b;
                    charSequence4 = charSequence;
                    charSequence5 = charSequence3;
                    c31913n2 = c31913n;
                }
                return coroutine_suspended;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SNSPreviewPhotoDocumentViewModel$Content$ButtonAction sNSPreviewPhotoDocumentViewModel$Content$ButtonAction5 = c31938x.f64932d;
            C31913n c31913n3 = (C31913n) c31938x.f64931c;
            CharSequence charSequence7 = c31938x.f64930b;
            CharSequence charSequence8 = c31938x.f64929a;
            ResultKt.throwOnFailure(objMo70866d);
            charSequence4 = charSequence8;
            sNSPreviewPhotoDocumentViewModel$Content$ButtonAction3 = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction5;
            c31913n2 = c31913n3;
            charSequence5 = charSequence7;
        }
        return new C31916p(charSequence4, charSequence5, c31913n2, new C31913n(sNSPreviewPhotoDocumentViewModel$Content$ButtonAction3, (CharSequence) objMo70866d), SNSPreviewPhotoDocumentViewModel$Content$State.OK, null);
        charSequence = (CharSequence) objMo70866d;
        c31938x.f64929a = charSequence;
        c31938x.f64935g = 2;
        objMo70866d = mo70865c(c31938x);
        if (objMo70866d != coroutine_suspended) {
            charSequence2 = (CharSequence) objMo70866d;
            sNSPreviewPhotoDocumentViewModel$Content$ButtonAction = SNSPreviewPhotoDocumentViewModel$Content$ButtonAction.CONTINUE;
            c31938x.f64929a = charSequence;
            c31938x.f64930b = charSequence2;
            c31938x.f64931c = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction;
            c31938x.f64935g = 3;
            objMo70860a = mo70860a((Continuation) c31938x);
            if (objMo70860a != coroutine_suspended) {
                charSequence3 = charSequence2;
                objMo70866d = objMo70860a;
                c31913n = new C31913n(sNSPreviewPhotoDocumentViewModel$Content$ButtonAction, (CharSequence) objMo70866d);
                sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2 = SNSPreviewPhotoDocumentViewModel$Content$ButtonAction.TRY_AGAIN;
                c31938x.f64929a = charSequence;
                c31938x.f64930b = charSequence3;
                c31938x.f64931c = c31913n;
                c31938x.f64932d = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2;
                c31938x.f64935g = 4;
                objMo70863b = mo70863b((Continuation) c31938x);
                if (objMo70863b != coroutine_suspended) {
                    sNSPreviewPhotoDocumentViewModel$Content$ButtonAction3 = sNSPreviewPhotoDocumentViewModel$Content$ButtonAction2;
                    objMo70866d = objMo70863b;
                    charSequence4 = charSequence;
                    charSequence5 = charSequence3;
                    c31913n2 = c31913n;
                    return new C31916p(charSequence4, charSequence5, c31913n2, new C31913n(sNSPreviewPhotoDocumentViewModel$Content$ButtonAction3, (CharSequence) objMo70866d), SNSPreviewPhotoDocumentViewModel$Content$State.OK, null);
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: c */
    public final void mo70746c(boolean z11) {
        AbstractC28073M0.updateState$default(this, false, new C31764Z(z11, null), 1, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m70867d(boolean z11) {
        if (z11) {
            this.f64559h.m71239a(IdentitySide.Back);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31746G(this, null), 3, null);
            return;
        }
        C32635M c32635m = this.f64559h;
        List listM71250c = c32635m.m71250c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM71250c, 10));
        Iterator it = listM71250c.iterator();
        while (it.hasNext()) {
            arrayList.add(C29054T.m69738a((C29054T) it.next(), null, null, null, FrameMetricsAggregator.EVERY_DURATION));
        }
        c32635m.m71244a(arrayList);
        if (!this.f64559h.m71250c().isEmpty()) {
            List listM71250c2 = this.f64559h.m71250c();
            if (listM71250c2 == null || !listM71250c2.isEmpty()) {
                Iterator it2 = listM71250c2.iterator();
                while (it2.hasNext()) {
                    if (!((C29054T) it2.next()).f58999f) {
                    }
                }
            }
            fireEvent(new C31509b(this.f64476a));
            this.f64559h.m71254g();
            return;
        }
        m70869f();
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    public Object mo70740a(AbstractC29172p abstractC29172p, C29124h c29124h, Continuation continuation) {
        C28936t c28936t = this.f64562k;
        KProperty[] kPropertyArr = f64557l;
        KProperty kProperty = kPropertyArr[0];
        if (((Boolean) c28936t.m69705a()).booleanValue()) {
            C28936t c28936t2 = this.f64562k;
            KProperty kProperty2 = kPropertyArr[0];
            c28936t2.f58834a.set(c28936t2.f58835b, Boolean.FALSE);
            mo70469b(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public Object mo70865c(Continuation continuation) {
        return getString("sns_preview_photo_subtitle", continuation);
    }

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap m70868e() {
        Object obj;
        Object next;
        C29050S c29050s;
        C32635M c32635m = this.f64559h;
        IdentitySide identitySideM71283a = c32635m.m71252e() ? IdentitySide.Front : c32635m.f66620l.m71283a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C28936t c28936t = c32635m.f66624p;
        KProperty kProperty = C32635M.f66607x[2];
        C29015J c29015j = (C29015J) c28936t.m69705a();
        boolean z11 = false;
        linkedHashMap.put("isSeamless", Boolean.valueOf(c29015j != null && c29015j.f58958b));
        Iterator it = c32635m.m71250c().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C29054T) next).f58998e != identitySideM71283a);
        C29054T c29054t = (C29054T) next;
        linkedHashMap.put("isAutocaptured", Boolean.valueOf(c29054t != null ? Intrinsics.areEqual(c29054t.f59000g, Boolean.TRUE) : false));
        if (c29054t != null && c29054t.f59002i) {
            z11 = true;
        }
        linkedHashMap.put("isFromGallery", Boolean.valueOf(z11));
        for (Object obj2 : c32635m.m71250c()) {
            if (Intrinsics.areEqual(((C29054T) obj2).f58997d, "IDENTITY_VIDEO")) {
                obj = obj2;
                break;
            }
        }
        C29054T c29054t2 = (C29054T) obj;
        if (c29054t2 != null && (c29050s = c29054t2.f59001h) != null) {
            C32635M.f66606w.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(TypedValues.TransitionType.S_DURATION, Integer.valueOf(c29050s.f58987a));
            linkedHashMap2.put("fileSize", Long.valueOf(c29050s.f58988b));
            linkedHashMap.put("seamlessVideo", linkedHashMap2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: f */
    public final void m70869f() {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onUploadDocuments", null);
        AbstractC28073M0.updateState$default(this, false, new C31766a0(this, null), 1, null);
        if (this.f64559h.m71250c().isEmpty()) {
            AbstractC28052C.finish$default(this, new C28494t(false), null, null, null, 14, null);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31763Y(this, null), 3, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C31931t(null, false, null, 31);
    }

    /* JADX INFO: renamed from: h */
    public SecondSideStep mo70871h() {
        int i11 = AbstractC32661l.f66653b[this.f64559h.f66620l.f66656b.ordinal()];
        if (i11 == 1) {
            return SecondSideStep.Prompt;
        }
        if (i11 == 2) {
            return SecondSideStep.Proceed;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onErrorCancelled(AbstractC29149l0 abstractC29149l0) {
        if (abstractC29149l0 instanceof C29131i0) {
            AbstractC28052C.finish$default(this, null, null, null, null, 15, null);
        } else {
            super.onErrorCancelled(abstractC29149l0);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "Preview photo error handling... " + abstractC29149l0, null);
        if (abstractC29149l0 instanceof C29131i0) {
            m70869f();
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h, com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onLoad() {
        List listM71250c = this.f64559h.m71250c();
        if (listM71250c.isEmpty()) {
            super.onLoad();
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31754O(this, listM71250c, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public Unit mo70870g() {
        int i11 = AbstractC31936v.f64925a[mo70871h().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m70867d(false);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m70867d(true);
            }
        } else {
            fireEvent(C32638P.f66633a);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70861a(ContinuationImpl continuationImpl) {
        C31937w c31937w;
        if (continuationImpl instanceof C31937w) {
            c31937w = (C31937w) continuationImpl;
            int i11 = c31937w.f64928c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31937w.f64928c = i11 - Integer.MIN_VALUE;
            } else {
                c31937w = new C31937w(this, continuationImpl);
            }
        } else {
            c31937w = new C31937w(this, continuationImpl);
        }
        Object objM71259a = c31937w.f64926a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31937w.f64928c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71259a);
            InterfaceC29984m interfaceC29984m = this.f64478c;
            Document document = this.f64476a;
            c31937w.f64928c = 1;
            objM71259a = AbstractC32640S.m71259a(interfaceC29984m, document, c31937w);
            if (objM71259a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM71259a);
        }
        AbstractC28503w abstractC28503w = (AbstractC28503w) objM71259a;
        if (abstractC28503w != null) {
            this.f64559h.m71244a(CollectionsKt.emptyList());
            AbstractC28052C.finish$default(this, abstractC28503w, null, null, null, 14, null);
        } else {
            onLoad();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public Object mo70863b(Continuation continuation) {
        return getString("sns_preview_photo_action_retake", continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6.m71234a(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m70856a(AbstractC31770c0 abstractC31770c0, ContinuationImpl continuationImpl) {
        C31756Q c31756q;
        if (continuationImpl instanceof C31756Q) {
            c31756q = (C31756Q) continuationImpl;
            int i11 = c31756q.f64532d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31756q.f64532d = i11 - Integer.MIN_VALUE;
            } else {
                c31756q = new C31756Q(abstractC31770c0, continuationImpl);
            }
        } else {
            c31756q = new C31756Q(abstractC31770c0, continuationImpl);
        }
        Object obj = c31756q.f64530b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31756q.f64532d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c31756q.f64529a = abstractC31770c0;
            c31756q.f64532d = 1;
            if (AbstractC28073M0.onPrepare$suspendImpl(abstractC31770c0, c31756q) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            abstractC31770c0 = c31756q.f64529a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC31770c0 = c31756q.f64529a;
            ResultKt.throwOnFailure(obj);
        }
        AbstractC28073M0.updateState$default(abstractC31770c0, false, new C31757S(abstractC31770c0, null), 1, null);
        return Unit.INSTANCE;
        C32635M c32635m = abstractC31770c0.f64559h;
        c31756q.f64529a = abstractC31770c0;
        c31756q.f64532d = 2;
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.InterfaceC32636N
    /* JADX INFO: renamed from: b */
    public final void mo70469b(boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31742C(this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: d */
    public Object mo70866d(Continuation continuation) {
        return getString("sns_preview_photo_title", continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public static Object m70855a(AbstractC31770c0 abstractC31770c0, C32666q c32666q, List list, ContinuationImpl continuationImpl) {
        C31939y c31939y;
        Map map;
        Map map2;
        Object objM70864b;
        List list2;
        C31931t c31931t;
        AbstractC31770c0 abstractC31770c1 = abstractC31770c0;
        if (continuationImpl instanceof C31939y) {
            c31939y = (C31939y) continuationImpl;
            int i11 = c31939y.f64942g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31939y.f64942g = i11 - Integer.MIN_VALUE;
            } else {
                c31939y = new C31939y(abstractC31770c1, continuationImpl);
            }
        } else {
            c31939y = new C31939y(abstractC31770c1, continuationImpl);
        }
        Object obj = c31939y.f64940e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31939y.f64942g;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            map = c32666q.f66669a;
            map2 = c32666q.f66670b;
            c31939y.f64936a = abstractC31770c1;
            c31939y.f64937b = list;
            c31939y.f64938c = map;
            c31939y.f64939d = map2;
            c31939y.f64942g = 1;
            objM70864b = abstractC31770c1.m70864b((ContinuationImpl) c31939y);
            if (objM70864b == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = list;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map3 = c31939y.f64939d;
            Map map4 = c31939y.f64938c;
            list2 = c31939y.f64937b;
            AbstractC31770c0 abstractC31770c2 = c31939y.f64936a;
            ResultKt.throwOnFailure(obj);
            map2 = map3;
            abstractC31770c1 = abstractC31770c2;
            objM70864b = obj;
            map = map4;
        }
        C31916p c31916p = (C31916p) objM70864b;
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((C29054T) obj2).f58995b != null) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj3 = arrayList.get(i13);
                i13++;
                C29054T c29054t = (C29054T) obj3;
                C32635M.f66606w.getClass();
                String strM71291a = C32668s.m71291a(c29054t);
                if (strM71291a == null) {
                    strM71291a = "";
                }
                Bitmap bitmap = (Bitmap) map.get(strM71291a);
                File file = c29054t.f58995b;
                C30132c c30132c = (C30132c) map2.get(strM71291a);
                arrayList2.add(new C30152w(bitmap, file, c30132c != null ? c30132c.f60571a : 0, map2.containsKey(strM71291a), (String) null, (CharSequence) null, 112));
            }
            c31931t = new C31931t(arrayList2, true, c31916p, 10);
        } else {
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new C30152w((Bitmap) null, ((C29054T) it.next()).f58994a, 0, false, (String) null, (CharSequence) null, 112));
            }
            c31931t = new C31931t(arrayList3, false, c31916p, 10);
        }
        abstractC31770c1.showProgress(false);
        AbstractC28073M0.updateState$default(abstractC31770c1, false, new C31940z(c31931t, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.utils.InterfaceC32636N
    /* JADX INFO: renamed from: a */
    public final void mo70467a(boolean z11) {
        if (z11) {
            AbstractC28052C.finish$default(this, C28491s.f58027b, null, null, null, 14, null);
        }
        mo70746c(true);
        showProgress(false);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[LOOP:1: B:34:0x016d->B:121:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0160  */
    /* JADX WARN: Code duplicated, block: B:33:0x0165  */
    /* JADX WARN: Code duplicated, block: B:36:0x0173  */
    /* JADX WARN: Code duplicated, block: B:39:0x0183  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0202  */
    /* JADX WARN: Code duplicated, block: B:61:0x020d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0226  */
    /* JADX WARN: Code duplicated, block: B:66:0x022f  */
    /* JADX WARN: Code duplicated, block: B:69:0x024b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0255  */
    /* JADX WARN: Code duplicated, block: B:74:0x0260  */
    /* JADX WARN: Code duplicated, block: B:77:0x027c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:94:0x0326  */
    /* JADX WARN: Code duplicated, block: B:98:0x0341  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0371, code lost:
    
        if (mo70870g() == r4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02df, code lost:
    
        if (m70858a(r1, r3) == r4) goto L104;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70859a(AbstractC30146q abstractC30146q, Continuation continuation) {
        C31749J c31749j;
        Throwable th2;
        AbstractC31770c0 abstractC31770c0;
        C30145p c30145p;
        C30149t c30149t;
        AbstractC30146q abstractC30146q2;
        boolean z11;
        C29124h c29124h;
        List list;
        Object objM70116a;
        Map map;
        CharSequence charSequence;
        InterfaceC30000a interfaceC30000a;
        AbstractC29180q2 abstractC29180q2M69769a;
        Object strings;
        InterfaceC30000a interfaceC30000a2;
        AbstractC29180q2 abstractC29180q2;
        List list2;
        Iterator it;
        CharSequence charSequence2;
        C29983l c29983l;
        Object string;
        C29983l c29983l2;
        List list3;
        CharSequence charSequence3;
        InterfaceC30000a interfaceC30000a3;
        Spanned spannedM69364a;
        ArrayList arrayList;
        List list4;
        Object string2;
        List list5;
        List list6;
        CharSequence charSequence4;
        List list7;
        Object string3;
        String str;
        C29307Y0 c29307y0;
        String str2;
        Object string4;
        String str3;
        List list8;
        String str4;
        String str5;
        String str6;
        Object string5;
        Throwable th3;
        String str7;
        String str8;
        Object string6;
        String str9;
        String str10;
        AbstractC31770c0 abstractC31770c1;
        Throwable th4;
        if (continuation instanceof C31749J) {
            c31749j = (C31749J) continuation;
            int i11 = c31749j.f64511j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31749j.f64511j = i11 - Integer.MIN_VALUE;
            } else {
                c31749j = new C31749J(this, continuation);
            }
        } else {
            c31749j = new C31749J(this, continuation);
        }
        Object string7 = c31749j.f64509h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c31749j.f64511j) {
            case 0:
                ResultKt.throwOnFailure(string7);
                if (abstractC30146q instanceof C30145p) {
                    c30145p = (C30145p) abstractC30146q;
                    List list9 = c30145p.f60582d;
                    boolean z12 = c30145p.f60579a;
                    c30149t = this.f64560i;
                    C29124h config = getConfig();
                    c31749j.f64502a = abstractC30146q;
                    c31749j.f64503b = list9;
                    c31749j.f64504c = c30149t;
                    c31749j.f64505d = config;
                    c31749j.f64506e = c30145p;
                    c31749j.f64508g = z12;
                    c31749j.f64511j = 1;
                    Object strings2 = getStrings(c31749j);
                    if (strings2 != coroutine_suspended) {
                        abstractC30146q2 = abstractC30146q;
                        z11 = z12;
                        c29124h = config;
                        list = list9;
                        string7 = strings2;
                        objM70116a = c30149t.m70116a(c29124h, c30145p, (C29983l) string7);
                        if (Result.m103850isFailureimpl(objM70116a)) {
                            objM70116a = null;
                        }
                        map = (Map) objM70116a;
                        if (map != null) {
                            it = map.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    charSequence2 = (CharSequence) ((Map.Entry) it.next()).getValue();
                                    if (charSequence2 != null) {
                                        charSequence = charSequence2;
                                    }
                                } else {
                                    charSequence = null;
                                }
                            }
                        } else {
                            charSequence = null;
                        }
                        interfaceC30000a = this.f64558g;
                        abstractC29180q2M69769a = AbstractC29121g2.m69769a(((C30145p) abstractC30146q2).f60583e);
                        c31749j.f64502a = abstractC30146q2;
                        c31749j.f64503b = list;
                        c31749j.f64504c = charSequence;
                        c31749j.f64505d = interfaceC30000a;
                        c31749j.f64506e = abstractC29180q2M69769a;
                        c31749j.f64508g = z11;
                        c31749j.f64511j = 2;
                        strings = getStrings(c31749j);
                        if (strings != coroutine_suspended) {
                            interfaceC30000a2 = interfaceC30000a;
                            string7 = strings;
                            abstractC29180q2 = abstractC29180q2M69769a;
                            list2 = list;
                            c29983l = (C29983l) string7;
                            c31749j.f64502a = abstractC30146q2;
                            c31749j.f64503b = list2;
                            c31749j.f64504c = charSequence;
                            c31749j.f64505d = interfaceC30000a2;
                            c31749j.f64506e = abstractC29180q2;
                            c31749j.f64507f = c29983l;
                            c31749j.f64508g = z11;
                            c31749j.f64511j = 3;
                            string = getString("sns_preview_photo_title", c31749j);
                            if (string != coroutine_suspended) {
                                InterfaceC30000a interfaceC30000a4 = interfaceC30000a2;
                                c29983l2 = c29983l;
                                string7 = string;
                                list3 = list2;
                                charSequence3 = charSequence;
                                interfaceC30000a3 = interfaceC30000a4;
                                spannedM69364a = AbstractC28462i0.m69364a(abstractC29180q2.m69801a(c29983l2, (CharSequence) string7), ((C28547d) interfaceC30000a3).f58099a.f58163a);
                                C30145p c30145p2 = (C30145p) abstractC30146q2;
                                List<C30217h0> list10 = c30145p2.f60582d;
                                arrayList = new ArrayList();
                                for (C30217h0 c30217h0 : list10) {
                                    if (c30217h0 != null || (c29307y0 = c30217h0.f60735b) == null) {
                                        str = null;
                                    } else {
                                        str = c29307y0.f59320e;
                                    }
                                    if (str != null) {
                                        arrayList.add(str);
                                    }
                                }
                                list4 = c30145p2.f60580b;
                                if (z11) {
                                    c31749j.f64502a = list3;
                                    c31749j.f64503b = charSequence3;
                                    c31749j.f64504c = spannedM69364a;
                                    c31749j.f64505d = arrayList;
                                    c31749j.f64506e = list4;
                                    c31749j.f64507f = null;
                                    c31749j.f64508g = z11;
                                    c31749j.f64511j = 4;
                                    string3 = getString("sns_preview_idDocError_action_retake", c31749j);
                                    if (string3 != coroutine_suspended) {
                                        list5 = list4;
                                        string7 = string3;
                                        list6 = arrayList;
                                        charSequence4 = charSequence3;
                                        list7 = list3;
                                        str2 = (String) string7;
                                        if (z11) {
                                            str4 = str2;
                                            str5 = null;
                                            list8 = list7;
                                        } else {
                                            c31749j.f64502a = list7;
                                            c31749j.f64503b = charSequence4;
                                            c31749j.f64504c = spannedM69364a;
                                            c31749j.f64505d = list6;
                                            c31749j.f64506e = list5;
                                            c31749j.f64507f = str2;
                                            c31749j.f64508g = z11;
                                            c31749j.f64511j = 6;
                                            string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                                            if (string4 != coroutine_suspended) {
                                                str3 = str2;
                                                string7 = string4;
                                                list8 = list7;
                                                str5 = (String) string7;
                                                str4 = str3;
                                            }
                                        }
                                        AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                                        String str11 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                                        C33272c c33272c = C33272c.f67812a;
                                        C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str11, new IllegalArgumentException(str11));
                                        showProgress(false);
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    c31749j.f64502a = list3;
                                    c31749j.f64503b = charSequence3;
                                    c31749j.f64504c = spannedM69364a;
                                    c31749j.f64505d = arrayList;
                                    c31749j.f64506e = list4;
                                    c31749j.f64507f = null;
                                    c31749j.f64508g = z11;
                                    c31749j.f64511j = 5;
                                    string2 = getString("sns_preview_idDocWarning_action_continue", c31749j);
                                    if (string2 != coroutine_suspended) {
                                        list5 = list4;
                                        string7 = string2;
                                        list6 = arrayList;
                                        charSequence4 = charSequence3;
                                        list7 = list3;
                                        str2 = (String) string7;
                                        if (z11) {
                                            str4 = str2;
                                            str5 = null;
                                            list8 = list7;
                                        } else {
                                            c31749j.f64502a = list7;
                                            c31749j.f64503b = charSequence4;
                                            c31749j.f64504c = spannedM69364a;
                                            c31749j.f64505d = list6;
                                            c31749j.f64506e = list5;
                                            c31749j.f64507f = str2;
                                            c31749j.f64508g = z11;
                                            c31749j.f64511j = 6;
                                            string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                                            if (string4 != coroutine_suspended) {
                                                str3 = str2;
                                                string7 = string4;
                                                list8 = list7;
                                                str5 = (String) string7;
                                                str4 = str3;
                                            }
                                        }
                                        AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                                        String str12 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                                        C33272c c33272c2 = C33272c.f67812a;
                                        C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str12, new IllegalArgumentException(str12));
                                        showProgress(false);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                } else if (abstractC30146q instanceof C30138i) {
                    AbstractC28978A2 abstractC28978A2 = ((C30138i) abstractC30146q).f60576a;
                    c31749j.f64511j = 7;
                    break;
                } else if (abstractC30146q instanceof C30136g) {
                    C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31758T(this, null), 3, null);
                    th2 = ((C30136g) abstractC30146q).f60575a;
                    c31749j.f64502a = this;
                    c31749j.f64503b = th2;
                    c31749j.f64511j = 8;
                    string7 = getString("sns_mrtdscan_error_chipIsNotReadable_title", c31749j);
                    if (string7 != coroutine_suspended) {
                        abstractC31770c0 = this;
                        str6 = (String) string7;
                        c31749j.f64502a = abstractC31770c0;
                        c31749j.f64503b = th2;
                        c31749j.f64504c = str6;
                        c31749j.f64511j = 9;
                        string5 = getString("sns_mrtdscan_error_chipIsNotReadable_subtitle", c31749j);
                        if (string5 != coroutine_suspended) {
                            th3 = th2;
                            str7 = str6;
                            string7 = string5;
                            str8 = (String) string7;
                            c31749j.f64502a = abstractC31770c0;
                            c31749j.f64503b = th3;
                            c31749j.f64504c = str7;
                            c31749j.f64505d = str8;
                            c31749j.f64511j = 10;
                            string6 = getString("sns_preview_idDocError_action_retake", c31749j);
                            if (string6 != coroutine_suspended) {
                                str9 = str7;
                                str10 = str8;
                                string7 = string6;
                                abstractC31770c1 = abstractC31770c0;
                                th4 = th3;
                                abstractC31770c1.fireEvent(new C28135m(new C29119g0(th4, null, new C29095c0(24, str9, str10, (String) string7), 2), this.f64476a.getType().f59014a, null, null));
                                showProgress(false);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    if (abstractC30146q instanceof C30134e) {
                        c31749j.f64511j = 11;
                        break;
                    } else if (abstractC30146q instanceof C30141l) {
                        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31752M(this, null), 3, null);
                        fireEvent(new C31509b(((C30141l) abstractC30146q).f60577a));
                        this.f64559h.m71254g();
                    } else if (!(abstractC30146q instanceof C30143n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    showProgress(false);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 1:
                z11 = c31749j.f64508g;
                c30145p = (C30145p) c31749j.f64506e;
                c29124h = (C29124h) c31749j.f64505d;
                c30149t = (C30149t) c31749j.f64504c;
                list = (List) c31749j.f64503b;
                abstractC30146q2 = (AbstractC30146q) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                objM70116a = c30149t.m70116a(c29124h, c30145p, (C29983l) string7);
                if (Result.m103850isFailureimpl(objM70116a)) {
                    objM70116a = null;
                }
                map = (Map) objM70116a;
                if (map != null) {
                    it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            charSequence2 = (CharSequence) ((Map.Entry) it.next()).getValue();
                            if (charSequence2 != null) {
                                charSequence = charSequence2;
                            }
                        } else {
                            charSequence = null;
                        }
                    }
                } else {
                    charSequence = null;
                }
                interfaceC30000a = this.f64558g;
                abstractC29180q2M69769a = AbstractC29121g2.m69769a(((C30145p) abstractC30146q2).f60583e);
                c31749j.f64502a = abstractC30146q2;
                c31749j.f64503b = list;
                c31749j.f64504c = charSequence;
                c31749j.f64505d = interfaceC30000a;
                c31749j.f64506e = abstractC29180q2M69769a;
                c31749j.f64508g = z11;
                c31749j.f64511j = 2;
                strings = getStrings(c31749j);
                if (strings != coroutine_suspended) {
                    interfaceC30000a2 = interfaceC30000a;
                    string7 = strings;
                    abstractC29180q2 = abstractC29180q2M69769a;
                    list2 = list;
                    c29983l = (C29983l) string7;
                    c31749j.f64502a = abstractC30146q2;
                    c31749j.f64503b = list2;
                    c31749j.f64504c = charSequence;
                    c31749j.f64505d = interfaceC30000a2;
                    c31749j.f64506e = abstractC29180q2;
                    c31749j.f64507f = c29983l;
                    c31749j.f64508g = z11;
                    c31749j.f64511j = 3;
                    string = getString("sns_preview_photo_title", c31749j);
                    if (string != coroutine_suspended) {
                        InterfaceC30000a interfaceC30000a5 = interfaceC30000a2;
                        c29983l2 = c29983l;
                        string7 = string;
                        list3 = list2;
                        charSequence3 = charSequence;
                        interfaceC30000a3 = interfaceC30000a5;
                        spannedM69364a = AbstractC28462i0.m69364a(abstractC29180q2.m69801a(c29983l2, (CharSequence) string7), ((C28547d) interfaceC30000a3).f58099a.f58163a);
                        C30145p c30145p3 = (C30145p) abstractC30146q2;
                        List<C30217h0> list11 = c30145p3.f60582d;
                        arrayList = new ArrayList();
                        while (r2.hasNext()) {
                            if (c30217h0 != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                        list4 = c30145p3.f60580b;
                        if (z11) {
                            c31749j.f64502a = list3;
                            c31749j.f64503b = charSequence3;
                            c31749j.f64504c = spannedM69364a;
                            c31749j.f64505d = arrayList;
                            c31749j.f64506e = list4;
                            c31749j.f64507f = null;
                            c31749j.f64508g = z11;
                            c31749j.f64511j = 4;
                            string3 = getString("sns_preview_idDocError_action_retake", c31749j);
                            if (string3 != coroutine_suspended) {
                                list5 = list4;
                                string7 = string3;
                                list6 = arrayList;
                                charSequence4 = charSequence3;
                                list7 = list3;
                                str2 = (String) string7;
                                if (z11) {
                                    str4 = str2;
                                    str5 = null;
                                    list8 = list7;
                                } else {
                                    c31749j.f64502a = list7;
                                    c31749j.f64503b = charSequence4;
                                    c31749j.f64504c = spannedM69364a;
                                    c31749j.f64505d = list6;
                                    c31749j.f64506e = list5;
                                    c31749j.f64507f = str2;
                                    c31749j.f64508g = z11;
                                    c31749j.f64511j = 6;
                                    string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                                    if (string4 != coroutine_suspended) {
                                        str3 = str2;
                                        string7 = string4;
                                        list8 = list7;
                                        str5 = (String) string7;
                                        str4 = str3;
                                    }
                                }
                                AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                                String str13 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                                C33272c c33272c3 = C33272c.f67812a;
                                C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str13, new IllegalArgumentException(str13));
                                showProgress(false);
                                return Unit.INSTANCE;
                            }
                        } else {
                            c31749j.f64502a = list3;
                            c31749j.f64503b = charSequence3;
                            c31749j.f64504c = spannedM69364a;
                            c31749j.f64505d = arrayList;
                            c31749j.f64506e = list4;
                            c31749j.f64507f = null;
                            c31749j.f64508g = z11;
                            c31749j.f64511j = 5;
                            string2 = getString("sns_preview_idDocWarning_action_continue", c31749j);
                            if (string2 != coroutine_suspended) {
                                list5 = list4;
                                string7 = string2;
                                list6 = arrayList;
                                charSequence4 = charSequence3;
                                list7 = list3;
                                str2 = (String) string7;
                                if (z11) {
                                    str4 = str2;
                                    str5 = null;
                                    list8 = list7;
                                } else {
                                    c31749j.f64502a = list7;
                                    c31749j.f64503b = charSequence4;
                                    c31749j.f64504c = spannedM69364a;
                                    c31749j.f64505d = list6;
                                    c31749j.f64506e = list5;
                                    c31749j.f64507f = str2;
                                    c31749j.f64508g = z11;
                                    c31749j.f64511j = 6;
                                    string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                                    if (string4 != coroutine_suspended) {
                                        str3 = str2;
                                        string7 = string4;
                                        list8 = list7;
                                        str5 = (String) string7;
                                        str4 = str3;
                                    }
                                }
                                AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                                String str14 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                                C33272c c33272c4 = C33272c.f67812a;
                                C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str14, new IllegalArgumentException(str14));
                                showProgress(false);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 2:
                z11 = c31749j.f64508g;
                AbstractC29180q2 abstractC29180q3 = (AbstractC29180q2) c31749j.f64506e;
                InterfaceC30000a interfaceC30000a6 = (InterfaceC30000a) c31749j.f64505d;
                charSequence = (CharSequence) c31749j.f64504c;
                list2 = (List) c31749j.f64503b;
                AbstractC30146q abstractC30146q3 = (AbstractC30146q) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                abstractC29180q2 = abstractC29180q3;
                interfaceC30000a2 = interfaceC30000a6;
                abstractC30146q2 = abstractC30146q3;
                c29983l = (C29983l) string7;
                c31749j.f64502a = abstractC30146q2;
                c31749j.f64503b = list2;
                c31749j.f64504c = charSequence;
                c31749j.f64505d = interfaceC30000a2;
                c31749j.f64506e = abstractC29180q2;
                c31749j.f64507f = c29983l;
                c31749j.f64508g = z11;
                c31749j.f64511j = 3;
                string = getString("sns_preview_photo_title", c31749j);
                if (string != coroutine_suspended) {
                    InterfaceC30000a interfaceC30000a7 = interfaceC30000a2;
                    c29983l2 = c29983l;
                    string7 = string;
                    list3 = list2;
                    charSequence3 = charSequence;
                    interfaceC30000a3 = interfaceC30000a7;
                    spannedM69364a = AbstractC28462i0.m69364a(abstractC29180q2.m69801a(c29983l2, (CharSequence) string7), ((C28547d) interfaceC30000a3).f58099a.f58163a);
                    C30145p c30145p4 = (C30145p) abstractC30146q2;
                    List<C30217h0> list12 = c30145p4.f60582d;
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        if (c30217h0 != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    list4 = c30145p4.f60580b;
                    if (z11) {
                        c31749j.f64502a = list3;
                        c31749j.f64503b = charSequence3;
                        c31749j.f64504c = spannedM69364a;
                        c31749j.f64505d = arrayList;
                        c31749j.f64506e = list4;
                        c31749j.f64507f = null;
                        c31749j.f64508g = z11;
                        c31749j.f64511j = 4;
                        string3 = getString("sns_preview_idDocError_action_retake", c31749j);
                        if (string3 != coroutine_suspended) {
                            list5 = list4;
                            string7 = string3;
                            list6 = arrayList;
                            charSequence4 = charSequence3;
                            list7 = list3;
                            str2 = (String) string7;
                            if (z11) {
                                str4 = str2;
                                str5 = null;
                                list8 = list7;
                            } else {
                                c31749j.f64502a = list7;
                                c31749j.f64503b = charSequence4;
                                c31749j.f64504c = spannedM69364a;
                                c31749j.f64505d = list6;
                                c31749j.f64506e = list5;
                                c31749j.f64507f = str2;
                                c31749j.f64508g = z11;
                                c31749j.f64511j = 6;
                                string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                                if (string4 != coroutine_suspended) {
                                    str3 = str2;
                                    string7 = string4;
                                    list8 = list7;
                                    str5 = (String) string7;
                                    str4 = str3;
                                }
                            }
                            AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                            String str15 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                            C33272c c33272c5 = C33272c.f67812a;
                            C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str15, new IllegalArgumentException(str15));
                            showProgress(false);
                            return Unit.INSTANCE;
                        }
                    } else {
                        c31749j.f64502a = list3;
                        c31749j.f64503b = charSequence3;
                        c31749j.f64504c = spannedM69364a;
                        c31749j.f64505d = arrayList;
                        c31749j.f64506e = list4;
                        c31749j.f64507f = null;
                        c31749j.f64508g = z11;
                        c31749j.f64511j = 5;
                        string2 = getString("sns_preview_idDocWarning_action_continue", c31749j);
                        if (string2 != coroutine_suspended) {
                            list5 = list4;
                            string7 = string2;
                            list6 = arrayList;
                            charSequence4 = charSequence3;
                            list7 = list3;
                            str2 = (String) string7;
                            if (z11) {
                                str4 = str2;
                                str5 = null;
                                list8 = list7;
                            } else {
                                c31749j.f64502a = list7;
                                c31749j.f64503b = charSequence4;
                                c31749j.f64504c = spannedM69364a;
                                c31749j.f64505d = list6;
                                c31749j.f64506e = list5;
                                c31749j.f64507f = str2;
                                c31749j.f64508g = z11;
                                c31749j.f64511j = 6;
                                string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                                if (string4 != coroutine_suspended) {
                                    str3 = str2;
                                    string7 = string4;
                                    list8 = list7;
                                    str5 = (String) string7;
                                    str4 = str3;
                                }
                            }
                            AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                            String str16 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                            C33272c c33272c6 = C33272c.f67812a;
                            C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str16, new IllegalArgumentException(str16));
                            showProgress(false);
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            case 3:
                z11 = c31749j.f64508g;
                c29983l2 = (C29983l) c31749j.f64507f;
                abstractC29180q2 = (AbstractC29180q2) c31749j.f64506e;
                interfaceC30000a3 = (InterfaceC30000a) c31749j.f64505d;
                charSequence3 = (CharSequence) c31749j.f64504c;
                list3 = (List) c31749j.f64503b;
                abstractC30146q2 = (AbstractC30146q) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                spannedM69364a = AbstractC28462i0.m69364a(abstractC29180q2.m69801a(c29983l2, (CharSequence) string7), ((C28547d) interfaceC30000a3).f58099a.f58163a);
                C30145p c30145p5 = (C30145p) abstractC30146q2;
                List<C30217h0> list13 = c30145p5.f60582d;
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    if (c30217h0 != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                list4 = c30145p5.f60580b;
                if (z11) {
                    c31749j.f64502a = list3;
                    c31749j.f64503b = charSequence3;
                    c31749j.f64504c = spannedM69364a;
                    c31749j.f64505d = arrayList;
                    c31749j.f64506e = list4;
                    c31749j.f64507f = null;
                    c31749j.f64508g = z11;
                    c31749j.f64511j = 4;
                    string3 = getString("sns_preview_idDocError_action_retake", c31749j);
                    if (string3 != coroutine_suspended) {
                        list5 = list4;
                        string7 = string3;
                        list6 = arrayList;
                        charSequence4 = charSequence3;
                        list7 = list3;
                        str2 = (String) string7;
                        if (z11) {
                            str4 = str2;
                            str5 = null;
                            list8 = list7;
                        } else {
                            c31749j.f64502a = list7;
                            c31749j.f64503b = charSequence4;
                            c31749j.f64504c = spannedM69364a;
                            c31749j.f64505d = list6;
                            c31749j.f64506e = list5;
                            c31749j.f64507f = str2;
                            c31749j.f64508g = z11;
                            c31749j.f64511j = 6;
                            string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                            if (string4 != coroutine_suspended) {
                                str3 = str2;
                                string7 = string4;
                                list8 = list7;
                                str5 = (String) string7;
                                str4 = str3;
                            }
                        }
                        AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                        String str17 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                        C33272c c33272c7 = C33272c.f67812a;
                        C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str17, new IllegalArgumentException(str17));
                        showProgress(false);
                        return Unit.INSTANCE;
                    }
                } else {
                    c31749j.f64502a = list3;
                    c31749j.f64503b = charSequence3;
                    c31749j.f64504c = spannedM69364a;
                    c31749j.f64505d = arrayList;
                    c31749j.f64506e = list4;
                    c31749j.f64507f = null;
                    c31749j.f64508g = z11;
                    c31749j.f64511j = 5;
                    string2 = getString("sns_preview_idDocWarning_action_continue", c31749j);
                    if (string2 != coroutine_suspended) {
                        list5 = list4;
                        string7 = string2;
                        list6 = arrayList;
                        charSequence4 = charSequence3;
                        list7 = list3;
                        str2 = (String) string7;
                        if (z11) {
                            str4 = str2;
                            str5 = null;
                            list8 = list7;
                        } else {
                            c31749j.f64502a = list7;
                            c31749j.f64503b = charSequence4;
                            c31749j.f64504c = spannedM69364a;
                            c31749j.f64505d = list6;
                            c31749j.f64506e = list5;
                            c31749j.f64507f = str2;
                            c31749j.f64508g = z11;
                            c31749j.f64511j = 6;
                            string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                            if (string4 != coroutine_suspended) {
                                str3 = str2;
                                string7 = string4;
                                list8 = list7;
                                str5 = (String) string7;
                                str4 = str3;
                            }
                        }
                        AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                        String str18 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                        C33272c c33272c8 = C33272c.f67812a;
                        C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str18, new IllegalArgumentException(str18));
                        showProgress(false);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 4:
                z11 = c31749j.f64508g;
                list5 = (List) c31749j.f64506e;
                list6 = (List) c31749j.f64505d;
                spannedM69364a = (Spanned) c31749j.f64504c;
                charSequence4 = (CharSequence) c31749j.f64503b;
                list7 = (List) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                str2 = (String) string7;
                if (z11) {
                    c31749j.f64502a = list7;
                    c31749j.f64503b = charSequence4;
                    c31749j.f64504c = spannedM69364a;
                    c31749j.f64505d = list6;
                    c31749j.f64506e = list5;
                    c31749j.f64507f = str2;
                    c31749j.f64508g = z11;
                    c31749j.f64511j = 6;
                    string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                    if (string4 != coroutine_suspended) {
                        str3 = str2;
                        string7 = string4;
                        list8 = list7;
                        str5 = (String) string7;
                        str4 = str3;
                    }
                    return coroutine_suspended;
                }
                str4 = str2;
                str5 = null;
                list8 = list7;
                AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                String str19 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                C33272c c33272c9 = C33272c.f67812a;
                C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str19, new IllegalArgumentException(str19));
                showProgress(false);
                return Unit.INSTANCE;
            case 5:
                z11 = c31749j.f64508g;
                list5 = (List) c31749j.f64506e;
                list6 = (List) c31749j.f64505d;
                spannedM69364a = (Spanned) c31749j.f64504c;
                charSequence4 = (CharSequence) c31749j.f64503b;
                list7 = (List) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                str2 = (String) string7;
                if (z11) {
                    c31749j.f64502a = list7;
                    c31749j.f64503b = charSequence4;
                    c31749j.f64504c = spannedM69364a;
                    c31749j.f64505d = list6;
                    c31749j.f64506e = list5;
                    c31749j.f64507f = str2;
                    c31749j.f64508g = z11;
                    c31749j.f64511j = 6;
                    string4 = getString("sns_preview_idDocWarning_action_retake", c31749j);
                    if (string4 != coroutine_suspended) {
                        str3 = str2;
                        string7 = string4;
                        list8 = list7;
                        str5 = (String) string7;
                        str4 = str3;
                    }
                    return coroutine_suspended;
                }
                str4 = str2;
                str5 = null;
                list8 = list7;
                AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                String str110 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                C33272c c33272c10 = C33272c.f67812a;
                C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str110, new IllegalArgumentException(str110));
                showProgress(false);
                return Unit.INSTANCE;
            case 6:
                z11 = c31749j.f64508g;
                str3 = (String) c31749j.f64507f;
                list5 = (List) c31749j.f64506e;
                list6 = (List) c31749j.f64505d;
                spannedM69364a = (Spanned) c31749j.f64504c;
                charSequence4 = (CharSequence) c31749j.f64503b;
                list8 = (List) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                str5 = (String) string7;
                str4 = str3;
                AbstractC28073M0.updateState$default(this, false, new C31750K(spannedM69364a, new C31932u(charSequence4, str4, str5, z11, list5, list6), null), 1, null);
                String str111 = "Got warnings: " + list8 + " for " + this.f64476a.getType().f59014a;
                C33272c c33272c11 = C33272c.f67812a;
                C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w(AbstractC33294e.m71624a(this), str111, new IllegalArgumentException(str111));
                showProgress(false);
                return Unit.INSTANCE;
            case 7:
            case 11:
                ResultKt.throwOnFailure(string7);
                showProgress(false);
                return Unit.INSTANCE;
            case 8:
                th2 = (Throwable) c31749j.f64503b;
                abstractC31770c0 = (AbstractC31770c0) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                str6 = (String) string7;
                c31749j.f64502a = abstractC31770c0;
                c31749j.f64503b = th2;
                c31749j.f64504c = str6;
                c31749j.f64511j = 9;
                string5 = getString("sns_mrtdscan_error_chipIsNotReadable_subtitle", c31749j);
                if (string5 != coroutine_suspended) {
                    th3 = th2;
                    str7 = str6;
                    string7 = string5;
                    str8 = (String) string7;
                    c31749j.f64502a = abstractC31770c0;
                    c31749j.f64503b = th3;
                    c31749j.f64504c = str7;
                    c31749j.f64505d = str8;
                    c31749j.f64511j = 10;
                    string6 = getString("sns_preview_idDocError_action_retake", c31749j);
                    if (string6 != coroutine_suspended) {
                        str9 = str7;
                        str10 = str8;
                        string7 = string6;
                        abstractC31770c1 = abstractC31770c0;
                        th4 = th3;
                        abstractC31770c1.fireEvent(new C28135m(new C29119g0(th4, null, new C29095c0(24, str9, str10, (String) string7), 2), this.f64476a.getType().f59014a, null, null));
                        showProgress(false);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 9:
                str7 = (String) c31749j.f64504c;
                Throwable th5 = (Throwable) c31749j.f64503b;
                AbstractC31770c0 abstractC31770c2 = (AbstractC31770c0) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                th3 = th5;
                abstractC31770c0 = abstractC31770c2;
                str8 = (String) string7;
                c31749j.f64502a = abstractC31770c0;
                c31749j.f64503b = th3;
                c31749j.f64504c = str7;
                c31749j.f64505d = str8;
                c31749j.f64511j = 10;
                string6 = getString("sns_preview_idDocError_action_retake", c31749j);
                if (string6 != coroutine_suspended) {
                    str9 = str7;
                    str10 = str8;
                    string7 = string6;
                    abstractC31770c1 = abstractC31770c0;
                    th4 = th3;
                    abstractC31770c1.fireEvent(new C28135m(new C29119g0(th4, null, new C29095c0(24, str9, str10, (String) string7), 2), this.f64476a.getType().f59014a, null, null));
                    showProgress(false);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 10:
                str10 = (String) c31749j.f64505d;
                str9 = (String) c31749j.f64504c;
                th4 = (Throwable) c31749j.f64503b;
                abstractC31770c1 = (AbstractC31770c0) c31749j.f64502a;
                ResultKt.throwOnFailure(string7);
                abstractC31770c1.fireEvent(new C28135m(new C29119g0(th4, null, new C29095c0(24, str9, str10, (String) string7), 2), this.f64476a.getType().f59014a, null, null));
                showProgress(false);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70858a(AbstractC28978A2 abstractC28978A2, ContinuationImpl continuationImpl) {
        C31744E c31744e;
        Object obj;
        AbstractC31770c0 abstractC31770c0;
        InterfaceC28145r c31928q;
        if (continuationImpl instanceof C31744E) {
            c31744e = (C31744E) continuationImpl;
            int i11 = c31744e.f64493e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31744e.f64493e = i11 - Integer.MIN_VALUE;
            } else {
                c31744e = new C31744E(this, continuationImpl);
            }
        } else {
            c31744e = new C31744E(this, continuationImpl);
        }
        Object obj2 = c31744e.f64491c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31744e.f64493e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            C30237b c30237b = this.f64561j;
            c31744e.f64489a = abstractC28978A2;
            c31744e.f64490b = this;
            c31744e.f64493e = 1;
            Object objM70152a = c30237b.m70152a(abstractC28978A2, c31744e);
            if (objM70152a == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM70152a;
            abstractC31770c0 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC31770c0 abstractC31770c1 = c31744e.f64490b;
            AbstractC28978A2 abstractC28978A3 = c31744e.f64489a;
            ResultKt.throwOnFailure(obj2);
            abstractC31770c0 = abstractC31770c1;
            abstractC28978A2 = abstractC28978A3;
            obj = obj2;
        }
        if (((Boolean) obj).booleanValue()) {
            c31928q = new C31929r(abstractC28978A2.mo69719d().getType());
        } else {
            c31928q = new C31928q(abstractC28978A2);
        }
        abstractC31770c0.fireEvent(c31928q);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public Object mo70860a(Continuation continuation) {
        return getString("sns_preview_photo_action_accept", continuation);
    }

    /* JADX INFO: renamed from: a */
    public void mo70862a(boolean z11, Parcelable parcelable) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "On instructions showed, success=" + z11 + ", payload=" + parcelable, null, 4, null);
        if (z11 && (parcelable instanceof InterfaceC28145r)) {
            fireEvent((InterfaceC28145r) parcelable);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m70857a(int i11) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onPageSelected: " + i11, null);
    }
}
