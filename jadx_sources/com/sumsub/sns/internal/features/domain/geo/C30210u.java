package com.sumsub.sns.internal.features.domain.geo;

import com.sumsub.sns.core.data.model.SNSInvalidConfigurationException;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29027M;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.geo.C29795e;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Iterator;
import java.util.List;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30210u {

    /* JADX INFO: renamed from: a */
    public final C29917M f60715a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29953a f60716b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f60717c;

    /* JADX INFO: renamed from: d */
    public final C30207r f60718d;

    /* JADX WARN: Code duplicated, block: B:40:0x00a3 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:44:0x00b2, B:21:0x004b, B:38:0x009d, B:40:0x00a3, B:46:0x00c5, B:48:0x00c9, B:50:0x00d8, B:52:0x00dc, B:54:0x00e6, B:56:0x00ea, B:58:0x00f4, B:59:0x00f9, B:24:0x0058, B:30:0x0071, B:32:0x0086, B:34:0x008a, B:60:0x00fa, B:27:0x005f), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:44:0x00b2, B:21:0x004b, B:38:0x009d, B:40:0x00a3, B:46:0x00c5, B:48:0x00c9, B:50:0x00d8, B:52:0x00dc, B:54:0x00e6, B:56:0x00ea, B:58:0x00f4, B:59:0x00f9, B:24:0x0058, B:30:0x0071, B:32:0x0086, B:34:0x008a, B:60:0x00fa, B:27:0x005f), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:44:0x00b2, B:21:0x004b, B:38:0x009d, B:40:0x00a3, B:46:0x00c5, B:48:0x00c9, B:50:0x00d8, B:52:0x00dc, B:54:0x00e6, B:56:0x00ea, B:58:0x00f4, B:59:0x00f9, B:24:0x0058, B:30:0x0071, B:32:0x0086, B:34:0x008a, B:60:0x00fa, B:27:0x005f), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:44:0x00b2, B:21:0x004b, B:38:0x009d, B:40:0x00a3, B:46:0x00c5, B:48:0x00c9, B:50:0x00d8, B:52:0x00dc, B:54:0x00e6, B:56:0x00ea, B:58:0x00f4, B:59:0x00f9, B:24:0x0058, B:30:0x0071, B:32:0x0086, B:34:0x008a, B:60:0x00fa, B:27:0x005f), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:44:0x00b2, B:21:0x004b, B:38:0x009d, B:40:0x00a3, B:46:0x00c5, B:48:0x00c9, B:50:0x00d8, B:52:0x00dc, B:54:0x00e6, B:56:0x00ea, B:58:0x00f4, B:59:0x00f9, B:24:0x0058, B:30:0x0071, B:32:0x0086, B:34:0x008a, B:60:0x00fa, B:27:0x005f), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:44:0x00b2, B:21:0x004b, B:38:0x009d, B:40:0x00a3, B:46:0x00c5, B:48:0x00c9, B:50:0x00d8, B:52:0x00dc, B:54:0x00e6, B:56:0x00ea, B:58:0x00f4, B:59:0x00f9, B:24:0x0058, B:30:0x0071, B:32:0x0086, B:34:0x008a, B:60:0x00fa, B:27:0x005f), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:44:0x00b2, B:21:0x004b, B:38:0x009d, B:40:0x00a3, B:46:0x00c5, B:48:0x00c9, B:50:0x00d8, B:52:0x00dc, B:54:0x00e6, B:56:0x00ea, B:58:0x00f4, B:59:0x00f9, B:24:0x0058, B:30:0x0071, B:32:0x0086, B:34:0x008a, B:60:0x00fa, B:27:0x005f), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:44:0x00b2, B:21:0x004b, B:38:0x009d, B:40:0x00a3, B:46:0x00c5, B:48:0x00c9, B:50:0x00d8, B:52:0x00dc, B:54:0x00e6, B:56:0x00ea, B:58:0x00f4, B:59:0x00f9, B:24:0x0058, B:30:0x0071, B:32:0x0086, B:34:0x008a, B:60:0x00fa, B:27:0x005f), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70138a(String str, C29795e c29795e, ContinuationImpl continuationImpl) {
        C30209t c30209t;
        List list;
        String str2;
        List list2;
        InterfaceC30204o interfaceC30204o;
        List list3;
        InterfaceC30204o interfaceC30204o2;
        if (continuationImpl instanceof C30209t) {
            c30209t = (C30209t) continuationImpl;
            int i11 = c30209t.f60714e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30209t.f60714e = i11 - Integer.MIN_VALUE;
            } else {
                c30209t = new C30209t(this, continuationImpl);
            }
        } else {
            c30209t = new C30209t(this, continuationImpl);
        }
        Object objM70043a = c30209t.f60712c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30209t.f60714e;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                InterfaceC29984m interfaceC29984m = this.f60717c;
                c30209t.f60710a = str;
                c30209t.f60711b = c29795e;
                c30209t.f60714e = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30209t);
                if (objM70043a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                c29795e = (C29795e) c30209t.f60711b;
                str = (String) c30209t.f60710a;
                ResultKt.throwOnFailure(objM70043a);
            } else {
                if (i12 == 2) {
                    list2 = (List) c30209t.f60711b;
                    str2 = (String) c30209t.f60710a;
                    ResultKt.throwOnFailure(objM70043a);
                    interfaceC30204o = (InterfaceC30204o) objM70043a;
                    if (!(interfaceC30204o instanceof C30201l)) {
                        c30209t.f60710a = list2;
                        c30209t.f60711b = interfaceC30204o;
                        c30209t.f60714e = 3;
                        if (m70139a(str2, c30209t) != coroutine_suspended) {
                            list3 = list2;
                            interfaceC30204o2 = interfaceC30204o;
                        }
                        return coroutine_suspended;
                    }
                    if (interfaceC30204o instanceof C30203n) {
                        return new C30193d(((C30203n) interfaceC30204o).f60695a, ((C30203n) interfaceC30204o).f60696b);
                    }
                    if (interfaceC30204o instanceof C30202m) {
                        return new C30192c(((C30202m) interfaceC30204o).f60694a);
                    }
                    if (interfaceC30204o instanceof C30200k) {
                        return new C30190a(((C30200k) interfaceC30204o).f60691a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC30204o2 = (InterfaceC30204o) c30209t.f60711b;
                list3 = (List) c30209t.f60710a;
                ResultKt.throwOnFailure(objM70043a);
            }
            return new C30191b(AbstractC30211v.m70140a(list3, ((C30201l) interfaceC30204o2).f60692a), ((C30201l) interfaceC30204o2).f60693b);
            AbstractC29172p abstractC29172p = (AbstractC29172p) objM70043a;
            String strMo69754e = abstractC29172p.mo69754e();
            C29070X.Companion.getClass();
            C29154m c29154mM69794a = abstractC29172p.m69794a(C29062V.m69739a(str));
            if (c29154mM69794a == null || (list = c29154mM69794a.f59136e) == null) {
                return new C30190a(new SNSInvalidConfigurationException("Configuration error: no fields found"));
            }
            C30207r c30207r = this.f60718d;
            c30209t.f60710a = str;
            c30209t.f60711b = list;
            c30209t.f60714e = 2;
            Object objM70137a = c30207r.m70137a(strMo69754e, c29795e, c30209t);
            if (objM70137a != coroutine_suspended) {
                str2 = str;
                list2 = list;
                objM70043a = objM70137a;
                interfaceC30204o = (InterfaceC30204o) objM70043a;
                if (!(interfaceC30204o instanceof C30201l)) {
                    if (interfaceC30204o instanceof C30203n) {
                        return new C30193d(((C30203n) interfaceC30204o).f60695a, ((C30203n) interfaceC30204o).f60696b);
                    }
                    if (interfaceC30204o instanceof C30202m) {
                        return new C30192c(((C30202m) interfaceC30204o).f60694a);
                    }
                    if (interfaceC30204o instanceof C30200k) {
                        return new C30190a(((C30200k) interfaceC30204o).f60691a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c30209t.f60710a = list2;
                c30209t.f60711b = interfaceC30204o;
                c30209t.f60714e = 3;
                if (m70139a(str2, c30209t) != coroutine_suspended) {
                    list3 = list2;
                    interfaceC30204o2 = interfaceC30204o;
                    return new C30191b(AbstractC30211v.m70140a(list3, ((C30201l) interfaceC30204o2).f60692a), ((C30201l) interfaceC30204o2).f60693b);
                }
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            return new C30190a(AbstractC28543c.m69413a(this.f60716b, e11));
        }
    }

    public C30210u(C29917M c29917m, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C30207r c30207r) {
        this.f60715a = c29917m;
        this.f60716b = interfaceC29953a;
        this.f60717c = interfaceC29984m;
        this.f60718d = c30207r;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009a A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002c, B:41:0x0094, B:43:0x009a, B:47:0x00bd, B:50:0x00c4, B:46:0x00bb, B:20:0x003f, B:26:0x0057, B:27:0x0063, B:29:0x0069, B:33:0x007e, B:35:0x0082, B:37:0x0088, B:40:0x0090, B:39:0x008c, B:23:0x0046), top: B:56:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002c, B:41:0x0094, B:43:0x009a, B:47:0x00bd, B:50:0x00c4, B:46:0x00bb, B:20:0x003f, B:26:0x0057, B:27:0x0063, B:29:0x0069, B:33:0x007e, B:35:0x0082, B:37:0x0088, B:40:0x0090, B:39:0x008c, B:23:0x0046), top: B:56:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002c, B:41:0x0094, B:43:0x009a, B:47:0x00bd, B:50:0x00c4, B:46:0x00bb, B:20:0x003f, B:26:0x0057, B:27:0x0063, B:29:0x0069, B:33:0x007e, B:35:0x0082, B:37:0x0088, B:40:0x0090, B:39:0x008c, B:23:0x0046), top: B:56:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[LOOP:0: B:41:0x0094->B:63:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70139a(String str, ContinuationImpl continuationImpl) {
        C30208s c30208s;
        Object next;
        List listEmptyList;
        Iterator it;
        C29027M result;
        Object objM70002c;
        if (continuationImpl instanceof C30208s) {
            c30208s = (C30208s) continuationImpl;
            int i11 = c30208s.f60709d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30208s.f60709d = i11 - Integer.MIN_VALUE;
            } else {
                c30208s = new C30208s(this, continuationImpl);
            }
        } else {
            c30208s = new C30208s(this, continuationImpl);
        }
        Object objM70043a = c30208s.f60707b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30208s.f60709d;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM70043a);
                InterfaceC29984m interfaceC29984m = this.f60717c;
                c30208s.f60706a = str;
                c30208s.f60709d = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) c30208s);
                if (objM70043a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                str = (String) c30208s.f60706a;
                ResultKt.throwOnFailure(objM70043a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c30208s.f60706a;
                ResultKt.throwOnFailure(objM70043a);
            }
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                C29917M c29917m = this.f60715a;
                c30208s.f60706a = it;
                c30208s.f60709d = 2;
                objM70002c = ((C29914J) c29917m.f60057a).f60052b.m70002c(iIntValue, c30208s);
                if (objM70002c == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70002c = Unit.INSTANCE;
                }
                if (objM70002c == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70002c = Unit.INSTANCE;
                }
                if (objM70002c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
            Iterator it2 = ((AbstractC29172p) objM70043a).mo69761l().f59118b.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((Document) next).getType().f59014a, str));
            Document document = (Document) next;
            if (document == null || (result = document.getResult()) == null || (listEmptyList = result.f58970d) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Number) it.next()).intValue();
                C29917M c29917m2 = this.f60715a;
                c30208s.f60706a = it;
                c30208s.f60709d = 2;
                objM70002c = ((C29914J) c29917m2.f60057a).f60052b.m70002c(iIntValue2, c30208s);
                if (objM70002c == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70002c = Unit.INSTANCE;
                }
                if (objM70002c == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70002c = Unit.INSTANCE;
                }
                if (objM70002c == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "can't clear images", e11);
        }
        return Unit.INSTANCE;
    }
}
