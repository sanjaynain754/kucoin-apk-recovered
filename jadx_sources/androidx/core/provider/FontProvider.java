package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class FontProvider {
    private static final LruCache<ProviderCacheKey, ProviderInfo> sProviderCache = new LruCache<>(2);
    private static final Comparator<byte[]> sByteArrayComparator = new Comparator() { // from class: androidx.core.provider.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return FontProvider.m2433a((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface ContentQueryWrapper {
        void close();

        Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        static ContentQueryWrapper make(Context context, Uri uri) {
            return new ContentQueryWrapperApi24Impl(context, uri);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
        private final ContentProviderClient mClient;

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e11) {
                Log.w("FontsProvider", "Unable to query the content provider", e11);
                return null;
            }
        }

        public ContentQueryWrapperApi16Impl(Context context, Uri uri) {
            this.mClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    @RequiresApi(24)
    public static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {
        private final ContentProviderClient mClient;

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e11) {
                Log.w("FontsProvider", "Unable to query the content provider", e11);
                return null;
            }
        }

        public ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.mClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class ProviderCacheKey {
        String mAuthority;
        List<List<byte[]>> mCertificates;
        String mPackageName;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderCacheKey)) {
                return false;
            }
            ProviderCacheKey providerCacheKey = (ProviderCacheKey) obj;
            return Objects.equals(this.mAuthority, providerCacheKey.mAuthority) && Objects.equals(this.mPackageName, providerCacheKey.mPackageName) && Objects.equals(this.mCertificates, providerCacheKey.mCertificates);
        }

        public int hashCode() {
            return Objects.hash(this.mAuthority, this.mPackageName, this.mCertificates);
        }

        public ProviderCacheKey(String str, String str2, List<List<byte[]>> list) {
            this.mAuthority = str;
            this.mPackageName = str2;
            this.mCertificates = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m2433a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            byte b12 = bArr2[i11];
            if (b11 != b12) {
                return b11 - b12;
            }
        }
        return 0;
    }

    @VisibleForTesting
    public static void clearProviderCache() {
        sProviderCache.evictAll();
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    @NonNull
    public static FontsContractCompat.FontFamilyResult getFontFamilyResult(@NonNull Context context, @NonNull List<FontRequest> list, @Nullable CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        Trace.beginSection("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < list.size(); i11++) {
                FontRequest fontRequest = list.get(i11);
                ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
                if (provider == null) {
                    return FontsContractCompat.FontFamilyResult.create(1, (FontsContractCompat.FontInfo[]) null);
                }
                arrayList.add(query(context, fontRequest, provider.authority, cancellationSignal));
            }
            return FontsContractCompat.FontFamilyResult.create(0, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    @Nullable
    @VisibleForTesting
    public static ProviderInfo getProvider(@NonNull PackageManager packageManager, @NonNull FontRequest fontRequest, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        Trace.beginSection("FontProvider.getProvider");
        try {
            List<List<byte[]>> certificates = getCertificates(fontRequest, resources);
            ProviderCacheKey providerCacheKey = new ProviderCacheKey(fontRequest.getProviderAuthority(), fontRequest.getProviderPackage(), certificates);
            ProviderInfo providerInfo = sProviderCache.get(providerCacheKey);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            String providerAuthority = fontRequest.getProviderAuthority();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + fontRequest.getProviderPackage());
            }
            List<byte[]> listConvertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listConvertToByteArrayList, sByteArrayComparator);
            for (int i11 = 0; i11 < certificates.size(); i11++) {
                ArrayList arrayList = new ArrayList(certificates.get(i11));
                Collections.sort(arrayList, sByteArrayComparator);
                if (equalsByteArrayList(listConvertToByteArrayList, arrayList)) {
                    sProviderCache.put(providerCacheKey, providerInfoResolveContentProvider);
                    Trace.endSection();
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [androidx.core.provider.FontProvider$ContentQueryWrapper] */
    /* JADX WARN: Type inference failed for: r16v7 */
    @NonNull
    @VisibleForTesting
    public static FontsContractCompat.FontInfo[] query(Context context, FontRequest fontRequest, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        ContentQueryWrapper contentQueryWrapper;
        boolean z11;
        Trace.beginSection("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentQueryWrapper contentQueryWrapperMake = ContentQueryWrapper.make(context, uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", FontsContractCompat.Columns.FILE_ID, FontsContractCompat.Columns.TTC_INDEX, FontsContractCompat.Columns.VARIATION_SETTINGS, FontsContractCompat.Columns.WEIGHT, FontsContractCompat.Columns.ITALIC, FontsContractCompat.Columns.RESULT_CODE};
                Trace.beginSection("ContentQueryWrapper.query");
                try {
                    try {
                        cursorQuery = contentQueryWrapperMake.query(uriBuild, strArr, "query = ?", new String[]{fontRequest.getQuery()}, null, cancellationSignal);
                        Trace.endSection();
                        if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                            contentQueryWrapper = contentQueryWrapperMake;
                        } else {
                            int columnIndex = cursorQuery.getColumnIndex(FontsContractCompat.Columns.RESULT_CODE);
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorQuery.getColumnIndex("_id");
                            int columnIndex3 = cursorQuery.getColumnIndex(FontsContractCompat.Columns.FILE_ID);
                            int columnIndex4 = cursorQuery.getColumnIndex(FontsContractCompat.Columns.TTC_INDEX);
                            int columnIndex5 = cursorQuery.getColumnIndex(FontsContractCompat.Columns.WEIGHT);
                            int columnIndex6 = cursorQuery.getColumnIndex(FontsContractCompat.Columns.ITALIC);
                            while (cursorQuery.moveToNext()) {
                                int i11 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                                int i12 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                                int i13 = columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z11 = true;
                                    if (cursorQuery.getInt(columnIndex6) != 1) {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                                arrayList2.add(FontsContractCompat.FontInfo.create(uriWithAppendedId, i12, i13, z11, i11));
                                contentQueryWrapperMake = contentQueryWrapperMake;
                            }
                            contentQueryWrapper = contentQueryWrapperMake;
                            arrayList = arrayList2;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        contentQueryWrapper.close();
                        return (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]);
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r16 = context;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r16 = contentQueryWrapperMake;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    private FontProvider() {
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!Arrays.equals(list.get(i11), list2.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> getCertificates(FontRequest fontRequest, Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }
}
