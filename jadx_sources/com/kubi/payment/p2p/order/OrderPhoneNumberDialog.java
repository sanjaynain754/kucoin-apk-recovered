package com.kubi.payment.p2p.order;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OrderPhoneNumberDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0001H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0012\u0010\b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderPhoneNumberDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "nickName", "", "getNickName", "()Ljava/lang/String;", "nickName$delegate", "Lkotlin/Lazy;", "areaCode", "getAreaCode", "areaCode$delegate", HintConstants.AUTOFILL_HINT_PHONE, "getPhone", "phone$delegate", "secretPhone", "getSecretPhone", "secretPhone$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderPhoneNumberDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderPhoneNumberDialog.kt\ncom/kubi/payment/p2p/order/OrderPhoneNumberDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,85:1\n1#2:86\n44#3,2:87\n*S KotlinDebug\n*F\n+ 1 OrderPhoneNumberDialog.kt\ncom/kubi/payment/p2p/order/OrderPhoneNumberDialog\n*L\n50#1:87,2\n*E\n"})
public final class OrderPhoneNumberDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f39758u0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f39759q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.order.c1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderPhoneNumberDialog.m48807u4(this.f39793b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f39760r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.order.d1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderPhoneNumberDialog.m48806p4(this.f39797b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f39761s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.order.e1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderPhoneNumberDialog.m48808v4(this.f39801b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f39762t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.order.f1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderPhoneNumberDialog.m48809w4(this.f39836b);
        }
    });

    /* JADX INFO: compiled from: OrderPhoneNumberDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/OrderPhoneNumberDialog$Companion;", "", "<init>", "()V", "TAG", "", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "nickName", "areaCode", HintConstants.AUTOFILL_HINT_PHONE, "secretPhone", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void show$default(Companion companion, FragmentManager fragmentManager, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            if ((i11 & 16) != 0) {
                str4 = null;
            }
            companion.show(fragmentManager, str, str2, str3, str4);
        }

        public final void show(@NotNull FragmentManager fragmentManager, @Nullable String nickName, @Nullable String areaCode, @Nullable String phone, @Nullable String secretPhone) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            OrderPhoneNumberDialog orderPhoneNumberDialog = new OrderPhoneNumberDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.payment_view_order_phone_number);
            bundle.putString("nickName", nickName);
            bundle.putString("areaCode", areaCode);
            bundle.putString(HintConstants.AUTOFILL_HINT_PHONE, phone);
            bundle.putString("secretPhone", secretPhone);
            orderPhoneNumberDialog.setArguments(bundle);
            orderPhoneNumberDialog.show(fragmentManager, "OrderPhoneNumberDialog");
        }
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m48811y4(BaseTextView baseTextView, OrderPhoneNumberDialog orderPhoneNumberDialog) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClipboardManager clipboardManager = (ClipboardManager) baseTextView.getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return Unit.INSTANCE;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, orderPhoneNumberDialog.m48812q4() + ' ' + orderPhoneNumberDialog.m48814s4()));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new OtcException(thM103847exceptionOrNullimpl, "OrderPhoneNumberDialog", false, null, 8, null), null, 2, null);
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                ToastCompat.m66437C(R$string.copy_success);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        final BaseTextView baseTextView = (BaseTextView) viewHolder.getView(R$id.phone_number_value);
        if (baseTextView != null) {
            baseTextView.setText(m48815t4());
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.g1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderPhoneNumberDialog.m48811y4(baseTextView, this);
                }
            }, 1, null);
        }
        BaseTextView baseTextView2 = (BaseTextView) viewHolder.getView(R$id.nick_name_value);
        if (baseTextView2 != null) {
            String strM48813r4 = m48813r4();
            if (strM48813r4.length() == 0) {
                strM48813r4 = C33820nf.f71144W;
            }
            baseTextView2.setText(strM48813r4);
        }
        View view = viewHolder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.h1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderPhoneNumberDialog.m48810x4(this.f39847b);
            }
        }, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: q4 */
    public final String m48812q4() {
        return (String) this.f39760r0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: r4 */
    public final String m48813r4() {
        return (String) this.f39759q0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: s4 */
    public final String m48814s4() {
        return (String) this.f39761s0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: t4 */
    public final String m48815t4() {
        return (String) this.f39762t0.getValue();
    }

    /* JADX INFO: renamed from: p4 */
    public static final String m48806p4(OrderPhoneNumberDialog orderPhoneNumberDialog) {
        String strM56284y;
        Bundle arguments = orderPhoneNumberDialog.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "areaCode");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: u4 */
    public static final String m48807u4(OrderPhoneNumberDialog orderPhoneNumberDialog) {
        String strM56284y;
        Bundle arguments = orderPhoneNumberDialog.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "nickName");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: v4 */
    public static final String m48808v4(OrderPhoneNumberDialog orderPhoneNumberDialog) {
        String strM56284y;
        Bundle arguments = orderPhoneNumberDialog.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, HintConstants.AUTOFILL_HINT_PHONE);
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: w4 */
    public static final String m48809w4(OrderPhoneNumberDialog orderPhoneNumberDialog) {
        String strM56284y;
        Bundle arguments = orderPhoneNumberDialog.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "secretPhone");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m48810x4(OrderPhoneNumberDialog orderPhoneNumberDialog) {
        orderPhoneNumberDialog.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m54236e4(this);
    }
}
