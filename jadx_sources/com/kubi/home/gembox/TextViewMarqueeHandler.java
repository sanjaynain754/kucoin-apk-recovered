package com.kubi.home.gembox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kubi.home.R$layout;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.gembox.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TextViewMarqueeHandler.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/gembox/TextViewMarqueeHandler;", "Lcom/kubi/home/gembox/MarqueeHandler;", "textItem", "Lcom/kubi/home/gembox/TextItem;", "marqueeView", "Lcom/kubi/home/gembox/MarqueeView;", "<init>", "(Lcom/kubi/home/gembox/TextItem;Lcom/kubi/home/gembox/MarqueeView;)V", "addContentView", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TextViewMarqueeHandler extends MarqueeHandler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewMarqueeHandler(@NotNull TextItem textItem, @NotNull MarqueeView marqueeView) {
        super(textItem, marqueeView);
        Intrinsics.checkNotNullParameter(textItem, "textItem");
        Intrinsics.checkNotNullParameter(marqueeView, "marqueeView");
    }

    @Override // com.kubi.home.gembox.MarqueeHandler
    /* JADX INFO: renamed from: b */
    public void mo29221b() {
        super.mo29221b();
        View viewInflate = LayoutInflater.from(getF25690f().getContext()).inflate(R$layout.layout_text_marquee, (ViewGroup) null, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewInflate;
        textView.setText(getF25686b().getMessage());
        LinearLayout f25690f = getF25690f();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(MarqueeView.f25660c.getTEXT_MARGIN_START());
        layoutParams.gravity = 16;
        textView.requestLayout();
        Unit unit = Unit.INSTANCE;
        f25690f.addView(textView, layoutParams);
    }
}
