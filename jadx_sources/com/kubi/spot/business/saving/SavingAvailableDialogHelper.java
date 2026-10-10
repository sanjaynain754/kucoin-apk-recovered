package com.kubi.spot.business.saving;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.spot.R$id;
import com.kubi.spot.business.holder.BaseOrderHolder;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.disposables.CompositeDisposable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.saving.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SavingAvailableDialogHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J2\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J4\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J1\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/business/saving/SavingAvailableDialogHelper;", "", "<init>", "()V", "initItemViewIfNeed", "", "targetCurrency", "", "targetCurrencyName", "isSpotNormalLimitOrder", "", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "orderHolder", "Lcom/kubi/spot/business/holder/BaseOrderHolder;", "initView", "initView$SpotLib_googleRelease", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SavingAvailableDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SavingAvailableDialogHelper f50315a = new SavingAvailableDialogHelper();

    /* JADX INFO: renamed from: com.kubi.spot.business.saving.d$a */
    /* JADX INFO: compiled from: SavingAvailableDialogHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/spot/business/saving/SavingAvailableDialogHelper$initItemViewIfNeed$savingBalanceChangeListener$1", "Lcom/kubi/spot/business/saving/SavingBalanceChangeListener;", "onChange", "", "uid", "", FirebaseAnalytics.Param.CURRENCY, "balance", "Ljava/math/BigDecimal;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements SavingBalanceChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f50316a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseViewHolder f50317b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f50318c;

        public a(String str, BaseViewHolder baseViewHolder, String str2) {
            this.f50316a = str;
            this.f50317b = baseViewHolder;
            this.f50318c = str2;
        }

        @Override // com.kubi.spot.business.saving.SavingBalanceChangeListener
        /* JADX INFO: renamed from: a */
        public void mo61320a(String str, String currency, BigDecimal balance) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(balance, "balance");
            if (Intrinsics.areEqual(UserInfo.a.h(), str) && Intrinsics.areEqual(currency, this.f50316a)) {
                ((TextView) this.f50317b.getView(R$id.tvAvailableAmount)).setText(SavingCacheManager.f50304a.m61302o(currency, this.f50318c));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m61313g(a aVar, CompositeDisposable compositeDisposable, DialogInterface dialogInterface) {
        SavingCacheManager.f50304a.m61307u(aVar);
        compositeDisposable.dispose();
    }

    /* JADX INFO: renamed from: j */
    public static final void m61315j(DialogFragmentHelper dialogFragmentHelper, CompoundButton compoundButton, boolean z11) throws JSONException {
        if (z11) {
            FragmentManager childFragmentManager = dialogFragmentHelper.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            C25107j.m61328h(childFragmentManager);
        }
        SavingConfig.f50323a.m61346n(z11);
        SavingTechReport.f50327a.m61349b(z11);
    }

    /* JADX INFO: renamed from: d */
    public final void m61316d(String str, String str2, SymbolInfoEntity symbolInfoEntity, BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
        SavingTechReport.f50327a.m61348a();
        m61319h(str, str2, baseViewHolder, dialogFragmentHelper);
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        SavingCacheManager savingCacheManager = SavingCacheManager.f50304a;
        savingCacheManager.m61298g(symbolInfoEntity, compositeDisposable);
        final a aVar = new a(str, baseViewHolder, str2);
        savingCacheManager.m61305r(aVar);
        dialogFragmentHelper.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.spot.business.saving.a
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SavingAvailableDialogHelper.m61313g(aVar, compositeDisposable, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m61317e(@Nullable String str, @Nullable String str2, @NotNull BaseOrderHolder orderHolder, @NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(orderHolder, "orderHolder");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        if (SavingConfig.f50323a.m61338f(orderHolder)) {
            m61316d(str, str2, orderHolder.getParentBehavior().N(), viewHolder, dialogFragmentHelper);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m61318f(@Nullable String str, @Nullable String str2, boolean z11, @NotNull SymbolInfoEntity symbolInfo, @NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        if (SavingConfig.f50323a.m61339g(z11, symbolInfo)) {
            m61316d(str, str2, symbolInfo, viewHolder, dialogFragmentHelper);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m61319h(@Nullable String str, @Nullable String str2, @NotNull BaseViewHolder viewHolder, @NotNull final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.setGone(R$id.moreFundingLayout, true);
        View view = viewHolder.getView(R$id.tvSavingTitle);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.spot.business.saving.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavingAvailableDialogHelper.m61314i(dialogFragmentHelper);
            }
        }, 1, null);
        ((TextView) viewHolder.getView(R$id.tvAvailableAmount)).setText(SavingCacheManager.f50304a.m61302o(str, str2));
        SwitchCompat switchCompat = (SwitchCompat) viewHolder.getView(R$id.swEnableSaving);
        switchCompat.setChecked(SavingConfig.f50323a.m61333a());
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.spot.business.saving.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) throws JSONException {
                SavingAvailableDialogHelper.m61315j(dialogFragmentHelper, compoundButton, z11);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m61314i(DialogFragmentHelper dialogFragmentHelper) {
        FragmentManager childFragmentManager = dialogFragmentHelper.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C25107j.m61328h(childFragmentManager);
        return Unit.INSTANCE;
    }
}
