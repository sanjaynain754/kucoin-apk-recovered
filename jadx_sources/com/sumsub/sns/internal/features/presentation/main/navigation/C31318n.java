package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.navigation.C30027v;
import com.sumsub.sns.internal.features.domain.navigation.model.AbstractC30275D;
import com.sumsub.sns.internal.features.domain.navigation.model.C30272A;
import com.sumsub.sns.internal.features.domain.navigation.model.C30274C;
import com.sumsub.sns.internal.features.domain.navigation.model.C30276a;
import com.sumsub.sns.internal.features.domain.navigation.model.C30278c;
import com.sumsub.sns.internal.features.domain.navigation.model.C30279d;
import com.sumsub.sns.internal.features.domain.navigation.model.C30280e;
import com.sumsub.sns.internal.features.domain.navigation.model.C30281f;
import com.sumsub.sns.internal.features.domain.navigation.model.C30282g;
import com.sumsub.sns.internal.features.domain.navigation.model.C30283h;
import com.sumsub.sns.internal.features.domain.navigation.model.C30284i;
import com.sumsub.sns.internal.features.domain.navigation.model.C30285j;
import com.sumsub.sns.internal.features.domain.navigation.model.C30286k;
import com.sumsub.sns.internal.features.domain.navigation.model.C30287l;
import com.sumsub.sns.internal.features.domain.navigation.model.C30288m;
import com.sumsub.sns.internal.features.domain.navigation.model.C30289n;
import com.sumsub.sns.internal.features.domain.navigation.model.C30291p;
import com.sumsub.sns.internal.features.domain.navigation.model.C30292q;
import com.sumsub.sns.internal.features.domain.navigation.model.C30293r;
import com.sumsub.sns.internal.features.domain.navigation.model.C30294s;
import com.sumsub.sns.internal.features.domain.navigation.model.C30295t;
import com.sumsub.sns.internal.features.domain.navigation.model.C30296u;
import com.sumsub.sns.internal.features.domain.navigation.model.C30297v;
import com.sumsub.sns.internal.features.domain.navigation.model.C30298w;
import com.sumsub.sns.internal.features.domain.navigation.model.C30299x;
import com.sumsub.sns.internal.features.domain.navigation.model.C30300y;
import com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30290o;
import com.sumsub.sns.internal.features.domain.navigation.model.InterfaceC30301z;
import com.sumsub.sns.internal.features.presentation.main.C31163A;
import com.sumsub.sns.internal.features.presentation.main.C31169C;
import com.sumsub.sns.internal.features.presentation.main.C31175E;
import com.sumsub.sns.internal.features.presentation.main.C31187I;
import com.sumsub.sns.internal.features.presentation.main.C31193K;
import com.sumsub.sns.internal.features.presentation.main.C31198L1;
import com.sumsub.sns.internal.features.presentation.main.C31205O;
import com.sumsub.sns.internal.features.presentation.main.C31211Q;
import com.sumsub.sns.internal.features.presentation.main.C31219T;
import com.sumsub.sns.internal.features.presentation.main.C31225V;
import com.sumsub.sns.internal.features.presentation.main.C31231X;
import com.sumsub.sns.internal.features.presentation.main.C31297m;
import com.sumsub.sns.internal.features.presentation.main.C31327o;
import com.sumsub.sns.internal.features.presentation.main.C31335q;
import com.sumsub.sns.internal.features.presentation.main.C31350u;
import com.sumsub.sns.internal.features.presentation.main.C31358w;
import com.sumsub.sns.internal.features.presentation.main.C31366y;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41673r;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31318n {

    /* JADX INFO: renamed from: a */
    public final C30027v f63476a;

    /* JADX INFO: renamed from: b */
    public C30274C f63477b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41668m f63478c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41673r f63479d;

    /* JADX INFO: renamed from: a */
    public final Object m70673a(C30278c c30278c, String str, boolean z11, C31311g c31311g) {
        InterfaceC30290o interfaceC30290o;
        if (c30278c == null || (interfaceC30290o = c30278c.f60875c) == null) {
            return Unit.INSTANCE;
        }
        C33272c.f67816e.f67810a.mo68955d("ServerNavigationRouter", "Step completed: " + interfaceC30290o + ", levelName=" + str + ", isCancelled=" + z11, null);
        Object objEmit = this.f63478c.emit(new C31308d(interfaceC30290o.getType(), z11, str), c31311g);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70678b(ContinuationImpl continuationImpl) {
        C31316l c31316l;
        if (continuationImpl instanceof C31316l) {
            c31316l = (C31316l) continuationImpl;
            int i11 = c31316l.f63473c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31316l.f63473c = i11 - Integer.MIN_VALUE;
            } else {
                c31316l = new C31316l(this, continuationImpl);
            }
        } else {
            c31316l = new C31316l(this, continuationImpl);
        }
        Object obj = c31316l.f63471a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31316l.f63473c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("ServerNavigationRouter", "postInit: applying navigation state", null);
            C30274C c30274c = this.f63477b;
            if (c30274c == null) {
                Exception exc = new Exception("Failed to apply navigation state, navigation not initialized");
                AbstractC33293d.m71623a("ServerNavigationRouter", "Post init error: " + exc.getMessage(), exc);
                Result.Companion companion = Result.INSTANCE;
                return Result.m103844constructorimpl(ResultKt.createFailure(exc));
            }
            c31316l.f63473c = 1;
            if (m70671a((C30274C) null, c30274c, false, (ContinuationImpl) c31316l) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m103844constructorimpl(Unit.INSTANCE);
    }

    public C31318n(C30027v c30027v, C31325u c31325u) {
        this.f63476a = c30027v;
        InterfaceC41668m interfaceC41668mM91001b = C41674s.m91001b(0, 16, BufferOverflow.DROP_OLDEST, 1, null);
        this.f63478c = interfaceC41668mM91001b;
        this.f63479d = C41636g.m90905b(interfaceC41668mM91001b);
    }

    /* JADX INFO: renamed from: a */
    public final Object m70672a(C30278c c30278c, C31311g c31311g) {
        InterfaceC30290o interfaceC30290o = c30278c.f60875c;
        if (interfaceC30290o == null) {
            return Unit.INSTANCE;
        }
        C33272c.f67816e.f67810a.mo68955d("ServerNavigationRouter", "Step initiated: " + interfaceC30290o, null);
        Object objEmit = this.f63478c.emit(new C31309e(interfaceC30290o.getType()), c31311g);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (r0 == r1) goto L29;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00b5, please report this as an issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70676a(ContinuationImpl continuationImpl) {
        C31312h c31312h;
        Object objM70069a;
        Object obj;
        Throwable thM103847exceptionOrNullimpl;
        if (continuationImpl instanceof C31312h) {
            c31312h = (C31312h) continuationImpl;
            int i11 = c31312h.f63458d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31312h.f63458d = i11 - Integer.MIN_VALUE;
            } else {
                c31312h = new C31312h(this, continuationImpl);
            }
        } else {
            c31312h = new C31312h(this, continuationImpl);
        }
        Object obj2 = c31312h.f63456b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31312h.f63458d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            C33272c.f67816e.f67810a.mo68955d("ServerNavigationRouter", "init: requesting full state", null);
            C30027v c30027v = this.f63476a;
            c31312h.f63458d = 1;
            objM70069a = c30027v.m70069a(true, (ContinuationImpl) c31312h);
            if (objM70069a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj2);
            objM70069a = ((Result) obj2).getValue();
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c31312h.f63455a;
            ResultKt.throwOnFailure(obj2);
        }
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
        if (thM103847exceptionOrNullimpl != null) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("ServerNavigationRouter", "Failed to init server navigation: " + thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
        }
        if (Result.m103851isSuccessimpl(obj)) {
            return Result.m103844constructorimpl(obj);
        }
        return Result.m103844constructorimpl(Unit.INSTANCE);
        if (Result.m103851isSuccessimpl(objM70069a)) {
            C30274C c30274c = (C30274C) objM70069a;
            C33272c.f67816e.f67810a.mo68955d("ServerNavigationRouter", "init: success, step=" + c30274c.f60865b.f60873a + ", version=" + c30274c.f60866c, null);
            this.f63477b = c30274c;
            C30272A c30272a = c30274c.f60867d;
            c31312h.f63455a = objM70069a;
            c31312h.f63458d = 2;
            if (c30272a == null || (objEmit = this.f63478c.emit(new C31307c(c30272a), c31312h)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                Object objEmit = Unit.INSTANCE;
            }
        }
        obj = objM70069a;
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
        if (thM103847exceptionOrNullimpl != null) {
            C33272c c33272c2 = C33272c.f67812a;
            AbstractC33293d.m71623a("ServerNavigationRouter", "Failed to init server navigation: " + thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
        }
        if (Result.m103851isSuccessimpl(obj)) {
            return Result.m103844constructorimpl(obj);
        }
        return Result.m103844constructorimpl(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public final Object m70675a(ServerNavigationRouter$ReinitReason serverNavigationRouter$ReinitReason, SuspendLambda suspendLambda) {
        C33272c.f67816e.f67810a.mo68955d("ServerNavigationRouter", "Reinitializing navigation state due to " + serverNavigationRouter$ReinitReason, null);
        Object objM70677a = m70677a(false, new C31317m(this, null), suspendLambda);
        return objM70677a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70677a : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
    
        if (m70671a(r2, r14, r13, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013f, code lost:
    
        if (r13 == r1) goto L62;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70677a(boolean z11, Function2 function2, ContinuationImpl continuationImpl) {
        C31313i c31313i;
        C30278c c30278c;
        C30274C c30274c;
        String str;
        Object objEmit;
        C30274C c30274c2;
        if (continuationImpl instanceof C31313i) {
            c31313i = (C31313i) continuationImpl;
            int i11 = c31313i.f63464f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31313i.f63464f = i11 - Integer.MIN_VALUE;
            } else {
                c31313i = new C31313i(this, continuationImpl);
            }
        } else {
            c31313i = new C31313i(this, continuationImpl);
        }
        Object obj = c31313i.f63462d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31313i.f63464f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C30274C c30274c3 = this.f63477b;
            C30278c c30278c2 = c30274c3 != null ? c30274c3.f60865b : null;
            String str2 = c30274c3 != null ? c30274c3.f60866c : null;
            c31313i.f63460b = c30274c3;
            c31313i.f63461c = c30278c2;
            c31313i.f63459a = z11;
            c31313i.f63464f = 1;
            Object objInvoke = function2.invoke(str2, c31313i);
            if (objInvoke != coroutine_suspended) {
                obj = objInvoke;
                c30278c = c30278c2;
                c30274c = c30274c3;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    z11 = c31313i.f63459a;
                    c30274c2 = (C30274C) c31313i.f63461c;
                    c30274c = c31313i.f63460b;
                    ResultKt.throwOnFailure(obj);
                    c31313i.f63460b = null;
                    c31313i.f63461c = null;
                    c31313i.f63464f = 4;
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        z11 = c31313i.f63459a;
        c30278c = (C30278c) c31313i.f63461c;
        c30274c = c31313i.f63460b;
        ResultKt.throwOnFailure(obj);
        Object value = ((Result) obj).getValue();
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(value);
        if (thM103847exceptionOrNullimpl == null) {
            C30274C c30274c4 = (C30274C) value;
            InterfaceC30301z interfaceC30301z = c30278c != null ? c30278c.f60873a : null;
            C33272c.f67816e.f67810a.mo68955d("ServerNavigationRouter", "navigate: success, from=" + interfaceC30301z + " to=" + c30274c4.f60865b.f60873a + ", version=" + c30274c4.f60866c, null);
            this.f63477b = c30274c4;
            C30272A c30272a = c30274c4.f60867d;
            c31313i.f63460b = c30274c;
            c31313i.f63461c = c30274c4;
            c31313i.f63459a = z11;
            c31313i.f63464f = 3;
            if (c30272a == null || (objEmit = this.f63478c.emit(new C31307c(c30272a), c31313i)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
            if (objEmit != coroutine_suspended) {
                c30274c2 = c30274c4;
                c31313i.f63460b = null;
                c31313i.f63461c = null;
                c31313i.f63464f = 4;
            }
        } else {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("ServerNavigationRouter", "Navigation error: " + thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
            if (c30278c == null || (str = AbstractC30275D.m70171a(c30278c.f60873a).f59014a) == null) {
                str = "TYPE_UNKNOWN";
            }
            c31313i.f63460b = null;
            c31313i.f63461c = null;
            c31313i.f63464f = 2;
            Object objEmit2 = this.f63478c.emit(new C31305a(str, thM103847exceptionOrNullimpl), c31313i);
            if (objEmit2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objEmit2 = Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final Object m70674a(C31198L1 c31198l1) {
        C33272c.f67816e.f67810a.mo68955d("ServerNavigationRouter", "navigateBack", null);
        Object objM70677a = m70677a(true, new C31314j(this, null), c31198l1);
        return objM70677a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70677a : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0237 A[PHI: r10
      0x0237: PHI (r10v16 com.sumsub.sns.internal.features.presentation.main.navigation.t) = 
      (r10v15 com.sumsub.sns.internal.features.presentation.main.navigation.t)
      (r10v24 com.sumsub.sns.internal.features.presentation.main.navigation.t)
     binds: [B:118:0x0234, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024a, code lost:
    
        if (r11.emit(r12, r0) == r1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x027a, code lost:
    
        if (r10 == r1) goto L132;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70671a(C30274C c30274c, C30274C c30274c2, boolean z11, ContinuationImpl continuationImpl) {
        C31311g c31311g;
        InterfaceC31324t c31321q;
        InterfaceC31324t c31323s;
        InterfaceC31324t interfaceC31324t;
        C30276a c30276a;
        C30278c c30278c;
        if (continuationImpl instanceof C31311g) {
            c31311g = (C31311g) continuationImpl;
            int i11 = c31311g.f63454e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31311g.f63454e = i11 - Integer.MIN_VALUE;
            } else {
                c31311g = new C31311g(this, continuationImpl);
            }
        } else {
            c31311g = new C31311g(this, continuationImpl);
        }
        Object obj = c31311g.f63452c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31311g.f63454e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C30278c c30278c2 = c30274c2.f60865b;
            InterfaceC30301z interfaceC30301z = c30278c2.f60873a;
            if (interfaceC30301z instanceof InterfaceC30290o) {
                InterfaceC30290o interfaceC30290o = (InterfaceC30290o) interfaceC30301z;
                Document document = new Document(interfaceC30290o.mo70172a(), null);
                if (interfaceC30290o instanceof C30280e) {
                    c31321q = new C31323s(new C31327o(document));
                } else if (interfaceC30290o instanceof C30283h) {
                    c31321q = new C31323s(new C31350u(document));
                } else if (interfaceC30290o instanceof C30285j) {
                    c31321q = new C31323s(new C31358w(document));
                } else if (interfaceC30290o instanceof C30284i) {
                    c31321q = new C31323s(new C31187I(document));
                } else if (interfaceC30290o instanceof C30288m) {
                    String str = ((C30288m) interfaceC30290o).f60888b;
                    if (Intrinsics.areEqual(str, "enabled")) {
                        c31321q = new C31323s(new C31205O(document));
                    } else if (Intrinsics.areEqual(str, "photoRequired")) {
                        c31321q = new C31323s(new C31193K(document));
                    } else {
                        c31321q = new C31323s(new C31175E(document));
                    }
                } else if (interfaceC30290o instanceof C30286k) {
                    if (((C30286k) interfaceC30290o).m70173b()) {
                        c31321q = new C31323s(new C31169C(document));
                    } else {
                        c31321q = new C31323s(new C31211Q(document));
                    }
                } else if (interfaceC30290o instanceof C30282g) {
                    c31321q = new C31323s(new C31163A(document));
                } else if (interfaceC30290o instanceof C30281f) {
                    c31321q = new C31323s(new C31366y(document));
                } else if (interfaceC30290o instanceof C30287l) {
                    c31321q = new C31323s(new C31219T(document, ((C30287l) interfaceC30290o).f60886b));
                } else {
                    if (!(interfaceC30290o instanceof C30289n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c31321q = new C31321q(interfaceC30290o);
                }
            } else {
                if (interfaceC30301z instanceof C30298w) {
                    if (!AbstractC28409N0.m69294a("com.sumsub.sns.videoident.BuildConfig")) {
                        c31323s = new C31320p(c30278c2.f60873a);
                    } else {
                        c31323s = new C31323s(new C31231X(CollectionsKt.emptyList()));
                    }
                } else if (interfaceC30301z instanceof C30293r) {
                    c31321q = new C31323s(new C31175E(new Document(new C29070X("SELFIE"), null)));
                } else if (interfaceC30301z instanceof C30279d) {
                    c31323s = new C31323s(C31297m.f63422c);
                } else if (interfaceC30301z instanceof C30300y) {
                    c31323s = new C31323s(C31335q.f63516c);
                } else if (interfaceC30301z instanceof C30294s) {
                    c31321q = new C31321q(interfaceC30301z);
                } else if ((interfaceC30301z instanceof C30297v) || (interfaceC30301z instanceof C30296u)) {
                    c31323s = new C31323s(C31335q.f63516c);
                } else if (interfaceC30301z instanceof C30291p) {
                    C29586o0 c29586o0 = c30278c2.f60874b.f60863a;
                    if (c29586o0 == null) {
                        c29586o0 = new C29586o0();
                    }
                    c31321q = new C31323s(new C31225V(c29586o0));
                } else {
                    if (!(interfaceC30301z instanceof C30299x) && !(interfaceC30301z instanceof C30292q) && !(interfaceC30301z instanceof C30295t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c31321q = new C31321q(interfaceC30301z);
                }
                c31321q = c31323s;
            }
            if (c31321q instanceof C31323s) {
                C30278c c30278c3 = c30274c != null ? c30274c.f60865b : null;
                String str2 = (c30274c == null || (c30276a = c30274c.f60868e) == null) ? null : c30276a.f60869a;
                c31311g.f63450a = c30274c2;
                c31311g.f63451b = (C31323s) c31321q;
                c31311g.f63454e = 1;
                if (m70673a(c30278c3, str2, z11, c31311g) != coroutine_suspended) {
                    interfaceC31324t = c31321q;
                    c30278c = c30274c2.f60865b;
                    c31311g.f63450a = interfaceC31324t;
                    c31311g.f63451b = null;
                    c31311g.f63454e = 2;
                    if (m70672a(c30278c, c31311g) != coroutine_suspended) {
                        InterfaceC41668m interfaceC41668m = this.f63478c;
                        C31306b c31306b = new C31306b(((C31323s) interfaceC31324t).f63482a);
                        c31311g.f63450a = null;
                        c31311g.f63454e = 3;
                    }
                }
            } else if (c31321q instanceof InterfaceC31322r) {
                InterfaceC31322r interfaceC31322r = (InterfaceC31322r) c31321q;
                Exception excMo70680a = interfaceC31322r.mo70680a();
                String str3 = AbstractC30275D.m70171a(interfaceC31322r.getType()).f59014a;
                c31311g.f63454e = 4;
                Object objEmit = this.f63478c.emit(new C31305a(str3, excMo70680a), c31311g);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC31324t = c31311g.f63451b;
            c30274c2 = (C30274C) c31311g.f63450a;
            ResultKt.throwOnFailure(obj);
            c30278c = c30274c2.f60865b;
            c31311g.f63450a = interfaceC31324t;
            c31311g.f63451b = null;
            c31311g.f63454e = 2;
            if (m70672a(c30278c, c31311g) != coroutine_suspended) {
                InterfaceC41668m interfaceC41668m2 = this.f63478c;
                C31306b c31306b2 = new C31306b(((C31323s) interfaceC31324t).f63482a);
                c31311g.f63450a = null;
                c31311g.f63454e = 3;
            }
            return coroutine_suspended;
        }
        if (i12 == 2) {
            interfaceC31324t = (InterfaceC31324t) c31311g.f63450a;
            ResultKt.throwOnFailure(obj);
            InterfaceC41668m interfaceC41668m3 = this.f63478c;
            C31306b c31306b3 = new C31306b(((C31323s) interfaceC31324t).f63482a);
            c31311g.f63450a = null;
            c31311g.f63454e = 3;
        } else {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
