package cy;

import android.content.Context;
import com.kubi.router.p112ui.HolderActivity;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: renamed from: cy.a */
/* JADX INFO: compiled from: HolderActivity.java */
/* JADX INFO: loaded from: classes39.dex */
public class C36554a extends AbstractC43178a {
    @Override // org.aspectj.runtime.internal.AbstractC43178a
    public Object run(Object[] objArr) {
        Object[] objArr2 = this.state;
        HolderActivity holderActivity = (HolderActivity) objArr2[0];
        Context context = (Context) objArr2[1];
        super/*android.content.ContextWrapper*/.attachBaseContext(context);
        return null;
    }

    public C36554a(Object[] objArr) {
        super(objArr);
    }
}
