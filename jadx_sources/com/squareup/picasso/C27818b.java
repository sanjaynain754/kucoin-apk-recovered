package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import okio.Okio;

/* JADX INFO: renamed from: com.squareup.picasso.b */
/* JADX INFO: compiled from: AssetRequestHandler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27818b extends AbstractC27836t {

    /* JADX INFO: renamed from: d */
    public static final int f56719d = 22;

    /* JADX INFO: renamed from: a */
    public final Context f56720a;

    /* JADX INFO: renamed from: b */
    public final Object f56721b = new Object();

    /* JADX INFO: renamed from: c */
    public AssetManager f56722c;

    /* JADX INFO: renamed from: j */
    public static String m68819j(C27834r c27834r) {
        return c27834r.f56803d.toString().substring(f56719d);
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: c */
    public boolean mo68781c(C27834r c27834r) {
        Uri uri = c27834r.f56803d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: f */
    public AbstractC27836t.a mo68782f(C27834r c27834r, int i11) throws IOException {
        if (this.f56722c == null) {
            synchronized (this.f56721b) {
                try {
                    if (this.f56722c == null) {
                        this.f56722c = this.f56720a.getAssets();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new AbstractC27836t.a(Okio.source(this.f56722c.open(m68819j(c27834r))), Picasso.LoadedFrom.DISK);
    }

    public C27818b(Context context) {
        this.f56720a = context;
    }
}
