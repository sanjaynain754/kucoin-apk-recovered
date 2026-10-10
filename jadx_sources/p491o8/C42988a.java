package p491o8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.ahocorasick.trie.Emit;
import org.ahocorasick.trie.Trie;

/* JADX INFO: renamed from: o8.a */
/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C42988a {

    /* JADX INFO: renamed from: a */
    public static final a f95132a = new a();

    /* JADX INFO: renamed from: o8.a$a */
    /* JADX INFO: compiled from: Engine.java */
    public static final class a implements Comparator<Emit> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Emit emit, Emit emit2) {
            if (emit.getStart() == emit2.getStart()) {
                if (emit.size() < emit2.size()) {
                    return 1;
                }
                if (emit.size() != emit2.size()) {
                    return -1;
                }
                return 0;
            }
            if (emit.getStart() < emit2.getStart()) {
                return -1;
            }
            if (emit.getStart() == emit2.getStart()) {
                return 0;
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String[] m94415a(String str, List<InterfaceC42994g> list) {
        if (list != null) {
            for (InterfaceC42994g interfaceC42994g : list) {
                if (interfaceC42994g != null && interfaceC42994g.m94423a() != null && interfaceC42994g.m94423a().contains(str)) {
                    return interfaceC42994g.m94424b(str);
                }
            }
        }
        throw new IllegalArgumentException("No pinyin dict contains word: " + str);
    }

    /* JADX INFO: renamed from: b */
    public static String m94416b(String str, Trie trie, List<InterfaceC42994g> list, String str2, InterfaceC42995h interfaceC42995h) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (trie == null || interfaceC42995h == null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i11 = 0; i11 < str.length(); i11++) {
                stringBuffer.append(C42989b.m94421d(str.charAt(i11)));
                if (i11 != str.length() - 1) {
                    stringBuffer.append(str2);
                }
            }
            return stringBuffer.toString();
        }
        List<Emit> listM94425a = interfaceC42995h.m94425a(trie.parseText(str));
        Collections.sort(listM94425a, f95132a);
        StringBuffer stringBuffer2 = new StringBuffer();
        int size = 0;
        int i12 = 0;
        while (size < str.length()) {
            if (i12 >= listM94425a.size() || size != listM94425a.get(i12).getStart()) {
                stringBuffer2.append(C42989b.m94421d(str.charAt(size)));
                size++;
            } else {
                String[] strArrM94415a = m94415a(listM94425a.get(i12).getKeyword(), list);
                for (int i13 = 0; i13 < strArrM94415a.length; i13++) {
                    stringBuffer2.append(strArrM94415a[i13].toUpperCase());
                    if (i13 != strArrM94415a.length - 1) {
                        stringBuffer2.append(str2);
                    }
                }
                size += listM94425a.get(i12).size();
                i12++;
            }
            if (size != str.length()) {
                stringBuffer2.append(str2);
            }
        }
        return stringBuffer2.toString();
    }
}
