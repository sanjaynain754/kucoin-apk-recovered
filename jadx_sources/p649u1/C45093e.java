package p649u1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C5318a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: u1.e */
/* JADX INFO: compiled from: ThumbnailStreamOpener.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45093e {

    /* JADX INFO: renamed from: f */
    public static final C45089a f101493f = new C45089a();

    /* JADX INFO: renamed from: a */
    public final C45089a f101494a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45092d f101495b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45684b f101496c;

    /* JADX INFO: renamed from: d */
    public final ContentResolver f101497d;

    /* JADX INFO: renamed from: e */
    public final List<ImageHeaderParser> f101498e;

    public C45093e(List<ImageHeaderParser> list, InterfaceC45092d interfaceC45092d, InterfaceC45684b interfaceC45684b, ContentResolver contentResolver) {
        this(list, f101493f, interfaceC45092d, interfaceC45684b, contentResolver);
    }

    public C45093e(List<ImageHeaderParser> list, C45089a c45089a, InterfaceC45092d interfaceC45092d, InterfaceC45684b interfaceC45684b, ContentResolver contentResolver) {
        this.f101494a = c45089a;
        this.f101495b = interfaceC45092d;
        this.f101496c = interfaceC45684b;
        this.f101497d = contentResolver;
        this.f101498e = list;
    }

    /* JADX INFO: renamed from: a */
    public int m99705a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f101497d.openInputStream(uri);
                return C5318a.m6651b(this.f101498e, inputStreamOpenInputStream, this.f101496c);
            } finally {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException | NullPointerException e11) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e11);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:28), block:B:11:0x001b */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m99706b(@NonNull Uri uri) throws Throwable {
        Cursor cursorMo99704a;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursorMo99704a = this.f101495b.mo99704a(uri);
                if (cursorMo99704a != null) {
                    try {
                        if (cursorMo99704a.moveToFirst()) {
                            String string = cursorMo99704a.getString(0);
                            cursorMo99704a.close();
                            return string;
                        }
                    } catch (SecurityException e11) {
                        e = e11;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorMo99704a != null) {
                            cursorMo99704a.close();
                        }
                        return null;
                    }
                }
                if (cursorMo99704a != null) {
                    cursorMo99704a.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SecurityException e12) {
            e = e12;
            cursorMo99704a = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m99707c(File file) {
        return this.f101494a.m99692a(file) && 0 < this.f101494a.m99694c(file);
    }

    /* JADX INFO: renamed from: d */
    public InputStream m99708d(Uri uri) throws Throwable {
        String strM99706b = m99706b(uri);
        if (TextUtils.isEmpty(strM99706b)) {
            return null;
        }
        File fileM99693b = this.f101494a.m99693b(strM99706b);
        if (!m99707c(fileM99693b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM99693b);
        try {
            return this.f101497d.openInputStream(uriFromFile);
        } catch (NullPointerException e11) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e11));
        }
    }
}
