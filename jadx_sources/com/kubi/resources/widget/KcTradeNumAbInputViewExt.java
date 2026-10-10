package com.kubi.resources.widget;

import android.text.Editable;
import android.view.View;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcTradeNumInputViewExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTradeNumAbInputViewExt;", "", "<init>", "()V", "autoDismissJob", "Lkotlinx/coroutines/Job;", "showPopTipsAutoDismiss", "", "Lcom/kubi/resources/widget/KcTradeNumAbInputView;", "overlayParent", "Landroid/view/View;", "tips", "", "durationMs", "", "startAutoDismiss", "isVisible", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcTradeNumAbInputViewExt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KcTradeNumAbInputViewExt f43890a = new KcTradeNumAbInputViewExt();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static InterfaceC41775x1 f43891b;

    /* JADX INFO: renamed from: c */
    public static final Unit m54638c(KcTradeNumAbInputView kcTradeNumAbInputView, long j11, boolean z11) {
        f43890a.m54640d(kcTradeNumAbInputView, z11, j11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m54639b(@NotNull final KcTradeNumAbInputView kcTradeNumAbInputView, @Nullable View view, @NotNull CharSequence tips, final long j11) {
        Intrinsics.checkNotNullParameter(kcTradeNumAbInputView, "<this>");
        Intrinsics.checkNotNullParameter(tips, "tips");
        kcTradeNumAbInputView.setTipsVisibleChangeListener(new Function1() { // from class: com.kubi.resources.widget.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KcTradeNumAbInputViewExt.m54638c(kcTradeNumAbInputView, j11, ((Boolean) obj).booleanValue());
            }
        });
        Editable text = kcTradeNumAbInputView.getEditText().getText();
        if (text != null && text.length() != 0) {
            kcTradeNumAbInputView.m54624D(view, tips);
        } else {
            KcTradeNumAbInputView.m54607F(kcTradeNumAbInputView, "", false, 2, null);
            kcTradeNumAbInputView.setTipsVisible(false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m54640d(KcTradeNumAbInputView kcTradeNumAbInputView, boolean z11, long j11) {
        if (z11) {
            InterfaceC41775x1 interfaceC41775x1 = f43891b;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            f43891b = C41696j.m91104d(C41713n0.m91126b(), null, null, new KcTradeNumAbInputViewExt$startAutoDismiss$1(j11, kcTradeNumAbInputView, null), 3, null);
        }
    }
}
