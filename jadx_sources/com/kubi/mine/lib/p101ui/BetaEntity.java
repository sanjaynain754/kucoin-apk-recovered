package com.kubi.mine.lib.p101ui;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: JoinBetaFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/BetaEntity;", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "version", "", "content", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVersion", "()Ljava/lang/String;", "getContent", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BetaEntity {

    @Nullable
    private final String content;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final String version;

    public BetaEntity() {
        this(null, null, null, 7, null);
    }

    public BetaEntity(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.enable = bool;
        this.version = str;
        this.content = str2;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public /* synthetic */ BetaEntity(Boolean bool, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
