package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.n */
/* JADX INFO: compiled from: StreamLocalUriFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class C5333n extends AbstractC5331l<InputStream> {

    /* JADX INFO: renamed from: e */
    public static final UriMatcher f6773e;

    /* JADX INFO: renamed from: j */
    public final InputStream m6697j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6773e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo23a() {
        return InputStream.class;
    }

    /* JADX INFO: renamed from: i */
    public final InputStream m6696i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f6773e.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m6697j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m6697j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    public C5333n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.AbstractC5331l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo6666e(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5331l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo6667f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM6696i = m6696i(uri, contentResolver);
        if (inputStreamM6696i != null) {
            return inputStreamM6696i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
