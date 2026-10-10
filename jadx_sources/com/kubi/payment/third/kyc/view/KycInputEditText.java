package com.kubi.payment.third.kyc.view;

import android.content.Context;
import android.widget.TextView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.third.data.entities.ThirdKycItem;
import com.kubi.payment.third.kyc.view.KycInputEditText;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import org.jetbrains.annotations.NotNull;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycInputEditText.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/third/kyc/view/KycInputEditText;", "Lcom/kubi/payment/third/kyc/view/AKycBaseView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setItemView", "", "item", "Lcom/kubi/payment/third/data/entities/ThirdKycItem;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycInputEditText extends AKycBaseView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycInputEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        getInflater().inflate(R$layout.botc_view_kyc_input, this);
    }

    public final void setItemView(@NotNull final ThirdKycItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) findViewById(R$id.tv_input_name_tip);
        if (textView != null) {
            textView.setText(item.getName());
        }
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_input_content);
        if (filterEmojiEditText != null) {
            filterEmojiEditText.setHint(item.getDescription());
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(filterEmojiEditText);
            final Function1 function1 = new Function1() { // from class: lu.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycInputEditText.m49591e(this.f93820b, item, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: lu.h
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KycInputEditText.m49592f(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, C27046k.m66696k(filterEmojiEditText));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m49591e(KycInputEditText kycInputEditText, ThirdKycItem thirdKycItem, CharSequence charSequence) throws Exception {
        BiConsumer<String, String> biConsumer = kycInputEditText.getBiConsumer();
        if (biConsumer != null) {
            biConsumer.accept(thirdKycItem.getFieldName(), charSequence.toString());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m49592f(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
