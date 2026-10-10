package com.revolut.revolutpay.ui_kit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import xa0.InterfaceC46115a;
import za0.C46743b;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0005J-\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/revolut/revolutpay/ui_kit/widget/NavBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lxa0/a;", "clause", "Lkotlin/Function1;", "Lza0/b;", "onClick", "c", "(Lxa0/a;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View$OnClickListener;", "clickListener", "setOnBackClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/widget/ImageView;", "n", "Landroid/widget/ImageView;", "goBackButton", "Lcom/revolut/revolutpay/ui_kit/widget/RevPayTextView;", "o", "Lcom/revolut/revolutpay/ui_kit/widget/RevPayTextView;", "title", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class NavBar extends ConstraintLayout {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public ImageView goBackButton;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public RevPayTextView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m68536a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m68536a(context);
    }

    /* JADX INFO: renamed from: a */
    private final void m68536a(Context context) {
        View.inflate(context, R$layout.internal_revolut_pay_navbar, this);
        View viewFindViewById = findViewById(R$id.internalRevolutPay_navbarBackArrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.intern…volutPay_navbarBackArrow)");
        this.goBackButton = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.internalRevolutPay_navbarTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.internalRevolutPay_navbarTitle)");
        this.title = (RevPayTextView) viewFindViewById2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m68537b(NavBar navBar, InterfaceC46115a interfaceC46115a, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        navBar.m68538c(interfaceC46115a, function1);
    }

    /* JADX INFO: renamed from: c */
    public final void m68538c(@NotNull InterfaceC46115a clause, @Nullable Function1<? super C46743b, Unit> onClick) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        RevPayTextView revPayTextView = this.title;
        if (revPayTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
            revPayTextView = null;
        }
        revPayTextView.m68545b(clause, onClick);
    }

    public final void setOnBackClickListener(@NotNull View.OnClickListener clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        ImageView imageView = this.goBackButton;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goBackButton");
            imageView = null;
        }
        imageView.setOnClickListener(clickListener);
    }
}
