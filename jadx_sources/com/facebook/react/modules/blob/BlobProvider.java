package com.facebook.react.modules.blob;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.facebook.react.ReactApplication;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.sdk.util.ProviderAspect;
import dh0.C36686b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: loaded from: classes45.dex */
public final class BlobProvider extends ContentProvider {
    private static final int PIPE_CAPACITY = 65536;
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public class AjcClosure1 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            return BlobProvider.query_aroundBody0((BlobProvider) objArr2[0], (Uri) objArr2[1], (String[]) objArr2[2], (String) objArr2[3], (String[]) objArr2[4], (String) objArr2[5], (InterfaceC43175a) objArr2[6]);
        }

        public AjcClosure1(Object[] objArr) {
            super(objArr);
        }
    }

    public static final /* synthetic */ Cursor query_aroundBody0(BlobProvider blobProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2, InterfaceC43175a interfaceC43175a) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("BlobProvider.java", BlobProvider.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", SearchIntents.EXTRA_QUERY, "com.facebook.react.modules.blob.BlobProvider", "android.net.Uri:[Ljava.lang.String;:java.lang.String:[Ljava.lang.String;:java.lang.String", "uri:projection:selection:selectionArgs:sortOrder", "", "android.database.Cursor"), 40);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) ProviderAspect.m58515b().m58516c(new AjcClosure1(new Object[]{this, uri, strArr, str, strArr2, str2, C36686b.m82125e(ajc$tjp_0, this, this, new Object[]{uri, strArr, str, strArr2, str2})}).linkClosureAndJoinPoint(69648));
    }

    static {
        ajc$preClinit();
    }

    @Override // android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        BlobModule blobModule;
        if (str.equals("r")) {
            Object applicationContext = getContext().getApplicationContext();
            if (applicationContext instanceof ReactApplication) {
                blobModule = (BlobModule) ((ReactApplication) applicationContext).getReactNativeHost().getReactInstanceManager().getCurrentReactContext().getNativeModule(BlobModule.class);
            } else {
                blobModule = null;
            }
            if (blobModule != null) {
                final byte[] bArrResolve = blobModule.resolve(uri);
                if (bArrResolve != null) {
                    try {
                        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                        ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                        final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                        if (bArrResolve.length <= 65536) {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    autoCloseOutputStream.write(bArrResolve);
                                    autoCloseOutputStream.close();
                                    return parcelFileDescriptor;
                                } catch (Throwable th2) {
                                    try {
                                        autoCloseOutputStream.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (IOException unused) {
                                return null;
                            }
                        }
                        this.executor.submit(new Runnable() { // from class: com.facebook.react.modules.blob.BlobProvider.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                    try {
                                        autoCloseOutputStream2.write(bArrResolve);
                                        autoCloseOutputStream2.close();
                                    } catch (Throwable th4) {
                                        try {
                                            autoCloseOutputStream2.close();
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                        }
                                        throw th4;
                                    }
                                } catch (IOException unused2) {
                                }
                            }
                        });
                        return parcelFileDescriptor;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
                throw new FileNotFoundException("Cannot open " + uri + ", blob not found.");
            }
            throw new RuntimeException("No blob module associated with BlobProvider");
        }
        throw new FileNotFoundException("Cannot open " + uri.toString() + " in mode '" + str + "'");
    }
}
