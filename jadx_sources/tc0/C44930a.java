package tc0;

import android.net.Uri;
import com.trtc.tuikit.common.system.ContextProvider;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: renamed from: tc0.a */
/* JADX INFO: compiled from: ContextProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public class C44930a extends AbstractC43178a {
    @Override // org.aspectj.runtime.internal.AbstractC43178a
    public Object run(Object[] objArr) {
        Object[] objArr2 = this.state;
        return ContextProvider.m79398c((ContextProvider) objArr2[0], (Uri) objArr2[1], (String[]) objArr2[2], (String) objArr2[3], (String[]) objArr2[4], (String) objArr2[5], (InterfaceC43175a) objArr2[6]);
    }

    public C44930a(Object[] objArr) {
        super(objArr);
    }
}
