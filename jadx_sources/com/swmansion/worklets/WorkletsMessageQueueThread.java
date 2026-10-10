package com.swmansion.worklets;

import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44695a
public class WorkletsMessageQueueThread extends WorkletsMessageQueueThreadBase {
    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.f68478a.isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(Runnable runnable) {
        return this.f68478a.runOnQueue(runnable);
    }
}
