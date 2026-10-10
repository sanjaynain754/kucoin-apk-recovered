package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p186d0.C36559a;

/* JADX INFO: loaded from: classes23.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    @NonNull
    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(@NonNull AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    @NonNull
    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return C36559a.m81831a(this.mWrappedObj);
    }

    @RequiresApi(26)
    private AutofillIdCompat(@NonNull AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }
}
