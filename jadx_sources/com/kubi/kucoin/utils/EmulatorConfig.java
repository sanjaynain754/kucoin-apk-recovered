package com.kubi.kucoin.utils;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EmulatorHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/kucoin/utils/EmulatorConfig;", "", "emulatorToggle", "", "emulatorWhite", "", "Lcom/kubi/kucoin/utils/DeviceInfo;", "<init>", "(ZLjava/util/List;)V", "getEmulatorToggle", "()Z", "getEmulatorWhite", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EmulatorConfig {
    private final boolean emulatorToggle;

    @NotNull
    private final List<DeviceInfo> emulatorWhite;

    /* JADX WARN: Multi-variable type inference failed */
    public EmulatorConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmulatorConfig)) {
            return false;
        }
        EmulatorConfig emulatorConfig = (EmulatorConfig) other;
        return this.emulatorToggle == emulatorConfig.emulatorToggle && Intrinsics.areEqual(this.emulatorWhite, emulatorConfig.emulatorWhite);
    }

    public EmulatorConfig(boolean z11, @NotNull List<DeviceInfo> emulatorWhite) {
        Intrinsics.checkNotNullParameter(emulatorWhite, "emulatorWhite");
        this.emulatorToggle = z11;
        this.emulatorWhite = emulatorWhite;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmulatorConfig copy$default(EmulatorConfig emulatorConfig, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = emulatorConfig.emulatorToggle;
        }
        if ((i11 & 2) != 0) {
            list = emulatorConfig.emulatorWhite;
        }
        return emulatorConfig.copy(z11, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEmulatorToggle() {
        return this.emulatorToggle;
    }

    @NotNull
    public final List<DeviceInfo> component2() {
        return this.emulatorWhite;
    }

    @NotNull
    public final EmulatorConfig copy(boolean emulatorToggle, @NotNull List<DeviceInfo> emulatorWhite) {
        Intrinsics.checkNotNullParameter(emulatorWhite, "emulatorWhite");
        return new EmulatorConfig(emulatorToggle, emulatorWhite);
    }

    public final boolean getEmulatorToggle() {
        return this.emulatorToggle;
    }

    @NotNull
    public final List<DeviceInfo> getEmulatorWhite() {
        return this.emulatorWhite;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.emulatorToggle) * 31) + this.emulatorWhite.hashCode();
    }

    @NotNull
    public String toString() {
        return "EmulatorConfig(emulatorToggle=" + this.emulatorToggle + ", emulatorWhite=" + this.emulatorWhite + ')';
    }

    public /* synthetic */ EmulatorConfig(boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
