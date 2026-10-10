package com.kubi.core.biz.callauction;

import android.text.style.ForegroundColorSpan;
import com.kubi.tradecorebiz.R$color;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.tencent.bugly.proguard.C33627eb;
import java.util.Arrays;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import v30.C45385h0;

/* JADX INFO: renamed from: com.kubi.core.biz.callauction.h */
/* JADX INFO: compiled from: CallAuctionFragmentViewHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b\"\u00020\u0006¢\u0006\u0002\u0010\t\u001a+\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b\"\u00020\u0006¢\u0006\u0002\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b\"\u00020\u0006¢\u0006\u0002\u0010\u0010\u001a\u001a\u0010\u0012\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006\u001a\u001a\u0010\u0014\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0006\u001a\u001a\u0010\u0016\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0006\"\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"showPriceByStyleText", "Lcom/kubi/utils/StyledText;", "Lcom/kubi/core/biz/callauction/CallAuctionFragment;", "textColor", "", "unitString", "", "textString", "", "(Lcom/kubi/core/biz/callauction/CallAuctionFragment;ILjava/lang/String;[Ljava/lang/String;)Lcom/kubi/utils/StyledText;", "DEFAULT_DISPLAY", "setSellPriceRange", "", "binding", "Lcom/kubi/tradecorebiz/databinding/TradeCoreFragmentCallAuctionBinding;", "rangeString", "(Lcom/kubi/core/biz/callauction/CallAuctionFragment;Lcom/kubi/tradecorebiz/databinding/TradeCoreFragmentCallAuctionBinding;[Ljava/lang/String;)V", "setBuyPriceRange", "setEstimatedOpeningVolume", "estimatedOpeningVolume", "setEstimatedOpeningPrice", "estimatedOpeningPrice", "setIssuePrice", "issuePrice", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11814h {
    /* JADX INFO: renamed from: a */
    public static final void m21628a(@NotNull CallAuctionFragment callAuctionFragment, @NotNull C45385h0 binding, @NotNull String... rangeString) {
        Intrinsics.checkNotNullParameter(callAuctionFragment, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rangeString, "rangeString");
        boolean z11 = false;
        boolean z12 = !(rangeString.length == 0) && rangeString[0].length() > 0;
        if (!(rangeString.length == 0) && rangeString.length > 1 && rangeString[1].length() > 0) {
            z11 = true;
        }
        binding.f102125r.setText((z12 && z11) ? m21633f(callAuctionFragment, R$color.c_text, callAuctionFragment.m21535N3(), (String[]) Arrays.copyOf(rangeString, rangeString.length)) : "--");
    }

    /* JADX INFO: renamed from: b */
    public static final void m21629b(@NotNull CallAuctionFragment callAuctionFragment, @NotNull C45385h0 binding, @NotNull String estimatedOpeningPrice) {
        Intrinsics.checkNotNullParameter(callAuctionFragment, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(estimatedOpeningPrice, "estimatedOpeningPrice");
        binding.f102129v.setText(estimatedOpeningPrice.length() > 0 ? m21633f(callAuctionFragment, R$color.primary, callAuctionFragment.m21535N3(), estimatedOpeningPrice) : "--");
    }

    /* JADX INFO: renamed from: c */
    public static final void m21630c(@NotNull CallAuctionFragment callAuctionFragment, @NotNull C45385h0 binding, @NotNull String estimatedOpeningVolume) {
        Intrinsics.checkNotNullParameter(callAuctionFragment, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(estimatedOpeningVolume, "estimatedOpeningVolume");
        binding.f102131x.setText(estimatedOpeningVolume.length() > 0 ? m21633f(callAuctionFragment, R$color.primary, callAuctionFragment.m21530I3(), estimatedOpeningVolume) : "--");
    }

    /* JADX INFO: renamed from: d */
    public static final void m21631d(@NotNull CallAuctionFragment callAuctionFragment, @NotNull C45385h0 binding, @NotNull String issuePrice) {
        Intrinsics.checkNotNullParameter(callAuctionFragment, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(issuePrice, "issuePrice");
        binding.f102133z.setText(issuePrice.length() > 0 ? m21633f(callAuctionFragment, R$color.c_text, callAuctionFragment.m21535N3(), issuePrice) : "--");
    }

    /* JADX INFO: renamed from: e */
    public static final void m21632e(@NotNull CallAuctionFragment callAuctionFragment, @NotNull C45385h0 binding, @NotNull String... rangeString) {
        Intrinsics.checkNotNullParameter(callAuctionFragment, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rangeString, "rangeString");
        boolean z11 = false;
        boolean z12 = !(rangeString.length == 0) && rangeString[0].length() > 0;
        if (!(rangeString.length == 0) && rangeString.length > 1 && rangeString[1].length() > 0) {
            z11 = true;
        }
        binding.f102105D.setText((z12 && z11) ? m21633f(callAuctionFragment, R$color.c_text, callAuctionFragment.m21535N3(), (String[]) Arrays.copyOf(rangeString, rangeString.length)) : "--");
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final C27096v0 m21633f(@NotNull CallAuctionFragment callAuctionFragment, int i11, @NotNull String unitString, @NotNull String... textString) {
        Intrinsics.checkNotNullParameter(callAuctionFragment, "<this>");
        Intrinsics.checkNotNullParameter(unitString, "unitString");
        Intrinsics.checkNotNullParameter(textString, "textString");
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        int iM66512a = c27017c.m66512a(i11);
        int iM66512a2 = c27017c.m66512a(R$color.emphasis40);
        StringBuilder sb2 = new StringBuilder();
        if (!(textString.length == 0)) {
            sb2.append(textString[0]);
        }
        if (textString.length > 1) {
            sb2.append(" ~ " + textString[1]);
        }
        c27096v0.m66903c(C42828b.m93915p(sb2.toString()), new ForegroundColorSpan(iM66512a));
        c27096v0.append(C33627eb.f69716f);
        c27096v0.m66903c(C42828b.m93915p(unitString), new ForegroundColorSpan(iM66512a2));
        return c27096v0;
    }
}
