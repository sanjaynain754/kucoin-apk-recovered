package cf0;

import android.content.Context;
import android.text.Spanned;
import androidx.annotation.NonNull;
import io.noties.markwon.core.C39137a;

/* JADX INFO: renamed from: cf0.e */
/* JADX INFO: compiled from: Markwon.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC4950e {

    /* JADX INFO: renamed from: cf0.e$a */
    /* JADX INFO: compiled from: Markwon.java */
    public interface a {
        @NonNull
        /* JADX INFO: renamed from: a */
        a mo5176a(@NonNull InterfaceC4954i interfaceC4954i);

        @NonNull
        AbstractC4950e build();
    }

    /* JADX INFO: renamed from: cf0.e$b */
    /* JADX INFO: compiled from: Markwon.java */
    public interface b {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract Spanned mo5175b(@NonNull String str);

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m5174a(@NonNull Context context) {
        return new C4951f(context).mo5176a(C39137a.m87807h());
    }
}
