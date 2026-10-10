package com.kubi.futures.settings;

import android.content.Context;
import android.content.DialogInterface;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p801yl.C46527h0;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.settings.j3 */
/* JADX INFO: compiled from: SettingRiskLimitFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"RISK_LIMIT_CODE", "", "SOURCE_TRADING_PREFERENCES", "createSettingRiskLimit", "", "context", "Landroid/content/Context;", "marginMode", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C13396j3 {

    /* JADX INFO: renamed from: com.kubi.futures.settings.j3$a */
    /* JADX INFO: compiled from: SettingRiskLimitFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23366b;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23366b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f23366b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23366b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m26331c(@NotNull final Context context, @NotNull final String marginMode, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        C43852m.m96594f(C17060n0.m36552b(), "TradeRiskLimit", "1", TuplesKt.m90091to("symbol", C46527h0.f104291a.m102677L()));
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kumex_risk_quote_lower_tips_title).m54153J4(R$string.kumex_risk_quote_lower_tips_content).m54159P4(R$string.close, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.settings.h3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C13396j3.m26332d(dialogInterface, i11);
            }
        }).m54162S4(R$string.kumex_adjust_risk_limit, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.settings.i3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C13396j3.m26333e(context, marginMode, dialogInterface, i11);
            }
        }).show(fragmentManager, "IsolatedTradeRiskLimit");
    }

    /* JADX INFO: renamed from: d */
    public static final void m26332d(DialogInterface dialogInterface, int i11) {
        C43852m.m96591c(C17060n0.m36552b(), "TradeRiskLimit", "2", null, 8, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m26333e(Context context, String str, DialogInterface dialogInterface, int i11) {
        C43852m.m96591c(C17060n0.m36552b(), "TradeRiskLimit", "1", null, 8, null);
        BaseActivity.INSTANCE.launch(context, SettingRiskLimitFragment.class, BundleKt.bundleOf(new Pair("data", str)));
    }
}
