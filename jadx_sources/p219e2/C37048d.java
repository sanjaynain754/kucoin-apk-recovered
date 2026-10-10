package p219e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p628t1.C44613e;
import p628t1.InterfaceC44614f;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: e2.d */
/* JADX INFO: compiled from: ResourceDrawableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C37048d implements InterfaceC44614f<Uri, Drawable> {

    /* JADX INFO: renamed from: a */
    public final Context f82302a;

    @NonNull
    /* JADX INFO: renamed from: d */
    public final Context m82898d(Uri uri, String str) {
        if (str.equals(this.f82302a.getPackageName())) {
            return this.f82302a;
        }
        try {
            return this.f82302a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e11) {
            if (str.contains(this.f82302a.getPackageName())) {
                return this.f82302a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e11);
        }
    }

    public C37048d(Context context) {
        this.f82302a = context.getApplicationContext();
    }

    @Override // p628t1.InterfaceC44614f
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC45359j<Drawable> mo4261a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        Context contextM82898d = m82898d(uri, uri.getAuthority());
        return C37047c.m82896c(C37045a.m82891b(this.f82302a, contextM82898d, m82901g(contextM82898d, uri)));
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public final int m82899e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: f */
    public final int m82900f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @DrawableRes
    /* JADX INFO: renamed from: g */
    public final int m82901g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m82900f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m82899e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p628t1.InterfaceC44614f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo4262b(@NonNull Uri uri, @NonNull C44613e c44613e) {
        return uri.getScheme().equals("android.resource");
    }
}
