package ac0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33627eb;
import java.util.List;
import yb0.C46436e0;

/* JADX INFO: renamed from: ac0.b */
/* JADX INFO: compiled from: BaseReadOperation.java */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC0232b implements InterfaceC0235e {
    @Override // ac0.InterfaceC0235e
    /* JADX INFO: renamed from: c */
    public C46436e0 mo854c() {
        return new C46436e0(m861j(), m862k());
    }

    @Override // ac0.InterfaceC0235e
    /* JADX INFO: renamed from: e */
    public Boolean mo856e() {
        return m859h("inTransaction");
    }

    @Override // ac0.InterfaceC0235e
    /* JADX INFO: renamed from: f */
    public boolean mo857f() {
        return Boolean.TRUE.equals(mo863a("noResult"));
    }

    /* JADX INFO: renamed from: i */
    public boolean m860i() {
        return Boolean.TRUE.equals(mo863a("continueOnError"));
    }

    /* JADX INFO: renamed from: k */
    public final List<Object> m862k() {
        return (List) mo863a("arguments");
    }

    @NonNull
    public String toString() {
        return getMethod() + C33627eb.f69716f + m861j() + C33627eb.f69716f + m862k();
    }

    @Override // ac0.InterfaceC0235e
    /* JADX INFO: renamed from: d */
    public boolean mo855d() {
        if (mo864b("transactionId") && mo858g() == null) {
            return true;
        }
        return false;
    }

    @Override // ac0.InterfaceC0235e
    @Nullable
    /* JADX INFO: renamed from: g */
    public Integer mo858g() {
        return (Integer) mo863a("transactionId");
    }

    /* JADX INFO: renamed from: h */
    public final Boolean m859h(String str) {
        Object objMo863a = mo863a(str);
        if (objMo863a instanceof Boolean) {
            return (Boolean) objMo863a;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final String m861j() {
        return (String) mo863a("sql");
    }
}
