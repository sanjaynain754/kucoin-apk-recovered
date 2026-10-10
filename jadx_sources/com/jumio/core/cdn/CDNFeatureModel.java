package com.jumio.core.cdn;

import android.content.res.AssetManager;
import com.jumio.commons.PersistWith;
import com.jumio.core.cdn.CDNFeatureModel;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.JsonUtilKt;
import com.jumio.core.util.StringUtilKt;
import com.tencent.bugly.proguard.C33590cg;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J$\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u001f\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020%¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\tJ\u001f\u0010*\u001a\u00020'2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0,\"\u00020\t¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u0004\u0018\u00010\n2\u0006\u0010#\u001a\u00020\tJ\u0006\u0010/\u001a\u00020\u001fJ\u0010\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\nH\u0002J\u0016\u00102\u001a\u00020\u001f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\t04H\u0002J\u0016\u00105\u001a\u00020\u001f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\n04H\u0002J\u0016\u00107\u001a\u00020\u001f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\n04H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00068"}, m90084d2 = {"Lcom/jumio/core/cdn/CDNFeatureModel;", "Ljava/io/Serializable;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", C33590cg.f69440j, "Lcom/jumio/core/cdn/CDNCache;", "featureMap", "", "", "Lcom/jumio/core/cdn/CDNEncryptedEntry;", "value", "Ljava/io/File;", "directory", "getDirectory", "()Ljava/io/File;", "setDirectory", "(Ljava/io/File;)V", "Landroid/content/res/AssetManager;", "assetManager", "getAssetManager", "()Landroid/content/res/AssetManager;", "setAssetManager", "(Landroid/content/res/AssetManager;)V", "Lcom/jumio/core/cdn/CDNDownloadListener;", "cdnDownloadListener", "getCdnDownloadListener", "()Lcom/jumio/core/cdn/CDNDownloadListener;", "setCdnDownloadListener", "(Lcom/jumio/core/cdn/CDNDownloadListener;)V", "setup", "", "featureArray", "Lorg/json/JSONArray;", "load", "name", "timeout", "", "loadSync", "", "(Ljava/lang/String;I)Ljava/lang/Boolean;", "clean", "has", "names", "", "([Ljava/lang/String;)Z", "get", "clearNonCacheFiles", "legacyFileName", "entry", "deleteNonFeatureFolders", "featureNames", "", "copyAndCleanLegacyFolders", "encryptedEntries", "deleteOutdatedFiles", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("CDNFeatureModel")
@SourceDebugExtension({"SMAP\nCDNFeatureModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CDNFeatureModel.kt\ncom/jumio/core/cdn/CDNFeatureModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1#2:136\n12364#3,2:137\n4154#3:144\n4254#3,2:145\n774#4:139\n865#4,2:140\n1863#4,2:142\n1863#4,2:147\n1863#4,2:149\n1863#4,2:151\n*S KotlinDebug\n*F\n+ 1 CDNFeatureModel.kt\ncom/jumio/core/cdn/CDNFeatureModel\n*L\n87#1:137,2\n99#1:144\n99#1:145,2\n91#1:139\n91#1:140,2\n91#1:142,2\n99#1:147,2\n107#1:149,2\n124#1:151,2\n*E\n"})
public final class CDNFeatureModel implements Serializable, StaticModel {

    /* JADX INFO: renamed from: a */
    public final CDNCache f13760a = new CDNCache(false, 1, null);

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f13761b = new LinkedHashMap();

    public final synchronized void clean(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        CDNEncryptedEntry cDNEncryptedEntry = (CDNEncryptedEntry) this.f13761b.get(name);
        if (cDNEncryptedEntry != null) {
            this.f13760a.remove(cDNEncryptedEntry);
        }
    }

    public final synchronized boolean has(@NotNull String... names) {
        Intrinsics.checkNotNullParameter(names, "names");
        for (String str : names) {
            CDNEncryptedEntry cDNEncryptedEntry = (CDNEncryptedEntry) this.f13761b.get(str);
            if (!(cDNEncryptedEntry != null ? this.f13760a.has(cDNEncryptedEntry) : false)) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void load(@NotNull String name, int timeout, @Nullable CDNDownloadListener cdnDownloadListener) {
        Intrinsics.checkNotNullParameter(name, "name");
        CDNEncryptedEntry cDNEncryptedEntry = (CDNEncryptedEntry) this.f13761b.get(name);
        if (cDNEncryptedEntry != null) {
            this.f13760a.load(cDNEncryptedEntry, timeout, cdnDownloadListener);
        }
    }

    @Nullable
    public final synchronized Boolean loadSync(@NotNull String name, int timeout) {
        Intrinsics.checkNotNullParameter(name, "name");
        CDNEncryptedEntry cDNEncryptedEntry = (CDNEncryptedEntry) this.f13761b.get(name);
        if (cDNEncryptedEntry == null) {
            return null;
        }
        return Boolean.valueOf(this.f13760a.loadSync(cDNEncryptedEntry, timeout));
    }

    public final synchronized void setup(@NotNull JSONArray featureArray) {
        try {
            Intrinsics.checkNotNullParameter(featureArray, "featureArray");
            JsonUtilKt.forEach(featureArray, new Function1() { // from class: k9.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CDNFeatureModel.m14519a(this.f91056b, (JSONObject) obj);
                }
            });
            List list = CollectionsKt.toList(this.f13761b.keySet());
            String[] list2 = getDirectory().list();
            if (list2 != null) {
                ArrayList<String> arrayList = new ArrayList();
                for (String str : list2) {
                    if (!list.contains(str)) {
                        arrayList.add(str);
                    }
                }
                for (String str2 : arrayList) {
                    Intrinsics.checkNotNull(str2);
                    if (Intrinsics.areEqual(StringUtilKt.sanitize(str2, false), str2)) {
                        FilesKt.deleteRecursively(new File(getDirectory(), str2));
                    }
                }
            }
            List<CDNEncryptedEntry> list3 = CollectionsKt.toList(this.f13761b.values());
            for (CDNEncryptedEntry cDNEncryptedEntry : list3) {
                String str3 = StringUtilKt.sanitize(cDNEncryptedEntry.getName(), false) + "/model/" + StringsKt.substringAfterLast$default(StringUtilKt.sanitize(cDNEncryptedEntry.getFile(), true), "/", (String) null, 2, (Object) null);
                if (new File(getDirectory(), str3).exists()) {
                    CDNCache.store$default(this.f13760a, new File(getDirectory(), str3), cDNEncryptedEntry, false, 4, null);
                    FilesKt.deleteRecursively(new File(getDirectory(), StringsKt.substringBeforeLast$default(str3, "/", (String) null, 2, (Object) null)));
                }
            }
            for (CDNEncryptedEntry cDNEncryptedEntry2 : list3) {
                if (!this.f13760a.has(cDNEncryptedEntry2) || !cDNEncryptedEntry2.getShouldCache()) {
                    this.f13760a.remove(cDNEncryptedEntry2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14519a(CDNFeatureModel cDNFeatureModel, JSONObject feature) throws JSONException {
        Intrinsics.checkNotNullParameter(feature, "feature");
        String string = feature.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strSanitize = StringUtilKt.sanitize(string, false);
        LinkedHashMap linkedHashMap = cDNFeatureModel.f13761b;
        String string2 = feature.getString("file");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String strSanitize2 = StringUtilKt.sanitize(string2, true);
        String string3 = feature.getString("key");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = feature.getString("iv");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        linkedHashMap.put(strSanitize, new CDNEncryptedEntry(strSanitize, strSanitize2, string3, string4, feature.optBoolean("shouldCache", true), cDNFeatureModel.f13760a));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void load$default(CDNFeatureModel cDNFeatureModel, String str, int i11, CDNDownloadListener cDNDownloadListener, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 30000;
        }
        if ((i12 & 4) != 0) {
            cDNDownloadListener = null;
        }
        cDNFeatureModel.load(str, i11, cDNDownloadListener);
    }

    public static /* synthetic */ Boolean loadSync$default(CDNFeatureModel cDNFeatureModel, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 30000;
        }
        return cDNFeatureModel.loadSync(str, i11);
    }

    public final void clearNonCacheFiles() {
        Collection collectionValues = this.f13761b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((CDNEncryptedEntry) obj).getShouldCache()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f13760a.remove((CDNEncryptedEntry) it.next());
        }
    }

    @Nullable
    public final CDNEncryptedEntry get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (CDNEncryptedEntry) this.f13761b.get(name);
    }

    @Nullable
    public final AssetManager getAssetManager() {
        return this.f13760a.getF13738c();
    }

    @Nullable
    public final CDNDownloadListener getCdnDownloadListener() {
        return this.f13760a.getF13739d();
    }

    @NotNull
    public final File getDirectory() {
        return this.f13760a.getF13737b();
    }

    public final void setAssetManager(@Nullable AssetManager assetManager) {
        this.f13760a.setAssetManager(assetManager);
    }

    public final void setCdnDownloadListener(@Nullable CDNDownloadListener cDNDownloadListener) {
        this.f13760a.setCdnDownloadListener(cDNDownloadListener);
    }

    public final void setDirectory(@NotNull File value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f13760a.setDirectory(value);
    }
}
