package com.kubi.otc.otc;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.otc.MessageRouterDispatcher;
import com.kubi.otc.service.OtcDepend;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.C23700d3;
import com.kubi.sdk.ResultDelegate;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37758j;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageRouterDispatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/otc/MessageRouterDispatcher;", "Landroidx/fragment/app/Fragment;", "Lcom/kubi/sdk/ResultDelegate$DispatcherPage;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "preformBackPressed", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MessageRouterDispatcher extends Fragment implements ResultDelegate.a {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f37655U = 0;

    /* JADX INFO: renamed from: g3 */
    public static final void m44668g3(BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        int i11 = R$id.tv_error_one;
        helper.setGone(i11, !C27025c.m66566d(Boolean.valueOf(OtcDepend.f38138a.m45461j().isWithDrawPassword()))).setText(i11, R$string.open_trade_pwd);
    }

    /* JADX INFO: renamed from: h3 */
    public static final void m44669h3(Context context, DialogInterface dialogInterface, int i11) {
        Intrinsics.checkNotNullParameter(dialogInterface, "<unused var>");
        OtcDepend otcDepend = OtcDepend.f38138a;
        if (C27025c.m66566d(Boolean.valueOf(otcDepend.m45461j().isWithDrawPassword()))) {
            return;
        }
        ISafeService iSafeServiceM45470t = otcDepend.m45470t();
        String string = context.getString(R$string.withdraw_pwd);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        iSafeServiceM45470t.m56313g(context, string, ValidationBizEnum.SET_WITHDRAWAL_PASSWORD);
    }

    /* JADX INFO: renamed from: i3 */
    public static final void m44670i3(MessageRouterDispatcher messageRouterDispatcher, DialogInterface dialogInterface) {
        C23700d3.m56610a(messageRouterDispatcher);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strM56284y;
        String strM56284y2;
        long j11;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "id");
        } else {
            strM56284y = null;
        }
        String strM66668h = C27041f.m66668h(strM56284y);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            strM56284y2 = RouteExKt.m56284y(arguments2, "side");
        } else {
            strM56284y2 = null;
        }
        String strM66668h2 = C27041f.m66668h(strM56284y2);
        final Context context = getContext();
        if (context != null) {
            if (Intrinsics.areEqual(strM66668h2, "SELL") && !C27025c.m66566d(Boolean.valueOf(OtcDepend.f38138a.m45461j().isWithDrawPassword()))) {
                BaseDialogFragment baseDialogFragmentM54192r3 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.rule_limit).m54153J4(R$string.otc_deal_tips).m54148E4(R$layout.botc_view_otc_received_way_error, new DialogFragmentHelper.InterfaceC22882b() { // from class: ht.a
                    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                    /* JADX INFO: renamed from: b3 */
                    public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                        MessageRouterDispatcher.m44668g3(baseViewHolder, dialogFragmentHelper);
                    }
                }).m54159P4(R$string.cancel, null).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: ht.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        MessageRouterDispatcher.m44669h3(context, dialogInterface, i11);
                    }
                }).m54192r3(new DialogInterface.OnDismissListener() { // from class: ht.c
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        MessageRouterDispatcher.m44670i3(this.f86041b, dialogInterface);
                    }
                });
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                baseDialogFragmentM54192r3.show(childFragmentManager, "otcDialog");
                return;
            }
            C37304a c37304a = C37304a.f82764a;
            String strM66668h3 = C27041f.m66668h(strM66668h);
            if (Intrinsics.areEqual(strM66668h2, "BUY")) {
                j11 = 1;
            } else {
                j11 = 0;
            }
            InterfaceC37758j.a.m85164m(c37304a, j11, strM66668h3, null, null, null, null, 60, null);
            C23700d3.m56610a(this);
        }
    }

    @Override // com.kubi.sdk.ResultDelegate.a
    public void preformBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
