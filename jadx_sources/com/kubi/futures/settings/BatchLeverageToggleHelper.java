package com.kubi.futures.settings;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.BatchLeverageEntryVisibility;
import com.kubi.futures.FuturesRemote;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.settings.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BatchLeverageToggleHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\rJ2\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013J\u001e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/futures/settings/BatchLeverageToggleHelper;", "", "<init>", "()V", "DIALOG_TAG", "", "canShowBatchSwitch", "", "isTrial", "isClassicAccount", "entryVisibility", "Lcom/kubi/futures/BatchLeverageEntryVisibility;", "siteType", "canShowBatchSwitch$KumexLib_googleRelease", "setup", "", "fragment", "Landroidx/fragment/app/Fragment;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "switch", "Landroidx/appcompat/widget/SwitchCompat;", "divider", "showBatchConfirmDialog", "onConfirm", "Lkotlin/Function0;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BatchLeverageToggleHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BatchLeverageToggleHelper f23307a = new BatchLeverageToggleHelper();

    /* JADX INFO: renamed from: h */
    public static final Unit m26308h(SwitchCompat switchCompat) {
        switchCompat.setChecked(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.kubi.futures.settings.d$a */
    /* JADX INFO: compiled from: BatchLeverageToggleHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BatchLeverageEntryVisibility.values().length];
            try {
                iArr[BatchLeverageEntryVisibility.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatchLeverageEntryVisibility.EXCLUDE_AU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BatchLeverageEntryVisibility.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m26307g(Fragment fragment, final SwitchCompat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isChecked()) {
            it.setChecked(false);
        } else {
            f23307a.m26313i(fragment, new Function0() { // from class: com.kubi.futures.settings.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BatchLeverageToggleHelper.m26308h(it);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26310d(boolean z11) {
        return m26311e(z11, BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.CLASSIC, FuturesRemote.f23108a.m25643i(), SiteInfoManager.f47913a.m58109c());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m26311e(boolean z11, boolean z12, @NotNull BatchLeverageEntryVisibility entryVisibility, @NotNull String siteType) {
        int i11;
        Intrinsics.checkNotNullParameter(entryVisibility, "entryVisibility");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        if (!z11 && z12 && (i11 = a.$EnumSwitchMapping$0[entryVisibility.ordinal()]) != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!Intrinsics.areEqual(siteType, SiteType.Australia.getSiteType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m26312f(@NotNull final Fragment fragment, @NotNull View container, @NotNull SwitchCompat switchCompat, boolean z11, @Nullable View view) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(switchCompat, "switch");
        if (!m26310d(z11)) {
            ViewExtKt.m66577h(container);
            if (view != null) {
                ViewExtKt.m66577h(view);
                return;
            }
            return;
        }
        C27046k.m66685H(container);
        if (view != null) {
            C27046k.m66685H(view);
        }
        switchCompat.setChecked(false);
        ViewExKt.m36487m(switchCompat, new Function1() { // from class: com.kubi.futures.settings.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BatchLeverageToggleHelper.m26307g(fragment, (SwitchCompat) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m26313i(Fragment fragment, final Function0<Unit> function0) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kumex_batch_leverage_switch_title).m54153J4(R$string.kumex_batch_leverage_confirm_content).m54159P4(R$string.cancel, null).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.settings.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BatchLeverageToggleHelper.m26309j(function0, dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "BatchLeverageConfirm");
    }

    /* JADX INFO: renamed from: j */
    public static final void m26309j(Function0 function0, DialogInterface dialogInterface, int i11) {
        function0.invoke();
    }
}
