package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.media3.exoplayer.RendererCapabilities;
import java.io.IOException;
import okio.Okio;

/* JADX INFO: loaded from: classes59.dex */
public class MediaStoreRequestHandler extends C27823g {

    /* JADX INFO: renamed from: b */
    public static final String[] f56666b = {"orientation"};

    /* JADX INFO: renamed from: k */
    public static int m68779k(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f56666b, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int i11 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i11;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, RendererCapabilities.DECODER_SUPPORT_MASK),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i11, int i12, int i13) {
            this.androidKind = i11;
            this.width = i12;
            this.height = i13;
        }
    }

    /* JADX INFO: renamed from: l */
    public static PicassoKind m68780l(int i11, int i12) {
        PicassoKind picassoKind = PicassoKind.MICRO;
        if (i11 <= picassoKind.width && i12 <= picassoKind.height) {
            return picassoKind;
        }
        PicassoKind picassoKind2 = PicassoKind.MINI;
        return (i11 > picassoKind2.width || i12 > picassoKind2.height) ? PicassoKind.FULL : picassoKind2;
    }

    @Override // com.squareup.picasso.C27823g, com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: c */
    public boolean mo68781c(C27834r c27834r) {
        Uri uri = c27834r.f56803d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.C27823g, com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: f */
    public AbstractC27836t.a mo68782f(C27834r c27834r, int i11) throws IOException {
        C27834r c27834r2;
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f56753a.getContentResolver();
        int iM68779k = m68779k(contentResolver, c27834r.f56803d);
        String type = contentResolver.getType(c27834r.f56803d);
        boolean z11 = type != null && type.startsWith("video/");
        if (c27834r.m68893c()) {
            PicassoKind picassoKindM68780l = m68780l(c27834r.f56807h, c27834r.f56808i);
            if (!z11 && picassoKindM68780l == PicassoKind.FULL) {
                return new AbstractC27836t.a(null, Okio.source(m68850j(c27834r)), Picasso.LoadedFrom.DISK, iM68779k);
            }
            long id2 = ContentUris.parseId(c27834r.f56803d);
            BitmapFactory.Options optionsM68913d = AbstractC27836t.m68913d(c27834r);
            optionsM68913d.inJustDecodeBounds = true;
            c27834r2 = c27834r;
            AbstractC27836t.m68911a(c27834r.f56807h, c27834r.f56808i, picassoKindM68780l.width, picassoKindM68780l.height, optionsM68913d, c27834r2);
            if (z11) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id2, picassoKindM68780l != PicassoKind.FULL ? picassoKindM68780l.androidKind : 1, optionsM68913d);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id2, picassoKindM68780l.androidKind, optionsM68913d);
            }
            if (thumbnail != null) {
                return new AbstractC27836t.a(thumbnail, null, Picasso.LoadedFrom.DISK, iM68779k);
            }
        } else {
            c27834r2 = c27834r;
        }
        return new AbstractC27836t.a(null, Okio.source(m68850j(c27834r2)), Picasso.LoadedFrom.DISK, iM68779k);
    }

    public MediaStoreRequestHandler(Context context) {
        super(context);
    }
}
