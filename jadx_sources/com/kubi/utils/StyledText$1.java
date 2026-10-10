package com.kubi.utils;

import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: classes54.dex */
class StyledText$1 extends URLSpan {
    final /* synthetic */ C27096v0 this$0;
    final /* synthetic */ View.OnClickListener val$listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledText$1(C27096v0 c27096v0, String str, View.OnClickListener onClickListener) {
        super(str);
        this.this$0 = c27096v0;
        this.val$listener = onClickListener;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.val$listener.onClick(view);
    }
}
