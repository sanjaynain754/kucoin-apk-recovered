package com.sumsub.sns.internal.features.presentation.preview;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC31739h extends AbstractC28073M0 {

    /* JADX INFO: renamed from: a */
    public final Document f64476a;

    /* JADX INFO: renamed from: b */
    public final SavedStateHandle f64477b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f64478c;

    /* JADX INFO: renamed from: d */
    public final C30156e f64479d;

    /* JADX INFO: renamed from: e */
    public Map f64480e;

    /* JADX INFO: renamed from: f */
    public Map f64481f;

    /* JADX INFO: renamed from: a */
    public abstract Object mo70740a(AbstractC29172p abstractC29172p, C29124h c29124h, Continuation continuation);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70854a(Function1 function1, ContinuationImpl continuationImpl) {
        C31738g c31738g;
        if (continuationImpl instanceof C31738g) {
            c31738g = (C31738g) continuationImpl;
            int i11 = c31738g.f64475c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31738g.f64475c = i11 - Integer.MIN_VALUE;
            } else {
                c31738g = new C31738g(this, continuationImpl);
            }
        } else {
            c31738g = new C31738g(this, continuationImpl);
        }
        Object obj = c31738g.f64473a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31738g.f64475c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            showProgress(true);
            mo70746c(false);
            c31738g.f64475c = 1;
            if (function1.invoke(c31738g) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        showProgress(false);
        mo70746c(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo70746c(boolean z11);

    public AbstractC31739h(Document document, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C30156e c30156e) {
        super(interfaceC29953a, interfaceC29984m);
        this.f64476a = document;
        this.f64477b = savedStateHandle;
        this.f64478c = interfaceC29984m;
        this.f64479d = c30156e;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public void onLoad() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31737f(this, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m70853a(AbstractC31739h abstractC31739h, Throwable th2) {
        abstractC31739h.getClass();
        C33272c c33272c = C33272c.f67812a;
        C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(abstractC31739h), "Exception while getting a data", th2);
        abstractC31739h.showProgress(false);
        abstractC31739h.throwError(th2, abstractC31739h.f64476a.getType().f59014a, null);
    }

    /* JADX INFO: renamed from: a */
    public void mo70743a(C30270n c30270n) {
        this.f64480e = c30270n.f60854a;
        this.f64481f = c30270n.f60856c;
    }
}
