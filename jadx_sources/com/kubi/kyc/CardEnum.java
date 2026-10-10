package com.kubi.kyc;

import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: KycEnum.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kyc/CardEnum;", "", "code", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getCode", "()Ljava/lang/String;", "getLabel", "()I", "ID", "PASSPORT", "DRIVER", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum CardEnum {
    ID("idcard", R$string.id_card),
    PASSPORT("passport", R$string.passport),
    DRIVER("drivinglicense", R$string.driver_license);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f31039c = EnumEntriesKt.enumEntries(m36756a());

    @NotNull
    private final String code;
    private final int label;

    @NotNull
    public static EnumEntries<CardEnum> getEntries() {
        return f31039c;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final int getLabel() {
        return this.label;
    }

    CardEnum(String str, int i11) {
        this.code = str;
        this.label = i11;
    }
}
