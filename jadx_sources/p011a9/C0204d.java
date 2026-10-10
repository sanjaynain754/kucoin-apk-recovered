package p011a9;

import android.widget.CompoundButton;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import p752x8.AbstractC46099a;
import p789y8.C46400b;

/* JADX INFO: renamed from: a9.d */
/* JADX INFO: compiled from: RxCompoundButton.java */
/* JADX INFO: loaded from: classes56.dex */
public final class C0204d {
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a */
    public static AbstractC46099a<Boolean> m779a(@NonNull CompoundButton compoundButton) {
        C46400b.m102387b(compoundButton, "view == null");
        return new C0202b(compoundButton);
    }
}
