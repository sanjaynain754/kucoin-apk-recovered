package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.media3.exoplayer.RendererCapabilities;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p190d4.C36613d;
import p284g6.C37821f;
import p712w3.C45708h;
import p747x3.C45999a;
import p749x5.C46075i;
import p819z3.InterfaceC46679h;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e0 */
/* JADX INFO: compiled from: LocalContentUriThumbnailFetchProducer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5689e0 extends AbstractC5695g0 implements InterfaceC5708k1<C46075i> {

    /* JADX INFO: renamed from: d */
    public static final Class<?> f9319d = C5689e0.class;

    /* JADX INFO: renamed from: e */
    public static final String[] f9320e = {"_id", "_data"};

    /* JADX INFO: renamed from: f */
    public static final String[] f9321f = {"_data"};

    /* JADX INFO: renamed from: g */
    public static final Rect f9322g = new Rect(0, 0, 512, RendererCapabilities.DECODER_SUPPORT_MASK);

    /* JADX INFO: renamed from: h */
    public static final Rect f9323h = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c */
    public final ContentResolver f9324c;

    /* JADX INFO: renamed from: g */
    public final C46075i m9682g(Uri uri, ResizeOptions resizeOptions) throws IOException {
        Cursor cursorQuery;
        C46075i c46075iM9683j;
        if (resizeOptions == null || (cursorQuery = this.f9324c.query(uri, f9320e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (c46075iM9683j = m9683j(resizeOptions, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                c46075iM9683j.m101568T(m9680i(cursorQuery.getString(columnIndex)));
            }
            return c46075iM9683j;
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m9679h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* JADX INFO: renamed from: i */
    public static int m9680i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return C37821f.m85350a(new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1));
        } catch (IOException e11) {
            C45999a.m101506l(f9319d, e11, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m9681k(ResizeOptions resizeOptions) {
        Rect rect = f9323h;
        if (C5711l1.m9737b(rect.width(), rect.height(), resizeOptions)) {
            return 3;
        }
        Rect rect2 = f9322g;
        return C5711l1.m9737b(rect2.width(), rect2.height(), resizeOptions) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5708k1
    /* JADX INFO: renamed from: b */
    public boolean mo9579b(ResizeOptions resizeOptions) {
        Rect rect = f9322g;
        return C5711l1.m9737b(rect.width(), rect.height(), resizeOptions);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    /* JADX INFO: renamed from: f */
    public String mo9573f() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public C5689e0(Executor executor, InterfaceC46679h interfaceC46679h, ContentResolver contentResolver) {
        super(executor, interfaceC46679h);
        this.f9324c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    /* JADX INFO: renamed from: d */
    public C46075i mo9572d(ImageRequest imageRequest) throws IOException {
        Uri sourceUri = imageRequest.getSourceUri();
        if (C36613d.m81942k(sourceUri)) {
            return m9682g(sourceUri, imageRequest.getResizeOptions());
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final C46075i m9683j(ResizeOptions resizeOptions, long j11) throws IOException {
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        int iM9681k = m9681k(resizeOptions);
        if (iM9681k == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f9324c, j11, iM9681k, f9321f)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) C45708h.m100896g(cursorQueryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return m9693e(new FileInputStream(str), m9679h(str));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
