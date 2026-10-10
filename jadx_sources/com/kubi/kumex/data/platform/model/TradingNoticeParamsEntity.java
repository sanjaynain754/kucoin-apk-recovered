package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradingNoticeParamsEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/TradingNoticeParamsEntity;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "configs", "", "getConfigs", "()Ljava/util/List;", "setConfigs", "(Ljava/util/List;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradingNoticeParamsEntity {

    @NotNull
    private List<String> configs = new ArrayList();

    @Nullable
    private String type;

    @NotNull
    public final List<String> getConfigs() {
        return this.configs;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setConfigs(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.configs = list;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
