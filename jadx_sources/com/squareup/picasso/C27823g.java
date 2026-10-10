package com.squareup.picasso;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import okio.Okio;

/* JADX INFO: renamed from: com.squareup.picasso.g */
/* JADX INFO: compiled from: ContentStreamRequestHandler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27823g extends AbstractC27836t {

    /* JADX INFO: renamed from: a */
    public final Context f56753a;

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: c */
    public boolean mo68781c(C27834r c27834r) {
        return "content".equals(c27834r.f56803d.getScheme());
    }

    /* JADX INFO: renamed from: j */
    public InputStream m68850j(C27834r c27834r) throws FileNotFoundException {
        return this.f56753a.getContentResolver().openInputStream(c27834r.f56803d);
    }

    public C27823g(Context context) {
        this.f56753a = context;
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: f */
    public AbstractC27836t.a mo68782f(C27834r c27834r, int i11) throws IOException {
        return new AbstractC27836t.a(Okio.source(m68850j(c27834r)), Picasso.LoadedFrom.DISK);
    }
}
