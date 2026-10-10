package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;
import cf0.InterfaceC4948c;
import df0.C36671a;

/* JADX INFO: loaded from: classes60.dex */
public class LinkSpan extends URLSpan {
    private final String link;
    private final InterfaceC4948c resolver;
    private final C36671a theme;

    @NonNull
    public String getLink() {
        return this.link;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.resolver.resolve(view, this.link);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.theme.m82062f(textPaint);
    }

    public LinkSpan(@NonNull C36671a c36671a, @NonNull String str, @NonNull InterfaceC4948c interfaceC4948c) {
        super(str);
        this.theme = c36671a;
        this.link = str;
        this.resolver = interfaceC4948c;
    }
}
