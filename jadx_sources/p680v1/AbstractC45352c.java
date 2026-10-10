package p680v1;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: renamed from: v1.c */
/* JADX INFO: compiled from: DiskCacheStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC45352c {

    /* JADX INFO: renamed from: a */
    public static final AbstractC45352c f101954a = new a();

    /* JADX INFO: renamed from: b */
    public static final AbstractC45352c f101955b = new b();

    /* JADX INFO: renamed from: c */
    public static final AbstractC45352c f101956c = new c();

    /* JADX INFO: renamed from: d */
    public static final AbstractC45352c f101957d = new d();

    /* JADX INFO: renamed from: e */
    public static final AbstractC45352c f101958e = new e();

    /* JADX INFO: renamed from: v1.c$a */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class a extends AbstractC45352c {
        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: a */
        public boolean mo100250a() {
            return true;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: b */
        public boolean mo100251b() {
            return true;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: c */
        public boolean mo100252c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: d */
        public boolean mo100253d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: v1.c$b */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class b extends AbstractC45352c {
        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: a */
        public boolean mo100250a() {
            return false;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: b */
        public boolean mo100251b() {
            return false;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: c */
        public boolean mo100252c(DataSource dataSource) {
            return false;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: d */
        public boolean mo100253d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: v1.c$c */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class c extends AbstractC45352c {
        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: a */
        public boolean mo100250a() {
            return true;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: b */
        public boolean mo100251b() {
            return false;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: d */
        public boolean mo100253d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: c */
        public boolean mo100252c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: v1.c$d */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class d extends AbstractC45352c {
        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: a */
        public boolean mo100250a() {
            return false;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: b */
        public boolean mo100251b() {
            return true;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: c */
        public boolean mo100252c(DataSource dataSource) {
            return false;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: d */
        public boolean mo100253d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: v1.c$e */
    /* JADX INFO: compiled from: DiskCacheStrategy.java */
    public class e extends AbstractC45352c {
        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: a */
        public boolean mo100250a() {
            return true;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: b */
        public boolean mo100251b() {
            return true;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: c */
        public boolean mo100252c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p680v1.AbstractC45352c
        /* JADX INFO: renamed from: d */
        public boolean mo100253d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z11 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo100250a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo100251b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo100252c(DataSource dataSource);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo100253d(boolean z11, DataSource dataSource, EncodeStrategy encodeStrategy);
}
