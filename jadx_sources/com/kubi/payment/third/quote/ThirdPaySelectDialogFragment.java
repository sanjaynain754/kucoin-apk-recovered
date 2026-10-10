package com.kubi.payment.third.quote;

import android.os.Bundle;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.third.data.entities.PayMethodSelect;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ThirdPaySelectDialogFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000e\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdPaySelectDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "paySelectId", "", "payDatas", "", "Lcom/kubi/payment/third/data/entities/PayMethodSelect;", "selectListener", "Lkotlin/Function1;", "", "payAdapter", "com/kubi/payment/third/quote/ThirdPaySelectDialogFragment$payAdapter$2$1", "getPayAdapter", "()Lcom/kubi/payment/third/quote/ThirdPaySelectDialogFragment$payAdapter$2$1;", "payAdapter$delegate", "Lkotlin/Lazy;", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "helper", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThirdPaySelectDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPaySelectDialogFragment.kt\ncom/kubi/payment/third/quote/ThirdPaySelectDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class ThirdPaySelectDialogFragment extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f40262u0 = new Companion(null);

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public List<PayMethodSelect> f40264r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public Function1<? super PayMethodSelect, Unit> f40265s0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public String f40263q0 = "";

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f40266t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.third.quote.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThirdPaySelectDialogFragment.m49644r4(this.f40312b);
        }
    });

    /* JADX INFO: compiled from: ThirdPaySelectDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdPaySelectDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/payment/third/quote/ThirdPaySelectDialogFragment;", "paySelectId", "", "payDatas", "", "Lcom/kubi/payment/third/data/entities/PayMethodSelect;", "selectListener", "Lkotlin/Function1;", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ThirdPaySelectDialogFragment newInstance(@NotNull String paySelectId, @NotNull List<PayMethodSelect> payDatas, @NotNull Function1<? super PayMethodSelect, Unit> selectListener) {
            Intrinsics.checkNotNullParameter(paySelectId, "paySelectId");
            Intrinsics.checkNotNullParameter(payDatas, "payDatas");
            Intrinsics.checkNotNullParameter(selectListener, "selectListener");
            ThirdPaySelectDialogFragment thirdPaySelectDialogFragment = new ThirdPaySelectDialogFragment();
            thirdPaySelectDialogFragment.f40263q0 = paySelectId;
            thirdPaySelectDialogFragment.f40264r0 = payDatas;
            thirdPaySelectDialogFragment.f40265s0 = selectListener;
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.view_bottom_sheet_dialog);
            thirdPaySelectDialogFragment.setArguments(bundle);
            return thirdPaySelectDialogFragment;
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final ThirdPaySelectDialogFragment$payAdapter$2$1 m49644r4(ThirdPaySelectDialogFragment thirdPaySelectDialogFragment) {
        return new ThirdPaySelectDialogFragment$payAdapter$2$1(thirdPaySelectDialogFragment, R$layout.botc_dialog_item_label);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        ((RecyclerView) viewHolder.getView(R$id.recycler_view)).setAdapter(m49646q4());
        List<PayMethodSelect> list = this.f40264r0;
        if (list != null) {
            m49646q4().replaceData(list);
        }
        View view = viewHolder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.third.quote.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdPaySelectDialogFragment.m49645s4(this.f40310b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: q4 */
    public final ThirdPaySelectDialogFragment$payAdapter$2$1 m49646q4() {
        return (ThirdPaySelectDialogFragment$payAdapter$2$1) this.f40266t0.getValue();
    }

    public ThirdPaySelectDialogFragment() {
        m54236e4(this);
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m49645s4(ThirdPaySelectDialogFragment thirdPaySelectDialogFragment) {
        thirdPaySelectDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
