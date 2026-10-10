package com.kubi.transfer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.view.TransferNoticeView;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TransferNoticeView.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0014\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/transfer/view/TransferNoticeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tvTip", "Lcom/kubi/resources/widget/BaseTextView;", "ivClose", "Landroid/widget/ImageView;", "setupClickListeners", "", "setTipText", "text", "", TIMPushProvider.f75062n, TIMPushProvider.f75063o, "setOnCloseClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TransferNoticeView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BaseTextView f52974b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ImageView f52975c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferNoticeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public static final void m64830f(TransferNoticeView transferNoticeView, View view) {
        transferNoticeView.setVisibility(8);
    }

    /* JADX INFO: renamed from: c */
    public final void m64831c() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: e */
    public final void m64832e() {
        this.f52975c.setOnClickListener(new View.OnClickListener() { // from class: h60.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferNoticeView.m64830f(this.f85803b, view);
            }
        });
    }

    public final void setOnCloseClickListener(@NotNull final Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52975c.setOnClickListener(new View.OnClickListener() { // from class: h60.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferNoticeView.m64829d(listener, this, view);
            }
        });
    }

    public final void setTipText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f52974b.setText(text);
    }

    public /* synthetic */ TransferNoticeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final void m64829d(Function0 function0, TransferNoticeView transferNoticeView, View view) {
        function0.invoke();
        transferNoticeView.m64831c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.btransfer_notice_layout, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.tvTip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f52974b = (BaseTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.ivClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f52975c = (ImageView) viewFindViewById2;
        m64832e();
    }
}
