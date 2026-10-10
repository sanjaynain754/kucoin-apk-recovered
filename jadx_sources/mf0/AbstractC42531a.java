package mf0;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: mf0.a */
/* JADX INFO: compiled from: ImageDestinationProcessor.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC42531a {
    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract String mo93248b(@NonNull String str);

    @NonNull
    /* JADX INFO: renamed from: a */
    public static AbstractC42531a m93247a() {
        return new b();
    }

    /* JADX INFO: renamed from: mf0.a$b */
    /* JADX INFO: compiled from: ImageDestinationProcessor.java */
    public static class b extends AbstractC42531a {
        public b() {
        }

        @Override // mf0.AbstractC42531a
        @NonNull
        /* JADX INFO: renamed from: b */
        public String mo93248b(@NonNull String str) {
            return str;
        }
    }
}
