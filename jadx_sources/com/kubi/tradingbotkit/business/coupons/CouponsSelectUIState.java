package com.kubi.tradingbotkit.business.coupons;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.coupons.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CouponsSelectUIState.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/CouponsSelectUIState;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "uiData", "getUiData", "()Ljava/lang/Object;", "setUiData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "allItemAmount", "", "getAllItemAmount", "()Ljava/lang/Integer;", "setAllItemAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "messageNumber", "getMessageNumber", "setMessageNumber", "errorMsg", "", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponsSelectUIState<T> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public T f52306a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Integer f52307b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Integer f52308c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f52309d;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getF52307b() {
        return this.f52307b;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF52309d() {
        return this.f52309d;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getF52308c() {
        return this.f52308c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final T m63916d() {
        return this.f52306a;
    }

    /* JADX INFO: renamed from: e */
    public final void m63917e(@Nullable Integer num) {
        this.f52307b = num;
    }

    /* JADX INFO: renamed from: f */
    public final void m63918f(@Nullable String str) {
        this.f52309d = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m63919g(@Nullable Integer num) {
        this.f52308c = num;
    }

    /* JADX INFO: renamed from: h */
    public final void m63920h(@Nullable T t11) {
        this.f52306a = t11;
    }
}
