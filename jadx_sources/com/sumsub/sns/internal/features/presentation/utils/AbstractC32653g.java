package com.sumsub.sns.internal.features.presentation.utils;

import com.sumsub.sns.internal.core.common.C28424V0;
import com.sumsub.sns.internal.core.common.C28432Z0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28990D;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C29013I1;
import com.sumsub.sns.internal.features.data.model.common.C29021K1;
import com.sumsub.sns.internal.features.data.model.common.C29052S1;
import com.sumsub.sns.internal.features.data.model.common.C29059U0;
import com.sumsub.sns.internal.features.data.model.common.C29060U1;
import com.sumsub.sns.internal.features.data.model.common.C29067W0;
import com.sumsub.sns.internal.features.data.model.common.C29068W1;
import com.sumsub.sns.internal.features.data.model.common.C29076Y1;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.domain.appdata.C30094a;
import com.sumsub.sns.internal.features.domain.appdata.C30095b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32653g {
    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0193  */
    /* JADX WARN: Code duplicated, block: B:106:0x0196  */
    /* JADX WARN: Code duplicated, block: B:107:0x0198  */
    /* JADX WARN: Code duplicated, block: B:109:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x019d  */
    /* JADX WARN: Code duplicated, block: B:112:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01db  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:145:0x0215  */
    /* JADX WARN: Code duplicated, block: B:149:0x021b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0228  */
    /* JADX WARN: Code duplicated, block: B:154:0x022a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0233  */
    /* JADX WARN: Code duplicated, block: B:160:0x0236  */
    /* JADX WARN: Code duplicated, block: B:163:0x023b  */
    /* JADX WARN: Code duplicated, block: B:164:0x023e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0240  */
    /* JADX WARN: Code duplicated, block: B:168:0x024b  */
    /* JADX WARN: Code duplicated, block: B:170:0x024e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0251  */
    /* JADX WARN: Code duplicated, block: B:174:0x0260  */
    /* JADX WARN: Code duplicated, block: B:177:0x0268  */
    /* JADX WARN: Code duplicated, block: B:190:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0114 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x01cf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x014c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0152  */
    /* JADX WARN: Code duplicated, block: B:80:0x0156  */
    /* JADX WARN: Code duplicated, block: B:81:0x0158  */
    /* JADX WARN: Code duplicated, block: B:85:0x0160  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Code duplicated, block: B:96:0x017c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final List m71276a(List list, C29983l c29983l, C28432Z0 c28432z0, C30095b c30095b, boolean z11, Boolean bool, Map map, Set set) {
        AbstractC29103d2 abstractC29103d2;
        int i11;
        boolean zContains;
        C30094a c30094a;
        boolean z12;
        boolean z13;
        C30094a c30094a2;
        boolean z14;
        boolean z15;
        boolean z16;
        String strM71280a;
        C29719y c29719y;
        Iterator it;
        Object next;
        C29719y c29719y2;
        String str;
        boolean z17;
        String str2;
        boolean z18;
        boolean zEquals;
        boolean zIsEmpty;
        C29124h c29124h;
        Map map2;
        Map map3;
        AbstractC28990D abstractC28990D;
        C29719y c29719y3;
        Iterator it2;
        Object obj;
        C29719y c29719y4;
        String str3;
        boolean z19;
        String str4;
        boolean z21;
        boolean z22;
        boolean zEquals2;
        boolean zIsEmpty2;
        C29124h c29124h2;
        Map map4;
        Map map5;
        AbstractC28990D abstractC28990D2;
        C29719y c29719y5;
        AbstractC29103d2 abstractC29103d3;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            AbstractC28990D abstractC28990D3 = (AbstractC28990D) it3.next();
            boolean z23 = abstractC28990D3 instanceof C29719y;
            if (z23) {
                C29719y c29719y6 = (C29719y) abstractC28990D3;
                if (Intrinsics.areEqual(c29719y6.f59781b, C29052S1.f58989b) && (str7 = (String) map.get("msdk_local_tin_validation_country")) != null) {
                    String str8 = (String) map.get("tin");
                    if (str8 == null) {
                        str8 = "";
                    }
                    if ((c29719y6.f59782c || str8.length() > 0) && Intrinsics.areEqual(c28432z0.m69315a(str8, str7), C28424V0.f57935a)) {
                        c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsMalformed"));
                    } else {
                        if (z23) {
                            abstractC29103d2 = ((C29719y) abstractC28990D3).f59781b;
                            if (abstractC29103d2 instanceof C29060U1) {
                                i11 = ((C29060U1) abstractC29103d2).f59008b;
                            } else if (abstractC29103d2 instanceof C29076Y1) {
                                i11 = ((C29076Y1) abstractC29103d2).f59018b;
                            } else {
                                zContains = false;
                            }
                            zContains = set.contains(Integer.valueOf(i11));
                        } else {
                            zContains = false;
                        }
                        if (zContains) {
                            c30094a = null;
                        } else {
                            if (z23) {
                                c29719y5 = (C29719y) abstractC28990D3;
                                abstractC29103d3 = c29719y5.f59781b;
                                c30094a = null;
                                if (!(abstractC29103d3 instanceof C29076Y1) && (str5 = (String) map.get(new C29060U1(((C29076Y1) abstractC29103d3).f59018b).f59051a)) != null) {
                                    str6 = (String) map.get(((C29076Y1) c29719y5.f59781b).f59051a);
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    z12 = (!c29719y5.f59782c || str6.length() > 0) && Intrinsics.areEqual(c28432z0.m69315a(str6, str5), C28424V0.f57935a);
                                }
                                if (z12) {
                                    c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsMalformed"));
                                } else {
                                    if (z23) {
                                        c29719y3 = (C29719y) abstractC28990D3;
                                        if (Intrinsics.areEqual(c29719y3.f59781b, C29013I1.f58955b)) {
                                            C29059U0 c29059u0 = C29059U0.f59007b;
                                            it2 = list.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    obj = c30094a;
                                                    break;
                                                }
                                                Object next2 = it2.next();
                                                abstractC28990D2 = (AbstractC28990D) next2;
                                                if (!(abstractC28990D2 instanceof C29719y) && Intrinsics.areEqual(((C29719y) abstractC28990D2).f59781b, c29059u0)) {
                                                    obj = next2;
                                                    break;
                                                }
                                            }
                                            if (obj instanceof C29719y) {
                                                c29719y4 = (C29719y) obj;
                                            } else {
                                                c29719y4 = c30094a;
                                            }
                                            str3 = (String) map.get("country");
                                            if (c29719y3.f59782c) {
                                                if (str3 != null) {
                                                    z22 = true;
                                                    zEquals2 = StringsKt.equals(str3, "USA", true);
                                                } else {
                                                    z22 = true;
                                                    zEquals2 = false;
                                                }
                                                if (zEquals2) {
                                                    if (c29719y4 != 0 && c29719y4.f59782c == z22 && z11) {
                                                        if (c30095b != null || (c29124h2 = c30095b.f60491b) == null || (map4 = c29124h2.f59077j) == null || (map5 = (Map) map4.get(str3)) == null) {
                                                            zIsEmpty2 = false;
                                                        } else {
                                                            zIsEmpty2 = map5.isEmpty() ^ z22;
                                                        }
                                                        z19 = zIsEmpty2;
                                                    }
                                                }
                                            }
                                            str4 = (String) map.get("state");
                                            if (z19) {
                                                if (str4 != null || str4.length() == 0) {
                                                    z21 = true;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (z21) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                            } else {
                                                z13 = false;
                                            }
                                        } else {
                                            z13 = false;
                                        }
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                                    } else {
                                        if (z23) {
                                            c29719y = (C29719y) abstractC28990D3;
                                            if (Intrinsics.areEqual(c29719y.f59781b, C29021K1.f58964b)) {
                                                C29067W0 c29067w0 = C29067W0.f59009b;
                                                it = list.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = c30094a;
                                                        break;
                                                    }
                                                    next = it.next();
                                                    abstractC28990D = (AbstractC28990D) next;
                                                    if (!(abstractC28990D instanceof C29719y) && Intrinsics.areEqual(((C29719y) abstractC28990D).f59781b, c29067w0)) {
                                                        break;
                                                    }
                                                }
                                                if (next instanceof C29719y) {
                                                    c29719y2 = (C29719y) next;
                                                } else {
                                                    c29719y2 = c30094a;
                                                }
                                                str = (String) map.get("countryOfBirth");
                                                if (c29719y.f59782c) {
                                                    z14 = true;
                                                } else {
                                                    if (str != null) {
                                                        z14 = true;
                                                        zEquals = StringsKt.equals(str, "USA", true);
                                                    } else {
                                                        z14 = true;
                                                        zEquals = false;
                                                    }
                                                    if (zEquals) {
                                                        if (c29719y2 != 0 && c29719y2.f59782c == z14 && z11) {
                                                            if (c30095b != null || (c29124h = c30095b.f60491b) == null || (map2 = c29124h.f59077j) == null || (map3 = (Map) map2.get(str)) == null) {
                                                                zIsEmpty = false;
                                                            } else {
                                                                zIsEmpty = map3.isEmpty() ^ z14;
                                                            }
                                                            if (zIsEmpty) {
                                                            }
                                                        }
                                                        z17 = false;
                                                    }
                                                    str2 = (String) map.get("stateOfBirth");
                                                    if (!z17) {
                                                        if (str2 != null || str2.length() == 0) {
                                                            z18 = z14;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        z15 = z18 ? z14 : false;
                                                    }
                                                }
                                                z17 = z14;
                                                str2 = (String) map.get("stateOfBirth");
                                                if (!z17) {
                                                    if (str2 != null) {
                                                        z18 = z14;
                                                    } else {
                                                        z18 = z14;
                                                    }
                                                    if (z18) {
                                                    }
                                                }
                                            } else {
                                                z14 = true;
                                            }
                                        } else {
                                            z14 = true;
                                        }
                                        if (z15) {
                                            c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                                        } else {
                                            if (z23 || !(((C29719y) abstractC28990D3).f59781b instanceof C29068W1)) {
                                                z16 = false;
                                            } else {
                                                z16 = z14;
                                            }
                                            if (!z16) {
                                                String str9 = (String) map.get(abstractC28990D3.mo69727c());
                                                strM71280a = AbstractC32657i.m71280a(abstractC28990D3, str9 != null ? str9 : "", c29983l, bool);
                                                if (strM71280a != null) {
                                                    c30094a2 = new C30094a(abstractC28990D3, strM71280a);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c30094a = null;
                            }
                            if (z12) {
                                c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsMalformed"));
                            } else {
                                if (z23) {
                                    c29719y3 = (C29719y) abstractC28990D3;
                                    if (Intrinsics.areEqual(c29719y3.f59781b, C29013I1.f58955b)) {
                                        z13 = false;
                                    } else {
                                        C29059U0 c29059u1 = C29059U0.f59007b;
                                        it2 = list.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj = c30094a;
                                                break;
                                            }
                                            Object next3 = it2.next();
                                            abstractC28990D2 = (AbstractC28990D) next3;
                                            if (!(abstractC28990D2 instanceof C29719y)) {
                                            }
                                        }
                                        if (obj instanceof C29719y) {
                                            c29719y4 = (C29719y) obj;
                                        } else {
                                            c29719y4 = c30094a;
                                        }
                                        str3 = (String) map.get("country");
                                        if (c29719y3.f59782c) {
                                            if (str3 != null) {
                                                z22 = true;
                                                zEquals2 = StringsKt.equals(str3, "USA", true);
                                            } else {
                                                z22 = true;
                                                zEquals2 = false;
                                            }
                                            if (zEquals2) {
                                                if (c29719y4 != 0) {
                                                    if (c30095b != null) {
                                                        zIsEmpty2 = false;
                                                    } else {
                                                        zIsEmpty2 = false;
                                                    }
                                                    if (zIsEmpty2) {
                                                    }
                                                }
                                            }
                                        }
                                        str4 = (String) map.get("state");
                                        if (z19) {
                                            z13 = false;
                                        } else {
                                            if (str4 != null) {
                                                z21 = true;
                                            } else {
                                                z21 = true;
                                            }
                                            if (z21) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                    }
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                                } else {
                                    if (z23) {
                                        c29719y = (C29719y) abstractC28990D3;
                                        if (Intrinsics.areEqual(c29719y.f59781b, C29021K1.f58964b)) {
                                            z14 = true;
                                        } else {
                                            C29067W0 c29067w1 = C29067W0.f59009b;
                                            it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = c30094a;
                                                    break;
                                                }
                                                next = it.next();
                                                abstractC28990D = (AbstractC28990D) next;
                                                if (!(abstractC28990D instanceof C29719y)) {
                                                }
                                            }
                                            if (next instanceof C29719y) {
                                                c29719y2 = (C29719y) next;
                                            } else {
                                                c29719y2 = c30094a;
                                            }
                                            str = (String) map.get("countryOfBirth");
                                            if (c29719y.f59782c) {
                                                if (str != null) {
                                                    z14 = true;
                                                    zEquals = StringsKt.equals(str, "USA", true);
                                                } else {
                                                    z14 = true;
                                                    zEquals = false;
                                                }
                                                if (zEquals) {
                                                    if (c29719y2 != 0) {
                                                        if (c30095b != null) {
                                                            zIsEmpty = false;
                                                        } else {
                                                            zIsEmpty = false;
                                                        }
                                                        if (zIsEmpty) {
                                                        }
                                                    }
                                                    z17 = false;
                                                }
                                                str2 = (String) map.get("stateOfBirth");
                                                if (!z17) {
                                                    if (str2 != null) {
                                                        z18 = z14;
                                                    } else {
                                                        z18 = z14;
                                                    }
                                                    if (z18) {
                                                    }
                                                }
                                            } else {
                                                z14 = true;
                                            }
                                            z17 = z14;
                                            str2 = (String) map.get("stateOfBirth");
                                            if (!z17) {
                                                if (str2 != null) {
                                                    z18 = z14;
                                                } else {
                                                    z18 = z14;
                                                }
                                                if (z18) {
                                                }
                                            }
                                        }
                                    } else {
                                        z14 = true;
                                    }
                                    if (z15) {
                                        c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                                    } else {
                                        if (z23) {
                                            z16 = false;
                                        } else {
                                            z16 = false;
                                        }
                                        if (!z16) {
                                            String str10 = (String) map.get(abstractC28990D3.mo69727c());
                                            strM71280a = AbstractC32657i.m71280a(abstractC28990D3, str10 != null ? str10 : "", c29983l, bool);
                                            if (strM71280a != null) {
                                                c30094a2 = new C30094a(abstractC28990D3, strM71280a);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        c30094a2 = c30094a;
                    }
                } else {
                    if (z23) {
                        zContains = false;
                    } else {
                        abstractC29103d2 = ((C29719y) abstractC28990D3).f59781b;
                        if (abstractC29103d2 instanceof C29060U1) {
                            i11 = ((C29060U1) abstractC29103d2).f59008b;
                        } else if (abstractC29103d2 instanceof C29076Y1) {
                            i11 = ((C29076Y1) abstractC29103d2).f59018b;
                        } else {
                            zContains = false;
                        }
                        zContains = set.contains(Integer.valueOf(i11));
                    }
                    if (zContains) {
                        c30094a = null;
                    } else {
                        if (z23) {
                            c29719y5 = (C29719y) abstractC28990D3;
                            abstractC29103d3 = c29719y5.f59781b;
                            c30094a = null;
                            if (!(abstractC29103d3 instanceof C29076Y1)) {
                                str6 = (String) map.get(((C29076Y1) c29719y5.f59781b).f59051a);
                                if (str6 == null) {
                                    str6 = "";
                                }
                                if (c29719y5.f59782c) {
                                }
                            }
                            if (z12) {
                                c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsMalformed"));
                            } else {
                                if (z23) {
                                    c29719y3 = (C29719y) abstractC28990D3;
                                    if (Intrinsics.areEqual(c29719y3.f59781b, C29013I1.f58955b)) {
                                        z13 = false;
                                    } else {
                                        C29059U0 c29059u2 = C29059U0.f59007b;
                                        it2 = list.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj = c30094a;
                                                break;
                                            }
                                            Object next4 = it2.next();
                                            abstractC28990D2 = (AbstractC28990D) next4;
                                            if (!(abstractC28990D2 instanceof C29719y)) {
                                            }
                                        }
                                        if (obj instanceof C29719y) {
                                            c29719y4 = (C29719y) obj;
                                        } else {
                                            c29719y4 = c30094a;
                                        }
                                        str3 = (String) map.get("country");
                                        if (c29719y3.f59782c) {
                                            if (str3 != null) {
                                                z22 = true;
                                                zEquals2 = StringsKt.equals(str3, "USA", true);
                                            } else {
                                                z22 = true;
                                                zEquals2 = false;
                                            }
                                            if (zEquals2) {
                                                if (c29719y4 != 0) {
                                                    if (c30095b != null) {
                                                        zIsEmpty2 = false;
                                                    } else {
                                                        zIsEmpty2 = false;
                                                    }
                                                    if (zIsEmpty2) {
                                                    }
                                                }
                                            }
                                        }
                                        str4 = (String) map.get("state");
                                        if (z19) {
                                            z13 = false;
                                        } else {
                                            if (str4 != null) {
                                                z21 = true;
                                            } else {
                                                z21 = true;
                                            }
                                            if (z21) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                    }
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                                } else {
                                    if (z23) {
                                        c29719y = (C29719y) abstractC28990D3;
                                        if (Intrinsics.areEqual(c29719y.f59781b, C29021K1.f58964b)) {
                                            z14 = true;
                                        } else {
                                            C29067W0 c29067w2 = C29067W0.f59009b;
                                            it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = c30094a;
                                                    break;
                                                }
                                                next = it.next();
                                                abstractC28990D = (AbstractC28990D) next;
                                                if (!(abstractC28990D instanceof C29719y)) {
                                                }
                                            }
                                            if (next instanceof C29719y) {
                                                c29719y2 = (C29719y) next;
                                            } else {
                                                c29719y2 = c30094a;
                                            }
                                            str = (String) map.get("countryOfBirth");
                                            if (c29719y.f59782c) {
                                                if (str != null) {
                                                    z14 = true;
                                                    zEquals = StringsKt.equals(str, "USA", true);
                                                } else {
                                                    z14 = true;
                                                    zEquals = false;
                                                }
                                                if (zEquals) {
                                                    if (c29719y2 != 0) {
                                                        if (c30095b != null) {
                                                            zIsEmpty = false;
                                                        } else {
                                                            zIsEmpty = false;
                                                        }
                                                        if (zIsEmpty) {
                                                        }
                                                    }
                                                    z17 = false;
                                                }
                                                str2 = (String) map.get("stateOfBirth");
                                                if (!z17) {
                                                    if (str2 != null) {
                                                        z18 = z14;
                                                    } else {
                                                        z18 = z14;
                                                    }
                                                    if (z18) {
                                                    }
                                                }
                                            } else {
                                                z14 = true;
                                            }
                                            z17 = z14;
                                            str2 = (String) map.get("stateOfBirth");
                                            if (!z17) {
                                                if (str2 != null) {
                                                    z18 = z14;
                                                } else {
                                                    z18 = z14;
                                                }
                                                if (z18) {
                                                }
                                            }
                                        }
                                    } else {
                                        z14 = true;
                                    }
                                    if (z15) {
                                        c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                                    } else {
                                        if (z23) {
                                            z16 = false;
                                        } else {
                                            z16 = false;
                                        }
                                        if (!z16) {
                                            String str11 = (String) map.get(abstractC28990D3.mo69727c());
                                            strM71280a = AbstractC32657i.m71280a(abstractC28990D3, str11 != null ? str11 : "", c29983l, bool);
                                            if (strM71280a != null) {
                                                c30094a2 = new C30094a(abstractC28990D3, strM71280a);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c30094a = null;
                        }
                        if (z12) {
                            c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsMalformed"));
                        } else {
                            if (z23) {
                                c29719y3 = (C29719y) abstractC28990D3;
                                if (Intrinsics.areEqual(c29719y3.f59781b, C29013I1.f58955b)) {
                                    z13 = false;
                                } else {
                                    C29059U0 c29059u3 = C29059U0.f59007b;
                                    it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj = c30094a;
                                            break;
                                        }
                                        Object next5 = it2.next();
                                        abstractC28990D2 = (AbstractC28990D) next5;
                                        if (!(abstractC28990D2 instanceof C29719y)) {
                                        }
                                    }
                                    if (obj instanceof C29719y) {
                                        c29719y4 = (C29719y) obj;
                                    } else {
                                        c29719y4 = c30094a;
                                    }
                                    str3 = (String) map.get("country");
                                    if (c29719y3.f59782c) {
                                        if (str3 != null) {
                                            z22 = true;
                                            zEquals2 = StringsKt.equals(str3, "USA", true);
                                        } else {
                                            z22 = true;
                                            zEquals2 = false;
                                        }
                                        if (zEquals2) {
                                            if (c29719y4 != 0) {
                                                if (c30095b != null) {
                                                    zIsEmpty2 = false;
                                                } else {
                                                    zIsEmpty2 = false;
                                                }
                                                if (zIsEmpty2) {
                                                }
                                            }
                                        }
                                    }
                                    str4 = (String) map.get("state");
                                    if (z19) {
                                        z13 = false;
                                    } else {
                                        if (str4 != null) {
                                            z21 = true;
                                        } else {
                                            z21 = true;
                                        }
                                        if (z21) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                            } else {
                                if (z23) {
                                    c29719y = (C29719y) abstractC28990D3;
                                    if (Intrinsics.areEqual(c29719y.f59781b, C29021K1.f58964b)) {
                                        z14 = true;
                                    } else {
                                        C29067W0 c29067w3 = C29067W0.f59009b;
                                        it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = c30094a;
                                                break;
                                            }
                                            next = it.next();
                                            abstractC28990D = (AbstractC28990D) next;
                                            if (!(abstractC28990D instanceof C29719y)) {
                                            }
                                        }
                                        if (next instanceof C29719y) {
                                            c29719y2 = (C29719y) next;
                                        } else {
                                            c29719y2 = c30094a;
                                        }
                                        str = (String) map.get("countryOfBirth");
                                        if (c29719y.f59782c) {
                                            if (str != null) {
                                                z14 = true;
                                                zEquals = StringsKt.equals(str, "USA", true);
                                            } else {
                                                z14 = true;
                                                zEquals = false;
                                            }
                                            if (zEquals) {
                                                if (c29719y2 != 0) {
                                                    if (c30095b != null) {
                                                        zIsEmpty = false;
                                                    } else {
                                                        zIsEmpty = false;
                                                    }
                                                    if (zIsEmpty) {
                                                    }
                                                }
                                                z17 = false;
                                            }
                                            str2 = (String) map.get("stateOfBirth");
                                            if (!z17) {
                                                if (str2 != null) {
                                                    z18 = z14;
                                                } else {
                                                    z18 = z14;
                                                }
                                                if (z18) {
                                                }
                                            }
                                        } else {
                                            z14 = true;
                                        }
                                        z17 = z14;
                                        str2 = (String) map.get("stateOfBirth");
                                        if (!z17) {
                                            if (str2 != null) {
                                                z18 = z14;
                                            } else {
                                                z18 = z14;
                                            }
                                            if (z18) {
                                            }
                                        }
                                    }
                                } else {
                                    z14 = true;
                                }
                                if (z15) {
                                    c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                                } else {
                                    if (z23) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (!z16) {
                                        String str12 = (String) map.get(abstractC28990D3.mo69727c());
                                        strM71280a = AbstractC32657i.m71280a(abstractC28990D3, str12 != null ? str12 : "", c29983l, bool);
                                        if (strM71280a != null) {
                                            c30094a2 = new C30094a(abstractC28990D3, strM71280a);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c30094a2 = c30094a;
                }
            } else {
                if (z23) {
                    zContains = false;
                } else {
                    abstractC29103d2 = ((C29719y) abstractC28990D3).f59781b;
                    if (abstractC29103d2 instanceof C29060U1) {
                        i11 = ((C29060U1) abstractC29103d2).f59008b;
                    } else if (abstractC29103d2 instanceof C29076Y1) {
                        i11 = ((C29076Y1) abstractC29103d2).f59018b;
                    } else {
                        zContains = false;
                    }
                    zContains = set.contains(Integer.valueOf(i11));
                }
                if (zContains) {
                    c30094a = null;
                } else {
                    if (z23) {
                        c29719y5 = (C29719y) abstractC28990D3;
                        abstractC29103d3 = c29719y5.f59781b;
                        c30094a = null;
                        if (!(abstractC29103d3 instanceof C29076Y1)) {
                            str6 = (String) map.get(((C29076Y1) c29719y5.f59781b).f59051a);
                            if (str6 == null) {
                                str6 = "";
                            }
                            if (c29719y5.f59782c) {
                            }
                        }
                        if (z12) {
                            c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsMalformed"));
                        } else {
                            if (z23) {
                                c29719y3 = (C29719y) abstractC28990D3;
                                if (Intrinsics.areEqual(c29719y3.f59781b, C29013I1.f58955b)) {
                                    z13 = false;
                                } else {
                                    C29059U0 c29059u4 = C29059U0.f59007b;
                                    it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj = c30094a;
                                            break;
                                        }
                                        Object next6 = it2.next();
                                        abstractC28990D2 = (AbstractC28990D) next6;
                                        if (!(abstractC28990D2 instanceof C29719y)) {
                                        }
                                    }
                                    if (obj instanceof C29719y) {
                                        c29719y4 = (C29719y) obj;
                                    } else {
                                        c29719y4 = c30094a;
                                    }
                                    str3 = (String) map.get("country");
                                    if (c29719y3.f59782c) {
                                        if (str3 != null) {
                                            z22 = true;
                                            zEquals2 = StringsKt.equals(str3, "USA", true);
                                        } else {
                                            z22 = true;
                                            zEquals2 = false;
                                        }
                                        if (zEquals2) {
                                            if (c29719y4 != 0) {
                                                if (c30095b != null) {
                                                    zIsEmpty2 = false;
                                                } else {
                                                    zIsEmpty2 = false;
                                                }
                                                if (zIsEmpty2) {
                                                }
                                            }
                                        }
                                    }
                                    str4 = (String) map.get("state");
                                    if (z19) {
                                        z13 = false;
                                    } else {
                                        if (str4 != null) {
                                            z21 = true;
                                        } else {
                                            z21 = true;
                                        }
                                        if (z21) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                    }
                                }
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                            } else {
                                if (z23) {
                                    c29719y = (C29719y) abstractC28990D3;
                                    if (Intrinsics.areEqual(c29719y.f59781b, C29021K1.f58964b)) {
                                        z14 = true;
                                    } else {
                                        C29067W0 c29067w4 = C29067W0.f59009b;
                                        it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = c30094a;
                                                break;
                                            }
                                            next = it.next();
                                            abstractC28990D = (AbstractC28990D) next;
                                            if (!(abstractC28990D instanceof C29719y)) {
                                            }
                                        }
                                        if (next instanceof C29719y) {
                                            c29719y2 = (C29719y) next;
                                        } else {
                                            c29719y2 = c30094a;
                                        }
                                        str = (String) map.get("countryOfBirth");
                                        if (c29719y.f59782c) {
                                            if (str != null) {
                                                z14 = true;
                                                zEquals = StringsKt.equals(str, "USA", true);
                                            } else {
                                                z14 = true;
                                                zEquals = false;
                                            }
                                            if (zEquals) {
                                                if (c29719y2 != 0) {
                                                    if (c30095b != null) {
                                                        zIsEmpty = false;
                                                    } else {
                                                        zIsEmpty = false;
                                                    }
                                                    if (zIsEmpty) {
                                                    }
                                                }
                                                z17 = false;
                                            }
                                            str2 = (String) map.get("stateOfBirth");
                                            if (!z17) {
                                                if (str2 != null) {
                                                    z18 = z14;
                                                } else {
                                                    z18 = z14;
                                                }
                                                if (z18) {
                                                }
                                            }
                                        } else {
                                            z14 = true;
                                        }
                                        z17 = z14;
                                        str2 = (String) map.get("stateOfBirth");
                                        if (!z17) {
                                            if (str2 != null) {
                                                z18 = z14;
                                            } else {
                                                z18 = z14;
                                            }
                                            if (z18) {
                                            }
                                        }
                                    }
                                } else {
                                    z14 = true;
                                }
                                if (z15) {
                                    c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                                } else {
                                    if (z23) {
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                    }
                                    if (!z16) {
                                        String str13 = (String) map.get(abstractC28990D3.mo69727c());
                                        strM71280a = AbstractC32657i.m71280a(abstractC28990D3, str13 != null ? str13 : "", c29983l, bool);
                                        if (strM71280a != null) {
                                            c30094a2 = new C30094a(abstractC28990D3, strM71280a);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c30094a = null;
                    }
                    if (z12) {
                        c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsMalformed"));
                    } else {
                        if (z23) {
                            c29719y3 = (C29719y) abstractC28990D3;
                            if (Intrinsics.areEqual(c29719y3.f59781b, C29013I1.f58955b)) {
                                z13 = false;
                            } else {
                                C29059U0 c29059u5 = C29059U0.f59007b;
                                it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = c30094a;
                                        break;
                                    }
                                    Object next7 = it2.next();
                                    abstractC28990D2 = (AbstractC28990D) next7;
                                    if (!(abstractC28990D2 instanceof C29719y)) {
                                    }
                                }
                                if (obj instanceof C29719y) {
                                    c29719y4 = (C29719y) obj;
                                } else {
                                    c29719y4 = c30094a;
                                }
                                str3 = (String) map.get("country");
                                if (c29719y3.f59782c) {
                                    if (str3 != null) {
                                        z22 = true;
                                        zEquals2 = StringsKt.equals(str3, "USA", true);
                                    } else {
                                        z22 = true;
                                        zEquals2 = false;
                                    }
                                    if (zEquals2) {
                                        if (c29719y4 != 0) {
                                            if (c30095b != null) {
                                                zIsEmpty2 = false;
                                            } else {
                                                zIsEmpty2 = false;
                                            }
                                            if (zIsEmpty2) {
                                            }
                                        }
                                    }
                                }
                                str4 = (String) map.get("state");
                                if (z19) {
                                    z13 = false;
                                } else {
                                    if (str4 != null) {
                                        z21 = true;
                                    } else {
                                        z21 = true;
                                    }
                                    if (z21) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                }
                            }
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                        } else {
                            if (z23) {
                                c29719y = (C29719y) abstractC28990D3;
                                if (Intrinsics.areEqual(c29719y.f59781b, C29021K1.f58964b)) {
                                    z14 = true;
                                } else {
                                    C29067W0 c29067w5 = C29067W0.f59009b;
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = c30094a;
                                            break;
                                        }
                                        next = it.next();
                                        abstractC28990D = (AbstractC28990D) next;
                                        if (!(abstractC28990D instanceof C29719y)) {
                                        }
                                    }
                                    if (next instanceof C29719y) {
                                        c29719y2 = (C29719y) next;
                                    } else {
                                        c29719y2 = c30094a;
                                    }
                                    str = (String) map.get("countryOfBirth");
                                    if (c29719y.f59782c) {
                                        if (str != null) {
                                            z14 = true;
                                            zEquals = StringsKt.equals(str, "USA", true);
                                        } else {
                                            z14 = true;
                                            zEquals = false;
                                        }
                                        if (zEquals) {
                                            if (c29719y2 != 0) {
                                                if (c30095b != null) {
                                                    zIsEmpty = false;
                                                } else {
                                                    zIsEmpty = false;
                                                }
                                                if (zIsEmpty) {
                                                }
                                            }
                                            z17 = false;
                                        }
                                        str2 = (String) map.get("stateOfBirth");
                                        if (!z17) {
                                            if (str2 != null) {
                                                z18 = z14;
                                            } else {
                                                z18 = z14;
                                            }
                                            if (z18) {
                                            }
                                        }
                                    } else {
                                        z14 = true;
                                    }
                                    z17 = z14;
                                    str2 = (String) map.get("stateOfBirth");
                                    if (!z17) {
                                        if (str2 != null) {
                                            z18 = z14;
                                        } else {
                                            z18 = z14;
                                        }
                                        if (z18) {
                                        }
                                    }
                                }
                            } else {
                                z14 = true;
                            }
                            if (z15) {
                                c30094a2 = new C30094a(abstractC28990D3, c29983l.m70061a("sns_data_error_fieldIsRequired"));
                            } else {
                                if (z23) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                if (!z16) {
                                    String str14 = (String) map.get(abstractC28990D3.mo69727c());
                                    strM71280a = AbstractC32657i.m71280a(abstractC28990D3, str14 != null ? str14 : "", c29983l, bool);
                                    if (strM71280a != null) {
                                        c30094a2 = new C30094a(abstractC28990D3, strM71280a);
                                    }
                                }
                            }
                        }
                    }
                }
                c30094a2 = c30094a;
            }
            if (c30094a2 != null) {
                arrayList.add(c30094a2);
            }
        }
        List list2 = CollectionsKt.toList(arrayList);
        if (list2.isEmpty()) {
            return null;
        }
        return list2;
    }
}
