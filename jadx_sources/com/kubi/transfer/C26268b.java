package com.kubi.transfer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.data.coin.AccountType;
import com.kubi.transfer.lib.R$drawable;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.transfer.b */
/* JADX INFO: compiled from: TransferEx.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\n\u0010\n\u001a\u00020\t*\u00020\u000b¨\u0006\f"}, m90084d2 = {"setCurrentAccount", "", "Landroid/widget/ImageView;", "accountType", "Lcom/kubi/data/coin/AccountType;", "Landroid/widget/TextView;", "visibleOrGone", "Landroid/view/View;", "isShow", "", "isNumber", "", "TransferLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26268b {

    /* JADX INFO: renamed from: com.kubi.transfer.b$a */
    /* JADX INFO: compiled from: TransferEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.TRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.ISOLATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.MARGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountType.CONTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountType.OPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountType.SAVINGS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountType.UNIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m64512a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.toBigDecimalOrNull(str) != null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m64513b(@NotNull ImageView imageView, @NotNull AccountType accountType) {
        int i11;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        switch (a.$EnumSwitchMapping$0[accountType.ordinal()]) {
            case 1:
                i11 = R$drawable.ic2_trading_thin_16;
                break;
            case 2:
            case 3:
                i11 = R$drawable.ic2_margin_thin_16;
                break;
            case 4:
                i11 = R$drawable.ic2_futures_thin_16;
                break;
            case 5:
                i11 = R$drawable.ic2_option_thin_16;
                break;
            case 6:
                i11 = R$drawable.ic2_earn_thin_16;
                break;
            case 7:
                i11 = R$drawable.ic2_unifiedtrading_thin_16;
                break;
            default:
                i11 = R$drawable.ic2_funding_thin_16;
                break;
        }
        imageView.setImageResource(i11);
    }

    /* JADX INFO: renamed from: c */
    public static final void m64514c(@NotNull TextView textView, @NotNull AccountType accountType) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        textView.setText(C27017c.f54310a.m66516f(accountType.getNickNameRes(), new Object[0]));
    }

    /* JADX INFO: renamed from: d */
    public static final void m64515d(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z11) {
            ViewExtKt.m66594y(view);
        } else {
            ViewExtKt.m66577h(view);
        }
    }
}
