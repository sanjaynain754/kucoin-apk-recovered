package com.sumsub.sns.internal.features.presentation.utils;

import android.content.Context;
import android.view.View;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSFileItemView;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30125T;
import com.sumsub.sns.internal.features.domain.documents.C30121O;
import com.sumsub.sns.internal.features.domain.documents.C30122P;
import com.sumsub.sns.internal.features.domain.documents.C30123Q;
import com.sumsub.sns.internal.features.domain.documents.C30124S;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32664o {

    /* JADX INFO: renamed from: a */
    public final Function1 f66666a;

    /* JADX INFO: renamed from: b */
    public final Function1 f66667b;

    /* JADX INFO: renamed from: c */
    public final Function1 f66668c;

    /* JADX INFO: renamed from: a */
    public static final void m71286a(C32664o c32664o, int i11, View view) {
        c32664o.f66667b.invoke(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71285a(C32664o c32664o, C30152w c30152w) {
        c32664o.f66668c.invoke(c30152w);
        return Unit.INSTANCE;
    }

    public C32664o(Function1 function1, Function1 function2, Function1 function3) {
        this.f66666a = function1;
        this.f66667b = function2;
        this.f66668c = function3;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71284a(C32664o c32664o, SNSFileItemView sNSFileItemView) {
        c32664o.f66666a.invoke(Integer.valueOf(sNSFileItemView.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m71287a(final SNSFileItemView sNSFileItemView, final C30152w c30152w, boolean z11, boolean z12, C32663n c32663n) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (c30152w != null) {
            if (z12) {
                charSequence2 = c32663n.f66662d;
            } else {
                charSequence2 = c32663n.f66661c;
            }
            sNSFileItemView.setText(charSequence2);
            sNSFileItemView.setError(c30152w.f60594f);
            sNSFileItemView.setImageBitmap(c30152w.f60589a, c30152w.f60591c);
            AbstractC30125T abstractC30125T = c30152w.f60595g;
            if (abstractC30125T instanceof C30121O) {
                sNSFileItemView.setProgress(0, false);
                sNSFileItemView.setDescription(null);
                sNSFileItemView.setStrokeDashed(true);
            } else if (abstractC30125T instanceof C30122P) {
                sNSFileItemView.setDescription(c32663n.f66664f);
                sNSFileItemView.setProgress(0, false);
                sNSFileItemView.setStrokeDashed(false);
            } else if (abstractC30125T instanceof C30123Q) {
                sNSFileItemView.setProgress(0, false);
                sNSFileItemView.setDescription(null);
                sNSFileItemView.setStrokeDashed(false);
            } else if (abstractC30125T instanceof C30124S) {
                int i11 = ((C30124S) abstractC30125T).f60564a;
                sNSFileItemView.setDescription(c32663n.f66663e);
                sNSFileItemView.setStrokeDashed(false);
                sNSFileItemView.setProgress(i11, false);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (z11) {
                sNSFileItemView.setEndIconVisible(c30152w.f60589a != null);
                AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.utils.h0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C32664o.m71285a(this.f66648b, c30152w);
                    }
                }, sNSFileItemView);
            } else {
                sNSFileItemView.setEndIconVisible(false);
                sNSFileItemView.setOnClickListener(null);
            }
        } else {
            sNSFileItemView.setEndIconVisible(false);
            if (z12) {
                charSequence = c32663n.f66660b;
            } else {
                charSequence = c32663n.f66659a;
            }
            sNSFileItemView.setText(charSequence);
            SNSFileItemView.setImageBitmap$default(sNSFileItemView, null, 0, 2, null);
            sNSFileItemView.setProgress(0, false);
            sNSFileItemView.setError(null);
            sNSFileItemView.setStrokeDashed(true);
            if (z11) {
                AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.utils.i0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C32664o.m71284a(this.f66650b, sNSFileItemView);
                    }
                }, sNSFileItemView);
            } else {
                sNSFileItemView.setOnClickListener(null);
            }
        }
        sNSFileItemView.setOptionalText(z12 ? c32663n.f66665g : null);
    }

    /* JADX INFO: renamed from: a */
    public final void m71288a(SNSFileItemView... sNSFileItemViewArr) {
        int length = sNSFileItemViewArr.length;
        int i11 = 0;
        final int i12 = 0;
        while (i11 < length) {
            SNSFileItemView sNSFileItemView = sNSFileItemViewArr[i11];
            int i13 = i12 + 1;
            if (sNSFileItemView != null) {
                Context context = sNSFileItemView.getContext();
                String imageName = SNSIconHandler.SNSCommonIcons.ATTACHMENT.getImageName();
                C28468k0 c28468k0 = C28468k0.f57983a;
                sNSFileItemView.setStartIcon(c28468k0.getIconHandler().onResolveIcon(context, imageName));
                sNSFileItemView.setEndIcon(c28468k0.getIconHandler().onResolveIcon(sNSFileItemView.getContext(), SNSIconHandler.SNSCommonIcons.BIN.getImageName()));
                sNSFileItemView.setEndIconClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.utils.g0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C32664o.m71286a(this.f66646b, i12, view);
                    }
                });
            }
            i11++;
            i12 = i13;
        }
    }
}
