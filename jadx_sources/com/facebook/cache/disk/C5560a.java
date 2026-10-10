package com.facebook.cache.disk;

import p583r3.InterfaceC43911d;

/* JADX INFO: renamed from: com.facebook.cache.disk.a */
/* JADX INFO: compiled from: DefaultEntryEvictionComparatorSupplier.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5560a implements InterfaceC43911d {

    /* JADX INFO: renamed from: com.facebook.cache.disk.a$a */
    /* JADX INFO: compiled from: DefaultEntryEvictionComparatorSupplier.java */
    public class a implements InterfaceC5564e {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(InterfaceC5561b.a aVar, InterfaceC5561b.a aVar2) {
            long timestamp = aVar.getTimestamp();
            long timestamp2 = aVar2.getTimestamp();
            if (timestamp < timestamp2) {
                return -1;
            }
            if (timestamp2 == timestamp) {
                return 0;
            }
            return 1;
        }
    }

    @Override // p583r3.InterfaceC43911d
    public InterfaceC5564e get() {
        return new a();
    }
}
