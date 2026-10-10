package com.kubi.payment.util;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.MerchantHighlight;
import com.kubi.payment.fast.data.entities.MerchantInfo;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37652m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.util.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: P2PUtils.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ*\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fJ(\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u0016\u001a\u00020\u000b*\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/util/P2PUtils;", "", "<init>", "()V", "ERROR_CODE_PRICE", "", "isPriceError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "handlePriceError", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "confirmAction", "Lkotlin/Function0;", "refreshMerchantInfo", "Lcom/kubi/otc/databinding/MerchantInfoCardLayoutBinding;", "merchantInfo", "Lcom/kubi/payment/fast/data/entities/MerchantInfo;", FirebaseAnalytics.Param.PRICE, "fiatCurrency", "inflateMerchantHighlight", "Lcom/kubi/resources/widget/BaseTextView;", "merchantHighlight", "Lcom/kubi/payment/fast/data/entities/MerchantHighlight;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final P2PUtils f40363a = new P2PUtils();

    /* JADX INFO: renamed from: j */
    public static final Unit m49815j(BaseTextView baseTextView, MerchantHighlight merchantHighlight) {
        Drawable merchantIcon;
        baseTextView.setText(C27041f.m66668h(merchantHighlight != null ? merchantHighlight.getText() : null));
        if (merchantHighlight != null) {
            Context context = baseTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            merchantIcon = merchantHighlight.getMerchantIcon(context);
        } else {
            merchantIcon = null;
        }
        baseTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(merchantIcon, (Drawable) null, (Drawable) null, (Drawable) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m49813g(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m49814i(MerchantHighlight merchantHighlight) {
        return merchantHighlight != null;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m49816m(MerchantInfo merchantInfo) {
        return merchantInfo != null;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m49817n(C37652m0 c37652m0, MerchantInfo merchantInfo, String str, String str2) {
        List<MerchantHighlight> merchantHighlights;
        List<MerchantHighlight> merchantHighlights2;
        List<MerchantHighlight> merchantHighlights3;
        Integer foxKingMerchant;
        Integer goldMerchant;
        MerchantHighlight merchantHighlight = null;
        c37652m0.f84264j.setText(C27041f.m66668h(merchantInfo != null ? merchantInfo.getNickName() : null));
        c37652m0.f84263i.setText(C27041f.m66668h(merchantInfo != null ? merchantInfo.getShowLetter() : null));
        c37652m0.f84265k.setActivated(merchantInfo != null ? Intrinsics.areEqual(merchantInfo.getOnline(), Boolean.TRUE) : false);
        c37652m0.f84258d.setVisibility(C21457l.m49860h((merchantInfo == null || (goldMerchant = merchantInfo.getGoldMerchant()) == null || goldMerchant.intValue() != 1) ? false : true));
        c37652m0.f84257c.setVisibility(C21457l.m49860h((merchantInfo == null || (foxKingMerchant = merchantInfo.getFoxKingMerchant()) == null || foxKingMerchant.intValue() != 1) ? false : true));
        P2PUtils p2PUtils = f40363a;
        BaseTextView merchantHighlight0 = c37652m0.f84259e;
        Intrinsics.checkNotNullExpressionValue(merchantHighlight0, "merchantHighlight0");
        p2PUtils.m49819h(merchantHighlight0, (merchantInfo == null || (merchantHighlights3 = merchantInfo.getMerchantHighlights()) == null) ? null : (MerchantHighlight) CollectionsKt.getOrNull(merchantHighlights3, 0));
        BaseTextView merchantHighlight1 = c37652m0.f84260f;
        Intrinsics.checkNotNullExpressionValue(merchantHighlight1, "merchantHighlight1");
        p2PUtils.m49819h(merchantHighlight1, (merchantInfo == null || (merchantHighlights2 = merchantInfo.getMerchantHighlights()) == null) ? null : (MerchantHighlight) CollectionsKt.getOrNull(merchantHighlights2, 1));
        BaseTextView merchantHighlight2 = c37652m0.f84261g;
        Intrinsics.checkNotNullExpressionValue(merchantHighlight2, "merchantHighlight2");
        if (merchantInfo != null && (merchantHighlights = merchantInfo.getMerchantHighlights()) != null) {
            merchantHighlight = (MerchantHighlight) CollectionsKt.getOrNull(merchantHighlights, 2);
        }
        p2PUtils.m49819h(merchantHighlight2, merchantHighlight);
        c37652m0.f84262h.setText(c37652m0.getRoot().getContext().getString(R$string.payment_price, str, str2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m49818f(@Nullable Throwable th2, @NotNull FragmentManager fragmentManager, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (th2 instanceof ApiException) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(((ApiException) th2).getMessage()).m54162S4(R$string.fast_result_refresh, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.util.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    P2PUtils.m49813g(function0, dialogInterface, i11);
                }
            }).m54172c5(fragmentManager);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m49819h(final BaseTextView baseTextView, final MerchantHighlight merchantHighlight) {
        C21457l.m49858f(new Function0() { // from class: com.kubi.payment.util.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(P2PUtils.m49814i(merchantHighlight));
            }
        }, new View[]{baseTextView}, new Function0() { // from class: com.kubi.payment.util.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PUtils.m49815j(baseTextView, merchantHighlight);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final boolean m49820k(@Nullable Throwable th2) {
        return (th2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) th2).code, "618065");
    }

    /* JADX INFO: renamed from: l */
    public final void m49821l(@NotNull final C37652m0 c37652m0, @Nullable final MerchantInfo merchantInfo, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(c37652m0, "<this>");
        C21457l.m49858f(new Function0() { // from class: com.kubi.payment.util.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(P2PUtils.m49816m(merchantInfo));
            }
        }, new View[]{c37652m0.getRoot()}, new Function0() { // from class: com.kubi.payment.util.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PUtils.m49817n(c37652m0, merchantInfo, str, str2);
            }
        });
    }
}
