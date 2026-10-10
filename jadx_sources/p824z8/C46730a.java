package p824z8;

import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import io.reactivex.Observable;
import p752x8.AbstractC46099a;
import p789y8.C46400b;

/* JADX INFO: renamed from: z8.a */
/* JADX INFO: compiled from: RxView.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C46730a {
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a */
    public static Observable<Object> m102978a(@NonNull View view) {
        C46400b.m102387b(view, "view == null");
        return new C46731b(view);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: b */
    public static AbstractC46099a<Boolean> m102979b(@NonNull View view) {
        C46400b.m102387b(view, "view == null");
        return new C46732c(view);
    }
}
