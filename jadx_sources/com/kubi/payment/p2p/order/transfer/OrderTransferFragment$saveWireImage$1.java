package com.kubi.payment.p2p.order.transfer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.ReservedFileds;
import com.kubi.payment.p2p.data.entities.TransferOrderInfo;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderTransferFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.transfer.OrderTransferFragment$saveWireImage$1", m90122f = "OrderTransferFragment.kt", m90123i = {0}, m90124l = {455}, m90125m = "invokeSuspend", m90126n = {"payType"}, m90127s = {"L$0"})
public final class OrderTransferFragment$saveWireImage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ OrderTransferFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTransferFragment$saveWireImage$1(OrderTransferFragment orderTransferFragment, Continuation<? super OrderTransferFragment$saveWireImage$1> continuation) {
        super(2, continuation);
        this.this$0 = orderTransferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderTransferFragment$saveWireImage$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderTransferFragment$saveWireImage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    /* JADX WARN: Code duplicated, block: B:44:0x0148  */
    /* JADX WARN: Code duplicated, block: B:45:0x014d  */
    /* JADX WARN: Code duplicated, block: B:48:0x016f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0174  */
    /* JADX WARN: Code duplicated, block: B:52:0x0196  */
    /* JADX WARN: Code duplicated, block: B:53:0x019b  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bd  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdPayType currentPayType;
        AdPayType adPayType;
        ReservedFileds reservedFileds;
        AdPayType currentPayType2;
        String userName;
        String phone;
        String payeesAddress;
        String bankName;
        String institutionNumber;
        String transitNumber;
        String payTypeNumber;
        String swiftNumber;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        String bankAddress = null;
        if (i11 != 0) {
            if (i11 == 1) {
                adPayType = (AdPayType) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            TransferOrderInfo f39904i0 = OrderTransferFragment.m48959b4(this.this$0).getF39904i0();
            if (f39904i0 != null) {
                currentPayType = f39904i0.getCurrentPayType();
            } else {
                currentPayType = null;
            }
            TransferOrderInfo f39904i1 = OrderTransferFragment.m48959b4(this.this$0).getF39904i0();
            if (f39904i1 != null && (currentPayType2 = f39904i1.getCurrentPayType()) != null) {
                this.L$0 = currentPayType;
                this.label = 1;
                Object payTypeFields = currentPayType2.getPayTypeFields(this);
                if (payTypeFields == coroutine_suspended) {
                    return coroutine_suspended;
                }
                adPayType = currentPayType;
                obj = payTypeFields;
            } else {
                adPayType = currentPayType;
                reservedFileds = null;
            }
            View viewInflate = LayoutInflater.from(((OldBaseFragment) this.this$0).mContext).inflate(R$layout.botc_layout_wire, (ViewGroup) null);
            BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
            int i12 = R$id.tv_label_2;
            String string = this.this$0.getString(R$string.receiver_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            BaseViewHolder text = baseViewHolder.setText(i12, C38346y.m86535v(string));
            int i13 = R$id.tv_2;
            if (adPayType != null) {
                userName = adPayType.getUserName();
            } else {
                userName = null;
            }
            BaseViewHolder text2 = text.setText(i13, C27041f.m66668h(userName));
            int i14 = R$id.tv_label_3;
            String string2 = this.this$0.getString(R$string.phone_number);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            BaseViewHolder text3 = text2.setText(i14, C38346y.m86535v(string2));
            int i15 = R$id.tv_3;
            if (reservedFileds != null) {
                phone = reservedFileds.getPhone();
            } else {
                phone = null;
            }
            BaseViewHolder text4 = text3.setText(i15, C27041f.m66668h(phone));
            int i16 = R$id.tv_label_4;
            String string3 = this.this$0.getString(R$string.payee_addr);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            BaseViewHolder text5 = text4.setText(i16, C38346y.m86535v(string3));
            int i17 = R$id.tv_4;
            if (reservedFileds != null) {
                payeesAddress = reservedFileds.getPayeesAddress();
            } else {
                payeesAddress = null;
            }
            BaseViewHolder text6 = text5.setText(i17, C27041f.m66668h(payeesAddress));
            int i18 = R$id.tv_label_5;
            String string4 = this.this$0.getString(R$string.bank_name);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            BaseViewHolder text7 = text6.setText(i18, C38346y.m86535v(string4));
            int i19 = R$id.tv_5;
            if (adPayType != null) {
                bankName = adPayType.getBankName();
            } else {
                bankName = null;
            }
            BaseViewHolder text8 = text7.setText(i19, C27041f.m66668h(bankName));
            int i21 = R$id.tv_label_6;
            String string5 = this.this$0.getString(R$string.institution_num);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            BaseViewHolder text9 = text8.setText(i21, C38346y.m86535v(string5));
            int i22 = R$id.tv_6;
            if (reservedFileds != null) {
                institutionNumber = reservedFileds.getInstitutionNumber();
            } else {
                institutionNumber = null;
            }
            BaseViewHolder text10 = text9.setText(i22, C27041f.m66668h(institutionNumber));
            int i23 = R$id.tv_label_7;
            String string6 = this.this$0.getString(R$string.transit_num);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            BaseViewHolder text11 = text10.setText(i23, C38346y.m86535v(string6));
            int i24 = R$id.tv_7;
            if (reservedFileds != null) {
                transitNumber = reservedFileds.getTransitNumber();
            } else {
                transitNumber = null;
            }
            BaseViewHolder text12 = text11.setText(i24, C27041f.m66668h(transitNumber));
            int i25 = R$id.tv_label_8;
            String string7 = this.this$0.getString(R$string.account_num);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            BaseViewHolder text13 = text12.setText(i25, C38346y.m86535v(string7));
            int i26 = R$id.tv_8;
            if (adPayType != null) {
                payTypeNumber = adPayType.getPayTypeNumber();
            } else {
                payTypeNumber = null;
            }
            BaseViewHolder text14 = text13.setText(i26, C27041f.m66668h(payTypeNumber));
            int i27 = R$id.tv_label_9;
            String string8 = this.this$0.getString(R$string.swift_code);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            BaseViewHolder text15 = text14.setText(i27, C38346y.m86535v(string8));
            int i28 = R$id.tv_9;
            if (reservedFileds != null) {
                swiftNumber = reservedFileds.getSwiftNumber();
            } else {
                swiftNumber = null;
            }
            BaseViewHolder text16 = text15.setText(i28, C27041f.m66668h(swiftNumber));
            int i29 = R$id.tv_label_10;
            String string9 = this.this$0.getString(R$string.bank_address);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            BaseViewHolder text17 = text16.setText(i29, C38346y.m86535v(string9));
            int i31 = R$id.tv_10;
            if (reservedFileds != null) {
                bankAddress = reservedFileds.getBankAddress();
            }
            View view = text17.setText(i31, C27041f.m66668h(bankAddress)).getView(R$id.tv_1);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C27046k.m66693h((TextView) view, R$mipmap.botc_ic_wire, C5275i0.m6236a(8.0f), GravityCompat.START);
            viewInflate.measure(View.MeasureSpec.makeMeasureSpec(C5267e0.m6183e(), 1073741824), View.MeasureSpec.makeMeasureSpec(C5267e0.m6182d(), 1073741824));
            viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
            OrderTransferFragment orderTransferFragment = this.this$0;
            Intrinsics.checkNotNull(viewInflate);
            orderTransferFragment.m48987A4(viewInflate);
            return Unit.INSTANCE;
        }
        reservedFileds = (ReservedFileds) obj;
        View viewInflate2 = LayoutInflater.from(((OldBaseFragment) this.this$0).mContext).inflate(R$layout.botc_layout_wire, (ViewGroup) null);
        BaseViewHolder baseViewHolder2 = new BaseViewHolder(viewInflate2);
        int i110 = R$id.tv_label_2;
        String string10 = this.this$0.getString(R$string.receiver_name);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        BaseViewHolder text18 = baseViewHolder2.setText(i110, C38346y.m86535v(string10));
        int i111 = R$id.tv_2;
        if (adPayType != null) {
            userName = adPayType.getUserName();
        } else {
            userName = null;
        }
        BaseViewHolder text19 = text18.setText(i111, C27041f.m66668h(userName));
        int i112 = R$id.tv_label_3;
        String string11 = this.this$0.getString(R$string.phone_number);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        BaseViewHolder text20 = text19.setText(i112, C38346y.m86535v(string11));
        int i113 = R$id.tv_3;
        if (reservedFileds != null) {
            phone = reservedFileds.getPhone();
        } else {
            phone = null;
        }
        BaseViewHolder text21 = text20.setText(i113, C27041f.m66668h(phone));
        int i114 = R$id.tv_label_4;
        String string12 = this.this$0.getString(R$string.payee_addr);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        BaseViewHolder text22 = text21.setText(i114, C38346y.m86535v(string12));
        int i115 = R$id.tv_4;
        if (reservedFileds != null) {
            payeesAddress = reservedFileds.getPayeesAddress();
        } else {
            payeesAddress = null;
        }
        BaseViewHolder text23 = text22.setText(i115, C27041f.m66668h(payeesAddress));
        int i116 = R$id.tv_label_5;
        String string13 = this.this$0.getString(R$string.bank_name);
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        BaseViewHolder text24 = text23.setText(i116, C38346y.m86535v(string13));
        int i117 = R$id.tv_5;
        if (adPayType != null) {
            bankName = adPayType.getBankName();
        } else {
            bankName = null;
        }
        BaseViewHolder text25 = text24.setText(i117, C27041f.m66668h(bankName));
        int i210 = R$id.tv_label_6;
        String string14 = this.this$0.getString(R$string.institution_num);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        BaseViewHolder text26 = text25.setText(i210, C38346y.m86535v(string14));
        int i211 = R$id.tv_6;
        if (reservedFileds != null) {
            institutionNumber = reservedFileds.getInstitutionNumber();
        } else {
            institutionNumber = null;
        }
        BaseViewHolder text110 = text26.setText(i211, C27041f.m66668h(institutionNumber));
        int i212 = R$id.tv_label_7;
        String string15 = this.this$0.getString(R$string.transit_num);
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        BaseViewHolder text111 = text110.setText(i212, C38346y.m86535v(string15));
        int i213 = R$id.tv_7;
        if (reservedFileds != null) {
            transitNumber = reservedFileds.getTransitNumber();
        } else {
            transitNumber = null;
        }
        BaseViewHolder text112 = text111.setText(i213, C27041f.m66668h(transitNumber));
        int i214 = R$id.tv_label_8;
        String string16 = this.this$0.getString(R$string.account_num);
        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
        BaseViewHolder text113 = text112.setText(i214, C38346y.m86535v(string16));
        int i215 = R$id.tv_8;
        if (adPayType != null) {
            payTypeNumber = adPayType.getPayTypeNumber();
        } else {
            payTypeNumber = null;
        }
        BaseViewHolder text114 = text113.setText(i215, C27041f.m66668h(payTypeNumber));
        int i216 = R$id.tv_label_9;
        String string17 = this.this$0.getString(R$string.swift_code);
        Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
        BaseViewHolder text115 = text114.setText(i216, C38346y.m86535v(string17));
        int i217 = R$id.tv_9;
        if (reservedFileds != null) {
            swiftNumber = reservedFileds.getSwiftNumber();
        } else {
            swiftNumber = null;
        }
        BaseViewHolder text116 = text115.setText(i217, C27041f.m66668h(swiftNumber));
        int i218 = R$id.tv_label_10;
        String string18 = this.this$0.getString(R$string.bank_address);
        Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
        BaseViewHolder text117 = text116.setText(i218, C38346y.m86535v(string18));
        int i32 = R$id.tv_10;
        if (reservedFileds != null) {
            bankAddress = reservedFileds.getBankAddress();
        }
        View view2 = text117.setText(i32, C27041f.m66668h(bankAddress)).getView(R$id.tv_1);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66693h((TextView) view2, R$mipmap.botc_ic_wire, C5275i0.m6236a(8.0f), GravityCompat.START);
        viewInflate2.measure(View.MeasureSpec.makeMeasureSpec(C5267e0.m6183e(), 1073741824), View.MeasureSpec.makeMeasureSpec(C5267e0.m6182d(), 1073741824));
        viewInflate2.layout(0, 0, viewInflate2.getMeasuredWidth(), viewInflate2.getMeasuredHeight());
        OrderTransferFragment orderTransferFragment2 = this.this$0;
        Intrinsics.checkNotNull(viewInflate2);
        orderTransferFragment2.m48987A4(viewInflate2);
        return Unit.INSTANCE;
    }
}
