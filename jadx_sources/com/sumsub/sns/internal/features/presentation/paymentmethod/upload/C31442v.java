package com.sumsub.sns.internal.features.presentation.paymentmethod.upload;

import android.graphics.Bitmap;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.PhotosAmount;
import com.sumsub.sns.internal.features.data.model.common.remote.C29218G0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30104c0;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30125T;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30139j;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import com.sumsub.sns.internal.features.domain.documents.C30121O;
import com.sumsub.sns.internal.features.domain.documents.C30132c;
import com.sumsub.sns.internal.features.domain.documents.C30134e;
import com.sumsub.sns.internal.features.domain.documents.C30141l;
import com.sumsub.sns.internal.features.domain.documents.C30143n;
import com.sumsub.sns.internal.features.domain.documents.C30145p;
import com.sumsub.sns.internal.features.domain.documents.C30151v;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.domain.utils.C30317b;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30808G;
import com.sumsub.sns.internal.features.presentation.common.C30807F;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32666q;
import com.sumsub.sns.internal.features.presentation.utils.C32668s;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.upload.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31442v extends AbstractC30808G {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ int f63730W = 0;

    /* JADX INFO: renamed from: f */
    public final Document f63731f;

    /* JADX INFO: renamed from: g */
    public final PhotosAmount f63732g;

    /* JADX INFO: renamed from: h */
    public final C30151v f63733h;

    /* JADX INFO: renamed from: i */
    public final C30104c0 f63734i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC30000a f63735j;

    /* JADX INFO: renamed from: k */
    public final C30317b f63736k;

    /* JADX INFO: renamed from: l */
    public final boolean f63737l;

    /* JADX INFO: renamed from: m */
    public final boolean f63738m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41669n f63739n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41669n f63740o;

    /* JADX INFO: renamed from: p */
    public Map f63741p;

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final Unit mo70460a(C32666q c32666q, List list) {
        C30152w c30152w;
        C30317b.m70184a(this.f63736k, "onDocumentsSelected, " + list);
        Map map = c32666q.f66669a;
        Map map2 = c32666q.f66670b;
        if (map.isEmpty()) {
            this.f63739n.setValue(null);
            this.f62236a.m71239a(IdentitySide.Front);
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29054T c29054t = (C29054T) it.next();
            C32635M.f66606w.getClass();
            String strM71291a = C32668s.m71291a(c29054t);
            if (strM71291a == null) {
                c30152w = null;
            } else {
                Bitmap bitmap = (Bitmap) map.get(strM71291a);
                File file = c29054t.f58995b;
                C30132c c30132c = (C30132c) map2.get(strM71291a);
                int i11 = c30132c != null ? c30132c.f60571a : 0;
                boolean zContainsKey = map2.containsKey(strM71291a);
                Map map3 = this.f63741p;
                c30152w = new C30152w(bitmap, file, i11, zContainsKey, strM71291a, map3 != null ? (CharSequence) map3.get(strM71291a) : null, 64);
            }
            if (c30152w != null) {
                arrayList.add(c30152w);
            }
        }
        this.f63739n.setValue(arrayList);
        if (this.f63737l) {
            this.f62236a.m71256i();
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90927m(this.f63739n, this.f63740o, new C31438r(c28075o, this, null));
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: e */
    public final void mo70470e() {
        C30152w c30152w;
        Object next;
        C30317b.m70184a(this.f63736k, "uploadDocuments");
        List list = (List) this.f63739n.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CharSequence charSequence = ((C30152w) next).f60594f;
                if (charSequence != null && charSequence.length() != 0) {
                    break;
                }
            }
            c30152w = (C30152w) next;
        } else {
            c30152w = null;
        }
        if (c30152w != null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31441u(this, c30152w, null), 3, null);
            return;
        }
        this.f63741p = null;
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "uploadDocuments");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30807F(this, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return "PAYMENT_METHODS";
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G, com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        Object value;
        List mutableList;
        if (!(interfaceC28077Q instanceof C31430j)) {
            super.intent(interfaceC28077Q);
            return;
        }
        C31430j c31430j = (C31430j) interfaceC28077Q;
        this.f62236a.m71237a(c31430j.f63687a);
        InterfaceC41669n interfaceC41669n = this.f63739n;
        do {
            value = interfaceC41669n.getValue();
            List list = (List) value;
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                mutableList = null;
            } else {
                mutableList.remove(c31430j.f63687a);
            }
        } while (!interfaceC41669n.compareAndSet(value, mutableList));
    }

    public C31442v(Document document, PhotosAmount photosAmount, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C31421a c31421a, C30151v c30151v, C30104c0 c30104c0, C28547d c28547d, C30316a c30316a) {
        boolean z11;
        super(interfaceC29953a, interfaceC29984m, c31421a, c30316a);
        this.f63731f = document;
        this.f63732g = photosAmount;
        this.f63733h = c30151v;
        this.f63734i = c30104c0;
        this.f63735j = c28547d;
        this.f63736k = new C30317b("SNSBankCardUpload", c30316a);
        if (photosAmount != PhotosAmount.ONE) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f63737l = z11;
        this.f63738m = photosAmount == PhotosAmount.TWO;
        this.f63739n = C41679x.m91009a(null);
        this.f63740o = C41679x.m91009a(Boolean.FALSE);
        C28936t c28936t = c31421a.f66623o;
        KProperty kProperty = C32635M.f66607x[1];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.valueOf(z11));
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final void mo70463a(C29054T c29054t, AbstractC30125T abstractC30125T, int i11) {
        Object value;
        Object value2;
        ArrayList arrayList;
        C30317b c30317b = this.f63736k;
        C32635M.f66606w.getClass();
        C30317b.m70184a(c30317b, "Upload progress " + C32668s.m71291a(c29054t) + C33844oi.f71346o + abstractC30125T + ", total:" + i11);
        InterfaceC41669n interfaceC41669n = this.f63740o;
        do {
            value = interfaceC41669n.getValue();
            ((Boolean) value).getClass();
        } while (!interfaceC41669n.compareAndSet(value, Boolean.TRUE));
        InterfaceC41669n interfaceC41669n2 = this.f63739n;
        do {
            value2 = interfaceC41669n2.getValue();
            List<C30152w> list = (List) value2;
            arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (C30152w c30152wM70118a : list) {
                    String str = c30152wM70118a.f60593e;
                    C32635M.f66606w.getClass();
                    File file = c29054t.f58995b;
                    if (Intrinsics.areEqual(str, file != null ? file.getAbsolutePath() : null)) {
                        c30152wM70118a = C30152w.m70118a(c30152wM70118a, 0, null, abstractC30125T, 63);
                    }
                    arrayList2.add(c30152wM70118a);
                }
                arrayList = arrayList2;
            }
        } while (!interfaceC41669n2.compareAndSet(value2, arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (m70725a((com.sumsub.sns.internal.features.domain.documents.C30145p) r7, (p852kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L33;
     */
    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo70458a(AbstractC30146q abstractC30146q, Continuation continuation) {
        C31439s c31439s;
        Object value;
        Object objM70113a;
        if (continuation instanceof C31439s) {
            c31439s = (C31439s) continuation;
            int i11 = c31439s.f63718c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31439s.f63718c = i11 - Integer.MIN_VALUE;
            } else {
                c31439s = new C31439s(this, continuation);
            }
        } else {
            c31439s = new C31439s(this, continuation);
        }
        Object obj = c31439s.f63716a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31439s.f63718c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C30317b.m70184a(this.f63736k, "onDocumentsUploadCompleted, " + abstractC30146q);
            InterfaceC41669n interfaceC41669n = this.f63740o;
            do {
                value = interfaceC41669n.getValue();
                ((Boolean) value).getClass();
            } while (!interfaceC41669n.compareAndSet(value, Boxing.boxBoolean(false)));
            if (abstractC30146q instanceof C30141l) {
                C30104c0 c30104c0 = this.f63734i;
                C29218G0 c29218g0 = new C29218G0();
                c31439s.f63718c = 1;
                objM70113a = c30104c0.m70113a(c29218g0, c31439s);
            } else if (abstractC30146q instanceof C30145p) {
                c31439s.f63718c = 2;
            } else if (!(abstractC30146q instanceof C30134e) && !(abstractC30146q instanceof AbstractC30139j) && !(abstractC30146q instanceof C30143n)) {
                throw new NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objM70113a = ((Result) obj).getValue();
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70113a);
        if (thM103847exceptionOrNullimpl != null) {
            mo70466a("PAYMENT_METHODS", thM103847exceptionOrNullimpl);
            return Unit.INSTANCE;
        }
        this.f62236a.m71254g();
        fireEvent(new C31429i(this.f63731f));
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final void mo70466a(String str, Throwable th2) {
        Object value;
        C30317b c30317b = this.f63736k;
        C30316a c30316a = c30317b.f60948b;
        String str2 = c30317b.f60947a;
        c30316a.getClass();
        C33272c.f67816e.f67810a.mo68956e(str2, "onDocumentsUploadError", th2);
        InterfaceC41669n interfaceC41669n = this.f63740o;
        do {
            value = interfaceC41669n.getValue();
            ((Boolean) value).getClass();
        } while (!interfaceC41669n.compareAndSet(value, Boolean.FALSE));
        AbstractC28052C.throwError$default(this, th2, str, null, 4, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final void mo70461a(int i11, File file) {
        Object value;
        ArrayList arrayList;
        InterfaceC41669n interfaceC41669n = this.f63739n;
        do {
            value = interfaceC41669n.getValue();
            List<C30152w> list = (List) value;
            arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (C30152w c30152wM70118a : list) {
                    if (Intrinsics.areEqual(c30152wM70118a.f60590b, file)) {
                        c30152wM70118a = C30152w.m70118a(c30152wM70118a, i11, null, null, 123);
                    }
                    arrayList2.add(c30152wM70118a);
                }
                arrayList = arrayList2;
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70725a(C30145p c30145p, ContinuationImpl continuationImpl) {
        C31440t c31440t;
        C30151v c30151v;
        C29124h c29124h;
        Object value;
        ArrayList arrayList;
        if (continuationImpl instanceof C31440t) {
            c31440t = (C31440t) continuationImpl;
            int i11 = c31440t.f63724f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31440t.f63724f = i11 - Integer.MIN_VALUE;
            } else {
                c31440t = new C31440t(this, continuationImpl);
            }
        } else {
            c31440t = new C31440t(this, continuationImpl);
        }
        Object obj = c31440t.f63722d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31440t.f63724f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C30317b.m70184a(this.f63736k, "Show warnings");
            C30151v c30151v2 = this.f63733h;
            C29124h c29124h2 = this.f62236a.f66630v;
            c31440t.f63719a = c30151v2;
            c31440t.f63720b = c29124h2;
            c31440t.f63721c = c30145p;
            c31440t.f63724f = 1;
            Object strings = getStrings(c31440t);
            if (strings == coroutine_suspended) {
                return coroutine_suspended;
            }
            c30151v = c30151v2;
            obj = strings;
            c29124h = c29124h2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30145p = c31440t.f63721c;
            c29124h = c31440t.f63720b;
            c30151v = c31440t.f63719a;
            ResultKt.throwOnFailure(obj);
        }
        Object objM70116a = c30151v.m70116a(c29124h, c30145p, (C29983l) obj);
        if (Result.m103850isFailureimpl(objM70116a)) {
            objM70116a = null;
        }
        Map map = (Map) objM70116a;
        this.f63741p = map;
        InterfaceC41669n interfaceC41669n = this.f63739n;
        do {
            value = interfaceC41669n.getValue();
            List<C30152w> list = (List) value;
            if (list != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (C30152w c30152w : list) {
                    arrayList.add(C30152w.m70118a(c30152w, 0, map != null ? (CharSequence) map.get(c30152w.f60593e) : null, C30121O.f60561a, 31));
                }
            } else {
                arrayList = null;
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
        return Unit.INSTANCE;
    }
}
