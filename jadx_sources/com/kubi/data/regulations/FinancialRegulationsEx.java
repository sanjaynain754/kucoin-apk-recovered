package com.kubi.data.regulations;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinancialRegulationsEx.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/data/regulations/FinancialRegulationsEx;", "", "<init>", "()V", "Companion", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinancialRegulationsEx {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f21492a = new Companion(null);

    /* JADX INFO: compiled from: FinancialRegulationsEx.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/data/regulations/FinancialRegulationsEx$Companion;", "", "<init>", "()V", "formatPercentRegular", "", "value", "Ljava/math/BigDecimal;", "addPlusSign", "", "formatNumber", "precision", "", "miniPrecision", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ String formatNumber$default(Companion companion, BigDecimal bigDecimal, int i11, int i12, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                i11 = 2;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            return companion.formatNumber(bigDecimal, i11, i12);
        }

        public static /* synthetic */ String formatPercentRegular$default(Companion companion, BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return companion.formatPercentRegular(bigDecimal, z11);
        }

        @NotNull
        public final String formatNumber(@NotNull BigDecimal value, int precision, int miniPrecision) {
            Intrinsics.checkNotNullParameter(value, "value");
            return C42180b.m92640e(value, null, precision, false, false, false, miniPrecision, null, 93, null);
        }

        @NotNull
        public final String formatPercentRegular(@NotNull BigDecimal value, boolean addPlusSign) {
            Intrinsics.checkNotNullParameter(value, "value");
            return C42180b.m92642g(value, null, null, 0, addPlusSign, false, false, 55, null);
        }
    }
}
