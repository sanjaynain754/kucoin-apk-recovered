package com.kubi.quotefacade.tradechance.submodule.gembox;

import android.content.Context;
import android.widget.LinearLayout;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.entity.ChanceGemBoxTextItem;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.submodule.gembox.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChanceMarqueeHandler.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/gembox/TextViewMarqueeHandler;", "Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeHandler;", "marqueeView", "Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeView;", "textItem", "Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;", "<init>", "(Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceMarqueeView;Lcom/kubi/quotefacade/entity/ChanceGemBoxTextItem;)V", "addContentView", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TextViewMarqueeHandler extends ChanceMarqueeHandler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewMarqueeHandler(@NotNull ChanceMarqueeView marqueeView, @NotNull ChanceGemBoxTextItem textItem) {
        super(textItem, marqueeView);
        Intrinsics.checkNotNullParameter(marqueeView, "marqueeView");
        Intrinsics.checkNotNullParameter(textItem, "textItem");
    }

    @Override // com.kubi.quotefacade.tradechance.submodule.gembox.ChanceMarqueeHandler
    /* JADX INFO: renamed from: b */
    public void mo53154b() {
        super.mo53154b();
        Context context = getF42669f().getContext();
        Intrinsics.checkNotNull(context);
        BaseTextView baseTextView = new BaseTextView(context);
        baseTextView.setTextSize(12.0f);
        baseTextView.setGravity(17);
        baseTextView.setSingleLine();
        baseTextView.setTextColor(C27046k.m66699n(context, R$color.c_text));
        baseTextView.setText(getF42665b().getMessage());
        LinearLayout f42669f = getF42669f();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(ChanceMarqueeView.f42644e.getTEXT_MARGIN_START());
        layoutParams.gravity = 16;
        Unit unit = Unit.INSTANCE;
        f42669f.addView(baseTextView, layoutParams);
    }
}
