package p190d4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import p302h6.C38115a;
import p712w3.C45708h;

/* JADX INFO: renamed from: d4.d */
/* JADX INFO: compiled from: UriUtil.java */
/* JADX INFO: loaded from: classes34.dex */
public class C36613d {

    /* JADX INFO: renamed from: a */
    public static final Uri f79415a = Uri.withAppendedPath((Uri) C38115a.m86049e(ContactsContract.AUTHORITY_URI), "display_photo");

    /* JADX INFO: renamed from: b */
    public static String m81933b(boolean z11) {
        return "_data";
    }

    /* JADX INFO: renamed from: c */
    public static Uri m81934c(boolean z11) {
        return z11 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    /* JADX INFO: renamed from: d */
    public static String m81935d(boolean z11) {
        return "_id";
    }

    /* JADX INFO: renamed from: f */
    public static String m81937f(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* JADX INFO: renamed from: h */
    public static Uri m81939h(int i11) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i11)).build();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m81940i(Uri uri) {
        return "data".equals(m81937f(uri));
    }

    /* JADX INFO: renamed from: r */
    public static URL m81949r(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AssetFileDescriptor m81932a(ContentResolver contentResolver, Uri uri) {
        if (m81944m(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m81936e(ContentResolver contentResolver, Uri uri) {
        boolean z11;
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (m81944m(uri)) {
            if (type != null && type.startsWith("video/")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                C45708h.m100896g(documentId);
                uri2 = (Uri) C45708h.m100896g(m81934c(z11));
                str = m81935d(z11) + "=?";
                strArr = new String[]{documentId.split(C33844oi.f71346o)[1]};
            } else {
                uri2 = uri;
                str = null;
                strArr = null;
            }
            Cursor cursorQuery = contentResolver.query(uri2, new String[]{m81933b(z11)}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(m81933b(z11))) != -1) {
                        string = cursorQuery.getString(columnIndexOrThrow);
                    }
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return string;
        }
        if (!m81945n(uri)) {
            return null;
        }
        return uri.getPath();
    }

    /* JADX INFO: renamed from: g */
    public static Uri m81938g(File file) {
        return Uri.fromFile(file);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m81941j(Uri uri) {
        return "asset".equals(m81937f(uri));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m81942k(Uri uri) {
        String string = uri.toString();
        if (!string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m81943l(Uri uri) {
        if (uri.getPath() == null || !m81944m(uri) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith((String) C38115a.m86049e(f79415a.getPath()))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m81944m(Uri uri) {
        return "content".equals(m81937f(uri));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m81945n(Uri uri) {
        return "file".equals(m81937f(uri));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m81946o(Uri uri) {
        return "res".equals(m81937f(uri));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m81947p(Uri uri) {
        String strM81937f = m81937f(uri);
        if (!ProxyConfig.MATCH_HTTPS.equals(strM81937f) && !"http".equals(strM81937f)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m81948q(Uri uri) {
        return "android.resource".equals(m81937f(uri));
    }
}
