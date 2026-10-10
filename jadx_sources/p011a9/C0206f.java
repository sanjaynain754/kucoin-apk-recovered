package p011a9;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import p752x8.AbstractC46099a;
import p789y8.C46399a;
import p789y8.C46400b;

/* JADX INFO: renamed from: a9.f */
/* JADX INFO: compiled from: RxTextView.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0206f {
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a */
    public static AbstractC46099a<AbstractC0207g> m781a(@NonNull TextView textView) {
        C46400b.m102387b(textView, "view == null");
        return new C0208h(textView);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: b */
    public static Observable<Integer> m782b(@NonNull TextView textView) {
        C46400b.m102387b(textView, "view == null");
        return m783c(textView, C46399a.f104059c);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: c */
    public static Observable<Integer> m783c(@NonNull TextView textView, @NonNull Predicate<? super Integer> predicate) {
        C46400b.m102387b(textView, "view == null");
        C46400b.m102387b(predicate, "handled == null");
        return new C0209i(textView, predicate);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d */
    public static AbstractC46099a<CharSequence> m784d(@NonNull TextView textView) {
        C46400b.m102387b(textView, "view == null");
        return new C0210j(textView);
    }
}
