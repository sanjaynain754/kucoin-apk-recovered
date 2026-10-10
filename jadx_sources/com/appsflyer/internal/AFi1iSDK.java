package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1iSDK implements AFi1mSDK {

    @NotNull
    private PluginInfo getCurrencyIso4217Code = new PluginInfo(Plugin.NATIVE, "6.17.4", null, 4, null);

    @Override // com.appsflyer.internal.AFi1mSDK
    public final void getMonetizationNetwork(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getCurrencyIso4217Code = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    @NotNull
    public final Map<String, Object> getMonetizationNetwork() {
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m90091to("platform", this.getCurrencyIso4217Code.getPlugin().getPluginName()), TuplesKt.m90091to("version", this.getCurrencyIso4217Code.getVersion()));
        if (!this.getCurrencyIso4217Code.getAdditionalParams().isEmpty()) {
            mapMutableMapOf.put("extras", this.getCurrencyIso4217Code.getAdditionalParams());
        }
        return mapMutableMapOf;
    }
}
