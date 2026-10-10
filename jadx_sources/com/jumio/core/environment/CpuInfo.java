package com.jumio.core.environment;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058Æ\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058Æ\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058Æ\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/environment/CpuInfo;", "", "<init>", "()V", "cpuFamily", "", "getCpuFamily", "()I", "cpuFeatures", "getCpuFeatures", "cpuCount", "getCpuCount", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CpuInfo {

    @NotNull
    public static final CpuInfo INSTANCE = new CpuInfo();

    public final native int getCpuCount();

    public final native int getCpuFamily();

    public final native int getCpuFeatures();
}
