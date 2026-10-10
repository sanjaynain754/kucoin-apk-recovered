package p710w1;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p523p2.C43364k;

/* JADX INFO: renamed from: w1.m */
/* JADX INFO: compiled from: SizeConfigStrategy.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class C45695m implements InterfaceC45693k {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f103020d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f103021e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f103022f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f103023g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f103024h;

    /* JADX INFO: renamed from: a */
    public final c f103025a = new c();

    /* JADX INFO: renamed from: b */
    public final C45689g<b, Bitmap> f103026b = new C45689g<>();

    /* JADX INFO: renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f103027c = new HashMap();

    /* JADX INFO: renamed from: w1.m$b */
    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    @VisibleForTesting
    public static final class b implements InterfaceC45694l {

        /* JADX INFO: renamed from: a */
        public final c f103029a;

        /* JADX INFO: renamed from: b */
        public int f103030b;

        /* JADX INFO: renamed from: c */
        public Bitmap.Config f103031c;

        @Override // p710w1.InterfaceC45694l
        /* JADX INFO: renamed from: a */
        public void mo100840a() {
            this.f103029a.m100810c(this);
        }

        /* JADX INFO: renamed from: b */
        public void m100868b(int i11, Bitmap.Config config) {
            this.f103030b = i11;
            this.f103031c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f103030b == bVar.f103030b && C43364k.m95511d(this.f103031c, bVar.f103031c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.f103030b * 31;
            Bitmap.Config config = this.f103031c;
            return i11 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C45695m.m100863h(this.f103030b, this.f103031c);
        }

        public b(c cVar) {
            this.f103029a = cVar;
        }
    }

    /* JADX INFO: renamed from: w1.m$c */
    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    @VisibleForTesting
    public static class c extends AbstractC45685c<b> {
        @Override // p710w1.AbstractC45685c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo100808a() {
            return new b(this);
        }

        /* JADX INFO: renamed from: e */
        public b m100870e(int i11, Bitmap.Config config) {
            b bVarM100809b = m100809b();
            bVarM100809b.m100868b(i11, config);
            return bVarM100809b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f103020d = configArr;
        f103021e = configArr;
        f103022f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f103023g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f103024h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: w1.m$a */
    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f103028a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f103028a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103028a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103028a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103028a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m100863h(int i11, Bitmap.Config config) {
        return "[" + i11 + "](" + config + ")";
    }

    /* JADX INFO: renamed from: i */
    public static Bitmap.Config[] m100864i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f103021e;
        }
        int i11 = a.f103028a[config.ordinal()];
        if (i11 == 1) {
            return f103020d;
        }
        if (i11 == 2) {
            return f103022f;
        }
        if (i11 != 3) {
            return i11 != 4 ? new Bitmap.Config[]{config} : f103024h;
        }
        return f103023g;
    }

    /* JADX INFO: renamed from: g */
    public final b m100866g(int i11, Bitmap.Config config) {
        b bVarM100870e = this.f103025a.m100870e(i11, config);
        for (Bitmap.Config config2 : m100864i(config)) {
            Integer numCeilingKey = m100867j(config2).ceilingKey(Integer.valueOf(i11));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i11 * 8) {
                if (numCeilingKey.intValue() == i11 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f103025a.m100810c(bVarM100870e);
                return this.f103025a.m100870e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarM100870e;
    }

    /* JADX INFO: renamed from: j */
    public final NavigableMap<Integer, Integer> m100867j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f103027c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f103027c.put(config, treeMap);
        return treeMap;
    }

    @Override // p710w1.InterfaceC45693k
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapM100823f = this.f103026b.m100823f();
        if (bitmapM100823f != null) {
            m100865f(Integer.valueOf(C43364k.m95515h(bitmapM100823f)), bitmapM100823f);
        }
        return bitmapM100823f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f103026b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f103027c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f103027c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }

    @Override // p710w1.InterfaceC45693k
    /* JADX INFO: renamed from: a */
    public String mo100858a(int i11, int i12, Bitmap.Config config) {
        return m100863h(C43364k.m95514g(i11, i12, config), config);
    }

    @Override // p710w1.InterfaceC45693k
    /* JADX INFO: renamed from: b */
    public void mo100859b(Bitmap bitmap) {
        b bVarM100870e = this.f103025a.m100870e(C43364k.m95515h(bitmap), bitmap.getConfig());
        this.f103026b.m100822d(bVarM100870e, bitmap);
        NavigableMap<Integer, Integer> navigableMapM100867j = m100867j(bitmap.getConfig());
        Integer num = navigableMapM100867j.get(Integer.valueOf(bVarM100870e.f103030b));
        Integer numValueOf = Integer.valueOf(bVarM100870e.f103030b);
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        navigableMapM100867j.put(numValueOf, Integer.valueOf(iIntValue));
    }

    @Override // p710w1.InterfaceC45693k
    /* JADX INFO: renamed from: c */
    public int mo100860c(Bitmap bitmap) {
        return C43364k.m95515h(bitmap);
    }

    @Override // p710w1.InterfaceC45693k
    @Nullable
    /* JADX INFO: renamed from: d */
    public Bitmap mo100861d(int i11, int i12, Bitmap.Config config) {
        b bVarM100866g = m100866g(C43364k.m95514g(i11, i12, config), config);
        Bitmap bitmapM100819a = this.f103026b.m100819a(bVarM100866g);
        if (bitmapM100819a != null) {
            m100865f(Integer.valueOf(bVarM100866g.f103030b), bitmapM100819a);
            bitmapM100819a.reconfigure(i11, i12, config);
        }
        return bitmapM100819a;
    }

    @Override // p710w1.InterfaceC45693k
    /* JADX INFO: renamed from: e */
    public String mo100862e(Bitmap bitmap) {
        return m100863h(C43364k.m95515h(bitmap), bitmap.getConfig());
    }

    /* JADX INFO: renamed from: f */
    public final void m100865f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapM100867j = m100867j(bitmap.getConfig());
        Integer num2 = navigableMapM100867j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM100867j.remove(num);
                return;
            } else {
                navigableMapM100867j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo100862e(bitmap) + ", this: " + this);
    }
}
