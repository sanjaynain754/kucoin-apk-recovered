package p011a9;

import android.text.Editable;
import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: renamed from: a9.g */
/* JADX INFO: compiled from: TextViewAfterTextChangeEvent.java */
/* JADX INFO: loaded from: classes56.dex */
@AutoValue
public abstract class AbstractC0207g {
    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Editable mo773b();

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract TextView mo774c();

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a */
    public static AbstractC0207g m785a(@NonNull TextView textView, @Nullable Editable editable) {
        return new C0201a(textView, editable);
    }
}
