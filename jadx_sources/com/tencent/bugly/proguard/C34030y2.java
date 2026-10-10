package com.tencent.bugly.proguard;

import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.base.config.ConfigProxy;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C34030y2 implements InterfaceC34010x2 {
    @Override // com.tencent.bugly.proguard.InterfaceC34010x2
    /* JADX INFO: renamed from: a */
    public void mo75418a(boolean z11) {
        ConfigProxy.INSTANCE.getConfig().m77066a(z11);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34010x2
    /* JADX INFO: renamed from: a */
    public void mo75416a() {
        ConfigProxy.INSTANCE.getConfig().m77080g();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34010x2
    /* JADX INFO: renamed from: b */
    public void mo75419b(InterfaceC33855p8 interfaceC33855p8) {
        ConfigProxy.INSTANCE.getConfig().m77063a(interfaceC33855p8);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34010x2
    /* JADX INFO: renamed from: a */
    public void mo75417a(InterfaceC33855p8 interfaceC33855p8) {
        ConfigProxy.INSTANCE.getConfig().m77070b(interfaceC33855p8);
    }
}
