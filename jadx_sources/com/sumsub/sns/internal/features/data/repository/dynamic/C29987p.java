package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.internal.features.data.model.common.C28984B3;
import com.sumsub.sns.internal.features.data.model.common.C28994D3;
import com.sumsub.sns.internal.features.data.model.common.C29027M;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import com.sumsub.sns.internal.features.data.model.common.C29136j;
import com.sumsub.sns.internal.features.data.model.common.C29140j3;
import com.sumsub.sns.internal.features.data.model.common.C29142k;
import com.sumsub.sns.internal.features.data.model.common.C29148l;
import com.sumsub.sns.internal.features.data.model.common.C29160n;
import com.sumsub.sns.internal.features.data.model.common.C29164n3;
import com.sumsub.sns.internal.features.data.model.common.C29166o;
import com.sumsub.sns.internal.features.data.model.common.C29185r2;
import com.sumsub.sns.internal.features.data.model.common.C29698t3;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import com.sumsub.sns.internal.features.data.model.common.remote.C29428o0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.AbstractC29490L1;
import com.sumsub.sns.internal.features.data.model.common.remote.response.AbstractC29493M1;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29457A1;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29466D1;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29475G1;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29478H1;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29487K1;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29489L0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29534d;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29549g;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29559i;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29601s;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29609u;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29623x1;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29954b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29987p extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f60253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C29967J f60254b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29987p(C29967J c29967j, Continuation continuation) {
        super(3, continuation);
        this.f60254b = c29967j;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C29987p(this.f60254b, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0220  */
    /* JADX WARN: Code duplicated, block: B:101:0x0228  */
    /* JADX WARN: Code duplicated, block: B:104:0x022d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0231  */
    /* JADX WARN: Code duplicated, block: B:108:0x023e  */
    /* JADX WARN: Code duplicated, block: B:111:0x024b A[LOOP:3: B:107:0x023c->B:111:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x0251  */
    /* JADX WARN: Code duplicated, block: B:115:0x0254  */
    /* JADX WARN: Code duplicated, block: B:117:0x025b  */
    /* JADX WARN: Code duplicated, block: B:120:0x026d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0279  */
    /* JADX WARN: Code duplicated, block: B:124:0x0280  */
    /* JADX WARN: Code duplicated, block: B:127:0x029f  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:138:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x024f A[EDGE_INSN: B:149:0x024f->B:113:0x024f BREAK  A[LOOP:3: B:107:0x023c->B:111:0x024b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x018c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:89:0x01db  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0207  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r2 == r1) goto L23;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM70055a;
        Object objM70029a;
        Object objM70034e;
        AbstractC29490L1 abstractC29490L1;
        String str;
        String str2;
        C29160n c29160nM69877a;
        C29332c c29332c;
        C29489L0 c29489l0;
        C29136j c29136jM69875a;
        C29489L0 c29489l1;
        C29136j c29136jM69875a2;
        String str3;
        List<C29428o0> list;
        ArrayList arrayList;
        List list2;
        String str4;
        String str5;
        String str6;
        C29142k c29142k;
        String str7;
        C29160n c29160n;
        String str8;
        String str9;
        C29332c c29332c2;
        List list3;
        String str10;
        ArrayList arrayList2;
        String str11;
        C29148l c29148l;
        ArrayList arrayList3;
        C29148l c29148l2;
        C29475G1 c29475g1;
        C28994D3 c28994d3;
        C29466D1 c29466d1;
        C28984B3 c28984b3;
        C29140j3 c29140j3;
        ReviewStatusType reviewStatusType;
        C29487K1 c29487k1;
        C29164n3 c29164n3M69876a;
        C29166o c29166o;
        String str12;
        ReviewStatusType reviewStatusType2;
        ReviewStatusType[] reviewStatusTypeArrValues;
        int length;
        int i11;
        C29457A1 c29457a1;
        C29148l c29148l3;
        C29027M c29027m;
        C29487K1 c29487k2;
        C29164n3 c29164n3M69876a2;
        List list4;
        Map map;
        List list5;
        Map map2;
        ArrayList arrayList4;
        int iIntValue;
        C29487K1 c29487k3;
        Pair pairM90091to;
        C29489L0 c29489l2;
        C29489L0 c29489l3;
        List<C29428o0> list6;
        String str13;
        C29142k c29142k2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f60253a;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C29978g c29978g = this.f60254b.f60203k;
            this.f60253a = 1;
            objM70055a = c29978g.m70055a(this);
            if (objM70055a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                objM70034e = obj;
                abstractC29490L1 = (AbstractC29490L1) objM70034e;
                if (abstractC29490L1 instanceof C29609u) {
                    C29609u c29609u = (C29609u) abstractC29490L1;
                    C29601s c29601s = c29609u.f59667b;
                    str = c29601s.f59638a;
                    str2 = c29601s.f59640c;
                    c29160nM69877a = AbstractC29493M1.m69877a(c29601s.f59639b);
                    C29601s c29601s2 = c29609u.f59667b;
                    c29332c = c29601s2.f59646i;
                    c29489l2 = c29601s2.f59642e;
                    if (c29489l2 != null) {
                        c29136jM69875a = AbstractC29493M1.m69875a(c29489l2);
                    } else {
                        c29136jM69875a = null;
                    }
                    c29489l3 = c29609u.f59667b.f59643f;
                    if (c29489l3 != null) {
                        c29136jM69875a2 = AbstractC29493M1.m69875a(c29489l3);
                    } else {
                        c29136jM69875a2 = null;
                    }
                    C29601s c29601s3 = c29609u.f59667b;
                    str3 = c29601s3.f59641d;
                    list6 = c29601s3.f59645h;
                    if (list6 != null) {
                        arrayList = new ArrayList();
                        for (C29428o0 c29428o0 : list6) {
                            str13 = c29428o0.f59427a;
                            if (str13 != null) {
                                c29142k2 = new C29142k(str13, c29428o0.f59428b);
                            } else {
                                c29142k2 = null;
                            }
                            if (c29142k2 != null) {
                                arrayList.add(c29142k2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    C29601s c29601s4 = c29609u.f59667b;
                    list2 = c29601s4.f59644g;
                    str4 = c29601s4.f59647j;
                    str5 = c29601s4.f59648k;
                } else {
                    if (abstractC29490L1 instanceof C29559i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C29559i c29559i = (C29559i) abstractC29490L1;
                    C29549g c29549g = c29559i.f59582b;
                    str = c29549g.f59567a;
                    str2 = c29549g.f59568b;
                    c29160nM69877a = AbstractC29493M1.m69877a(c29559i.f59583c.f59553b);
                    C29534d c29534d = c29559i.f59583c;
                    c29332c = c29534d.f59559h;
                    c29489l0 = c29534d.f59555d;
                    if (c29489l0 != null) {
                        c29136jM69875a = AbstractC29493M1.m69875a(c29489l0);
                    } else {
                        c29136jM69875a = null;
                    }
                    c29489l1 = c29559i.f59583c.f59556e;
                    if (c29489l1 != null) {
                        c29136jM69875a2 = AbstractC29493M1.m69875a(c29489l1);
                    } else {
                        c29136jM69875a2 = null;
                    }
                    str3 = c29559i.f59582b.f59569c;
                    list = c29559i.f59583c.f59558g;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (C29428o0 c29428o1 : list) {
                            str6 = c29428o1.f59427a;
                            if (str6 != null) {
                                c29142k = new C29142k(str6, c29428o1.f59428b);
                            } else {
                                c29142k = null;
                            }
                            if (c29142k != null) {
                                arrayList.add(c29142k);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    C29534d c29534d2 = c29559i.f59583c;
                    list2 = c29534d2.f59557f;
                    str4 = c29534d2.f59560i;
                    str5 = c29534d2.f59561j;
                }
                str7 = str5;
                c29160n = c29160nM69877a;
                str8 = str;
                str9 = str2;
                c29332c2 = c29332c;
                list3 = list2;
                str10 = str3;
                arrayList2 = arrayList;
                str11 = str4;
                c29148l = new C29148l(c29136jM69875a, c29136jM69875a2);
                C29478H1 c29478h1Mo69873a = abstractC29490L1.mo69873a();
                C29185r2 c29185r2 = new C29185r2(c29478h1Mo69873a.f59483a.f59680h);
                Map map3 = c29478h1Mo69873a.f59484b;
                arrayList3 = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    C29070X c29070x = (C29070X) entry.getKey();
                    c29457a1 = (C29457A1) entry.getValue();
                    if (c29457a1 != null) {
                        c29487k2 = c29457a1.f59450a;
                        if (c29487k2 != null) {
                            c29164n3M69876a2 = AbstractC29493M1.m69876a(c29487k2);
                        } else {
                            c29164n3M69876a2 = null;
                        }
                        String str14 = c29457a1.f59451b;
                        String str15 = c29457a1.f59452c;
                        list4 = c29457a1.f59453d;
                        map = c29457a1.f59454e;
                        if (map != null) {
                            arrayList4 = new ArrayList();
                            for (Map.Entry entry2 : map.entrySet()) {
                                iIntValue = ((Number) entry2.getKey()).intValue();
                                c29487k3 = (C29487K1) entry2.getValue();
                                if (c29487k3 != null) {
                                    pairM90091to = TuplesKt.m90091to(Integer.valueOf(iIntValue), AbstractC29493M1.m69876a(c29487k3));
                                } else {
                                    pairM90091to = null;
                                }
                                if (pairM90091to != null) {
                                    arrayList4.add(pairM90091to);
                                }
                                c29148l = c29148l;
                                list4 = list4;
                            }
                            c29148l3 = c29148l;
                            list5 = list4;
                            map2 = MapsKt.toMap(arrayList4);
                        } else {
                            c29148l3 = c29148l;
                            list5 = list4;
                            map2 = null;
                        }
                        c29027m = new C29027M(c29164n3M69876a2, str14, str15, list5, map2);
                    } else {
                        c29148l3 = c29148l;
                        c29027m = null;
                    }
                    arrayList3.add(new Document(c29070x, c29027m));
                    c29148l = c29148l3;
                }
                c29148l2 = c29148l;
                List list7 = CollectionsKt.toList(arrayList3);
                c29475g1 = c29478h1Mo69873a.f59485c;
                if (c29475g1 != null) {
                    c28994d3 = new C28994D3(c29475g1.f59481d);
                } else {
                    c28994d3 = null;
                }
                c29466d1 = c29478h1Mo69873a.f59486d;
                if (c29466d1 != null) {
                    str12 = c29466d1.f59461a;
                    if (str12 != null) {
                        ReviewStatusType.Companion.getClass();
                        reviewStatusTypeArrValues = ReviewStatusType.values();
                        length = reviewStatusTypeArrValues.length;
                        i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                reviewStatusType2 = null;
                                break;
                            }
                            reviewStatusType2 = reviewStatusTypeArrValues[i11];
                            if (Intrinsics.areEqual(reviewStatusType2.getValue(), str12)) {
                                break;
                                break;
                            }
                            i11++;
                        }
                        if (reviewStatusType2 == null) {
                            reviewStatusType2 = ReviewStatusType.Unknown;
                        }
                    } else {
                        reviewStatusType2 = null;
                    }
                    c28984b3 = new C28984B3(reviewStatusType2);
                } else {
                    c28984b3 = null;
                }
                c29140j3 = new C29140j3(c29185r2, list7, c28994d3, c28984b3);
                C29623x1 c29623x1 = abstractC29490L1.mo69873a().f59483a;
                Integer num = c29623x1.f59673a;
                reviewStatusType = c29623x1.f59674b;
                if (reviewStatusType == null) {
                    reviewStatusType = ReviewStatusType.Unknown;
                }
                ReviewStatusType reviewStatusType3 = reviewStatusType;
                Integer num2 = c29623x1.f59675c;
                String str16 = c29623x1.f59676d;
                c29487k1 = c29623x1.f59677e;
                if (c29487k1 != null) {
                    c29164n3M69876a = AbstractC29493M1.m69876a(c29487k1);
                } else {
                    c29164n3M69876a = null;
                }
                c29166o = new C29166o(num, reviewStatusType3, num2, str16, c29164n3M69876a, c29623x1.f59682j, c29623x1.f59683k, c29623x1.f59680h);
                if (abstractC29490L1 instanceof C29609u) {
                    return new C29698t3(str8, str9, c29160n, c29140j3, c29332c2, c29166o, AbstractC29493M1.m69874a(c29136jM69875a, c29136jM69875a2), c29148l2, str10, arrayList2, list3, str11, str7);
                }
                if (abstractC29490L1 instanceof C29559i) {
                    throw new NoWhenBranchMatchedException();
                }
                C29136j c29136jM69874a = AbstractC29493M1.m69874a(c29136jM69875a, c29136jM69875a2);
                C29534d c29534d3 = ((C29559i) abstractC29490L1).f59583c;
                return new C29082a(str8, str9, c29160n, c29140j3, c29332c2, c29166o, c29136jM69874a, c29148l2, str10, arrayList2, list3, str11, str7, c29534d3.f59552a, c29534d3.f59554c);
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM70029a = obj;
            abstractC29490L1 = (AbstractC29490L1) objM70029a;
            if (abstractC29490L1 instanceof C29609u) {
                C29609u c29609u2 = (C29609u) abstractC29490L1;
                C29601s c29601s5 = c29609u2.f59667b;
                str = c29601s5.f59638a;
                str2 = c29601s5.f59640c;
                c29160nM69877a = AbstractC29493M1.m69877a(c29601s5.f59639b);
                C29601s c29601s6 = c29609u2.f59667b;
                c29332c = c29601s6.f59646i;
                c29489l2 = c29601s6.f59642e;
                if (c29489l2 != null) {
                    c29136jM69875a = AbstractC29493M1.m69875a(c29489l2);
                } else {
                    c29136jM69875a = null;
                }
                c29489l3 = c29609u2.f59667b.f59643f;
                if (c29489l3 != null) {
                    c29136jM69875a2 = AbstractC29493M1.m69875a(c29489l3);
                } else {
                    c29136jM69875a2 = null;
                }
                C29601s c29601s7 = c29609u2.f59667b;
                str3 = c29601s7.f59641d;
                list6 = c29601s7.f59645h;
                if (list6 != null) {
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        str13 = c29428o0.f59427a;
                        if (str13 != null) {
                            c29142k2 = new C29142k(str13, c29428o0.f59428b);
                        } else {
                            c29142k2 = null;
                        }
                        if (c29142k2 != null) {
                            arrayList.add(c29142k2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                C29601s c29601s8 = c29609u2.f59667b;
                list2 = c29601s8.f59644g;
                str4 = c29601s8.f59647j;
                str5 = c29601s8.f59648k;
            } else {
                if (abstractC29490L1 instanceof C29559i) {
                    throw new NoWhenBranchMatchedException();
                }
                C29559i c29559i2 = (C29559i) abstractC29490L1;
                C29549g c29549g2 = c29559i2.f59582b;
                str = c29549g2.f59567a;
                str2 = c29549g2.f59568b;
                c29160nM69877a = AbstractC29493M1.m69877a(c29559i2.f59583c.f59553b);
                C29534d c29534d4 = c29559i2.f59583c;
                c29332c = c29534d4.f59559h;
                c29489l0 = c29534d4.f59555d;
                if (c29489l0 != null) {
                    c29136jM69875a = AbstractC29493M1.m69875a(c29489l0);
                } else {
                    c29136jM69875a = null;
                }
                c29489l1 = c29559i2.f59583c.f59556e;
                if (c29489l1 != null) {
                    c29136jM69875a2 = AbstractC29493M1.m69875a(c29489l1);
                } else {
                    c29136jM69875a2 = null;
                }
                str3 = c29559i2.f59582b.f59569c;
                list = c29559i2.f59583c.f59558g;
                if (list != null) {
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        str6 = c29428o1.f59427a;
                        if (str6 != null) {
                            c29142k = new C29142k(str6, c29428o1.f59428b);
                        } else {
                            c29142k = null;
                        }
                        if (c29142k != null) {
                            arrayList.add(c29142k);
                        }
                    }
                } else {
                    arrayList = null;
                }
                C29534d c29534d5 = c29559i2.f59583c;
                list2 = c29534d5.f59557f;
                str4 = c29534d5.f59560i;
                str5 = c29534d5.f59561j;
            }
            str7 = str5;
            c29160n = c29160nM69877a;
            str8 = str;
            str9 = str2;
            c29332c2 = c29332c;
            list3 = list2;
            str10 = str3;
            arrayList2 = arrayList;
            str11 = str4;
            c29148l = new C29148l(c29136jM69875a, c29136jM69875a2);
            C29478H1 c29478h1Mo69873a2 = abstractC29490L1.mo69873a();
            C29185r2 c29185r3 = new C29185r2(c29478h1Mo69873a2.f59483a.f59680h);
            Map map4 = c29478h1Mo69873a2.f59484b;
            arrayList3 = new ArrayList(map4.size());
            while (r5.hasNext()) {
                C29070X c29070x2 = (C29070X) entry.getKey();
                c29457a1 = (C29457A1) entry.getValue();
                if (c29457a1 != null) {
                    c29487k2 = c29457a1.f59450a;
                    if (c29487k2 != null) {
                        c29164n3M69876a2 = AbstractC29493M1.m69876a(c29487k2);
                    } else {
                        c29164n3M69876a2 = null;
                    }
                    String str17 = c29457a1.f59451b;
                    String str18 = c29457a1.f59452c;
                    list4 = c29457a1.f59453d;
                    map = c29457a1.f59454e;
                    if (map != null) {
                        arrayList4 = new ArrayList();
                        while (r10.hasNext()) {
                            iIntValue = ((Number) entry2.getKey()).intValue();
                            c29487k3 = (C29487K1) entry2.getValue();
                            if (c29487k3 != null) {
                                pairM90091to = TuplesKt.m90091to(Integer.valueOf(iIntValue), AbstractC29493M1.m69876a(c29487k3));
                            } else {
                                pairM90091to = null;
                            }
                            if (pairM90091to != null) {
                                arrayList4.add(pairM90091to);
                            }
                            c29148l = c29148l;
                            list4 = list4;
                        }
                        c29148l3 = c29148l;
                        list5 = list4;
                        map2 = MapsKt.toMap(arrayList4);
                    } else {
                        c29148l3 = c29148l;
                        list5 = list4;
                        map2 = null;
                    }
                    c29027m = new C29027M(c29164n3M69876a2, str17, str18, list5, map2);
                } else {
                    c29148l3 = c29148l;
                    c29027m = null;
                }
                arrayList3.add(new Document(c29070x2, c29027m));
                c29148l = c29148l3;
            }
            c29148l2 = c29148l;
            List list8 = CollectionsKt.toList(arrayList3);
            c29475g1 = c29478h1Mo69873a2.f59485c;
            if (c29475g1 != null) {
                c28994d3 = new C28994D3(c29475g1.f59481d);
            } else {
                c28994d3 = null;
            }
            c29466d1 = c29478h1Mo69873a2.f59486d;
            if (c29466d1 != null) {
                str12 = c29466d1.f59461a;
                if (str12 != null) {
                    ReviewStatusType.Companion.getClass();
                    reviewStatusTypeArrValues = ReviewStatusType.values();
                    length = reviewStatusTypeArrValues.length;
                    i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            reviewStatusType2 = null;
                            break;
                        }
                        reviewStatusType2 = reviewStatusTypeArrValues[i11];
                        if (Intrinsics.areEqual(reviewStatusType2.getValue(), str12)) {
                            break;
                        }
                        i11++;
                    }
                    if (reviewStatusType2 == null) {
                        reviewStatusType2 = ReviewStatusType.Unknown;
                    }
                } else {
                    reviewStatusType2 = null;
                }
                c28984b3 = new C28984B3(reviewStatusType2);
            } else {
                c28984b3 = null;
            }
            c29140j3 = new C29140j3(c29185r3, list8, c28994d3, c28984b3);
            C29623x1 c29623x2 = abstractC29490L1.mo69873a().f59483a;
            Integer num3 = c29623x2.f59673a;
            reviewStatusType = c29623x2.f59674b;
            if (reviewStatusType == null) {
                reviewStatusType = ReviewStatusType.Unknown;
            }
            ReviewStatusType reviewStatusType4 = reviewStatusType;
            Integer num4 = c29623x2.f59675c;
            String str19 = c29623x2.f59676d;
            c29487k1 = c29623x2.f59677e;
            if (c29487k1 != null) {
                c29164n3M69876a = AbstractC29493M1.m69876a(c29487k1);
            } else {
                c29164n3M69876a = null;
            }
            c29166o = new C29166o(num3, reviewStatusType4, num4, str19, c29164n3M69876a, c29623x2.f59682j, c29623x2.f59683k, c29623x2.f59680h);
            if (abstractC29490L1 instanceof C29609u) {
                return new C29698t3(str8, str9, c29160n, c29140j3, c29332c2, c29166o, AbstractC29493M1.m69874a(c29136jM69875a, c29136jM69875a2), c29148l2, str10, arrayList2, list3, str11, str7);
            }
            if (abstractC29490L1 instanceof C29559i) {
                throw new NoWhenBranchMatchedException();
            }
            C29136j c29136jM69874a2 = AbstractC29493M1.m69874a(c29136jM69875a, c29136jM69875a2);
            C29534d c29534d6 = ((C29559i) abstractC29490L1).f59583c;
            return new C29082a(str8, str9, c29160n, c29140j3, c29332c2, c29166o, c29136jM69874a2, c29148l2, str10, arrayList2, list3, str11, str7, c29534d6.f59552a, c29534d6.f59554c);
        }
        ResultKt.throwOnFailure(obj);
        objM70055a = obj;
        if (((C29979h) objM70055a).f60237a.f59091x == null) {
            InterfaceC29954b interfaceC29954b = this.f60254b.f60193a;
            this.f60253a = 2;
            objM70034e = interfaceC29954b.m70034e(this);
        } else {
            InterfaceC29954b interfaceC29954b2 = this.f60254b.f60193a;
            this.f60253a = 3;
            objM70029a = interfaceC29954b2.m70029a(this);
        }
        return coroutine_suspended;
    }
}
