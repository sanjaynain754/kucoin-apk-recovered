package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import okio.Okio;

/* JADX INFO: renamed from: com.squareup.picasso.k */
/* JADX INFO: compiled from: FileRequestHandler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27827k extends C27823g {
    /* JADX INFO: renamed from: k */
    public static int m68877k(Uri uri) throws IOException {
        return new ExifInterface(uri.getPath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
    }

    @Override // com.squareup.picasso.C27823g, com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: c */
    public boolean mo68781c(C27834r c27834r) {
        return "file".equals(c27834r.f56803d.getScheme());
    }

    public C27827k(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.C27823g, com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: f */
    public AbstractC27836t.a mo68782f(C27834r c27834r, int i11) throws IOException {
        return new AbstractC27836t.a(null, Okio.source(m68850j(c27834r)), Picasso.LoadedFrom.DISK, m68877k(c27834r.f56803d));
    }
}
