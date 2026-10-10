package com.kubi.payment.common.helper;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import au.InterfaceC4389a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.common.data.entities.DayLimit;
import com.kubi.payment.common.data.entities.DayLimitRequest;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.C37242d;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p606rt.InterfaceC44174a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: DayLimitHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0016J \u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u001cJ0\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006!"}, m90084d2 = {"Lcom/kubi/payment/common/helper/DayLimitHelper;", "", "<init>", "()V", "flowApi", "Lcom/kubi/payment/common/data/source/remote/CommonWebService;", "kotlin.jvm.PlatformType", "getFlowApi", "()Lcom/kubi/payment/common/data/source/remote/CommonWebService;", "flowApi$delegate", "Lkotlin/Lazy;", "verifyDayLimit", "", "inputAmount", "", FirebaseAnalytics.Param.CURRENCY, "tradeType", "scope", "Lkotlinx/coroutines/CoroutineScope;", "manage", "Landroidx/fragment/app/FragmentManager;", "verifySuccess", "Lkotlin/Function0;", "verifyLimit", "Lkotlin/Function1;", "hideLoading", "getDayLimit", "Lcom/kubi/payment/common/data/entities/DayLimit;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showDayLimitDialog", TUIConstants.TUIContact.LIMIT, "fqaUrl", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDayLimitHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayLimitHelper.kt\ncom/kubi/payment/common/helper/DayLimitHelper\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,162:1\n17#2,2:163\n*S KotlinDebug\n*F\n+ 1 DayLimitHelper.kt\ncom/kubi/payment/common/helper/DayLimitHelper\n*L\n158#1:163,2\n*E\n"})
public final class DayLimitHelper {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f38520b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f38521a = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.common.helper.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DayLimitHelper.m46247f();
        }
    });

    /* JADX INFO: compiled from: DayLimitHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/common/helper/DayLimitHelper$Companion;", "", "<init>", "()V", "BALANCE_BUY", "", "BALANCE_SELL", "FAST_BUY", FastQuoteModel.PAY_RECHARGE, "WITHDRAW", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m46248k(DayLimit dayLimit, final DayLimitHelper dayLimitHelper, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.payment_daily_limit_content_view_des, new Object[0]);
        TextView textView = (TextView) helper.getView(R$id.tv_day_limit_content);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString spannableString = new SpannableString(c27017c.m66516f(R$string.payment_daily_limit_content, strM66516f));
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, strM66516f, 0, false, 6, (Object) null);
        int length = strM66516f.length() + iIndexOf$default;
        int i11 = R$color.c_text;
        spannableString.setSpan(new C27018c0(i11, new View.OnClickListener() { // from class: com.kubi.payment.common.helper.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DayLimitHelper.m46249l(this.f38527b, view);
            }
        }), iIndexOf$default, length, 18);
        spannableString.setSpan(new UnderlineSpan(), iIndexOf$default, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(c27017c.m66512a(i11)), iIndexOf$default, length, 33);
        textView.setText(spannableString);
        int i12 = R$id.tv_day_limit_usd_fiat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C27041f.m66668h(dayLimit != null ? dayLimit.getDayLimitUsd() : null));
        sb2.append(" USD");
        helper.setText(i12, sb2.toString());
        int i13 = R$id.tv_day_limit_current_fiat;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("≈ ");
        sb3.append(C27041f.m66668h(dayLimit != null ? dayLimit.getDayLimitCurrency() : null));
        sb3.append(' ');
        sb3.append(dayLimit != null ? dayLimit.getCurrency() : null);
        helper.setText(i13, sb3.toString());
        int i14 = R$id.tv_remain_usd_fiat;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C27041f.m66668h(dayLimit != null ? dayLimit.getLeftAmountUsd() : null));
        sb4.append(" USD");
        helper.setText(i14, sb4.toString());
        int i15 = R$id.tv_remain_current_fiat;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("≈ ");
        sb5.append(C27041f.m66668h(dayLimit != null ? dayLimit.getLeftAmountCurrency() : null));
        sb5.append(' ');
        sb5.append(dayLimit != null ? dayLimit.getCurrency() : null);
        helper.setText(i15, sb5.toString());
    }

    /* JADX INFO: renamed from: l */
    public static final void m46249l(DayLimitHelper dayLimitHelper, View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, dayLimitHelper.m46251g(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: m */
    public static final void m46250m(Function1 function1, DayLimit dayLimit, DialogInterface dialogInterface, int i11) {
        if (function1 != null) {
            function1.invoke(C27041f.m66668h(dayLimit != null ? dayLimit.getLeftAmountCurrency() : null));
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m46251g() {
        String strM4001b;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC4389a.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h == null || (strM4001b = ((InterfaceC4389a) objM56186h).m4001b()) == null) ? C37242d.f82569a.m83349b() : strM4001b;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC44174a m46253i() {
        return (InterfaceC44174a) this.f38521a.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m46254j(final DayLimit dayLimit, FragmentManager fragmentManager, final Function1<? super String, Unit> function1) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_daily_limit_title).m54148E4(R$layout.botc_view_day_limit_amount, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.common.helper.b
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                DayLimitHelper.m46248k(dayLimit, this, baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.payment_daily_limit_use_remain, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.common.helper.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DayLimitHelper.m46250m(function1, dayLimit, dialogInterface, i11);
            }
        }).m54159P4(R$string.i_know, null).show(fragmentManager, "dayLimitDialog");
    }

    /* JADX INFO: renamed from: n */
    public final void m46255n(@NotNull String inputAmount, @NotNull String currency, @NotNull String tradeType, @NotNull InterfaceC41709m0 scope, @NotNull FragmentManager manage, @Nullable Function0<Unit> function0, @Nullable Function1<? super String, Unit> function1, @Nullable Function0<Unit> function2) {
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(manage, "manage");
        C41696j.m91104d(scope, null, null, new DayLimitHelper$verifyDayLimit$1(this, currency, tradeType, function2, inputAmount, function0, manage, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC44174a m46247f() {
        return (InterfaceC44174a) C42597a.m93387c().create(InterfaceC44174a.class);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m46252h(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super DayLimit> continuation) {
        return RetrofitFlowExKt.m42830k(m46253i().m97392b(new DayLimitRequest(str, str2)), continuation);
    }
}
