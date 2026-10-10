package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.L3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29246L3 {

    @NotNull
    public static final C29241K3 Companion = new C29241K3();

    /* JADX INFO: renamed from: a */
    public final String f59237a;

    /* JADX INFO: renamed from: b */
    public final JsonElement f59238b;

    public /* synthetic */ C29246L3(int i11, String str, JsonElement jsonElement) {
        this.f59237a = (i11 & 1) == 0 ? "" : str;
        if ((i11 & 2) == 0) {
            this.f59238b = null;
        } else {
            this.f59238b = jsonElement;
        }
    }
}
