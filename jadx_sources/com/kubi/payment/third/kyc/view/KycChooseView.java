package com.kubi.payment.third.kyc.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.third.data.entities.ThirdKycItem;
import com.kubi.payment.third.kyc.view.KycChooseView;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KycChooseView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/third/kyc/view/KycChooseView;", "Lcom/kubi/payment/third/kyc/view/AKycBaseView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "selectIndex", "", "setItemView", "", "item", "Lcom/kubi/payment/third/data/entities/ThirdKycItem;", "manager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycChooseView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycChooseView.kt\ncom/kubi/payment/third/kyc/view/KycChooseView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1573#2:48\n1604#2,4:49\n*S KotlinDebug\n*F\n+ 1 KycChooseView.kt\ncom/kubi/payment/third/kyc/view/KycChooseView\n*L\n31#1:48\n31#1:49,4\n*E\n"})
public class KycChooseView extends AKycBaseView {

    /* JADX INFO: renamed from: d */
    public int f40240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycChooseView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40240d = -1;
        getInflater().inflate(R$layout.botc_view_kyc_choose, this);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m49583f(final ThirdKycItem thirdKycItem, final KycChooseView kycChooseView, FragmentManager fragmentManager, final TextView textView) {
        List<String> optionalSelections = thirdKycItem.getOptionalSelections();
        if (optionalSelections != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionalSelections, 10));
            int i11 = 0;
            for (Object obj : optionalSelections) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new SelectEntity(null, (String) obj, null, null, null, null, null, null, null, false, i11 == kycChooseView.f40240d, null, 3069, null));
                i11 = i12;
            }
            BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: lu.e
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj2, Object obj3) throws Exception {
                    KycChooseView.m49584g(this.f93816b, textView, thirdKycItem, (BaseViewHolder) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
                }
            }, false, null, null, false, 60, null).show(fragmentManager, "KycChooseView");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public void mo49580e(@NotNull final ThirdKycItem item, @NotNull final FragmentManager manager) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(manager, "manager");
        TextView textView = (TextView) findViewById(R$id.tv_choose_name_tip);
        if (textView != null) {
            textView.setText(item.getName());
        }
        final TextView textView2 = (TextView) findViewById(R$id.tv_choose_content);
        if (textView2 != null) {
            textView2.setHint(item.getDescription());
        }
        View viewFindViewById = findViewById(R$id.view_choose);
        if (viewFindViewById != null) {
            C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: lu.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycChooseView.m49583f(item, this, manager, textView2);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m49584g(KycChooseView kycChooseView, TextView textView, ThirdKycItem thirdKycItem, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws Exception {
        CharSequence label = interfaceC24339a.getLabel();
        if (textView != null) {
            textView.setText(label);
        }
        BiConsumer<String, String> biConsumer = kycChooseView.getBiConsumer();
        if (biConsumer != null) {
            biConsumer.accept(thirdKycItem.getFieldName(), label.toString());
        }
        kycChooseView.f40240d = baseViewHolder.getAdapterPosition();
    }
}
