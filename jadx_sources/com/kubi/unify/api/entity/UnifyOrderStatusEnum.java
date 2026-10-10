package com.kubi.unify.api.entity;

import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: UnifyEnum.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/unify/api/entity/UnifyOrderStatusEnum;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "NOT_TRIGGERED", "TRIGGERED", "LIVE", "FILLED", "PARTIAL_FILLED", OrderDetailInfo.ORDER_STATUS_CANCELED, "PARTIAL_CANCELED", "BUnifyAccountApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum UnifyOrderStatusEnum {
    NOT_TRIGGERED(0),
    TRIGGERED(1),
    LIVE(2),
    FILLED(3),
    PARTIAL_FILLED(4),
    CANCELED(5),
    PARTIAL_CANCELED(6);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f53164c = EnumEntriesKt.enumEntries(m65014a());
    private final int type;

    @NotNull
    public static EnumEntries<UnifyOrderStatusEnum> getEntries() {
        return f53164c;
    }

    public final int getType() {
        return this.type;
    }

    UnifyOrderStatusEnum(int i11) {
        this.type = i11;
    }
}
