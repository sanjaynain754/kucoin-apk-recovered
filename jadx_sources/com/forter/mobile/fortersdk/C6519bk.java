package com.forter.mobile.fortersdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.bk */
/* JADX INFO: loaded from: classes.dex */
public final class C6519bk {

    /* JADX INFO: renamed from: a */
    public static final char[] f10908a;

    /* JADX INFO: renamed from: b */
    public static final HashMap<Character, Integer> f10909b;

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.bk$b */
    public class b extends e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f10910a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((byte) 0);
            this.f10910a = str;
        }

        @Override // com.forter.mobile.fortersdk.C6519bk.e
        /* JADX INFO: renamed from: a */
        public final char mo12181a(int i11) {
            return (char) ((Integer) C6519bk.f10909b.get(Character.valueOf(this.f10910a.charAt(i11)))).intValue();
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.bk$c */
    /* JADX INFO: loaded from: classes45.dex */
    public static abstract class c {
        public c() {
        }

        /* JADX INFO: renamed from: a */
        public abstract char mo12180a(int i11);

        public /* synthetic */ c(byte b11) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.bk$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public char f10911a;

        /* JADX INFO: renamed from: b */
        public int f10912b;

        /* JADX INFO: renamed from: c */
        public int f10913c;

        public d() {
        }

        public /* synthetic */ d(byte b11) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.bk$e */
    public static abstract class e {
        public e() {
        }

        /* JADX INFO: renamed from: a */
        public abstract char mo12181a(int i11);

        public /* synthetic */ e(byte b11) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.bk$a */
    /* JADX INFO: loaded from: classes45.dex */
    public class a extends c {
        public a() {
            super((byte) 0);
        }

        @Override // com.forter.mobile.fortersdk.C6519bk.c
        /* JADX INFO: renamed from: a */
        public final char mo12180a(int i11) {
            return C6519bk.f10908a[i11];
        }
    }

    static {
        char[] charArray = "aKAmRIHjBy37LlMCTzxtpgVQb0DfU98wkdPJecYGFNhu6-so2+Er$S15viOZqn4XW".toCharArray();
        f10908a = charArray;
        f10909b = new HashMap<>(charArray.length);
        int i11 = 0;
        while (true) {
            char[] cArr = f10908a;
            if (i11 >= cArr.length) {
                return;
            }
            f10909b.put(Character.valueOf(cArr[i11]), Integer.valueOf(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12176a(String str) {
        int i11;
        String str2 = str;
        String str3 = "";
        if (str2 == null) {
            return "";
        }
        a aVar = new a();
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        int i12 = 3;
        StringBuilder sb2 = new StringBuilder(str2.length() / 3);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 2;
        int i18 = 2;
        while (i14 < str2.length()) {
            String strValueOf = String.valueOf(str2.charAt(i14));
            if (!map.containsKey(strValueOf)) {
                map.put(strValueOf, Integer.valueOf(i12));
                hashSet.add(strValueOf);
                i12++;
            }
            String str4 = str3 + strValueOf;
            if (map.containsKey(str4)) {
                str3 = str4;
            } else {
                if (hashSet.contains(str3)) {
                    if (str3.charAt(i13) < 256) {
                        for (int i19 = i13; i19 < i17; i19++) {
                            i15 <<= 1;
                            if (i16 == 5) {
                                sb2.append(aVar.mo12180a(i15));
                                i15 = i13;
                                i16 = i15;
                            } else {
                                i16++;
                            }
                        }
                        int iCharAt = str3.charAt(i13);
                        while (i13 < 8) {
                            i15 = (i15 << 1) | (iCharAt & 1);
                            if (i16 == 5) {
                                sb2.append(aVar.mo12180a(i15));
                                i15 = 0;
                                i16 = 0;
                            } else {
                                i16++;
                            }
                            iCharAt >>= 1;
                            i13++;
                        }
                    } else {
                        int i21 = 1;
                        int i22 = 0;
                        while (i22 < i17) {
                            int i23 = i21 | (i15 << 1);
                            if (i16 == 5) {
                                sb2.append(aVar.mo12180a(i23));
                                i15 = 0;
                                i16 = 0;
                            } else {
                                i16++;
                                i15 = i23;
                            }
                            i22++;
                            i21 = 0;
                        }
                        int iCharAt2 = str3.charAt(0);
                        for (int i24 = 0; i24 < 16; i24++) {
                            i15 = (i15 << 1) | (iCharAt2 & 1);
                            if (i16 == 5) {
                                sb2.append(aVar.mo12180a(i15));
                                i15 = 0;
                                i16 = 0;
                            } else {
                                i16++;
                            }
                            iCharAt2 >>= 1;
                        }
                    }
                    i18--;
                    if (i18 == 0) {
                        int i25 = 1 << i17;
                        i17++;
                        i18 = i25;
                    }
                    hashSet.remove(str3);
                } else {
                    int iIntValue = ((Integer) map.get(str3)).intValue();
                    for (int i26 = 0; i26 < i17; i26++) {
                        int i27 = (i15 << 1) | (iIntValue & 1);
                        if (i16 == 5) {
                            sb2.append(aVar.mo12180a(i27));
                            i15 = 0;
                            i16 = 0;
                        } else {
                            i16++;
                            i15 = i27;
                        }
                        iIntValue >>= 1;
                    }
                }
                i18--;
                if (i18 == 0) {
                    int i28 = 1 << i17;
                    i17++;
                    i18 = i28;
                }
                map.put(str4, Integer.valueOf(i12));
                i12++;
                str3 = strValueOf;
            }
            i14++;
            str2 = str;
            i13 = 0;
        }
        if (str3.isEmpty()) {
            i11 = 0;
        } else {
            if (hashSet.contains(str3)) {
                if (str3.charAt(0) < 256) {
                    for (int i29 = 0; i29 < i17; i29++) {
                        int i31 = i15 << 1;
                        if (i16 == 5) {
                            sb2.append(aVar.mo12180a(i31));
                            i15 = 0;
                            i16 = 0;
                        } else {
                            i16++;
                            i15 = i31;
                        }
                    }
                    int iCharAt3 = str3.charAt(0);
                    for (int i32 = 0; i32 < 8; i32++) {
                        int i33 = (i15 << 1) | (iCharAt3 & 1);
                        if (i16 == 5) {
                            sb2.append(aVar.mo12180a(i33));
                            i15 = 0;
                            i16 = 0;
                        } else {
                            i15 = i33;
                            i16++;
                        }
                        iCharAt3 >>= 1;
                    }
                    i11 = 0;
                } else {
                    int i34 = 1;
                    int i35 = 0;
                    while (i35 < i17) {
                        int i36 = i34 | (i15 << 1);
                        if (i16 == 5) {
                            sb2.append(aVar.mo12180a(i36));
                            i15 = 0;
                            i16 = 0;
                        } else {
                            i16++;
                            i15 = i36;
                        }
                        i35++;
                        i34 = 0;
                    }
                    i11 = 0;
                    int iCharAt4 = str3.charAt(0);
                    for (int i37 = 0; i37 < 16; i37++) {
                        int i38 = (i15 << 1) | (iCharAt4 & 1);
                        if (i16 == 5) {
                            sb2.append(aVar.mo12180a(i38));
                            i15 = 0;
                            i16 = 0;
                        } else {
                            i15 = i38;
                            i16++;
                        }
                        iCharAt4 >>= 1;
                    }
                }
                i18--;
                if (i18 == 0) {
                    int i39 = 1 << i17;
                    i17++;
                    i18 = i39;
                }
                hashSet.remove(str3);
            } else {
                i11 = 0;
                int iIntValue2 = ((Integer) map.get(str3)).intValue();
                for (int i41 = 0; i41 < i17; i41++) {
                    int i42 = (i15 << 1) | (iIntValue2 & 1);
                    if (i16 == 5) {
                        sb2.append(aVar.mo12180a(i42));
                        i15 = 0;
                        i16 = 0;
                    } else {
                        i16++;
                        i15 = i42;
                    }
                    iIntValue2 >>= 1;
                }
            }
            if (i18 - 1 == 0) {
                i17++;
            }
        }
        int i43 = 2;
        for (int i44 = i11; i44 < i17; i44++) {
            int i45 = (i15 << 1) | (i43 & 1);
            if (i16 == 5) {
                sb2.append(aVar.mo12180a(i45));
                i15 = i11;
                i16 = i15;
            } else {
                i15 = i45;
                i16++;
            }
            i43 >>= 1;
        }
        while (true) {
            i15 <<= 1;
            if (i16 == 5) {
                sb2.append(aVar.mo12180a(i15));
                return sb2.toString();
            }
            i16++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:112:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0137  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    /* JADX WARN: Code duplicated, block: B:86:0x0172  */
    /* JADX WARN: Code duplicated, block: B:88:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x0186  */
    /* JADX WARN: Code duplicated, block: B:93:0x0192  */
    /* JADX WARN: Code duplicated, block: B:94:0x0195  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    /* JADX INFO: renamed from: c */
    public static String m12178c(String str) {
        String str2;
        char c11;
        String strValueOf;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        char c12;
        int i22;
        int i23;
        int i24;
        int i25;
        String string;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        if (str == null || "".equals(str)) {
            return null;
        }
        int i38 = 32;
        String strReplace = str.replace(' ', '+');
        int length = strReplace.length();
        b bVar = new b(strReplace);
        ArrayList<String> arrayList = new ArrayList<String>() { // from class: com.forter.mobile.fortersdk.bk.3
            {
                add("0");
                add("1");
                add("2");
            }
        };
        StringBuilder sb2 = new StringBuilder();
        d dVar = new d((byte) 0);
        dVar.f10911a = bVar.mo12181a(0);
        dVar.f10912b = 32;
        int i39 = 1;
        dVar.f10913c = 1;
        int i41 = 0;
        for (int i42 = 1; i42 != 4; i42 <<= 1) {
            char c13 = dVar.f10911a;
            int i43 = dVar.f10912b;
            int i44 = c13 & i43;
            int i45 = i43 >> 1;
            dVar.f10912b = i45;
            if (i45 == 0) {
                dVar.f10912b = 32;
                int i46 = dVar.f10913c;
                dVar.f10913c = i46 + 1;
                dVar.f10911a = bVar.mo12181a(i46);
            }
            i41 |= (i44 > 0 ? 1 : 0) * i42;
        }
        if (i41 != 0) {
            if (i41 == 1) {
                int i47 = 0;
                int i48 = 1;
                while (true) {
                    str2 = null;
                    if (i48 == 65536) {
                        break;
                    }
                    char c14 = dVar.f10911a;
                    int i49 = dVar.f10912b;
                    int i51 = c14 & i49;
                    int i52 = i49 >> 1;
                    dVar.f10912b = i52;
                    if (i52 == 0) {
                        dVar.f10912b = 32;
                        int i53 = dVar.f10913c;
                        dVar.f10913c = i53 + 1;
                        dVar.f10911a = bVar.mo12181a(i53);
                    }
                    i47 |= (i51 > 0 ? 1 : 0) * i48;
                    i48 <<= 1;
                }
                c11 = (char) i47;
            } else {
                if (i41 == 2) {
                    return "";
                }
                strValueOf = null;
                str2 = null;
            }
            if (strValueOf == null) {
                return str2;
            }
            i11 = 3;
            arrayList.add(3, strValueOf);
            sb2.append(strValueOf);
            i12 = 4;
            i13 = 4;
            while (dVar.f10913c <= length) {
                i14 = i39 << i11;
                i15 = i39;
                i16 = 0;
                while (i15 != i14) {
                    char c15 = dVar.f10911a;
                    i34 = i39;
                    int i54 = dVar.f10912b;
                    i35 = c15 & i54;
                    i36 = i54 >> 1;
                    dVar.f10912b = i36;
                    if (i36 == 0) {
                        dVar.f10912b = i38;
                        int i55 = dVar.f10913c;
                        dVar.f10913c = i55 + 1;
                        dVar.f10911a = bVar.mo12181a(i55);
                    }
                    if (i35 > 0) {
                        i37 = i34;
                    } else {
                        i37 = 0;
                    }
                    i16 |= i37 * i15;
                    i15 <<= 1;
                    i39 = i34;
                    i38 = 32;
                }
                i17 = i39;
                if (i16 != 0) {
                    i27 = i17;
                    if (i16 != i27) {
                        i28 = i27;
                        i29 = 0;
                        while (i28 != 65536) {
                            char c16 = dVar.f10911a;
                            int i56 = dVar.f10912b;
                            i31 = c16 & i56;
                            i32 = i56 >> 1;
                            dVar.f10912b = i32;
                            if (i32 == 0) {
                                dVar.f10912b = 32;
                                int i57 = dVar.f10913c;
                                dVar.f10913c = i57 + 1;
                                dVar.f10911a = bVar.mo12181a(i57);
                            }
                            if (i31 > 0) {
                                i33 = 1;
                            } else {
                                i33 = 0;
                            }
                            i29 |= i33 * i28;
                            i28 <<= 1;
                            i27 = 1;
                        }
                        i21 = i12 + 1;
                        c12 = (char) i29;
                    } else {
                        if (i16 != 2) {
                            return sb2.toString();
                        }
                        i21 = i12;
                        i12 = i16;
                    }
                    if (i13 == 0) {
                        i11++;
                    } else {
                        i14 = i13;
                    }
                    if (i12 >= arrayList.size() && arrayList.get(i12) != null) {
                        string = arrayList.get(i12);
                        i25 = 0;
                    } else {
                        if (i12 != i21) {
                            return str2;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(strValueOf);
                        i25 = 0;
                        sb3.append(strValueOf.charAt(0));
                        string = sb3.toString();
                    }
                    sb2.append(string);
                    i12 = i21 + 1;
                    arrayList.add(i21, strValueOf + string.charAt(i25));
                    i26 = i14 + (-1);
                    if (i26 == 0) {
                        int i58 = 1 << i11;
                        i11++;
                        i13 = i58;
                    } else {
                        i13 = i26;
                    }
                    strValueOf = string;
                    i39 = 1;
                    i38 = 32;
                } else {
                    i19 = 0;
                    for (i18 = 1; i18 != 256; i18 <<= 1) {
                        char c17 = dVar.f10911a;
                        int i59 = dVar.f10912b;
                        i22 = c17 & i59;
                        i23 = i59 >> 1;
                        dVar.f10912b = i23;
                        if (i23 == 0) {
                            dVar.f10912b = 32;
                            int i61 = dVar.f10913c;
                            dVar.f10913c = i61 + 1;
                            dVar.f10911a = bVar.mo12181a(i61);
                        }
                        if (i22 > 0) {
                            i24 = 1;
                        } else {
                            i24 = 0;
                        }
                        i19 |= i24 * i18;
                    }
                    i21 = i12 + 1;
                    c12 = (char) i19;
                }
                arrayList.add(i12, String.valueOf(c12));
                i13--;
                if (i13 == 0) {
                    i11++;
                } else {
                    i14 = i13;
                }
                if (i12 >= arrayList.size()) {
                    if (i12 != i21) {
                        return str2;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(strValueOf);
                    i25 = 0;
                    sb4.append(strValueOf.charAt(0));
                    string = sb4.toString();
                } else {
                    if (i12 != i21) {
                        return str2;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(strValueOf);
                    i25 = 0;
                    sb5.append(strValueOf.charAt(0));
                    string = sb5.toString();
                }
                sb2.append(string);
                i12 = i21 + 1;
                arrayList.add(i21, strValueOf + string.charAt(i25));
                i26 = i14 + (-1);
                if (i26 == 0) {
                    int i510 = 1 << i11;
                    i11++;
                    i13 = i510;
                } else {
                    i13 = i26;
                }
                strValueOf = string;
                i39 = 1;
                i38 = 32;
            }
            return "";
        }
        str2 = null;
        int i62 = 0;
        for (int i63 = 1; i63 != 256; i63 <<= 1) {
            char c18 = dVar.f10911a;
            int i64 = dVar.f10912b;
            int i65 = c18 & i64;
            int i66 = i64 >> 1;
            dVar.f10912b = i66;
            if (i66 == 0) {
                dVar.f10912b = 32;
                int i67 = dVar.f10913c;
                dVar.f10913c = i67 + 1;
                dVar.f10911a = bVar.mo12181a(i67);
            }
            i62 |= (i65 > 0 ? 1 : 0) * i63;
        }
        c11 = (char) i62;
        strValueOf = String.valueOf(c11);
        if (strValueOf == null) {
            return str2;
        }
        i11 = 3;
        arrayList.add(3, strValueOf);
        sb2.append(strValueOf);
        i12 = 4;
        i13 = 4;
        while (dVar.f10913c <= length) {
            i14 = i39 << i11;
            i15 = i39;
            i16 = 0;
            while (i15 != i14) {
                char c19 = dVar.f10911a;
                i34 = i39;
                int i511 = dVar.f10912b;
                i35 = c19 & i511;
                i36 = i511 >> 1;
                dVar.f10912b = i36;
                if (i36 == 0) {
                    dVar.f10912b = i38;
                    int i512 = dVar.f10913c;
                    dVar.f10913c = i512 + 1;
                    dVar.f10911a = bVar.mo12181a(i512);
                }
                if (i35 > 0) {
                    i37 = i34;
                } else {
                    i37 = 0;
                }
                i16 |= i37 * i15;
                i15 <<= 1;
                i39 = i34;
                i38 = 32;
            }
            i17 = i39;
            if (i16 != 0) {
                i27 = i17;
                if (i16 != i27) {
                    i28 = i27;
                    i29 = 0;
                    while (i28 != 65536) {
                        char c110 = dVar.f10911a;
                        int i513 = dVar.f10912b;
                        i31 = c110 & i513;
                        i32 = i513 >> 1;
                        dVar.f10912b = i32;
                        if (i32 == 0) {
                            dVar.f10912b = 32;
                            int i514 = dVar.f10913c;
                            dVar.f10913c = i514 + 1;
                            dVar.f10911a = bVar.mo12181a(i514);
                        }
                        if (i31 > 0) {
                            i33 = 1;
                        } else {
                            i33 = 0;
                        }
                        i29 |= i33 * i28;
                        i28 <<= 1;
                        i27 = 1;
                    }
                    i21 = i12 + 1;
                    c12 = (char) i29;
                } else {
                    if (i16 != 2) {
                        return sb2.toString();
                    }
                    i21 = i12;
                    i12 = i16;
                }
                if (i13 == 0) {
                    i11++;
                } else {
                    i14 = i13;
                }
                if (i12 >= arrayList.size()) {
                    if (i12 != i21) {
                        return str2;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(strValueOf);
                    i25 = 0;
                    sb6.append(strValueOf.charAt(0));
                    string = sb6.toString();
                } else {
                    if (i12 != i21) {
                        return str2;
                    }
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(strValueOf);
                    i25 = 0;
                    sb7.append(strValueOf.charAt(0));
                    string = sb7.toString();
                }
                sb2.append(string);
                i12 = i21 + 1;
                arrayList.add(i21, strValueOf + string.charAt(i25));
                i26 = i14 + (-1);
                if (i26 == 0) {
                    int i515 = 1 << i11;
                    i11++;
                    i13 = i515;
                } else {
                    i13 = i26;
                }
                strValueOf = string;
                i39 = 1;
                i38 = 32;
            } else {
                i19 = 0;
                while (i18 != 256) {
                    char c111 = dVar.f10911a;
                    int i516 = dVar.f10912b;
                    i22 = c111 & i516;
                    i23 = i516 >> 1;
                    dVar.f10912b = i23;
                    if (i23 == 0) {
                        dVar.f10912b = 32;
                        int i68 = dVar.f10913c;
                        dVar.f10913c = i68 + 1;
                        dVar.f10911a = bVar.mo12181a(i68);
                    }
                    if (i22 > 0) {
                        i24 = 1;
                    } else {
                        i24 = 0;
                    }
                    i19 |= i24 * i18;
                }
                i21 = i12 + 1;
                c12 = (char) i19;
            }
            arrayList.add(i12, String.valueOf(c12));
            i13--;
            if (i13 == 0) {
                i11++;
            } else {
                i14 = i13;
            }
            if (i12 >= arrayList.size()) {
                if (i12 != i21) {
                    return str2;
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(strValueOf);
                i25 = 0;
                sb8.append(strValueOf.charAt(0));
                string = sb8.toString();
            } else {
                if (i12 != i21) {
                    return str2;
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(strValueOf);
                i25 = 0;
                sb9.append(strValueOf.charAt(0));
                string = sb9.toString();
            }
            sb2.append(string);
            i12 = i21 + 1;
            arrayList.add(i21, strValueOf + string.charAt(i25));
            i26 = i14 + (-1);
            if (i26 == 0) {
                int i517 = 1 << i11;
                i11++;
                i13 = i517;
            } else {
                i13 = i26;
            }
            strValueOf = string;
            i39 = 1;
            i38 = 32;
        }
        return "";
    }
}
