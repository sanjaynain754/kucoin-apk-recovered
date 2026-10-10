package io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: QueueDrainSubscriber.java */
/* JADX INFO: loaded from: classes60.dex */
class QueueDrainSubscriberPad3 extends QueueDrainSubscriberPad2 {
    final AtomicLong requested = new AtomicLong();
}
