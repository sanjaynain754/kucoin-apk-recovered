package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

/* JADX INFO: renamed from: com.squareup.picasso.u */
/* JADX INFO: compiled from: ResourceRequestHandler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27837u extends AbstractC27836t {

    /* JADX INFO: renamed from: a */
    public final Context f56854a;

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: c */
    public boolean mo68781c(C27834r c27834r) {
        if (c27834r.f56804e != 0) {
            return true;
        }
        return "android.resource".equals(c27834r.f56803d.getScheme());
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: f */
    public AbstractC27836t.a mo68782f(C27834r c27834r, int i11) throws IOException {
        Resources resourcesM68947m = C27841y.m68947m(this.f56854a, c27834r);
        return new AbstractC27836t.a(m68919j(resourcesM68947m, C27841y.m68946l(resourcesM68947m, c27834r), c27834r), Picasso.LoadedFrom.DISK);
    }

    public C27837u(Context context) {
        this.f56854a = context;
    }

    /* JADX INFO: renamed from: j */
    public static Bitmap m68919j(Resources resources, int i11, C27834r c27834r) {
        BitmapFactory.Options optionsM68913d = AbstractC27836t.m68913d(c27834r);
        if (AbstractC27836t.m68914g(optionsM68913d)) {
            BitmapFactory.decodeResource(resources, i11, optionsM68913d);
            AbstractC27836t.m68912b(c27834r.f56807h, c27834r.f56808i, optionsM68913d, c27834r);
        }
        return BitmapFactory.decodeResource(resources, i11, optionsM68913d);
    }
}
