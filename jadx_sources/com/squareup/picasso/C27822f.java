package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.IOException;
import java.io.InputStream;
import okio.Okio;

/* JADX INFO: renamed from: com.squareup.picasso.f */
/* JADX INFO: compiled from: ContactsPhotoRequestHandler.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27822f extends AbstractC27836t {

    /* JADX INFO: renamed from: b */
    public static final UriMatcher f56751b;

    /* JADX INFO: renamed from: a */
    public final Context f56752a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f56751b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX INFO: renamed from: j */
    private InputStream m68849j(C27834r c27834r) throws IOException {
        ContentResolver contentResolver = this.f56752a.getContentResolver();
        Uri uriLookupContact = c27834r.f56803d;
        int iMatch = f56751b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException("Invalid uri: " + uriLookupContact);
                    }
                }
            }
            return contentResolver.openInputStream(uriLookupContact);
        }
        uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
        if (uriLookupContact == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: c */
    public boolean mo68781c(C27834r c27834r) {
        Uri uri = c27834r.f56803d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f56751b.match(c27834r.f56803d) != -1;
    }

    public C27822f(Context context) {
        this.f56752a = context;
    }

    @Override // com.squareup.picasso.AbstractC27836t
    /* JADX INFO: renamed from: f */
    public AbstractC27836t.a mo68782f(C27834r c27834r, int i11) throws IOException {
        InputStream inputStreamM68849j = m68849j(c27834r);
        if (inputStreamM68849j == null) {
            return null;
        }
        return new AbstractC27836t.a(Okio.source(inputStreamM68849j), Picasso.LoadedFrom.DISK);
    }
}
