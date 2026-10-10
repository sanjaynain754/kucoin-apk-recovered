package com.kubi.home.gembox;

import androidx.annotation.Keep;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HeatEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, m90084d2 = {"Lcom/kubi/home/gembox/HeatEntity;", "", "imgRes", "", "<init>", "(I)V", "getImgRes", "()I", "setImgRes", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HeatEntity {
    private int imgRes;

    public HeatEntity() {
        this(0, 1, null);
    }

    public HeatEntity(int i11) {
        this.imgRes = i11;
    }

    public final int getImgRes() {
        return this.imgRes;
    }

    public final void setImgRes(int i11) {
        this.imgRes = i11;
    }

    public /* synthetic */ HeatEntity(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1 : i11);
    }
}
