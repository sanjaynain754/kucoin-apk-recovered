package yb0;

import android.database.sqlite.SQLiteProgram;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yb0.e0 */
/* JADX INFO: compiled from: SqlCommand.java */
/* JADX INFO: loaded from: classes23.dex */
public class C46436e0 {

    /* JADX INFO: renamed from: a */
    public final String f104133a;

    /* JADX INFO: renamed from: b */
    public final List<Object> f104134b;

    /* JADX INFO: renamed from: f */
    public static Object m102431f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            bArr[i11] = (byte) ((Integer) list.get(i11)).intValue();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m102432a(SQLiteProgram sQLiteProgram) {
        List<Object> list = this.f104134b;
        if (list != null) {
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                Object objM102431f = m102431f(this.f104134b.get(i11));
                int i12 = i11 + 1;
                if (objM102431f == null) {
                    sQLiteProgram.bindNull(i12);
                } else if (objM102431f instanceof byte[]) {
                    sQLiteProgram.bindBlob(i12, (byte[]) objM102431f);
                } else if (objM102431f instanceof Double) {
                    sQLiteProgram.bindDouble(i12, ((Double) objM102431f).doubleValue());
                } else if (objM102431f instanceof Integer) {
                    sQLiteProgram.bindLong(i12, ((Integer) objM102431f).intValue());
                } else if (objM102431f instanceof Long) {
                    sQLiteProgram.bindLong(i12, ((Long) objM102431f).longValue());
                } else if (objM102431f instanceof String) {
                    sQLiteProgram.bindString(i12, (String) objM102431f);
                } else {
                    if (!(objM102431f instanceof Boolean)) {
                        throw new IllegalArgumentException("Could not bind " + objM102431f + " from index " + i11 + ": Supported types are null, byte[], double, long, boolean and String");
                    }
                    sQLiteProgram.bindLong(i12, ((Boolean) objM102431f).booleanValue() ? 1L : 0L);
                }
                i11 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public List<Object> m102433b() {
        return this.f104134b;
    }

    /* JADX INFO: renamed from: c */
    public String m102434c() {
        return this.f104133a;
    }

    /* JADX INFO: renamed from: d */
    public Object[] m102435d() {
        return m102436e(this.f104134b);
    }

    /* JADX INFO: renamed from: e */
    public final Object[] m102436e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m102431f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C46436e0)) {
            return false;
        }
        C46436e0 c46436e0 = (C46436e0) obj;
        String str = this.f104133a;
        if (str != null) {
            if (!str.equals(c46436e0.f104133a)) {
                return false;
            }
        } else if (c46436e0.f104133a != null) {
            return false;
        }
        if (this.f104134b.size() != c46436e0.f104134b.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f104134b.size(); i11++) {
            if ((this.f104134b.get(i11) instanceof byte[]) && (c46436e0.f104134b.get(i11) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f104134b.get(i11), (byte[]) c46436e0.f104134b.get(i11))) {
                    return false;
                }
            } else if (!this.f104134b.get(i11).equals(c46436e0.f104134b.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f104133a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f104133a);
        List<Object> list = this.f104134b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = C33627eb.f69716f + this.f104134b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public C46436e0(String str, List<Object> list) {
        this.f104133a = str;
        this.f104134b = list == null ? new ArrayList<>() : list;
    }
}
