package com.kubi.resources.widget;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.resources.widget.c3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeInputLayoutProxy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputValueAdapter;", "", "businessPrecision", "", "getBusinessPrecision", "()I", "toBusinessValue", "Ljava/math/BigDecimal;", "displayValue", "toDisplayValue", "businessValue", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TradeInputValueAdapter {
    @Nullable
    /* JADX INFO: renamed from: a */
    BigDecimal mo55049a(@NotNull BigDecimal bigDecimal);

    /* JADX INFO: renamed from: b */
    int mo55050b();

    @Nullable
    /* JADX INFO: renamed from: c */
    BigDecimal mo55051c(@NotNull BigDecimal bigDecimal);
}
