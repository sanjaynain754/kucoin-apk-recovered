package com.kubi.resources.widget;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import com.kubi.sdk.res.R$string;
import com.kubi.utils.ToastCompat;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.kubi.resources.widget.v */
/* JADX INFO: compiled from: FilterEmojiTextWatcher.java */
/* JADX INFO: loaded from: classes12.dex */
public class C23161v implements TextWatcher {

    /* JADX INFO: renamed from: b */
    public final Context f45228b;

    /* JADX INFO: renamed from: c */
    public final a f45229c;

    /* JADX INFO: renamed from: com.kubi.resources.widget.v$a */
    /* JADX INFO: compiled from: FilterEmojiTextWatcher.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo54505a();

        /* JADX INFO: renamed from: c */
        boolean mo54506c();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55568a(String str) {
        return Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[🠀-\u1fbff]|[☀-⟿]").matcher(str).find();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        if (this.f45229c.mo54506c() && i13 - i12 >= 1) {
            int i14 = i12 + i11;
            int i15 = i11 + i13;
            if (m55568a(charSequence.subSequence(i14, i15).toString())) {
                if (this.f45229c.mo54505a()) {
                    ToastCompat.m66465z(R$string.not_support_emoji);
                }
                ((SpannableStringBuilder) charSequence).delete(i14, i15);
            }
        }
    }

    public C23161v(a aVar, Context context) {
        this.f45228b = context;
        this.f45229c = aVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
