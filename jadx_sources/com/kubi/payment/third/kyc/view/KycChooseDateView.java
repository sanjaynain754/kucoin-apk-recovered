package com.kubi.payment.third.kyc.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$id;
import com.kubi.otc.view.TimeSheetView;
import com.kubi.payment.third.data.entities.ThirdKycItem;
import com.kubi.payment.third.kyc.view.KycChooseDateView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27030d;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycChooseDateView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/third/kyc/view/KycChooseDateView;", "Lcom/kubi/payment/third/kyc/view/KycChooseView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setItemView", "", "item", "Lcom/kubi/payment/third/data/entities/ThirdKycItem;", "manager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycChooseDateView extends KycChooseView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycChooseDateView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m49578j(FragmentManager fragmentManager, final KycChooseDateView kycChooseDateView, final ThirdKycItem thirdKycItem) {
        TimeSheetView timeSheetViewNewInstance = TimeSheetView.f38183t0.newInstance();
        timeSheetViewNewInstance.m45597w4(new Consumer() { // from class: lu.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                KycChooseDateView.m49579k(this.f93810b, thirdKycItem, (Long) obj);
            }
        });
        timeSheetViewNewInstance.show(fragmentManager, "KyChooseDateView");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m49579k(KycChooseDateView kycChooseDateView, ThirdKycItem thirdKycItem, Long l11) throws Exception {
        TextView textView = (TextView) kycChooseDateView.findViewById(R$id.tv_choose_content);
        if (textView != null) {
            Intrinsics.checkNotNull(l11);
            textView.setText(C27041f.m66668h(C27030d.m66607a(l11.longValue(), "MM/dd/yyyy")));
        }
        BiConsumer<String, String> biConsumer = kycChooseDateView.getBiConsumer();
        if (biConsumer != null) {
            String fieldName = thirdKycItem.getFieldName();
            Intrinsics.checkNotNull(l11);
            biConsumer.accept(fieldName, C27041f.m66668h(C27030d.m66607a(l11.longValue(), "yyyy-MM-dd")));
        }
    }

    @Override // com.kubi.payment.third.kyc.view.KycChooseView
    /* JADX INFO: renamed from: e */
    public void mo49580e(@NotNull final ThirdKycItem item, @NotNull final FragmentManager manager) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(manager, "manager");
        super.mo49580e(item, manager);
        View viewFindViewById = findViewById(R$id.view_choose);
        if (viewFindViewById != null) {
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: lu.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycChooseDateView.m49578j(manager, this, item);
                }
            }, 1, null);
        }
    }
}
