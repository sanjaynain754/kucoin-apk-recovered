package com.kubi.assets.detail;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetResponse;
import com.kubi.assets.lite.CoinDetailFragment;
import com.kubi.assets.main.detail.MainAccountDetailFragment;
import com.kubi.assets.margin.cross.detail.CrossMarginAccountDetailFragment;
import com.kubi.assets.margin.isolated.detail.IsolatedMarginAccountDetailFragment;
import com.kubi.assets.options.detail.AssetOptionsDetailFragment;
import com.kubi.assets.spot.detail.SpotAccountDetailFragment;
import com.kubi.assets.unify.detail.UnifiedAccountDetailFragment;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.C23700d3;
import com.kubi.sdk.ResultDelegate;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37749a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoinDetailDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/detail/CoinDetailDispatcher;", "Landroidx/fragment/app/Fragment;", "Lcom/kubi/sdk/ResultDelegate$DispatcherPage;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getTitle", "", "type", "", "preformBackPressed", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoinDetailDispatcher extends Fragment implements ResultDelegate.a {

    /* JADX INFO: renamed from: U */
    @NotNull
    public static final Companion f16880U = new Companion(null);

    /* JADX INFO: compiled from: CoinDetailDispatcher.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/detail/CoinDetailDispatcher$Companion;", "", "<init>", "()V", "TYPE_SAVE", "", "TYPE_TRADE", "TYPE_LEVER", "TYPE_SINGLE_LEVER", "TYPE_OPTION", "TYPE_UNIFIED", "start", "", "accountType", "code", "", "spmId", "fragment", "Lcom/kubi/sdk/BaseFragment;", "assetResponse", "Lcom/kubi/assets/entity/AssetResponse;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(int accountType, @Nullable String code, @Nullable String spmId) {
            InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(code), Long.valueOf(accountType), spmId, null, null, 24, null);
        }

        public Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                str2 = null;
            }
            companion.start(i11, str, str2);
        }

        public final void start(@NotNull BaseFragment fragment, int accountType, @Nullable String code, @Nullable AssetResponse assetResponse) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Context context = fragment.getContext();
            if (context != null) {
                BaseActivity.Companion companion = BaseActivity.INSTANCE;
                Bundle bundle = new Bundle();
                bundle.putString("coin", code);
                bundle.putInt("type", accountType);
                bundle.putParcelable("assetResponse", assetResponse);
                Unit unit = Unit.INSTANCE;
                companion.launch(context, CoinDetailDispatcher.class, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final String m15946d3(int i11) {
        String string;
        if (i11 == 1) {
            string = getString(R$string.main_account_detail);
        } else if (i11 == 2) {
            string = getString(R$string.trade_account_detail);
        } else if (i11 == 3 || i11 == 5) {
            string = getString(R$string.lever_account_detail);
        } else if (i11 != 6) {
            string = i11 != 7 ? "" : getString(R$string.unified_account_detail_title);
        } else {
            string = getString(R$string.kc_options_account_detail);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Integer numValueOf;
        String strM56284y;
        String strM56284y2;
        AssetResponse assetResponse;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Integer numValueOf2 = null;
        if (arguments != null) {
            numValueOf = Integer.valueOf(RouteExKt.m56260m(arguments, "type"));
        } else {
            numValueOf = null;
        }
        int iM66651k = C27039d.m66651k(numValueOf, 1);
        if (iM66651k == 0) {
            iM66651k = 1;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            strM56284y = RouteExKt.m56284y(arguments2, "code");
        } else {
            strM56284y = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            strM56284y2 = RouteExKt.m56284y(arguments3, "coin");
        } else {
            strM56284y2 = null;
        }
        String strM66669i = C27041f.m66669i(strM56284y, C27041f.m66668h(strM56284y2));
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            assetResponse = (AssetResponse) RouteExKt.m56274t(arguments4, "assetResponse");
        } else {
            assetResponse = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            numValueOf2 = Integer.valueOf(RouteExKt.m56260m(arguments5, "collateralStatus"));
        }
        int iM66650j = C27039d.m66650j(numValueOf2);
        String strM15946d3 = m15946d3(iM66651k);
        Bundle bundle = new Bundle();
        bundle.putString("code", strM66669i);
        bundle.putInt("type", iM66651k);
        bundle.putInt("collateralStatus", iM66650j);
        if (iM66651k != 1) {
            if (iM66651k != 2) {
                if (iM66651k != 3) {
                    if (iM66651k != 5) {
                        if (iM66651k != 6) {
                            if (iM66651k == 7) {
                                BaseFragmentActivity.m56574n0(requireContext(), strM15946d3, UnifiedAccountDetailFragment.class.getName(), bundle);
                            }
                        } else {
                            Context contextRequireContext = requireContext();
                            String name = AssetOptionsDetailFragment.class.getName();
                            bundle.putParcelable("assetResponse", assetResponse);
                            Unit unit = Unit.INSTANCE;
                            BaseFragmentActivity.m56574n0(contextRequireContext, strM15946d3, name, bundle);
                        }
                    } else {
                        BaseFragmentActivity.m56574n0(requireContext(), strM15946d3, IsolatedMarginAccountDetailFragment.class.getName(), bundle);
                    }
                } else {
                    BaseFragmentActivity.m56574n0(requireContext(), strM15946d3, CrossMarginAccountDetailFragment.class.getName(), bundle);
                }
            } else {
                BaseFragmentActivity.m56574n0(requireContext(), strM15946d3, SpotAccountDetailFragment.class.getName(), bundle);
            }
        } else if (AssetExKt.m15129q()) {
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            bundle.putString(BaseActivity.TITLE_BAR, CredentialEntry.FALSE_STRING);
            Unit unit2 = Unit.INSTANCE;
            companion.launch(contextRequireContext2, CoinDetailFragment.class, bundle);
        } else {
            BaseFragmentActivity.m56574n0(requireContext(), strM15946d3, MainAccountDetailFragment.class.getName(), bundle);
        }
        C23700d3.m56610a(this);
    }

    @Override // com.kubi.sdk.ResultDelegate.a
    public void preformBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
