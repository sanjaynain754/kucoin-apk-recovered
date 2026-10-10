package p745x1;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: x1.f */
/* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45986f extends C45984d {

    /* JADX INFO: renamed from: x1.f$a */
    /* JADX INFO: compiled from: InternalCacheDiskCacheFactory.java */
    public class a implements C45984d.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f103448a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f103449b;

        public a(Context context, String str) {
            this.f103448a = context;
            this.f103449b = str;
        }

        @Override // p745x1.C45984d.a
        /* JADX INFO: renamed from: a */
        public File mo101444a() {
            File cacheDir = this.f103448a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f103449b != null ? new File(cacheDir, this.f103449b) : cacheDir;
        }
    }

    public C45986f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C45986f(Context context, String str, long j11) {
        super(new a(context, str), j11);
    }
}
