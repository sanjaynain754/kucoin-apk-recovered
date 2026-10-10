package com.kubi.futures;

import c20.C4810a;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33627eb;
import fm.C37567b;
import java.text.SimpleDateFormat;
import java.util.Locale;
import ki.C41050b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.futures.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesDisplayNameUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\n\u0010\t\u001a\u00020\u0005*\u00020\u0006J\f\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u0006J\f\u0010\f\u001a\u00020\r*\u0004\u0018\u00010\u0006J\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0006J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\f\u0010\u0014\u001a\u00020\u000b*\u00020\u0015H\u0002¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/FuturesDisplayNameUtils;", "", "<init>", "()V", "formatSymbolWithTag", "Lcom/kubi/utils/StyledText;", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "withTag", "", "formatSymbol", "formatQtyUnit", "", "qtyPrecision", "", "formatSymbolWithoutPerp", "buildPerpSymbolShow", "styledText", "contractEntity", "needTag", "buildSettleSymbolShow", "formatDisplayDate", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesDisplayNameUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FuturesDisplayNameUtils f22525a = new FuturesDisplayNameUtils();

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C27096v0 m24435g(FuturesDisplayNameUtils futuresDisplayNameUtils, ContractEntity contractEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return futuresDisplayNameUtils.m24441f(contractEntity, z11);
    }

    /* JADX INFO: renamed from: a */
    public final C27096v0 m24436a(C27096v0 c27096v0, ContractEntity contractEntity, boolean z11) {
        if (!z11) {
            C27096v0 c27096v0Append = c27096v0.append(C42180b.m92647l(C27041f.m66677q(contractEntity.getDisplayBaseCurrency())) + C42180b.m92647l(C27041f.m66677q(C37567b.m84619i(contractEntity)))).append(C33627eb.f69716f).append(StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString());
            Intrinsics.checkNotNull(c27096v0Append);
            return c27096v0Append;
        }
        String str = C42180b.m92647l(C27041f.m66677q(contractEntity.getDisplayBaseCurrency())) + C42180b.m92647l(C27041f.m66677q(C37567b.m84619i(contractEntity)));
        C27096v0 c27096v0Append2 = C5303w0.m6511a() ? c27096v0.m66903c(StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString(), new C4810a()).append(C33627eb.f69716f).append(str) : c27096v0.append(str).append(C33627eb.f69716f).m66903c(StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString(), new C4810a());
        Intrinsics.checkNotNull(c27096v0Append2);
        return c27096v0Append2;
    }

    /* JADX INFO: renamed from: b */
    public final String m24437b(ContractEntity contractEntity) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C42180b.m92647l(C27041f.m66677q(contractEntity.getDisplayBaseCurrency())));
        sb2.append(C42180b.m92647l(C27041f.m66677q(C37567b.m84619i(contractEntity))));
        sb2.append('-');
        Long settleDate = contractEntity.getSettleDate();
        sb2.append(C42180b.m92647l(settleDate != null ? m24438c(settleDate.longValue()) : null));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public final String m24438c(long j11) {
        Locale ENGLISH = Locale.ENGLISH;
        String str = new SimpleDateFormat("ddMMMyy", ENGLISH).format(Long.valueOf(j11));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = str.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m24439d(@Nullable ContractEntity contractEntity) {
        return contractEntity == null ? C27017c.f54310a.m66516f(R$string.card, new Object[0]) : C41050b.f91264a.m90019b(contractEntity).mo90014h(C37567b.m84629s(contractEntity));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C27096v0 m24440e(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        return m24441f(contractEntity, false);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C27096v0 m24441f(@NotNull ContractEntity contractEntity, boolean z11) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        C27096v0 c27096v0 = new C27096v0();
        boolean z12 = z11 && C37567b.m84625o(contractEntity);
        if (C37567b.m84625o(contractEntity)) {
            f22525a.m24436a(c27096v0, contractEntity, z12);
            return c27096v0;
        }
        c27096v0.append(f22525a.m24437b(contractEntity));
        return c27096v0;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m24442h(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        if (!C37567b.m84625o(contractEntity)) {
            return m24437b(contractEntity);
        }
        return C42180b.m92647l(C27041f.m66677q(contractEntity.getDisplayBaseCurrency())) + C42180b.m92647l(C27041f.m66677q(C37567b.m84619i(contractEntity)));
    }

    /* JADX INFO: renamed from: i */
    public final int m24443i(@Nullable ContractEntity contractEntity) {
        if (contractEntity == null) {
            return 0;
        }
        return C41050b.f91264a.m90019b(contractEntity).mo90017k(C37567b.m84629s(contractEntity));
    }
}
