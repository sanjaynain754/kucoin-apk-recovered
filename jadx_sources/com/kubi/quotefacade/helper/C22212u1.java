package com.kubi.quotefacade.helper;

import android.text.SpannableStringBuilder;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41015b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.u1 */
/* JADX INFO: compiled from: QuoteAlphaChainEx.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\u0007"}, m90084d2 = {"chainCoinPrice", "Landroid/text/SpannableStringBuilder;", "currentPriceUsd", "Ljava/math/BigDecimal;", "chainCoinVolume", "", "tokenTxVolumeUsd", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22212u1 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SpannableStringBuilder m52119a(@Nullable BigDecimal bigDecimal) {
        SpannableStringBuilder spannableStringBuilderM89958e = null;
        if (bigDecimal != null) {
            try {
                spannableStringBuilderM89958e = C41015b.m89958e(bigDecimal, null, null, 0, 7, null);
            } catch (Exception unused) {
                C44128b.m97266j("ChainFavItemListAdapter", "volume parse number error");
            }
        }
        if (spannableStringBuilderM89958e != null) {
            return spannableStringBuilderM89958e;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) "--");
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "append(...)");
        return spannableStringBuilderAppend;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m52120b(@Nullable String str) {
        BigDecimal bigDecimalOrNull;
        if (str != null) {
            try {
                bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str);
            } catch (Exception unused) {
                C44128b.m97266j("ChainFavItemListAdapter", "volume parse number error");
            }
        } else {
            bigDecimalOrNull = null;
        }
        if (bigDecimalOrNull != null && bigDecimalOrNull.compareTo(BigDecimal.ZERO) > 0) {
            return C27041f.m66669i(C37885i.m85566e(bigDecimalOrNull.doubleValue(), "USD"), "--");
        }
        return "--";
    }
}
