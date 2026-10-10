package p418l1;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.C5098n0;
import com.airbnb.lottie.C5107r;
import com.airbnb.lottie.network.FileExtension;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import p484o1.C42924f;

/* JADX INFO: renamed from: l1.g */
/* JADX INFO: compiled from: NetworkFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C42023g {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C42022f f92212a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final InterfaceC42021e f92213b;

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final C5080h m92130a(Context context, @NonNull String str, @Nullable String str2) {
        C42022f c42022f;
        Pair<FileExtension, InputStream> pairM92125a;
        C5098n0<C5080h> c5098n0M5863C;
        if (str2 == null || (c42022f = this.f92212a) == null || (pairM92125a = c42022f.m92125a(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) pairM92125a.first;
        InputStream inputStream = (InputStream) pairM92125a.second;
        int i11 = a.f92214a[fileExtension.ordinal()];
        if (i11 == 1) {
            c5098n0M5863C = C5107r.m5863C(context, new ZipInputStream(inputStream), str2);
        } else if (i11 != 2) {
            c5098n0M5863C = C5107r.m5889q(inputStream, str2);
        } else {
            try {
                c5098n0M5863C = C5107r.m5889q(new GZIPInputStream(inputStream), str2);
            } catch (IOException e11) {
                c5098n0M5863C = new C5098n0<>(e11);
            }
        }
        if (c5098n0M5863C.m5811b() != null) {
            return c5098n0M5863C.m5811b();
        }
        return null;
    }

    /* JADX INFO: renamed from: l1.g$a */
    /* JADX INFO: compiled from: NetworkFetcher.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f92214a;

        static {
            int[] iArr = new int[FileExtension.values().length];
            f92214a = iArr;
            try {
                iArr[FileExtension.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92214a[FileExtension.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @NonNull
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final C5098n0<C5080h> m92131b(Context context, @NonNull String str, @Nullable String str2) {
        C42924f.m94156a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC42019c interfaceC42019cMo92122a = this.f92213b.mo92122a(str);
                if (!interfaceC42019cMo92122a.isSuccessful()) {
                    C5098n0<C5080h> c5098n0 = new C5098n0<>(new IllegalArgumentException(interfaceC42019cMo92122a.error()));
                    try {
                        interfaceC42019cMo92122a.close();
                        return c5098n0;
                    } catch (IOException e11) {
                        C42924f.m94159d("LottieFetchResult close failed ", e11);
                        return c5098n0;
                    }
                }
                C5098n0<C5080h> c5098n0M92134e = m92134e(context, str, interfaceC42019cMo92122a.mo92120B(), interfaceC42019cMo92122a.mo92119A(), str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Completed fetch from network. Success: ");
                sb2.append(c5098n0M92134e.m5811b() != null);
                C42924f.m94156a(sb2.toString());
                try {
                    interfaceC42019cMo92122a.close();
                    return c5098n0M92134e;
                } catch (IOException e12) {
                    C42924f.m94159d("LottieFetchResult close failed ", e12);
                    return c5098n0M92134e;
                }
            } catch (Exception e13) {
                C5098n0<C5080h> c5098n1 = new C5098n0<>(e13);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e14) {
                        C42924f.m94159d("LottieFetchResult close failed ", e14);
                    }
                }
                return c5098n1;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            try {
                closeable.close();
                throw th2;
            } catch (IOException e15) {
                C42924f.m94159d("LottieFetchResult close failed ", e15);
                throw th2;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final C5098n0<C5080h> m92133d(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        C42022f c42022f;
        return (str2 == null || (c42022f = this.f92212a) == null) ? C5107r.m5889q(new GZIPInputStream(inputStream), null) : C5107r.m5889q(new GZIPInputStream(new FileInputStream(c42022f.m92129g(str, inputStream, FileExtension.GZIP))), str);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public final C5098n0<C5080h> m92134e(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        C5098n0<C5080h> c5098n0M92136g;
        FileExtension fileExtension;
        C42022f c42022f;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            C42924f.m94156a("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            c5098n0M92136g = m92136g(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            C42924f.m94156a("Handling gzip response.");
            fileExtension = FileExtension.GZIP;
            c5098n0M92136g = m92133d(str, inputStream, str3);
        } else {
            C42924f.m94156a("Received json response.");
            fileExtension = FileExtension.JSON;
            c5098n0M92136g = m92135f(str, inputStream, str3);
        }
        if (str3 != null && c5098n0M92136g.m5811b() != null && (c42022f = this.f92212a) != null) {
            c42022f.m92128f(str, fileExtension);
        }
        return c5098n0M92136g;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final C5098n0<C5080h> m92135f(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        C42022f c42022f;
        return (str2 == null || (c42022f = this.f92212a) == null) ? C5107r.m5889q(inputStream, null) : C5107r.m5889q(new FileInputStream(c42022f.m92129g(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final C5098n0<C5080h> m92136g(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        C42022f c42022f;
        return (str2 == null || (c42022f = this.f92212a) == null) ? C5107r.m5863C(context, new ZipInputStream(inputStream), null) : C5107r.m5863C(context, new ZipInputStream(new FileInputStream(c42022f.m92129g(str, inputStream, FileExtension.ZIP))), str);
    }

    public C42023g(@Nullable C42022f c42022f, @NonNull InterfaceC42021e interfaceC42021e) {
        this.f92212a = c42022f;
        this.f92213b = interfaceC42021e;
    }

    @NonNull
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public C5098n0<C5080h> m92132c(Context context, @NonNull String str, @Nullable String str2) {
        C5080h c5080hM92130a = m92130a(context, str, str2);
        if (c5080hM92130a != null) {
            return new C5098n0<>(c5080hM92130a);
        }
        C42924f.m94156a("Animation for " + str + " not found in cache. Fetching from network.");
        return m92131b(context, str, str2);
    }
}
